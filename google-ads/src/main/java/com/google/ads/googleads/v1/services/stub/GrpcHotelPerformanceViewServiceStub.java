/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v1.services.stub;

import com.google.ads.googleads.v1.resources.HotelPerformanceView;
import com.google.ads.googleads.v1.services.GetHotelPerformanceViewRequest;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Google Ads API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcHotelPerformanceViewServiceStub extends HotelPerformanceViewServiceStub {

  private static final MethodDescriptor<GetHotelPerformanceViewRequest, HotelPerformanceView>
      getHotelPerformanceViewMethodDescriptor =
          MethodDescriptor.<GetHotelPerformanceViewRequest, HotelPerformanceView>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.HotelPerformanceViewService/GetHotelPerformanceView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetHotelPerformanceViewRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(HotelPerformanceView.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetHotelPerformanceViewRequest, HotelPerformanceView>
      getHotelPerformanceViewCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcHotelPerformanceViewServiceStub create(
      HotelPerformanceViewServiceStubSettings settings) throws IOException {
    return new GrpcHotelPerformanceViewServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcHotelPerformanceViewServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcHotelPerformanceViewServiceStub(
        HotelPerformanceViewServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcHotelPerformanceViewServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcHotelPerformanceViewServiceStub(
        HotelPerformanceViewServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcHotelPerformanceViewServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcHotelPerformanceViewServiceStub(
      HotelPerformanceViewServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcHotelPerformanceViewServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcHotelPerformanceViewServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcHotelPerformanceViewServiceStub(
      HotelPerformanceViewServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetHotelPerformanceViewRequest, HotelPerformanceView>
        getHotelPerformanceViewTransportSettings =
            GrpcCallSettings.<GetHotelPerformanceViewRequest, HotelPerformanceView>newBuilder()
                .setMethodDescriptor(getHotelPerformanceViewMethodDescriptor)
                .build();

    this.getHotelPerformanceViewCallable =
        callableFactory.createUnaryCallable(
            getHotelPerformanceViewTransportSettings,
            settings.getHotelPerformanceViewSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetHotelPerformanceViewRequest, HotelPerformanceView>
      getHotelPerformanceViewCallable() {
    return getHotelPerformanceViewCallable;
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
