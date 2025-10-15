package com.google.ads.googleads.v22.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for generating new assets with generative AI.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v22/services/asset_generation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssetGenerationServiceGrpc {

  private AssetGenerationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v22.services.AssetGenerationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.GenerateTextRequest,
      com.google.ads.googleads.v22.services.GenerateTextResponse> getGenerateTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateText",
      requestType = com.google.ads.googleads.v22.services.GenerateTextRequest.class,
      responseType = com.google.ads.googleads.v22.services.GenerateTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.GenerateTextRequest,
      com.google.ads.googleads.v22.services.GenerateTextResponse> getGenerateTextMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.GenerateTextRequest, com.google.ads.googleads.v22.services.GenerateTextResponse> getGenerateTextMethod;
    if ((getGenerateTextMethod = AssetGenerationServiceGrpc.getGenerateTextMethod) == null) {
      synchronized (AssetGenerationServiceGrpc.class) {
        if ((getGenerateTextMethod = AssetGenerationServiceGrpc.getGenerateTextMethod) == null) {
          AssetGenerationServiceGrpc.getGenerateTextMethod = getGenerateTextMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v22.services.GenerateTextRequest, com.google.ads.googleads.v22.services.GenerateTextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.GenerateTextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.GenerateTextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetGenerationServiceMethodDescriptorSupplier("GenerateText"))
              .build();
        }
      }
    }
    return getGenerateTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.GenerateImagesRequest,
      com.google.ads.googleads.v22.services.GenerateImagesResponse> getGenerateImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateImages",
      requestType = com.google.ads.googleads.v22.services.GenerateImagesRequest.class,
      responseType = com.google.ads.googleads.v22.services.GenerateImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.GenerateImagesRequest,
      com.google.ads.googleads.v22.services.GenerateImagesResponse> getGenerateImagesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.GenerateImagesRequest, com.google.ads.googleads.v22.services.GenerateImagesResponse> getGenerateImagesMethod;
    if ((getGenerateImagesMethod = AssetGenerationServiceGrpc.getGenerateImagesMethod) == null) {
      synchronized (AssetGenerationServiceGrpc.class) {
        if ((getGenerateImagesMethod = AssetGenerationServiceGrpc.getGenerateImagesMethod) == null) {
          AssetGenerationServiceGrpc.getGenerateImagesMethod = getGenerateImagesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v22.services.GenerateImagesRequest, com.google.ads.googleads.v22.services.GenerateImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.GenerateImagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.GenerateImagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetGenerationServiceMethodDescriptorSupplier("GenerateImages"))
              .build();
        }
      }
    }
    return getGenerateImagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssetGenerationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGenerationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGenerationServiceStub>() {
        @java.lang.Override
        public AssetGenerationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGenerationServiceStub(channel, callOptions);
        }
      };
    return AssetGenerationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AssetGenerationServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGenerationServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGenerationServiceBlockingV2Stub>() {
        @java.lang.Override
        public AssetGenerationServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGenerationServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AssetGenerationServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssetGenerationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGenerationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGenerationServiceBlockingStub>() {
        @java.lang.Override
        public AssetGenerationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGenerationServiceBlockingStub(channel, callOptions);
        }
      };
    return AssetGenerationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssetGenerationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGenerationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGenerationServiceFutureStub>() {
        @java.lang.Override
        public AssetGenerationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGenerationServiceFutureStub(channel, callOptions);
        }
      };
    return AssetGenerationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for generating new assets with generative AI.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Uses generative AI to generate text that can be used as assets in a
     * campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AssetGenerationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void generateText(com.google.ads.googleads.v22.services.GenerateTextRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.GenerateTextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateTextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Uses generative AI to generate images that can be used as assets in a
     * campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AssetGenerationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void generateImages(com.google.ads.googleads.v22.services.GenerateImagesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.GenerateImagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateImagesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AssetGenerationService.
   * <pre>
   * Service for generating new assets with generative AI.
   * </pre>
   */
  public static abstract class AssetGenerationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AssetGenerationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AssetGenerationService.
   * <pre>
   * Service for generating new assets with generative AI.
   * </pre>
   */
  public static final class AssetGenerationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AssetGenerationServiceStub> {
    private AssetGenerationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGenerationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGenerationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Uses generative AI to generate text that can be used as assets in a
     * campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AssetGenerationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateText(com.google.ads.googleads.v22.services.GenerateTextRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.GenerateTextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateTextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Uses generative AI to generate images that can be used as assets in a
     * campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AssetGenerationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateImages(com.google.ads.googleads.v22.services.GenerateImagesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.GenerateImagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateImagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AssetGenerationService.
   * <pre>
   * Service for generating new assets with generative AI.
   * </pre>
   */
  public static final class AssetGenerationServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AssetGenerationServiceBlockingV2Stub> {
    private AssetGenerationServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGenerationServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGenerationServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Uses generative AI to generate text that can be used as assets in a
     * campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AssetGenerationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.GenerateTextResponse generateText(com.google.ads.googleads.v22.services.GenerateTextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateTextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Uses generative AI to generate images that can be used as assets in a
     * campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AssetGenerationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.GenerateImagesResponse generateImages(com.google.ads.googleads.v22.services.GenerateImagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateImagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AssetGenerationService.
   * <pre>
   * Service for generating new assets with generative AI.
   * </pre>
   */
  public static final class AssetGenerationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AssetGenerationServiceBlockingStub> {
    private AssetGenerationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGenerationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGenerationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Uses generative AI to generate text that can be used as assets in a
     * campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AssetGenerationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.GenerateTextResponse generateText(com.google.ads.googleads.v22.services.GenerateTextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateTextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Uses generative AI to generate images that can be used as assets in a
     * campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AssetGenerationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v22.services.GenerateImagesResponse generateImages(com.google.ads.googleads.v22.services.GenerateImagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateImagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AssetGenerationService.
   * <pre>
   * Service for generating new assets with generative AI.
   * </pre>
   */
  public static final class AssetGenerationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AssetGenerationServiceFutureStub> {
    private AssetGenerationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGenerationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGenerationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Uses generative AI to generate text that can be used as assets in a
     * campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AssetGenerationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v22.services.GenerateTextResponse> generateText(
        com.google.ads.googleads.v22.services.GenerateTextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateTextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Uses generative AI to generate images that can be used as assets in a
     * campaign.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AssetGenerationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v22.services.GenerateImagesResponse> generateImages(
        com.google.ads.googleads.v22.services.GenerateImagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateImagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_TEXT = 0;
  private static final int METHODID_GENERATE_IMAGES = 1;

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
        case METHODID_GENERATE_TEXT:
          serviceImpl.generateText((com.google.ads.googleads.v22.services.GenerateTextRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.GenerateTextResponse>) responseObserver);
          break;
        case METHODID_GENERATE_IMAGES:
          serviceImpl.generateImages((com.google.ads.googleads.v22.services.GenerateImagesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.GenerateImagesResponse>) responseObserver);
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
          getGenerateTextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v22.services.GenerateTextRequest,
              com.google.ads.googleads.v22.services.GenerateTextResponse>(
                service, METHODID_GENERATE_TEXT)))
        .addMethod(
          getGenerateImagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v22.services.GenerateImagesRequest,
              com.google.ads.googleads.v22.services.GenerateImagesResponse>(
                service, METHODID_GENERATE_IMAGES)))
        .build();
  }

  private static abstract class AssetGenerationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssetGenerationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v22.services.AssetGenerationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssetGenerationService");
    }
  }

  private static final class AssetGenerationServiceFileDescriptorSupplier
      extends AssetGenerationServiceBaseDescriptorSupplier {
    AssetGenerationServiceFileDescriptorSupplier() {}
  }

  private static final class AssetGenerationServiceMethodDescriptorSupplier
      extends AssetGenerationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AssetGenerationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AssetGenerationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssetGenerationServiceFileDescriptorSupplier())
              .addMethod(getGenerateTextMethod())
              .addMethod(getGenerateImagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
