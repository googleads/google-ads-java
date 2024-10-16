/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v18.services.stub;

import com.google.ads.googleads.v18.services.CreateProductLinkInvitationRequest;
import com.google.ads.googleads.v18.services.CreateProductLinkInvitationResponse;
import com.google.ads.googleads.v18.services.RemoveProductLinkInvitationRequest;
import com.google.ads.googleads.v18.services.RemoveProductLinkInvitationResponse;
import com.google.ads.googleads.v18.services.UpdateProductLinkInvitationRequest;
import com.google.ads.googleads.v18.services.UpdateProductLinkInvitationResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the ProductLinkInvitationService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcProductLinkInvitationServiceStub extends ProductLinkInvitationServiceStub {
  private static final MethodDescriptor<
          CreateProductLinkInvitationRequest, CreateProductLinkInvitationResponse>
      createProductLinkInvitationMethodDescriptor =
          MethodDescriptor
              .<CreateProductLinkInvitationRequest, CreateProductLinkInvitationResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.ProductLinkInvitationService/CreateProductLinkInvitation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateProductLinkInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CreateProductLinkInvitationResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          UpdateProductLinkInvitationRequest, UpdateProductLinkInvitationResponse>
      updateProductLinkInvitationMethodDescriptor =
          MethodDescriptor
              .<UpdateProductLinkInvitationRequest, UpdateProductLinkInvitationResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.ProductLinkInvitationService/UpdateProductLinkInvitation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateProductLinkInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(UpdateProductLinkInvitationResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          RemoveProductLinkInvitationRequest, RemoveProductLinkInvitationResponse>
      removeProductLinkInvitationMethodDescriptor =
          MethodDescriptor
              .<RemoveProductLinkInvitationRequest, RemoveProductLinkInvitationResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.ProductLinkInvitationService/RemoveProductLinkInvitation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(RemoveProductLinkInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(RemoveProductLinkInvitationResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<
          CreateProductLinkInvitationRequest, CreateProductLinkInvitationResponse>
      createProductLinkInvitationCallable;
  private final UnaryCallable<
          UpdateProductLinkInvitationRequest, UpdateProductLinkInvitationResponse>
      updateProductLinkInvitationCallable;
  private final UnaryCallable<
          RemoveProductLinkInvitationRequest, RemoveProductLinkInvitationResponse>
      removeProductLinkInvitationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcProductLinkInvitationServiceStub create(
      ProductLinkInvitationServiceStubSettings settings) throws IOException {
    return new GrpcProductLinkInvitationServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcProductLinkInvitationServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcProductLinkInvitationServiceStub(
        ProductLinkInvitationServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcProductLinkInvitationServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcProductLinkInvitationServiceStub(
        ProductLinkInvitationServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcProductLinkInvitationServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcProductLinkInvitationServiceStub(
      ProductLinkInvitationServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcProductLinkInvitationServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcProductLinkInvitationServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcProductLinkInvitationServiceStub(
      ProductLinkInvitationServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateProductLinkInvitationRequest, CreateProductLinkInvitationResponse>
        createProductLinkInvitationTransportSettings =
            GrpcCallSettings
                .<CreateProductLinkInvitationRequest, CreateProductLinkInvitationResponse>
                    newBuilder()
                .setMethodDescriptor(createProductLinkInvitationMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<UpdateProductLinkInvitationRequest, UpdateProductLinkInvitationResponse>
        updateProductLinkInvitationTransportSettings =
            GrpcCallSettings
                .<UpdateProductLinkInvitationRequest, UpdateProductLinkInvitationResponse>
                    newBuilder()
                .setMethodDescriptor(updateProductLinkInvitationMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<RemoveProductLinkInvitationRequest, RemoveProductLinkInvitationResponse>
        removeProductLinkInvitationTransportSettings =
            GrpcCallSettings
                .<RemoveProductLinkInvitationRequest, RemoveProductLinkInvitationResponse>
                    newBuilder()
                .setMethodDescriptor(removeProductLinkInvitationMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.createProductLinkInvitationCallable =
        callableFactory.createUnaryCallable(
            createProductLinkInvitationTransportSettings,
            settings.createProductLinkInvitationSettings(),
            clientContext);
    this.updateProductLinkInvitationCallable =
        callableFactory.createUnaryCallable(
            updateProductLinkInvitationTransportSettings,
            settings.updateProductLinkInvitationSettings(),
            clientContext);
    this.removeProductLinkInvitationCallable =
        callableFactory.createUnaryCallable(
            removeProductLinkInvitationTransportSettings,
            settings.removeProductLinkInvitationSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<CreateProductLinkInvitationRequest, CreateProductLinkInvitationResponse>
      createProductLinkInvitationCallable() {
    return createProductLinkInvitationCallable;
  }

  @Override
  public UnaryCallable<UpdateProductLinkInvitationRequest, UpdateProductLinkInvitationResponse>
      updateProductLinkInvitationCallable() {
    return updateProductLinkInvitationCallable;
  }

  @Override
  public UnaryCallable<RemoveProductLinkInvitationRequest, RemoveProductLinkInvitationResponse>
      removeProductLinkInvitationCallable() {
    return removeProductLinkInvitationCallable;
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
