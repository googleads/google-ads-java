package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customer feeds.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/customer_feed_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerFeedServiceGrpc {

  private CustomerFeedServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.CustomerFeedService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateCustomerFeedsRequest,
      com.google.ads.googleads.v18.services.MutateCustomerFeedsResponse> getMutateCustomerFeedsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerFeeds",
      requestType = com.google.ads.googleads.v18.services.MutateCustomerFeedsRequest.class,
      responseType = com.google.ads.googleads.v18.services.MutateCustomerFeedsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateCustomerFeedsRequest,
      com.google.ads.googleads.v18.services.MutateCustomerFeedsResponse> getMutateCustomerFeedsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateCustomerFeedsRequest, com.google.ads.googleads.v18.services.MutateCustomerFeedsResponse> getMutateCustomerFeedsMethod;
    if ((getMutateCustomerFeedsMethod = CustomerFeedServiceGrpc.getMutateCustomerFeedsMethod) == null) {
      synchronized (CustomerFeedServiceGrpc.class) {
        if ((getMutateCustomerFeedsMethod = CustomerFeedServiceGrpc.getMutateCustomerFeedsMethod) == null) {
          CustomerFeedServiceGrpc.getMutateCustomerFeedsMethod = getMutateCustomerFeedsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.MutateCustomerFeedsRequest, com.google.ads.googleads.v18.services.MutateCustomerFeedsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerFeeds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateCustomerFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateCustomerFeedsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerFeedServiceMethodDescriptorSupplier("MutateCustomerFeeds"))
              .build();
        }
      }
    }
    return getMutateCustomerFeedsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerFeedServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerFeedServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerFeedServiceStub>() {
        @java.lang.Override
        public CustomerFeedServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerFeedServiceStub(channel, callOptions);
        }
      };
    return CustomerFeedServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerFeedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerFeedServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerFeedServiceBlockingStub>() {
        @java.lang.Override
        public CustomerFeedServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerFeedServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerFeedServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerFeedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerFeedServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerFeedServiceFutureStub>() {
        @java.lang.Override
        public CustomerFeedServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerFeedServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerFeedServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage customer feeds.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes customer feeds. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CustomerFeedError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
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
    default void mutateCustomerFeeds(com.google.ads.googleads.v18.services.MutateCustomerFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateCustomerFeedsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerFeedsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerFeedService.
   * <pre>
   * Service to manage customer feeds.
   * </pre>
   */
  public static abstract class CustomerFeedServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerFeedServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerFeedService.
   * <pre>
   * Service to manage customer feeds.
   * </pre>
   */
  public static final class CustomerFeedServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerFeedServiceStub> {
    private CustomerFeedServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerFeedServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerFeedServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer feeds. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CustomerFeedError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
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
    public void mutateCustomerFeeds(com.google.ads.googleads.v18.services.MutateCustomerFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateCustomerFeedsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerFeedsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerFeedService.
   * <pre>
   * Service to manage customer feeds.
   * </pre>
   */
  public static final class CustomerFeedServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerFeedServiceBlockingStub> {
    private CustomerFeedServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerFeedServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerFeedServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer feeds. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CustomerFeedError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
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
    public com.google.ads.googleads.v18.services.MutateCustomerFeedsResponse mutateCustomerFeeds(com.google.ads.googleads.v18.services.MutateCustomerFeedsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerFeedsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerFeedService.
   * <pre>
   * Service to manage customer feeds.
   * </pre>
   */
  public static final class CustomerFeedServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerFeedServiceFutureStub> {
    private CustomerFeedServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerFeedServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerFeedServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer feeds. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CustomerFeedError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.MutateCustomerFeedsResponse> mutateCustomerFeeds(
        com.google.ads.googleads.v18.services.MutateCustomerFeedsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerFeedsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER_FEEDS = 0;

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
        case METHODID_MUTATE_CUSTOMER_FEEDS:
          serviceImpl.mutateCustomerFeeds((com.google.ads.googleads.v18.services.MutateCustomerFeedsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateCustomerFeedsResponse>) responseObserver);
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
          getMutateCustomerFeedsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.MutateCustomerFeedsRequest,
              com.google.ads.googleads.v18.services.MutateCustomerFeedsResponse>(
                service, METHODID_MUTATE_CUSTOMER_FEEDS)))
        .build();
  }

  private static abstract class CustomerFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerFeedServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.CustomerFeedServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerFeedService");
    }
  }

  private static final class CustomerFeedServiceFileDescriptorSupplier
      extends CustomerFeedServiceBaseDescriptorSupplier {
    CustomerFeedServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerFeedServiceMethodDescriptorSupplier
      extends CustomerFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CustomerFeedServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CustomerFeedServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerFeedServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomerFeedsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
