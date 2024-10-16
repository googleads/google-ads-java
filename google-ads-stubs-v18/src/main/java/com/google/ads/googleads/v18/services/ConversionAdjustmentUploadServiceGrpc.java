package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to upload conversion adjustments.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/conversion_adjustment_upload_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConversionAdjustmentUploadServiceGrpc {

  private ConversionAdjustmentUploadServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.ConversionAdjustmentUploadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.UploadConversionAdjustmentsRequest,
      com.google.ads.googleads.v18.services.UploadConversionAdjustmentsResponse> getUploadConversionAdjustmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadConversionAdjustments",
      requestType = com.google.ads.googleads.v18.services.UploadConversionAdjustmentsRequest.class,
      responseType = com.google.ads.googleads.v18.services.UploadConversionAdjustmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.UploadConversionAdjustmentsRequest,
      com.google.ads.googleads.v18.services.UploadConversionAdjustmentsResponse> getUploadConversionAdjustmentsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.UploadConversionAdjustmentsRequest, com.google.ads.googleads.v18.services.UploadConversionAdjustmentsResponse> getUploadConversionAdjustmentsMethod;
    if ((getUploadConversionAdjustmentsMethod = ConversionAdjustmentUploadServiceGrpc.getUploadConversionAdjustmentsMethod) == null) {
      synchronized (ConversionAdjustmentUploadServiceGrpc.class) {
        if ((getUploadConversionAdjustmentsMethod = ConversionAdjustmentUploadServiceGrpc.getUploadConversionAdjustmentsMethod) == null) {
          ConversionAdjustmentUploadServiceGrpc.getUploadConversionAdjustmentsMethod = getUploadConversionAdjustmentsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.UploadConversionAdjustmentsRequest, com.google.ads.googleads.v18.services.UploadConversionAdjustmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadConversionAdjustments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.UploadConversionAdjustmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.UploadConversionAdjustmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConversionAdjustmentUploadServiceMethodDescriptorSupplier("UploadConversionAdjustments"))
              .build();
        }
      }
    }
    return getUploadConversionAdjustmentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConversionAdjustmentUploadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionAdjustmentUploadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionAdjustmentUploadServiceStub>() {
        @java.lang.Override
        public ConversionAdjustmentUploadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionAdjustmentUploadServiceStub(channel, callOptions);
        }
      };
    return ConversionAdjustmentUploadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConversionAdjustmentUploadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionAdjustmentUploadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionAdjustmentUploadServiceBlockingStub>() {
        @java.lang.Override
        public ConversionAdjustmentUploadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionAdjustmentUploadServiceBlockingStub(channel, callOptions);
        }
      };
    return ConversionAdjustmentUploadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConversionAdjustmentUploadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionAdjustmentUploadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionAdjustmentUploadServiceFutureStub>() {
        @java.lang.Override
        public ConversionAdjustmentUploadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionAdjustmentUploadServiceFutureStub(channel, callOptions);
        }
      };
    return ConversionAdjustmentUploadServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to upload conversion adjustments.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Processes the given conversion adjustments.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [PartialFailureError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void uploadConversionAdjustments(com.google.ads.googleads.v18.services.UploadConversionAdjustmentsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.UploadConversionAdjustmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadConversionAdjustmentsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ConversionAdjustmentUploadService.
   * <pre>
   * Service to upload conversion adjustments.
   * </pre>
   */
  public static abstract class ConversionAdjustmentUploadServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ConversionAdjustmentUploadServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ConversionAdjustmentUploadService.
   * <pre>
   * Service to upload conversion adjustments.
   * </pre>
   */
  public static final class ConversionAdjustmentUploadServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ConversionAdjustmentUploadServiceStub> {
    private ConversionAdjustmentUploadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionAdjustmentUploadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionAdjustmentUploadServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes the given conversion adjustments.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [PartialFailureError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void uploadConversionAdjustments(com.google.ads.googleads.v18.services.UploadConversionAdjustmentsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.UploadConversionAdjustmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadConversionAdjustmentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ConversionAdjustmentUploadService.
   * <pre>
   * Service to upload conversion adjustments.
   * </pre>
   */
  public static final class ConversionAdjustmentUploadServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ConversionAdjustmentUploadServiceBlockingStub> {
    private ConversionAdjustmentUploadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionAdjustmentUploadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionAdjustmentUploadServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes the given conversion adjustments.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [PartialFailureError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.UploadConversionAdjustmentsResponse uploadConversionAdjustments(com.google.ads.googleads.v18.services.UploadConversionAdjustmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadConversionAdjustmentsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ConversionAdjustmentUploadService.
   * <pre>
   * Service to upload conversion adjustments.
   * </pre>
   */
  public static final class ConversionAdjustmentUploadServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ConversionAdjustmentUploadServiceFutureStub> {
    private ConversionAdjustmentUploadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionAdjustmentUploadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionAdjustmentUploadServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes the given conversion adjustments.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [PartialFailureError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.UploadConversionAdjustmentsResponse> uploadConversionAdjustments(
        com.google.ads.googleads.v18.services.UploadConversionAdjustmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadConversionAdjustmentsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_CONVERSION_ADJUSTMENTS = 0;

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
        case METHODID_UPLOAD_CONVERSION_ADJUSTMENTS:
          serviceImpl.uploadConversionAdjustments((com.google.ads.googleads.v18.services.UploadConversionAdjustmentsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.UploadConversionAdjustmentsResponse>) responseObserver);
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
          getUploadConversionAdjustmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.UploadConversionAdjustmentsRequest,
              com.google.ads.googleads.v18.services.UploadConversionAdjustmentsResponse>(
                service, METHODID_UPLOAD_CONVERSION_ADJUSTMENTS)))
        .build();
  }

  private static abstract class ConversionAdjustmentUploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversionAdjustmentUploadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.ConversionAdjustmentUploadServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConversionAdjustmentUploadService");
    }
  }

  private static final class ConversionAdjustmentUploadServiceFileDescriptorSupplier
      extends ConversionAdjustmentUploadServiceBaseDescriptorSupplier {
    ConversionAdjustmentUploadServiceFileDescriptorSupplier() {}
  }

  private static final class ConversionAdjustmentUploadServiceMethodDescriptorSupplier
      extends ConversionAdjustmentUploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ConversionAdjustmentUploadServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ConversionAdjustmentUploadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConversionAdjustmentUploadServiceFileDescriptorSupplier())
              .addMethod(getUploadConversionAdjustmentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
