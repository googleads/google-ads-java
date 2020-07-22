package com.google.ads.googleads.v1.services;

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
 * Service to upload conversions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v1/services/conversion_upload_service.proto")
public final class ConversionUploadServiceGrpc {

  private ConversionUploadServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.ConversionUploadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.UploadClickConversionsRequest,
      com.google.ads.googleads.v1.services.UploadClickConversionsResponse> getUploadClickConversionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadClickConversions",
      requestType = com.google.ads.googleads.v1.services.UploadClickConversionsRequest.class,
      responseType = com.google.ads.googleads.v1.services.UploadClickConversionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.UploadClickConversionsRequest,
      com.google.ads.googleads.v1.services.UploadClickConversionsResponse> getUploadClickConversionsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.UploadClickConversionsRequest, com.google.ads.googleads.v1.services.UploadClickConversionsResponse> getUploadClickConversionsMethod;
    if ((getUploadClickConversionsMethod = ConversionUploadServiceGrpc.getUploadClickConversionsMethod) == null) {
      synchronized (ConversionUploadServiceGrpc.class) {
        if ((getUploadClickConversionsMethod = ConversionUploadServiceGrpc.getUploadClickConversionsMethod) == null) {
          ConversionUploadServiceGrpc.getUploadClickConversionsMethod = getUploadClickConversionsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.UploadClickConversionsRequest, com.google.ads.googleads.v1.services.UploadClickConversionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadClickConversions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.UploadClickConversionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.UploadClickConversionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConversionUploadServiceMethodDescriptorSupplier("UploadClickConversions"))
              .build();
        }
      }
    }
    return getUploadClickConversionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.UploadCallConversionsRequest,
      com.google.ads.googleads.v1.services.UploadCallConversionsResponse> getUploadCallConversionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadCallConversions",
      requestType = com.google.ads.googleads.v1.services.UploadCallConversionsRequest.class,
      responseType = com.google.ads.googleads.v1.services.UploadCallConversionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.UploadCallConversionsRequest,
      com.google.ads.googleads.v1.services.UploadCallConversionsResponse> getUploadCallConversionsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.UploadCallConversionsRequest, com.google.ads.googleads.v1.services.UploadCallConversionsResponse> getUploadCallConversionsMethod;
    if ((getUploadCallConversionsMethod = ConversionUploadServiceGrpc.getUploadCallConversionsMethod) == null) {
      synchronized (ConversionUploadServiceGrpc.class) {
        if ((getUploadCallConversionsMethod = ConversionUploadServiceGrpc.getUploadCallConversionsMethod) == null) {
          ConversionUploadServiceGrpc.getUploadCallConversionsMethod = getUploadCallConversionsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.UploadCallConversionsRequest, com.google.ads.googleads.v1.services.UploadCallConversionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadCallConversions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.UploadCallConversionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.UploadCallConversionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConversionUploadServiceMethodDescriptorSupplier("UploadCallConversions"))
              .build();
        }
      }
    }
    return getUploadCallConversionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConversionUploadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionUploadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionUploadServiceStub>() {
        @java.lang.Override
        public ConversionUploadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionUploadServiceStub(channel, callOptions);
        }
      };
    return ConversionUploadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConversionUploadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionUploadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionUploadServiceBlockingStub>() {
        @java.lang.Override
        public ConversionUploadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionUploadServiceBlockingStub(channel, callOptions);
        }
      };
    return ConversionUploadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConversionUploadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionUploadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionUploadServiceFutureStub>() {
        @java.lang.Override
        public ConversionUploadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionUploadServiceFutureStub(channel, callOptions);
        }
      };
    return ConversionUploadServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to upload conversions.
   * </pre>
   */
  public static abstract class ConversionUploadServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Processes the given click conversions.
     * </pre>
     */
    public void uploadClickConversions(com.google.ads.googleads.v1.services.UploadClickConversionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.UploadClickConversionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadClickConversionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Processes the given call conversions.
     * </pre>
     */
    public void uploadCallConversions(com.google.ads.googleads.v1.services.UploadCallConversionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.UploadCallConversionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadCallConversionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadClickConversionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.UploadClickConversionsRequest,
                com.google.ads.googleads.v1.services.UploadClickConversionsResponse>(
                  this, METHODID_UPLOAD_CLICK_CONVERSIONS)))
          .addMethod(
            getUploadCallConversionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.UploadCallConversionsRequest,
                com.google.ads.googleads.v1.services.UploadCallConversionsResponse>(
                  this, METHODID_UPLOAD_CALL_CONVERSIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to upload conversions.
   * </pre>
   */
  public static final class ConversionUploadServiceStub extends io.grpc.stub.AbstractAsyncStub<ConversionUploadServiceStub> {
    private ConversionUploadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionUploadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionUploadServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes the given click conversions.
     * </pre>
     */
    public void uploadClickConversions(com.google.ads.googleads.v1.services.UploadClickConversionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.UploadClickConversionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadClickConversionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Processes the given call conversions.
     * </pre>
     */
    public void uploadCallConversions(com.google.ads.googleads.v1.services.UploadCallConversionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.UploadCallConversionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadCallConversionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to upload conversions.
   * </pre>
   */
  public static final class ConversionUploadServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConversionUploadServiceBlockingStub> {
    private ConversionUploadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionUploadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionUploadServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes the given click conversions.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.UploadClickConversionsResponse uploadClickConversions(com.google.ads.googleads.v1.services.UploadClickConversionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUploadClickConversionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Processes the given call conversions.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.UploadCallConversionsResponse uploadCallConversions(com.google.ads.googleads.v1.services.UploadCallConversionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUploadCallConversionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to upload conversions.
   * </pre>
   */
  public static final class ConversionUploadServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConversionUploadServiceFutureStub> {
    private ConversionUploadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionUploadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionUploadServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes the given click conversions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.UploadClickConversionsResponse> uploadClickConversions(
        com.google.ads.googleads.v1.services.UploadClickConversionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadClickConversionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Processes the given call conversions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.UploadCallConversionsResponse> uploadCallConversions(
        com.google.ads.googleads.v1.services.UploadCallConversionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadCallConversionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_CLICK_CONVERSIONS = 0;
  private static final int METHODID_UPLOAD_CALL_CONVERSIONS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConversionUploadServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConversionUploadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_CLICK_CONVERSIONS:
          serviceImpl.uploadClickConversions((com.google.ads.googleads.v1.services.UploadClickConversionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.UploadClickConversionsResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_CALL_CONVERSIONS:
          serviceImpl.uploadCallConversions((com.google.ads.googleads.v1.services.UploadCallConversionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.UploadCallConversionsResponse>) responseObserver);
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

  private static abstract class ConversionUploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversionUploadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.ConversionUploadServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConversionUploadService");
    }
  }

  private static final class ConversionUploadServiceFileDescriptorSupplier
      extends ConversionUploadServiceBaseDescriptorSupplier {
    ConversionUploadServiceFileDescriptorSupplier() {}
  }

  private static final class ConversionUploadServiceMethodDescriptorSupplier
      extends ConversionUploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConversionUploadServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConversionUploadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConversionUploadServiceFileDescriptorSupplier())
              .addMethod(getUploadClickConversionsMethod())
              .addMethod(getUploadCallConversionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
