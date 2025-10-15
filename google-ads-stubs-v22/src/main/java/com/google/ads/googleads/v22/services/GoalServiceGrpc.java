package com.google.ads.googleads.v22.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage goals.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v22/services/goal_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GoalServiceGrpc {

  private GoalServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v22.services.GoalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.MutateGoalsRequest,
      com.google.ads.googleads.v22.services.MutateGoalsResponse> getMutateGoalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateGoals",
      requestType = com.google.ads.googleads.v22.services.MutateGoalsRequest.class,
      responseType = com.google.ads.googleads.v22.services.MutateGoalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.MutateGoalsRequest,
      com.google.ads.googleads.v22.services.MutateGoalsResponse> getMutateGoalsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.MutateGoalsRequest, com.google.ads.googleads.v22.services.MutateGoalsResponse> getMutateGoalsMethod;
    if ((getMutateGoalsMethod = GoalServiceGrpc.getMutateGoalsMethod) == null) {
      synchronized (GoalServiceGrpc.class) {
        if ((getMutateGoalsMethod = GoalServiceGrpc.getMutateGoalsMethod) == null) {
          GoalServiceGrpc.getMutateGoalsMethod = getMutateGoalsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v22.services.MutateGoalsRequest, com.google.ads.googleads.v22.services.MutateGoalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateGoals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.MutateGoalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.MutateGoalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GoalServiceMethodDescriptorSupplier("MutateGoals"))
              .build();
        }
      }
    }
    return getMutateGoalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GoalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoalServiceStub>() {
        @java.lang.Override
        public GoalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoalServiceStub(channel, callOptions);
        }
      };
    return GoalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static GoalServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoalServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoalServiceBlockingV2Stub>() {
        @java.lang.Override
        public GoalServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoalServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return GoalServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GoalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoalServiceBlockingStub>() {
        @java.lang.Override
        public GoalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoalServiceBlockingStub(channel, callOptions);
        }
      };
    return GoalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GoalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoalServiceFutureStub>() {
        @java.lang.Override
        public GoalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoalServiceFutureStub(channel, callOptions);
        }
      };
    return GoalServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage goals.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create or update goals.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [GoalError]()
     *   [GoalServicesError]()
     * </pre>
     */
    default void mutateGoals(com.google.ads.googleads.v22.services.MutateGoalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.MutateGoalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateGoalsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GoalService.
   * <pre>
   * Service to manage goals.
   * </pre>
   */
  public static abstract class GoalServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GoalServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GoalService.
   * <pre>
   * Service to manage goals.
   * </pre>
   */
  public static final class GoalServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GoalServiceStub> {
    private GoalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoalServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create or update goals.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [GoalError]()
     *   [GoalServicesError]()
     * </pre>
     */
    public void mutateGoals(com.google.ads.googleads.v22.services.MutateGoalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.MutateGoalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateGoalsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GoalService.
   * <pre>
   * Service to manage goals.
   * </pre>
   */
  public static final class GoalServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<GoalServiceBlockingV2Stub> {
    private GoalServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoalServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoalServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Create or update goals.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [GoalError]()
     *   [GoalServicesError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.MutateGoalsResponse mutateGoals(com.google.ads.googleads.v22.services.MutateGoalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateGoalsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service GoalService.
   * <pre>
   * Service to manage goals.
   * </pre>
   */
  public static final class GoalServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GoalServiceBlockingStub> {
    private GoalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoalServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create or update goals.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [GoalError]()
     *   [GoalServicesError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.MutateGoalsResponse mutateGoals(com.google.ads.googleads.v22.services.MutateGoalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateGoalsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GoalService.
   * <pre>
   * Service to manage goals.
   * </pre>
   */
  public static final class GoalServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GoalServiceFutureStub> {
    private GoalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoalServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create or update goals.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [GoalError]()
     *   [GoalServicesError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v22.services.MutateGoalsResponse> mutateGoals(
        com.google.ads.googleads.v22.services.MutateGoalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateGoalsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_GOALS = 0;

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
        case METHODID_MUTATE_GOALS:
          serviceImpl.mutateGoals((com.google.ads.googleads.v22.services.MutateGoalsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.MutateGoalsResponse>) responseObserver);
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
          getMutateGoalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v22.services.MutateGoalsRequest,
              com.google.ads.googleads.v22.services.MutateGoalsResponse>(
                service, METHODID_MUTATE_GOALS)))
        .build();
  }

  private static abstract class GoalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GoalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v22.services.GoalServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GoalService");
    }
  }

  private static final class GoalServiceFileDescriptorSupplier
      extends GoalServiceBaseDescriptorSupplier {
    GoalServiceFileDescriptorSupplier() {}
  }

  private static final class GoalServiceMethodDescriptorSupplier
      extends GoalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GoalServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GoalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GoalServiceFileDescriptorSupplier())
              .addMethod(getMutateGoalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
