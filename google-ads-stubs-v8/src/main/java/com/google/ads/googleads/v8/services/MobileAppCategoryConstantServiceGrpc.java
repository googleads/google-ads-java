package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch mobile app category constants.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/mobile_app_category_constant_service.proto")
public final class MobileAppCategoryConstantServiceGrpc {

  private MobileAppCategoryConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.MobileAppCategoryConstantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetMobileAppCategoryConstantRequest,
      com.google.ads.googleads.v8.resources.MobileAppCategoryConstant> getGetMobileAppCategoryConstantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMobileAppCategoryConstant",
      requestType = com.google.ads.googleads.v8.services.GetMobileAppCategoryConstantRequest.class,
      responseType = com.google.ads.googleads.v8.resources.MobileAppCategoryConstant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetMobileAppCategoryConstantRequest,
      com.google.ads.googleads.v8.resources.MobileAppCategoryConstant> getGetMobileAppCategoryConstantMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetMobileAppCategoryConstantRequest, com.google.ads.googleads.v8.resources.MobileAppCategoryConstant> getGetMobileAppCategoryConstantMethod;
    if ((getGetMobileAppCategoryConstantMethod = MobileAppCategoryConstantServiceGrpc.getGetMobileAppCategoryConstantMethod) == null) {
      synchronized (MobileAppCategoryConstantServiceGrpc.class) {
        if ((getGetMobileAppCategoryConstantMethod = MobileAppCategoryConstantServiceGrpc.getGetMobileAppCategoryConstantMethod) == null) {
          MobileAppCategoryConstantServiceGrpc.getGetMobileAppCategoryConstantMethod = getGetMobileAppCategoryConstantMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetMobileAppCategoryConstantRequest, com.google.ads.googleads.v8.resources.MobileAppCategoryConstant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMobileAppCategoryConstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetMobileAppCategoryConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.MobileAppCategoryConstant.getDefaultInstance()))
              .setSchemaDescriptor(new MobileAppCategoryConstantServiceMethodDescriptorSupplier("GetMobileAppCategoryConstant"))
              .build();
        }
      }
    }
    return getGetMobileAppCategoryConstantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MobileAppCategoryConstantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MobileAppCategoryConstantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MobileAppCategoryConstantServiceStub>() {
        @java.lang.Override
        public MobileAppCategoryConstantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MobileAppCategoryConstantServiceStub(channel, callOptions);
        }
      };
    return MobileAppCategoryConstantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MobileAppCategoryConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MobileAppCategoryConstantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MobileAppCategoryConstantServiceBlockingStub>() {
        @java.lang.Override
        public MobileAppCategoryConstantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MobileAppCategoryConstantServiceBlockingStub(channel, callOptions);
        }
      };
    return MobileAppCategoryConstantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MobileAppCategoryConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MobileAppCategoryConstantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MobileAppCategoryConstantServiceFutureStub>() {
        @java.lang.Override
        public MobileAppCategoryConstantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MobileAppCategoryConstantServiceFutureStub(channel, callOptions);
        }
      };
    return MobileAppCategoryConstantServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch mobile app category constants.
   * </pre>
   */
  public static abstract class MobileAppCategoryConstantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested mobile app category constant.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getMobileAppCategoryConstant(com.google.ads.googleads.v8.services.GetMobileAppCategoryConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.MobileAppCategoryConstant> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMobileAppCategoryConstantMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMobileAppCategoryConstantMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetMobileAppCategoryConstantRequest,
                com.google.ads.googleads.v8.resources.MobileAppCategoryConstant>(
                  this, METHODID_GET_MOBILE_APP_CATEGORY_CONSTANT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch mobile app category constants.
   * </pre>
   */
  public static final class MobileAppCategoryConstantServiceStub extends io.grpc.stub.AbstractAsyncStub<MobileAppCategoryConstantServiceStub> {
    private MobileAppCategoryConstantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MobileAppCategoryConstantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MobileAppCategoryConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested mobile app category constant.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getMobileAppCategoryConstant(com.google.ads.googleads.v8.services.GetMobileAppCategoryConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.MobileAppCategoryConstant> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMobileAppCategoryConstantMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch mobile app category constants.
   * </pre>
   */
  public static final class MobileAppCategoryConstantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MobileAppCategoryConstantServiceBlockingStub> {
    private MobileAppCategoryConstantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MobileAppCategoryConstantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MobileAppCategoryConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested mobile app category constant.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.MobileAppCategoryConstant getMobileAppCategoryConstant(com.google.ads.googleads.v8.services.GetMobileAppCategoryConstantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMobileAppCategoryConstantMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch mobile app category constants.
   * </pre>
   */
  public static final class MobileAppCategoryConstantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MobileAppCategoryConstantServiceFutureStub> {
    private MobileAppCategoryConstantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MobileAppCategoryConstantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MobileAppCategoryConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested mobile app category constant.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.MobileAppCategoryConstant> getMobileAppCategoryConstant(
        com.google.ads.googleads.v8.services.GetMobileAppCategoryConstantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMobileAppCategoryConstantMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MOBILE_APP_CATEGORY_CONSTANT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MobileAppCategoryConstantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MobileAppCategoryConstantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MOBILE_APP_CATEGORY_CONSTANT:
          serviceImpl.getMobileAppCategoryConstant((com.google.ads.googleads.v8.services.GetMobileAppCategoryConstantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.MobileAppCategoryConstant>) responseObserver);
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

  private static abstract class MobileAppCategoryConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MobileAppCategoryConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.MobileAppCategoryConstantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MobileAppCategoryConstantService");
    }
  }

  private static final class MobileAppCategoryConstantServiceFileDescriptorSupplier
      extends MobileAppCategoryConstantServiceBaseDescriptorSupplier {
    MobileAppCategoryConstantServiceFileDescriptorSupplier() {}
  }

  private static final class MobileAppCategoryConstantServiceMethodDescriptorSupplier
      extends MobileAppCategoryConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MobileAppCategoryConstantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MobileAppCategoryConstantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MobileAppCategoryConstantServiceFileDescriptorSupplier())
              .addMethod(getGetMobileAppCategoryConstantMethod())
              .build();
        }
      }
    }
    return result;
  }
}
