package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage webpage views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/webpage_view_service.proto")
public final class WebpageViewServiceGrpc {

  private WebpageViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.WebpageViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetWebpageViewRequest,
      com.google.ads.googleads.v8.resources.WebpageView> getGetWebpageViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWebpageView",
      requestType = com.google.ads.googleads.v8.services.GetWebpageViewRequest.class,
      responseType = com.google.ads.googleads.v8.resources.WebpageView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetWebpageViewRequest,
      com.google.ads.googleads.v8.resources.WebpageView> getGetWebpageViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetWebpageViewRequest, com.google.ads.googleads.v8.resources.WebpageView> getGetWebpageViewMethod;
    if ((getGetWebpageViewMethod = WebpageViewServiceGrpc.getGetWebpageViewMethod) == null) {
      synchronized (WebpageViewServiceGrpc.class) {
        if ((getGetWebpageViewMethod = WebpageViewServiceGrpc.getGetWebpageViewMethod) == null) {
          WebpageViewServiceGrpc.getGetWebpageViewMethod = getGetWebpageViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetWebpageViewRequest, com.google.ads.googleads.v8.resources.WebpageView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWebpageView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetWebpageViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.WebpageView.getDefaultInstance()))
              .setSchemaDescriptor(new WebpageViewServiceMethodDescriptorSupplier("GetWebpageView"))
              .build();
        }
      }
    }
    return getGetWebpageViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebpageViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebpageViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebpageViewServiceStub>() {
        @java.lang.Override
        public WebpageViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebpageViewServiceStub(channel, callOptions);
        }
      };
    return WebpageViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebpageViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebpageViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebpageViewServiceBlockingStub>() {
        @java.lang.Override
        public WebpageViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebpageViewServiceBlockingStub(channel, callOptions);
        }
      };
    return WebpageViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebpageViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebpageViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebpageViewServiceFutureStub>() {
        @java.lang.Override
        public WebpageViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebpageViewServiceFutureStub(channel, callOptions);
        }
      };
    return WebpageViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage webpage views.
   * </pre>
   */
  public static abstract class WebpageViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested webpage view in full detail.
     * </pre>
     */
    public void getWebpageView(com.google.ads.googleads.v8.services.GetWebpageViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.WebpageView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWebpageViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWebpageViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetWebpageViewRequest,
                com.google.ads.googleads.v8.resources.WebpageView>(
                  this, METHODID_GET_WEBPAGE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage webpage views.
   * </pre>
   */
  public static final class WebpageViewServiceStub extends io.grpc.stub.AbstractAsyncStub<WebpageViewServiceStub> {
    private WebpageViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebpageViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebpageViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested webpage view in full detail.
     * </pre>
     */
    public void getWebpageView(com.google.ads.googleads.v8.services.GetWebpageViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.WebpageView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWebpageViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage webpage views.
   * </pre>
   */
  public static final class WebpageViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WebpageViewServiceBlockingStub> {
    private WebpageViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebpageViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebpageViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested webpage view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.WebpageView getWebpageView(com.google.ads.googleads.v8.services.GetWebpageViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWebpageViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage webpage views.
   * </pre>
   */
  public static final class WebpageViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WebpageViewServiceFutureStub> {
    private WebpageViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebpageViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebpageViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested webpage view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.WebpageView> getWebpageView(
        com.google.ads.googleads.v8.services.GetWebpageViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWebpageViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WEBPAGE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WebpageViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WebpageViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WEBPAGE_VIEW:
          serviceImpl.getWebpageView((com.google.ads.googleads.v8.services.GetWebpageViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.WebpageView>) responseObserver);
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

  private static abstract class WebpageViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WebpageViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.WebpageViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WebpageViewService");
    }
  }

  private static final class WebpageViewServiceFileDescriptorSupplier
      extends WebpageViewServiceBaseDescriptorSupplier {
    WebpageViewServiceFileDescriptorSupplier() {}
  }

  private static final class WebpageViewServiceMethodDescriptorSupplier
      extends WebpageViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WebpageViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WebpageViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebpageViewServiceFileDescriptorSupplier())
              .addMethod(getGetWebpageViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
