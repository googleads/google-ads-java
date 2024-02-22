package com.google.ads.googleads.v16.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage feed items.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v16/services/feed_item_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FeedItemServiceGrpc {

  private FeedItemServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v16.services.FeedItemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateFeedItemsRequest,
      com.google.ads.googleads.v16.services.MutateFeedItemsResponse> getMutateFeedItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateFeedItems",
      requestType = com.google.ads.googleads.v16.services.MutateFeedItemsRequest.class,
      responseType = com.google.ads.googleads.v16.services.MutateFeedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateFeedItemsRequest,
      com.google.ads.googleads.v16.services.MutateFeedItemsResponse> getMutateFeedItemsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateFeedItemsRequest, com.google.ads.googleads.v16.services.MutateFeedItemsResponse> getMutateFeedItemsMethod;
    if ((getMutateFeedItemsMethod = FeedItemServiceGrpc.getMutateFeedItemsMethod) == null) {
      synchronized (FeedItemServiceGrpc.class) {
        if ((getMutateFeedItemsMethod = FeedItemServiceGrpc.getMutateFeedItemsMethod) == null) {
          FeedItemServiceGrpc.getMutateFeedItemsMethod = getMutateFeedItemsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v16.services.MutateFeedItemsRequest, com.google.ads.googleads.v16.services.MutateFeedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateFeedItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v16.services.MutateFeedItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v16.services.MutateFeedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeedItemServiceMethodDescriptorSupplier("MutateFeedItems"))
              .build();
        }
      }
    }
    return getMutateFeedItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedItemServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemServiceStub>() {
        @java.lang.Override
        public FeedItemServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemServiceStub(channel, callOptions);
        }
      };
    return FeedItemServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedItemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemServiceBlockingStub>() {
        @java.lang.Override
        public FeedItemServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemServiceBlockingStub(channel, callOptions);
        }
      };
    return FeedItemServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedItemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemServiceFutureStub>() {
        @java.lang.Override
        public FeedItemServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemServiceFutureStub(channel, callOptions);
        }
      };
    return FeedItemServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage feed items.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes feed items. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FeedItemError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    default void mutateFeedItems(com.google.ads.googleads.v16.services.MutateFeedItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateFeedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateFeedItemsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FeedItemService.
   * <pre>
   * Service to manage feed items.
   * </pre>
   */
  public static abstract class FeedItemServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FeedItemServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FeedItemService.
   * <pre>
   * Service to manage feed items.
   * </pre>
   */
  public static final class FeedItemServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FeedItemServiceStub> {
    private FeedItemServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedItemServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes feed items. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FeedItemError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public void mutateFeedItems(com.google.ads.googleads.v16.services.MutateFeedItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateFeedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateFeedItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FeedItemService.
   * <pre>
   * Service to manage feed items.
   * </pre>
   */
  public static final class FeedItemServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FeedItemServiceBlockingStub> {
    private FeedItemServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedItemServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes feed items. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FeedItemError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.ads.googleads.v16.services.MutateFeedItemsResponse mutateFeedItems(com.google.ads.googleads.v16.services.MutateFeedItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateFeedItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FeedItemService.
   * <pre>
   * Service to manage feed items.
   * </pre>
   */
  public static final class FeedItemServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FeedItemServiceFutureStub> {
    private FeedItemServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedItemServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes feed items. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FeedItemError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v16.services.MutateFeedItemsResponse> mutateFeedItems(
        com.google.ads.googleads.v16.services.MutateFeedItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateFeedItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_FEED_ITEMS = 0;

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
        case METHODID_MUTATE_FEED_ITEMS:
          serviceImpl.mutateFeedItems((com.google.ads.googleads.v16.services.MutateFeedItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateFeedItemsResponse>) responseObserver);
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
          getMutateFeedItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v16.services.MutateFeedItemsRequest,
              com.google.ads.googleads.v16.services.MutateFeedItemsResponse>(
                service, METHODID_MUTATE_FEED_ITEMS)))
        .build();
  }

  private static abstract class FeedItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedItemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v16.services.FeedItemServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedItemService");
    }
  }

  private static final class FeedItemServiceFileDescriptorSupplier
      extends FeedItemServiceBaseDescriptorSupplier {
    FeedItemServiceFileDescriptorSupplier() {}
  }

  private static final class FeedItemServiceMethodDescriptorSupplier
      extends FeedItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FeedItemServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FeedItemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedItemServiceFileDescriptorSupplier())
              .addMethod(getMutateFeedItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
