package com.google.ads.googleads.v13.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage bidding data exclusions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v13/services/bidding_data_exclusion_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BiddingDataExclusionServiceGrpc {

  private BiddingDataExclusionServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v13.services.BiddingDataExclusionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsRequest,
      com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsResponse> getMutateBiddingDataExclusionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateBiddingDataExclusions",
      requestType = com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsRequest.class,
      responseType = com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsRequest,
      com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsResponse> getMutateBiddingDataExclusionsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsRequest, com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsResponse> getMutateBiddingDataExclusionsMethod;
    if ((getMutateBiddingDataExclusionsMethod = BiddingDataExclusionServiceGrpc.getMutateBiddingDataExclusionsMethod) == null) {
      synchronized (BiddingDataExclusionServiceGrpc.class) {
        if ((getMutateBiddingDataExclusionsMethod = BiddingDataExclusionServiceGrpc.getMutateBiddingDataExclusionsMethod) == null) {
          BiddingDataExclusionServiceGrpc.getMutateBiddingDataExclusionsMethod = getMutateBiddingDataExclusionsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsRequest, com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateBiddingDataExclusions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BiddingDataExclusionServiceMethodDescriptorSupplier("MutateBiddingDataExclusions"))
              .build();
        }
      }
    }
    return getMutateBiddingDataExclusionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BiddingDataExclusionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BiddingDataExclusionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BiddingDataExclusionServiceStub>() {
        @java.lang.Override
        public BiddingDataExclusionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BiddingDataExclusionServiceStub(channel, callOptions);
        }
      };
    return BiddingDataExclusionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BiddingDataExclusionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BiddingDataExclusionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BiddingDataExclusionServiceBlockingStub>() {
        @java.lang.Override
        public BiddingDataExclusionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BiddingDataExclusionServiceBlockingStub(channel, callOptions);
        }
      };
    return BiddingDataExclusionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BiddingDataExclusionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BiddingDataExclusionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BiddingDataExclusionServiceFutureStub>() {
        @java.lang.Override
        public BiddingDataExclusionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BiddingDataExclusionServiceFutureStub(channel, callOptions);
        }
      };
    return BiddingDataExclusionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage bidding data exclusions.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes data exclusions.
     * Operation statuses are returned.
     * </pre>
     */
    default void mutateBiddingDataExclusions(com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateBiddingDataExclusionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BiddingDataExclusionService.
   * <pre>
   * Service to manage bidding data exclusions.
   * </pre>
   */
  public static abstract class BiddingDataExclusionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BiddingDataExclusionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BiddingDataExclusionService.
   * <pre>
   * Service to manage bidding data exclusions.
   * </pre>
   */
  public static final class BiddingDataExclusionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BiddingDataExclusionServiceStub> {
    private BiddingDataExclusionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingDataExclusionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BiddingDataExclusionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes data exclusions.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateBiddingDataExclusions(com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateBiddingDataExclusionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BiddingDataExclusionService.
   * <pre>
   * Service to manage bidding data exclusions.
   * </pre>
   */
  public static final class BiddingDataExclusionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BiddingDataExclusionServiceBlockingStub> {
    private BiddingDataExclusionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingDataExclusionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BiddingDataExclusionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes data exclusions.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsResponse mutateBiddingDataExclusions(com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateBiddingDataExclusionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BiddingDataExclusionService.
   * <pre>
   * Service to manage bidding data exclusions.
   * </pre>
   */
  public static final class BiddingDataExclusionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BiddingDataExclusionServiceFutureStub> {
    private BiddingDataExclusionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingDataExclusionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BiddingDataExclusionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes data exclusions.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsResponse> mutateBiddingDataExclusions(
        com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateBiddingDataExclusionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_BIDDING_DATA_EXCLUSIONS = 0;

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
        case METHODID_MUTATE_BIDDING_DATA_EXCLUSIONS:
          serviceImpl.mutateBiddingDataExclusions((com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsResponse>) responseObserver);
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
          getMutateBiddingDataExclusionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsRequest,
              com.google.ads.googleads.v13.services.MutateBiddingDataExclusionsResponse>(
                service, METHODID_MUTATE_BIDDING_DATA_EXCLUSIONS)))
        .build();
  }

  private static abstract class BiddingDataExclusionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BiddingDataExclusionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v13.services.BiddingDataExclusionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BiddingDataExclusionService");
    }
  }

  private static final class BiddingDataExclusionServiceFileDescriptorSupplier
      extends BiddingDataExclusionServiceBaseDescriptorSupplier {
    BiddingDataExclusionServiceFileDescriptorSupplier() {}
  }

  private static final class BiddingDataExclusionServiceMethodDescriptorSupplier
      extends BiddingDataExclusionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BiddingDataExclusionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BiddingDataExclusionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BiddingDataExclusionServiceFileDescriptorSupplier())
              .addMethod(getMutateBiddingDataExclusionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
