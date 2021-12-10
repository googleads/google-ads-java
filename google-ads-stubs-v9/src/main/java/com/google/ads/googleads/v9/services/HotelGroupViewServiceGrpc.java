package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Hotel Group Views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/hotel_group_view_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HotelGroupViewServiceGrpc {

  private HotelGroupViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.HotelGroupViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetHotelGroupViewRequest,
      com.google.ads.googleads.v9.resources.HotelGroupView> getGetHotelGroupViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHotelGroupView",
      requestType = com.google.ads.googleads.v9.services.GetHotelGroupViewRequest.class,
      responseType = com.google.ads.googleads.v9.resources.HotelGroupView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetHotelGroupViewRequest,
      com.google.ads.googleads.v9.resources.HotelGroupView> getGetHotelGroupViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetHotelGroupViewRequest, com.google.ads.googleads.v9.resources.HotelGroupView> getGetHotelGroupViewMethod;
    if ((getGetHotelGroupViewMethod = HotelGroupViewServiceGrpc.getGetHotelGroupViewMethod) == null) {
      synchronized (HotelGroupViewServiceGrpc.class) {
        if ((getGetHotelGroupViewMethod = HotelGroupViewServiceGrpc.getGetHotelGroupViewMethod) == null) {
          HotelGroupViewServiceGrpc.getGetHotelGroupViewMethod = getGetHotelGroupViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetHotelGroupViewRequest, com.google.ads.googleads.v9.resources.HotelGroupView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHotelGroupView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetHotelGroupViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.HotelGroupView.getDefaultInstance()))
              .setSchemaDescriptor(new HotelGroupViewServiceMethodDescriptorSupplier("GetHotelGroupView"))
              .build();
        }
      }
    }
    return getGetHotelGroupViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelGroupViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelGroupViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelGroupViewServiceStub>() {
        @java.lang.Override
        public HotelGroupViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelGroupViewServiceStub(channel, callOptions);
        }
      };
    return HotelGroupViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelGroupViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelGroupViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelGroupViewServiceBlockingStub>() {
        @java.lang.Override
        public HotelGroupViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelGroupViewServiceBlockingStub(channel, callOptions);
        }
      };
    return HotelGroupViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelGroupViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelGroupViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelGroupViewServiceFutureStub>() {
        @java.lang.Override
        public HotelGroupViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelGroupViewServiceFutureStub(channel, callOptions);
        }
      };
    return HotelGroupViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Hotel Group Views.
   * </pre>
   */
  public static abstract class HotelGroupViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Hotel Group View in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getHotelGroupView(com.google.ads.googleads.v9.services.GetHotelGroupViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.HotelGroupView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHotelGroupViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHotelGroupViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetHotelGroupViewRequest,
                com.google.ads.googleads.v9.resources.HotelGroupView>(
                  this, METHODID_GET_HOTEL_GROUP_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Hotel Group Views.
   * </pre>
   */
  public static final class HotelGroupViewServiceStub extends io.grpc.stub.AbstractAsyncStub<HotelGroupViewServiceStub> {
    private HotelGroupViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelGroupViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelGroupViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Hotel Group View in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getHotelGroupView(com.google.ads.googleads.v9.services.GetHotelGroupViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.HotelGroupView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHotelGroupViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Hotel Group Views.
   * </pre>
   */
  public static final class HotelGroupViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HotelGroupViewServiceBlockingStub> {
    private HotelGroupViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelGroupViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelGroupViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Hotel Group View in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.HotelGroupView getHotelGroupView(com.google.ads.googleads.v9.services.GetHotelGroupViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHotelGroupViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Hotel Group Views.
   * </pre>
   */
  public static final class HotelGroupViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HotelGroupViewServiceFutureStub> {
    private HotelGroupViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelGroupViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelGroupViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Hotel Group View in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.HotelGroupView> getHotelGroupView(
        com.google.ads.googleads.v9.services.GetHotelGroupViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHotelGroupViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HOTEL_GROUP_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HotelGroupViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HotelGroupViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HOTEL_GROUP_VIEW:
          serviceImpl.getHotelGroupView((com.google.ads.googleads.v9.services.GetHotelGroupViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.HotelGroupView>) responseObserver);
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

  private static abstract class HotelGroupViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelGroupViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.HotelGroupViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelGroupViewService");
    }
  }

  private static final class HotelGroupViewServiceFileDescriptorSupplier
      extends HotelGroupViewServiceBaseDescriptorSupplier {
    HotelGroupViewServiceFileDescriptorSupplier() {}
  }

  private static final class HotelGroupViewServiceMethodDescriptorSupplier
      extends HotelGroupViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HotelGroupViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HotelGroupViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelGroupViewServiceFileDescriptorSupplier())
              .addMethod(getGetHotelGroupViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
