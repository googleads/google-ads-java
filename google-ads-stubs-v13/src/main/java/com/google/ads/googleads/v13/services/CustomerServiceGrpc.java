package com.google.ads.googleads.v13.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v13/services/customer_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v13.services.CustomerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateCustomerRequest,
      com.google.ads.googleads.v13.services.MutateCustomerResponse> getMutateCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomer",
      requestType = com.google.ads.googleads.v13.services.MutateCustomerRequest.class,
      responseType = com.google.ads.googleads.v13.services.MutateCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateCustomerRequest,
      com.google.ads.googleads.v13.services.MutateCustomerResponse> getMutateCustomerMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateCustomerRequest, com.google.ads.googleads.v13.services.MutateCustomerResponse> getMutateCustomerMethod;
    if ((getMutateCustomerMethod = CustomerServiceGrpc.getMutateCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getMutateCustomerMethod = CustomerServiceGrpc.getMutateCustomerMethod) == null) {
          CustomerServiceGrpc.getMutateCustomerMethod = getMutateCustomerMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.MutateCustomerRequest, com.google.ads.googleads.v13.services.MutateCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateCustomerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("MutateCustomer"))
              .build();
        }
      }
    }
    return getMutateCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.ListAccessibleCustomersRequest,
      com.google.ads.googleads.v13.services.ListAccessibleCustomersResponse> getListAccessibleCustomersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessibleCustomers",
      requestType = com.google.ads.googleads.v13.services.ListAccessibleCustomersRequest.class,
      responseType = com.google.ads.googleads.v13.services.ListAccessibleCustomersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.ListAccessibleCustomersRequest,
      com.google.ads.googleads.v13.services.ListAccessibleCustomersResponse> getListAccessibleCustomersMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.ListAccessibleCustomersRequest, com.google.ads.googleads.v13.services.ListAccessibleCustomersResponse> getListAccessibleCustomersMethod;
    if ((getListAccessibleCustomersMethod = CustomerServiceGrpc.getListAccessibleCustomersMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getListAccessibleCustomersMethod = CustomerServiceGrpc.getListAccessibleCustomersMethod) == null) {
          CustomerServiceGrpc.getListAccessibleCustomersMethod = getListAccessibleCustomersMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.ListAccessibleCustomersRequest, com.google.ads.googleads.v13.services.ListAccessibleCustomersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessibleCustomers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.ListAccessibleCustomersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.ListAccessibleCustomersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("ListAccessibleCustomers"))
              .build();
        }
      }
    }
    return getListAccessibleCustomersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.CreateCustomerClientRequest,
      com.google.ads.googleads.v13.services.CreateCustomerClientResponse> getCreateCustomerClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCustomerClient",
      requestType = com.google.ads.googleads.v13.services.CreateCustomerClientRequest.class,
      responseType = com.google.ads.googleads.v13.services.CreateCustomerClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.CreateCustomerClientRequest,
      com.google.ads.googleads.v13.services.CreateCustomerClientResponse> getCreateCustomerClientMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.CreateCustomerClientRequest, com.google.ads.googleads.v13.services.CreateCustomerClientResponse> getCreateCustomerClientMethod;
    if ((getCreateCustomerClientMethod = CustomerServiceGrpc.getCreateCustomerClientMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getCreateCustomerClientMethod = CustomerServiceGrpc.getCreateCustomerClientMethod) == null) {
          CustomerServiceGrpc.getCreateCustomerClientMethod = getCreateCustomerClientMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.CreateCustomerClientRequest, com.google.ads.googleads.v13.services.CreateCustomerClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCustomerClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.CreateCustomerClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.CreateCustomerClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("CreateCustomerClient"))
              .build();
        }
      }
    }
    return getCreateCustomerClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceStub>() {
        @java.lang.Override
        public CustomerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceStub(channel, callOptions);
        }
      };
    return CustomerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceBlockingStub>() {
        @java.lang.Override
        public CustomerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceFutureStub>() {
        @java.lang.Override
        public CustomerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage customers.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Updates a customer. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [UrlFieldError]()
     * </pre>
     */
    default void mutateCustomer(com.google.ads.googleads.v13.services.MutateCustomerRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateCustomerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns resource names of customers directly accessible by the
     * user authenticating the call.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void listAccessibleCustomers(com.google.ads.googleads.v13.services.ListAccessibleCustomersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.ListAccessibleCustomersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessibleCustomersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new client under manager. The new client customer is returned.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CurrencyCodeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [ManagerLinkError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [StringLengthError]()
     *   [TimeZoneError]()
     * </pre>
     */
    default void createCustomerClient(com.google.ads.googleads.v13.services.CreateCustomerClientRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.CreateCustomerClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCustomerClientMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerService.
   * <pre>
   * Service to manage customers.
   * </pre>
   */
  public static abstract class CustomerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerService.
   * <pre>
   * Service to manage customers.
   * </pre>
   */
  public static final class CustomerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerServiceStub> {
    private CustomerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Updates a customer. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public void mutateCustomer(com.google.ads.googleads.v13.services.MutateCustomerRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateCustomerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns resource names of customers directly accessible by the
     * user authenticating the call.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void listAccessibleCustomers(com.google.ads.googleads.v13.services.ListAccessibleCustomersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.ListAccessibleCustomersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessibleCustomersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new client under manager. The new client customer is returned.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CurrencyCodeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [ManagerLinkError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [StringLengthError]()
     *   [TimeZoneError]()
     * </pre>
     */
    public void createCustomerClient(com.google.ads.googleads.v13.services.CreateCustomerClientRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.CreateCustomerClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCustomerClientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerService.
   * <pre>
   * Service to manage customers.
   * </pre>
   */
  public static final class CustomerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Updates a customer. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.ads.googleads.v13.services.MutateCustomerResponse mutateCustomer(com.google.ads.googleads.v13.services.MutateCustomerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns resource names of customers directly accessible by the
     * user authenticating the call.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v13.services.ListAccessibleCustomersResponse listAccessibleCustomers(com.google.ads.googleads.v13.services.ListAccessibleCustomersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessibleCustomersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new client under manager. The new client customer is returned.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CurrencyCodeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [ManagerLinkError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [StringLengthError]()
     *   [TimeZoneError]()
     * </pre>
     */
    public com.google.ads.googleads.v13.services.CreateCustomerClientResponse createCustomerClient(com.google.ads.googleads.v13.services.CreateCustomerClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCustomerClientMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerService.
   * <pre>
   * Service to manage customers.
   * </pre>
   */
  public static final class CustomerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Updates a customer. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.MutateCustomerResponse> mutateCustomer(
        com.google.ads.googleads.v13.services.MutateCustomerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns resource names of customers directly accessible by the
     * user authenticating the call.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.ListAccessibleCustomersResponse> listAccessibleCustomers(
        com.google.ads.googleads.v13.services.ListAccessibleCustomersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessibleCustomersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new client under manager. The new client customer is returned.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CurrencyCodeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [ManagerLinkError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [StringLengthError]()
     *   [TimeZoneError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.CreateCustomerClientResponse> createCustomerClient(
        com.google.ads.googleads.v13.services.CreateCustomerClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCustomerClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER = 0;
  private static final int METHODID_LIST_ACCESSIBLE_CUSTOMERS = 1;
  private static final int METHODID_CREATE_CUSTOMER_CLIENT = 2;

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
        case METHODID_MUTATE_CUSTOMER:
          serviceImpl.mutateCustomer((com.google.ads.googleads.v13.services.MutateCustomerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateCustomerResponse>) responseObserver);
          break;
        case METHODID_LIST_ACCESSIBLE_CUSTOMERS:
          serviceImpl.listAccessibleCustomers((com.google.ads.googleads.v13.services.ListAccessibleCustomersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.ListAccessibleCustomersResponse>) responseObserver);
          break;
        case METHODID_CREATE_CUSTOMER_CLIENT:
          serviceImpl.createCustomerClient((com.google.ads.googleads.v13.services.CreateCustomerClientRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.CreateCustomerClientResponse>) responseObserver);
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
          getMutateCustomerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v13.services.MutateCustomerRequest,
              com.google.ads.googleads.v13.services.MutateCustomerResponse>(
                service, METHODID_MUTATE_CUSTOMER)))
        .addMethod(
          getListAccessibleCustomersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v13.services.ListAccessibleCustomersRequest,
              com.google.ads.googleads.v13.services.ListAccessibleCustomersResponse>(
                service, METHODID_LIST_ACCESSIBLE_CUSTOMERS)))
        .addMethod(
          getCreateCustomerClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v13.services.CreateCustomerClientRequest,
              com.google.ads.googleads.v13.services.CreateCustomerClientResponse>(
                service, METHODID_CREATE_CUSTOMER_CLIENT)))
        .build();
  }

  private static abstract class CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v13.services.CustomerServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerService");
    }
  }

  private static final class CustomerServiceFileDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier {
    CustomerServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerServiceMethodDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomerMethod())
              .addMethod(getListAccessibleCustomersMethod())
              .addMethod(getCreateCustomerClientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
