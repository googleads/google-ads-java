package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Hotel Performance Views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/hotel_performance_view_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HotelPerformanceViewServiceGrpc {

  private HotelPerformanceViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.HotelPerformanceViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetHotelPerformanceViewRequest,
      com.google.ads.googleads.v9.resources.HotelPerformanceView> getGetHotelPerformanceViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHotelPerformanceView",
      requestType = com.google.ads.googleads.v9.services.GetHotelPerformanceViewRequest.class,
      responseType = com.google.ads.googleads.v9.resources.HotelPerformanceView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetHotelPerformanceViewRequest,
      com.google.ads.googleads.v9.resources.HotelPerformanceView> getGetHotelPerformanceViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetHotelPerformanceViewRequest, com.google.ads.googleads.v9.resources.HotelPerformanceView> getGetHotelPerformanceViewMethod;
    if ((getGetHotelPerformanceViewMethod = HotelPerformanceViewServiceGrpc.getGetHotelPerformanceViewMethod) == null) {
      synchronized (HotelPerformanceViewServiceGrpc.class) {
        if ((getGetHotelPerformanceViewMethod = HotelPerformanceViewServiceGrpc.getGetHotelPerformanceViewMethod) == null) {
          HotelPerformanceViewServiceGrpc.getGetHotelPerformanceViewMethod = getGetHotelPerformanceViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetHotelPerformanceViewRequest, com.google.ads.googleads.v9.resources.HotelPerformanceView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHotelPerformanceView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetHotelPerformanceViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.HotelPerformanceView.getDefaultInstance()))
              .setSchemaDescriptor(new HotelPerformanceViewServiceMethodDescriptorSupplier("GetHotelPerformanceView"))
              .build();
        }
      }
    }
    return getGetHotelPerformanceViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelPerformanceViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelPerformanceViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelPerformanceViewServiceStub>() {
        @java.lang.Override
        public HotelPerformanceViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelPerformanceViewServiceStub(channel, callOptions);
        }
      };
    return HotelPerformanceViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelPerformanceViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelPerformanceViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelPerformanceViewServiceBlockingStub>() {
        @java.lang.Override
        public HotelPerformanceViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelPerformanceViewServiceBlockingStub(channel, callOptions);
        }
      };
    return HotelPerformanceViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelPerformanceViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelPerformanceViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelPerformanceViewServiceFutureStub>() {
        @java.lang.Override
        public HotelPerformanceViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelPerformanceViewServiceFutureStub(channel, callOptions);
        }
      };
    return HotelPerformanceViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Hotel Performance Views.
   * </pre>
   */
  public static abstract class HotelPerformanceViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Hotel Performance View in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getHotelPerformanceView(com.google.ads.googleads.v9.services.GetHotelPerformanceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.HotelPerformanceView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHotelPerformanceViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHotelPerformanceViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetHotelPerformanceViewRequest,
                com.google.ads.googleads.v9.resources.HotelPerformanceView>(
                  this, METHODID_GET_HOTEL_PERFORMANCE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Hotel Performance Views.
   * </pre>
   */
  public static final class HotelPerformanceViewServiceStub extends io.grpc.stub.AbstractAsyncStub<HotelPerformanceViewServiceStub> {
    private HotelPerformanceViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelPerformanceViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelPerformanceViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Hotel Performance View in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getHotelPerformanceView(com.google.ads.googleads.v9.services.GetHotelPerformanceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.HotelPerformanceView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHotelPerformanceViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Hotel Performance Views.
   * </pre>
   */
  public static final class HotelPerformanceViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HotelPerformanceViewServiceBlockingStub> {
    private HotelPerformanceViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelPerformanceViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelPerformanceViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Hotel Performance View in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.HotelPerformanceView getHotelPerformanceView(com.google.ads.googleads.v9.services.GetHotelPerformanceViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHotelPerformanceViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Hotel Performance Views.
   * </pre>
   */
  public static final class HotelPerformanceViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HotelPerformanceViewServiceFutureStub> {
    private HotelPerformanceViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelPerformanceViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelPerformanceViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Hotel Performance View in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.HotelPerformanceView> getHotelPerformanceView(
        com.google.ads.googleads.v9.services.GetHotelPerformanceViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHotelPerformanceViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HOTEL_PERFORMANCE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HotelPerformanceViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HotelPerformanceViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HOTEL_PERFORMANCE_VIEW:
          serviceImpl.getHotelPerformanceView((com.google.ads.googleads.v9.services.GetHotelPerformanceViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.HotelPerformanceView>) responseObserver);
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

  private static abstract class HotelPerformanceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelPerformanceViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.HotelPerformanceViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelPerformanceViewService");
    }
  }

  private static final class HotelPerformanceViewServiceFileDescriptorSupplier
      extends HotelPerformanceViewServiceBaseDescriptorSupplier {
    HotelPerformanceViewServiceFileDescriptorSupplier() {}
  }

  private static final class HotelPerformanceViewServiceMethodDescriptorSupplier
      extends HotelPerformanceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HotelPerformanceViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HotelPerformanceViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelPerformanceViewServiceFileDescriptorSupplier())
              .addMethod(getGetHotelPerformanceViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
