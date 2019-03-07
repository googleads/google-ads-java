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
 * Service to manage feeds.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/feed_service.proto")
public final class FeedServiceGrpc {

  private FeedServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.FeedService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetFeedMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetFeedRequest,
      com.google.ads.googleads.v1.resources.Feed> METHOD_GET_FEED = getGetFeedMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetFeedRequest,
      com.google.ads.googleads.v1.resources.Feed> getGetFeedMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetFeedRequest,
      com.google.ads.googleads.v1.resources.Feed> getGetFeedMethod() {
    return getGetFeedMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetFeedRequest,
      com.google.ads.googleads.v1.resources.Feed> getGetFeedMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetFeedRequest, com.google.ads.googleads.v1.resources.Feed> getGetFeedMethod;
    if ((getGetFeedMethod = FeedServiceGrpc.getGetFeedMethod) == null) {
      synchronized (FeedServiceGrpc.class) {
        if ((getGetFeedMethod = FeedServiceGrpc.getGetFeedMethod) == null) {
          FeedServiceGrpc.getGetFeedMethod = getGetFeedMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetFeedRequest, com.google.ads.googleads.v1.resources.Feed>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.FeedService", "GetFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.Feed.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedServiceMethodDescriptorSupplier("GetFeed"))
                  .build();
          }
        }
     }
     return getGetFeedMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateFeedsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateFeedsRequest,
      com.google.ads.googleads.v1.services.MutateFeedsResponse> METHOD_MUTATE_FEEDS = getMutateFeedsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateFeedsRequest,
      com.google.ads.googleads.v1.services.MutateFeedsResponse> getMutateFeedsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateFeedsRequest,
      com.google.ads.googleads.v1.services.MutateFeedsResponse> getMutateFeedsMethod() {
    return getMutateFeedsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateFeedsRequest,
      com.google.ads.googleads.v1.services.MutateFeedsResponse> getMutateFeedsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateFeedsRequest, com.google.ads.googleads.v1.services.MutateFeedsResponse> getMutateFeedsMethod;
    if ((getMutateFeedsMethod = FeedServiceGrpc.getMutateFeedsMethod) == null) {
      synchronized (FeedServiceGrpc.class) {
        if ((getMutateFeedsMethod = FeedServiceGrpc.getMutateFeedsMethod) == null) {
          FeedServiceGrpc.getMutateFeedsMethod = getMutateFeedsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.MutateFeedsRequest, com.google.ads.googleads.v1.services.MutateFeedsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.FeedService", "MutateFeeds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateFeedsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedServiceMethodDescriptorSupplier("MutateFeeds"))
                  .build();
          }
        }
     }
     return getMutateFeedsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedServiceStub newStub(io.grpc.Channel channel) {
    return new FeedServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FeedServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FeedServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage feeds.
   * </pre>
   */
  public static abstract class FeedServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested feed in full detail.
     * </pre>
     */
    public void getFeed(com.google.ads.googleads.v1.services.GetFeedRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.Feed> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeedMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateFeeds(com.google.ads.googleads.v1.services.MutateFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateFeedsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateFeedsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeedMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetFeedRequest,
                com.google.ads.googleads.v1.resources.Feed>(
                  this, METHODID_GET_FEED)))
          .addMethod(
            getMutateFeedsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.MutateFeedsRequest,
                com.google.ads.googleads.v1.services.MutateFeedsResponse>(
                  this, METHODID_MUTATE_FEEDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage feeds.
   * </pre>
   */
  public static final class FeedServiceStub extends io.grpc.stub.AbstractStub<FeedServiceStub> {
    private FeedServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed in full detail.
     * </pre>
     */
    public void getFeed(com.google.ads.googleads.v1.services.GetFeedRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.Feed> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeedMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateFeeds(com.google.ads.googleads.v1.services.MutateFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateFeedsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateFeedsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage feeds.
   * </pre>
   */
  public static final class FeedServiceBlockingStub extends io.grpc.stub.AbstractStub<FeedServiceBlockingStub> {
    private FeedServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.Feed getFeed(com.google.ads.googleads.v1.services.GetFeedRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFeedMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.MutateFeedsResponse mutateFeeds(com.google.ads.googleads.v1.services.MutateFeedsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateFeedsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage feeds.
   * </pre>
   */
  public static final class FeedServiceFutureStub extends io.grpc.stub.AbstractStub<FeedServiceFutureStub> {
    private FeedServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.Feed> getFeed(
        com.google.ads.googleads.v1.services.GetFeedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeedMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.MutateFeedsResponse> mutateFeeds(
        com.google.ads.googleads.v1.services.MutateFeedsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateFeedsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEED = 0;
  private static final int METHODID_MUTATE_FEEDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FeedServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FeedServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEED:
          serviceImpl.getFeed((com.google.ads.googleads.v1.services.GetFeedRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.Feed>) responseObserver);
          break;
        case METHODID_MUTATE_FEEDS:
          serviceImpl.mutateFeeds((com.google.ads.googleads.v1.services.MutateFeedsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateFeedsResponse>) responseObserver);
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

  private static abstract class FeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.FeedServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedService");
    }
  }

  private static final class FeedServiceFileDescriptorSupplier
      extends FeedServiceBaseDescriptorSupplier {
    FeedServiceFileDescriptorSupplier() {}
  }

  private static final class FeedServiceMethodDescriptorSupplier
      extends FeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FeedServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FeedServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedServiceFileDescriptorSupplier())
              .addMethod(getGetFeedMethodHelper())
              .addMethod(getMutateFeedsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
