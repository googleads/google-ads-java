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

package com.google.ads.googleads.v21.services.stub;

import com.google.ads.googleads.v21.services.GetIdentityVerificationRequest;
import com.google.ads.googleads.v21.services.GetIdentityVerificationResponse;
import com.google.ads.googleads.v21.services.StartIdentityVerificationRequest;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the IdentityVerificationService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcIdentityVerificationServiceStub extends IdentityVerificationServiceStub {
  private static final MethodDescriptor<StartIdentityVerificationRequest, Empty>
      startIdentityVerificationMethodDescriptor =
          MethodDescriptor.<StartIdentityVerificationRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v21.services.IdentityVerificationService/StartIdentityVerification")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(StartIdentityVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private static final MethodDescriptor<
          GetIdentityVerificationRequest, GetIdentityVerificationResponse>
      getIdentityVerificationMethodDescriptor =
          MethodDescriptor
              .<GetIdentityVerificationRequest, GetIdentityVerificationResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v21.services.IdentityVerificationService/GetIdentityVerification")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetIdentityVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GetIdentityVerificationResponse.getDefaultInstance()))
              .setSampledToLocalTracing(true)
              .build();

  private final UnaryCallable<StartIdentityVerificationRequest, Empty>
      startIdentityVerificationCallable;
  private final UnaryCallable<GetIdentityVerificationRequest, GetIdentityVerificationResponse>
      getIdentityVerificationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcIdentityVerificationServiceStub create(
      IdentityVerificationServiceStubSettings settings) throws IOException {
    return new GrpcIdentityVerificationServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcIdentityVerificationServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcIdentityVerificationServiceStub(
        IdentityVerificationServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcIdentityVerificationServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcIdentityVerificationServiceStub(
        IdentityVerificationServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcIdentityVerificationServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcIdentityVerificationServiceStub(
      IdentityVerificationServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcIdentityVerificationServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcIdentityVerificationServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcIdentityVerificationServiceStub(
      IdentityVerificationServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<StartIdentityVerificationRequest, Empty>
        startIdentityVerificationTransportSettings =
            GrpcCallSettings.<StartIdentityVerificationRequest, Empty>newBuilder()
                .setMethodDescriptor(startIdentityVerificationMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<GetIdentityVerificationRequest, GetIdentityVerificationResponse>
        getIdentityVerificationTransportSettings =
            GrpcCallSettings
                .<GetIdentityVerificationRequest, GetIdentityVerificationResponse>newBuilder()
                .setMethodDescriptor(getIdentityVerificationMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.startIdentityVerificationCallable =
        callableFactory.createUnaryCallable(
            startIdentityVerificationTransportSettings,
            settings.startIdentityVerificationSettings(),
            clientContext);
    this.getIdentityVerificationCallable =
        callableFactory.createUnaryCallable(
            getIdentityVerificationTransportSettings,
            settings.getIdentityVerificationSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<StartIdentityVerificationRequest, Empty>
      startIdentityVerificationCallable() {
    return startIdentityVerificationCallable;
  }

  @Override
  public UnaryCallable<GetIdentityVerificationRequest, GetIdentityVerificationResponse>
      getIdentityVerificationCallable() {
    return getIdentityVerificationCallable;
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
