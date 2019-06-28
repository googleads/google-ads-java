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
 * Service to fetch ad schedule views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/ad_schedule_view_service.proto")
public final class AdScheduleViewServiceGrpc {

  private AdScheduleViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.AdScheduleViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAdScheduleViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAdScheduleViewRequest,
      com.google.ads.googleads.v2.resources.AdScheduleView> METHOD_GET_AD_SCHEDULE_VIEW = getGetAdScheduleViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAdScheduleViewRequest,
      com.google.ads.googleads.v2.resources.AdScheduleView> getGetAdScheduleViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAdScheduleViewRequest,
      com.google.ads.googleads.v2.resources.AdScheduleView> getGetAdScheduleViewMethod() {
    return getGetAdScheduleViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAdScheduleViewRequest,
      com.google.ads.googleads.v2.resources.AdScheduleView> getGetAdScheduleViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAdScheduleViewRequest, com.google.ads.googleads.v2.resources.AdScheduleView> getGetAdScheduleViewMethod;
    if ((getGetAdScheduleViewMethod = AdScheduleViewServiceGrpc.getGetAdScheduleViewMethod) == null) {
      synchronized (AdScheduleViewServiceGrpc.class) {
        if ((getGetAdScheduleViewMethod = AdScheduleViewServiceGrpc.getGetAdScheduleViewMethod) == null) {
          AdScheduleViewServiceGrpc.getGetAdScheduleViewMethod = getGetAdScheduleViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetAdScheduleViewRequest, com.google.ads.googleads.v2.resources.AdScheduleView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.AdScheduleViewService", "GetAdScheduleView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetAdScheduleViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.AdScheduleView.getDefaultInstance()))
                  .setSchemaDescriptor(new AdScheduleViewServiceMethodDescriptorSupplier("GetAdScheduleView"))
                  .build();
          }
        }
     }
     return getGetAdScheduleViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdScheduleViewServiceStub newStub(io.grpc.Channel channel) {
    return new AdScheduleViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdScheduleViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdScheduleViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdScheduleViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdScheduleViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch ad schedule views.
   * </pre>
   */
  public static abstract class AdScheduleViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad schedule view in full detail.
     * </pre>
     */
    public void getAdScheduleView(com.google.ads.googleads.v2.services.GetAdScheduleViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.AdScheduleView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdScheduleViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdScheduleViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetAdScheduleViewRequest,
                com.google.ads.googleads.v2.resources.AdScheduleView>(
                  this, METHODID_GET_AD_SCHEDULE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch ad schedule views.
   * </pre>
   */
  public static final class AdScheduleViewServiceStub extends io.grpc.stub.AbstractStub<AdScheduleViewServiceStub> {
    private AdScheduleViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdScheduleViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdScheduleViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdScheduleViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad schedule view in full detail.
     * </pre>
     */
    public void getAdScheduleView(com.google.ads.googleads.v2.services.GetAdScheduleViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.AdScheduleView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdScheduleViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch ad schedule views.
   * </pre>
   */
  public static final class AdScheduleViewServiceBlockingStub extends io.grpc.stub.AbstractStub<AdScheduleViewServiceBlockingStub> {
    private AdScheduleViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdScheduleViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdScheduleViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdScheduleViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad schedule view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.AdScheduleView getAdScheduleView(com.google.ads.googleads.v2.services.GetAdScheduleViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdScheduleViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch ad schedule views.
   * </pre>
   */
  public static final class AdScheduleViewServiceFutureStub extends io.grpc.stub.AbstractStub<AdScheduleViewServiceFutureStub> {
    private AdScheduleViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdScheduleViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdScheduleViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdScheduleViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad schedule view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.AdScheduleView> getAdScheduleView(
        com.google.ads.googleads.v2.services.GetAdScheduleViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdScheduleViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_SCHEDULE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdScheduleViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdScheduleViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_SCHEDULE_VIEW:
          serviceImpl.getAdScheduleView((com.google.ads.googleads.v2.services.GetAdScheduleViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.AdScheduleView>) responseObserver);
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

  private static abstract class AdScheduleViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdScheduleViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.AdScheduleViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdScheduleViewService");
    }
  }

  private static final class AdScheduleViewServiceFileDescriptorSupplier
      extends AdScheduleViewServiceBaseDescriptorSupplier {
    AdScheduleViewServiceFileDescriptorSupplier() {}
  }

  private static final class AdScheduleViewServiceMethodDescriptorSupplier
      extends AdScheduleViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdScheduleViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdScheduleViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdScheduleViewServiceFileDescriptorSupplier())
              .addMethod(getGetAdScheduleViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
