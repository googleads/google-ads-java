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

package com.google.ads.googleads.v15.services.stub;

import com.google.ads.googleads.v15.services.MutateCampaignSharedSetsRequest;
import com.google.ads.googleads.v15.services.MutateCampaignSharedSetsResponse;
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
 * gRPC stub implementation for the CampaignSharedSetService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCampaignSharedSetServiceStub extends CampaignSharedSetServiceStub {
  private static final MethodDescriptor<
          MutateCampaignSharedSetsRequest, MutateCampaignSharedSetsResponse>
      mutateCampaignSharedSetsMethodDescriptor =
          MethodDescriptor
              .<MutateCampaignSharedSetsRequest, MutateCampaignSharedSetsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v15.services.CampaignSharedSetService/MutateCampaignSharedSets")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCampaignSharedSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCampaignSharedSetsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<MutateCampaignSharedSetsRequest, MutateCampaignSharedSetsResponse>
      mutateCampaignSharedSetsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCampaignSharedSetServiceStub create(
      CampaignSharedSetServiceStubSettings settings) throws IOException {
    return new GrpcCampaignSharedSetServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCampaignSharedSetServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCampaignSharedSetServiceStub(
        CampaignSharedSetServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCampaignSharedSetServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCampaignSharedSetServiceStub(
        CampaignSharedSetServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCampaignSharedSetServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignSharedSetServiceStub(
      CampaignSharedSetServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCampaignSharedSetServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCampaignSharedSetServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignSharedSetServiceStub(
      CampaignSharedSetServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<MutateCampaignSharedSetsRequest, MutateCampaignSharedSetsResponse>
        mutateCampaignSharedSetsTransportSettings =
            GrpcCallSettings
                .<MutateCampaignSharedSetsRequest, MutateCampaignSharedSetsResponse>newBuilder()
                .setMethodDescriptor(mutateCampaignSharedSetsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.mutateCampaignSharedSetsCallable =
        callableFactory.createUnaryCallable(
            mutateCampaignSharedSetsTransportSettings,
            settings.mutateCampaignSharedSetsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<MutateCampaignSharedSetsRequest, MutateCampaignSharedSetsResponse>
      mutateCampaignSharedSetsCallable() {
    return mutateCampaignSharedSetsCallable;
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
