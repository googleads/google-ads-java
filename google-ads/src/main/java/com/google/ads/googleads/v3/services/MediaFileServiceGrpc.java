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
 * Service to manage media files.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/media_file_service.proto")
public final class MediaFileServiceGrpc {

  private MediaFileServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.MediaFileService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetMediaFileMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetMediaFileRequest,
      com.google.ads.googleads.v3.resources.MediaFile> METHOD_GET_MEDIA_FILE = getGetMediaFileMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetMediaFileRequest,
      com.google.ads.googleads.v3.resources.MediaFile> getGetMediaFileMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetMediaFileRequest,
      com.google.ads.googleads.v3.resources.MediaFile> getGetMediaFileMethod() {
    return getGetMediaFileMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetMediaFileRequest,
      com.google.ads.googleads.v3.resources.MediaFile> getGetMediaFileMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetMediaFileRequest, com.google.ads.googleads.v3.resources.MediaFile> getGetMediaFileMethod;
    if ((getGetMediaFileMethod = MediaFileServiceGrpc.getGetMediaFileMethod) == null) {
      synchronized (MediaFileServiceGrpc.class) {
        if ((getGetMediaFileMethod = MediaFileServiceGrpc.getGetMediaFileMethod) == null) {
          MediaFileServiceGrpc.getGetMediaFileMethod = getGetMediaFileMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetMediaFileRequest, com.google.ads.googleads.v3.resources.MediaFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.MediaFileService", "GetMediaFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetMediaFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.MediaFile.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaFileServiceMethodDescriptorSupplier("GetMediaFile"))
                  .build();
          }
        }
     }
     return getGetMediaFileMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateMediaFilesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateMediaFilesRequest,
      com.google.ads.googleads.v3.services.MutateMediaFilesResponse> METHOD_MUTATE_MEDIA_FILES = getMutateMediaFilesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateMediaFilesRequest,
      com.google.ads.googleads.v3.services.MutateMediaFilesResponse> getMutateMediaFilesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateMediaFilesRequest,
      com.google.ads.googleads.v3.services.MutateMediaFilesResponse> getMutateMediaFilesMethod() {
    return getMutateMediaFilesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateMediaFilesRequest,
      com.google.ads.googleads.v3.services.MutateMediaFilesResponse> getMutateMediaFilesMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateMediaFilesRequest, com.google.ads.googleads.v3.services.MutateMediaFilesResponse> getMutateMediaFilesMethod;
    if ((getMutateMediaFilesMethod = MediaFileServiceGrpc.getMutateMediaFilesMethod) == null) {
      synchronized (MediaFileServiceGrpc.class) {
        if ((getMutateMediaFilesMethod = MediaFileServiceGrpc.getMutateMediaFilesMethod) == null) {
          MediaFileServiceGrpc.getMutateMediaFilesMethod = getMutateMediaFilesMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.MutateMediaFilesRequest, com.google.ads.googleads.v3.services.MutateMediaFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.MediaFileService", "MutateMediaFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateMediaFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateMediaFilesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaFileServiceMethodDescriptorSupplier("MutateMediaFiles"))
                  .build();
          }
        }
     }
     return getMutateMediaFilesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MediaFileServiceStub newStub(io.grpc.Channel channel) {
    return new MediaFileServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MediaFileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MediaFileServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MediaFileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MediaFileServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage media files.
   * </pre>
   */
  public static abstract class MediaFileServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested media file in full detail.
     * </pre>
     */
    public void getMediaFile(com.google.ads.googleads.v3.services.GetMediaFileRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.MediaFile> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMediaFileMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates media files. Operation statuses are returned.
     * </pre>
     */
    public void mutateMediaFiles(com.google.ads.googleads.v3.services.MutateMediaFilesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateMediaFilesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateMediaFilesMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMediaFileMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetMediaFileRequest,
                com.google.ads.googleads.v3.resources.MediaFile>(
                  this, METHODID_GET_MEDIA_FILE)))
          .addMethod(
            getMutateMediaFilesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.MutateMediaFilesRequest,
                com.google.ads.googleads.v3.services.MutateMediaFilesResponse>(
                  this, METHODID_MUTATE_MEDIA_FILES)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage media files.
   * </pre>
   */
  public static final class MediaFileServiceStub extends io.grpc.stub.AbstractStub<MediaFileServiceStub> {
    private MediaFileServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MediaFileServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaFileServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MediaFileServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested media file in full detail.
     * </pre>
     */
    public void getMediaFile(com.google.ads.googleads.v3.services.GetMediaFileRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.MediaFile> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMediaFileMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates media files. Operation statuses are returned.
     * </pre>
     */
    public void mutateMediaFiles(com.google.ads.googleads.v3.services.MutateMediaFilesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateMediaFilesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateMediaFilesMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage media files.
   * </pre>
   */
  public static final class MediaFileServiceBlockingStub extends io.grpc.stub.AbstractStub<MediaFileServiceBlockingStub> {
    private MediaFileServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MediaFileServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaFileServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MediaFileServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested media file in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.MediaFile getMediaFile(com.google.ads.googleads.v3.services.GetMediaFileRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMediaFileMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates media files. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.MutateMediaFilesResponse mutateMediaFiles(com.google.ads.googleads.v3.services.MutateMediaFilesRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateMediaFilesMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage media files.
   * </pre>
   */
  public static final class MediaFileServiceFutureStub extends io.grpc.stub.AbstractStub<MediaFileServiceFutureStub> {
    private MediaFileServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MediaFileServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaFileServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MediaFileServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested media file in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.MediaFile> getMediaFile(
        com.google.ads.googleads.v3.services.GetMediaFileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMediaFileMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates media files. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.MutateMediaFilesResponse> mutateMediaFiles(
        com.google.ads.googleads.v3.services.MutateMediaFilesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateMediaFilesMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MEDIA_FILE = 0;
  private static final int METHODID_MUTATE_MEDIA_FILES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MediaFileServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MediaFileServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MEDIA_FILE:
          serviceImpl.getMediaFile((com.google.ads.googleads.v3.services.GetMediaFileRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.MediaFile>) responseObserver);
          break;
        case METHODID_MUTATE_MEDIA_FILES:
          serviceImpl.mutateMediaFiles((com.google.ads.googleads.v3.services.MutateMediaFilesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateMediaFilesResponse>) responseObserver);
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

  private static abstract class MediaFileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MediaFileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.MediaFileServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MediaFileService");
    }
  }

  private static final class MediaFileServiceFileDescriptorSupplier
      extends MediaFileServiceBaseDescriptorSupplier {
    MediaFileServiceFileDescriptorSupplier() {}
  }

  private static final class MediaFileServiceMethodDescriptorSupplier
      extends MediaFileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MediaFileServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MediaFileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MediaFileServiceFileDescriptorSupplier())
              .addMethod(getGetMediaFileMethodHelper())
              .addMethod(getMutateMediaFilesMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
