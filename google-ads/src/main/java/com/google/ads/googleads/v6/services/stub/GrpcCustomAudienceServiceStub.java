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

import com.google.ads.googleads.v6.resources.CustomAudience;
import com.google.ads.googleads.v6.services.GetCustomAudienceRequest;
import com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest;
import com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse;
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
 * gRPC stub implementation for the CustomAudienceService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCustomAudienceServiceStub extends CustomAudienceServiceStub {
  private static final MethodDescriptor<GetCustomAudienceRequest, CustomAudience>
      getCustomAudienceMethodDescriptor =
          MethodDescriptor.<GetCustomAudienceRequest, CustomAudience>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CustomAudienceService/GetCustomAudience")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCustomAudienceRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomAudience.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateCustomAudiencesRequest, MutateCustomAudiencesResponse>
      mutateCustomAudiencesMethodDescriptor =
          MethodDescriptor.<MutateCustomAudiencesRequest, MutateCustomAudiencesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CustomAudienceService/MutateCustomAudiences")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomAudiencesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCustomAudiencesResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetCustomAudienceRequest, CustomAudience> getCustomAudienceCallable;
  private final UnaryCallable<MutateCustomAudiencesRequest, MutateCustomAudiencesResponse>
      mutateCustomAudiencesCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomAudienceServiceStub create(
      CustomAudienceServiceStubSettings settings) throws IOException {
    return new GrpcCustomAudienceServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCustomAudienceServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCustomAudienceServiceStub(
        CustomAudienceServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomAudienceServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomAudienceServiceStub(
        CustomAudienceServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcCustomAudienceServiceStub(
      CustomAudienceServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCustomAudienceServiceCallableFactory());
  }

  protected GrpcCustomAudienceServiceStub(
      CustomAudienceServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetCustomAudienceRequest, CustomAudience> getCustomAudienceTransportSettings =
        GrpcCallSettings.<GetCustomAudienceRequest, CustomAudience>newBuilder()
            .setMethodDescriptor(getCustomAudienceMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetCustomAudienceRequest>() {
                  @Override
                  public Map<String, String> extract(GetCustomAudienceRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateCustomAudiencesRequest, MutateCustomAudiencesResponse>
        mutateCustomAudiencesTransportSettings =
            GrpcCallSettings
                .<MutateCustomAudiencesRequest, MutateCustomAudiencesResponse>newBuilder()
                .setMethodDescriptor(mutateCustomAudiencesMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateCustomAudiencesRequest>() {
                      @Override
                      public Map<String, String> extract(MutateCustomAudiencesRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getCustomAudienceCallable =
        callableFactory.createUnaryCallable(
            getCustomAudienceTransportSettings,
            settings.getCustomAudienceSettings(),
            clientContext);
    this.mutateCustomAudiencesCallable =
        callableFactory.createUnaryCallable(
            mutateCustomAudiencesTransportSettings,
            settings.mutateCustomAudiencesSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetCustomAudienceRequest, CustomAudience> getCustomAudienceCallable() {
    return getCustomAudienceCallable;
  }

  public UnaryCallable<MutateCustomAudiencesRequest, MutateCustomAudiencesResponse>
      mutateCustomAudiencesCallable() {
    return mutateCustomAudiencesCallable;
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
