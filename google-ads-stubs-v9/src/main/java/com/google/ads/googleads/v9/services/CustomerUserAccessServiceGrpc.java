package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service manages the permissions of a user on a given customer.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/customer_user_access_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerUserAccessServiceGrpc {

  private CustomerUserAccessServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.CustomerUserAccessService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCustomerUserAccessRequest,
      com.google.ads.googleads.v9.resources.CustomerUserAccess> getGetCustomerUserAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerUserAccess",
      requestType = com.google.ads.googleads.v9.services.GetCustomerUserAccessRequest.class,
      responseType = com.google.ads.googleads.v9.resources.CustomerUserAccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCustomerUserAccessRequest,
      com.google.ads.googleads.v9.resources.CustomerUserAccess> getGetCustomerUserAccessMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCustomerUserAccessRequest, com.google.ads.googleads.v9.resources.CustomerUserAccess> getGetCustomerUserAccessMethod;
    if ((getGetCustomerUserAccessMethod = CustomerUserAccessServiceGrpc.getGetCustomerUserAccessMethod) == null) {
      synchronized (CustomerUserAccessServiceGrpc.class) {
        if ((getGetCustomerUserAccessMethod = CustomerUserAccessServiceGrpc.getGetCustomerUserAccessMethod) == null) {
          CustomerUserAccessServiceGrpc.getGetCustomerUserAccessMethod = getGetCustomerUserAccessMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetCustomerUserAccessRequest, com.google.ads.googleads.v9.resources.CustomerUserAccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerUserAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetCustomerUserAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.CustomerUserAccess.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerUserAccessServiceMethodDescriptorSupplier("GetCustomerUserAccess"))
              .build();
        }
      }
    }
    return getGetCustomerUserAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCustomerUserAccessRequest,
      com.google.ads.googleads.v9.services.MutateCustomerUserAccessResponse> getMutateCustomerUserAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerUserAccess",
      requestType = com.google.ads.googleads.v9.services.MutateCustomerUserAccessRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateCustomerUserAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCustomerUserAccessRequest,
      com.google.ads.googleads.v9.services.MutateCustomerUserAccessResponse> getMutateCustomerUserAccessMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCustomerUserAccessRequest, com.google.ads.googleads.v9.services.MutateCustomerUserAccessResponse> getMutateCustomerUserAccessMethod;
    if ((getMutateCustomerUserAccessMethod = CustomerUserAccessServiceGrpc.getMutateCustomerUserAccessMethod) == null) {
      synchronized (CustomerUserAccessServiceGrpc.class) {
        if ((getMutateCustomerUserAccessMethod = CustomerUserAccessServiceGrpc.getMutateCustomerUserAccessMethod) == null) {
          CustomerUserAccessServiceGrpc.getMutateCustomerUserAccessMethod = getMutateCustomerUserAccessMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateCustomerUserAccessRequest, com.google.ads.googleads.v9.services.MutateCustomerUserAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerUserAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCustomerUserAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCustomerUserAccessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerUserAccessServiceMethodDescriptorSupplier("MutateCustomerUserAccess"))
              .build();
        }
      }
    }
    return getMutateCustomerUserAccessMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerUserAccessServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessServiceStub>() {
        @java.lang.Override
        public CustomerUserAccessServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerUserAccessServiceStub(channel, callOptions);
        }
      };
    return CustomerUserAccessServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerUserAccessServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessServiceBlockingStub>() {
        @java.lang.Override
        public CustomerUserAccessServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerUserAccessServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerUserAccessServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerUserAccessServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessServiceFutureStub>() {
        @java.lang.Override
        public CustomerUserAccessServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerUserAccessServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerUserAccessServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service manages the permissions of a user on a given customer.
   * </pre>
   */
  public static abstract class CustomerUserAccessServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the CustomerUserAccess in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCustomerUserAccess(com.google.ads.googleads.v9.services.GetCustomerUserAccessRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CustomerUserAccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCustomerUserAccessMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates, removes permission of a user on a given customer. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CustomerUserAccessError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateCustomerUserAccess(com.google.ads.googleads.v9.services.MutateCustomerUserAccessRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCustomerUserAccessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerUserAccessMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerUserAccessMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetCustomerUserAccessRequest,
                com.google.ads.googleads.v9.resources.CustomerUserAccess>(
                  this, METHODID_GET_CUSTOMER_USER_ACCESS)))
          .addMethod(
            getMutateCustomerUserAccessMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateCustomerUserAccessRequest,
                com.google.ads.googleads.v9.services.MutateCustomerUserAccessResponse>(
                  this, METHODID_MUTATE_CUSTOMER_USER_ACCESS)))
          .build();
    }
  }

  /**
   * <pre>
   * This service manages the permissions of a user on a given customer.
   * </pre>
   */
  public static final class CustomerUserAccessServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomerUserAccessServiceStub> {
    private CustomerUserAccessServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerUserAccessServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerUserAccessServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the CustomerUserAccess in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCustomerUserAccess(com.google.ads.googleads.v9.services.GetCustomerUserAccessRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CustomerUserAccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCustomerUserAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates, removes permission of a user on a given customer. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CustomerUserAccessError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateCustomerUserAccess(com.google.ads.googleads.v9.services.MutateCustomerUserAccessRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCustomerUserAccessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerUserAccessMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This service manages the permissions of a user on a given customer.
   * </pre>
   */
  public static final class CustomerUserAccessServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomerUserAccessServiceBlockingStub> {
    private CustomerUserAccessServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerUserAccessServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerUserAccessServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the CustomerUserAccess in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.CustomerUserAccess getCustomerUserAccess(com.google.ads.googleads.v9.services.GetCustomerUserAccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCustomerUserAccessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates, removes permission of a user on a given customer. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CustomerUserAccessError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.MutateCustomerUserAccessResponse mutateCustomerUserAccess(com.google.ads.googleads.v9.services.MutateCustomerUserAccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerUserAccessMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This service manages the permissions of a user on a given customer.
   * </pre>
   */
  public static final class CustomerUserAccessServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomerUserAccessServiceFutureStub> {
    private CustomerUserAccessServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerUserAccessServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerUserAccessServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the CustomerUserAccess in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.CustomerUserAccess> getCustomerUserAccess(
        com.google.ads.googleads.v9.services.GetCustomerUserAccessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCustomerUserAccessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates, removes permission of a user on a given customer. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CustomerUserAccessError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateCustomerUserAccessResponse> mutateCustomerUserAccess(
        com.google.ads.googleads.v9.services.MutateCustomerUserAccessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerUserAccessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_USER_ACCESS = 0;
  private static final int METHODID_MUTATE_CUSTOMER_USER_ACCESS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerUserAccessServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerUserAccessServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_USER_ACCESS:
          serviceImpl.getCustomerUserAccess((com.google.ads.googleads.v9.services.GetCustomerUserAccessRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CustomerUserAccess>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOMER_USER_ACCESS:
          serviceImpl.mutateCustomerUserAccess((com.google.ads.googleads.v9.services.MutateCustomerUserAccessRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCustomerUserAccessResponse>) responseObserver);
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

  private static abstract class CustomerUserAccessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerUserAccessServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.CustomerUserAccessServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerUserAccessService");
    }
  }

  private static final class CustomerUserAccessServiceFileDescriptorSupplier
      extends CustomerUserAccessServiceBaseDescriptorSupplier {
    CustomerUserAccessServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerUserAccessServiceMethodDescriptorSupplier
      extends CustomerUserAccessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerUserAccessServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerUserAccessServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerUserAccessServiceFileDescriptorSupplier())
              .addMethod(getGetCustomerUserAccessMethod())
              .addMethod(getMutateCustomerUserAccessMethod())
              .build();
        }
      }
    }
    return result;
  }
}
