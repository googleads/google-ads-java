/*
 * Copyright 2020 Google LLC
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
package com.google.ads.googleads.v3.services.stub;

import com.google.ads.googleads.v3.resources.GroupPlacementView;
import com.google.ads.googleads.v3.services.GetGroupPlacementViewRequest;
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
public class GrpcGroupPlacementViewServiceStub extends GroupPlacementViewServiceStub {

  private static final MethodDescriptor<GetGroupPlacementViewRequest, GroupPlacementView>
      getGroupPlacementViewMethodDescriptor =
          MethodDescriptor.<GetGroupPlacementViewRequest, GroupPlacementView>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v3.services.GroupPlacementViewService/GetGroupPlacementView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetGroupPlacementViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(GroupPlacementView.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetGroupPlacementViewRequest, GroupPlacementView>
      getGroupPlacementViewCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcGroupPlacementViewServiceStub create(
      GroupPlacementViewServiceStubSettings settings) throws IOException {
    return new GrpcGroupPlacementViewServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcGroupPlacementViewServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcGroupPlacementViewServiceStub(
        GroupPlacementViewServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcGroupPlacementViewServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcGroupPlacementViewServiceStub(
        GroupPlacementViewServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcGroupPlacementViewServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcGroupPlacementViewServiceStub(
      GroupPlacementViewServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcGroupPlacementViewServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcGroupPlacementViewServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcGroupPlacementViewServiceStub(
      GroupPlacementViewServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetGroupPlacementViewRequest, GroupPlacementView>
        getGroupPlacementViewTransportSettings =
            GrpcCallSettings.<GetGroupPlacementViewRequest, GroupPlacementView>newBuilder()
                .setMethodDescriptor(getGroupPlacementViewMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetGroupPlacementViewRequest>() {
                      @Override
                      public Map<String, String> extract(GetGroupPlacementViewRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();

    this.getGroupPlacementViewCallable =
        callableFactory.createUnaryCallable(
            getGroupPlacementViewTransportSettings,
            settings.getGroupPlacementViewSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetGroupPlacementViewRequest, GroupPlacementView>
      getGroupPlacementViewCallable() {
    return getGroupPlacementViewCallable;
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
