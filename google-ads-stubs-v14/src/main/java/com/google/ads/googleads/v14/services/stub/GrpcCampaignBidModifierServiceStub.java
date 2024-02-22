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

package com.google.ads.googleads.v14.services.stub;

import com.google.ads.googleads.v14.services.MutateCampaignBidModifiersRequest;
import com.google.ads.googleads.v14.services.MutateCampaignBidModifiersResponse;
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
 * gRPC stub implementation for the CampaignBidModifierService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCampaignBidModifierServiceStub extends CampaignBidModifierServiceStub {
  private static final MethodDescriptor<
          MutateCampaignBidModifiersRequest, MutateCampaignBidModifiersResponse>
      mutateCampaignBidModifiersMethodDescriptor =
          MethodDescriptor
              .<MutateCampaignBidModifiersRequest, MutateCampaignBidModifiersResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v14.services.CampaignBidModifierService/MutateCampaignBidModifiers")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCampaignBidModifiersRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCampaignBidModifiersResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<MutateCampaignBidModifiersRequest, MutateCampaignBidModifiersResponse>
      mutateCampaignBidModifiersCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCampaignBidModifierServiceStub create(
      CampaignBidModifierServiceStubSettings settings) throws IOException {
    return new GrpcCampaignBidModifierServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCampaignBidModifierServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCampaignBidModifierServiceStub(
        CampaignBidModifierServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCampaignBidModifierServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCampaignBidModifierServiceStub(
        CampaignBidModifierServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcCampaignBidModifierServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignBidModifierServiceStub(
      CampaignBidModifierServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCampaignBidModifierServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCampaignBidModifierServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcCampaignBidModifierServiceStub(
      CampaignBidModifierServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<MutateCampaignBidModifiersRequest, MutateCampaignBidModifiersResponse>
        mutateCampaignBidModifiersTransportSettings =
            GrpcCallSettings
                .<MutateCampaignBidModifiersRequest, MutateCampaignBidModifiersResponse>newBuilder()
                .setMethodDescriptor(mutateCampaignBidModifiersMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.mutateCampaignBidModifiersCallable =
        callableFactory.createUnaryCallable(
            mutateCampaignBidModifiersTransportSettings,
            settings.mutateCampaignBidModifiersSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<MutateCampaignBidModifiersRequest, MutateCampaignBidModifiersResponse>
      mutateCampaignBidModifiersCallable() {
    return mutateCampaignBidModifiersCallable;
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
