// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/v1/trip_api.proto

package google.maps.fleetengine.v1;

public interface ReportBillableTripRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.ReportBillableTripRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Must be in the format
   * `providers/{provider}/billableTrips/{billable_trip}`. The
   * provider must be the Project ID (for example, `sample-cloud-project`) of
   * the Google Cloud Project of which the service account making this call is a
   * member.
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Must be in the format
   * `providers/{provider}/billableTrips/{billable_trip}`. The
   * provider must be the Project ID (for example, `sample-cloud-project`) of
   * the Google Cloud Project of which the service account making this call is a
   * member.
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Two letter country code of the country where the trip takes place. Price is
   * defined according to country code.
   * </pre>
   *
   * <code>string country_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * Required. Two letter country code of the country where the trip takes place. Price is
   * defined according to country code.
   * </pre>
   *
   * <code>string country_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * The platform upon which the request was issued.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.BillingPlatformIdentifier platform = 5;</code>
   * @return The enum numeric value on the wire for platform.
   */
  int getPlatformValue();
  /**
   * <pre>
   * The platform upon which the request was issued.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.BillingPlatformIdentifier platform = 5;</code>
   * @return The platform.
   */
  google.maps.fleetengine.v1.BillingPlatformIdentifier getPlatform();

  /**
   * <pre>
   * The identifiers that are directly related to the trip being reported. These
   * are usually IDs (for example, session IDs) of pre-booking operations done
   * before the trip ID is available. The number of `related_ids` is
   * limited to 50.
   * </pre>
   *
   * <code>repeated string related_ids = 6;</code>
   * @return A list containing the relatedIds.
   */
  java.util.List<java.lang.String>
      getRelatedIdsList();
  /**
   * <pre>
   * The identifiers that are directly related to the trip being reported. These
   * are usually IDs (for example, session IDs) of pre-booking operations done
   * before the trip ID is available. The number of `related_ids` is
   * limited to 50.
   * </pre>
   *
   * <code>repeated string related_ids = 6;</code>
   * @return The count of relatedIds.
   */
  int getRelatedIdsCount();
  /**
   * <pre>
   * The identifiers that are directly related to the trip being reported. These
   * are usually IDs (for example, session IDs) of pre-booking operations done
   * before the trip ID is available. The number of `related_ids` is
   * limited to 50.
   * </pre>
   *
   * <code>repeated string related_ids = 6;</code>
   * @param index The index of the element to return.
   * @return The relatedIds at the given index.
   */
  java.lang.String getRelatedIds(int index);
  /**
   * <pre>
   * The identifiers that are directly related to the trip being reported. These
   * are usually IDs (for example, session IDs) of pre-booking operations done
   * before the trip ID is available. The number of `related_ids` is
   * limited to 50.
   * </pre>
   *
   * <code>repeated string related_ids = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the relatedIds at the given index.
   */
  com.google.protobuf.ByteString
      getRelatedIdsBytes(int index);

  /**
   * <pre>
   * The type of GMP product solution (for example,
   * `ON_DEMAND_RIDESHARING_AND_DELIVERIES`) used for the reported trip.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.ReportBillableTripRequest.SolutionType solution_type = 7;</code>
   * @return The enum numeric value on the wire for solutionType.
   */
  int getSolutionTypeValue();
  /**
   * <pre>
   * The type of GMP product solution (for example,
   * `ON_DEMAND_RIDESHARING_AND_DELIVERIES`) used for the reported trip.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.ReportBillableTripRequest.SolutionType solution_type = 7;</code>
   * @return The solutionType.
   */
  google.maps.fleetengine.v1.ReportBillableTripRequest.SolutionType getSolutionType();
}
