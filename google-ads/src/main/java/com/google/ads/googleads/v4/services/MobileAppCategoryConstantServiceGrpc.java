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
 * Service to fetch mobile app category constants.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/mobile_app_category_constant_service.proto")
public final class MobileAppCategoryConstantServiceGrpc {

  private MobileAppCategoryConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.MobileAppCategoryConstantService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetMobileAppCategoryConstantMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetMobileAppCategoryConstantRequest,
      com.google.ads.googleads.v4.resources.MobileAppCategoryConstant> METHOD_GET_MOBILE_APP_CATEGORY_CONSTANT = getGetMobileAppCategoryConstantMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetMobileAppCategoryConstantRequest,
      com.google.ads.googleads.v4.resources.MobileAppCategoryConstant> getGetMobileAppCategoryConstantMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetMobileAppCategoryConstantRequest,
      com.google.ads.googleads.v4.resources.MobileAppCategoryConstant> getGetMobileAppCategoryConstantMethod() {
    return getGetMobileAppCategoryConstantMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetMobileAppCategoryConstantRequest,
      com.google.ads.googleads.v4.resources.MobileAppCategoryConstant> getGetMobileAppCategoryConstantMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetMobileAppCategoryConstantRequest, com.google.ads.googleads.v4.resources.MobileAppCategoryConstant> getGetMobileAppCategoryConstantMethod;
    if ((getGetMobileAppCategoryConstantMethod = MobileAppCategoryConstantServiceGrpc.getGetMobileAppCategoryConstantMethod) == null) {
      synchronized (MobileAppCategoryConstantServiceGrpc.class) {
        if ((getGetMobileAppCategoryConstantMethod = MobileAppCategoryConstantServiceGrpc.getGetMobileAppCategoryConstantMethod) == null) {
          MobileAppCategoryConstantServiceGrpc.getGetMobileAppCategoryConstantMethod = getGetMobileAppCategoryConstantMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetMobileAppCategoryConstantRequest, com.google.ads.googleads.v4.resources.MobileAppCategoryConstant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.MobileAppCategoryConstantService", "GetMobileAppCategoryConstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetMobileAppCategoryConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.MobileAppCategoryConstant.getDefaultInstance()))
                  .setSchemaDescriptor(new MobileAppCategoryConstantServiceMethodDescriptorSupplier("GetMobileAppCategoryConstant"))
                  .build();
          }
        }
     }
     return getGetMobileAppCategoryConstantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MobileAppCategoryConstantServiceStub newStub(io.grpc.Channel channel) {
    return new MobileAppCategoryConstantServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MobileAppCategoryConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MobileAppCategoryConstantServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MobileAppCategoryConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MobileAppCategoryConstantServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch mobile app category constants.
   * </pre>
   */
  public static abstract class MobileAppCategoryConstantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested mobile app category constant.
     * </pre>
     */
    public void getMobileAppCategoryConstant(com.google.ads.googleads.v4.services.GetMobileAppCategoryConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.MobileAppCategoryConstant> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMobileAppCategoryConstantMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMobileAppCategoryConstantMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetMobileAppCategoryConstantRequest,
                com.google.ads.googleads.v4.resources.MobileAppCategoryConstant>(
                  this, METHODID_GET_MOBILE_APP_CATEGORY_CONSTANT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch mobile app category constants.
   * </pre>
   */
  public static final class MobileAppCategoryConstantServiceStub extends io.grpc.stub.AbstractStub<MobileAppCategoryConstantServiceStub> {
    private MobileAppCategoryConstantServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MobileAppCategoryConstantServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MobileAppCategoryConstantServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MobileAppCategoryConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested mobile app category constant.
     * </pre>
     */
    public void getMobileAppCategoryConstant(com.google.ads.googleads.v4.services.GetMobileAppCategoryConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.MobileAppCategoryConstant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMobileAppCategoryConstantMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch mobile app category constants.
   * </pre>
   */
  public static final class MobileAppCategoryConstantServiceBlockingStub extends io.grpc.stub.AbstractStub<MobileAppCategoryConstantServiceBlockingStub> {
    private MobileAppCategoryConstantServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MobileAppCategoryConstantServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MobileAppCategoryConstantServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MobileAppCategoryConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested mobile app category constant.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.MobileAppCategoryConstant getMobileAppCategoryConstant(com.google.ads.googleads.v4.services.GetMobileAppCategoryConstantRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMobileAppCategoryConstantMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch mobile app category constants.
   * </pre>
   */
  public static final class MobileAppCategoryConstantServiceFutureStub extends io.grpc.stub.AbstractStub<MobileAppCategoryConstantServiceFutureStub> {
    private MobileAppCategoryConstantServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MobileAppCategoryConstantServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MobileAppCategoryConstantServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MobileAppCategoryConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested mobile app category constant.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.MobileAppCategoryConstant> getMobileAppCategoryConstant(
        com.google.ads.googleads.v4.services.GetMobileAppCategoryConstantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMobileAppCategoryConstantMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MOBILE_APP_CATEGORY_CONSTANT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MobileAppCategoryConstantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MobileAppCategoryConstantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MOBILE_APP_CATEGORY_CONSTANT:
          serviceImpl.getMobileAppCategoryConstant((com.google.ads.googleads.v4.services.GetMobileAppCategoryConstantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.MobileAppCategoryConstant>) responseObserver);
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

  private static abstract class MobileAppCategoryConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MobileAppCategoryConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.MobileAppCategoryConstantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MobileAppCategoryConstantService");
    }
  }

  private static final class MobileAppCategoryConstantServiceFileDescriptorSupplier
      extends MobileAppCategoryConstantServiceBaseDescriptorSupplier {
    MobileAppCategoryConstantServiceFileDescriptorSupplier() {}
  }

  private static final class MobileAppCategoryConstantServiceMethodDescriptorSupplier
      extends MobileAppCategoryConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MobileAppCategoryConstantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MobileAppCategoryConstantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MobileAppCategoryConstantServiceFileDescriptorSupplier())
              .addMethod(getGetMobileAppCategoryConstantMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
