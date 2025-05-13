package com.google.ads.googleads.v20.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service manages the permissions of a user on a given customer.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v20/services/customer_user_access_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerUserAccessServiceGrpc {

  private CustomerUserAccessServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v20.services.CustomerUserAccessService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateCustomerUserAccessRequest,
      com.google.ads.googleads.v20.services.MutateCustomerUserAccessResponse> getMutateCustomerUserAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerUserAccess",
      requestType = com.google.ads.googleads.v20.services.MutateCustomerUserAccessRequest.class,
      responseType = com.google.ads.googleads.v20.services.MutateCustomerUserAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateCustomerUserAccessRequest,
      com.google.ads.googleads.v20.services.MutateCustomerUserAccessResponse> getMutateCustomerUserAccessMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateCustomerUserAccessRequest, com.google.ads.googleads.v20.services.MutateCustomerUserAccessResponse> getMutateCustomerUserAccessMethod;
    if ((getMutateCustomerUserAccessMethod = CustomerUserAccessServiceGrpc.getMutateCustomerUserAccessMethod) == null) {
      synchronized (CustomerUserAccessServiceGrpc.class) {
        if ((getMutateCustomerUserAccessMethod = CustomerUserAccessServiceGrpc.getMutateCustomerUserAccessMethod) == null) {
          CustomerUserAccessServiceGrpc.getMutateCustomerUserAccessMethod = getMutateCustomerUserAccessMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v20.services.MutateCustomerUserAccessRequest, com.google.ads.googleads.v20.services.MutateCustomerUserAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerUserAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateCustomerUserAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateCustomerUserAccessResponse.getDefaultInstance()))
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
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CustomerUserAccessServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessServiceBlockingV2Stub>() {
        @java.lang.Override
        public CustomerUserAccessServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerUserAccessServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CustomerUserAccessServiceBlockingV2Stub.newStub(factory, channel);
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
  public interface AsyncService {

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
    default void mutateCustomerUserAccess(com.google.ads.googleads.v20.services.MutateCustomerUserAccessRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateCustomerUserAccessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerUserAccessMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerUserAccessService.
   * <pre>
   * This service manages the permissions of a user on a given customer.
   * </pre>
   */
  public static abstract class CustomerUserAccessServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerUserAccessServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerUserAccessService.
   * <pre>
   * This service manages the permissions of a user on a given customer.
   * </pre>
   */
  public static final class CustomerUserAccessServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerUserAccessServiceStub> {
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
    public void mutateCustomerUserAccess(com.google.ads.googleads.v20.services.MutateCustomerUserAccessRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateCustomerUserAccessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerUserAccessMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerUserAccessService.
   * <pre>
   * This service manages the permissions of a user on a given customer.
   * </pre>
   */
  public static final class CustomerUserAccessServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CustomerUserAccessServiceBlockingV2Stub> {
    private CustomerUserAccessServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerUserAccessServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerUserAccessServiceBlockingV2Stub(channel, callOptions);
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
    public com.google.ads.googleads.v20.services.MutateCustomerUserAccessResponse mutateCustomerUserAccess(com.google.ads.googleads.v20.services.MutateCustomerUserAccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerUserAccessMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CustomerUserAccessService.
   * <pre>
   * This service manages the permissions of a user on a given customer.
   * </pre>
   */
  public static final class CustomerUserAccessServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerUserAccessServiceBlockingStub> {
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
    public com.google.ads.googleads.v20.services.MutateCustomerUserAccessResponse mutateCustomerUserAccess(com.google.ads.googleads.v20.services.MutateCustomerUserAccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerUserAccessMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerUserAccessService.
   * <pre>
   * This service manages the permissions of a user on a given customer.
   * </pre>
   */
  public static final class CustomerUserAccessServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerUserAccessServiceFutureStub> {
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v20.services.MutateCustomerUserAccessResponse> mutateCustomerUserAccess(
        com.google.ads.googleads.v20.services.MutateCustomerUserAccessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerUserAccessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER_USER_ACCESS = 0;

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
        case METHODID_MUTATE_CUSTOMER_USER_ACCESS:
          serviceImpl.mutateCustomerUserAccess((com.google.ads.googleads.v20.services.MutateCustomerUserAccessRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateCustomerUserAccessResponse>) responseObserver);
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
          getMutateCustomerUserAccessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v20.services.MutateCustomerUserAccessRequest,
              com.google.ads.googleads.v20.services.MutateCustomerUserAccessResponse>(
                service, METHODID_MUTATE_CUSTOMER_USER_ACCESS)))
        .build();
  }

  private static abstract class CustomerUserAccessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerUserAccessServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v20.services.CustomerUserAccessServiceProto.getDescriptor();
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
    private final java.lang.String methodName;

    CustomerUserAccessServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getMutateCustomerUserAccessMethod())
              .build();
        }
      }
    }
    return result;
  }
}
