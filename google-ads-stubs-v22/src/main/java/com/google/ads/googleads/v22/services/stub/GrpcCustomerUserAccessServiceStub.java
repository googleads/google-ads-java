/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v22.services.stub;

import com.google.ads.googleads.v22.services.MutateCustomerUserAccessRequest;
import com.google.ads.googleads.v22.services.MutateCustomerUserAccessResponse;
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
 * gRPC stub implementation for the CustomerUserAccessService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCustomerUserAccessServiceStub extends CustomerUserAccessServiceStub {
  private static final MethodDescriptor<
          MutateCustomerUserAccessRequest, MutateCustomerUserAccessResponse>
      mutateCustomerUserAccessMethodDescriptor =
          MethodDescriptor
              .<MutateCustomerUserAccessRequest, MutateCustomerUserAccessResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v22.services.CustomerUserAccessService/MutateCustomerUserAccess")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomerUserAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCustomerUserAccessResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

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

  /**
   * Constructs an instance of GrpcCustomerUserAccessServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerUserAccessServiceStub(
      CustomerUserAccessServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCustomerUserAccessServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomerUserAccessServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerUserAccessServiceStub(
      CustomerUserAccessServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<MutateCustomerUserAccessRequest, MutateCustomerUserAccessResponse>
        mutateCustomerUserAccessTransportSettings =
            GrpcCallSettings
                .<MutateCustomerUserAccessRequest, MutateCustomerUserAccessResponse>newBuilder()
                .setMethodDescriptor(mutateCustomerUserAccessMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

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

  @Override
  public UnaryCallable<MutateCustomerUserAccessRequest, MutateCustomerUserAccessResponse>
      mutateCustomerUserAccessCallable() {
    return mutateCustomerUserAccessCallable;
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
