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

import com.google.ads.googleads.v6.resources.CustomerUserAccessInvitation;
import com.google.ads.googleads.v6.services.GetCustomerUserAccessInvitationRequest;
import com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationRequest;
import com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationResponse;
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
 * gRPC stub implementation for the CustomerUserAccessInvitationService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCustomerUserAccessInvitationServiceStub
    extends CustomerUserAccessInvitationServiceStub {
  private static final MethodDescriptor<
          GetCustomerUserAccessInvitationRequest, CustomerUserAccessInvitation>
      getCustomerUserAccessInvitationMethodDescriptor =
          MethodDescriptor
              .<GetCustomerUserAccessInvitationRequest, CustomerUserAccessInvitation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CustomerUserAccessInvitationService/GetCustomerUserAccessInvitation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      GetCustomerUserAccessInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CustomerUserAccessInvitation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateCustomerUserAccessInvitationRequest, MutateCustomerUserAccessInvitationResponse>
      mutateCustomerUserAccessInvitationMethodDescriptor =
          MethodDescriptor
              .<MutateCustomerUserAccessInvitationRequest,
                  MutateCustomerUserAccessInvitationResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CustomerUserAccessInvitationService/MutateCustomerUserAccessInvitation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      MutateCustomerUserAccessInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      MutateCustomerUserAccessInvitationResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetCustomerUserAccessInvitationRequest, CustomerUserAccessInvitation>
      getCustomerUserAccessInvitationCallable;
  private final UnaryCallable<
          MutateCustomerUserAccessInvitationRequest, MutateCustomerUserAccessInvitationResponse>
      mutateCustomerUserAccessInvitationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomerUserAccessInvitationServiceStub create(
      CustomerUserAccessInvitationServiceStubSettings settings) throws IOException {
    return new GrpcCustomerUserAccessInvitationServiceStub(
        settings, ClientContext.create(settings));
  }

  public static final GrpcCustomerUserAccessInvitationServiceStub create(
      ClientContext clientContext) throws IOException {
    return new GrpcCustomerUserAccessInvitationServiceStub(
        CustomerUserAccessInvitationServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomerUserAccessInvitationServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomerUserAccessInvitationServiceStub(
        CustomerUserAccessInvitationServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcCustomerUserAccessInvitationServiceStub, using the given
   * settings. This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected GrpcCustomerUserAccessInvitationServiceStub(
      CustomerUserAccessInvitationServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCustomerUserAccessInvitationServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomerUserAccessInvitationServiceStub, using the given
   * settings. This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected GrpcCustomerUserAccessInvitationServiceStub(
      CustomerUserAccessInvitationServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetCustomerUserAccessInvitationRequest, CustomerUserAccessInvitation>
        getCustomerUserAccessInvitationTransportSettings =
            GrpcCallSettings
                .<GetCustomerUserAccessInvitationRequest, CustomerUserAccessInvitation>newBuilder()
                .setMethodDescriptor(getCustomerUserAccessInvitationMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetCustomerUserAccessInvitationRequest>() {
                      @Override
                      public Map<String, String> extract(
                          GetCustomerUserAccessInvitationRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<
            MutateCustomerUserAccessInvitationRequest, MutateCustomerUserAccessInvitationResponse>
        mutateCustomerUserAccessInvitationTransportSettings =
            GrpcCallSettings
                .<MutateCustomerUserAccessInvitationRequest,
                    MutateCustomerUserAccessInvitationResponse>
                    newBuilder()
                .setMethodDescriptor(mutateCustomerUserAccessInvitationMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCustomerUserAccessInvitationRequest>() {
                      @Override
                      public Map<String, String> extract(
                          MutateCustomerUserAccessInvitationRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCustomerUserAccessInvitationCallable =
        callableFactory.createUnaryCallable(
            getCustomerUserAccessInvitationTransportSettings,
            settings.getCustomerUserAccessInvitationSettings(),
            clientContext);
    this.mutateCustomerUserAccessInvitationCallable =
        callableFactory.createUnaryCallable(
            mutateCustomerUserAccessInvitationTransportSettings,
            settings.mutateCustomerUserAccessInvitationSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetCustomerUserAccessInvitationRequest, CustomerUserAccessInvitation>
      getCustomerUserAccessInvitationCallable() {
    return getCustomerUserAccessInvitationCallable;
  }

  public UnaryCallable<
          MutateCustomerUserAccessInvitationRequest, MutateCustomerUserAccessInvitationResponse>
      mutateCustomerUserAccessInvitationCallable() {
    return mutateCustomerUserAccessInvitationCallable;
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
