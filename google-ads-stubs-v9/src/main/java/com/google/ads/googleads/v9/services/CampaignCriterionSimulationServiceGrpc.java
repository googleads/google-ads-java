package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch campaign criterion simulations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/campaign_criterion_simulation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignCriterionSimulationServiceGrpc {

  private CampaignCriterionSimulationServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.CampaignCriterionSimulationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCampaignCriterionSimulationRequest,
      com.google.ads.googleads.v9.resources.CampaignCriterionSimulation> getGetCampaignCriterionSimulationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignCriterionSimulation",
      requestType = com.google.ads.googleads.v9.services.GetCampaignCriterionSimulationRequest.class,
      responseType = com.google.ads.googleads.v9.resources.CampaignCriterionSimulation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCampaignCriterionSimulationRequest,
      com.google.ads.googleads.v9.resources.CampaignCriterionSimulation> getGetCampaignCriterionSimulationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCampaignCriterionSimulationRequest, com.google.ads.googleads.v9.resources.CampaignCriterionSimulation> getGetCampaignCriterionSimulationMethod;
    if ((getGetCampaignCriterionSimulationMethod = CampaignCriterionSimulationServiceGrpc.getGetCampaignCriterionSimulationMethod) == null) {
      synchronized (CampaignCriterionSimulationServiceGrpc.class) {
        if ((getGetCampaignCriterionSimulationMethod = CampaignCriterionSimulationServiceGrpc.getGetCampaignCriterionSimulationMethod) == null) {
          CampaignCriterionSimulationServiceGrpc.getGetCampaignCriterionSimulationMethod = getGetCampaignCriterionSimulationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetCampaignCriterionSimulationRequest, com.google.ads.googleads.v9.resources.CampaignCriterionSimulation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignCriterionSimulation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetCampaignCriterionSimulationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.CampaignCriterionSimulation.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignCriterionSimulationServiceMethodDescriptorSupplier("GetCampaignCriterionSimulation"))
              .build();
        }
      }
    }
    return getGetCampaignCriterionSimulationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignCriterionSimulationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignCriterionSimulationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignCriterionSimulationServiceStub>() {
        @java.lang.Override
        public CampaignCriterionSimulationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignCriterionSimulationServiceStub(channel, callOptions);
        }
      };
    return CampaignCriterionSimulationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignCriterionSimulationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignCriterionSimulationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignCriterionSimulationServiceBlockingStub>() {
        @java.lang.Override
        public CampaignCriterionSimulationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignCriterionSimulationServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignCriterionSimulationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignCriterionSimulationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignCriterionSimulationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignCriterionSimulationServiceFutureStub>() {
        @java.lang.Override
        public CampaignCriterionSimulationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignCriterionSimulationServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignCriterionSimulationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch campaign criterion simulations.
   * </pre>
   */
  public static abstract class CampaignCriterionSimulationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign criterion simulation in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCampaignCriterionSimulation(com.google.ads.googleads.v9.services.GetCampaignCriterionSimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CampaignCriterionSimulation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCampaignCriterionSimulationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignCriterionSimulationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetCampaignCriterionSimulationRequest,
                com.google.ads.googleads.v9.resources.CampaignCriterionSimulation>(
                  this, METHODID_GET_CAMPAIGN_CRITERION_SIMULATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch campaign criterion simulations.
   * </pre>
   */
  public static final class CampaignCriterionSimulationServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignCriterionSimulationServiceStub> {
    private CampaignCriterionSimulationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCriterionSimulationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignCriterionSimulationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign criterion simulation in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCampaignCriterionSimulation(com.google.ads.googleads.v9.services.GetCampaignCriterionSimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CampaignCriterionSimulation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCampaignCriterionSimulationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch campaign criterion simulations.
   * </pre>
   */
  public static final class CampaignCriterionSimulationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignCriterionSimulationServiceBlockingStub> {
    private CampaignCriterionSimulationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCriterionSimulationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignCriterionSimulationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign criterion simulation in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.CampaignCriterionSimulation getCampaignCriterionSimulation(com.google.ads.googleads.v9.services.GetCampaignCriterionSimulationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCampaignCriterionSimulationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch campaign criterion simulations.
   * </pre>
   */
  public static final class CampaignCriterionSimulationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignCriterionSimulationServiceFutureStub> {
    private CampaignCriterionSimulationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCriterionSimulationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignCriterionSimulationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign criterion simulation in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.CampaignCriterionSimulation> getCampaignCriterionSimulation(
        com.google.ads.googleads.v9.services.GetCampaignCriterionSimulationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCampaignCriterionSimulationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_CRITERION_SIMULATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignCriterionSimulationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignCriterionSimulationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_CRITERION_SIMULATION:
          serviceImpl.getCampaignCriterionSimulation((com.google.ads.googleads.v9.services.GetCampaignCriterionSimulationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CampaignCriterionSimulation>) responseObserver);
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

  private static abstract class CampaignCriterionSimulationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignCriterionSimulationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.CampaignCriterionSimulationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignCriterionSimulationService");
    }
  }

  private static final class CampaignCriterionSimulationServiceFileDescriptorSupplier
      extends CampaignCriterionSimulationServiceBaseDescriptorSupplier {
    CampaignCriterionSimulationServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignCriterionSimulationServiceMethodDescriptorSupplier
      extends CampaignCriterionSimulationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignCriterionSimulationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignCriterionSimulationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignCriterionSimulationServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignCriterionSimulationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
