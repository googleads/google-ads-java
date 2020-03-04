package com.google.ads.googleads.v3.services;

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
 * Service to fetch ad group simulations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/ad_group_simulation_service.proto")
public final class AdGroupSimulationServiceGrpc {

  private AdGroupSimulationServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.AdGroupSimulationService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAdGroupSimulationMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupSimulationRequest,
      com.google.ads.googleads.v3.resources.AdGroupSimulation> METHOD_GET_AD_GROUP_SIMULATION = getGetAdGroupSimulationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupSimulationRequest,
      com.google.ads.googleads.v3.resources.AdGroupSimulation> getGetAdGroupSimulationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupSimulationRequest,
      com.google.ads.googleads.v3.resources.AdGroupSimulation> getGetAdGroupSimulationMethod() {
    return getGetAdGroupSimulationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupSimulationRequest,
      com.google.ads.googleads.v3.resources.AdGroupSimulation> getGetAdGroupSimulationMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupSimulationRequest, com.google.ads.googleads.v3.resources.AdGroupSimulation> getGetAdGroupSimulationMethod;
    if ((getGetAdGroupSimulationMethod = AdGroupSimulationServiceGrpc.getGetAdGroupSimulationMethod) == null) {
      synchronized (AdGroupSimulationServiceGrpc.class) {
        if ((getGetAdGroupSimulationMethod = AdGroupSimulationServiceGrpc.getGetAdGroupSimulationMethod) == null) {
          AdGroupSimulationServiceGrpc.getGetAdGroupSimulationMethod = getGetAdGroupSimulationMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetAdGroupSimulationRequest, com.google.ads.googleads.v3.resources.AdGroupSimulation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.AdGroupSimulationService", "GetAdGroupSimulation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetAdGroupSimulationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.AdGroupSimulation.getDefaultInstance()))
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
    return new AdGroupSimulationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupSimulationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdGroupSimulationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupSimulationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdGroupSimulationServiceFutureStub(channel);
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
     * </pre>
     */
    public void getAdGroupSimulation(com.google.ads.googleads.v3.services.GetAdGroupSimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.AdGroupSimulation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdGroupSimulationMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupSimulationMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetAdGroupSimulationRequest,
                com.google.ads.googleads.v3.resources.AdGroupSimulation>(
                  this, METHODID_GET_AD_GROUP_SIMULATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch ad group simulations.
   * </pre>
   */
  public static final class AdGroupSimulationServiceStub extends io.grpc.stub.AbstractStub<AdGroupSimulationServiceStub> {
    private AdGroupSimulationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupSimulationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupSimulationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupSimulationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group simulation in full detail.
     * </pre>
     */
    public void getAdGroupSimulation(com.google.ads.googleads.v3.services.GetAdGroupSimulationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.AdGroupSimulation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdGroupSimulationMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch ad group simulations.
   * </pre>
   */
  public static final class AdGroupSimulationServiceBlockingStub extends io.grpc.stub.AbstractStub<AdGroupSimulationServiceBlockingStub> {
    private AdGroupSimulationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupSimulationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupSimulationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupSimulationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group simulation in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.AdGroupSimulation getAdGroupSimulation(com.google.ads.googleads.v3.services.GetAdGroupSimulationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdGroupSimulationMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch ad group simulations.
   * </pre>
   */
  public static final class AdGroupSimulationServiceFutureStub extends io.grpc.stub.AbstractStub<AdGroupSimulationServiceFutureStub> {
    private AdGroupSimulationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupSimulationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupSimulationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupSimulationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group simulation in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.AdGroupSimulation> getAdGroupSimulation(
        com.google.ads.googleads.v3.services.GetAdGroupSimulationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdGroupSimulationMethodHelper(), getCallOptions()), request);
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
          serviceImpl.getAdGroupSimulation((com.google.ads.googleads.v3.services.GetAdGroupSimulationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.AdGroupSimulation>) responseObserver);
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
      return com.google.ads.googleads.v3.services.AdGroupSimulationServiceProto.getDescriptor();
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
              .addMethod(getGetAdGroupSimulationMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
