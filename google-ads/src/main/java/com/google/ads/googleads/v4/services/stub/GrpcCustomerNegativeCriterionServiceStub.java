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
package com.google.ads.googleads.v4.services.stub;

import com.google.ads.googleads.v4.resources.CustomerNegativeCriterion;
import com.google.ads.googleads.v4.services.GetCustomerNegativeCriterionRequest;
import com.google.ads.googleads.v4.services.MutateCustomerNegativeCriteriaRequest;
import com.google.ads.googleads.v4.services.MutateCustomerNegativeCriteriaResponse;
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
public class GrpcCustomerNegativeCriterionServiceStub extends CustomerNegativeCriterionServiceStub {

  private static final MethodDescriptor<
          GetCustomerNegativeCriterionRequest, CustomerNegativeCriterion>
      getCustomerNegativeCriterionMethodDescriptor =
          MethodDescriptor
              .<GetCustomerNegativeCriterionRequest, CustomerNegativeCriterion>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v4.services.CustomerNegativeCriterionService/GetCustomerNegativeCriterion")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCustomerNegativeCriterionRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CustomerNegativeCriterion.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          MutateCustomerNegativeCriteriaRequest, MutateCustomerNegativeCriteriaResponse>
      mutateCustomerNegativeCriteriaMethodDescriptor =
          MethodDescriptor
              .<MutateCustomerNegativeCriteriaRequest, MutateCustomerNegativeCriteriaResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v4.services.CustomerNegativeCriterionService/MutateCustomerNegativeCriteria")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomerNegativeCriteriaRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      MutateCustomerNegativeCriteriaResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetCustomerNegativeCriterionRequest, CustomerNegativeCriterion>
      getCustomerNegativeCriterionCallable;
  private final UnaryCallable<
          MutateCustomerNegativeCriteriaRequest, MutateCustomerNegativeCriteriaResponse>
      mutateCustomerNegativeCriteriaCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomerNegativeCriterionServiceStub create(
      CustomerNegativeCriterionServiceStubSettings settings) throws IOException {
    return new GrpcCustomerNegativeCriterionServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCustomerNegativeCriterionServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCustomerNegativeCriterionServiceStub(
        CustomerNegativeCriterionServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomerNegativeCriterionServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomerNegativeCriterionServiceStub(
        CustomerNegativeCriterionServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcCustomerNegativeCriterionServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcCustomerNegativeCriterionServiceStub(
      CustomerNegativeCriterionServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCustomerNegativeCriterionServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomerNegativeCriterionServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcCustomerNegativeCriterionServiceStub(
      CustomerNegativeCriterionServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetCustomerNegativeCriterionRequest, CustomerNegativeCriterion>
        getCustomerNegativeCriterionTransportSettings =
            GrpcCallSettings
                .<GetCustomerNegativeCriterionRequest, CustomerNegativeCriterion>newBuilder()
                .setMethodDescriptor(getCustomerNegativeCriterionMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetCustomerNegativeCriterionRequest>() {
                      @Override
                      public Map<String, String> extract(
                          GetCustomerNegativeCriterionRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateCustomerNegativeCriteriaRequest, MutateCustomerNegativeCriteriaResponse>
        mutateCustomerNegativeCriteriaTransportSettings =
            GrpcCallSettings
                .<MutateCustomerNegativeCriteriaRequest, MutateCustomerNegativeCriteriaResponse>
                    newBuilder()
                .setMethodDescriptor(mutateCustomerNegativeCriteriaMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCustomerNegativeCriteriaRequest>() {
                      @Override
                      public Map<String, String> extract(
                          MutateCustomerNegativeCriteriaRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCustomerNegativeCriterionCallable =
        callableFactory.createUnaryCallable(
            getCustomerNegativeCriterionTransportSettings,
            settings.getCustomerNegativeCriterionSettings(),
            clientContext);
    this.mutateCustomerNegativeCriteriaCallable =
        callableFactory.createUnaryCallable(
            mutateCustomerNegativeCriteriaTransportSettings,
            settings.mutateCustomerNegativeCriteriaSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetCustomerNegativeCriterionRequest, CustomerNegativeCriterion>
      getCustomerNegativeCriterionCallable() {
    return getCustomerNegativeCriterionCallable;
  }

  public UnaryCallable<
          MutateCustomerNegativeCriteriaRequest, MutateCustomerNegativeCriteriaResponse>
      mutateCustomerNegativeCriteriaCallable() {
    return mutateCustomerNegativeCriteriaCallable;
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
