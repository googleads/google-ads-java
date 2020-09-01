package com.google.ads.googleads.v5.services;

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
 * Service to fetch feed placeholder views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v5/services/feed_placeholder_view_service.proto")
public final class FeedPlaceholderViewServiceGrpc {

  private FeedPlaceholderViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v5.services.FeedPlaceholderViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetFeedPlaceholderViewRequest,
      com.google.ads.googleads.v5.resources.FeedPlaceholderView> getGetFeedPlaceholderViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeedPlaceholderView",
      requestType = com.google.ads.googleads.v5.services.GetFeedPlaceholderViewRequest.class,
      responseType = com.google.ads.googleads.v5.resources.FeedPlaceholderView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetFeedPlaceholderViewRequest,
      com.google.ads.googleads.v5.resources.FeedPlaceholderView> getGetFeedPlaceholderViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetFeedPlaceholderViewRequest, com.google.ads.googleads.v5.resources.FeedPlaceholderView> getGetFeedPlaceholderViewMethod;
    if ((getGetFeedPlaceholderViewMethod = FeedPlaceholderViewServiceGrpc.getGetFeedPlaceholderViewMethod) == null) {
      synchronized (FeedPlaceholderViewServiceGrpc.class) {
        if ((getGetFeedPlaceholderViewMethod = FeedPlaceholderViewServiceGrpc.getGetFeedPlaceholderViewMethod) == null) {
          FeedPlaceholderViewServiceGrpc.getGetFeedPlaceholderViewMethod = getGetFeedPlaceholderViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.GetFeedPlaceholderViewRequest, com.google.ads.googleads.v5.resources.FeedPlaceholderView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeedPlaceholderView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.GetFeedPlaceholderViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.resources.FeedPlaceholderView.getDefaultInstance()))
              .setSchemaDescriptor(new FeedPlaceholderViewServiceMethodDescriptorSupplier("GetFeedPlaceholderView"))
              .build();
        }
      }
    }
    return getGetFeedPlaceholderViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedPlaceholderViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedPlaceholderViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedPlaceholderViewServiceStub>() {
        @java.lang.Override
        public FeedPlaceholderViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedPlaceholderViewServiceStub(channel, callOptions);
        }
      };
    return FeedPlaceholderViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedPlaceholderViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedPlaceholderViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedPlaceholderViewServiceBlockingStub>() {
        @java.lang.Override
        public FeedPlaceholderViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedPlaceholderViewServiceBlockingStub(channel, callOptions);
        }
      };
    return FeedPlaceholderViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedPlaceholderViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedPlaceholderViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedPlaceholderViewServiceFutureStub>() {
        @java.lang.Override
        public FeedPlaceholderViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedPlaceholderViewServiceFutureStub(channel, callOptions);
        }
      };
    return FeedPlaceholderViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch feed placeholder views.
   * </pre>
   */
  public static abstract class FeedPlaceholderViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested feed placeholder view in full detail.
     * </pre>
     */
    public void getFeedPlaceholderView(com.google.ads.googleads.v5.services.GetFeedPlaceholderViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.FeedPlaceholderView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeedPlaceholderViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeedPlaceholderViewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.GetFeedPlaceholderViewRequest,
                com.google.ads.googleads.v5.resources.FeedPlaceholderView>(
                  this, METHODID_GET_FEED_PLACEHOLDER_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch feed placeholder views.
   * </pre>
   */
  public static final class FeedPlaceholderViewServiceStub extends io.grpc.stub.AbstractAsyncStub<FeedPlaceholderViewServiceStub> {
    private FeedPlaceholderViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedPlaceholderViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedPlaceholderViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed placeholder view in full detail.
     * </pre>
     */
    public void getFeedPlaceholderView(com.google.ads.googleads.v5.services.GetFeedPlaceholderViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.FeedPlaceholderView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeedPlaceholderViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch feed placeholder views.
   * </pre>
   */
  public static final class FeedPlaceholderViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FeedPlaceholderViewServiceBlockingStub> {
    private FeedPlaceholderViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedPlaceholderViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedPlaceholderViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed placeholder view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v5.resources.FeedPlaceholderView getFeedPlaceholderView(com.google.ads.googleads.v5.services.GetFeedPlaceholderViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFeedPlaceholderViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch feed placeholder views.
   * </pre>
   */
  public static final class FeedPlaceholderViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FeedPlaceholderViewServiceFutureStub> {
    private FeedPlaceholderViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedPlaceholderViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedPlaceholderViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested feed placeholder view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.resources.FeedPlaceholderView> getFeedPlaceholderView(
        com.google.ads.googleads.v5.services.GetFeedPlaceholderViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeedPlaceholderViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEED_PLACEHOLDER_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FeedPlaceholderViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FeedPlaceholderViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEED_PLACEHOLDER_VIEW:
          serviceImpl.getFeedPlaceholderView((com.google.ads.googleads.v5.services.GetFeedPlaceholderViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.FeedPlaceholderView>) responseObserver);
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

  private static abstract class FeedPlaceholderViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedPlaceholderViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v5.services.FeedPlaceholderViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedPlaceholderViewService");
    }
  }

  private static final class FeedPlaceholderViewServiceFileDescriptorSupplier
      extends FeedPlaceholderViewServiceBaseDescriptorSupplier {
    FeedPlaceholderViewServiceFileDescriptorSupplier() {}
  }

  private static final class FeedPlaceholderViewServiceMethodDescriptorSupplier
      extends FeedPlaceholderViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FeedPlaceholderViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FeedPlaceholderViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedPlaceholderViewServiceFileDescriptorSupplier())
              .addMethod(getGetFeedPlaceholderViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
