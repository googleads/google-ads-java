package com.google.ads.googleads.v2.services;

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
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/asset_service.proto")
public final class AssetServiceGrpc {

  private AssetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.AssetService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAssetMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAssetRequest,
      com.google.ads.googleads.v2.resources.Asset> METHOD_GET_ASSET = getGetAssetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAssetRequest,
      com.google.ads.googleads.v2.resources.Asset> getGetAssetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAssetRequest,
      com.google.ads.googleads.v2.resources.Asset> getGetAssetMethod() {
    return getGetAssetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAssetRequest,
      com.google.ads.googleads.v2.resources.Asset> getGetAssetMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAssetRequest, com.google.ads.googleads.v2.resources.Asset> getGetAssetMethod;
    if ((getGetAssetMethod = AssetServiceGrpc.getGetAssetMethod) == null) {
      synchronized (AssetServiceGrpc.class) {
        if ((getGetAssetMethod = AssetServiceGrpc.getGetAssetMethod) == null) {
          AssetServiceGrpc.getGetAssetMethod = getGetAssetMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetAssetRequest, com.google.ads.googleads.v2.resources.Asset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.AssetService", "GetAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.Asset.getDefaultInstance()))
                  .setSchemaDescriptor(new AssetServiceMethodDescriptorSupplier("GetAsset"))
                  .build();
          }
        }
     }
     return getGetAssetMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateAssetsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateAssetsRequest,
      com.google.ads.googleads.v2.services.MutateAssetsResponse> METHOD_MUTATE_ASSETS = getMutateAssetsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateAssetsRequest,
      com.google.ads.googleads.v2.services.MutateAssetsResponse> getMutateAssetsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateAssetsRequest,
      com.google.ads.googleads.v2.services.MutateAssetsResponse> getMutateAssetsMethod() {
    return getMutateAssetsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateAssetsRequest,
      com.google.ads.googleads.v2.services.MutateAssetsResponse> getMutateAssetsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateAssetsRequest, com.google.ads.googleads.v2.services.MutateAssetsResponse> getMutateAssetsMethod;
    if ((getMutateAssetsMethod = AssetServiceGrpc.getMutateAssetsMethod) == null) {
      synchronized (AssetServiceGrpc.class) {
        if ((getMutateAssetsMethod = AssetServiceGrpc.getMutateAssetsMethod) == null) {
          AssetServiceGrpc.getMutateAssetsMethod = getMutateAssetsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.MutateAssetsRequest, com.google.ads.googleads.v2.services.MutateAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.AssetService", "MutateAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateAssetsResponse.getDefaultInstance()))
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
    return new AssetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AssetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AssetServiceFutureStub(channel);
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
    public void getAsset(com.google.ads.googleads.v2.services.GetAssetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.Asset> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates assets. Operation statuses are returned.
     * </pre>
     */
    public void mutateAssets(com.google.ads.googleads.v2.services.MutateAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateAssetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAssetsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAssetMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetAssetRequest,
                com.google.ads.googleads.v2.resources.Asset>(
                  this, METHODID_GET_ASSET)))
          .addMethod(
            getMutateAssetsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.MutateAssetsRequest,
                com.google.ads.googleads.v2.services.MutateAssetsResponse>(
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
  public static final class AssetServiceStub extends io.grpc.stub.AbstractStub<AssetServiceStub> {
    private AssetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested asset in full detail.
     * </pre>
     */
    public void getAsset(com.google.ads.googleads.v2.services.GetAssetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.Asset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates assets. Operation statuses are returned.
     * </pre>
     */
    public void mutateAssets(com.google.ads.googleads.v2.services.MutateAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateAssetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAssetsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage assets. Asset types can be created with AssetService are
   * YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be
   * created with Ad inline.
   * </pre>
   */
  public static final class AssetServiceBlockingStub extends io.grpc.stub.AbstractStub<AssetServiceBlockingStub> {
    private AssetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested asset in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.Asset getAsset(com.google.ads.googleads.v2.services.GetAssetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates assets. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.MutateAssetsResponse mutateAssets(com.google.ads.googleads.v2.services.MutateAssetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAssetsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage assets. Asset types can be created with AssetService are
   * YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be
   * created with Ad inline.
   * </pre>
   */
  public static final class AssetServiceFutureStub extends io.grpc.stub.AbstractStub<AssetServiceFutureStub> {
    private AssetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AssetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested asset in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.Asset> getAsset(
        com.google.ads.googleads.v2.services.GetAssetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates assets. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.MutateAssetsResponse> mutateAssets(
        com.google.ads.googleads.v2.services.MutateAssetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAssetsMethodHelper(), getCallOptions()), request);
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
          serviceImpl.getAsset((com.google.ads.googleads.v2.services.GetAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.Asset>) responseObserver);
          break;
        case METHODID_MUTATE_ASSETS:
          serviceImpl.mutateAssets((com.google.ads.googleads.v2.services.MutateAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateAssetsResponse>) responseObserver);
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
      return com.google.ads.googleads.v2.services.AssetServiceProto.getDescriptor();
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
              .addMethod(getGetAssetMethodHelper())
              .addMethod(getMutateAssetsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
