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

import com.google.ads.googleads.v1.resources.CustomInterest;
import com.google.ads.googleads.v1.services.GetCustomInterestRequest;
import com.google.ads.googleads.v1.services.MutateCustomInterestsRequest;
import com.google.ads.googleads.v1.services.MutateCustomInterestsResponse;
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
public class GrpcCustomInterestServiceStub extends CustomInterestServiceStub {

  private static final MethodDescriptor<GetCustomInterestRequest, CustomInterest>
      getCustomInterestMethodDescriptor =
          MethodDescriptor.<GetCustomInterestRequest, CustomInterest>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.CustomInterestService/GetCustomInterest")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCustomInterestRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomInterest.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<MutateCustomInterestsRequest, MutateCustomInterestsResponse>
      mutateCustomInterestsMethodDescriptor =
          MethodDescriptor.<MutateCustomInterestsRequest, MutateCustomInterestsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.CustomInterestService/MutateCustomInterests")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomInterestsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCustomInterestsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetCustomInterestRequest, CustomInterest> getCustomInterestCallable;
  private final UnaryCallable<MutateCustomInterestsRequest, MutateCustomInterestsResponse>
      mutateCustomInterestsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomInterestServiceStub create(
      CustomInterestServiceStubSettings settings) throws IOException {
    return new GrpcCustomInterestServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCustomInterestServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCustomInterestServiceStub(
        CustomInterestServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomInterestServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomInterestServiceStub(
        CustomInterestServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCustomInterestServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomInterestServiceStub(
      CustomInterestServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCustomInterestServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomInterestServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomInterestServiceStub(
      CustomInterestServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetCustomInterestRequest, CustomInterest> getCustomInterestTransportSettings =
        GrpcCallSettings.<GetCustomInterestRequest, CustomInterest>newBuilder()
            .setMethodDescriptor(getCustomInterestMethodDescriptor)
            .build();
    GrpcCallSettings<MutateCustomInterestsRequest, MutateCustomInterestsResponse>
        mutateCustomInterestsTransportSettings =
            GrpcCallSettings
                .<MutateCustomInterestsRequest, MutateCustomInterestsResponse>newBuilder()
                .setMethodDescriptor(mutateCustomInterestsMethodDescriptor)
                .build();

    this.getCustomInterestCallable =
        callableFactory.createUnaryCallable(
            getCustomInterestTransportSettings,
            settings.getCustomInterestSettings(),
            clientContext);
    this.mutateCustomInterestsCallable =
        callableFactory.createUnaryCallable(
            mutateCustomInterestsTransportSettings,
            settings.mutateCustomInterestsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetCustomInterestRequest, CustomInterest> getCustomInterestCallable() {
    return getCustomInterestCallable;
  }

  public UnaryCallable<MutateCustomInterestsRequest, MutateCustomInterestsResponse>
      mutateCustomInterestsCallable() {
    return mutateCustomInterestsCallable;
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
