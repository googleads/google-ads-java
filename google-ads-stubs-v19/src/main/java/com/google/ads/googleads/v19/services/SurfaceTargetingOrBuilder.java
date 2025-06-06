// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

public interface SurfaceTargetingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.SurfaceTargeting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of surfaces available to target.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.enums.ReachPlanSurfaceEnum.ReachPlanSurface surfaces = 1;</code>
   * @return A list containing the surfaces.
   */
  java.util.List<com.google.ads.googleads.v19.enums.ReachPlanSurfaceEnum.ReachPlanSurface> getSurfacesList();
  /**
   * <pre>
   * List of surfaces available to target.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.enums.ReachPlanSurfaceEnum.ReachPlanSurface surfaces = 1;</code>
   * @return The count of surfaces.
   */
  int getSurfacesCount();
  /**
   * <pre>
   * List of surfaces available to target.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.enums.ReachPlanSurfaceEnum.ReachPlanSurface surfaces = 1;</code>
   * @param index The index of the element to return.
   * @return The surfaces at the given index.
   */
  com.google.ads.googleads.v19.enums.ReachPlanSurfaceEnum.ReachPlanSurface getSurfaces(int index);
  /**
   * <pre>
   * List of surfaces available to target.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.enums.ReachPlanSurfaceEnum.ReachPlanSurface surfaces = 1;</code>
   * @return A list containing the enum numeric values on the wire for surfaces.
   */
  java.util.List<java.lang.Integer>
  getSurfacesValueList();
  /**
   * <pre>
   * List of surfaces available to target.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.enums.ReachPlanSurfaceEnum.ReachPlanSurface surfaces = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of surfaces at the given index.
   */
  int getSurfacesValue(int index);
}
