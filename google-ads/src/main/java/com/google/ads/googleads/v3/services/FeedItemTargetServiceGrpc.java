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
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v3/services/feed_item_target_service.proto")
public final class FeedItemTargetServiceGrpc {

  private FeedItemTargetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.FeedItemTargetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetFeedItemTargetRequest,
      com.google.ads.googleads.v3.resources.FeedItemTarget> getGetFeedItemTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeedItemTarget",
      requestType = com.google.ads.googleads.v3.services.GetFeedItemTargetRequest.class,
      responseType = com.google.ads.googleads.v3.resources.FeedItemTarget.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetFeedItemTargetRequest,
      com.google.ads.googleads.v3.resources.FeedItemTarget> getGetFeedItemTargetMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetFeedItemTargetRequest, com.google.ads.googleads.v3.resources.FeedItemTarget> getGetFeedItemTargetMethod;
    if ((getGetFeedItemTargetMethod = FeedItemTargetServiceGrpc.getGetFeedItemTargetMethod) == null) {
      synchronized (FeedItemTargetServiceGrpc.class) {
        if ((getGetFeedItemTargetMethod = FeedItemTargetServiceGrpc.getGetFeedItemTargetMethod) == null) {
          FeedItemTargetServiceGrpc.getGetFeedItemTargetMethod = getGetFeedItemTargetMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetFeedItemTargetRequest, com.google.ads.googleads.v3.resources.FeedItemTarget>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeedItemTarget"))
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

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest,
      com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> getMutateFeedItemTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateFeedItemTargets",
      requestType = com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest.class,
      responseType = com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest,
      com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> getMutateFeedItemTargetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest, com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> getMutateFeedItemTargetsMethod;
    if ((getMutateFeedItemTargetsMethod = FeedItemTargetServiceGrpc.getMutateFeedItemTargetsMethod) == null) {
      synchronized (FeedItemTargetServiceGrpc.class) {
        if ((getMutateFeedItemTargetsMethod = FeedItemTargetServiceGrpc.getMutateFeedItemTargetsMethod) == null) {
          FeedItemTargetServiceGrpc.getMutateFeedItemTargetsMethod = getMutateFeedItemTargetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest, com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateFeedItemTargets"))
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
    io.grpc.stub.AbstractStub.StubFactory<FeedItemTargetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemTargetServiceStub>() {
        @java.lang.Override
        public FeedItemTargetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemTargetServiceStub(channel, callOptions);
        }
      };
    return FeedItemTargetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedItemTargetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemTargetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemTargetServiceBlockingStub>() {
        @java.lang.Override
        public FeedItemTargetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemTargetServiceBlockingStub(channel, callOptions);
        }
      };
    return FeedItemTargetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedItemTargetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemTargetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemTargetServiceFutureStub>() {
        @java.lang.Override
        public FeedItemTargetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemTargetServiceFutureStub(channel, callOptions);
        }
      };
    return FeedItemTargetServiceFutureStub.newStub(factory, channel);
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
      asyncUnimplementedUnaryCall(getGetFeedItemTargetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or removes feed item targets. Operation statuses are returned.
     * </pre>
     */
    public void mutateFeedItemTargets(com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateFeedItemTargetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeedItemTargetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetFeedItemTargetRequest,
                com.google.ads.googleads.v3.resources.FeedItemTarget>(
                  this, METHODID_GET_FEED_ITEM_TARGET)))
          .addMethod(
            getMutateFeedItemTargetsMethod(),
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
  public static final class FeedItemTargetServiceStub extends io.grpc.stub.AbstractAsyncStub<FeedItemTargetServiceStub> {
    private FeedItemTargetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemTargetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
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
          getChannel().newCall(getGetFeedItemTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or removes feed item targets. Operation statuses are returned.
     * </pre>
     */
    public void mutateFeedItemTargets(com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateFeedItemTargetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage feed item targets.
   * </pre>
   */
  public static final class FeedItemTargetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FeedItemTargetServiceBlockingStub> {
    private FeedItemTargetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemTargetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedItemTargetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed item targets in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.FeedItemTarget getFeedItemTarget(com.google.ads.googleads.v3.services.GetFeedItemTargetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFeedItemTargetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or removes feed item targets. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse mutateFeedItemTargets(com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateFeedItemTargetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage feed item targets.
   * </pre>
   */
  public static final class FeedItemTargetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FeedItemTargetServiceFutureStub> {
    private FeedItemTargetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemTargetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
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
          getChannel().newCall(getGetFeedItemTargetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or removes feed item targets. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.MutateFeedItemTargetsResponse> mutateFeedItemTargets(
        com.google.ads.googleads.v3.services.MutateFeedItemTargetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateFeedItemTargetsMethod(), getCallOptions()), request);
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
              .addMethod(getGetFeedItemTargetMethod())
              .addMethod(getMutateFeedItemTargetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
