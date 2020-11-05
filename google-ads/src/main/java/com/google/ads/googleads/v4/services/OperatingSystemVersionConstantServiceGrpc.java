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
 * Service to fetch Operating System Version constants.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v4/services/operating_system_version_constant_service.proto")
public final class OperatingSystemVersionConstantServiceGrpc {

  private OperatingSystemVersionConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.OperatingSystemVersionConstantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetOperatingSystemVersionConstantRequest,
      com.google.ads.googleads.v4.resources.OperatingSystemVersionConstant> getGetOperatingSystemVersionConstantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOperatingSystemVersionConstant",
      requestType = com.google.ads.googleads.v4.services.GetOperatingSystemVersionConstantRequest.class,
      responseType = com.google.ads.googleads.v4.resources.OperatingSystemVersionConstant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetOperatingSystemVersionConstantRequest,
      com.google.ads.googleads.v4.resources.OperatingSystemVersionConstant> getGetOperatingSystemVersionConstantMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetOperatingSystemVersionConstantRequest, com.google.ads.googleads.v4.resources.OperatingSystemVersionConstant> getGetOperatingSystemVersionConstantMethod;
    if ((getGetOperatingSystemVersionConstantMethod = OperatingSystemVersionConstantServiceGrpc.getGetOperatingSystemVersionConstantMethod) == null) {
      synchronized (OperatingSystemVersionConstantServiceGrpc.class) {
        if ((getGetOperatingSystemVersionConstantMethod = OperatingSystemVersionConstantServiceGrpc.getGetOperatingSystemVersionConstantMethod) == null) {
          OperatingSystemVersionConstantServiceGrpc.getGetOperatingSystemVersionConstantMethod = getGetOperatingSystemVersionConstantMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetOperatingSystemVersionConstantRequest, com.google.ads.googleads.v4.resources.OperatingSystemVersionConstant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOperatingSystemVersionConstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetOperatingSystemVersionConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.OperatingSystemVersionConstant.getDefaultInstance()))
              .setSchemaDescriptor(new OperatingSystemVersionConstantServiceMethodDescriptorSupplier("GetOperatingSystemVersionConstant"))
              .build();
        }
      }
    }
    return getGetOperatingSystemVersionConstantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OperatingSystemVersionConstantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperatingSystemVersionConstantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperatingSystemVersionConstantServiceStub>() {
        @java.lang.Override
        public OperatingSystemVersionConstantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperatingSystemVersionConstantServiceStub(channel, callOptions);
        }
      };
    return OperatingSystemVersionConstantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OperatingSystemVersionConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperatingSystemVersionConstantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperatingSystemVersionConstantServiceBlockingStub>() {
        @java.lang.Override
        public OperatingSystemVersionConstantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperatingSystemVersionConstantServiceBlockingStub(channel, callOptions);
        }
      };
    return OperatingSystemVersionConstantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OperatingSystemVersionConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperatingSystemVersionConstantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperatingSystemVersionConstantServiceFutureStub>() {
        @java.lang.Override
        public OperatingSystemVersionConstantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperatingSystemVersionConstantServiceFutureStub(channel, callOptions);
        }
      };
    return OperatingSystemVersionConstantServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch Operating System Version constants.
   * </pre>
   */
  public static abstract class OperatingSystemVersionConstantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested OS version constant in full detail.
     * </pre>
     */
    public void getOperatingSystemVersionConstant(com.google.ads.googleads.v4.services.GetOperatingSystemVersionConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.OperatingSystemVersionConstant> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOperatingSystemVersionConstantMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetOperatingSystemVersionConstantMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetOperatingSystemVersionConstantRequest,
                com.google.ads.googleads.v4.resources.OperatingSystemVersionConstant>(
                  this, METHODID_GET_OPERATING_SYSTEM_VERSION_CONSTANT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch Operating System Version constants.
   * </pre>
   */
  public static final class OperatingSystemVersionConstantServiceStub extends io.grpc.stub.AbstractAsyncStub<OperatingSystemVersionConstantServiceStub> {
    private OperatingSystemVersionConstantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperatingSystemVersionConstantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperatingSystemVersionConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested OS version constant in full detail.
     * </pre>
     */
    public void getOperatingSystemVersionConstant(com.google.ads.googleads.v4.services.GetOperatingSystemVersionConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.OperatingSystemVersionConstant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOperatingSystemVersionConstantMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch Operating System Version constants.
   * </pre>
   */
  public static final class OperatingSystemVersionConstantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OperatingSystemVersionConstantServiceBlockingStub> {
    private OperatingSystemVersionConstantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperatingSystemVersionConstantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperatingSystemVersionConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested OS version constant in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.OperatingSystemVersionConstant getOperatingSystemVersionConstant(com.google.ads.googleads.v4.services.GetOperatingSystemVersionConstantRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOperatingSystemVersionConstantMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch Operating System Version constants.
   * </pre>
   */
  public static final class OperatingSystemVersionConstantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OperatingSystemVersionConstantServiceFutureStub> {
    private OperatingSystemVersionConstantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperatingSystemVersionConstantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperatingSystemVersionConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested OS version constant in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.OperatingSystemVersionConstant> getOperatingSystemVersionConstant(
        com.google.ads.googleads.v4.services.GetOperatingSystemVersionConstantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOperatingSystemVersionConstantMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OPERATING_SYSTEM_VERSION_CONSTANT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OperatingSystemVersionConstantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OperatingSystemVersionConstantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_OPERATING_SYSTEM_VERSION_CONSTANT:
          serviceImpl.getOperatingSystemVersionConstant((com.google.ads.googleads.v4.services.GetOperatingSystemVersionConstantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.OperatingSystemVersionConstant>) responseObserver);
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

  private static abstract class OperatingSystemVersionConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OperatingSystemVersionConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.OperatingSystemVersionConstantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OperatingSystemVersionConstantService");
    }
  }

  private static final class OperatingSystemVersionConstantServiceFileDescriptorSupplier
      extends OperatingSystemVersionConstantServiceBaseDescriptorSupplier {
    OperatingSystemVersionConstantServiceFileDescriptorSupplier() {}
  }

  private static final class OperatingSystemVersionConstantServiceMethodDescriptorSupplier
      extends OperatingSystemVersionConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OperatingSystemVersionConstantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OperatingSystemVersionConstantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OperatingSystemVersionConstantServiceFileDescriptorSupplier())
              .addMethod(getGetOperatingSystemVersionConstantMethod())
              .build();
        }
      }
    }
    return result;
  }
}
