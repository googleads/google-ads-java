/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v21.services.stub;

import com.google.ads.googleads.v21.services.GenerateConversionRatesRequest;
import com.google.ads.googleads.v21.services.GenerateConversionRatesResponse;
import com.google.ads.googleads.v21.services.GenerateReachForecastRequest;
import com.google.ads.googleads.v21.services.GenerateReachForecastResponse;
import com.google.ads.googleads.v21.services.ListPlannableLocationsRequest;
import com.google.ads.googleads.v21.services.ListPlannableLocationsResponse;
import com.google.ads.googleads.v21.services.ListPlannableProductsRequest;
import com.google.ads.googleads.v21.services.ListPlannableProductsResponse;
import com.google.ads.googleads.v21.services.ListPlannableUserInterestsRequest;
import com.google.ads.googleads.v21.services.ListPlannableUserInterestsResponse;
import com.google.ads.googleads.v21.services.ListPlannableUserListsRequest;
import com.google.ads.googleads.v21.services.ListPlannableUserListsResponse;
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
 * gRPC stub implementation for the ReachPlanService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcReachPlanServiceStub extends ReachPlanServiceStub {
  private static final MethodDescriptor<
          GenerateConversionRatesRequest, GenerateConversionRatesResponse>
      generateConversionRatesMethodDescriptor =
          MethodDescriptor
              .<GenerateConversionRatesRequest, GenerateConversionRatesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v21.services.ReachPlanService/GenerateConversionRates")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateConversionRatesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateConversionRatesResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<
          ListPlannableLocationsRequest, ListPlannableLocationsResponse>
      listPlannableLocationsMethodDescriptor =
          MethodDescriptor
              .<ListPlannableLocationsRequest, ListPlannableLocationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v21.services.ReachPlanService/ListPlannableLocations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListPlannableLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListPlannableLocationsResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<ListPlannableProductsRequest, ListPlannableProductsResponse>
      listPlannableProductsMethodDescriptor =
          MethodDescriptor.<ListPlannableProductsRequest, ListPlannableProductsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v21.services.ReachPlanService/ListPlannableProducts")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListPlannableProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListPlannableProductsResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<GenerateReachForecastRequest, GenerateReachForecastResponse>
      generateReachForecastMethodDescriptor =
          MethodDescriptor.<GenerateReachForecastRequest, GenerateReachForecastResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v21.services.ReachPlanService/GenerateReachForecast")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateReachForecastRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateReachForecastResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<
          ListPlannableUserListsRequest, ListPlannableUserListsResponse>
      listPlannableUserListsMethodDescriptor =
          MethodDescriptor
              .<ListPlannableUserListsRequest, ListPlannableUserListsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v21.services.ReachPlanService/ListPlannableUserLists")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListPlannableUserListsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListPlannableUserListsResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<
          ListPlannableUserInterestsRequest, ListPlannableUserInterestsResponse>
      listPlannableUserInterestsMethodDescriptor =
          MethodDescriptor
              .<ListPlannableUserInterestsRequest, ListPlannableUserInterestsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v21.services.ReachPlanService/ListPlannableUserInterests")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListPlannableUserInterestsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListPlannableUserInterestsResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private final UnaryCallable<GenerateConversionRatesRequest, GenerateConversionRatesResponse>
      generateConversionRatesCallable;
  private final UnaryCallable<ListPlannableLocationsRequest, ListPlannableLocationsResponse>
      listPlannableLocationsCallable;
  private final UnaryCallable<ListPlannableProductsRequest, ListPlannableProductsResponse>
      listPlannableProductsCallable;
  private final UnaryCallable<GenerateReachForecastRequest, GenerateReachForecastResponse>
      generateReachForecastCallable;
  private final UnaryCallable<ListPlannableUserListsRequest, ListPlannableUserListsResponse>
      listPlannableUserListsCallable;
  private final UnaryCallable<ListPlannableUserInterestsRequest, ListPlannableUserInterestsResponse>
      listPlannableUserInterestsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcReachPlanServiceStub create(ReachPlanServiceStubSettings settings)
      throws IOException {
    return new GrpcReachPlanServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcReachPlanServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcReachPlanServiceStub(
        ReachPlanServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcReachPlanServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcReachPlanServiceStub(
        ReachPlanServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcReachPlanServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcReachPlanServiceStub(
      ReachPlanServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcReachPlanServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcReachPlanServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcReachPlanServiceStub(
      ReachPlanServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GenerateConversionRatesRequest, GenerateConversionRatesResponse>
        generateConversionRatesTransportSettings =
            GrpcCallSettings
                .<GenerateConversionRatesRequest, GenerateConversionRatesResponse>newBuilder()
                .setMethodDescriptor(generateConversionRatesMethodDescriptor)
                .build();
    GrpcCallSettings<ListPlannableLocationsRequest, ListPlannableLocationsResponse>
        listPlannableLocationsTransportSettings =
            GrpcCallSettings
                .<ListPlannableLocationsRequest, ListPlannableLocationsResponse>newBuilder()
                .setMethodDescriptor(listPlannableLocationsMethodDescriptor)
                .build();
    GrpcCallSettings<ListPlannableProductsRequest, ListPlannableProductsResponse>
        listPlannableProductsTransportSettings =
            GrpcCallSettings
                .<ListPlannableProductsRequest, ListPlannableProductsResponse>newBuilder()
                .setMethodDescriptor(listPlannableProductsMethodDescriptor)
                .build();
    GrpcCallSettings<GenerateReachForecastRequest, GenerateReachForecastResponse>
        generateReachForecastTransportSettings =
            GrpcCallSettings
                .<GenerateReachForecastRequest, GenerateReachForecastResponse>newBuilder()
                .setMethodDescriptor(generateReachForecastMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<ListPlannableUserListsRequest, ListPlannableUserListsResponse>
        listPlannableUserListsTransportSettings =
            GrpcCallSettings
                .<ListPlannableUserListsRequest, ListPlannableUserListsResponse>newBuilder()
                .setMethodDescriptor(listPlannableUserListsMethodDescriptor)
                .build();
    GrpcCallSettings<ListPlannableUserInterestsRequest, ListPlannableUserInterestsResponse>
        listPlannableUserInterestsTransportSettings =
            GrpcCallSettings
                .<ListPlannableUserInterestsRequest, ListPlannableUserInterestsResponse>newBuilder()
                .setMethodDescriptor(listPlannableUserInterestsMethodDescriptor)
                .build();

    this.generateConversionRatesCallable =
        callableFactory.createUnaryCallable(
            generateConversionRatesTransportSettings,
            settings.generateConversionRatesSettings(),
            clientContext);
    this.listPlannableLocationsCallable =
        callableFactory.createUnaryCallable(
            listPlannableLocationsTransportSettings,
            settings.listPlannableLocationsSettings(),
            clientContext);
    this.listPlannableProductsCallable =
        callableFactory.createUnaryCallable(
            listPlannableProductsTransportSettings,
            settings.listPlannableProductsSettings(),
            clientContext);
    this.generateReachForecastCallable =
        callableFactory.createUnaryCallable(
            generateReachForecastTransportSettings,
            settings.generateReachForecastSettings(),
            clientContext);
    this.listPlannableUserListsCallable =
        callableFactory.createUnaryCallable(
            listPlannableUserListsTransportSettings,
            settings.listPlannableUserListsSettings(),
            clientContext);
    this.listPlannableUserInterestsCallable =
        callableFactory.createUnaryCallable(
            listPlannableUserInterestsTransportSettings,
            settings.listPlannableUserInterestsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GenerateConversionRatesRequest, GenerateConversionRatesResponse>
      generateConversionRatesCallable() {
    return generateConversionRatesCallable;
  }

  @Override
  public UnaryCallable<ListPlannableLocationsRequest, ListPlannableLocationsResponse>
      listPlannableLocationsCallable() {
    return listPlannableLocationsCallable;
  }

  @Override
  public UnaryCallable<ListPlannableProductsRequest, ListPlannableProductsResponse>
      listPlannableProductsCallable() {
    return listPlannableProductsCallable;
  }

  @Override
  public UnaryCallable<GenerateReachForecastRequest, GenerateReachForecastResponse>
      generateReachForecastCallable() {
    return generateReachForecastCallable;
  }

  @Override
  public UnaryCallable<ListPlannableUserListsRequest, ListPlannableUserListsResponse>
      listPlannableUserListsCallable() {
    return listPlannableUserListsCallable;
  }

  @Override
  public UnaryCallable<ListPlannableUserInterestsRequest, ListPlannableUserInterestsResponse>
      listPlannableUserInterestsCallable() {
    return listPlannableUserInterestsCallable;
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
