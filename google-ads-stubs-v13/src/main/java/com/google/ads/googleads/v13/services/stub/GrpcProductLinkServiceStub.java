/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v13.services.stub;

import com.google.ads.googleads.v13.services.CreateProductLinkRequest;
import com.google.ads.googleads.v13.services.CreateProductLinkResponse;
import com.google.ads.googleads.v13.services.RemoveProductLinkRequest;
import com.google.ads.googleads.v13.services.RemoveProductLinkResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
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
 * gRPC stub implementation for the ProductLinkService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcProductLinkServiceStub extends ProductLinkServiceStub {
  private static final MethodDescriptor<CreateProductLinkRequest, CreateProductLinkResponse>
      createProductLinkMethodDescriptor =
          MethodDescriptor.<CreateProductLinkRequest, CreateProductLinkResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v13.services.ProductLinkService/CreateProductLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateProductLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CreateProductLinkResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<RemoveProductLinkRequest, RemoveProductLinkResponse>
      removeProductLinkMethodDescriptor =
          MethodDescriptor.<RemoveProductLinkRequest, RemoveProductLinkResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v13.services.ProductLinkService/RemoveProductLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(RemoveProductLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(RemoveProductLinkResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<CreateProductLinkRequest, CreateProductLinkResponse>
      createProductLinkCallable;
  private final UnaryCallable<RemoveProductLinkRequest, RemoveProductLinkResponse>
      removeProductLinkCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcProductLinkServiceStub create(ProductLinkServiceStubSettings settings)
      throws IOException {
    return new GrpcProductLinkServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcProductLinkServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcProductLinkServiceStub(
        ProductLinkServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcProductLinkServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcProductLinkServiceStub(
        ProductLinkServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcProductLinkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcProductLinkServiceStub(
      ProductLinkServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcProductLinkServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcProductLinkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcProductLinkServiceStub(
      ProductLinkServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateProductLinkRequest, CreateProductLinkResponse>
        createProductLinkTransportSettings =
            GrpcCallSettings.<CreateProductLinkRequest, CreateProductLinkResponse>newBuilder()
                .setMethodDescriptor(createProductLinkMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<RemoveProductLinkRequest, RemoveProductLinkResponse>
        removeProductLinkTransportSettings =
            GrpcCallSettings.<RemoveProductLinkRequest, RemoveProductLinkResponse>newBuilder()
                .setMethodDescriptor(removeProductLinkMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();

    this.createProductLinkCallable =
        callableFactory.createUnaryCallable(
            createProductLinkTransportSettings,
            settings.createProductLinkSettings(),
            clientContext);
    this.removeProductLinkCallable =
        callableFactory.createUnaryCallable(
            removeProductLinkTransportSettings,
            settings.removeProductLinkSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<CreateProductLinkRequest, CreateProductLinkResponse>
      createProductLinkCallable() {
    return createProductLinkCallable;
  }

  @Override
  public UnaryCallable<RemoveProductLinkRequest, RemoveProductLinkResponse>
      removeProductLinkCallable() {
    return removeProductLinkCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
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
