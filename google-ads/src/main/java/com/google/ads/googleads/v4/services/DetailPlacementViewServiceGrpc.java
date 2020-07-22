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
 * Service to fetch Detail Placement views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v4/services/detail_placement_view_service.proto")
public final class DetailPlacementViewServiceGrpc {

  private DetailPlacementViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.DetailPlacementViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetDetailPlacementViewRequest,
      com.google.ads.googleads.v4.resources.DetailPlacementView> getGetDetailPlacementViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDetailPlacementView",
      requestType = com.google.ads.googleads.v4.services.GetDetailPlacementViewRequest.class,
      responseType = com.google.ads.googleads.v4.resources.DetailPlacementView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetDetailPlacementViewRequest,
      com.google.ads.googleads.v4.resources.DetailPlacementView> getGetDetailPlacementViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetDetailPlacementViewRequest, com.google.ads.googleads.v4.resources.DetailPlacementView> getGetDetailPlacementViewMethod;
    if ((getGetDetailPlacementViewMethod = DetailPlacementViewServiceGrpc.getGetDetailPlacementViewMethod) == null) {
      synchronized (DetailPlacementViewServiceGrpc.class) {
        if ((getGetDetailPlacementViewMethod = DetailPlacementViewServiceGrpc.getGetDetailPlacementViewMethod) == null) {
          DetailPlacementViewServiceGrpc.getGetDetailPlacementViewMethod = getGetDetailPlacementViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetDetailPlacementViewRequest, com.google.ads.googleads.v4.resources.DetailPlacementView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDetailPlacementView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetDetailPlacementViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.DetailPlacementView.getDefaultInstance()))
              .setSchemaDescriptor(new DetailPlacementViewServiceMethodDescriptorSupplier("GetDetailPlacementView"))
              .build();
        }
      }
    }
    return getGetDetailPlacementViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DetailPlacementViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DetailPlacementViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DetailPlacementViewServiceStub>() {
        @java.lang.Override
        public DetailPlacementViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DetailPlacementViewServiceStub(channel, callOptions);
        }
      };
    return DetailPlacementViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DetailPlacementViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DetailPlacementViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DetailPlacementViewServiceBlockingStub>() {
        @java.lang.Override
        public DetailPlacementViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DetailPlacementViewServiceBlockingStub(channel, callOptions);
        }
      };
    return DetailPlacementViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DetailPlacementViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DetailPlacementViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DetailPlacementViewServiceFutureStub>() {
        @java.lang.Override
        public DetailPlacementViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DetailPlacementViewServiceFutureStub(channel, callOptions);
        }
      };
    return DetailPlacementViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch Detail Placement views.
   * </pre>
   */
  public static abstract class DetailPlacementViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Detail Placement view in full detail.
     * </pre>
     */
    public void getDetailPlacementView(com.google.ads.googleads.v4.services.GetDetailPlacementViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.DetailPlacementView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDetailPlacementViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDetailPlacementViewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetDetailPlacementViewRequest,
                com.google.ads.googleads.v4.resources.DetailPlacementView>(
                  this, METHODID_GET_DETAIL_PLACEMENT_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch Detail Placement views.
   * </pre>
   */
  public static final class DetailPlacementViewServiceStub extends io.grpc.stub.AbstractAsyncStub<DetailPlacementViewServiceStub> {
    private DetailPlacementViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DetailPlacementViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DetailPlacementViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Detail Placement view in full detail.
     * </pre>
     */
    public void getDetailPlacementView(com.google.ads.googleads.v4.services.GetDetailPlacementViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.DetailPlacementView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDetailPlacementViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch Detail Placement views.
   * </pre>
   */
  public static final class DetailPlacementViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DetailPlacementViewServiceBlockingStub> {
    private DetailPlacementViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DetailPlacementViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DetailPlacementViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Detail Placement view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.DetailPlacementView getDetailPlacementView(com.google.ads.googleads.v4.services.GetDetailPlacementViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDetailPlacementViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch Detail Placement views.
   * </pre>
   */
  public static final class DetailPlacementViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DetailPlacementViewServiceFutureStub> {
    private DetailPlacementViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DetailPlacementViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DetailPlacementViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Detail Placement view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.DetailPlacementView> getDetailPlacementView(
        com.google.ads.googleads.v4.services.GetDetailPlacementViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDetailPlacementViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DETAIL_PLACEMENT_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DetailPlacementViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DetailPlacementViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DETAIL_PLACEMENT_VIEW:
          serviceImpl.getDetailPlacementView((com.google.ads.googleads.v4.services.GetDetailPlacementViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.DetailPlacementView>) responseObserver);
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

  private static abstract class DetailPlacementViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DetailPlacementViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.DetailPlacementViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DetailPlacementViewService");
    }
  }

  private static final class DetailPlacementViewServiceFileDescriptorSupplier
      extends DetailPlacementViewServiceBaseDescriptorSupplier {
    DetailPlacementViewServiceFileDescriptorSupplier() {}
  }

  private static final class DetailPlacementViewServiceMethodDescriptorSupplier
      extends DetailPlacementViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DetailPlacementViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DetailPlacementViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DetailPlacementViewServiceFileDescriptorSupplier())
              .addMethod(getGetDetailPlacementViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
