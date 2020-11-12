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
 * Service to manage ad group feeds.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/ad_group_feed_service.proto")
public final class AdGroupFeedServiceGrpc {

  private AdGroupFeedServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.AdGroupFeedService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAdGroupFeedRequest,
      com.google.ads.googleads.v6.resources.AdGroupFeed> getGetAdGroupFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdGroupFeed",
      requestType = com.google.ads.googleads.v6.services.GetAdGroupFeedRequest.class,
      responseType = com.google.ads.googleads.v6.resources.AdGroupFeed.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAdGroupFeedRequest,
      com.google.ads.googleads.v6.resources.AdGroupFeed> getGetAdGroupFeedMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAdGroupFeedRequest, com.google.ads.googleads.v6.resources.AdGroupFeed> getGetAdGroupFeedMethod;
    if ((getGetAdGroupFeedMethod = AdGroupFeedServiceGrpc.getGetAdGroupFeedMethod) == null) {
      synchronized (AdGroupFeedServiceGrpc.class) {
        if ((getGetAdGroupFeedMethod = AdGroupFeedServiceGrpc.getGetAdGroupFeedMethod) == null) {
          AdGroupFeedServiceGrpc.getGetAdGroupFeedMethod = getGetAdGroupFeedMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetAdGroupFeedRequest, com.google.ads.googleads.v6.resources.AdGroupFeed>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdGroupFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetAdGroupFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.AdGroupFeed.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupFeedServiceMethodDescriptorSupplier("GetAdGroupFeed"))
              .build();
        }
      }
    }
    return getGetAdGroupFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateAdGroupFeedsRequest,
      com.google.ads.googleads.v6.services.MutateAdGroupFeedsResponse> getMutateAdGroupFeedsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupFeeds",
      requestType = com.google.ads.googleads.v6.services.MutateAdGroupFeedsRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateAdGroupFeedsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateAdGroupFeedsRequest,
      com.google.ads.googleads.v6.services.MutateAdGroupFeedsResponse> getMutateAdGroupFeedsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateAdGroupFeedsRequest, com.google.ads.googleads.v6.services.MutateAdGroupFeedsResponse> getMutateAdGroupFeedsMethod;
    if ((getMutateAdGroupFeedsMethod = AdGroupFeedServiceGrpc.getMutateAdGroupFeedsMethod) == null) {
      synchronized (AdGroupFeedServiceGrpc.class) {
        if ((getMutateAdGroupFeedsMethod = AdGroupFeedServiceGrpc.getMutateAdGroupFeedsMethod) == null) {
          AdGroupFeedServiceGrpc.getMutateAdGroupFeedsMethod = getMutateAdGroupFeedsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateAdGroupFeedsRequest, com.google.ads.googleads.v6.services.MutateAdGroupFeedsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupFeeds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateAdGroupFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateAdGroupFeedsResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<AdGroupFeedServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupFeedServiceStub>() {
        @java.lang.Override
        public AdGroupFeedServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupFeedServiceStub(channel, callOptions);
        }
      };
    return AdGroupFeedServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupFeedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupFeedServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupFeedServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupFeedServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupFeedServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupFeedServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupFeedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupFeedServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupFeedServiceFutureStub>() {
        @java.lang.Override
        public AdGroupFeedServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupFeedServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupFeedServiceFutureStub.newStub(factory, channel);
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
    public void getAdGroupFeed(com.google.ads.googleads.v6.services.GetAdGroupFeedRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AdGroupFeed> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdGroupFeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAdGroupFeeds(com.google.ads.googleads.v6.services.MutateAdGroupFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateAdGroupFeedsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAdGroupFeedsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupFeedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetAdGroupFeedRequest,
                com.google.ads.googleads.v6.resources.AdGroupFeed>(
                  this, METHODID_GET_AD_GROUP_FEED)))
          .addMethod(
            getMutateAdGroupFeedsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateAdGroupFeedsRequest,
                com.google.ads.googleads.v6.services.MutateAdGroupFeedsResponse>(
                  this, METHODID_MUTATE_AD_GROUP_FEEDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ad group feeds.
   * </pre>
   */
  public static final class AdGroupFeedServiceStub extends io.grpc.stub.AbstractAsyncStub<AdGroupFeedServiceStub> {
    private AdGroupFeedServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupFeedServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupFeedServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group feed in full detail.
     * </pre>
     */
    public void getAdGroupFeed(com.google.ads.googleads.v6.services.GetAdGroupFeedRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AdGroupFeed> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdGroupFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAdGroupFeeds(com.google.ads.googleads.v6.services.MutateAdGroupFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateAdGroupFeedsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupFeedsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ad group feeds.
   * </pre>
   */
  public static final class AdGroupFeedServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdGroupFeedServiceBlockingStub> {
    private AdGroupFeedServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupFeedServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupFeedServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group feed in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.AdGroupFeed getAdGroupFeed(com.google.ads.googleads.v6.services.GetAdGroupFeedRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdGroupFeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateAdGroupFeedsResponse mutateAdGroupFeeds(com.google.ads.googleads.v6.services.MutateAdGroupFeedsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAdGroupFeedsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ad group feeds.
   * </pre>
   */
  public static final class AdGroupFeedServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdGroupFeedServiceFutureStub> {
    private AdGroupFeedServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupFeedServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupFeedServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group feed in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.AdGroupFeed> getAdGroupFeed(
        com.google.ads.googleads.v6.services.GetAdGroupFeedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdGroupFeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateAdGroupFeedsResponse> mutateAdGroupFeeds(
        com.google.ads.googleads.v6.services.MutateAdGroupFeedsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAdGroupFeedsMethod(), getCallOptions()), request);
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
          serviceImpl.getAdGroupFeed((com.google.ads.googleads.v6.services.GetAdGroupFeedRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AdGroupFeed>) responseObserver);
          break;
        case METHODID_MUTATE_AD_GROUP_FEEDS:
          serviceImpl.mutateAdGroupFeeds((com.google.ads.googleads.v6.services.MutateAdGroupFeedsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateAdGroupFeedsResponse>) responseObserver);
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
      return com.google.ads.googleads.v6.services.AdGroupFeedServiceProto.getDescriptor();
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
              .addMethod(getGetAdGroupFeedMethod())
              .addMethod(getMutateAdGroupFeedsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
