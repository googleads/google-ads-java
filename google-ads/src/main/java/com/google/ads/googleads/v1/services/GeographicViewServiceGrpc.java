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
 * Service to manage geographic views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/geographic_view_service.proto")
public final class GeographicViewServiceGrpc {

  private GeographicViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.GeographicViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetGeographicViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetGeographicViewRequest,
      com.google.ads.googleads.v1.resources.GeographicView> METHOD_GET_GEOGRAPHIC_VIEW = getGetGeographicViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetGeographicViewRequest,
      com.google.ads.googleads.v1.resources.GeographicView> getGetGeographicViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetGeographicViewRequest,
      com.google.ads.googleads.v1.resources.GeographicView> getGetGeographicViewMethod() {
    return getGetGeographicViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetGeographicViewRequest,
      com.google.ads.googleads.v1.resources.GeographicView> getGetGeographicViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetGeographicViewRequest, com.google.ads.googleads.v1.resources.GeographicView> getGetGeographicViewMethod;
    if ((getGetGeographicViewMethod = GeographicViewServiceGrpc.getGetGeographicViewMethod) == null) {
      synchronized (GeographicViewServiceGrpc.class) {
        if ((getGetGeographicViewMethod = GeographicViewServiceGrpc.getGetGeographicViewMethod) == null) {
          GeographicViewServiceGrpc.getGetGeographicViewMethod = getGetGeographicViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetGeographicViewRequest, com.google.ads.googleads.v1.resources.GeographicView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.GeographicViewService", "GetGeographicView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetGeographicViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.GeographicView.getDefaultInstance()))
                  .setSchemaDescriptor(new GeographicViewServiceMethodDescriptorSupplier("GetGeographicView"))
                  .build();
          }
        }
     }
     return getGetGeographicViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GeographicViewServiceStub newStub(io.grpc.Channel channel) {
    return new GeographicViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GeographicViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GeographicViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GeographicViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GeographicViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage geographic views.
   * </pre>
   */
  public static abstract class GeographicViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested geographic view in full detail.
     * </pre>
     */
    public void getGeographicView(com.google.ads.googleads.v1.services.GetGeographicViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.GeographicView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGeographicViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGeographicViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetGeographicViewRequest,
                com.google.ads.googleads.v1.resources.GeographicView>(
                  this, METHODID_GET_GEOGRAPHIC_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage geographic views.
   * </pre>
   */
  public static final class GeographicViewServiceStub extends io.grpc.stub.AbstractStub<GeographicViewServiceStub> {
    private GeographicViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GeographicViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeographicViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GeographicViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested geographic view in full detail.
     * </pre>
     */
    public void getGeographicView(com.google.ads.googleads.v1.services.GetGeographicViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.GeographicView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGeographicViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage geographic views.
   * </pre>
   */
  public static final class GeographicViewServiceBlockingStub extends io.grpc.stub.AbstractStub<GeographicViewServiceBlockingStub> {
    private GeographicViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GeographicViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeographicViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GeographicViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested geographic view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.GeographicView getGeographicView(com.google.ads.googleads.v1.services.GetGeographicViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGeographicViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage geographic views.
   * </pre>
   */
  public static final class GeographicViewServiceFutureStub extends io.grpc.stub.AbstractStub<GeographicViewServiceFutureStub> {
    private GeographicViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GeographicViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeographicViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GeographicViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested geographic view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.GeographicView> getGeographicView(
        com.google.ads.googleads.v1.services.GetGeographicViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGeographicViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GEOGRAPHIC_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GeographicViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GeographicViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GEOGRAPHIC_VIEW:
          serviceImpl.getGeographicView((com.google.ads.googleads.v1.services.GetGeographicViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.GeographicView>) responseObserver);
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

  private static abstract class GeographicViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GeographicViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.GeographicViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GeographicViewService");
    }
  }

  private static final class GeographicViewServiceFileDescriptorSupplier
      extends GeographicViewServiceBaseDescriptorSupplier {
    GeographicViewServiceFileDescriptorSupplier() {}
  }

  private static final class GeographicViewServiceMethodDescriptorSupplier
      extends GeographicViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GeographicViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GeographicViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GeographicViewServiceFileDescriptorSupplier())
              .addMethod(getGetGeographicViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
