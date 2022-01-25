// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/v1/vehicle_api.proto

package google.maps.fleetengine.v1;

public interface GetVehicleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.GetVehicleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   * @return The header.
   */
  google.maps.fleetengine.v1.RequestHeader getHeader();
  /**
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   */
  google.maps.fleetengine.v1.RequestHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * Required. Must be in the format
   * `providers/{provider}/vehicles/{vehicle}`.
   * The provider must be the Project ID (for example, `sample-cloud-project`)
   * of the Google Cloud Project of which the service account making
   * this call is a member.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Must be in the format
   * `providers/{provider}/vehicles/{vehicle}`.
   * The provider must be the Project ID (for example, `sample-cloud-project`)
   * of the Google Cloud Project of which the service account making
   * this call is a member.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which
   * `Vehicle.current_route_segment` is retrieved.
   * If the route is unchanged since this timestamp, the `current_route_segment`
   * field is not set in the response. If a minimum is unspecified, the
   * `current_route_segment` is always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_route_segment_version = 4;</code>
   * @return Whether the currentRouteSegmentVersion field is set.
   */
  boolean hasCurrentRouteSegmentVersion();
  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which
   * `Vehicle.current_route_segment` is retrieved.
   * If the route is unchanged since this timestamp, the `current_route_segment`
   * field is not set in the response. If a minimum is unspecified, the
   * `current_route_segment` is always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_route_segment_version = 4;</code>
   * @return The currentRouteSegmentVersion.
   */
  com.google.protobuf.Timestamp getCurrentRouteSegmentVersion();
  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which
   * `Vehicle.current_route_segment` is retrieved.
   * If the route is unchanged since this timestamp, the `current_route_segment`
   * field is not set in the response. If a minimum is unspecified, the
   * `current_route_segment` is always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_route_segment_version = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCurrentRouteSegmentVersionOrBuilder();

  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which `Vehicle.waypoints`
   * data is retrieved. If the waypoints are unchanged since this timestamp, the
   * `vehicle.waypoints` data is not set in the response. If this field is
   * unspecified, `vehicle.waypoints` is always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp waypoints_version = 5;</code>
   * @return Whether the waypointsVersion field is set.
   */
  boolean hasWaypointsVersion();
  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which `Vehicle.waypoints`
   * data is retrieved. If the waypoints are unchanged since this timestamp, the
   * `vehicle.waypoints` data is not set in the response. If this field is
   * unspecified, `vehicle.waypoints` is always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp waypoints_version = 5;</code>
   * @return The waypointsVersion.
   */
  com.google.protobuf.Timestamp getWaypointsVersion();
  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which `Vehicle.waypoints`
   * data is retrieved. If the waypoints are unchanged since this timestamp, the
   * `vehicle.waypoints` data is not set in the response. If this field is
   * unspecified, `vehicle.waypoints` is always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp waypoints_version = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getWaypointsVersionOrBuilder();
}
