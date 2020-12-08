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

import com.google.ads.googleads.v6.resources.AdGroupFeed;
import com.google.ads.googleads.v6.services.GetAdGroupFeedRequest;
import com.google.ads.googleads.v6.services.MutateAdGroupFeedsRequest;
import com.google.ads.googleads.v6.services.MutateAdGroupFeedsResponse;
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
 * gRPC stub implementation for the AdGroupFeedService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcAdGroupFeedServiceStub extends AdGroupFeedServiceStub {
  private static final MethodDescriptor<GetAdGroupFeedRequest, AdGroupFeed>
      getAdGroupFeedMethodDescriptor =
          MethodDescriptor.<GetAdGroupFeedRequest, AdGroupFeed>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.AdGroupFeedService/GetAdGroupFeed")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAdGroupFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AdGroupFeed.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateAdGroupFeedsRequest, MutateAdGroupFeedsResponse>
      mutateAdGroupFeedsMethodDescriptor =
          MethodDescriptor.<MutateAdGroupFeedsRequest, MutateAdGroupFeedsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.AdGroupFeedService/MutateAdGroupFeeds")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupFeedsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetAdGroupFeedRequest, AdGroupFeed> getAdGroupFeedCallable;
  private final UnaryCallable<MutateAdGroupFeedsRequest, MutateAdGroupFeedsResponse>
      mutateAdGroupFeedsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
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

  protected GrpcAdGroupFeedServiceStub(
      AdGroupFeedServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcAdGroupFeedServiceCallableFactory());
  }

  protected GrpcAdGroupFeedServiceStub(
      AdGroupFeedServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetAdGroupFeedRequest, AdGroupFeed> getAdGroupFeedTransportSettings =
        GrpcCallSettings.<GetAdGroupFeedRequest, AdGroupFeed>newBuilder()
            .setMethodDescriptor(getAdGroupFeedMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetAdGroupFeedRequest>() {
                  @Override
                  public Map<String, String> extract(GetAdGroupFeedRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateAdGroupFeedsRequest, MutateAdGroupFeedsResponse>
        mutateAdGroupFeedsTransportSettings =
            GrpcCallSettings.<MutateAdGroupFeedsRequest, MutateAdGroupFeedsResponse>newBuilder()
                .setMethodDescriptor(mutateAdGroupFeedsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateAdGroupFeedsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateAdGroupFeedsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getAdGroupFeedCallable =
        callableFactory.createUnaryCallable(
            getAdGroupFeedTransportSettings, settings.getAdGroupFeedSettings(), clientContext);
    this.mutateAdGroupFeedsCallable =
        callableFactory.createUnaryCallable(
            mutateAdGroupFeedsTransportSettings,
            settings.mutateAdGroupFeedsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
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
