/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services.stub;

import com.google.ads.googleads.v6.resources.FeedItemTarget;
import com.google.ads.googleads.v6.services.GetFeedItemTargetRequest;
import com.google.ads.googleads.v6.services.MutateFeedItemTargetsRequest;
import com.google.ads.googleads.v6.services.MutateFeedItemTargetsResponse;
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
 * gRPC stub implementation for the FeedItemTargetService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcFeedItemTargetServiceStub extends FeedItemTargetServiceStub {
  private static final MethodDescriptor<GetFeedItemTargetRequest, FeedItemTarget>
      getFeedItemTargetMethodDescriptor =
          MethodDescriptor.<GetFeedItemTargetRequest, FeedItemTarget>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.FeedItemTargetService/GetFeedItemTarget")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetFeedItemTargetRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(FeedItemTarget.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateFeedItemTargetsRequest, MutateFeedItemTargetsResponse>
      mutateFeedItemTargetsMethodDescriptor =
          MethodDescriptor.<MutateFeedItemTargetsRequest, MutateFeedItemTargetsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.FeedItemTargetService/MutateFeedItemTargets")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateFeedItemTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateFeedItemTargetsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetFeedItemTargetRequest, FeedItemTarget> getFeedItemTargetCallable;
  private final UnaryCallable<MutateFeedItemTargetsRequest, MutateFeedItemTargetsResponse>
      mutateFeedItemTargetsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcFeedItemTargetServiceStub create(
      FeedItemTargetServiceStubSettings settings) throws IOException {
    return new GrpcFeedItemTargetServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcFeedItemTargetServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcFeedItemTargetServiceStub(
        FeedItemTargetServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcFeedItemTargetServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcFeedItemTargetServiceStub(
        FeedItemTargetServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcFeedItemTargetServiceStub(
      FeedItemTargetServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcFeedItemTargetServiceCallableFactory());
  }

  protected GrpcFeedItemTargetServiceStub(
      FeedItemTargetServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetFeedItemTargetRequest, FeedItemTarget> getFeedItemTargetTransportSettings =
        GrpcCallSettings.<GetFeedItemTargetRequest, FeedItemTarget>newBuilder()
            .setMethodDescriptor(getFeedItemTargetMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetFeedItemTargetRequest>() {
                  @Override
                  public Map<String, String> extract(GetFeedItemTargetRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateFeedItemTargetsRequest, MutateFeedItemTargetsResponse>
        mutateFeedItemTargetsTransportSettings =
            GrpcCallSettings
                .<MutateFeedItemTargetsRequest, MutateFeedItemTargetsResponse>newBuilder()
                .setMethodDescriptor(mutateFeedItemTargetsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateFeedItemTargetsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateFeedItemTargetsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getFeedItemTargetCallable =
        callableFactory.createUnaryCallable(
            getFeedItemTargetTransportSettings,
            settings.getFeedItemTargetSettings(),
            clientContext);
    this.mutateFeedItemTargetsCallable =
        callableFactory.createUnaryCallable(
            mutateFeedItemTargetsTransportSettings,
            settings.mutateFeedItemTargetsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetFeedItemTargetRequest, FeedItemTarget> getFeedItemTargetCallable() {
    return getFeedItemTargetCallable;
  }

  public UnaryCallable<MutateFeedItemTargetsRequest, MutateFeedItemTargetsResponse>
      mutateFeedItemTargetsCallable() {
    return mutateFeedItemTargetsCallable;
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
