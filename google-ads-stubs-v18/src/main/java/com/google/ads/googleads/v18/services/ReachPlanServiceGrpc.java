package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Reach Plan Service gives users information about audience size that can
 * be reached through advertisement on YouTube. In particular,
 * GenerateReachForecast provides estimated number of people of specified
 * demographics that can be reached by an ad in a given market by a campaign of
 * certain duration with a defined budget.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/reach_plan_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReachPlanServiceGrpc {

  private ReachPlanServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.ReachPlanService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ListPlannableLocationsRequest,
      com.google.ads.googleads.v18.services.ListPlannableLocationsResponse> getListPlannableLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPlannableLocations",
      requestType = com.google.ads.googleads.v18.services.ListPlannableLocationsRequest.class,
      responseType = com.google.ads.googleads.v18.services.ListPlannableLocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ListPlannableLocationsRequest,
      com.google.ads.googleads.v18.services.ListPlannableLocationsResponse> getListPlannableLocationsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ListPlannableLocationsRequest, com.google.ads.googleads.v18.services.ListPlannableLocationsResponse> getListPlannableLocationsMethod;
    if ((getListPlannableLocationsMethod = ReachPlanServiceGrpc.getListPlannableLocationsMethod) == null) {
      synchronized (ReachPlanServiceGrpc.class) {
        if ((getListPlannableLocationsMethod = ReachPlanServiceGrpc.getListPlannableLocationsMethod) == null) {
          ReachPlanServiceGrpc.getListPlannableLocationsMethod = getListPlannableLocationsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.ListPlannableLocationsRequest, com.google.ads.googleads.v18.services.ListPlannableLocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPlannableLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.ListPlannableLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.ListPlannableLocationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReachPlanServiceMethodDescriptorSupplier("ListPlannableLocations"))
              .build();
        }
      }
    }
    return getListPlannableLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ListPlannableProductsRequest,
      com.google.ads.googleads.v18.services.ListPlannableProductsResponse> getListPlannableProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPlannableProducts",
      requestType = com.google.ads.googleads.v18.services.ListPlannableProductsRequest.class,
      responseType = com.google.ads.googleads.v18.services.ListPlannableProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ListPlannableProductsRequest,
      com.google.ads.googleads.v18.services.ListPlannableProductsResponse> getListPlannableProductsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ListPlannableProductsRequest, com.google.ads.googleads.v18.services.ListPlannableProductsResponse> getListPlannableProductsMethod;
    if ((getListPlannableProductsMethod = ReachPlanServiceGrpc.getListPlannableProductsMethod) == null) {
      synchronized (ReachPlanServiceGrpc.class) {
        if ((getListPlannableProductsMethod = ReachPlanServiceGrpc.getListPlannableProductsMethod) == null) {
          ReachPlanServiceGrpc.getListPlannableProductsMethod = getListPlannableProductsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.ListPlannableProductsRequest, com.google.ads.googleads.v18.services.ListPlannableProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPlannableProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.ListPlannableProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.ListPlannableProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReachPlanServiceMethodDescriptorSupplier("ListPlannableProducts"))
              .build();
        }
      }
    }
    return getListPlannableProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateReachForecastRequest,
      com.google.ads.googleads.v18.services.GenerateReachForecastResponse> getGenerateReachForecastMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateReachForecast",
      requestType = com.google.ads.googleads.v18.services.GenerateReachForecastRequest.class,
      responseType = com.google.ads.googleads.v18.services.GenerateReachForecastResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateReachForecastRequest,
      com.google.ads.googleads.v18.services.GenerateReachForecastResponse> getGenerateReachForecastMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateReachForecastRequest, com.google.ads.googleads.v18.services.GenerateReachForecastResponse> getGenerateReachForecastMethod;
    if ((getGenerateReachForecastMethod = ReachPlanServiceGrpc.getGenerateReachForecastMethod) == null) {
      synchronized (ReachPlanServiceGrpc.class) {
        if ((getGenerateReachForecastMethod = ReachPlanServiceGrpc.getGenerateReachForecastMethod) == null) {
          ReachPlanServiceGrpc.getGenerateReachForecastMethod = getGenerateReachForecastMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.GenerateReachForecastRequest, com.google.ads.googleads.v18.services.GenerateReachForecastResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateReachForecast"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateReachForecastRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateReachForecastResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReachPlanServiceMethodDescriptorSupplier("GenerateReachForecast"))
              .build();
        }
      }
    }
    return getGenerateReachForecastMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReachPlanServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReachPlanServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReachPlanServiceStub>() {
        @java.lang.Override
        public ReachPlanServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReachPlanServiceStub(channel, callOptions);
        }
      };
    return ReachPlanServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ReachPlanServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReachPlanServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReachPlanServiceBlockingV2Stub>() {
        @java.lang.Override
        public ReachPlanServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReachPlanServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ReachPlanServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReachPlanServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReachPlanServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReachPlanServiceBlockingStub>() {
        @java.lang.Override
        public ReachPlanServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReachPlanServiceBlockingStub(channel, callOptions);
        }
      };
    return ReachPlanServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReachPlanServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReachPlanServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReachPlanServiceFutureStub>() {
        @java.lang.Override
        public ReachPlanServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReachPlanServiceFutureStub(channel, callOptions);
        }
      };
    return ReachPlanServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Reach Plan Service gives users information about audience size that can
   * be reached through advertisement on YouTube. In particular,
   * GenerateReachForecast provides estimated number of people of specified
   * demographics that can be reached by an ad in a given market by a campaign of
   * certain duration with a defined budget.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the list of plannable locations (for example, countries).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void listPlannableLocations(com.google.ads.googleads.v18.services.ListPlannableLocationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ListPlannableLocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPlannableLocationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of per-location plannable YouTube ad formats with allowed
     * targeting.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void listPlannableProducts(com.google.ads.googleads.v18.services.ListPlannableProductsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ListPlannableProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPlannableProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates a reach forecast for a given targeting / product mix.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [ReachPlanError]()
     *   [RequestError]()
     * </pre>
     */
    default void generateReachForecast(com.google.ads.googleads.v18.services.GenerateReachForecastRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateReachForecastResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateReachForecastMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ReachPlanService.
   * <pre>
   * Reach Plan Service gives users information about audience size that can
   * be reached through advertisement on YouTube. In particular,
   * GenerateReachForecast provides estimated number of people of specified
   * demographics that can be reached by an ad in a given market by a campaign of
   * certain duration with a defined budget.
   * </pre>
   */
  public static abstract class ReachPlanServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ReachPlanServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ReachPlanService.
   * <pre>
   * Reach Plan Service gives users information about audience size that can
   * be reached through advertisement on YouTube. In particular,
   * GenerateReachForecast provides estimated number of people of specified
   * demographics that can be reached by an ad in a given market by a campaign of
   * certain duration with a defined budget.
   * </pre>
   */
  public static final class ReachPlanServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ReachPlanServiceStub> {
    private ReachPlanServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReachPlanServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReachPlanServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of plannable locations (for example, countries).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void listPlannableLocations(com.google.ads.googleads.v18.services.ListPlannableLocationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ListPlannableLocationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPlannableLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of per-location plannable YouTube ad formats with allowed
     * targeting.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void listPlannableProducts(com.google.ads.googleads.v18.services.ListPlannableProductsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ListPlannableProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPlannableProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates a reach forecast for a given targeting / product mix.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [ReachPlanError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateReachForecast(com.google.ads.googleads.v18.services.GenerateReachForecastRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateReachForecastResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateReachForecastMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ReachPlanService.
   * <pre>
   * Reach Plan Service gives users information about audience size that can
   * be reached through advertisement on YouTube. In particular,
   * GenerateReachForecast provides estimated number of people of specified
   * demographics that can be reached by an ad in a given market by a campaign of
   * certain duration with a defined budget.
   * </pre>
   */
  public static final class ReachPlanServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ReachPlanServiceBlockingV2Stub> {
    private ReachPlanServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReachPlanServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReachPlanServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of plannable locations (for example, countries).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.ListPlannableLocationsResponse listPlannableLocations(com.google.ads.googleads.v18.services.ListPlannableLocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPlannableLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of per-location plannable YouTube ad formats with allowed
     * targeting.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.ListPlannableProductsResponse listPlannableProducts(com.google.ads.googleads.v18.services.ListPlannableProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPlannableProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a reach forecast for a given targeting / product mix.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [ReachPlanError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GenerateReachForecastResponse generateReachForecast(com.google.ads.googleads.v18.services.GenerateReachForecastRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateReachForecastMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ReachPlanService.
   * <pre>
   * Reach Plan Service gives users information about audience size that can
   * be reached through advertisement on YouTube. In particular,
   * GenerateReachForecast provides estimated number of people of specified
   * demographics that can be reached by an ad in a given market by a campaign of
   * certain duration with a defined budget.
   * </pre>
   */
  public static final class ReachPlanServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ReachPlanServiceBlockingStub> {
    private ReachPlanServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReachPlanServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReachPlanServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of plannable locations (for example, countries).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.ListPlannableLocationsResponse listPlannableLocations(com.google.ads.googleads.v18.services.ListPlannableLocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPlannableLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of per-location plannable YouTube ad formats with allowed
     * targeting.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.ListPlannableProductsResponse listPlannableProducts(com.google.ads.googleads.v18.services.ListPlannableProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPlannableProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a reach forecast for a given targeting / product mix.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [ReachPlanError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GenerateReachForecastResponse generateReachForecast(com.google.ads.googleads.v18.services.GenerateReachForecastRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateReachForecastMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ReachPlanService.
   * <pre>
   * Reach Plan Service gives users information about audience size that can
   * be reached through advertisement on YouTube. In particular,
   * GenerateReachForecast provides estimated number of people of specified
   * demographics that can be reached by an ad in a given market by a campaign of
   * certain duration with a defined budget.
   * </pre>
   */
  public static final class ReachPlanServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ReachPlanServiceFutureStub> {
    private ReachPlanServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReachPlanServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReachPlanServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of plannable locations (for example, countries).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.ListPlannableLocationsResponse> listPlannableLocations(
        com.google.ads.googleads.v18.services.ListPlannableLocationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPlannableLocationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of per-location plannable YouTube ad formats with allowed
     * targeting.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.ListPlannableProductsResponse> listPlannableProducts(
        com.google.ads.googleads.v18.services.ListPlannableProductsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPlannableProductsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates a reach forecast for a given targeting / product mix.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [ReachPlanError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.GenerateReachForecastResponse> generateReachForecast(
        com.google.ads.googleads.v18.services.GenerateReachForecastRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateReachForecastMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PLANNABLE_LOCATIONS = 0;
  private static final int METHODID_LIST_PLANNABLE_PRODUCTS = 1;
  private static final int METHODID_GENERATE_REACH_FORECAST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_PLANNABLE_LOCATIONS:
          serviceImpl.listPlannableLocations((com.google.ads.googleads.v18.services.ListPlannableLocationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ListPlannableLocationsResponse>) responseObserver);
          break;
        case METHODID_LIST_PLANNABLE_PRODUCTS:
          serviceImpl.listPlannableProducts((com.google.ads.googleads.v18.services.ListPlannableProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ListPlannableProductsResponse>) responseObserver);
          break;
        case METHODID_GENERATE_REACH_FORECAST:
          serviceImpl.generateReachForecast((com.google.ads.googleads.v18.services.GenerateReachForecastRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateReachForecastResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListPlannableLocationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.ListPlannableLocationsRequest,
              com.google.ads.googleads.v18.services.ListPlannableLocationsResponse>(
                service, METHODID_LIST_PLANNABLE_LOCATIONS)))
        .addMethod(
          getListPlannableProductsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.ListPlannableProductsRequest,
              com.google.ads.googleads.v18.services.ListPlannableProductsResponse>(
                service, METHODID_LIST_PLANNABLE_PRODUCTS)))
        .addMethod(
          getGenerateReachForecastMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.GenerateReachForecastRequest,
              com.google.ads.googleads.v18.services.GenerateReachForecastResponse>(
                service, METHODID_GENERATE_REACH_FORECAST)))
        .build();
  }

  private static abstract class ReachPlanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReachPlanServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.ReachPlanServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReachPlanService");
    }
  }

  private static final class ReachPlanServiceFileDescriptorSupplier
      extends ReachPlanServiceBaseDescriptorSupplier {
    ReachPlanServiceFileDescriptorSupplier() {}
  }

  private static final class ReachPlanServiceMethodDescriptorSupplier
      extends ReachPlanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ReachPlanServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ReachPlanServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReachPlanServiceFileDescriptorSupplier())
              .addMethod(getListPlannableLocationsMethod())
              .addMethod(getListPlannableProductsMethod())
              .addMethod(getGenerateReachForecastMethod())
              .build();
        }
      }
    }
    return result;
  }
}
