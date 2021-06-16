package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ad group extension settings.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/ad_group_extension_setting_service.proto")
public final class AdGroupExtensionSettingServiceGrpc {

  private AdGroupExtensionSettingServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.AdGroupExtensionSettingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAdGroupExtensionSettingRequest,
      com.google.ads.googleads.v8.resources.AdGroupExtensionSetting> getGetAdGroupExtensionSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdGroupExtensionSetting",
      requestType = com.google.ads.googleads.v8.services.GetAdGroupExtensionSettingRequest.class,
      responseType = com.google.ads.googleads.v8.resources.AdGroupExtensionSetting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAdGroupExtensionSettingRequest,
      com.google.ads.googleads.v8.resources.AdGroupExtensionSetting> getGetAdGroupExtensionSettingMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAdGroupExtensionSettingRequest, com.google.ads.googleads.v8.resources.AdGroupExtensionSetting> getGetAdGroupExtensionSettingMethod;
    if ((getGetAdGroupExtensionSettingMethod = AdGroupExtensionSettingServiceGrpc.getGetAdGroupExtensionSettingMethod) == null) {
      synchronized (AdGroupExtensionSettingServiceGrpc.class) {
        if ((getGetAdGroupExtensionSettingMethod = AdGroupExtensionSettingServiceGrpc.getGetAdGroupExtensionSettingMethod) == null) {
          AdGroupExtensionSettingServiceGrpc.getGetAdGroupExtensionSettingMethod = getGetAdGroupExtensionSettingMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetAdGroupExtensionSettingRequest, com.google.ads.googleads.v8.resources.AdGroupExtensionSetting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdGroupExtensionSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetAdGroupExtensionSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.AdGroupExtensionSetting.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupExtensionSettingServiceMethodDescriptorSupplier("GetAdGroupExtensionSetting"))
              .build();
        }
      }
    }
    return getGetAdGroupExtensionSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsRequest,
      com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsResponse> getMutateAdGroupExtensionSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupExtensionSettings",
      requestType = com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsRequest.class,
      responseType = com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsRequest,
      com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsResponse> getMutateAdGroupExtensionSettingsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsRequest, com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsResponse> getMutateAdGroupExtensionSettingsMethod;
    if ((getMutateAdGroupExtensionSettingsMethod = AdGroupExtensionSettingServiceGrpc.getMutateAdGroupExtensionSettingsMethod) == null) {
      synchronized (AdGroupExtensionSettingServiceGrpc.class) {
        if ((getMutateAdGroupExtensionSettingsMethod = AdGroupExtensionSettingServiceGrpc.getMutateAdGroupExtensionSettingsMethod) == null) {
          AdGroupExtensionSettingServiceGrpc.getMutateAdGroupExtensionSettingsMethod = getMutateAdGroupExtensionSettingsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsRequest, com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupExtensionSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<AdGroupExtensionSettingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupExtensionSettingServiceStub>() {
        @java.lang.Override
        public AdGroupExtensionSettingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupExtensionSettingServiceStub(channel, callOptions);
        }
      };
    return AdGroupExtensionSettingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupExtensionSettingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupExtensionSettingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupExtensionSettingServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupExtensionSettingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupExtensionSettingServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupExtensionSettingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupExtensionSettingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupExtensionSettingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupExtensionSettingServiceFutureStub>() {
        @java.lang.Override
        public AdGroupExtensionSettingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupExtensionSettingServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupExtensionSettingServiceFutureStub.newStub(factory, channel);
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
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAdGroupExtensionSetting(com.google.ads.googleads.v8.services.GetAdGroupExtensionSettingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AdGroupExtensionSetting> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAdGroupExtensionSettingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group extension settings. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionSettingError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public void mutateAdGroupExtensionSettings(com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupExtensionSettingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupExtensionSettingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetAdGroupExtensionSettingRequest,
                com.google.ads.googleads.v8.resources.AdGroupExtensionSetting>(
                  this, METHODID_GET_AD_GROUP_EXTENSION_SETTING)))
          .addMethod(
            getMutateAdGroupExtensionSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsRequest,
                com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsResponse>(
                  this, METHODID_MUTATE_AD_GROUP_EXTENSION_SETTINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ad group extension settings.
   * </pre>
   */
  public static final class AdGroupExtensionSettingServiceStub extends io.grpc.stub.AbstractAsyncStub<AdGroupExtensionSettingServiceStub> {
    private AdGroupExtensionSettingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupExtensionSettingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupExtensionSettingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group extension setting in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAdGroupExtensionSetting(com.google.ads.googleads.v8.services.GetAdGroupExtensionSettingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AdGroupExtensionSetting> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAdGroupExtensionSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group extension settings. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionSettingError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public void mutateAdGroupExtensionSettings(com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupExtensionSettingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ad group extension settings.
   * </pre>
   */
  public static final class AdGroupExtensionSettingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdGroupExtensionSettingServiceBlockingStub> {
    private AdGroupExtensionSettingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupExtensionSettingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupExtensionSettingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group extension setting in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.AdGroupExtensionSetting getAdGroupExtensionSetting(com.google.ads.googleads.v8.services.GetAdGroupExtensionSettingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAdGroupExtensionSettingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group extension settings. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionSettingError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsResponse mutateAdGroupExtensionSettings(com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupExtensionSettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ad group extension settings.
   * </pre>
   */
  public static final class AdGroupExtensionSettingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdGroupExtensionSettingServiceFutureStub> {
    private AdGroupExtensionSettingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupExtensionSettingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupExtensionSettingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group extension setting in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.AdGroupExtensionSetting> getAdGroupExtensionSetting(
        com.google.ads.googleads.v8.services.GetAdGroupExtensionSettingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAdGroupExtensionSettingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group extension settings. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionSettingError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsResponse> mutateAdGroupExtensionSettings(
        com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupExtensionSettingsMethod(), getCallOptions()), request);
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
          serviceImpl.getAdGroupExtensionSetting((com.google.ads.googleads.v8.services.GetAdGroupExtensionSettingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AdGroupExtensionSetting>) responseObserver);
          break;
        case METHODID_MUTATE_AD_GROUP_EXTENSION_SETTINGS:
          serviceImpl.mutateAdGroupExtensionSettings((com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateAdGroupExtensionSettingsResponse>) responseObserver);
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
      return com.google.ads.googleads.v8.services.AdGroupExtensionSettingServiceProto.getDescriptor();
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
              .addMethod(getGetAdGroupExtensionSettingMethod())
              .addMethod(getMutateAdGroupExtensionSettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
