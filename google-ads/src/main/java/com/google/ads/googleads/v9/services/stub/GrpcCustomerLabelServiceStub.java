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

package com.google.ads.googleads.v9.services.stub;

import com.google.ads.googleads.v9.resources.CustomerLabel;
import com.google.ads.googleads.v9.services.GetCustomerLabelRequest;
import com.google.ads.googleads.v9.services.MutateCustomerLabelsRequest;
import com.google.ads.googleads.v9.services.MutateCustomerLabelsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
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
 * gRPC stub implementation for the CustomerLabelService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCustomerLabelServiceStub extends CustomerLabelServiceStub {
  private static final MethodDescriptor<GetCustomerLabelRequest, CustomerLabel>
      getCustomerLabelMethodDescriptor =
          MethodDescriptor.<GetCustomerLabelRequest, CustomerLabel>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v9.services.CustomerLabelService/GetCustomerLabel")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCustomerLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomerLabel.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateCustomerLabelsRequest, MutateCustomerLabelsResponse>
      mutateCustomerLabelsMethodDescriptor =
          MethodDescriptor.<MutateCustomerLabelsRequest, MutateCustomerLabelsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v9.services.CustomerLabelService/MutateCustomerLabels")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomerLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCustomerLabelsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetCustomerLabelRequest, CustomerLabel> getCustomerLabelCallable;
  private final UnaryCallable<MutateCustomerLabelsRequest, MutateCustomerLabelsResponse>
      mutateCustomerLabelsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomerLabelServiceStub create(CustomerLabelServiceStubSettings settings)
      throws IOException {
    return new GrpcCustomerLabelServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCustomerLabelServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCustomerLabelServiceStub(
        CustomerLabelServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomerLabelServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomerLabelServiceStub(
        CustomerLabelServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCustomerLabelServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerLabelServiceStub(
      CustomerLabelServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCustomerLabelServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomerLabelServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCustomerLabelServiceStub(
      CustomerLabelServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetCustomerLabelRequest, CustomerLabel> getCustomerLabelTransportSettings =
        GrpcCallSettings.<GetCustomerLabelRequest, CustomerLabel>newBuilder()
            .setMethodDescriptor(getCustomerLabelMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("resource_name", String.valueOf(request.getResourceName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<MutateCustomerLabelsRequest, MutateCustomerLabelsResponse>
        mutateCustomerLabelsTransportSettings =
            GrpcCallSettings.<MutateCustomerLabelsRequest, MutateCustomerLabelsResponse>newBuilder()
                .setMethodDescriptor(mutateCustomerLabelsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();

    this.getCustomerLabelCallable =
        callableFactory.createUnaryCallable(
            getCustomerLabelTransportSettings, settings.getCustomerLabelSettings(), clientContext);
    this.mutateCustomerLabelsCallable =
        callableFactory.createUnaryCallable(
            mutateCustomerLabelsTransportSettings,
            settings.mutateCustomerLabelsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetCustomerLabelRequest, CustomerLabel> getCustomerLabelCallable() {
    return getCustomerLabelCallable;
  }

  @Override
  public UnaryCallable<MutateCustomerLabelsRequest, MutateCustomerLabelsResponse>
      mutateCustomerLabelsCallable() {
    return mutateCustomerLabelsCallable;
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
