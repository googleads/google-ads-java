package com.google.ads.googleads.v14.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service allows management of links between  a Google
 * Ads customer and another product.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v14/services/product_link_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductLinkServiceGrpc {

  private ProductLinkServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v14.services.ProductLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.CreateProductLinkRequest,
      com.google.ads.googleads.v14.services.CreateProductLinkResponse> getCreateProductLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProductLink",
      requestType = com.google.ads.googleads.v14.services.CreateProductLinkRequest.class,
      responseType = com.google.ads.googleads.v14.services.CreateProductLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.CreateProductLinkRequest,
      com.google.ads.googleads.v14.services.CreateProductLinkResponse> getCreateProductLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.CreateProductLinkRequest, com.google.ads.googleads.v14.services.CreateProductLinkResponse> getCreateProductLinkMethod;
    if ((getCreateProductLinkMethod = ProductLinkServiceGrpc.getCreateProductLinkMethod) == null) {
      synchronized (ProductLinkServiceGrpc.class) {
        if ((getCreateProductLinkMethod = ProductLinkServiceGrpc.getCreateProductLinkMethod) == null) {
          ProductLinkServiceGrpc.getCreateProductLinkMethod = getCreateProductLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v14.services.CreateProductLinkRequest, com.google.ads.googleads.v14.services.CreateProductLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProductLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.CreateProductLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.CreateProductLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductLinkServiceMethodDescriptorSupplier("CreateProductLink"))
              .build();
        }
      }
    }
    return getCreateProductLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.RemoveProductLinkRequest,
      com.google.ads.googleads.v14.services.RemoveProductLinkResponse> getRemoveProductLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveProductLink",
      requestType = com.google.ads.googleads.v14.services.RemoveProductLinkRequest.class,
      responseType = com.google.ads.googleads.v14.services.RemoveProductLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.RemoveProductLinkRequest,
      com.google.ads.googleads.v14.services.RemoveProductLinkResponse> getRemoveProductLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.RemoveProductLinkRequest, com.google.ads.googleads.v14.services.RemoveProductLinkResponse> getRemoveProductLinkMethod;
    if ((getRemoveProductLinkMethod = ProductLinkServiceGrpc.getRemoveProductLinkMethod) == null) {
      synchronized (ProductLinkServiceGrpc.class) {
        if ((getRemoveProductLinkMethod = ProductLinkServiceGrpc.getRemoveProductLinkMethod) == null) {
          ProductLinkServiceGrpc.getRemoveProductLinkMethod = getRemoveProductLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v14.services.RemoveProductLinkRequest, com.google.ads.googleads.v14.services.RemoveProductLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveProductLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.RemoveProductLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.RemoveProductLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductLinkServiceMethodDescriptorSupplier("RemoveProductLink"))
              .build();
        }
      }
    }
    return getRemoveProductLinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductLinkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductLinkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductLinkServiceStub>() {
        @java.lang.Override
        public ProductLinkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductLinkServiceStub(channel, callOptions);
        }
      };
    return ProductLinkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductLinkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductLinkServiceBlockingStub>() {
        @java.lang.Override
        public ProductLinkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductLinkServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductLinkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductLinkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductLinkServiceFutureStub>() {
        @java.lang.Override
        public ProductLinkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductLinkServiceFutureStub(channel, callOptions);
        }
      };
    return ProductLinkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service allows management of links between  a Google
   * Ads customer and another product.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates a product link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void createProductLink(com.google.ads.googleads.v14.services.CreateProductLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.CreateProductLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProductLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a product link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void removeProductLink(com.google.ads.googleads.v14.services.RemoveProductLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.RemoveProductLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveProductLinkMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductLinkService.
   * <pre>
   * This service allows management of links between  a Google
   * Ads customer and another product.
   * </pre>
   */
  public static abstract class ProductLinkServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductLinkServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductLinkService.
   * <pre>
   * This service allows management of links between  a Google
   * Ads customer and another product.
   * </pre>
   */
  public static final class ProductLinkServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductLinkServiceStub> {
    private ProductLinkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductLinkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a product link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void createProductLink(com.google.ads.googleads.v14.services.CreateProductLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.CreateProductLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProductLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a product link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void removeProductLink(com.google.ads.googleads.v14.services.RemoveProductLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.RemoveProductLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveProductLinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductLinkService.
   * <pre>
   * This service allows management of links between  a Google
   * Ads customer and another product.
   * </pre>
   */
  public static final class ProductLinkServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductLinkServiceBlockingStub> {
    private ProductLinkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductLinkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a product link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v14.services.CreateProductLinkResponse createProductLink(com.google.ads.googleads.v14.services.CreateProductLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProductLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a product link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v14.services.RemoveProductLinkResponse removeProductLink(com.google.ads.googleads.v14.services.RemoveProductLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveProductLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductLinkService.
   * <pre>
   * This service allows management of links between  a Google
   * Ads customer and another product.
   * </pre>
   */
  public static final class ProductLinkServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductLinkServiceFutureStub> {
    private ProductLinkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductLinkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a product link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v14.services.CreateProductLinkResponse> createProductLink(
        com.google.ads.googleads.v14.services.CreateProductLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProductLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a product link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v14.services.RemoveProductLinkResponse> removeProductLink(
        com.google.ads.googleads.v14.services.RemoveProductLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveProductLinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCT_LINK = 0;
  private static final int METHODID_REMOVE_PRODUCT_LINK = 1;

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
        case METHODID_CREATE_PRODUCT_LINK:
          serviceImpl.createProductLink((com.google.ads.googleads.v14.services.CreateProductLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.CreateProductLinkResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PRODUCT_LINK:
          serviceImpl.removeProductLink((com.google.ads.googleads.v14.services.RemoveProductLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.RemoveProductLinkResponse>) responseObserver);
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
          getCreateProductLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v14.services.CreateProductLinkRequest,
              com.google.ads.googleads.v14.services.CreateProductLinkResponse>(
                service, METHODID_CREATE_PRODUCT_LINK)))
        .addMethod(
          getRemoveProductLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v14.services.RemoveProductLinkRequest,
              com.google.ads.googleads.v14.services.RemoveProductLinkResponse>(
                service, METHODID_REMOVE_PRODUCT_LINK)))
        .build();
  }

  private static abstract class ProductLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v14.services.ProductLinkServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductLinkService");
    }
  }

  private static final class ProductLinkServiceFileDescriptorSupplier
      extends ProductLinkServiceBaseDescriptorSupplier {
    ProductLinkServiceFileDescriptorSupplier() {}
  }

  private static final class ProductLinkServiceMethodDescriptorSupplier
      extends ProductLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductLinkServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProductLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductLinkServiceFileDescriptorSupplier())
              .addMethod(getCreateProductLinkMethod())
              .addMethod(getRemoveProductLinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
