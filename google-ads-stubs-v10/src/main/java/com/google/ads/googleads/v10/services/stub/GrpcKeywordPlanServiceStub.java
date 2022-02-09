/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v10.services.stub;

import com.google.ads.googleads.v10.services.GenerateForecastCurveRequest;
import com.google.ads.googleads.v10.services.GenerateForecastCurveResponse;
import com.google.ads.googleads.v10.services.GenerateForecastMetricsRequest;
import com.google.ads.googleads.v10.services.GenerateForecastMetricsResponse;
import com.google.ads.googleads.v10.services.GenerateForecastTimeSeriesRequest;
import com.google.ads.googleads.v10.services.GenerateForecastTimeSeriesResponse;
import com.google.ads.googleads.v10.services.GenerateHistoricalMetricsRequest;
import com.google.ads.googleads.v10.services.GenerateHistoricalMetricsResponse;
import com.google.ads.googleads.v10.services.MutateKeywordPlansRequest;
import com.google.ads.googleads.v10.services.MutateKeywordPlansResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the KeywordPlanService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcKeywordPlanServiceStub extends KeywordPlanServiceStub {
  private static final MethodDescriptor<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
      mutateKeywordPlansMethodDescriptor =
          MethodDescriptor.<MutateKeywordPlansRequest, MutateKeywordPlansResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.KeywordPlanService/MutateKeywordPlans")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateKeywordPlansRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateKeywordPlansResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GenerateForecastCurveRequest, GenerateForecastCurveResponse>
      generateForecastCurveMethodDescriptor =
          MethodDescriptor.<GenerateForecastCurveRequest, GenerateForecastCurveResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.KeywordPlanService/GenerateForecastCurve")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateForecastCurveRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateForecastCurveResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>
      generateForecastTimeSeriesMethodDescriptor =
          MethodDescriptor
              .<GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.KeywordPlanService/GenerateForecastTimeSeries")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateForecastTimeSeriesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateForecastTimeSeriesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>
      generateForecastMetricsMethodDescriptor =
          MethodDescriptor
              .<GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.KeywordPlanService/GenerateForecastMetrics")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateForecastMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateForecastMetricsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>
      generateHistoricalMetricsMethodDescriptor =
          MethodDescriptor
              .<GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v10.services.KeywordPlanService/GenerateHistoricalMetrics")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateHistoricalMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateHistoricalMetricsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
      mutateKeywordPlansCallable;
  private final UnaryCallable<GenerateForecastCurveRequest, GenerateForecastCurveResponse>
      generateForecastCurveCallable;
  private final UnaryCallable<GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>
      generateForecastTimeSeriesCallable;
  private final UnaryCallable<GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>
      generateForecastMetricsCallable;
  private final UnaryCallable<GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>
      generateHistoricalMetricsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcKeywordPlanServiceStub create(KeywordPlanServiceStubSettings settings)
      throws IOException {
    return new GrpcKeywordPlanServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcKeywordPlanServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcKeywordPlanServiceStub(
        KeywordPlanServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcKeywordPlanServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcKeywordPlanServiceStub(
        KeywordPlanServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcKeywordPlanServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcKeywordPlanServiceStub(
      KeywordPlanServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcKeywordPlanServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcKeywordPlanServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcKeywordPlanServiceStub(
      KeywordPlanServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
        mutateKeywordPlansTransportSettings =
            GrpcCallSettings.<MutateKeywordPlansRequest, MutateKeywordPlansResponse>newBuilder()
                .setMethodDescriptor(mutateKeywordPlansMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GenerateForecastCurveRequest, GenerateForecastCurveResponse>
        generateForecastCurveTransportSettings =
            GrpcCallSettings
                .<GenerateForecastCurveRequest, GenerateForecastCurveResponse>newBuilder()
                .setMethodDescriptor(generateForecastCurveMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("keyword_plan", String.valueOf(request.getKeywordPlan()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>
        generateForecastTimeSeriesTransportSettings =
            GrpcCallSettings
                .<GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>newBuilder()
                .setMethodDescriptor(generateForecastTimeSeriesMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("keyword_plan", String.valueOf(request.getKeywordPlan()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>
        generateForecastMetricsTransportSettings =
            GrpcCallSettings
                .<GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>newBuilder()
                .setMethodDescriptor(generateForecastMetricsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("keyword_plan", String.valueOf(request.getKeywordPlan()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>
        generateHistoricalMetricsTransportSettings =
            GrpcCallSettings
                .<GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>newBuilder()
                .setMethodDescriptor(generateHistoricalMetricsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("keyword_plan", String.valueOf(request.getKeywordPlan()));
                      return params.build();
                    })
                .build();

    this.mutateKeywordPlansCallable =
        callableFactory.createUnaryCallable(
            mutateKeywordPlansTransportSettings,
            settings.mutateKeywordPlansSettings(),
            clientContext);
    this.generateForecastCurveCallable =
        callableFactory.createUnaryCallable(
            generateForecastCurveTransportSettings,
            settings.generateForecastCurveSettings(),
            clientContext);
    this.generateForecastTimeSeriesCallable =
        callableFactory.createUnaryCallable(
            generateForecastTimeSeriesTransportSettings,
            settings.generateForecastTimeSeriesSettings(),
            clientContext);
    this.generateForecastMetricsCallable =
        callableFactory.createUnaryCallable(
            generateForecastMetricsTransportSettings,
            settings.generateForecastMetricsSettings(),
            clientContext);
    this.generateHistoricalMetricsCallable =
        callableFactory.createUnaryCallable(
            generateHistoricalMetricsTransportSettings,
            settings.generateHistoricalMetricsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
      mutateKeywordPlansCallable() {
    return mutateKeywordPlansCallable;
  }

  @Override
  public UnaryCallable<GenerateForecastCurveRequest, GenerateForecastCurveResponse>
      generateForecastCurveCallable() {
    return generateForecastCurveCallable;
  }

  @Override
  public UnaryCallable<GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>
      generateForecastTimeSeriesCallable() {
    return generateForecastTimeSeriesCallable;
  }

  @Override
  public UnaryCallable<GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>
      generateForecastMetricsCallable() {
    return generateForecastMetricsCallable;
  }

  @Override
  public UnaryCallable<GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>
      generateHistoricalMetricsCallable() {
    return generateHistoricalMetricsCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
