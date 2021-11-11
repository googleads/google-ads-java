package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Managed Placement views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/managed_placement_view_service.proto")
public final class ManagedPlacementViewServiceGrpc {

  private ManagedPlacementViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.ManagedPlacementViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetManagedPlacementViewRequest,
      com.google.ads.googleads.v9.resources.ManagedPlacementView> getGetManagedPlacementViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetManagedPlacementView",
      requestType = com.google.ads.googleads.v9.services.GetManagedPlacementViewRequest.class,
      responseType = com.google.ads.googleads.v9.resources.ManagedPlacementView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetManagedPlacementViewRequest,
      com.google.ads.googleads.v9.resources.ManagedPlacementView> getGetManagedPlacementViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetManagedPlacementViewRequest, com.google.ads.googleads.v9.resources.ManagedPlacementView> getGetManagedPlacementViewMethod;
    if ((getGetManagedPlacementViewMethod = ManagedPlacementViewServiceGrpc.getGetManagedPlacementViewMethod) == null) {
      synchronized (ManagedPlacementViewServiceGrpc.class) {
        if ((getGetManagedPlacementViewMethod = ManagedPlacementViewServiceGrpc.getGetManagedPlacementViewMethod) == null) {
          ManagedPlacementViewServiceGrpc.getGetManagedPlacementViewMethod = getGetManagedPlacementViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetManagedPlacementViewRequest, com.google.ads.googleads.v9.resources.ManagedPlacementView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetManagedPlacementView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetManagedPlacementViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.ManagedPlacementView.getDefaultInstance()))
              .setSchemaDescriptor(new ManagedPlacementViewServiceMethodDescriptorSupplier("GetManagedPlacementView"))
              .build();
        }
      }
    }
    return getGetManagedPlacementViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManagedPlacementViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagedPlacementViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagedPlacementViewServiceStub>() {
        @java.lang.Override
        public ManagedPlacementViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagedPlacementViewServiceStub(channel, callOptions);
        }
      };
    return ManagedPlacementViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManagedPlacementViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagedPlacementViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagedPlacementViewServiceBlockingStub>() {
        @java.lang.Override
        public ManagedPlacementViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagedPlacementViewServiceBlockingStub(channel, callOptions);
        }
      };
    return ManagedPlacementViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManagedPlacementViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagedPlacementViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagedPlacementViewServiceFutureStub>() {
        @java.lang.Override
        public ManagedPlacementViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagedPlacementViewServiceFutureStub(channel, callOptions);
        }
      };
    return ManagedPlacementViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Managed Placement views.
   * </pre>
   */
  public static abstract class ManagedPlacementViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Managed Placement view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getManagedPlacementView(com.google.ads.googleads.v9.services.GetManagedPlacementViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.ManagedPlacementView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetManagedPlacementViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetManagedPlacementViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetManagedPlacementViewRequest,
                com.google.ads.googleads.v9.resources.ManagedPlacementView>(
                  this, METHODID_GET_MANAGED_PLACEMENT_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Managed Placement views.
   * </pre>
   */
  public static final class ManagedPlacementViewServiceStub extends io.grpc.stub.AbstractAsyncStub<ManagedPlacementViewServiceStub> {
    private ManagedPlacementViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagedPlacementViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagedPlacementViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Managed Placement view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getManagedPlacementView(com.google.ads.googleads.v9.services.GetManagedPlacementViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.ManagedPlacementView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetManagedPlacementViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Managed Placement views.
   * </pre>
   */
  public static final class ManagedPlacementViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ManagedPlacementViewServiceBlockingStub> {
    private ManagedPlacementViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagedPlacementViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagedPlacementViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Managed Placement view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.ManagedPlacementView getManagedPlacementView(com.google.ads.googleads.v9.services.GetManagedPlacementViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetManagedPlacementViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Managed Placement views.
   * </pre>
   */
  public static final class ManagedPlacementViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ManagedPlacementViewServiceFutureStub> {
    private ManagedPlacementViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagedPlacementViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagedPlacementViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Managed Placement view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.ManagedPlacementView> getManagedPlacementView(
        com.google.ads.googleads.v9.services.GetManagedPlacementViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetManagedPlacementViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MANAGED_PLACEMENT_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ManagedPlacementViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ManagedPlacementViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MANAGED_PLACEMENT_VIEW:
          serviceImpl.getManagedPlacementView((com.google.ads.googleads.v9.services.GetManagedPlacementViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.ManagedPlacementView>) responseObserver);
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

  private static abstract class ManagedPlacementViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManagedPlacementViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.ManagedPlacementViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ManagedPlacementViewService");
    }
  }

  private static final class ManagedPlacementViewServiceFileDescriptorSupplier
      extends ManagedPlacementViewServiceBaseDescriptorSupplier {
    ManagedPlacementViewServiceFileDescriptorSupplier() {}
  }

  private static final class ManagedPlacementViewServiceMethodDescriptorSupplier
      extends ManagedPlacementViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ManagedPlacementViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ManagedPlacementViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManagedPlacementViewServiceFileDescriptorSupplier())
              .addMethod(getGetManagedPlacementViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
