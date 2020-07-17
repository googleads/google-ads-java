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
 * Service to fetch carrier constants.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/carrier_constant_service.proto")
public final class CarrierConstantServiceGrpc {

  private CarrierConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.CarrierConstantService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCarrierConstantMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCarrierConstantRequest,
      com.google.ads.googleads.v4.resources.CarrierConstant> METHOD_GET_CARRIER_CONSTANT = getGetCarrierConstantMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCarrierConstantRequest,
      com.google.ads.googleads.v4.resources.CarrierConstant> getGetCarrierConstantMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCarrierConstantRequest,
      com.google.ads.googleads.v4.resources.CarrierConstant> getGetCarrierConstantMethod() {
    return getGetCarrierConstantMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCarrierConstantRequest,
      com.google.ads.googleads.v4.resources.CarrierConstant> getGetCarrierConstantMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCarrierConstantRequest, com.google.ads.googleads.v4.resources.CarrierConstant> getGetCarrierConstantMethod;
    if ((getGetCarrierConstantMethod = CarrierConstantServiceGrpc.getGetCarrierConstantMethod) == null) {
      synchronized (CarrierConstantServiceGrpc.class) {
        if ((getGetCarrierConstantMethod = CarrierConstantServiceGrpc.getGetCarrierConstantMethod) == null) {
          CarrierConstantServiceGrpc.getGetCarrierConstantMethod = getGetCarrierConstantMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetCarrierConstantRequest, com.google.ads.googleads.v4.resources.CarrierConstant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.CarrierConstantService", "GetCarrierConstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetCarrierConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.CarrierConstant.getDefaultInstance()))
                  .setSchemaDescriptor(new CarrierConstantServiceMethodDescriptorSupplier("GetCarrierConstant"))
                  .build();
          }
        }
     }
     return getGetCarrierConstantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarrierConstantServiceStub newStub(io.grpc.Channel channel) {
    return new CarrierConstantServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarrierConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CarrierConstantServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarrierConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CarrierConstantServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch carrier constants.
   * </pre>
   */
  public static abstract class CarrierConstantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested carrier constant in full detail.
     * </pre>
     */
    public void getCarrierConstant(com.google.ads.googleads.v4.services.GetCarrierConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CarrierConstant> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCarrierConstantMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCarrierConstantMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetCarrierConstantRequest,
                com.google.ads.googleads.v4.resources.CarrierConstant>(
                  this, METHODID_GET_CARRIER_CONSTANT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch carrier constants.
   * </pre>
   */
  public static final class CarrierConstantServiceStub extends io.grpc.stub.AbstractStub<CarrierConstantServiceStub> {
    private CarrierConstantServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarrierConstantServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarrierConstantServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarrierConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested carrier constant in full detail.
     * </pre>
     */
    public void getCarrierConstant(com.google.ads.googleads.v4.services.GetCarrierConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CarrierConstant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCarrierConstantMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch carrier constants.
   * </pre>
   */
  public static final class CarrierConstantServiceBlockingStub extends io.grpc.stub.AbstractStub<CarrierConstantServiceBlockingStub> {
    private CarrierConstantServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarrierConstantServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarrierConstantServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarrierConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested carrier constant in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.CarrierConstant getCarrierConstant(com.google.ads.googleads.v4.services.GetCarrierConstantRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCarrierConstantMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch carrier constants.
   * </pre>
   */
  public static final class CarrierConstantServiceFutureStub extends io.grpc.stub.AbstractStub<CarrierConstantServiceFutureStub> {
    private CarrierConstantServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarrierConstantServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarrierConstantServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarrierConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested carrier constant in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.CarrierConstant> getCarrierConstant(
        com.google.ads.googleads.v4.services.GetCarrierConstantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCarrierConstantMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CARRIER_CONSTANT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarrierConstantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarrierConstantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CARRIER_CONSTANT:
          serviceImpl.getCarrierConstant((com.google.ads.googleads.v4.services.GetCarrierConstantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CarrierConstant>) responseObserver);
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

  private static abstract class CarrierConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarrierConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.CarrierConstantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarrierConstantService");
    }
  }

  private static final class CarrierConstantServiceFileDescriptorSupplier
      extends CarrierConstantServiceBaseDescriptorSupplier {
    CarrierConstantServiceFileDescriptorSupplier() {}
  }

  private static final class CarrierConstantServiceMethodDescriptorSupplier
      extends CarrierConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarrierConstantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CarrierConstantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarrierConstantServiceFileDescriptorSupplier())
              .addMethod(getGetCarrierConstantMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
