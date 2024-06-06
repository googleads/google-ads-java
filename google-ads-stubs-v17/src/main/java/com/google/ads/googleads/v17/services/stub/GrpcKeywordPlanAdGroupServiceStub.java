/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v17.services.stub;

import com.google.ads.googleads.v17.services.MutateKeywordPlanAdGroupsRequest;
import com.google.ads.googleads.v17.services.MutateKeywordPlanAdGroupsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the KeywordPlanAdGroupService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcKeywordPlanAdGroupServiceStub extends KeywordPlanAdGroupServiceStub {
  private static final MethodDescriptor<
          MutateKeywordPlanAdGroupsRequest, MutateKeywordPlanAdGroupsResponse>
      mutateKeywordPlanAdGroupsMethodDescriptor =
          MethodDescriptor
              .<MutateKeywordPlanAdGroupsRequest, MutateKeywordPlanAdGroupsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v17.services.KeywordPlanAdGroupService/MutateKeywordPlanAdGroups")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateKeywordPlanAdGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateKeywordPlanAdGroupsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<MutateKeywordPlanAdGroupsRequest, MutateKeywordPlanAdGroupsResponse>
      mutateKeywordPlanAdGroupsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcKeywordPlanAdGroupServiceStub create(
      KeywordPlanAdGroupServiceStubSettings settings) throws IOException {
    return new GrpcKeywordPlanAdGroupServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcKeywordPlanAdGroupServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcKeywordPlanAdGroupServiceStub(
        KeywordPlanAdGroupServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcKeywordPlanAdGroupServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcKeywordPlanAdGroupServiceStub(
        KeywordPlanAdGroupServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcKeywordPlanAdGroupServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcKeywordPlanAdGroupServiceStub(
      KeywordPlanAdGroupServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcKeywordPlanAdGroupServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcKeywordPlanAdGroupServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcKeywordPlanAdGroupServiceStub(
      KeywordPlanAdGroupServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<MutateKeywordPlanAdGroupsRequest, MutateKeywordPlanAdGroupsResponse>
        mutateKeywordPlanAdGroupsTransportSettings =
            GrpcCallSettings
                .<MutateKeywordPlanAdGroupsRequest, MutateKeywordPlanAdGroupsResponse>newBuilder()
                .setMethodDescriptor(mutateKeywordPlanAdGroupsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.mutateKeywordPlanAdGroupsCallable =
        callableFactory.createUnaryCallable(
            mutateKeywordPlanAdGroupsTransportSettings,
            settings.mutateKeywordPlanAdGroupsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<MutateKeywordPlanAdGroupsRequest, MutateKeywordPlanAdGroupsResponse>
      mutateKeywordPlanAdGroupsCallable() {
    return mutateKeywordPlanAdGroupsCallable;
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
