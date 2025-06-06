package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage campaign asset set
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/campaign_asset_set_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignAssetSetServiceGrpc {

  private CampaignAssetSetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.CampaignAssetSetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateCampaignAssetSetsRequest,
      com.google.ads.googleads.v18.services.MutateCampaignAssetSetsResponse> getMutateCampaignAssetSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignAssetSets",
      requestType = com.google.ads.googleads.v18.services.MutateCampaignAssetSetsRequest.class,
      responseType = com.google.ads.googleads.v18.services.MutateCampaignAssetSetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateCampaignAssetSetsRequest,
      com.google.ads.googleads.v18.services.MutateCampaignAssetSetsResponse> getMutateCampaignAssetSetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateCampaignAssetSetsRequest, com.google.ads.googleads.v18.services.MutateCampaignAssetSetsResponse> getMutateCampaignAssetSetsMethod;
    if ((getMutateCampaignAssetSetsMethod = CampaignAssetSetServiceGrpc.getMutateCampaignAssetSetsMethod) == null) {
      synchronized (CampaignAssetSetServiceGrpc.class) {
        if ((getMutateCampaignAssetSetsMethod = CampaignAssetSetServiceGrpc.getMutateCampaignAssetSetsMethod) == null) {
          CampaignAssetSetServiceGrpc.getMutateCampaignAssetSetsMethod = getMutateCampaignAssetSetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.MutateCampaignAssetSetsRequest, com.google.ads.googleads.v18.services.MutateCampaignAssetSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignAssetSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateCampaignAssetSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateCampaignAssetSetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignAssetSetServiceMethodDescriptorSupplier("MutateCampaignAssetSets"))
              .build();
        }
      }
    }
    return getMutateCampaignAssetSetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignAssetSetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignAssetSetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignAssetSetServiceStub>() {
        @java.lang.Override
        public CampaignAssetSetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignAssetSetServiceStub(channel, callOptions);
        }
      };
    return CampaignAssetSetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CampaignAssetSetServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignAssetSetServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignAssetSetServiceBlockingV2Stub>() {
        @java.lang.Override
        public CampaignAssetSetServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignAssetSetServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CampaignAssetSetServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignAssetSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignAssetSetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignAssetSetServiceBlockingStub>() {
        @java.lang.Override
        public CampaignAssetSetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignAssetSetServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignAssetSetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignAssetSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignAssetSetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignAssetSetServiceFutureStub>() {
        @java.lang.Override
        public CampaignAssetSetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignAssetSetServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignAssetSetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaign asset set
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates or removes campaign asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    default void mutateCampaignAssetSets(com.google.ads.googleads.v18.services.MutateCampaignAssetSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateCampaignAssetSetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCampaignAssetSetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CampaignAssetSetService.
   * <pre>
   * Service to manage campaign asset set
   * </pre>
   */
  public static abstract class CampaignAssetSetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CampaignAssetSetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CampaignAssetSetService.
   * <pre>
   * Service to manage campaign asset set
   * </pre>
   */
  public static final class CampaignAssetSetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CampaignAssetSetServiceStub> {
    private CampaignAssetSetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignAssetSetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignAssetSetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes campaign asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignAssetSets(com.google.ads.googleads.v18.services.MutateCampaignAssetSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateCampaignAssetSetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCampaignAssetSetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CampaignAssetSetService.
   * <pre>
   * Service to manage campaign asset set
   * </pre>
   */
  public static final class CampaignAssetSetServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CampaignAssetSetServiceBlockingV2Stub> {
    private CampaignAssetSetServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignAssetSetServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignAssetSetServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes campaign asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateCampaignAssetSetsResponse mutateCampaignAssetSets(com.google.ads.googleads.v18.services.MutateCampaignAssetSetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignAssetSetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CampaignAssetSetService.
   * <pre>
   * Service to manage campaign asset set
   * </pre>
   */
  public static final class CampaignAssetSetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CampaignAssetSetServiceBlockingStub> {
    private CampaignAssetSetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignAssetSetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignAssetSetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes campaign asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateCampaignAssetSetsResponse mutateCampaignAssetSets(com.google.ads.googleads.v18.services.MutateCampaignAssetSetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignAssetSetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CampaignAssetSetService.
   * <pre>
   * Service to manage campaign asset set
   * </pre>
   */
  public static final class CampaignAssetSetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CampaignAssetSetServiceFutureStub> {
    private CampaignAssetSetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignAssetSetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignAssetSetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes campaign asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.MutateCampaignAssetSetsResponse> mutateCampaignAssetSets(
        com.google.ads.googleads.v18.services.MutateCampaignAssetSetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCampaignAssetSetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CAMPAIGN_ASSET_SETS = 0;

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
        case METHODID_MUTATE_CAMPAIGN_ASSET_SETS:
          serviceImpl.mutateCampaignAssetSets((com.google.ads.googleads.v18.services.MutateCampaignAssetSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateCampaignAssetSetsResponse>) responseObserver);
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
          getMutateCampaignAssetSetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.MutateCampaignAssetSetsRequest,
              com.google.ads.googleads.v18.services.MutateCampaignAssetSetsResponse>(
                service, METHODID_MUTATE_CAMPAIGN_ASSET_SETS)))
        .build();
  }

  private static abstract class CampaignAssetSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignAssetSetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.CampaignAssetSetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignAssetSetService");
    }
  }

  private static final class CampaignAssetSetServiceFileDescriptorSupplier
      extends CampaignAssetSetServiceBaseDescriptorSupplier {
    CampaignAssetSetServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignAssetSetServiceMethodDescriptorSupplier
      extends CampaignAssetSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CampaignAssetSetServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CampaignAssetSetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignAssetSetServiceFileDescriptorSupplier())
              .addMethod(getMutateCampaignAssetSetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
