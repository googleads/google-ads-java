package com.google.ads.googleads.v3.services;

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
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v3/services/user_list_service.proto")
public final class UserListServiceGrpc {

  private UserListServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.UserListService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetUserListRequest,
      com.google.ads.googleads.v3.resources.UserList> getGetUserListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserList",
      requestType = com.google.ads.googleads.v3.services.GetUserListRequest.class,
      responseType = com.google.ads.googleads.v3.resources.UserList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetUserListRequest,
      com.google.ads.googleads.v3.resources.UserList> getGetUserListMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetUserListRequest, com.google.ads.googleads.v3.resources.UserList> getGetUserListMethod;
    if ((getGetUserListMethod = UserListServiceGrpc.getGetUserListMethod) == null) {
      synchronized (UserListServiceGrpc.class) {
        if ((getGetUserListMethod = UserListServiceGrpc.getGetUserListMethod) == null) {
          UserListServiceGrpc.getGetUserListMethod = getGetUserListMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetUserListRequest, com.google.ads.googleads.v3.resources.UserList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetUserListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.UserList.getDefaultInstance()))
              .setSchemaDescriptor(new UserListServiceMethodDescriptorSupplier("GetUserList"))
              .build();
        }
      }
    }
    return getGetUserListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateUserListsRequest,
      com.google.ads.googleads.v3.services.MutateUserListsResponse> getMutateUserListsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateUserLists",
      requestType = com.google.ads.googleads.v3.services.MutateUserListsRequest.class,
      responseType = com.google.ads.googleads.v3.services.MutateUserListsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateUserListsRequest,
      com.google.ads.googleads.v3.services.MutateUserListsResponse> getMutateUserListsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateUserListsRequest, com.google.ads.googleads.v3.services.MutateUserListsResponse> getMutateUserListsMethod;
    if ((getMutateUserListsMethod = UserListServiceGrpc.getMutateUserListsMethod) == null) {
      synchronized (UserListServiceGrpc.class) {
        if ((getMutateUserListsMethod = UserListServiceGrpc.getMutateUserListsMethod) == null) {
          UserListServiceGrpc.getMutateUserListsMethod = getMutateUserListsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.MutateUserListsRequest, com.google.ads.googleads.v3.services.MutateUserListsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateUserLists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateUserListsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateUserListsResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<UserListServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserListServiceStub>() {
        @java.lang.Override
        public UserListServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserListServiceStub(channel, callOptions);
        }
      };
    return UserListServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserListServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserListServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserListServiceBlockingStub>() {
        @java.lang.Override
        public UserListServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserListServiceBlockingStub(channel, callOptions);
        }
      };
    return UserListServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserListServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserListServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserListServiceFutureStub>() {
        @java.lang.Override
        public UserListServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserListServiceFutureStub(channel, callOptions);
        }
      };
    return UserListServiceFutureStub.newStub(factory, channel);
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
    public void getUserList(com.google.ads.googleads.v3.services.GetUserListRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.UserList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or updates user lists. Operation statuses are returned.
     * </pre>
     */
    public void mutateUserLists(com.google.ads.googleads.v3.services.MutateUserListsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateUserListsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateUserListsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetUserListRequest,
                com.google.ads.googleads.v3.resources.UserList>(
                  this, METHODID_GET_USER_LIST)))
          .addMethod(
            getMutateUserListsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.MutateUserListsRequest,
                com.google.ads.googleads.v3.services.MutateUserListsResponse>(
                  this, METHODID_MUTATE_USER_LISTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage user lists.
   * </pre>
   */
  public static final class UserListServiceStub extends io.grpc.stub.AbstractAsyncStub<UserListServiceStub> {
    private UserListServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserListServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserListServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested user list.
     * </pre>
     */
    public void getUserList(com.google.ads.googleads.v3.services.GetUserListRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.UserList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or updates user lists. Operation statuses are returned.
     * </pre>
     */
    public void mutateUserLists(com.google.ads.googleads.v3.services.MutateUserListsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateUserListsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateUserListsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage user lists.
   * </pre>
   */
  public static final class UserListServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserListServiceBlockingStub> {
    private UserListServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserListServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserListServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested user list.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.UserList getUserList(com.google.ads.googleads.v3.services.GetUserListRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or updates user lists. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.MutateUserListsResponse mutateUserLists(com.google.ads.googleads.v3.services.MutateUserListsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateUserListsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage user lists.
   * </pre>
   */
  public static final class UserListServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserListServiceFutureStub> {
    private UserListServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserListServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserListServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested user list.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.UserList> getUserList(
        com.google.ads.googleads.v3.services.GetUserListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or updates user lists. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.MutateUserListsResponse> mutateUserLists(
        com.google.ads.googleads.v3.services.MutateUserListsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateUserListsMethod(), getCallOptions()), request);
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
          serviceImpl.getUserList((com.google.ads.googleads.v3.services.GetUserListRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.UserList>) responseObserver);
          break;
        case METHODID_MUTATE_USER_LISTS:
          serviceImpl.mutateUserLists((com.google.ads.googleads.v3.services.MutateUserListsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateUserListsResponse>) responseObserver);
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
      return com.google.ads.googleads.v3.services.UserListServiceProto.getDescriptor();
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
              .addMethod(getGetUserListMethod())
              .addMethod(getMutateUserListsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
