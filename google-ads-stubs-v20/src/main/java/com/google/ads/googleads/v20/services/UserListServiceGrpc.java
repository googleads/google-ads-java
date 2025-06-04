package com.google.ads.googleads.v20.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage user lists.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v20/services/user_list_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserListServiceGrpc {

  private UserListServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v20.services.UserListService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateUserListsRequest,
      com.google.ads.googleads.v20.services.MutateUserListsResponse> getMutateUserListsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateUserLists",
      requestType = com.google.ads.googleads.v20.services.MutateUserListsRequest.class,
      responseType = com.google.ads.googleads.v20.services.MutateUserListsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateUserListsRequest,
      com.google.ads.googleads.v20.services.MutateUserListsResponse> getMutateUserListsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateUserListsRequest, com.google.ads.googleads.v20.services.MutateUserListsResponse> getMutateUserListsMethod;
    if ((getMutateUserListsMethod = UserListServiceGrpc.getMutateUserListsMethod) == null) {
      synchronized (UserListServiceGrpc.class) {
        if ((getMutateUserListsMethod = UserListServiceGrpc.getMutateUserListsMethod) == null) {
          UserListServiceGrpc.getMutateUserListsMethod = getMutateUserListsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v20.services.MutateUserListsRequest, com.google.ads.googleads.v20.services.MutateUserListsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateUserLists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateUserListsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateUserListsResponse.getDefaultInstance()))
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
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static UserListServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserListServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserListServiceBlockingV2Stub>() {
        @java.lang.Override
        public UserListServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserListServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return UserListServiceBlockingV2Stub.newStub(factory, channel);
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
  public interface AsyncService {

    /**
     * <pre>
     * Creates or updates user lists. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotAllowlistedError]()
     *   [NotEmptyError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UserListError]()
     * </pre>
     */
    default void mutateUserLists(com.google.ads.googleads.v20.services.MutateUserListsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateUserListsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateUserListsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserListService.
   * <pre>
   * Service to manage user lists.
   * </pre>
   */
  public static abstract class UserListServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserListServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserListService.
   * <pre>
   * Service to manage user lists.
   * </pre>
   */
  public static final class UserListServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserListServiceStub> {
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
     * Creates or updates user lists. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotAllowlistedError]()
     *   [NotEmptyError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UserListError]()
     * </pre>
     */
    public void mutateUserLists(com.google.ads.googleads.v20.services.MutateUserListsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateUserListsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateUserListsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserListService.
   * <pre>
   * Service to manage user lists.
   * </pre>
   */
  public static final class UserListServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<UserListServiceBlockingV2Stub> {
    private UserListServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserListServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserListServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates user lists. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotAllowlistedError]()
     *   [NotEmptyError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UserListError]()
     * </pre>
     */
    public com.google.ads.googleads.v20.services.MutateUserListsResponse mutateUserLists(com.google.ads.googleads.v20.services.MutateUserListsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateUserListsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service UserListService.
   * <pre>
   * Service to manage user lists.
   * </pre>
   */
  public static final class UserListServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserListServiceBlockingStub> {
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
     * Creates or updates user lists. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotAllowlistedError]()
     *   [NotEmptyError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UserListError]()
     * </pre>
     */
    public com.google.ads.googleads.v20.services.MutateUserListsResponse mutateUserLists(com.google.ads.googleads.v20.services.MutateUserListsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateUserListsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserListService.
   * <pre>
   * Service to manage user lists.
   * </pre>
   */
  public static final class UserListServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserListServiceFutureStub> {
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
     * Creates or updates user lists. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotAllowlistedError]()
     *   [NotEmptyError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UserListError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v20.services.MutateUserListsResponse> mutateUserLists(
        com.google.ads.googleads.v20.services.MutateUserListsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateUserListsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_USER_LISTS = 0;

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
        case METHODID_MUTATE_USER_LISTS:
          serviceImpl.mutateUserLists((com.google.ads.googleads.v20.services.MutateUserListsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateUserListsResponse>) responseObserver);
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
          getMutateUserListsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v20.services.MutateUserListsRequest,
              com.google.ads.googleads.v20.services.MutateUserListsResponse>(
                service, METHODID_MUTATE_USER_LISTS)))
        .build();
  }

  private static abstract class UserListServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserListServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v20.services.UserListServiceProto.getDescriptor();
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
    private final java.lang.String methodName;

    UserListServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getMutateUserListsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
