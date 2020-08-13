package com.google.ads.googleads.v5.services;

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
 * Service to manage assets. Asset types can be created with AssetService are
 * YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be
 * created with Ad inline.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v5/services/asset_service.proto")
public final class AssetServiceGrpc {

  private AssetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v5.services.AssetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetAssetRequest,
      com.google.ads.googleads.v5.resources.Asset> getGetAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAsset",
      requestType = com.google.ads.googleads.v5.services.GetAssetRequest.class,
      responseType = com.google.ads.googleads.v5.resources.Asset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetAssetRequest,
      com.google.ads.googleads.v5.resources.Asset> getGetAssetMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetAssetRequest, com.google.ads.googleads.v5.resources.Asset> getGetAssetMethod;
    if ((getGetAssetMethod = AssetServiceGrpc.getGetAssetMethod) == null) {
      synchronized (AssetServiceGrpc.class) {
        if ((getGetAssetMethod = AssetServiceGrpc.getGetAssetMethod) == null) {
          AssetServiceGrpc.getGetAssetMethod = getGetAssetMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.GetAssetRequest, com.google.ads.googleads.v5.resources.Asset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.GetAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.resources.Asset.getDefaultInstance()))
              .setSchemaDescriptor(new AssetServiceMethodDescriptorSupplier("GetAsset"))
              .build();
        }
      }
    }
    return getGetAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateAssetsRequest,
      com.google.ads.googleads.v5.services.MutateAssetsResponse> getMutateAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAssets",
      requestType = com.google.ads.googleads.v5.services.MutateAssetsRequest.class,
      responseType = com.google.ads.googleads.v5.services.MutateAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateAssetsRequest,
      com.google.ads.googleads.v5.services.MutateAssetsResponse> getMutateAssetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateAssetsRequest, com.google.ads.googleads.v5.services.MutateAssetsResponse> getMutateAssetsMethod;
    if ((getMutateAssetsMethod = AssetServiceGrpc.getMutateAssetsMethod) == null) {
      synchronized (AssetServiceGrpc.class) {
        if ((getMutateAssetsMethod = AssetServiceGrpc.getMutateAssetsMethod) == null) {
          AssetServiceGrpc.getMutateAssetsMethod = getMutateAssetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.MutateAssetsRequest, com.google.ads.googleads.v5.services.MutateAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.MutateAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.MutateAssetsResponse.getDefaultInstance()))
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
  public static abstract class AssetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested asset in full detail.
     * </pre>
     */
    public void getAsset(com.google.ads.googleads.v5.services.GetAssetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.Asset> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates assets. Operation statuses are returned.
     * </pre>
     */
    public void mutateAssets(com.google.ads.googleads.v5.services.MutateAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateAssetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAssetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.GetAssetRequest,
                com.google.ads.googleads.v5.resources.Asset>(
                  this, METHODID_GET_ASSET)))
          .addMethod(
            getMutateAssetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.MutateAssetsRequest,
                com.google.ads.googleads.v5.services.MutateAssetsResponse>(
                  this, METHODID_MUTATE_ASSETS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage assets. Asset types can be created with AssetService are
   * YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be
   * created with Ad inline.
   * </pre>
   */
  public static final class AssetServiceStub extends io.grpc.stub.AbstractAsyncStub<AssetServiceStub> {
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
     * Returns the requested asset in full detail.
     * </pre>
     */
    public void getAsset(com.google.ads.googleads.v5.services.GetAssetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.Asset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates assets. Operation statuses are returned.
     * </pre>
     */
    public void mutateAssets(com.google.ads.googleads.v5.services.MutateAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateAssetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAssetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage assets. Asset types can be created with AssetService are
   * YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be
   * created with Ad inline.
   * </pre>
   */
  public static final class AssetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AssetServiceBlockingStub> {
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
     * Returns the requested asset in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v5.resources.Asset getAsset(com.google.ads.googleads.v5.services.GetAssetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates assets. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v5.services.MutateAssetsResponse mutateAssets(com.google.ads.googleads.v5.services.MutateAssetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAssetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage assets. Asset types can be created with AssetService are
   * YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be
   * created with Ad inline.
   * </pre>
   */
  public static final class AssetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AssetServiceFutureStub> {
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
     * Returns the requested asset in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.resources.Asset> getAsset(
        com.google.ads.googleads.v5.services.GetAssetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates assets. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.services.MutateAssetsResponse> mutateAssets(
        com.google.ads.googleads.v5.services.MutateAssetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAssetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ASSET = 0;
  private static final int METHODID_MUTATE_ASSETS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ASSET:
          serviceImpl.getAsset((com.google.ads.googleads.v5.services.GetAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.Asset>) responseObserver);
          break;
        case METHODID_MUTATE_ASSETS:
          serviceImpl.mutateAssets((com.google.ads.googleads.v5.services.MutateAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateAssetsResponse>) responseObserver);
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

  private static abstract class AssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v5.services.AssetServiceProto.getDescriptor();
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
    private final String methodName;

    AssetServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getGetAssetMethod())
              .addMethod(getMutateAssetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
