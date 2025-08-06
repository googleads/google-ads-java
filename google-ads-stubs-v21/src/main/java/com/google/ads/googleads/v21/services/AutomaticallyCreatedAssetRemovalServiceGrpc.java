package com.google.ads.googleads.v21.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to remove automatically created assets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v21/services/automatically_created_asset_removal_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AutomaticallyCreatedAssetRemovalServiceGrpc {

  private AutomaticallyCreatedAssetRemovalServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v21.services.AutomaticallyCreatedAssetRemovalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetRequest,
      com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetResponse> getRemoveCampaignAutomaticallyCreatedAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveCampaignAutomaticallyCreatedAsset",
      requestType = com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetRequest.class,
      responseType = com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetRequest,
      com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetResponse> getRemoveCampaignAutomaticallyCreatedAssetMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetRequest, com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetResponse> getRemoveCampaignAutomaticallyCreatedAssetMethod;
    if ((getRemoveCampaignAutomaticallyCreatedAssetMethod = AutomaticallyCreatedAssetRemovalServiceGrpc.getRemoveCampaignAutomaticallyCreatedAssetMethod) == null) {
      synchronized (AutomaticallyCreatedAssetRemovalServiceGrpc.class) {
        if ((getRemoveCampaignAutomaticallyCreatedAssetMethod = AutomaticallyCreatedAssetRemovalServiceGrpc.getRemoveCampaignAutomaticallyCreatedAssetMethod) == null) {
          AutomaticallyCreatedAssetRemovalServiceGrpc.getRemoveCampaignAutomaticallyCreatedAssetMethod = getRemoveCampaignAutomaticallyCreatedAssetMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetRequest, com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveCampaignAutomaticallyCreatedAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AutomaticallyCreatedAssetRemovalServiceMethodDescriptorSupplier("RemoveCampaignAutomaticallyCreatedAsset"))
              .build();
        }
      }
    }
    return getRemoveCampaignAutomaticallyCreatedAssetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AutomaticallyCreatedAssetRemovalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AutomaticallyCreatedAssetRemovalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AutomaticallyCreatedAssetRemovalServiceStub>() {
        @java.lang.Override
        public AutomaticallyCreatedAssetRemovalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AutomaticallyCreatedAssetRemovalServiceStub(channel, callOptions);
        }
      };
    return AutomaticallyCreatedAssetRemovalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AutomaticallyCreatedAssetRemovalServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AutomaticallyCreatedAssetRemovalServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AutomaticallyCreatedAssetRemovalServiceBlockingV2Stub>() {
        @java.lang.Override
        public AutomaticallyCreatedAssetRemovalServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AutomaticallyCreatedAssetRemovalServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AutomaticallyCreatedAssetRemovalServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AutomaticallyCreatedAssetRemovalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AutomaticallyCreatedAssetRemovalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AutomaticallyCreatedAssetRemovalServiceBlockingStub>() {
        @java.lang.Override
        public AutomaticallyCreatedAssetRemovalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AutomaticallyCreatedAssetRemovalServiceBlockingStub(channel, callOptions);
        }
      };
    return AutomaticallyCreatedAssetRemovalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AutomaticallyCreatedAssetRemovalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AutomaticallyCreatedAssetRemovalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AutomaticallyCreatedAssetRemovalServiceFutureStub>() {
        @java.lang.Override
        public AutomaticallyCreatedAssetRemovalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AutomaticallyCreatedAssetRemovalServiceFutureStub(channel, callOptions);
        }
      };
    return AutomaticallyCreatedAssetRemovalServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to remove automatically created assets.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Removes automatically created assets from a campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [FieldError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [PartialFailureError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void removeCampaignAutomaticallyCreatedAsset(com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveCampaignAutomaticallyCreatedAssetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AutomaticallyCreatedAssetRemovalService.
   * <pre>
   * Service to remove automatically created assets.
   * </pre>
   */
  public static abstract class AutomaticallyCreatedAssetRemovalServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AutomaticallyCreatedAssetRemovalServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AutomaticallyCreatedAssetRemovalService.
   * <pre>
   * Service to remove automatically created assets.
   * </pre>
   */
  public static final class AutomaticallyCreatedAssetRemovalServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AutomaticallyCreatedAssetRemovalServiceStub> {
    private AutomaticallyCreatedAssetRemovalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutomaticallyCreatedAssetRemovalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AutomaticallyCreatedAssetRemovalServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Removes automatically created assets from a campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [FieldError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [PartialFailureError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void removeCampaignAutomaticallyCreatedAsset(com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveCampaignAutomaticallyCreatedAssetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AutomaticallyCreatedAssetRemovalService.
   * <pre>
   * Service to remove automatically created assets.
   * </pre>
   */
  public static final class AutomaticallyCreatedAssetRemovalServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AutomaticallyCreatedAssetRemovalServiceBlockingV2Stub> {
    private AutomaticallyCreatedAssetRemovalServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutomaticallyCreatedAssetRemovalServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AutomaticallyCreatedAssetRemovalServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Removes automatically created assets from a campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [FieldError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [PartialFailureError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetResponse removeCampaignAutomaticallyCreatedAsset(com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveCampaignAutomaticallyCreatedAssetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AutomaticallyCreatedAssetRemovalService.
   * <pre>
   * Service to remove automatically created assets.
   * </pre>
   */
  public static final class AutomaticallyCreatedAssetRemovalServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AutomaticallyCreatedAssetRemovalServiceBlockingStub> {
    private AutomaticallyCreatedAssetRemovalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutomaticallyCreatedAssetRemovalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AutomaticallyCreatedAssetRemovalServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Removes automatically created assets from a campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [FieldError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [PartialFailureError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetResponse removeCampaignAutomaticallyCreatedAsset(com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveCampaignAutomaticallyCreatedAssetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AutomaticallyCreatedAssetRemovalService.
   * <pre>
   * Service to remove automatically created assets.
   * </pre>
   */
  public static final class AutomaticallyCreatedAssetRemovalServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AutomaticallyCreatedAssetRemovalServiceFutureStub> {
    private AutomaticallyCreatedAssetRemovalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutomaticallyCreatedAssetRemovalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AutomaticallyCreatedAssetRemovalServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Removes automatically created assets from a campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [FieldError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [PartialFailureError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetResponse> removeCampaignAutomaticallyCreatedAsset(
        com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveCampaignAutomaticallyCreatedAssetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REMOVE_CAMPAIGN_AUTOMATICALLY_CREATED_ASSET = 0;

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
        case METHODID_REMOVE_CAMPAIGN_AUTOMATICALLY_CREATED_ASSET:
          serviceImpl.removeCampaignAutomaticallyCreatedAsset((com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetResponse>) responseObserver);
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
          getRemoveCampaignAutomaticallyCreatedAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetRequest,
              com.google.ads.googleads.v21.services.RemoveCampaignAutomaticallyCreatedAssetResponse>(
                service, METHODID_REMOVE_CAMPAIGN_AUTOMATICALLY_CREATED_ASSET)))
        .build();
  }

  private static abstract class AutomaticallyCreatedAssetRemovalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AutomaticallyCreatedAssetRemovalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v21.services.AutomaticallyCreatedAssetRemovalServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AutomaticallyCreatedAssetRemovalService");
    }
  }

  private static final class AutomaticallyCreatedAssetRemovalServiceFileDescriptorSupplier
      extends AutomaticallyCreatedAssetRemovalServiceBaseDescriptorSupplier {
    AutomaticallyCreatedAssetRemovalServiceFileDescriptorSupplier() {}
  }

  private static final class AutomaticallyCreatedAssetRemovalServiceMethodDescriptorSupplier
      extends AutomaticallyCreatedAssetRemovalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AutomaticallyCreatedAssetRemovalServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AutomaticallyCreatedAssetRemovalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AutomaticallyCreatedAssetRemovalServiceFileDescriptorSupplier())
              .addMethod(getRemoveCampaignAutomaticallyCreatedAssetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
