package com.google.ads.googleads.v14.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to retrieve Travel asset suggestions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v14/services/travel_asset_suggestion_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TravelAssetSuggestionServiceGrpc {

  private TravelAssetSuggestionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v14.services.TravelAssetSuggestionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.SuggestTravelAssetsRequest,
      com.google.ads.googleads.v14.services.SuggestTravelAssetsResponse> getSuggestTravelAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestTravelAssets",
      requestType = com.google.ads.googleads.v14.services.SuggestTravelAssetsRequest.class,
      responseType = com.google.ads.googleads.v14.services.SuggestTravelAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.SuggestTravelAssetsRequest,
      com.google.ads.googleads.v14.services.SuggestTravelAssetsResponse> getSuggestTravelAssetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.SuggestTravelAssetsRequest, com.google.ads.googleads.v14.services.SuggestTravelAssetsResponse> getSuggestTravelAssetsMethod;
    if ((getSuggestTravelAssetsMethod = TravelAssetSuggestionServiceGrpc.getSuggestTravelAssetsMethod) == null) {
      synchronized (TravelAssetSuggestionServiceGrpc.class) {
        if ((getSuggestTravelAssetsMethod = TravelAssetSuggestionServiceGrpc.getSuggestTravelAssetsMethod) == null) {
          TravelAssetSuggestionServiceGrpc.getSuggestTravelAssetsMethod = getSuggestTravelAssetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v14.services.SuggestTravelAssetsRequest, com.google.ads.googleads.v14.services.SuggestTravelAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuggestTravelAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.SuggestTravelAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.SuggestTravelAssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TravelAssetSuggestionServiceMethodDescriptorSupplier("SuggestTravelAssets"))
              .build();
        }
      }
    }
    return getSuggestTravelAssetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TravelAssetSuggestionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TravelAssetSuggestionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TravelAssetSuggestionServiceStub>() {
        @java.lang.Override
        public TravelAssetSuggestionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TravelAssetSuggestionServiceStub(channel, callOptions);
        }
      };
    return TravelAssetSuggestionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TravelAssetSuggestionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TravelAssetSuggestionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TravelAssetSuggestionServiceBlockingStub>() {
        @java.lang.Override
        public TravelAssetSuggestionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TravelAssetSuggestionServiceBlockingStub(channel, callOptions);
        }
      };
    return TravelAssetSuggestionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TravelAssetSuggestionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TravelAssetSuggestionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TravelAssetSuggestionServiceFutureStub>() {
        @java.lang.Override
        public TravelAssetSuggestionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TravelAssetSuggestionServiceFutureStub(channel, callOptions);
        }
      };
    return TravelAssetSuggestionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to retrieve Travel asset suggestions.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns Travel Asset suggestions. Asset
     * suggestions are returned on a best-effort basis. There are no guarantees
     * that all possible asset types will be returned for any given hotel
     * property.
     * </pre>
     */
    default void suggestTravelAssets(com.google.ads.googleads.v14.services.SuggestTravelAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.SuggestTravelAssetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestTravelAssetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TravelAssetSuggestionService.
   * <pre>
   * Service to retrieve Travel asset suggestions.
   * </pre>
   */
  public static abstract class TravelAssetSuggestionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TravelAssetSuggestionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TravelAssetSuggestionService.
   * <pre>
   * Service to retrieve Travel asset suggestions.
   * </pre>
   */
  public static final class TravelAssetSuggestionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TravelAssetSuggestionServiceStub> {
    private TravelAssetSuggestionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TravelAssetSuggestionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TravelAssetSuggestionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns Travel Asset suggestions. Asset
     * suggestions are returned on a best-effort basis. There are no guarantees
     * that all possible asset types will be returned for any given hotel
     * property.
     * </pre>
     */
    public void suggestTravelAssets(com.google.ads.googleads.v14.services.SuggestTravelAssetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.SuggestTravelAssetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestTravelAssetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TravelAssetSuggestionService.
   * <pre>
   * Service to retrieve Travel asset suggestions.
   * </pre>
   */
  public static final class TravelAssetSuggestionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TravelAssetSuggestionServiceBlockingStub> {
    private TravelAssetSuggestionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TravelAssetSuggestionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TravelAssetSuggestionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns Travel Asset suggestions. Asset
     * suggestions are returned on a best-effort basis. There are no guarantees
     * that all possible asset types will be returned for any given hotel
     * property.
     * </pre>
     */
    public com.google.ads.googleads.v14.services.SuggestTravelAssetsResponse suggestTravelAssets(com.google.ads.googleads.v14.services.SuggestTravelAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestTravelAssetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TravelAssetSuggestionService.
   * <pre>
   * Service to retrieve Travel asset suggestions.
   * </pre>
   */
  public static final class TravelAssetSuggestionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TravelAssetSuggestionServiceFutureStub> {
    private TravelAssetSuggestionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TravelAssetSuggestionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TravelAssetSuggestionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns Travel Asset suggestions. Asset
     * suggestions are returned on a best-effort basis. There are no guarantees
     * that all possible asset types will be returned for any given hotel
     * property.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v14.services.SuggestTravelAssetsResponse> suggestTravelAssets(
        com.google.ads.googleads.v14.services.SuggestTravelAssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestTravelAssetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUGGEST_TRAVEL_ASSETS = 0;

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
        case METHODID_SUGGEST_TRAVEL_ASSETS:
          serviceImpl.suggestTravelAssets((com.google.ads.googleads.v14.services.SuggestTravelAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.SuggestTravelAssetsResponse>) responseObserver);
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
          getSuggestTravelAssetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v14.services.SuggestTravelAssetsRequest,
              com.google.ads.googleads.v14.services.SuggestTravelAssetsResponse>(
                service, METHODID_SUGGEST_TRAVEL_ASSETS)))
        .build();
  }

  private static abstract class TravelAssetSuggestionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TravelAssetSuggestionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v14.services.TravelAssetSuggestionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TravelAssetSuggestionService");
    }
  }

  private static final class TravelAssetSuggestionServiceFileDescriptorSupplier
      extends TravelAssetSuggestionServiceBaseDescriptorSupplier {
    TravelAssetSuggestionServiceFileDescriptorSupplier() {}
  }

  private static final class TravelAssetSuggestionServiceMethodDescriptorSupplier
      extends TravelAssetSuggestionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TravelAssetSuggestionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TravelAssetSuggestionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TravelAssetSuggestionServiceFileDescriptorSupplier())
              .addMethod(getSuggestTravelAssetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
