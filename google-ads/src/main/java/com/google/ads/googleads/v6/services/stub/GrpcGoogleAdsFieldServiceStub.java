/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services.stub;

import static com.google.ads.googleads.v6.services.GoogleAdsFieldServiceClient.SearchGoogleAdsFieldsPagedResponse;

import com.google.ads.googleads.v6.resources.GoogleAdsField;
import com.google.ads.googleads.v6.services.GetGoogleAdsFieldRequest;
import com.google.ads.googleads.v6.services.SearchGoogleAdsFieldsRequest;
import com.google.ads.googleads.v6.services.SearchGoogleAdsFieldsResponse;
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
 * gRPC stub implementation for the GoogleAdsFieldService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcGoogleAdsFieldServiceStub extends GoogleAdsFieldServiceStub {
  private static final MethodDescriptor<GetGoogleAdsFieldRequest, GoogleAdsField>
      getGoogleAdsFieldMethodDescriptor =
          MethodDescriptor.<GetGoogleAdsFieldRequest, GoogleAdsField>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.GoogleAdsFieldService/GetGoogleAdsField")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetGoogleAdsFieldRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(GoogleAdsField.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsResponse>
      searchGoogleAdsFieldsMethodDescriptor =
          MethodDescriptor.<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.GoogleAdsFieldService/SearchGoogleAdsFields")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SearchGoogleAdsFieldsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SearchGoogleAdsFieldsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetGoogleAdsFieldRequest, GoogleAdsField> getGoogleAdsFieldCallable;
  private final UnaryCallable<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsResponse>
      searchGoogleAdsFieldsCallable;
  private final UnaryCallable<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsPagedResponse>
      searchGoogleAdsFieldsPagedCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcGoogleAdsFieldServiceStub create(
      GoogleAdsFieldServiceStubSettings settings) throws IOException {
    return new GrpcGoogleAdsFieldServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcGoogleAdsFieldServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcGoogleAdsFieldServiceStub(
        GoogleAdsFieldServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcGoogleAdsFieldServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcGoogleAdsFieldServiceStub(
        GoogleAdsFieldServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcGoogleAdsFieldServiceStub(
      GoogleAdsFieldServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcGoogleAdsFieldServiceCallableFactory());
  }

  protected GrpcGoogleAdsFieldServiceStub(
      GoogleAdsFieldServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetGoogleAdsFieldRequest, GoogleAdsField> getGoogleAdsFieldTransportSettings =
        GrpcCallSettings.<GetGoogleAdsFieldRequest, GoogleAdsField>newBuilder()
            .setMethodDescriptor(getGoogleAdsFieldMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetGoogleAdsFieldRequest>() {
                  @Override
                  public Map<String, String> extract(GetGoogleAdsFieldRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsResponse>
        searchGoogleAdsFieldsTransportSettings =
            GrpcCallSettings
                .<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsResponse>newBuilder()
                .setMethodDescriptor(searchGoogleAdsFieldsMethodDescriptor)
                .build();

    this.getGoogleAdsFieldCallable =
        callableFactory.createUnaryCallable(
            getGoogleAdsFieldTransportSettings,
            settings.getGoogleAdsFieldSettings(),
            clientContext);
    this.searchGoogleAdsFieldsCallable =
        callableFactory.createUnaryCallable(
            searchGoogleAdsFieldsTransportSettings,
            settings.searchGoogleAdsFieldsSettings(),
            clientContext);
    this.searchGoogleAdsFieldsPagedCallable =
        callableFactory.createPagedCallable(
            searchGoogleAdsFieldsTransportSettings,
            settings.searchGoogleAdsFieldsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetGoogleAdsFieldRequest, GoogleAdsField> getGoogleAdsFieldCallable() {
    return getGoogleAdsFieldCallable;
  }

  public UnaryCallable<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsResponse>
      searchGoogleAdsFieldsCallable() {
    return searchGoogleAdsFieldsCallable;
  }

  public UnaryCallable<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsPagedResponse>
      searchGoogleAdsFieldsPagedCallable() {
    return searchGoogleAdsFieldsPagedCallable;
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
