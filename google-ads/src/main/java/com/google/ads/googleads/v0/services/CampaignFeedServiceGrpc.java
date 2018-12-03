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
 * Service to manage campaign feeds.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v0/services/campaign_feed_service.proto")
public final class CampaignFeedServiceGrpc {

  private CampaignFeedServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.CampaignFeedService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCampaignFeedMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignFeedRequest,
      com.google.ads.googleads.v0.resources.CampaignFeed> METHOD_GET_CAMPAIGN_FEED = getGetCampaignFeedMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignFeedRequest,
      com.google.ads.googleads.v0.resources.CampaignFeed> getGetCampaignFeedMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignFeedRequest,
      com.google.ads.googleads.v0.resources.CampaignFeed> getGetCampaignFeedMethod() {
    return getGetCampaignFeedMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignFeedRequest,
      com.google.ads.googleads.v0.resources.CampaignFeed> getGetCampaignFeedMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignFeedRequest, com.google.ads.googleads.v0.resources.CampaignFeed> getGetCampaignFeedMethod;
    if ((getGetCampaignFeedMethod = CampaignFeedServiceGrpc.getGetCampaignFeedMethod) == null) {
      synchronized (CampaignFeedServiceGrpc.class) {
        if ((getGetCampaignFeedMethod = CampaignFeedServiceGrpc.getGetCampaignFeedMethod) == null) {
          CampaignFeedServiceGrpc.getGetCampaignFeedMethod = getGetCampaignFeedMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.GetCampaignFeedRequest, com.google.ads.googleads.v0.resources.CampaignFeed>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.CampaignFeedService", "GetCampaignFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.GetCampaignFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.resources.CampaignFeed.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignFeedServiceMethodDescriptorSupplier("GetCampaignFeed"))
                  .build();
          }
        }
     }
     return getGetCampaignFeedMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateCampaignFeedsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignFeedsRequest,
      com.google.ads.googleads.v0.services.MutateCampaignFeedsResponse> METHOD_MUTATE_CAMPAIGN_FEEDS = getMutateCampaignFeedsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignFeedsRequest,
      com.google.ads.googleads.v0.services.MutateCampaignFeedsResponse> getMutateCampaignFeedsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignFeedsRequest,
      com.google.ads.googleads.v0.services.MutateCampaignFeedsResponse> getMutateCampaignFeedsMethod() {
    return getMutateCampaignFeedsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignFeedsRequest,
      com.google.ads.googleads.v0.services.MutateCampaignFeedsResponse> getMutateCampaignFeedsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignFeedsRequest, com.google.ads.googleads.v0.services.MutateCampaignFeedsResponse> getMutateCampaignFeedsMethod;
    if ((getMutateCampaignFeedsMethod = CampaignFeedServiceGrpc.getMutateCampaignFeedsMethod) == null) {
      synchronized (CampaignFeedServiceGrpc.class) {
        if ((getMutateCampaignFeedsMethod = CampaignFeedServiceGrpc.getMutateCampaignFeedsMethod) == null) {
          CampaignFeedServiceGrpc.getMutateCampaignFeedsMethod = getMutateCampaignFeedsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.MutateCampaignFeedsRequest, com.google.ads.googleads.v0.services.MutateCampaignFeedsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.CampaignFeedService", "MutateCampaignFeeds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.MutateCampaignFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.MutateCampaignFeedsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignFeedServiceMethodDescriptorSupplier("MutateCampaignFeeds"))
                  .build();
          }
        }
     }
     return getMutateCampaignFeedsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignFeedServiceStub newStub(io.grpc.Channel channel) {
    return new CampaignFeedServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignFeedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CampaignFeedServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignFeedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CampaignFeedServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage campaign feeds.
   * </pre>
   */
  public static abstract class CampaignFeedServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign feed in full detail.
     * </pre>
     */
    public void getCampaignFeed(com.google.ads.googleads.v0.services.GetCampaignFeedRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CampaignFeed> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignFeedMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignFeeds(com.google.ads.googleads.v0.services.MutateCampaignFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCampaignFeedsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCampaignFeedsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignFeedMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetCampaignFeedRequest,
                com.google.ads.googleads.v0.resources.CampaignFeed>(
                  this, METHODID_GET_CAMPAIGN_FEED)))
          .addMethod(
            getMutateCampaignFeedsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.MutateCampaignFeedsRequest,
                com.google.ads.googleads.v0.services.MutateCampaignFeedsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_FEEDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign feeds.
   * </pre>
   */
  public static final class CampaignFeedServiceStub extends io.grpc.stub.AbstractStub<CampaignFeedServiceStub> {
    private CampaignFeedServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignFeedServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignFeedServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignFeedServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign feed in full detail.
     * </pre>
     */
    public void getCampaignFeed(com.google.ads.googleads.v0.services.GetCampaignFeedRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CampaignFeed> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignFeedMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignFeeds(com.google.ads.googleads.v0.services.MutateCampaignFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCampaignFeedsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCampaignFeedsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign feeds.
   * </pre>
   */
  public static final class CampaignFeedServiceBlockingStub extends io.grpc.stub.AbstractStub<CampaignFeedServiceBlockingStub> {
    private CampaignFeedServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignFeedServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignFeedServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignFeedServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign feed in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.CampaignFeed getCampaignFeed(com.google.ads.googleads.v0.services.GetCampaignFeedRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignFeedMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v0.services.MutateCampaignFeedsResponse mutateCampaignFeeds(com.google.ads.googleads.v0.services.MutateCampaignFeedsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCampaignFeedsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign feeds.
   * </pre>
   */
  public static final class CampaignFeedServiceFutureStub extends io.grpc.stub.AbstractStub<CampaignFeedServiceFutureStub> {
    private CampaignFeedServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignFeedServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignFeedServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignFeedServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign feed in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.CampaignFeed> getCampaignFeed(
        com.google.ads.googleads.v0.services.GetCampaignFeedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignFeedMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.services.MutateCampaignFeedsResponse> mutateCampaignFeeds(
        com.google.ads.googleads.v0.services.MutateCampaignFeedsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCampaignFeedsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_FEED = 0;
  private static final int METHODID_MUTATE_CAMPAIGN_FEEDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignFeedServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignFeedServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_FEED:
          serviceImpl.getCampaignFeed((com.google.ads.googleads.v0.services.GetCampaignFeedRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CampaignFeed>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_FEEDS:
          serviceImpl.mutateCampaignFeeds((com.google.ads.googleads.v0.services.MutateCampaignFeedsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCampaignFeedsResponse>) responseObserver);
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

  private static abstract class CampaignFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignFeedServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.CampaignFeedServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignFeedService");
    }
  }

  private static final class CampaignFeedServiceFileDescriptorSupplier
      extends CampaignFeedServiceBaseDescriptorSupplier {
    CampaignFeedServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignFeedServiceMethodDescriptorSupplier
      extends CampaignFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignFeedServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignFeedServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignFeedServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignFeedMethodHelper())
              .addMethod(getMutateCampaignFeedsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
