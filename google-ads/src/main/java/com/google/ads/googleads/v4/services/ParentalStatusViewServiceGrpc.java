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
 * Service to manage parental status views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/parental_status_view_service.proto")
public final class ParentalStatusViewServiceGrpc {

  private ParentalStatusViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.ParentalStatusViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetParentalStatusViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetParentalStatusViewRequest,
      com.google.ads.googleads.v4.resources.ParentalStatusView> METHOD_GET_PARENTAL_STATUS_VIEW = getGetParentalStatusViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetParentalStatusViewRequest,
      com.google.ads.googleads.v4.resources.ParentalStatusView> getGetParentalStatusViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetParentalStatusViewRequest,
      com.google.ads.googleads.v4.resources.ParentalStatusView> getGetParentalStatusViewMethod() {
    return getGetParentalStatusViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetParentalStatusViewRequest,
      com.google.ads.googleads.v4.resources.ParentalStatusView> getGetParentalStatusViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetParentalStatusViewRequest, com.google.ads.googleads.v4.resources.ParentalStatusView> getGetParentalStatusViewMethod;
    if ((getGetParentalStatusViewMethod = ParentalStatusViewServiceGrpc.getGetParentalStatusViewMethod) == null) {
      synchronized (ParentalStatusViewServiceGrpc.class) {
        if ((getGetParentalStatusViewMethod = ParentalStatusViewServiceGrpc.getGetParentalStatusViewMethod) == null) {
          ParentalStatusViewServiceGrpc.getGetParentalStatusViewMethod = getGetParentalStatusViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetParentalStatusViewRequest, com.google.ads.googleads.v4.resources.ParentalStatusView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.ParentalStatusViewService", "GetParentalStatusView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetParentalStatusViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.ParentalStatusView.getDefaultInstance()))
                  .setSchemaDescriptor(new ParentalStatusViewServiceMethodDescriptorSupplier("GetParentalStatusView"))
                  .build();
          }
        }
     }
     return getGetParentalStatusViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParentalStatusViewServiceStub newStub(io.grpc.Channel channel) {
    return new ParentalStatusViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParentalStatusViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ParentalStatusViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParentalStatusViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ParentalStatusViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage parental status views.
   * </pre>
   */
  public static abstract class ParentalStatusViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested parental status view in full detail.
     * </pre>
     */
    public void getParentalStatusView(com.google.ads.googleads.v4.services.GetParentalStatusViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.ParentalStatusView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetParentalStatusViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetParentalStatusViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetParentalStatusViewRequest,
                com.google.ads.googleads.v4.resources.ParentalStatusView>(
                  this, METHODID_GET_PARENTAL_STATUS_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage parental status views.
   * </pre>
   */
  public static final class ParentalStatusViewServiceStub extends io.grpc.stub.AbstractStub<ParentalStatusViewServiceStub> {
    private ParentalStatusViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParentalStatusViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParentalStatusViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParentalStatusViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested parental status view in full detail.
     * </pre>
     */
    public void getParentalStatusView(com.google.ads.googleads.v4.services.GetParentalStatusViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.ParentalStatusView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetParentalStatusViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage parental status views.
   * </pre>
   */
  public static final class ParentalStatusViewServiceBlockingStub extends io.grpc.stub.AbstractStub<ParentalStatusViewServiceBlockingStub> {
    private ParentalStatusViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParentalStatusViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParentalStatusViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParentalStatusViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested parental status view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.ParentalStatusView getParentalStatusView(com.google.ads.googleads.v4.services.GetParentalStatusViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetParentalStatusViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage parental status views.
   * </pre>
   */
  public static final class ParentalStatusViewServiceFutureStub extends io.grpc.stub.AbstractStub<ParentalStatusViewServiceFutureStub> {
    private ParentalStatusViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParentalStatusViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParentalStatusViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParentalStatusViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested parental status view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.ParentalStatusView> getParentalStatusView(
        com.google.ads.googleads.v4.services.GetParentalStatusViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetParentalStatusViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PARENTAL_STATUS_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParentalStatusViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ParentalStatusViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PARENTAL_STATUS_VIEW:
          serviceImpl.getParentalStatusView((com.google.ads.googleads.v4.services.GetParentalStatusViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.ParentalStatusView>) responseObserver);
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

  private static abstract class ParentalStatusViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParentalStatusViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.ParentalStatusViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParentalStatusViewService");
    }
  }

  private static final class ParentalStatusViewServiceFileDescriptorSupplier
      extends ParentalStatusViewServiceBaseDescriptorSupplier {
    ParentalStatusViewServiceFileDescriptorSupplier() {}
  }

  private static final class ParentalStatusViewServiceMethodDescriptorSupplier
      extends ParentalStatusViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParentalStatusViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ParentalStatusViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParentalStatusViewServiceFileDescriptorSupplier())
              .addMethod(getGetParentalStatusViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
