package com.google.ads.googleads.v1.services;

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
 * Service to fetch Product Bidding Categories.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v1/services/product_bidding_category_constant_service.proto")
public final class ProductBiddingCategoryConstantServiceGrpc {

  private ProductBiddingCategoryConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.ProductBiddingCategoryConstantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetProductBiddingCategoryConstantRequest,
      com.google.ads.googleads.v1.resources.ProductBiddingCategoryConstant> getGetProductBiddingCategoryConstantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductBiddingCategoryConstant",
      requestType = com.google.ads.googleads.v1.services.GetProductBiddingCategoryConstantRequest.class,
      responseType = com.google.ads.googleads.v1.resources.ProductBiddingCategoryConstant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetProductBiddingCategoryConstantRequest,
      com.google.ads.googleads.v1.resources.ProductBiddingCategoryConstant> getGetProductBiddingCategoryConstantMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetProductBiddingCategoryConstantRequest, com.google.ads.googleads.v1.resources.ProductBiddingCategoryConstant> getGetProductBiddingCategoryConstantMethod;
    if ((getGetProductBiddingCategoryConstantMethod = ProductBiddingCategoryConstantServiceGrpc.getGetProductBiddingCategoryConstantMethod) == null) {
      synchronized (ProductBiddingCategoryConstantServiceGrpc.class) {
        if ((getGetProductBiddingCategoryConstantMethod = ProductBiddingCategoryConstantServiceGrpc.getGetProductBiddingCategoryConstantMethod) == null) {
          ProductBiddingCategoryConstantServiceGrpc.getGetProductBiddingCategoryConstantMethod = getGetProductBiddingCategoryConstantMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetProductBiddingCategoryConstantRequest, com.google.ads.googleads.v1.resources.ProductBiddingCategoryConstant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductBiddingCategoryConstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetProductBiddingCategoryConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.ProductBiddingCategoryConstant.getDefaultInstance()))
              .setSchemaDescriptor(new ProductBiddingCategoryConstantServiceMethodDescriptorSupplier("GetProductBiddingCategoryConstant"))
              .build();
        }
      }
    }
    return getGetProductBiddingCategoryConstantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductBiddingCategoryConstantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductBiddingCategoryConstantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductBiddingCategoryConstantServiceStub>() {
        @java.lang.Override
        public ProductBiddingCategoryConstantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductBiddingCategoryConstantServiceStub(channel, callOptions);
        }
      };
    return ProductBiddingCategoryConstantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductBiddingCategoryConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductBiddingCategoryConstantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductBiddingCategoryConstantServiceBlockingStub>() {
        @java.lang.Override
        public ProductBiddingCategoryConstantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductBiddingCategoryConstantServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductBiddingCategoryConstantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductBiddingCategoryConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductBiddingCategoryConstantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductBiddingCategoryConstantServiceFutureStub>() {
        @java.lang.Override
        public ProductBiddingCategoryConstantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductBiddingCategoryConstantServiceFutureStub(channel, callOptions);
        }
      };
    return ProductBiddingCategoryConstantServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch Product Bidding Categories.
   * </pre>
   */
  public static abstract class ProductBiddingCategoryConstantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Product Bidding Category in full detail.
     * </pre>
     */
    public void getProductBiddingCategoryConstant(com.google.ads.googleads.v1.services.GetProductBiddingCategoryConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.ProductBiddingCategoryConstant> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductBiddingCategoryConstantMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductBiddingCategoryConstantMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetProductBiddingCategoryConstantRequest,
                com.google.ads.googleads.v1.resources.ProductBiddingCategoryConstant>(
                  this, METHODID_GET_PRODUCT_BIDDING_CATEGORY_CONSTANT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch Product Bidding Categories.
   * </pre>
   */
  public static final class ProductBiddingCategoryConstantServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductBiddingCategoryConstantServiceStub> {
    private ProductBiddingCategoryConstantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductBiddingCategoryConstantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductBiddingCategoryConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Product Bidding Category in full detail.
     * </pre>
     */
    public void getProductBiddingCategoryConstant(com.google.ads.googleads.v1.services.GetProductBiddingCategoryConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.ProductBiddingCategoryConstant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductBiddingCategoryConstantMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch Product Bidding Categories.
   * </pre>
   */
  public static final class ProductBiddingCategoryConstantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductBiddingCategoryConstantServiceBlockingStub> {
    private ProductBiddingCategoryConstantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductBiddingCategoryConstantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductBiddingCategoryConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Product Bidding Category in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.ProductBiddingCategoryConstant getProductBiddingCategoryConstant(com.google.ads.googleads.v1.services.GetProductBiddingCategoryConstantRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProductBiddingCategoryConstantMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch Product Bidding Categories.
   * </pre>
   */
  public static final class ProductBiddingCategoryConstantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductBiddingCategoryConstantServiceFutureStub> {
    private ProductBiddingCategoryConstantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductBiddingCategoryConstantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductBiddingCategoryConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Product Bidding Category in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.ProductBiddingCategoryConstant> getProductBiddingCategoryConstant(
        com.google.ads.googleads.v1.services.GetProductBiddingCategoryConstantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductBiddingCategoryConstantMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT_BIDDING_CATEGORY_CONSTANT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductBiddingCategoryConstantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductBiddingCategoryConstantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT_BIDDING_CATEGORY_CONSTANT:
          serviceImpl.getProductBiddingCategoryConstant((com.google.ads.googleads.v1.services.GetProductBiddingCategoryConstantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.ProductBiddingCategoryConstant>) responseObserver);
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

  private static abstract class ProductBiddingCategoryConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductBiddingCategoryConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.ProductBiddingCategoryConstantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductBiddingCategoryConstantService");
    }
  }

  private static final class ProductBiddingCategoryConstantServiceFileDescriptorSupplier
      extends ProductBiddingCategoryConstantServiceBaseDescriptorSupplier {
    ProductBiddingCategoryConstantServiceFileDescriptorSupplier() {}
  }

  private static final class ProductBiddingCategoryConstantServiceMethodDescriptorSupplier
      extends ProductBiddingCategoryConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductBiddingCategoryConstantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductBiddingCategoryConstantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductBiddingCategoryConstantServiceFileDescriptorSupplier())
              .addMethod(getGetProductBiddingCategoryConstantMethod())
              .build();
        }
      }
    }
    return result;
  }
}
