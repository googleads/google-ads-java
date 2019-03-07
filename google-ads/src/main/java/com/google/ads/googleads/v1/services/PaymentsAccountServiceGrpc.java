package com.google.ads.googleads.v1.services;

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
 * Service to provide Payments accounts that can be used to set up consolidated
 * billing.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/payments_account_service.proto")
public final class PaymentsAccountServiceGrpc {

  private PaymentsAccountServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.PaymentsAccountService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListPaymentsAccountsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.ListPaymentsAccountsRequest,
      com.google.ads.googleads.v1.services.ListPaymentsAccountsResponse> METHOD_LIST_PAYMENTS_ACCOUNTS = getListPaymentsAccountsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.ListPaymentsAccountsRequest,
      com.google.ads.googleads.v1.services.ListPaymentsAccountsResponse> getListPaymentsAccountsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.ListPaymentsAccountsRequest,
      com.google.ads.googleads.v1.services.ListPaymentsAccountsResponse> getListPaymentsAccountsMethod() {
    return getListPaymentsAccountsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.ListPaymentsAccountsRequest,
      com.google.ads.googleads.v1.services.ListPaymentsAccountsResponse> getListPaymentsAccountsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.ListPaymentsAccountsRequest, com.google.ads.googleads.v1.services.ListPaymentsAccountsResponse> getListPaymentsAccountsMethod;
    if ((getListPaymentsAccountsMethod = PaymentsAccountServiceGrpc.getListPaymentsAccountsMethod) == null) {
      synchronized (PaymentsAccountServiceGrpc.class) {
        if ((getListPaymentsAccountsMethod = PaymentsAccountServiceGrpc.getListPaymentsAccountsMethod) == null) {
          PaymentsAccountServiceGrpc.getListPaymentsAccountsMethod = getListPaymentsAccountsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.ListPaymentsAccountsRequest, com.google.ads.googleads.v1.services.ListPaymentsAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.PaymentsAccountService", "ListPaymentsAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.ListPaymentsAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.ListPaymentsAccountsResponse.getDefaultInstance()))
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
    return new PaymentsAccountServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentsAccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PaymentsAccountServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentsAccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PaymentsAccountServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to provide Payments accounts that can be used to set up consolidated
   * billing.
   * </pre>
   */
  public static abstract class PaymentsAccountServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns all Payments accounts associated with all managers
     * between the login customer ID and specified serving customer in the
     * hierarchy, inclusive.
     * </pre>
     */
    public void listPaymentsAccounts(com.google.ads.googleads.v1.services.ListPaymentsAccountsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.ListPaymentsAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPaymentsAccountsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListPaymentsAccountsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.ListPaymentsAccountsRequest,
                com.google.ads.googleads.v1.services.ListPaymentsAccountsResponse>(
                  this, METHODID_LIST_PAYMENTS_ACCOUNTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to provide Payments accounts that can be used to set up consolidated
   * billing.
   * </pre>
   */
  public static final class PaymentsAccountServiceStub extends io.grpc.stub.AbstractStub<PaymentsAccountServiceStub> {
    private PaymentsAccountServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentsAccountServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentsAccountServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentsAccountServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all Payments accounts associated with all managers
     * between the login customer ID and specified serving customer in the
     * hierarchy, inclusive.
     * </pre>
     */
    public void listPaymentsAccounts(com.google.ads.googleads.v1.services.ListPaymentsAccountsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.ListPaymentsAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPaymentsAccountsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to provide Payments accounts that can be used to set up consolidated
   * billing.
   * </pre>
   */
  public static final class PaymentsAccountServiceBlockingStub extends io.grpc.stub.AbstractStub<PaymentsAccountServiceBlockingStub> {
    private PaymentsAccountServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentsAccountServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentsAccountServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentsAccountServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all Payments accounts associated with all managers
     * between the login customer ID and specified serving customer in the
     * hierarchy, inclusive.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.ListPaymentsAccountsResponse listPaymentsAccounts(com.google.ads.googleads.v1.services.ListPaymentsAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPaymentsAccountsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to provide Payments accounts that can be used to set up consolidated
   * billing.
   * </pre>
   */
  public static final class PaymentsAccountServiceFutureStub extends io.grpc.stub.AbstractStub<PaymentsAccountServiceFutureStub> {
    private PaymentsAccountServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentsAccountServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentsAccountServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentsAccountServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all Payments accounts associated with all managers
     * between the login customer ID and specified serving customer in the
     * hierarchy, inclusive.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.ListPaymentsAccountsResponse> listPaymentsAccounts(
        com.google.ads.googleads.v1.services.ListPaymentsAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPaymentsAccountsMethodHelper(), getCallOptions()), request);
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
          serviceImpl.listPaymentsAccounts((com.google.ads.googleads.v1.services.ListPaymentsAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.ListPaymentsAccountsResponse>) responseObserver);
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
      return com.google.ads.googleads.v1.services.PaymentsAccountServiceProto.getDescriptor();
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
              .addMethod(getListPaymentsAccountsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
