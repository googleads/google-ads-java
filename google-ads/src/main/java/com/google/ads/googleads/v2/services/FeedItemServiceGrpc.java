package com.google.ads.googleads.v2.services;

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
 * Service to manage feed items.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/feed_item_service.proto")
public final class FeedItemServiceGrpc {

  private FeedItemServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.FeedItemService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetFeedItemMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetFeedItemRequest,
      com.google.ads.googleads.v2.resources.FeedItem> METHOD_GET_FEED_ITEM = getGetFeedItemMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetFeedItemRequest,
      com.google.ads.googleads.v2.resources.FeedItem> getGetFeedItemMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetFeedItemRequest,
      com.google.ads.googleads.v2.resources.FeedItem> getGetFeedItemMethod() {
    return getGetFeedItemMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetFeedItemRequest,
      com.google.ads.googleads.v2.resources.FeedItem> getGetFeedItemMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetFeedItemRequest, com.google.ads.googleads.v2.resources.FeedItem> getGetFeedItemMethod;
    if ((getGetFeedItemMethod = FeedItemServiceGrpc.getGetFeedItemMethod) == null) {
      synchronized (FeedItemServiceGrpc.class) {
        if ((getGetFeedItemMethod = FeedItemServiceGrpc.getGetFeedItemMethod) == null) {
          FeedItemServiceGrpc.getGetFeedItemMethod = getGetFeedItemMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetFeedItemRequest, com.google.ads.googleads.v2.resources.FeedItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.FeedItemService", "GetFeedItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetFeedItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.FeedItem.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedItemServiceMethodDescriptorSupplier("GetFeedItem"))
                  .build();
          }
        }
     }
     return getGetFeedItemMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateFeedItemsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateFeedItemsRequest,
      com.google.ads.googleads.v2.services.MutateFeedItemsResponse> METHOD_MUTATE_FEED_ITEMS = getMutateFeedItemsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateFeedItemsRequest,
      com.google.ads.googleads.v2.services.MutateFeedItemsResponse> getMutateFeedItemsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateFeedItemsRequest,
      com.google.ads.googleads.v2.services.MutateFeedItemsResponse> getMutateFeedItemsMethod() {
    return getMutateFeedItemsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateFeedItemsRequest,
      com.google.ads.googleads.v2.services.MutateFeedItemsResponse> getMutateFeedItemsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateFeedItemsRequest, com.google.ads.googleads.v2.services.MutateFeedItemsResponse> getMutateFeedItemsMethod;
    if ((getMutateFeedItemsMethod = FeedItemServiceGrpc.getMutateFeedItemsMethod) == null) {
      synchronized (FeedItemServiceGrpc.class) {
        if ((getMutateFeedItemsMethod = FeedItemServiceGrpc.getMutateFeedItemsMethod) == null) {
          FeedItemServiceGrpc.getMutateFeedItemsMethod = getMutateFeedItemsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.MutateFeedItemsRequest, com.google.ads.googleads.v2.services.MutateFeedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.FeedItemService", "MutateFeedItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateFeedItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateFeedItemsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedItemServiceMethodDescriptorSupplier("MutateFeedItems"))
                  .build();
          }
        }
     }
     return getMutateFeedItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedItemServiceStub newStub(io.grpc.Channel channel) {
    return new FeedItemServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedItemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FeedItemServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedItemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FeedItemServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage feed items.
   * </pre>
   */
  public static abstract class FeedItemServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested feed item in full detail.
     * </pre>
     */
    public void getFeedItem(com.google.ads.googleads.v2.services.GetFeedItemRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.FeedItem> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeedItemMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes feed items. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateFeedItems(com.google.ads.googleads.v2.services.MutateFeedItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateFeedItemsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateFeedItemsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeedItemMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetFeedItemRequest,
                com.google.ads.googleads.v2.resources.FeedItem>(
                  this, METHODID_GET_FEED_ITEM)))
          .addMethod(
            getMutateFeedItemsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.MutateFeedItemsRequest,
                com.google.ads.googleads.v2.services.MutateFeedItemsResponse>(
                  this, METHODID_MUTATE_FEED_ITEMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage feed items.
   * </pre>
   */
  public static final class FeedItemServiceStub extends io.grpc.stub.AbstractStub<FeedItemServiceStub> {
    private FeedItemServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedItemServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedItemServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed item in full detail.
     * </pre>
     */
    public void getFeedItem(com.google.ads.googleads.v2.services.GetFeedItemRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.FeedItem> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeedItemMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes feed items. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateFeedItems(com.google.ads.googleads.v2.services.MutateFeedItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateFeedItemsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateFeedItemsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage feed items.
   * </pre>
   */
  public static final class FeedItemServiceBlockingStub extends io.grpc.stub.AbstractStub<FeedItemServiceBlockingStub> {
    private FeedItemServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedItemServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedItemServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed item in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.FeedItem getFeedItem(com.google.ads.googleads.v2.services.GetFeedItemRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFeedItemMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes feed items. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.MutateFeedItemsResponse mutateFeedItems(com.google.ads.googleads.v2.services.MutateFeedItemsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateFeedItemsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage feed items.
   * </pre>
   */
  public static final class FeedItemServiceFutureStub extends io.grpc.stub.AbstractStub<FeedItemServiceFutureStub> {
    private FeedItemServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedItemServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedItemServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed item in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.FeedItem> getFeedItem(
        com.google.ads.googleads.v2.services.GetFeedItemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeedItemMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes feed items. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.MutateFeedItemsResponse> mutateFeedItems(
        com.google.ads.googleads.v2.services.MutateFeedItemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateFeedItemsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEED_ITEM = 0;
  private static final int METHODID_MUTATE_FEED_ITEMS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FeedItemServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FeedItemServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEED_ITEM:
          serviceImpl.getFeedItem((com.google.ads.googleads.v2.services.GetFeedItemRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.FeedItem>) responseObserver);
          break;
        case METHODID_MUTATE_FEED_ITEMS:
          serviceImpl.mutateFeedItems((com.google.ads.googleads.v2.services.MutateFeedItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateFeedItemsResponse>) responseObserver);
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

  private static abstract class FeedItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedItemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.FeedItemServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedItemService");
    }
  }

  private static final class FeedItemServiceFileDescriptorSupplier
      extends FeedItemServiceBaseDescriptorSupplier {
    FeedItemServiceFileDescriptorSupplier() {}
  }

  private static final class FeedItemServiceMethodDescriptorSupplier
      extends FeedItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FeedItemServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FeedItemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedItemServiceFileDescriptorSupplier())
              .addMethod(getGetFeedItemMethodHelper())
              .addMethod(getMutateFeedItemsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
