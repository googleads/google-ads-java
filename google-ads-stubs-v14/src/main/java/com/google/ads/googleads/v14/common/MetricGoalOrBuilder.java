// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/metric_goal.proto

package com.google.ads.googleads.v14.common;

public interface MetricGoalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.common.MetricGoal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The metric of the goal. For example, clicks, impressions, cost,
   * conversions, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric metric = 1;</code>
   * @return The enum numeric value on the wire for metric.
   */
  int getMetricValue();
  /**
   * <pre>
   * The metric of the goal. For example, clicks, impressions, cost,
   * conversions, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric metric = 1;</code>
   * @return The metric.
   */
  com.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric getMetric();

  /**
   * <pre>
   * The metric direction of the goal. For example, increase, decrease, no
   * change.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection direction = 2;</code>
   * @return The enum numeric value on the wire for direction.
   */
  int getDirectionValue();
  /**
   * <pre>
   * The metric direction of the goal. For example, increase, decrease, no
   * change.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection direction = 2;</code>
   * @return The direction.
   */
  com.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection getDirection();
}
