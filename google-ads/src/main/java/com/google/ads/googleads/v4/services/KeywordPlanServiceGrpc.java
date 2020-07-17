package com.google.ads.googleads.v4.services;

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
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/keyword_plan_service.proto")
public final class KeywordPlanServiceGrpc {

  private KeywordPlanServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.KeywordPlanService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetKeywordPlanMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetKeywordPlanRequest,
      com.google.ads.googleads.v4.resources.KeywordPlan> METHOD_GET_KEYWORD_PLAN = getGetKeywordPlanMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetKeywordPlanRequest,
      com.google.ads.googleads.v4.resources.KeywordPlan> getGetKeywordPlanMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetKeywordPlanRequest,
      com.google.ads.googleads.v4.resources.KeywordPlan> getGetKeywordPlanMethod() {
    return getGetKeywordPlanMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetKeywordPlanRequest,
      com.google.ads.googleads.v4.resources.KeywordPlan> getGetKeywordPlanMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetKeywordPlanRequest, com.google.ads.googleads.v4.resources.KeywordPlan> getGetKeywordPlanMethod;
    if ((getGetKeywordPlanMethod = KeywordPlanServiceGrpc.getGetKeywordPlanMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getGetKeywordPlanMethod = KeywordPlanServiceGrpc.getGetKeywordPlanMethod) == null) {
          KeywordPlanServiceGrpc.getGetKeywordPlanMethod = getGetKeywordPlanMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetKeywordPlanRequest, com.google.ads.googleads.v4.resources.KeywordPlan>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.KeywordPlanService", "GetKeywordPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetKeywordPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.KeywordPlan.getDefaultInstance()))
                  .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("GetKeywordPlan"))
                  .build();
          }
        }
     }
     return getGetKeywordPlanMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateKeywordPlansMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateKeywordPlansRequest,
      com.google.ads.googleads.v4.services.MutateKeywordPlansResponse> METHOD_MUTATE_KEYWORD_PLANS = getMutateKeywordPlansMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateKeywordPlansRequest,
      com.google.ads.googleads.v4.services.MutateKeywordPlansResponse> getMutateKeywordPlansMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateKeywordPlansRequest,
      com.google.ads.googleads.v4.services.MutateKeywordPlansResponse> getMutateKeywordPlansMethod() {
    return getMutateKeywordPlansMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateKeywordPlansRequest,
      com.google.ads.googleads.v4.services.MutateKeywordPlansResponse> getMutateKeywordPlansMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateKeywordPlansRequest, com.google.ads.googleads.v4.services.MutateKeywordPlansResponse> getMutateKeywordPlansMethod;
    if ((getMutateKeywordPlansMethod = KeywordPlanServiceGrpc.getMutateKeywordPlansMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getMutateKeywordPlansMethod = KeywordPlanServiceGrpc.getMutateKeywordPlansMethod) == null) {
          KeywordPlanServiceGrpc.getMutateKeywordPlansMethod = getMutateKeywordPlansMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.MutateKeywordPlansRequest, com.google.ads.googleads.v4.services.MutateKeywordPlansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.KeywordPlanService", "MutateKeywordPlans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateKeywordPlansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateKeywordPlansResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("MutateKeywordPlans"))
                  .build();
          }
        }
     }
     return getMutateKeywordPlansMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGenerateForecastCurveMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateForecastCurveRequest,
      com.google.ads.googleads.v4.services.GenerateForecastCurveResponse> METHOD_GENERATE_FORECAST_CURVE = getGenerateForecastCurveMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateForecastCurveRequest,
      com.google.ads.googleads.v4.services.GenerateForecastCurveResponse> getGenerateForecastCurveMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateForecastCurveRequest,
      com.google.ads.googleads.v4.services.GenerateForecastCurveResponse> getGenerateForecastCurveMethod() {
    return getGenerateForecastCurveMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateForecastCurveRequest,
      com.google.ads.googleads.v4.services.GenerateForecastCurveResponse> getGenerateForecastCurveMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateForecastCurveRequest, com.google.ads.googleads.v4.services.GenerateForecastCurveResponse> getGenerateForecastCurveMethod;
    if ((getGenerateForecastCurveMethod = KeywordPlanServiceGrpc.getGenerateForecastCurveMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getGenerateForecastCurveMethod = KeywordPlanServiceGrpc.getGenerateForecastCurveMethod) == null) {
          KeywordPlanServiceGrpc.getGenerateForecastCurveMethod = getGenerateForecastCurveMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GenerateForecastCurveRequest, com.google.ads.googleads.v4.services.GenerateForecastCurveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.KeywordPlanService", "GenerateForecastCurve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GenerateForecastCurveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GenerateForecastCurveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("GenerateForecastCurve"))
                  .build();
          }
        }
     }
     return getGenerateForecastCurveMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGenerateForecastMetricsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateForecastMetricsRequest,
      com.google.ads.googleads.v4.services.GenerateForecastMetricsResponse> METHOD_GENERATE_FORECAST_METRICS = getGenerateForecastMetricsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateForecastMetricsRequest,
      com.google.ads.googleads.v4.services.GenerateForecastMetricsResponse> getGenerateForecastMetricsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateForecastMetricsRequest,
      com.google.ads.googleads.v4.services.GenerateForecastMetricsResponse> getGenerateForecastMetricsMethod() {
    return getGenerateForecastMetricsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateForecastMetricsRequest,
      com.google.ads.googleads.v4.services.GenerateForecastMetricsResponse> getGenerateForecastMetricsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateForecastMetricsRequest, com.google.ads.googleads.v4.services.GenerateForecastMetricsResponse> getGenerateForecastMetricsMethod;
    if ((getGenerateForecastMetricsMethod = KeywordPlanServiceGrpc.getGenerateForecastMetricsMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getGenerateForecastMetricsMethod = KeywordPlanServiceGrpc.getGenerateForecastMetricsMethod) == null) {
          KeywordPlanServiceGrpc.getGenerateForecastMetricsMethod = getGenerateForecastMetricsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GenerateForecastMetricsRequest, com.google.ads.googleads.v4.services.GenerateForecastMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.KeywordPlanService", "GenerateForecastMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GenerateForecastMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GenerateForecastMetricsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("GenerateForecastMetrics"))
                  .build();
          }
        }
     }
     return getGenerateForecastMetricsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGenerateHistoricalMetricsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateHistoricalMetricsRequest,
      com.google.ads.googleads.v4.services.GenerateHistoricalMetricsResponse> METHOD_GENERATE_HISTORICAL_METRICS = getGenerateHistoricalMetricsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateHistoricalMetricsRequest,
      com.google.ads.googleads.v4.services.GenerateHistoricalMetricsResponse> getGenerateHistoricalMetricsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateHistoricalMetricsRequest,
      com.google.ads.googleads.v4.services.GenerateHistoricalMetricsResponse> getGenerateHistoricalMetricsMethod() {
    return getGenerateHistoricalMetricsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateHistoricalMetricsRequest,
      com.google.ads.googleads.v4.services.GenerateHistoricalMetricsResponse> getGenerateHistoricalMetricsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateHistoricalMetricsRequest, com.google.ads.googleads.v4.services.GenerateHistoricalMetricsResponse> getGenerateHistoricalMetricsMethod;
    if ((getGenerateHistoricalMetricsMethod = KeywordPlanServiceGrpc.getGenerateHistoricalMetricsMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getGenerateHistoricalMetricsMethod = KeywordPlanServiceGrpc.getGenerateHistoricalMetricsMethod) == null) {
          KeywordPlanServiceGrpc.getGenerateHistoricalMetricsMethod = getGenerateHistoricalMetricsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GenerateHistoricalMetricsRequest, com.google.ads.googleads.v4.services.GenerateHistoricalMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.KeywordPlanService", "GenerateHistoricalMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GenerateHistoricalMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GenerateHistoricalMetricsResponse.getDefaultInstance()))
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
    return new KeywordPlanServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordPlanServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KeywordPlanServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordPlanServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KeywordPlanServiceFutureStub(channel);
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
    public void getKeywordPlan(com.google.ads.googleads.v4.services.GetKeywordPlanRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.KeywordPlan> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKeywordPlanMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateKeywordPlans(com.google.ads.googleads.v4.services.MutateKeywordPlansRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateKeywordPlansResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateKeywordPlansMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecast curve.
     * Only the bidding strategy is considered for generating forecast curve.
     * The bidding strategy value (eg: max_cpc_bid_micros in maximize cpc bidding
     * strategy) specified in the plan is ignored.
     * To generate a forecast at a value specified in the plan, use
     * KeywordPlanService.GenerateForecastMetrics.
     * </pre>
     */
    public void generateForecastCurve(com.google.ads.googleads.v4.services.GenerateForecastCurveRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateForecastCurveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateForecastCurveMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecasts.
     * </pre>
     */
    public void generateForecastMetrics(com.google.ads.googleads.v4.services.GenerateForecastMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateForecastMetricsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateForecastMetricsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan historical metrics.
     * </pre>
     */
    public void generateHistoricalMetrics(com.google.ads.googleads.v4.services.GenerateHistoricalMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateHistoricalMetricsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateHistoricalMetricsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetKeywordPlanMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetKeywordPlanRequest,
                com.google.ads.googleads.v4.resources.KeywordPlan>(
                  this, METHODID_GET_KEYWORD_PLAN)))
          .addMethod(
            getMutateKeywordPlansMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.MutateKeywordPlansRequest,
                com.google.ads.googleads.v4.services.MutateKeywordPlansResponse>(
                  this, METHODID_MUTATE_KEYWORD_PLANS)))
          .addMethod(
            getGenerateForecastCurveMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GenerateForecastCurveRequest,
                com.google.ads.googleads.v4.services.GenerateForecastCurveResponse>(
                  this, METHODID_GENERATE_FORECAST_CURVE)))
          .addMethod(
            getGenerateForecastMetricsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GenerateForecastMetricsRequest,
                com.google.ads.googleads.v4.services.GenerateForecastMetricsResponse>(
                  this, METHODID_GENERATE_FORECAST_METRICS)))
          .addMethod(
            getGenerateHistoricalMetricsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GenerateHistoricalMetricsRequest,
                com.google.ads.googleads.v4.services.GenerateHistoricalMetricsResponse>(
                  this, METHODID_GENERATE_HISTORICAL_METRICS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage keyword plans.
   * </pre>
   */
  public static final class KeywordPlanServiceStub extends io.grpc.stub.AbstractStub<KeywordPlanServiceStub> {
    private KeywordPlanServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested plan in full detail.
     * </pre>
     */
    public void getKeywordPlan(com.google.ads.googleads.v4.services.GetKeywordPlanRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.KeywordPlan> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKeywordPlanMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateKeywordPlans(com.google.ads.googleads.v4.services.MutateKeywordPlansRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateKeywordPlansResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateKeywordPlansMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecast curve.
     * Only the bidding strategy is considered for generating forecast curve.
     * The bidding strategy value (eg: max_cpc_bid_micros in maximize cpc bidding
     * strategy) specified in the plan is ignored.
     * To generate a forecast at a value specified in the plan, use
     * KeywordPlanService.GenerateForecastMetrics.
     * </pre>
     */
    public void generateForecastCurve(com.google.ads.googleads.v4.services.GenerateForecastCurveRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateForecastCurveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateForecastCurveMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecasts.
     * </pre>
     */
    public void generateForecastMetrics(com.google.ads.googleads.v4.services.GenerateForecastMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateForecastMetricsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateForecastMetricsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan historical metrics.
     * </pre>
     */
    public void generateHistoricalMetrics(com.google.ads.googleads.v4.services.GenerateHistoricalMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateHistoricalMetricsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateHistoricalMetricsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage keyword plans.
   * </pre>
   */
  public static final class KeywordPlanServiceBlockingStub extends io.grpc.stub.AbstractStub<KeywordPlanServiceBlockingStub> {
    private KeywordPlanServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested plan in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.KeywordPlan getKeywordPlan(com.google.ads.googleads.v4.services.GetKeywordPlanRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetKeywordPlanMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.MutateKeywordPlansResponse mutateKeywordPlans(com.google.ads.googleads.v4.services.MutateKeywordPlansRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateKeywordPlansMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecast curve.
     * Only the bidding strategy is considered for generating forecast curve.
     * The bidding strategy value (eg: max_cpc_bid_micros in maximize cpc bidding
     * strategy) specified in the plan is ignored.
     * To generate a forecast at a value specified in the plan, use
     * KeywordPlanService.GenerateForecastMetrics.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.GenerateForecastCurveResponse generateForecastCurve(com.google.ads.googleads.v4.services.GenerateForecastCurveRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateForecastCurveMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecasts.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.GenerateForecastMetricsResponse generateForecastMetrics(com.google.ads.googleads.v4.services.GenerateForecastMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateForecastMetricsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan historical metrics.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.GenerateHistoricalMetricsResponse generateHistoricalMetrics(com.google.ads.googleads.v4.services.GenerateHistoricalMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateHistoricalMetricsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage keyword plans.
   * </pre>
   */
  public static final class KeywordPlanServiceFutureStub extends io.grpc.stub.AbstractStub<KeywordPlanServiceFutureStub> {
    private KeywordPlanServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested plan in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.KeywordPlan> getKeywordPlan(
        com.google.ads.googleads.v4.services.GetKeywordPlanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKeywordPlanMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.MutateKeywordPlansResponse> mutateKeywordPlans(
        com.google.ads.googleads.v4.services.MutateKeywordPlansRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateKeywordPlansMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecast curve.
     * Only the bidding strategy is considered for generating forecast curve.
     * The bidding strategy value (eg: max_cpc_bid_micros in maximize cpc bidding
     * strategy) specified in the plan is ignored.
     * To generate a forecast at a value specified in the plan, use
     * KeywordPlanService.GenerateForecastMetrics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.GenerateForecastCurveResponse> generateForecastCurve(
        com.google.ads.googleads.v4.services.GenerateForecastCurveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateForecastCurveMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecasts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.GenerateForecastMetricsResponse> generateForecastMetrics(
        com.google.ads.googleads.v4.services.GenerateForecastMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateForecastMetricsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan historical metrics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.GenerateHistoricalMetricsResponse> generateHistoricalMetrics(
        com.google.ads.googleads.v4.services.GenerateHistoricalMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateHistoricalMetricsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_KEYWORD_PLAN = 0;
  private static final int METHODID_MUTATE_KEYWORD_PLANS = 1;
  private static final int METHODID_GENERATE_FORECAST_CURVE = 2;
  private static final int METHODID_GENERATE_FORECAST_METRICS = 3;
  private static final int METHODID_GENERATE_HISTORICAL_METRICS = 4;

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
          serviceImpl.getKeywordPlan((com.google.ads.googleads.v4.services.GetKeywordPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.KeywordPlan>) responseObserver);
          break;
        case METHODID_MUTATE_KEYWORD_PLANS:
          serviceImpl.mutateKeywordPlans((com.google.ads.googleads.v4.services.MutateKeywordPlansRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateKeywordPlansResponse>) responseObserver);
          break;
        case METHODID_GENERATE_FORECAST_CURVE:
          serviceImpl.generateForecastCurve((com.google.ads.googleads.v4.services.GenerateForecastCurveRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateForecastCurveResponse>) responseObserver);
          break;
        case METHODID_GENERATE_FORECAST_METRICS:
          serviceImpl.generateForecastMetrics((com.google.ads.googleads.v4.services.GenerateForecastMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateForecastMetricsResponse>) responseObserver);
          break;
        case METHODID_GENERATE_HISTORICAL_METRICS:
          serviceImpl.generateHistoricalMetrics((com.google.ads.googleads.v4.services.GenerateHistoricalMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateHistoricalMetricsResponse>) responseObserver);
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
      return com.google.ads.googleads.v4.services.KeywordPlanServiceProto.getDescriptor();
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
              .addMethod(getGetKeywordPlanMethodHelper())
              .addMethod(getMutateKeywordPlansMethodHelper())
              .addMethod(getGenerateForecastCurveMethodHelper())
              .addMethod(getGenerateForecastMetricsMethodHelper())
              .addMethod(getGenerateHistoricalMetricsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
