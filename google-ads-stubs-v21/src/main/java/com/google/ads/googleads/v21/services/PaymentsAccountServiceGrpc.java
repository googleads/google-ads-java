package com.google.ads.googleads.v21.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to provide payments accounts that can be used to set up consolidated
 * billing.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v21/services/payments_account_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PaymentsAccountServiceGrpc {

  private PaymentsAccountServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v21.services.PaymentsAccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.ListPaymentsAccountsRequest,
      com.google.ads.googleads.v21.services.ListPaymentsAccountsResponse> getListPaymentsAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPaymentsAccounts",
      requestType = com.google.ads.googleads.v21.services.ListPaymentsAccountsRequest.class,
      responseType = com.google.ads.googleads.v21.services.ListPaymentsAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.ListPaymentsAccountsRequest,
      com.google.ads.googleads.v21.services.ListPaymentsAccountsResponse> getListPaymentsAccountsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.ListPaymentsAccountsRequest, com.google.ads.googleads.v21.services.ListPaymentsAccountsResponse> getListPaymentsAccountsMethod;
    if ((getListPaymentsAccountsMethod = PaymentsAccountServiceGrpc.getListPaymentsAccountsMethod) == null) {
      synchronized (PaymentsAccountServiceGrpc.class) {
        if ((getListPaymentsAccountsMethod = PaymentsAccountServiceGrpc.getListPaymentsAccountsMethod) == null) {
          PaymentsAccountServiceGrpc.getListPaymentsAccountsMethod = getListPaymentsAccountsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v21.services.ListPaymentsAccountsRequest, com.google.ads.googleads.v21.services.ListPaymentsAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPaymentsAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v21.services.ListPaymentsAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v21.services.ListPaymentsAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentsAccountServiceMethodDescriptorSupplier("ListPaymentsAccounts"))
              .build();
        }
      }
    }
    return getListPaymentsAccountsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentsAccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentsAccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentsAccountServiceStub>() {
        @java.lang.Override
        public PaymentsAccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentsAccountServiceStub(channel, callOptions);
        }
      };
    return PaymentsAccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static PaymentsAccountServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentsAccountServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentsAccountServiceBlockingV2Stub>() {
        @java.lang.Override
        public PaymentsAccountServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentsAccountServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return PaymentsAccountServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentsAccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentsAccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentsAccountServiceBlockingStub>() {
        @java.lang.Override
        public PaymentsAccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentsAccountServiceBlockingStub(channel, callOptions);
        }
      };
    return PaymentsAccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentsAccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentsAccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentsAccountServiceFutureStub>() {
        @java.lang.Override
        public PaymentsAccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentsAccountServiceFutureStub(channel, callOptions);
        }
      };
    return PaymentsAccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to provide payments accounts that can be used to set up consolidated
   * billing.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns all payments accounts associated with all managers
     * between the login customer ID and specified serving customer in the
     * hierarchy, inclusive.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [PaymentsAccountError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void listPaymentsAccounts(com.google.ads.googleads.v21.services.ListPaymentsAccountsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.ListPaymentsAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPaymentsAccountsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PaymentsAccountService.
   * <pre>
   * Service to provide payments accounts that can be used to set up consolidated
   * billing.
   * </pre>
   */
  public static abstract class PaymentsAccountServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PaymentsAccountServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PaymentsAccountService.
   * <pre>
   * Service to provide payments accounts that can be used to set up consolidated
   * billing.
   * </pre>
   */
  public static final class PaymentsAccountServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PaymentsAccountServiceStub> {
    private PaymentsAccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentsAccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentsAccountServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all payments accounts associated with all managers
     * between the login customer ID and specified serving customer in the
     * hierarchy, inclusive.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [PaymentsAccountError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void listPaymentsAccounts(com.google.ads.googleads.v21.services.ListPaymentsAccountsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.ListPaymentsAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPaymentsAccountsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PaymentsAccountService.
   * <pre>
   * Service to provide payments accounts that can be used to set up consolidated
   * billing.
   * </pre>
   */
  public static final class PaymentsAccountServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<PaymentsAccountServiceBlockingV2Stub> {
    private PaymentsAccountServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentsAccountServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentsAccountServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all payments accounts associated with all managers
     * between the login customer ID and specified serving customer in the
     * hierarchy, inclusive.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [PaymentsAccountError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v21.services.ListPaymentsAccountsResponse listPaymentsAccounts(com.google.ads.googleads.v21.services.ListPaymentsAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPaymentsAccountsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service PaymentsAccountService.
   * <pre>
   * Service to provide payments accounts that can be used to set up consolidated
   * billing.
   * </pre>
   */
  public static final class PaymentsAccountServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PaymentsAccountServiceBlockingStub> {
    private PaymentsAccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentsAccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentsAccountServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all payments accounts associated with all managers
     * between the login customer ID and specified serving customer in the
     * hierarchy, inclusive.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [PaymentsAccountError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v21.services.ListPaymentsAccountsResponse listPaymentsAccounts(com.google.ads.googleads.v21.services.ListPaymentsAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPaymentsAccountsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PaymentsAccountService.
   * <pre>
   * Service to provide payments accounts that can be used to set up consolidated
   * billing.
   * </pre>
   */
  public static final class PaymentsAccountServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PaymentsAccountServiceFutureStub> {
    private PaymentsAccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentsAccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentsAccountServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all payments accounts associated with all managers
     * between the login customer ID and specified serving customer in the
     * hierarchy, inclusive.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [PaymentsAccountError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v21.services.ListPaymentsAccountsResponse> listPaymentsAccounts(
        com.google.ads.googleads.v21.services.ListPaymentsAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPaymentsAccountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PAYMENTS_ACCOUNTS = 0;

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
        case METHODID_LIST_PAYMENTS_ACCOUNTS:
          serviceImpl.listPaymentsAccounts((com.google.ads.googleads.v21.services.ListPaymentsAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.ListPaymentsAccountsResponse>) responseObserver);
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
          getListPaymentsAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v21.services.ListPaymentsAccountsRequest,
              com.google.ads.googleads.v21.services.ListPaymentsAccountsResponse>(
                service, METHODID_LIST_PAYMENTS_ACCOUNTS)))
        .build();
  }

  private static abstract class PaymentsAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentsAccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v21.services.PaymentsAccountServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentsAccountService");
    }
  }

  private static final class PaymentsAccountServiceFileDescriptorSupplier
      extends PaymentsAccountServiceBaseDescriptorSupplier {
    PaymentsAccountServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentsAccountServiceMethodDescriptorSupplier
      extends PaymentsAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PaymentsAccountServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PaymentsAccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentsAccountServiceFileDescriptorSupplier())
              .addMethod(getListPaymentsAccountsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
