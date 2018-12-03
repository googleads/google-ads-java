/*
 * Copyright 2018 Google LLC
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

import com.google.ads.googleads.v0.resources.CustomerFeed;
import com.google.ads.googleads.v0.services.GetCustomerFeedRequest;
import com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest;
import com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse;
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
public class GrpcCustomerFeedServiceStub extends CustomerFeedServiceStub {

  private static final MethodDescriptor<GetCustomerFeedRequest, CustomerFeed>
      getCustomerFeedMethodDescriptor =
          MethodDescriptor.<GetCustomerFeedRequest, CustomerFeed>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v0.services.CustomerFeedService/GetCustomerFeed")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCustomerFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomerFeed.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<MutateCustomerFeedsRequest, MutateCustomerFeedsResponse>
      mutateCustomerFeedsMethodDescriptor =
          MethodDescriptor.<MutateCustomerFeedsRequest, MutateCustomerFeedsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v0.services.CustomerFeedService/MutateCustomerFeeds")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomerFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCustomerFeedsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetCustomerFeedRequest, CustomerFeed> getCustomerFeedCallable;
  private final UnaryCallable<MutateCustomerFeedsRequest, MutateCustomerFeedsResponse>
      mutateCustomerFeedsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomerFeedServiceStub create(CustomerFeedServiceStubSettings settings)
      throws IOException {
    return new GrpcCustomerFeedServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCustomerFeedServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCustomerFeedServiceStub(
        CustomerFeedServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomerFeedServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomerFeedServiceStub(
        CustomerFeedServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCustomerFeedServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerFeedServiceStub(
      CustomerFeedServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCustomerFeedServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomerFeedServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerFeedServiceStub(
      CustomerFeedServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetCustomerFeedRequest, CustomerFeed> getCustomerFeedTransportSettings =
        GrpcCallSettings.<GetCustomerFeedRequest, CustomerFeed>newBuilder()
            .setMethodDescriptor(getCustomerFeedMethodDescriptor)
            .build();
    GrpcCallSettings<MutateCustomerFeedsRequest, MutateCustomerFeedsResponse>
        mutateCustomerFeedsTransportSettings =
            GrpcCallSettings.<MutateCustomerFeedsRequest, MutateCustomerFeedsResponse>newBuilder()
                .setMethodDescriptor(mutateCustomerFeedsMethodDescriptor)
                .build();

    this.getCustomerFeedCallable =
        callableFactory.createUnaryCallable(
            getCustomerFeedTransportSettings, settings.getCustomerFeedSettings(), clientContext);
    this.mutateCustomerFeedsCallable =
        callableFactory.createUnaryCallable(
            mutateCustomerFeedsTransportSettings,
            settings.mutateCustomerFeedsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetCustomerFeedRequest, CustomerFeed> getCustomerFeedCallable() {
    return getCustomerFeedCallable;
  }

  public UnaryCallable<MutateCustomerFeedsRequest, MutateCustomerFeedsResponse>
      mutateCustomerFeedsCallable() {
    return mutateCustomerFeedsCallable;
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
