package com.google.ads.googleads.v22.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage campaign goal configs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v22/services/campaign_goal_config_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignGoalConfigServiceGrpc {

  private CampaignGoalConfigServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v22.services.CampaignGoalConfigService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest,
      com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse> getMutateCampaignGoalConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignGoalConfigs",
      requestType = com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest.class,
      responseType = com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest,
      com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse> getMutateCampaignGoalConfigsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest, com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse> getMutateCampaignGoalConfigsMethod;
    if ((getMutateCampaignGoalConfigsMethod = CampaignGoalConfigServiceGrpc.getMutateCampaignGoalConfigsMethod) == null) {
      synchronized (CampaignGoalConfigServiceGrpc.class) {
        if ((getMutateCampaignGoalConfigsMethod = CampaignGoalConfigServiceGrpc.getMutateCampaignGoalConfigsMethod) == null) {
          CampaignGoalConfigServiceGrpc.getMutateCampaignGoalConfigsMethod = getMutateCampaignGoalConfigsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest, com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignGoalConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignGoalConfigServiceMethodDescriptorSupplier("MutateCampaignGoalConfigs"))
              .build();
        }
      }
    }
    return getMutateCampaignGoalConfigsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignGoalConfigServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignGoalConfigServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignGoalConfigServiceStub>() {
        @java.lang.Override
        public CampaignGoalConfigServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignGoalConfigServiceStub(channel, callOptions);
        }
      };
    return CampaignGoalConfigServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CampaignGoalConfigServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignGoalConfigServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignGoalConfigServiceBlockingV2Stub>() {
        @java.lang.Override
        public CampaignGoalConfigServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignGoalConfigServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CampaignGoalConfigServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignGoalConfigServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignGoalConfigServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignGoalConfigServiceBlockingStub>() {
        @java.lang.Override
        public CampaignGoalConfigServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignGoalConfigServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignGoalConfigServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignGoalConfigServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignGoalConfigServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignGoalConfigServiceFutureStub>() {
        @java.lang.Override
        public CampaignGoalConfigServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignGoalConfigServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignGoalConfigServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaign goal configs.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create or update campaign goal configs.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [CampaignGoalConfigError]()
     *   [GoalServicesError]()
     * </pre>
     */
    default void mutateCampaignGoalConfigs(com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCampaignGoalConfigsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CampaignGoalConfigService.
   * <pre>
   * Service to manage campaign goal configs.
   * </pre>
   */
  public static abstract class CampaignGoalConfigServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CampaignGoalConfigServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CampaignGoalConfigService.
   * <pre>
   * Service to manage campaign goal configs.
   * </pre>
   */
  public static final class CampaignGoalConfigServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CampaignGoalConfigServiceStub> {
    private CampaignGoalConfigServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignGoalConfigServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignGoalConfigServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create or update campaign goal configs.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [CampaignGoalConfigError]()
     *   [GoalServicesError]()
     * </pre>
     */
    public void mutateCampaignGoalConfigs(com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCampaignGoalConfigsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CampaignGoalConfigService.
   * <pre>
   * Service to manage campaign goal configs.
   * </pre>
   */
  public static final class CampaignGoalConfigServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CampaignGoalConfigServiceBlockingV2Stub> {
    private CampaignGoalConfigServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignGoalConfigServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignGoalConfigServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Create or update campaign goal configs.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [CampaignGoalConfigError]()
     *   [GoalServicesError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse mutateCampaignGoalConfigs(com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignGoalConfigsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CampaignGoalConfigService.
   * <pre>
   * Service to manage campaign goal configs.
   * </pre>
   */
  public static final class CampaignGoalConfigServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CampaignGoalConfigServiceBlockingStub> {
    private CampaignGoalConfigServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignGoalConfigServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignGoalConfigServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create or update campaign goal configs.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [CampaignGoalConfigError]()
     *   [GoalServicesError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse mutateCampaignGoalConfigs(com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignGoalConfigsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CampaignGoalConfigService.
   * <pre>
   * Service to manage campaign goal configs.
   * </pre>
   */
  public static final class CampaignGoalConfigServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CampaignGoalConfigServiceFutureStub> {
    private CampaignGoalConfigServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignGoalConfigServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignGoalConfigServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create or update campaign goal configs.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [CampaignGoalConfigError]()
     *   [GoalServicesError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse> mutateCampaignGoalConfigs(
        com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCampaignGoalConfigsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CAMPAIGN_GOAL_CONFIGS = 0;

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
        case METHODID_MUTATE_CAMPAIGN_GOAL_CONFIGS:
          serviceImpl.mutateCampaignGoalConfigs((com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse>) responseObserver);
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
          getMutateCampaignGoalConfigsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsRequest,
              com.google.ads.googleads.v22.services.MutateCampaignGoalConfigsResponse>(
                service, METHODID_MUTATE_CAMPAIGN_GOAL_CONFIGS)))
        .build();
  }

  private static abstract class CampaignGoalConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignGoalConfigServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v22.services.CampaignGoalConfigServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignGoalConfigService");
    }
  }

  private static final class CampaignGoalConfigServiceFileDescriptorSupplier
      extends CampaignGoalConfigServiceBaseDescriptorSupplier {
    CampaignGoalConfigServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignGoalConfigServiceMethodDescriptorSupplier
      extends CampaignGoalConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CampaignGoalConfigServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CampaignGoalConfigServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignGoalConfigServiceFileDescriptorSupplier())
              .addMethod(getMutateCampaignGoalConfigsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
