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
 * Service to manage labels on ad groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/ad_group_label_service.proto")
public final class AdGroupLabelServiceGrpc {

  private AdGroupLabelServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.AdGroupLabelService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAdGroupLabelMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdGroupLabelRequest,
      com.google.ads.googleads.v1.resources.AdGroupLabel> METHOD_GET_AD_GROUP_LABEL = getGetAdGroupLabelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdGroupLabelRequest,
      com.google.ads.googleads.v1.resources.AdGroupLabel> getGetAdGroupLabelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdGroupLabelRequest,
      com.google.ads.googleads.v1.resources.AdGroupLabel> getGetAdGroupLabelMethod() {
    return getGetAdGroupLabelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdGroupLabelRequest,
      com.google.ads.googleads.v1.resources.AdGroupLabel> getGetAdGroupLabelMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdGroupLabelRequest, com.google.ads.googleads.v1.resources.AdGroupLabel> getGetAdGroupLabelMethod;
    if ((getGetAdGroupLabelMethod = AdGroupLabelServiceGrpc.getGetAdGroupLabelMethod) == null) {
      synchronized (AdGroupLabelServiceGrpc.class) {
        if ((getGetAdGroupLabelMethod = AdGroupLabelServiceGrpc.getGetAdGroupLabelMethod) == null) {
          AdGroupLabelServiceGrpc.getGetAdGroupLabelMethod = getGetAdGroupLabelMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetAdGroupLabelRequest, com.google.ads.googleads.v1.resources.AdGroupLabel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.AdGroupLabelService", "GetAdGroupLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetAdGroupLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.AdGroupLabel.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupLabelServiceMethodDescriptorSupplier("GetAdGroupLabel"))
                  .build();
          }
        }
     }
     return getGetAdGroupLabelMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateAdGroupLabelsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdGroupLabelsRequest,
      com.google.ads.googleads.v1.services.MutateAdGroupLabelsResponse> METHOD_MUTATE_AD_GROUP_LABELS = getMutateAdGroupLabelsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdGroupLabelsRequest,
      com.google.ads.googleads.v1.services.MutateAdGroupLabelsResponse> getMutateAdGroupLabelsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdGroupLabelsRequest,
      com.google.ads.googleads.v1.services.MutateAdGroupLabelsResponse> getMutateAdGroupLabelsMethod() {
    return getMutateAdGroupLabelsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdGroupLabelsRequest,
      com.google.ads.googleads.v1.services.MutateAdGroupLabelsResponse> getMutateAdGroupLabelsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdGroupLabelsRequest, com.google.ads.googleads.v1.services.MutateAdGroupLabelsResponse> getMutateAdGroupLabelsMethod;
    if ((getMutateAdGroupLabelsMethod = AdGroupLabelServiceGrpc.getMutateAdGroupLabelsMethod) == null) {
      synchronized (AdGroupLabelServiceGrpc.class) {
        if ((getMutateAdGroupLabelsMethod = AdGroupLabelServiceGrpc.getMutateAdGroupLabelsMethod) == null) {
          AdGroupLabelServiceGrpc.getMutateAdGroupLabelsMethod = getMutateAdGroupLabelsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.MutateAdGroupLabelsRequest, com.google.ads.googleads.v1.services.MutateAdGroupLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.AdGroupLabelService", "MutateAdGroupLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateAdGroupLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateAdGroupLabelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupLabelServiceMethodDescriptorSupplier("MutateAdGroupLabels"))
                  .build();
          }
        }
     }
     return getMutateAdGroupLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupLabelServiceStub newStub(io.grpc.Channel channel) {
    return new AdGroupLabelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupLabelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdGroupLabelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupLabelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdGroupLabelServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage labels on ad groups.
   * </pre>
   */
  public static abstract class AdGroupLabelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad group label in full detail.
     * </pre>
     */
    public void getAdGroupLabel(com.google.ads.googleads.v1.services.GetAdGroupLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.AdGroupLabel> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdGroupLabelMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates and removes ad group labels.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroupLabels(com.google.ads.googleads.v1.services.MutateAdGroupLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateAdGroupLabelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAdGroupLabelsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupLabelMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetAdGroupLabelRequest,
                com.google.ads.googleads.v1.resources.AdGroupLabel>(
                  this, METHODID_GET_AD_GROUP_LABEL)))
          .addMethod(
            getMutateAdGroupLabelsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.MutateAdGroupLabelsRequest,
                com.google.ads.googleads.v1.services.MutateAdGroupLabelsResponse>(
                  this, METHODID_MUTATE_AD_GROUP_LABELS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage labels on ad groups.
   * </pre>
   */
  public static final class AdGroupLabelServiceStub extends io.grpc.stub.AbstractStub<AdGroupLabelServiceStub> {
    private AdGroupLabelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupLabelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupLabelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupLabelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group label in full detail.
     * </pre>
     */
    public void getAdGroupLabel(com.google.ads.googleads.v1.services.GetAdGroupLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.AdGroupLabel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdGroupLabelMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates and removes ad group labels.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroupLabels(com.google.ads.googleads.v1.services.MutateAdGroupLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateAdGroupLabelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupLabelsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage labels on ad groups.
   * </pre>
   */
  public static final class AdGroupLabelServiceBlockingStub extends io.grpc.stub.AbstractStub<AdGroupLabelServiceBlockingStub> {
    private AdGroupLabelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupLabelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupLabelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupLabelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group label in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.AdGroupLabel getAdGroupLabel(com.google.ads.googleads.v1.services.GetAdGroupLabelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdGroupLabelMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates and removes ad group labels.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.MutateAdGroupLabelsResponse mutateAdGroupLabels(com.google.ads.googleads.v1.services.MutateAdGroupLabelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAdGroupLabelsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage labels on ad groups.
   * </pre>
   */
  public static final class AdGroupLabelServiceFutureStub extends io.grpc.stub.AbstractStub<AdGroupLabelServiceFutureStub> {
    private AdGroupLabelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupLabelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupLabelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupLabelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group label in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.AdGroupLabel> getAdGroupLabel(
        com.google.ads.googleads.v1.services.GetAdGroupLabelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdGroupLabelMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates and removes ad group labels.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.MutateAdGroupLabelsResponse> mutateAdGroupLabels(
        com.google.ads.googleads.v1.services.MutateAdGroupLabelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAdGroupLabelsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_LABEL = 0;
  private static final int METHODID_MUTATE_AD_GROUP_LABELS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupLabelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupLabelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_LABEL:
          serviceImpl.getAdGroupLabel((com.google.ads.googleads.v1.services.GetAdGroupLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.AdGroupLabel>) responseObserver);
          break;
        case METHODID_MUTATE_AD_GROUP_LABELS:
          serviceImpl.mutateAdGroupLabels((com.google.ads.googleads.v1.services.MutateAdGroupLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateAdGroupLabelsResponse>) responseObserver);
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

  private static abstract class AdGroupLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupLabelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.AdGroupLabelServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupLabelService");
    }
  }

  private static final class AdGroupLabelServiceFileDescriptorSupplier
      extends AdGroupLabelServiceBaseDescriptorSupplier {
    AdGroupLabelServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupLabelServiceMethodDescriptorSupplier
      extends AdGroupLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupLabelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupLabelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupLabelServiceFileDescriptorSupplier())
              .addMethod(getGetAdGroupLabelMethodHelper())
              .addMethod(getMutateAdGroupLabelsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
