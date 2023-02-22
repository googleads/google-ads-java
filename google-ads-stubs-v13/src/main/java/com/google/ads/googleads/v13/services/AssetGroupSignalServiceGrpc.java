package com.google.ads.googleads.v13.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage asset group signal.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v13/services/asset_group_signal_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssetGroupSignalServiceGrpc {

  private AssetGroupSignalServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v13.services.AssetGroupSignalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateAssetGroupSignalsRequest,
      com.google.ads.googleads.v13.services.MutateAssetGroupSignalsResponse> getMutateAssetGroupSignalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAssetGroupSignals",
      requestType = com.google.ads.googleads.v13.services.MutateAssetGroupSignalsRequest.class,
      responseType = com.google.ads.googleads.v13.services.MutateAssetGroupSignalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateAssetGroupSignalsRequest,
      com.google.ads.googleads.v13.services.MutateAssetGroupSignalsResponse> getMutateAssetGroupSignalsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateAssetGroupSignalsRequest, com.google.ads.googleads.v13.services.MutateAssetGroupSignalsResponse> getMutateAssetGroupSignalsMethod;
    if ((getMutateAssetGroupSignalsMethod = AssetGroupSignalServiceGrpc.getMutateAssetGroupSignalsMethod) == null) {
      synchronized (AssetGroupSignalServiceGrpc.class) {
        if ((getMutateAssetGroupSignalsMethod = AssetGroupSignalServiceGrpc.getMutateAssetGroupSignalsMethod) == null) {
          AssetGroupSignalServiceGrpc.getMutateAssetGroupSignalsMethod = getMutateAssetGroupSignalsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.MutateAssetGroupSignalsRequest, com.google.ads.googleads.v13.services.MutateAssetGroupSignalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAssetGroupSignals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateAssetGroupSignalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateAssetGroupSignalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetGroupSignalServiceMethodDescriptorSupplier("MutateAssetGroupSignals"))
              .build();
        }
      }
    }
    return getMutateAssetGroupSignalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssetGroupSignalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGroupSignalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGroupSignalServiceStub>() {
        @java.lang.Override
        public AssetGroupSignalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGroupSignalServiceStub(channel, callOptions);
        }
      };
    return AssetGroupSignalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssetGroupSignalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGroupSignalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGroupSignalServiceBlockingStub>() {
        @java.lang.Override
        public AssetGroupSignalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGroupSignalServiceBlockingStub(channel, callOptions);
        }
      };
    return AssetGroupSignalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssetGroupSignalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetGroupSignalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetGroupSignalServiceFutureStub>() {
        @java.lang.Override
        public AssetGroupSignalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetGroupSignalServiceFutureStub(channel, callOptions);
        }
      };
    return AssetGroupSignalServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage asset group signal.
   * </pre>
   */
  public static abstract class AssetGroupSignalServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates or removes asset group signals. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAssetGroupSignals(com.google.ads.googleads.v13.services.MutateAssetGroupSignalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateAssetGroupSignalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAssetGroupSignalsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateAssetGroupSignalsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v13.services.MutateAssetGroupSignalsRequest,
                com.google.ads.googleads.v13.services.MutateAssetGroupSignalsResponse>(
                  this, METHODID_MUTATE_ASSET_GROUP_SIGNALS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage asset group signal.
   * </pre>
   */
  public static final class AssetGroupSignalServiceStub extends io.grpc.stub.AbstractAsyncStub<AssetGroupSignalServiceStub> {
    private AssetGroupSignalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGroupSignalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGroupSignalServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes asset group signals. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAssetGroupSignals(com.google.ads.googleads.v13.services.MutateAssetGroupSignalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateAssetGroupSignalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAssetGroupSignalsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage asset group signal.
   * </pre>
   */
  public static final class AssetGroupSignalServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AssetGroupSignalServiceBlockingStub> {
    private AssetGroupSignalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGroupSignalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGroupSignalServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes asset group signals. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v13.services.MutateAssetGroupSignalsResponse mutateAssetGroupSignals(com.google.ads.googleads.v13.services.MutateAssetGroupSignalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAssetGroupSignalsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage asset group signal.
   * </pre>
   */
  public static final class AssetGroupSignalServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AssetGroupSignalServiceFutureStub> {
    private AssetGroupSignalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetGroupSignalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetGroupSignalServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes asset group signals. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.MutateAssetGroupSignalsResponse> mutateAssetGroupSignals(
        com.google.ads.googleads.v13.services.MutateAssetGroupSignalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAssetGroupSignalsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_ASSET_GROUP_SIGNALS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssetGroupSignalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssetGroupSignalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_ASSET_GROUP_SIGNALS:
          serviceImpl.mutateAssetGroupSignals((com.google.ads.googleads.v13.services.MutateAssetGroupSignalsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateAssetGroupSignalsResponse>) responseObserver);
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

  private static abstract class AssetGroupSignalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssetGroupSignalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v13.services.AssetGroupSignalServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssetGroupSignalService");
    }
  }

  private static final class AssetGroupSignalServiceFileDescriptorSupplier
      extends AssetGroupSignalServiceBaseDescriptorSupplier {
    AssetGroupSignalServiceFileDescriptorSupplier() {}
  }

  private static final class AssetGroupSignalServiceMethodDescriptorSupplier
      extends AssetGroupSignalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AssetGroupSignalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AssetGroupSignalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssetGroupSignalServiceFileDescriptorSupplier())
              .addMethod(getMutateAssetGroupSignalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
