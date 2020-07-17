package com.google.ads.googleads.v4.services;

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
 * Service to fetch language constants.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/language_constant_service.proto")
public final class LanguageConstantServiceGrpc {

  private LanguageConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.LanguageConstantService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetLanguageConstantMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetLanguageConstantRequest,
      com.google.ads.googleads.v4.resources.LanguageConstant> METHOD_GET_LANGUAGE_CONSTANT = getGetLanguageConstantMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetLanguageConstantRequest,
      com.google.ads.googleads.v4.resources.LanguageConstant> getGetLanguageConstantMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetLanguageConstantRequest,
      com.google.ads.googleads.v4.resources.LanguageConstant> getGetLanguageConstantMethod() {
    return getGetLanguageConstantMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetLanguageConstantRequest,
      com.google.ads.googleads.v4.resources.LanguageConstant> getGetLanguageConstantMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetLanguageConstantRequest, com.google.ads.googleads.v4.resources.LanguageConstant> getGetLanguageConstantMethod;
    if ((getGetLanguageConstantMethod = LanguageConstantServiceGrpc.getGetLanguageConstantMethod) == null) {
      synchronized (LanguageConstantServiceGrpc.class) {
        if ((getGetLanguageConstantMethod = LanguageConstantServiceGrpc.getGetLanguageConstantMethod) == null) {
          LanguageConstantServiceGrpc.getGetLanguageConstantMethod = getGetLanguageConstantMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetLanguageConstantRequest, com.google.ads.googleads.v4.resources.LanguageConstant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.LanguageConstantService", "GetLanguageConstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetLanguageConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.LanguageConstant.getDefaultInstance()))
                  .setSchemaDescriptor(new LanguageConstantServiceMethodDescriptorSupplier("GetLanguageConstant"))
                  .build();
          }
        }
     }
     return getGetLanguageConstantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LanguageConstantServiceStub newStub(io.grpc.Channel channel) {
    return new LanguageConstantServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LanguageConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LanguageConstantServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LanguageConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LanguageConstantServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch language constants.
   * </pre>
   */
  public static abstract class LanguageConstantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested language constant.
     * </pre>
     */
    public void getLanguageConstant(com.google.ads.googleads.v4.services.GetLanguageConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.LanguageConstant> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLanguageConstantMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLanguageConstantMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetLanguageConstantRequest,
                com.google.ads.googleads.v4.resources.LanguageConstant>(
                  this, METHODID_GET_LANGUAGE_CONSTANT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch language constants.
   * </pre>
   */
  public static final class LanguageConstantServiceStub extends io.grpc.stub.AbstractStub<LanguageConstantServiceStub> {
    private LanguageConstantServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LanguageConstantServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LanguageConstantServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LanguageConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested language constant.
     * </pre>
     */
    public void getLanguageConstant(com.google.ads.googleads.v4.services.GetLanguageConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.LanguageConstant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLanguageConstantMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch language constants.
   * </pre>
   */
  public static final class LanguageConstantServiceBlockingStub extends io.grpc.stub.AbstractStub<LanguageConstantServiceBlockingStub> {
    private LanguageConstantServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LanguageConstantServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LanguageConstantServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LanguageConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested language constant.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.LanguageConstant getLanguageConstant(com.google.ads.googleads.v4.services.GetLanguageConstantRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLanguageConstantMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch language constants.
   * </pre>
   */
  public static final class LanguageConstantServiceFutureStub extends io.grpc.stub.AbstractStub<LanguageConstantServiceFutureStub> {
    private LanguageConstantServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LanguageConstantServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LanguageConstantServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LanguageConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested language constant.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.LanguageConstant> getLanguageConstant(
        com.google.ads.googleads.v4.services.GetLanguageConstantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLanguageConstantMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LANGUAGE_CONSTANT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LanguageConstantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LanguageConstantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LANGUAGE_CONSTANT:
          serviceImpl.getLanguageConstant((com.google.ads.googleads.v4.services.GetLanguageConstantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.LanguageConstant>) responseObserver);
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

  private static abstract class LanguageConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LanguageConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.LanguageConstantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LanguageConstantService");
    }
  }

  private static final class LanguageConstantServiceFileDescriptorSupplier
      extends LanguageConstantServiceBaseDescriptorSupplier {
    LanguageConstantServiceFileDescriptorSupplier() {}
  }

  private static final class LanguageConstantServiceMethodDescriptorSupplier
      extends LanguageConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LanguageConstantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LanguageConstantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LanguageConstantServiceFileDescriptorSupplier())
              .addMethod(getGetLanguageConstantMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
