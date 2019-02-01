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

import com.google.ads.googleads.v0.resources.AdGroupFeed;
import com.google.ads.googleads.v0.services.GetAdGroupFeedRequest;
import com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest;
import com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse;
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
public class GrpcAdGroupFeedServiceStub extends AdGroupFeedServiceStub {

  private static final MethodDescriptor<GetAdGroupFeedRequest, AdGroupFeed>
      getAdGroupFeedMethodDescriptor =
          MethodDescriptor.<GetAdGroupFeedRequest, AdGroupFeed>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v0.services.AdGroupFeedService/GetAdGroupFeed")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAdGroupFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AdGroupFeed.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<MutateAdGroupFeedsRequest, MutateAdGroupFeedsResponse>
      mutateAdGroupFeedsMethodDescriptor =
          MethodDescriptor.<MutateAdGroupFeedsRequest, MutateAdGroupFeedsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v0.services.AdGroupFeedService/MutateAdGroupFeeds")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupFeedsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetAdGroupFeedRequest, AdGroupFeed> getAdGroupFeedCallable;
  private final UnaryCallable<MutateAdGroupFeedsRequest, MutateAdGroupFeedsResponse>
      mutateAdGroupFeedsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAdGroupFeedServiceStub create(AdGroupFeedServiceStubSettings settings)
      throws IOException {
    return new GrpcAdGroupFeedServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAdGroupFeedServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAdGroupFeedServiceStub(
        AdGroupFeedServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAdGroupFeedServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAdGroupFeedServiceStub(
        AdGroupFeedServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAdGroupFeedServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAdGroupFeedServiceStub(
      AdGroupFeedServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcAdGroupFeedServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAdGroupFeedServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAdGroupFeedServiceStub(
      AdGroupFeedServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetAdGroupFeedRequest, AdGroupFeed> getAdGroupFeedTransportSettings =
        GrpcCallSettings.<GetAdGroupFeedRequest, AdGroupFeed>newBuilder()
            .setMethodDescriptor(getAdGroupFeedMethodDescriptor)
            .build();
    GrpcCallSettings<MutateAdGroupFeedsRequest, MutateAdGroupFeedsResponse>
        mutateAdGroupFeedsTransportSettings =
            GrpcCallSettings.<MutateAdGroupFeedsRequest, MutateAdGroupFeedsResponse>newBuilder()
                .setMethodDescriptor(mutateAdGroupFeedsMethodDescriptor)
                .build();

    this.getAdGroupFeedCallable =
        callableFactory.createUnaryCallable(
            getAdGroupFeedTransportSettings, settings.getAdGroupFeedSettings(), clientContext);
    this.mutateAdGroupFeedsCallable =
        callableFactory.createUnaryCallable(
            mutateAdGroupFeedsTransportSettings,
            settings.mutateAdGroupFeedsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetAdGroupFeedRequest, AdGroupFeed> getAdGroupFeedCallable() {
    return getAdGroupFeedCallable;
  }

  public UnaryCallable<MutateAdGroupFeedsRequest, MutateAdGroupFeedsResponse>
      mutateAdGroupFeedsCallable() {
    return mutateAdGroupFeedsCallable;
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
