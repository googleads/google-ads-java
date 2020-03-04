package com.google.ads.googleads.v3.services;

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
 * Service to manage product group views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/product_group_view_service.proto")
public final class ProductGroupViewServiceGrpc {

  private ProductGroupViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.ProductGroupViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetProductGroupViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetProductGroupViewRequest,
      com.google.ads.googleads.v3.resources.ProductGroupView> METHOD_GET_PRODUCT_GROUP_VIEW = getGetProductGroupViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetProductGroupViewRequest,
      com.google.ads.googleads.v3.resources.ProductGroupView> getGetProductGroupViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetProductGroupViewRequest,
      com.google.ads.googleads.v3.resources.ProductGroupView> getGetProductGroupViewMethod() {
    return getGetProductGroupViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetProductGroupViewRequest,
      com.google.ads.googleads.v3.resources.ProductGroupView> getGetProductGroupViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetProductGroupViewRequest, com.google.ads.googleads.v3.resources.ProductGroupView> getGetProductGroupViewMethod;
    if ((getGetProductGroupViewMethod = ProductGroupViewServiceGrpc.getGetProductGroupViewMethod) == null) {
      synchronized (ProductGroupViewServiceGrpc.class) {
        if ((getGetProductGroupViewMethod = ProductGroupViewServiceGrpc.getGetProductGroupViewMethod) == null) {
          ProductGroupViewServiceGrpc.getGetProductGroupViewMethod = getGetProductGroupViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetProductGroupViewRequest, com.google.ads.googleads.v3.resources.ProductGroupView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.ProductGroupViewService", "GetProductGroupView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetProductGroupViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.ProductGroupView.getDefaultInstance()))
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
    return new ProductGroupViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductGroupViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductGroupViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductGroupViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductGroupViewServiceFutureStub(channel);
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
     * </pre>
     */
    public void getProductGroupView(com.google.ads.googleads.v3.services.GetProductGroupViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.ProductGroupView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductGroupViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductGroupViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetProductGroupViewRequest,
                com.google.ads.googleads.v3.resources.ProductGroupView>(
                  this, METHODID_GET_PRODUCT_GROUP_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage product group views.
   * </pre>
   */
  public static final class ProductGroupViewServiceStub extends io.grpc.stub.AbstractStub<ProductGroupViewServiceStub> {
    private ProductGroupViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductGroupViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductGroupViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductGroupViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested product group view in full detail.
     * </pre>
     */
    public void getProductGroupView(com.google.ads.googleads.v3.services.GetProductGroupViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.ProductGroupView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductGroupViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage product group views.
   * </pre>
   */
  public static final class ProductGroupViewServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductGroupViewServiceBlockingStub> {
    private ProductGroupViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductGroupViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductGroupViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductGroupViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested product group view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.ProductGroupView getProductGroupView(com.google.ads.googleads.v3.services.GetProductGroupViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProductGroupViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage product group views.
   * </pre>
   */
  public static final class ProductGroupViewServiceFutureStub extends io.grpc.stub.AbstractStub<ProductGroupViewServiceFutureStub> {
    private ProductGroupViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductGroupViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductGroupViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductGroupViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested product group view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.ProductGroupView> getProductGroupView(
        com.google.ads.googleads.v3.services.GetProductGroupViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductGroupViewMethodHelper(), getCallOptions()), request);
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
          serviceImpl.getProductGroupView((com.google.ads.googleads.v3.services.GetProductGroupViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.ProductGroupView>) responseObserver);
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
      return com.google.ads.googleads.v3.services.ProductGroupViewServiceProto.getDescriptor();
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
              .addMethod(getGetProductGroupViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
