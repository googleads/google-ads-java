package com.google.ads.googleads.v7.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch carrier constants.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v7/services/carrier_constant_service.proto")
public final class CarrierConstantServiceGrpc {

  private CarrierConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v7.services.CarrierConstantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetCarrierConstantRequest,
      com.google.ads.googleads.v7.resources.CarrierConstant> getGetCarrierConstantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCarrierConstant",
      requestType = com.google.ads.googleads.v7.services.GetCarrierConstantRequest.class,
      responseType = com.google.ads.googleads.v7.resources.CarrierConstant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetCarrierConstantRequest,
      com.google.ads.googleads.v7.resources.CarrierConstant> getGetCarrierConstantMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetCarrierConstantRequest, com.google.ads.googleads.v7.resources.CarrierConstant> getGetCarrierConstantMethod;
    if ((getGetCarrierConstantMethod = CarrierConstantServiceGrpc.getGetCarrierConstantMethod) == null) {
      synchronized (CarrierConstantServiceGrpc.class) {
        if ((getGetCarrierConstantMethod = CarrierConstantServiceGrpc.getGetCarrierConstantMethod) == null) {
          CarrierConstantServiceGrpc.getGetCarrierConstantMethod = getGetCarrierConstantMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.GetCarrierConstantRequest, com.google.ads.googleads.v7.resources.CarrierConstant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCarrierConstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.GetCarrierConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.resources.CarrierConstant.getDefaultInstance()))
              .setSchemaDescriptor(new CarrierConstantServiceMethodDescriptorSupplier("GetCarrierConstant"))
              .build();
        }
      }
    }
    return getGetCarrierConstantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarrierConstantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarrierConstantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarrierConstantServiceStub>() {
        @java.lang.Override
        public CarrierConstantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarrierConstantServiceStub(channel, callOptions);
        }
      };
    return CarrierConstantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarrierConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarrierConstantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarrierConstantServiceBlockingStub>() {
        @java.lang.Override
        public CarrierConstantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarrierConstantServiceBlockingStub(channel, callOptions);
        }
      };
    return CarrierConstantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarrierConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarrierConstantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarrierConstantServiceFutureStub>() {
        @java.lang.Override
        public CarrierConstantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarrierConstantServiceFutureStub(channel, callOptions);
        }
      };
    return CarrierConstantServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch carrier constants.
   * </pre>
   */
  public static abstract class CarrierConstantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested carrier constant in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCarrierConstant(com.google.ads.googleads.v7.services.GetCarrierConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.CarrierConstant> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCarrierConstantMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCarrierConstantMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.GetCarrierConstantRequest,
                com.google.ads.googleads.v7.resources.CarrierConstant>(
                  this, METHODID_GET_CARRIER_CONSTANT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch carrier constants.
   * </pre>
   */
  public static final class CarrierConstantServiceStub extends io.grpc.stub.AbstractAsyncStub<CarrierConstantServiceStub> {
    private CarrierConstantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarrierConstantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarrierConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested carrier constant in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCarrierConstant(com.google.ads.googleads.v7.services.GetCarrierConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.CarrierConstant> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCarrierConstantMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch carrier constants.
   * </pre>
   */
  public static final class CarrierConstantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CarrierConstantServiceBlockingStub> {
    private CarrierConstantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarrierConstantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarrierConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested carrier constant in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.resources.CarrierConstant getCarrierConstant(com.google.ads.googleads.v7.services.GetCarrierConstantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCarrierConstantMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch carrier constants.
   * </pre>
   */
  public static final class CarrierConstantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CarrierConstantServiceFutureStub> {
    private CarrierConstantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarrierConstantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarrierConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested carrier constant in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.resources.CarrierConstant> getCarrierConstant(
        com.google.ads.googleads.v7.services.GetCarrierConstantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCarrierConstantMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CARRIER_CONSTANT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarrierConstantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarrierConstantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CARRIER_CONSTANT:
          serviceImpl.getCarrierConstant((com.google.ads.googleads.v7.services.GetCarrierConstantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.CarrierConstant>) responseObserver);
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

  private static abstract class CarrierConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarrierConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v7.services.CarrierConstantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarrierConstantService");
    }
  }

  private static final class CarrierConstantServiceFileDescriptorSupplier
      extends CarrierConstantServiceBaseDescriptorSupplier {
    CarrierConstantServiceFileDescriptorSupplier() {}
  }

  private static final class CarrierConstantServiceMethodDescriptorSupplier
      extends CarrierConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarrierConstantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CarrierConstantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarrierConstantServiceFileDescriptorSupplier())
              .addMethod(getGetCarrierConstantMethod())
              .build();
        }
      }
    }
    return result;
  }
}
