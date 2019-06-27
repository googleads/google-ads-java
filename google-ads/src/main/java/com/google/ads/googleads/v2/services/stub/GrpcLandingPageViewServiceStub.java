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
package com.google.ads.googleads.v2.services.stub;

import com.google.ads.googleads.v2.resources.LandingPageView;
import com.google.ads.googleads.v2.services.GetLandingPageViewRequest;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
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
public class GrpcLandingPageViewServiceStub extends LandingPageViewServiceStub {

  private static final MethodDescriptor<GetLandingPageViewRequest, LandingPageView>
      getLandingPageViewMethodDescriptor =
          MethodDescriptor.<GetLandingPageViewRequest, LandingPageView>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v2.services.LandingPageViewService/GetLandingPageView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetLandingPageViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(LandingPageView.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetLandingPageViewRequest, LandingPageView>
      getLandingPageViewCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcLandingPageViewServiceStub create(
      LandingPageViewServiceStubSettings settings) throws IOException {
    return new GrpcLandingPageViewServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcLandingPageViewServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcLandingPageViewServiceStub(
        LandingPageViewServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcLandingPageViewServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcLandingPageViewServiceStub(
        LandingPageViewServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcLandingPageViewServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcLandingPageViewServiceStub(
      LandingPageViewServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcLandingPageViewServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcLandingPageViewServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcLandingPageViewServiceStub(
      LandingPageViewServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetLandingPageViewRequest, LandingPageView>
        getLandingPageViewTransportSettings =
            GrpcCallSettings.<GetLandingPageViewRequest, LandingPageView>newBuilder()
                .setMethodDescriptor(getLandingPageViewMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetLandingPageViewRequest>() {
                      @Override
                      public Map<String, String> extract(GetLandingPageViewRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();

    this.getLandingPageViewCallable =
        callableFactory.createUnaryCallable(
            getLandingPageViewTransportSettings,
            settings.getLandingPageViewSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetLandingPageViewRequest, LandingPageView> getLandingPageViewCallable() {
    return getLandingPageViewCallable;
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
