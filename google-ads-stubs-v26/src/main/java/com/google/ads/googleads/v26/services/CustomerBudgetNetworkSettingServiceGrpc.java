package com.google.ads.googleads.v26.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customer-level budget network settings.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerBudgetNetworkSettingServiceGrpc {

  private CustomerBudgetNetworkSettingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v26.services.CustomerBudgetNetworkSettingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingRequest,
      com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingResponse> getMutateCustomerBudgetNetworkSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerBudgetNetworkSetting",
      requestType = com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingRequest.class,
      responseType = com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingRequest,
      com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingResponse> getMutateCustomerBudgetNetworkSettingMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingRequest, com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingResponse> getMutateCustomerBudgetNetworkSettingMethod;
    if ((getMutateCustomerBudgetNetworkSettingMethod = CustomerBudgetNetworkSettingServiceGrpc.getMutateCustomerBudgetNetworkSettingMethod) == null) {
      synchronized (CustomerBudgetNetworkSettingServiceGrpc.class) {
        if ((getMutateCustomerBudgetNetworkSettingMethod = CustomerBudgetNetworkSettingServiceGrpc.getMutateCustomerBudgetNetworkSettingMethod) == null) {
          CustomerBudgetNetworkSettingServiceGrpc.getMutateCustomerBudgetNetworkSettingMethod = getMutateCustomerBudgetNetworkSettingMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingRequest, com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerBudgetNetworkSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerBudgetNetworkSettingServiceMethodDescriptorSupplier("MutateCustomerBudgetNetworkSetting"))
              .build();
        }
      }
    }
    return getMutateCustomerBudgetNetworkSettingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerBudgetNetworkSettingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerBudgetNetworkSettingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerBudgetNetworkSettingServiceStub>() {
        @java.lang.Override
        public CustomerBudgetNetworkSettingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerBudgetNetworkSettingServiceStub(channel, callOptions);
        }
      };
    return CustomerBudgetNetworkSettingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CustomerBudgetNetworkSettingServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerBudgetNetworkSettingServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerBudgetNetworkSettingServiceBlockingV2Stub>() {
        @java.lang.Override
        public CustomerBudgetNetworkSettingServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerBudgetNetworkSettingServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CustomerBudgetNetworkSettingServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerBudgetNetworkSettingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerBudgetNetworkSettingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerBudgetNetworkSettingServiceBlockingStub>() {
        @java.lang.Override
        public CustomerBudgetNetworkSettingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerBudgetNetworkSettingServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerBudgetNetworkSettingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerBudgetNetworkSettingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerBudgetNetworkSettingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerBudgetNetworkSettingServiceFutureStub>() {
        @java.lang.Override
        public CustomerBudgetNetworkSettingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerBudgetNetworkSettingServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerBudgetNetworkSettingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage customer-level budget network settings.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates or updates the customer budget network setting.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BudgetNetworkSettingError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    default void mutateCustomerBudgetNetworkSetting(com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerBudgetNetworkSettingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerBudgetNetworkSettingService.
   * <pre>
   * Service to manage customer-level budget network settings.
   * </pre>
   */
  public static abstract class CustomerBudgetNetworkSettingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerBudgetNetworkSettingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerBudgetNetworkSettingService.
   * <pre>
   * Service to manage customer-level budget network settings.
   * </pre>
   */
  public static final class CustomerBudgetNetworkSettingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerBudgetNetworkSettingServiceStub> {
    private CustomerBudgetNetworkSettingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerBudgetNetworkSettingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerBudgetNetworkSettingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates the customer budget network setting.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BudgetNetworkSettingError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateCustomerBudgetNetworkSetting(com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerBudgetNetworkSettingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerBudgetNetworkSettingService.
   * <pre>
   * Service to manage customer-level budget network settings.
   * </pre>
   */
  public static final class CustomerBudgetNetworkSettingServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CustomerBudgetNetworkSettingServiceBlockingV2Stub> {
    private CustomerBudgetNetworkSettingServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerBudgetNetworkSettingServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerBudgetNetworkSettingServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates the customer budget network setting.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BudgetNetworkSettingError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingResponse mutateCustomerBudgetNetworkSetting(com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getMutateCustomerBudgetNetworkSettingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CustomerBudgetNetworkSettingService.
   * <pre>
   * Service to manage customer-level budget network settings.
   * </pre>
   */
  public static final class CustomerBudgetNetworkSettingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerBudgetNetworkSettingServiceBlockingStub> {
    private CustomerBudgetNetworkSettingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerBudgetNetworkSettingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerBudgetNetworkSettingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates the customer budget network setting.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BudgetNetworkSettingError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingResponse mutateCustomerBudgetNetworkSetting(com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerBudgetNetworkSettingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerBudgetNetworkSettingService.
   * <pre>
   * Service to manage customer-level budget network settings.
   * </pre>
   */
  public static final class CustomerBudgetNetworkSettingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerBudgetNetworkSettingServiceFutureStub> {
    private CustomerBudgetNetworkSettingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerBudgetNetworkSettingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerBudgetNetworkSettingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates the customer budget network setting.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BudgetNetworkSettingError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingResponse> mutateCustomerBudgetNetworkSetting(
        com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerBudgetNetworkSettingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER_BUDGET_NETWORK_SETTING = 0;

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
        case METHODID_MUTATE_CUSTOMER_BUDGET_NETWORK_SETTING:
          serviceImpl.mutateCustomerBudgetNetworkSetting((com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingResponse>) responseObserver);
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
          getMutateCustomerBudgetNetworkSettingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingRequest,
              com.google.ads.googleads.v26.services.MutateCustomerBudgetNetworkSettingResponse>(
                service, METHODID_MUTATE_CUSTOMER_BUDGET_NETWORK_SETTING)))
        .build();
  }

  private static abstract class CustomerBudgetNetworkSettingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerBudgetNetworkSettingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v26.services.CustomerBudgetNetworkSettingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerBudgetNetworkSettingService");
    }
  }

  private static final class CustomerBudgetNetworkSettingServiceFileDescriptorSupplier
      extends CustomerBudgetNetworkSettingServiceBaseDescriptorSupplier {
    CustomerBudgetNetworkSettingServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerBudgetNetworkSettingServiceMethodDescriptorSupplier
      extends CustomerBudgetNetworkSettingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CustomerBudgetNetworkSettingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CustomerBudgetNetworkSettingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerBudgetNetworkSettingServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomerBudgetNetworkSettingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
