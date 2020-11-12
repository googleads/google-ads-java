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
 * Service to manage videos.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/video_service.proto")
public final class VideoServiceGrpc {

  private VideoServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.VideoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetVideoRequest,
      com.google.ads.googleads.v6.resources.Video> getGetVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVideo",
      requestType = com.google.ads.googleads.v6.services.GetVideoRequest.class,
      responseType = com.google.ads.googleads.v6.resources.Video.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetVideoRequest,
      com.google.ads.googleads.v6.resources.Video> getGetVideoMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetVideoRequest, com.google.ads.googleads.v6.resources.Video> getGetVideoMethod;
    if ((getGetVideoMethod = VideoServiceGrpc.getGetVideoMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getGetVideoMethod = VideoServiceGrpc.getGetVideoMethod) == null) {
          VideoServiceGrpc.getGetVideoMethod = getGetVideoMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetVideoRequest, com.google.ads.googleads.v6.resources.Video>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.Video.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("GetVideo"))
              .build();
        }
      }
    }
    return getGetVideoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoServiceStub>() {
        @java.lang.Override
        public VideoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoServiceStub(channel, callOptions);
        }
      };
    return VideoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoServiceBlockingStub>() {
        @java.lang.Override
        public VideoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoServiceBlockingStub(channel, callOptions);
        }
      };
    return VideoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoServiceFutureStub>() {
        @java.lang.Override
        public VideoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoServiceFutureStub(channel, callOptions);
        }
      };
    return VideoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage videos.
   * </pre>
   */
  public static abstract class VideoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested video in full detail.
     * </pre>
     */
    public void getVideo(com.google.ads.googleads.v6.services.GetVideoRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.Video> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVideoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVideoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetVideoRequest,
                com.google.ads.googleads.v6.resources.Video>(
                  this, METHODID_GET_VIDEO)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage videos.
   * </pre>
   */
  public static final class VideoServiceStub extends io.grpc.stub.AbstractAsyncStub<VideoServiceStub> {
    private VideoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested video in full detail.
     * </pre>
     */
    public void getVideo(com.google.ads.googleads.v6.services.GetVideoRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.Video> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVideoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage videos.
   * </pre>
   */
  public static final class VideoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VideoServiceBlockingStub> {
    private VideoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested video in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.Video getVideo(com.google.ads.googleads.v6.services.GetVideoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVideoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage videos.
   * </pre>
   */
  public static final class VideoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VideoServiceFutureStub> {
    private VideoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested video in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.Video> getVideo(
        com.google.ads.googleads.v6.services.GetVideoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVideoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VIDEO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VideoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VideoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VIDEO:
          serviceImpl.getVideo((com.google.ads.googleads.v6.services.GetVideoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.Video>) responseObserver);
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

  private static abstract class VideoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VideoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.VideoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VideoService");
    }
  }

  private static final class VideoServiceFileDescriptorSupplier
      extends VideoServiceBaseDescriptorSupplier {
    VideoServiceFileDescriptorSupplier() {}
  }

  private static final class VideoServiceMethodDescriptorSupplier
      extends VideoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VideoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VideoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VideoServiceFileDescriptorSupplier())
              .addMethod(getGetVideoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
