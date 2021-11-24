package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ads in an ad group.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/ad_group_ad_service.proto")
public final class AdGroupAdServiceGrpc {

  private AdGroupAdServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.AdGroupAdService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetAdGroupAdRequest,
      com.google.ads.googleads.v9.resources.AdGroupAd> getGetAdGroupAdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdGroupAd",
      requestType = com.google.ads.googleads.v9.services.GetAdGroupAdRequest.class,
      responseType = com.google.ads.googleads.v9.resources.AdGroupAd.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetAdGroupAdRequest,
      com.google.ads.googleads.v9.resources.AdGroupAd> getGetAdGroupAdMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetAdGroupAdRequest, com.google.ads.googleads.v9.resources.AdGroupAd> getGetAdGroupAdMethod;
    if ((getGetAdGroupAdMethod = AdGroupAdServiceGrpc.getGetAdGroupAdMethod) == null) {
      synchronized (AdGroupAdServiceGrpc.class) {
        if ((getGetAdGroupAdMethod = AdGroupAdServiceGrpc.getGetAdGroupAdMethod) == null) {
          AdGroupAdServiceGrpc.getGetAdGroupAdMethod = getGetAdGroupAdMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetAdGroupAdRequest, com.google.ads.googleads.v9.resources.AdGroupAd>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdGroupAd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetAdGroupAdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.AdGroupAd.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupAdServiceMethodDescriptorSupplier("GetAdGroupAd"))
              .build();
        }
      }
    }
    return getGetAdGroupAdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateAdGroupAdsRequest,
      com.google.ads.googleads.v9.services.MutateAdGroupAdsResponse> getMutateAdGroupAdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupAds",
      requestType = com.google.ads.googleads.v9.services.MutateAdGroupAdsRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateAdGroupAdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateAdGroupAdsRequest,
      com.google.ads.googleads.v9.services.MutateAdGroupAdsResponse> getMutateAdGroupAdsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateAdGroupAdsRequest, com.google.ads.googleads.v9.services.MutateAdGroupAdsResponse> getMutateAdGroupAdsMethod;
    if ((getMutateAdGroupAdsMethod = AdGroupAdServiceGrpc.getMutateAdGroupAdsMethod) == null) {
      synchronized (AdGroupAdServiceGrpc.class) {
        if ((getMutateAdGroupAdsMethod = AdGroupAdServiceGrpc.getMutateAdGroupAdsMethod) == null) {
          AdGroupAdServiceGrpc.getMutateAdGroupAdsMethod = getMutateAdGroupAdsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateAdGroupAdsRequest, com.google.ads.googleads.v9.services.MutateAdGroupAdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupAds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateAdGroupAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateAdGroupAdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupAdServiceMethodDescriptorSupplier("MutateAdGroupAds"))
              .build();
        }
      }
    }
    return getMutateAdGroupAdsMethod;
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
  public static abstract class AdGroupAdServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAdGroupAd(com.google.ads.googleads.v9.services.GetAdGroupAdRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.AdGroupAd> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAdGroupAdMethod(), responseObserver);
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
    public void mutateAdGroupAds(com.google.ads.googleads.v9.services.MutateAdGroupAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateAdGroupAdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupAdsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupAdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetAdGroupAdRequest,
                com.google.ads.googleads.v9.resources.AdGroupAd>(
                  this, METHODID_GET_AD_GROUP_AD)))
          .addMethod(
            getMutateAdGroupAdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateAdGroupAdsRequest,
                com.google.ads.googleads.v9.services.MutateAdGroupAdsResponse>(
                  this, METHODID_MUTATE_AD_GROUP_ADS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ads in an ad group.
   * </pre>
   */
  public static final class AdGroupAdServiceStub extends io.grpc.stub.AbstractAsyncStub<AdGroupAdServiceStub> {
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
     * Returns the requested ad in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAdGroupAd(com.google.ads.googleads.v9.services.GetAdGroupAdRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.AdGroupAd> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAdGroupAdMethod(), getCallOptions()), request, responseObserver);
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
    public void mutateAdGroupAds(com.google.ads.googleads.v9.services.MutateAdGroupAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateAdGroupAdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupAdsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ads in an ad group.
   * </pre>
   */
  public static final class AdGroupAdServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdGroupAdServiceBlockingStub> {
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
     * Returns the requested ad in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.AdGroupAd getAdGroupAd(com.google.ads.googleads.v9.services.GetAdGroupAdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAdGroupAdMethod(), getCallOptions(), request);
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
    public com.google.ads.googleads.v9.services.MutateAdGroupAdsResponse mutateAdGroupAds(com.google.ads.googleads.v9.services.MutateAdGroupAdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupAdsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ads in an ad group.
   * </pre>
   */
  public static final class AdGroupAdServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdGroupAdServiceFutureStub> {
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
     * Returns the requested ad in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.AdGroupAd> getAdGroupAd(
        com.google.ads.googleads.v9.services.GetAdGroupAdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAdGroupAdMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateAdGroupAdsResponse> mutateAdGroupAds(
        com.google.ads.googleads.v9.services.MutateAdGroupAdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupAdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_AD = 0;
  private static final int METHODID_MUTATE_AD_GROUP_ADS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupAdServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupAdServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_AD:
          serviceImpl.getAdGroupAd((com.google.ads.googleads.v9.services.GetAdGroupAdRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.AdGroupAd>) responseObserver);
          break;
        case METHODID_MUTATE_AD_GROUP_ADS:
          serviceImpl.mutateAdGroupAds((com.google.ads.googleads.v9.services.MutateAdGroupAdsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateAdGroupAdsResponse>) responseObserver);
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

  private static abstract class AdGroupAdServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupAdServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.AdGroupAdServiceProto.getDescriptor();
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
    private final String methodName;

    AdGroupAdServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getGetAdGroupAdMethod())
              .addMethod(getMutateAdGroupAdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
