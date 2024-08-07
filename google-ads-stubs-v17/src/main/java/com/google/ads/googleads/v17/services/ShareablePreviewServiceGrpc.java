package com.google.ads.googleads.v17.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to generate Shareable Previews.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v17/services/shareable_preview_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ShareablePreviewServiceGrpc {

  private ShareablePreviewServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v17.services.ShareablePreviewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v17.services.GenerateShareablePreviewsRequest,
      com.google.ads.googleads.v17.services.GenerateShareablePreviewsResponse> getGenerateShareablePreviewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateShareablePreviews",
      requestType = com.google.ads.googleads.v17.services.GenerateShareablePreviewsRequest.class,
      responseType = com.google.ads.googleads.v17.services.GenerateShareablePreviewsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v17.services.GenerateShareablePreviewsRequest,
      com.google.ads.googleads.v17.services.GenerateShareablePreviewsResponse> getGenerateShareablePreviewsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v17.services.GenerateShareablePreviewsRequest, com.google.ads.googleads.v17.services.GenerateShareablePreviewsResponse> getGenerateShareablePreviewsMethod;
    if ((getGenerateShareablePreviewsMethod = ShareablePreviewServiceGrpc.getGenerateShareablePreviewsMethod) == null) {
      synchronized (ShareablePreviewServiceGrpc.class) {
        if ((getGenerateShareablePreviewsMethod = ShareablePreviewServiceGrpc.getGenerateShareablePreviewsMethod) == null) {
          ShareablePreviewServiceGrpc.getGenerateShareablePreviewsMethod = getGenerateShareablePreviewsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v17.services.GenerateShareablePreviewsRequest, com.google.ads.googleads.v17.services.GenerateShareablePreviewsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateShareablePreviews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v17.services.GenerateShareablePreviewsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v17.services.GenerateShareablePreviewsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShareablePreviewServiceMethodDescriptorSupplier("GenerateShareablePreviews"))
              .build();
        }
      }
    }
    return getGenerateShareablePreviewsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShareablePreviewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShareablePreviewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShareablePreviewServiceStub>() {
        @java.lang.Override
        public ShareablePreviewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShareablePreviewServiceStub(channel, callOptions);
        }
      };
    return ShareablePreviewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShareablePreviewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShareablePreviewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShareablePreviewServiceBlockingStub>() {
        @java.lang.Override
        public ShareablePreviewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShareablePreviewServiceBlockingStub(channel, callOptions);
        }
      };
    return ShareablePreviewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShareablePreviewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShareablePreviewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShareablePreviewServiceFutureStub>() {
        @java.lang.Override
        public ShareablePreviewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShareablePreviewServiceFutureStub(channel, callOptions);
        }
      };
    return ShareablePreviewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to generate Shareable Previews.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the requested Shareable Preview.
     * </pre>
     */
    default void generateShareablePreviews(com.google.ads.googleads.v17.services.GenerateShareablePreviewsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v17.services.GenerateShareablePreviewsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateShareablePreviewsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ShareablePreviewService.
   * <pre>
   * Service to generate Shareable Previews.
   * </pre>
   */
  public static abstract class ShareablePreviewServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ShareablePreviewServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ShareablePreviewService.
   * <pre>
   * Service to generate Shareable Previews.
   * </pre>
   */
  public static final class ShareablePreviewServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ShareablePreviewServiceStub> {
    private ShareablePreviewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShareablePreviewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShareablePreviewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Shareable Preview.
     * </pre>
     */
    public void generateShareablePreviews(com.google.ads.googleads.v17.services.GenerateShareablePreviewsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v17.services.GenerateShareablePreviewsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateShareablePreviewsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ShareablePreviewService.
   * <pre>
   * Service to generate Shareable Previews.
   * </pre>
   */
  public static final class ShareablePreviewServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ShareablePreviewServiceBlockingStub> {
    private ShareablePreviewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShareablePreviewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShareablePreviewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Shareable Preview.
     * </pre>
     */
    public com.google.ads.googleads.v17.services.GenerateShareablePreviewsResponse generateShareablePreviews(com.google.ads.googleads.v17.services.GenerateShareablePreviewsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateShareablePreviewsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ShareablePreviewService.
   * <pre>
   * Service to generate Shareable Previews.
   * </pre>
   */
  public static final class ShareablePreviewServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ShareablePreviewServiceFutureStub> {
    private ShareablePreviewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShareablePreviewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShareablePreviewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Shareable Preview.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v17.services.GenerateShareablePreviewsResponse> generateShareablePreviews(
        com.google.ads.googleads.v17.services.GenerateShareablePreviewsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateShareablePreviewsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_SHAREABLE_PREVIEWS = 0;

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
        case METHODID_GENERATE_SHAREABLE_PREVIEWS:
          serviceImpl.generateShareablePreviews((com.google.ads.googleads.v17.services.GenerateShareablePreviewsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v17.services.GenerateShareablePreviewsResponse>) responseObserver);
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
          getGenerateShareablePreviewsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v17.services.GenerateShareablePreviewsRequest,
              com.google.ads.googleads.v17.services.GenerateShareablePreviewsResponse>(
                service, METHODID_GENERATE_SHAREABLE_PREVIEWS)))
        .build();
  }

  private static abstract class ShareablePreviewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShareablePreviewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v17.services.ShareablePreviewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShareablePreviewService");
    }
  }

  private static final class ShareablePreviewServiceFileDescriptorSupplier
      extends ShareablePreviewServiceBaseDescriptorSupplier {
    ShareablePreviewServiceFileDescriptorSupplier() {}
  }

  private static final class ShareablePreviewServiceMethodDescriptorSupplier
      extends ShareablePreviewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ShareablePreviewServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ShareablePreviewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShareablePreviewServiceFileDescriptorSupplier())
              .addMethod(getGenerateShareablePreviewsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
