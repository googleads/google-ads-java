package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch bidding strategy simulations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/bidding_strategy_simulation_service.proto")
public final class BiddingStrategySimulationServiceGrpc {

  private BiddingStrategySimulationServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.BiddingStrategySimulationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetBiddingStrategySimulationRequest,
      com.google.ads.googleads.v8.resources.BiddingStrategySimulation> getGetBiddingStrategySimulationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBiddingStrategySimulation",
      requestType = com.google.ads.googleads.v8.services.GetBiddingStrategySimulationRequest.class,
      responseType = com.google.ads.googleads.v8.resources.BiddingStrategySimulation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetBiddingStrategySimulationRequest,
      com.google.ads.googleads.v8.resources.BiddingStrategySimulation> getGetBiddingStrategySimulationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetBiddingStrategySimulationRequest, com.google.ads.googleads.v8.resources.BiddingStrategySimulation> getGetBiddingStrategySimulationMethod;
    if ((getGetBiddingStrategySimulationMethod = BiddingStrategySimulationServiceGrpc.getGetBiddingStrategySimulationMethod) == null) {
      synchronized (BiddingStrategySimulationServiceGrpc.class) {
        if ((getGetBiddingStrategySimulationMethod = BiddingStrategySimulationServiceGrpc.getGetBiddingStrategySimulationMethod) == null) {
          BiddingStrategySimulationServiceGrpc.getGetBiddingStrategySimulationMethod = getGetBiddingStrategySimulationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetBiddingStrategySimulationRequest, com.google.ads.googleads.v8.resources.BiddingStrategySimulation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBiddingStrategySimulation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetBiddingStrategySimulationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.BiddingStrategySimulation.getDefaultInstance()))
              .setSchemaDescriptor(new BiddingStrategySimulationServiceMethodDescriptorSupplier("GetBiddingStrategySimulation"))
              .build();
        }
      }
    }
    return getGetBiddingStrategySimulationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BiddingStrategySimulationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BiddingStrategySimulationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BiddingStrategySimulationServiceStub>() {
        @java.lang.Override
        public BiddingStrategySimulationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BiddingStrategySimulationServiceStub(channel, callOptions);
        }
      };
    return BiddingStrategySimulationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BiddingStrategySimulationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BiddingStrategySimulationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BiddingStrategySimulationServiceBlockingStub>() {
        @java.lang.Override
        public BiddingStrategySimulationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BiddingStrategySimulationServiceBlockingStub(channel, callOptions);
        }
      };
    return BiddingStrategySimulationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BiddingStrategySimulationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BiddingStrategySimulationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BiddingStrategySimulationServiceFutureStub>() {
        @java.lang.Override
        public BiddingStrategySimulationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BiddingStrategySimulationServiceFutureStub(channel, callOptions);
        }
      };
    return BiddingStrategySimulationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch bidding strategy simulations.
   * </pre>
   */
  public static abstract class BiddingStrategySimulationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested bidding strategy simulation in full detail.
     * </pre>
     */
    public void getBiddingStrategySimulation(com.google.ads.googleads.v8.services.GetBiddingStrategySimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.BiddingStrategySimulation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBiddingStrategySimulationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBiddingStrategySimulationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetBiddingStrategySimulationRequest,
                com.google.ads.googleads.v8.resources.BiddingStrategySimulation>(
                  this, METHODID_GET_BIDDING_STRATEGY_SIMULATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch bidding strategy simulations.
   * </pre>
   */
  public static final class BiddingStrategySimulationServiceStub extends io.grpc.stub.AbstractAsyncStub<BiddingStrategySimulationServiceStub> {
    private BiddingStrategySimulationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingStrategySimulationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BiddingStrategySimulationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested bidding strategy simulation in full detail.
     * </pre>
     */
    public void getBiddingStrategySimulation(com.google.ads.googleads.v8.services.GetBiddingStrategySimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.BiddingStrategySimulation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBiddingStrategySimulationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch bidding strategy simulations.
   * </pre>
   */
  public static final class BiddingStrategySimulationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BiddingStrategySimulationServiceBlockingStub> {
    private BiddingStrategySimulationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingStrategySimulationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BiddingStrategySimulationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested bidding strategy simulation in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.BiddingStrategySimulation getBiddingStrategySimulation(com.google.ads.googleads.v8.services.GetBiddingStrategySimulationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBiddingStrategySimulationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch bidding strategy simulations.
   * </pre>
   */
  public static final class BiddingStrategySimulationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BiddingStrategySimulationServiceFutureStub> {
    private BiddingStrategySimulationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingStrategySimulationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BiddingStrategySimulationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested bidding strategy simulation in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.BiddingStrategySimulation> getBiddingStrategySimulation(
        com.google.ads.googleads.v8.services.GetBiddingStrategySimulationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBiddingStrategySimulationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BIDDING_STRATEGY_SIMULATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BiddingStrategySimulationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BiddingStrategySimulationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BIDDING_STRATEGY_SIMULATION:
          serviceImpl.getBiddingStrategySimulation((com.google.ads.googleads.v8.services.GetBiddingStrategySimulationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.BiddingStrategySimulation>) responseObserver);
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

  private static abstract class BiddingStrategySimulationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BiddingStrategySimulationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.BiddingStrategySimulationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BiddingStrategySimulationService");
    }
  }

  private static final class BiddingStrategySimulationServiceFileDescriptorSupplier
      extends BiddingStrategySimulationServiceBaseDescriptorSupplier {
    BiddingStrategySimulationServiceFileDescriptorSupplier() {}
  }

  private static final class BiddingStrategySimulationServiceMethodDescriptorSupplier
      extends BiddingStrategySimulationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BiddingStrategySimulationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BiddingStrategySimulationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BiddingStrategySimulationServiceFileDescriptorSupplier())
              .addMethod(getGetBiddingStrategySimulationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
