/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v23.services.stub;

import com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest;
import com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse;
import com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest;
import com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse;
import com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest;
import com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse;
import com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest;
import com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse;
import com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest;
import com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse;
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
 * gRPC stub implementation for the BenchmarksService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcBenchmarksServiceStub extends BenchmarksServiceStub {
  private static final MethodDescriptor<
          ListBenchmarksAvailableDatesRequest, ListBenchmarksAvailableDatesResponse>
      listBenchmarksAvailableDatesMethodDescriptor =
          MethodDescriptor
              .<ListBenchmarksAvailableDatesRequest, ListBenchmarksAvailableDatesResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v23.services.BenchmarksService/ListBenchmarksAvailableDates")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListBenchmarksAvailableDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListBenchmarksAvailableDatesResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<
          ListBenchmarksLocationsRequest, ListBenchmarksLocationsResponse>
      listBenchmarksLocationsMethodDescriptor =
          MethodDescriptor
              .<ListBenchmarksLocationsRequest, ListBenchmarksLocationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v23.services.BenchmarksService/ListBenchmarksLocations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListBenchmarksLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListBenchmarksLocationsResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<
          ListBenchmarksProductsRequest, ListBenchmarksProductsResponse>
      listBenchmarksProductsMethodDescriptor =
          MethodDescriptor
              .<ListBenchmarksProductsRequest, ListBenchmarksProductsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v23.services.BenchmarksService/ListBenchmarksProducts")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListBenchmarksProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListBenchmarksProductsResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<ListBenchmarksSourcesRequest, ListBenchmarksSourcesResponse>
      listBenchmarksSourcesMethodDescriptor =
          MethodDescriptor.<ListBenchmarksSourcesRequest, ListBenchmarksSourcesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v23.services.BenchmarksService/ListBenchmarksSources")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListBenchmarksSourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListBenchmarksSourcesResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<
          GenerateBenchmarksMetricsRequest, GenerateBenchmarksMetricsResponse>
      generateBenchmarksMetricsMethodDescriptor =
          MethodDescriptor
              .<GenerateBenchmarksMetricsRequest, GenerateBenchmarksMetricsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v23.services.BenchmarksService/GenerateBenchmarksMetrics")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateBenchmarksMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateBenchmarksMetricsResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private final UnaryCallable<
          ListBenchmarksAvailableDatesRequest, ListBenchmarksAvailableDatesResponse>
      listBenchmarksAvailableDatesCallable;
  private final UnaryCallable<ListBenchmarksLocationsRequest, ListBenchmarksLocationsResponse>
      listBenchmarksLocationsCallable;
  private final UnaryCallable<ListBenchmarksProductsRequest, ListBenchmarksProductsResponse>
      listBenchmarksProductsCallable;
  private final UnaryCallable<ListBenchmarksSourcesRequest, ListBenchmarksSourcesResponse>
      listBenchmarksSourcesCallable;
  private final UnaryCallable<GenerateBenchmarksMetricsRequest, GenerateBenchmarksMetricsResponse>
      generateBenchmarksMetricsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcBenchmarksServiceStub create(BenchmarksServiceStubSettings settings)
      throws IOException {
    return new GrpcBenchmarksServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcBenchmarksServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcBenchmarksServiceStub(
        BenchmarksServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcBenchmarksServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcBenchmarksServiceStub(
        BenchmarksServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcBenchmarksServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcBenchmarksServiceStub(
      BenchmarksServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcBenchmarksServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcBenchmarksServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcBenchmarksServiceStub(
      BenchmarksServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ListBenchmarksAvailableDatesRequest, ListBenchmarksAvailableDatesResponse>
        listBenchmarksAvailableDatesTransportSettings =
            GrpcCallSettings
                .<ListBenchmarksAvailableDatesRequest, ListBenchmarksAvailableDatesResponse>
                    newBuilder()
                .setMethodDescriptor(listBenchmarksAvailableDatesMethodDescriptor)
                .build();
    GrpcCallSettings<ListBenchmarksLocationsRequest, ListBenchmarksLocationsResponse>
        listBenchmarksLocationsTransportSettings =
            GrpcCallSettings
                .<ListBenchmarksLocationsRequest, ListBenchmarksLocationsResponse>newBuilder()
                .setMethodDescriptor(listBenchmarksLocationsMethodDescriptor)
                .build();
    GrpcCallSettings<ListBenchmarksProductsRequest, ListBenchmarksProductsResponse>
        listBenchmarksProductsTransportSettings =
            GrpcCallSettings
                .<ListBenchmarksProductsRequest, ListBenchmarksProductsResponse>newBuilder()
                .setMethodDescriptor(listBenchmarksProductsMethodDescriptor)
                .build();
    GrpcCallSettings<ListBenchmarksSourcesRequest, ListBenchmarksSourcesResponse>
        listBenchmarksSourcesTransportSettings =
            GrpcCallSettings
                .<ListBenchmarksSourcesRequest, ListBenchmarksSourcesResponse>newBuilder()
                .setMethodDescriptor(listBenchmarksSourcesMethodDescriptor)
                .build();
    GrpcCallSettings<GenerateBenchmarksMetricsRequest, GenerateBenchmarksMetricsResponse>
        generateBenchmarksMetricsTransportSettings =
            GrpcCallSettings
                .<GenerateBenchmarksMetricsRequest, GenerateBenchmarksMetricsResponse>newBuilder()
                .setMethodDescriptor(generateBenchmarksMetricsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.listBenchmarksAvailableDatesCallable =
        callableFactory.createUnaryCallable(
            listBenchmarksAvailableDatesTransportSettings,
            settings.listBenchmarksAvailableDatesSettings(),
            clientContext);
    this.listBenchmarksLocationsCallable =
        callableFactory.createUnaryCallable(
            listBenchmarksLocationsTransportSettings,
            settings.listBenchmarksLocationsSettings(),
            clientContext);
    this.listBenchmarksProductsCallable =
        callableFactory.createUnaryCallable(
            listBenchmarksProductsTransportSettings,
            settings.listBenchmarksProductsSettings(),
            clientContext);
    this.listBenchmarksSourcesCallable =
        callableFactory.createUnaryCallable(
            listBenchmarksSourcesTransportSettings,
            settings.listBenchmarksSourcesSettings(),
            clientContext);
    this.generateBenchmarksMetricsCallable =
        callableFactory.createUnaryCallable(
            generateBenchmarksMetricsTransportSettings,
            settings.generateBenchmarksMetricsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<ListBenchmarksAvailableDatesRequest, ListBenchmarksAvailableDatesResponse>
      listBenchmarksAvailableDatesCallable() {
    return listBenchmarksAvailableDatesCallable;
  }

  @Override
  public UnaryCallable<ListBenchmarksLocationsRequest, ListBenchmarksLocationsResponse>
      listBenchmarksLocationsCallable() {
    return listBenchmarksLocationsCallable;
  }

  @Override
  public UnaryCallable<ListBenchmarksProductsRequest, ListBenchmarksProductsResponse>
      listBenchmarksProductsCallable() {
    return listBenchmarksProductsCallable;
  }

  @Override
  public UnaryCallable<ListBenchmarksSourcesRequest, ListBenchmarksSourcesResponse>
      listBenchmarksSourcesCallable() {
    return listBenchmarksSourcesCallable;
  }

  @Override
  public UnaryCallable<GenerateBenchmarksMetricsRequest, GenerateBenchmarksMetricsResponse>
      generateBenchmarksMetricsCallable() {
    return generateBenchmarksMetricsCallable;
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
