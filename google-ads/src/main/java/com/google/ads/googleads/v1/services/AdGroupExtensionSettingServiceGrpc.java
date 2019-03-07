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
 * Service to manage ad group extension settings.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/ad_group_extension_setting_service.proto")
public final class AdGroupExtensionSettingServiceGrpc {

  private AdGroupExtensionSettingServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.AdGroupExtensionSettingService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAdGroupExtensionSettingMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdGroupExtensionSettingRequest,
      com.google.ads.googleads.v1.resources.AdGroupExtensionSetting> METHOD_GET_AD_GROUP_EXTENSION_SETTING = getGetAdGroupExtensionSettingMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdGroupExtensionSettingRequest,
      com.google.ads.googleads.v1.resources.AdGroupExtensionSetting> getGetAdGroupExtensionSettingMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdGroupExtensionSettingRequest,
      com.google.ads.googleads.v1.resources.AdGroupExtensionSetting> getGetAdGroupExtensionSettingMethod() {
    return getGetAdGroupExtensionSettingMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdGroupExtensionSettingRequest,
      com.google.ads.googleads.v1.resources.AdGroupExtensionSetting> getGetAdGroupExtensionSettingMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetAdGroupExtensionSettingRequest, com.google.ads.googleads.v1.resources.AdGroupExtensionSetting> getGetAdGroupExtensionSettingMethod;
    if ((getGetAdGroupExtensionSettingMethod = AdGroupExtensionSettingServiceGrpc.getGetAdGroupExtensionSettingMethod) == null) {
      synchronized (AdGroupExtensionSettingServiceGrpc.class) {
        if ((getGetAdGroupExtensionSettingMethod = AdGroupExtensionSettingServiceGrpc.getGetAdGroupExtensionSettingMethod) == null) {
          AdGroupExtensionSettingServiceGrpc.getGetAdGroupExtensionSettingMethod = getGetAdGroupExtensionSettingMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetAdGroupExtensionSettingRequest, com.google.ads.googleads.v1.resources.AdGroupExtensionSetting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.AdGroupExtensionSettingService", "GetAdGroupExtensionSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetAdGroupExtensionSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.AdGroupExtensionSetting.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupExtensionSettingServiceMethodDescriptorSupplier("GetAdGroupExtensionSetting"))
                  .build();
          }
        }
     }
     return getGetAdGroupExtensionSettingMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateAdGroupExtensionSettingsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsRequest,
      com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsResponse> METHOD_MUTATE_AD_GROUP_EXTENSION_SETTINGS = getMutateAdGroupExtensionSettingsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsRequest,
      com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsResponse> getMutateAdGroupExtensionSettingsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsRequest,
      com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsResponse> getMutateAdGroupExtensionSettingsMethod() {
    return getMutateAdGroupExtensionSettingsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsRequest,
      com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsResponse> getMutateAdGroupExtensionSettingsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsRequest, com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsResponse> getMutateAdGroupExtensionSettingsMethod;
    if ((getMutateAdGroupExtensionSettingsMethod = AdGroupExtensionSettingServiceGrpc.getMutateAdGroupExtensionSettingsMethod) == null) {
      synchronized (AdGroupExtensionSettingServiceGrpc.class) {
        if ((getMutateAdGroupExtensionSettingsMethod = AdGroupExtensionSettingServiceGrpc.getMutateAdGroupExtensionSettingsMethod) == null) {
          AdGroupExtensionSettingServiceGrpc.getMutateAdGroupExtensionSettingsMethod = getMutateAdGroupExtensionSettingsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsRequest, com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.AdGroupExtensionSettingService", "MutateAdGroupExtensionSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupExtensionSettingServiceMethodDescriptorSupplier("MutateAdGroupExtensionSettings"))
                  .build();
          }
        }
     }
     return getMutateAdGroupExtensionSettingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupExtensionSettingServiceStub newStub(io.grpc.Channel channel) {
    return new AdGroupExtensionSettingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupExtensionSettingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdGroupExtensionSettingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupExtensionSettingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdGroupExtensionSettingServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage ad group extension settings.
   * </pre>
   */
  public static abstract class AdGroupExtensionSettingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad group extension setting in full detail.
     * </pre>
     */
    public void getAdGroupExtensionSetting(com.google.ads.googleads.v1.services.GetAdGroupExtensionSettingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.AdGroupExtensionSetting> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdGroupExtensionSettingMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group extension settings. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateAdGroupExtensionSettings(com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAdGroupExtensionSettingsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupExtensionSettingMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetAdGroupExtensionSettingRequest,
                com.google.ads.googleads.v1.resources.AdGroupExtensionSetting>(
                  this, METHODID_GET_AD_GROUP_EXTENSION_SETTING)))
          .addMethod(
            getMutateAdGroupExtensionSettingsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsRequest,
                com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsResponse>(
                  this, METHODID_MUTATE_AD_GROUP_EXTENSION_SETTINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ad group extension settings.
   * </pre>
   */
  public static final class AdGroupExtensionSettingServiceStub extends io.grpc.stub.AbstractStub<AdGroupExtensionSettingServiceStub> {
    private AdGroupExtensionSettingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupExtensionSettingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupExtensionSettingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupExtensionSettingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group extension setting in full detail.
     * </pre>
     */
    public void getAdGroupExtensionSetting(com.google.ads.googleads.v1.services.GetAdGroupExtensionSettingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.AdGroupExtensionSetting> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdGroupExtensionSettingMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group extension settings. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateAdGroupExtensionSettings(com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupExtensionSettingsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ad group extension settings.
   * </pre>
   */
  public static final class AdGroupExtensionSettingServiceBlockingStub extends io.grpc.stub.AbstractStub<AdGroupExtensionSettingServiceBlockingStub> {
    private AdGroupExtensionSettingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupExtensionSettingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupExtensionSettingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupExtensionSettingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group extension setting in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.AdGroupExtensionSetting getAdGroupExtensionSetting(com.google.ads.googleads.v1.services.GetAdGroupExtensionSettingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdGroupExtensionSettingMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group extension settings. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsResponse mutateAdGroupExtensionSettings(com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAdGroupExtensionSettingsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ad group extension settings.
   * </pre>
   */
  public static final class AdGroupExtensionSettingServiceFutureStub extends io.grpc.stub.AbstractStub<AdGroupExtensionSettingServiceFutureStub> {
    private AdGroupExtensionSettingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupExtensionSettingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupExtensionSettingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupExtensionSettingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group extension setting in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.AdGroupExtensionSetting> getAdGroupExtensionSetting(
        com.google.ads.googleads.v1.services.GetAdGroupExtensionSettingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdGroupExtensionSettingMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group extension settings. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsResponse> mutateAdGroupExtensionSettings(
        com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAdGroupExtensionSettingsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_EXTENSION_SETTING = 0;
  private static final int METHODID_MUTATE_AD_GROUP_EXTENSION_SETTINGS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupExtensionSettingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupExtensionSettingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_EXTENSION_SETTING:
          serviceImpl.getAdGroupExtensionSetting((com.google.ads.googleads.v1.services.GetAdGroupExtensionSettingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.AdGroupExtensionSetting>) responseObserver);
          break;
        case METHODID_MUTATE_AD_GROUP_EXTENSION_SETTINGS:
          serviceImpl.mutateAdGroupExtensionSettings((com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateAdGroupExtensionSettingsResponse>) responseObserver);
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

  private static abstract class AdGroupExtensionSettingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupExtensionSettingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.AdGroupExtensionSettingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupExtensionSettingService");
    }
  }

  private static final class AdGroupExtensionSettingServiceFileDescriptorSupplier
      extends AdGroupExtensionSettingServiceBaseDescriptorSupplier {
    AdGroupExtensionSettingServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupExtensionSettingServiceMethodDescriptorSupplier
      extends AdGroupExtensionSettingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupExtensionSettingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupExtensionSettingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupExtensionSettingServiceFileDescriptorSupplier())
              .addMethod(getGetAdGroupExtensionSettingMethodHelper())
              .addMethod(getMutateAdGroupExtensionSettingsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
