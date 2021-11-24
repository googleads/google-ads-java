package com.google.ads.googleads.v7.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage age range views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v7/services/age_range_view_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgeRangeViewServiceGrpc {

  private AgeRangeViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v7.services.AgeRangeViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetAgeRangeViewRequest,
      com.google.ads.googleads.v7.resources.AgeRangeView> getGetAgeRangeViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgeRangeView",
      requestType = com.google.ads.googleads.v7.services.GetAgeRangeViewRequest.class,
      responseType = com.google.ads.googleads.v7.resources.AgeRangeView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetAgeRangeViewRequest,
      com.google.ads.googleads.v7.resources.AgeRangeView> getGetAgeRangeViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetAgeRangeViewRequest, com.google.ads.googleads.v7.resources.AgeRangeView> getGetAgeRangeViewMethod;
    if ((getGetAgeRangeViewMethod = AgeRangeViewServiceGrpc.getGetAgeRangeViewMethod) == null) {
      synchronized (AgeRangeViewServiceGrpc.class) {
        if ((getGetAgeRangeViewMethod = AgeRangeViewServiceGrpc.getGetAgeRangeViewMethod) == null) {
          AgeRangeViewServiceGrpc.getGetAgeRangeViewMethod = getGetAgeRangeViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.GetAgeRangeViewRequest, com.google.ads.googleads.v7.resources.AgeRangeView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgeRangeView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.GetAgeRangeViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.resources.AgeRangeView.getDefaultInstance()))
              .setSchemaDescriptor(new AgeRangeViewServiceMethodDescriptorSupplier("GetAgeRangeView"))
              .build();
        }
      }
    }
    return getGetAgeRangeViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgeRangeViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgeRangeViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgeRangeViewServiceStub>() {
        @java.lang.Override
        public AgeRangeViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgeRangeViewServiceStub(channel, callOptions);
        }
      };
    return AgeRangeViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgeRangeViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgeRangeViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgeRangeViewServiceBlockingStub>() {
        @java.lang.Override
        public AgeRangeViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgeRangeViewServiceBlockingStub(channel, callOptions);
        }
      };
    return AgeRangeViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgeRangeViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgeRangeViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgeRangeViewServiceFutureStub>() {
        @java.lang.Override
        public AgeRangeViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgeRangeViewServiceFutureStub(channel, callOptions);
        }
      };
    return AgeRangeViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage age range views.
   * </pre>
   */
  public static abstract class AgeRangeViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested age range view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAgeRangeView(com.google.ads.googleads.v7.services.GetAgeRangeViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.AgeRangeView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgeRangeViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAgeRangeViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.GetAgeRangeViewRequest,
                com.google.ads.googleads.v7.resources.AgeRangeView>(
                  this, METHODID_GET_AGE_RANGE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage age range views.
   * </pre>
   */
  public static final class AgeRangeViewServiceStub extends io.grpc.stub.AbstractAsyncStub<AgeRangeViewServiceStub> {
    private AgeRangeViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgeRangeViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgeRangeViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested age range view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAgeRangeView(com.google.ads.googleads.v7.services.GetAgeRangeViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.AgeRangeView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgeRangeViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage age range views.
   * </pre>
   */
  public static final class AgeRangeViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AgeRangeViewServiceBlockingStub> {
    private AgeRangeViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgeRangeViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgeRangeViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested age range view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.resources.AgeRangeView getAgeRangeView(com.google.ads.googleads.v7.services.GetAgeRangeViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgeRangeViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage age range views.
   * </pre>
   */
  public static final class AgeRangeViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AgeRangeViewServiceFutureStub> {
    private AgeRangeViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgeRangeViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgeRangeViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested age range view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.resources.AgeRangeView> getAgeRangeView(
        com.google.ads.googleads.v7.services.GetAgeRangeViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgeRangeViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AGE_RANGE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AgeRangeViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AgeRangeViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AGE_RANGE_VIEW:
          serviceImpl.getAgeRangeView((com.google.ads.googleads.v7.services.GetAgeRangeViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.AgeRangeView>) responseObserver);
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

  private static abstract class AgeRangeViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgeRangeViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v7.services.AgeRangeViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AgeRangeViewService");
    }
  }

  private static final class AgeRangeViewServiceFileDescriptorSupplier
      extends AgeRangeViewServiceBaseDescriptorSupplier {
    AgeRangeViewServiceFileDescriptorSupplier() {}
  }

  private static final class AgeRangeViewServiceMethodDescriptorSupplier
      extends AgeRangeViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AgeRangeViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AgeRangeViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgeRangeViewServiceFileDescriptorSupplier())
              .addMethod(getGetAgeRangeViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
