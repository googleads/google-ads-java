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

package com.google.ads.googleads.v26.services.stub;

import com.google.ads.googleads.v26.services.CreateYouTubeVideoUploadRequest;
import com.google.ads.googleads.v26.services.CreateYouTubeVideoUploadResponse;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ResumableUploadCallable;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.jspecify.annotations.NullMarked;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub transport for the resumable upload methods of YouTubeVideoUploadService.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
@InternalApi
@NullMarked
class HttpJsonYouTubeVideoUploadServiceResumableUploadStub implements BackgroundResource {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<
          CreateYouTubeVideoUploadRequest, CreateYouTubeVideoUploadResponse>
      createYouTubeVideoUploadMethodDescriptor =
          ApiMethodDescriptor
              .<CreateYouTubeVideoUploadRequest, CreateYouTubeVideoUploadResponse>newBuilder()
              .setFullMethodName(
                  "google.ads.googleads.v26.services.YouTubeVideoUploadService/CreateYouTubeVideoUpload")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateYouTubeVideoUploadRequest>newBuilder()
                      .setPath(
                          "/resumable/upload/v26/customers/{customerId=*}/youTubeVideoUploads:create",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateYouTubeVideoUploadRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "customerId", request.getCustomerId());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateYouTubeVideoUploadRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "*", request.toBuilder().clearCustomerId().build(), false))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<CreateYouTubeVideoUploadResponse>newBuilder()
                      .setDefaultInstance(CreateYouTubeVideoUploadResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final BackgroundResource backgroundResources;
  private final ResumableUploadCallable<
          CreateYouTubeVideoUploadRequest, CreateYouTubeVideoUploadResponse>
      createYouTubeVideoUploadCallable;

  public static HttpJsonYouTubeVideoUploadServiceResumableUploadStub create(
      YouTubeVideoUploadServiceStubSettings settings) throws IOException {
    if (settings
        .getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return new HttpJsonYouTubeVideoUploadServiceResumableUploadStub(
          ClientContext.create(settings), settings);
    }
    return new HttpJsonYouTubeVideoUploadServiceResumableUploadStub(
        deriveHttpJsonClientContext(settings), settings);
  }

  private static ClientContext deriveHttpJsonClientContext(
      YouTubeVideoUploadServiceStubSettings settings) throws IOException {
    return ClientContext.create(
        settings
            .toBuilder()
            .setHttpJsonInternalHeaderProvider(
                ApiClientHeaderProvider.newBuilder()
                    .setGeneratedLibToken(
                        "gapic",
                        GaxProperties.getLibraryVersion(
                            YouTubeVideoUploadServiceStubSettings.class))
                    .setTransportToken(
                        GaxHttpJsonProperties.getHttpJsonTokenName(),
                        GaxHttpJsonProperties.getHttpJsonVersion())
                    .build())
            .setTransportChannelProvider(InstantiatingHttpJsonChannelProvider.newBuilder().build())
            .build());
  }

  private HttpJsonYouTubeVideoUploadServiceResumableUploadStub(
      ClientContext clientContext, YouTubeVideoUploadServiceStubSettings settings) {
    HttpJsonCallSettings<CreateYouTubeVideoUploadRequest, CreateYouTubeVideoUploadResponse>
        createYouTubeVideoUploadTransportSettings =
            HttpJsonCallSettings
                .<CreateYouTubeVideoUploadRequest, CreateYouTubeVideoUploadResponse>newBuilder()
                .setMethodDescriptor(createYouTubeVideoUploadMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    this.createYouTubeVideoUploadCallable =
        HttpJsonCallableFactory.createResumableUploadCallable(
            createYouTubeVideoUploadTransportSettings,
            settings.createYouTubeVideoUploadSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public ResumableUploadCallable<CreateYouTubeVideoUploadRequest, CreateYouTubeVideoUploadResponse>
      createYouTubeVideoUploadCallable() {
    return createYouTubeVideoUploadCallable;
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
