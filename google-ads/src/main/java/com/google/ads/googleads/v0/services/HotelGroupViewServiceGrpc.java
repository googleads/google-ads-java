package com.google.ads.googleads.v0.services;

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
 * Service to manage Hotel Group Views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v0/services/hotel_group_view_service.proto")
public final class HotelGroupViewServiceGrpc {

  private HotelGroupViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.HotelGroupViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetHotelGroupViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetHotelGroupViewRequest,
      com.google.ads.googleads.v0.resources.HotelGroupView> METHOD_GET_HOTEL_GROUP_VIEW = getGetHotelGroupViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetHotelGroupViewRequest,
      com.google.ads.googleads.v0.resources.HotelGroupView> getGetHotelGroupViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetHotelGroupViewRequest,
      com.google.ads.googleads.v0.resources.HotelGroupView> getGetHotelGroupViewMethod() {
    return getGetHotelGroupViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetHotelGroupViewRequest,
      com.google.ads.googleads.v0.resources.HotelGroupView> getGetHotelGroupViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetHotelGroupViewRequest, com.google.ads.googleads.v0.resources.HotelGroupView> getGetHotelGroupViewMethod;
    if ((getGetHotelGroupViewMethod = HotelGroupViewServiceGrpc.getGetHotelGroupViewMethod) == null) {
      synchronized (HotelGroupViewServiceGrpc.class) {
        if ((getGetHotelGroupViewMethod = HotelGroupViewServiceGrpc.getGetHotelGroupViewMethod) == null) {
          HotelGroupViewServiceGrpc.getGetHotelGroupViewMethod = getGetHotelGroupViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.GetHotelGroupViewRequest, com.google.ads.googleads.v0.resources.HotelGroupView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.HotelGroupViewService", "GetHotelGroupView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.GetHotelGroupViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.resources.HotelGroupView.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelGroupViewServiceMethodDescriptorSupplier("GetHotelGroupView"))
                  .build();
          }
        }
     }
     return getGetHotelGroupViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelGroupViewServiceStub newStub(io.grpc.Channel channel) {
    return new HotelGroupViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelGroupViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HotelGroupViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelGroupViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HotelGroupViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage Hotel Group Views.
   * </pre>
   */
  public static abstract class HotelGroupViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Hotel Group View in full detail.
     * </pre>
     */
    public void getHotelGroupView(com.google.ads.googleads.v0.services.GetHotelGroupViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.HotelGroupView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHotelGroupViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHotelGroupViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetHotelGroupViewRequest,
                com.google.ads.googleads.v0.resources.HotelGroupView>(
                  this, METHODID_GET_HOTEL_GROUP_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Hotel Group Views.
   * </pre>
   */
  public static final class HotelGroupViewServiceStub extends io.grpc.stub.AbstractStub<HotelGroupViewServiceStub> {
    private HotelGroupViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelGroupViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelGroupViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelGroupViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Hotel Group View in full detail.
     * </pre>
     */
    public void getHotelGroupView(com.google.ads.googleads.v0.services.GetHotelGroupViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.HotelGroupView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHotelGroupViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Hotel Group Views.
   * </pre>
   */
  public static final class HotelGroupViewServiceBlockingStub extends io.grpc.stub.AbstractStub<HotelGroupViewServiceBlockingStub> {
    private HotelGroupViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelGroupViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelGroupViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelGroupViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Hotel Group View in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.HotelGroupView getHotelGroupView(com.google.ads.googleads.v0.services.GetHotelGroupViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHotelGroupViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Hotel Group Views.
   * </pre>
   */
  public static final class HotelGroupViewServiceFutureStub extends io.grpc.stub.AbstractStub<HotelGroupViewServiceFutureStub> {
    private HotelGroupViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelGroupViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelGroupViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelGroupViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Hotel Group View in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.HotelGroupView> getHotelGroupView(
        com.google.ads.googleads.v0.services.GetHotelGroupViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHotelGroupViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HOTEL_GROUP_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HotelGroupViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HotelGroupViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HOTEL_GROUP_VIEW:
          serviceImpl.getHotelGroupView((com.google.ads.googleads.v0.services.GetHotelGroupViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.HotelGroupView>) responseObserver);
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

  private static abstract class HotelGroupViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelGroupViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.HotelGroupViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelGroupViewService");
    }
  }

  private static final class HotelGroupViewServiceFileDescriptorSupplier
      extends HotelGroupViewServiceBaseDescriptorSupplier {
    HotelGroupViewServiceFileDescriptorSupplier() {}
  }

  private static final class HotelGroupViewServiceMethodDescriptorSupplier
      extends HotelGroupViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HotelGroupViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HotelGroupViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelGroupViewServiceFileDescriptorSupplier())
              .addMethod(getGetHotelGroupViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
