package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage user list customer types.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/user_list_customer_type_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserListCustomerTypeServiceGrpc {

  private UserListCustomerTypeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.UserListCustomerTypeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateUserListCustomerTypesRequest,
      com.google.ads.googleads.v18.services.MutateUserListCustomerTypesResponse> getMutateUserListCustomerTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateUserListCustomerTypes",
      requestType = com.google.ads.googleads.v18.services.MutateUserListCustomerTypesRequest.class,
      responseType = com.google.ads.googleads.v18.services.MutateUserListCustomerTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateUserListCustomerTypesRequest,
      com.google.ads.googleads.v18.services.MutateUserListCustomerTypesResponse> getMutateUserListCustomerTypesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateUserListCustomerTypesRequest, com.google.ads.googleads.v18.services.MutateUserListCustomerTypesResponse> getMutateUserListCustomerTypesMethod;
    if ((getMutateUserListCustomerTypesMethod = UserListCustomerTypeServiceGrpc.getMutateUserListCustomerTypesMethod) == null) {
      synchronized (UserListCustomerTypeServiceGrpc.class) {
        if ((getMutateUserListCustomerTypesMethod = UserListCustomerTypeServiceGrpc.getMutateUserListCustomerTypesMethod) == null) {
          UserListCustomerTypeServiceGrpc.getMutateUserListCustomerTypesMethod = getMutateUserListCustomerTypesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.MutateUserListCustomerTypesRequest, com.google.ads.googleads.v18.services.MutateUserListCustomerTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateUserListCustomerTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateUserListCustomerTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateUserListCustomerTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserListCustomerTypeServiceMethodDescriptorSupplier("MutateUserListCustomerTypes"))
              .build();
        }
      }
    }
    return getMutateUserListCustomerTypesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserListCustomerTypeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserListCustomerTypeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserListCustomerTypeServiceStub>() {
        @java.lang.Override
        public UserListCustomerTypeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserListCustomerTypeServiceStub(channel, callOptions);
        }
      };
    return UserListCustomerTypeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserListCustomerTypeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserListCustomerTypeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserListCustomerTypeServiceBlockingStub>() {
        @java.lang.Override
        public UserListCustomerTypeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserListCustomerTypeServiceBlockingStub(channel, callOptions);
        }
      };
    return UserListCustomerTypeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserListCustomerTypeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserListCustomerTypeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserListCustomerTypeServiceFutureStub>() {
        @java.lang.Override
        public UserListCustomerTypeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserListCustomerTypeServiceFutureStub(channel, callOptions);
        }
      };
    return UserListCustomerTypeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage user list customer types.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Attach or remove user list customer types. Operation statuses
     * are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [UserListCustomerTypeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateUserListCustomerTypes(com.google.ads.googleads.v18.services.MutateUserListCustomerTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateUserListCustomerTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateUserListCustomerTypesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserListCustomerTypeService.
   * <pre>
   * Service to manage user list customer types.
   * </pre>
   */
  public static abstract class UserListCustomerTypeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserListCustomerTypeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserListCustomerTypeService.
   * <pre>
   * Service to manage user list customer types.
   * </pre>
   */
  public static final class UserListCustomerTypeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserListCustomerTypeServiceStub> {
    private UserListCustomerTypeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserListCustomerTypeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserListCustomerTypeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Attach or remove user list customer types. Operation statuses
     * are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [UserListCustomerTypeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateUserListCustomerTypes(com.google.ads.googleads.v18.services.MutateUserListCustomerTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateUserListCustomerTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateUserListCustomerTypesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserListCustomerTypeService.
   * <pre>
   * Service to manage user list customer types.
   * </pre>
   */
  public static final class UserListCustomerTypeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserListCustomerTypeServiceBlockingStub> {
    private UserListCustomerTypeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserListCustomerTypeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserListCustomerTypeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Attach or remove user list customer types. Operation statuses
     * are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [UserListCustomerTypeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateUserListCustomerTypesResponse mutateUserListCustomerTypes(com.google.ads.googleads.v18.services.MutateUserListCustomerTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateUserListCustomerTypesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserListCustomerTypeService.
   * <pre>
   * Service to manage user list customer types.
   * </pre>
   */
  public static final class UserListCustomerTypeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserListCustomerTypeServiceFutureStub> {
    private UserListCustomerTypeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserListCustomerTypeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserListCustomerTypeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Attach or remove user list customer types. Operation statuses
     * are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [UserListCustomerTypeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.MutateUserListCustomerTypesResponse> mutateUserListCustomerTypes(
        com.google.ads.googleads.v18.services.MutateUserListCustomerTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateUserListCustomerTypesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_USER_LIST_CUSTOMER_TYPES = 0;

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
        case METHODID_MUTATE_USER_LIST_CUSTOMER_TYPES:
          serviceImpl.mutateUserListCustomerTypes((com.google.ads.googleads.v18.services.MutateUserListCustomerTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateUserListCustomerTypesResponse>) responseObserver);
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
          getMutateUserListCustomerTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.MutateUserListCustomerTypesRequest,
              com.google.ads.googleads.v18.services.MutateUserListCustomerTypesResponse>(
                service, METHODID_MUTATE_USER_LIST_CUSTOMER_TYPES)))
        .build();
  }

  private static abstract class UserListCustomerTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserListCustomerTypeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.UserListCustomerTypeServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserListCustomerTypeService");
    }
  }

  private static final class UserListCustomerTypeServiceFileDescriptorSupplier
      extends UserListCustomerTypeServiceBaseDescriptorSupplier {
    UserListCustomerTypeServiceFileDescriptorSupplier() {}
  }

  private static final class UserListCustomerTypeServiceMethodDescriptorSupplier
      extends UserListCustomerTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserListCustomerTypeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserListCustomerTypeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserListCustomerTypeServiceFileDescriptorSupplier())
              .addMethod(getMutateUserListCustomerTypesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
