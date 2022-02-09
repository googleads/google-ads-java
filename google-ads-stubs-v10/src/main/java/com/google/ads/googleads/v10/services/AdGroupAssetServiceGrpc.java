package com.google.ads.googleads.v10.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ad group assets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v10/services/ad_group_asset_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupAssetServiceGrpc {

  private AdGroupAssetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v10.services.AdGroupAssetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v10.services.MutateAdGroupAssetsRequest,
      com.google.ads.googleads.v10.services.MutateAdGroupAssetsResponse> getMutateAdGroupAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupAssets",
      requestType = com.google.ads.googleads.v10.services.MutateAdGroupAssetsRequest.class,
      responseType = com.google.ads.googleads.v10.services.MutateAdGroupAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v10.services.MutateAdGroupAssetsRequest,
      com.google.ads.googleads.v10.services.MutateAdGroupAssetsResponse> getMutateAdGroupAssetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v10.services.MutateAdGroupAssetsRequest, com.google.ads.googleads.v10.services.MutateAdGroupAssetsResponse> getMutateAdGroupAssetsMethod;
    if ((getMutateAdGroupAssetsMethod = AdGroupAssetServiceGrpc.getMutateAdGroupAssetsMethod) == null) {
      synchronized (AdGroupAssetServiceGrpc.class) {
        if ((getMutateAdGroupAssetsMethod = AdGroupAssetServiceGrpc.getMutateAdGroupAssetsMethod) == null) {
          AdGroupAssetServiceGrpc.getMutateAdGroupAssetsMethod = getMutateAdGroupAssetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v10.services.MutateAdGroupAssetsRequest, com.google.ads.googleads.v10.services.MutateAdGroupAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v10.services.MutateAdGroupAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v10.services.MutateAdGroupAssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupAssetServiceMethodDescriptorSupplier("MutateAdGroupAssets"))
              .build();
        }
      }
    }
    return getMutateAdGroupAssetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupAssetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAssetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAssetServiceStub>() {
        @java.lang.Override
        public AdGroupAssetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAssetServiceStub(channel, callOptions);
        }
      };
    return AdGroupAssetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupAssetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAssetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAssetServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupAssetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAssetServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupAssetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupAssetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAssetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAssetServiceFutureStub>() {
        @java.lang.Override
        public AdGroupAssetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAssetServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupAssetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage ad group assets.
   * </pre>
   */
  public static abstract class AdGroupAssetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates, or removes ad group assets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AssetLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotAllowlistedError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateAdGroupAssets(com.google.ads.googleads.v10.services.MutateAdGroupAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v10.services.MutateAdGroupAssetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupAssetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateAdGroupAssetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v10.services.MutateAdGroupAssetsRequest,
                com.google.ads.googleads.v10.services.MutateAdGroupAssetsResponse>(
                  this, METHODID_MUTATE_AD_GROUP_ASSETS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ad group assets.
   * </pre>
   */
  public static final class AdGroupAssetServiceStub extends io.grpc.stub.AbstractAsyncStub<AdGroupAssetServiceStub> {
    private AdGroupAssetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAssetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAssetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group assets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AssetLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotAllowlistedError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateAdGroupAssets(com.google.ads.googleads.v10.services.MutateAdGroupAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v10.services.MutateAdGroupAssetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupAssetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ad group assets.
   * </pre>
   */
  public static final class AdGroupAssetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdGroupAssetServiceBlockingStub> {
    private AdGroupAssetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAssetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAssetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group assets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AssetLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotAllowlistedError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v10.services.MutateAdGroupAssetsResponse mutateAdGroupAssets(com.google.ads.googleads.v10.services.MutateAdGroupAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupAssetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ad group assets.
   * </pre>
   */
  public static final class AdGroupAssetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdGroupAssetServiceFutureStub> {
    private AdGroupAssetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAssetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAssetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group assets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AssetLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotAllowlistedError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v10.services.MutateAdGroupAssetsResponse> mutateAdGroupAssets(
        com.google.ads.googleads.v10.services.MutateAdGroupAssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupAssetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AD_GROUP_ASSETS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupAssetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupAssetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_AD_GROUP_ASSETS:
          serviceImpl.mutateAdGroupAssets((com.google.ads.googleads.v10.services.MutateAdGroupAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v10.services.MutateAdGroupAssetsResponse>) responseObserver);
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

  private static abstract class AdGroupAssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupAssetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v10.services.AdGroupAssetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupAssetService");
    }
  }

  private static final class AdGroupAssetServiceFileDescriptorSupplier
      extends AdGroupAssetServiceBaseDescriptorSupplier {
    AdGroupAssetServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupAssetServiceMethodDescriptorSupplier
      extends AdGroupAssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupAssetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupAssetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupAssetServiceFileDescriptorSupplier())
              .addMethod(getMutateAdGroupAssetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
