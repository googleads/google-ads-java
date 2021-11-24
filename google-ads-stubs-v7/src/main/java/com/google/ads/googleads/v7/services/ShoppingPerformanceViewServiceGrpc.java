package com.google.ads.googleads.v7.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch Shopping performance views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v7/services/shopping_performance_view_service.proto")
public final class ShoppingPerformanceViewServiceGrpc {

  private ShoppingPerformanceViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v7.services.ShoppingPerformanceViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetShoppingPerformanceViewRequest,
      com.google.ads.googleads.v7.resources.ShoppingPerformanceView> getGetShoppingPerformanceViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetShoppingPerformanceView",
      requestType = com.google.ads.googleads.v7.services.GetShoppingPerformanceViewRequest.class,
      responseType = com.google.ads.googleads.v7.resources.ShoppingPerformanceView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetShoppingPerformanceViewRequest,
      com.google.ads.googleads.v7.resources.ShoppingPerformanceView> getGetShoppingPerformanceViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetShoppingPerformanceViewRequest, com.google.ads.googleads.v7.resources.ShoppingPerformanceView> getGetShoppingPerformanceViewMethod;
    if ((getGetShoppingPerformanceViewMethod = ShoppingPerformanceViewServiceGrpc.getGetShoppingPerformanceViewMethod) == null) {
      synchronized (ShoppingPerformanceViewServiceGrpc.class) {
        if ((getGetShoppingPerformanceViewMethod = ShoppingPerformanceViewServiceGrpc.getGetShoppingPerformanceViewMethod) == null) {
          ShoppingPerformanceViewServiceGrpc.getGetShoppingPerformanceViewMethod = getGetShoppingPerformanceViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.GetShoppingPerformanceViewRequest, com.google.ads.googleads.v7.resources.ShoppingPerformanceView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetShoppingPerformanceView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.GetShoppingPerformanceViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.resources.ShoppingPerformanceView.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingPerformanceViewServiceMethodDescriptorSupplier("GetShoppingPerformanceView"))
              .build();
        }
      }
    }
    return getGetShoppingPerformanceViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShoppingPerformanceViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingPerformanceViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingPerformanceViewServiceStub>() {
        @java.lang.Override
        public ShoppingPerformanceViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingPerformanceViewServiceStub(channel, callOptions);
        }
      };
    return ShoppingPerformanceViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShoppingPerformanceViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingPerformanceViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingPerformanceViewServiceBlockingStub>() {
        @java.lang.Override
        public ShoppingPerformanceViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingPerformanceViewServiceBlockingStub(channel, callOptions);
        }
      };
    return ShoppingPerformanceViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShoppingPerformanceViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingPerformanceViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingPerformanceViewServiceFutureStub>() {
        @java.lang.Override
        public ShoppingPerformanceViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingPerformanceViewServiceFutureStub(channel, callOptions);
        }
      };
    return ShoppingPerformanceViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch Shopping performance views.
   * </pre>
   */
  public static abstract class ShoppingPerformanceViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Shopping performance view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getShoppingPerformanceView(com.google.ads.googleads.v7.services.GetShoppingPerformanceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.ShoppingPerformanceView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetShoppingPerformanceViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetShoppingPerformanceViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.GetShoppingPerformanceViewRequest,
                com.google.ads.googleads.v7.resources.ShoppingPerformanceView>(
                  this, METHODID_GET_SHOPPING_PERFORMANCE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch Shopping performance views.
   * </pre>
   */
  public static final class ShoppingPerformanceViewServiceStub extends io.grpc.stub.AbstractAsyncStub<ShoppingPerformanceViewServiceStub> {
    private ShoppingPerformanceViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingPerformanceViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingPerformanceViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Shopping performance view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getShoppingPerformanceView(com.google.ads.googleads.v7.services.GetShoppingPerformanceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.ShoppingPerformanceView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetShoppingPerformanceViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch Shopping performance views.
   * </pre>
   */
  public static final class ShoppingPerformanceViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ShoppingPerformanceViewServiceBlockingStub> {
    private ShoppingPerformanceViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingPerformanceViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingPerformanceViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Shopping performance view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.resources.ShoppingPerformanceView getShoppingPerformanceView(com.google.ads.googleads.v7.services.GetShoppingPerformanceViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetShoppingPerformanceViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch Shopping performance views.
   * </pre>
   */
  public static final class ShoppingPerformanceViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ShoppingPerformanceViewServiceFutureStub> {
    private ShoppingPerformanceViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingPerformanceViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingPerformanceViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Shopping performance view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.resources.ShoppingPerformanceView> getShoppingPerformanceView(
        com.google.ads.googleads.v7.services.GetShoppingPerformanceViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetShoppingPerformanceViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SHOPPING_PERFORMANCE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShoppingPerformanceViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShoppingPerformanceViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SHOPPING_PERFORMANCE_VIEW:
          serviceImpl.getShoppingPerformanceView((com.google.ads.googleads.v7.services.GetShoppingPerformanceViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.ShoppingPerformanceView>) responseObserver);
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

  private static abstract class ShoppingPerformanceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShoppingPerformanceViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v7.services.ShoppingPerformanceViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShoppingPerformanceViewService");
    }
  }

  private static final class ShoppingPerformanceViewServiceFileDescriptorSupplier
      extends ShoppingPerformanceViewServiceBaseDescriptorSupplier {
    ShoppingPerformanceViewServiceFileDescriptorSupplier() {}
  }

  private static final class ShoppingPerformanceViewServiceMethodDescriptorSupplier
      extends ShoppingPerformanceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShoppingPerformanceViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ShoppingPerformanceViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShoppingPerformanceViewServiceFileDescriptorSupplier())
              .addMethod(getGetShoppingPerformanceViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
