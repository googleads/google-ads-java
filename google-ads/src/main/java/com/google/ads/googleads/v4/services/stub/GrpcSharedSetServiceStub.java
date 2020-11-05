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
package com.google.ads.googleads.v4.services.stub;

import com.google.ads.googleads.v4.resources.SharedSet;
import com.google.ads.googleads.v4.services.GetSharedSetRequest;
import com.google.ads.googleads.v4.services.MutateSharedSetsRequest;
import com.google.ads.googleads.v4.services.MutateSharedSetsResponse;
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
public class GrpcSharedSetServiceStub extends SharedSetServiceStub {

  private static final MethodDescriptor<GetSharedSetRequest, SharedSet>
      getSharedSetMethodDescriptor =
          MethodDescriptor.<GetSharedSetRequest, SharedSet>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v4.services.SharedSetService/GetSharedSet")
              .setRequestMarshaller(ProtoUtils.marshaller(GetSharedSetRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(SharedSet.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<MutateSharedSetsRequest, MutateSharedSetsResponse>
      mutateSharedSetsMethodDescriptor =
          MethodDescriptor.<MutateSharedSetsRequest, MutateSharedSetsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v4.services.SharedSetService/MutateSharedSets")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateSharedSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateSharedSetsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetSharedSetRequest, SharedSet> getSharedSetCallable;
  private final UnaryCallable<MutateSharedSetsRequest, MutateSharedSetsResponse>
      mutateSharedSetsCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcSharedSetServiceStub create(SharedSetServiceStubSettings settings)
      throws IOException {
    return new GrpcSharedSetServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcSharedSetServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcSharedSetServiceStub(
        SharedSetServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcSharedSetServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcSharedSetServiceStub(
        SharedSetServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcSharedSetServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcSharedSetServiceStub(
      SharedSetServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcSharedSetServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcSharedSetServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcSharedSetServiceStub(
      SharedSetServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetSharedSetRequest, SharedSet> getSharedSetTransportSettings =
        GrpcCallSettings.<GetSharedSetRequest, SharedSet>newBuilder()
            .setMethodDescriptor(getSharedSetMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetSharedSetRequest>() {
                  @Override
                  public Map<String, String> extract(GetSharedSetRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateSharedSetsRequest, MutateSharedSetsResponse>
        mutateSharedSetsTransportSettings =
            GrpcCallSettings.<MutateSharedSetsRequest, MutateSharedSetsResponse>newBuilder()
                .setMethodDescriptor(mutateSharedSetsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateSharedSetsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateSharedSetsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getSharedSetCallable =
        callableFactory.createUnaryCallable(
            getSharedSetTransportSettings, settings.getSharedSetSettings(), clientContext);
    this.mutateSharedSetsCallable =
        callableFactory.createUnaryCallable(
            mutateSharedSetsTransportSettings, settings.mutateSharedSetsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetSharedSetRequest, SharedSet> getSharedSetCallable() {
    return getSharedSetCallable;
  }

  public UnaryCallable<MutateSharedSetsRequest, MutateSharedSetsResponse>
      mutateSharedSetsCallable() {
    return mutateSharedSetsCallable;
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
