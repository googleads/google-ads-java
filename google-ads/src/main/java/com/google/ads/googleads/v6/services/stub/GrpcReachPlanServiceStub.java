/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services.stub;

import com.google.ads.googleads.v6.services.GenerateProductMixIdeasRequest;
import com.google.ads.googleads.v6.services.GenerateProductMixIdeasResponse;
import com.google.ads.googleads.v6.services.GenerateReachForecastRequest;
import com.google.ads.googleads.v6.services.GenerateReachForecastResponse;
import com.google.ads.googleads.v6.services.ListPlannableLocationsRequest;
import com.google.ads.googleads.v6.services.ListPlannableLocationsResponse;
import com.google.ads.googleads.v6.services.ListPlannableProductsRequest;
import com.google.ads.googleads.v6.services.ListPlannableProductsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
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
 * gRPC stub implementation for the ReachPlanService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcReachPlanServiceStub extends ReachPlanServiceStub {
  private static final MethodDescriptor<
          ListPlannableLocationsRequest, ListPlannableLocationsResponse>
      listPlannableLocationsMethodDescriptor =
          MethodDescriptor
              .<ListPlannableLocationsRequest, ListPlannableLocationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.ReachPlanService/ListPlannableLocations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListPlannableLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListPlannableLocationsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListPlannableProductsRequest, ListPlannableProductsResponse>
      listPlannableProductsMethodDescriptor =
          MethodDescriptor.<ListPlannableProductsRequest, ListPlannableProductsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.ReachPlanService/ListPlannableProducts")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListPlannableProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListPlannableProductsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          GenerateProductMixIdeasRequest, GenerateProductMixIdeasResponse>
      generateProductMixIdeasMethodDescriptor =
          MethodDescriptor
              .<GenerateProductMixIdeasRequest, GenerateProductMixIdeasResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.ReachPlanService/GenerateProductMixIdeas")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateProductMixIdeasRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateProductMixIdeasResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GenerateReachForecastRequest, GenerateReachForecastResponse>
      generateReachForecastMethodDescriptor =
          MethodDescriptor.<GenerateReachForecastRequest, GenerateReachForecastResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.ReachPlanService/GenerateReachForecast")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateReachForecastRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateReachForecastResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<ListPlannableLocationsRequest, ListPlannableLocationsResponse>
      listPlannableLocationsCallable;
  private final UnaryCallable<ListPlannableProductsRequest, ListPlannableProductsResponse>
      listPlannableProductsCallable;
  private final UnaryCallable<GenerateProductMixIdeasRequest, GenerateProductMixIdeasResponse>
      generateProductMixIdeasCallable;
  private final UnaryCallable<GenerateReachForecastRequest, GenerateReachForecastResponse>
      generateReachForecastCallable;

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

  protected GrpcReachPlanServiceStub(
      ReachPlanServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcReachPlanServiceCallableFactory());
  }

  protected GrpcReachPlanServiceStub(
      ReachPlanServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

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
    GrpcCallSettings<GenerateProductMixIdeasRequest, GenerateProductMixIdeasResponse>
        generateProductMixIdeasTransportSettings =
            GrpcCallSettings
                .<GenerateProductMixIdeasRequest, GenerateProductMixIdeasResponse>newBuilder()
                .setMethodDescriptor(generateProductMixIdeasMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GenerateProductMixIdeasRequest>() {
                      @Override
                      public Map<String, String> extract(GenerateProductMixIdeasRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<GenerateReachForecastRequest, GenerateReachForecastResponse>
        generateReachForecastTransportSettings =
            GrpcCallSettings
                .<GenerateReachForecastRequest, GenerateReachForecastResponse>newBuilder()
                .setMethodDescriptor(generateReachForecastMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GenerateReachForecastRequest>() {
                      @Override
                      public Map<String, String> extract(GenerateReachForecastRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

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
    this.generateProductMixIdeasCallable =
        callableFactory.createUnaryCallable(
            generateProductMixIdeasTransportSettings,
            settings.generateProductMixIdeasSettings(),
            clientContext);
    this.generateReachForecastCallable =
        callableFactory.createUnaryCallable(
            generateReachForecastTransportSettings,
            settings.generateReachForecastSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<ListPlannableLocationsRequest, ListPlannableLocationsResponse>
      listPlannableLocationsCallable() {
    return listPlannableLocationsCallable;
  }

  public UnaryCallable<ListPlannableProductsRequest, ListPlannableProductsResponse>
      listPlannableProductsCallable() {
    return listPlannableProductsCallable;
  }

  public UnaryCallable<GenerateProductMixIdeasRequest, GenerateProductMixIdeasResponse>
      generateProductMixIdeasCallable() {
    return generateProductMixIdeasCallable;
  }

  public UnaryCallable<GenerateReachForecastRequest, GenerateReachForecastResponse>
      generateReachForecastCallable() {
    return generateReachForecastCallable;
  }

  @Override
  public final void close() {
    shutdown();
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
