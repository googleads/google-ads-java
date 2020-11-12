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
 * Service to fetch ad schedule views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/ad_schedule_view_service.proto")
public final class AdScheduleViewServiceGrpc {

  private AdScheduleViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.AdScheduleViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAdScheduleViewRequest,
      com.google.ads.googleads.v6.resources.AdScheduleView> getGetAdScheduleViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdScheduleView",
      requestType = com.google.ads.googleads.v6.services.GetAdScheduleViewRequest.class,
      responseType = com.google.ads.googleads.v6.resources.AdScheduleView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAdScheduleViewRequest,
      com.google.ads.googleads.v6.resources.AdScheduleView> getGetAdScheduleViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAdScheduleViewRequest, com.google.ads.googleads.v6.resources.AdScheduleView> getGetAdScheduleViewMethod;
    if ((getGetAdScheduleViewMethod = AdScheduleViewServiceGrpc.getGetAdScheduleViewMethod) == null) {
      synchronized (AdScheduleViewServiceGrpc.class) {
        if ((getGetAdScheduleViewMethod = AdScheduleViewServiceGrpc.getGetAdScheduleViewMethod) == null) {
          AdScheduleViewServiceGrpc.getGetAdScheduleViewMethod = getGetAdScheduleViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetAdScheduleViewRequest, com.google.ads.googleads.v6.resources.AdScheduleView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdScheduleView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetAdScheduleViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.AdScheduleView.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<AdScheduleViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdScheduleViewServiceStub>() {
        @java.lang.Override
        public AdScheduleViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdScheduleViewServiceStub(channel, callOptions);
        }
      };
    return AdScheduleViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdScheduleViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdScheduleViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdScheduleViewServiceBlockingStub>() {
        @java.lang.Override
        public AdScheduleViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdScheduleViewServiceBlockingStub(channel, callOptions);
        }
      };
    return AdScheduleViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdScheduleViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdScheduleViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdScheduleViewServiceFutureStub>() {
        @java.lang.Override
        public AdScheduleViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdScheduleViewServiceFutureStub(channel, callOptions);
        }
      };
    return AdScheduleViewServiceFutureStub.newStub(factory, channel);
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
    public void getAdScheduleView(com.google.ads.googleads.v6.services.GetAdScheduleViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AdScheduleView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdScheduleViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdScheduleViewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetAdScheduleViewRequest,
                com.google.ads.googleads.v6.resources.AdScheduleView>(
                  this, METHODID_GET_AD_SCHEDULE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch ad schedule views.
   * </pre>
   */
  public static final class AdScheduleViewServiceStub extends io.grpc.stub.AbstractAsyncStub<AdScheduleViewServiceStub> {
    private AdScheduleViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdScheduleViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdScheduleViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad schedule view in full detail.
     * </pre>
     */
    public void getAdScheduleView(com.google.ads.googleads.v6.services.GetAdScheduleViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AdScheduleView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdScheduleViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch ad schedule views.
   * </pre>
   */
  public static final class AdScheduleViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdScheduleViewServiceBlockingStub> {
    private AdScheduleViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdScheduleViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdScheduleViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad schedule view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.AdScheduleView getAdScheduleView(com.google.ads.googleads.v6.services.GetAdScheduleViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdScheduleViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch ad schedule views.
   * </pre>
   */
  public static final class AdScheduleViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdScheduleViewServiceFutureStub> {
    private AdScheduleViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdScheduleViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdScheduleViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad schedule view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.AdScheduleView> getAdScheduleView(
        com.google.ads.googleads.v6.services.GetAdScheduleViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdScheduleViewMethod(), getCallOptions()), request);
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
          serviceImpl.getAdScheduleView((com.google.ads.googleads.v6.services.GetAdScheduleViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AdScheduleView>) responseObserver);
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
      return com.google.ads.googleads.v6.services.AdScheduleViewServiceProto.getDescriptor();
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
              .addMethod(getGetAdScheduleViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
