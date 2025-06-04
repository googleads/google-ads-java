package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ads in an ad group.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/ad_group_ad_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupAdServiceGrpc {

  private AdGroupAdServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.AdGroupAdService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAdGroupAdsRequest,
      com.google.ads.googleads.v18.services.MutateAdGroupAdsResponse> getMutateAdGroupAdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupAds",
      requestType = com.google.ads.googleads.v18.services.MutateAdGroupAdsRequest.class,
      responseType = com.google.ads.googleads.v18.services.MutateAdGroupAdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAdGroupAdsRequest,
      com.google.ads.googleads.v18.services.MutateAdGroupAdsResponse> getMutateAdGroupAdsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAdGroupAdsRequest, com.google.ads.googleads.v18.services.MutateAdGroupAdsResponse> getMutateAdGroupAdsMethod;
    if ((getMutateAdGroupAdsMethod = AdGroupAdServiceGrpc.getMutateAdGroupAdsMethod) == null) {
      synchronized (AdGroupAdServiceGrpc.class) {
        if ((getMutateAdGroupAdsMethod = AdGroupAdServiceGrpc.getMutateAdGroupAdsMethod) == null) {
          AdGroupAdServiceGrpc.getMutateAdGroupAdsMethod = getMutateAdGroupAdsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.MutateAdGroupAdsRequest, com.google.ads.googleads.v18.services.MutateAdGroupAdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupAds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateAdGroupAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateAdGroupAdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupAdServiceMethodDescriptorSupplier("MutateAdGroupAds"))
              .build();
        }
      }
    }
    return getMutateAdGroupAdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.RemoveAutomaticallyCreatedAssetsRequest,
      com.google.protobuf.Empty> getRemoveAutomaticallyCreatedAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveAutomaticallyCreatedAssets",
      requestType = com.google.ads.googleads.v18.services.RemoveAutomaticallyCreatedAssetsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.RemoveAutomaticallyCreatedAssetsRequest,
      com.google.protobuf.Empty> getRemoveAutomaticallyCreatedAssetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.RemoveAutomaticallyCreatedAssetsRequest, com.google.protobuf.Empty> getRemoveAutomaticallyCreatedAssetsMethod;
    if ((getRemoveAutomaticallyCreatedAssetsMethod = AdGroupAdServiceGrpc.getRemoveAutomaticallyCreatedAssetsMethod) == null) {
      synchronized (AdGroupAdServiceGrpc.class) {
        if ((getRemoveAutomaticallyCreatedAssetsMethod = AdGroupAdServiceGrpc.getRemoveAutomaticallyCreatedAssetsMethod) == null) {
          AdGroupAdServiceGrpc.getRemoveAutomaticallyCreatedAssetsMethod = getRemoveAutomaticallyCreatedAssetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.RemoveAutomaticallyCreatedAssetsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveAutomaticallyCreatedAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.RemoveAutomaticallyCreatedAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupAdServiceMethodDescriptorSupplier("RemoveAutomaticallyCreatedAssets"))
              .build();
        }
      }
    }
    return getRemoveAutomaticallyCreatedAssetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupAdServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAdServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAdServiceStub>() {
        @java.lang.Override
        public AdGroupAdServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAdServiceStub(channel, callOptions);
        }
      };
    return AdGroupAdServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AdGroupAdServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAdServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAdServiceBlockingV2Stub>() {
        @java.lang.Override
        public AdGroupAdServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAdServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AdGroupAdServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupAdServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAdServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAdServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupAdServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAdServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupAdServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupAdServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAdServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAdServiceFutureStub>() {
        @java.lang.Override
        public AdGroupAdServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAdServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupAdServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage ads in an ad group.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes ads. Operation statuses are returned.
     * List of thrown errors:
     *   [AdCustomizerError]()
     *   [AdError]()
     *   [AdGroupAdError]()
     *   [AdSharingError]()
     *   [AdxError]()
     *   [AssetError]()
     *   [AssetLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FeedAttributeReferenceError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MediaBundleError]()
     *   [MediaFileError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [PolicyFindingError]()
     *   [PolicyValidationParameterError]()
     *   [PolicyViolationError]()
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
    default void mutateAdGroupAds(com.google.ads.googleads.v18.services.MutateAdGroupAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAdGroupAdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupAdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove automatically created assets from an ad.
     * List of thrown errors:
     *   [AdError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AutomaticallyCreatedAssetRemovalError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void removeAutomaticallyCreatedAssets(com.google.ads.googleads.v18.services.RemoveAutomaticallyCreatedAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveAutomaticallyCreatedAssetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdGroupAdService.
   * <pre>
   * Service to manage ads in an ad group.
   * </pre>
   */
  public static abstract class AdGroupAdServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdGroupAdServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdGroupAdService.
   * <pre>
   * Service to manage ads in an ad group.
   * </pre>
   */
  public static final class AdGroupAdServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdGroupAdServiceStub> {
    private AdGroupAdServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAdServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ads. Operation statuses are returned.
     * List of thrown errors:
     *   [AdCustomizerError]()
     *   [AdError]()
     *   [AdGroupAdError]()
     *   [AdSharingError]()
     *   [AdxError]()
     *   [AssetError]()
     *   [AssetLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FeedAttributeReferenceError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MediaBundleError]()
     *   [MediaFileError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [PolicyFindingError]()
     *   [PolicyValidationParameterError]()
     *   [PolicyViolationError]()
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
    public void mutateAdGroupAds(com.google.ads.googleads.v18.services.MutateAdGroupAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAdGroupAdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupAdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove automatically created assets from an ad.
     * List of thrown errors:
     *   [AdError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AutomaticallyCreatedAssetRemovalError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void removeAutomaticallyCreatedAssets(com.google.ads.googleads.v18.services.RemoveAutomaticallyCreatedAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveAutomaticallyCreatedAssetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdGroupAdService.
   * <pre>
   * Service to manage ads in an ad group.
   * </pre>
   */
  public static final class AdGroupAdServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupAdServiceBlockingV2Stub> {
    private AdGroupAdServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAdServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ads. Operation statuses are returned.
     * List of thrown errors:
     *   [AdCustomizerError]()
     *   [AdError]()
     *   [AdGroupAdError]()
     *   [AdSharingError]()
     *   [AdxError]()
     *   [AssetError]()
     *   [AssetLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FeedAttributeReferenceError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MediaBundleError]()
     *   [MediaFileError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [PolicyFindingError]()
     *   [PolicyValidationParameterError]()
     *   [PolicyViolationError]()
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
    public com.google.ads.googleads.v18.services.MutateAdGroupAdsResponse mutateAdGroupAds(com.google.ads.googleads.v18.services.MutateAdGroupAdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupAdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove automatically created assets from an ad.
     * List of thrown errors:
     *   [AdError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AutomaticallyCreatedAssetRemovalError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.protobuf.Empty removeAutomaticallyCreatedAssets(com.google.ads.googleads.v18.services.RemoveAutomaticallyCreatedAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveAutomaticallyCreatedAssetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AdGroupAdService.
   * <pre>
   * Service to manage ads in an ad group.
   * </pre>
   */
  public static final class AdGroupAdServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupAdServiceBlockingStub> {
    private AdGroupAdServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAdServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ads. Operation statuses are returned.
     * List of thrown errors:
     *   [AdCustomizerError]()
     *   [AdError]()
     *   [AdGroupAdError]()
     *   [AdSharingError]()
     *   [AdxError]()
     *   [AssetError]()
     *   [AssetLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FeedAttributeReferenceError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MediaBundleError]()
     *   [MediaFileError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [PolicyFindingError]()
     *   [PolicyValidationParameterError]()
     *   [PolicyViolationError]()
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
    public com.google.ads.googleads.v18.services.MutateAdGroupAdsResponse mutateAdGroupAds(com.google.ads.googleads.v18.services.MutateAdGroupAdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupAdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove automatically created assets from an ad.
     * List of thrown errors:
     *   [AdError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AutomaticallyCreatedAssetRemovalError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.protobuf.Empty removeAutomaticallyCreatedAssets(com.google.ads.googleads.v18.services.RemoveAutomaticallyCreatedAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveAutomaticallyCreatedAssetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdGroupAdService.
   * <pre>
   * Service to manage ads in an ad group.
   * </pre>
   */
  public static final class AdGroupAdServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdGroupAdServiceFutureStub> {
    private AdGroupAdServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAdServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ads. Operation statuses are returned.
     * List of thrown errors:
     *   [AdCustomizerError]()
     *   [AdError]()
     *   [AdGroupAdError]()
     *   [AdSharingError]()
     *   [AdxError]()
     *   [AssetError]()
     *   [AssetLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FeedAttributeReferenceError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MediaBundleError]()
     *   [MediaFileError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [PolicyFindingError]()
     *   [PolicyValidationParameterError]()
     *   [PolicyViolationError]()
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.MutateAdGroupAdsResponse> mutateAdGroupAds(
        com.google.ads.googleads.v18.services.MutateAdGroupAdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupAdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove automatically created assets from an ad.
     * List of thrown errors:
     *   [AdError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [AutomaticallyCreatedAssetRemovalError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeAutomaticallyCreatedAssets(
        com.google.ads.googleads.v18.services.RemoveAutomaticallyCreatedAssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveAutomaticallyCreatedAssetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AD_GROUP_ADS = 0;
  private static final int METHODID_REMOVE_AUTOMATICALLY_CREATED_ASSETS = 1;

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
        case METHODID_MUTATE_AD_GROUP_ADS:
          serviceImpl.mutateAdGroupAds((com.google.ads.googleads.v18.services.MutateAdGroupAdsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAdGroupAdsResponse>) responseObserver);
          break;
        case METHODID_REMOVE_AUTOMATICALLY_CREATED_ASSETS:
          serviceImpl.removeAutomaticallyCreatedAssets((com.google.ads.googleads.v18.services.RemoveAutomaticallyCreatedAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getMutateAdGroupAdsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.MutateAdGroupAdsRequest,
              com.google.ads.googleads.v18.services.MutateAdGroupAdsResponse>(
                service, METHODID_MUTATE_AD_GROUP_ADS)))
        .addMethod(
          getRemoveAutomaticallyCreatedAssetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.RemoveAutomaticallyCreatedAssetsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_REMOVE_AUTOMATICALLY_CREATED_ASSETS)))
        .build();
  }

  private static abstract class AdGroupAdServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupAdServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.AdGroupAdServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupAdService");
    }
  }

  private static final class AdGroupAdServiceFileDescriptorSupplier
      extends AdGroupAdServiceBaseDescriptorSupplier {
    AdGroupAdServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupAdServiceMethodDescriptorSupplier
      extends AdGroupAdServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdGroupAdServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AdGroupAdServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupAdServiceFileDescriptorSupplier())
              .addMethod(getMutateAdGroupAdsMethod())
              .addMethod(getRemoveAutomaticallyCreatedAssetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
