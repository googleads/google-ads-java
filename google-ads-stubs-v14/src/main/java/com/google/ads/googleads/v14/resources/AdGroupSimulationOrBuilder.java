// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/ad_group_simulation.proto

package com.google.ads.googleads.v14.resources;

public interface AdGroupSimulationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.resources.AdGroupSimulation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the ad group simulation.
   * Ad group simulation resource names have the form:
   *
   * `customers/{customer_id}/adGroupSimulations/{ad_group_id}~{type}~{modification_method}~{start_date}~{end_date}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the ad group simulation.
   * Ad group simulation resource names have the form:
   *
   * `customers/{customer_id}/adGroupSimulations/{ad_group_id}~{type}~{modification_method}~{start_date}~{end_date}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Ad group id of the simulation.
   * </pre>
   *
   * <code>optional int64 ad_group_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the adGroupId field is set.
   */
  boolean hasAdGroupId();
  /**
   * <pre>
   * Output only. Ad group id of the simulation.
   * </pre>
   *
   * <code>optional int64 ad_group_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The adGroupId.
   */
  long getAdGroupId();

  /**
   * <pre>
   * Output only. The field that the simulation modifies.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.SimulationTypeEnum.SimulationType type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The field that the simulation modifies.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.SimulationTypeEnum.SimulationType type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v14.enums.SimulationTypeEnum.SimulationType getType();

  /**
   * <pre>
   * Output only. How the simulation modifies the field.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.SimulationModificationMethodEnum.SimulationModificationMethod modification_method = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for modificationMethod.
   */
  int getModificationMethodValue();
  /**
   * <pre>
   * Output only. How the simulation modifies the field.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.SimulationModificationMethodEnum.SimulationModificationMethod modification_method = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The modificationMethod.
   */
  com.google.ads.googleads.v14.enums.SimulationModificationMethodEnum.SimulationModificationMethod getModificationMethod();

  /**
   * <pre>
   * Output only. First day on which the simulation is based, in YYYY-MM-DD
   * format.
   * </pre>
   *
   * <code>optional string start_date = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * Output only. First day on which the simulation is based, in YYYY-MM-DD
   * format.
   * </pre>
   *
   * <code>optional string start_date = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <pre>
   * Output only. First day on which the simulation is based, in YYYY-MM-DD
   * format.
   * </pre>
   *
   * <code>optional string start_date = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <pre>
   * Output only. Last day on which the simulation is based, in YYYY-MM-DD
   * format
   * </pre>
   *
   * <code>optional string end_date = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   * <pre>
   * Output only. Last day on which the simulation is based, in YYYY-MM-DD
   * format
   * </pre>
   *
   * <code>optional string end_date = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <pre>
   * Output only. Last day on which the simulation is based, in YYYY-MM-DD
   * format
   * </pre>
   *
   * <code>optional string end_date = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();

  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPC_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.CpcBidSimulationPointList cpc_bid_point_list = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the cpcBidPointList field is set.
   */
  boolean hasCpcBidPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPC_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.CpcBidSimulationPointList cpc_bid_point_list = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The cpcBidPointList.
   */
  com.google.ads.googleads.v14.common.CpcBidSimulationPointList getCpcBidPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPC_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.CpcBidSimulationPointList cpc_bid_point_list = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.common.CpcBidSimulationPointListOrBuilder getCpcBidPointListOrBuilder();

  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPV_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.CpvBidSimulationPointList cpv_bid_point_list = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the cpvBidPointList field is set.
   */
  boolean hasCpvBidPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPV_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.CpvBidSimulationPointList cpv_bid_point_list = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The cpvBidPointList.
   */
  com.google.ads.googleads.v14.common.CpvBidSimulationPointList getCpvBidPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPV_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.CpvBidSimulationPointList cpv_bid_point_list = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.common.CpvBidSimulationPointListOrBuilder getCpvBidPointListOrBuilder();

  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_CPA.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.TargetCpaSimulationPointList target_cpa_point_list = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetCpaPointList field is set.
   */
  boolean hasTargetCpaPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_CPA.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.TargetCpaSimulationPointList target_cpa_point_list = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetCpaPointList.
   */
  com.google.ads.googleads.v14.common.TargetCpaSimulationPointList getTargetCpaPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_CPA.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.TargetCpaSimulationPointList target_cpa_point_list = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.common.TargetCpaSimulationPointListOrBuilder getTargetCpaPointListOrBuilder();

  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_ROAS.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.TargetRoasSimulationPointList target_roas_point_list = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetRoasPointList field is set.
   */
  boolean hasTargetRoasPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_ROAS.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.TargetRoasSimulationPointList target_roas_point_list = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetRoasPointList.
   */
  com.google.ads.googleads.v14.common.TargetRoasSimulationPointList getTargetRoasPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_ROAS.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.TargetRoasSimulationPointList target_roas_point_list = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.common.TargetRoasSimulationPointListOrBuilder getTargetRoasPointListOrBuilder();

  com.google.ads.googleads.v14.resources.AdGroupSimulation.PointListCase getPointListCase();
}
