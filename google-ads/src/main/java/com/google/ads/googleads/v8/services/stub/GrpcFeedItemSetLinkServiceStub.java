/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v8.services.stub;

import com.google.ads.googleads.v8.resources.FeedItemSetLink;
import com.google.ads.googleads.v8.services.GetFeedItemSetLinkRequest;
import com.google.ads.googleads.v8.services.MutateFeedItemSetLinksRequest;
import com.google.ads.googleads.v8.services.MutateFeedItemSetLinksResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the FeedItemSetLinkService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcFeedItemSetLinkServiceStub extends FeedItemSetLinkServiceStub {
  private static final MethodDescriptor<GetFeedItemSetLinkRequest, FeedItemSetLink>
      getFeedItemSetLinkMethodDescriptor =
          MethodDescriptor.<GetFeedItemSetLinkRequest, FeedItemSetLink>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v8.services.FeedItemSetLinkService/GetFeedItemSetLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetFeedItemSetLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(FeedItemSetLink.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateFeedItemSetLinksRequest, MutateFeedItemSetLinksResponse>
      mutateFeedItemSetLinksMethodDescriptor =
          MethodDescriptor
              .<MutateFeedItemSetLinksRequest, MutateFeedItemSetLinksResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v8.services.FeedItemSetLinkService/MutateFeedItemSetLinks")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateFeedItemSetLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateFeedItemSetLinksResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetFeedItemSetLinkRequest, FeedItemSetLink>
      getFeedItemSetLinkCallable;
  private final UnaryCallable<MutateFeedItemSetLinksRequest, MutateFeedItemSetLinksResponse>
      mutateFeedItemSetLinksCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcFeedItemSetLinkServiceStub create(
      FeedItemSetLinkServiceStubSettings settings) throws IOException {
    return new GrpcFeedItemSetLinkServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcFeedItemSetLinkServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcFeedItemSetLinkServiceStub(
        FeedItemSetLinkServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcFeedItemSetLinkServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcFeedItemSetLinkServiceStub(
        FeedItemSetLinkServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcFeedItemSetLinkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcFeedItemSetLinkServiceStub(
      FeedItemSetLinkServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcFeedItemSetLinkServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcFeedItemSetLinkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcFeedItemSetLinkServiceStub(
      FeedItemSetLinkServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetFeedItemSetLinkRequest, FeedItemSetLink>
        getFeedItemSetLinkTransportSettings =
            GrpcCallSettings.<GetFeedItemSetLinkRequest, FeedItemSetLink>newBuilder()
                .setMethodDescriptor(getFeedItemSetLinkMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetFeedItemSetLinkRequest>() {
                      @Override
                      public Map<String, String> extract(GetFeedItemSetLinkRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateFeedItemSetLinksRequest, MutateFeedItemSetLinksResponse>
        mutateFeedItemSetLinksTransportSettings =
            GrpcCallSettings
                .<MutateFeedItemSetLinksRequest, MutateFeedItemSetLinksResponse>newBuilder()
                .setMethodDescriptor(mutateFeedItemSetLinksMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateFeedItemSetLinksRequest>() {
                      @Override
                      public Map<String, String> extract(MutateFeedItemSetLinksRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getFeedItemSetLinkCallable =
        callableFactory.createUnaryCallable(
            getFeedItemSetLinkTransportSettings,
            settings.getFeedItemSetLinkSettings(),
            clientContext);
    this.mutateFeedItemSetLinksCallable =
        callableFactory.createUnaryCallable(
            mutateFeedItemSetLinksTransportSettings,
            settings.mutateFeedItemSetLinksSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetFeedItemSetLinkRequest, FeedItemSetLink> getFeedItemSetLinkCallable() {
    return getFeedItemSetLinkCallable;
  }

  @Override
  public UnaryCallable<MutateFeedItemSetLinksRequest, MutateFeedItemSetLinksResponse>
      mutateFeedItemSetLinksCallable() {
    return mutateFeedItemSetLinksCallable;
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
