package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage bidding strategies.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/bidding_strategy_service.proto")
public final class BiddingStrategyServiceGrpc {

  private BiddingStrategyServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.BiddingStrategyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetBiddingStrategyRequest,
      com.google.ads.googleads.v9.resources.BiddingStrategy> getGetBiddingStrategyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBiddingStrategy",
      requestType = com.google.ads.googleads.v9.services.GetBiddingStrategyRequest.class,
      responseType = com.google.ads.googleads.v9.resources.BiddingStrategy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetBiddingStrategyRequest,
      com.google.ads.googleads.v9.resources.BiddingStrategy> getGetBiddingStrategyMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetBiddingStrategyRequest, com.google.ads.googleads.v9.resources.BiddingStrategy> getGetBiddingStrategyMethod;
    if ((getGetBiddingStrategyMethod = BiddingStrategyServiceGrpc.getGetBiddingStrategyMethod) == null) {
      synchronized (BiddingStrategyServiceGrpc.class) {
        if ((getGetBiddingStrategyMethod = BiddingStrategyServiceGrpc.getGetBiddingStrategyMethod) == null) {
          BiddingStrategyServiceGrpc.getGetBiddingStrategyMethod = getGetBiddingStrategyMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetBiddingStrategyRequest, com.google.ads.googleads.v9.resources.BiddingStrategy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBiddingStrategy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetBiddingStrategyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.BiddingStrategy.getDefaultInstance()))
              .setSchemaDescriptor(new BiddingStrategyServiceMethodDescriptorSupplier("GetBiddingStrategy"))
              .build();
        }
      }
    }
    return getGetBiddingStrategyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateBiddingStrategiesRequest,
      com.google.ads.googleads.v9.services.MutateBiddingStrategiesResponse> getMutateBiddingStrategiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateBiddingStrategies",
      requestType = com.google.ads.googleads.v9.services.MutateBiddingStrategiesRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateBiddingStrategiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateBiddingStrategiesRequest,
      com.google.ads.googleads.v9.services.MutateBiddingStrategiesResponse> getMutateBiddingStrategiesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateBiddingStrategiesRequest, com.google.ads.googleads.v9.services.MutateBiddingStrategiesResponse> getMutateBiddingStrategiesMethod;
    if ((getMutateBiddingStrategiesMethod = BiddingStrategyServiceGrpc.getMutateBiddingStrategiesMethod) == null) {
      synchronized (BiddingStrategyServiceGrpc.class) {
        if ((getMutateBiddingStrategiesMethod = BiddingStrategyServiceGrpc.getMutateBiddingStrategiesMethod) == null) {
          BiddingStrategyServiceGrpc.getMutateBiddingStrategiesMethod = getMutateBiddingStrategiesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateBiddingStrategiesRequest, com.google.ads.googleads.v9.services.MutateBiddingStrategiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateBiddingStrategies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateBiddingStrategiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateBiddingStrategiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BiddingStrategyServiceMethodDescriptorSupplier("MutateBiddingStrategies"))
              .build();
        }
      }
    }
    return getMutateBiddingStrategiesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BiddingStrategyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BiddingStrategyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BiddingStrategyServiceStub>() {
        @java.lang.Override
        public BiddingStrategyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BiddingStrategyServiceStub(channel, callOptions);
        }
      };
    return BiddingStrategyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BiddingStrategyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BiddingStrategyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BiddingStrategyServiceBlockingStub>() {
        @java.lang.Override
        public BiddingStrategyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BiddingStrategyServiceBlockingStub(channel, callOptions);
        }
      };
    return BiddingStrategyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BiddingStrategyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BiddingStrategyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BiddingStrategyServiceFutureStub>() {
        @java.lang.Override
        public BiddingStrategyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BiddingStrategyServiceFutureStub(channel, callOptions);
        }
      };
    return BiddingStrategyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage bidding strategies.
   * </pre>
   */
  public static abstract class BiddingStrategyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested bidding strategy in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getBiddingStrategy(com.google.ads.googleads.v9.services.GetBiddingStrategyRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.BiddingStrategy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBiddingStrategyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes bidding strategies. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BiddingError]()
     *   [BiddingStrategyError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateBiddingStrategies(com.google.ads.googleads.v9.services.MutateBiddingStrategiesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateBiddingStrategiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateBiddingStrategiesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBiddingStrategyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetBiddingStrategyRequest,
                com.google.ads.googleads.v9.resources.BiddingStrategy>(
                  this, METHODID_GET_BIDDING_STRATEGY)))
          .addMethod(
            getMutateBiddingStrategiesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateBiddingStrategiesRequest,
                com.google.ads.googleads.v9.services.MutateBiddingStrategiesResponse>(
                  this, METHODID_MUTATE_BIDDING_STRATEGIES)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage bidding strategies.
   * </pre>
   */
  public static final class BiddingStrategyServiceStub extends io.grpc.stub.AbstractAsyncStub<BiddingStrategyServiceStub> {
    private BiddingStrategyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingStrategyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BiddingStrategyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested bidding strategy in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getBiddingStrategy(com.google.ads.googleads.v9.services.GetBiddingStrategyRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.BiddingStrategy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBiddingStrategyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes bidding strategies. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BiddingError]()
     *   [BiddingStrategyError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateBiddingStrategies(com.google.ads.googleads.v9.services.MutateBiddingStrategiesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateBiddingStrategiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateBiddingStrategiesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage bidding strategies.
   * </pre>
   */
  public static final class BiddingStrategyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BiddingStrategyServiceBlockingStub> {
    private BiddingStrategyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingStrategyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BiddingStrategyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested bidding strategy in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.BiddingStrategy getBiddingStrategy(com.google.ads.googleads.v9.services.GetBiddingStrategyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBiddingStrategyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes bidding strategies. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BiddingError]()
     *   [BiddingStrategyError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.MutateBiddingStrategiesResponse mutateBiddingStrategies(com.google.ads.googleads.v9.services.MutateBiddingStrategiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateBiddingStrategiesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage bidding strategies.
   * </pre>
   */
  public static final class BiddingStrategyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BiddingStrategyServiceFutureStub> {
    private BiddingStrategyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingStrategyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BiddingStrategyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested bidding strategy in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.BiddingStrategy> getBiddingStrategy(
        com.google.ads.googleads.v9.services.GetBiddingStrategyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBiddingStrategyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes bidding strategies. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BiddingError]()
     *   [BiddingStrategyError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateBiddingStrategiesResponse> mutateBiddingStrategies(
        com.google.ads.googleads.v9.services.MutateBiddingStrategiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateBiddingStrategiesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BIDDING_STRATEGY = 0;
  private static final int METHODID_MUTATE_BIDDING_STRATEGIES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BiddingStrategyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BiddingStrategyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BIDDING_STRATEGY:
          serviceImpl.getBiddingStrategy((com.google.ads.googleads.v9.services.GetBiddingStrategyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.BiddingStrategy>) responseObserver);
          break;
        case METHODID_MUTATE_BIDDING_STRATEGIES:
          serviceImpl.mutateBiddingStrategies((com.google.ads.googleads.v9.services.MutateBiddingStrategiesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateBiddingStrategiesResponse>) responseObserver);
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

  private static abstract class BiddingStrategyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BiddingStrategyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.BiddingStrategyServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BiddingStrategyService");
    }
  }

  private static final class BiddingStrategyServiceFileDescriptorSupplier
      extends BiddingStrategyServiceBaseDescriptorSupplier {
    BiddingStrategyServiceFileDescriptorSupplier() {}
  }

  private static final class BiddingStrategyServiceMethodDescriptorSupplier
      extends BiddingStrategyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BiddingStrategyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BiddingStrategyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BiddingStrategyServiceFileDescriptorSupplier())
              .addMethod(getGetBiddingStrategyMethod())
              .addMethod(getMutateBiddingStrategiesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
