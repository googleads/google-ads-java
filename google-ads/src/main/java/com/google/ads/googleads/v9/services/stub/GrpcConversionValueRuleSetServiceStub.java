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

import com.google.ads.googleads.v9.resources.ConversionValueRuleSet;
import com.google.ads.googleads.v9.services.GetConversionValueRuleSetRequest;
import com.google.ads.googleads.v9.services.MutateConversionValueRuleSetsRequest;
import com.google.ads.googleads.v9.services.MutateConversionValueRuleSetsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
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
 * gRPC stub implementation for the ConversionValueRuleSetService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcConversionValueRuleSetServiceStub extends ConversionValueRuleSetServiceStub {
  private static final MethodDescriptor<GetConversionValueRuleSetRequest, ConversionValueRuleSet>
      getConversionValueRuleSetMethodDescriptor =
          MethodDescriptor.<GetConversionValueRuleSetRequest, ConversionValueRuleSet>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v9.services.ConversionValueRuleSetService/GetConversionValueRuleSet")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetConversionValueRuleSetRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ConversionValueRuleSet.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateConversionValueRuleSetsRequest, MutateConversionValueRuleSetsResponse>
      mutateConversionValueRuleSetsMethodDescriptor =
          MethodDescriptor
              .<MutateConversionValueRuleSetsRequest, MutateConversionValueRuleSetsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v9.services.ConversionValueRuleSetService/MutateConversionValueRuleSets")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateConversionValueRuleSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateConversionValueRuleSetsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetConversionValueRuleSetRequest, ConversionValueRuleSet>
      getConversionValueRuleSetCallable;
  private final UnaryCallable<
          MutateConversionValueRuleSetsRequest, MutateConversionValueRuleSetsResponse>
      mutateConversionValueRuleSetsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcConversionValueRuleSetServiceStub create(
      ConversionValueRuleSetServiceStubSettings settings) throws IOException {
    return new GrpcConversionValueRuleSetServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcConversionValueRuleSetServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcConversionValueRuleSetServiceStub(
        ConversionValueRuleSetServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcConversionValueRuleSetServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcConversionValueRuleSetServiceStub(
        ConversionValueRuleSetServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcConversionValueRuleSetServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcConversionValueRuleSetServiceStub(
      ConversionValueRuleSetServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcConversionValueRuleSetServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcConversionValueRuleSetServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcConversionValueRuleSetServiceStub(
      ConversionValueRuleSetServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetConversionValueRuleSetRequest, ConversionValueRuleSet>
        getConversionValueRuleSetTransportSettings =
            GrpcCallSettings.<GetConversionValueRuleSetRequest, ConversionValueRuleSet>newBuilder()
                .setMethodDescriptor(getConversionValueRuleSetMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("resource_name", String.valueOf(request.getResourceName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<MutateConversionValueRuleSetsRequest, MutateConversionValueRuleSetsResponse>
        mutateConversionValueRuleSetsTransportSettings =
            GrpcCallSettings
                .<MutateConversionValueRuleSetsRequest, MutateConversionValueRuleSetsResponse>
                    newBuilder()
                .setMethodDescriptor(mutateConversionValueRuleSetsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("customer_id", String.valueOf(request.getCustomerId()));
                      return params.build();
                    })
                .build();

    this.getConversionValueRuleSetCallable =
        callableFactory.createUnaryCallable(
            getConversionValueRuleSetTransportSettings,
            settings.getConversionValueRuleSetSettings(),
            clientContext);
    this.mutateConversionValueRuleSetsCallable =
        callableFactory.createUnaryCallable(
            mutateConversionValueRuleSetsTransportSettings,
            settings.mutateConversionValueRuleSetsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetConversionValueRuleSetRequest, ConversionValueRuleSet>
      getConversionValueRuleSetCallable() {
    return getConversionValueRuleSetCallable;
  }

  @Override
  public UnaryCallable<MutateConversionValueRuleSetsRequest, MutateConversionValueRuleSetsResponse>
      mutateConversionValueRuleSetsCallable() {
    return mutateConversionValueRuleSetsCallable;
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
