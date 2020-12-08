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

import com.google.ads.googleads.v6.resources.CustomerUserAccess;
import com.google.ads.googleads.v6.services.GetCustomerUserAccessRequest;
import com.google.ads.googleads.v6.services.MutateCustomerUserAccessRequest;
import com.google.ads.googleads.v6.services.MutateCustomerUserAccessResponse;
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
 * gRPC stub implementation for the CustomerUserAccessService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCustomerUserAccessServiceStub extends CustomerUserAccessServiceStub {
  private static final MethodDescriptor<GetCustomerUserAccessRequest, CustomerUserAccess>
      getCustomerUserAccessMethodDescriptor =
          MethodDescriptor.<GetCustomerUserAccessRequest, CustomerUserAccess>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CustomerUserAccessService/GetCustomerUserAccess")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCustomerUserAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomerUserAccess.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateCustomerUserAccessRequest, MutateCustomerUserAccessResponse>
      mutateCustomerUserAccessMethodDescriptor =
          MethodDescriptor
              .<MutateCustomerUserAccessRequest, MutateCustomerUserAccessResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CustomerUserAccessService/MutateCustomerUserAccess")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomerUserAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCustomerUserAccessResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetCustomerUserAccessRequest, CustomerUserAccess>
      getCustomerUserAccessCallable;
  private final UnaryCallable<MutateCustomerUserAccessRequest, MutateCustomerUserAccessResponse>
      mutateCustomerUserAccessCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomerUserAccessServiceStub create(
      CustomerUserAccessServiceStubSettings settings) throws IOException {
    return new GrpcCustomerUserAccessServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCustomerUserAccessServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCustomerUserAccessServiceStub(
        CustomerUserAccessServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomerUserAccessServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomerUserAccessServiceStub(
        CustomerUserAccessServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcCustomerUserAccessServiceStub(
      CustomerUserAccessServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCustomerUserAccessServiceCallableFactory());
  }

  protected GrpcCustomerUserAccessServiceStub(
      CustomerUserAccessServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetCustomerUserAccessRequest, CustomerUserAccess>
        getCustomerUserAccessTransportSettings =
            GrpcCallSettings.<GetCustomerUserAccessRequest, CustomerUserAccess>newBuilder()
                .setMethodDescriptor(getCustomerUserAccessMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetCustomerUserAccessRequest>() {
                      @Override
                      public Map<String, String> extract(GetCustomerUserAccessRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateCustomerUserAccessRequest, MutateCustomerUserAccessResponse>
        mutateCustomerUserAccessTransportSettings =
            GrpcCallSettings
                .<MutateCustomerUserAccessRequest, MutateCustomerUserAccessResponse>newBuilder()
                .setMethodDescriptor(mutateCustomerUserAccessMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCustomerUserAccessRequest>() {
                      @Override
                      public Map<String, String> extract(MutateCustomerUserAccessRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCustomerUserAccessCallable =
        callableFactory.createUnaryCallable(
            getCustomerUserAccessTransportSettings,
            settings.getCustomerUserAccessSettings(),
            clientContext);
    this.mutateCustomerUserAccessCallable =
        callableFactory.createUnaryCallable(
            mutateCustomerUserAccessTransportSettings,
            settings.mutateCustomerUserAccessSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetCustomerUserAccessRequest, CustomerUserAccess>
      getCustomerUserAccessCallable() {
    return getCustomerUserAccessCallable;
  }

  public UnaryCallable<MutateCustomerUserAccessRequest, MutateCustomerUserAccessResponse>
      mutateCustomerUserAccessCallable() {
    return mutateCustomerUserAccessCallable;
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
