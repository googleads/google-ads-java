package com.google.ads.googleads.v4.services;

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
 * A service for fetching an account-level budget.
 * Account-level budgets are mutated by creating proposal resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/account_budget_service.proto")
public final class AccountBudgetServiceGrpc {

  private AccountBudgetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.AccountBudgetService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAccountBudgetMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAccountBudgetRequest,
      com.google.ads.googleads.v4.resources.AccountBudget> METHOD_GET_ACCOUNT_BUDGET = getGetAccountBudgetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAccountBudgetRequest,
      com.google.ads.googleads.v4.resources.AccountBudget> getGetAccountBudgetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAccountBudgetRequest,
      com.google.ads.googleads.v4.resources.AccountBudget> getGetAccountBudgetMethod() {
    return getGetAccountBudgetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAccountBudgetRequest,
      com.google.ads.googleads.v4.resources.AccountBudget> getGetAccountBudgetMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAccountBudgetRequest, com.google.ads.googleads.v4.resources.AccountBudget> getGetAccountBudgetMethod;
    if ((getGetAccountBudgetMethod = AccountBudgetServiceGrpc.getGetAccountBudgetMethod) == null) {
      synchronized (AccountBudgetServiceGrpc.class) {
        if ((getGetAccountBudgetMethod = AccountBudgetServiceGrpc.getGetAccountBudgetMethod) == null) {
          AccountBudgetServiceGrpc.getGetAccountBudgetMethod = getGetAccountBudgetMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetAccountBudgetRequest, com.google.ads.googleads.v4.resources.AccountBudget>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.AccountBudgetService", "GetAccountBudget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetAccountBudgetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.AccountBudget.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountBudgetServiceMethodDescriptorSupplier("GetAccountBudget"))
                  .build();
          }
        }
     }
     return getGetAccountBudgetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountBudgetServiceStub newStub(io.grpc.Channel channel) {
    return new AccountBudgetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountBudgetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccountBudgetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountBudgetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccountBudgetServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A service for fetching an account-level budget.
   * Account-level budgets are mutated by creating proposal resources.
   * </pre>
   */
  public static abstract class AccountBudgetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns an account-level budget in full detail.
     * </pre>
     */
    public void getAccountBudget(com.google.ads.googleads.v4.services.GetAccountBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AccountBudget> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountBudgetMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAccountBudgetMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetAccountBudgetRequest,
                com.google.ads.googleads.v4.resources.AccountBudget>(
                  this, METHODID_GET_ACCOUNT_BUDGET)))
          .build();
    }
  }

  /**
   * <pre>
   * A service for fetching an account-level budget.
   * Account-level budgets are mutated by creating proposal resources.
   * </pre>
   */
  public static final class AccountBudgetServiceStub extends io.grpc.stub.AbstractStub<AccountBudgetServiceStub> {
    private AccountBudgetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountBudgetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountBudgetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountBudgetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns an account-level budget in full detail.
     * </pre>
     */
    public void getAccountBudget(com.google.ads.googleads.v4.services.GetAccountBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AccountBudget> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountBudgetMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A service for fetching an account-level budget.
   * Account-level budgets are mutated by creating proposal resources.
   * </pre>
   */
  public static final class AccountBudgetServiceBlockingStub extends io.grpc.stub.AbstractStub<AccountBudgetServiceBlockingStub> {
    private AccountBudgetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountBudgetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountBudgetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountBudgetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns an account-level budget in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.AccountBudget getAccountBudget(com.google.ads.googleads.v4.services.GetAccountBudgetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountBudgetMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A service for fetching an account-level budget.
   * Account-level budgets are mutated by creating proposal resources.
   * </pre>
   */
  public static final class AccountBudgetServiceFutureStub extends io.grpc.stub.AbstractStub<AccountBudgetServiceFutureStub> {
    private AccountBudgetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountBudgetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountBudgetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountBudgetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns an account-level budget in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.AccountBudget> getAccountBudget(
        com.google.ads.googleads.v4.services.GetAccountBudgetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountBudgetMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT_BUDGET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountBudgetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountBudgetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCOUNT_BUDGET:
          serviceImpl.getAccountBudget((com.google.ads.googleads.v4.services.GetAccountBudgetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AccountBudget>) responseObserver);
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

  private static abstract class AccountBudgetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountBudgetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.AccountBudgetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountBudgetService");
    }
  }

  private static final class AccountBudgetServiceFileDescriptorSupplier
      extends AccountBudgetServiceBaseDescriptorSupplier {
    AccountBudgetServiceFileDescriptorSupplier() {}
  }

  private static final class AccountBudgetServiceMethodDescriptorSupplier
      extends AccountBudgetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountBudgetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountBudgetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountBudgetServiceFileDescriptorSupplier())
              .addMethod(getGetAccountBudgetMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
