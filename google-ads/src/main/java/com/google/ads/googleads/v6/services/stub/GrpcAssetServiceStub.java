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

import com.google.ads.googleads.v6.resources.Asset;
import com.google.ads.googleads.v6.services.GetAssetRequest;
import com.google.ads.googleads.v6.services.MutateAssetsRequest;
import com.google.ads.googleads.v6.services.MutateAssetsResponse;
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
 * gRPC stub implementation for the AssetService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcAssetServiceStub extends AssetServiceStub {
  private static final MethodDescriptor<GetAssetRequest, Asset> getAssetMethodDescriptor =
      MethodDescriptor.<GetAssetRequest, Asset>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.ads.googleads.v6.services.AssetService/GetAsset")
          .setRequestMarshaller(ProtoUtils.marshaller(GetAssetRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Asset.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<MutateAssetsRequest, MutateAssetsResponse>
      mutateAssetsMethodDescriptor =
          MethodDescriptor.<MutateAssetsRequest, MutateAssetsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v6.services.AssetService/MutateAssets")
              .setRequestMarshaller(ProtoUtils.marshaller(MutateAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateAssetsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetAssetRequest, Asset> getAssetCallable;
  private final UnaryCallable<MutateAssetsRequest, MutateAssetsResponse> mutateAssetsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAssetServiceStub create(AssetServiceStubSettings settings)
      throws IOException {
    return new GrpcAssetServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAssetServiceStub create(ClientContext clientContext) throws IOException {
    return new GrpcAssetServiceStub(AssetServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAssetServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAssetServiceStub(
        AssetServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAssetServiceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcAssetServiceStub(AssetServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcAssetServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAssetServiceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcAssetServiceStub(
      AssetServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetAssetRequest, Asset> getAssetTransportSettings =
        GrpcCallSettings.<GetAssetRequest, Asset>newBuilder()
            .setMethodDescriptor(getAssetMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetAssetRequest>() {
                  @Override
                  public Map<String, String> extract(GetAssetRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateAssetsRequest, MutateAssetsResponse> mutateAssetsTransportSettings =
        GrpcCallSettings.<MutateAssetsRequest, MutateAssetsResponse>newBuilder()
            .setMethodDescriptor(mutateAssetsMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<MutateAssetsRequest>() {
                  @Override
                  public Map<String, String> extract(MutateAssetsRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("customer_id", String.valueOf(request.getCustomerId()));
                    return params.build();
                  }
                })
            .build();

    this.getAssetCallable =
        callableFactory.createUnaryCallable(
            getAssetTransportSettings, settings.getAssetSettings(), clientContext);
    this.mutateAssetsCallable =
        callableFactory.createUnaryCallable(
            mutateAssetsTransportSettings, settings.mutateAssetsSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetAssetRequest, Asset> getAssetCallable() {
    return getAssetCallable;
  }

  public UnaryCallable<MutateAssetsRequest, MutateAssetsResponse> mutateAssetsCallable() {
    return mutateAssetsCallable;
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
