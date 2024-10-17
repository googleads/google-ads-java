package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage feed item targets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/feed_item_target_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FeedItemTargetServiceGrpc {

  private FeedItemTargetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.FeedItemTargetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateFeedItemTargetsRequest,
      com.google.ads.googleads.v18.services.MutateFeedItemTargetsResponse> getMutateFeedItemTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateFeedItemTargets",
      requestType = com.google.ads.googleads.v18.services.MutateFeedItemTargetsRequest.class,
      responseType = com.google.ads.googleads.v18.services.MutateFeedItemTargetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateFeedItemTargetsRequest,
      com.google.ads.googleads.v18.services.MutateFeedItemTargetsResponse> getMutateFeedItemTargetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateFeedItemTargetsRequest, com.google.ads.googleads.v18.services.MutateFeedItemTargetsResponse> getMutateFeedItemTargetsMethod;
    if ((getMutateFeedItemTargetsMethod = FeedItemTargetServiceGrpc.getMutateFeedItemTargetsMethod) == null) {
      synchronized (FeedItemTargetServiceGrpc.class) {
        if ((getMutateFeedItemTargetsMethod = FeedItemTargetServiceGrpc.getMutateFeedItemTargetsMethod) == null) {
          FeedItemTargetServiceGrpc.getMutateFeedItemTargetsMethod = getMutateFeedItemTargetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.MutateFeedItemTargetsRequest, com.google.ads.googleads.v18.services.MutateFeedItemTargetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateFeedItemTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateFeedItemTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateFeedItemTargetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeedItemTargetServiceMethodDescriptorSupplier("MutateFeedItemTargets"))
              .build();
        }
      }
    }
    return getMutateFeedItemTargetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedItemTargetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemTargetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemTargetServiceStub>() {
        @java.lang.Override
        public FeedItemTargetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemTargetServiceStub(channel, callOptions);
        }
      };
    return FeedItemTargetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedItemTargetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemTargetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemTargetServiceBlockingStub>() {
        @java.lang.Override
        public FeedItemTargetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemTargetServiceBlockingStub(channel, callOptions);
        }
      };
    return FeedItemTargetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedItemTargetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemTargetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemTargetServiceFutureStub>() {
        @java.lang.Override
        public FeedItemTargetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemTargetServiceFutureStub(channel, callOptions);
        }
      };
    return FeedItemTargetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage feed item targets.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates or removes feed item targets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FeedItemTargetError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    default void mutateFeedItemTargets(com.google.ads.googleads.v18.services.MutateFeedItemTargetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateFeedItemTargetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateFeedItemTargetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FeedItemTargetService.
   * <pre>
   * Service to manage feed item targets.
   * </pre>
   */
  public static abstract class FeedItemTargetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FeedItemTargetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FeedItemTargetService.
   * <pre>
   * Service to manage feed item targets.
   * </pre>
   */
  public static final class FeedItemTargetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FeedItemTargetServiceStub> {
    private FeedItemTargetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemTargetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedItemTargetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes feed item targets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FeedItemTargetError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateFeedItemTargets(com.google.ads.googleads.v18.services.MutateFeedItemTargetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateFeedItemTargetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateFeedItemTargetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FeedItemTargetService.
   * <pre>
   * Service to manage feed item targets.
   * </pre>
   */
  public static final class FeedItemTargetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FeedItemTargetServiceBlockingStub> {
    private FeedItemTargetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemTargetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedItemTargetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes feed item targets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FeedItemTargetError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateFeedItemTargetsResponse mutateFeedItemTargets(com.google.ads.googleads.v18.services.MutateFeedItemTargetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateFeedItemTargetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FeedItemTargetService.
   * <pre>
   * Service to manage feed item targets.
   * </pre>
   */
  public static final class FeedItemTargetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FeedItemTargetServiceFutureStub> {
    private FeedItemTargetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemTargetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedItemTargetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes feed item targets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FeedItemTargetError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.MutateFeedItemTargetsResponse> mutateFeedItemTargets(
        com.google.ads.googleads.v18.services.MutateFeedItemTargetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateFeedItemTargetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_FEED_ITEM_TARGETS = 0;

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
        case METHODID_MUTATE_FEED_ITEM_TARGETS:
          serviceImpl.mutateFeedItemTargets((com.google.ads.googleads.v18.services.MutateFeedItemTargetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateFeedItemTargetsResponse>) responseObserver);
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
          getMutateFeedItemTargetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.MutateFeedItemTargetsRequest,
              com.google.ads.googleads.v18.services.MutateFeedItemTargetsResponse>(
                service, METHODID_MUTATE_FEED_ITEM_TARGETS)))
        .build();
  }

  private static abstract class FeedItemTargetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedItemTargetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.FeedItemTargetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedItemTargetService");
    }
  }

  private static final class FeedItemTargetServiceFileDescriptorSupplier
      extends FeedItemTargetServiceBaseDescriptorSupplier {
    FeedItemTargetServiceFileDescriptorSupplier() {}
  }

  private static final class FeedItemTargetServiceMethodDescriptorSupplier
      extends FeedItemTargetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FeedItemTargetServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FeedItemTargetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedItemTargetServiceFileDescriptorSupplier())
              .addMethod(getMutateFeedItemTargetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
