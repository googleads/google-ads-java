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

import com.google.ads.googleads.v1.resources.AgeRangeView;
import com.google.ads.googleads.v1.services.GetAgeRangeViewRequest;
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
public class GrpcAgeRangeViewServiceStub extends AgeRangeViewServiceStub {

  private static final MethodDescriptor<GetAgeRangeViewRequest, AgeRangeView>
      getAgeRangeViewMethodDescriptor =
          MethodDescriptor.<GetAgeRangeViewRequest, AgeRangeView>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.AgeRangeViewService/GetAgeRangeView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAgeRangeViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AgeRangeView.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetAgeRangeViewRequest, AgeRangeView> getAgeRangeViewCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAgeRangeViewServiceStub create(AgeRangeViewServiceStubSettings settings)
      throws IOException {
    return new GrpcAgeRangeViewServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAgeRangeViewServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAgeRangeViewServiceStub(
        AgeRangeViewServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAgeRangeViewServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAgeRangeViewServiceStub(
        AgeRangeViewServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAgeRangeViewServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAgeRangeViewServiceStub(
      AgeRangeViewServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcAgeRangeViewServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAgeRangeViewServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAgeRangeViewServiceStub(
      AgeRangeViewServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetAgeRangeViewRequest, AgeRangeView> getAgeRangeViewTransportSettings =
        GrpcCallSettings.<GetAgeRangeViewRequest, AgeRangeView>newBuilder()
            .setMethodDescriptor(getAgeRangeViewMethodDescriptor)
            .build();

    this.getAgeRangeViewCallable =
        callableFactory.createUnaryCallable(
            getAgeRangeViewTransportSettings, settings.getAgeRangeViewSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetAgeRangeViewRequest, AgeRangeView> getAgeRangeViewCallable() {
    return getAgeRangeViewCallable;
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
