package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage feed items.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/feed_item_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FeedItemServiceGrpc {

  private FeedItemServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.FeedItemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetFeedItemRequest,
      com.google.ads.googleads.v8.resources.FeedItem> getGetFeedItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeedItem",
      requestType = com.google.ads.googleads.v8.services.GetFeedItemRequest.class,
      responseType = com.google.ads.googleads.v8.resources.FeedItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetFeedItemRequest,
      com.google.ads.googleads.v8.resources.FeedItem> getGetFeedItemMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetFeedItemRequest, com.google.ads.googleads.v8.resources.FeedItem> getGetFeedItemMethod;
    if ((getGetFeedItemMethod = FeedItemServiceGrpc.getGetFeedItemMethod) == null) {
      synchronized (FeedItemServiceGrpc.class) {
        if ((getGetFeedItemMethod = FeedItemServiceGrpc.getGetFeedItemMethod) == null) {
          FeedItemServiceGrpc.getGetFeedItemMethod = getGetFeedItemMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetFeedItemRequest, com.google.ads.googleads.v8.resources.FeedItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeedItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetFeedItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.FeedItem.getDefaultInstance()))
              .setSchemaDescriptor(new FeedItemServiceMethodDescriptorSupplier("GetFeedItem"))
              .build();
        }
      }
    }
    return getGetFeedItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateFeedItemsRequest,
      com.google.ads.googleads.v8.services.MutateFeedItemsResponse> getMutateFeedItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateFeedItems",
      requestType = com.google.ads.googleads.v8.services.MutateFeedItemsRequest.class,
      responseType = com.google.ads.googleads.v8.services.MutateFeedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateFeedItemsRequest,
      com.google.ads.googleads.v8.services.MutateFeedItemsResponse> getMutateFeedItemsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateFeedItemsRequest, com.google.ads.googleads.v8.services.MutateFeedItemsResponse> getMutateFeedItemsMethod;
    if ((getMutateFeedItemsMethod = FeedItemServiceGrpc.getMutateFeedItemsMethod) == null) {
      synchronized (FeedItemServiceGrpc.class) {
        if ((getMutateFeedItemsMethod = FeedItemServiceGrpc.getMutateFeedItemsMethod) == null) {
          FeedItemServiceGrpc.getMutateFeedItemsMethod = getMutateFeedItemsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.MutateFeedItemsRequest, com.google.ads.googleads.v8.services.MutateFeedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateFeedItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MutateFeedItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MutateFeedItemsResponse.getDefaultInstance()))
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
  public static abstract class FeedItemServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested feed item in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getFeedItem(com.google.ads.googleads.v8.services.GetFeedItemRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.FeedItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeedItemMethod(), responseObserver);
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
    public void mutateFeedItems(com.google.ads.googleads.v8.services.MutateFeedItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateFeedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateFeedItemsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeedItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetFeedItemRequest,
                com.google.ads.googleads.v8.resources.FeedItem>(
                  this, METHODID_GET_FEED_ITEM)))
          .addMethod(
            getMutateFeedItemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.MutateFeedItemsRequest,
                com.google.ads.googleads.v8.services.MutateFeedItemsResponse>(
                  this, METHODID_MUTATE_FEED_ITEMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage feed items.
   * </pre>
   */
  public static final class FeedItemServiceStub extends io.grpc.stub.AbstractAsyncStub<FeedItemServiceStub> {
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
     * Returns the requested feed item in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getFeedItem(com.google.ads.googleads.v8.services.GetFeedItemRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.FeedItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeedItemMethod(), getCallOptions()), request, responseObserver);
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
    public void mutateFeedItems(com.google.ads.googleads.v8.services.MutateFeedItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateFeedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateFeedItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage feed items.
   * </pre>
   */
  public static final class FeedItemServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FeedItemServiceBlockingStub> {
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
     * Returns the requested feed item in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.FeedItem getFeedItem(com.google.ads.googleads.v8.services.GetFeedItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeedItemMethod(), getCallOptions(), request);
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
    public com.google.ads.googleads.v8.services.MutateFeedItemsResponse mutateFeedItems(com.google.ads.googleads.v8.services.MutateFeedItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateFeedItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage feed items.
   * </pre>
   */
  public static final class FeedItemServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FeedItemServiceFutureStub> {
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
     * Returns the requested feed item in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.FeedItem> getFeedItem(
        com.google.ads.googleads.v8.services.GetFeedItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeedItemMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.services.MutateFeedItemsResponse> mutateFeedItems(
        com.google.ads.googleads.v8.services.MutateFeedItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateFeedItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEED_ITEM = 0;
  private static final int METHODID_MUTATE_FEED_ITEMS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FeedItemServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FeedItemServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEED_ITEM:
          serviceImpl.getFeedItem((com.google.ads.googleads.v8.services.GetFeedItemRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.FeedItem>) responseObserver);
          break;
        case METHODID_MUTATE_FEED_ITEMS:
          serviceImpl.mutateFeedItems((com.google.ads.googleads.v8.services.MutateFeedItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateFeedItemsResponse>) responseObserver);
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

  private static abstract class FeedItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedItemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.FeedItemServiceProto.getDescriptor();
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
    private final String methodName;

    FeedItemServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getGetFeedItemMethod())
              .addMethod(getMutateFeedItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
