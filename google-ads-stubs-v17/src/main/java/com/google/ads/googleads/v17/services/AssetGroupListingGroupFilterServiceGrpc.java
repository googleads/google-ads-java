package com.google.ads.googleads.v17.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage asset group listing group filter.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v17/services/asset_group_listing_group_filter_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssetGroupListingGroupFilterServiceGrpc {

  private AssetGroupListingGroupFilterServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v17.services.AssetGroupListingGroupFilterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersRequest,
      com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersResponse> getMutateAssetGroupListingGroupFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAssetGroupListingGroupFilters",
      requestType = com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersRequest.class,
      responseType = com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersRequest,
      com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersResponse> getMutateAssetGroupListingGroupFiltersMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersRequest, com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersResponse> getMutateAssetGroupListingGroupFiltersMethod;
    if ((getMutateAssetGroupListingGroupFiltersMethod = AssetGroupListingGroupFilterServiceGrpc.getMutateAssetGroupListingGroupFiltersMethod) == null) {
      synchronized (AssetGroupListingGroupFilterServiceGrpc.class) {
        if ((getMutateAssetGroupListingGroupFiltersMethod = AssetGroupListingGroupFilterServiceGrpc.getMutateAssetGroupListingGroupFiltersMethod) == null) {
          AssetGroupListingGroupFilterServiceGrpc.getMutateAssetGroupListingGroupFiltersMethod = getMutateAssetGroupListingGroupFiltersMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersRequest, com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAssetGroupListingGroupFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetGroupListingGroupFilterServiceMethodDescriptorSupplier("MutateAssetGroupListingGroupFilters"))
              .build();
        }
      }
    }
    return getMutateAssetGroupListingGroupFiltersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssetGroupListingGroupFilterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGroupListingGroupFilterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGroupListingGroupFilterServiceStub>() {
        @java.lang.Override
        public AssetGroupListingGroupFilterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGroupListingGroupFilterServiceStub(channel, callOptions);
        }
      };
    return AssetGroupListingGroupFilterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssetGroupListingGroupFilterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGroupListingGroupFilterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGroupListingGroupFilterServiceBlockingStub>() {
        @java.lang.Override
        public AssetGroupListingGroupFilterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGroupListingGroupFilterServiceBlockingStub(channel, callOptions);
        }
      };
    return AssetGroupListingGroupFilterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssetGroupListingGroupFilterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGroupListingGroupFilterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGroupListingGroupFilterServiceFutureStub>() {
        @java.lang.Override
        public AssetGroupListingGroupFilterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGroupListingGroupFilterServiceFutureStub(channel, callOptions);
        }
      };
    return AssetGroupListingGroupFilterServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage asset group listing group filter.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates or removes asset group listing group filters. Operation
     * statuses are returned.
     * </pre>
     */
    default void mutateAssetGroupListingGroupFilters(com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAssetGroupListingGroupFiltersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AssetGroupListingGroupFilterService.
   * <pre>
   * Service to manage asset group listing group filter.
   * </pre>
   */
  public static abstract class AssetGroupListingGroupFilterServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AssetGroupListingGroupFilterServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AssetGroupListingGroupFilterService.
   * <pre>
   * Service to manage asset group listing group filter.
   * </pre>
   */
  public static final class AssetGroupListingGroupFilterServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AssetGroupListingGroupFilterServiceStub> {
    private AssetGroupListingGroupFilterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGroupListingGroupFilterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGroupListingGroupFilterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset group listing group filters. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateAssetGroupListingGroupFilters(com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAssetGroupListingGroupFiltersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AssetGroupListingGroupFilterService.
   * <pre>
   * Service to manage asset group listing group filter.
   * </pre>
   */
  public static final class AssetGroupListingGroupFilterServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AssetGroupListingGroupFilterServiceBlockingStub> {
    private AssetGroupListingGroupFilterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGroupListingGroupFilterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGroupListingGroupFilterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset group listing group filters. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersResponse mutateAssetGroupListingGroupFilters(com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAssetGroupListingGroupFiltersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AssetGroupListingGroupFilterService.
   * <pre>
   * Service to manage asset group listing group filter.
   * </pre>
   */
  public static final class AssetGroupListingGroupFilterServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AssetGroupListingGroupFilterServiceFutureStub> {
    private AssetGroupListingGroupFilterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGroupListingGroupFilterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGroupListingGroupFilterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset group listing group filters. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersResponse> mutateAssetGroupListingGroupFilters(
        com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAssetGroupListingGroupFiltersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_ASSET_GROUP_LISTING_GROUP_FILTERS = 0;

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
        case METHODID_MUTATE_ASSET_GROUP_LISTING_GROUP_FILTERS:
          serviceImpl.mutateAssetGroupListingGroupFilters((com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersResponse>) responseObserver);
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
          getMutateAssetGroupListingGroupFiltersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersRequest,
              com.google.ads.googleads.v17.services.MutateAssetGroupListingGroupFiltersResponse>(
                service, METHODID_MUTATE_ASSET_GROUP_LISTING_GROUP_FILTERS)))
        .build();
  }

  private static abstract class AssetGroupListingGroupFilterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssetGroupListingGroupFilterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v17.services.AssetGroupListingGroupFilterServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssetGroupListingGroupFilterService");
    }
  }

  private static final class AssetGroupListingGroupFilterServiceFileDescriptorSupplier
      extends AssetGroupListingGroupFilterServiceBaseDescriptorSupplier {
    AssetGroupListingGroupFilterServiceFileDescriptorSupplier() {}
  }

  private static final class AssetGroupListingGroupFilterServiceMethodDescriptorSupplier
      extends AssetGroupListingGroupFilterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AssetGroupListingGroupFilterServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AssetGroupListingGroupFilterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssetGroupListingGroupFilterServiceFileDescriptorSupplier())
              .addMethod(getMutateAssetGroupListingGroupFiltersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
