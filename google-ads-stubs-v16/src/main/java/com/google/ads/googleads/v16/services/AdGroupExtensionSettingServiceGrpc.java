package com.google.ads.googleads.v16.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ad group extension settings.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v16/services/ad_group_extension_setting_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupExtensionSettingServiceGrpc {

  private AdGroupExtensionSettingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v16.services.AdGroupExtensionSettingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsRequest,
      com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsResponse> getMutateAdGroupExtensionSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupExtensionSettings",
      requestType = com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsRequest.class,
      responseType = com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsRequest,
      com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsResponse> getMutateAdGroupExtensionSettingsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsRequest, com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsResponse> getMutateAdGroupExtensionSettingsMethod;
    if ((getMutateAdGroupExtensionSettingsMethod = AdGroupExtensionSettingServiceGrpc.getMutateAdGroupExtensionSettingsMethod) == null) {
      synchronized (AdGroupExtensionSettingServiceGrpc.class) {
        if ((getMutateAdGroupExtensionSettingsMethod = AdGroupExtensionSettingServiceGrpc.getMutateAdGroupExtensionSettingsMethod) == null) {
          AdGroupExtensionSettingServiceGrpc.getMutateAdGroupExtensionSettingsMethod = getMutateAdGroupExtensionSettingsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsRequest, com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupExtensionSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsResponse.getDefaultInstance()))
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
  public interface AsyncService {

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
    default void mutateAdGroupExtensionSettings(com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupExtensionSettingsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdGroupExtensionSettingService.
   * <pre>
   * Service to manage ad group extension settings.
   * </pre>
   */
  public static abstract class AdGroupExtensionSettingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdGroupExtensionSettingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdGroupExtensionSettingService.
   * <pre>
   * Service to manage ad group extension settings.
   * </pre>
   */
  public static final class AdGroupExtensionSettingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdGroupExtensionSettingServiceStub> {
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
    public void mutateAdGroupExtensionSettings(com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupExtensionSettingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdGroupExtensionSettingService.
   * <pre>
   * Service to manage ad group extension settings.
   * </pre>
   */
  public static final class AdGroupExtensionSettingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupExtensionSettingServiceBlockingStub> {
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
    public com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsResponse mutateAdGroupExtensionSettings(com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupExtensionSettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdGroupExtensionSettingService.
   * <pre>
   * Service to manage ad group extension settings.
   * </pre>
   */
  public static final class AdGroupExtensionSettingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdGroupExtensionSettingServiceFutureStub> {
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsResponse> mutateAdGroupExtensionSettings(
        com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupExtensionSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AD_GROUP_EXTENSION_SETTINGS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_AD_GROUP_EXTENSION_SETTINGS:
          serviceImpl.mutateAdGroupExtensionSettings((com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMutateAdGroupExtensionSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsRequest,
              com.google.ads.googleads.v16.services.MutateAdGroupExtensionSettingsResponse>(
                service, METHODID_MUTATE_AD_GROUP_EXTENSION_SETTINGS)))
        .build();
  }

  private static abstract class AdGroupExtensionSettingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupExtensionSettingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v16.services.AdGroupExtensionSettingServiceProto.getDescriptor();
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
    private final java.lang.String methodName;

    AdGroupExtensionSettingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getMutateAdGroupExtensionSettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
