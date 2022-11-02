package com.google.ads.googleads.v12.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage asset group asset.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v12/services/asset_group_asset_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssetGroupAssetServiceGrpc {

  private AssetGroupAssetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v12.services.AssetGroupAssetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateAssetGroupAssetsRequest,
      com.google.ads.googleads.v12.services.MutateAssetGroupAssetsResponse> getMutateAssetGroupAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAssetGroupAssets",
      requestType = com.google.ads.googleads.v12.services.MutateAssetGroupAssetsRequest.class,
      responseType = com.google.ads.googleads.v12.services.MutateAssetGroupAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateAssetGroupAssetsRequest,
      com.google.ads.googleads.v12.services.MutateAssetGroupAssetsResponse> getMutateAssetGroupAssetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateAssetGroupAssetsRequest, com.google.ads.googleads.v12.services.MutateAssetGroupAssetsResponse> getMutateAssetGroupAssetsMethod;
    if ((getMutateAssetGroupAssetsMethod = AssetGroupAssetServiceGrpc.getMutateAssetGroupAssetsMethod) == null) {
      synchronized (AssetGroupAssetServiceGrpc.class) {
        if ((getMutateAssetGroupAssetsMethod = AssetGroupAssetServiceGrpc.getMutateAssetGroupAssetsMethod) == null) {
          AssetGroupAssetServiceGrpc.getMutateAssetGroupAssetsMethod = getMutateAssetGroupAssetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.MutateAssetGroupAssetsRequest, com.google.ads.googleads.v12.services.MutateAssetGroupAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAssetGroupAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateAssetGroupAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateAssetGroupAssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetGroupAssetServiceMethodDescriptorSupplier("MutateAssetGroupAssets"))
              .build();
        }
      }
    }
    return getMutateAssetGroupAssetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssetGroupAssetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGroupAssetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGroupAssetServiceStub>() {
        @java.lang.Override
        public AssetGroupAssetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGroupAssetServiceStub(channel, callOptions);
        }
      };
    return AssetGroupAssetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssetGroupAssetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGroupAssetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGroupAssetServiceBlockingStub>() {
        @java.lang.Override
        public AssetGroupAssetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGroupAssetServiceBlockingStub(channel, callOptions);
        }
      };
    return AssetGroupAssetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssetGroupAssetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGroupAssetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGroupAssetServiceFutureStub>() {
        @java.lang.Override
        public AssetGroupAssetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGroupAssetServiceFutureStub(channel, callOptions);
        }
      };
    return AssetGroupAssetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage asset group asset.
   * </pre>
   */
  public static abstract class AssetGroupAssetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates or removes asset group assets. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAssetGroupAssets(com.google.ads.googleads.v12.services.MutateAssetGroupAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateAssetGroupAssetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAssetGroupAssetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateAssetGroupAssetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v12.services.MutateAssetGroupAssetsRequest,
                com.google.ads.googleads.v12.services.MutateAssetGroupAssetsResponse>(
                  this, METHODID_MUTATE_ASSET_GROUP_ASSETS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage asset group asset.
   * </pre>
   */
  public static final class AssetGroupAssetServiceStub extends io.grpc.stub.AbstractAsyncStub<AssetGroupAssetServiceStub> {
    private AssetGroupAssetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGroupAssetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGroupAssetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset group assets. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAssetGroupAssets(com.google.ads.googleads.v12.services.MutateAssetGroupAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateAssetGroupAssetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAssetGroupAssetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage asset group asset.
   * </pre>
   */
  public static final class AssetGroupAssetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AssetGroupAssetServiceBlockingStub> {
    private AssetGroupAssetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGroupAssetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGroupAssetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset group assets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v12.services.MutateAssetGroupAssetsResponse mutateAssetGroupAssets(com.google.ads.googleads.v12.services.MutateAssetGroupAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAssetGroupAssetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage asset group asset.
   * </pre>
   */
  public static final class AssetGroupAssetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AssetGroupAssetServiceFutureStub> {
    private AssetGroupAssetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGroupAssetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGroupAssetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset group assets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v12.services.MutateAssetGroupAssetsResponse> mutateAssetGroupAssets(
        com.google.ads.googleads.v12.services.MutateAssetGroupAssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAssetGroupAssetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_ASSET_GROUP_ASSETS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssetGroupAssetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssetGroupAssetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_ASSET_GROUP_ASSETS:
          serviceImpl.mutateAssetGroupAssets((com.google.ads.googleads.v12.services.MutateAssetGroupAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateAssetGroupAssetsResponse>) responseObserver);
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

  private static abstract class AssetGroupAssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssetGroupAssetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v12.services.AssetGroupAssetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssetGroupAssetService");
    }
  }

  private static final class AssetGroupAssetServiceFileDescriptorSupplier
      extends AssetGroupAssetServiceBaseDescriptorSupplier {
    AssetGroupAssetServiceFileDescriptorSupplier() {}
  }

  private static final class AssetGroupAssetServiceMethodDescriptorSupplier
      extends AssetGroupAssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AssetGroupAssetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AssetGroupAssetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssetGroupAssetServiceFileDescriptorSupplier())
              .addMethod(getMutateAssetGroupAssetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
