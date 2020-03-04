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
 * Service to manage labels on ad group ads.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/ad_group_ad_label_service.proto")
public final class AdGroupAdLabelServiceGrpc {

  private AdGroupAdLabelServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.AdGroupAdLabelService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAdGroupAdLabelMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupAdLabelRequest,
      com.google.ads.googleads.v3.resources.AdGroupAdLabel> METHOD_GET_AD_GROUP_AD_LABEL = getGetAdGroupAdLabelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupAdLabelRequest,
      com.google.ads.googleads.v3.resources.AdGroupAdLabel> getGetAdGroupAdLabelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupAdLabelRequest,
      com.google.ads.googleads.v3.resources.AdGroupAdLabel> getGetAdGroupAdLabelMethod() {
    return getGetAdGroupAdLabelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupAdLabelRequest,
      com.google.ads.googleads.v3.resources.AdGroupAdLabel> getGetAdGroupAdLabelMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupAdLabelRequest, com.google.ads.googleads.v3.resources.AdGroupAdLabel> getGetAdGroupAdLabelMethod;
    if ((getGetAdGroupAdLabelMethod = AdGroupAdLabelServiceGrpc.getGetAdGroupAdLabelMethod) == null) {
      synchronized (AdGroupAdLabelServiceGrpc.class) {
        if ((getGetAdGroupAdLabelMethod = AdGroupAdLabelServiceGrpc.getGetAdGroupAdLabelMethod) == null) {
          AdGroupAdLabelServiceGrpc.getGetAdGroupAdLabelMethod = getGetAdGroupAdLabelMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetAdGroupAdLabelRequest, com.google.ads.googleads.v3.resources.AdGroupAdLabel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.AdGroupAdLabelService", "GetAdGroupAdLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetAdGroupAdLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.AdGroupAdLabel.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupAdLabelServiceMethodDescriptorSupplier("GetAdGroupAdLabel"))
                  .build();
          }
        }
     }
     return getGetAdGroupAdLabelMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateAdGroupAdLabelsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsRequest,
      com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsResponse> METHOD_MUTATE_AD_GROUP_AD_LABELS = getMutateAdGroupAdLabelsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsRequest,
      com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsResponse> getMutateAdGroupAdLabelsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsRequest,
      com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsResponse> getMutateAdGroupAdLabelsMethod() {
    return getMutateAdGroupAdLabelsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsRequest,
      com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsResponse> getMutateAdGroupAdLabelsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsRequest, com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsResponse> getMutateAdGroupAdLabelsMethod;
    if ((getMutateAdGroupAdLabelsMethod = AdGroupAdLabelServiceGrpc.getMutateAdGroupAdLabelsMethod) == null) {
      synchronized (AdGroupAdLabelServiceGrpc.class) {
        if ((getMutateAdGroupAdLabelsMethod = AdGroupAdLabelServiceGrpc.getMutateAdGroupAdLabelsMethod) == null) {
          AdGroupAdLabelServiceGrpc.getMutateAdGroupAdLabelsMethod = getMutateAdGroupAdLabelsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsRequest, com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.AdGroupAdLabelService", "MutateAdGroupAdLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupAdLabelServiceMethodDescriptorSupplier("MutateAdGroupAdLabels"))
                  .build();
          }
        }
     }
     return getMutateAdGroupAdLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupAdLabelServiceStub newStub(io.grpc.Channel channel) {
    return new AdGroupAdLabelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupAdLabelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdGroupAdLabelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupAdLabelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdGroupAdLabelServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage labels on ad group ads.
   * </pre>
   */
  public static abstract class AdGroupAdLabelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad group ad label in full detail.
     * </pre>
     */
    public void getAdGroupAdLabel(com.google.ads.googleads.v3.services.GetAdGroupAdLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.AdGroupAdLabel> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdGroupAdLabelMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates and removes ad group ad labels.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroupAdLabels(com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAdGroupAdLabelsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupAdLabelMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetAdGroupAdLabelRequest,
                com.google.ads.googleads.v3.resources.AdGroupAdLabel>(
                  this, METHODID_GET_AD_GROUP_AD_LABEL)))
          .addMethod(
            getMutateAdGroupAdLabelsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsRequest,
                com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsResponse>(
                  this, METHODID_MUTATE_AD_GROUP_AD_LABELS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage labels on ad group ads.
   * </pre>
   */
  public static final class AdGroupAdLabelServiceStub extends io.grpc.stub.AbstractStub<AdGroupAdLabelServiceStub> {
    private AdGroupAdLabelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupAdLabelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdLabelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupAdLabelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group ad label in full detail.
     * </pre>
     */
    public void getAdGroupAdLabel(com.google.ads.googleads.v3.services.GetAdGroupAdLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.AdGroupAdLabel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdGroupAdLabelMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates and removes ad group ad labels.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroupAdLabels(com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupAdLabelsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage labels on ad group ads.
   * </pre>
   */
  public static final class AdGroupAdLabelServiceBlockingStub extends io.grpc.stub.AbstractStub<AdGroupAdLabelServiceBlockingStub> {
    private AdGroupAdLabelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupAdLabelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdLabelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupAdLabelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group ad label in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.AdGroupAdLabel getAdGroupAdLabel(com.google.ads.googleads.v3.services.GetAdGroupAdLabelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdGroupAdLabelMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates and removes ad group ad labels.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsResponse mutateAdGroupAdLabels(com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAdGroupAdLabelsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage labels on ad group ads.
   * </pre>
   */
  public static final class AdGroupAdLabelServiceFutureStub extends io.grpc.stub.AbstractStub<AdGroupAdLabelServiceFutureStub> {
    private AdGroupAdLabelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupAdLabelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdLabelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupAdLabelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group ad label in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.AdGroupAdLabel> getAdGroupAdLabel(
        com.google.ads.googleads.v3.services.GetAdGroupAdLabelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdGroupAdLabelMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates and removes ad group ad labels.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsResponse> mutateAdGroupAdLabels(
        com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAdGroupAdLabelsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_AD_LABEL = 0;
  private static final int METHODID_MUTATE_AD_GROUP_AD_LABELS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupAdLabelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupAdLabelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_AD_LABEL:
          serviceImpl.getAdGroupAdLabel((com.google.ads.googleads.v3.services.GetAdGroupAdLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.AdGroupAdLabel>) responseObserver);
          break;
        case METHODID_MUTATE_AD_GROUP_AD_LABELS:
          serviceImpl.mutateAdGroupAdLabels((com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateAdGroupAdLabelsResponse>) responseObserver);
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

  private static abstract class AdGroupAdLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupAdLabelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.AdGroupAdLabelServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupAdLabelService");
    }
  }

  private static final class AdGroupAdLabelServiceFileDescriptorSupplier
      extends AdGroupAdLabelServiceBaseDescriptorSupplier {
    AdGroupAdLabelServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupAdLabelServiceMethodDescriptorSupplier
      extends AdGroupAdLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupAdLabelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupAdLabelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupAdLabelServiceFileDescriptorSupplier())
              .addMethod(getGetAdGroupAdLabelMethodHelper())
              .addMethod(getMutateAdGroupAdLabelsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
