// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/v1/vehicle_api.proto

package google.maps.fleetengine.v1;

public interface ListVehiclesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.ListVehiclesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Depends on vehicles matching request criteria.
   * There will be a maximum number of vehicles returned based on the page_size
   * field in the request.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Vehicle vehicles = 1;</code>
   */
  java.util.List<google.maps.fleetengine.v1.Vehicle> getVehiclesList();
  /**
   *
   *
   * <pre>
   * Depends on vehicles matching request criteria.
   * There will be a maximum number of vehicles returned based on the page_size
   * field in the request.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Vehicle vehicles = 1;</code>
   */
  google.maps.fleetengine.v1.Vehicle getVehicles(int index);
  /**
   *
   *
   * <pre>
   * Depends on vehicles matching request criteria.
   * There will be a maximum number of vehicles returned based on the page_size
   * field in the request.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Vehicle vehicles = 1;</code>
   */
  int getVehiclesCount();
  /**
   *
   *
   * <pre>
   * Depends on vehicles matching request criteria.
   * There will be a maximum number of vehicles returned based on the page_size
   * field in the request.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Vehicle vehicles = 1;</code>
   */
  java.util.List<? extends google.maps.fleetengine.v1.VehicleOrBuilder> getVehiclesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Depends on vehicles matching request criteria.
   * There will be a maximum number of vehicles returned based on the page_size
   * field in the request.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Vehicle vehicles = 1;</code>
   */
  google.maps.fleetengine.v1.VehicleOrBuilder getVehiclesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of vehicles, or empty if there are no
   * more vehicles in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of vehicles, or empty if there are no
   * more vehicles in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Required. Total number of vehicles matching request criteria across all pages.
   * </pre>
   *
   * <code>int64 total_size = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The totalSize.
   */
  long getTotalSize();
}
