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
 * Service to manage campaign extension settings.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v5/services/campaign_extension_setting_service.proto")
public final class CampaignExtensionSettingServiceGrpc {

  private CampaignExtensionSettingServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v5.services.CampaignExtensionSettingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetCampaignExtensionSettingRequest,
      com.google.ads.googleads.v5.resources.CampaignExtensionSetting> getGetCampaignExtensionSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignExtensionSetting",
      requestType = com.google.ads.googleads.v5.services.GetCampaignExtensionSettingRequest.class,
      responseType = com.google.ads.googleads.v5.resources.CampaignExtensionSetting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetCampaignExtensionSettingRequest,
      com.google.ads.googleads.v5.resources.CampaignExtensionSetting> getGetCampaignExtensionSettingMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetCampaignExtensionSettingRequest, com.google.ads.googleads.v5.resources.CampaignExtensionSetting> getGetCampaignExtensionSettingMethod;
    if ((getGetCampaignExtensionSettingMethod = CampaignExtensionSettingServiceGrpc.getGetCampaignExtensionSettingMethod) == null) {
      synchronized (CampaignExtensionSettingServiceGrpc.class) {
        if ((getGetCampaignExtensionSettingMethod = CampaignExtensionSettingServiceGrpc.getGetCampaignExtensionSettingMethod) == null) {
          CampaignExtensionSettingServiceGrpc.getGetCampaignExtensionSettingMethod = getGetCampaignExtensionSettingMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.GetCampaignExtensionSettingRequest, com.google.ads.googleads.v5.resources.CampaignExtensionSetting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignExtensionSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.GetCampaignExtensionSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.resources.CampaignExtensionSetting.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignExtensionSettingServiceMethodDescriptorSupplier("GetCampaignExtensionSetting"))
              .build();
        }
      }
    }
    return getGetCampaignExtensionSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsRequest,
      com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsResponse> getMutateCampaignExtensionSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignExtensionSettings",
      requestType = com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsRequest.class,
      responseType = com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsRequest,
      com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsResponse> getMutateCampaignExtensionSettingsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsRequest, com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsResponse> getMutateCampaignExtensionSettingsMethod;
    if ((getMutateCampaignExtensionSettingsMethod = CampaignExtensionSettingServiceGrpc.getMutateCampaignExtensionSettingsMethod) == null) {
      synchronized (CampaignExtensionSettingServiceGrpc.class) {
        if ((getMutateCampaignExtensionSettingsMethod = CampaignExtensionSettingServiceGrpc.getMutateCampaignExtensionSettingsMethod) == null) {
          CampaignExtensionSettingServiceGrpc.getMutateCampaignExtensionSettingsMethod = getMutateCampaignExtensionSettingsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsRequest, com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignExtensionSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignExtensionSettingServiceMethodDescriptorSupplier("MutateCampaignExtensionSettings"))
              .build();
        }
      }
    }
    return getMutateCampaignExtensionSettingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignExtensionSettingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignExtensionSettingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignExtensionSettingServiceStub>() {
        @java.lang.Override
        public CampaignExtensionSettingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignExtensionSettingServiceStub(channel, callOptions);
        }
      };
    return CampaignExtensionSettingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignExtensionSettingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignExtensionSettingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignExtensionSettingServiceBlockingStub>() {
        @java.lang.Override
        public CampaignExtensionSettingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignExtensionSettingServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignExtensionSettingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignExtensionSettingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignExtensionSettingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignExtensionSettingServiceFutureStub>() {
        @java.lang.Override
        public CampaignExtensionSettingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignExtensionSettingServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignExtensionSettingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaign extension settings.
   * </pre>
   */
  public static abstract class CampaignExtensionSettingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign extension setting in full detail.
     * </pre>
     */
    public void getCampaignExtensionSetting(com.google.ads.googleads.v5.services.GetCampaignExtensionSettingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.CampaignExtensionSetting> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignExtensionSettingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign extension settings. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateCampaignExtensionSettings(com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCampaignExtensionSettingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignExtensionSettingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.GetCampaignExtensionSettingRequest,
                com.google.ads.googleads.v5.resources.CampaignExtensionSetting>(
                  this, METHODID_GET_CAMPAIGN_EXTENSION_SETTING)))
          .addMethod(
            getMutateCampaignExtensionSettingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsRequest,
                com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_EXTENSION_SETTINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign extension settings.
   * </pre>
   */
  public static final class CampaignExtensionSettingServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignExtensionSettingServiceStub> {
    private CampaignExtensionSettingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignExtensionSettingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignExtensionSettingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign extension setting in full detail.
     * </pre>
     */
    public void getCampaignExtensionSetting(com.google.ads.googleads.v5.services.GetCampaignExtensionSettingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.CampaignExtensionSetting> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignExtensionSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign extension settings. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateCampaignExtensionSettings(com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCampaignExtensionSettingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign extension settings.
   * </pre>
   */
  public static final class CampaignExtensionSettingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignExtensionSettingServiceBlockingStub> {
    private CampaignExtensionSettingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignExtensionSettingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignExtensionSettingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign extension setting in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v5.resources.CampaignExtensionSetting getCampaignExtensionSetting(com.google.ads.googleads.v5.services.GetCampaignExtensionSettingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignExtensionSettingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign extension settings. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsResponse mutateCampaignExtensionSettings(com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCampaignExtensionSettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign extension settings.
   * </pre>
   */
  public static final class CampaignExtensionSettingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignExtensionSettingServiceFutureStub> {
    private CampaignExtensionSettingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignExtensionSettingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignExtensionSettingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign extension setting in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.resources.CampaignExtensionSetting> getCampaignExtensionSetting(
        com.google.ads.googleads.v5.services.GetCampaignExtensionSettingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignExtensionSettingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign extension settings. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsResponse> mutateCampaignExtensionSettings(
        com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCampaignExtensionSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_EXTENSION_SETTING = 0;
  private static final int METHODID_MUTATE_CAMPAIGN_EXTENSION_SETTINGS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignExtensionSettingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignExtensionSettingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_EXTENSION_SETTING:
          serviceImpl.getCampaignExtensionSetting((com.google.ads.googleads.v5.services.GetCampaignExtensionSettingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.CampaignExtensionSetting>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_EXTENSION_SETTINGS:
          serviceImpl.mutateCampaignExtensionSettings((com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateCampaignExtensionSettingsResponse>) responseObserver);
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

  private static abstract class CampaignExtensionSettingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignExtensionSettingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v5.services.CampaignExtensionSettingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignExtensionSettingService");
    }
  }

  private static final class CampaignExtensionSettingServiceFileDescriptorSupplier
      extends CampaignExtensionSettingServiceBaseDescriptorSupplier {
    CampaignExtensionSettingServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignExtensionSettingServiceMethodDescriptorSupplier
      extends CampaignExtensionSettingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignExtensionSettingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignExtensionSettingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignExtensionSettingServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignExtensionSettingMethod())
              .addMethod(getMutateCampaignExtensionSettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
