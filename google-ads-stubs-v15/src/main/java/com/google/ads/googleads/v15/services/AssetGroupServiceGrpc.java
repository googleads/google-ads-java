package com.google.ads.googleads.v15.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage asset group
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v15/services/asset_group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssetGroupServiceGrpc {

  private AssetGroupServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v15.services.AssetGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.MutateAssetGroupsRequest,
      com.google.ads.googleads.v15.services.MutateAssetGroupsResponse> getMutateAssetGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAssetGroups",
      requestType = com.google.ads.googleads.v15.services.MutateAssetGroupsRequest.class,
      responseType = com.google.ads.googleads.v15.services.MutateAssetGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.MutateAssetGroupsRequest,
      com.google.ads.googleads.v15.services.MutateAssetGroupsResponse> getMutateAssetGroupsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.MutateAssetGroupsRequest, com.google.ads.googleads.v15.services.MutateAssetGroupsResponse> getMutateAssetGroupsMethod;
    if ((getMutateAssetGroupsMethod = AssetGroupServiceGrpc.getMutateAssetGroupsMethod) == null) {
      synchronized (AssetGroupServiceGrpc.class) {
        if ((getMutateAssetGroupsMethod = AssetGroupServiceGrpc.getMutateAssetGroupsMethod) == null) {
          AssetGroupServiceGrpc.getMutateAssetGroupsMethod = getMutateAssetGroupsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v15.services.MutateAssetGroupsRequest, com.google.ads.googleads.v15.services.MutateAssetGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAssetGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v15.services.MutateAssetGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v15.services.MutateAssetGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetGroupServiceMethodDescriptorSupplier("MutateAssetGroups"))
              .build();
        }
      }
    }
    return getMutateAssetGroupsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssetGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGroupServiceStub>() {
        @java.lang.Override
        public AssetGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGroupServiceStub(channel, callOptions);
        }
      };
    return AssetGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssetGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGroupServiceBlockingStub>() {
        @java.lang.Override
        public AssetGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return AssetGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssetGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGroupServiceFutureStub>() {
        @java.lang.Override
        public AssetGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGroupServiceFutureStub(channel, callOptions);
        }
      };
    return AssetGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage asset group
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates or removes asset groups. Operation statuses are
     * returned.
     * </pre>
     */
    default void mutateAssetGroups(com.google.ads.googleads.v15.services.MutateAssetGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.MutateAssetGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAssetGroupsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AssetGroupService.
   * <pre>
   * Service to manage asset group
   * </pre>
   */
  public static abstract class AssetGroupServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AssetGroupServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AssetGroupService.
   * <pre>
   * Service to manage asset group
   * </pre>
   */
  public static final class AssetGroupServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AssetGroupServiceStub> {
    private AssetGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset groups. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAssetGroups(com.google.ads.googleads.v15.services.MutateAssetGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.MutateAssetGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAssetGroupsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AssetGroupService.
   * <pre>
   * Service to manage asset group
   * </pre>
   */
  public static final class AssetGroupServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AssetGroupServiceBlockingStub> {
    private AssetGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset groups. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v15.services.MutateAssetGroupsResponse mutateAssetGroups(com.google.ads.googleads.v15.services.MutateAssetGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAssetGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AssetGroupService.
   * <pre>
   * Service to manage asset group
   * </pre>
   */
  public static final class AssetGroupServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AssetGroupServiceFutureStub> {
    private AssetGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset groups. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v15.services.MutateAssetGroupsResponse> mutateAssetGroups(
        com.google.ads.googleads.v15.services.MutateAssetGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAssetGroupsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_ASSET_GROUPS = 0;

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
        case METHODID_MUTATE_ASSET_GROUPS:
          serviceImpl.mutateAssetGroups((com.google.ads.googleads.v15.services.MutateAssetGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.MutateAssetGroupsResponse>) responseObserver);
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
          getMutateAssetGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v15.services.MutateAssetGroupsRequest,
              com.google.ads.googleads.v15.services.MutateAssetGroupsResponse>(
                service, METHODID_MUTATE_ASSET_GROUPS)))
        .build();
  }

  private static abstract class AssetGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssetGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v15.services.AssetGroupServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssetGroupService");
    }
  }

  private static final class AssetGroupServiceFileDescriptorSupplier
      extends AssetGroupServiceBaseDescriptorSupplier {
    AssetGroupServiceFileDescriptorSupplier() {}
  }

  private static final class AssetGroupServiceMethodDescriptorSupplier
      extends AssetGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AssetGroupServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AssetGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssetGroupServiceFileDescriptorSupplier())
              .addMethod(getMutateAssetGroupsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
