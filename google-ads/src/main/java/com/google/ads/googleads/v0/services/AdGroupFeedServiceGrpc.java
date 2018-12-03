package com.google.ads.googleads.v0.services;

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
 * Service to manage ad group feeds.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v0/services/ad_group_feed_service.proto")
public final class AdGroupFeedServiceGrpc {

  private AdGroupFeedServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.AdGroupFeedService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAdGroupFeedMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetAdGroupFeedRequest,
      com.google.ads.googleads.v0.resources.AdGroupFeed> METHOD_GET_AD_GROUP_FEED = getGetAdGroupFeedMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetAdGroupFeedRequest,
      com.google.ads.googleads.v0.resources.AdGroupFeed> getGetAdGroupFeedMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetAdGroupFeedRequest,
      com.google.ads.googleads.v0.resources.AdGroupFeed> getGetAdGroupFeedMethod() {
    return getGetAdGroupFeedMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetAdGroupFeedRequest,
      com.google.ads.googleads.v0.resources.AdGroupFeed> getGetAdGroupFeedMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetAdGroupFeedRequest, com.google.ads.googleads.v0.resources.AdGroupFeed> getGetAdGroupFeedMethod;
    if ((getGetAdGroupFeedMethod = AdGroupFeedServiceGrpc.getGetAdGroupFeedMethod) == null) {
      synchronized (AdGroupFeedServiceGrpc.class) {
        if ((getGetAdGroupFeedMethod = AdGroupFeedServiceGrpc.getGetAdGroupFeedMethod) == null) {
          AdGroupFeedServiceGrpc.getGetAdGroupFeedMethod = getGetAdGroupFeedMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.GetAdGroupFeedRequest, com.google.ads.googleads.v0.resources.AdGroupFeed>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.AdGroupFeedService", "GetAdGroupFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.GetAdGroupFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.resources.AdGroupFeed.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupFeedServiceMethodDescriptorSupplier("GetAdGroupFeed"))
                  .build();
          }
        }
     }
     return getGetAdGroupFeedMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateAdGroupFeedsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest,
      com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse> METHOD_MUTATE_AD_GROUP_FEEDS = getMutateAdGroupFeedsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest,
      com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse> getMutateAdGroupFeedsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest,
      com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse> getMutateAdGroupFeedsMethod() {
    return getMutateAdGroupFeedsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest,
      com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse> getMutateAdGroupFeedsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest, com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse> getMutateAdGroupFeedsMethod;
    if ((getMutateAdGroupFeedsMethod = AdGroupFeedServiceGrpc.getMutateAdGroupFeedsMethod) == null) {
      synchronized (AdGroupFeedServiceGrpc.class) {
        if ((getMutateAdGroupFeedsMethod = AdGroupFeedServiceGrpc.getMutateAdGroupFeedsMethod) == null) {
          AdGroupFeedServiceGrpc.getMutateAdGroupFeedsMethod = getMutateAdGroupFeedsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest, com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.AdGroupFeedService", "MutateAdGroupFeeds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupFeedServiceMethodDescriptorSupplier("MutateAdGroupFeeds"))
                  .build();
          }
        }
     }
     return getMutateAdGroupFeedsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupFeedServiceStub newStub(io.grpc.Channel channel) {
    return new AdGroupFeedServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupFeedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdGroupFeedServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupFeedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdGroupFeedServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage ad group feeds.
   * </pre>
   */
  public static abstract class AdGroupFeedServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad group feed in full detail.
     * </pre>
     */
    public void getAdGroupFeed(com.google.ads.googleads.v0.services.GetAdGroupFeedRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.AdGroupFeed> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdGroupFeedMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAdGroupFeeds(com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAdGroupFeedsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupFeedMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetAdGroupFeedRequest,
                com.google.ads.googleads.v0.resources.AdGroupFeed>(
                  this, METHODID_GET_AD_GROUP_FEED)))
          .addMethod(
            getMutateAdGroupFeedsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest,
                com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse>(
                  this, METHODID_MUTATE_AD_GROUP_FEEDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ad group feeds.
   * </pre>
   */
  public static final class AdGroupFeedServiceStub extends io.grpc.stub.AbstractStub<AdGroupFeedServiceStub> {
    private AdGroupFeedServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupFeedServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupFeedServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupFeedServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group feed in full detail.
     * </pre>
     */
    public void getAdGroupFeed(com.google.ads.googleads.v0.services.GetAdGroupFeedRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.AdGroupFeed> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdGroupFeedMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAdGroupFeeds(com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupFeedsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ad group feeds.
   * </pre>
   */
  public static final class AdGroupFeedServiceBlockingStub extends io.grpc.stub.AbstractStub<AdGroupFeedServiceBlockingStub> {
    private AdGroupFeedServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupFeedServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupFeedServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupFeedServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group feed in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.AdGroupFeed getAdGroupFeed(com.google.ads.googleads.v0.services.GetAdGroupFeedRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdGroupFeedMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse mutateAdGroupFeeds(com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAdGroupFeedsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ad group feeds.
   * </pre>
   */
  public static final class AdGroupFeedServiceFutureStub extends io.grpc.stub.AbstractStub<AdGroupFeedServiceFutureStub> {
    private AdGroupFeedServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupFeedServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupFeedServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupFeedServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group feed in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.AdGroupFeed> getAdGroupFeed(
        com.google.ads.googleads.v0.services.GetAdGroupFeedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdGroupFeedMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse> mutateAdGroupFeeds(
        com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAdGroupFeedsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_FEED = 0;
  private static final int METHODID_MUTATE_AD_GROUP_FEEDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupFeedServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupFeedServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_FEED:
          serviceImpl.getAdGroupFeed((com.google.ads.googleads.v0.services.GetAdGroupFeedRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.AdGroupFeed>) responseObserver);
          break;
        case METHODID_MUTATE_AD_GROUP_FEEDS:
          serviceImpl.mutateAdGroupFeeds((com.google.ads.googleads.v0.services.MutateAdGroupFeedsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateAdGroupFeedsResponse>) responseObserver);
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

  private static abstract class AdGroupFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupFeedServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.AdGroupFeedServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupFeedService");
    }
  }

  private static final class AdGroupFeedServiceFileDescriptorSupplier
      extends AdGroupFeedServiceBaseDescriptorSupplier {
    AdGroupFeedServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupFeedServiceMethodDescriptorSupplier
      extends AdGroupFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupFeedServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupFeedServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupFeedServiceFileDescriptorSupplier())
              .addMethod(getGetAdGroupFeedMethodHelper())
              .addMethod(getMutateAdGroupFeedsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
