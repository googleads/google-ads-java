/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v16.services.stub;

import static com.google.ads.googleads.v16.services.KeywordPlanIdeaServiceClient.GenerateKeywordIdeasPagedResponse;

import com.google.ads.googleads.v16.services.GenerateAdGroupThemesRequest;
import com.google.ads.googleads.v16.services.GenerateAdGroupThemesResponse;
import com.google.ads.googleads.v16.services.GenerateKeywordForecastMetricsRequest;
import com.google.ads.googleads.v16.services.GenerateKeywordForecastMetricsResponse;
import com.google.ads.googleads.v16.services.GenerateKeywordHistoricalMetricsRequest;
import com.google.ads.googleads.v16.services.GenerateKeywordHistoricalMetricsResponse;
import com.google.ads.googleads.v16.services.GenerateKeywordIdeaResponse;
import com.google.ads.googleads.v16.services.GenerateKeywordIdeasRequest;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the KeywordPlanIdeaService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcKeywordPlanIdeaServiceStub extends KeywordPlanIdeaServiceStub {
  private static final MethodDescriptor<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>
      generateKeywordIdeasMethodDescriptor =
          MethodDescriptor.<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v16.services.KeywordPlanIdeaService/GenerateKeywordIdeas")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateKeywordIdeasRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateKeywordIdeaResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          GenerateKeywordHistoricalMetricsRequest, GenerateKeywordHistoricalMetricsResponse>
      generateKeywordHistoricalMetricsMethodDescriptor =
          MethodDescriptor
              .<GenerateKeywordHistoricalMetricsRequest, GenerateKeywordHistoricalMetricsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v16.services.KeywordPlanIdeaService/GenerateKeywordHistoricalMetrics")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      GenerateKeywordHistoricalMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      GenerateKeywordHistoricalMetricsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GenerateAdGroupThemesRequest, GenerateAdGroupThemesResponse>
      generateAdGroupThemesMethodDescriptor =
          MethodDescriptor.<GenerateAdGroupThemesRequest, GenerateAdGroupThemesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v16.services.KeywordPlanIdeaService/GenerateAdGroupThemes")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateAdGroupThemesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateAdGroupThemesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          GenerateKeywordForecastMetricsRequest, GenerateKeywordForecastMetricsResponse>
      generateKeywordForecastMetricsMethodDescriptor =
          MethodDescriptor
              .<GenerateKeywordForecastMetricsRequest, GenerateKeywordForecastMetricsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v16.services.KeywordPlanIdeaService/GenerateKeywordForecastMetrics")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateKeywordForecastMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      GenerateKeywordForecastMetricsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>
      generateKeywordIdeasCallable;
  private final UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeasPagedResponse>
      generateKeywordIdeasPagedCallable;
  private final UnaryCallable<
          GenerateKeywordHistoricalMetricsRequest, GenerateKeywordHistoricalMetricsResponse>
      generateKeywordHistoricalMetricsCallable;
  private final UnaryCallable<GenerateAdGroupThemesRequest, GenerateAdGroupThemesResponse>
      generateAdGroupThemesCallable;
  private final UnaryCallable<
          GenerateKeywordForecastMetricsRequest, GenerateKeywordForecastMetricsResponse>
      generateKeywordForecastMetricsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcKeywordPlanIdeaServiceStub create(
      KeywordPlanIdeaServiceStubSettings settings) throws IOException {
    return new GrpcKeywordPlanIdeaServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcKeywordPlanIdeaServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcKeywordPlanIdeaServiceStub(
        KeywordPlanIdeaServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcKeywordPlanIdeaServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcKeywordPlanIdeaServiceStub(
        KeywordPlanIdeaServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcKeywordPlanIdeaServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcKeywordPlanIdeaServiceStub(
      KeywordPlanIdeaServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcKeywordPlanIdeaServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcKeywordPlanIdeaServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcKeywordPlanIdeaServiceStub(
      KeywordPlanIdeaServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>
        generateKeywordIdeasTransportSettings =
            GrpcCallSettings.<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>newBuilder()
                .setMethodDescriptor(generateKeywordIdeasMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<
            GenerateKeywordHistoricalMetricsRequest, GenerateKeywordHistoricalMetricsResponse>
        generateKeywordHistoricalMetricsTransportSettings =
            GrpcCallSettings
                .<GenerateKeywordHistoricalMetricsRequest, GenerateKeywordHistoricalMetricsResponse>
                    newBuilder()
                .setMethodDescriptor(generateKeywordHistoricalMetricsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<GenerateAdGroupThemesRequest, GenerateAdGroupThemesResponse>
        generateAdGroupThemesTransportSettings =
            GrpcCallSettings
                .<GenerateAdGroupThemesRequest, GenerateAdGroupThemesResponse>newBuilder()
                .setMethodDescriptor(generateAdGroupThemesMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<GenerateKeywordForecastMetricsRequest, GenerateKeywordForecastMetricsResponse>
        generateKeywordForecastMetricsTransportSettings =
            GrpcCallSettings
                .<GenerateKeywordForecastMetricsRequest, GenerateKeywordForecastMetricsResponse>
                    newBuilder()
                .setMethodDescriptor(generateKeywordForecastMetricsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.generateKeywordIdeasCallable =
        callableFactory.createUnaryCallable(
            generateKeywordIdeasTransportSettings,
            settings.generateKeywordIdeasSettings(),
            clientContext);
    this.generateKeywordIdeasPagedCallable =
        callableFactory.createPagedCallable(
            generateKeywordIdeasTransportSettings,
            settings.generateKeywordIdeasSettings(),
            clientContext);
    this.generateKeywordHistoricalMetricsCallable =
        callableFactory.createUnaryCallable(
            generateKeywordHistoricalMetricsTransportSettings,
            settings.generateKeywordHistoricalMetricsSettings(),
            clientContext);
    this.generateAdGroupThemesCallable =
        callableFactory.createUnaryCallable(
            generateAdGroupThemesTransportSettings,
            settings.generateAdGroupThemesSettings(),
            clientContext);
    this.generateKeywordForecastMetricsCallable =
        callableFactory.createUnaryCallable(
            generateKeywordForecastMetricsTransportSettings,
            settings.generateKeywordForecastMetricsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>
      generateKeywordIdeasCallable() {
    return generateKeywordIdeasCallable;
  }

  @Override
  public UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeasPagedResponse>
      generateKeywordIdeasPagedCallable() {
    return generateKeywordIdeasPagedCallable;
  }

  @Override
  public UnaryCallable<
          GenerateKeywordHistoricalMetricsRequest, GenerateKeywordHistoricalMetricsResponse>
      generateKeywordHistoricalMetricsCallable() {
    return generateKeywordHistoricalMetricsCallable;
  }

  @Override
  public UnaryCallable<GenerateAdGroupThemesRequest, GenerateAdGroupThemesResponse>
      generateAdGroupThemesCallable() {
    return generateAdGroupThemesCallable;
  }

  @Override
  public UnaryCallable<
          GenerateKeywordForecastMetricsRequest, GenerateKeywordForecastMetricsResponse>
      generateKeywordForecastMetricsCallable() {
    return generateKeywordForecastMetricsCallable;
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
