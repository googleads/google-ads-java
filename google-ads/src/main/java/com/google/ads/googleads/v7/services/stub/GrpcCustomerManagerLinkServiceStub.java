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

package com.google.ads.googleads.v7.services.stub;

import com.google.ads.googleads.v7.resources.CustomerManagerLink;
import com.google.ads.googleads.v7.services.GetCustomerManagerLinkRequest;
import com.google.ads.googleads.v7.services.MoveManagerLinkRequest;
import com.google.ads.googleads.v7.services.MoveManagerLinkResponse;
import com.google.ads.googleads.v7.services.MutateCustomerManagerLinkRequest;
import com.google.ads.googleads.v7.services.MutateCustomerManagerLinkResponse;
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
 * gRPC stub implementation for the CustomerManagerLinkService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCustomerManagerLinkServiceStub extends CustomerManagerLinkServiceStub {
  private static final MethodDescriptor<GetCustomerManagerLinkRequest, CustomerManagerLink>
      getCustomerManagerLinkMethodDescriptor =
          MethodDescriptor.<GetCustomerManagerLinkRequest, CustomerManagerLink>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v7.services.CustomerManagerLinkService/GetCustomerManagerLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCustomerManagerLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CustomerManagerLink.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateCustomerManagerLinkRequest, MutateCustomerManagerLinkResponse>
      mutateCustomerManagerLinkMethodDescriptor =
          MethodDescriptor
              .<MutateCustomerManagerLinkRequest, MutateCustomerManagerLinkResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v7.services.CustomerManagerLinkService/MutateCustomerManagerLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomerManagerLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCustomerManagerLinkResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MoveManagerLinkRequest, MoveManagerLinkResponse>
      moveManagerLinkMethodDescriptor =
          MethodDescriptor.<MoveManagerLinkRequest, MoveManagerLinkResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v7.services.CustomerManagerLinkService/MoveManagerLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MoveManagerLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MoveManagerLinkResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetCustomerManagerLinkRequest, CustomerManagerLink>
      getCustomerManagerLinkCallable;
  private final UnaryCallable<MutateCustomerManagerLinkRequest, MutateCustomerManagerLinkResponse>
      mutateCustomerManagerLinkCallable;
  private final UnaryCallable<MoveManagerLinkRequest, MoveManagerLinkResponse>
      moveManagerLinkCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomerManagerLinkServiceStub create(
      CustomerManagerLinkServiceStubSettings settings) throws IOException {
    return new GrpcCustomerManagerLinkServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCustomerManagerLinkServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCustomerManagerLinkServiceStub(
        CustomerManagerLinkServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomerManagerLinkServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomerManagerLinkServiceStub(
        CustomerManagerLinkServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcCustomerManagerLinkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerManagerLinkServiceStub(
      CustomerManagerLinkServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCustomerManagerLinkServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomerManagerLinkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerManagerLinkServiceStub(
      CustomerManagerLinkServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetCustomerManagerLinkRequest, CustomerManagerLink>
        getCustomerManagerLinkTransportSettings =
            GrpcCallSettings.<GetCustomerManagerLinkRequest, CustomerManagerLink>newBuilder()
                .setMethodDescriptor(getCustomerManagerLinkMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetCustomerManagerLinkRequest>() {
                      @Override
                      public Map<String, String> extract(GetCustomerManagerLinkRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateCustomerManagerLinkRequest, MutateCustomerManagerLinkResponse>
        mutateCustomerManagerLinkTransportSettings =
            GrpcCallSettings
                .<MutateCustomerManagerLinkRequest, MutateCustomerManagerLinkResponse>newBuilder()
                .setMethodDescriptor(mutateCustomerManagerLinkMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCustomerManagerLinkRequest>() {
                      @Override
                      public Map<String, String> extract(MutateCustomerManagerLinkRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MoveManagerLinkRequest, MoveManagerLinkResponse>
        moveManagerLinkTransportSettings =
            GrpcCallSettings.<MoveManagerLinkRequest, MoveManagerLinkResponse>newBuilder()
                .setMethodDescriptor(moveManagerLinkMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MoveManagerLinkRequest>() {
                      @Override
                      public Map<String, String> extract(MoveManagerLinkRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCustomerManagerLinkCallable =
        callableFactory.createUnaryCallable(
            getCustomerManagerLinkTransportSettings,
            settings.getCustomerManagerLinkSettings(),
            clientContext);
    this.mutateCustomerManagerLinkCallable =
        callableFactory.createUnaryCallable(
            mutateCustomerManagerLinkTransportSettings,
            settings.mutateCustomerManagerLinkSettings(),
            clientContext);
    this.moveManagerLinkCallable =
        callableFactory.createUnaryCallable(
            moveManagerLinkTransportSettings, settings.moveManagerLinkSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetCustomerManagerLinkRequest, CustomerManagerLink>
      getCustomerManagerLinkCallable() {
    return getCustomerManagerLinkCallable;
  }

  @Override
  public UnaryCallable<MutateCustomerManagerLinkRequest, MutateCustomerManagerLinkResponse>
      mutateCustomerManagerLinkCallable() {
    return mutateCustomerManagerLinkCallable;
  }

  @Override
  public UnaryCallable<MoveManagerLinkRequest, MoveManagerLinkResponse> moveManagerLinkCallable() {
    return moveManagerLinkCallable;
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
