package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch change statuses.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/change_status_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ChangeStatusServiceGrpc {

  private ChangeStatusServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.ChangeStatusService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetChangeStatusRequest,
      com.google.ads.googleads.v9.resources.ChangeStatus> getGetChangeStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChangeStatus",
      requestType = com.google.ads.googleads.v9.services.GetChangeStatusRequest.class,
      responseType = com.google.ads.googleads.v9.resources.ChangeStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetChangeStatusRequest,
      com.google.ads.googleads.v9.resources.ChangeStatus> getGetChangeStatusMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetChangeStatusRequest, com.google.ads.googleads.v9.resources.ChangeStatus> getGetChangeStatusMethod;
    if ((getGetChangeStatusMethod = ChangeStatusServiceGrpc.getGetChangeStatusMethod) == null) {
      synchronized (ChangeStatusServiceGrpc.class) {
        if ((getGetChangeStatusMethod = ChangeStatusServiceGrpc.getGetChangeStatusMethod) == null) {
          ChangeStatusServiceGrpc.getGetChangeStatusMethod = getGetChangeStatusMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetChangeStatusRequest, com.google.ads.googleads.v9.resources.ChangeStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChangeStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetChangeStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.ChangeStatus.getDefaultInstance()))
              .setSchemaDescriptor(new ChangeStatusServiceMethodDescriptorSupplier("GetChangeStatus"))
              .build();
        }
      }
    }
    return getGetChangeStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChangeStatusServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChangeStatusServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChangeStatusServiceStub>() {
        @java.lang.Override
        public ChangeStatusServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChangeStatusServiceStub(channel, callOptions);
        }
      };
    return ChangeStatusServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChangeStatusServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChangeStatusServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChangeStatusServiceBlockingStub>() {
        @java.lang.Override
        public ChangeStatusServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChangeStatusServiceBlockingStub(channel, callOptions);
        }
      };
    return ChangeStatusServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChangeStatusServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChangeStatusServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChangeStatusServiceFutureStub>() {
        @java.lang.Override
        public ChangeStatusServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChangeStatusServiceFutureStub(channel, callOptions);
        }
      };
    return ChangeStatusServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch change statuses.
   * </pre>
   */
  public static abstract class ChangeStatusServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested change status in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getChangeStatus(com.google.ads.googleads.v9.services.GetChangeStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.ChangeStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChangeStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetChangeStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetChangeStatusRequest,
                com.google.ads.googleads.v9.resources.ChangeStatus>(
                  this, METHODID_GET_CHANGE_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch change statuses.
   * </pre>
   */
  public static final class ChangeStatusServiceStub extends io.grpc.stub.AbstractAsyncStub<ChangeStatusServiceStub> {
    private ChangeStatusServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChangeStatusServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChangeStatusServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested change status in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getChangeStatus(com.google.ads.googleads.v9.services.GetChangeStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.ChangeStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChangeStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch change statuses.
   * </pre>
   */
  public static final class ChangeStatusServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ChangeStatusServiceBlockingStub> {
    private ChangeStatusServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChangeStatusServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChangeStatusServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested change status in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.ChangeStatus getChangeStatus(com.google.ads.googleads.v9.services.GetChangeStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChangeStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch change statuses.
   * </pre>
   */
  public static final class ChangeStatusServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ChangeStatusServiceFutureStub> {
    private ChangeStatusServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChangeStatusServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChangeStatusServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested change status in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.ChangeStatus> getChangeStatus(
        com.google.ads.googleads.v9.services.GetChangeStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChangeStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CHANGE_STATUS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChangeStatusServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChangeStatusServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CHANGE_STATUS:
          serviceImpl.getChangeStatus((com.google.ads.googleads.v9.services.GetChangeStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.ChangeStatus>) responseObserver);
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

  private static abstract class ChangeStatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChangeStatusServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.ChangeStatusServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChangeStatusService");
    }
  }

  private static final class ChangeStatusServiceFileDescriptorSupplier
      extends ChangeStatusServiceBaseDescriptorSupplier {
    ChangeStatusServiceFileDescriptorSupplier() {}
  }

  private static final class ChangeStatusServiceMethodDescriptorSupplier
      extends ChangeStatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChangeStatusServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChangeStatusServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChangeStatusServiceFileDescriptorSupplier())
              .addMethod(getGetChangeStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
