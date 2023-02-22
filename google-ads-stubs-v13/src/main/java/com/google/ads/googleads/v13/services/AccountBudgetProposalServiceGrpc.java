package com.google.ads.googleads.v13.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A service for managing account-level budgets through proposals.
 * A proposal is a request to create a new budget or make changes to an
 * existing one.
 * Mutates:
 * The CREATE operation creates a new proposal.
 * UPDATE operations aren't supported.
 * The REMOVE operation cancels a pending proposal.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v13/services/account_budget_proposal_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountBudgetProposalServiceGrpc {

  private AccountBudgetProposalServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v13.services.AccountBudgetProposalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateAccountBudgetProposalRequest,
      com.google.ads.googleads.v13.services.MutateAccountBudgetProposalResponse> getMutateAccountBudgetProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAccountBudgetProposal",
      requestType = com.google.ads.googleads.v13.services.MutateAccountBudgetProposalRequest.class,
      responseType = com.google.ads.googleads.v13.services.MutateAccountBudgetProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateAccountBudgetProposalRequest,
      com.google.ads.googleads.v13.services.MutateAccountBudgetProposalResponse> getMutateAccountBudgetProposalMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateAccountBudgetProposalRequest, com.google.ads.googleads.v13.services.MutateAccountBudgetProposalResponse> getMutateAccountBudgetProposalMethod;
    if ((getMutateAccountBudgetProposalMethod = AccountBudgetProposalServiceGrpc.getMutateAccountBudgetProposalMethod) == null) {
      synchronized (AccountBudgetProposalServiceGrpc.class) {
        if ((getMutateAccountBudgetProposalMethod = AccountBudgetProposalServiceGrpc.getMutateAccountBudgetProposalMethod) == null) {
          AccountBudgetProposalServiceGrpc.getMutateAccountBudgetProposalMethod = getMutateAccountBudgetProposalMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.MutateAccountBudgetProposalRequest, com.google.ads.googleads.v13.services.MutateAccountBudgetProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAccountBudgetProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateAccountBudgetProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateAccountBudgetProposalResponse.getDefaultInstance()))
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
   * A service for managing account-level budgets through proposals.
   * A proposal is a request to create a new budget or make changes to an
   * existing one.
   * Mutates:
   * The CREATE operation creates a new proposal.
   * UPDATE operations aren't supported.
   * The REMOVE operation cancels a pending proposal.
   * </pre>
   */
  public static abstract class AccountBudgetProposalServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates, or removes account budget proposals.  Operation statuses
     * are returned.
     * List of thrown errors:
     *   [AccountBudgetProposalError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateAccountBudgetProposal(com.google.ads.googleads.v13.services.MutateAccountBudgetProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateAccountBudgetProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAccountBudgetProposalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateAccountBudgetProposalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v13.services.MutateAccountBudgetProposalRequest,
                com.google.ads.googleads.v13.services.MutateAccountBudgetProposalResponse>(
                  this, METHODID_MUTATE_ACCOUNT_BUDGET_PROPOSAL)))
          .build();
    }
  }

  /**
   * <pre>
   * A service for managing account-level budgets through proposals.
   * A proposal is a request to create a new budget or make changes to an
   * existing one.
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
     * Creates, updates, or removes account budget proposals.  Operation statuses
     * are returned.
     * List of thrown errors:
     *   [AccountBudgetProposalError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateAccountBudgetProposal(com.google.ads.googleads.v13.services.MutateAccountBudgetProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateAccountBudgetProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAccountBudgetProposalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A service for managing account-level budgets through proposals.
   * A proposal is a request to create a new budget or make changes to an
   * existing one.
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
     * Creates, updates, or removes account budget proposals.  Operation statuses
     * are returned.
     * List of thrown errors:
     *   [AccountBudgetProposalError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v13.services.MutateAccountBudgetProposalResponse mutateAccountBudgetProposal(com.google.ads.googleads.v13.services.MutateAccountBudgetProposalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAccountBudgetProposalMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A service for managing account-level budgets through proposals.
   * A proposal is a request to create a new budget or make changes to an
   * existing one.
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
     * Creates, updates, or removes account budget proposals.  Operation statuses
     * are returned.
     * List of thrown errors:
     *   [AccountBudgetProposalError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.MutateAccountBudgetProposalResponse> mutateAccountBudgetProposal(
        com.google.ads.googleads.v13.services.MutateAccountBudgetProposalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAccountBudgetProposalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_ACCOUNT_BUDGET_PROPOSAL = 0;

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
        case METHODID_MUTATE_ACCOUNT_BUDGET_PROPOSAL:
          serviceImpl.mutateAccountBudgetProposal((com.google.ads.googleads.v13.services.MutateAccountBudgetProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateAccountBudgetProposalResponse>) responseObserver);
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
      return com.google.ads.googleads.v13.services.AccountBudgetProposalServiceProto.getDescriptor();
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
              .addMethod(getMutateAccountBudgetProposalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
