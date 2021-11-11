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

import static com.google.ads.googleads.v9.services.GoogleAdsServiceClient.SearchPagedResponse;

import com.google.ads.googleads.v9.services.MutateGoogleAdsRequest;
import com.google.ads.googleads.v9.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v9.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v9.services.SearchGoogleAdsResponse;
import com.google.ads.googleads.v9.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v9.services.SearchGoogleAdsStreamResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ServerStreamingCallable;
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
 * gRPC stub implementation for the GoogleAdsService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcGoogleAdsServiceStub extends GoogleAdsServiceStub {
  private static final MethodDescriptor<SearchGoogleAdsRequest, SearchGoogleAdsResponse>
      searchMethodDescriptor =
          MethodDescriptor.<SearchGoogleAdsRequest, SearchGoogleAdsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v9.services.GoogleAdsService/Search")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SearchGoogleAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SearchGoogleAdsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<SearchGoogleAdsStreamRequest, SearchGoogleAdsStreamResponse>
      searchStreamMethodDescriptor =
          MethodDescriptor.<SearchGoogleAdsStreamRequest, SearchGoogleAdsStreamResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName("google.ads.googleads.v9.services.GoogleAdsService/SearchStream")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SearchGoogleAdsStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SearchGoogleAdsStreamResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateGoogleAdsRequest, MutateGoogleAdsResponse>
      mutateMethodDescriptor =
          MethodDescriptor.<MutateGoogleAdsRequest, MutateGoogleAdsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v9.services.GoogleAdsService/Mutate")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateGoogleAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateGoogleAdsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<SearchGoogleAdsRequest, SearchGoogleAdsResponse> searchCallable;
  private final UnaryCallable<SearchGoogleAdsRequest, SearchPagedResponse> searchPagedCallable;
  private final ServerStreamingCallable<SearchGoogleAdsStreamRequest, SearchGoogleAdsStreamResponse>
      searchStreamCallable;
  private final UnaryCallable<MutateGoogleAdsRequest, MutateGoogleAdsResponse> mutateCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcGoogleAdsServiceStub create(GoogleAdsServiceStubSettings settings)
      throws IOException {
    return new GrpcGoogleAdsServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcGoogleAdsServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcGoogleAdsServiceStub(
        GoogleAdsServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcGoogleAdsServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcGoogleAdsServiceStub(
        GoogleAdsServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcGoogleAdsServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcGoogleAdsServiceStub(
      GoogleAdsServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcGoogleAdsServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcGoogleAdsServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcGoogleAdsServiceStub(
      GoogleAdsServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<SearchGoogleAdsRequest, SearchGoogleAdsResponse> searchTransportSettings =
        GrpcCallSettings.<SearchGoogleAdsRequest, SearchGoogleAdsResponse>newBuilder()
            .setMethodDescriptor(searchMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("customer_id", String.valueOf(request.getCustomerId()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<SearchGoogleAdsStreamRequest, SearchGoogleAdsStreamResponse>
        searchStreamTransportSettings =
            GrpcCallSettings
                .<SearchGoogleAdsStreamRequest, SearchGoogleAdsStreamResponse>newBuilder()
                .setMethodDescriptor(searchStreamMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<MutateGoogleAdsRequest, MutateGoogleAdsResponse> mutateTransportSettings =
        GrpcCallSettings.<MutateGoogleAdsRequest, MutateGoogleAdsResponse>newBuilder()
            .setMethodDescriptor(mutateMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("customer_id", String.valueOf(request.getCustomerId()));
                  return params.build();
                })
            .build();

    this.searchCallable =
        callableFactory.createUnaryCallable(
            searchTransportSettings, settings.searchSettings(), clientContext);
    this.searchPagedCallable =
        callableFactory.createPagedCallable(
            searchTransportSettings, settings.searchSettings(), clientContext);
    this.searchStreamCallable =
        callableFactory.createServerStreamingCallable(
            searchStreamTransportSettings, settings.searchStreamSettings(), clientContext);
    this.mutateCallable =
        callableFactory.createUnaryCallable(
            mutateTransportSettings, settings.mutateSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<SearchGoogleAdsRequest, SearchGoogleAdsResponse> searchCallable() {
    return searchCallable;
  }

  @Override
  public UnaryCallable<SearchGoogleAdsRequest, SearchPagedResponse> searchPagedCallable() {
    return searchPagedCallable;
  }

  @Override
  public ServerStreamingCallable<SearchGoogleAdsStreamRequest, SearchGoogleAdsStreamResponse>
      searchStreamCallable() {
    return searchStreamCallable;
  }

  @Override
  public UnaryCallable<MutateGoogleAdsRequest, MutateGoogleAdsResponse> mutateCallable() {
    return mutateCallable;
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
