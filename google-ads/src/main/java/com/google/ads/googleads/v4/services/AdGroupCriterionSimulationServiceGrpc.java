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
 * Service to fetch ad group criterion simulations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/ad_group_criterion_simulation_service.proto")
public final class AdGroupCriterionSimulationServiceGrpc {

  private AdGroupCriterionSimulationServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.AdGroupCriterionSimulationService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAdGroupCriterionSimulationMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupCriterionSimulationRequest,
      com.google.ads.googleads.v4.resources.AdGroupCriterionSimulation> METHOD_GET_AD_GROUP_CRITERION_SIMULATION = getGetAdGroupCriterionSimulationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupCriterionSimulationRequest,
      com.google.ads.googleads.v4.resources.AdGroupCriterionSimulation> getGetAdGroupCriterionSimulationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupCriterionSimulationRequest,
      com.google.ads.googleads.v4.resources.AdGroupCriterionSimulation> getGetAdGroupCriterionSimulationMethod() {
    return getGetAdGroupCriterionSimulationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupCriterionSimulationRequest,
      com.google.ads.googleads.v4.resources.AdGroupCriterionSimulation> getGetAdGroupCriterionSimulationMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupCriterionSimulationRequest, com.google.ads.googleads.v4.resources.AdGroupCriterionSimulation> getGetAdGroupCriterionSimulationMethod;
    if ((getGetAdGroupCriterionSimulationMethod = AdGroupCriterionSimulationServiceGrpc.getGetAdGroupCriterionSimulationMethod) == null) {
      synchronized (AdGroupCriterionSimulationServiceGrpc.class) {
        if ((getGetAdGroupCriterionSimulationMethod = AdGroupCriterionSimulationServiceGrpc.getGetAdGroupCriterionSimulationMethod) == null) {
          AdGroupCriterionSimulationServiceGrpc.getGetAdGroupCriterionSimulationMethod = getGetAdGroupCriterionSimulationMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetAdGroupCriterionSimulationRequest, com.google.ads.googleads.v4.resources.AdGroupCriterionSimulation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.AdGroupCriterionSimulationService", "GetAdGroupCriterionSimulation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetAdGroupCriterionSimulationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.AdGroupCriterionSimulation.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupCriterionSimulationServiceMethodDescriptorSupplier("GetAdGroupCriterionSimulation"))
                  .build();
          }
        }
     }
     return getGetAdGroupCriterionSimulationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupCriterionSimulationServiceStub newStub(io.grpc.Channel channel) {
    return new AdGroupCriterionSimulationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupCriterionSimulationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdGroupCriterionSimulationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupCriterionSimulationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdGroupCriterionSimulationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch ad group criterion simulations.
   * </pre>
   */
  public static abstract class AdGroupCriterionSimulationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad group criterion simulation in full detail.
     * </pre>
     */
    public void getAdGroupCriterionSimulation(com.google.ads.googleads.v4.services.GetAdGroupCriterionSimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AdGroupCriterionSimulation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdGroupCriterionSimulationMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupCriterionSimulationMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetAdGroupCriterionSimulationRequest,
                com.google.ads.googleads.v4.resources.AdGroupCriterionSimulation>(
                  this, METHODID_GET_AD_GROUP_CRITERION_SIMULATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch ad group criterion simulations.
   * </pre>
   */
  public static final class AdGroupCriterionSimulationServiceStub extends io.grpc.stub.AbstractStub<AdGroupCriterionSimulationServiceStub> {
    private AdGroupCriterionSimulationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupCriterionSimulationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionSimulationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionSimulationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group criterion simulation in full detail.
     * </pre>
     */
    public void getAdGroupCriterionSimulation(com.google.ads.googleads.v4.services.GetAdGroupCriterionSimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AdGroupCriterionSimulation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdGroupCriterionSimulationMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch ad group criterion simulations.
   * </pre>
   */
  public static final class AdGroupCriterionSimulationServiceBlockingStub extends io.grpc.stub.AbstractStub<AdGroupCriterionSimulationServiceBlockingStub> {
    private AdGroupCriterionSimulationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupCriterionSimulationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionSimulationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionSimulationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group criterion simulation in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.AdGroupCriterionSimulation getAdGroupCriterionSimulation(com.google.ads.googleads.v4.services.GetAdGroupCriterionSimulationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdGroupCriterionSimulationMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch ad group criterion simulations.
   * </pre>
   */
  public static final class AdGroupCriterionSimulationServiceFutureStub extends io.grpc.stub.AbstractStub<AdGroupCriterionSimulationServiceFutureStub> {
    private AdGroupCriterionSimulationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupCriterionSimulationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionSimulationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionSimulationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group criterion simulation in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.AdGroupCriterionSimulation> getAdGroupCriterionSimulation(
        com.google.ads.googleads.v4.services.GetAdGroupCriterionSimulationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdGroupCriterionSimulationMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_CRITERION_SIMULATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupCriterionSimulationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupCriterionSimulationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_CRITERION_SIMULATION:
          serviceImpl.getAdGroupCriterionSimulation((com.google.ads.googleads.v4.services.GetAdGroupCriterionSimulationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AdGroupCriterionSimulation>) responseObserver);
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

  private static abstract class AdGroupCriterionSimulationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupCriterionSimulationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.AdGroupCriterionSimulationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupCriterionSimulationService");
    }
  }

  private static final class AdGroupCriterionSimulationServiceFileDescriptorSupplier
      extends AdGroupCriterionSimulationServiceBaseDescriptorSupplier {
    AdGroupCriterionSimulationServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupCriterionSimulationServiceMethodDescriptorSupplier
      extends AdGroupCriterionSimulationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupCriterionSimulationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupCriterionSimulationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupCriterionSimulationServiceFileDescriptorSupplier())
              .addMethod(getGetAdGroupCriterionSimulationMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
