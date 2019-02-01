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
package com.google.ads.googleads.v0.services.stub;

import com.google.ads.googleads.v0.resources.GenderView;
import com.google.ads.googleads.v0.services.GetGenderViewRequest;
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
public class GrpcGenderViewServiceStub extends GenderViewServiceStub {

  private static final MethodDescriptor<GetGenderViewRequest, GenderView>
      getGenderViewMethodDescriptor =
          MethodDescriptor.<GetGenderViewRequest, GenderView>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v0.services.GenderViewService/GetGenderView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetGenderViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(GenderView.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetGenderViewRequest, GenderView> getGenderViewCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcGenderViewServiceStub create(GenderViewServiceStubSettings settings)
      throws IOException {
    return new GrpcGenderViewServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcGenderViewServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcGenderViewServiceStub(
        GenderViewServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcGenderViewServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcGenderViewServiceStub(
        GenderViewServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcGenderViewServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcGenderViewServiceStub(
      GenderViewServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcGenderViewServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcGenderViewServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcGenderViewServiceStub(
      GenderViewServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetGenderViewRequest, GenderView> getGenderViewTransportSettings =
        GrpcCallSettings.<GetGenderViewRequest, GenderView>newBuilder()
            .setMethodDescriptor(getGenderViewMethodDescriptor)
            .build();

    this.getGenderViewCallable =
        callableFactory.createUnaryCallable(
            getGenderViewTransportSettings, settings.getGenderViewSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetGenderViewRequest, GenderView> getGenderViewCallable() {
    return getGenderViewCallable;
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
