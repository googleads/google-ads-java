package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch asset field type views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/asset_field_type_view_service.proto")
public final class AssetFieldTypeViewServiceGrpc {

  private AssetFieldTypeViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.AssetFieldTypeViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetAssetFieldTypeViewRequest,
      com.google.ads.googleads.v9.resources.AssetFieldTypeView> getGetAssetFieldTypeViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetFieldTypeView",
      requestType = com.google.ads.googleads.v9.services.GetAssetFieldTypeViewRequest.class,
      responseType = com.google.ads.googleads.v9.resources.AssetFieldTypeView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetAssetFieldTypeViewRequest,
      com.google.ads.googleads.v9.resources.AssetFieldTypeView> getGetAssetFieldTypeViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetAssetFieldTypeViewRequest, com.google.ads.googleads.v9.resources.AssetFieldTypeView> getGetAssetFieldTypeViewMethod;
    if ((getGetAssetFieldTypeViewMethod = AssetFieldTypeViewServiceGrpc.getGetAssetFieldTypeViewMethod) == null) {
      synchronized (AssetFieldTypeViewServiceGrpc.class) {
        if ((getGetAssetFieldTypeViewMethod = AssetFieldTypeViewServiceGrpc.getGetAssetFieldTypeViewMethod) == null) {
          AssetFieldTypeViewServiceGrpc.getGetAssetFieldTypeViewMethod = getGetAssetFieldTypeViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetAssetFieldTypeViewRequest, com.google.ads.googleads.v9.resources.AssetFieldTypeView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetFieldTypeView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetAssetFieldTypeViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.AssetFieldTypeView.getDefaultInstance()))
              .setSchemaDescriptor(new AssetFieldTypeViewServiceMethodDescriptorSupplier("GetAssetFieldTypeView"))
              .build();
        }
      }
    }
    return getGetAssetFieldTypeViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssetFieldTypeViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetFieldTypeViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetFieldTypeViewServiceStub>() {
        @java.lang.Override
        public AssetFieldTypeViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetFieldTypeViewServiceStub(channel, callOptions);
        }
      };
    return AssetFieldTypeViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssetFieldTypeViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetFieldTypeViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetFieldTypeViewServiceBlockingStub>() {
        @java.lang.Override
        public AssetFieldTypeViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetFieldTypeViewServiceBlockingStub(channel, callOptions);
        }
      };
    return AssetFieldTypeViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssetFieldTypeViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetFieldTypeViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetFieldTypeViewServiceFutureStub>() {
        @java.lang.Override
        public AssetFieldTypeViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetFieldTypeViewServiceFutureStub(channel, callOptions);
        }
      };
    return AssetFieldTypeViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch asset field type views.
   * </pre>
   */
  public static abstract class AssetFieldTypeViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested asset field type view in full detail.
     * </pre>
     */
    public void getAssetFieldTypeView(com.google.ads.googleads.v9.services.GetAssetFieldTypeViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.AssetFieldTypeView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetFieldTypeViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAssetFieldTypeViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetAssetFieldTypeViewRequest,
                com.google.ads.googleads.v9.resources.AssetFieldTypeView>(
                  this, METHODID_GET_ASSET_FIELD_TYPE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch asset field type views.
   * </pre>
   */
  public static final class AssetFieldTypeViewServiceStub extends io.grpc.stub.AbstractAsyncStub<AssetFieldTypeViewServiceStub> {
    private AssetFieldTypeViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetFieldTypeViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetFieldTypeViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested asset field type view in full detail.
     * </pre>
     */
    public void getAssetFieldTypeView(com.google.ads.googleads.v9.services.GetAssetFieldTypeViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.AssetFieldTypeView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetFieldTypeViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch asset field type views.
   * </pre>
   */
  public static final class AssetFieldTypeViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AssetFieldTypeViewServiceBlockingStub> {
    private AssetFieldTypeViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetFieldTypeViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetFieldTypeViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested asset field type view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.AssetFieldTypeView getAssetFieldTypeView(com.google.ads.googleads.v9.services.GetAssetFieldTypeViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetFieldTypeViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch asset field type views.
   * </pre>
   */
  public static final class AssetFieldTypeViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AssetFieldTypeViewServiceFutureStub> {
    private AssetFieldTypeViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetFieldTypeViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetFieldTypeViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested asset field type view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.AssetFieldTypeView> getAssetFieldTypeView(
        com.google.ads.googleads.v9.services.GetAssetFieldTypeViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetFieldTypeViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ASSET_FIELD_TYPE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssetFieldTypeViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssetFieldTypeViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ASSET_FIELD_TYPE_VIEW:
          serviceImpl.getAssetFieldTypeView((com.google.ads.googleads.v9.services.GetAssetFieldTypeViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.AssetFieldTypeView>) responseObserver);
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

  private static abstract class AssetFieldTypeViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssetFieldTypeViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.AssetFieldTypeViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssetFieldTypeViewService");
    }
  }

  private static final class AssetFieldTypeViewServiceFileDescriptorSupplier
      extends AssetFieldTypeViewServiceBaseDescriptorSupplier {
    AssetFieldTypeViewServiceFileDescriptorSupplier() {}
  }

  private static final class AssetFieldTypeViewServiceMethodDescriptorSupplier
      extends AssetFieldTypeViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AssetFieldTypeViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AssetFieldTypeViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssetFieldTypeViewServiceFileDescriptorSupplier())
              .addMethod(getGetAssetFieldTypeViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
