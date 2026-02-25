package com.google.ads.googleads.v23.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage YouTube video uploads.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class YouTubeVideoUploadServiceGrpc {

  private YouTubeVideoUploadServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v23.services.YouTubeVideoUploadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest,
      com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse> getCreateYouTubeVideoUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateYouTubeVideoUpload",
      requestType = com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest.class,
      responseType = com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest,
      com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse> getCreateYouTubeVideoUploadMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest, com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse> getCreateYouTubeVideoUploadMethod;
    if ((getCreateYouTubeVideoUploadMethod = YouTubeVideoUploadServiceGrpc.getCreateYouTubeVideoUploadMethod) == null) {
      synchronized (YouTubeVideoUploadServiceGrpc.class) {
        if ((getCreateYouTubeVideoUploadMethod = YouTubeVideoUploadServiceGrpc.getCreateYouTubeVideoUploadMethod) == null) {
          YouTubeVideoUploadServiceGrpc.getCreateYouTubeVideoUploadMethod = getCreateYouTubeVideoUploadMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest, com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateYouTubeVideoUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new YouTubeVideoUploadServiceMethodDescriptorSupplier("CreateYouTubeVideoUpload"))
              .build();
        }
      }
    }
    return getCreateYouTubeVideoUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest,
      com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse> getUpdateYouTubeVideoUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateYouTubeVideoUpload",
      requestType = com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest.class,
      responseType = com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest,
      com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse> getUpdateYouTubeVideoUploadMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest, com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse> getUpdateYouTubeVideoUploadMethod;
    if ((getUpdateYouTubeVideoUploadMethod = YouTubeVideoUploadServiceGrpc.getUpdateYouTubeVideoUploadMethod) == null) {
      synchronized (YouTubeVideoUploadServiceGrpc.class) {
        if ((getUpdateYouTubeVideoUploadMethod = YouTubeVideoUploadServiceGrpc.getUpdateYouTubeVideoUploadMethod) == null) {
          YouTubeVideoUploadServiceGrpc.getUpdateYouTubeVideoUploadMethod = getUpdateYouTubeVideoUploadMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest, com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateYouTubeVideoUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new YouTubeVideoUploadServiceMethodDescriptorSupplier("UpdateYouTubeVideoUpload"))
              .build();
        }
      }
    }
    return getUpdateYouTubeVideoUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest,
      com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse> getRemoveYouTubeVideoUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveYouTubeVideoUpload",
      requestType = com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest.class,
      responseType = com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest,
      com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse> getRemoveYouTubeVideoUploadMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest, com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse> getRemoveYouTubeVideoUploadMethod;
    if ((getRemoveYouTubeVideoUploadMethod = YouTubeVideoUploadServiceGrpc.getRemoveYouTubeVideoUploadMethod) == null) {
      synchronized (YouTubeVideoUploadServiceGrpc.class) {
        if ((getRemoveYouTubeVideoUploadMethod = YouTubeVideoUploadServiceGrpc.getRemoveYouTubeVideoUploadMethod) == null) {
          YouTubeVideoUploadServiceGrpc.getRemoveYouTubeVideoUploadMethod = getRemoveYouTubeVideoUploadMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest, com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveYouTubeVideoUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new YouTubeVideoUploadServiceMethodDescriptorSupplier("RemoveYouTubeVideoUpload"))
              .build();
        }
      }
    }
    return getRemoveYouTubeVideoUploadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static YouTubeVideoUploadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<YouTubeVideoUploadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<YouTubeVideoUploadServiceStub>() {
        @java.lang.Override
        public YouTubeVideoUploadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new YouTubeVideoUploadServiceStub(channel, callOptions);
        }
      };
    return YouTubeVideoUploadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static YouTubeVideoUploadServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<YouTubeVideoUploadServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<YouTubeVideoUploadServiceBlockingV2Stub>() {
        @java.lang.Override
        public YouTubeVideoUploadServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new YouTubeVideoUploadServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return YouTubeVideoUploadServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static YouTubeVideoUploadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<YouTubeVideoUploadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<YouTubeVideoUploadServiceBlockingStub>() {
        @java.lang.Override
        public YouTubeVideoUploadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new YouTubeVideoUploadServiceBlockingStub(channel, callOptions);
        }
      };
    return YouTubeVideoUploadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static YouTubeVideoUploadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<YouTubeVideoUploadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<YouTubeVideoUploadServiceFutureStub>() {
        @java.lang.Override
        public YouTubeVideoUploadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new YouTubeVideoUploadServiceFutureStub(channel, callOptions);
        }
      };
    return YouTubeVideoUploadServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage YouTube video uploads.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Uploads a video to Google-managed or advertiser owned (brand) YouTube
     * channel.
     * </pre>
     */
    default void createYouTubeVideoUpload(com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateYouTubeVideoUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates YouTube video's metadata, but only for videos uploaded using this
     * API.
     * </pre>
     */
    default void updateYouTubeVideoUpload(com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateYouTubeVideoUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes YouTube videos uploaded using this API.
     * </pre>
     */
    default void removeYouTubeVideoUpload(com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveYouTubeVideoUploadMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service YouTubeVideoUploadService.
   * <pre>
   * Service to manage YouTube video uploads.
   * </pre>
   */
  public static abstract class YouTubeVideoUploadServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return YouTubeVideoUploadServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service YouTubeVideoUploadService.
   * <pre>
   * Service to manage YouTube video uploads.
   * </pre>
   */
  public static final class YouTubeVideoUploadServiceStub
      extends io.grpc.stub.AbstractAsyncStub<YouTubeVideoUploadServiceStub> {
    private YouTubeVideoUploadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YouTubeVideoUploadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new YouTubeVideoUploadServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Uploads a video to Google-managed or advertiser owned (brand) YouTube
     * channel.
     * </pre>
     */
    public void createYouTubeVideoUpload(com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateYouTubeVideoUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates YouTube video's metadata, but only for videos uploaded using this
     * API.
     * </pre>
     */
    public void updateYouTubeVideoUpload(com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateYouTubeVideoUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes YouTube videos uploaded using this API.
     * </pre>
     */
    public void removeYouTubeVideoUpload(com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveYouTubeVideoUploadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service YouTubeVideoUploadService.
   * <pre>
   * Service to manage YouTube video uploads.
   * </pre>
   */
  public static final class YouTubeVideoUploadServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<YouTubeVideoUploadServiceBlockingV2Stub> {
    private YouTubeVideoUploadServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YouTubeVideoUploadServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new YouTubeVideoUploadServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Uploads a video to Google-managed or advertiser owned (brand) YouTube
     * channel.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse createYouTubeVideoUpload(com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateYouTubeVideoUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates YouTube video's metadata, but only for videos uploaded using this
     * API.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse updateYouTubeVideoUpload(com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateYouTubeVideoUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes YouTube videos uploaded using this API.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse removeYouTubeVideoUpload(com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRemoveYouTubeVideoUploadMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service YouTubeVideoUploadService.
   * <pre>
   * Service to manage YouTube video uploads.
   * </pre>
   */
  public static final class YouTubeVideoUploadServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<YouTubeVideoUploadServiceBlockingStub> {
    private YouTubeVideoUploadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YouTubeVideoUploadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new YouTubeVideoUploadServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Uploads a video to Google-managed or advertiser owned (brand) YouTube
     * channel.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse createYouTubeVideoUpload(com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateYouTubeVideoUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates YouTube video's metadata, but only for videos uploaded using this
     * API.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse updateYouTubeVideoUpload(com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateYouTubeVideoUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes YouTube videos uploaded using this API.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse removeYouTubeVideoUpload(com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveYouTubeVideoUploadMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service YouTubeVideoUploadService.
   * <pre>
   * Service to manage YouTube video uploads.
   * </pre>
   */
  public static final class YouTubeVideoUploadServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<YouTubeVideoUploadServiceFutureStub> {
    private YouTubeVideoUploadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YouTubeVideoUploadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new YouTubeVideoUploadServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Uploads a video to Google-managed or advertiser owned (brand) YouTube
     * channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse> createYouTubeVideoUpload(
        com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateYouTubeVideoUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates YouTube video's metadata, but only for videos uploaded using this
     * API.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse> updateYouTubeVideoUpload(
        com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateYouTubeVideoUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes YouTube videos uploaded using this API.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse> removeYouTubeVideoUpload(
        com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveYouTubeVideoUploadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_YOU_TUBE_VIDEO_UPLOAD = 0;
  private static final int METHODID_UPDATE_YOU_TUBE_VIDEO_UPLOAD = 1;
  private static final int METHODID_REMOVE_YOU_TUBE_VIDEO_UPLOAD = 2;

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
        case METHODID_CREATE_YOU_TUBE_VIDEO_UPLOAD:
          serviceImpl.createYouTubeVideoUpload((com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse>) responseObserver);
          break;
        case METHODID_UPDATE_YOU_TUBE_VIDEO_UPLOAD:
          serviceImpl.updateYouTubeVideoUpload((com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse>) responseObserver);
          break;
        case METHODID_REMOVE_YOU_TUBE_VIDEO_UPLOAD:
          serviceImpl.removeYouTubeVideoUpload((com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse>) responseObserver);
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
          getCreateYouTubeVideoUploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadRequest,
              com.google.ads.googleads.v23.services.CreateYouTubeVideoUploadResponse>(
                service, METHODID_CREATE_YOU_TUBE_VIDEO_UPLOAD)))
        .addMethod(
          getUpdateYouTubeVideoUploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadRequest,
              com.google.ads.googleads.v23.services.UpdateYouTubeVideoUploadResponse>(
                service, METHODID_UPDATE_YOU_TUBE_VIDEO_UPLOAD)))
        .addMethod(
          getRemoveYouTubeVideoUploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadRequest,
              com.google.ads.googleads.v23.services.RemoveYouTubeVideoUploadResponse>(
                service, METHODID_REMOVE_YOU_TUBE_VIDEO_UPLOAD)))
        .build();
  }

  private static abstract class YouTubeVideoUploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    YouTubeVideoUploadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v23.services.YoutubeVideoUploadServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("YouTubeVideoUploadService");
    }
  }

  private static final class YouTubeVideoUploadServiceFileDescriptorSupplier
      extends YouTubeVideoUploadServiceBaseDescriptorSupplier {
    YouTubeVideoUploadServiceFileDescriptorSupplier() {}
  }

  private static final class YouTubeVideoUploadServiceMethodDescriptorSupplier
      extends YouTubeVideoUploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    YouTubeVideoUploadServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (YouTubeVideoUploadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new YouTubeVideoUploadServiceFileDescriptorSupplier())
              .addMethod(getCreateYouTubeVideoUploadMethod())
              .addMethod(getUpdateYouTubeVideoUploadMethod())
              .addMethod(getRemoveYouTubeVideoUploadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
