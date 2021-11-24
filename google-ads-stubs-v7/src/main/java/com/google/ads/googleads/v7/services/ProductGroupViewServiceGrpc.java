package com.google.ads.googleads.v7.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage product group views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v7/services/product_group_view_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductGroupViewServiceGrpc {

  private ProductGroupViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v7.services.ProductGroupViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetProductGroupViewRequest,
      com.google.ads.googleads.v7.resources.ProductGroupView> getGetProductGroupViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductGroupView",
      requestType = com.google.ads.googleads.v7.services.GetProductGroupViewRequest.class,
      responseType = com.google.ads.googleads.v7.resources.ProductGroupView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetProductGroupViewRequest,
      com.google.ads.googleads.v7.resources.ProductGroupView> getGetProductGroupViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetProductGroupViewRequest, com.google.ads.googleads.v7.resources.ProductGroupView> getGetProductGroupViewMethod;
    if ((getGetProductGroupViewMethod = ProductGroupViewServiceGrpc.getGetProductGroupViewMethod) == null) {
      synchronized (ProductGroupViewServiceGrpc.class) {
        if ((getGetProductGroupViewMethod = ProductGroupViewServiceGrpc.getGetProductGroupViewMethod) == null) {
          ProductGroupViewServiceGrpc.getGetProductGroupViewMethod = getGetProductGroupViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.GetProductGroupViewRequest, com.google.ads.googleads.v7.resources.ProductGroupView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductGroupView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.GetProductGroupViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.resources.ProductGroupView.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGroupViewServiceMethodDescriptorSupplier("GetProductGroupView"))
              .build();
        }
      }
    }
    return getGetProductGroupViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductGroupViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductGroupViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductGroupViewServiceStub>() {
        @java.lang.Override
        public ProductGroupViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductGroupViewServiceStub(channel, callOptions);
        }
      };
    return ProductGroupViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductGroupViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductGroupViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductGroupViewServiceBlockingStub>() {
        @java.lang.Override
        public ProductGroupViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductGroupViewServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductGroupViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductGroupViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductGroupViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductGroupViewServiceFutureStub>() {
        @java.lang.Override
        public ProductGroupViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductGroupViewServiceFutureStub(channel, callOptions);
        }
      };
    return ProductGroupViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage product group views.
   * </pre>
   */
  public static abstract class ProductGroupViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested product group view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getProductGroupView(com.google.ads.googleads.v7.services.GetProductGroupViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.ProductGroupView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductGroupViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductGroupViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.GetProductGroupViewRequest,
                com.google.ads.googleads.v7.resources.ProductGroupView>(
                  this, METHODID_GET_PRODUCT_GROUP_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage product group views.
   * </pre>
   */
  public static final class ProductGroupViewServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductGroupViewServiceStub> {
    private ProductGroupViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductGroupViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductGroupViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested product group view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getProductGroupView(com.google.ads.googleads.v7.services.GetProductGroupViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.ProductGroupView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductGroupViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage product group views.
   * </pre>
   */
  public static final class ProductGroupViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductGroupViewServiceBlockingStub> {
    private ProductGroupViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductGroupViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductGroupViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested product group view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.resources.ProductGroupView getProductGroupView(com.google.ads.googleads.v7.services.GetProductGroupViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductGroupViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage product group views.
   * </pre>
   */
  public static final class ProductGroupViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductGroupViewServiceFutureStub> {
    private ProductGroupViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductGroupViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductGroupViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested product group view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.resources.ProductGroupView> getProductGroupView(
        com.google.ads.googleads.v7.services.GetProductGroupViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductGroupViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT_GROUP_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductGroupViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductGroupViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT_GROUP_VIEW:
          serviceImpl.getProductGroupView((com.google.ads.googleads.v7.services.GetProductGroupViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.ProductGroupView>) responseObserver);
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

  private static abstract class ProductGroupViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductGroupViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v7.services.ProductGroupViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductGroupViewService");
    }
  }

  private static final class ProductGroupViewServiceFileDescriptorSupplier
      extends ProductGroupViewServiceBaseDescriptorSupplier {
    ProductGroupViewServiceFileDescriptorSupplier() {}
  }

  private static final class ProductGroupViewServiceMethodDescriptorSupplier
      extends ProductGroupViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductGroupViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductGroupViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductGroupViewServiceFileDescriptorSupplier())
              .addMethod(getGetProductGroupViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
