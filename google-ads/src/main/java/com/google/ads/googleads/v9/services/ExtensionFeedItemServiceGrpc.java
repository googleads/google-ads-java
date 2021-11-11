package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage extension feed items.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/extension_feed_item_service.proto")
public final class ExtensionFeedItemServiceGrpc {

  private ExtensionFeedItemServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.ExtensionFeedItemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetExtensionFeedItemRequest,
      com.google.ads.googleads.v9.resources.ExtensionFeedItem> getGetExtensionFeedItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExtensionFeedItem",
      requestType = com.google.ads.googleads.v9.services.GetExtensionFeedItemRequest.class,
      responseType = com.google.ads.googleads.v9.resources.ExtensionFeedItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetExtensionFeedItemRequest,
      com.google.ads.googleads.v9.resources.ExtensionFeedItem> getGetExtensionFeedItemMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetExtensionFeedItemRequest, com.google.ads.googleads.v9.resources.ExtensionFeedItem> getGetExtensionFeedItemMethod;
    if ((getGetExtensionFeedItemMethod = ExtensionFeedItemServiceGrpc.getGetExtensionFeedItemMethod) == null) {
      synchronized (ExtensionFeedItemServiceGrpc.class) {
        if ((getGetExtensionFeedItemMethod = ExtensionFeedItemServiceGrpc.getGetExtensionFeedItemMethod) == null) {
          ExtensionFeedItemServiceGrpc.getGetExtensionFeedItemMethod = getGetExtensionFeedItemMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetExtensionFeedItemRequest, com.google.ads.googleads.v9.resources.ExtensionFeedItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExtensionFeedItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetExtensionFeedItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.ExtensionFeedItem.getDefaultInstance()))
              .setSchemaDescriptor(new ExtensionFeedItemServiceMethodDescriptorSupplier("GetExtensionFeedItem"))
              .build();
        }
      }
    }
    return getGetExtensionFeedItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateExtensionFeedItemsRequest,
      com.google.ads.googleads.v9.services.MutateExtensionFeedItemsResponse> getMutateExtensionFeedItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateExtensionFeedItems",
      requestType = com.google.ads.googleads.v9.services.MutateExtensionFeedItemsRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateExtensionFeedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateExtensionFeedItemsRequest,
      com.google.ads.googleads.v9.services.MutateExtensionFeedItemsResponse> getMutateExtensionFeedItemsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateExtensionFeedItemsRequest, com.google.ads.googleads.v9.services.MutateExtensionFeedItemsResponse> getMutateExtensionFeedItemsMethod;
    if ((getMutateExtensionFeedItemsMethod = ExtensionFeedItemServiceGrpc.getMutateExtensionFeedItemsMethod) == null) {
      synchronized (ExtensionFeedItemServiceGrpc.class) {
        if ((getMutateExtensionFeedItemsMethod = ExtensionFeedItemServiceGrpc.getMutateExtensionFeedItemsMethod) == null) {
          ExtensionFeedItemServiceGrpc.getMutateExtensionFeedItemsMethod = getMutateExtensionFeedItemsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateExtensionFeedItemsRequest, com.google.ads.googleads.v9.services.MutateExtensionFeedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateExtensionFeedItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateExtensionFeedItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateExtensionFeedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExtensionFeedItemServiceMethodDescriptorSupplier("MutateExtensionFeedItems"))
              .build();
        }
      }
    }
    return getMutateExtensionFeedItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExtensionFeedItemServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceStub>() {
        @java.lang.Override
        public ExtensionFeedItemServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExtensionFeedItemServiceStub(channel, callOptions);
        }
      };
    return ExtensionFeedItemServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExtensionFeedItemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceBlockingStub>() {
        @java.lang.Override
        public ExtensionFeedItemServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExtensionFeedItemServiceBlockingStub(channel, callOptions);
        }
      };
    return ExtensionFeedItemServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExtensionFeedItemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceFutureStub>() {
        @java.lang.Override
        public ExtensionFeedItemServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExtensionFeedItemServiceFutureStub(channel, callOptions);
        }
      };
    return ExtensionFeedItemServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public static abstract class ExtensionFeedItemServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested extension feed item in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getExtensionFeedItem(com.google.ads.googleads.v9.services.GetExtensionFeedItemRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.ExtensionFeedItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExtensionFeedItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes extension feed items. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CountryCodeError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionFeedItemError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [LanguageCodeError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public void mutateExtensionFeedItems(com.google.ads.googleads.v9.services.MutateExtensionFeedItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateExtensionFeedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateExtensionFeedItemsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetExtensionFeedItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetExtensionFeedItemRequest,
                com.google.ads.googleads.v9.resources.ExtensionFeedItem>(
                  this, METHODID_GET_EXTENSION_FEED_ITEM)))
          .addMethod(
            getMutateExtensionFeedItemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateExtensionFeedItemsRequest,
                com.google.ads.googleads.v9.services.MutateExtensionFeedItemsResponse>(
                  this, METHODID_MUTATE_EXTENSION_FEED_ITEMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public static final class ExtensionFeedItemServiceStub extends io.grpc.stub.AbstractAsyncStub<ExtensionFeedItemServiceStub> {
    private ExtensionFeedItemServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtensionFeedItemServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExtensionFeedItemServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested extension feed item in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getExtensionFeedItem(com.google.ads.googleads.v9.services.GetExtensionFeedItemRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.ExtensionFeedItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExtensionFeedItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes extension feed items. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CountryCodeError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionFeedItemError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [LanguageCodeError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public void mutateExtensionFeedItems(com.google.ads.googleads.v9.services.MutateExtensionFeedItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateExtensionFeedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateExtensionFeedItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public static final class ExtensionFeedItemServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExtensionFeedItemServiceBlockingStub> {
    private ExtensionFeedItemServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtensionFeedItemServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExtensionFeedItemServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested extension feed item in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.ExtensionFeedItem getExtensionFeedItem(com.google.ads.googleads.v9.services.GetExtensionFeedItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExtensionFeedItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes extension feed items. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CountryCodeError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionFeedItemError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [LanguageCodeError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.MutateExtensionFeedItemsResponse mutateExtensionFeedItems(com.google.ads.googleads.v9.services.MutateExtensionFeedItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateExtensionFeedItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public static final class ExtensionFeedItemServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ExtensionFeedItemServiceFutureStub> {
    private ExtensionFeedItemServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtensionFeedItemServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExtensionFeedItemServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested extension feed item in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.ExtensionFeedItem> getExtensionFeedItem(
        com.google.ads.googleads.v9.services.GetExtensionFeedItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExtensionFeedItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes extension feed items. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CountryCodeError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionFeedItemError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [LanguageCodeError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateExtensionFeedItemsResponse> mutateExtensionFeedItems(
        com.google.ads.googleads.v9.services.MutateExtensionFeedItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateExtensionFeedItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EXTENSION_FEED_ITEM = 0;
  private static final int METHODID_MUTATE_EXTENSION_FEED_ITEMS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExtensionFeedItemServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExtensionFeedItemServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EXTENSION_FEED_ITEM:
          serviceImpl.getExtensionFeedItem((com.google.ads.googleads.v9.services.GetExtensionFeedItemRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.ExtensionFeedItem>) responseObserver);
          break;
        case METHODID_MUTATE_EXTENSION_FEED_ITEMS:
          serviceImpl.mutateExtensionFeedItems((com.google.ads.googleads.v9.services.MutateExtensionFeedItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateExtensionFeedItemsResponse>) responseObserver);
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

  private static abstract class ExtensionFeedItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExtensionFeedItemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.ExtensionFeedItemServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExtensionFeedItemService");
    }
  }

  private static final class ExtensionFeedItemServiceFileDescriptorSupplier
      extends ExtensionFeedItemServiceBaseDescriptorSupplier {
    ExtensionFeedItemServiceFileDescriptorSupplier() {}
  }

  private static final class ExtensionFeedItemServiceMethodDescriptorSupplier
      extends ExtensionFeedItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExtensionFeedItemServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExtensionFeedItemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExtensionFeedItemServiceFileDescriptorSupplier())
              .addMethod(getGetExtensionFeedItemMethod())
              .addMethod(getMutateExtensionFeedItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
