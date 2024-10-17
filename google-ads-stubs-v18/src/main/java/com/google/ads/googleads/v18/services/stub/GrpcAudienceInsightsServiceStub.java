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

package com.google.ads.googleads.v18.services.stub;

import com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest;
import com.google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsResponse;
import com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsRequest;
import com.google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse;
import com.google.ads.googleads.v18.services.GenerateInsightsFinderReportRequest;
import com.google.ads.googleads.v18.services.GenerateInsightsFinderReportResponse;
import com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsRequest;
import com.google.ads.googleads.v18.services.GenerateSuggestedTargetingInsightsResponse;
import com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsRequest;
import com.google.ads.googleads.v18.services.GenerateTargetingSuggestionMetricsResponse;
import com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesRequest;
import com.google.ads.googleads.v18.services.ListAudienceInsightsAttributesResponse;
import com.google.ads.googleads.v18.services.ListInsightsEligibleDatesRequest;
import com.google.ads.googleads.v18.services.ListInsightsEligibleDatesResponse;
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
 * gRPC stub implementation for the AudienceInsightsService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcAudienceInsightsServiceStub extends AudienceInsightsServiceStub {
  private static final MethodDescriptor<
          GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
      generateInsightsFinderReportMethodDescriptor =
          MethodDescriptor
              .<GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.AudienceInsightsService/GenerateInsightsFinderReport")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateInsightsFinderReportRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateInsightsFinderReportResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
      listAudienceInsightsAttributesMethodDescriptor =
          MethodDescriptor
              .<ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.AudienceInsightsService/ListAudienceInsightsAttributes")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListAudienceInsightsAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      ListAudienceInsightsAttributesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>
      listInsightsEligibleDatesMethodDescriptor =
          MethodDescriptor
              .<ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.AudienceInsightsService/ListInsightsEligibleDates")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListInsightsEligibleDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListInsightsEligibleDatesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          GenerateAudienceCompositionInsightsRequest, GenerateAudienceCompositionInsightsResponse>
      generateAudienceCompositionInsightsMethodDescriptor =
          MethodDescriptor
              .<GenerateAudienceCompositionInsightsRequest,
                  GenerateAudienceCompositionInsightsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.AudienceInsightsService/GenerateAudienceCompositionInsights")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      GenerateAudienceCompositionInsightsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      GenerateAudienceCompositionInsightsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          GenerateSuggestedTargetingInsightsRequest, GenerateSuggestedTargetingInsightsResponse>
      generateSuggestedTargetingInsightsMethodDescriptor =
          MethodDescriptor
              .<GenerateSuggestedTargetingInsightsRequest,
                  GenerateSuggestedTargetingInsightsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.AudienceInsightsService/GenerateSuggestedTargetingInsights")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      GenerateSuggestedTargetingInsightsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      GenerateSuggestedTargetingInsightsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
      generateAudienceOverlapInsightsMethodDescriptor =
          MethodDescriptor
              .<GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.AudienceInsightsService/GenerateAudienceOverlapInsights")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      GenerateAudienceOverlapInsightsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      GenerateAudienceOverlapInsightsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          GenerateTargetingSuggestionMetricsRequest, GenerateTargetingSuggestionMetricsResponse>
      generateTargetingSuggestionMetricsMethodDescriptor =
          MethodDescriptor
              .<GenerateTargetingSuggestionMetricsRequest,
                  GenerateTargetingSuggestionMetricsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.AudienceInsightsService/GenerateTargetingSuggestionMetrics")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      GenerateTargetingSuggestionMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      GenerateTargetingSuggestionMetricsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<
          GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
      generateInsightsFinderReportCallable;
  private final UnaryCallable<
          ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
      listAudienceInsightsAttributesCallable;
  private final UnaryCallable<ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>
      listInsightsEligibleDatesCallable;
  private final UnaryCallable<
          GenerateAudienceCompositionInsightsRequest, GenerateAudienceCompositionInsightsResponse>
      generateAudienceCompositionInsightsCallable;
  private final UnaryCallable<
          GenerateSuggestedTargetingInsightsRequest, GenerateSuggestedTargetingInsightsResponse>
      generateSuggestedTargetingInsightsCallable;
  private final UnaryCallable<
          GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
      generateAudienceOverlapInsightsCallable;
  private final UnaryCallable<
          GenerateTargetingSuggestionMetricsRequest, GenerateTargetingSuggestionMetricsResponse>
      generateTargetingSuggestionMetricsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAudienceInsightsServiceStub create(
      AudienceInsightsServiceStubSettings settings) throws IOException {
    return new GrpcAudienceInsightsServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAudienceInsightsServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAudienceInsightsServiceStub(
        AudienceInsightsServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAudienceInsightsServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAudienceInsightsServiceStub(
        AudienceInsightsServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAudienceInsightsServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAudienceInsightsServiceStub(
      AudienceInsightsServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcAudienceInsightsServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAudienceInsightsServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAudienceInsightsServiceStub(
      AudienceInsightsServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
        generateInsightsFinderReportTransportSettings =
            GrpcCallSettings
                .<GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
                    newBuilder()
                .setMethodDescriptor(generateInsightsFinderReportMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
        listAudienceInsightsAttributesTransportSettings =
            GrpcCallSettings
                .<ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
                    newBuilder()
                .setMethodDescriptor(listAudienceInsightsAttributesMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>
        listInsightsEligibleDatesTransportSettings =
            GrpcCallSettings
                .<ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>newBuilder()
                .setMethodDescriptor(listInsightsEligibleDatesMethodDescriptor)
                .build();
    GrpcCallSettings<
            GenerateAudienceCompositionInsightsRequest, GenerateAudienceCompositionInsightsResponse>
        generateAudienceCompositionInsightsTransportSettings =
            GrpcCallSettings
                .<GenerateAudienceCompositionInsightsRequest,
                    GenerateAudienceCompositionInsightsResponse>
                    newBuilder()
                .setMethodDescriptor(generateAudienceCompositionInsightsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<
            GenerateSuggestedTargetingInsightsRequest, GenerateSuggestedTargetingInsightsResponse>
        generateSuggestedTargetingInsightsTransportSettings =
            GrpcCallSettings
                .<GenerateSuggestedTargetingInsightsRequest,
                    GenerateSuggestedTargetingInsightsResponse>
                    newBuilder()
                .setMethodDescriptor(generateSuggestedTargetingInsightsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<
            GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
        generateAudienceOverlapInsightsTransportSettings =
            GrpcCallSettings
                .<GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
                    newBuilder()
                .setMethodDescriptor(generateAudienceOverlapInsightsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<
            GenerateTargetingSuggestionMetricsRequest, GenerateTargetingSuggestionMetricsResponse>
        generateTargetingSuggestionMetricsTransportSettings =
            GrpcCallSettings
                .<GenerateTargetingSuggestionMetricsRequest,
                    GenerateTargetingSuggestionMetricsResponse>
                    newBuilder()
                .setMethodDescriptor(generateTargetingSuggestionMetricsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.generateInsightsFinderReportCallable =
        callableFactory.createUnaryCallable(
            generateInsightsFinderReportTransportSettings,
            settings.generateInsightsFinderReportSettings(),
            clientContext);
    this.listAudienceInsightsAttributesCallable =
        callableFactory.createUnaryCallable(
            listAudienceInsightsAttributesTransportSettings,
            settings.listAudienceInsightsAttributesSettings(),
            clientContext);
    this.listInsightsEligibleDatesCallable =
        callableFactory.createUnaryCallable(
            listInsightsEligibleDatesTransportSettings,
            settings.listInsightsEligibleDatesSettings(),
            clientContext);
    this.generateAudienceCompositionInsightsCallable =
        callableFactory.createUnaryCallable(
            generateAudienceCompositionInsightsTransportSettings,
            settings.generateAudienceCompositionInsightsSettings(),
            clientContext);
    this.generateSuggestedTargetingInsightsCallable =
        callableFactory.createUnaryCallable(
            generateSuggestedTargetingInsightsTransportSettings,
            settings.generateSuggestedTargetingInsightsSettings(),
            clientContext);
    this.generateAudienceOverlapInsightsCallable =
        callableFactory.createUnaryCallable(
            generateAudienceOverlapInsightsTransportSettings,
            settings.generateAudienceOverlapInsightsSettings(),
            clientContext);
    this.generateTargetingSuggestionMetricsCallable =
        callableFactory.createUnaryCallable(
            generateTargetingSuggestionMetricsTransportSettings,
            settings.generateTargetingSuggestionMetricsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
      generateInsightsFinderReportCallable() {
    return generateInsightsFinderReportCallable;
  }

  @Override
  public UnaryCallable<
          ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
      listAudienceInsightsAttributesCallable() {
    return listAudienceInsightsAttributesCallable;
  }

  @Override
  public UnaryCallable<ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>
      listInsightsEligibleDatesCallable() {
    return listInsightsEligibleDatesCallable;
  }

  @Override
  public UnaryCallable<
          GenerateAudienceCompositionInsightsRequest, GenerateAudienceCompositionInsightsResponse>
      generateAudienceCompositionInsightsCallable() {
    return generateAudienceCompositionInsightsCallable;
  }

  @Override
  public UnaryCallable<
          GenerateSuggestedTargetingInsightsRequest, GenerateSuggestedTargetingInsightsResponse>
      generateSuggestedTargetingInsightsCallable() {
    return generateSuggestedTargetingInsightsCallable;
  }

  @Override
  public UnaryCallable<
          GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
      generateAudienceOverlapInsightsCallable() {
    return generateAudienceOverlapInsightsCallable;
  }

  @Override
  public UnaryCallable<
          GenerateTargetingSuggestionMetricsRequest, GenerateTargetingSuggestionMetricsResponse>
      generateTargetingSuggestionMetricsCallable() {
    return generateTargetingSuggestionMetricsCallable;
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
