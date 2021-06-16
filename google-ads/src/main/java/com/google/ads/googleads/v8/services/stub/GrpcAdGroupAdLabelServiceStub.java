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

package com.google.ads.googleads.v8.services.stub;

import com.google.ads.googleads.v8.resources.AdGroupAdLabel;
import com.google.ads.googleads.v8.services.GetAdGroupAdLabelRequest;
import com.google.ads.googleads.v8.services.MutateAdGroupAdLabelsRequest;
import com.google.ads.googleads.v8.services.MutateAdGroupAdLabelsResponse;
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
 * gRPC stub implementation for the AdGroupAdLabelService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcAdGroupAdLabelServiceStub extends AdGroupAdLabelServiceStub {
  private static final MethodDescriptor<GetAdGroupAdLabelRequest, AdGroupAdLabel>
      getAdGroupAdLabelMethodDescriptor =
          MethodDescriptor.<GetAdGroupAdLabelRequest, AdGroupAdLabel>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v8.services.AdGroupAdLabelService/GetAdGroupAdLabel")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAdGroupAdLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AdGroupAdLabel.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<MutateAdGroupAdLabelsRequest, MutateAdGroupAdLabelsResponse>
      mutateAdGroupAdLabelsMethodDescriptor =
          MethodDescriptor.<MutateAdGroupAdLabelsRequest, MutateAdGroupAdLabelsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v8.services.AdGroupAdLabelService/MutateAdGroupAdLabels")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupAdLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupAdLabelsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetAdGroupAdLabelRequest, AdGroupAdLabel> getAdGroupAdLabelCallable;
  private final UnaryCallable<MutateAdGroupAdLabelsRequest, MutateAdGroupAdLabelsResponse>
      mutateAdGroupAdLabelsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAdGroupAdLabelServiceStub create(
      AdGroupAdLabelServiceStubSettings settings) throws IOException {
    return new GrpcAdGroupAdLabelServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAdGroupAdLabelServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAdGroupAdLabelServiceStub(
        AdGroupAdLabelServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAdGroupAdLabelServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAdGroupAdLabelServiceStub(
        AdGroupAdLabelServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAdGroupAdLabelServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAdGroupAdLabelServiceStub(
      AdGroupAdLabelServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcAdGroupAdLabelServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAdGroupAdLabelServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAdGroupAdLabelServiceStub(
      AdGroupAdLabelServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetAdGroupAdLabelRequest, AdGroupAdLabel> getAdGroupAdLabelTransportSettings =
        GrpcCallSettings.<GetAdGroupAdLabelRequest, AdGroupAdLabel>newBuilder()
            .setMethodDescriptor(getAdGroupAdLabelMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetAdGroupAdLabelRequest>() {
                  @Override
                  public Map<String, String> extract(GetAdGroupAdLabelRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("resource_name", String.valueOf(request.getResourceName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<MutateAdGroupAdLabelsRequest, MutateAdGroupAdLabelsResponse>
        mutateAdGroupAdLabelsTransportSettings =
            GrpcCallSettings
                .<MutateAdGroupAdLabelsRequest, MutateAdGroupAdLabelsResponse>newBuilder()
                .setMethodDescriptor(mutateAdGroupAdLabelsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateAdGroupAdLabelsRequest>() {
                      @Override
                      public Map<String, String> extract(MutateAdGroupAdLabelsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getAdGroupAdLabelCallable =
        callableFactory.createUnaryCallable(
            getAdGroupAdLabelTransportSettings,
            settings.getAdGroupAdLabelSettings(),
            clientContext);
    this.mutateAdGroupAdLabelsCallable =
        callableFactory.createUnaryCallable(
            mutateAdGroupAdLabelsTransportSettings,
            settings.mutateAdGroupAdLabelsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetAdGroupAdLabelRequest, AdGroupAdLabel> getAdGroupAdLabelCallable() {
    return getAdGroupAdLabelCallable;
  }

  @Override
  public UnaryCallable<MutateAdGroupAdLabelsRequest, MutateAdGroupAdLabelsResponse>
      mutateAdGroupAdLabelsCallable() {
    return mutateAdGroupAdLabelsCallable;
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
