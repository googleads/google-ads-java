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

import com.google.ads.googleads.v1.resources.Feed;
import com.google.ads.googleads.v1.services.GetFeedRequest;
import com.google.ads.googleads.v1.services.MutateFeedsRequest;
import com.google.ads.googleads.v1.services.MutateFeedsResponse;
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
public class GrpcFeedServiceStub extends FeedServiceStub {

  private static final MethodDescriptor<GetFeedRequest, Feed> getFeedMethodDescriptor =
      MethodDescriptor.<GetFeedRequest, Feed>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.ads.googleads.v1.services.FeedService/GetFeed")
          .setRequestMarshaller(ProtoUtils.marshaller(GetFeedRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Feed.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<MutateFeedsRequest, MutateFeedsResponse>
      mutateFeedsMethodDescriptor =
          MethodDescriptor.<MutateFeedsRequest, MutateFeedsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v1.services.FeedService/MutateFeeds")
              .setRequestMarshaller(ProtoUtils.marshaller(MutateFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateFeedsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetFeedRequest, Feed> getFeedCallable;
  private final UnaryCallable<MutateFeedsRequest, MutateFeedsResponse> mutateFeedsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcFeedServiceStub create(FeedServiceStubSettings settings)
      throws IOException {
    return new GrpcFeedServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcFeedServiceStub create(ClientContext clientContext) throws IOException {
    return new GrpcFeedServiceStub(FeedServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcFeedServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcFeedServiceStub(
        FeedServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcFeedServiceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcFeedServiceStub(FeedServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcFeedServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcFeedServiceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcFeedServiceStub(
      FeedServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetFeedRequest, Feed> getFeedTransportSettings =
        GrpcCallSettings.<GetFeedRequest, Feed>newBuilder()
            .setMethodDescriptor(getFeedMethodDescriptor)
            .build();
    GrpcCallSettings<MutateFeedsRequest, MutateFeedsResponse> mutateFeedsTransportSettings =
        GrpcCallSettings.<MutateFeedsRequest, MutateFeedsResponse>newBuilder()
            .setMethodDescriptor(mutateFeedsMethodDescriptor)
            .build();

    this.getFeedCallable =
        callableFactory.createUnaryCallable(
            getFeedTransportSettings, settings.getFeedSettings(), clientContext);
    this.mutateFeedsCallable =
        callableFactory.createUnaryCallable(
            mutateFeedsTransportSettings, settings.mutateFeedsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetFeedRequest, Feed> getFeedCallable() {
    return getFeedCallable;
  }

  public UnaryCallable<MutateFeedsRequest, MutateFeedsResponse> mutateFeedsCallable() {
    return mutateFeedsCallable;
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
