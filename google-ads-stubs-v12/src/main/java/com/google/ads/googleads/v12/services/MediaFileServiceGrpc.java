package com.google.ads.googleads.v12.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage media files.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v12/services/media_file_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MediaFileServiceGrpc {

  private MediaFileServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v12.services.MediaFileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateMediaFilesRequest,
      com.google.ads.googleads.v12.services.MutateMediaFilesResponse> getMutateMediaFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateMediaFiles",
      requestType = com.google.ads.googleads.v12.services.MutateMediaFilesRequest.class,
      responseType = com.google.ads.googleads.v12.services.MutateMediaFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateMediaFilesRequest,
      com.google.ads.googleads.v12.services.MutateMediaFilesResponse> getMutateMediaFilesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateMediaFilesRequest, com.google.ads.googleads.v12.services.MutateMediaFilesResponse> getMutateMediaFilesMethod;
    if ((getMutateMediaFilesMethod = MediaFileServiceGrpc.getMutateMediaFilesMethod) == null) {
      synchronized (MediaFileServiceGrpc.class) {
        if ((getMutateMediaFilesMethod = MediaFileServiceGrpc.getMutateMediaFilesMethod) == null) {
          MediaFileServiceGrpc.getMutateMediaFilesMethod = getMutateMediaFilesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.MutateMediaFilesRequest, com.google.ads.googleads.v12.services.MutateMediaFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateMediaFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateMediaFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateMediaFilesResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<MediaFileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MediaFileServiceStub>() {
        @java.lang.Override
        public MediaFileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MediaFileServiceStub(channel, callOptions);
        }
      };
    return MediaFileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MediaFileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MediaFileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MediaFileServiceBlockingStub>() {
        @java.lang.Override
        public MediaFileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MediaFileServiceBlockingStub(channel, callOptions);
        }
      };
    return MediaFileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MediaFileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MediaFileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MediaFileServiceFutureStub>() {
        @java.lang.Override
        public MediaFileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MediaFileServiceFutureStub(channel, callOptions);
        }
      };
    return MediaFileServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage media files.
   * </pre>
   */
  public static abstract class MediaFileServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates media files. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [MediaBundleError]()
     *   [MediaFileError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateMediaFiles(com.google.ads.googleads.v12.services.MutateMediaFilesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateMediaFilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateMediaFilesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateMediaFilesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v12.services.MutateMediaFilesRequest,
                com.google.ads.googleads.v12.services.MutateMediaFilesResponse>(
                  this, METHODID_MUTATE_MEDIA_FILES)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage media files.
   * </pre>
   */
  public static final class MediaFileServiceStub extends io.grpc.stub.AbstractAsyncStub<MediaFileServiceStub> {
    private MediaFileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaFileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MediaFileServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates media files. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [MediaBundleError]()
     *   [MediaFileError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateMediaFiles(com.google.ads.googleads.v12.services.MutateMediaFilesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateMediaFilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateMediaFilesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage media files.
   * </pre>
   */
  public static final class MediaFileServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MediaFileServiceBlockingStub> {
    private MediaFileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaFileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MediaFileServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates media files. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [MediaBundleError]()
     *   [MediaFileError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v12.services.MutateMediaFilesResponse mutateMediaFiles(com.google.ads.googleads.v12.services.MutateMediaFilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateMediaFilesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage media files.
   * </pre>
   */
  public static final class MediaFileServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MediaFileServiceFutureStub> {
    private MediaFileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaFileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MediaFileServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates media files. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [MediaBundleError]()
     *   [MediaFileError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v12.services.MutateMediaFilesResponse> mutateMediaFiles(
        com.google.ads.googleads.v12.services.MutateMediaFilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateMediaFilesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_MEDIA_FILES = 0;

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
        case METHODID_MUTATE_MEDIA_FILES:
          serviceImpl.mutateMediaFiles((com.google.ads.googleads.v12.services.MutateMediaFilesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateMediaFilesResponse>) responseObserver);
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
      return com.google.ads.googleads.v12.services.MediaFileServiceProto.getDescriptor();
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
              .addMethod(getMutateMediaFilesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
