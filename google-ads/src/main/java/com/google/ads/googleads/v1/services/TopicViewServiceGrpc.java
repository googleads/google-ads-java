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
 * Service to manage topic views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/topic_view_service.proto")
public final class TopicViewServiceGrpc {

  private TopicViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.TopicViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetTopicViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetTopicViewRequest,
      com.google.ads.googleads.v1.resources.TopicView> METHOD_GET_TOPIC_VIEW = getGetTopicViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetTopicViewRequest,
      com.google.ads.googleads.v1.resources.TopicView> getGetTopicViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetTopicViewRequest,
      com.google.ads.googleads.v1.resources.TopicView> getGetTopicViewMethod() {
    return getGetTopicViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetTopicViewRequest,
      com.google.ads.googleads.v1.resources.TopicView> getGetTopicViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetTopicViewRequest, com.google.ads.googleads.v1.resources.TopicView> getGetTopicViewMethod;
    if ((getGetTopicViewMethod = TopicViewServiceGrpc.getGetTopicViewMethod) == null) {
      synchronized (TopicViewServiceGrpc.class) {
        if ((getGetTopicViewMethod = TopicViewServiceGrpc.getGetTopicViewMethod) == null) {
          TopicViewServiceGrpc.getGetTopicViewMethod = getGetTopicViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetTopicViewRequest, com.google.ads.googleads.v1.resources.TopicView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.TopicViewService", "GetTopicView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetTopicViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.TopicView.getDefaultInstance()))
                  .setSchemaDescriptor(new TopicViewServiceMethodDescriptorSupplier("GetTopicView"))
                  .build();
          }
        }
     }
     return getGetTopicViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TopicViewServiceStub newStub(io.grpc.Channel channel) {
    return new TopicViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TopicViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TopicViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TopicViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TopicViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage topic views.
   * </pre>
   */
  public static abstract class TopicViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested topic view in full detail.
     * </pre>
     */
    public void getTopicView(com.google.ads.googleads.v1.services.GetTopicViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.TopicView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTopicViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTopicViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetTopicViewRequest,
                com.google.ads.googleads.v1.resources.TopicView>(
                  this, METHODID_GET_TOPIC_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage topic views.
   * </pre>
   */
  public static final class TopicViewServiceStub extends io.grpc.stub.AbstractStub<TopicViewServiceStub> {
    private TopicViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TopicViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TopicViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested topic view in full detail.
     * </pre>
     */
    public void getTopicView(com.google.ads.googleads.v1.services.GetTopicViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.TopicView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTopicViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage topic views.
   * </pre>
   */
  public static final class TopicViewServiceBlockingStub extends io.grpc.stub.AbstractStub<TopicViewServiceBlockingStub> {
    private TopicViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TopicViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TopicViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested topic view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.TopicView getTopicView(com.google.ads.googleads.v1.services.GetTopicViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTopicViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage topic views.
   * </pre>
   */
  public static final class TopicViewServiceFutureStub extends io.grpc.stub.AbstractStub<TopicViewServiceFutureStub> {
    private TopicViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TopicViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TopicViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested topic view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.TopicView> getTopicView(
        com.google.ads.googleads.v1.services.GetTopicViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTopicViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOPIC_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TopicViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TopicViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOPIC_VIEW:
          serviceImpl.getTopicView((com.google.ads.googleads.v1.services.GetTopicViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.TopicView>) responseObserver);
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

  private static abstract class TopicViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TopicViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.TopicViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TopicViewService");
    }
  }

  private static final class TopicViewServiceFileDescriptorSupplier
      extends TopicViewServiceBaseDescriptorSupplier {
    TopicViewServiceFileDescriptorSupplier() {}
  }

  private static final class TopicViewServiceMethodDescriptorSupplier
      extends TopicViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TopicViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TopicViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TopicViewServiceFileDescriptorSupplier())
              .addMethod(getGetTopicViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
