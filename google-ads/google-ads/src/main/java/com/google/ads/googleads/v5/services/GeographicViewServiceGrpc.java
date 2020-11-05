package com.google.ads.googleads.v5.services;

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
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v5/services/geographic_view_service.proto")
public final class GeographicViewServiceGrpc {

  private GeographicViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v5.services.GeographicViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetGeographicViewRequest,
      com.google.ads.googleads.v5.resources.GeographicView> getGetGeographicViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGeographicView",
      requestType = com.google.ads.googleads.v5.services.GetGeographicViewRequest.class,
      responseType = com.google.ads.googleads.v5.resources.GeographicView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetGeographicViewRequest,
      com.google.ads.googleads.v5.resources.GeographicView> getGetGeographicViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetGeographicViewRequest, com.google.ads.googleads.v5.resources.GeographicView> getGetGeographicViewMethod;
    if ((getGetGeographicViewMethod = GeographicViewServiceGrpc.getGetGeographicViewMethod) == null) {
      synchronized (GeographicViewServiceGrpc.class) {
        if ((getGetGeographicViewMethod = GeographicViewServiceGrpc.getGetGeographicViewMethod) == null) {
          GeographicViewServiceGrpc.getGetGeographicViewMethod = getGetGeographicViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.GetGeographicViewRequest, com.google.ads.googleads.v5.resources.GeographicView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGeographicView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.GetGeographicViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.resources.GeographicView.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<GeographicViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeographicViewServiceStub>() {
        @java.lang.Override
        public GeographicViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeographicViewServiceStub(channel, callOptions);
        }
      };
    return GeographicViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GeographicViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeographicViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeographicViewServiceBlockingStub>() {
        @java.lang.Override
        public GeographicViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeographicViewServiceBlockingStub(channel, callOptions);
        }
      };
    return GeographicViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GeographicViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeographicViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeographicViewServiceFutureStub>() {
        @java.lang.Override
        public GeographicViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeographicViewServiceFutureStub(channel, callOptions);
        }
      };
    return GeographicViewServiceFutureStub.newStub(factory, channel);
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
    public void getGeographicView(com.google.ads.googleads.v5.services.GetGeographicViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.GeographicView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGeographicViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGeographicViewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.GetGeographicViewRequest,
                com.google.ads.googleads.v5.resources.GeographicView>(
                  this, METHODID_GET_GEOGRAPHIC_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage geographic views.
   * </pre>
   */
  public static final class GeographicViewServiceStub extends io.grpc.stub.AbstractAsyncStub<GeographicViewServiceStub> {
    private GeographicViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeographicViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeographicViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested geographic view in full detail.
     * </pre>
     */
    public void getGeographicView(com.google.ads.googleads.v5.services.GetGeographicViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.GeographicView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGeographicViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage geographic views.
   * </pre>
   */
  public static final class GeographicViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GeographicViewServiceBlockingStub> {
    private GeographicViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeographicViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeographicViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested geographic view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v5.resources.GeographicView getGeographicView(com.google.ads.googleads.v5.services.GetGeographicViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGeographicViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage geographic views.
   * </pre>
   */
  public static final class GeographicViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GeographicViewServiceFutureStub> {
    private GeographicViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeographicViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeographicViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested geographic view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.resources.GeographicView> getGeographicView(
        com.google.ads.googleads.v5.services.GetGeographicViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGeographicViewMethod(), getCallOptions()), request);
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
          serviceImpl.getGeographicView((com.google.ads.googleads.v5.services.GetGeographicViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.GeographicView>) responseObserver);
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
      return com.google.ads.googleads.v5.services.GeographicViewServiceProto.getDescriptor();
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
              .addMethod(getGetGeographicViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
