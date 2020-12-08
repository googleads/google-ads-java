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

import com.google.ads.googleads.v6.resources.CustomerFeed;
import com.google.ads.googleads.v6.services.GetCustomerFeedRequest;
import com.google.ads.googleads.v6.services.MutateCustomerFeedsRequest;
import com.google.ads.googleads.v6.services.MutateCustomerFeedsResponse;
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
 * gRPC stub implementation for the CustomerFeedService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCustomerFeedServiceStub extends CustomerFeedServiceStub {
  private static final MethodDescriptor<GetCustomerFeedRequest, CustomerFeed>
      getCustomerFeedMethodDescriptor =
          MethodDescriptor.<GetCustomerFeedRequest, CustomerFeed>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CustomerFeedService/GetCustomerFeed")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCustomerFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomerFeed.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateCustomerFeedsRequest, MutateCustomerFeedsResponse>
      mutateCustomerFeedsMethodDescriptor =
          MethodDescriptor.<MutateCustomerFeedsRequest, MutateCustomerFeedsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CustomerFeedService/MutateCustomerFeeds")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomerFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCustomerFeedsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetCustomerFeedRequest, CustomerFeed> getCustomerFeedCallable;
  private final UnaryCallable<MutateCustomerFeedsRequest, MutateCustomerFeedsResponse>
      mutateCustomerFeedsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
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

  protected GrpcCustomerFeedServiceStub(
      CustomerFeedServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCustomerFeedServiceCallableFactory());
  }

  protected GrpcCustomerFeedServiceStub(
      CustomerFeedServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetCustomerFeedRequest, CustomerFeed> getCustomerFeedTransportSettings =
        GrpcCallSettings.<GetCustomerFeedRequest, CustomerFeed>newBuilder()
            .setMethodDescriptor(getCustomerFeedMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetCustomerFeedRequest>() {
                  @Override
                  public Map<String, String> extract(GetCustomerFeedRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateCustomerFeedsRequest, MutateCustomerFeedsResponse>
        mutateCustomerFeedsTransportSettings =
            GrpcCallSettings.<MutateCustomerFeedsRequest, MutateCustomerFeedsResponse>newBuilder()
                .setMethodDescriptor(mutateCustomerFeedsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCustomerFeedsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateCustomerFeedsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCustomerFeedCallable =
        callableFactory.createUnaryCallable(
            getCustomerFeedTransportSettings, settings.getCustomerFeedSettings(), clientContext);
    this.mutateCustomerFeedsCallable =
        callableFactory.createUnaryCallable(
            mutateCustomerFeedsTransportSettings,
            settings.mutateCustomerFeedsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
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
