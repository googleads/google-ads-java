package com.google.ads.googleads.v21.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customer assets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v21/services/customer_asset_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerAssetServiceGrpc {

  private CustomerAssetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v21.services.CustomerAssetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.MutateCustomerAssetsRequest,
      com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse> getMutateCustomerAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerAssets",
      requestType = com.google.ads.googleads.v21.services.MutateCustomerAssetsRequest.class,
      responseType = com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.MutateCustomerAssetsRequest,
      com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse> getMutateCustomerAssetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.MutateCustomerAssetsRequest, com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse> getMutateCustomerAssetsMethod;
    if ((getMutateCustomerAssetsMethod = CustomerAssetServiceGrpc.getMutateCustomerAssetsMethod) == null) {
      synchronized (CustomerAssetServiceGrpc.class) {
        if ((getMutateCustomerAssetsMethod = CustomerAssetServiceGrpc.getMutateCustomerAssetsMethod) == null) {
          CustomerAssetServiceGrpc.getMutateCustomerAssetsMethod = getMutateCustomerAssetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v21.services.MutateCustomerAssetsRequest, com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v21.services.MutateCustomerAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse.getDefaultInstance()))
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
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CustomerAssetServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerAssetServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerAssetServiceBlockingV2Stub>() {
        @java.lang.Override
        public CustomerAssetServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerAssetServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CustomerAssetServiceBlockingV2Stub.newStub(factory, channel);
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
  public interface AsyncService {

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
    default void mutateCustomerAssets(com.google.ads.googleads.v21.services.MutateCustomerAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerAssetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerAssetService.
   * <pre>
   * Service to manage customer assets.
   * </pre>
   */
  public static abstract class CustomerAssetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerAssetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerAssetService.
   * <pre>
   * Service to manage customer assets.
   * </pre>
   */
  public static final class CustomerAssetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerAssetServiceStub> {
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
    public void mutateCustomerAssets(com.google.ads.googleads.v21.services.MutateCustomerAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerAssetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerAssetService.
   * <pre>
   * Service to manage customer assets.
   * </pre>
   */
  public static final class CustomerAssetServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CustomerAssetServiceBlockingV2Stub> {
    private CustomerAssetServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerAssetServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerAssetServiceBlockingV2Stub(channel, callOptions);
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
    public com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse mutateCustomerAssets(com.google.ads.googleads.v21.services.MutateCustomerAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerAssetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CustomerAssetService.
   * <pre>
   * Service to manage customer assets.
   * </pre>
   */
  public static final class CustomerAssetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerAssetServiceBlockingStub> {
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
    public com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse mutateCustomerAssets(com.google.ads.googleads.v21.services.MutateCustomerAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerAssetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerAssetService.
   * <pre>
   * Service to manage customer assets.
   * </pre>
   */
  public static final class CustomerAssetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerAssetServiceFutureStub> {
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse> mutateCustomerAssets(
        com.google.ads.googleads.v21.services.MutateCustomerAssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerAssetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER_ASSETS = 0;

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
        case METHODID_MUTATE_CUSTOMER_ASSETS:
          serviceImpl.mutateCustomerAssets((com.google.ads.googleads.v21.services.MutateCustomerAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse>) responseObserver);
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
          getMutateCustomerAssetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v21.services.MutateCustomerAssetsRequest,
              com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse>(
                service, METHODID_MUTATE_CUSTOMER_ASSETS)))
        .build();
  }

  private static abstract class CustomerAssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerAssetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v21.services.CustomerAssetServiceProto.getDescriptor();
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
    private final java.lang.String methodName;

    CustomerAssetServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getMutateCustomerAssetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
