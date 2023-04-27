package com.google.ads.googleads.v13.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage asset set
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v13/services/asset_set_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssetSetServiceGrpc {

  private AssetSetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v13.services.AssetSetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateAssetSetsRequest,
      com.google.ads.googleads.v13.services.MutateAssetSetsResponse> getMutateAssetSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAssetSets",
      requestType = com.google.ads.googleads.v13.services.MutateAssetSetsRequest.class,
      responseType = com.google.ads.googleads.v13.services.MutateAssetSetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateAssetSetsRequest,
      com.google.ads.googleads.v13.services.MutateAssetSetsResponse> getMutateAssetSetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateAssetSetsRequest, com.google.ads.googleads.v13.services.MutateAssetSetsResponse> getMutateAssetSetsMethod;
    if ((getMutateAssetSetsMethod = AssetSetServiceGrpc.getMutateAssetSetsMethod) == null) {
      synchronized (AssetSetServiceGrpc.class) {
        if ((getMutateAssetSetsMethod = AssetSetServiceGrpc.getMutateAssetSetsMethod) == null) {
          AssetSetServiceGrpc.getMutateAssetSetsMethod = getMutateAssetSetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.MutateAssetSetsRequest, com.google.ads.googleads.v13.services.MutateAssetSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAssetSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateAssetSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateAssetSetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetSetServiceMethodDescriptorSupplier("MutateAssetSets"))
              .build();
        }
      }
    }
    return getMutateAssetSetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssetSetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetSetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetSetServiceStub>() {
        @java.lang.Override
        public AssetSetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetSetServiceStub(channel, callOptions);
        }
      };
    return AssetSetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssetSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetSetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetSetServiceBlockingStub>() {
        @java.lang.Override
        public AssetSetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetSetServiceBlockingStub(channel, callOptions);
        }
      };
    return AssetSetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssetSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetSetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetSetServiceFutureStub>() {
        @java.lang.Override
        public AssetSetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetSetServiceFutureStub(channel, callOptions);
        }
      };
    return AssetSetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage asset set
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates or removes asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    default void mutateAssetSets(com.google.ads.googleads.v13.services.MutateAssetSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateAssetSetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAssetSetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AssetSetService.
   * <pre>
   * Service to manage asset set
   * </pre>
   */
  public static abstract class AssetSetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AssetSetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AssetSetService.
   * <pre>
   * Service to manage asset set
   * </pre>
   */
  public static final class AssetSetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AssetSetServiceStub> {
    private AssetSetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetSetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetSetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAssetSets(com.google.ads.googleads.v13.services.MutateAssetSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateAssetSetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAssetSetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AssetSetService.
   * <pre>
   * Service to manage asset set
   * </pre>
   */
  public static final class AssetSetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AssetSetServiceBlockingStub> {
    private AssetSetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetSetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetSetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v13.services.MutateAssetSetsResponse mutateAssetSets(com.google.ads.googleads.v13.services.MutateAssetSetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAssetSetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AssetSetService.
   * <pre>
   * Service to manage asset set
   * </pre>
   */
  public static final class AssetSetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AssetSetServiceFutureStub> {
    private AssetSetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetSetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetSetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.MutateAssetSetsResponse> mutateAssetSets(
        com.google.ads.googleads.v13.services.MutateAssetSetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAssetSetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_ASSET_SETS = 0;

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
        case METHODID_MUTATE_ASSET_SETS:
          serviceImpl.mutateAssetSets((com.google.ads.googleads.v13.services.MutateAssetSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateAssetSetsResponse>) responseObserver);
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
          getMutateAssetSetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v13.services.MutateAssetSetsRequest,
              com.google.ads.googleads.v13.services.MutateAssetSetsResponse>(
                service, METHODID_MUTATE_ASSET_SETS)))
        .build();
  }

  private static abstract class AssetSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssetSetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v13.services.AssetSetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssetSetService");
    }
  }

  private static final class AssetSetServiceFileDescriptorSupplier
      extends AssetSetServiceBaseDescriptorSupplier {
    AssetSetServiceFileDescriptorSupplier() {}
  }

  private static final class AssetSetServiceMethodDescriptorSupplier
      extends AssetSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AssetSetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AssetSetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssetSetServiceFileDescriptorSupplier())
              .addMethod(getMutateAssetSetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
