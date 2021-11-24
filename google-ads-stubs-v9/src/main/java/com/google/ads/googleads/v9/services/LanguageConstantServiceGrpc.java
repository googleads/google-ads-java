package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch language constants.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/language_constant_service.proto")
public final class LanguageConstantServiceGrpc {

  private LanguageConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.LanguageConstantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetLanguageConstantRequest,
      com.google.ads.googleads.v9.resources.LanguageConstant> getGetLanguageConstantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLanguageConstant",
      requestType = com.google.ads.googleads.v9.services.GetLanguageConstantRequest.class,
      responseType = com.google.ads.googleads.v9.resources.LanguageConstant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetLanguageConstantRequest,
      com.google.ads.googleads.v9.resources.LanguageConstant> getGetLanguageConstantMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetLanguageConstantRequest, com.google.ads.googleads.v9.resources.LanguageConstant> getGetLanguageConstantMethod;
    if ((getGetLanguageConstantMethod = LanguageConstantServiceGrpc.getGetLanguageConstantMethod) == null) {
      synchronized (LanguageConstantServiceGrpc.class) {
        if ((getGetLanguageConstantMethod = LanguageConstantServiceGrpc.getGetLanguageConstantMethod) == null) {
          LanguageConstantServiceGrpc.getGetLanguageConstantMethod = getGetLanguageConstantMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetLanguageConstantRequest, com.google.ads.googleads.v9.resources.LanguageConstant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLanguageConstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetLanguageConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.LanguageConstant.getDefaultInstance()))
              .setSchemaDescriptor(new LanguageConstantServiceMethodDescriptorSupplier("GetLanguageConstant"))
              .build();
        }
      }
    }
    return getGetLanguageConstantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LanguageConstantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LanguageConstantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LanguageConstantServiceStub>() {
        @java.lang.Override
        public LanguageConstantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LanguageConstantServiceStub(channel, callOptions);
        }
      };
    return LanguageConstantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LanguageConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LanguageConstantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LanguageConstantServiceBlockingStub>() {
        @java.lang.Override
        public LanguageConstantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LanguageConstantServiceBlockingStub(channel, callOptions);
        }
      };
    return LanguageConstantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LanguageConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LanguageConstantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LanguageConstantServiceFutureStub>() {
        @java.lang.Override
        public LanguageConstantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LanguageConstantServiceFutureStub(channel, callOptions);
        }
      };
    return LanguageConstantServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch language constants.
   * </pre>
   */
  public static abstract class LanguageConstantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested language constant.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getLanguageConstant(com.google.ads.googleads.v9.services.GetLanguageConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.LanguageConstant> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLanguageConstantMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLanguageConstantMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetLanguageConstantRequest,
                com.google.ads.googleads.v9.resources.LanguageConstant>(
                  this, METHODID_GET_LANGUAGE_CONSTANT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch language constants.
   * </pre>
   */
  public static final class LanguageConstantServiceStub extends io.grpc.stub.AbstractAsyncStub<LanguageConstantServiceStub> {
    private LanguageConstantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LanguageConstantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LanguageConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested language constant.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getLanguageConstant(com.google.ads.googleads.v9.services.GetLanguageConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.LanguageConstant> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLanguageConstantMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch language constants.
   * </pre>
   */
  public static final class LanguageConstantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LanguageConstantServiceBlockingStub> {
    private LanguageConstantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LanguageConstantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LanguageConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested language constant.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.LanguageConstant getLanguageConstant(com.google.ads.googleads.v9.services.GetLanguageConstantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLanguageConstantMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch language constants.
   * </pre>
   */
  public static final class LanguageConstantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LanguageConstantServiceFutureStub> {
    private LanguageConstantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LanguageConstantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LanguageConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested language constant.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.LanguageConstant> getLanguageConstant(
        com.google.ads.googleads.v9.services.GetLanguageConstantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLanguageConstantMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LANGUAGE_CONSTANT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LanguageConstantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LanguageConstantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LANGUAGE_CONSTANT:
          serviceImpl.getLanguageConstant((com.google.ads.googleads.v9.services.GetLanguageConstantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.LanguageConstant>) responseObserver);
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

  private static abstract class LanguageConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LanguageConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.LanguageConstantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LanguageConstantService");
    }
  }

  private static final class LanguageConstantServiceFileDescriptorSupplier
      extends LanguageConstantServiceBaseDescriptorSupplier {
    LanguageConstantServiceFileDescriptorSupplier() {}
  }

  private static final class LanguageConstantServiceMethodDescriptorSupplier
      extends LanguageConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LanguageConstantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LanguageConstantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LanguageConstantServiceFileDescriptorSupplier())
              .addMethod(getGetLanguageConstantMethod())
              .build();
        }
      }
    }
    return result;
  }
}
