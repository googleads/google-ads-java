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

import com.google.ads.googleads.v6.resources.CustomerClientLink;
import com.google.ads.googleads.v6.services.GetCustomerClientLinkRequest;
import com.google.ads.googleads.v6.services.MutateCustomerClientLinkRequest;
import com.google.ads.googleads.v6.services.MutateCustomerClientLinkResponse;
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
public class GrpcCustomerClientLinkServiceStub extends CustomerClientLinkServiceStub {

  private static final MethodDescriptor<GetCustomerClientLinkRequest, CustomerClientLink>
      getCustomerClientLinkMethodDescriptor =
          MethodDescriptor.<GetCustomerClientLinkRequest, CustomerClientLink>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CustomerClientLinkService/GetCustomerClientLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCustomerClientLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomerClientLink.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          MutateCustomerClientLinkRequest, MutateCustomerClientLinkResponse>
      mutateCustomerClientLinkMethodDescriptor =
          MethodDescriptor
              .<MutateCustomerClientLinkRequest, MutateCustomerClientLinkResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CustomerClientLinkService/MutateCustomerClientLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomerClientLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCustomerClientLinkResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetCustomerClientLinkRequest, CustomerClientLink>
      getCustomerClientLinkCallable;
  private final UnaryCallable<MutateCustomerClientLinkRequest, MutateCustomerClientLinkResponse>
      mutateCustomerClientLinkCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomerClientLinkServiceStub create(
      CustomerClientLinkServiceStubSettings settings) throws IOException {
    return new GrpcCustomerClientLinkServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCustomerClientLinkServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCustomerClientLinkServiceStub(
        CustomerClientLinkServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomerClientLinkServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomerClientLinkServiceStub(
        CustomerClientLinkServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCustomerClientLinkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerClientLinkServiceStub(
      CustomerClientLinkServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCustomerClientLinkServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomerClientLinkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerClientLinkServiceStub(
      CustomerClientLinkServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetCustomerClientLinkRequest, CustomerClientLink>
        getCustomerClientLinkTransportSettings =
            GrpcCallSettings.<GetCustomerClientLinkRequest, CustomerClientLink>newBuilder()
                .setMethodDescriptor(getCustomerClientLinkMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetCustomerClientLinkRequest>() {
                      @Override
                      public Map<String, String> extract(GetCustomerClientLinkRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateCustomerClientLinkRequest, MutateCustomerClientLinkResponse>
        mutateCustomerClientLinkTransportSettings =
            GrpcCallSettings
                .<MutateCustomerClientLinkRequest, MutateCustomerClientLinkResponse>newBuilder()
                .setMethodDescriptor(mutateCustomerClientLinkMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCustomerClientLinkRequest>() {
                      @Override
                      public Map<String, String> extract(MutateCustomerClientLinkRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCustomerClientLinkCallable =
        callableFactory.createUnaryCallable(
            getCustomerClientLinkTransportSettings,
            settings.getCustomerClientLinkSettings(),
            clientContext);
    this.mutateCustomerClientLinkCallable =
        callableFactory.createUnaryCallable(
            mutateCustomerClientLinkTransportSettings,
            settings.mutateCustomerClientLinkSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetCustomerClientLinkRequest, CustomerClientLink>
      getCustomerClientLinkCallable() {
    return getCustomerClientLinkCallable;
  }

  public UnaryCallable<MutateCustomerClientLinkRequest, MutateCustomerClientLinkResponse>
      mutateCustomerClientLinkCallable() {
    return mutateCustomerClientLinkCallable;
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
