/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v2.services.stub;

import com.google.ads.googleads.v2.resources.MediaFile;
import com.google.ads.googleads.v2.services.GetMediaFileRequest;
import com.google.ads.googleads.v2.services.MutateMediaFilesRequest;
import com.google.ads.googleads.v2.services.MutateMediaFilesResponse;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Google Ads API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcMediaFileServiceStub extends MediaFileServiceStub {

  private static final MethodDescriptor<GetMediaFileRequest, MediaFile>
      getMediaFileMethodDescriptor =
          MethodDescriptor.<GetMediaFileRequest, MediaFile>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v2.services.MediaFileService/GetMediaFile")
              .setRequestMarshaller(ProtoUtils.marshaller(GetMediaFileRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(MediaFile.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<MutateMediaFilesRequest, MutateMediaFilesResponse>
      mutateMediaFilesMethodDescriptor =
          MethodDescriptor.<MutateMediaFilesRequest, MutateMediaFilesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v2.services.MediaFileService/MutateMediaFiles")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateMediaFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateMediaFilesResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetMediaFileRequest, MediaFile> getMediaFileCallable;
  private final UnaryCallable<MutateMediaFilesRequest, MutateMediaFilesResponse>
      mutateMediaFilesCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcMediaFileServiceStub create(MediaFileServiceStubSettings settings)
      throws IOException {
    return new GrpcMediaFileServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcMediaFileServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcMediaFileServiceStub(
        MediaFileServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcMediaFileServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcMediaFileServiceStub(
        MediaFileServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcMediaFileServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcMediaFileServiceStub(
      MediaFileServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcMediaFileServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcMediaFileServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcMediaFileServiceStub(
      MediaFileServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetMediaFileRequest, MediaFile> getMediaFileTransportSettings =
        GrpcCallSettings.<GetMediaFileRequest, MediaFile>newBuilder()
            .setMethodDescriptor(getMediaFileMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetMediaFileRequest>() {
                  @Override
                  public Map<String, String> extract(GetMediaFileRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateMediaFilesRequest, MutateMediaFilesResponse>
        mutateMediaFilesTransportSettings =
            GrpcCallSettings.<MutateMediaFilesRequest, MutateMediaFilesResponse>newBuilder()
                .setMethodDescriptor(mutateMediaFilesMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateMediaFilesRequest>() {
                      @Override
                      public Map<String, String> extract(MutateMediaFilesRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getMediaFileCallable =
        callableFactory.createUnaryCallable(
            getMediaFileTransportSettings, settings.getMediaFileSettings(), clientContext);
    this.mutateMediaFilesCallable =
        callableFactory.createUnaryCallable(
            mutateMediaFilesTransportSettings, settings.mutateMediaFilesSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetMediaFileRequest, MediaFile> getMediaFileCallable() {
    return getMediaFileCallable;
  }

  public UnaryCallable<MutateMediaFilesRequest, MutateMediaFilesResponse>
      mutateMediaFilesCallable() {
    return mutateMediaFilesCallable;
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
