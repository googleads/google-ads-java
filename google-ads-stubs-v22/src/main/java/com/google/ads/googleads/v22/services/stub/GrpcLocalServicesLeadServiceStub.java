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

import com.google.ads.googleads.v22.services.AppendLeadConversationRequest;
import com.google.ads.googleads.v22.services.AppendLeadConversationResponse;
import com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest;
import com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse;
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
 * gRPC stub implementation for the LocalServicesLeadService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcLocalServicesLeadServiceStub extends LocalServicesLeadServiceStub {
  private static final MethodDescriptor<
          AppendLeadConversationRequest, AppendLeadConversationResponse>
      appendLeadConversationMethodDescriptor =
          MethodDescriptor
              .<AppendLeadConversationRequest, AppendLeadConversationResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v22.services.LocalServicesLeadService/AppendLeadConversation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AppendLeadConversationRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AppendLeadConversationResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<ProvideLeadFeedbackRequest, ProvideLeadFeedbackResponse>
      provideLeadFeedbackMethodDescriptor =
          MethodDescriptor.<ProvideLeadFeedbackRequest, ProvideLeadFeedbackResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v22.services.LocalServicesLeadService/ProvideLeadFeedback")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ProvideLeadFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ProvideLeadFeedbackResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private final UnaryCallable<AppendLeadConversationRequest, AppendLeadConversationResponse>
      appendLeadConversationCallable;
  private final UnaryCallable<ProvideLeadFeedbackRequest, ProvideLeadFeedbackResponse>
      provideLeadFeedbackCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcLocalServicesLeadServiceStub create(
      LocalServicesLeadServiceStubSettings settings) throws IOException {
    return new GrpcLocalServicesLeadServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcLocalServicesLeadServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcLocalServicesLeadServiceStub(
        LocalServicesLeadServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcLocalServicesLeadServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcLocalServicesLeadServiceStub(
        LocalServicesLeadServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcLocalServicesLeadServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcLocalServicesLeadServiceStub(
      LocalServicesLeadServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcLocalServicesLeadServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcLocalServicesLeadServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcLocalServicesLeadServiceStub(
      LocalServicesLeadServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<AppendLeadConversationRequest, AppendLeadConversationResponse>
        appendLeadConversationTransportSettings =
            GrpcCallSettings
                .<AppendLeadConversationRequest, AppendLeadConversationResponse>newBuilder()
                .setMethodDescriptor(appendLeadConversationMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<ProvideLeadFeedbackRequest, ProvideLeadFeedbackResponse>
        provideLeadFeedbackTransportSettings =
            GrpcCallSettings.<ProvideLeadFeedbackRequest, ProvideLeadFeedbackResponse>newBuilder()
                .setMethodDescriptor(provideLeadFeedbackMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("resource_name", String.valueOf(request.getResourceName()));
                      return builder.build();
                    })
                .build();

    this.appendLeadConversationCallable =
        callableFactory.createUnaryCallable(
            appendLeadConversationTransportSettings,
            settings.appendLeadConversationSettings(),
            clientContext);
    this.provideLeadFeedbackCallable =
        callableFactory.createUnaryCallable(
            provideLeadFeedbackTransportSettings,
            settings.provideLeadFeedbackSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<AppendLeadConversationRequest, AppendLeadConversationResponse>
      appendLeadConversationCallable() {
    return appendLeadConversationCallable;
  }

  @Override
  public UnaryCallable<ProvideLeadFeedbackRequest, ProvideLeadFeedbackResponse>
      provideLeadFeedbackCallable() {
    return provideLeadFeedbackCallable;
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
