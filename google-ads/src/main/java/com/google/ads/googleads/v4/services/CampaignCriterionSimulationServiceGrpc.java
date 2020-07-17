package com.google.ads.googleads.v4.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service to fetch campaign criterion simulations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/campaign_criterion_simulation_service.proto")
public final class CampaignCriterionSimulationServiceGrpc {

  private CampaignCriterionSimulationServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.CampaignCriterionSimulationService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCampaignCriterionSimulationMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCampaignCriterionSimulationRequest,
      com.google.ads.googleads.v4.resources.CampaignCriterionSimulation> METHOD_GET_CAMPAIGN_CRITERION_SIMULATION = getGetCampaignCriterionSimulationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCampaignCriterionSimulationRequest,
      com.google.ads.googleads.v4.resources.CampaignCriterionSimulation> getGetCampaignCriterionSimulationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCampaignCriterionSimulationRequest,
      com.google.ads.googleads.v4.resources.CampaignCriterionSimulation> getGetCampaignCriterionSimulationMethod() {
    return getGetCampaignCriterionSimulationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCampaignCriterionSimulationRequest,
      com.google.ads.googleads.v4.resources.CampaignCriterionSimulation> getGetCampaignCriterionSimulationMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCampaignCriterionSimulationRequest, com.google.ads.googleads.v4.resources.CampaignCriterionSimulation> getGetCampaignCriterionSimulationMethod;
    if ((getGetCampaignCriterionSimulationMethod = CampaignCriterionSimulationServiceGrpc.getGetCampaignCriterionSimulationMethod) == null) {
      synchronized (CampaignCriterionSimulationServiceGrpc.class) {
        if ((getGetCampaignCriterionSimulationMethod = CampaignCriterionSimulationServiceGrpc.getGetCampaignCriterionSimulationMethod) == null) {
          CampaignCriterionSimulationServiceGrpc.getGetCampaignCriterionSimulationMethod = getGetCampaignCriterionSimulationMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetCampaignCriterionSimulationRequest, com.google.ads.googleads.v4.resources.CampaignCriterionSimulation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.CampaignCriterionSimulationService", "GetCampaignCriterionSimulation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetCampaignCriterionSimulationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.CampaignCriterionSimulation.getDefaultInstance()))
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
    return new CampaignCriterionSimulationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignCriterionSimulationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CampaignCriterionSimulationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignCriterionSimulationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CampaignCriterionSimulationServiceFutureStub(channel);
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
     * </pre>
     */
    public void getCampaignCriterionSimulation(com.google.ads.googleads.v4.services.GetCampaignCriterionSimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CampaignCriterionSimulation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignCriterionSimulationMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignCriterionSimulationMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetCampaignCriterionSimulationRequest,
                com.google.ads.googleads.v4.resources.CampaignCriterionSimulation>(
                  this, METHODID_GET_CAMPAIGN_CRITERION_SIMULATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch campaign criterion simulations.
   * </pre>
   */
  public static final class CampaignCriterionSimulationServiceStub extends io.grpc.stub.AbstractStub<CampaignCriterionSimulationServiceStub> {
    private CampaignCriterionSimulationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignCriterionSimulationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCriterionSimulationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignCriterionSimulationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign criterion simulation in full detail.
     * </pre>
     */
    public void getCampaignCriterionSimulation(com.google.ads.googleads.v4.services.GetCampaignCriterionSimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CampaignCriterionSimulation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignCriterionSimulationMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch campaign criterion simulations.
   * </pre>
   */
  public static final class CampaignCriterionSimulationServiceBlockingStub extends io.grpc.stub.AbstractStub<CampaignCriterionSimulationServiceBlockingStub> {
    private CampaignCriterionSimulationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignCriterionSimulationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCriterionSimulationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignCriterionSimulationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign criterion simulation in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.CampaignCriterionSimulation getCampaignCriterionSimulation(com.google.ads.googleads.v4.services.GetCampaignCriterionSimulationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignCriterionSimulationMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch campaign criterion simulations.
   * </pre>
   */
  public static final class CampaignCriterionSimulationServiceFutureStub extends io.grpc.stub.AbstractStub<CampaignCriterionSimulationServiceFutureStub> {
    private CampaignCriterionSimulationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignCriterionSimulationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCriterionSimulationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignCriterionSimulationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign criterion simulation in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.CampaignCriterionSimulation> getCampaignCriterionSimulation(
        com.google.ads.googleads.v4.services.GetCampaignCriterionSimulationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignCriterionSimulationMethodHelper(), getCallOptions()), request);
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
          serviceImpl.getCampaignCriterionSimulation((com.google.ads.googleads.v4.services.GetCampaignCriterionSimulationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CampaignCriterionSimulation>) responseObserver);
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
      return com.google.ads.googleads.v4.services.CampaignCriterionSimulationServiceProto.getDescriptor();
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
              .addMethod(getGetCampaignCriterionSimulationMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
