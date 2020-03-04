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
 * Service to manage feed mappings.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/feed_mapping_service.proto")
public final class FeedMappingServiceGrpc {

  private FeedMappingServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.FeedMappingService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetFeedMappingMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetFeedMappingRequest,
      com.google.ads.googleads.v3.resources.FeedMapping> METHOD_GET_FEED_MAPPING = getGetFeedMappingMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetFeedMappingRequest,
      com.google.ads.googleads.v3.resources.FeedMapping> getGetFeedMappingMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetFeedMappingRequest,
      com.google.ads.googleads.v3.resources.FeedMapping> getGetFeedMappingMethod() {
    return getGetFeedMappingMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetFeedMappingRequest,
      com.google.ads.googleads.v3.resources.FeedMapping> getGetFeedMappingMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetFeedMappingRequest, com.google.ads.googleads.v3.resources.FeedMapping> getGetFeedMappingMethod;
    if ((getGetFeedMappingMethod = FeedMappingServiceGrpc.getGetFeedMappingMethod) == null) {
      synchronized (FeedMappingServiceGrpc.class) {
        if ((getGetFeedMappingMethod = FeedMappingServiceGrpc.getGetFeedMappingMethod) == null) {
          FeedMappingServiceGrpc.getGetFeedMappingMethod = getGetFeedMappingMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetFeedMappingRequest, com.google.ads.googleads.v3.resources.FeedMapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.FeedMappingService", "GetFeedMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetFeedMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.FeedMapping.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedMappingServiceMethodDescriptorSupplier("GetFeedMapping"))
                  .build();
          }
        }
     }
     return getGetFeedMappingMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateFeedMappingsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateFeedMappingsRequest,
      com.google.ads.googleads.v3.services.MutateFeedMappingsResponse> METHOD_MUTATE_FEED_MAPPINGS = getMutateFeedMappingsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateFeedMappingsRequest,
      com.google.ads.googleads.v3.services.MutateFeedMappingsResponse> getMutateFeedMappingsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateFeedMappingsRequest,
      com.google.ads.googleads.v3.services.MutateFeedMappingsResponse> getMutateFeedMappingsMethod() {
    return getMutateFeedMappingsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateFeedMappingsRequest,
      com.google.ads.googleads.v3.services.MutateFeedMappingsResponse> getMutateFeedMappingsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateFeedMappingsRequest, com.google.ads.googleads.v3.services.MutateFeedMappingsResponse> getMutateFeedMappingsMethod;
    if ((getMutateFeedMappingsMethod = FeedMappingServiceGrpc.getMutateFeedMappingsMethod) == null) {
      synchronized (FeedMappingServiceGrpc.class) {
        if ((getMutateFeedMappingsMethod = FeedMappingServiceGrpc.getMutateFeedMappingsMethod) == null) {
          FeedMappingServiceGrpc.getMutateFeedMappingsMethod = getMutateFeedMappingsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.MutateFeedMappingsRequest, com.google.ads.googleads.v3.services.MutateFeedMappingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.FeedMappingService", "MutateFeedMappings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateFeedMappingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateFeedMappingsResponse.getDefaultInstance()))
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
    return new FeedMappingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedMappingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FeedMappingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedMappingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FeedMappingServiceFutureStub(channel);
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
    public void getFeedMapping(com.google.ads.googleads.v3.services.GetFeedMappingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.FeedMapping> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeedMappingMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates or removes feed mappings. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateFeedMappings(com.google.ads.googleads.v3.services.MutateFeedMappingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateFeedMappingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateFeedMappingsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeedMappingMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetFeedMappingRequest,
                com.google.ads.googleads.v3.resources.FeedMapping>(
                  this, METHODID_GET_FEED_MAPPING)))
          .addMethod(
            getMutateFeedMappingsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.MutateFeedMappingsRequest,
                com.google.ads.googleads.v3.services.MutateFeedMappingsResponse>(
                  this, METHODID_MUTATE_FEED_MAPPINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage feed mappings.
   * </pre>
   */
  public static final class FeedMappingServiceStub extends io.grpc.stub.AbstractStub<FeedMappingServiceStub> {
    private FeedMappingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedMappingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedMappingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedMappingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed mapping in full detail.
     * </pre>
     */
    public void getFeedMapping(com.google.ads.googleads.v3.services.GetFeedMappingRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.FeedMapping> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeedMappingMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or removes feed mappings. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateFeedMappings(com.google.ads.googleads.v3.services.MutateFeedMappingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateFeedMappingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateFeedMappingsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage feed mappings.
   * </pre>
   */
  public static final class FeedMappingServiceBlockingStub extends io.grpc.stub.AbstractStub<FeedMappingServiceBlockingStub> {
    private FeedMappingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedMappingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedMappingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedMappingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed mapping in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.FeedMapping getFeedMapping(com.google.ads.googleads.v3.services.GetFeedMappingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFeedMappingMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or removes feed mappings. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.MutateFeedMappingsResponse mutateFeedMappings(com.google.ads.googleads.v3.services.MutateFeedMappingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateFeedMappingsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage feed mappings.
   * </pre>
   */
  public static final class FeedMappingServiceFutureStub extends io.grpc.stub.AbstractStub<FeedMappingServiceFutureStub> {
    private FeedMappingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedMappingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedMappingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedMappingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed mapping in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.FeedMapping> getFeedMapping(
        com.google.ads.googleads.v3.services.GetFeedMappingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeedMappingMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or removes feed mappings. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.MutateFeedMappingsResponse> mutateFeedMappings(
        com.google.ads.googleads.v3.services.MutateFeedMappingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateFeedMappingsMethodHelper(), getCallOptions()), request);
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
          serviceImpl.getFeedMapping((com.google.ads.googleads.v3.services.GetFeedMappingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.FeedMapping>) responseObserver);
          break;
        case METHODID_MUTATE_FEED_MAPPINGS:
          serviceImpl.mutateFeedMappings((com.google.ads.googleads.v3.services.MutateFeedMappingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateFeedMappingsResponse>) responseObserver);
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
      return com.google.ads.googleads.v3.services.FeedMappingServiceProto.getDescriptor();
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
              .addMethod(getGetFeedMappingMethodHelper())
              .addMethod(getMutateFeedMappingsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
