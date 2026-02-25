/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v23.services.stub;

import com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest;
import com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse;
import com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest;
import com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse;
import com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest;
import com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse;
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
 * gRPC stub implementation for the YouTubeVideoUploadService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcYouTubeVideoUploadServiceStub extends YouTubeVideoUploadServiceStub {
  private static final MethodDescriptor<
          CreateYouTubeVideoUploadRequest, CreateYouTubeVideoUploadResponse>
      createYouTubeVideoUploadMethodDescriptor =
          MethodDescriptor
              .<CreateYouTubeVideoUploadRequest, CreateYouTubeVideoUploadResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v23.services.YouTubeVideoUploadService/CreateYouTubeVideoUpload")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateYouTubeVideoUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CreateYouTubeVideoUploadResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<
          UpdateYouTubeVideoUploadRequest, UpdateYouTubeVideoUploadResponse>
      updateYouTubeVideoUploadMethodDescriptor =
          MethodDescriptor
              .<UpdateYouTubeVideoUploadRequest, UpdateYouTubeVideoUploadResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v23.services.YouTubeVideoUploadService/UpdateYouTubeVideoUpload")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateYouTubeVideoUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(UpdateYouTubeVideoUploadResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<
          RemoveYouTubeVideoUploadRequest, RemoveYouTubeVideoUploadResponse>
      removeYouTubeVideoUploadMethodDescriptor =
          MethodDescriptor
              .<RemoveYouTubeVideoUploadRequest, RemoveYouTubeVideoUploadResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v23.services.YouTubeVideoUploadService/RemoveYouTubeVideoUpload")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(RemoveYouTubeVideoUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(RemoveYouTubeVideoUploadResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private final UnaryCallable<CreateYouTubeVideoUploadRequest, CreateYouTubeVideoUploadResponse>
      createYouTubeVideoUploadCallable;
  private final UnaryCallable<UpdateYouTubeVideoUploadRequest, UpdateYouTubeVideoUploadResponse>
      updateYouTubeVideoUploadCallable;
  private final UnaryCallable<RemoveYouTubeVideoUploadRequest, RemoveYouTubeVideoUploadResponse>
      removeYouTubeVideoUploadCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcYouTubeVideoUploadServiceStub create(
      YouTubeVideoUploadServiceStubSettings settings) throws IOException {
    return new GrpcYouTubeVideoUploadServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcYouTubeVideoUploadServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcYouTubeVideoUploadServiceStub(
        YouTubeVideoUploadServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcYouTubeVideoUploadServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcYouTubeVideoUploadServiceStub(
        YouTubeVideoUploadServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcYouTubeVideoUploadServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcYouTubeVideoUploadServiceStub(
      YouTubeVideoUploadServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcYouTubeVideoUploadServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcYouTubeVideoUploadServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcYouTubeVideoUploadServiceStub(
      YouTubeVideoUploadServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateYouTubeVideoUploadRequest, CreateYouTubeVideoUploadResponse>
        createYouTubeVideoUploadTransportSettings =
            GrpcCallSettings
                .<CreateYouTubeVideoUploadRequest, CreateYouTubeVideoUploadResponse>newBuilder()
                .setMethodDescriptor(createYouTubeVideoUploadMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<UpdateYouTubeVideoUploadRequest, UpdateYouTubeVideoUploadResponse>
        updateYouTubeVideoUploadTransportSettings =
            GrpcCallSettings
                .<UpdateYouTubeVideoUploadRequest, UpdateYouTubeVideoUploadResponse>newBuilder()
                .setMethodDescriptor(updateYouTubeVideoUploadMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<RemoveYouTubeVideoUploadRequest, RemoveYouTubeVideoUploadResponse>
        removeYouTubeVideoUploadTransportSettings =
            GrpcCallSettings
                .<RemoveYouTubeVideoUploadRequest, RemoveYouTubeVideoUploadResponse>newBuilder()
                .setMethodDescriptor(removeYouTubeVideoUploadMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.createYouTubeVideoUploadCallable =
        callableFactory.createUnaryCallable(
            createYouTubeVideoUploadTransportSettings,
            settings.createYouTubeVideoUploadSettings(),
            clientContext);
    this.updateYouTubeVideoUploadCallable =
        callableFactory.createUnaryCallable(
            updateYouTubeVideoUploadTransportSettings,
            settings.updateYouTubeVideoUploadSettings(),
            clientContext);
    this.removeYouTubeVideoUploadCallable =
        callableFactory.createUnaryCallable(
            removeYouTubeVideoUploadTransportSettings,
            settings.removeYouTubeVideoUploadSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<CreateYouTubeVideoUploadRequest, CreateYouTubeVideoUploadResponse>
      createYouTubeVideoUploadCallable() {
    return createYouTubeVideoUploadCallable;
  }

  @Override
  public UnaryCallable<UpdateYouTubeVideoUploadRequest, UpdateYouTubeVideoUploadResponse>
      updateYouTubeVideoUploadCallable() {
    return updateYouTubeVideoUploadCallable;
  }

  @Override
  public UnaryCallable<RemoveYouTubeVideoUploadRequest, RemoveYouTubeVideoUploadResponse>
      removeYouTubeVideoUploadCallable() {
    return removeYouTubeVideoUploadCallable;
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
