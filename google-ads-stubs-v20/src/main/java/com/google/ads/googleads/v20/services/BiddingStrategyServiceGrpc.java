package com.google.ads.googleads.v20.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage bidding strategies.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v20/services/bidding_strategy_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BiddingStrategyServiceGrpc {

  private BiddingStrategyServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v20.services.BiddingStrategyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateBiddingStrategiesRequest,
      com.google.ads.googleads.v20.services.MutateBiddingStrategiesResponse> getMutateBiddingStrategiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateBiddingStrategies",
      requestType = com.google.ads.googleads.v20.services.MutateBiddingStrategiesRequest.class,
      responseType = com.google.ads.googleads.v20.services.MutateBiddingStrategiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateBiddingStrategiesRequest,
      com.google.ads.googleads.v20.services.MutateBiddingStrategiesResponse> getMutateBiddingStrategiesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateBiddingStrategiesRequest, com.google.ads.googleads.v20.services.MutateBiddingStrategiesResponse> getMutateBiddingStrategiesMethod;
    if ((getMutateBiddingStrategiesMethod = BiddingStrategyServiceGrpc.getMutateBiddingStrategiesMethod) == null) {
      synchronized (BiddingStrategyServiceGrpc.class) {
        if ((getMutateBiddingStrategiesMethod = BiddingStrategyServiceGrpc.getMutateBiddingStrategiesMethod) == null) {
          BiddingStrategyServiceGrpc.getMutateBiddingStrategiesMethod = getMutateBiddingStrategiesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v20.services.MutateBiddingStrategiesRequest, com.google.ads.googleads.v20.services.MutateBiddingStrategiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateBiddingStrategies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateBiddingStrategiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateBiddingStrategiesResponse.getDefaultInstance()))
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
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static BiddingStrategyServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BiddingStrategyServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BiddingStrategyServiceBlockingV2Stub>() {
        @java.lang.Override
        public BiddingStrategyServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BiddingStrategyServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return BiddingStrategyServiceBlockingV2Stub.newStub(factory, channel);
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
  public interface AsyncService {

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
    default void mutateBiddingStrategies(com.google.ads.googleads.v20.services.MutateBiddingStrategiesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateBiddingStrategiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateBiddingStrategiesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BiddingStrategyService.
   * <pre>
   * Service to manage bidding strategies.
   * </pre>
   */
  public static abstract class BiddingStrategyServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BiddingStrategyServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BiddingStrategyService.
   * <pre>
   * Service to manage bidding strategies.
   * </pre>
   */
  public static final class BiddingStrategyServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BiddingStrategyServiceStub> {
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
    public void mutateBiddingStrategies(com.google.ads.googleads.v20.services.MutateBiddingStrategiesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateBiddingStrategiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateBiddingStrategiesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BiddingStrategyService.
   * <pre>
   * Service to manage bidding strategies.
   * </pre>
   */
  public static final class BiddingStrategyServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<BiddingStrategyServiceBlockingV2Stub> {
    private BiddingStrategyServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingStrategyServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BiddingStrategyServiceBlockingV2Stub(channel, callOptions);
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
    public com.google.ads.googleads.v20.services.MutateBiddingStrategiesResponse mutateBiddingStrategies(com.google.ads.googleads.v20.services.MutateBiddingStrategiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateBiddingStrategiesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service BiddingStrategyService.
   * <pre>
   * Service to manage bidding strategies.
   * </pre>
   */
  public static final class BiddingStrategyServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BiddingStrategyServiceBlockingStub> {
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
    public com.google.ads.googleads.v20.services.MutateBiddingStrategiesResponse mutateBiddingStrategies(com.google.ads.googleads.v20.services.MutateBiddingStrategiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateBiddingStrategiesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BiddingStrategyService.
   * <pre>
   * Service to manage bidding strategies.
   * </pre>
   */
  public static final class BiddingStrategyServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BiddingStrategyServiceFutureStub> {
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v20.services.MutateBiddingStrategiesResponse> mutateBiddingStrategies(
        com.google.ads.googleads.v20.services.MutateBiddingStrategiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateBiddingStrategiesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_BIDDING_STRATEGIES = 0;

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
        case METHODID_MUTATE_BIDDING_STRATEGIES:
          serviceImpl.mutateBiddingStrategies((com.google.ads.googleads.v20.services.MutateBiddingStrategiesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateBiddingStrategiesResponse>) responseObserver);
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
          getMutateBiddingStrategiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v20.services.MutateBiddingStrategiesRequest,
              com.google.ads.googleads.v20.services.MutateBiddingStrategiesResponse>(
                service, METHODID_MUTATE_BIDDING_STRATEGIES)))
        .build();
  }

  private static abstract class BiddingStrategyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BiddingStrategyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v20.services.BiddingStrategyServiceProto.getDescriptor();
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
    private final java.lang.String methodName;

    BiddingStrategyServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getMutateBiddingStrategiesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
