package com.google.ads.googleads.v5.services;

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
 * Service to manage campaign assets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v5/services/campaign_asset_service.proto")
public final class CampaignAssetServiceGrpc {

  private CampaignAssetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v5.services.CampaignAssetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetCampaignAssetRequest,
      com.google.ads.googleads.v5.resources.CampaignAsset> getGetCampaignAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignAsset",
      requestType = com.google.ads.googleads.v5.services.GetCampaignAssetRequest.class,
      responseType = com.google.ads.googleads.v5.resources.CampaignAsset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetCampaignAssetRequest,
      com.google.ads.googleads.v5.resources.CampaignAsset> getGetCampaignAssetMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetCampaignAssetRequest, com.google.ads.googleads.v5.resources.CampaignAsset> getGetCampaignAssetMethod;
    if ((getGetCampaignAssetMethod = CampaignAssetServiceGrpc.getGetCampaignAssetMethod) == null) {
      synchronized (CampaignAssetServiceGrpc.class) {
        if ((getGetCampaignAssetMethod = CampaignAssetServiceGrpc.getGetCampaignAssetMethod) == null) {
          CampaignAssetServiceGrpc.getGetCampaignAssetMethod = getGetCampaignAssetMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.GetCampaignAssetRequest, com.google.ads.googleads.v5.resources.CampaignAsset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.GetCampaignAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.resources.CampaignAsset.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignAssetServiceMethodDescriptorSupplier("GetCampaignAsset"))
              .build();
        }
      }
    }
    return getGetCampaignAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateCampaignAssetsRequest,
      com.google.ads.googleads.v5.services.MutateCampaignAssetsResponse> getMutateCampaignAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignAssets",
      requestType = com.google.ads.googleads.v5.services.MutateCampaignAssetsRequest.class,
      responseType = com.google.ads.googleads.v5.services.MutateCampaignAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateCampaignAssetsRequest,
      com.google.ads.googleads.v5.services.MutateCampaignAssetsResponse> getMutateCampaignAssetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateCampaignAssetsRequest, com.google.ads.googleads.v5.services.MutateCampaignAssetsResponse> getMutateCampaignAssetsMethod;
    if ((getMutateCampaignAssetsMethod = CampaignAssetServiceGrpc.getMutateCampaignAssetsMethod) == null) {
      synchronized (CampaignAssetServiceGrpc.class) {
        if ((getMutateCampaignAssetsMethod = CampaignAssetServiceGrpc.getMutateCampaignAssetsMethod) == null) {
          CampaignAssetServiceGrpc.getMutateCampaignAssetsMethod = getMutateCampaignAssetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.MutateCampaignAssetsRequest, com.google.ads.googleads.v5.services.MutateCampaignAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.MutateCampaignAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.MutateCampaignAssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignAssetServiceMethodDescriptorSupplier("MutateCampaignAssets"))
              .build();
        }
      }
    }
    return getMutateCampaignAssetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignAssetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignAssetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignAssetServiceStub>() {
        @java.lang.Override
        public CampaignAssetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignAssetServiceStub(channel, callOptions);
        }
      };
    return CampaignAssetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignAssetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignAssetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignAssetServiceBlockingStub>() {
        @java.lang.Override
        public CampaignAssetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignAssetServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignAssetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignAssetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignAssetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignAssetServiceFutureStub>() {
        @java.lang.Override
        public CampaignAssetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignAssetServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignAssetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaign assets.
   * </pre>
   */
  public static abstract class CampaignAssetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign asset in full detail.
     * </pre>
     */
    public void getCampaignAsset(com.google.ads.googleads.v5.services.GetCampaignAssetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.CampaignAsset> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or removes campaign assets. Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignAssets(com.google.ads.googleads.v5.services.MutateCampaignAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateCampaignAssetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCampaignAssetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.GetCampaignAssetRequest,
                com.google.ads.googleads.v5.resources.CampaignAsset>(
                  this, METHODID_GET_CAMPAIGN_ASSET)))
          .addMethod(
            getMutateCampaignAssetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.MutateCampaignAssetsRequest,
                com.google.ads.googleads.v5.services.MutateCampaignAssetsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_ASSETS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign assets.
   * </pre>
   */
  public static final class CampaignAssetServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignAssetServiceStub> {
    private CampaignAssetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignAssetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignAssetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign asset in full detail.
     * </pre>
     */
    public void getCampaignAsset(com.google.ads.googleads.v5.services.GetCampaignAssetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.CampaignAsset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or removes campaign assets. Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignAssets(com.google.ads.googleads.v5.services.MutateCampaignAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateCampaignAssetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCampaignAssetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign assets.
   * </pre>
   */
  public static final class CampaignAssetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignAssetServiceBlockingStub> {
    private CampaignAssetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignAssetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignAssetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign asset in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v5.resources.CampaignAsset getCampaignAsset(com.google.ads.googleads.v5.services.GetCampaignAssetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or removes campaign assets. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v5.services.MutateCampaignAssetsResponse mutateCampaignAssets(com.google.ads.googleads.v5.services.MutateCampaignAssetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCampaignAssetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign assets.
   * </pre>
   */
  public static final class CampaignAssetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignAssetServiceFutureStub> {
    private CampaignAssetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignAssetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignAssetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign asset in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.resources.CampaignAsset> getCampaignAsset(
        com.google.ads.googleads.v5.services.GetCampaignAssetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or removes campaign assets. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.services.MutateCampaignAssetsResponse> mutateCampaignAssets(
        com.google.ads.googleads.v5.services.MutateCampaignAssetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCampaignAssetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_ASSET = 0;
  private static final int METHODID_MUTATE_CAMPAIGN_ASSETS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignAssetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignAssetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_ASSET:
          serviceImpl.getCampaignAsset((com.google.ads.googleads.v5.services.GetCampaignAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.CampaignAsset>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_ASSETS:
          serviceImpl.mutateCampaignAssets((com.google.ads.googleads.v5.services.MutateCampaignAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateCampaignAssetsResponse>) responseObserver);
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

  private static abstract class CampaignAssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignAssetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v5.services.CampaignAssetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignAssetService");
    }
  }

  private static final class CampaignAssetServiceFileDescriptorSupplier
      extends CampaignAssetServiceBaseDescriptorSupplier {
    CampaignAssetServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignAssetServiceMethodDescriptorSupplier
      extends CampaignAssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignAssetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignAssetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignAssetServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignAssetMethod())
              .addMethod(getMutateCampaignAssetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
