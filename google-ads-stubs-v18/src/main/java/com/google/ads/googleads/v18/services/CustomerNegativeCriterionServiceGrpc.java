package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customer negative criteria.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/customer_negative_criterion_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerNegativeCriterionServiceGrpc {

  private CustomerNegativeCriterionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.CustomerNegativeCriterionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaRequest,
      com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaResponse> getMutateCustomerNegativeCriteriaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerNegativeCriteria",
      requestType = com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaRequest.class,
      responseType = com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaRequest,
      com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaResponse> getMutateCustomerNegativeCriteriaMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaRequest, com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaResponse> getMutateCustomerNegativeCriteriaMethod;
    if ((getMutateCustomerNegativeCriteriaMethod = CustomerNegativeCriterionServiceGrpc.getMutateCustomerNegativeCriteriaMethod) == null) {
      synchronized (CustomerNegativeCriterionServiceGrpc.class) {
        if ((getMutateCustomerNegativeCriteriaMethod = CustomerNegativeCriterionServiceGrpc.getMutateCustomerNegativeCriteriaMethod) == null) {
          CustomerNegativeCriterionServiceGrpc.getMutateCustomerNegativeCriteriaMethod = getMutateCustomerNegativeCriteriaMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaRequest, com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerNegativeCriteria"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerNegativeCriterionServiceMethodDescriptorSupplier("MutateCustomerNegativeCriteria"))
              .build();
        }
      }
    }
    return getMutateCustomerNegativeCriteriaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerNegativeCriterionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerNegativeCriterionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerNegativeCriterionServiceStub>() {
        @java.lang.Override
        public CustomerNegativeCriterionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerNegativeCriterionServiceStub(channel, callOptions);
        }
      };
    return CustomerNegativeCriterionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CustomerNegativeCriterionServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerNegativeCriterionServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerNegativeCriterionServiceBlockingV2Stub>() {
        @java.lang.Override
        public CustomerNegativeCriterionServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerNegativeCriterionServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CustomerNegativeCriterionServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerNegativeCriterionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerNegativeCriterionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerNegativeCriterionServiceBlockingStub>() {
        @java.lang.Override
        public CustomerNegativeCriterionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerNegativeCriterionServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerNegativeCriterionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerNegativeCriterionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerNegativeCriterionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerNegativeCriterionServiceFutureStub>() {
        @java.lang.Override
        public CustomerNegativeCriterionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerNegativeCriterionServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerNegativeCriterionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage customer negative criteria.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates or removes criteria. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateCustomerNegativeCriteria(com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerNegativeCriteriaMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerNegativeCriterionService.
   * <pre>
   * Service to manage customer negative criteria.
   * </pre>
   */
  public static abstract class CustomerNegativeCriterionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerNegativeCriterionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerNegativeCriterionService.
   * <pre>
   * Service to manage customer negative criteria.
   * </pre>
   */
  public static final class CustomerNegativeCriterionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerNegativeCriterionServiceStub> {
    private CustomerNegativeCriterionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerNegativeCriterionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerNegativeCriterionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes criteria. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateCustomerNegativeCriteria(com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerNegativeCriteriaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerNegativeCriterionService.
   * <pre>
   * Service to manage customer negative criteria.
   * </pre>
   */
  public static final class CustomerNegativeCriterionServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CustomerNegativeCriterionServiceBlockingV2Stub> {
    private CustomerNegativeCriterionServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerNegativeCriterionServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerNegativeCriterionServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes criteria. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaResponse mutateCustomerNegativeCriteria(com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerNegativeCriteriaMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CustomerNegativeCriterionService.
   * <pre>
   * Service to manage customer negative criteria.
   * </pre>
   */
  public static final class CustomerNegativeCriterionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerNegativeCriterionServiceBlockingStub> {
    private CustomerNegativeCriterionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerNegativeCriterionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerNegativeCriterionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes criteria. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaResponse mutateCustomerNegativeCriteria(com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerNegativeCriteriaMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerNegativeCriterionService.
   * <pre>
   * Service to manage customer negative criteria.
   * </pre>
   */
  public static final class CustomerNegativeCriterionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerNegativeCriterionServiceFutureStub> {
    private CustomerNegativeCriterionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerNegativeCriterionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerNegativeCriterionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes criteria. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaResponse> mutateCustomerNegativeCriteria(
        com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerNegativeCriteriaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER_NEGATIVE_CRITERIA = 0;

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
        case METHODID_MUTATE_CUSTOMER_NEGATIVE_CRITERIA:
          serviceImpl.mutateCustomerNegativeCriteria((com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaResponse>) responseObserver);
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
          getMutateCustomerNegativeCriteriaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaRequest,
              com.google.ads.googleads.v18.services.MutateCustomerNegativeCriteriaResponse>(
                service, METHODID_MUTATE_CUSTOMER_NEGATIVE_CRITERIA)))
        .build();
  }

  private static abstract class CustomerNegativeCriterionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerNegativeCriterionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.CustomerNegativeCriterionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerNegativeCriterionService");
    }
  }

  private static final class CustomerNegativeCriterionServiceFileDescriptorSupplier
      extends CustomerNegativeCriterionServiceBaseDescriptorSupplier {
    CustomerNegativeCriterionServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerNegativeCriterionServiceMethodDescriptorSupplier
      extends CustomerNegativeCriterionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CustomerNegativeCriterionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CustomerNegativeCriterionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerNegativeCriterionServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomerNegativeCriteriaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
