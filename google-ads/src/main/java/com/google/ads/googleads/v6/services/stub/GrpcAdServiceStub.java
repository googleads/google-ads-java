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

import com.google.ads.googleads.v6.resources.Ad;
import com.google.ads.googleads.v6.services.GetAdRequest;
import com.google.ads.googleads.v6.services.MutateAdsRequest;
import com.google.ads.googleads.v6.services.MutateAdsResponse;
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
 * gRPC stub implementation for the AdService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcAdServiceStub extends AdServiceStub {
  private static final MethodDescriptor<GetAdRequest, Ad> getAdMethodDescriptor =
      MethodDescriptor.<GetAdRequest, Ad>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.ads.googleads.v6.services.AdService/GetAd")
          .setRequestMarshaller(ProtoUtils.marshaller(GetAdRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Ad.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<MutateAdsRequest, MutateAdsResponse>
      mutateAdsMethodDescriptor =
          MethodDescriptor.<MutateAdsRequest, MutateAdsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v6.services.AdService/MutateAds")
              .setRequestMarshaller(ProtoUtils.marshaller(MutateAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(MutateAdsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetAdRequest, Ad> getAdCallable;
  private final UnaryCallable<MutateAdsRequest, MutateAdsResponse> mutateAdsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAdServiceStub create(AdServiceStubSettings settings) throws IOException {
    return new GrpcAdServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAdServiceStub create(ClientContext clientContext) throws IOException {
    return new GrpcAdServiceStub(AdServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAdServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAdServiceStub(
        AdServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcAdServiceStub(AdServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcAdServiceCallableFactory());
  }

  protected GrpcAdServiceStub(
      AdServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetAdRequest, Ad> getAdTransportSettings =
        GrpcCallSettings.<GetAdRequest, Ad>newBuilder()
            .setMethodDescriptor(getAdMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetAdRequest>() {
                  @Override
                  public Map<String, String> extract(GetAdRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateAdsRequest, MutateAdsResponse> mutateAdsTransportSettings =
        GrpcCallSettings.<MutateAdsRequest, MutateAdsResponse>newBuilder()
            .setMethodDescriptor(mutateAdsMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<MutateAdsRequest>() {
                  @Override
                  public Map<String, String> extract(MutateAdsRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("customer_id", String.valueOf(request.getCustomerId()));
                    return params.build();
                  }
                })
            .build();

    this.getAdCallable =
        callableFactory.createUnaryCallable(
            getAdTransportSettings, settings.getAdSettings(), clientContext);
    this.mutateAdsCallable =
        callableFactory.createUnaryCallable(
            mutateAdsTransportSettings, settings.mutateAdsSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetAdRequest, Ad> getAdCallable() {
    return getAdCallable;
  }

  public UnaryCallable<MutateAdsRequest, MutateAdsResponse> mutateAdsCallable() {
    return mutateAdsCallable;
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
