package com.google.ads.googleads.v7.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch campaign  simulations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v7/services/campaign_simulation_service.proto")
public final class CampaignSimulationServiceGrpc {

  private CampaignSimulationServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v7.services.CampaignSimulationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetCampaignSimulationRequest,
      com.google.ads.googleads.v7.resources.CampaignSimulation> getGetCampaignSimulationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignSimulation",
      requestType = com.google.ads.googleads.v7.services.GetCampaignSimulationRequest.class,
      responseType = com.google.ads.googleads.v7.resources.CampaignSimulation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetCampaignSimulationRequest,
      com.google.ads.googleads.v7.resources.CampaignSimulation> getGetCampaignSimulationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetCampaignSimulationRequest, com.google.ads.googleads.v7.resources.CampaignSimulation> getGetCampaignSimulationMethod;
    if ((getGetCampaignSimulationMethod = CampaignSimulationServiceGrpc.getGetCampaignSimulationMethod) == null) {
      synchronized (CampaignSimulationServiceGrpc.class) {
        if ((getGetCampaignSimulationMethod = CampaignSimulationServiceGrpc.getGetCampaignSimulationMethod) == null) {
          CampaignSimulationServiceGrpc.getGetCampaignSimulationMethod = getGetCampaignSimulationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.GetCampaignSimulationRequest, com.google.ads.googleads.v7.resources.CampaignSimulation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignSimulation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.GetCampaignSimulationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.resources.CampaignSimulation.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignSimulationServiceMethodDescriptorSupplier("GetCampaignSimulation"))
              .build();
        }
      }
    }
    return getGetCampaignSimulationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignSimulationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignSimulationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignSimulationServiceStub>() {
        @java.lang.Override
        public CampaignSimulationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignSimulationServiceStub(channel, callOptions);
        }
      };
    return CampaignSimulationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignSimulationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignSimulationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignSimulationServiceBlockingStub>() {
        @java.lang.Override
        public CampaignSimulationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignSimulationServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignSimulationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignSimulationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignSimulationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignSimulationServiceFutureStub>() {
        @java.lang.Override
        public CampaignSimulationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignSimulationServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignSimulationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch campaign  simulations.
   * </pre>
   */
  public static abstract class CampaignSimulationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign simulation in full detail.
     * </pre>
     */
    public void getCampaignSimulation(com.google.ads.googleads.v7.services.GetCampaignSimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.CampaignSimulation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCampaignSimulationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignSimulationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.GetCampaignSimulationRequest,
                com.google.ads.googleads.v7.resources.CampaignSimulation>(
                  this, METHODID_GET_CAMPAIGN_SIMULATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch campaign  simulations.
   * </pre>
   */
  public static final class CampaignSimulationServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignSimulationServiceStub> {
    private CampaignSimulationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignSimulationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignSimulationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign simulation in full detail.
     * </pre>
     */
    public void getCampaignSimulation(com.google.ads.googleads.v7.services.GetCampaignSimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.CampaignSimulation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCampaignSimulationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch campaign  simulations.
   * </pre>
   */
  public static final class CampaignSimulationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignSimulationServiceBlockingStub> {
    private CampaignSimulationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignSimulationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignSimulationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign simulation in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v7.resources.CampaignSimulation getCampaignSimulation(com.google.ads.googleads.v7.services.GetCampaignSimulationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCampaignSimulationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch campaign  simulations.
   * </pre>
   */
  public static final class CampaignSimulationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignSimulationServiceFutureStub> {
    private CampaignSimulationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignSimulationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignSimulationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign simulation in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.resources.CampaignSimulation> getCampaignSimulation(
        com.google.ads.googleads.v7.services.GetCampaignSimulationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCampaignSimulationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_SIMULATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignSimulationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignSimulationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_SIMULATION:
          serviceImpl.getCampaignSimulation((com.google.ads.googleads.v7.services.GetCampaignSimulationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.CampaignSimulation>) responseObserver);
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

  private static abstract class CampaignSimulationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignSimulationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v7.services.CampaignSimulationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignSimulationService");
    }
  }

  private static final class CampaignSimulationServiceFileDescriptorSupplier
      extends CampaignSimulationServiceBaseDescriptorSupplier {
    CampaignSimulationServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignSimulationServiceMethodDescriptorSupplier
      extends CampaignSimulationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignSimulationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignSimulationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignSimulationServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignSimulationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
