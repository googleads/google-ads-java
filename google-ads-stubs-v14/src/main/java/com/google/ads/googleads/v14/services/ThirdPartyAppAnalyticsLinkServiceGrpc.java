package com.google.ads.googleads.v14.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service allows management of links between Google Ads and third party
 * app analytics.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v14/services/third_party_app_analytics_link_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ThirdPartyAppAnalyticsLinkServiceGrpc {

  private ThirdPartyAppAnalyticsLinkServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v14.services.ThirdPartyAppAnalyticsLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.RegenerateShareableLinkIdRequest,
      com.google.ads.googleads.v14.services.RegenerateShareableLinkIdResponse> getRegenerateShareableLinkIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegenerateShareableLinkId",
      requestType = com.google.ads.googleads.v14.services.RegenerateShareableLinkIdRequest.class,
      responseType = com.google.ads.googleads.v14.services.RegenerateShareableLinkIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.RegenerateShareableLinkIdRequest,
      com.google.ads.googleads.v14.services.RegenerateShareableLinkIdResponse> getRegenerateShareableLinkIdMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.RegenerateShareableLinkIdRequest, com.google.ads.googleads.v14.services.RegenerateShareableLinkIdResponse> getRegenerateShareableLinkIdMethod;
    if ((getRegenerateShareableLinkIdMethod = ThirdPartyAppAnalyticsLinkServiceGrpc.getRegenerateShareableLinkIdMethod) == null) {
      synchronized (ThirdPartyAppAnalyticsLinkServiceGrpc.class) {
        if ((getRegenerateShareableLinkIdMethod = ThirdPartyAppAnalyticsLinkServiceGrpc.getRegenerateShareableLinkIdMethod) == null) {
          ThirdPartyAppAnalyticsLinkServiceGrpc.getRegenerateShareableLinkIdMethod = getRegenerateShareableLinkIdMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v14.services.RegenerateShareableLinkIdRequest, com.google.ads.googleads.v14.services.RegenerateShareableLinkIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegenerateShareableLinkId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.RegenerateShareableLinkIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.RegenerateShareableLinkIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ThirdPartyAppAnalyticsLinkServiceMethodDescriptorSupplier("RegenerateShareableLinkId"))
              .build();
        }
      }
    }
    return getRegenerateShareableLinkIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ThirdPartyAppAnalyticsLinkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThirdPartyAppAnalyticsLinkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThirdPartyAppAnalyticsLinkServiceStub>() {
        @java.lang.Override
        public ThirdPartyAppAnalyticsLinkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThirdPartyAppAnalyticsLinkServiceStub(channel, callOptions);
        }
      };
    return ThirdPartyAppAnalyticsLinkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ThirdPartyAppAnalyticsLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThirdPartyAppAnalyticsLinkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThirdPartyAppAnalyticsLinkServiceBlockingStub>() {
        @java.lang.Override
        public ThirdPartyAppAnalyticsLinkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThirdPartyAppAnalyticsLinkServiceBlockingStub(channel, callOptions);
        }
      };
    return ThirdPartyAppAnalyticsLinkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ThirdPartyAppAnalyticsLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThirdPartyAppAnalyticsLinkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThirdPartyAppAnalyticsLinkServiceFutureStub>() {
        @java.lang.Override
        public ThirdPartyAppAnalyticsLinkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThirdPartyAppAnalyticsLinkServiceFutureStub(channel, callOptions);
        }
      };
    return ThirdPartyAppAnalyticsLinkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads and third party
   * app analytics.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Regenerate ThirdPartyAppAnalyticsLink.shareable_link_id that should be
     * provided to the third party when setting up app analytics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void regenerateShareableLinkId(com.google.ads.googleads.v14.services.RegenerateShareableLinkIdRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.RegenerateShareableLinkIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegenerateShareableLinkIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ThirdPartyAppAnalyticsLinkService.
   * <pre>
   * This service allows management of links between Google Ads and third party
   * app analytics.
   * </pre>
   */
  public static abstract class ThirdPartyAppAnalyticsLinkServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ThirdPartyAppAnalyticsLinkServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ThirdPartyAppAnalyticsLinkService.
   * <pre>
   * This service allows management of links between Google Ads and third party
   * app analytics.
   * </pre>
   */
  public static final class ThirdPartyAppAnalyticsLinkServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ThirdPartyAppAnalyticsLinkServiceStub> {
    private ThirdPartyAppAnalyticsLinkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThirdPartyAppAnalyticsLinkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThirdPartyAppAnalyticsLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Regenerate ThirdPartyAppAnalyticsLink.shareable_link_id that should be
     * provided to the third party when setting up app analytics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void regenerateShareableLinkId(com.google.ads.googleads.v14.services.RegenerateShareableLinkIdRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.RegenerateShareableLinkIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegenerateShareableLinkIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ThirdPartyAppAnalyticsLinkService.
   * <pre>
   * This service allows management of links between Google Ads and third party
   * app analytics.
   * </pre>
   */
  public static final class ThirdPartyAppAnalyticsLinkServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ThirdPartyAppAnalyticsLinkServiceBlockingStub> {
    private ThirdPartyAppAnalyticsLinkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThirdPartyAppAnalyticsLinkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThirdPartyAppAnalyticsLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Regenerate ThirdPartyAppAnalyticsLink.shareable_link_id that should be
     * provided to the third party when setting up app analytics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v14.services.RegenerateShareableLinkIdResponse regenerateShareableLinkId(com.google.ads.googleads.v14.services.RegenerateShareableLinkIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegenerateShareableLinkIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ThirdPartyAppAnalyticsLinkService.
   * <pre>
   * This service allows management of links between Google Ads and third party
   * app analytics.
   * </pre>
   */
  public static final class ThirdPartyAppAnalyticsLinkServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ThirdPartyAppAnalyticsLinkServiceFutureStub> {
    private ThirdPartyAppAnalyticsLinkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThirdPartyAppAnalyticsLinkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThirdPartyAppAnalyticsLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Regenerate ThirdPartyAppAnalyticsLink.shareable_link_id that should be
     * provided to the third party when setting up app analytics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v14.services.RegenerateShareableLinkIdResponse> regenerateShareableLinkId(
        com.google.ads.googleads.v14.services.RegenerateShareableLinkIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegenerateShareableLinkIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGENERATE_SHAREABLE_LINK_ID = 0;

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
        case METHODID_REGENERATE_SHAREABLE_LINK_ID:
          serviceImpl.regenerateShareableLinkId((com.google.ads.googleads.v14.services.RegenerateShareableLinkIdRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.RegenerateShareableLinkIdResponse>) responseObserver);
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
          getRegenerateShareableLinkIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v14.services.RegenerateShareableLinkIdRequest,
              com.google.ads.googleads.v14.services.RegenerateShareableLinkIdResponse>(
                service, METHODID_REGENERATE_SHAREABLE_LINK_ID)))
        .build();
  }

  private static abstract class ThirdPartyAppAnalyticsLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ThirdPartyAppAnalyticsLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v14.services.ThirdPartyAppAnalyticsLinkServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ThirdPartyAppAnalyticsLinkService");
    }
  }

  private static final class ThirdPartyAppAnalyticsLinkServiceFileDescriptorSupplier
      extends ThirdPartyAppAnalyticsLinkServiceBaseDescriptorSupplier {
    ThirdPartyAppAnalyticsLinkServiceFileDescriptorSupplier() {}
  }

  private static final class ThirdPartyAppAnalyticsLinkServiceMethodDescriptorSupplier
      extends ThirdPartyAppAnalyticsLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ThirdPartyAppAnalyticsLinkServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ThirdPartyAppAnalyticsLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ThirdPartyAppAnalyticsLinkServiceFileDescriptorSupplier())
              .addMethod(getRegenerateShareableLinkIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
