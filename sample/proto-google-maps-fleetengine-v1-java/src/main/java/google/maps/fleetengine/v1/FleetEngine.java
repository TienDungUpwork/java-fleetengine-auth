// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/v1/fleetengine.proto

package google.maps.fleetengine.v1;

public final class FleetEngine {
  private FleetEngine() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_maps_fleetengine_v1_TerminalPointId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_v1_TerminalPointId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_maps_fleetengine_v1_TerminalLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_v1_TerminalLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_maps_fleetengine_v1_TripWaypoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_v1_TripWaypoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_maps_fleetengine_v1_VehicleAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_v1_VehicleAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_maps_fleetengine_v1_VehicleLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_v1_VehicleLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/maps/fleetengine/v1/fleetengine" +
      ".proto\022\023maps.fleetengine.v1\032\037google/api/" +
      "field_behavior.proto\032(google/maps/fleete" +
      "ngine/v1/traffic.proto\032\036google/protobuf/" +
      "duration.proto\032\037google/protobuf/timestam" +
      "p.proto\032\036google/protobuf/wrappers.proto\032" +
      "\030google/type/latlng.proto\"Z\n\017TerminalPoi" +
      "ntId\022\026\n\010place_id\030\002 \001(\tB\002\030\001H\000\022\032\n\014generate" +
      "d_id\030\003 \001(\tB\002\030\001H\000\022\r\n\005value\030\004 \001(\tB\004\n\002Id\"\372\001" +
      "\n\020TerminalLocation\022\'\n\005point\030\001 \001(\0132\023.goog" +
      "le.type.LatLngB\003\340A\002\022D\n\021terminal_point_id" +
      "\030\002 \001(\0132$.maps.fleetengine.v1.TerminalPoi" +
      "ntIdB\003\340A\002\022\033\n\017access_point_id\030\003 \001(\tB\002\030\001\022\023" +
      "\n\007trip_id\030\004 \001(\tB\002\030\001\022E\n\026terminal_location" +
      "_type\030\005 \001(\0162!.maps.fleetengine.v1.Waypoi" +
      "ntTypeB\002\030\001\"\274\003\n\014TripWaypoint\0227\n\010location\030" +
      "\001 \001(\0132%.maps.fleetengine.v1.TerminalLoca" +
      "tion\022\017\n\007trip_id\030\002 \001(\t\0228\n\rwaypoint_type\030\003" +
      " \001(\0162!.maps.fleetengine.v1.WaypointType\022" +
      "-\n\020path_to_waypoint\030\004 \003(\0132\023.google.type." +
      "LatLng\022 \n\030encoded_path_to_waypoint\030\005 \001(\t" +
      "\022K\n\023traffic_to_waypoint\030\n \001(\0132..maps.fle" +
      "etengine.v1.ConsumableTrafficPolyline\0224\n" +
      "\017distance_meters\030\006 \001(\0132\033.google.protobuf" +
      ".Int32Value\022\'\n\003eta\030\007 \001(\0132\032.google.protob" +
      "uf.Timestamp\022+\n\010duration\030\010 \001(\0132\031.google." +
      "protobuf.Duration\".\n\020VehicleAttribute\022\013\n" +
      "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\"\305\014\n\017VehicleLoc" +
      "ation\022%\n\010location\030\001 \001(\0132\023.google.type.La" +
      "tLng\022=\n\023horizontal_accuracy\030\010 \001(\0132\034.goog" +
      "le.protobuf.DoubleValueB\002\030\001\0225\n\017latlng_ac" +
      "curacy\030\026 \001(\0132\034.google.protobuf.DoubleVal" +
      "ue\022,\n\007heading\030\002 \001(\0132\033.google.protobuf.In" +
      "t32Value\022:\n\020bearing_accuracy\030\n \001(\0132\034.goo" +
      "gle.protobuf.DoubleValueB\002\030\001\0226\n\020heading_" +
      "accuracy\030\027 \001(\0132\034.google.protobuf.DoubleV" +
      "alue\022.\n\010altitude\030\005 \001(\0132\034.google.protobuf" +
      ".DoubleValue\022;\n\021vertical_accuracy\030\t \001(\0132" +
      "\034.google.protobuf.DoubleValueB\002\030\001\0227\n\021alt" +
      "itude_accuracy\030\030 \001(\0132\034.google.protobuf.D" +
      "oubleValue\0223\n\nspeed_kmph\030\003 \001(\0132\033.google." +
      "protobuf.Int32ValueB\002\030\001\022+\n\005speed\030\006 \001(\0132\034" +
      ".google.protobuf.DoubleValue\0224\n\016speed_ac" +
      "curacy\030\007 \001(\0132\034.google.protobuf.DoubleVal" +
      "ue\022/\n\013update_time\030\004 \001(\0132\032.google.protobu" +
      "f.Timestamp\0224\n\013server_time\030\r \001(\0132\032.googl" +
      "e.protobuf.TimestampB\003\340A\003\022<\n\017location_se" +
      "nsor\030\013 \001(\0162#.maps.fleetengine.v1.Locatio" +
      "nSensor\0223\n\017is_road_snapped\030\033 \001(\0132\032.googl" +
      "e.protobuf.BoolValue\022>\n\025is_gps_sensor_en" +
      "abled\030\014 \001(\0132\032.google.protobuf.BoolValueB" +
      "\003\340A\004\022;\n\021time_since_update\030\016 \001(\0132\033.google" +
      ".protobuf.Int32ValueB\003\340A\004\022;\n\021num_stale_u" +
      "pdates\030\017 \001(\0132\033.google.protobuf.Int32Valu" +
      "eB\003\340A\004\022)\n\014raw_location\030\020 \001(\0132\023.google.ty" +
      "pe.LatLng\022:\n\021raw_location_time\030\021 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\003\340A\004\022E\n\023raw_loc" +
      "ation_sensor\030\034 \001(\0162#.maps.fleetengine.v1" +
      ".LocationSensorB\003\340A\004\022@\n\025raw_location_acc" +
      "uracy\030\031 \001(\0132\034.google.protobuf.DoubleValu" +
      "eB\003\340A\004\0227\n\025supplemental_location\030\022 \001(\0132\023." +
      "google.type.LatLngB\003\340A\004\022C\n\032supplemental_" +
      "location_time\030\023 \001(\0132\032.google.protobuf.Ti" +
      "mestampB\003\340A\004\022N\n\034supplemental_location_se" +
      "nsor\030\024 \001(\0162#.maps.fleetengine.v1.Locatio" +
      "nSensorB\003\340A\004\022I\n\036supplemental_location_ac" +
      "curacy\030\025 \001(\0132\034.google.protobuf.DoubleVal" +
      "ueB\003\340A\004\022\030\n\014road_snapped\030\032 \001(\010B\002\030\001*<\n\010Tri" +
      "pType\022\025\n\021UNKNOWN_TRIP_TYPE\020\000\022\n\n\006SHARED\020\001" +
      "\022\r\n\tEXCLUSIVE\020\002*\213\001\n\014WaypointType\022\031\n\025UNKN" +
      "OWN_WAYPOINT_TYPE\020\000\022\030\n\024PICKUP_WAYPOINT_T" +
      "YPE\020\001\022\032\n\026DROP_OFF_WAYPOINT_TYPE\020\002\022*\n&INT" +
      "ERMEDIATE_DESTINATION_WAYPOINT_TYPE\020\003*_\n" +
      "\022PolylineFormatType\022\027\n\023UNKNOWN_FORMAT_TY" +
      "PE\020\000\022\025\n\021LAT_LNG_LIST_TYPE\020\001\022\031\n\025ENCODED_P" +
      "OLYLINE_TYPE\020\002*\211\001\n\020NavigationStatus\022\035\n\031U" +
      "NKNOWN_NAVIGATION_STATUS\020\000\022\017\n\013NO_GUIDANC" +
      "E\020\001\022\032\n\026ENROUTE_TO_DESTINATION\020\002\022\r\n\tOFF_R" +
      "OUTE\020\003\022\032\n\026ARRIVED_AT_DESTINATION\020\004*\210\001\n\016L" +
      "ocationSensor\022\022\n\016UNKNOWN_SENSOR\020\000\022\007\n\003GPS" +
      "\020\001\022\013\n\007NETWORK\020\002\022\013\n\007PASSIVE\020\003\022\"\n\036ROAD_SNA" +
      "PPED_LOCATION_PROVIDER\020\004\022\033\n\027FUSED_LOCATI" +
      "ON_PROVIDER\020dBx\n\032google.maps.fleetengine" +
      ".v1B\013FleetEngineP\001ZEgoogle.golang.org/ge" +
      "nproto/googleapis/maps/fleetengine/v1;fl" +
      "eetengine\242\002\003CFEb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          google.maps.fleetengine.v1.TrafficProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
        });
    internal_static_maps_fleetengine_v1_TerminalPointId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_maps_fleetengine_v1_TerminalPointId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_maps_fleetengine_v1_TerminalPointId_descriptor,
        new java.lang.String[] { "PlaceId", "GeneratedId", "Value", "Id", });
    internal_static_maps_fleetengine_v1_TerminalLocation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_maps_fleetengine_v1_TerminalLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_maps_fleetengine_v1_TerminalLocation_descriptor,
        new java.lang.String[] { "Point", "TerminalPointId", "AccessPointId", "TripId", "TerminalLocationType", });
    internal_static_maps_fleetengine_v1_TripWaypoint_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_maps_fleetengine_v1_TripWaypoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_maps_fleetengine_v1_TripWaypoint_descriptor,
        new java.lang.String[] { "Location", "TripId", "WaypointType", "PathToWaypoint", "EncodedPathToWaypoint", "TrafficToWaypoint", "DistanceMeters", "Eta", "Duration", });
    internal_static_maps_fleetengine_v1_VehicleAttribute_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_maps_fleetengine_v1_VehicleAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_maps_fleetengine_v1_VehicleAttribute_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_maps_fleetengine_v1_VehicleLocation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_maps_fleetengine_v1_VehicleLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_maps_fleetengine_v1_VehicleLocation_descriptor,
        new java.lang.String[] { "Location", "HorizontalAccuracy", "LatlngAccuracy", "Heading", "BearingAccuracy", "HeadingAccuracy", "Altitude", "VerticalAccuracy", "AltitudeAccuracy", "SpeedKmph", "Speed", "SpeedAccuracy", "UpdateTime", "ServerTime", "LocationSensor", "IsRoadSnapped", "IsGpsSensorEnabled", "TimeSinceUpdate", "NumStaleUpdates", "RawLocation", "RawLocationTime", "RawLocationSensor", "RawLocationAccuracy", "SupplementalLocation", "SupplementalLocationTime", "SupplementalLocationSensor", "SupplementalLocationAccuracy", "RoadSnapped", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    google.maps.fleetengine.v1.TrafficProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
