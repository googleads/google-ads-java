package com.google.ads.googleads.v6.services;

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
 * A service for managing account-level budgets via proposals.
 * A proposal is a request to create a new budget or make changes to an
 * existing one.
 * Reads for account-level budgets managed by these proposals will be
 * supported in a future version. Until then, please use the
 * BudgetOrderService from the AdWords API. Learn more at
 * https://developers.google.com/adwords/api/docs/guides/budget-order
 * Mutates:
 * The CREATE operation creates a new proposal.
 * UPDATE operations aren't supported.
 * The REMOVE operation cancels a pending proposal.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/account_budget_proposal_service.proto")
public final class AccountBudgetProposalServiceGrpc {

  private AccountBudgetProposalServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.AccountBudgetProposalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest,
      com.google.ads.googleads.v6.resources.AccountBudgetProposal> getGetAccountBudgetProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountBudgetProposal",
      requestType = com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest.class,
      responseType = com.google.ads.googleads.v6.resources.AccountBudgetProposal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest,
      com.google.ads.googleads.v6.resources.AccountBudgetProposal> getGetAccountBudgetProposalMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest, com.google.ads.googleads.v6.resources.AccountBudgetProposal> getGetAccountBudgetProposalMethod;
    if ((getGetAccountBudgetProposalMethod = AccountBudgetProposalServiceGrpc.getGetAccountBudgetProposalMethod) == null) {
      synchronized (AccountBudgetProposalServiceGrpc.class) {
        if ((getGetAccountBudgetProposalMethod = AccountBudgetProposalServiceGrpc.getGetAccountBudgetProposalMethod) == null) {
          AccountBudgetProposalServiceGrpc.getGetAccountBudgetProposalMethod = getGetAccountBudgetProposalMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest, com.google.ads.googleads.v6.resources.AccountBudgetProposal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountBudgetProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.AccountBudgetProposal.getDefaultInstance()))
              .setSchemaDescriptor(new AccountBudgetProposalServiceMethodDescriptorSupplier("GetAccountBudgetProposal"))
              .build();
        }
      }
    }
    return getGetAccountBudgetProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest,
      com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse> getMutateAccountBudgetProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAccountBudgetProposal",
      requestType = com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest,
      com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse> getMutateAccountBudgetProposalMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest, com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse> getMutateAccountBudgetProposalMethod;
    if ((getMutateAccountBudgetProposalMethod = AccountBudgetProposalServiceGrpc.getMutateAccountBudgetProposalMethod) == null) {
      synchronized (AccountBudgetProposalServiceGrpc.class) {
        if ((getMutateAccountBudgetProposalMethod = AccountBudgetProposalServiceGrpc.getMutateAccountBudgetProposalMethod) == null) {
          AccountBudgetProposalServiceGrpc.getMutateAccountBudgetProposalMethod = getMutateAccountBudgetProposalMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest, com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAccountBudgetProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountBudgetProposalServiceMethodDescriptorSupplier("MutateAccountBudgetProposal"))
              .build();
        }
      }
    }
    return getMutateAccountBudgetProposalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountBudgetProposalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountBudgetProposalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountBudgetProposalServiceStub>() {
        @java.lang.Override
        public AccountBudgetProposalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountBudgetProposalServiceStub(channel, callOptions);
        }
      };
    return AccountBudgetProposalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountBudgetProposalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountBudgetProposalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountBudgetProposalServiceBlockingStub>() {
        @java.lang.Override
        public AccountBudgetProposalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountBudgetProposalServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountBudgetProposalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountBudgetProposalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountBudgetProposalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountBudgetProposalServiceFutureStub>() {
        @java.lang.Override
        public AccountBudgetProposalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountBudgetProposalServiceFutureStub(channel, callOptions);
        }
      };
    return AccountBudgetProposalServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A service for managing account-level budgets via proposals.
   * A proposal is a request to create a new budget or make changes to an
   * existing one.
   * Reads for account-level budgets managed by these proposals will be
   * supported in a future version. Until then, please use the
   * BudgetOrderService from the AdWords API. Learn more at
   * https://developers.google.com/adwords/api/docs/guides/budget-order
   * Mutates:
   * The CREATE operation creates a new proposal.
   * UPDATE operations aren't supported.
   * The REMOVE operation cancels a pending proposal.
   * </pre>
   */
  public static abstract class AccountBudgetProposalServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns an account-level budget proposal in full detail.
     * </pre>
     */
    public void getAccountBudgetProposal(com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AccountBudgetProposal> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountBudgetProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes account budget proposals.  Operation statuses
     * are returned.
     * </pre>
     */
    public void mutateAccountBudgetProposal(com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAccountBudgetProposalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAccountBudgetProposalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest,
                com.google.ads.googleads.v6.resources.AccountBudgetProposal>(
                  this, METHODID_GET_ACCOUNT_BUDGET_PROPOSAL)))
          .addMethod(
            getMutateAccountBudgetProposalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest,
                com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse>(
                  this, METHODID_MUTATE_ACCOUNT_BUDGET_PROPOSAL)))
          .build();
    }
  }

  /**
   * <pre>
   * A service for managing account-level budgets via proposals.
   * A proposal is a request to create a new budget or make changes to an
   * existing one.
   * Reads for account-level budgets managed by these proposals will be
   * supported in a future version. Until then, please use the
   * BudgetOrderService from the AdWords API. Learn more at
   * https://developers.google.com/adwords/api/docs/guides/budget-order
   * Mutates:
   * The CREATE operation creates a new proposal.
   * UPDATE operations aren't supported.
   * The REMOVE operation cancels a pending proposal.
   * </pre>
   */
  public static final class AccountBudgetProposalServiceStub extends io.grpc.stub.AbstractAsyncStub<AccountBudgetProposalServiceStub> {
    private AccountBudgetProposalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountBudgetProposalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountBudgetProposalServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns an account-level budget proposal in full detail.
     * </pre>
     */
    public void getAccountBudgetProposal(com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AccountBudgetProposal> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountBudgetProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes account budget proposals.  Operation statuses
     * are returned.
     * </pre>
     */
    public void mutateAccountBudgetProposal(com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAccountBudgetProposalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A service for managing account-level budgets via proposals.
   * A proposal is a request to create a new budget or make changes to an
   * existing one.
   * Reads for account-level budgets managed by these proposals will be
   * supported in a future version. Until then, please use the
   * BudgetOrderService from the AdWords API. Learn more at
   * https://developers.google.com/adwords/api/docs/guides/budget-order
   * Mutates:
   * The CREATE operation creates a new proposal.
   * UPDATE operations aren't supported.
   * The REMOVE operation cancels a pending proposal.
   * </pre>
   */
  public static final class AccountBudgetProposalServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountBudgetProposalServiceBlockingStub> {
    private AccountBudgetProposalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountBudgetProposalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountBudgetProposalServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns an account-level budget proposal in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.AccountBudgetProposal getAccountBudgetProposal(com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountBudgetProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes account budget proposals.  Operation statuses
     * are returned.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse mutateAccountBudgetProposal(com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAccountBudgetProposalMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A service for managing account-level budgets via proposals.
   * A proposal is a request to create a new budget or make changes to an
   * existing one.
   * Reads for account-level budgets managed by these proposals will be
   * supported in a future version. Until then, please use the
   * BudgetOrderService from the AdWords API. Learn more at
   * https://developers.google.com/adwords/api/docs/guides/budget-order
   * Mutates:
   * The CREATE operation creates a new proposal.
   * UPDATE operations aren't supported.
   * The REMOVE operation cancels a pending proposal.
   * </pre>
   */
  public static final class AccountBudgetProposalServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccountBudgetProposalServiceFutureStub> {
    private AccountBudgetProposalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountBudgetProposalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountBudgetProposalServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns an account-level budget proposal in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.AccountBudgetProposal> getAccountBudgetProposal(
        com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountBudgetProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes account budget proposals.  Operation statuses
     * are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse> mutateAccountBudgetProposal(
        com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAccountBudgetProposalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT_BUDGET_PROPOSAL = 0;
  private static final int METHODID_MUTATE_ACCOUNT_BUDGET_PROPOSAL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountBudgetProposalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountBudgetProposalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCOUNT_BUDGET_PROPOSAL:
          serviceImpl.getAccountBudgetProposal((com.google.ads.googleads.v6.services.GetAccountBudgetProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AccountBudgetProposal>) responseObserver);
          break;
        case METHODID_MUTATE_ACCOUNT_BUDGET_PROPOSAL:
          serviceImpl.mutateAccountBudgetProposal((com.google.ads.googleads.v6.services.MutateAccountBudgetProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateAccountBudgetProposalResponse>) responseObserver);
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

  private static abstract class AccountBudgetProposalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountBudgetProposalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.AccountBudgetProposalServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountBudgetProposalService");
    }
  }

  private static final class AccountBudgetProposalServiceFileDescriptorSupplier
      extends AccountBudgetProposalServiceBaseDescriptorSupplier {
    AccountBudgetProposalServiceFileDescriptorSupplier() {}
  }

  private static final class AccountBudgetProposalServiceMethodDescriptorSupplier
      extends AccountBudgetProposalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountBudgetProposalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountBudgetProposalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountBudgetProposalServiceFileDescriptorSupplier())
              .addMethod(getGetAccountBudgetProposalMethod())
              .addMethod(getMutateAccountBudgetProposalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
