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
 * Service to fetch expanded landing page views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/expanded_landing_page_view_service.proto")
public final class ExpandedLandingPageViewServiceGrpc {

  private ExpandedLandingPageViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.ExpandedLandingPageViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetExpandedLandingPageViewRequest,
      com.google.ads.googleads.v6.resources.ExpandedLandingPageView> getGetExpandedLandingPageViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExpandedLandingPageView",
      requestType = com.google.ads.googleads.v6.services.GetExpandedLandingPageViewRequest.class,
      responseType = com.google.ads.googleads.v6.resources.ExpandedLandingPageView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetExpandedLandingPageViewRequest,
      com.google.ads.googleads.v6.resources.ExpandedLandingPageView> getGetExpandedLandingPageViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetExpandedLandingPageViewRequest, com.google.ads.googleads.v6.resources.ExpandedLandingPageView> getGetExpandedLandingPageViewMethod;
    if ((getGetExpandedLandingPageViewMethod = ExpandedLandingPageViewServiceGrpc.getGetExpandedLandingPageViewMethod) == null) {
      synchronized (ExpandedLandingPageViewServiceGrpc.class) {
        if ((getGetExpandedLandingPageViewMethod = ExpandedLandingPageViewServiceGrpc.getGetExpandedLandingPageViewMethod) == null) {
          ExpandedLandingPageViewServiceGrpc.getGetExpandedLandingPageViewMethod = getGetExpandedLandingPageViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetExpandedLandingPageViewRequest, com.google.ads.googleads.v6.resources.ExpandedLandingPageView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExpandedLandingPageView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetExpandedLandingPageViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.ExpandedLandingPageView.getDefaultInstance()))
              .setSchemaDescriptor(new ExpandedLandingPageViewServiceMethodDescriptorSupplier("GetExpandedLandingPageView"))
              .build();
        }
      }
    }
    return getGetExpandedLandingPageViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExpandedLandingPageViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExpandedLandingPageViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExpandedLandingPageViewServiceStub>() {
        @java.lang.Override
        public ExpandedLandingPageViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExpandedLandingPageViewServiceStub(channel, callOptions);
        }
      };
    return ExpandedLandingPageViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExpandedLandingPageViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExpandedLandingPageViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExpandedLandingPageViewServiceBlockingStub>() {
        @java.lang.Override
        public ExpandedLandingPageViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExpandedLandingPageViewServiceBlockingStub(channel, callOptions);
        }
      };
    return ExpandedLandingPageViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExpandedLandingPageViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExpandedLandingPageViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExpandedLandingPageViewServiceFutureStub>() {
        @java.lang.Override
        public ExpandedLandingPageViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExpandedLandingPageViewServiceFutureStub(channel, callOptions);
        }
      };
    return ExpandedLandingPageViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch expanded landing page views.
   * </pre>
   */
  public static abstract class ExpandedLandingPageViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested expanded landing page view in full detail.
     * </pre>
     */
    public void getExpandedLandingPageView(com.google.ads.googleads.v6.services.GetExpandedLandingPageViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.ExpandedLandingPageView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExpandedLandingPageViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetExpandedLandingPageViewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetExpandedLandingPageViewRequest,
                com.google.ads.googleads.v6.resources.ExpandedLandingPageView>(
                  this, METHODID_GET_EXPANDED_LANDING_PAGE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch expanded landing page views.
   * </pre>
   */
  public static final class ExpandedLandingPageViewServiceStub extends io.grpc.stub.AbstractAsyncStub<ExpandedLandingPageViewServiceStub> {
    private ExpandedLandingPageViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpandedLandingPageViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExpandedLandingPageViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested expanded landing page view in full detail.
     * </pre>
     */
    public void getExpandedLandingPageView(com.google.ads.googleads.v6.services.GetExpandedLandingPageViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.ExpandedLandingPageView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExpandedLandingPageViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch expanded landing page views.
   * </pre>
   */
  public static final class ExpandedLandingPageViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExpandedLandingPageViewServiceBlockingStub> {
    private ExpandedLandingPageViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpandedLandingPageViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExpandedLandingPageViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested expanded landing page view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.ExpandedLandingPageView getExpandedLandingPageView(com.google.ads.googleads.v6.services.GetExpandedLandingPageViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetExpandedLandingPageViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch expanded landing page views.
   * </pre>
   */
  public static final class ExpandedLandingPageViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ExpandedLandingPageViewServiceFutureStub> {
    private ExpandedLandingPageViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpandedLandingPageViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExpandedLandingPageViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested expanded landing page view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.ExpandedLandingPageView> getExpandedLandingPageView(
        com.google.ads.googleads.v6.services.GetExpandedLandingPageViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExpandedLandingPageViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EXPANDED_LANDING_PAGE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExpandedLandingPageViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExpandedLandingPageViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EXPANDED_LANDING_PAGE_VIEW:
          serviceImpl.getExpandedLandingPageView((com.google.ads.googleads.v6.services.GetExpandedLandingPageViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.ExpandedLandingPageView>) responseObserver);
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

  private static abstract class ExpandedLandingPageViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExpandedLandingPageViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.ExpandedLandingPageViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExpandedLandingPageViewService");
    }
  }

  private static final class ExpandedLandingPageViewServiceFileDescriptorSupplier
      extends ExpandedLandingPageViewServiceBaseDescriptorSupplier {
    ExpandedLandingPageViewServiceFileDescriptorSupplier() {}
  }

  private static final class ExpandedLandingPageViewServiceMethodDescriptorSupplier
      extends ExpandedLandingPageViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExpandedLandingPageViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExpandedLandingPageViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExpandedLandingPageViewServiceFileDescriptorSupplier())
              .addMethod(getGetExpandedLandingPageViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
