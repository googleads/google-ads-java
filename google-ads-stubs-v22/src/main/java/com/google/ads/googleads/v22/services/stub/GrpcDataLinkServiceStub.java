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

import com.google.ads.googleads.v22.services.CreateDataLinkRequest;
import com.google.ads.googleads.v22.services.CreateDataLinkResponse;
import com.google.ads.googleads.v22.services.RemoveDataLinkRequest;
import com.google.ads.googleads.v22.services.RemoveDataLinkResponse;
import com.google.ads.googleads.v22.services.UpdateDataLinkRequest;
import com.google.ads.googleads.v22.services.UpdateDataLinkResponse;
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
 * gRPC stub implementation for the DataLinkService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcDataLinkServiceStub extends DataLinkServiceStub {
  private static final MethodDescriptor<CreateDataLinkRequest, CreateDataLinkResponse>
      createDataLinkMethodDescriptor =
          MethodDescriptor.<CreateDataLinkRequest, CreateDataLinkResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v22.services.DataLinkService/CreateDataLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateDataLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CreateDataLinkResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<RemoveDataLinkRequest, RemoveDataLinkResponse>
      removeDataLinkMethodDescriptor =
          MethodDescriptor.<RemoveDataLinkRequest, RemoveDataLinkResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v22.services.DataLinkService/RemoveDataLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(RemoveDataLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(RemoveDataLinkResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<UpdateDataLinkRequest, UpdateDataLinkResponse>
      updateDataLinkMethodDescriptor =
          MethodDescriptor.<UpdateDataLinkRequest, UpdateDataLinkResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v22.services.DataLinkService/UpdateDataLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateDataLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(UpdateDataLinkResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private final UnaryCallable<CreateDataLinkRequest, CreateDataLinkResponse> createDataLinkCallable;
  private final UnaryCallable<RemoveDataLinkRequest, RemoveDataLinkResponse> removeDataLinkCallable;
  private final UnaryCallable<UpdateDataLinkRequest, UpdateDataLinkResponse> updateDataLinkCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcDataLinkServiceStub create(DataLinkServiceStubSettings settings)
      throws IOException {
    return new GrpcDataLinkServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcDataLinkServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcDataLinkServiceStub(
        DataLinkServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcDataLinkServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcDataLinkServiceStub(
        DataLinkServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcDataLinkServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcDataLinkServiceStub(
      DataLinkServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcDataLinkServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcDataLinkServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcDataLinkServiceStub(
      DataLinkServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateDataLinkRequest, CreateDataLinkResponse>
        createDataLinkTransportSettings =
            GrpcCallSettings.<CreateDataLinkRequest, CreateDataLinkResponse>newBuilder()
                .setMethodDescriptor(createDataLinkMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<RemoveDataLinkRequest, RemoveDataLinkResponse>
        removeDataLinkTransportSettings =
            GrpcCallSettings.<RemoveDataLinkRequest, RemoveDataLinkResponse>newBuilder()
                .setMethodDescriptor(removeDataLinkMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<UpdateDataLinkRequest, UpdateDataLinkResponse>
        updateDataLinkTransportSettings =
            GrpcCallSettings.<UpdateDataLinkRequest, UpdateDataLinkResponse>newBuilder()
                .setMethodDescriptor(updateDataLinkMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.createDataLinkCallable =
        callableFactory.createUnaryCallable(
            createDataLinkTransportSettings, settings.createDataLinkSettings(), clientContext);
    this.removeDataLinkCallable =
        callableFactory.createUnaryCallable(
            removeDataLinkTransportSettings, settings.removeDataLinkSettings(), clientContext);
    this.updateDataLinkCallable =
        callableFactory.createUnaryCallable(
            updateDataLinkTransportSettings, settings.updateDataLinkSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<CreateDataLinkRequest, CreateDataLinkResponse> createDataLinkCallable() {
    return createDataLinkCallable;
  }

  @Override
  public UnaryCallable<RemoveDataLinkRequest, RemoveDataLinkResponse> removeDataLinkCallable() {
    return removeDataLinkCallable;
  }

  @Override
  public UnaryCallable<UpdateDataLinkRequest, UpdateDataLinkResponse> updateDataLinkCallable() {
    return updateDataLinkCallable;
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
