/*
 * Copyright 2019 Google LLC
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
package com.google.ads.googleads.v0.services.stub;

import static com.google.ads.googleads.v0.services.GoogleAdsServiceClient.SearchPagedResponse;

import com.google.ads.googleads.v0.services.MutateGoogleAdsRequest;
import com.google.ads.googleads.v0.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v0.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v0.services.SearchGoogleAdsResponse;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
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
public class GrpcGoogleAdsServiceStub extends GoogleAdsServiceStub {

  private static final MethodDescriptor<SearchGoogleAdsRequest, SearchGoogleAdsResponse>
      searchMethodDescriptor =
          MethodDescriptor.<SearchGoogleAdsRequest, SearchGoogleAdsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v0.services.GoogleAdsService/Search")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SearchGoogleAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SearchGoogleAdsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<MutateGoogleAdsRequest, MutateGoogleAdsResponse>
      mutateMethodDescriptor =
          MethodDescriptor.<MutateGoogleAdsRequest, MutateGoogleAdsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v0.services.GoogleAdsService/Mutate")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateGoogleAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateGoogleAdsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<SearchGoogleAdsRequest, SearchGoogleAdsResponse> searchCallable;
  private final UnaryCallable<SearchGoogleAdsRequest, SearchPagedResponse> searchPagedCallable;
  private final UnaryCallable<MutateGoogleAdsRequest, MutateGoogleAdsResponse> mutateCallable;

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

    GrpcCallSettings<SearchGoogleAdsRequest, SearchGoogleAdsResponse> searchTransportSettings =
        GrpcCallSettings.<SearchGoogleAdsRequest, SearchGoogleAdsResponse>newBuilder()
            .setMethodDescriptor(searchMethodDescriptor)
            .build();
    GrpcCallSettings<MutateGoogleAdsRequest, MutateGoogleAdsResponse> mutateTransportSettings =
        GrpcCallSettings.<MutateGoogleAdsRequest, MutateGoogleAdsResponse>newBuilder()
            .setMethodDescriptor(mutateMethodDescriptor)
            .build();

    this.searchCallable =
        callableFactory.createUnaryCallable(
            searchTransportSettings, settings.searchSettings(), clientContext);
    this.searchPagedCallable =
        callableFactory.createPagedCallable(
            searchTransportSettings, settings.searchSettings(), clientContext);
    this.mutateCallable =
        callableFactory.createUnaryCallable(
            mutateTransportSettings, settings.mutateSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<SearchGoogleAdsRequest, SearchPagedResponse> searchPagedCallable() {
    return searchPagedCallable;
  }

  public UnaryCallable<SearchGoogleAdsRequest, SearchGoogleAdsResponse> searchCallable() {
    return searchCallable;
  }

  public UnaryCallable<MutateGoogleAdsRequest, MutateGoogleAdsResponse> mutateCallable() {
    return mutateCallable;
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
