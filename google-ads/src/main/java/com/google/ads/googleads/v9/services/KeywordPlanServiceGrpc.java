package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage keyword plans.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/keyword_plan_service.proto")
public final class KeywordPlanServiceGrpc {

  private KeywordPlanServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.KeywordPlanService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetKeywordPlanRequest,
      com.google.ads.googleads.v9.resources.KeywordPlan> getGetKeywordPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKeywordPlan",
      requestType = com.google.ads.googleads.v9.services.GetKeywordPlanRequest.class,
      responseType = com.google.ads.googleads.v9.resources.KeywordPlan.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetKeywordPlanRequest,
      com.google.ads.googleads.v9.resources.KeywordPlan> getGetKeywordPlanMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetKeywordPlanRequest, com.google.ads.googleads.v9.resources.KeywordPlan> getGetKeywordPlanMethod;
    if ((getGetKeywordPlanMethod = KeywordPlanServiceGrpc.getGetKeywordPlanMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getGetKeywordPlanMethod = KeywordPlanServiceGrpc.getGetKeywordPlanMethod) == null) {
          KeywordPlanServiceGrpc.getGetKeywordPlanMethod = getGetKeywordPlanMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetKeywordPlanRequest, com.google.ads.googleads.v9.resources.KeywordPlan>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKeywordPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetKeywordPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.KeywordPlan.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("GetKeywordPlan"))
              .build();
        }
      }
    }
    return getGetKeywordPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateKeywordPlansRequest,
      com.google.ads.googleads.v9.services.MutateKeywordPlansResponse> getMutateKeywordPlansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateKeywordPlans",
      requestType = com.google.ads.googleads.v9.services.MutateKeywordPlansRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateKeywordPlansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateKeywordPlansRequest,
      com.google.ads.googleads.v9.services.MutateKeywordPlansResponse> getMutateKeywordPlansMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateKeywordPlansRequest, com.google.ads.googleads.v9.services.MutateKeywordPlansResponse> getMutateKeywordPlansMethod;
    if ((getMutateKeywordPlansMethod = KeywordPlanServiceGrpc.getMutateKeywordPlansMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getMutateKeywordPlansMethod = KeywordPlanServiceGrpc.getMutateKeywordPlansMethod) == null) {
          KeywordPlanServiceGrpc.getMutateKeywordPlansMethod = getMutateKeywordPlansMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateKeywordPlansRequest, com.google.ads.googleads.v9.services.MutateKeywordPlansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateKeywordPlans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateKeywordPlansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateKeywordPlansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("MutateKeywordPlans"))
              .build();
        }
      }
    }
    return getMutateKeywordPlansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GenerateForecastCurveRequest,
      com.google.ads.googleads.v9.services.GenerateForecastCurveResponse> getGenerateForecastCurveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateForecastCurve",
      requestType = com.google.ads.googleads.v9.services.GenerateForecastCurveRequest.class,
      responseType = com.google.ads.googleads.v9.services.GenerateForecastCurveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GenerateForecastCurveRequest,
      com.google.ads.googleads.v9.services.GenerateForecastCurveResponse> getGenerateForecastCurveMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GenerateForecastCurveRequest, com.google.ads.googleads.v9.services.GenerateForecastCurveResponse> getGenerateForecastCurveMethod;
    if ((getGenerateForecastCurveMethod = KeywordPlanServiceGrpc.getGenerateForecastCurveMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getGenerateForecastCurveMethod = KeywordPlanServiceGrpc.getGenerateForecastCurveMethod) == null) {
          KeywordPlanServiceGrpc.getGenerateForecastCurveMethod = getGenerateForecastCurveMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GenerateForecastCurveRequest, com.google.ads.googleads.v9.services.GenerateForecastCurveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateForecastCurve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GenerateForecastCurveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GenerateForecastCurveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("GenerateForecastCurve"))
              .build();
        }
      }
    }
    return getGenerateForecastCurveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesRequest,
      com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesResponse> getGenerateForecastTimeSeriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateForecastTimeSeries",
      requestType = com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesRequest.class,
      responseType = com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesRequest,
      com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesResponse> getGenerateForecastTimeSeriesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesRequest, com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesResponse> getGenerateForecastTimeSeriesMethod;
    if ((getGenerateForecastTimeSeriesMethod = KeywordPlanServiceGrpc.getGenerateForecastTimeSeriesMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getGenerateForecastTimeSeriesMethod = KeywordPlanServiceGrpc.getGenerateForecastTimeSeriesMethod) == null) {
          KeywordPlanServiceGrpc.getGenerateForecastTimeSeriesMethod = getGenerateForecastTimeSeriesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesRequest, com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateForecastTimeSeries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("GenerateForecastTimeSeries"))
              .build();
        }
      }
    }
    return getGenerateForecastTimeSeriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GenerateForecastMetricsRequest,
      com.google.ads.googleads.v9.services.GenerateForecastMetricsResponse> getGenerateForecastMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateForecastMetrics",
      requestType = com.google.ads.googleads.v9.services.GenerateForecastMetricsRequest.class,
      responseType = com.google.ads.googleads.v9.services.GenerateForecastMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GenerateForecastMetricsRequest,
      com.google.ads.googleads.v9.services.GenerateForecastMetricsResponse> getGenerateForecastMetricsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GenerateForecastMetricsRequest, com.google.ads.googleads.v9.services.GenerateForecastMetricsResponse> getGenerateForecastMetricsMethod;
    if ((getGenerateForecastMetricsMethod = KeywordPlanServiceGrpc.getGenerateForecastMetricsMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getGenerateForecastMetricsMethod = KeywordPlanServiceGrpc.getGenerateForecastMetricsMethod) == null) {
          KeywordPlanServiceGrpc.getGenerateForecastMetricsMethod = getGenerateForecastMetricsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GenerateForecastMetricsRequest, com.google.ads.googleads.v9.services.GenerateForecastMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateForecastMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GenerateForecastMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GenerateForecastMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("GenerateForecastMetrics"))
              .build();
        }
      }
    }
    return getGenerateForecastMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GenerateHistoricalMetricsRequest,
      com.google.ads.googleads.v9.services.GenerateHistoricalMetricsResponse> getGenerateHistoricalMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateHistoricalMetrics",
      requestType = com.google.ads.googleads.v9.services.GenerateHistoricalMetricsRequest.class,
      responseType = com.google.ads.googleads.v9.services.GenerateHistoricalMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GenerateHistoricalMetricsRequest,
      com.google.ads.googleads.v9.services.GenerateHistoricalMetricsResponse> getGenerateHistoricalMetricsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GenerateHistoricalMetricsRequest, com.google.ads.googleads.v9.services.GenerateHistoricalMetricsResponse> getGenerateHistoricalMetricsMethod;
    if ((getGenerateHistoricalMetricsMethod = KeywordPlanServiceGrpc.getGenerateHistoricalMetricsMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getGenerateHistoricalMetricsMethod = KeywordPlanServiceGrpc.getGenerateHistoricalMetricsMethod) == null) {
          KeywordPlanServiceGrpc.getGenerateHistoricalMetricsMethod = getGenerateHistoricalMetricsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GenerateHistoricalMetricsRequest, com.google.ads.googleads.v9.services.GenerateHistoricalMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateHistoricalMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GenerateHistoricalMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GenerateHistoricalMetricsResponse.getDefaultInstance()))
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
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getKeywordPlan(com.google.ads.googleads.v9.services.GetKeywordPlanRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.KeywordPlan> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKeywordPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateKeywordPlans(com.google.ads.googleads.v9.services.MutateKeywordPlansRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateKeywordPlansResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateKeywordPlansMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecast curve.
     * Only the bidding strategy is considered for generating forecast curve.
     * The bidding strategy value specified in the plan is ignored.
     * To generate a forecast at a value specified in the plan, use
     * KeywordPlanService.GenerateForecastMetrics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateForecastCurve(com.google.ads.googleads.v9.services.GenerateForecastCurveRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GenerateForecastCurveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateForecastCurveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a forecast in the form of a time series for the Keyword Plan over
     * the next 52 weeks.
     * (1) Forecasts closer to the current date are generally more accurate than
     * further out.
     * (2) The forecast reflects seasonal trends using current and
     * prior traffic patterns. The forecast period of the plan is ignored.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateForecastTimeSeries(com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateForecastTimeSeriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecasts.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateForecastMetrics(com.google.ads.googleads.v9.services.GenerateForecastMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GenerateForecastMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateForecastMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan historical metrics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateHistoricalMetrics(com.google.ads.googleads.v9.services.GenerateHistoricalMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GenerateHistoricalMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateHistoricalMetricsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetKeywordPlanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetKeywordPlanRequest,
                com.google.ads.googleads.v9.resources.KeywordPlan>(
                  this, METHODID_GET_KEYWORD_PLAN)))
          .addMethod(
            getMutateKeywordPlansMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateKeywordPlansRequest,
                com.google.ads.googleads.v9.services.MutateKeywordPlansResponse>(
                  this, METHODID_MUTATE_KEYWORD_PLANS)))
          .addMethod(
            getGenerateForecastCurveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GenerateForecastCurveRequest,
                com.google.ads.googleads.v9.services.GenerateForecastCurveResponse>(
                  this, METHODID_GENERATE_FORECAST_CURVE)))
          .addMethod(
            getGenerateForecastTimeSeriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesRequest,
                com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesResponse>(
                  this, METHODID_GENERATE_FORECAST_TIME_SERIES)))
          .addMethod(
            getGenerateForecastMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GenerateForecastMetricsRequest,
                com.google.ads.googleads.v9.services.GenerateForecastMetricsResponse>(
                  this, METHODID_GENERATE_FORECAST_METRICS)))
          .addMethod(
            getGenerateHistoricalMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GenerateHistoricalMetricsRequest,
                com.google.ads.googleads.v9.services.GenerateHistoricalMetricsResponse>(
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
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getKeywordPlan(com.google.ads.googleads.v9.services.GetKeywordPlanRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.KeywordPlan> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKeywordPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateKeywordPlans(com.google.ads.googleads.v9.services.MutateKeywordPlansRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateKeywordPlansResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateKeywordPlansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecast curve.
     * Only the bidding strategy is considered for generating forecast curve.
     * The bidding strategy value specified in the plan is ignored.
     * To generate a forecast at a value specified in the plan, use
     * KeywordPlanService.GenerateForecastMetrics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateForecastCurve(com.google.ads.googleads.v9.services.GenerateForecastCurveRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GenerateForecastCurveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateForecastCurveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a forecast in the form of a time series for the Keyword Plan over
     * the next 52 weeks.
     * (1) Forecasts closer to the current date are generally more accurate than
     * further out.
     * (2) The forecast reflects seasonal trends using current and
     * prior traffic patterns. The forecast period of the plan is ignored.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateForecastTimeSeries(com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateForecastTimeSeriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecasts.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateForecastMetrics(com.google.ads.googleads.v9.services.GenerateForecastMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GenerateForecastMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateForecastMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan historical metrics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateHistoricalMetrics(com.google.ads.googleads.v9.services.GenerateHistoricalMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GenerateHistoricalMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.KeywordPlan getKeywordPlan(com.google.ads.googleads.v9.services.GetKeywordPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKeywordPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.MutateKeywordPlansResponse mutateKeywordPlans(com.google.ads.googleads.v9.services.MutateKeywordPlansRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateKeywordPlansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecast curve.
     * Only the bidding strategy is considered for generating forecast curve.
     * The bidding strategy value specified in the plan is ignored.
     * To generate a forecast at a value specified in the plan, use
     * KeywordPlanService.GenerateForecastMetrics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.GenerateForecastCurveResponse generateForecastCurve(com.google.ads.googleads.v9.services.GenerateForecastCurveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateForecastCurveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a forecast in the form of a time series for the Keyword Plan over
     * the next 52 weeks.
     * (1) Forecasts closer to the current date are generally more accurate than
     * further out.
     * (2) The forecast reflects seasonal trends using current and
     * prior traffic patterns. The forecast period of the plan is ignored.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesResponse generateForecastTimeSeries(com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateForecastTimeSeriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecasts.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.GenerateForecastMetricsResponse generateForecastMetrics(com.google.ads.googleads.v9.services.GenerateForecastMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateForecastMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan historical metrics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.GenerateHistoricalMetricsResponse generateHistoricalMetrics(com.google.ads.googleads.v9.services.GenerateHistoricalMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.KeywordPlan> getKeywordPlan(
        com.google.ads.googleads.v9.services.GetKeywordPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKeywordPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateKeywordPlansResponse> mutateKeywordPlans(
        com.google.ads.googleads.v9.services.MutateKeywordPlansRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateKeywordPlansMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecast curve.
     * Only the bidding strategy is considered for generating forecast curve.
     * The bidding strategy value specified in the plan is ignored.
     * To generate a forecast at a value specified in the plan, use
     * KeywordPlanService.GenerateForecastMetrics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.GenerateForecastCurveResponse> generateForecastCurve(
        com.google.ads.googleads.v9.services.GenerateForecastCurveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateForecastCurveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a forecast in the form of a time series for the Keyword Plan over
     * the next 52 weeks.
     * (1) Forecasts closer to the current date are generally more accurate than
     * further out.
     * (2) The forecast reflects seasonal trends using current and
     * prior traffic patterns. The forecast period of the plan is ignored.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesResponse> generateForecastTimeSeries(
        com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateForecastTimeSeriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan forecasts.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.GenerateForecastMetricsResponse> generateForecastMetrics(
        com.google.ads.googleads.v9.services.GenerateForecastMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateForecastMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan historical metrics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.GenerateHistoricalMetricsResponse> generateHistoricalMetrics(
        com.google.ads.googleads.v9.services.GenerateHistoricalMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateHistoricalMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_KEYWORD_PLAN = 0;
  private static final int METHODID_MUTATE_KEYWORD_PLANS = 1;
  private static final int METHODID_GENERATE_FORECAST_CURVE = 2;
  private static final int METHODID_GENERATE_FORECAST_TIME_SERIES = 3;
  private static final int METHODID_GENERATE_FORECAST_METRICS = 4;
  private static final int METHODID_GENERATE_HISTORICAL_METRICS = 5;

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
          serviceImpl.getKeywordPlan((com.google.ads.googleads.v9.services.GetKeywordPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.KeywordPlan>) responseObserver);
          break;
        case METHODID_MUTATE_KEYWORD_PLANS:
          serviceImpl.mutateKeywordPlans((com.google.ads.googleads.v9.services.MutateKeywordPlansRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateKeywordPlansResponse>) responseObserver);
          break;
        case METHODID_GENERATE_FORECAST_CURVE:
          serviceImpl.generateForecastCurve((com.google.ads.googleads.v9.services.GenerateForecastCurveRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GenerateForecastCurveResponse>) responseObserver);
          break;
        case METHODID_GENERATE_FORECAST_TIME_SERIES:
          serviceImpl.generateForecastTimeSeries((com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GenerateForecastTimeSeriesResponse>) responseObserver);
          break;
        case METHODID_GENERATE_FORECAST_METRICS:
          serviceImpl.generateForecastMetrics((com.google.ads.googleads.v9.services.GenerateForecastMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GenerateForecastMetricsResponse>) responseObserver);
          break;
        case METHODID_GENERATE_HISTORICAL_METRICS:
          serviceImpl.generateHistoricalMetrics((com.google.ads.googleads.v9.services.GenerateHistoricalMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.GenerateHistoricalMetricsResponse>) responseObserver);
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
      return com.google.ads.googleads.v9.services.KeywordPlanServiceProto.getDescriptor();
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
              .addMethod(getGenerateForecastCurveMethod())
              .addMethod(getGenerateForecastTimeSeriesMethod())
              .addMethod(getGenerateForecastMetricsMethod())
              .addMethod(getGenerateHistoricalMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
