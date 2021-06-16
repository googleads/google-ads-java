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

import com.google.ads.googleads.v8.resources.CustomerAsset;
import com.google.ads.googleads.v8.services.GetCustomerAssetRequest;
import com.google.ads.googleads.v8.services.MutateCustomerAssetsRequest;
import com.google.ads.googleads.v8.services.MutateCustomerAssetsResponse;
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
 * gRPC stub implementation for the CustomerAssetService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCustomerAssetServiceStub extends CustomerAssetServiceStub {
  private static final MethodDescriptor<GetCustomerAssetRequest, CustomerAsset>
      getCustomerAssetMethodDescriptor =
          MethodDescriptor.<GetCustomerAssetRequest, CustomerAsset>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v8.services.CustomerAssetService/GetCustomerAsset")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCustomerAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomerAsset.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateCustomerAssetsRequest, MutateCustomerAssetsResponse>
      mutateCustomerAssetsMethodDescriptor =
          MethodDescriptor.<MutateCustomerAssetsRequest, MutateCustomerAssetsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v8.services.CustomerAssetService/MutateCustomerAssets")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomerAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCustomerAssetsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetCustomerAssetRequest, CustomerAsset> getCustomerAssetCallable;
  private final UnaryCallable<MutateCustomerAssetsRequest, MutateCustomerAssetsResponse>
      mutateCustomerAssetsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomerAssetServiceStub create(CustomerAssetServiceStubSettings settings)
      throws IOException {
    return new GrpcCustomerAssetServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCustomerAssetServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCustomerAssetServiceStub(
        CustomerAssetServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomerAssetServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomerAssetServiceStub(
        CustomerAssetServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCustomerAssetServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerAssetServiceStub(
      CustomerAssetServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCustomerAssetServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomerAssetServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerAssetServiceStub(
      CustomerAssetServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetCustomerAssetRequest, CustomerAsset> getCustomerAssetTransportSettings =
        GrpcCallSettings.<GetCustomerAssetRequest, CustomerAsset>newBuilder()
            .setMethodDescriptor(getCustomerAssetMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetCustomerAssetRequest>() {
                  @Override
                  public Map<String, String> extract(GetCustomerAssetRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateCustomerAssetsRequest, MutateCustomerAssetsResponse>
        mutateCustomerAssetsTransportSettings =
            GrpcCallSettings.<MutateCustomerAssetsRequest, MutateCustomerAssetsResponse>newBuilder()
                .setMethodDescriptor(mutateCustomerAssetsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCustomerAssetsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateCustomerAssetsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCustomerAssetCallable =
        callableFactory.createUnaryCallable(
            getCustomerAssetTransportSettings, settings.getCustomerAssetSettings(), clientContext);
    this.mutateCustomerAssetsCallable =
        callableFactory.createUnaryCallable(
            mutateCustomerAssetsTransportSettings,
            settings.mutateCustomerAssetsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetCustomerAssetRequest, CustomerAsset> getCustomerAssetCallable() {
    return getCustomerAssetCallable;
  }

  @Override
  public UnaryCallable<MutateCustomerAssetsRequest, MutateCustomerAssetsResponse>
      mutateCustomerAssetsCallable() {
    return mutateCustomerAssetsCallable;
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
