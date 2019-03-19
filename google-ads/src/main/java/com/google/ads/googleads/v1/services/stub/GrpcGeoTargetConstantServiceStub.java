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

import com.google.ads.googleads.v1.resources.GeoTargetConstant;
import com.google.ads.googleads.v1.services.GetGeoTargetConstantRequest;
import com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsRequest;
import com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse;
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
public class GrpcGeoTargetConstantServiceStub extends GeoTargetConstantServiceStub {

  private static final MethodDescriptor<GetGeoTargetConstantRequest, GeoTargetConstant>
      getGeoTargetConstantMethodDescriptor =
          MethodDescriptor.<GetGeoTargetConstantRequest, GeoTargetConstant>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.GeoTargetConstantService/GetGeoTargetConstant")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetGeoTargetConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(GeoTargetConstant.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          SuggestGeoTargetConstantsRequest, SuggestGeoTargetConstantsResponse>
      suggestGeoTargetConstantsMethodDescriptor =
          MethodDescriptor
              .<SuggestGeoTargetConstantsRequest, SuggestGeoTargetConstantsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.GeoTargetConstantService/SuggestGeoTargetConstants")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SuggestGeoTargetConstantsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SuggestGeoTargetConstantsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetGeoTargetConstantRequest, GeoTargetConstant>
      getGeoTargetConstantCallable;
  private final UnaryCallable<SuggestGeoTargetConstantsRequest, SuggestGeoTargetConstantsResponse>
      suggestGeoTargetConstantsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcGeoTargetConstantServiceStub create(
      GeoTargetConstantServiceStubSettings settings) throws IOException {
    return new GrpcGeoTargetConstantServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcGeoTargetConstantServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcGeoTargetConstantServiceStub(
        GeoTargetConstantServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcGeoTargetConstantServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcGeoTargetConstantServiceStub(
        GeoTargetConstantServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcGeoTargetConstantServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcGeoTargetConstantServiceStub(
      GeoTargetConstantServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcGeoTargetConstantServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcGeoTargetConstantServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcGeoTargetConstantServiceStub(
      GeoTargetConstantServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetGeoTargetConstantRequest, GeoTargetConstant>
        getGeoTargetConstantTransportSettings =
            GrpcCallSettings.<GetGeoTargetConstantRequest, GeoTargetConstant>newBuilder()
                .setMethodDescriptor(getGeoTargetConstantMethodDescriptor)
                .build();
    GrpcCallSettings<SuggestGeoTargetConstantsRequest, SuggestGeoTargetConstantsResponse>
        suggestGeoTargetConstantsTransportSettings =
            GrpcCallSettings
                .<SuggestGeoTargetConstantsRequest, SuggestGeoTargetConstantsResponse>newBuilder()
                .setMethodDescriptor(suggestGeoTargetConstantsMethodDescriptor)
                .build();

    this.getGeoTargetConstantCallable =
        callableFactory.createUnaryCallable(
            getGeoTargetConstantTransportSettings,
            settings.getGeoTargetConstantSettings(),
            clientContext);
    this.suggestGeoTargetConstantsCallable =
        callableFactory.createUnaryCallable(
            suggestGeoTargetConstantsTransportSettings,
            settings.suggestGeoTargetConstantsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetGeoTargetConstantRequest, GeoTargetConstant>
      getGeoTargetConstantCallable() {
    return getGeoTargetConstantCallable;
  }

  public UnaryCallable<SuggestGeoTargetConstantsRequest, SuggestGeoTargetConstantsResponse>
      suggestGeoTargetConstantsCallable() {
    return suggestGeoTargetConstantsCallable;
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
