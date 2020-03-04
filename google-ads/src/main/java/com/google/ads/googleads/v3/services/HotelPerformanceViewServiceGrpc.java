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
 * Service to manage Hotel Performance Views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/hotel_performance_view_service.proto")
public final class HotelPerformanceViewServiceGrpc {

  private HotelPerformanceViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.HotelPerformanceViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetHotelPerformanceViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetHotelPerformanceViewRequest,
      com.google.ads.googleads.v3.resources.HotelPerformanceView> METHOD_GET_HOTEL_PERFORMANCE_VIEW = getGetHotelPerformanceViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetHotelPerformanceViewRequest,
      com.google.ads.googleads.v3.resources.HotelPerformanceView> getGetHotelPerformanceViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetHotelPerformanceViewRequest,
      com.google.ads.googleads.v3.resources.HotelPerformanceView> getGetHotelPerformanceViewMethod() {
    return getGetHotelPerformanceViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetHotelPerformanceViewRequest,
      com.google.ads.googleads.v3.resources.HotelPerformanceView> getGetHotelPerformanceViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetHotelPerformanceViewRequest, com.google.ads.googleads.v3.resources.HotelPerformanceView> getGetHotelPerformanceViewMethod;
    if ((getGetHotelPerformanceViewMethod = HotelPerformanceViewServiceGrpc.getGetHotelPerformanceViewMethod) == null) {
      synchronized (HotelPerformanceViewServiceGrpc.class) {
        if ((getGetHotelPerformanceViewMethod = HotelPerformanceViewServiceGrpc.getGetHotelPerformanceViewMethod) == null) {
          HotelPerformanceViewServiceGrpc.getGetHotelPerformanceViewMethod = getGetHotelPerformanceViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetHotelPerformanceViewRequest, com.google.ads.googleads.v3.resources.HotelPerformanceView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.HotelPerformanceViewService", "GetHotelPerformanceView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetHotelPerformanceViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.HotelPerformanceView.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelPerformanceViewServiceMethodDescriptorSupplier("GetHotelPerformanceView"))
                  .build();
          }
        }
     }
     return getGetHotelPerformanceViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelPerformanceViewServiceStub newStub(io.grpc.Channel channel) {
    return new HotelPerformanceViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelPerformanceViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HotelPerformanceViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelPerformanceViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HotelPerformanceViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage Hotel Performance Views.
   * </pre>
   */
  public static abstract class HotelPerformanceViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Hotel Performance View in full detail.
     * </pre>
     */
    public void getHotelPerformanceView(com.google.ads.googleads.v3.services.GetHotelPerformanceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.HotelPerformanceView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHotelPerformanceViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHotelPerformanceViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetHotelPerformanceViewRequest,
                com.google.ads.googleads.v3.resources.HotelPerformanceView>(
                  this, METHODID_GET_HOTEL_PERFORMANCE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Hotel Performance Views.
   * </pre>
   */
  public static final class HotelPerformanceViewServiceStub extends io.grpc.stub.AbstractStub<HotelPerformanceViewServiceStub> {
    private HotelPerformanceViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelPerformanceViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelPerformanceViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelPerformanceViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Hotel Performance View in full detail.
     * </pre>
     */
    public void getHotelPerformanceView(com.google.ads.googleads.v3.services.GetHotelPerformanceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.HotelPerformanceView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHotelPerformanceViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Hotel Performance Views.
   * </pre>
   */
  public static final class HotelPerformanceViewServiceBlockingStub extends io.grpc.stub.AbstractStub<HotelPerformanceViewServiceBlockingStub> {
    private HotelPerformanceViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelPerformanceViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelPerformanceViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelPerformanceViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Hotel Performance View in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.HotelPerformanceView getHotelPerformanceView(com.google.ads.googleads.v3.services.GetHotelPerformanceViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHotelPerformanceViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Hotel Performance Views.
   * </pre>
   */
  public static final class HotelPerformanceViewServiceFutureStub extends io.grpc.stub.AbstractStub<HotelPerformanceViewServiceFutureStub> {
    private HotelPerformanceViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelPerformanceViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelPerformanceViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelPerformanceViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Hotel Performance View in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.HotelPerformanceView> getHotelPerformanceView(
        com.google.ads.googleads.v3.services.GetHotelPerformanceViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHotelPerformanceViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HOTEL_PERFORMANCE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HotelPerformanceViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HotelPerformanceViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HOTEL_PERFORMANCE_VIEW:
          serviceImpl.getHotelPerformanceView((com.google.ads.googleads.v3.services.GetHotelPerformanceViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.HotelPerformanceView>) responseObserver);
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

  private static abstract class HotelPerformanceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelPerformanceViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.HotelPerformanceViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelPerformanceViewService");
    }
  }

  private static final class HotelPerformanceViewServiceFileDescriptorSupplier
      extends HotelPerformanceViewServiceBaseDescriptorSupplier {
    HotelPerformanceViewServiceFileDescriptorSupplier() {}
  }

  private static final class HotelPerformanceViewServiceMethodDescriptorSupplier
      extends HotelPerformanceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HotelPerformanceViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HotelPerformanceViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelPerformanceViewServiceFileDescriptorSupplier())
              .addMethod(getGetHotelPerformanceViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
