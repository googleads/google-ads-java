package com.google.ads.googleads.v20.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage experiment arms.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v20/services/experiment_arm_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExperimentArmServiceGrpc {

  private ExperimentArmServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v20.services.ExperimentArmService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateExperimentArmsRequest,
      com.google.ads.googleads.v20.services.MutateExperimentArmsResponse> getMutateExperimentArmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateExperimentArms",
      requestType = com.google.ads.googleads.v20.services.MutateExperimentArmsRequest.class,
      responseType = com.google.ads.googleads.v20.services.MutateExperimentArmsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateExperimentArmsRequest,
      com.google.ads.googleads.v20.services.MutateExperimentArmsResponse> getMutateExperimentArmsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateExperimentArmsRequest, com.google.ads.googleads.v20.services.MutateExperimentArmsResponse> getMutateExperimentArmsMethod;
    if ((getMutateExperimentArmsMethod = ExperimentArmServiceGrpc.getMutateExperimentArmsMethod) == null) {
      synchronized (ExperimentArmServiceGrpc.class) {
        if ((getMutateExperimentArmsMethod = ExperimentArmServiceGrpc.getMutateExperimentArmsMethod) == null) {
          ExperimentArmServiceGrpc.getMutateExperimentArmsMethod = getMutateExperimentArmsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v20.services.MutateExperimentArmsRequest, com.google.ads.googleads.v20.services.MutateExperimentArmsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateExperimentArms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateExperimentArmsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateExperimentArmsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExperimentArmServiceMethodDescriptorSupplier("MutateExperimentArms"))
              .build();
        }
      }
    }
    return getMutateExperimentArmsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExperimentArmServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExperimentArmServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExperimentArmServiceStub>() {
        @java.lang.Override
        public ExperimentArmServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExperimentArmServiceStub(channel, callOptions);
        }
      };
    return ExperimentArmServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ExperimentArmServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExperimentArmServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExperimentArmServiceBlockingV2Stub>() {
        @java.lang.Override
        public ExperimentArmServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExperimentArmServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ExperimentArmServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExperimentArmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExperimentArmServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExperimentArmServiceBlockingStub>() {
        @java.lang.Override
        public ExperimentArmServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExperimentArmServiceBlockingStub(channel, callOptions);
        }
      };
    return ExperimentArmServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExperimentArmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExperimentArmServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExperimentArmServiceFutureStub>() {
        @java.lang.Override
        public ExperimentArmServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExperimentArmServiceFutureStub(channel, callOptions);
        }
      };
    return ExperimentArmServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage experiment arms.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes experiment arms. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentArmError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateExperimentArms(com.google.ads.googleads.v20.services.MutateExperimentArmsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateExperimentArmsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateExperimentArmsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExperimentArmService.
   * <pre>
   * Service to manage experiment arms.
   * </pre>
   */
  public static abstract class ExperimentArmServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExperimentArmServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExperimentArmService.
   * <pre>
   * Service to manage experiment arms.
   * </pre>
   */
  public static final class ExperimentArmServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ExperimentArmServiceStub> {
    private ExperimentArmServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExperimentArmServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExperimentArmServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes experiment arms. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentArmError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateExperimentArms(com.google.ads.googleads.v20.services.MutateExperimentArmsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateExperimentArmsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateExperimentArmsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExperimentArmService.
   * <pre>
   * Service to manage experiment arms.
   * </pre>
   */
  public static final class ExperimentArmServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ExperimentArmServiceBlockingV2Stub> {
    private ExperimentArmServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExperimentArmServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExperimentArmServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes experiment arms. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentArmError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v20.services.MutateExperimentArmsResponse mutateExperimentArms(com.google.ads.googleads.v20.services.MutateExperimentArmsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateExperimentArmsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ExperimentArmService.
   * <pre>
   * Service to manage experiment arms.
   * </pre>
   */
  public static final class ExperimentArmServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExperimentArmServiceBlockingStub> {
    private ExperimentArmServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExperimentArmServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExperimentArmServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes experiment arms. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentArmError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v20.services.MutateExperimentArmsResponse mutateExperimentArms(com.google.ads.googleads.v20.services.MutateExperimentArmsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateExperimentArmsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExperimentArmService.
   * <pre>
   * Service to manage experiment arms.
   * </pre>
   */
  public static final class ExperimentArmServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExperimentArmServiceFutureStub> {
    private ExperimentArmServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExperimentArmServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExperimentArmServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes experiment arms. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ExperimentArmError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v20.services.MutateExperimentArmsResponse> mutateExperimentArms(
        com.google.ads.googleads.v20.services.MutateExperimentArmsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateExperimentArmsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_EXPERIMENT_ARMS = 0;

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
        case METHODID_MUTATE_EXPERIMENT_ARMS:
          serviceImpl.mutateExperimentArms((com.google.ads.googleads.v20.services.MutateExperimentArmsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateExperimentArmsResponse>) responseObserver);
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
          getMutateExperimentArmsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v20.services.MutateExperimentArmsRequest,
              com.google.ads.googleads.v20.services.MutateExperimentArmsResponse>(
                service, METHODID_MUTATE_EXPERIMENT_ARMS)))
        .build();
  }

  private static abstract class ExperimentArmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExperimentArmServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v20.services.ExperimentArmServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExperimentArmService");
    }
  }

  private static final class ExperimentArmServiceFileDescriptorSupplier
      extends ExperimentArmServiceBaseDescriptorSupplier {
    ExperimentArmServiceFileDescriptorSupplier() {}
  }

  private static final class ExperimentArmServiceMethodDescriptorSupplier
      extends ExperimentArmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ExperimentArmServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ExperimentArmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExperimentArmServiceFileDescriptorSupplier())
              .addMethod(getMutateExperimentArmsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
