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

package com.google.ads.googleads.v21.services.stub;

import com.google.ads.googleads.v21.services.UploadCallConversionsRequest;
import com.google.ads.googleads.v21.services.UploadCallConversionsResponse;
import com.google.ads.googleads.v21.services.UploadClickConversionsRequest;
import com.google.ads.googleads.v21.services.UploadClickConversionsResponse;
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
 * gRPC stub implementation for the ConversionUploadService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcConversionUploadServiceStub extends ConversionUploadServiceStub {
  private static final MethodDescriptor<
          UploadClickConversionsRequest, UploadClickConversionsResponse>
      uploadClickConversionsMethodDescriptor =
          MethodDescriptor
              .<UploadClickConversionsRequest, UploadClickConversionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v21.services.ConversionUploadService/UploadClickConversions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UploadClickConversionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(UploadClickConversionsResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<UploadCallConversionsRequest, UploadCallConversionsResponse>
      uploadCallConversionsMethodDescriptor =
          MethodDescriptor.<UploadCallConversionsRequest, UploadCallConversionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v21.services.ConversionUploadService/UploadCallConversions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UploadCallConversionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(UploadCallConversionsResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private final UnaryCallable<UploadClickConversionsRequest, UploadClickConversionsResponse>
      uploadClickConversionsCallable;
  private final UnaryCallable<UploadCallConversionsRequest, UploadCallConversionsResponse>
      uploadCallConversionsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcConversionUploadServiceStub create(
      ConversionUploadServiceStubSettings settings) throws IOException {
    return new GrpcConversionUploadServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcConversionUploadServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcConversionUploadServiceStub(
        ConversionUploadServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcConversionUploadServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcConversionUploadServiceStub(
        ConversionUploadServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcConversionUploadServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcConversionUploadServiceStub(
      ConversionUploadServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcConversionUploadServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcConversionUploadServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcConversionUploadServiceStub(
      ConversionUploadServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<UploadClickConversionsRequest, UploadClickConversionsResponse>
        uploadClickConversionsTransportSettings =
            GrpcCallSettings
                .<UploadClickConversionsRequest, UploadClickConversionsResponse>newBuilder()
                .setMethodDescriptor(uploadClickConversionsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<UploadCallConversionsRequest, UploadCallConversionsResponse>
        uploadCallConversionsTransportSettings =
            GrpcCallSettings
                .<UploadCallConversionsRequest, UploadCallConversionsResponse>newBuilder()
                .setMethodDescriptor(uploadCallConversionsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.uploadClickConversionsCallable =
        callableFactory.createUnaryCallable(
            uploadClickConversionsTransportSettings,
            settings.uploadClickConversionsSettings(),
            clientContext);
    this.uploadCallConversionsCallable =
        callableFactory.createUnaryCallable(
            uploadCallConversionsTransportSettings,
            settings.uploadCallConversionsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<UploadClickConversionsRequest, UploadClickConversionsResponse>
      uploadClickConversionsCallable() {
    return uploadClickConversionsCallable;
  }

  @Override
  public UnaryCallable<UploadCallConversionsRequest, UploadCallConversionsResponse>
      uploadCallConversionsCallable() {
    return uploadCallConversionsCallable;
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
