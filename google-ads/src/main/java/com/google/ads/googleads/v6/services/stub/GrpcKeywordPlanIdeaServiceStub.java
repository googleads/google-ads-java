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

import static com.google.ads.googleads.v6.services.KeywordPlanIdeaServiceClient.GenerateKeywordIdeasPagedResponse;

import com.google.ads.googleads.v6.services.GenerateKeywordIdeaResponse;
import com.google.ads.googleads.v6.services.GenerateKeywordIdeasRequest;
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
 * gRPC stub implementation for the KeywordPlanIdeaService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcKeywordPlanIdeaServiceStub extends KeywordPlanIdeaServiceStub {
  private static final MethodDescriptor<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>
      generateKeywordIdeasMethodDescriptor =
          MethodDescriptor.<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.KeywordPlanIdeaService/GenerateKeywordIdeas")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateKeywordIdeasRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateKeywordIdeaResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>
      generateKeywordIdeasCallable;
  private final UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeasPagedResponse>
      generateKeywordIdeasPagedCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcKeywordPlanIdeaServiceStub create(
      KeywordPlanIdeaServiceStubSettings settings) throws IOException {
    return new GrpcKeywordPlanIdeaServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcKeywordPlanIdeaServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcKeywordPlanIdeaServiceStub(
        KeywordPlanIdeaServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcKeywordPlanIdeaServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcKeywordPlanIdeaServiceStub(
        KeywordPlanIdeaServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcKeywordPlanIdeaServiceStub(
      KeywordPlanIdeaServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcKeywordPlanIdeaServiceCallableFactory());
  }

  protected GrpcKeywordPlanIdeaServiceStub(
      KeywordPlanIdeaServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>
        generateKeywordIdeasTransportSettings =
            GrpcCallSettings.<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>newBuilder()
                .setMethodDescriptor(generateKeywordIdeasMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GenerateKeywordIdeasRequest>() {
                      @Override
                      public Map<String, String> extract(GenerateKeywordIdeasRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.generateKeywordIdeasCallable =
        callableFactory.createUnaryCallable(
            generateKeywordIdeasTransportSettings,
            settings.generateKeywordIdeasSettings(),
            clientContext);
    this.generateKeywordIdeasPagedCallable =
        callableFactory.createPagedCallable(
            generateKeywordIdeasTransportSettings,
            settings.generateKeywordIdeasSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>
      generateKeywordIdeasCallable() {
    return generateKeywordIdeasCallable;
  }

  public UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeasPagedResponse>
      generateKeywordIdeasPagedCallable() {
    return generateKeywordIdeasPagedCallable;
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
