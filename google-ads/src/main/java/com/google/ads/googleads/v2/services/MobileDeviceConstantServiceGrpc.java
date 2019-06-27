package com.google.ads.googleads.v2.services;

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
 * Service to fetch mobile device constants.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/mobile_device_constant_service.proto")
public final class MobileDeviceConstantServiceGrpc {

  private MobileDeviceConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.MobileDeviceConstantService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetMobileDeviceConstantMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetMobileDeviceConstantRequest,
      com.google.ads.googleads.v2.resources.MobileDeviceConstant> METHOD_GET_MOBILE_DEVICE_CONSTANT = getGetMobileDeviceConstantMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetMobileDeviceConstantRequest,
      com.google.ads.googleads.v2.resources.MobileDeviceConstant> getGetMobileDeviceConstantMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetMobileDeviceConstantRequest,
      com.google.ads.googleads.v2.resources.MobileDeviceConstant> getGetMobileDeviceConstantMethod() {
    return getGetMobileDeviceConstantMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetMobileDeviceConstantRequest,
      com.google.ads.googleads.v2.resources.MobileDeviceConstant> getGetMobileDeviceConstantMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetMobileDeviceConstantRequest, com.google.ads.googleads.v2.resources.MobileDeviceConstant> getGetMobileDeviceConstantMethod;
    if ((getGetMobileDeviceConstantMethod = MobileDeviceConstantServiceGrpc.getGetMobileDeviceConstantMethod) == null) {
      synchronized (MobileDeviceConstantServiceGrpc.class) {
        if ((getGetMobileDeviceConstantMethod = MobileDeviceConstantServiceGrpc.getGetMobileDeviceConstantMethod) == null) {
          MobileDeviceConstantServiceGrpc.getGetMobileDeviceConstantMethod = getGetMobileDeviceConstantMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetMobileDeviceConstantRequest, com.google.ads.googleads.v2.resources.MobileDeviceConstant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.MobileDeviceConstantService", "GetMobileDeviceConstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetMobileDeviceConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.MobileDeviceConstant.getDefaultInstance()))
                  .setSchemaDescriptor(new MobileDeviceConstantServiceMethodDescriptorSupplier("GetMobileDeviceConstant"))
                  .build();
          }
        }
     }
     return getGetMobileDeviceConstantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MobileDeviceConstantServiceStub newStub(io.grpc.Channel channel) {
    return new MobileDeviceConstantServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MobileDeviceConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MobileDeviceConstantServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MobileDeviceConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MobileDeviceConstantServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch mobile device constants.
   * </pre>
   */
  public static abstract class MobileDeviceConstantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested mobile device constant in full detail.
     * </pre>
     */
    public void getMobileDeviceConstant(com.google.ads.googleads.v2.services.GetMobileDeviceConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.MobileDeviceConstant> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMobileDeviceConstantMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMobileDeviceConstantMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetMobileDeviceConstantRequest,
                com.google.ads.googleads.v2.resources.MobileDeviceConstant>(
                  this, METHODID_GET_MOBILE_DEVICE_CONSTANT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch mobile device constants.
   * </pre>
   */
  public static final class MobileDeviceConstantServiceStub extends io.grpc.stub.AbstractStub<MobileDeviceConstantServiceStub> {
    private MobileDeviceConstantServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MobileDeviceConstantServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MobileDeviceConstantServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MobileDeviceConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested mobile device constant in full detail.
     * </pre>
     */
    public void getMobileDeviceConstant(com.google.ads.googleads.v2.services.GetMobileDeviceConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.MobileDeviceConstant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMobileDeviceConstantMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch mobile device constants.
   * </pre>
   */
  public static final class MobileDeviceConstantServiceBlockingStub extends io.grpc.stub.AbstractStub<MobileDeviceConstantServiceBlockingStub> {
    private MobileDeviceConstantServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MobileDeviceConstantServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MobileDeviceConstantServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MobileDeviceConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested mobile device constant in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.MobileDeviceConstant getMobileDeviceConstant(com.google.ads.googleads.v2.services.GetMobileDeviceConstantRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMobileDeviceConstantMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch mobile device constants.
   * </pre>
   */
  public static final class MobileDeviceConstantServiceFutureStub extends io.grpc.stub.AbstractStub<MobileDeviceConstantServiceFutureStub> {
    private MobileDeviceConstantServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MobileDeviceConstantServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MobileDeviceConstantServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MobileDeviceConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested mobile device constant in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.MobileDeviceConstant> getMobileDeviceConstant(
        com.google.ads.googleads.v2.services.GetMobileDeviceConstantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMobileDeviceConstantMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MOBILE_DEVICE_CONSTANT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MobileDeviceConstantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MobileDeviceConstantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MOBILE_DEVICE_CONSTANT:
          serviceImpl.getMobileDeviceConstant((com.google.ads.googleads.v2.services.GetMobileDeviceConstantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.MobileDeviceConstant>) responseObserver);
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

  private static abstract class MobileDeviceConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MobileDeviceConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.MobileDeviceConstantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MobileDeviceConstantService");
    }
  }

  private static final class MobileDeviceConstantServiceFileDescriptorSupplier
      extends MobileDeviceConstantServiceBaseDescriptorSupplier {
    MobileDeviceConstantServiceFileDescriptorSupplier() {}
  }

  private static final class MobileDeviceConstantServiceMethodDescriptorSupplier
      extends MobileDeviceConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MobileDeviceConstantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MobileDeviceConstantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MobileDeviceConstantServiceFileDescriptorSupplier())
              .addMethod(getGetMobileDeviceConstantMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
