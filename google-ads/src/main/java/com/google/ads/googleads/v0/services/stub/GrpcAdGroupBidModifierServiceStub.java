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
package com.google.ads.googleads.v0.services.stub;

import com.google.ads.googleads.v0.resources.AdGroupBidModifier;
import com.google.ads.googleads.v0.services.GetAdGroupBidModifierRequest;
import com.google.ads.googleads.v0.services.MutateAdGroupBidModifiersRequest;
import com.google.ads.googleads.v0.services.MutateAdGroupBidModifiersResponse;
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
public class GrpcAdGroupBidModifierServiceStub extends AdGroupBidModifierServiceStub {

  private static final MethodDescriptor<GetAdGroupBidModifierRequest, AdGroupBidModifier>
      getAdGroupBidModifierMethodDescriptor =
          MethodDescriptor.<GetAdGroupBidModifierRequest, AdGroupBidModifier>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v0.services.AdGroupBidModifierService/GetAdGroupBidModifier")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAdGroupBidModifierRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AdGroupBidModifier.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          MutateAdGroupBidModifiersRequest, MutateAdGroupBidModifiersResponse>
      mutateAdGroupBidModifiersMethodDescriptor =
          MethodDescriptor
              .<MutateAdGroupBidModifiersRequest, MutateAdGroupBidModifiersResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v0.services.AdGroupBidModifierService/MutateAdGroupBidModifiers")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupBidModifiersRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupBidModifiersResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetAdGroupBidModifierRequest, AdGroupBidModifier>
      getAdGroupBidModifierCallable;
  private final UnaryCallable<MutateAdGroupBidModifiersRequest, MutateAdGroupBidModifiersResponse>
      mutateAdGroupBidModifiersCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAdGroupBidModifierServiceStub create(
      AdGroupBidModifierServiceStubSettings settings) throws IOException {
    return new GrpcAdGroupBidModifierServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAdGroupBidModifierServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAdGroupBidModifierServiceStub(
        AdGroupBidModifierServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAdGroupBidModifierServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAdGroupBidModifierServiceStub(
        AdGroupBidModifierServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAdGroupBidModifierServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAdGroupBidModifierServiceStub(
      AdGroupBidModifierServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcAdGroupBidModifierServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAdGroupBidModifierServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAdGroupBidModifierServiceStub(
      AdGroupBidModifierServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetAdGroupBidModifierRequest, AdGroupBidModifier>
        getAdGroupBidModifierTransportSettings =
            GrpcCallSettings.<GetAdGroupBidModifierRequest, AdGroupBidModifier>newBuilder()
                .setMethodDescriptor(getAdGroupBidModifierMethodDescriptor)
                .build();
    GrpcCallSettings<MutateAdGroupBidModifiersRequest, MutateAdGroupBidModifiersResponse>
        mutateAdGroupBidModifiersTransportSettings =
            GrpcCallSettings
                .<MutateAdGroupBidModifiersRequest, MutateAdGroupBidModifiersResponse>newBuilder()
                .setMethodDescriptor(mutateAdGroupBidModifiersMethodDescriptor)
                .build();

    this.getAdGroupBidModifierCallable =
        callableFactory.createUnaryCallable(
            getAdGroupBidModifierTransportSettings,
            settings.getAdGroupBidModifierSettings(),
            clientContext);
    this.mutateAdGroupBidModifiersCallable =
        callableFactory.createUnaryCallable(
            mutateAdGroupBidModifiersTransportSettings,
            settings.mutateAdGroupBidModifiersSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetAdGroupBidModifierRequest, AdGroupBidModifier>
      getAdGroupBidModifierCallable() {
    return getAdGroupBidModifierCallable;
  }

  public UnaryCallable<MutateAdGroupBidModifiersRequest, MutateAdGroupBidModifiersResponse>
      mutateAdGroupBidModifiersCallable() {
    return mutateAdGroupBidModifiersCallable;
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
