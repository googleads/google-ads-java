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

import com.google.ads.googleads.v7.resources.ConversionCustomVariable;
import com.google.ads.googleads.v7.services.GetConversionCustomVariableRequest;
import com.google.ads.googleads.v7.services.MutateConversionCustomVariablesRequest;
import com.google.ads.googleads.v7.services.MutateConversionCustomVariablesResponse;
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
 * gRPC stub implementation for the ConversionCustomVariableService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcConversionCustomVariableServiceStub extends ConversionCustomVariableServiceStub {
  private static final MethodDescriptor<
          GetConversionCustomVariableRequest, ConversionCustomVariable>
      getConversionCustomVariableMethodDescriptor =
          MethodDescriptor
              .<GetConversionCustomVariableRequest, ConversionCustomVariable>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v7.services.ConversionCustomVariableService/GetConversionCustomVariable")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetConversionCustomVariableRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ConversionCustomVariable.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateConversionCustomVariablesRequest, MutateConversionCustomVariablesResponse>
      mutateConversionCustomVariablesMethodDescriptor =
          MethodDescriptor
              .<MutateConversionCustomVariablesRequest, MutateConversionCustomVariablesResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v7.services.ConversionCustomVariableService/MutateConversionCustomVariables")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      MutateConversionCustomVariablesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      MutateConversionCustomVariablesResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetConversionCustomVariableRequest, ConversionCustomVariable>
      getConversionCustomVariableCallable;
  private final UnaryCallable<
          MutateConversionCustomVariablesRequest, MutateConversionCustomVariablesResponse>
      mutateConversionCustomVariablesCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcConversionCustomVariableServiceStub create(
      ConversionCustomVariableServiceStubSettings settings) throws IOException {
    return new GrpcConversionCustomVariableServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcConversionCustomVariableServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcConversionCustomVariableServiceStub(
        ConversionCustomVariableServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcConversionCustomVariableServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcConversionCustomVariableServiceStub(
        ConversionCustomVariableServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcConversionCustomVariableServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcConversionCustomVariableServiceStub(
      ConversionCustomVariableServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcConversionCustomVariableServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcConversionCustomVariableServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected GrpcConversionCustomVariableServiceStub(
      ConversionCustomVariableServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetConversionCustomVariableRequest, ConversionCustomVariable>
        getConversionCustomVariableTransportSettings =
            GrpcCallSettings
                .<GetConversionCustomVariableRequest, ConversionCustomVariable>newBuilder()
                .setMethodDescriptor(getConversionCustomVariableMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetConversionCustomVariableRequest>() {
                      @Override
                      public Map<String, String> extract(
                          GetConversionCustomVariableRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<
            MutateConversionCustomVariablesRequest, MutateConversionCustomVariablesResponse>
        mutateConversionCustomVariablesTransportSettings =
            GrpcCallSettings
                .<MutateConversionCustomVariablesRequest, MutateConversionCustomVariablesResponse>
                    newBuilder()
                .setMethodDescriptor(mutateConversionCustomVariablesMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateConversionCustomVariablesRequest>() {
                      @Override
                      public Map<String, String> extract(
                          MutateConversionCustomVariablesRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getConversionCustomVariableCallable =
        callableFactory.createUnaryCallable(
            getConversionCustomVariableTransportSettings,
            settings.getConversionCustomVariableSettings(),
            clientContext);
    this.mutateConversionCustomVariablesCallable =
        callableFactory.createUnaryCallable(
            mutateConversionCustomVariablesTransportSettings,
            settings.mutateConversionCustomVariablesSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetConversionCustomVariableRequest, ConversionCustomVariable>
      getConversionCustomVariableCallable() {
    return getConversionCustomVariableCallable;
  }

  @Override
  public UnaryCallable<
          MutateConversionCustomVariablesRequest, MutateConversionCustomVariablesResponse>
      mutateConversionCustomVariablesCallable() {
    return mutateConversionCustomVariablesCallable;
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
