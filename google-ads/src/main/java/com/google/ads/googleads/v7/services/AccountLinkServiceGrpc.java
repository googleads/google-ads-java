package com.google.ads.googleads.v7.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service allows management of links between Google Ads accounts and other
 * accounts.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v7/services/account_link_service.proto")
public final class AccountLinkServiceGrpc {

  private AccountLinkServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v7.services.AccountLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetAccountLinkRequest,
      com.google.ads.googleads.v7.resources.AccountLink> getGetAccountLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountLink",
      requestType = com.google.ads.googleads.v7.services.GetAccountLinkRequest.class,
      responseType = com.google.ads.googleads.v7.resources.AccountLink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetAccountLinkRequest,
      com.google.ads.googleads.v7.resources.AccountLink> getGetAccountLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetAccountLinkRequest, com.google.ads.googleads.v7.resources.AccountLink> getGetAccountLinkMethod;
    if ((getGetAccountLinkMethod = AccountLinkServiceGrpc.getGetAccountLinkMethod) == null) {
      synchronized (AccountLinkServiceGrpc.class) {
        if ((getGetAccountLinkMethod = AccountLinkServiceGrpc.getGetAccountLinkMethod) == null) {
          AccountLinkServiceGrpc.getGetAccountLinkMethod = getGetAccountLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.GetAccountLinkRequest, com.google.ads.googleads.v7.resources.AccountLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.GetAccountLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.resources.AccountLink.getDefaultInstance()))
              .setSchemaDescriptor(new AccountLinkServiceMethodDescriptorSupplier("GetAccountLink"))
              .build();
        }
      }
    }
    return getGetAccountLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.CreateAccountLinkRequest,
      com.google.ads.googleads.v7.services.CreateAccountLinkResponse> getCreateAccountLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccountLink",
      requestType = com.google.ads.googleads.v7.services.CreateAccountLinkRequest.class,
      responseType = com.google.ads.googleads.v7.services.CreateAccountLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.CreateAccountLinkRequest,
      com.google.ads.googleads.v7.services.CreateAccountLinkResponse> getCreateAccountLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.CreateAccountLinkRequest, com.google.ads.googleads.v7.services.CreateAccountLinkResponse> getCreateAccountLinkMethod;
    if ((getCreateAccountLinkMethod = AccountLinkServiceGrpc.getCreateAccountLinkMethod) == null) {
      synchronized (AccountLinkServiceGrpc.class) {
        if ((getCreateAccountLinkMethod = AccountLinkServiceGrpc.getCreateAccountLinkMethod) == null) {
          AccountLinkServiceGrpc.getCreateAccountLinkMethod = getCreateAccountLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.CreateAccountLinkRequest, com.google.ads.googleads.v7.services.CreateAccountLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccountLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.CreateAccountLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.CreateAccountLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountLinkServiceMethodDescriptorSupplier("CreateAccountLink"))
              .build();
        }
      }
    }
    return getCreateAccountLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.MutateAccountLinkRequest,
      com.google.ads.googleads.v7.services.MutateAccountLinkResponse> getMutateAccountLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAccountLink",
      requestType = com.google.ads.googleads.v7.services.MutateAccountLinkRequest.class,
      responseType = com.google.ads.googleads.v7.services.MutateAccountLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.MutateAccountLinkRequest,
      com.google.ads.googleads.v7.services.MutateAccountLinkResponse> getMutateAccountLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.MutateAccountLinkRequest, com.google.ads.googleads.v7.services.MutateAccountLinkResponse> getMutateAccountLinkMethod;
    if ((getMutateAccountLinkMethod = AccountLinkServiceGrpc.getMutateAccountLinkMethod) == null) {
      synchronized (AccountLinkServiceGrpc.class) {
        if ((getMutateAccountLinkMethod = AccountLinkServiceGrpc.getMutateAccountLinkMethod) == null) {
          AccountLinkServiceGrpc.getMutateAccountLinkMethod = getMutateAccountLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.MutateAccountLinkRequest, com.google.ads.googleads.v7.services.MutateAccountLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAccountLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.MutateAccountLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.MutateAccountLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountLinkServiceMethodDescriptorSupplier("MutateAccountLink"))
              .build();
        }
      }
    }
    return getMutateAccountLinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountLinkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountLinkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountLinkServiceStub>() {
        @java.lang.Override
        public AccountLinkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountLinkServiceStub(channel, callOptions);
        }
      };
    return AccountLinkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountLinkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountLinkServiceBlockingStub>() {
        @java.lang.Override
        public AccountLinkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountLinkServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountLinkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountLinkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountLinkServiceFutureStub>() {
        @java.lang.Override
        public AccountLinkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountLinkServiceFutureStub(channel, callOptions);
        }
      };
    return AccountLinkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads accounts and other
   * accounts.
   * </pre>
   */
  public static abstract class AccountLinkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the account link in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAccountLink(com.google.ads.googleads.v7.services.GetAccountLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.AccountLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an account link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ThirdPartyAppAnalyticsLinkError]()
     * </pre>
     */
    public void createAccountLink(com.google.ads.googleads.v7.services.CreateAccountLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.CreateAccountLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccountLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or removes an account link.
     * From V5, create is not supported through
     * AccountLinkService.MutateAccountLink. Please use
     * AccountLinkService.CreateAccountLink instead.
     * List of thrown errors:
     *   [AccountLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateAccountLink(com.google.ads.googleads.v7.services.MutateAccountLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.MutateAccountLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAccountLinkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAccountLinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.GetAccountLinkRequest,
                com.google.ads.googleads.v7.resources.AccountLink>(
                  this, METHODID_GET_ACCOUNT_LINK)))
          .addMethod(
            getCreateAccountLinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.CreateAccountLinkRequest,
                com.google.ads.googleads.v7.services.CreateAccountLinkResponse>(
                  this, METHODID_CREATE_ACCOUNT_LINK)))
          .addMethod(
            getMutateAccountLinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.MutateAccountLinkRequest,
                com.google.ads.googleads.v7.services.MutateAccountLinkResponse>(
                  this, METHODID_MUTATE_ACCOUNT_LINK)))
          .build();
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads accounts and other
   * accounts.
   * </pre>
   */
  public static final class AccountLinkServiceStub extends io.grpc.stub.AbstractAsyncStub<AccountLinkServiceStub> {
    private AccountLinkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountLinkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the account link in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAccountLink(com.google.ads.googleads.v7.services.GetAccountLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.AccountLink> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an account link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ThirdPartyAppAnalyticsLinkError]()
     * </pre>
     */
    public void createAccountLink(com.google.ads.googleads.v7.services.CreateAccountLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.CreateAccountLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccountLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or removes an account link.
     * From V5, create is not supported through
     * AccountLinkService.MutateAccountLink. Please use
     * AccountLinkService.CreateAccountLink instead.
     * List of thrown errors:
     *   [AccountLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateAccountLink(com.google.ads.googleads.v7.services.MutateAccountLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.MutateAccountLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAccountLinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads accounts and other
   * accounts.
   * </pre>
   */
  public static final class AccountLinkServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountLinkServiceBlockingStub> {
    private AccountLinkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountLinkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the account link in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.resources.AccountLink getAccountLink(com.google.ads.googleads.v7.services.GetAccountLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an account link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ThirdPartyAppAnalyticsLinkError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.services.CreateAccountLinkResponse createAccountLink(com.google.ads.googleads.v7.services.CreateAccountLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccountLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or removes an account link.
     * From V5, create is not supported through
     * AccountLinkService.MutateAccountLink. Please use
     * AccountLinkService.CreateAccountLink instead.
     * List of thrown errors:
     *   [AccountLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.services.MutateAccountLinkResponse mutateAccountLink(com.google.ads.googleads.v7.services.MutateAccountLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAccountLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads accounts and other
   * accounts.
   * </pre>
   */
  public static final class AccountLinkServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccountLinkServiceFutureStub> {
    private AccountLinkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountLinkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the account link in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.resources.AccountLink> getAccountLink(
        com.google.ads.googleads.v7.services.GetAccountLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an account link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ThirdPartyAppAnalyticsLinkError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.services.CreateAccountLinkResponse> createAccountLink(
        com.google.ads.googleads.v7.services.CreateAccountLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccountLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or removes an account link.
     * From V5, create is not supported through
     * AccountLinkService.MutateAccountLink. Please use
     * AccountLinkService.CreateAccountLink instead.
     * List of thrown errors:
     *   [AccountLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.services.MutateAccountLinkResponse> mutateAccountLink(
        com.google.ads.googleads.v7.services.MutateAccountLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAccountLinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT_LINK = 0;
  private static final int METHODID_CREATE_ACCOUNT_LINK = 1;
  private static final int METHODID_MUTATE_ACCOUNT_LINK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountLinkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountLinkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCOUNT_LINK:
          serviceImpl.getAccountLink((com.google.ads.googleads.v7.services.GetAccountLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.AccountLink>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT_LINK:
          serviceImpl.createAccountLink((com.google.ads.googleads.v7.services.CreateAccountLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.CreateAccountLinkResponse>) responseObserver);
          break;
        case METHODID_MUTATE_ACCOUNT_LINK:
          serviceImpl.mutateAccountLink((com.google.ads.googleads.v7.services.MutateAccountLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.MutateAccountLinkResponse>) responseObserver);
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

  private static abstract class AccountLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v7.services.AccountLinkServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountLinkService");
    }
  }

  private static final class AccountLinkServiceFileDescriptorSupplier
      extends AccountLinkServiceBaseDescriptorSupplier {
    AccountLinkServiceFileDescriptorSupplier() {}
  }

  private static final class AccountLinkServiceMethodDescriptorSupplier
      extends AccountLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountLinkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountLinkServiceFileDescriptorSupplier())
              .addMethod(getGetAccountLinkMethod())
              .addMethod(getCreateAccountLinkMethod())
              .addMethod(getMutateAccountLinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
