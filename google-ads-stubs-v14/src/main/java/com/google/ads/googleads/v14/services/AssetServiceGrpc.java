package com.google.ads.googleads.v14.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage assets. Asset types can be created with AssetService are
 * YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be
 * created with Ad inline.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v14/services/asset_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssetServiceGrpc {

  private AssetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v14.services.AssetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateAssetsRequest,
      com.google.ads.googleads.v14.services.MutateAssetsResponse> getMutateAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAssets",
      requestType = com.google.ads.googleads.v14.services.MutateAssetsRequest.class,
      responseType = com.google.ads.googleads.v14.services.MutateAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateAssetsRequest,
      com.google.ads.googleads.v14.services.MutateAssetsResponse> getMutateAssetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateAssetsRequest, com.google.ads.googleads.v14.services.MutateAssetsResponse> getMutateAssetsMethod;
    if ((getMutateAssetsMethod = AssetServiceGrpc.getMutateAssetsMethod) == null) {
      synchronized (AssetServiceGrpc.class) {
        if ((getMutateAssetsMethod = AssetServiceGrpc.getMutateAssetsMethod) == null) {
          AssetServiceGrpc.getMutateAssetsMethod = getMutateAssetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v14.services.MutateAssetsRequest, com.google.ads.googleads.v14.services.MutateAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateAssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetServiceMethodDescriptorSupplier("MutateAssets"))
              .build();
        }
      }
    }
    return getMutateAssetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetServiceStub>() {
        @java.lang.Override
        public AssetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetServiceStub(channel, callOptions);
        }
      };
    return AssetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetServiceBlockingStub>() {
        @java.lang.Override
        public AssetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetServiceBlockingStub(channel, callOptions);
        }
      };
    return AssetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetServiceFutureStub>() {
        @java.lang.Override
        public AssetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetServiceFutureStub(channel, callOptions);
        }
      };
    return AssetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage assets. Asset types can be created with AssetService are
   * YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be
   * created with Ad inline.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates assets. Operation statuses are returned.
     * List of thrown errors:
     *   [AssetError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CurrencyCodeError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MediaUploadError]()
     *   [MutateError]()
     *   [NotAllowlistedError]()
     *   [NotEmptyError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     *   [YoutubeVideoRegistrationError]()
     * </pre>
     */
    default void mutateAssets(com.google.ads.googleads.v14.services.MutateAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateAssetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAssetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AssetService.
   * <pre>
   * Service to manage assets. Asset types can be created with AssetService are
   * YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be
   * created with Ad inline.
   * </pre>
   */
  public static abstract class AssetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AssetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AssetService.
   * <pre>
   * Service to manage assets. Asset types can be created with AssetService are
   * YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be
   * created with Ad inline.
   * </pre>
   */
  public static final class AssetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AssetServiceStub> {
    private AssetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates assets. Operation statuses are returned.
     * List of thrown errors:
     *   [AssetError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CurrencyCodeError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MediaUploadError]()
     *   [MutateError]()
     *   [NotAllowlistedError]()
     *   [NotEmptyError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     *   [YoutubeVideoRegistrationError]()
     * </pre>
     */
    public void mutateAssets(com.google.ads.googleads.v14.services.MutateAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateAssetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAssetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AssetService.
   * <pre>
   * Service to manage assets. Asset types can be created with AssetService are
   * YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be
   * created with Ad inline.
   * </pre>
   */
  public static final class AssetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AssetServiceBlockingStub> {
    private AssetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates assets. Operation statuses are returned.
     * List of thrown errors:
     *   [AssetError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CurrencyCodeError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MediaUploadError]()
     *   [MutateError]()
     *   [NotAllowlistedError]()
     *   [NotEmptyError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     *   [YoutubeVideoRegistrationError]()
     * </pre>
     */
    public com.google.ads.googleads.v14.services.MutateAssetsResponse mutateAssets(com.google.ads.googleads.v14.services.MutateAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAssetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AssetService.
   * <pre>
   * Service to manage assets. Asset types can be created with AssetService are
   * YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be
   * created with Ad inline.
   * </pre>
   */
  public static final class AssetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AssetServiceFutureStub> {
    private AssetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates assets. Operation statuses are returned.
     * List of thrown errors:
     *   [AssetError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CurrencyCodeError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MediaUploadError]()
     *   [MutateError]()
     *   [NotAllowlistedError]()
     *   [NotEmptyError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     *   [YoutubeVideoRegistrationError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v14.services.MutateAssetsResponse> mutateAssets(
        com.google.ads.googleads.v14.services.MutateAssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAssetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_ASSETS = 0;

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
        case METHODID_MUTATE_ASSETS:
          serviceImpl.mutateAssets((com.google.ads.googleads.v14.services.MutateAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateAssetsResponse>) responseObserver);
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
          getMutateAssetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v14.services.MutateAssetsRequest,
              com.google.ads.googleads.v14.services.MutateAssetsResponse>(
                service, METHODID_MUTATE_ASSETS)))
        .build();
  }

  private static abstract class AssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v14.services.AssetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssetService");
    }
  }

  private static final class AssetServiceFileDescriptorSupplier
      extends AssetServiceBaseDescriptorSupplier {
    AssetServiceFileDescriptorSupplier() {}
  }

  private static final class AssetServiceMethodDescriptorSupplier
      extends AssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AssetServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AssetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssetServiceFileDescriptorSupplier())
              .addMethod(getMutateAssetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
