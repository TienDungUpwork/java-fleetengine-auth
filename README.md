# Fleet Engine Auth Library for Java

Fleet Engine use JSON Web Tokens (JWTs) to both authenticate and authorize
incoming requests. This process has several aspects to it and is non-trivial to
set up.

The Fleet Engine Auth Library provides a set of tools to simplify the setup
process. The functionality is best thought of in two buckets, Fleet Engine Roles
and JWT Signers.

Sample scripts are provided in the sample directory. To learn more, see:
[sample/README.md](sample/README.md).

## Concepts

### Fleet Engine Roles

Fleet Engine Requests are always made on behalf of a service account defined in
your GCP project. Each service account is tied a pre-defined Fleet Engine Role.

The supported Fleet Engine roles are:

Role                           | Description
:----------------------------- | :---------:
Fleet Engine Consumer SDK User | Grants permission to search for vehicles and to retrieve information about vehicles and trips. Tokens minted by a service account with this role can be used from your ridesharing consumer app mobile devices.
Fleet Engine Driver SDK User   | Grants permission to update vehicle locations and routes and to retrieve information about vehicles and trips. Tokens minted by a service account with this role can be used from your ridesharing driver app mobile devices.
FleetEngine Service Super User | Grants permission to all vehicles and trips APIs. Tokens minted by a service account with this role can be used from your backend servers.

Each role is tied to a `com.google.fleetengine.auth.token.FleetEngineTokenType`,
and each type of token can be constrained to a specific resource:

Role                                | Token Type                      | Resource Constraint
:---------------------------------- | :-----------------------------: | :-----------------:
Fleet Engine Consumer SDK User      | `FleetEngineTokenType#CONSUMER` | trip id
Fleet Engine Driver SDK User        | `FleetEngineTokenType#DRIVER`   | vehicle id
Fleet Engine Service Super SDK User | `FleetEngineTokenType#SERVER`   | (no constraint)

### JWT Signers

The Fleet Engine Auth Library signs JWTs through classes that implement the
`com.google.fleetengine.auth.token.factory.signer.Signer` interface. The Library
comes loaded with three predefined Signers which handle the common use cases
(the set of pre-defined signers are located below the
`com.google.fleetengine.auth.token.factory.signer` package):

Signer                        | GCP Required | Description
:---------------------------: | :----------: | :---------:
`DefaultServiceAccountSigner` | Yes          | Signs tokens with the service account running the application. This signer is typically used to sign `FleetEngineTokenType#SERVER` tokens. The service account <b>MUST</b> have the `iam.serviceAccounts.signBlob` permission in order to use this Signer. This is typically acquired through the `Service Account Token Creator` role.
`ImpersonatedSigner`          | Yes          | Signs tokens by impersonating a different service account. The account hosting the application <b>MUST</b> have the `iam.serviceAccounts.signBlob` permission. This permission is typically acquired through the `Service Account Token Creator` role.
`LocalSigner`                 | No           | Signs tokens with a private key file generated by a given service account. **Storing private key files in any form presents a security risk and should be a last resort.**

Note: GCP Required denotes that the Signer works with applications that are
hosted on GCP or are otherwise authenticated with GCP. For more information,
see: https://cloud.google.com/docs/authentication/getting-started.

## Using the library

### Minting Tokens

`com.google.fleetengine.auth.AuthTokenMinter` ties signers with roles to make
minting tokens straightforward.

To use, first associate a `Signer` with a service account and a type of token.

For example:

```
AuthTokenMinter minter = AuthTokenMinter.builder()
  .setServerTokenSigner(DefaultServiceAccountSigner.create())
  .setDriverSigner(ImpersonatedAccountSignerCredentials.create("driver@gcp-project.com")
  .setConsumerSigner(ImpersonatedAccountSignerCredentials.create("consumer@gcp-project.iam.gserviceaccount.com")
  .build();
```

The minter provides a getter method for each of the token types. Each getter
returns an instance of `com.google.fleetengine.auth.token.FleetEngineToken`:

```
FleetEngineToken serverToken = minter.getServerToken();

FleetEngineToken consumerToken = minter.getConsumerToken(TripClaims.create("trip-id-123"));

FleetEngineToken driverToken = minter.getDriverToken(VehicleClaims.create("vehicle-id-123"));
```

A `FleetEngineToken` has several attributes, but in most cases, only the base64
encoded JWT is needed `com.google.fleetengine.auth.token.FleetEngineToken#jwt`.

```
System.out.println("Base64 encoded JWT:");
System.out.println(serverToken.jwt());

System.out.println("HTTP Header:");
System.out.println(String.format("Authorization: Bearer %s", token.jwt()));
```

Output:

```
Base64 encoded JWT:
xxxxx.yyyyy.zzzzz

HTTP Header:
Authorization: Bearer xxxxx.yyyyy.zzzzz
```

## Setting up

### First Time Setup

Clone the git repo and run gradle. Gradle version 5.0 and above is required. In
order to build through gradle wrapper, run:

```
./gradlew jar
```

The library is located under `$BUILD_OUTPUT_DIR/libs/fleetengine-auth.jar`.

In order to include within your gradle project, copy the jar to an accessible
directory and add the following to build.gradle:

```
dependencies {
  implementation fileTree(dir: 'libs', include: ['*.jar'])
}
```

The following 3rd party dependencies are also needed:

```
dependencies {
  implementation 'com.auth0:java-jwt:3+'
  implementation 'com.google.guava:guava:16+'
  implementation 'com.google.auth:google-auth-library-oauth2-http:0+'
}
```

## Working with Generated Clients

Alongside token minting functionality, the library also provides a set of
components that work with Fleet Engine protobuf generated classes. There are two
sets of generated classes that make requests to the fleet engine server, gRPC
stubs and GAPIC clients.

Both mechanisms require a FleetEngineTokenProvider which is an interface that
has just one method:

```
package com.google.fleetengine.auth.client;

/** Provides non-expired, signed JWTs. */
public interface FleetEngineTokenProvider {
  /** Returns a non-expired {@link FleetEngineToken} with a base64 signed JWT. */
  FleetEngineToken getSignedToken() throws SigningTokenException;
}
```

For convenience, `com.google.fleetengine.auth.AuthTokenMinter` implements
`FleetEngineTokenProvider` and returns server tokens when called through
`FleetEngineTokenProvider#getSignedToken`. Any type of token can be returned.

### Generated gRPC Stubs

gRPC stubs are initialized from `io.grpc.ManagedChannel`s and allows
functionality to be injected using interceptors:

```
FleetEngineTokenProvider fleetEngineTokenProvider = getTokenProvider();

ManagedChannel channel = ManagedChannelBuilder.forTarget(fleetEngineAddress)
  .intercept(FleetEngineAuthClientInterceptor.create(fleetEngineTokenProvider))
  .build();

VehicleServiceBlockingStub stub = VehicleServiceGrpc.newBlockingStub(channel);
```

### Generated GAPIC Clients

GAPIC clients are configured using `com.google.api.gax.rpc.ClientSettings` which
are built with using a builder. The
`com.google.fleetengine.auth.client.FleetEngineClientSettingsModifier` updates
`ClientSettings.Builder`s such that outbound requests made from the
corresponding client have valid authorization headers.

```
FleetEngineClientSettingsModifier<VehicleServiceSettings, VehicleServiceSettings.Builder> modifier =
  new FleetEngineClientSettingsModifier<>(tokenProvider);

VehicleServiceSettings.Builder builder = VehicleServiceSettings.newBuilder();
VehicleServiceSettings settings = modifier.updateBuilder(builder).build();

VehicleServiceClient client = VehicleServiceClient.create(settings);
```