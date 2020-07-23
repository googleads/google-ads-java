package com.google.ads.googleads.v3.services;

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
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v3/services/mobile_device_constant_service.proto")
public final class MobileDeviceConstantServiceGrpc {

  private MobileDeviceConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.MobileDeviceConstantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetMobileDeviceConstantRequest,
      com.google.ads.googleads.v3.resources.MobileDeviceConstant> getGetMobileDeviceConstantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMobileDeviceConstant",
      requestType = com.google.ads.googleads.v3.services.GetMobileDeviceConstantRequest.class,
      responseType = com.google.ads.googleads.v3.resources.MobileDeviceConstant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetMobileDeviceConstantRequest,
      com.google.ads.googleads.v3.resources.MobileDeviceConstant> getGetMobileDeviceConstantMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetMobileDeviceConstantRequest, com.google.ads.googleads.v3.resources.MobileDeviceConstant> getGetMobileDeviceConstantMethod;
    if ((getGetMobileDeviceConstantMethod = MobileDeviceConstantServiceGrpc.getGetMobileDeviceConstantMethod) == null) {
      synchronized (MobileDeviceConstantServiceGrpc.class) {
        if ((getGetMobileDeviceConstantMethod = MobileDeviceConstantServiceGrpc.getGetMobileDeviceConstantMethod) == null) {
          MobileDeviceConstantServiceGrpc.getGetMobileDeviceConstantMethod = getGetMobileDeviceConstantMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetMobileDeviceConstantRequest, com.google.ads.googleads.v3.resources.MobileDeviceConstant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMobileDeviceConstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetMobileDeviceConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.MobileDeviceConstant.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<MobileDeviceConstantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MobileDeviceConstantServiceStub>() {
        @java.lang.Override
        public MobileDeviceConstantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MobileDeviceConstantServiceStub(channel, callOptions);
        }
      };
    return MobileDeviceConstantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MobileDeviceConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MobileDeviceConstantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MobileDeviceConstantServiceBlockingStub>() {
        @java.lang.Override
        public MobileDeviceConstantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MobileDeviceConstantServiceBlockingStub(channel, callOptions);
        }
      };
    return MobileDeviceConstantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MobileDeviceConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MobileDeviceConstantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MobileDeviceConstantServiceFutureStub>() {
        @java.lang.Override
        public MobileDeviceConstantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MobileDeviceConstantServiceFutureStub(channel, callOptions);
        }
      };
    return MobileDeviceConstantServiceFutureStub.newStub(factory, channel);
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
    public void getMobileDeviceConstant(com.google.ads.googleads.v3.services.GetMobileDeviceConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.MobileDeviceConstant> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMobileDeviceConstantMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMobileDeviceConstantMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetMobileDeviceConstantRequest,
                com.google.ads.googleads.v3.resources.MobileDeviceConstant>(
                  this, METHODID_GET_MOBILE_DEVICE_CONSTANT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch mobile device constants.
   * </pre>
   */
  public static final class MobileDeviceConstantServiceStub extends io.grpc.stub.AbstractAsyncStub<MobileDeviceConstantServiceStub> {
    private MobileDeviceConstantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MobileDeviceConstantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MobileDeviceConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested mobile device constant in full detail.
     * </pre>
     */
    public void getMobileDeviceConstant(com.google.ads.googleads.v3.services.GetMobileDeviceConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.MobileDeviceConstant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMobileDeviceConstantMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch mobile device constants.
   * </pre>
   */
  public static final class MobileDeviceConstantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MobileDeviceConstantServiceBlockingStub> {
    private MobileDeviceConstantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MobileDeviceConstantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MobileDeviceConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested mobile device constant in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.MobileDeviceConstant getMobileDeviceConstant(com.google.ads.googleads.v3.services.GetMobileDeviceConstantRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMobileDeviceConstantMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch mobile device constants.
   * </pre>
   */
  public static final class MobileDeviceConstantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MobileDeviceConstantServiceFutureStub> {
    private MobileDeviceConstantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MobileDeviceConstantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MobileDeviceConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested mobile device constant in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.MobileDeviceConstant> getMobileDeviceConstant(
        com.google.ads.googleads.v3.services.GetMobileDeviceConstantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMobileDeviceConstantMethod(), getCallOptions()), request);
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
          serviceImpl.getMobileDeviceConstant((com.google.ads.googleads.v3.services.GetMobileDeviceConstantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.MobileDeviceConstant>) responseObserver);
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
      return com.google.ads.googleads.v3.services.MobileDeviceConstantServiceProto.getDescriptor();
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
              .addMethod(getGetMobileDeviceConstantMethod())
              .build();
        }
      }
    }
    return result;
  }
}
