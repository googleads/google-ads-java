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

import com.google.ads.googleads.v3.resources.FeedItem;
import com.google.ads.googleads.v3.services.GetFeedItemRequest;
import com.google.ads.googleads.v3.services.MutateFeedItemsRequest;
import com.google.ads.googleads.v3.services.MutateFeedItemsResponse;
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
public class GrpcFeedItemServiceStub extends FeedItemServiceStub {

  private static final MethodDescriptor<GetFeedItemRequest, FeedItem> getFeedItemMethodDescriptor =
      MethodDescriptor.<GetFeedItemRequest, FeedItem>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.ads.googleads.v3.services.FeedItemService/GetFeedItem")
          .setRequestMarshaller(ProtoUtils.marshaller(GetFeedItemRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(FeedItem.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<MutateFeedItemsRequest, MutateFeedItemsResponse>
      mutateFeedItemsMethodDescriptor =
          MethodDescriptor.<MutateFeedItemsRequest, MutateFeedItemsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v3.services.FeedItemService/MutateFeedItems")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateFeedItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateFeedItemsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetFeedItemRequest, FeedItem> getFeedItemCallable;
  private final UnaryCallable<MutateFeedItemsRequest, MutateFeedItemsResponse>
      mutateFeedItemsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcFeedItemServiceStub create(FeedItemServiceStubSettings settings)
      throws IOException {
    return new GrpcFeedItemServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcFeedItemServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcFeedItemServiceStub(
        FeedItemServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcFeedItemServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcFeedItemServiceStub(
        FeedItemServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcFeedItemServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcFeedItemServiceStub(
      FeedItemServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcFeedItemServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcFeedItemServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcFeedItemServiceStub(
      FeedItemServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetFeedItemRequest, FeedItem> getFeedItemTransportSettings =
        GrpcCallSettings.<GetFeedItemRequest, FeedItem>newBuilder()
            .setMethodDescriptor(getFeedItemMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetFeedItemRequest>() {
                  @Override
                  public Map<String, String> extract(GetFeedItemRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateFeedItemsRequest, MutateFeedItemsResponse>
        mutateFeedItemsTransportSettings =
            GrpcCallSettings.<MutateFeedItemsRequest, MutateFeedItemsResponse>newBuilder()
                .setMethodDescriptor(mutateFeedItemsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateFeedItemsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateFeedItemsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getFeedItemCallable =
        callableFactory.createUnaryCallable(
            getFeedItemTransportSettings, settings.getFeedItemSettings(), clientContext);
    this.mutateFeedItemsCallable =
        callableFactory.createUnaryCallable(
            mutateFeedItemsTransportSettings, settings.mutateFeedItemsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetFeedItemRequest, FeedItem> getFeedItemCallable() {
    return getFeedItemCallable;
  }

  public UnaryCallable<MutateFeedItemsRequest, MutateFeedItemsResponse> mutateFeedItemsCallable() {
    return mutateFeedItemsCallable;
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
