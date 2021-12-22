package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch currency constants.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/currency_constant_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CurrencyConstantServiceGrpc {

  private CurrencyConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.CurrencyConstantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetCurrencyConstantRequest,
      com.google.ads.googleads.v8.resources.CurrencyConstant> getGetCurrencyConstantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrencyConstant",
      requestType = com.google.ads.googleads.v8.services.GetCurrencyConstantRequest.class,
      responseType = com.google.ads.googleads.v8.resources.CurrencyConstant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetCurrencyConstantRequest,
      com.google.ads.googleads.v8.resources.CurrencyConstant> getGetCurrencyConstantMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetCurrencyConstantRequest, com.google.ads.googleads.v8.resources.CurrencyConstant> getGetCurrencyConstantMethod;
    if ((getGetCurrencyConstantMethod = CurrencyConstantServiceGrpc.getGetCurrencyConstantMethod) == null) {
      synchronized (CurrencyConstantServiceGrpc.class) {
        if ((getGetCurrencyConstantMethod = CurrencyConstantServiceGrpc.getGetCurrencyConstantMethod) == null) {
          CurrencyConstantServiceGrpc.getGetCurrencyConstantMethod = getGetCurrencyConstantMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetCurrencyConstantRequest, com.google.ads.googleads.v8.resources.CurrencyConstant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrencyConstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetCurrencyConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.CurrencyConstant.getDefaultInstance()))
              .setSchemaDescriptor(new CurrencyConstantServiceMethodDescriptorSupplier("GetCurrencyConstant"))
              .build();
        }
      }
    }
    return getGetCurrencyConstantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CurrencyConstantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CurrencyConstantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CurrencyConstantServiceStub>() {
        @java.lang.Override
        public CurrencyConstantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CurrencyConstantServiceStub(channel, callOptions);
        }
      };
    return CurrencyConstantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CurrencyConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CurrencyConstantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CurrencyConstantServiceBlockingStub>() {
        @java.lang.Override
        public CurrencyConstantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CurrencyConstantServiceBlockingStub(channel, callOptions);
        }
      };
    return CurrencyConstantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CurrencyConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CurrencyConstantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CurrencyConstantServiceFutureStub>() {
        @java.lang.Override
        public CurrencyConstantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CurrencyConstantServiceFutureStub(channel, callOptions);
        }
      };
    return CurrencyConstantServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch currency constants.
   * </pre>
   */
  public static abstract class CurrencyConstantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested currency constant.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCurrencyConstant(com.google.ads.googleads.v8.services.GetCurrencyConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.CurrencyConstant> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrencyConstantMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCurrencyConstantMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetCurrencyConstantRequest,
                com.google.ads.googleads.v8.resources.CurrencyConstant>(
                  this, METHODID_GET_CURRENCY_CONSTANT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch currency constants.
   * </pre>
   */
  public static final class CurrencyConstantServiceStub extends io.grpc.stub.AbstractAsyncStub<CurrencyConstantServiceStub> {
    private CurrencyConstantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyConstantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CurrencyConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested currency constant.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCurrencyConstant(com.google.ads.googleads.v8.services.GetCurrencyConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.CurrencyConstant> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrencyConstantMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch currency constants.
   * </pre>
   */
  public static final class CurrencyConstantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CurrencyConstantServiceBlockingStub> {
    private CurrencyConstantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyConstantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CurrencyConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested currency constant.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.CurrencyConstant getCurrencyConstant(com.google.ads.googleads.v8.services.GetCurrencyConstantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrencyConstantMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch currency constants.
   * </pre>
   */
  public static final class CurrencyConstantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CurrencyConstantServiceFutureStub> {
    private CurrencyConstantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyConstantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CurrencyConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested currency constant.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.CurrencyConstant> getCurrencyConstant(
        com.google.ads.googleads.v8.services.GetCurrencyConstantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrencyConstantMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENCY_CONSTANT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CurrencyConstantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CurrencyConstantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENCY_CONSTANT:
          serviceImpl.getCurrencyConstant((com.google.ads.googleads.v8.services.GetCurrencyConstantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.CurrencyConstant>) responseObserver);
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

  private static abstract class CurrencyConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CurrencyConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.CurrencyConstantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CurrencyConstantService");
    }
  }

  private static final class CurrencyConstantServiceFileDescriptorSupplier
      extends CurrencyConstantServiceBaseDescriptorSupplier {
    CurrencyConstantServiceFileDescriptorSupplier() {}
  }

  private static final class CurrencyConstantServiceMethodDescriptorSupplier
      extends CurrencyConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CurrencyConstantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CurrencyConstantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CurrencyConstantServiceFileDescriptorSupplier())
              .addMethod(getGetCurrencyConstantMethod())
              .build();
        }
      }
    }
    return result;
  }
}
