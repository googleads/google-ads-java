package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customer-manager links.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/customer_manager_link_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerManagerLinkServiceGrpc {

  private CustomerManagerLinkServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.CustomerManagerLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetCustomerManagerLinkRequest,
      com.google.ads.googleads.v8.resources.CustomerManagerLink> getGetCustomerManagerLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerManagerLink",
      requestType = com.google.ads.googleads.v8.services.GetCustomerManagerLinkRequest.class,
      responseType = com.google.ads.googleads.v8.resources.CustomerManagerLink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetCustomerManagerLinkRequest,
      com.google.ads.googleads.v8.resources.CustomerManagerLink> getGetCustomerManagerLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetCustomerManagerLinkRequest, com.google.ads.googleads.v8.resources.CustomerManagerLink> getGetCustomerManagerLinkMethod;
    if ((getGetCustomerManagerLinkMethod = CustomerManagerLinkServiceGrpc.getGetCustomerManagerLinkMethod) == null) {
      synchronized (CustomerManagerLinkServiceGrpc.class) {
        if ((getGetCustomerManagerLinkMethod = CustomerManagerLinkServiceGrpc.getGetCustomerManagerLinkMethod) == null) {
          CustomerManagerLinkServiceGrpc.getGetCustomerManagerLinkMethod = getGetCustomerManagerLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetCustomerManagerLinkRequest, com.google.ads.googleads.v8.resources.CustomerManagerLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerManagerLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetCustomerManagerLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.CustomerManagerLink.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerManagerLinkServiceMethodDescriptorSupplier("GetCustomerManagerLink"))
              .build();
        }
      }
    }
    return getGetCustomerManagerLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateCustomerManagerLinkRequest,
      com.google.ads.googleads.v8.services.MutateCustomerManagerLinkResponse> getMutateCustomerManagerLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerManagerLink",
      requestType = com.google.ads.googleads.v8.services.MutateCustomerManagerLinkRequest.class,
      responseType = com.google.ads.googleads.v8.services.MutateCustomerManagerLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateCustomerManagerLinkRequest,
      com.google.ads.googleads.v8.services.MutateCustomerManagerLinkResponse> getMutateCustomerManagerLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateCustomerManagerLinkRequest, com.google.ads.googleads.v8.services.MutateCustomerManagerLinkResponse> getMutateCustomerManagerLinkMethod;
    if ((getMutateCustomerManagerLinkMethod = CustomerManagerLinkServiceGrpc.getMutateCustomerManagerLinkMethod) == null) {
      synchronized (CustomerManagerLinkServiceGrpc.class) {
        if ((getMutateCustomerManagerLinkMethod = CustomerManagerLinkServiceGrpc.getMutateCustomerManagerLinkMethod) == null) {
          CustomerManagerLinkServiceGrpc.getMutateCustomerManagerLinkMethod = getMutateCustomerManagerLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.MutateCustomerManagerLinkRequest, com.google.ads.googleads.v8.services.MutateCustomerManagerLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerManagerLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MutateCustomerManagerLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MutateCustomerManagerLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerManagerLinkServiceMethodDescriptorSupplier("MutateCustomerManagerLink"))
              .build();
        }
      }
    }
    return getMutateCustomerManagerLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MoveManagerLinkRequest,
      com.google.ads.googleads.v8.services.MoveManagerLinkResponse> getMoveManagerLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveManagerLink",
      requestType = com.google.ads.googleads.v8.services.MoveManagerLinkRequest.class,
      responseType = com.google.ads.googleads.v8.services.MoveManagerLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MoveManagerLinkRequest,
      com.google.ads.googleads.v8.services.MoveManagerLinkResponse> getMoveManagerLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MoveManagerLinkRequest, com.google.ads.googleads.v8.services.MoveManagerLinkResponse> getMoveManagerLinkMethod;
    if ((getMoveManagerLinkMethod = CustomerManagerLinkServiceGrpc.getMoveManagerLinkMethod) == null) {
      synchronized (CustomerManagerLinkServiceGrpc.class) {
        if ((getMoveManagerLinkMethod = CustomerManagerLinkServiceGrpc.getMoveManagerLinkMethod) == null) {
          CustomerManagerLinkServiceGrpc.getMoveManagerLinkMethod = getMoveManagerLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.MoveManagerLinkRequest, com.google.ads.googleads.v8.services.MoveManagerLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveManagerLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MoveManagerLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MoveManagerLinkResponse.getDefaultInstance()))
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
  public static abstract class CustomerManagerLinkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested CustomerManagerLink in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCustomerManagerLink(com.google.ads.googleads.v8.services.GetCustomerManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.CustomerManagerLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCustomerManagerLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or updates customer manager links. Operation statuses are returned.
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
    public void mutateCustomerManagerLink(com.google.ads.googleads.v8.services.MutateCustomerManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateCustomerManagerLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerManagerLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves a client customer to a new manager customer.
     * This simplifies the complex request that requires two operations to move
     * a client customer to a new manager. i.e:
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
    public void moveManagerLink(com.google.ads.googleads.v8.services.MoveManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MoveManagerLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveManagerLinkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerManagerLinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetCustomerManagerLinkRequest,
                com.google.ads.googleads.v8.resources.CustomerManagerLink>(
                  this, METHODID_GET_CUSTOMER_MANAGER_LINK)))
          .addMethod(
            getMutateCustomerManagerLinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.MutateCustomerManagerLinkRequest,
                com.google.ads.googleads.v8.services.MutateCustomerManagerLinkResponse>(
                  this, METHODID_MUTATE_CUSTOMER_MANAGER_LINK)))
          .addMethod(
            getMoveManagerLinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.MoveManagerLinkRequest,
                com.google.ads.googleads.v8.services.MoveManagerLinkResponse>(
                  this, METHODID_MOVE_MANAGER_LINK)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage customer-manager links.
   * </pre>
   */
  public static final class CustomerManagerLinkServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomerManagerLinkServiceStub> {
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
     * Returns the requested CustomerManagerLink in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCustomerManagerLink(com.google.ads.googleads.v8.services.GetCustomerManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.CustomerManagerLink> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCustomerManagerLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or updates customer manager links. Operation statuses are returned.
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
    public void mutateCustomerManagerLink(com.google.ads.googleads.v8.services.MutateCustomerManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateCustomerManagerLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerManagerLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves a client customer to a new manager customer.
     * This simplifies the complex request that requires two operations to move
     * a client customer to a new manager. i.e:
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
    public void moveManagerLink(com.google.ads.googleads.v8.services.MoveManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MoveManagerLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveManagerLinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage customer-manager links.
   * </pre>
   */
  public static final class CustomerManagerLinkServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomerManagerLinkServiceBlockingStub> {
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
     * Returns the requested CustomerManagerLink in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.CustomerManagerLink getCustomerManagerLink(com.google.ads.googleads.v8.services.GetCustomerManagerLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCustomerManagerLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or updates customer manager links. Operation statuses are returned.
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
    public com.google.ads.googleads.v8.services.MutateCustomerManagerLinkResponse mutateCustomerManagerLink(com.google.ads.googleads.v8.services.MutateCustomerManagerLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerManagerLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves a client customer to a new manager customer.
     * This simplifies the complex request that requires two operations to move
     * a client customer to a new manager. i.e:
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
    public com.google.ads.googleads.v8.services.MoveManagerLinkResponse moveManagerLink(com.google.ads.googleads.v8.services.MoveManagerLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveManagerLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage customer-manager links.
   * </pre>
   */
  public static final class CustomerManagerLinkServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomerManagerLinkServiceFutureStub> {
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
     * Returns the requested CustomerManagerLink in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.CustomerManagerLink> getCustomerManagerLink(
        com.google.ads.googleads.v8.services.GetCustomerManagerLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCustomerManagerLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or updates customer manager links. Operation statuses are returned.
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.services.MutateCustomerManagerLinkResponse> mutateCustomerManagerLink(
        com.google.ads.googleads.v8.services.MutateCustomerManagerLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerManagerLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves a client customer to a new manager customer.
     * This simplifies the complex request that requires two operations to move
     * a client customer to a new manager. i.e:
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.services.MoveManagerLinkResponse> moveManagerLink(
        com.google.ads.googleads.v8.services.MoveManagerLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveManagerLinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_MANAGER_LINK = 0;
  private static final int METHODID_MUTATE_CUSTOMER_MANAGER_LINK = 1;
  private static final int METHODID_MOVE_MANAGER_LINK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerManagerLinkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerManagerLinkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_MANAGER_LINK:
          serviceImpl.getCustomerManagerLink((com.google.ads.googleads.v8.services.GetCustomerManagerLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.CustomerManagerLink>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOMER_MANAGER_LINK:
          serviceImpl.mutateCustomerManagerLink((com.google.ads.googleads.v8.services.MutateCustomerManagerLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateCustomerManagerLinkResponse>) responseObserver);
          break;
        case METHODID_MOVE_MANAGER_LINK:
          serviceImpl.moveManagerLink((com.google.ads.googleads.v8.services.MoveManagerLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MoveManagerLinkResponse>) responseObserver);
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

  private static abstract class CustomerManagerLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerManagerLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.CustomerManagerLinkServiceProto.getDescriptor();
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
    private final String methodName;

    CustomerManagerLinkServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getGetCustomerManagerLinkMethod())
              .addMethod(getMutateCustomerManagerLinkMethod())
              .addMethod(getMoveManagerLinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
