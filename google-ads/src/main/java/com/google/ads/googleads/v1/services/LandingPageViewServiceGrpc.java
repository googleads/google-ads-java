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
 * Service to fetch landing page views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/landing_page_view_service.proto")
public final class LandingPageViewServiceGrpc {

  private LandingPageViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.LandingPageViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetLandingPageViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetLandingPageViewRequest,
      com.google.ads.googleads.v1.resources.LandingPageView> METHOD_GET_LANDING_PAGE_VIEW = getGetLandingPageViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetLandingPageViewRequest,
      com.google.ads.googleads.v1.resources.LandingPageView> getGetLandingPageViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetLandingPageViewRequest,
      com.google.ads.googleads.v1.resources.LandingPageView> getGetLandingPageViewMethod() {
    return getGetLandingPageViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetLandingPageViewRequest,
      com.google.ads.googleads.v1.resources.LandingPageView> getGetLandingPageViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetLandingPageViewRequest, com.google.ads.googleads.v1.resources.LandingPageView> getGetLandingPageViewMethod;
    if ((getGetLandingPageViewMethod = LandingPageViewServiceGrpc.getGetLandingPageViewMethod) == null) {
      synchronized (LandingPageViewServiceGrpc.class) {
        if ((getGetLandingPageViewMethod = LandingPageViewServiceGrpc.getGetLandingPageViewMethod) == null) {
          LandingPageViewServiceGrpc.getGetLandingPageViewMethod = getGetLandingPageViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetLandingPageViewRequest, com.google.ads.googleads.v1.resources.LandingPageView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.LandingPageViewService", "GetLandingPageView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetLandingPageViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.LandingPageView.getDefaultInstance()))
                  .setSchemaDescriptor(new LandingPageViewServiceMethodDescriptorSupplier("GetLandingPageView"))
                  .build();
          }
        }
     }
     return getGetLandingPageViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LandingPageViewServiceStub newStub(io.grpc.Channel channel) {
    return new LandingPageViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LandingPageViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LandingPageViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LandingPageViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LandingPageViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch landing page views.
   * </pre>
   */
  public static abstract class LandingPageViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested landing page view in full detail.
     * </pre>
     */
    public void getLandingPageView(com.google.ads.googleads.v1.services.GetLandingPageViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.LandingPageView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLandingPageViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLandingPageViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetLandingPageViewRequest,
                com.google.ads.googleads.v1.resources.LandingPageView>(
                  this, METHODID_GET_LANDING_PAGE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch landing page views.
   * </pre>
   */
  public static final class LandingPageViewServiceStub extends io.grpc.stub.AbstractStub<LandingPageViewServiceStub> {
    private LandingPageViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LandingPageViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LandingPageViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LandingPageViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested landing page view in full detail.
     * </pre>
     */
    public void getLandingPageView(com.google.ads.googleads.v1.services.GetLandingPageViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.LandingPageView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLandingPageViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch landing page views.
   * </pre>
   */
  public static final class LandingPageViewServiceBlockingStub extends io.grpc.stub.AbstractStub<LandingPageViewServiceBlockingStub> {
    private LandingPageViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LandingPageViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LandingPageViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LandingPageViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested landing page view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.LandingPageView getLandingPageView(com.google.ads.googleads.v1.services.GetLandingPageViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLandingPageViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch landing page views.
   * </pre>
   */
  public static final class LandingPageViewServiceFutureStub extends io.grpc.stub.AbstractStub<LandingPageViewServiceFutureStub> {
    private LandingPageViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LandingPageViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LandingPageViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LandingPageViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested landing page view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.LandingPageView> getLandingPageView(
        com.google.ads.googleads.v1.services.GetLandingPageViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLandingPageViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LANDING_PAGE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LandingPageViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LandingPageViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LANDING_PAGE_VIEW:
          serviceImpl.getLandingPageView((com.google.ads.googleads.v1.services.GetLandingPageViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.LandingPageView>) responseObserver);
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

  private static abstract class LandingPageViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LandingPageViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.LandingPageViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LandingPageViewService");
    }
  }

  private static final class LandingPageViewServiceFileDescriptorSupplier
      extends LandingPageViewServiceBaseDescriptorSupplier {
    LandingPageViewServiceFileDescriptorSupplier() {}
  }

  private static final class LandingPageViewServiceMethodDescriptorSupplier
      extends LandingPageViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LandingPageViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LandingPageViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LandingPageViewServiceFileDescriptorSupplier())
              .addMethod(getGetLandingPageViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
