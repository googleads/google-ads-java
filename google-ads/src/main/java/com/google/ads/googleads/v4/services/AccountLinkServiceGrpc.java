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
 * This service allows management of links between Google Ads accounts and other
 * accounts.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/account_link_service.proto")
public final class AccountLinkServiceGrpc {

  private AccountLinkServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.AccountLinkService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAccountLinkMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAccountLinkRequest,
      com.google.ads.googleads.v4.resources.AccountLink> METHOD_GET_ACCOUNT_LINK = getGetAccountLinkMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAccountLinkRequest,
      com.google.ads.googleads.v4.resources.AccountLink> getGetAccountLinkMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAccountLinkRequest,
      com.google.ads.googleads.v4.resources.AccountLink> getGetAccountLinkMethod() {
    return getGetAccountLinkMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAccountLinkRequest,
      com.google.ads.googleads.v4.resources.AccountLink> getGetAccountLinkMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAccountLinkRequest, com.google.ads.googleads.v4.resources.AccountLink> getGetAccountLinkMethod;
    if ((getGetAccountLinkMethod = AccountLinkServiceGrpc.getGetAccountLinkMethod) == null) {
      synchronized (AccountLinkServiceGrpc.class) {
        if ((getGetAccountLinkMethod = AccountLinkServiceGrpc.getGetAccountLinkMethod) == null) {
          AccountLinkServiceGrpc.getGetAccountLinkMethod = getGetAccountLinkMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetAccountLinkRequest, com.google.ads.googleads.v4.resources.AccountLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.AccountLinkService", "GetAccountLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetAccountLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.AccountLink.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountLinkServiceMethodDescriptorSupplier("GetAccountLink"))
                  .build();
          }
        }
     }
     return getGetAccountLinkMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateAccountLinkMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateAccountLinkRequest,
      com.google.ads.googleads.v4.services.MutateAccountLinkResponse> METHOD_MUTATE_ACCOUNT_LINK = getMutateAccountLinkMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateAccountLinkRequest,
      com.google.ads.googleads.v4.services.MutateAccountLinkResponse> getMutateAccountLinkMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateAccountLinkRequest,
      com.google.ads.googleads.v4.services.MutateAccountLinkResponse> getMutateAccountLinkMethod() {
    return getMutateAccountLinkMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateAccountLinkRequest,
      com.google.ads.googleads.v4.services.MutateAccountLinkResponse> getMutateAccountLinkMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateAccountLinkRequest, com.google.ads.googleads.v4.services.MutateAccountLinkResponse> getMutateAccountLinkMethod;
    if ((getMutateAccountLinkMethod = AccountLinkServiceGrpc.getMutateAccountLinkMethod) == null) {
      synchronized (AccountLinkServiceGrpc.class) {
        if ((getMutateAccountLinkMethod = AccountLinkServiceGrpc.getMutateAccountLinkMethod) == null) {
          AccountLinkServiceGrpc.getMutateAccountLinkMethod = getMutateAccountLinkMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.MutateAccountLinkRequest, com.google.ads.googleads.v4.services.MutateAccountLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.AccountLinkService", "MutateAccountLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateAccountLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateAccountLinkResponse.getDefaultInstance()))
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
    return new AccountLinkServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccountLinkServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccountLinkServiceFutureStub(channel);
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
     * </pre>
     */
    public void getAccountLink(com.google.ads.googleads.v4.services.GetAccountLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AccountLink> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountLinkMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates or removes an account link.
     * </pre>
     */
    public void mutateAccountLink(com.google.ads.googleads.v4.services.MutateAccountLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateAccountLinkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAccountLinkMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAccountLinkMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetAccountLinkRequest,
                com.google.ads.googleads.v4.resources.AccountLink>(
                  this, METHODID_GET_ACCOUNT_LINK)))
          .addMethod(
            getMutateAccountLinkMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.MutateAccountLinkRequest,
                com.google.ads.googleads.v4.services.MutateAccountLinkResponse>(
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
  public static final class AccountLinkServiceStub extends io.grpc.stub.AbstractStub<AccountLinkServiceStub> {
    private AccountLinkServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountLinkServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountLinkServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the account link in full detail.
     * </pre>
     */
    public void getAccountLink(com.google.ads.googleads.v4.services.GetAccountLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AccountLink> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountLinkMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or removes an account link.
     * </pre>
     */
    public void mutateAccountLink(com.google.ads.googleads.v4.services.MutateAccountLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateAccountLinkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAccountLinkMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads accounts and other
   * accounts.
   * </pre>
   */
  public static final class AccountLinkServiceBlockingStub extends io.grpc.stub.AbstractStub<AccountLinkServiceBlockingStub> {
    private AccountLinkServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountLinkServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountLinkServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the account link in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.AccountLink getAccountLink(com.google.ads.googleads.v4.services.GetAccountLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountLinkMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or removes an account link.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.MutateAccountLinkResponse mutateAccountLink(com.google.ads.googleads.v4.services.MutateAccountLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAccountLinkMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads accounts and other
   * accounts.
   * </pre>
   */
  public static final class AccountLinkServiceFutureStub extends io.grpc.stub.AbstractStub<AccountLinkServiceFutureStub> {
    private AccountLinkServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountLinkServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountLinkServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the account link in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.AccountLink> getAccountLink(
        com.google.ads.googleads.v4.services.GetAccountLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountLinkMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or removes an account link.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.MutateAccountLinkResponse> mutateAccountLink(
        com.google.ads.googleads.v4.services.MutateAccountLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAccountLinkMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT_LINK = 0;
  private static final int METHODID_MUTATE_ACCOUNT_LINK = 1;

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
          serviceImpl.getAccountLink((com.google.ads.googleads.v4.services.GetAccountLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AccountLink>) responseObserver);
          break;
        case METHODID_MUTATE_ACCOUNT_LINK:
          serviceImpl.mutateAccountLink((com.google.ads.googleads.v4.services.MutateAccountLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateAccountLinkResponse>) responseObserver);
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
      return com.google.ads.googleads.v4.services.AccountLinkServiceProto.getDescriptor();
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
              .addMethod(getGetAccountLinkMethodHelper())
              .addMethod(getMutateAccountLinkMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
