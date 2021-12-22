package com.google.ads.googleads.v7.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage parental status views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v7/services/parental_status_view_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ParentalStatusViewServiceGrpc {

  private ParentalStatusViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v7.services.ParentalStatusViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetParentalStatusViewRequest,
      com.google.ads.googleads.v7.resources.ParentalStatusView> getGetParentalStatusViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetParentalStatusView",
      requestType = com.google.ads.googleads.v7.services.GetParentalStatusViewRequest.class,
      responseType = com.google.ads.googleads.v7.resources.ParentalStatusView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetParentalStatusViewRequest,
      com.google.ads.googleads.v7.resources.ParentalStatusView> getGetParentalStatusViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetParentalStatusViewRequest, com.google.ads.googleads.v7.resources.ParentalStatusView> getGetParentalStatusViewMethod;
    if ((getGetParentalStatusViewMethod = ParentalStatusViewServiceGrpc.getGetParentalStatusViewMethod) == null) {
      synchronized (ParentalStatusViewServiceGrpc.class) {
        if ((getGetParentalStatusViewMethod = ParentalStatusViewServiceGrpc.getGetParentalStatusViewMethod) == null) {
          ParentalStatusViewServiceGrpc.getGetParentalStatusViewMethod = getGetParentalStatusViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.GetParentalStatusViewRequest, com.google.ads.googleads.v7.resources.ParentalStatusView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetParentalStatusView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.GetParentalStatusViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.resources.ParentalStatusView.getDefaultInstance()))
              .setSchemaDescriptor(new ParentalStatusViewServiceMethodDescriptorSupplier("GetParentalStatusView"))
              .build();
        }
      }
    }
    return getGetParentalStatusViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParentalStatusViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParentalStatusViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParentalStatusViewServiceStub>() {
        @java.lang.Override
        public ParentalStatusViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParentalStatusViewServiceStub(channel, callOptions);
        }
      };
    return ParentalStatusViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParentalStatusViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParentalStatusViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParentalStatusViewServiceBlockingStub>() {
        @java.lang.Override
        public ParentalStatusViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParentalStatusViewServiceBlockingStub(channel, callOptions);
        }
      };
    return ParentalStatusViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParentalStatusViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParentalStatusViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParentalStatusViewServiceFutureStub>() {
        @java.lang.Override
        public ParentalStatusViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParentalStatusViewServiceFutureStub(channel, callOptions);
        }
      };
    return ParentalStatusViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage parental status views.
   * </pre>
   */
  public static abstract class ParentalStatusViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested parental status view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getParentalStatusView(com.google.ads.googleads.v7.services.GetParentalStatusViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.ParentalStatusView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetParentalStatusViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetParentalStatusViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.GetParentalStatusViewRequest,
                com.google.ads.googleads.v7.resources.ParentalStatusView>(
                  this, METHODID_GET_PARENTAL_STATUS_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage parental status views.
   * </pre>
   */
  public static final class ParentalStatusViewServiceStub extends io.grpc.stub.AbstractAsyncStub<ParentalStatusViewServiceStub> {
    private ParentalStatusViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParentalStatusViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParentalStatusViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested parental status view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getParentalStatusView(com.google.ads.googleads.v7.services.GetParentalStatusViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.ParentalStatusView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetParentalStatusViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage parental status views.
   * </pre>
   */
  public static final class ParentalStatusViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ParentalStatusViewServiceBlockingStub> {
    private ParentalStatusViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParentalStatusViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParentalStatusViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested parental status view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.resources.ParentalStatusView getParentalStatusView(com.google.ads.googleads.v7.services.GetParentalStatusViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetParentalStatusViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage parental status views.
   * </pre>
   */
  public static final class ParentalStatusViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ParentalStatusViewServiceFutureStub> {
    private ParentalStatusViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParentalStatusViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParentalStatusViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested parental status view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.resources.ParentalStatusView> getParentalStatusView(
        com.google.ads.googleads.v7.services.GetParentalStatusViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetParentalStatusViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PARENTAL_STATUS_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParentalStatusViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ParentalStatusViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PARENTAL_STATUS_VIEW:
          serviceImpl.getParentalStatusView((com.google.ads.googleads.v7.services.GetParentalStatusViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.ParentalStatusView>) responseObserver);
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

  private static abstract class ParentalStatusViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParentalStatusViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v7.services.ParentalStatusViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParentalStatusViewService");
    }
  }

  private static final class ParentalStatusViewServiceFileDescriptorSupplier
      extends ParentalStatusViewServiceBaseDescriptorSupplier {
    ParentalStatusViewServiceFileDescriptorSupplier() {}
  }

  private static final class ParentalStatusViewServiceMethodDescriptorSupplier
      extends ParentalStatusViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParentalStatusViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ParentalStatusViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParentalStatusViewServiceFileDescriptorSupplier())
              .addMethod(getGetParentalStatusViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
