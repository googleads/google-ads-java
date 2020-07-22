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
 * Service to fetch topic constants.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v1/services/topic_constant_service.proto")
public final class TopicConstantServiceGrpc {

  private TopicConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.TopicConstantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetTopicConstantRequest,
      com.google.ads.googleads.v1.resources.TopicConstant> getGetTopicConstantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTopicConstant",
      requestType = com.google.ads.googleads.v1.services.GetTopicConstantRequest.class,
      responseType = com.google.ads.googleads.v1.resources.TopicConstant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetTopicConstantRequest,
      com.google.ads.googleads.v1.resources.TopicConstant> getGetTopicConstantMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetTopicConstantRequest, com.google.ads.googleads.v1.resources.TopicConstant> getGetTopicConstantMethod;
    if ((getGetTopicConstantMethod = TopicConstantServiceGrpc.getGetTopicConstantMethod) == null) {
      synchronized (TopicConstantServiceGrpc.class) {
        if ((getGetTopicConstantMethod = TopicConstantServiceGrpc.getGetTopicConstantMethod) == null) {
          TopicConstantServiceGrpc.getGetTopicConstantMethod = getGetTopicConstantMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetTopicConstantRequest, com.google.ads.googleads.v1.resources.TopicConstant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTopicConstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetTopicConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.TopicConstant.getDefaultInstance()))
              .setSchemaDescriptor(new TopicConstantServiceMethodDescriptorSupplier("GetTopicConstant"))
              .build();
        }
      }
    }
    return getGetTopicConstantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TopicConstantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopicConstantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopicConstantServiceStub>() {
        @java.lang.Override
        public TopicConstantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopicConstantServiceStub(channel, callOptions);
        }
      };
    return TopicConstantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TopicConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopicConstantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopicConstantServiceBlockingStub>() {
        @java.lang.Override
        public TopicConstantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopicConstantServiceBlockingStub(channel, callOptions);
        }
      };
    return TopicConstantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TopicConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopicConstantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopicConstantServiceFutureStub>() {
        @java.lang.Override
        public TopicConstantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopicConstantServiceFutureStub(channel, callOptions);
        }
      };
    return TopicConstantServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch topic constants.
   * </pre>
   */
  public static abstract class TopicConstantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested topic constant in full detail.
     * </pre>
     */
    public void getTopicConstant(com.google.ads.googleads.v1.services.GetTopicConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.TopicConstant> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTopicConstantMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTopicConstantMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetTopicConstantRequest,
                com.google.ads.googleads.v1.resources.TopicConstant>(
                  this, METHODID_GET_TOPIC_CONSTANT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch topic constants.
   * </pre>
   */
  public static final class TopicConstantServiceStub extends io.grpc.stub.AbstractAsyncStub<TopicConstantServiceStub> {
    private TopicConstantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicConstantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopicConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested topic constant in full detail.
     * </pre>
     */
    public void getTopicConstant(com.google.ads.googleads.v1.services.GetTopicConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.TopicConstant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTopicConstantMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch topic constants.
   * </pre>
   */
  public static final class TopicConstantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TopicConstantServiceBlockingStub> {
    private TopicConstantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicConstantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopicConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested topic constant in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.TopicConstant getTopicConstant(com.google.ads.googleads.v1.services.GetTopicConstantRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTopicConstantMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch topic constants.
   * </pre>
   */
  public static final class TopicConstantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TopicConstantServiceFutureStub> {
    private TopicConstantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicConstantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopicConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested topic constant in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.TopicConstant> getTopicConstant(
        com.google.ads.googleads.v1.services.GetTopicConstantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTopicConstantMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOPIC_CONSTANT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TopicConstantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TopicConstantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOPIC_CONSTANT:
          serviceImpl.getTopicConstant((com.google.ads.googleads.v1.services.GetTopicConstantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.TopicConstant>) responseObserver);
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

  private static abstract class TopicConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TopicConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.TopicConstantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TopicConstantService");
    }
  }

  private static final class TopicConstantServiceFileDescriptorSupplier
      extends TopicConstantServiceBaseDescriptorSupplier {
    TopicConstantServiceFileDescriptorSupplier() {}
  }

  private static final class TopicConstantServiceMethodDescriptorSupplier
      extends TopicConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TopicConstantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TopicConstantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TopicConstantServiceFileDescriptorSupplier())
              .addMethod(getGetTopicConstantMethod())
              .build();
        }
      }
    }
    return result;
  }
}
