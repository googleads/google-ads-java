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

import com.google.ads.googleads.v1.resources.FeedPlaceholderView;
import com.google.ads.googleads.v1.services.GetFeedPlaceholderViewRequest;
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
public class GrpcFeedPlaceholderViewServiceStub extends FeedPlaceholderViewServiceStub {

  private static final MethodDescriptor<GetFeedPlaceholderViewRequest, FeedPlaceholderView>
      getFeedPlaceholderViewMethodDescriptor =
          MethodDescriptor.<GetFeedPlaceholderViewRequest, FeedPlaceholderView>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.FeedPlaceholderViewService/GetFeedPlaceholderView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetFeedPlaceholderViewRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(FeedPlaceholderView.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetFeedPlaceholderViewRequest, FeedPlaceholderView>
      getFeedPlaceholderViewCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcFeedPlaceholderViewServiceStub create(
      FeedPlaceholderViewServiceStubSettings settings) throws IOException {
    return new GrpcFeedPlaceholderViewServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcFeedPlaceholderViewServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcFeedPlaceholderViewServiceStub(
        FeedPlaceholderViewServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcFeedPlaceholderViewServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcFeedPlaceholderViewServiceStub(
        FeedPlaceholderViewServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcFeedPlaceholderViewServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcFeedPlaceholderViewServiceStub(
      FeedPlaceholderViewServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcFeedPlaceholderViewServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcFeedPlaceholderViewServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcFeedPlaceholderViewServiceStub(
      FeedPlaceholderViewServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetFeedPlaceholderViewRequest, FeedPlaceholderView>
        getFeedPlaceholderViewTransportSettings =
            GrpcCallSettings.<GetFeedPlaceholderViewRequest, FeedPlaceholderView>newBuilder()
                .setMethodDescriptor(getFeedPlaceholderViewMethodDescriptor)
                .build();

    this.getFeedPlaceholderViewCallable =
        callableFactory.createUnaryCallable(
            getFeedPlaceholderViewTransportSettings,
            settings.getFeedPlaceholderViewSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetFeedPlaceholderViewRequest, FeedPlaceholderView>
      getFeedPlaceholderViewCallable() {
    return getFeedPlaceholderViewCallable;
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
