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
package com.google.ads.googleads.v6.services.stub;

import com.google.ads.googleads.v6.resources.FeedItemSet;
import com.google.ads.googleads.v6.services.GetFeedItemSetRequest;
import com.google.ads.googleads.v6.services.MutateFeedItemSetsRequest;
import com.google.ads.googleads.v6.services.MutateFeedItemSetsResponse;
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
public class GrpcFeedItemSetServiceStub extends FeedItemSetServiceStub {

  private static final MethodDescriptor<GetFeedItemSetRequest, FeedItemSet>
      getFeedItemSetMethodDescriptor =
          MethodDescriptor.<GetFeedItemSetRequest, FeedItemSet>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.FeedItemSetService/GetFeedItemSet")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetFeedItemSetRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(FeedItemSet.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<MutateFeedItemSetsRequest, MutateFeedItemSetsResponse>
      mutateFeedItemSetsMethodDescriptor =
          MethodDescriptor.<MutateFeedItemSetsRequest, MutateFeedItemSetsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.FeedItemSetService/MutateFeedItemSets")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateFeedItemSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateFeedItemSetsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetFeedItemSetRequest, FeedItemSet> getFeedItemSetCallable;
  private final UnaryCallable<MutateFeedItemSetsRequest, MutateFeedItemSetsResponse>
      mutateFeedItemSetsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcFeedItemSetServiceStub create(FeedItemSetServiceStubSettings settings)
      throws IOException {
    return new GrpcFeedItemSetServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcFeedItemSetServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcFeedItemSetServiceStub(
        FeedItemSetServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcFeedItemSetServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcFeedItemSetServiceStub(
        FeedItemSetServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcFeedItemSetServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcFeedItemSetServiceStub(
      FeedItemSetServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcFeedItemSetServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcFeedItemSetServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcFeedItemSetServiceStub(
      FeedItemSetServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetFeedItemSetRequest, FeedItemSet> getFeedItemSetTransportSettings =
        GrpcCallSettings.<GetFeedItemSetRequest, FeedItemSet>newBuilder()
            .setMethodDescriptor(getFeedItemSetMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetFeedItemSetRequest>() {
                  @Override
                  public Map<String, String> extract(GetFeedItemSetRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateFeedItemSetsRequest, MutateFeedItemSetsResponse>
        mutateFeedItemSetsTransportSettings =
            GrpcCallSettings.<MutateFeedItemSetsRequest, MutateFeedItemSetsResponse>newBuilder()
                .setMethodDescriptor(mutateFeedItemSetsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateFeedItemSetsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateFeedItemSetsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getFeedItemSetCallable =
        callableFactory.createUnaryCallable(
            getFeedItemSetTransportSettings, settings.getFeedItemSetSettings(), clientContext);
    this.mutateFeedItemSetsCallable =
        callableFactory.createUnaryCallable(
            mutateFeedItemSetsTransportSettings,
            settings.mutateFeedItemSetsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetFeedItemSetRequest, FeedItemSet> getFeedItemSetCallable() {
    return getFeedItemSetCallable;
  }

  public UnaryCallable<MutateFeedItemSetsRequest, MutateFeedItemSetsResponse>
      mutateFeedItemSetsCallable() {
    return mutateFeedItemSetsCallable;
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
