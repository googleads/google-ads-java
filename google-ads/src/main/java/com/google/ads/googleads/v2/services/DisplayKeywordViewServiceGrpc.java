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
 * Service to manage display keyword views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/display_keyword_view_service.proto")
public final class DisplayKeywordViewServiceGrpc {

  private DisplayKeywordViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.DisplayKeywordViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetDisplayKeywordViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetDisplayKeywordViewRequest,
      com.google.ads.googleads.v2.resources.DisplayKeywordView> METHOD_GET_DISPLAY_KEYWORD_VIEW = getGetDisplayKeywordViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetDisplayKeywordViewRequest,
      com.google.ads.googleads.v2.resources.DisplayKeywordView> getGetDisplayKeywordViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetDisplayKeywordViewRequest,
      com.google.ads.googleads.v2.resources.DisplayKeywordView> getGetDisplayKeywordViewMethod() {
    return getGetDisplayKeywordViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetDisplayKeywordViewRequest,
      com.google.ads.googleads.v2.resources.DisplayKeywordView> getGetDisplayKeywordViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetDisplayKeywordViewRequest, com.google.ads.googleads.v2.resources.DisplayKeywordView> getGetDisplayKeywordViewMethod;
    if ((getGetDisplayKeywordViewMethod = DisplayKeywordViewServiceGrpc.getGetDisplayKeywordViewMethod) == null) {
      synchronized (DisplayKeywordViewServiceGrpc.class) {
        if ((getGetDisplayKeywordViewMethod = DisplayKeywordViewServiceGrpc.getGetDisplayKeywordViewMethod) == null) {
          DisplayKeywordViewServiceGrpc.getGetDisplayKeywordViewMethod = getGetDisplayKeywordViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetDisplayKeywordViewRequest, com.google.ads.googleads.v2.resources.DisplayKeywordView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.DisplayKeywordViewService", "GetDisplayKeywordView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetDisplayKeywordViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.DisplayKeywordView.getDefaultInstance()))
                  .setSchemaDescriptor(new DisplayKeywordViewServiceMethodDescriptorSupplier("GetDisplayKeywordView"))
                  .build();
          }
        }
     }
     return getGetDisplayKeywordViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DisplayKeywordViewServiceStub newStub(io.grpc.Channel channel) {
    return new DisplayKeywordViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DisplayKeywordViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DisplayKeywordViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DisplayKeywordViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DisplayKeywordViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage display keyword views.
   * </pre>
   */
  public static abstract class DisplayKeywordViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested display keyword view in full detail.
     * </pre>
     */
    public void getDisplayKeywordView(com.google.ads.googleads.v2.services.GetDisplayKeywordViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.DisplayKeywordView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDisplayKeywordViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDisplayKeywordViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetDisplayKeywordViewRequest,
                com.google.ads.googleads.v2.resources.DisplayKeywordView>(
                  this, METHODID_GET_DISPLAY_KEYWORD_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage display keyword views.
   * </pre>
   */
  public static final class DisplayKeywordViewServiceStub extends io.grpc.stub.AbstractStub<DisplayKeywordViewServiceStub> {
    private DisplayKeywordViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DisplayKeywordViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DisplayKeywordViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DisplayKeywordViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested display keyword view in full detail.
     * </pre>
     */
    public void getDisplayKeywordView(com.google.ads.googleads.v2.services.GetDisplayKeywordViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.DisplayKeywordView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDisplayKeywordViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage display keyword views.
   * </pre>
   */
  public static final class DisplayKeywordViewServiceBlockingStub extends io.grpc.stub.AbstractStub<DisplayKeywordViewServiceBlockingStub> {
    private DisplayKeywordViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DisplayKeywordViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DisplayKeywordViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DisplayKeywordViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested display keyword view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.DisplayKeywordView getDisplayKeywordView(com.google.ads.googleads.v2.services.GetDisplayKeywordViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDisplayKeywordViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage display keyword views.
   * </pre>
   */
  public static final class DisplayKeywordViewServiceFutureStub extends io.grpc.stub.AbstractStub<DisplayKeywordViewServiceFutureStub> {
    private DisplayKeywordViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DisplayKeywordViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DisplayKeywordViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DisplayKeywordViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested display keyword view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.DisplayKeywordView> getDisplayKeywordView(
        com.google.ads.googleads.v2.services.GetDisplayKeywordViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDisplayKeywordViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DISPLAY_KEYWORD_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DisplayKeywordViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DisplayKeywordViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DISPLAY_KEYWORD_VIEW:
          serviceImpl.getDisplayKeywordView((com.google.ads.googleads.v2.services.GetDisplayKeywordViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.DisplayKeywordView>) responseObserver);
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

  private static abstract class DisplayKeywordViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DisplayKeywordViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.DisplayKeywordViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DisplayKeywordViewService");
    }
  }

  private static final class DisplayKeywordViewServiceFileDescriptorSupplier
      extends DisplayKeywordViewServiceBaseDescriptorSupplier {
    DisplayKeywordViewServiceFileDescriptorSupplier() {}
  }

  private static final class DisplayKeywordViewServiceMethodDescriptorSupplier
      extends DisplayKeywordViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DisplayKeywordViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DisplayKeywordViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DisplayKeywordViewServiceFileDescriptorSupplier())
              .addMethod(getGetDisplayKeywordViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
