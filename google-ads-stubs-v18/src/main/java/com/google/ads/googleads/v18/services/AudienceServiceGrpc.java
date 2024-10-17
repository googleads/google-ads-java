package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage audiences.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/audience_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AudienceServiceGrpc {

  private AudienceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.AudienceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAudiencesRequest,
      com.google.ads.googleads.v18.services.MutateAudiencesResponse> getMutateAudiencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAudiences",
      requestType = com.google.ads.googleads.v18.services.MutateAudiencesRequest.class,
      responseType = com.google.ads.googleads.v18.services.MutateAudiencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAudiencesRequest,
      com.google.ads.googleads.v18.services.MutateAudiencesResponse> getMutateAudiencesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAudiencesRequest, com.google.ads.googleads.v18.services.MutateAudiencesResponse> getMutateAudiencesMethod;
    if ((getMutateAudiencesMethod = AudienceServiceGrpc.getMutateAudiencesMethod) == null) {
      synchronized (AudienceServiceGrpc.class) {
        if ((getMutateAudiencesMethod = AudienceServiceGrpc.getMutateAudiencesMethod) == null) {
          AudienceServiceGrpc.getMutateAudiencesMethod = getMutateAudiencesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.MutateAudiencesRequest, com.google.ads.googleads.v18.services.MutateAudiencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAudiences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateAudiencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateAudiencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AudienceServiceMethodDescriptorSupplier("MutateAudiences"))
              .build();
        }
      }
    }
    return getMutateAudiencesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AudienceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudienceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudienceServiceStub>() {
        @java.lang.Override
        public AudienceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudienceServiceStub(channel, callOptions);
        }
      };
    return AudienceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AudienceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudienceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudienceServiceBlockingStub>() {
        @java.lang.Override
        public AudienceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudienceServiceBlockingStub(channel, callOptions);
        }
      };
    return AudienceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AudienceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudienceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudienceServiceFutureStub>() {
        @java.lang.Override
        public AudienceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudienceServiceFutureStub(channel, callOptions);
        }
      };
    return AudienceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage audiences.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates audiences. Operation statuses are returned.
     * List of thrown errors:
     *   [AudienceError]()
     * </pre>
     */
    default void mutateAudiences(com.google.ads.googleads.v18.services.MutateAudiencesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAudiencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAudiencesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AudienceService.
   * <pre>
   * Service to manage audiences.
   * </pre>
   */
  public static abstract class AudienceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AudienceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AudienceService.
   * <pre>
   * Service to manage audiences.
   * </pre>
   */
  public static final class AudienceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AudienceServiceStub> {
    private AudienceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudienceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudienceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates audiences. Operation statuses are returned.
     * List of thrown errors:
     *   [AudienceError]()
     * </pre>
     */
    public void mutateAudiences(com.google.ads.googleads.v18.services.MutateAudiencesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAudiencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAudiencesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AudienceService.
   * <pre>
   * Service to manage audiences.
   * </pre>
   */
  public static final class AudienceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AudienceServiceBlockingStub> {
    private AudienceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudienceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudienceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates audiences. Operation statuses are returned.
     * List of thrown errors:
     *   [AudienceError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateAudiencesResponse mutateAudiences(com.google.ads.googleads.v18.services.MutateAudiencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAudiencesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AudienceService.
   * <pre>
   * Service to manage audiences.
   * </pre>
   */
  public static final class AudienceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AudienceServiceFutureStub> {
    private AudienceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudienceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudienceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates audiences. Operation statuses are returned.
     * List of thrown errors:
     *   [AudienceError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.MutateAudiencesResponse> mutateAudiences(
        com.google.ads.googleads.v18.services.MutateAudiencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAudiencesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AUDIENCES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_AUDIENCES:
          serviceImpl.mutateAudiences((com.google.ads.googleads.v18.services.MutateAudiencesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAudiencesResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMutateAudiencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.MutateAudiencesRequest,
              com.google.ads.googleads.v18.services.MutateAudiencesResponse>(
                service, METHODID_MUTATE_AUDIENCES)))
        .build();
  }

  private static abstract class AudienceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AudienceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.AudienceServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AudienceService");
    }
  }

  private static final class AudienceServiceFileDescriptorSupplier
      extends AudienceServiceBaseDescriptorSupplier {
    AudienceServiceFileDescriptorSupplier() {}
  }

  private static final class AudienceServiceMethodDescriptorSupplier
      extends AudienceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AudienceServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AudienceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AudienceServiceFileDescriptorSupplier())
              .addMethod(getMutateAudiencesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
