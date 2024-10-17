package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service will suggest brands based on a prefix.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/brand_suggestion_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BrandSuggestionServiceGrpc {

  private BrandSuggestionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.BrandSuggestionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.SuggestBrandsRequest,
      com.google.ads.googleads.v18.services.SuggestBrandsResponse> getSuggestBrandsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestBrands",
      requestType = com.google.ads.googleads.v18.services.SuggestBrandsRequest.class,
      responseType = com.google.ads.googleads.v18.services.SuggestBrandsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.SuggestBrandsRequest,
      com.google.ads.googleads.v18.services.SuggestBrandsResponse> getSuggestBrandsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.SuggestBrandsRequest, com.google.ads.googleads.v18.services.SuggestBrandsResponse> getSuggestBrandsMethod;
    if ((getSuggestBrandsMethod = BrandSuggestionServiceGrpc.getSuggestBrandsMethod) == null) {
      synchronized (BrandSuggestionServiceGrpc.class) {
        if ((getSuggestBrandsMethod = BrandSuggestionServiceGrpc.getSuggestBrandsMethod) == null) {
          BrandSuggestionServiceGrpc.getSuggestBrandsMethod = getSuggestBrandsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.SuggestBrandsRequest, com.google.ads.googleads.v18.services.SuggestBrandsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuggestBrands"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.SuggestBrandsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.SuggestBrandsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BrandSuggestionServiceMethodDescriptorSupplier("SuggestBrands"))
              .build();
        }
      }
    }
    return getSuggestBrandsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BrandSuggestionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrandSuggestionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrandSuggestionServiceStub>() {
        @java.lang.Override
        public BrandSuggestionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrandSuggestionServiceStub(channel, callOptions);
        }
      };
    return BrandSuggestionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BrandSuggestionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrandSuggestionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrandSuggestionServiceBlockingStub>() {
        @java.lang.Override
        public BrandSuggestionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrandSuggestionServiceBlockingStub(channel, callOptions);
        }
      };
    return BrandSuggestionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BrandSuggestionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrandSuggestionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrandSuggestionServiceFutureStub>() {
        @java.lang.Override
        public BrandSuggestionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrandSuggestionServiceFutureStub(channel, callOptions);
        }
      };
    return BrandSuggestionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service will suggest brands based on a prefix.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Rpc to return a list of matching brands based on a prefix for this
     * customer.
     * </pre>
     */
    default void suggestBrands(com.google.ads.googleads.v18.services.SuggestBrandsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.SuggestBrandsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestBrandsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BrandSuggestionService.
   * <pre>
   * This service will suggest brands based on a prefix.
   * </pre>
   */
  public static abstract class BrandSuggestionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BrandSuggestionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BrandSuggestionService.
   * <pre>
   * This service will suggest brands based on a prefix.
   * </pre>
   */
  public static final class BrandSuggestionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BrandSuggestionServiceStub> {
    private BrandSuggestionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrandSuggestionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrandSuggestionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Rpc to return a list of matching brands based on a prefix for this
     * customer.
     * </pre>
     */
    public void suggestBrands(com.google.ads.googleads.v18.services.SuggestBrandsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.SuggestBrandsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestBrandsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BrandSuggestionService.
   * <pre>
   * This service will suggest brands based on a prefix.
   * </pre>
   */
  public static final class BrandSuggestionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BrandSuggestionServiceBlockingStub> {
    private BrandSuggestionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrandSuggestionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrandSuggestionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Rpc to return a list of matching brands based on a prefix for this
     * customer.
     * </pre>
     */
    public com.google.ads.googleads.v18.services.SuggestBrandsResponse suggestBrands(com.google.ads.googleads.v18.services.SuggestBrandsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestBrandsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BrandSuggestionService.
   * <pre>
   * This service will suggest brands based on a prefix.
   * </pre>
   */
  public static final class BrandSuggestionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BrandSuggestionServiceFutureStub> {
    private BrandSuggestionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrandSuggestionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrandSuggestionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Rpc to return a list of matching brands based on a prefix for this
     * customer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.SuggestBrandsResponse> suggestBrands(
        com.google.ads.googleads.v18.services.SuggestBrandsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestBrandsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUGGEST_BRANDS = 0;

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
        case METHODID_SUGGEST_BRANDS:
          serviceImpl.suggestBrands((com.google.ads.googleads.v18.services.SuggestBrandsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.SuggestBrandsResponse>) responseObserver);
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
          getSuggestBrandsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.SuggestBrandsRequest,
              com.google.ads.googleads.v18.services.SuggestBrandsResponse>(
                service, METHODID_SUGGEST_BRANDS)))
        .build();
  }

  private static abstract class BrandSuggestionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BrandSuggestionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.BrandSuggestionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BrandSuggestionService");
    }
  }

  private static final class BrandSuggestionServiceFileDescriptorSupplier
      extends BrandSuggestionServiceBaseDescriptorSupplier {
    BrandSuggestionServiceFileDescriptorSupplier() {}
  }

  private static final class BrandSuggestionServiceMethodDescriptorSupplier
      extends BrandSuggestionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BrandSuggestionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BrandSuggestionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BrandSuggestionServiceFileDescriptorSupplier())
              .addMethod(getSuggestBrandsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
