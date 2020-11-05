package com.google.ads.googleads.v5.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service to provide payments accounts that can be used to set up consolidated
 * billing.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v5/services/payments_account_service.proto")
public final class PaymentsAccountServiceGrpc {

  private PaymentsAccountServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v5.services.PaymentsAccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.ListPaymentsAccountsRequest,
      com.google.ads.googleads.v5.services.ListPaymentsAccountsResponse> getListPaymentsAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPaymentsAccounts",
      requestType = com.google.ads.googleads.v5.services.ListPaymentsAccountsRequest.class,
      responseType = com.google.ads.googleads.v5.services.ListPaymentsAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.ListPaymentsAccountsRequest,
      com.google.ads.googleads.v5.services.ListPaymentsAccountsResponse> getListPaymentsAccountsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.ListPaymentsAccountsRequest, com.google.ads.googleads.v5.services.ListPaymentsAccountsResponse> getListPaymentsAccountsMethod;
    if ((getListPaymentsAccountsMethod = PaymentsAccountServiceGrpc.getListPaymentsAccountsMethod) == null) {
      synchronized (PaymentsAccountServiceGrpc.class) {
        if ((getListPaymentsAccountsMethod = PaymentsAccountServiceGrpc.getListPaymentsAccountsMethod) == null) {
          PaymentsAccountServiceGrpc.getListPaymentsAccountsMethod = getListPaymentsAccountsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.ListPaymentsAccountsRequest, com.google.ads.googleads.v5.services.ListPaymentsAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPaymentsAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.ListPaymentsAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.ListPaymentsAccountsResponse.getDefaultInstance()))
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
  public static abstract class PaymentsAccountServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns all payments accounts associated with all managers
     * between the login customer ID and specified serving customer in the
     * hierarchy, inclusive.
     * </pre>
     */
    public void listPaymentsAccounts(com.google.ads.googleads.v5.services.ListPaymentsAccountsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.ListPaymentsAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPaymentsAccountsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListPaymentsAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.ListPaymentsAccountsRequest,
                com.google.ads.googleads.v5.services.ListPaymentsAccountsResponse>(
                  this, METHODID_LIST_PAYMENTS_ACCOUNTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to provide payments accounts that can be used to set up consolidated
   * billing.
   * </pre>
   */
  public static final class PaymentsAccountServiceStub extends io.grpc.stub.AbstractAsyncStub<PaymentsAccountServiceStub> {
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
     * </pre>
     */
    public void listPaymentsAccounts(com.google.ads.googleads.v5.services.ListPaymentsAccountsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.ListPaymentsAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPaymentsAccountsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to provide payments accounts that can be used to set up consolidated
   * billing.
   * </pre>
   */
  public static final class PaymentsAccountServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PaymentsAccountServiceBlockingStub> {
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
     * </pre>
     */
    public com.google.ads.googleads.v5.services.ListPaymentsAccountsResponse listPaymentsAccounts(com.google.ads.googleads.v5.services.ListPaymentsAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPaymentsAccountsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to provide payments accounts that can be used to set up consolidated
   * billing.
   * </pre>
   */
  public static final class PaymentsAccountServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PaymentsAccountServiceFutureStub> {
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
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.services.ListPaymentsAccountsResponse> listPaymentsAccounts(
        com.google.ads.googleads.v5.services.ListPaymentsAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPaymentsAccountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PAYMENTS_ACCOUNTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaymentsAccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaymentsAccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_PAYMENTS_ACCOUNTS:
          serviceImpl.listPaymentsAccounts((com.google.ads.googleads.v5.services.ListPaymentsAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.ListPaymentsAccountsResponse>) responseObserver);
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

  private static abstract class PaymentsAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentsAccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v5.services.PaymentsAccountServiceProto.getDescriptor();
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
    private final String methodName;

    PaymentsAccountServiceMethodDescriptorSupplier(String methodName) {
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
