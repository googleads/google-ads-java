package com.google.ads.googleads.v2.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service to manage keyword plans.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v2/services/keyword_plan_service.proto")
public final class KeywordPlanServiceGrpc {

  private KeywordPlanServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.KeywordPlanService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetKeywordPlanRequest,
      com.google.ads.googleads.v2.resources.KeywordPlan> getGetKeywordPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKeywordPlan",
      requestType = com.google.ads.googleads.v2.services.GetKeywordPlanRequest.class,
      responseType = com.google.ads.googleads.v2.resources.KeywordPlan.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetKeywordPlanRequest,
      com.google.ads.googleads.v2.resources.KeywordPlan> getGetKeywordPlanMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetKeywordPlanRequest, com.google.ads.googleads.v2.resources.KeywordPlan> getGetKeywordPlanMethod;
    if ((getGetKeywordPlanMethod = KeywordPlanServiceGrpc.getGetKeywordPlanMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getGetKeywordPlanMethod = KeywordPlanServiceGrpc.getGetKeywordPlanMethod) == null) {
          KeywordPlanServiceGrpc.getGetKeywordPlanMethod = getGetKeywordPlanMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetKeywordPlanRequest, com.google.ads.googleads.v2.resources.KeywordPlan>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKeywordPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetKeywordPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.KeywordPlan.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("GetKeywordPlan"))
              .build();
        }
      }
    }
    return getGetKeywordPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateKeywordPlansRequest,
      com.google.ads.googleads.v2.services.MutateKeywordPlansResponse> getMutateKeywordPlansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateKeywordPlans",
      requestType = com.google.ads.googleads.v2.services.MutateKeywordPlansRequest.class,
      responseType = com.google.ads.googleads.v2.services.MutateKeywordPlansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateKeywordPlansRequest,
      com.google.ads.googleads.v2.services.MutateKeywordPlansResponse> getMutateKeywordPlansMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateKeywordPlansRequest, com.google.ads.googleads.v2.services.MutateKeywordPlansResponse> getMutateKeywordPlansMethod;
    if ((getMutateKeywordPlansMethod = KeywordPlanServiceGrpc.getMutateKeywordPlansMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getMutateKeywordPlansMethod = KeywordPlanServiceGrpc.getMutateKeywordPlansMethod) == null) {
          KeywordPlanServiceGrpc.getMutateKeywordPlansMethod = getMutateKeywordPlansMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.MutateKeywordPlansRequest, com.google.ads.googleads.v2.services.MutateKeywordPlansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateKeywordPlans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateKeywordPlansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateKeywordPlansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("MutateKeywordPlans"))
              .build();
        }
      }
    }
    return getMutateKeywordPlansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GenerateForecastMetricsRequest,
      com.google.ads.googleads.v2.services.GenerateForecastMetricsResponse> getGenerateForecastMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateForecastMetrics",
      requestType = com.google.ads.googleads.v2.services.GenerateForecastMetricsRequest.class,
      responseType = com.google.ads.googleads.v2.services.GenerateForecastMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GenerateForecastMetricsRequest,
      com.google.ads.googleads.v2.services.GenerateForecastMetricsResponse> getGenerateForecastMetricsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GenerateForecastMetricsRequest, com.google.ads.googleads.v2.services.GenerateForecastMetricsResponse> getGenerateForecastMetricsMethod;
    if ((getGenerateForecastMetricsMethod = KeywordPlanServiceGrpc.getGenerateForecastMetricsMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getGenerateForecastMetricsMethod = KeywordPlanServiceGrpc.getGenerateForecastMetricsMethod) == null) {
          KeywordPlanServiceGrpc.getGenerateForecastMetricsMethod = getGenerateForecastMetricsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GenerateForecastMetricsRequest, com.google.ads.googleads.v2.services.GenerateForecastMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateForecastMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GenerateForecastMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GenerateForecastMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("GenerateForecastMetrics"))
              .build();
        }
      }
    }
    return getGenerateForecastMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GenerateHistoricalMetricsRequest,
      com.google.ads.googleads.v2.services.GenerateHistoricalMetricsResponse> getGenerateHistoricalMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateHistoricalMetrics",
      requestType = com.google.ads.googleads.v2.services.GenerateHistoricalMetricsRequest.class,
      responseType = com.google.ads.googleads.v2.services.GenerateHistoricalMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GenerateHistoricalMetricsRequest,
      com.google.ads.googleads.v2.services.GenerateHistoricalMetricsResponse> getGenerateHistoricalMetricsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GenerateHistoricalMetricsRequest, com.google.ads.googleads.v2.services.GenerateHistoricalMetricsResponse> getGenerateHistoricalMetricsMethod;
    if ((getGenerateHistoricalMetricsMethod = KeywordPlanServiceGrpc.getGenerateHistoricalMetricsMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getGenerateHistoricalMetricsMethod = KeywordPlanServiceGrpc.getGenerateHistoricalMetricsMethod) == null) {
          KeywordPlanServiceGrpc.getGenerateHistoricalMetricsMethod = getGenerateHistoricalMetricsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GenerateHistoricalMetricsRequest, com.google.ads.googleads.v2.services.GenerateHistoricalMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateHistoricalMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GenerateHistoricalMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GenerateHistoricalMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("GenerateHistoricalMetrics"))
              .build();
        }
      }
    }
    return getGenerateHistoricalMetricsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordPlanServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanServiceStub>() {
        @java.lang.Override
        public KeywordPlanServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanServiceStub(channel, callOptions);
        }
      };
    return KeywordPlanServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordPlanServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanServiceBlockingStub>() {
        @java.lang.Override
        public KeywordPlanServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanServiceBlockingStub(channel, callOptions);
        }
      };
    return KeywordPlanServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordPlanServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanServiceFutureStub>() {
        @java.lang.Override
        public KeywordPlanServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanServiceFutureStub(channel, callOptions);
        }
      };
    return KeywordPlanServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage keyword plans.
   * </pre>
   */
  public static abstract class KeywordPlanServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested plan in full detail.
     * </pre>
     */
    public void getKeywordPlan(com.google.ads.googleads.v2.services.GetKeywordPlanRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.KeywordPlan> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKeywordPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateKeywordPlans(com.google.ads.googleads.v2.services.MutateKeywordPlansRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateKeywordPlansResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateKeywordPlansMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecasts.
     * </pre>
     */
    public void generateForecastMetrics(com.google.ads.googleads.v2.services.GenerateForecastMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.GenerateForecastMetricsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateForecastMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan historical metrics.
     * </pre>
     */
    public void generateHistoricalMetrics(com.google.ads.googleads.v2.services.GenerateHistoricalMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.GenerateHistoricalMetricsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateHistoricalMetricsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetKeywordPlanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetKeywordPlanRequest,
                com.google.ads.googleads.v2.resources.KeywordPlan>(
                  this, METHODID_GET_KEYWORD_PLAN)))
          .addMethod(
            getMutateKeywordPlansMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.MutateKeywordPlansRequest,
                com.google.ads.googleads.v2.services.MutateKeywordPlansResponse>(
                  this, METHODID_MUTATE_KEYWORD_PLANS)))
          .addMethod(
            getGenerateForecastMetricsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GenerateForecastMetricsRequest,
                com.google.ads.googleads.v2.services.GenerateForecastMetricsResponse>(
                  this, METHODID_GENERATE_FORECAST_METRICS)))
          .addMethod(
            getGenerateHistoricalMetricsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GenerateHistoricalMetricsRequest,
                com.google.ads.googleads.v2.services.GenerateHistoricalMetricsResponse>(
                  this, METHODID_GENERATE_HISTORICAL_METRICS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage keyword plans.
   * </pre>
   */
  public static final class KeywordPlanServiceStub extends io.grpc.stub.AbstractAsyncStub<KeywordPlanServiceStub> {
    private KeywordPlanServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested plan in full detail.
     * </pre>
     */
    public void getKeywordPlan(com.google.ads.googleads.v2.services.GetKeywordPlanRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.KeywordPlan> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKeywordPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateKeywordPlans(com.google.ads.googleads.v2.services.MutateKeywordPlansRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateKeywordPlansResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateKeywordPlansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecasts.
     * </pre>
     */
    public void generateForecastMetrics(com.google.ads.googleads.v2.services.GenerateForecastMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.GenerateForecastMetricsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateForecastMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan historical metrics.
     * </pre>
     */
    public void generateHistoricalMetrics(com.google.ads.googleads.v2.services.GenerateHistoricalMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.GenerateHistoricalMetricsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateHistoricalMetricsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage keyword plans.
   * </pre>
   */
  public static final class KeywordPlanServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeywordPlanServiceBlockingStub> {
    private KeywordPlanServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested plan in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.KeywordPlan getKeywordPlan(com.google.ads.googleads.v2.services.GetKeywordPlanRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetKeywordPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.MutateKeywordPlansResponse mutateKeywordPlans(com.google.ads.googleads.v2.services.MutateKeywordPlansRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateKeywordPlansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecasts.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.GenerateForecastMetricsResponse generateForecastMetrics(com.google.ads.googleads.v2.services.GenerateForecastMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateForecastMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan historical metrics.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.GenerateHistoricalMetricsResponse generateHistoricalMetrics(com.google.ads.googleads.v2.services.GenerateHistoricalMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateHistoricalMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage keyword plans.
   * </pre>
   */
  public static final class KeywordPlanServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeywordPlanServiceFutureStub> {
    private KeywordPlanServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested plan in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.KeywordPlan> getKeywordPlan(
        com.google.ads.googleads.v2.services.GetKeywordPlanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKeywordPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.MutateKeywordPlansResponse> mutateKeywordPlans(
        com.google.ads.googleads.v2.services.MutateKeywordPlansRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateKeywordPlansMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecasts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.GenerateForecastMetricsResponse> generateForecastMetrics(
        com.google.ads.googleads.v2.services.GenerateForecastMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateForecastMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan historical metrics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.GenerateHistoricalMetricsResponse> generateHistoricalMetrics(
        com.google.ads.googleads.v2.services.GenerateHistoricalMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateHistoricalMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_KEYWORD_PLAN = 0;
  private static final int METHODID_MUTATE_KEYWORD_PLANS = 1;
  private static final int METHODID_GENERATE_FORECAST_METRICS = 2;
  private static final int METHODID_GENERATE_HISTORICAL_METRICS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeywordPlanServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeywordPlanServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_KEYWORD_PLAN:
          serviceImpl.getKeywordPlan((com.google.ads.googleads.v2.services.GetKeywordPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.KeywordPlan>) responseObserver);
          break;
        case METHODID_MUTATE_KEYWORD_PLANS:
          serviceImpl.mutateKeywordPlans((com.google.ads.googleads.v2.services.MutateKeywordPlansRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateKeywordPlansResponse>) responseObserver);
          break;
        case METHODID_GENERATE_FORECAST_METRICS:
          serviceImpl.generateForecastMetrics((com.google.ads.googleads.v2.services.GenerateForecastMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.GenerateForecastMetricsResponse>) responseObserver);
          break;
        case METHODID_GENERATE_HISTORICAL_METRICS:
          serviceImpl.generateHistoricalMetrics((com.google.ads.googleads.v2.services.GenerateHistoricalMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.GenerateHistoricalMetricsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KeywordPlanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordPlanServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.KeywordPlanServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordPlanService");
    }
  }

  private static final class KeywordPlanServiceFileDescriptorSupplier
      extends KeywordPlanServiceBaseDescriptorSupplier {
    KeywordPlanServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordPlanServiceMethodDescriptorSupplier
      extends KeywordPlanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeywordPlanServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordPlanServiceFileDescriptorSupplier())
              .addMethod(getGetKeywordPlanMethod())
              .addMethod(getMutateKeywordPlansMethod())
              .addMethod(getGenerateForecastMetricsMethod())
              .addMethod(getGenerateHistoricalMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
