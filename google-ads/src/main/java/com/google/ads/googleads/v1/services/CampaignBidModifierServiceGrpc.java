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
 * Service to manage campaign bid modifiers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/campaign_bid_modifier_service.proto")
public final class CampaignBidModifierServiceGrpc {

  private CampaignBidModifierServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.CampaignBidModifierService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCampaignBidModifierMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetCampaignBidModifierRequest,
      com.google.ads.googleads.v1.resources.CampaignBidModifier> METHOD_GET_CAMPAIGN_BID_MODIFIER = getGetCampaignBidModifierMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetCampaignBidModifierRequest,
      com.google.ads.googleads.v1.resources.CampaignBidModifier> getGetCampaignBidModifierMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetCampaignBidModifierRequest,
      com.google.ads.googleads.v1.resources.CampaignBidModifier> getGetCampaignBidModifierMethod() {
    return getGetCampaignBidModifierMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetCampaignBidModifierRequest,
      com.google.ads.googleads.v1.resources.CampaignBidModifier> getGetCampaignBidModifierMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetCampaignBidModifierRequest, com.google.ads.googleads.v1.resources.CampaignBidModifier> getGetCampaignBidModifierMethod;
    if ((getGetCampaignBidModifierMethod = CampaignBidModifierServiceGrpc.getGetCampaignBidModifierMethod) == null) {
      synchronized (CampaignBidModifierServiceGrpc.class) {
        if ((getGetCampaignBidModifierMethod = CampaignBidModifierServiceGrpc.getGetCampaignBidModifierMethod) == null) {
          CampaignBidModifierServiceGrpc.getGetCampaignBidModifierMethod = getGetCampaignBidModifierMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetCampaignBidModifierRequest, com.google.ads.googleads.v1.resources.CampaignBidModifier>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.CampaignBidModifierService", "GetCampaignBidModifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetCampaignBidModifierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.CampaignBidModifier.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignBidModifierServiceMethodDescriptorSupplier("GetCampaignBidModifier"))
                  .build();
          }
        }
     }
     return getGetCampaignBidModifierMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateCampaignBidModifiersMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateCampaignBidModifiersRequest,
      com.google.ads.googleads.v1.services.MutateCampaignBidModifiersResponse> METHOD_MUTATE_CAMPAIGN_BID_MODIFIERS = getMutateCampaignBidModifiersMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateCampaignBidModifiersRequest,
      com.google.ads.googleads.v1.services.MutateCampaignBidModifiersResponse> getMutateCampaignBidModifiersMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateCampaignBidModifiersRequest,
      com.google.ads.googleads.v1.services.MutateCampaignBidModifiersResponse> getMutateCampaignBidModifiersMethod() {
    return getMutateCampaignBidModifiersMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateCampaignBidModifiersRequest,
      com.google.ads.googleads.v1.services.MutateCampaignBidModifiersResponse> getMutateCampaignBidModifiersMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateCampaignBidModifiersRequest, com.google.ads.googleads.v1.services.MutateCampaignBidModifiersResponse> getMutateCampaignBidModifiersMethod;
    if ((getMutateCampaignBidModifiersMethod = CampaignBidModifierServiceGrpc.getMutateCampaignBidModifiersMethod) == null) {
      synchronized (CampaignBidModifierServiceGrpc.class) {
        if ((getMutateCampaignBidModifiersMethod = CampaignBidModifierServiceGrpc.getMutateCampaignBidModifiersMethod) == null) {
          CampaignBidModifierServiceGrpc.getMutateCampaignBidModifiersMethod = getMutateCampaignBidModifiersMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.MutateCampaignBidModifiersRequest, com.google.ads.googleads.v1.services.MutateCampaignBidModifiersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.CampaignBidModifierService", "MutateCampaignBidModifiers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateCampaignBidModifiersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateCampaignBidModifiersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignBidModifierServiceMethodDescriptorSupplier("MutateCampaignBidModifiers"))
                  .build();
          }
        }
     }
     return getMutateCampaignBidModifiersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignBidModifierServiceStub newStub(io.grpc.Channel channel) {
    return new CampaignBidModifierServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignBidModifierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CampaignBidModifierServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignBidModifierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CampaignBidModifierServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage campaign bid modifiers.
   * </pre>
   */
  public static abstract class CampaignBidModifierServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign bid modifier in full detail.
     * </pre>
     */
    public void getCampaignBidModifier(com.google.ads.googleads.v1.services.GetCampaignBidModifierRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.CampaignBidModifier> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignBidModifierMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign bid modifiers.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignBidModifiers(com.google.ads.googleads.v1.services.MutateCampaignBidModifiersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateCampaignBidModifiersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCampaignBidModifiersMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignBidModifierMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetCampaignBidModifierRequest,
                com.google.ads.googleads.v1.resources.CampaignBidModifier>(
                  this, METHODID_GET_CAMPAIGN_BID_MODIFIER)))
          .addMethod(
            getMutateCampaignBidModifiersMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.MutateCampaignBidModifiersRequest,
                com.google.ads.googleads.v1.services.MutateCampaignBidModifiersResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_BID_MODIFIERS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign bid modifiers.
   * </pre>
   */
  public static final class CampaignBidModifierServiceStub extends io.grpc.stub.AbstractStub<CampaignBidModifierServiceStub> {
    private CampaignBidModifierServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignBidModifierServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBidModifierServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignBidModifierServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign bid modifier in full detail.
     * </pre>
     */
    public void getCampaignBidModifier(com.google.ads.googleads.v1.services.GetCampaignBidModifierRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.CampaignBidModifier> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignBidModifierMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign bid modifiers.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignBidModifiers(com.google.ads.googleads.v1.services.MutateCampaignBidModifiersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateCampaignBidModifiersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCampaignBidModifiersMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign bid modifiers.
   * </pre>
   */
  public static final class CampaignBidModifierServiceBlockingStub extends io.grpc.stub.AbstractStub<CampaignBidModifierServiceBlockingStub> {
    private CampaignBidModifierServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignBidModifierServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBidModifierServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignBidModifierServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign bid modifier in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.CampaignBidModifier getCampaignBidModifier(com.google.ads.googleads.v1.services.GetCampaignBidModifierRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignBidModifierMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign bid modifiers.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.MutateCampaignBidModifiersResponse mutateCampaignBidModifiers(com.google.ads.googleads.v1.services.MutateCampaignBidModifiersRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCampaignBidModifiersMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign bid modifiers.
   * </pre>
   */
  public static final class CampaignBidModifierServiceFutureStub extends io.grpc.stub.AbstractStub<CampaignBidModifierServiceFutureStub> {
    private CampaignBidModifierServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignBidModifierServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBidModifierServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignBidModifierServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign bid modifier in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.CampaignBidModifier> getCampaignBidModifier(
        com.google.ads.googleads.v1.services.GetCampaignBidModifierRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignBidModifierMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign bid modifiers.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.MutateCampaignBidModifiersResponse> mutateCampaignBidModifiers(
        com.google.ads.googleads.v1.services.MutateCampaignBidModifiersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCampaignBidModifiersMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_BID_MODIFIER = 0;
  private static final int METHODID_MUTATE_CAMPAIGN_BID_MODIFIERS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignBidModifierServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignBidModifierServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_BID_MODIFIER:
          serviceImpl.getCampaignBidModifier((com.google.ads.googleads.v1.services.GetCampaignBidModifierRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.CampaignBidModifier>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_BID_MODIFIERS:
          serviceImpl.mutateCampaignBidModifiers((com.google.ads.googleads.v1.services.MutateCampaignBidModifiersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateCampaignBidModifiersResponse>) responseObserver);
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

  private static abstract class CampaignBidModifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignBidModifierServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.CampaignBidModifierServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignBidModifierService");
    }
  }

  private static final class CampaignBidModifierServiceFileDescriptorSupplier
      extends CampaignBidModifierServiceBaseDescriptorSupplier {
    CampaignBidModifierServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignBidModifierServiceMethodDescriptorSupplier
      extends CampaignBidModifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignBidModifierServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignBidModifierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignBidModifierServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignBidModifierMethodHelper())
              .addMethod(getMutateCampaignBidModifiersMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
