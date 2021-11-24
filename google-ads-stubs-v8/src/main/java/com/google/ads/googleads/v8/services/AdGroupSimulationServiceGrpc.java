package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch ad group simulations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/ad_group_simulation_service.proto")
public final class AdGroupSimulationServiceGrpc {

  private AdGroupSimulationServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.AdGroupSimulationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAdGroupSimulationRequest,
      com.google.ads.googleads.v8.resources.AdGroupSimulation> getGetAdGroupSimulationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdGroupSimulation",
      requestType = com.google.ads.googleads.v8.services.GetAdGroupSimulationRequest.class,
      responseType = com.google.ads.googleads.v8.resources.AdGroupSimulation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAdGroupSimulationRequest,
      com.google.ads.googleads.v8.resources.AdGroupSimulation> getGetAdGroupSimulationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAdGroupSimulationRequest, com.google.ads.googleads.v8.resources.AdGroupSimulation> getGetAdGroupSimulationMethod;
    if ((getGetAdGroupSimulationMethod = AdGroupSimulationServiceGrpc.getGetAdGroupSimulationMethod) == null) {
      synchronized (AdGroupSimulationServiceGrpc.class) {
        if ((getGetAdGroupSimulationMethod = AdGroupSimulationServiceGrpc.getGetAdGroupSimulationMethod) == null) {
          AdGroupSimulationServiceGrpc.getGetAdGroupSimulationMethod = getGetAdGroupSimulationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetAdGroupSimulationRequest, com.google.ads.googleads.v8.resources.AdGroupSimulation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdGroupSimulation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetAdGroupSimulationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.AdGroupSimulation.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupSimulationServiceMethodDescriptorSupplier("GetAdGroupSimulation"))
              .build();
        }
      }
    }
    return getGetAdGroupSimulationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupSimulationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupSimulationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupSimulationServiceStub>() {
        @java.lang.Override
        public AdGroupSimulationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupSimulationServiceStub(channel, callOptions);
        }
      };
    return AdGroupSimulationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupSimulationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupSimulationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupSimulationServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupSimulationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupSimulationServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupSimulationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupSimulationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupSimulationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupSimulationServiceFutureStub>() {
        @java.lang.Override
        public AdGroupSimulationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupSimulationServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupSimulationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch ad group simulations.
   * </pre>
   */
  public static abstract class AdGroupSimulationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad group simulation in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAdGroupSimulation(com.google.ads.googleads.v8.services.GetAdGroupSimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AdGroupSimulation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAdGroupSimulationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupSimulationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetAdGroupSimulationRequest,
                com.google.ads.googleads.v8.resources.AdGroupSimulation>(
                  this, METHODID_GET_AD_GROUP_SIMULATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch ad group simulations.
   * </pre>
   */
  public static final class AdGroupSimulationServiceStub extends io.grpc.stub.AbstractAsyncStub<AdGroupSimulationServiceStub> {
    private AdGroupSimulationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupSimulationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupSimulationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group simulation in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAdGroupSimulation(com.google.ads.googleads.v8.services.GetAdGroupSimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AdGroupSimulation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAdGroupSimulationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch ad group simulations.
   * </pre>
   */
  public static final class AdGroupSimulationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdGroupSimulationServiceBlockingStub> {
    private AdGroupSimulationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupSimulationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupSimulationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group simulation in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.AdGroupSimulation getAdGroupSimulation(com.google.ads.googleads.v8.services.GetAdGroupSimulationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAdGroupSimulationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch ad group simulations.
   * </pre>
   */
  public static final class AdGroupSimulationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdGroupSimulationServiceFutureStub> {
    private AdGroupSimulationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupSimulationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupSimulationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group simulation in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.AdGroupSimulation> getAdGroupSimulation(
        com.google.ads.googleads.v8.services.GetAdGroupSimulationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAdGroupSimulationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_SIMULATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupSimulationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupSimulationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_SIMULATION:
          serviceImpl.getAdGroupSimulation((com.google.ads.googleads.v8.services.GetAdGroupSimulationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AdGroupSimulation>) responseObserver);
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

  private static abstract class AdGroupSimulationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupSimulationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.AdGroupSimulationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupSimulationService");
    }
  }

  private static final class AdGroupSimulationServiceFileDescriptorSupplier
      extends AdGroupSimulationServiceBaseDescriptorSupplier {
    AdGroupSimulationServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupSimulationServiceMethodDescriptorSupplier
      extends AdGroupSimulationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupSimulationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupSimulationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupSimulationServiceFileDescriptorSupplier())
              .addMethod(getGetAdGroupSimulationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
