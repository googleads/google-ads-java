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

import com.google.ads.googleads.v1.resources.AdGroupAd;
import com.google.ads.googleads.v1.services.GetAdGroupAdRequest;
import com.google.ads.googleads.v1.services.MutateAdGroupAdsRequest;
import com.google.ads.googleads.v1.services.MutateAdGroupAdsResponse;
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
public class GrpcAdGroupAdServiceStub extends AdGroupAdServiceStub {

  private static final MethodDescriptor<GetAdGroupAdRequest, AdGroupAd>
      getAdGroupAdMethodDescriptor =
          MethodDescriptor.<GetAdGroupAdRequest, AdGroupAd>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v1.services.AdGroupAdService/GetAdGroupAd")
              .setRequestMarshaller(ProtoUtils.marshaller(GetAdGroupAdRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AdGroupAd.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<MutateAdGroupAdsRequest, MutateAdGroupAdsResponse>
      mutateAdGroupAdsMethodDescriptor =
          MethodDescriptor.<MutateAdGroupAdsRequest, MutateAdGroupAdsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v1.services.AdGroupAdService/MutateAdGroupAds")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupAdsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetAdGroupAdRequest, AdGroupAd> getAdGroupAdCallable;
  private final UnaryCallable<MutateAdGroupAdsRequest, MutateAdGroupAdsResponse>
      mutateAdGroupAdsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAdGroupAdServiceStub create(AdGroupAdServiceStubSettings settings)
      throws IOException {
    return new GrpcAdGroupAdServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAdGroupAdServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAdGroupAdServiceStub(
        AdGroupAdServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAdGroupAdServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAdGroupAdServiceStub(
        AdGroupAdServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAdGroupAdServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcAdGroupAdServiceStub(
      AdGroupAdServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcAdGroupAdServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAdGroupAdServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcAdGroupAdServiceStub(
      AdGroupAdServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetAdGroupAdRequest, AdGroupAd> getAdGroupAdTransportSettings =
        GrpcCallSettings.<GetAdGroupAdRequest, AdGroupAd>newBuilder()
            .setMethodDescriptor(getAdGroupAdMethodDescriptor)
            .build();
    GrpcCallSettings<MutateAdGroupAdsRequest, MutateAdGroupAdsResponse>
        mutateAdGroupAdsTransportSettings =
            GrpcCallSettings.<MutateAdGroupAdsRequest, MutateAdGroupAdsResponse>newBuilder()
                .setMethodDescriptor(mutateAdGroupAdsMethodDescriptor)
                .build();

    this.getAdGroupAdCallable =
        callableFactory.createUnaryCallable(
            getAdGroupAdTransportSettings, settings.getAdGroupAdSettings(), clientContext);
    this.mutateAdGroupAdsCallable =
        callableFactory.createUnaryCallable(
            mutateAdGroupAdsTransportSettings, settings.mutateAdGroupAdsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetAdGroupAdRequest, AdGroupAd> getAdGroupAdCallable() {
    return getAdGroupAdCallable;
  }

  public UnaryCallable<MutateAdGroupAdsRequest, MutateAdGroupAdsResponse>
      mutateAdGroupAdsCallable() {
    return mutateAdGroupAdsCallable;
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
