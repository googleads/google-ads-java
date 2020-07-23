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
 * Service to fetch click views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v3/services/click_view_service.proto")
public final class ClickViewServiceGrpc {

  private ClickViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.ClickViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetClickViewRequest,
      com.google.ads.googleads.v3.resources.ClickView> getGetClickViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClickView",
      requestType = com.google.ads.googleads.v3.services.GetClickViewRequest.class,
      responseType = com.google.ads.googleads.v3.resources.ClickView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetClickViewRequest,
      com.google.ads.googleads.v3.resources.ClickView> getGetClickViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetClickViewRequest, com.google.ads.googleads.v3.resources.ClickView> getGetClickViewMethod;
    if ((getGetClickViewMethod = ClickViewServiceGrpc.getGetClickViewMethod) == null) {
      synchronized (ClickViewServiceGrpc.class) {
        if ((getGetClickViewMethod = ClickViewServiceGrpc.getGetClickViewMethod) == null) {
          ClickViewServiceGrpc.getGetClickViewMethod = getGetClickViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetClickViewRequest, com.google.ads.googleads.v3.resources.ClickView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClickView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetClickViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.ClickView.getDefaultInstance()))
              .setSchemaDescriptor(new ClickViewServiceMethodDescriptorSupplier("GetClickView"))
              .build();
        }
      }
    }
    return getGetClickViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClickViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClickViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClickViewServiceStub>() {
        @java.lang.Override
        public ClickViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClickViewServiceStub(channel, callOptions);
        }
      };
    return ClickViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClickViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClickViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClickViewServiceBlockingStub>() {
        @java.lang.Override
        public ClickViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClickViewServiceBlockingStub(channel, callOptions);
        }
      };
    return ClickViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClickViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClickViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClickViewServiceFutureStub>() {
        @java.lang.Override
        public ClickViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClickViewServiceFutureStub(channel, callOptions);
        }
      };
    return ClickViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch click views.
   * </pre>
   */
  public static abstract class ClickViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested click view in full detail.
     * </pre>
     */
    public void getClickView(com.google.ads.googleads.v3.services.GetClickViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.ClickView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClickViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetClickViewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetClickViewRequest,
                com.google.ads.googleads.v3.resources.ClickView>(
                  this, METHODID_GET_CLICK_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch click views.
   * </pre>
   */
  public static final class ClickViewServiceStub extends io.grpc.stub.AbstractAsyncStub<ClickViewServiceStub> {
    private ClickViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClickViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClickViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested click view in full detail.
     * </pre>
     */
    public void getClickView(com.google.ads.googleads.v3.services.GetClickViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.ClickView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClickViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch click views.
   * </pre>
   */
  public static final class ClickViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ClickViewServiceBlockingStub> {
    private ClickViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClickViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClickViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested click view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.ClickView getClickView(com.google.ads.googleads.v3.services.GetClickViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetClickViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch click views.
   * </pre>
   */
  public static final class ClickViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ClickViewServiceFutureStub> {
    private ClickViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClickViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClickViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested click view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.ClickView> getClickView(
        com.google.ads.googleads.v3.services.GetClickViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClickViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CLICK_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClickViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClickViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CLICK_VIEW:
          serviceImpl.getClickView((com.google.ads.googleads.v3.services.GetClickViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.ClickView>) responseObserver);
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

  private static abstract class ClickViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClickViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.ClickViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClickViewService");
    }
  }

  private static final class ClickViewServiceFileDescriptorSupplier
      extends ClickViewServiceBaseDescriptorSupplier {
    ClickViewServiceFileDescriptorSupplier() {}
  }

  private static final class ClickViewServiceMethodDescriptorSupplier
      extends ClickViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClickViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClickViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClickViewServiceFileDescriptorSupplier())
              .addMethod(getGetClickViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
