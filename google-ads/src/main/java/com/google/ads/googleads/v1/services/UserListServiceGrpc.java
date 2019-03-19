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
 * Service to manage user lists.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/user_list_service.proto")
public final class UserListServiceGrpc {

  private UserListServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.UserListService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetUserListMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetUserListRequest,
      com.google.ads.googleads.v1.resources.UserList> METHOD_GET_USER_LIST = getGetUserListMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetUserListRequest,
      com.google.ads.googleads.v1.resources.UserList> getGetUserListMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetUserListRequest,
      com.google.ads.googleads.v1.resources.UserList> getGetUserListMethod() {
    return getGetUserListMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetUserListRequest,
      com.google.ads.googleads.v1.resources.UserList> getGetUserListMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetUserListRequest, com.google.ads.googleads.v1.resources.UserList> getGetUserListMethod;
    if ((getGetUserListMethod = UserListServiceGrpc.getGetUserListMethod) == null) {
      synchronized (UserListServiceGrpc.class) {
        if ((getGetUserListMethod = UserListServiceGrpc.getGetUserListMethod) == null) {
          UserListServiceGrpc.getGetUserListMethod = getGetUserListMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetUserListRequest, com.google.ads.googleads.v1.resources.UserList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.UserListService", "GetUserList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetUserListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.UserList.getDefaultInstance()))
                  .setSchemaDescriptor(new UserListServiceMethodDescriptorSupplier("GetUserList"))
                  .build();
          }
        }
     }
     return getGetUserListMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateUserListsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateUserListsRequest,
      com.google.ads.googleads.v1.services.MutateUserListsResponse> METHOD_MUTATE_USER_LISTS = getMutateUserListsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateUserListsRequest,
      com.google.ads.googleads.v1.services.MutateUserListsResponse> getMutateUserListsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateUserListsRequest,
      com.google.ads.googleads.v1.services.MutateUserListsResponse> getMutateUserListsMethod() {
    return getMutateUserListsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateUserListsRequest,
      com.google.ads.googleads.v1.services.MutateUserListsResponse> getMutateUserListsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateUserListsRequest, com.google.ads.googleads.v1.services.MutateUserListsResponse> getMutateUserListsMethod;
    if ((getMutateUserListsMethod = UserListServiceGrpc.getMutateUserListsMethod) == null) {
      synchronized (UserListServiceGrpc.class) {
        if ((getMutateUserListsMethod = UserListServiceGrpc.getMutateUserListsMethod) == null) {
          UserListServiceGrpc.getMutateUserListsMethod = getMutateUserListsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.MutateUserListsRequest, com.google.ads.googleads.v1.services.MutateUserListsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.UserListService", "MutateUserLists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateUserListsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateUserListsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserListServiceMethodDescriptorSupplier("MutateUserLists"))
                  .build();
          }
        }
     }
     return getMutateUserListsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserListServiceStub newStub(io.grpc.Channel channel) {
    return new UserListServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserListServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserListServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserListServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserListServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage user lists.
   * </pre>
   */
  public static abstract class UserListServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested user list.
     * </pre>
     */
    public void getUserList(com.google.ads.googleads.v1.services.GetUserListRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.UserList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserListMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates or updates user lists. Operation statuses are returned.
     * </pre>
     */
    public void mutateUserLists(com.google.ads.googleads.v1.services.MutateUserListsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateUserListsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateUserListsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserListMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetUserListRequest,
                com.google.ads.googleads.v1.resources.UserList>(
                  this, METHODID_GET_USER_LIST)))
          .addMethod(
            getMutateUserListsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.MutateUserListsRequest,
                com.google.ads.googleads.v1.services.MutateUserListsResponse>(
                  this, METHODID_MUTATE_USER_LISTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage user lists.
   * </pre>
   */
  public static final class UserListServiceStub extends io.grpc.stub.AbstractStub<UserListServiceStub> {
    private UserListServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserListServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserListServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserListServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested user list.
     * </pre>
     */
    public void getUserList(com.google.ads.googleads.v1.services.GetUserListRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.UserList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserListMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or updates user lists. Operation statuses are returned.
     * </pre>
     */
    public void mutateUserLists(com.google.ads.googleads.v1.services.MutateUserListsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateUserListsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateUserListsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage user lists.
   * </pre>
   */
  public static final class UserListServiceBlockingStub extends io.grpc.stub.AbstractStub<UserListServiceBlockingStub> {
    private UserListServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserListServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserListServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserListServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested user list.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.UserList getUserList(com.google.ads.googleads.v1.services.GetUserListRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserListMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or updates user lists. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.MutateUserListsResponse mutateUserLists(com.google.ads.googleads.v1.services.MutateUserListsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateUserListsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage user lists.
   * </pre>
   */
  public static final class UserListServiceFutureStub extends io.grpc.stub.AbstractStub<UserListServiceFutureStub> {
    private UserListServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserListServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserListServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserListServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested user list.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.UserList> getUserList(
        com.google.ads.googleads.v1.services.GetUserListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserListMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or updates user lists. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.MutateUserListsResponse> mutateUserLists(
        com.google.ads.googleads.v1.services.MutateUserListsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateUserListsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_LIST = 0;
  private static final int METHODID_MUTATE_USER_LISTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserListServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserListServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_LIST:
          serviceImpl.getUserList((com.google.ads.googleads.v1.services.GetUserListRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.UserList>) responseObserver);
          break;
        case METHODID_MUTATE_USER_LISTS:
          serviceImpl.mutateUserLists((com.google.ads.googleads.v1.services.MutateUserListsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateUserListsResponse>) responseObserver);
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

  private static abstract class UserListServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserListServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.UserListServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserListService");
    }
  }

  private static final class UserListServiceFileDescriptorSupplier
      extends UserListServiceBaseDescriptorSupplier {
    UserListServiceFileDescriptorSupplier() {}
  }

  private static final class UserListServiceMethodDescriptorSupplier
      extends UserListServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserListServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserListServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserListServiceFileDescriptorSupplier())
              .addMethod(getGetUserListMethodHelper())
              .addMethod(getMutateUserListsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
