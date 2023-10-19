package com.google.ads.googleads.v15.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to configure campaign lifecycle goals.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v15/services/campaign_lifecycle_goal_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignLifecycleGoalServiceGrpc {

  private CampaignLifecycleGoalServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v15.services.CampaignLifecycleGoalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsRequest,
      com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsResponse> getConfigureCampaignLifecycleGoalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureCampaignLifecycleGoals",
      requestType = com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsRequest.class,
      responseType = com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsRequest,
      com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsResponse> getConfigureCampaignLifecycleGoalsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsRequest, com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsResponse> getConfigureCampaignLifecycleGoalsMethod;
    if ((getConfigureCampaignLifecycleGoalsMethod = CampaignLifecycleGoalServiceGrpc.getConfigureCampaignLifecycleGoalsMethod) == null) {
      synchronized (CampaignLifecycleGoalServiceGrpc.class) {
        if ((getConfigureCampaignLifecycleGoalsMethod = CampaignLifecycleGoalServiceGrpc.getConfigureCampaignLifecycleGoalsMethod) == null) {
          CampaignLifecycleGoalServiceGrpc.getConfigureCampaignLifecycleGoalsMethod = getConfigureCampaignLifecycleGoalsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsRequest, com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureCampaignLifecycleGoals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignLifecycleGoalServiceMethodDescriptorSupplier("ConfigureCampaignLifecycleGoals"))
              .build();
        }
      }
    }
    return getConfigureCampaignLifecycleGoalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignLifecycleGoalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignLifecycleGoalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignLifecycleGoalServiceStub>() {
        @java.lang.Override
        public CampaignLifecycleGoalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignLifecycleGoalServiceStub(channel, callOptions);
        }
      };
    return CampaignLifecycleGoalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignLifecycleGoalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignLifecycleGoalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignLifecycleGoalServiceBlockingStub>() {
        @java.lang.Override
        public CampaignLifecycleGoalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignLifecycleGoalServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignLifecycleGoalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignLifecycleGoalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignLifecycleGoalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignLifecycleGoalServiceFutureStub>() {
        @java.lang.Override
        public CampaignLifecycleGoalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignLifecycleGoalServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignLifecycleGoalServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to configure campaign lifecycle goals.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Process the given campaign lifecycle configurations.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignLifecycleGoalConfigError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void configureCampaignLifecycleGoals(com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureCampaignLifecycleGoalsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CampaignLifecycleGoalService.
   * <pre>
   * Service to configure campaign lifecycle goals.
   * </pre>
   */
  public static abstract class CampaignLifecycleGoalServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CampaignLifecycleGoalServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CampaignLifecycleGoalService.
   * <pre>
   * Service to configure campaign lifecycle goals.
   * </pre>
   */
  public static final class CampaignLifecycleGoalServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CampaignLifecycleGoalServiceStub> {
    private CampaignLifecycleGoalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignLifecycleGoalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignLifecycleGoalServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Process the given campaign lifecycle configurations.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignLifecycleGoalConfigError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void configureCampaignLifecycleGoals(com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureCampaignLifecycleGoalsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CampaignLifecycleGoalService.
   * <pre>
   * Service to configure campaign lifecycle goals.
   * </pre>
   */
  public static final class CampaignLifecycleGoalServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CampaignLifecycleGoalServiceBlockingStub> {
    private CampaignLifecycleGoalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignLifecycleGoalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignLifecycleGoalServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Process the given campaign lifecycle configurations.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignLifecycleGoalConfigError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsResponse configureCampaignLifecycleGoals(com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureCampaignLifecycleGoalsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CampaignLifecycleGoalService.
   * <pre>
   * Service to configure campaign lifecycle goals.
   * </pre>
   */
  public static final class CampaignLifecycleGoalServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CampaignLifecycleGoalServiceFutureStub> {
    private CampaignLifecycleGoalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignLifecycleGoalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignLifecycleGoalServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Process the given campaign lifecycle configurations.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignLifecycleGoalConfigError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsResponse> configureCampaignLifecycleGoals(
        com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureCampaignLifecycleGoalsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONFIGURE_CAMPAIGN_LIFECYCLE_GOALS = 0;

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
        case METHODID_CONFIGURE_CAMPAIGN_LIFECYCLE_GOALS:
          serviceImpl.configureCampaignLifecycleGoals((com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsResponse>) responseObserver);
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
          getConfigureCampaignLifecycleGoalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsRequest,
              com.google.ads.googleads.v15.services.ConfigureCampaignLifecycleGoalsResponse>(
                service, METHODID_CONFIGURE_CAMPAIGN_LIFECYCLE_GOALS)))
        .build();
  }

  private static abstract class CampaignLifecycleGoalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignLifecycleGoalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v15.services.CampaignLifecycleGoalServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignLifecycleGoalService");
    }
  }

  private static final class CampaignLifecycleGoalServiceFileDescriptorSupplier
      extends CampaignLifecycleGoalServiceBaseDescriptorSupplier {
    CampaignLifecycleGoalServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignLifecycleGoalServiceMethodDescriptorSupplier
      extends CampaignLifecycleGoalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CampaignLifecycleGoalServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CampaignLifecycleGoalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignLifecycleGoalServiceFileDescriptorSupplier())
              .addMethod(getConfigureCampaignLifecycleGoalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
