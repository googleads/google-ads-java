package com.google.ads.googleads.v6.services;

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
 * Service to manage feed mappings.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/feed_mapping_service.proto")
public final class FeedMappingServiceGrpc {

  private FeedMappingServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.FeedMappingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetFeedMappingRequest,
      com.google.ads.googleads.v6.resources.FeedMapping> getGetFeedMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeedMapping",
      requestType = com.google.ads.googleads.v6.services.GetFeedMappingRequest.class,
      responseType = com.google.ads.googleads.v6.resources.FeedMapping.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetFeedMappingRequest,
      com.google.ads.googleads.v6.resources.FeedMapping> getGetFeedMappingMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetFeedMappingRequest, com.google.ads.googleads.v6.resources.FeedMapping> getGetFeedMappingMethod;
    if ((getGetFeedMappingMethod = FeedMappingServiceGrpc.getGetFeedMappingMethod) == null) {
      synchronized (FeedMappingServiceGrpc.class) {
        if ((getGetFeedMappingMethod = FeedMappingServiceGrpc.getGetFeedMappingMethod) == null) {
          FeedMappingServiceGrpc.getGetFeedMappingMethod = getGetFeedMappingMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetFeedMappingRequest, com.google.ads.googleads.v6.resources.FeedMapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeedMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetFeedMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.FeedMapping.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMappingServiceMethodDescriptorSupplier("GetFeedMapping"))
              .build();
        }
      }
    }
    return getGetFeedMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateFeedMappingsRequest,
      com.google.ads.googleads.v6.services.MutateFeedMappingsResponse> getMutateFeedMappingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateFeedMappings",
      requestType = com.google.ads.googleads.v6.services.MutateFeedMappingsRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateFeedMappingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateFeedMappingsRequest,
      com.google.ads.googleads.v6.services.MutateFeedMappingsResponse> getMutateFeedMappingsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateFeedMappingsRequest, com.google.ads.googleads.v6.services.MutateFeedMappingsResponse> getMutateFeedMappingsMethod;
    if ((getMutateFeedMappingsMethod = FeedMappingServiceGrpc.getMutateFeedMappingsMethod) == null) {
      synchronized (FeedMappingServiceGrpc.class) {
        if ((getMutateFeedMappingsMethod = FeedMappingServiceGrpc.getMutateFeedMappingsMethod) == null) {
          FeedMappingServiceGrpc.getMutateFeedMappingsMethod = getMutateFeedMappingsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateFeedMappingsRequest, com.google.ads.googleads.v6.services.MutateFeedMappingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateFeedMappings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateFeedMappingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateFeedMappingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMappingServiceMethodDescriptorSupplier("MutateFeedMappings"))
              .build();
        }
      }
    }
    return getMutateFeedMappingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedMappingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedMappingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedMappingServiceStub>() {
        @java.lang.Override
        public FeedMappingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedMappingServiceStub(channel, callOptions);
        }
      };
    return FeedMappingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedMappingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedMappingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedMappingServiceBlockingStub>() {
        @java.lang.Override
        public FeedMappingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedMappingServiceBlockingStub(channel, callOptions);
        }
      };
    return FeedMappingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedMappingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedMappingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedMappingServiceFutureStub>() {
        @java.lang.Override
        public FeedMappingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedMappingServiceFutureStub(channel, callOptions);
        }
      };
    return FeedMappingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage feed mappings.
   * </pre>
   */
  public static abstract class FeedMappingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested feed mapping in full detail.
     * </pre>
     */
    public void getFeedMapping(com.google.ads.googleads.v6.services.GetFeedMappingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.FeedMapping> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeedMappingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or removes feed mappings. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateFeedMappings(com.google.ads.googleads.v6.services.MutateFeedMappingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateFeedMappingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateFeedMappingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeedMappingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetFeedMappingRequest,
                com.google.ads.googleads.v6.resources.FeedMapping>(
                  this, METHODID_GET_FEED_MAPPING)))
          .addMethod(
            getMutateFeedMappingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateFeedMappingsRequest,
                com.google.ads.googleads.v6.services.MutateFeedMappingsResponse>(
                  this, METHODID_MUTATE_FEED_MAPPINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage feed mappings.
   * </pre>
   */
  public static final class FeedMappingServiceStub extends io.grpc.stub.AbstractAsyncStub<FeedMappingServiceStub> {
    private FeedMappingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedMappingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedMappingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed mapping in full detail.
     * </pre>
     */
    public void getFeedMapping(com.google.ads.googleads.v6.services.GetFeedMappingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.FeedMapping> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeedMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or removes feed mappings. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateFeedMappings(com.google.ads.googleads.v6.services.MutateFeedMappingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateFeedMappingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateFeedMappingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage feed mappings.
   * </pre>
   */
  public static final class FeedMappingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FeedMappingServiceBlockingStub> {
    private FeedMappingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedMappingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedMappingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed mapping in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.FeedMapping getFeedMapping(com.google.ads.googleads.v6.services.GetFeedMappingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFeedMappingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or removes feed mappings. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateFeedMappingsResponse mutateFeedMappings(com.google.ads.googleads.v6.services.MutateFeedMappingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateFeedMappingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage feed mappings.
   * </pre>
   */
  public static final class FeedMappingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FeedMappingServiceFutureStub> {
    private FeedMappingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedMappingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedMappingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed mapping in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.FeedMapping> getFeedMapping(
        com.google.ads.googleads.v6.services.GetFeedMappingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeedMappingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or removes feed mappings. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateFeedMappingsResponse> mutateFeedMappings(
        com.google.ads.googleads.v6.services.MutateFeedMappingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateFeedMappingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEED_MAPPING = 0;
  private static final int METHODID_MUTATE_FEED_MAPPINGS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FeedMappingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FeedMappingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEED_MAPPING:
          serviceImpl.getFeedMapping((com.google.ads.googleads.v6.services.GetFeedMappingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.FeedMapping>) responseObserver);
          break;
        case METHODID_MUTATE_FEED_MAPPINGS:
          serviceImpl.mutateFeedMappings((com.google.ads.googleads.v6.services.MutateFeedMappingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateFeedMappingsResponse>) responseObserver);
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

  private static abstract class FeedMappingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedMappingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.FeedMappingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedMappingService");
    }
  }

  private static final class FeedMappingServiceFileDescriptorSupplier
      extends FeedMappingServiceBaseDescriptorSupplier {
    FeedMappingServiceFileDescriptorSupplier() {}
  }

  private static final class FeedMappingServiceMethodDescriptorSupplier
      extends FeedMappingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FeedMappingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FeedMappingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedMappingServiceFileDescriptorSupplier())
              .addMethod(getGetFeedMappingMethod())
              .addMethod(getMutateFeedMappingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
