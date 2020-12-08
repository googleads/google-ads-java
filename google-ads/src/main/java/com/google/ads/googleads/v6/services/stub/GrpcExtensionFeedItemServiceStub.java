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

import com.google.ads.googleads.v6.resources.ExtensionFeedItem;
import com.google.ads.googleads.v6.services.GetExtensionFeedItemRequest;
import com.google.ads.googleads.v6.services.MutateExtensionFeedItemsRequest;
import com.google.ads.googleads.v6.services.MutateExtensionFeedItemsResponse;
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
 * gRPC stub implementation for the ExtensionFeedItemService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcExtensionFeedItemServiceStub extends ExtensionFeedItemServiceStub {
  private static final MethodDescriptor<GetExtensionFeedItemRequest, ExtensionFeedItem>
      getExtensionFeedItemMethodDescriptor =
          MethodDescriptor.<GetExtensionFeedItemRequest, ExtensionFeedItem>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.ExtensionFeedItemService/GetExtensionFeedItem")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetExtensionFeedItemRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ExtensionFeedItem.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateExtensionFeedItemsRequest, MutateExtensionFeedItemsResponse>
      mutateExtensionFeedItemsMethodDescriptor =
          MethodDescriptor
              .<MutateExtensionFeedItemsRequest, MutateExtensionFeedItemsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.ExtensionFeedItemService/MutateExtensionFeedItems")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateExtensionFeedItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateExtensionFeedItemsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetExtensionFeedItemRequest, ExtensionFeedItem>
      getExtensionFeedItemCallable;
  private final UnaryCallable<MutateExtensionFeedItemsRequest, MutateExtensionFeedItemsResponse>
      mutateExtensionFeedItemsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcExtensionFeedItemServiceStub create(
      ExtensionFeedItemServiceStubSettings settings) throws IOException {
    return new GrpcExtensionFeedItemServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcExtensionFeedItemServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcExtensionFeedItemServiceStub(
        ExtensionFeedItemServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcExtensionFeedItemServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcExtensionFeedItemServiceStub(
        ExtensionFeedItemServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcExtensionFeedItemServiceStub(
      ExtensionFeedItemServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcExtensionFeedItemServiceCallableFactory());
  }

  protected GrpcExtensionFeedItemServiceStub(
      ExtensionFeedItemServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetExtensionFeedItemRequest, ExtensionFeedItem>
        getExtensionFeedItemTransportSettings =
            GrpcCallSettings.<GetExtensionFeedItemRequest, ExtensionFeedItem>newBuilder()
                .setMethodDescriptor(getExtensionFeedItemMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetExtensionFeedItemRequest>() {
                      @Override
                      public Map<String, String> extract(GetExtensionFeedItemRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateExtensionFeedItemsRequest, MutateExtensionFeedItemsResponse>
        mutateExtensionFeedItemsTransportSettings =
            GrpcCallSettings
                .<MutateExtensionFeedItemsRequest, MutateExtensionFeedItemsResponse>newBuilder()
                .setMethodDescriptor(mutateExtensionFeedItemsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateExtensionFeedItemsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateExtensionFeedItemsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getExtensionFeedItemCallable =
        callableFactory.createUnaryCallable(
            getExtensionFeedItemTransportSettings,
            settings.getExtensionFeedItemSettings(),
            clientContext);
    this.mutateExtensionFeedItemsCallable =
        callableFactory.createUnaryCallable(
            mutateExtensionFeedItemsTransportSettings,
            settings.mutateExtensionFeedItemsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetExtensionFeedItemRequest, ExtensionFeedItem>
      getExtensionFeedItemCallable() {
    return getExtensionFeedItemCallable;
  }

  public UnaryCallable<MutateExtensionFeedItemsRequest, MutateExtensionFeedItemsResponse>
      mutateExtensionFeedItemsCallable() {
    return mutateExtensionFeedItemsCallable;
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
