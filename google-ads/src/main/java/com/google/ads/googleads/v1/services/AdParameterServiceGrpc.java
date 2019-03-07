package com.google.ads.googleads.v1.services;

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
 * Service to manage ad parameters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/ad_parameter_service.proto")
public final class AdParameterServiceGrpc {

  private AdParameterServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.AdParameterService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAdParameterMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdParameterRequest,
      com.google.ads.googleads.v1.resources.AdParameter> METHOD_GET_AD_PARAMETER = getGetAdParameterMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdParameterRequest,
      com.google.ads.googleads.v1.resources.AdParameter> getGetAdParameterMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdParameterRequest,
      com.google.ads.googleads.v1.resources.AdParameter> getGetAdParameterMethod() {
    return getGetAdParameterMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdParameterRequest,
      com.google.ads.googleads.v1.resources.AdParameter> getGetAdParameterMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdParameterRequest, com.google.ads.googleads.v1.resources.AdParameter> getGetAdParameterMethod;
    if ((getGetAdParameterMethod = AdParameterServiceGrpc.getGetAdParameterMethod) == null) {
      synchronized (AdParameterServiceGrpc.class) {
        if ((getGetAdParameterMethod = AdParameterServiceGrpc.getGetAdParameterMethod) == null) {
          AdParameterServiceGrpc.getGetAdParameterMethod = getGetAdParameterMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetAdParameterRequest, com.google.ads.googleads.v1.resources.AdParameter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.AdParameterService", "GetAdParameter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetAdParameterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.AdParameter.getDefaultInstance()))
                  .setSchemaDescriptor(new AdParameterServiceMethodDescriptorSupplier("GetAdParameter"))
                  .build();
          }
        }
     }
     return getGetAdParameterMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateAdParametersMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdParametersRequest,
      com.google.ads.googleads.v1.services.MutateAdParametersResponse> METHOD_MUTATE_AD_PARAMETERS = getMutateAdParametersMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdParametersRequest,
      com.google.ads.googleads.v1.services.MutateAdParametersResponse> getMutateAdParametersMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdParametersRequest,
      com.google.ads.googleads.v1.services.MutateAdParametersResponse> getMutateAdParametersMethod() {
    return getMutateAdParametersMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdParametersRequest,
      com.google.ads.googleads.v1.services.MutateAdParametersResponse> getMutateAdParametersMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdParametersRequest, com.google.ads.googleads.v1.services.MutateAdParametersResponse> getMutateAdParametersMethod;
    if ((getMutateAdParametersMethod = AdParameterServiceGrpc.getMutateAdParametersMethod) == null) {
      synchronized (AdParameterServiceGrpc.class) {
        if ((getMutateAdParametersMethod = AdParameterServiceGrpc.getMutateAdParametersMethod) == null) {
          AdParameterServiceGrpc.getMutateAdParametersMethod = getMutateAdParametersMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.MutateAdParametersRequest, com.google.ads.googleads.v1.services.MutateAdParametersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.AdParameterService", "MutateAdParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateAdParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateAdParametersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdParameterServiceMethodDescriptorSupplier("MutateAdParameters"))
                  .build();
          }
        }
     }
     return getMutateAdParametersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdParameterServiceStub newStub(io.grpc.Channel channel) {
    return new AdParameterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdParameterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdParameterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdParameterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdParameterServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage ad parameters.
   * </pre>
   */
  public static abstract class AdParameterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad parameter in full detail.
     * </pre>
     */
    public void getAdParameter(com.google.ads.googleads.v1.services.GetAdParameterRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.AdParameter> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdParameterMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad parameters. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAdParameters(com.google.ads.googleads.v1.services.MutateAdParametersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateAdParametersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAdParametersMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdParameterMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetAdParameterRequest,
                com.google.ads.googleads.v1.resources.AdParameter>(
                  this, METHODID_GET_AD_PARAMETER)))
          .addMethod(
            getMutateAdParametersMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.MutateAdParametersRequest,
                com.google.ads.googleads.v1.services.MutateAdParametersResponse>(
                  this, METHODID_MUTATE_AD_PARAMETERS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ad parameters.
   * </pre>
   */
  public static final class AdParameterServiceStub extends io.grpc.stub.AbstractStub<AdParameterServiceStub> {
    private AdParameterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdParameterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdParameterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdParameterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad parameter in full detail.
     * </pre>
     */
    public void getAdParameter(com.google.ads.googleads.v1.services.GetAdParameterRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.AdParameter> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdParameterMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad parameters. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAdParameters(com.google.ads.googleads.v1.services.MutateAdParametersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateAdParametersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAdParametersMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ad parameters.
   * </pre>
   */
  public static final class AdParameterServiceBlockingStub extends io.grpc.stub.AbstractStub<AdParameterServiceBlockingStub> {
    private AdParameterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdParameterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdParameterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdParameterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad parameter in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.AdParameter getAdParameter(com.google.ads.googleads.v1.services.GetAdParameterRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdParameterMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad parameters. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.MutateAdParametersResponse mutateAdParameters(com.google.ads.googleads.v1.services.MutateAdParametersRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAdParametersMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ad parameters.
   * </pre>
   */
  public static final class AdParameterServiceFutureStub extends io.grpc.stub.AbstractStub<AdParameterServiceFutureStub> {
    private AdParameterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdParameterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdParameterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdParameterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad parameter in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.AdParameter> getAdParameter(
        com.google.ads.googleads.v1.services.GetAdParameterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdParameterMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad parameters. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.MutateAdParametersResponse> mutateAdParameters(
        com.google.ads.googleads.v1.services.MutateAdParametersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAdParametersMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_PARAMETER = 0;
  private static final int METHODID_MUTATE_AD_PARAMETERS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdParameterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdParameterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_PARAMETER:
          serviceImpl.getAdParameter((com.google.ads.googleads.v1.services.GetAdParameterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.AdParameter>) responseObserver);
          break;
        case METHODID_MUTATE_AD_PARAMETERS:
          serviceImpl.mutateAdParameters((com.google.ads.googleads.v1.services.MutateAdParametersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateAdParametersResponse>) responseObserver);
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

  private static abstract class AdParameterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdParameterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.AdParameterServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdParameterService");
    }
  }

  private static final class AdParameterServiceFileDescriptorSupplier
      extends AdParameterServiceBaseDescriptorSupplier {
    AdParameterServiceFileDescriptorSupplier() {}
  }

  private static final class AdParameterServiceMethodDescriptorSupplier
      extends AdParameterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdParameterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdParameterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdParameterServiceFileDescriptorSupplier())
              .addMethod(getGetAdParameterMethodHelper())
              .addMethod(getMutateAdParametersMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
