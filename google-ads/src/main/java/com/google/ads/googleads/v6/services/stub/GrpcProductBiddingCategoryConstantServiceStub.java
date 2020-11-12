/*
 * Copyright 2020 Google LLC
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
package com.google.ads.googleads.v6.services.stub;

import com.google.ads.googleads.v6.resources.ProductBiddingCategoryConstant;
import com.google.ads.googleads.v6.services.GetProductBiddingCategoryConstantRequest;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
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
public class GrpcProductBiddingCategoryConstantServiceStub
    extends ProductBiddingCategoryConstantServiceStub {

  private static final MethodDescriptor<
          GetProductBiddingCategoryConstantRequest, ProductBiddingCategoryConstant>
      getProductBiddingCategoryConstantMethodDescriptor =
          MethodDescriptor
              .<GetProductBiddingCategoryConstantRequest, ProductBiddingCategoryConstant>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.ProductBiddingCategoryConstantService/GetProductBiddingCategoryConstant")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      GetProductBiddingCategoryConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ProductBiddingCategoryConstant.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<
          GetProductBiddingCategoryConstantRequest, ProductBiddingCategoryConstant>
      getProductBiddingCategoryConstantCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcProductBiddingCategoryConstantServiceStub create(
      ProductBiddingCategoryConstantServiceStubSettings settings) throws IOException {
    return new GrpcProductBiddingCategoryConstantServiceStub(
        settings, ClientContext.create(settings));
  }

  public static final GrpcProductBiddingCategoryConstantServiceStub create(
      ClientContext clientContext) throws IOException {
    return new GrpcProductBiddingCategoryConstantServiceStub(
        ProductBiddingCategoryConstantServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcProductBiddingCategoryConstantServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcProductBiddingCategoryConstantServiceStub(
        ProductBiddingCategoryConstantServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcProductBiddingCategoryConstantServiceStub, using the given
   * settings. This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected GrpcProductBiddingCategoryConstantServiceStub(
      ProductBiddingCategoryConstantServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcProductBiddingCategoryConstantServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcProductBiddingCategoryConstantServiceStub, using the given
   * settings. This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected GrpcProductBiddingCategoryConstantServiceStub(
      ProductBiddingCategoryConstantServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetProductBiddingCategoryConstantRequest, ProductBiddingCategoryConstant>
        getProductBiddingCategoryConstantTransportSettings =
            GrpcCallSettings
                .<GetProductBiddingCategoryConstantRequest, ProductBiddingCategoryConstant>
                    newBuilder()
                .setMethodDescriptor(getProductBiddingCategoryConstantMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetProductBiddingCategoryConstantRequest>() {
                      @Override
                      public Map<String, String> extract(
                          GetProductBiddingCategoryConstantRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();

    this.getProductBiddingCategoryConstantCallable =
        callableFactory.createUnaryCallable(
            getProductBiddingCategoryConstantTransportSettings,
            settings.getProductBiddingCategoryConstantSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetProductBiddingCategoryConstantRequest, ProductBiddingCategoryConstant>
      getProductBiddingCategoryConstantCallable() {
    return getProductBiddingCategoryConstantCallable;
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
