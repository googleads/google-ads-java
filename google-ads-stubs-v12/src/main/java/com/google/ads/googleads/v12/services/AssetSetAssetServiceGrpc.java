package com.google.ads.googleads.v12.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage asset set asset.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v12/services/asset_set_asset_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssetSetAssetServiceGrpc {

  private AssetSetAssetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v12.services.AssetSetAssetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateAssetSetAssetsRequest,
      com.google.ads.googleads.v12.services.MutateAssetSetAssetsResponse> getMutateAssetSetAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAssetSetAssets",
      requestType = com.google.ads.googleads.v12.services.MutateAssetSetAssetsRequest.class,
      responseType = com.google.ads.googleads.v12.services.MutateAssetSetAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateAssetSetAssetsRequest,
      com.google.ads.googleads.v12.services.MutateAssetSetAssetsResponse> getMutateAssetSetAssetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateAssetSetAssetsRequest, com.google.ads.googleads.v12.services.MutateAssetSetAssetsResponse> getMutateAssetSetAssetsMethod;
    if ((getMutateAssetSetAssetsMethod = AssetSetAssetServiceGrpc.getMutateAssetSetAssetsMethod) == null) {
      synchronized (AssetSetAssetServiceGrpc.class) {
        if ((getMutateAssetSetAssetsMethod = AssetSetAssetServiceGrpc.getMutateAssetSetAssetsMethod) == null) {
          AssetSetAssetServiceGrpc.getMutateAssetSetAssetsMethod = getMutateAssetSetAssetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.MutateAssetSetAssetsRequest, com.google.ads.googleads.v12.services.MutateAssetSetAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAssetSetAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateAssetSetAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateAssetSetAssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetSetAssetServiceMethodDescriptorSupplier("MutateAssetSetAssets"))
              .build();
        }
      }
    }
    return getMutateAssetSetAssetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssetSetAssetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetSetAssetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetSetAssetServiceStub>() {
        @java.lang.Override
        public AssetSetAssetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetSetAssetServiceStub(channel, callOptions);
        }
      };
    return AssetSetAssetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssetSetAssetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetSetAssetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetSetAssetServiceBlockingStub>() {
        @java.lang.Override
        public AssetSetAssetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetSetAssetServiceBlockingStub(channel, callOptions);
        }
      };
    return AssetSetAssetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssetSetAssetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetSetAssetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetSetAssetServiceFutureStub>() {
        @java.lang.Override
        public AssetSetAssetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetSetAssetServiceFutureStub(channel, callOptions);
        }
      };
    return AssetSetAssetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage asset set asset.
   * </pre>
   */
  public static abstract class AssetSetAssetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates or removes asset set assets. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAssetSetAssets(com.google.ads.googleads.v12.services.MutateAssetSetAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateAssetSetAssetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAssetSetAssetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateAssetSetAssetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v12.services.MutateAssetSetAssetsRequest,
                com.google.ads.googleads.v12.services.MutateAssetSetAssetsResponse>(
                  this, METHODID_MUTATE_ASSET_SET_ASSETS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage asset set asset.
   * </pre>
   */
  public static final class AssetSetAssetServiceStub extends io.grpc.stub.AbstractAsyncStub<AssetSetAssetServiceStub> {
    private AssetSetAssetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetSetAssetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetSetAssetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset set assets. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAssetSetAssets(com.google.ads.googleads.v12.services.MutateAssetSetAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateAssetSetAssetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAssetSetAssetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage asset set asset.
   * </pre>
   */
  public static final class AssetSetAssetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AssetSetAssetServiceBlockingStub> {
    private AssetSetAssetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetSetAssetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetSetAssetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset set assets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v12.services.MutateAssetSetAssetsResponse mutateAssetSetAssets(com.google.ads.googleads.v12.services.MutateAssetSetAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAssetSetAssetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage asset set asset.
   * </pre>
   */
  public static final class AssetSetAssetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AssetSetAssetServiceFutureStub> {
    private AssetSetAssetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetSetAssetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetSetAssetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset set assets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v12.services.MutateAssetSetAssetsResponse> mutateAssetSetAssets(
        com.google.ads.googleads.v12.services.MutateAssetSetAssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAssetSetAssetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_ASSET_SET_ASSETS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssetSetAssetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssetSetAssetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_ASSET_SET_ASSETS:
          serviceImpl.mutateAssetSetAssets((com.google.ads.googleads.v12.services.MutateAssetSetAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateAssetSetAssetsResponse>) responseObserver);
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

  private static abstract class AssetSetAssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssetSetAssetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v12.services.AssetSetAssetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssetSetAssetService");
    }
  }

  private static final class AssetSetAssetServiceFileDescriptorSupplier
      extends AssetSetAssetServiceBaseDescriptorSupplier {
    AssetSetAssetServiceFileDescriptorSupplier() {}
  }

  private static final class AssetSetAssetServiceMethodDescriptorSupplier
      extends AssetSetAssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AssetSetAssetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AssetSetAssetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssetSetAssetServiceFileDescriptorSupplier())
              .addMethod(getMutateAssetSetAssetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
