package com.google.ads.googleads.v6.services;

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
 * Service to manage labels on ad group criteria.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/ad_group_criterion_label_service.proto")
public final class AdGroupCriterionLabelServiceGrpc {

  private AdGroupCriterionLabelServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.AdGroupCriterionLabelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAdGroupCriterionLabelRequest,
      com.google.ads.googleads.v6.resources.AdGroupCriterionLabel> getGetAdGroupCriterionLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdGroupCriterionLabel",
      requestType = com.google.ads.googleads.v6.services.GetAdGroupCriterionLabelRequest.class,
      responseType = com.google.ads.googleads.v6.resources.AdGroupCriterionLabel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAdGroupCriterionLabelRequest,
      com.google.ads.googleads.v6.resources.AdGroupCriterionLabel> getGetAdGroupCriterionLabelMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAdGroupCriterionLabelRequest, com.google.ads.googleads.v6.resources.AdGroupCriterionLabel> getGetAdGroupCriterionLabelMethod;
    if ((getGetAdGroupCriterionLabelMethod = AdGroupCriterionLabelServiceGrpc.getGetAdGroupCriterionLabelMethod) == null) {
      synchronized (AdGroupCriterionLabelServiceGrpc.class) {
        if ((getGetAdGroupCriterionLabelMethod = AdGroupCriterionLabelServiceGrpc.getGetAdGroupCriterionLabelMethod) == null) {
          AdGroupCriterionLabelServiceGrpc.getGetAdGroupCriterionLabelMethod = getGetAdGroupCriterionLabelMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetAdGroupCriterionLabelRequest, com.google.ads.googleads.v6.resources.AdGroupCriterionLabel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdGroupCriterionLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetAdGroupCriterionLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.AdGroupCriterionLabel.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupCriterionLabelServiceMethodDescriptorSupplier("GetAdGroupCriterionLabel"))
              .build();
        }
      }
    }
    return getGetAdGroupCriterionLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsRequest,
      com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsResponse> getMutateAdGroupCriterionLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupCriterionLabels",
      requestType = com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsRequest,
      com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsResponse> getMutateAdGroupCriterionLabelsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsRequest, com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsResponse> getMutateAdGroupCriterionLabelsMethod;
    if ((getMutateAdGroupCriterionLabelsMethod = AdGroupCriterionLabelServiceGrpc.getMutateAdGroupCriterionLabelsMethod) == null) {
      synchronized (AdGroupCriterionLabelServiceGrpc.class) {
        if ((getMutateAdGroupCriterionLabelsMethod = AdGroupCriterionLabelServiceGrpc.getMutateAdGroupCriterionLabelsMethod) == null) {
          AdGroupCriterionLabelServiceGrpc.getMutateAdGroupCriterionLabelsMethod = getMutateAdGroupCriterionLabelsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsRequest, com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupCriterionLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupCriterionLabelServiceMethodDescriptorSupplier("MutateAdGroupCriterionLabels"))
              .build();
        }
      }
    }
    return getMutateAdGroupCriterionLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupCriterionLabelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceStub>() {
        @java.lang.Override
        public AdGroupCriterionLabelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCriterionLabelServiceStub(channel, callOptions);
        }
      };
    return AdGroupCriterionLabelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupCriterionLabelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupCriterionLabelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCriterionLabelServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupCriterionLabelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupCriterionLabelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceFutureStub>() {
        @java.lang.Override
        public AdGroupCriterionLabelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCriterionLabelServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupCriterionLabelServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage labels on ad group criteria.
   * </pre>
   */
  public static abstract class AdGroupCriterionLabelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad group criterion label in full detail.
     * </pre>
     */
    public void getAdGroupCriterionLabel(com.google.ads.googleads.v6.services.GetAdGroupCriterionLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AdGroupCriterionLabel> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdGroupCriterionLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates and removes ad group criterion labels.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroupCriterionLabels(com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAdGroupCriterionLabelsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupCriterionLabelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetAdGroupCriterionLabelRequest,
                com.google.ads.googleads.v6.resources.AdGroupCriterionLabel>(
                  this, METHODID_GET_AD_GROUP_CRITERION_LABEL)))
          .addMethod(
            getMutateAdGroupCriterionLabelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsRequest,
                com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsResponse>(
                  this, METHODID_MUTATE_AD_GROUP_CRITERION_LABELS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage labels on ad group criteria.
   * </pre>
   */
  public static final class AdGroupCriterionLabelServiceStub extends io.grpc.stub.AbstractAsyncStub<AdGroupCriterionLabelServiceStub> {
    private AdGroupCriterionLabelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionLabelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionLabelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group criterion label in full detail.
     * </pre>
     */
    public void getAdGroupCriterionLabel(com.google.ads.googleads.v6.services.GetAdGroupCriterionLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AdGroupCriterionLabel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdGroupCriterionLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates and removes ad group criterion labels.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroupCriterionLabels(com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupCriterionLabelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage labels on ad group criteria.
   * </pre>
   */
  public static final class AdGroupCriterionLabelServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdGroupCriterionLabelServiceBlockingStub> {
    private AdGroupCriterionLabelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionLabelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionLabelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group criterion label in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.AdGroupCriterionLabel getAdGroupCriterionLabel(com.google.ads.googleads.v6.services.GetAdGroupCriterionLabelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdGroupCriterionLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates and removes ad group criterion labels.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsResponse mutateAdGroupCriterionLabels(com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAdGroupCriterionLabelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage labels on ad group criteria.
   * </pre>
   */
  public static final class AdGroupCriterionLabelServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdGroupCriterionLabelServiceFutureStub> {
    private AdGroupCriterionLabelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionLabelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionLabelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group criterion label in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.AdGroupCriterionLabel> getAdGroupCriterionLabel(
        com.google.ads.googleads.v6.services.GetAdGroupCriterionLabelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdGroupCriterionLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates and removes ad group criterion labels.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsResponse> mutateAdGroupCriterionLabels(
        com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAdGroupCriterionLabelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_CRITERION_LABEL = 0;
  private static final int METHODID_MUTATE_AD_GROUP_CRITERION_LABELS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupCriterionLabelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupCriterionLabelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_CRITERION_LABEL:
          serviceImpl.getAdGroupCriterionLabel((com.google.ads.googleads.v6.services.GetAdGroupCriterionLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AdGroupCriterionLabel>) responseObserver);
          break;
        case METHODID_MUTATE_AD_GROUP_CRITERION_LABELS:
          serviceImpl.mutateAdGroupCriterionLabels((com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateAdGroupCriterionLabelsResponse>) responseObserver);
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

  private static abstract class AdGroupCriterionLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupCriterionLabelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.AdGroupCriterionLabelServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupCriterionLabelService");
    }
  }

  private static final class AdGroupCriterionLabelServiceFileDescriptorSupplier
      extends AdGroupCriterionLabelServiceBaseDescriptorSupplier {
    AdGroupCriterionLabelServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupCriterionLabelServiceMethodDescriptorSupplier
      extends AdGroupCriterionLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupCriterionLabelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupCriterionLabelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupCriterionLabelServiceFileDescriptorSupplier())
              .addMethod(getGetAdGroupCriterionLabelMethod())
              .addMethod(getMutateAdGroupCriterionLabelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
