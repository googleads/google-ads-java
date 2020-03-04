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
 * Service to manage feed item targets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/feed_item_target_service.proto")
public final class FeedItemTargetServiceGrpc {

  private FeedItemTargetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.FeedItemTargetService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetFeedItemTargetMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetFeedItemTargetRequest,
      com.google.ads.googleads.v3.resources.FeedItemTarget> METHOD_GET_FEED_ITEM_TARGET = getGetFeedItemTargetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetFeedItemTargetRequest,
      com.google.ads.googleads.v3.resources.FeedItemTarget> getGetFeedItemTargetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetFeedItemTargetRequest,
      com.google.ads.googleads.v3.resources.FeedItemTarget> getGetFeedItemTargetMethod() {
    return getGetFeedItemTargetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetFeedItemTargetRequest,
      com.google.ads.googleads.v3.resources.FeedItemTarget> getGetFeedItemTargetMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetFeedItemTargetRequest, com.google.ads.googleads.v3.resources.FeedItemTarget> getGetFeedItemTargetMethod;
    if ((getGetFeedItemTargetMethod = FeedItemTargetServiceGrpc.getGetFeedItemTargetMethod) == null) {
      synchronized (FeedItemTargetServiceGrpc.class) {
        if ((getGetFeedItemTargetMethod = FeedItemTargetServiceGrpc.getGetFeedItemTargetMethod) == null) {
          FeedItemTargetServiceGrpc.getGetFeedItemTargetMethod = getGetFeedItemTargetMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetFeedItemTargetRequest, com.google.ads.googleads.v3.resources.FeedItemTarget>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.FeedItemTargetService", "GetFeedItemTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetFeedItemTargetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.FeedItemTarget.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedItemTargetServiceMethodDescriptorSupplier("GetFeedItemTarget"))
                  .build();
          }
        }
     }
     return getGetFeedItemTargetMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateFeedItemTargetsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest,
      com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> METHOD_MUTATE_FEED_ITEM_TARGETS = getMutateFeedItemTargetsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest,
      com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> getMutateFeedItemTargetsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest,
      com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> getMutateFeedItemTargetsMethod() {
    return getMutateFeedItemTargetsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest,
      com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> getMutateFeedItemTargetsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest, com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> getMutateFeedItemTargetsMethod;
    if ((getMutateFeedItemTargetsMethod = FeedItemTargetServiceGrpc.getMutateFeedItemTargetsMethod) == null) {
      synchronized (FeedItemTargetServiceGrpc.class) {
        if ((getMutateFeedItemTargetsMethod = FeedItemTargetServiceGrpc.getMutateFeedItemTargetsMethod) == null) {
          FeedItemTargetServiceGrpc.getMutateFeedItemTargetsMethod = getMutateFeedItemTargetsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest, com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.FeedItemTargetService", "MutateFeedItemTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedItemTargetServiceMethodDescriptorSupplier("MutateFeedItemTargets"))
                  .build();
          }
        }
     }
     return getMutateFeedItemTargetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedItemTargetServiceStub newStub(io.grpc.Channel channel) {
    return new FeedItemTargetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedItemTargetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FeedItemTargetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedItemTargetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FeedItemTargetServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage feed item targets.
   * </pre>
   */
  public static abstract class FeedItemTargetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested feed item targets in full detail.
     * </pre>
     */
    public void getFeedItemTarget(com.google.ads.googleads.v3.services.GetFeedItemTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.FeedItemTarget> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeedItemTargetMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates or removes feed item targets. Operation statuses are returned.
     * </pre>
     */
    public void mutateFeedItemTargets(com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateFeedItemTargetsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeedItemTargetMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetFeedItemTargetRequest,
                com.google.ads.googleads.v3.resources.FeedItemTarget>(
                  this, METHODID_GET_FEED_ITEM_TARGET)))
          .addMethod(
            getMutateFeedItemTargetsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest,
                com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse>(
                  this, METHODID_MUTATE_FEED_ITEM_TARGETS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage feed item targets.
   * </pre>
   */
  public static final class FeedItemTargetServiceStub extends io.grpc.stub.AbstractStub<FeedItemTargetServiceStub> {
    private FeedItemTargetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedItemTargetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemTargetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedItemTargetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed item targets in full detail.
     * </pre>
     */
    public void getFeedItemTarget(com.google.ads.googleads.v3.services.GetFeedItemTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.FeedItemTarget> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeedItemTargetMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or removes feed item targets. Operation statuses are returned.
     * </pre>
     */
    public void mutateFeedItemTargets(com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateFeedItemTargetsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage feed item targets.
   * </pre>
   */
  public static final class FeedItemTargetServiceBlockingStub extends io.grpc.stub.AbstractStub<FeedItemTargetServiceBlockingStub> {
    private FeedItemTargetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedItemTargetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemTargetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedItemTargetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed item targets in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.FeedItemTarget getFeedItemTarget(com.google.ads.googleads.v3.services.GetFeedItemTargetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFeedItemTargetMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or removes feed item targets. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse mutateFeedItemTargets(com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateFeedItemTargetsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage feed item targets.
   * </pre>
   */
  public static final class FeedItemTargetServiceFutureStub extends io.grpc.stub.AbstractStub<FeedItemTargetServiceFutureStub> {
    private FeedItemTargetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedItemTargetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemTargetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedItemTargetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed item targets in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.FeedItemTarget> getFeedItemTarget(
        com.google.ads.googleads.v3.services.GetFeedItemTargetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeedItemTargetMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or removes feed item targets. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> mutateFeedItemTargets(
        com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateFeedItemTargetsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEED_ITEM_TARGET = 0;
  private static final int METHODID_MUTATE_FEED_ITEM_TARGETS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FeedItemTargetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FeedItemTargetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEED_ITEM_TARGET:
          serviceImpl.getFeedItemTarget((com.google.ads.googleads.v3.services.GetFeedItemTargetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.FeedItemTarget>) responseObserver);
          break;
        case METHODID_MUTATE_FEED_ITEM_TARGETS:
          serviceImpl.mutateFeedItemTargets((com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse>) responseObserver);
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

  private static abstract class FeedItemTargetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedItemTargetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.FeedItemTargetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedItemTargetService");
    }
  }

  private static final class FeedItemTargetServiceFileDescriptorSupplier
      extends FeedItemTargetServiceBaseDescriptorSupplier {
    FeedItemTargetServiceFileDescriptorSupplier() {}
  }

  private static final class FeedItemTargetServiceMethodDescriptorSupplier
      extends FeedItemTargetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FeedItemTargetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FeedItemTargetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedItemTargetServiceFileDescriptorSupplier())
              .addMethod(getGetFeedItemTargetMethodHelper())
              .addMethod(getMutateFeedItemTargetsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
