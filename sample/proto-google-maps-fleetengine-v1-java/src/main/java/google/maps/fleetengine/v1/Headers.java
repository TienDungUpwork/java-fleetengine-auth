// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/v1/header.proto

package google.maps.fleetengine.v1;

public final class Headers {
  private Headers() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_maps_fleetengine_v1_RequestHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_v1_RequestHeader_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'google/maps/fleetengine/v1/header.prot" +
      "o\022\023maps.fleetengine.v1\032\037google/api/field" +
      "_behavior.proto\"\364\003\n\rRequestHeader\022\025\n\rlan" +
      "guage_code\030\001 \001(\t\022\030\n\013region_code\030\002 \001(\tB\003\340" +
      "A\002\022\023\n\013sdk_version\030\003 \001(\t\022\022\n\nos_version\030\004 " +
      "\001(\t\022\024\n\014device_model\030\005 \001(\t\022<\n\010sdk_type\030\006 " +
      "\001(\0162*.maps.fleetengine.v1.RequestHeader." +
      "SdkType\022\030\n\020maps_sdk_version\030\007 \001(\t\022\027\n\017nav" +
      "_sdk_version\030\010 \001(\t\022=\n\010platform\030\t \001(\0162+.m" +
      "aps.fleetengine.v1.RequestHeader.Platfor" +
      "m\022\024\n\014manufacturer\030\n \001(\t\022\031\n\021android_api_l" +
      "evel\030\013 \001(\005\"M\n\007SdkType\022\030\n\024SDK_TYPE_UNSPEC" +
      "IFIED\020\000\022\014\n\010CONSUMER\020\001\022\n\n\006DRIVER\020\002\022\016\n\nJAV" +
      "ASCRIPT\020\003\"C\n\010Platform\022\030\n\024PLATFORM_UNSPEC" +
      "IFIED\020\000\022\013\n\007ANDROID\020\001\022\007\n\003IOS\020\002\022\007\n\003WEB\020\003Bt" +
      "\n\032google.maps.fleetengine.v1B\007HeadersP\001Z" +
      "Egoogle.golang.org/genproto/googleapis/m" +
      "aps/fleetengine/v1;fleetengine\242\002\003CFEb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_maps_fleetengine_v1_RequestHeader_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_maps_fleetengine_v1_RequestHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_maps_fleetengine_v1_RequestHeader_descriptor,
        new java.lang.String[] { "LanguageCode", "RegionCode", "SdkVersion", "OsVersion", "DeviceModel", "SdkType", "MapsSdkVersion", "NavSdkVersion", "Platform", "Manufacturer", "AndroidApiLevel", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
