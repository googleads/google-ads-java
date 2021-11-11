package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customer assets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/customer_asset_service.proto")
public final class CustomerAssetServiceGrpc {

  private CustomerAssetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.CustomerAssetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCustomerAssetRequest,
      com.google.ads.googleads.v9.resources.CustomerAsset> getGetCustomerAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerAsset",
      requestType = com.google.ads.googleads.v9.services.GetCustomerAssetRequest.class,
      responseType = com.google.ads.googleads.v9.resources.CustomerAsset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCustomerAssetRequest,
      com.google.ads.googleads.v9.resources.CustomerAsset> getGetCustomerAssetMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCustomerAssetRequest, com.google.ads.googleads.v9.resources.CustomerAsset> getGetCustomerAssetMethod;
    if ((getGetCustomerAssetMethod = CustomerAssetServiceGrpc.getGetCustomerAssetMethod) == null) {
      synchronized (CustomerAssetServiceGrpc.class) {
        if ((getGetCustomerAssetMethod = CustomerAssetServiceGrpc.getGetCustomerAssetMethod) == null) {
          CustomerAssetServiceGrpc.getGetCustomerAssetMethod = getGetCustomerAssetMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetCustomerAssetRequest, com.google.ads.googleads.v9.resources.CustomerAsset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetCustomerAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.CustomerAsset.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerAssetServiceMethodDescriptorSupplier("GetCustomerAsset"))
              .build();
        }
      }
    }
    return getGetCustomerAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCustomerAssetsRequest,
      com.google.ads.googleads.v9.services.MutateCustomerAssetsResponse> getMutateCustomerAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerAssets",
      requestType = com.google.ads.googleads.v9.services.MutateCustomerAssetsRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateCustomerAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCustomerAssetsRequest,
      com.google.ads.googleads.v9.services.MutateCustomerAssetsResponse> getMutateCustomerAssetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCustomerAssetsRequest, com.google.ads.googleads.v9.services.MutateCustomerAssetsResponse> getMutateCustomerAssetsMethod;
    if ((getMutateCustomerAssetsMethod = CustomerAssetServiceGrpc.getMutateCustomerAssetsMethod) == null) {
      synchronized (CustomerAssetServiceGrpc.class) {
        if ((getMutateCustomerAssetsMethod = CustomerAssetServiceGrpc.getMutateCustomerAssetsMethod) == null) {
          CustomerAssetServiceGrpc.getMutateCustomerAssetsMethod = getMutateCustomerAssetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateCustomerAssetsRequest, com.google.ads.googleads.v9.services.MutateCustomerAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCustomerAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCustomerAssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerAssetServiceMethodDescriptorSupplier("MutateCustomerAssets"))
              .build();
        }
      }
    }
    return getMutateCustomerAssetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerAssetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerAssetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerAssetServiceStub>() {
        @java.lang.Override
        public CustomerAssetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerAssetServiceStub(channel, callOptions);
        }
      };
    return CustomerAssetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerAssetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerAssetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerAssetServiceBlockingStub>() {
        @java.lang.Override
        public CustomerAssetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerAssetServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerAssetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerAssetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerAssetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerAssetServiceFutureStub>() {
        @java.lang.Override
        public CustomerAssetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerAssetServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerAssetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage customer assets.
   * </pre>
   */
  public static abstract class CustomerAssetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested customer asset in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCustomerAsset(com.google.ads.googleads.v9.services.GetCustomerAssetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CustomerAsset> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCustomerAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer assets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AssetLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateCustomerAssets(com.google.ads.googleads.v9.services.MutateCustomerAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCustomerAssetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerAssetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerAssetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetCustomerAssetRequest,
                com.google.ads.googleads.v9.resources.CustomerAsset>(
                  this, METHODID_GET_CUSTOMER_ASSET)))
          .addMethod(
            getMutateCustomerAssetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateCustomerAssetsRequest,
                com.google.ads.googleads.v9.services.MutateCustomerAssetsResponse>(
                  this, METHODID_MUTATE_CUSTOMER_ASSETS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage customer assets.
   * </pre>
   */
  public static final class CustomerAssetServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomerAssetServiceStub> {
    private CustomerAssetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerAssetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerAssetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer asset in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCustomerAsset(com.google.ads.googleads.v9.services.GetCustomerAssetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CustomerAsset> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCustomerAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer assets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AssetLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateCustomerAssets(com.google.ads.googleads.v9.services.MutateCustomerAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCustomerAssetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerAssetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage customer assets.
   * </pre>
   */
  public static final class CustomerAssetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomerAssetServiceBlockingStub> {
    private CustomerAssetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerAssetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerAssetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer asset in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.CustomerAsset getCustomerAsset(com.google.ads.googleads.v9.services.GetCustomerAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCustomerAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer assets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AssetLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.MutateCustomerAssetsResponse mutateCustomerAssets(com.google.ads.googleads.v9.services.MutateCustomerAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerAssetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage customer assets.
   * </pre>
   */
  public static final class CustomerAssetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomerAssetServiceFutureStub> {
    private CustomerAssetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerAssetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerAssetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer asset in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.CustomerAsset> getCustomerAsset(
        com.google.ads.googleads.v9.services.GetCustomerAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCustomerAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer assets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AssetLinkError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateCustomerAssetsResponse> mutateCustomerAssets(
        com.google.ads.googleads.v9.services.MutateCustomerAssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerAssetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_ASSET = 0;
  private static final int METHODID_MUTATE_CUSTOMER_ASSETS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerAssetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerAssetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_ASSET:
          serviceImpl.getCustomerAsset((com.google.ads.googleads.v9.services.GetCustomerAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CustomerAsset>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOMER_ASSETS:
          serviceImpl.mutateCustomerAssets((com.google.ads.googleads.v9.services.MutateCustomerAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCustomerAssetsResponse>) responseObserver);
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

  private static abstract class CustomerAssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerAssetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.CustomerAssetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerAssetService");
    }
  }

  private static final class CustomerAssetServiceFileDescriptorSupplier
      extends CustomerAssetServiceBaseDescriptorSupplier {
    CustomerAssetServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerAssetServiceMethodDescriptorSupplier
      extends CustomerAssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerAssetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerAssetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerAssetServiceFileDescriptorSupplier())
              .addMethod(getGetCustomerAssetMethod())
              .addMethod(getMutateCustomerAssetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
