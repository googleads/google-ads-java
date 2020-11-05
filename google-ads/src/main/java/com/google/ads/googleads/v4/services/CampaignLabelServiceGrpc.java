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
 * Service to manage labels on campaigns.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v4/services/campaign_label_service.proto")
public final class CampaignLabelServiceGrpc {

  private CampaignLabelServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.CampaignLabelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCampaignLabelRequest,
      com.google.ads.googleads.v4.resources.CampaignLabel> getGetCampaignLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignLabel",
      requestType = com.google.ads.googleads.v4.services.GetCampaignLabelRequest.class,
      responseType = com.google.ads.googleads.v4.resources.CampaignLabel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCampaignLabelRequest,
      com.google.ads.googleads.v4.resources.CampaignLabel> getGetCampaignLabelMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCampaignLabelRequest, com.google.ads.googleads.v4.resources.CampaignLabel> getGetCampaignLabelMethod;
    if ((getGetCampaignLabelMethod = CampaignLabelServiceGrpc.getGetCampaignLabelMethod) == null) {
      synchronized (CampaignLabelServiceGrpc.class) {
        if ((getGetCampaignLabelMethod = CampaignLabelServiceGrpc.getGetCampaignLabelMethod) == null) {
          CampaignLabelServiceGrpc.getGetCampaignLabelMethod = getGetCampaignLabelMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetCampaignLabelRequest, com.google.ads.googleads.v4.resources.CampaignLabel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetCampaignLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.CampaignLabel.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignLabelServiceMethodDescriptorSupplier("GetCampaignLabel"))
              .build();
        }
      }
    }
    return getGetCampaignLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateCampaignLabelsRequest,
      com.google.ads.googleads.v4.services.MutateCampaignLabelsResponse> getMutateCampaignLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignLabels",
      requestType = com.google.ads.googleads.v4.services.MutateCampaignLabelsRequest.class,
      responseType = com.google.ads.googleads.v4.services.MutateCampaignLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateCampaignLabelsRequest,
      com.google.ads.googleads.v4.services.MutateCampaignLabelsResponse> getMutateCampaignLabelsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateCampaignLabelsRequest, com.google.ads.googleads.v4.services.MutateCampaignLabelsResponse> getMutateCampaignLabelsMethod;
    if ((getMutateCampaignLabelsMethod = CampaignLabelServiceGrpc.getMutateCampaignLabelsMethod) == null) {
      synchronized (CampaignLabelServiceGrpc.class) {
        if ((getMutateCampaignLabelsMethod = CampaignLabelServiceGrpc.getMutateCampaignLabelsMethod) == null) {
          CampaignLabelServiceGrpc.getMutateCampaignLabelsMethod = getMutateCampaignLabelsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.MutateCampaignLabelsRequest, com.google.ads.googleads.v4.services.MutateCampaignLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateCampaignLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateCampaignLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignLabelServiceMethodDescriptorSupplier("MutateCampaignLabels"))
              .build();
        }
      }
    }
    return getMutateCampaignLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignLabelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignLabelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignLabelServiceStub>() {
        @java.lang.Override
        public CampaignLabelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignLabelServiceStub(channel, callOptions);
        }
      };
    return CampaignLabelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignLabelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignLabelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignLabelServiceBlockingStub>() {
        @java.lang.Override
        public CampaignLabelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignLabelServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignLabelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignLabelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignLabelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignLabelServiceFutureStub>() {
        @java.lang.Override
        public CampaignLabelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignLabelServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignLabelServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage labels on campaigns.
   * </pre>
   */
  public static abstract class CampaignLabelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign-label relationship in full detail.
     * </pre>
     */
    public void getCampaignLabel(com.google.ads.googleads.v4.services.GetCampaignLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CampaignLabel> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates and removes campaign-label relationships.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignLabels(com.google.ads.googleads.v4.services.MutateCampaignLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateCampaignLabelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCampaignLabelsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignLabelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetCampaignLabelRequest,
                com.google.ads.googleads.v4.resources.CampaignLabel>(
                  this, METHODID_GET_CAMPAIGN_LABEL)))
          .addMethod(
            getMutateCampaignLabelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.MutateCampaignLabelsRequest,
                com.google.ads.googleads.v4.services.MutateCampaignLabelsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_LABELS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage labels on campaigns.
   * </pre>
   */
  public static final class CampaignLabelServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignLabelServiceStub> {
    private CampaignLabelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignLabelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignLabelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign-label relationship in full detail.
     * </pre>
     */
    public void getCampaignLabel(com.google.ads.googleads.v4.services.GetCampaignLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CampaignLabel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates and removes campaign-label relationships.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignLabels(com.google.ads.googleads.v4.services.MutateCampaignLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateCampaignLabelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCampaignLabelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage labels on campaigns.
   * </pre>
   */
  public static final class CampaignLabelServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignLabelServiceBlockingStub> {
    private CampaignLabelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignLabelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignLabelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign-label relationship in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.CampaignLabel getCampaignLabel(com.google.ads.googleads.v4.services.GetCampaignLabelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates and removes campaign-label relationships.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.MutateCampaignLabelsResponse mutateCampaignLabels(com.google.ads.googleads.v4.services.MutateCampaignLabelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCampaignLabelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage labels on campaigns.
   * </pre>
   */
  public static final class CampaignLabelServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignLabelServiceFutureStub> {
    private CampaignLabelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignLabelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignLabelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign-label relationship in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.CampaignLabel> getCampaignLabel(
        com.google.ads.googleads.v4.services.GetCampaignLabelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates and removes campaign-label relationships.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.MutateCampaignLabelsResponse> mutateCampaignLabels(
        com.google.ads.googleads.v4.services.MutateCampaignLabelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCampaignLabelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_LABEL = 0;
  private static final int METHODID_MUTATE_CAMPAIGN_LABELS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignLabelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignLabelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_LABEL:
          serviceImpl.getCampaignLabel((com.google.ads.googleads.v4.services.GetCampaignLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CampaignLabel>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_LABELS:
          serviceImpl.mutateCampaignLabels((com.google.ads.googleads.v4.services.MutateCampaignLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateCampaignLabelsResponse>) responseObserver);
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

  private static abstract class CampaignLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignLabelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.CampaignLabelServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignLabelService");
    }
  }

  private static final class CampaignLabelServiceFileDescriptorSupplier
      extends CampaignLabelServiceBaseDescriptorSupplier {
    CampaignLabelServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignLabelServiceMethodDescriptorSupplier
      extends CampaignLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignLabelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignLabelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignLabelServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignLabelMethod())
              .addMethod(getMutateCampaignLabelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
