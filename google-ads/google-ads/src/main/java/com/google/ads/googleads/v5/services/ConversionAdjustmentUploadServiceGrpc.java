package com.google.ads.googleads.v5.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service to upload conversion adjustments.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v5/services/conversion_adjustment_upload_service.proto")
public final class ConversionAdjustmentUploadServiceGrpc {

  private ConversionAdjustmentUploadServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v5.services.ConversionAdjustmentUploadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.UploadConversionAdjustmentsRequest,
      com.google.ads.googleads.v5.services.UploadConversionAdjustmentsResponse> getUploadConversionAdjustmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadConversionAdjustments",
      requestType = com.google.ads.googleads.v5.services.UploadConversionAdjustmentsRequest.class,
      responseType = com.google.ads.googleads.v5.services.UploadConversionAdjustmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.UploadConversionAdjustmentsRequest,
      com.google.ads.googleads.v5.services.UploadConversionAdjustmentsResponse> getUploadConversionAdjustmentsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.UploadConversionAdjustmentsRequest, com.google.ads.googleads.v5.services.UploadConversionAdjustmentsResponse> getUploadConversionAdjustmentsMethod;
    if ((getUploadConversionAdjustmentsMethod = ConversionAdjustmentUploadServiceGrpc.getUploadConversionAdjustmentsMethod) == null) {
      synchronized (ConversionAdjustmentUploadServiceGrpc.class) {
        if ((getUploadConversionAdjustmentsMethod = ConversionAdjustmentUploadServiceGrpc.getUploadConversionAdjustmentsMethod) == null) {
          ConversionAdjustmentUploadServiceGrpc.getUploadConversionAdjustmentsMethod = getUploadConversionAdjustmentsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.UploadConversionAdjustmentsRequest, com.google.ads.googleads.v5.services.UploadConversionAdjustmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadConversionAdjustments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.UploadConversionAdjustmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.UploadConversionAdjustmentsResponse.getDefaultInstance()))
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
  public static abstract class ConversionAdjustmentUploadServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Processes the given conversion adjustments.
     * </pre>
     */
    public void uploadConversionAdjustments(com.google.ads.googleads.v5.services.UploadConversionAdjustmentsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.UploadConversionAdjustmentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadConversionAdjustmentsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadConversionAdjustmentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.UploadConversionAdjustmentsRequest,
                com.google.ads.googleads.v5.services.UploadConversionAdjustmentsResponse>(
                  this, METHODID_UPLOAD_CONVERSION_ADJUSTMENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to upload conversion adjustments.
   * </pre>
   */
  public static final class ConversionAdjustmentUploadServiceStub extends io.grpc.stub.AbstractAsyncStub<ConversionAdjustmentUploadServiceStub> {
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
     * </pre>
     */
    public void uploadConversionAdjustments(com.google.ads.googleads.v5.services.UploadConversionAdjustmentsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.UploadConversionAdjustmentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadConversionAdjustmentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to upload conversion adjustments.
   * </pre>
   */
  public static final class ConversionAdjustmentUploadServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConversionAdjustmentUploadServiceBlockingStub> {
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
     * </pre>
     */
    public com.google.ads.googleads.v5.services.UploadConversionAdjustmentsResponse uploadConversionAdjustments(com.google.ads.googleads.v5.services.UploadConversionAdjustmentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUploadConversionAdjustmentsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to upload conversion adjustments.
   * </pre>
   */
  public static final class ConversionAdjustmentUploadServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConversionAdjustmentUploadServiceFutureStub> {
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
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.services.UploadConversionAdjustmentsResponse> uploadConversionAdjustments(
        com.google.ads.googleads.v5.services.UploadConversionAdjustmentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadConversionAdjustmentsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_CONVERSION_ADJUSTMENTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConversionAdjustmentUploadServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConversionAdjustmentUploadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_CONVERSION_ADJUSTMENTS:
          serviceImpl.uploadConversionAdjustments((com.google.ads.googleads.v5.services.UploadConversionAdjustmentsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.UploadConversionAdjustmentsResponse>) responseObserver);
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

  private static abstract class ConversionAdjustmentUploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversionAdjustmentUploadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v5.services.ConversionAdjustmentUploadServiceProto.getDescriptor();
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
    private final String methodName;

    ConversionAdjustmentUploadServiceMethodDescriptorSupplier(String methodName) {
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
