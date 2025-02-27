package com.google.ads.googleads.v19.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customer-manager links.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v19/services/customer_manager_link_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerManagerLinkServiceGrpc {

  private CustomerManagerLinkServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v19.services.CustomerManagerLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateCustomerManagerLinkRequest,
      com.google.ads.googleads.v19.services.MutateCustomerManagerLinkResponse> getMutateCustomerManagerLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerManagerLink",
      requestType = com.google.ads.googleads.v19.services.MutateCustomerManagerLinkRequest.class,
      responseType = com.google.ads.googleads.v19.services.MutateCustomerManagerLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateCustomerManagerLinkRequest,
      com.google.ads.googleads.v19.services.MutateCustomerManagerLinkResponse> getMutateCustomerManagerLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateCustomerManagerLinkRequest, com.google.ads.googleads.v19.services.MutateCustomerManagerLinkResponse> getMutateCustomerManagerLinkMethod;
    if ((getMutateCustomerManagerLinkMethod = CustomerManagerLinkServiceGrpc.getMutateCustomerManagerLinkMethod) == null) {
      synchronized (CustomerManagerLinkServiceGrpc.class) {
        if ((getMutateCustomerManagerLinkMethod = CustomerManagerLinkServiceGrpc.getMutateCustomerManagerLinkMethod) == null) {
          CustomerManagerLinkServiceGrpc.getMutateCustomerManagerLinkMethod = getMutateCustomerManagerLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v19.services.MutateCustomerManagerLinkRequest, com.google.ads.googleads.v19.services.MutateCustomerManagerLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerManagerLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.MutateCustomerManagerLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.MutateCustomerManagerLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerManagerLinkServiceMethodDescriptorSupplier("MutateCustomerManagerLink"))
              .build();
        }
      }
    }
    return getMutateCustomerManagerLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MoveManagerLinkRequest,
      com.google.ads.googleads.v19.services.MoveManagerLinkResponse> getMoveManagerLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveManagerLink",
      requestType = com.google.ads.googleads.v19.services.MoveManagerLinkRequest.class,
      responseType = com.google.ads.googleads.v19.services.MoveManagerLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MoveManagerLinkRequest,
      com.google.ads.googleads.v19.services.MoveManagerLinkResponse> getMoveManagerLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MoveManagerLinkRequest, com.google.ads.googleads.v19.services.MoveManagerLinkResponse> getMoveManagerLinkMethod;
    if ((getMoveManagerLinkMethod = CustomerManagerLinkServiceGrpc.getMoveManagerLinkMethod) == null) {
      synchronized (CustomerManagerLinkServiceGrpc.class) {
        if ((getMoveManagerLinkMethod = CustomerManagerLinkServiceGrpc.getMoveManagerLinkMethod) == null) {
          CustomerManagerLinkServiceGrpc.getMoveManagerLinkMethod = getMoveManagerLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v19.services.MoveManagerLinkRequest, com.google.ads.googleads.v19.services.MoveManagerLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveManagerLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.MoveManagerLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.MoveManagerLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerManagerLinkServiceMethodDescriptorSupplier("MoveManagerLink"))
              .build();
        }
      }
    }
    return getMoveManagerLinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerManagerLinkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceStub>() {
        @java.lang.Override
        public CustomerManagerLinkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerManagerLinkServiceStub(channel, callOptions);
        }
      };
    return CustomerManagerLinkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CustomerManagerLinkServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceBlockingV2Stub>() {
        @java.lang.Override
        public CustomerManagerLinkServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerManagerLinkServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CustomerManagerLinkServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerManagerLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceBlockingStub>() {
        @java.lang.Override
        public CustomerManagerLinkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerManagerLinkServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerManagerLinkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerManagerLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceFutureStub>() {
        @java.lang.Override
        public CustomerManagerLinkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerManagerLinkServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerManagerLinkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage customer-manager links.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Updates customer manager links. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [ManagerLinkError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateCustomerManagerLink(com.google.ads.googleads.v19.services.MutateCustomerManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateCustomerManagerLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerManagerLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves a client customer to a new manager customer.
     * This simplifies the complex request that requires two operations to move
     * a client customer to a new manager, for example:
     * 1. Update operation with Status INACTIVE (previous manager) and,
     * 2. Update operation with Status ACTIVE (new manager).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void moveManagerLink(com.google.ads.googleads.v19.services.MoveManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MoveManagerLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveManagerLinkMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerManagerLinkService.
   * <pre>
   * Service to manage customer-manager links.
   * </pre>
   */
  public static abstract class CustomerManagerLinkServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerManagerLinkServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerManagerLinkService.
   * <pre>
   * Service to manage customer-manager links.
   * </pre>
   */
  public static final class CustomerManagerLinkServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerManagerLinkServiceStub> {
    private CustomerManagerLinkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerManagerLinkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerManagerLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Updates customer manager links. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [ManagerLinkError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateCustomerManagerLink(com.google.ads.googleads.v19.services.MutateCustomerManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateCustomerManagerLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerManagerLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves a client customer to a new manager customer.
     * This simplifies the complex request that requires two operations to move
     * a client customer to a new manager, for example:
     * 1. Update operation with Status INACTIVE (previous manager) and,
     * 2. Update operation with Status ACTIVE (new manager).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void moveManagerLink(com.google.ads.googleads.v19.services.MoveManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MoveManagerLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveManagerLinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerManagerLinkService.
   * <pre>
   * Service to manage customer-manager links.
   * </pre>
   */
  public static final class CustomerManagerLinkServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CustomerManagerLinkServiceBlockingV2Stub> {
    private CustomerManagerLinkServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerManagerLinkServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerManagerLinkServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Updates customer manager links. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [ManagerLinkError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.MutateCustomerManagerLinkResponse mutateCustomerManagerLink(com.google.ads.googleads.v19.services.MutateCustomerManagerLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerManagerLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves a client customer to a new manager customer.
     * This simplifies the complex request that requires two operations to move
     * a client customer to a new manager, for example:
     * 1. Update operation with Status INACTIVE (previous manager) and,
     * 2. Update operation with Status ACTIVE (new manager).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.MoveManagerLinkResponse moveManagerLink(com.google.ads.googleads.v19.services.MoveManagerLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveManagerLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CustomerManagerLinkService.
   * <pre>
   * Service to manage customer-manager links.
   * </pre>
   */
  public static final class CustomerManagerLinkServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerManagerLinkServiceBlockingStub> {
    private CustomerManagerLinkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerManagerLinkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerManagerLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Updates customer manager links. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [ManagerLinkError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.MutateCustomerManagerLinkResponse mutateCustomerManagerLink(com.google.ads.googleads.v19.services.MutateCustomerManagerLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerManagerLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves a client customer to a new manager customer.
     * This simplifies the complex request that requires two operations to move
     * a client customer to a new manager, for example:
     * 1. Update operation with Status INACTIVE (previous manager) and,
     * 2. Update operation with Status ACTIVE (new manager).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.MoveManagerLinkResponse moveManagerLink(com.google.ads.googleads.v19.services.MoveManagerLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveManagerLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerManagerLinkService.
   * <pre>
   * Service to manage customer-manager links.
   * </pre>
   */
  public static final class CustomerManagerLinkServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerManagerLinkServiceFutureStub> {
    private CustomerManagerLinkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerManagerLinkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerManagerLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Updates customer manager links. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [ManagerLinkError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v19.services.MutateCustomerManagerLinkResponse> mutateCustomerManagerLink(
        com.google.ads.googleads.v19.services.MutateCustomerManagerLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerManagerLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves a client customer to a new manager customer.
     * This simplifies the complex request that requires two operations to move
     * a client customer to a new manager, for example:
     * 1. Update operation with Status INACTIVE (previous manager) and,
     * 2. Update operation with Status ACTIVE (new manager).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v19.services.MoveManagerLinkResponse> moveManagerLink(
        com.google.ads.googleads.v19.services.MoveManagerLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveManagerLinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER_MANAGER_LINK = 0;
  private static final int METHODID_MOVE_MANAGER_LINK = 1;

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
        case METHODID_MUTATE_CUSTOMER_MANAGER_LINK:
          serviceImpl.mutateCustomerManagerLink((com.google.ads.googleads.v19.services.MutateCustomerManagerLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateCustomerManagerLinkResponse>) responseObserver);
          break;
        case METHODID_MOVE_MANAGER_LINK:
          serviceImpl.moveManagerLink((com.google.ads.googleads.v19.services.MoveManagerLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MoveManagerLinkResponse>) responseObserver);
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
          getMutateCustomerManagerLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v19.services.MutateCustomerManagerLinkRequest,
              com.google.ads.googleads.v19.services.MutateCustomerManagerLinkResponse>(
                service, METHODID_MUTATE_CUSTOMER_MANAGER_LINK)))
        .addMethod(
          getMoveManagerLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v19.services.MoveManagerLinkRequest,
              com.google.ads.googleads.v19.services.MoveManagerLinkResponse>(
                service, METHODID_MOVE_MANAGER_LINK)))
        .build();
  }

  private static abstract class CustomerManagerLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerManagerLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v19.services.CustomerManagerLinkServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerManagerLinkService");
    }
  }

  private static final class CustomerManagerLinkServiceFileDescriptorSupplier
      extends CustomerManagerLinkServiceBaseDescriptorSupplier {
    CustomerManagerLinkServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerManagerLinkServiceMethodDescriptorSupplier
      extends CustomerManagerLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CustomerManagerLinkServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CustomerManagerLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerManagerLinkServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomerManagerLinkMethod())
              .addMethod(getMoveManagerLinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
