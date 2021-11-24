package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage display keyword views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/display_keyword_view_service.proto")
public final class DisplayKeywordViewServiceGrpc {

  private DisplayKeywordViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.DisplayKeywordViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetDisplayKeywordViewRequest,
      com.google.ads.googleads.v8.resources.DisplayKeywordView> getGetDisplayKeywordViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDisplayKeywordView",
      requestType = com.google.ads.googleads.v8.services.GetDisplayKeywordViewRequest.class,
      responseType = com.google.ads.googleads.v8.resources.DisplayKeywordView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetDisplayKeywordViewRequest,
      com.google.ads.googleads.v8.resources.DisplayKeywordView> getGetDisplayKeywordViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetDisplayKeywordViewRequest, com.google.ads.googleads.v8.resources.DisplayKeywordView> getGetDisplayKeywordViewMethod;
    if ((getGetDisplayKeywordViewMethod = DisplayKeywordViewServiceGrpc.getGetDisplayKeywordViewMethod) == null) {
      synchronized (DisplayKeywordViewServiceGrpc.class) {
        if ((getGetDisplayKeywordViewMethod = DisplayKeywordViewServiceGrpc.getGetDisplayKeywordViewMethod) == null) {
          DisplayKeywordViewServiceGrpc.getGetDisplayKeywordViewMethod = getGetDisplayKeywordViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetDisplayKeywordViewRequest, com.google.ads.googleads.v8.resources.DisplayKeywordView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDisplayKeywordView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetDisplayKeywordViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.DisplayKeywordView.getDefaultInstance()))
              .setSchemaDescriptor(new DisplayKeywordViewServiceMethodDescriptorSupplier("GetDisplayKeywordView"))
              .build();
        }
      }
    }
    return getGetDisplayKeywordViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DisplayKeywordViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DisplayKeywordViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DisplayKeywordViewServiceStub>() {
        @java.lang.Override
        public DisplayKeywordViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DisplayKeywordViewServiceStub(channel, callOptions);
        }
      };
    return DisplayKeywordViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DisplayKeywordViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DisplayKeywordViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DisplayKeywordViewServiceBlockingStub>() {
        @java.lang.Override
        public DisplayKeywordViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DisplayKeywordViewServiceBlockingStub(channel, callOptions);
        }
      };
    return DisplayKeywordViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DisplayKeywordViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DisplayKeywordViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DisplayKeywordViewServiceFutureStub>() {
        @java.lang.Override
        public DisplayKeywordViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DisplayKeywordViewServiceFutureStub(channel, callOptions);
        }
      };
    return DisplayKeywordViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage display keyword views.
   * </pre>
   */
  public static abstract class DisplayKeywordViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested display keyword view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getDisplayKeywordView(com.google.ads.googleads.v8.services.GetDisplayKeywordViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.DisplayKeywordView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDisplayKeywordViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDisplayKeywordViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetDisplayKeywordViewRequest,
                com.google.ads.googleads.v8.resources.DisplayKeywordView>(
                  this, METHODID_GET_DISPLAY_KEYWORD_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage display keyword views.
   * </pre>
   */
  public static final class DisplayKeywordViewServiceStub extends io.grpc.stub.AbstractAsyncStub<DisplayKeywordViewServiceStub> {
    private DisplayKeywordViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DisplayKeywordViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DisplayKeywordViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested display keyword view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getDisplayKeywordView(com.google.ads.googleads.v8.services.GetDisplayKeywordViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.DisplayKeywordView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDisplayKeywordViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage display keyword views.
   * </pre>
   */
  public static final class DisplayKeywordViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DisplayKeywordViewServiceBlockingStub> {
    private DisplayKeywordViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DisplayKeywordViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DisplayKeywordViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested display keyword view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.DisplayKeywordView getDisplayKeywordView(com.google.ads.googleads.v8.services.GetDisplayKeywordViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDisplayKeywordViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage display keyword views.
   * </pre>
   */
  public static final class DisplayKeywordViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DisplayKeywordViewServiceFutureStub> {
    private DisplayKeywordViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DisplayKeywordViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DisplayKeywordViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested display keyword view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.DisplayKeywordView> getDisplayKeywordView(
        com.google.ads.googleads.v8.services.GetDisplayKeywordViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDisplayKeywordViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DISPLAY_KEYWORD_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DisplayKeywordViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DisplayKeywordViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DISPLAY_KEYWORD_VIEW:
          serviceImpl.getDisplayKeywordView((com.google.ads.googleads.v8.services.GetDisplayKeywordViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.DisplayKeywordView>) responseObserver);
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

  private static abstract class DisplayKeywordViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DisplayKeywordViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.DisplayKeywordViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DisplayKeywordViewService");
    }
  }

  private static final class DisplayKeywordViewServiceFileDescriptorSupplier
      extends DisplayKeywordViewServiceBaseDescriptorSupplier {
    DisplayKeywordViewServiceFileDescriptorSupplier() {}
  }

  private static final class DisplayKeywordViewServiceMethodDescriptorSupplier
      extends DisplayKeywordViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DisplayKeywordViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DisplayKeywordViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DisplayKeywordViewServiceFileDescriptorSupplier())
              .addMethod(getGetDisplayKeywordViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
