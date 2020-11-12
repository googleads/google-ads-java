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
 * Service to manage campaign bid modifiers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/campaign_bid_modifier_service.proto")
public final class CampaignBidModifierServiceGrpc {

  private CampaignBidModifierServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.CampaignBidModifierService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCampaignBidModifierRequest,
      com.google.ads.googleads.v6.resources.CampaignBidModifier> getGetCampaignBidModifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignBidModifier",
      requestType = com.google.ads.googleads.v6.services.GetCampaignBidModifierRequest.class,
      responseType = com.google.ads.googleads.v6.resources.CampaignBidModifier.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCampaignBidModifierRequest,
      com.google.ads.googleads.v6.resources.CampaignBidModifier> getGetCampaignBidModifierMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCampaignBidModifierRequest, com.google.ads.googleads.v6.resources.CampaignBidModifier> getGetCampaignBidModifierMethod;
    if ((getGetCampaignBidModifierMethod = CampaignBidModifierServiceGrpc.getGetCampaignBidModifierMethod) == null) {
      synchronized (CampaignBidModifierServiceGrpc.class) {
        if ((getGetCampaignBidModifierMethod = CampaignBidModifierServiceGrpc.getGetCampaignBidModifierMethod) == null) {
          CampaignBidModifierServiceGrpc.getGetCampaignBidModifierMethod = getGetCampaignBidModifierMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetCampaignBidModifierRequest, com.google.ads.googleads.v6.resources.CampaignBidModifier>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignBidModifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetCampaignBidModifierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.CampaignBidModifier.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignBidModifierServiceMethodDescriptorSupplier("GetCampaignBidModifier"))
              .build();
        }
      }
    }
    return getGetCampaignBidModifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCampaignBidModifiersRequest,
      com.google.ads.googleads.v6.services.MutateCampaignBidModifiersResponse> getMutateCampaignBidModifiersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignBidModifiers",
      requestType = com.google.ads.googleads.v6.services.MutateCampaignBidModifiersRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateCampaignBidModifiersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCampaignBidModifiersRequest,
      com.google.ads.googleads.v6.services.MutateCampaignBidModifiersResponse> getMutateCampaignBidModifiersMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCampaignBidModifiersRequest, com.google.ads.googleads.v6.services.MutateCampaignBidModifiersResponse> getMutateCampaignBidModifiersMethod;
    if ((getMutateCampaignBidModifiersMethod = CampaignBidModifierServiceGrpc.getMutateCampaignBidModifiersMethod) == null) {
      synchronized (CampaignBidModifierServiceGrpc.class) {
        if ((getMutateCampaignBidModifiersMethod = CampaignBidModifierServiceGrpc.getMutateCampaignBidModifiersMethod) == null) {
          CampaignBidModifierServiceGrpc.getMutateCampaignBidModifiersMethod = getMutateCampaignBidModifiersMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateCampaignBidModifiersRequest, com.google.ads.googleads.v6.services.MutateCampaignBidModifiersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignBidModifiers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateCampaignBidModifiersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateCampaignBidModifiersResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceStub>() {
        @java.lang.Override
        public CampaignBidModifierServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignBidModifierServiceStub(channel, callOptions);
        }
      };
    return CampaignBidModifierServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignBidModifierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceBlockingStub>() {
        @java.lang.Override
        public CampaignBidModifierServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignBidModifierServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignBidModifierServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignBidModifierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceFutureStub>() {
        @java.lang.Override
        public CampaignBidModifierServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignBidModifierServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignBidModifierServiceFutureStub.newStub(factory, channel);
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
    public void getCampaignBidModifier(com.google.ads.googleads.v6.services.GetCampaignBidModifierRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.CampaignBidModifier> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignBidModifierMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign bid modifiers.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignBidModifiers(com.google.ads.googleads.v6.services.MutateCampaignBidModifiersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCampaignBidModifiersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCampaignBidModifiersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignBidModifierMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetCampaignBidModifierRequest,
                com.google.ads.googleads.v6.resources.CampaignBidModifier>(
                  this, METHODID_GET_CAMPAIGN_BID_MODIFIER)))
          .addMethod(
            getMutateCampaignBidModifiersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateCampaignBidModifiersRequest,
                com.google.ads.googleads.v6.services.MutateCampaignBidModifiersResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_BID_MODIFIERS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign bid modifiers.
   * </pre>
   */
  public static final class CampaignBidModifierServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignBidModifierServiceStub> {
    private CampaignBidModifierServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBidModifierServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignBidModifierServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign bid modifier in full detail.
     * </pre>
     */
    public void getCampaignBidModifier(com.google.ads.googleads.v6.services.GetCampaignBidModifierRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.CampaignBidModifier> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignBidModifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign bid modifiers.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignBidModifiers(com.google.ads.googleads.v6.services.MutateCampaignBidModifiersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCampaignBidModifiersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCampaignBidModifiersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign bid modifiers.
   * </pre>
   */
  public static final class CampaignBidModifierServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignBidModifierServiceBlockingStub> {
    private CampaignBidModifierServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBidModifierServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignBidModifierServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign bid modifier in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.CampaignBidModifier getCampaignBidModifier(com.google.ads.googleads.v6.services.GetCampaignBidModifierRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignBidModifierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign bid modifiers.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateCampaignBidModifiersResponse mutateCampaignBidModifiers(com.google.ads.googleads.v6.services.MutateCampaignBidModifiersRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCampaignBidModifiersMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign bid modifiers.
   * </pre>
   */
  public static final class CampaignBidModifierServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignBidModifierServiceFutureStub> {
    private CampaignBidModifierServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBidModifierServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignBidModifierServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign bid modifier in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.CampaignBidModifier> getCampaignBidModifier(
        com.google.ads.googleads.v6.services.GetCampaignBidModifierRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignBidModifierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign bid modifiers.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateCampaignBidModifiersResponse> mutateCampaignBidModifiers(
        com.google.ads.googleads.v6.services.MutateCampaignBidModifiersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCampaignBidModifiersMethod(), getCallOptions()), request);
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
          serviceImpl.getCampaignBidModifier((com.google.ads.googleads.v6.services.GetCampaignBidModifierRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.CampaignBidModifier>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_BID_MODIFIERS:
          serviceImpl.mutateCampaignBidModifiers((com.google.ads.googleads.v6.services.MutateCampaignBidModifiersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCampaignBidModifiersResponse>) responseObserver);
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
      return com.google.ads.googleads.v6.services.CampaignBidModifierServiceProto.getDescriptor();
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
              .addMethod(getGetCampaignBidModifierMethod())
              .addMethod(getMutateCampaignBidModifiersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
