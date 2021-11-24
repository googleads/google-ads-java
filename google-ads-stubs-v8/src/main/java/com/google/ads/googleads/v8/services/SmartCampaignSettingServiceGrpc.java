package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Smart campaign settings.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/smart_campaign_setting_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartCampaignSettingServiceGrpc {

  private SmartCampaignSettingServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.SmartCampaignSettingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetSmartCampaignSettingRequest,
      com.google.ads.googleads.v8.resources.SmartCampaignSetting> getGetSmartCampaignSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSmartCampaignSetting",
      requestType = com.google.ads.googleads.v8.services.GetSmartCampaignSettingRequest.class,
      responseType = com.google.ads.googleads.v8.resources.SmartCampaignSetting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetSmartCampaignSettingRequest,
      com.google.ads.googleads.v8.resources.SmartCampaignSetting> getGetSmartCampaignSettingMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetSmartCampaignSettingRequest, com.google.ads.googleads.v8.resources.SmartCampaignSetting> getGetSmartCampaignSettingMethod;
    if ((getGetSmartCampaignSettingMethod = SmartCampaignSettingServiceGrpc.getGetSmartCampaignSettingMethod) == null) {
      synchronized (SmartCampaignSettingServiceGrpc.class) {
        if ((getGetSmartCampaignSettingMethod = SmartCampaignSettingServiceGrpc.getGetSmartCampaignSettingMethod) == null) {
          SmartCampaignSettingServiceGrpc.getGetSmartCampaignSettingMethod = getGetSmartCampaignSettingMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetSmartCampaignSettingRequest, com.google.ads.googleads.v8.resources.SmartCampaignSetting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSmartCampaignSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetSmartCampaignSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.SmartCampaignSetting.getDefaultInstance()))
              .setSchemaDescriptor(new SmartCampaignSettingServiceMethodDescriptorSupplier("GetSmartCampaignSetting"))
              .build();
        }
      }
    }
    return getGetSmartCampaignSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest,
      com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse> getMutateSmartCampaignSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateSmartCampaignSettings",
      requestType = com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest.class,
      responseType = com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest,
      com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse> getMutateSmartCampaignSettingsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest, com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse> getMutateSmartCampaignSettingsMethod;
    if ((getMutateSmartCampaignSettingsMethod = SmartCampaignSettingServiceGrpc.getMutateSmartCampaignSettingsMethod) == null) {
      synchronized (SmartCampaignSettingServiceGrpc.class) {
        if ((getMutateSmartCampaignSettingsMethod = SmartCampaignSettingServiceGrpc.getMutateSmartCampaignSettingsMethod) == null) {
          SmartCampaignSettingServiceGrpc.getMutateSmartCampaignSettingsMethod = getMutateSmartCampaignSettingsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest, com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateSmartCampaignSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartCampaignSettingServiceMethodDescriptorSupplier("MutateSmartCampaignSettings"))
              .build();
        }
      }
    }
    return getMutateSmartCampaignSettingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartCampaignSettingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSettingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSettingServiceStub>() {
        @java.lang.Override
        public SmartCampaignSettingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartCampaignSettingServiceStub(channel, callOptions);
        }
      };
    return SmartCampaignSettingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartCampaignSettingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSettingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSettingServiceBlockingStub>() {
        @java.lang.Override
        public SmartCampaignSettingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartCampaignSettingServiceBlockingStub(channel, callOptions);
        }
      };
    return SmartCampaignSettingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartCampaignSettingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSettingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSettingServiceFutureStub>() {
        @java.lang.Override
        public SmartCampaignSettingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartCampaignSettingServiceFutureStub(channel, callOptions);
        }
      };
    return SmartCampaignSettingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Smart campaign settings.
   * </pre>
   */
  public static abstract class SmartCampaignSettingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Smart campaign setting in full detail.
     * </pre>
     */
    public void getSmartCampaignSetting(com.google.ads.googleads.v8.services.GetSmartCampaignSettingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.SmartCampaignSetting> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSmartCampaignSettingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates Smart campaign settings for campaigns.
     * </pre>
     */
    public void mutateSmartCampaignSettings(com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateSmartCampaignSettingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSmartCampaignSettingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetSmartCampaignSettingRequest,
                com.google.ads.googleads.v8.resources.SmartCampaignSetting>(
                  this, METHODID_GET_SMART_CAMPAIGN_SETTING)))
          .addMethod(
            getMutateSmartCampaignSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest,
                com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse>(
                  this, METHODID_MUTATE_SMART_CAMPAIGN_SETTINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Smart campaign settings.
   * </pre>
   */
  public static final class SmartCampaignSettingServiceStub extends io.grpc.stub.AbstractAsyncStub<SmartCampaignSettingServiceStub> {
    private SmartCampaignSettingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartCampaignSettingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartCampaignSettingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Smart campaign setting in full detail.
     * </pre>
     */
    public void getSmartCampaignSetting(com.google.ads.googleads.v8.services.GetSmartCampaignSettingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.SmartCampaignSetting> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSmartCampaignSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates Smart campaign settings for campaigns.
     * </pre>
     */
    public void mutateSmartCampaignSettings(com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateSmartCampaignSettingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Smart campaign settings.
   * </pre>
   */
  public static final class SmartCampaignSettingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SmartCampaignSettingServiceBlockingStub> {
    private SmartCampaignSettingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartCampaignSettingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartCampaignSettingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Smart campaign setting in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.SmartCampaignSetting getSmartCampaignSetting(com.google.ads.googleads.v8.services.GetSmartCampaignSettingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSmartCampaignSettingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates Smart campaign settings for campaigns.
     * </pre>
     */
    public com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse mutateSmartCampaignSettings(com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateSmartCampaignSettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Smart campaign settings.
   * </pre>
   */
  public static final class SmartCampaignSettingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SmartCampaignSettingServiceFutureStub> {
    private SmartCampaignSettingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartCampaignSettingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartCampaignSettingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Smart campaign setting in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.SmartCampaignSetting> getSmartCampaignSetting(
        com.google.ads.googleads.v8.services.GetSmartCampaignSettingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSmartCampaignSettingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates Smart campaign settings for campaigns.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse> mutateSmartCampaignSettings(
        com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateSmartCampaignSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SMART_CAMPAIGN_SETTING = 0;
  private static final int METHODID_MUTATE_SMART_CAMPAIGN_SETTINGS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartCampaignSettingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartCampaignSettingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SMART_CAMPAIGN_SETTING:
          serviceImpl.getSmartCampaignSetting((com.google.ads.googleads.v8.services.GetSmartCampaignSettingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.SmartCampaignSetting>) responseObserver);
          break;
        case METHODID_MUTATE_SMART_CAMPAIGN_SETTINGS:
          serviceImpl.mutateSmartCampaignSettings((com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse>) responseObserver);
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

  private static abstract class SmartCampaignSettingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartCampaignSettingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.SmartCampaignSettingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartCampaignSettingService");
    }
  }

  private static final class SmartCampaignSettingServiceFileDescriptorSupplier
      extends SmartCampaignSettingServiceBaseDescriptorSupplier {
    SmartCampaignSettingServiceFileDescriptorSupplier() {}
  }

  private static final class SmartCampaignSettingServiceMethodDescriptorSupplier
      extends SmartCampaignSettingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartCampaignSettingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartCampaignSettingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartCampaignSettingServiceFileDescriptorSupplier())
              .addMethod(getGetSmartCampaignSettingMethod())
              .addMethod(getMutateSmartCampaignSettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
