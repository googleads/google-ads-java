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
 * Service to fetch distance views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v4/services/distance_view_service.proto")
public final class DistanceViewServiceGrpc {

  private DistanceViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.DistanceViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetDistanceViewRequest,
      com.google.ads.googleads.v4.resources.DistanceView> getGetDistanceViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDistanceView",
      requestType = com.google.ads.googleads.v4.services.GetDistanceViewRequest.class,
      responseType = com.google.ads.googleads.v4.resources.DistanceView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetDistanceViewRequest,
      com.google.ads.googleads.v4.resources.DistanceView> getGetDistanceViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetDistanceViewRequest, com.google.ads.googleads.v4.resources.DistanceView> getGetDistanceViewMethod;
    if ((getGetDistanceViewMethod = DistanceViewServiceGrpc.getGetDistanceViewMethod) == null) {
      synchronized (DistanceViewServiceGrpc.class) {
        if ((getGetDistanceViewMethod = DistanceViewServiceGrpc.getGetDistanceViewMethod) == null) {
          DistanceViewServiceGrpc.getGetDistanceViewMethod = getGetDistanceViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetDistanceViewRequest, com.google.ads.googleads.v4.resources.DistanceView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDistanceView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetDistanceViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.DistanceView.getDefaultInstance()))
              .setSchemaDescriptor(new DistanceViewServiceMethodDescriptorSupplier("GetDistanceView"))
              .build();
        }
      }
    }
    return getGetDistanceViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DistanceViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DistanceViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DistanceViewServiceStub>() {
        @java.lang.Override
        public DistanceViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DistanceViewServiceStub(channel, callOptions);
        }
      };
    return DistanceViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DistanceViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DistanceViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DistanceViewServiceBlockingStub>() {
        @java.lang.Override
        public DistanceViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DistanceViewServiceBlockingStub(channel, callOptions);
        }
      };
    return DistanceViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DistanceViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DistanceViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DistanceViewServiceFutureStub>() {
        @java.lang.Override
        public DistanceViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DistanceViewServiceFutureStub(channel, callOptions);
        }
      };
    return DistanceViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch distance views.
   * </pre>
   */
  public static abstract class DistanceViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the attributes of the requested distance view.
     * </pre>
     */
    public void getDistanceView(com.google.ads.googleads.v4.services.GetDistanceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.DistanceView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDistanceViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDistanceViewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetDistanceViewRequest,
                com.google.ads.googleads.v4.resources.DistanceView>(
                  this, METHODID_GET_DISTANCE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch distance views.
   * </pre>
   */
  public static final class DistanceViewServiceStub extends io.grpc.stub.AbstractAsyncStub<DistanceViewServiceStub> {
    private DistanceViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistanceViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DistanceViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the attributes of the requested distance view.
     * </pre>
     */
    public void getDistanceView(com.google.ads.googleads.v4.services.GetDistanceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.DistanceView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDistanceViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch distance views.
   * </pre>
   */
  public static final class DistanceViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DistanceViewServiceBlockingStub> {
    private DistanceViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistanceViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DistanceViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the attributes of the requested distance view.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.DistanceView getDistanceView(com.google.ads.googleads.v4.services.GetDistanceViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDistanceViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch distance views.
   * </pre>
   */
  public static final class DistanceViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DistanceViewServiceFutureStub> {
    private DistanceViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistanceViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DistanceViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the attributes of the requested distance view.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.DistanceView> getDistanceView(
        com.google.ads.googleads.v4.services.GetDistanceViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDistanceViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DISTANCE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DistanceViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DistanceViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DISTANCE_VIEW:
          serviceImpl.getDistanceView((com.google.ads.googleads.v4.services.GetDistanceViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.DistanceView>) responseObserver);
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

  private static abstract class DistanceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DistanceViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.DistanceViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DistanceViewService");
    }
  }

  private static final class DistanceViewServiceFileDescriptorSupplier
      extends DistanceViewServiceBaseDescriptorSupplier {
    DistanceViewServiceFileDescriptorSupplier() {}
  }

  private static final class DistanceViewServiceMethodDescriptorSupplier
      extends DistanceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DistanceViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DistanceViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DistanceViewServiceFileDescriptorSupplier())
              .addMethod(getGetDistanceViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
