package com.google.ads.googleads.v20.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service allows management of product link invitations from Google Ads
 * accounts to other accounts.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v20/services/product_link_invitation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductLinkInvitationServiceGrpc {

  private ProductLinkInvitationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v20.services.ProductLinkInvitationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.CreateProductLinkInvitationRequest,
      com.google.ads.googleads.v20.services.CreateProductLinkInvitationResponse> getCreateProductLinkInvitationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProductLinkInvitation",
      requestType = com.google.ads.googleads.v20.services.CreateProductLinkInvitationRequest.class,
      responseType = com.google.ads.googleads.v20.services.CreateProductLinkInvitationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.CreateProductLinkInvitationRequest,
      com.google.ads.googleads.v20.services.CreateProductLinkInvitationResponse> getCreateProductLinkInvitationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.CreateProductLinkInvitationRequest, com.google.ads.googleads.v20.services.CreateProductLinkInvitationResponse> getCreateProductLinkInvitationMethod;
    if ((getCreateProductLinkInvitationMethod = ProductLinkInvitationServiceGrpc.getCreateProductLinkInvitationMethod) == null) {
      synchronized (ProductLinkInvitationServiceGrpc.class) {
        if ((getCreateProductLinkInvitationMethod = ProductLinkInvitationServiceGrpc.getCreateProductLinkInvitationMethod) == null) {
          ProductLinkInvitationServiceGrpc.getCreateProductLinkInvitationMethod = getCreateProductLinkInvitationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v20.services.CreateProductLinkInvitationRequest, com.google.ads.googleads.v20.services.CreateProductLinkInvitationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProductLinkInvitation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.CreateProductLinkInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.CreateProductLinkInvitationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductLinkInvitationServiceMethodDescriptorSupplier("CreateProductLinkInvitation"))
              .build();
        }
      }
    }
    return getCreateProductLinkInvitationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.UpdateProductLinkInvitationRequest,
      com.google.ads.googleads.v20.services.UpdateProductLinkInvitationResponse> getUpdateProductLinkInvitationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProductLinkInvitation",
      requestType = com.google.ads.googleads.v20.services.UpdateProductLinkInvitationRequest.class,
      responseType = com.google.ads.googleads.v20.services.UpdateProductLinkInvitationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.UpdateProductLinkInvitationRequest,
      com.google.ads.googleads.v20.services.UpdateProductLinkInvitationResponse> getUpdateProductLinkInvitationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.UpdateProductLinkInvitationRequest, com.google.ads.googleads.v20.services.UpdateProductLinkInvitationResponse> getUpdateProductLinkInvitationMethod;
    if ((getUpdateProductLinkInvitationMethod = ProductLinkInvitationServiceGrpc.getUpdateProductLinkInvitationMethod) == null) {
      synchronized (ProductLinkInvitationServiceGrpc.class) {
        if ((getUpdateProductLinkInvitationMethod = ProductLinkInvitationServiceGrpc.getUpdateProductLinkInvitationMethod) == null) {
          ProductLinkInvitationServiceGrpc.getUpdateProductLinkInvitationMethod = getUpdateProductLinkInvitationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v20.services.UpdateProductLinkInvitationRequest, com.google.ads.googleads.v20.services.UpdateProductLinkInvitationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProductLinkInvitation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.UpdateProductLinkInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.UpdateProductLinkInvitationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductLinkInvitationServiceMethodDescriptorSupplier("UpdateProductLinkInvitation"))
              .build();
        }
      }
    }
    return getUpdateProductLinkInvitationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.RemoveProductLinkInvitationRequest,
      com.google.ads.googleads.v20.services.RemoveProductLinkInvitationResponse> getRemoveProductLinkInvitationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveProductLinkInvitation",
      requestType = com.google.ads.googleads.v20.services.RemoveProductLinkInvitationRequest.class,
      responseType = com.google.ads.googleads.v20.services.RemoveProductLinkInvitationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.RemoveProductLinkInvitationRequest,
      com.google.ads.googleads.v20.services.RemoveProductLinkInvitationResponse> getRemoveProductLinkInvitationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.RemoveProductLinkInvitationRequest, com.google.ads.googleads.v20.services.RemoveProductLinkInvitationResponse> getRemoveProductLinkInvitationMethod;
    if ((getRemoveProductLinkInvitationMethod = ProductLinkInvitationServiceGrpc.getRemoveProductLinkInvitationMethod) == null) {
      synchronized (ProductLinkInvitationServiceGrpc.class) {
        if ((getRemoveProductLinkInvitationMethod = ProductLinkInvitationServiceGrpc.getRemoveProductLinkInvitationMethod) == null) {
          ProductLinkInvitationServiceGrpc.getRemoveProductLinkInvitationMethod = getRemoveProductLinkInvitationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v20.services.RemoveProductLinkInvitationRequest, com.google.ads.googleads.v20.services.RemoveProductLinkInvitationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveProductLinkInvitation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.RemoveProductLinkInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.RemoveProductLinkInvitationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductLinkInvitationServiceMethodDescriptorSupplier("RemoveProductLinkInvitation"))
              .build();
        }
      }
    }
    return getRemoveProductLinkInvitationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductLinkInvitationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductLinkInvitationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductLinkInvitationServiceStub>() {
        @java.lang.Override
        public ProductLinkInvitationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductLinkInvitationServiceStub(channel, callOptions);
        }
      };
    return ProductLinkInvitationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ProductLinkInvitationServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductLinkInvitationServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductLinkInvitationServiceBlockingV2Stub>() {
        @java.lang.Override
        public ProductLinkInvitationServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductLinkInvitationServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ProductLinkInvitationServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductLinkInvitationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductLinkInvitationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductLinkInvitationServiceBlockingStub>() {
        @java.lang.Override
        public ProductLinkInvitationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductLinkInvitationServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductLinkInvitationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductLinkInvitationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductLinkInvitationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductLinkInvitationServiceFutureStub>() {
        @java.lang.Override
        public ProductLinkInvitationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductLinkInvitationServiceFutureStub(channel, callOptions);
        }
      };
    return ProductLinkInvitationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service allows management of product link invitations from Google Ads
   * accounts to other accounts.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates a product link invitation.
     * </pre>
     */
    default void createProductLinkInvitation(com.google.ads.googleads.v20.services.CreateProductLinkInvitationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.CreateProductLinkInvitationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProductLinkInvitationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a product link invitation.
     * </pre>
     */
    default void updateProductLinkInvitation(com.google.ads.googleads.v20.services.UpdateProductLinkInvitationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.UpdateProductLinkInvitationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductLinkInvitationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove a product link invitation.
     * </pre>
     */
    default void removeProductLinkInvitation(com.google.ads.googleads.v20.services.RemoveProductLinkInvitationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.RemoveProductLinkInvitationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveProductLinkInvitationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductLinkInvitationService.
   * <pre>
   * This service allows management of product link invitations from Google Ads
   * accounts to other accounts.
   * </pre>
   */
  public static abstract class ProductLinkInvitationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductLinkInvitationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductLinkInvitationService.
   * <pre>
   * This service allows management of product link invitations from Google Ads
   * accounts to other accounts.
   * </pre>
   */
  public static final class ProductLinkInvitationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductLinkInvitationServiceStub> {
    private ProductLinkInvitationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductLinkInvitationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductLinkInvitationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a product link invitation.
     * </pre>
     */
    public void createProductLinkInvitation(com.google.ads.googleads.v20.services.CreateProductLinkInvitationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.CreateProductLinkInvitationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProductLinkInvitationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a product link invitation.
     * </pre>
     */
    public void updateProductLinkInvitation(com.google.ads.googleads.v20.services.UpdateProductLinkInvitationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.UpdateProductLinkInvitationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductLinkInvitationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove a product link invitation.
     * </pre>
     */
    public void removeProductLinkInvitation(com.google.ads.googleads.v20.services.RemoveProductLinkInvitationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.RemoveProductLinkInvitationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveProductLinkInvitationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductLinkInvitationService.
   * <pre>
   * This service allows management of product link invitations from Google Ads
   * accounts to other accounts.
   * </pre>
   */
  public static final class ProductLinkInvitationServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProductLinkInvitationServiceBlockingV2Stub> {
    private ProductLinkInvitationServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductLinkInvitationServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductLinkInvitationServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a product link invitation.
     * </pre>
     */
    public com.google.ads.googleads.v20.services.CreateProductLinkInvitationResponse createProductLinkInvitation(com.google.ads.googleads.v20.services.CreateProductLinkInvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProductLinkInvitationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a product link invitation.
     * </pre>
     */
    public com.google.ads.googleads.v20.services.UpdateProductLinkInvitationResponse updateProductLinkInvitation(com.google.ads.googleads.v20.services.UpdateProductLinkInvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductLinkInvitationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove a product link invitation.
     * </pre>
     */
    public com.google.ads.googleads.v20.services.RemoveProductLinkInvitationResponse removeProductLinkInvitation(com.google.ads.googleads.v20.services.RemoveProductLinkInvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveProductLinkInvitationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ProductLinkInvitationService.
   * <pre>
   * This service allows management of product link invitations from Google Ads
   * accounts to other accounts.
   * </pre>
   */
  public static final class ProductLinkInvitationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductLinkInvitationServiceBlockingStub> {
    private ProductLinkInvitationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductLinkInvitationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductLinkInvitationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a product link invitation.
     * </pre>
     */
    public com.google.ads.googleads.v20.services.CreateProductLinkInvitationResponse createProductLinkInvitation(com.google.ads.googleads.v20.services.CreateProductLinkInvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProductLinkInvitationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a product link invitation.
     * </pre>
     */
    public com.google.ads.googleads.v20.services.UpdateProductLinkInvitationResponse updateProductLinkInvitation(com.google.ads.googleads.v20.services.UpdateProductLinkInvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductLinkInvitationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove a product link invitation.
     * </pre>
     */
    public com.google.ads.googleads.v20.services.RemoveProductLinkInvitationResponse removeProductLinkInvitation(com.google.ads.googleads.v20.services.RemoveProductLinkInvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveProductLinkInvitationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductLinkInvitationService.
   * <pre>
   * This service allows management of product link invitations from Google Ads
   * accounts to other accounts.
   * </pre>
   */
  public static final class ProductLinkInvitationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductLinkInvitationServiceFutureStub> {
    private ProductLinkInvitationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductLinkInvitationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductLinkInvitationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a product link invitation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v20.services.CreateProductLinkInvitationResponse> createProductLinkInvitation(
        com.google.ads.googleads.v20.services.CreateProductLinkInvitationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProductLinkInvitationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a product link invitation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v20.services.UpdateProductLinkInvitationResponse> updateProductLinkInvitation(
        com.google.ads.googleads.v20.services.UpdateProductLinkInvitationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductLinkInvitationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove a product link invitation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v20.services.RemoveProductLinkInvitationResponse> removeProductLinkInvitation(
        com.google.ads.googleads.v20.services.RemoveProductLinkInvitationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveProductLinkInvitationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCT_LINK_INVITATION = 0;
  private static final int METHODID_UPDATE_PRODUCT_LINK_INVITATION = 1;
  private static final int METHODID_REMOVE_PRODUCT_LINK_INVITATION = 2;

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
        case METHODID_CREATE_PRODUCT_LINK_INVITATION:
          serviceImpl.createProductLinkInvitation((com.google.ads.googleads.v20.services.CreateProductLinkInvitationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.CreateProductLinkInvitationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT_LINK_INVITATION:
          serviceImpl.updateProductLinkInvitation((com.google.ads.googleads.v20.services.UpdateProductLinkInvitationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.UpdateProductLinkInvitationResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PRODUCT_LINK_INVITATION:
          serviceImpl.removeProductLinkInvitation((com.google.ads.googleads.v20.services.RemoveProductLinkInvitationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.RemoveProductLinkInvitationResponse>) responseObserver);
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
          getCreateProductLinkInvitationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v20.services.CreateProductLinkInvitationRequest,
              com.google.ads.googleads.v20.services.CreateProductLinkInvitationResponse>(
                service, METHODID_CREATE_PRODUCT_LINK_INVITATION)))
        .addMethod(
          getUpdateProductLinkInvitationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v20.services.UpdateProductLinkInvitationRequest,
              com.google.ads.googleads.v20.services.UpdateProductLinkInvitationResponse>(
                service, METHODID_UPDATE_PRODUCT_LINK_INVITATION)))
        .addMethod(
          getRemoveProductLinkInvitationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v20.services.RemoveProductLinkInvitationRequest,
              com.google.ads.googleads.v20.services.RemoveProductLinkInvitationResponse>(
                service, METHODID_REMOVE_PRODUCT_LINK_INVITATION)))
        .build();
  }

  private static abstract class ProductLinkInvitationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductLinkInvitationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v20.services.ProductLinkInvitationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductLinkInvitationService");
    }
  }

  private static final class ProductLinkInvitationServiceFileDescriptorSupplier
      extends ProductLinkInvitationServiceBaseDescriptorSupplier {
    ProductLinkInvitationServiceFileDescriptorSupplier() {}
  }

  private static final class ProductLinkInvitationServiceMethodDescriptorSupplier
      extends ProductLinkInvitationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductLinkInvitationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProductLinkInvitationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductLinkInvitationServiceFileDescriptorSupplier())
              .addMethod(getCreateProductLinkInvitationMethod())
              .addMethod(getUpdateProductLinkInvitationMethod())
              .addMethod(getRemoveProductLinkInvitationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
