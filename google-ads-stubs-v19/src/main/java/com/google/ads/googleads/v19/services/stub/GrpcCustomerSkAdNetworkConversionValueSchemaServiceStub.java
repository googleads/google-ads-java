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

package com.google.ads.googleads.v19.services.stub;

import com.google.ads.googleads.v19.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest;
import com.google.ads.googleads.v19.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse;
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
 * gRPC stub implementation for the CustomerSkAdNetworkConversionValueSchemaService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCustomerSkAdNetworkConversionValueSchemaServiceStub
    extends CustomerSkAdNetworkConversionValueSchemaServiceStub {
  private static final MethodDescriptor<
          MutateCustomerSkAdNetworkConversionValueSchemaRequest,
          MutateCustomerSkAdNetworkConversionValueSchemaResponse>
      mutateCustomerSkAdNetworkConversionValueSchemaMethodDescriptor =
          MethodDescriptor
              .<MutateCustomerSkAdNetworkConversionValueSchemaRequest,
                  MutateCustomerSkAdNetworkConversionValueSchemaResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v19.services.CustomerSkAdNetworkConversionValueSchemaService/MutateCustomerSkAdNetworkConversionValueSchema")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      MutateCustomerSkAdNetworkConversionValueSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      MutateCustomerSkAdNetworkConversionValueSchemaResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<
          MutateCustomerSkAdNetworkConversionValueSchemaRequest,
          MutateCustomerSkAdNetworkConversionValueSchemaResponse>
      mutateCustomerSkAdNetworkConversionValueSchemaCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomerSkAdNetworkConversionValueSchemaServiceStub create(
      CustomerSkAdNetworkConversionValueSchemaServiceStubSettings settings) throws IOException {
    return new GrpcCustomerSkAdNetworkConversionValueSchemaServiceStub(
        settings, ClientContext.create(settings));
  }

  public static final GrpcCustomerSkAdNetworkConversionValueSchemaServiceStub create(
      ClientContext clientContext) throws IOException {
    return new GrpcCustomerSkAdNetworkConversionValueSchemaServiceStub(
        CustomerSkAdNetworkConversionValueSchemaServiceStubSettings.newBuilder().build(),
        clientContext);
  }

  public static final GrpcCustomerSkAdNetworkConversionValueSchemaServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomerSkAdNetworkConversionValueSchemaServiceStub(
        CustomerSkAdNetworkConversionValueSchemaServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcCustomerSkAdNetworkConversionValueSchemaServiceStub, using the
   * given settings. This is protected so that it is easy to make a subclass, but otherwise, the
   * static factory methods should be preferred.
   */
  protected GrpcCustomerSkAdNetworkConversionValueSchemaServiceStub(
      CustomerSkAdNetworkConversionValueSchemaServiceStubSettings settings,
      ClientContext clientContext)
      throws IOException {
    this(
        settings,
        clientContext,
        new GrpcCustomerSkAdNetworkConversionValueSchemaServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomerSkAdNetworkConversionValueSchemaServiceStub, using the
   * given settings. This is protected so that it is easy to make a subclass, but otherwise, the
   * static factory methods should be preferred.
   */
  protected GrpcCustomerSkAdNetworkConversionValueSchemaServiceStub(
      CustomerSkAdNetworkConversionValueSchemaServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<
            MutateCustomerSkAdNetworkConversionValueSchemaRequest,
            MutateCustomerSkAdNetworkConversionValueSchemaResponse>
        mutateCustomerSkAdNetworkConversionValueSchemaTransportSettings =
            GrpcCallSettings
                .<MutateCustomerSkAdNetworkConversionValueSchemaRequest,
                    MutateCustomerSkAdNetworkConversionValueSchemaResponse>
                    newBuilder()
                .setMethodDescriptor(mutateCustomerSkAdNetworkConversionValueSchemaMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.mutateCustomerSkAdNetworkConversionValueSchemaCallable =
        callableFactory.createUnaryCallable(
            mutateCustomerSkAdNetworkConversionValueSchemaTransportSettings,
            settings.mutateCustomerSkAdNetworkConversionValueSchemaSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<
          MutateCustomerSkAdNetworkConversionValueSchemaRequest,
          MutateCustomerSkAdNetworkConversionValueSchemaResponse>
      mutateCustomerSkAdNetworkConversionValueSchemaCallable() {
    return mutateCustomerSkAdNetworkConversionValueSchemaCallable;
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
