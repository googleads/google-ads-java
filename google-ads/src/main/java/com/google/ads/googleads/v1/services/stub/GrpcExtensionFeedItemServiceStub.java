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

import com.google.ads.googleads.v1.resources.ExtensionFeedItem;
import com.google.ads.googleads.v1.services.GetExtensionFeedItemRequest;
import com.google.ads.googleads.v1.services.MutateExtensionFeedItemsRequest;
import com.google.ads.googleads.v1.services.MutateExtensionFeedItemsResponse;
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
public class GrpcExtensionFeedItemServiceStub extends ExtensionFeedItemServiceStub {

  private static final MethodDescriptor<GetExtensionFeedItemRequest, ExtensionFeedItem>
      getExtensionFeedItemMethodDescriptor =
          MethodDescriptor.<GetExtensionFeedItemRequest, ExtensionFeedItem>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.ExtensionFeedItemService/GetExtensionFeedItem")
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
                  "google.ads.googleads.v1.services.ExtensionFeedItemService/MutateExtensionFeedItems")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateExtensionFeedItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateExtensionFeedItemsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetExtensionFeedItemRequest, ExtensionFeedItem>
      getExtensionFeedItemCallable;
  private final UnaryCallable<MutateExtensionFeedItemsRequest, MutateExtensionFeedItemsResponse>
      mutateExtensionFeedItemsCallable;

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

  /**
   * Constructs an instance of GrpcExtensionFeedItemServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcExtensionFeedItemServiceStub(
      ExtensionFeedItemServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcExtensionFeedItemServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcExtensionFeedItemServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcExtensionFeedItemServiceStub(
      ExtensionFeedItemServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetExtensionFeedItemRequest, ExtensionFeedItem>
        getExtensionFeedItemTransportSettings =
            GrpcCallSettings.<GetExtensionFeedItemRequest, ExtensionFeedItem>newBuilder()
                .setMethodDescriptor(getExtensionFeedItemMethodDescriptor)
                .build();
    GrpcCallSettings<MutateExtensionFeedItemsRequest, MutateExtensionFeedItemsResponse>
        mutateExtensionFeedItemsTransportSettings =
            GrpcCallSettings
                .<MutateExtensionFeedItemsRequest, MutateExtensionFeedItemsResponse>newBuilder()
                .setMethodDescriptor(mutateExtensionFeedItemsMethodDescriptor)
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

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
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
