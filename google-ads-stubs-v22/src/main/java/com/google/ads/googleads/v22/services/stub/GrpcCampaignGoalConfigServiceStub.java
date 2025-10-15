/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v22.services.stub;

import com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest;
import com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse;
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
 * gRPC stub implementation for the CampaignGoalConfigService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCampaignGoalConfigServiceStub extends CampaignGoalConfigServiceStub {
  private static final MethodDescriptor<
          MutateCampaignGoalConfigsRequest, MutateCampaignGoalConfigsResponse>
      mutateCampaignGoalConfigsMethodDescriptor =
          MethodDescriptor
              .<MutateCampaignGoalConfigsRequest, MutateCampaignGoalConfigsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v22.services.CampaignGoalConfigService/MutateCampaignGoalConfigs")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCampaignGoalConfigsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCampaignGoalConfigsResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private final UnaryCallable<MutateCampaignGoalConfigsRequest, MutateCampaignGoalConfigsResponse>
      mutateCampaignGoalConfigsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCampaignGoalConfigServiceStub create(
      CampaignGoalConfigServiceStubSettings settings) throws IOException {
    return new GrpcCampaignGoalConfigServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCampaignGoalConfigServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCampaignGoalConfigServiceStub(
        CampaignGoalConfigServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCampaignGoalConfigServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCampaignGoalConfigServiceStub(
        CampaignGoalConfigServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCampaignGoalConfigServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignGoalConfigServiceStub(
      CampaignGoalConfigServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCampaignGoalConfigServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCampaignGoalConfigServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignGoalConfigServiceStub(
      CampaignGoalConfigServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<MutateCampaignGoalConfigsRequest, MutateCampaignGoalConfigsResponse>
        mutateCampaignGoalConfigsTransportSettings =
            GrpcCallSettings
                .<MutateCampaignGoalConfigsRequest, MutateCampaignGoalConfigsResponse>newBuilder()
                .setMethodDescriptor(mutateCampaignGoalConfigsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.mutateCampaignGoalConfigsCallable =
        callableFactory.createUnaryCallable(
            mutateCampaignGoalConfigsTransportSettings,
            settings.mutateCampaignGoalConfigsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<MutateCampaignGoalConfigsRequest, MutateCampaignGoalConfigsResponse>
      mutateCampaignGoalConfigsCallable() {
    return mutateCampaignGoalConfigsCallable;
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
