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

package com.google.ads.googleads.v14.services.stub;

import com.google.ads.googleads.v14.services.MutateCustomerConversionGoalsRequest;
import com.google.ads.googleads.v14.services.MutateCustomerConversionGoalsResponse;
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
 * gRPC stub implementation for the CustomerConversionGoalService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCustomerConversionGoalServiceStub extends CustomerConversionGoalServiceStub {
  private static final MethodDescriptor<
          MutateCustomerConversionGoalsRequest, MutateCustomerConversionGoalsResponse>
      mutateCustomerConversionGoalsMethodDescriptor =
          MethodDescriptor
              .<MutateCustomerConversionGoalsRequest, MutateCustomerConversionGoalsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v14.services.CustomerConversionGoalService/MutateCustomerConversionGoals")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomerConversionGoalsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCustomerConversionGoalsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<
          MutateCustomerConversionGoalsRequest, MutateCustomerConversionGoalsResponse>
      mutateCustomerConversionGoalsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomerConversionGoalServiceStub create(
      CustomerConversionGoalServiceStubSettings settings) throws IOException {
    return new GrpcCustomerConversionGoalServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCustomerConversionGoalServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCustomerConversionGoalServiceStub(
        CustomerConversionGoalServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomerConversionGoalServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomerConversionGoalServiceStub(
        CustomerConversionGoalServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcCustomerConversionGoalServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerConversionGoalServiceStub(
      CustomerConversionGoalServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCustomerConversionGoalServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomerConversionGoalServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerConversionGoalServiceStub(
      CustomerConversionGoalServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<MutateCustomerConversionGoalsRequest, MutateCustomerConversionGoalsResponse>
        mutateCustomerConversionGoalsTransportSettings =
            GrpcCallSettings
                .<MutateCustomerConversionGoalsRequest, MutateCustomerConversionGoalsResponse>
                    newBuilder()
                .setMethodDescriptor(mutateCustomerConversionGoalsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.mutateCustomerConversionGoalsCallable =
        callableFactory.createUnaryCallable(
            mutateCustomerConversionGoalsTransportSettings,
            settings.mutateCustomerConversionGoalsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<MutateCustomerConversionGoalsRequest, MutateCustomerConversionGoalsResponse>
      mutateCustomerConversionGoalsCallable() {
    return mutateCustomerConversionGoalsCallable;
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
