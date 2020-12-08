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

import com.google.ads.googleads.v6.resources.CombinedAudience;
import com.google.ads.googleads.v6.services.GetCombinedAudienceRequest;
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
 * gRPC stub implementation for the CombinedAudienceService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCombinedAudienceServiceStub extends CombinedAudienceServiceStub {
  private static final MethodDescriptor<GetCombinedAudienceRequest, CombinedAudience>
      getCombinedAudienceMethodDescriptor =
          MethodDescriptor.<GetCombinedAudienceRequest, CombinedAudience>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.CombinedAudienceService/GetCombinedAudience")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCombinedAudienceRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CombinedAudience.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetCombinedAudienceRequest, CombinedAudience>
      getCombinedAudienceCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCombinedAudienceServiceStub create(
      CombinedAudienceServiceStubSettings settings) throws IOException {
    return new GrpcCombinedAudienceServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCombinedAudienceServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCombinedAudienceServiceStub(
        CombinedAudienceServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCombinedAudienceServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCombinedAudienceServiceStub(
        CombinedAudienceServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcCombinedAudienceServiceStub(
      CombinedAudienceServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCombinedAudienceServiceCallableFactory());
  }

  protected GrpcCombinedAudienceServiceStub(
      CombinedAudienceServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetCombinedAudienceRequest, CombinedAudience>
        getCombinedAudienceTransportSettings =
            GrpcCallSettings.<GetCombinedAudienceRequest, CombinedAudience>newBuilder()
                .setMethodDescriptor(getCombinedAudienceMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetCombinedAudienceRequest>() {
                      @Override
                      public Map<String, String> extract(GetCombinedAudienceRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();

    this.getCombinedAudienceCallable =
        callableFactory.createUnaryCallable(
            getCombinedAudienceTransportSettings,
            settings.getCombinedAudienceSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetCombinedAudienceRequest, CombinedAudience> getCombinedAudienceCallable() {
    return getCombinedAudienceCallable;
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
