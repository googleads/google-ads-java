package com.google.ads.googleads.v6.services;

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
 * Service to manage gender views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/gender_view_service.proto")
public final class GenderViewServiceGrpc {

  private GenderViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.GenderViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetGenderViewRequest,
      com.google.ads.googleads.v6.resources.GenderView> getGetGenderViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGenderView",
      requestType = com.google.ads.googleads.v6.services.GetGenderViewRequest.class,
      responseType = com.google.ads.googleads.v6.resources.GenderView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetGenderViewRequest,
      com.google.ads.googleads.v6.resources.GenderView> getGetGenderViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetGenderViewRequest, com.google.ads.googleads.v6.resources.GenderView> getGetGenderViewMethod;
    if ((getGetGenderViewMethod = GenderViewServiceGrpc.getGetGenderViewMethod) == null) {
      synchronized (GenderViewServiceGrpc.class) {
        if ((getGetGenderViewMethod = GenderViewServiceGrpc.getGetGenderViewMethod) == null) {
          GenderViewServiceGrpc.getGetGenderViewMethod = getGetGenderViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetGenderViewRequest, com.google.ads.googleads.v6.resources.GenderView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGenderView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetGenderViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.GenderView.getDefaultInstance()))
              .setSchemaDescriptor(new GenderViewServiceMethodDescriptorSupplier("GetGenderView"))
              .build();
        }
      }
    }
    return getGetGenderViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GenderViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenderViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenderViewServiceStub>() {
        @java.lang.Override
        public GenderViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenderViewServiceStub(channel, callOptions);
        }
      };
    return GenderViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GenderViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenderViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenderViewServiceBlockingStub>() {
        @java.lang.Override
        public GenderViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenderViewServiceBlockingStub(channel, callOptions);
        }
      };
    return GenderViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GenderViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenderViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenderViewServiceFutureStub>() {
        @java.lang.Override
        public GenderViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenderViewServiceFutureStub(channel, callOptions);
        }
      };
    return GenderViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage gender views.
   * </pre>
   */
  public static abstract class GenderViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested gender view in full detail.
     * </pre>
     */
    public void getGenderView(com.google.ads.googleads.v6.services.GetGenderViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.GenderView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGenderViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGenderViewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetGenderViewRequest,
                com.google.ads.googleads.v6.resources.GenderView>(
                  this, METHODID_GET_GENDER_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage gender views.
   * </pre>
   */
  public static final class GenderViewServiceStub extends io.grpc.stub.AbstractAsyncStub<GenderViewServiceStub> {
    private GenderViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenderViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenderViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested gender view in full detail.
     * </pre>
     */
    public void getGenderView(com.google.ads.googleads.v6.services.GetGenderViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.GenderView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGenderViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage gender views.
   * </pre>
   */
  public static final class GenderViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GenderViewServiceBlockingStub> {
    private GenderViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenderViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenderViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested gender view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.GenderView getGenderView(com.google.ads.googleads.v6.services.GetGenderViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGenderViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage gender views.
   * </pre>
   */
  public static final class GenderViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GenderViewServiceFutureStub> {
    private GenderViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenderViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenderViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested gender view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.GenderView> getGenderView(
        com.google.ads.googleads.v6.services.GetGenderViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGenderViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GENDER_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GenderViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GenderViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GENDER_VIEW:
          serviceImpl.getGenderView((com.google.ads.googleads.v6.services.GetGenderViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.GenderView>) responseObserver);
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

  private static abstract class GenderViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GenderViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.GenderViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GenderViewService");
    }
  }

  private static final class GenderViewServiceFileDescriptorSupplier
      extends GenderViewServiceBaseDescriptorSupplier {
    GenderViewServiceFileDescriptorSupplier() {}
  }

  private static final class GenderViewServiceMethodDescriptorSupplier
      extends GenderViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GenderViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GenderViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GenderViewServiceFileDescriptorSupplier())
              .addMethod(getGetGenderViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
