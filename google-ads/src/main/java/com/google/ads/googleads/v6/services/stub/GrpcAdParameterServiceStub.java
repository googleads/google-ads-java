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

import com.google.ads.googleads.v6.resources.AdParameter;
import com.google.ads.googleads.v6.services.GetAdParameterRequest;
import com.google.ads.googleads.v6.services.MutateAdParametersRequest;
import com.google.ads.googleads.v6.services.MutateAdParametersResponse;
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
 * gRPC stub implementation for the AdParameterService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcAdParameterServiceStub extends AdParameterServiceStub {
  private static final MethodDescriptor<GetAdParameterRequest, AdParameter>
      getAdParameterMethodDescriptor =
          MethodDescriptor.<GetAdParameterRequest, AdParameter>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.AdParameterService/GetAdParameter")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAdParameterRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AdParameter.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateAdParametersRequest, MutateAdParametersResponse>
      mutateAdParametersMethodDescriptor =
          MethodDescriptor.<MutateAdParametersRequest, MutateAdParametersResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.AdParameterService/MutateAdParameters")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateAdParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateAdParametersResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetAdParameterRequest, AdParameter> getAdParameterCallable;
  private final UnaryCallable<MutateAdParametersRequest, MutateAdParametersResponse>
      mutateAdParametersCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAdParameterServiceStub create(AdParameterServiceStubSettings settings)
      throws IOException {
    return new GrpcAdParameterServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAdParameterServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAdParameterServiceStub(
        AdParameterServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAdParameterServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAdParameterServiceStub(
        AdParameterServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcAdParameterServiceStub(
      AdParameterServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcAdParameterServiceCallableFactory());
  }

  protected GrpcAdParameterServiceStub(
      AdParameterServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetAdParameterRequest, AdParameter> getAdParameterTransportSettings =
        GrpcCallSettings.<GetAdParameterRequest, AdParameter>newBuilder()
            .setMethodDescriptor(getAdParameterMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetAdParameterRequest>() {
                  @Override
                  public Map<String, String> extract(GetAdParameterRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateAdParametersRequest, MutateAdParametersResponse>
        mutateAdParametersTransportSettings =
            GrpcCallSettings.<MutateAdParametersRequest, MutateAdParametersResponse>newBuilder()
                .setMethodDescriptor(mutateAdParametersMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateAdParametersRequest>() {
                      @Override
                      public Map<String, String> extract(MutateAdParametersRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getAdParameterCallable =
        callableFactory.createUnaryCallable(
            getAdParameterTransportSettings, settings.getAdParameterSettings(), clientContext);
    this.mutateAdParametersCallable =
        callableFactory.createUnaryCallable(
            mutateAdParametersTransportSettings,
            settings.mutateAdParametersSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetAdParameterRequest, AdParameter> getAdParameterCallable() {
    return getAdParameterCallable;
  }

  public UnaryCallable<MutateAdParametersRequest, MutateAdParametersResponse>
      mutateAdParametersCallable() {
    return mutateAdParametersCallable;
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
