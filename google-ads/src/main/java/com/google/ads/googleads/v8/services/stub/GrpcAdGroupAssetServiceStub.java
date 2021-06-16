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

import com.google.ads.googleads.v8.resources.AdGroupAsset;
import com.google.ads.googleads.v8.services.GetAdGroupAssetRequest;
import com.google.ads.googleads.v8.services.MutateAdGroupAssetsRequest;
import com.google.ads.googleads.v8.services.MutateAdGroupAssetsResponse;
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
 * gRPC stub implementation for the AdGroupAssetService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcAdGroupAssetServiceStub extends AdGroupAssetServiceStub {
  private static final MethodDescriptor<GetAdGroupAssetRequest, AdGroupAsset>
      getAdGroupAssetMethodDescriptor =
          MethodDescriptor.<GetAdGroupAssetRequest, AdGroupAsset>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v8.services.AdGroupAssetService/GetAdGroupAsset")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAdGroupAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AdGroupAsset.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateAdGroupAssetsRequest, MutateAdGroupAssetsResponse>
      mutateAdGroupAssetsMethodDescriptor =
          MethodDescriptor.<MutateAdGroupAssetsRequest, MutateAdGroupAssetsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v8.services.AdGroupAssetService/MutateAdGroupAssets")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupAssetsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetAdGroupAssetRequest, AdGroupAsset> getAdGroupAssetCallable;
  private final UnaryCallable<MutateAdGroupAssetsRequest, MutateAdGroupAssetsResponse>
      mutateAdGroupAssetsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAdGroupAssetServiceStub create(AdGroupAssetServiceStubSettings settings)
      throws IOException {
    return new GrpcAdGroupAssetServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAdGroupAssetServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAdGroupAssetServiceStub(
        AdGroupAssetServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAdGroupAssetServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAdGroupAssetServiceStub(
        AdGroupAssetServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAdGroupAssetServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAdGroupAssetServiceStub(
      AdGroupAssetServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcAdGroupAssetServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAdGroupAssetServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAdGroupAssetServiceStub(
      AdGroupAssetServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetAdGroupAssetRequest, AdGroupAsset> getAdGroupAssetTransportSettings =
        GrpcCallSettings.<GetAdGroupAssetRequest, AdGroupAsset>newBuilder()
            .setMethodDescriptor(getAdGroupAssetMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetAdGroupAssetRequest>() {
                  @Override
                  public Map<String, String> extract(GetAdGroupAssetRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateAdGroupAssetsRequest, MutateAdGroupAssetsResponse>
        mutateAdGroupAssetsTransportSettings =
            GrpcCallSettings.<MutateAdGroupAssetsRequest, MutateAdGroupAssetsResponse>newBuilder()
                .setMethodDescriptor(mutateAdGroupAssetsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateAdGroupAssetsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateAdGroupAssetsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getAdGroupAssetCallable =
        callableFactory.createUnaryCallable(
            getAdGroupAssetTransportSettings, settings.getAdGroupAssetSettings(), clientContext);
    this.mutateAdGroupAssetsCallable =
        callableFactory.createUnaryCallable(
            mutateAdGroupAssetsTransportSettings,
            settings.mutateAdGroupAssetsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetAdGroupAssetRequest, AdGroupAsset> getAdGroupAssetCallable() {
    return getAdGroupAssetCallable;
  }

  @Override
  public UnaryCallable<MutateAdGroupAssetsRequest, MutateAdGroupAssetsResponse>
      mutateAdGroupAssetsCallable() {
    return mutateAdGroupAssetsCallable;
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
