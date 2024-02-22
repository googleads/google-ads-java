package com.google.ads.googleads.v16.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage campaign groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v16/services/campaign_group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignGroupServiceGrpc {

  private CampaignGroupServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v16.services.CampaignGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateCampaignGroupsRequest,
      com.google.ads.googleads.v16.services.MutateCampaignGroupsResponse> getMutateCampaignGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignGroups",
      requestType = com.google.ads.googleads.v16.services.MutateCampaignGroupsRequest.class,
      responseType = com.google.ads.googleads.v16.services.MutateCampaignGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateCampaignGroupsRequest,
      com.google.ads.googleads.v16.services.MutateCampaignGroupsResponse> getMutateCampaignGroupsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateCampaignGroupsRequest, com.google.ads.googleads.v16.services.MutateCampaignGroupsResponse> getMutateCampaignGroupsMethod;
    if ((getMutateCampaignGroupsMethod = CampaignGroupServiceGrpc.getMutateCampaignGroupsMethod) == null) {
      synchronized (CampaignGroupServiceGrpc.class) {
        if ((getMutateCampaignGroupsMethod = CampaignGroupServiceGrpc.getMutateCampaignGroupsMethod) == null) {
          CampaignGroupServiceGrpc.getMutateCampaignGroupsMethod = getMutateCampaignGroupsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v16.services.MutateCampaignGroupsRequest, com.google.ads.googleads.v16.services.MutateCampaignGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v16.services.MutateCampaignGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v16.services.MutateCampaignGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignGroupServiceMethodDescriptorSupplier("MutateCampaignGroups"))
              .build();
        }
      }
    }
    return getMutateCampaignGroupsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignGroupServiceStub>() {
        @java.lang.Override
        public CampaignGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignGroupServiceStub(channel, callOptions);
        }
      };
    return CampaignGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignGroupServiceBlockingStub>() {
        @java.lang.Override
        public CampaignGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignGroupServiceFutureStub>() {
        @java.lang.Override
        public CampaignGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignGroupServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaign groups.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes campaign groups. Operation statuses are
     * returned.
     * </pre>
     */
    default void mutateCampaignGroups(com.google.ads.googleads.v16.services.MutateCampaignGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateCampaignGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCampaignGroupsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CampaignGroupService.
   * <pre>
   * Service to manage campaign groups.
   * </pre>
   */
  public static abstract class CampaignGroupServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CampaignGroupServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CampaignGroupService.
   * <pre>
   * Service to manage campaign groups.
   * </pre>
   */
  public static final class CampaignGroupServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CampaignGroupServiceStub> {
    private CampaignGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign groups. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignGroups(com.google.ads.googleads.v16.services.MutateCampaignGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateCampaignGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCampaignGroupsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CampaignGroupService.
   * <pre>
   * Service to manage campaign groups.
   * </pre>
   */
  public static final class CampaignGroupServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CampaignGroupServiceBlockingStub> {
    private CampaignGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign groups. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v16.services.MutateCampaignGroupsResponse mutateCampaignGroups(com.google.ads.googleads.v16.services.MutateCampaignGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CampaignGroupService.
   * <pre>
   * Service to manage campaign groups.
   * </pre>
   */
  public static final class CampaignGroupServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CampaignGroupServiceFutureStub> {
    private CampaignGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign groups. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v16.services.MutateCampaignGroupsResponse> mutateCampaignGroups(
        com.google.ads.googleads.v16.services.MutateCampaignGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCampaignGroupsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CAMPAIGN_GROUPS = 0;

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
        case METHODID_MUTATE_CAMPAIGN_GROUPS:
          serviceImpl.mutateCampaignGroups((com.google.ads.googleads.v16.services.MutateCampaignGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateCampaignGroupsResponse>) responseObserver);
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
          getMutateCampaignGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v16.services.MutateCampaignGroupsRequest,
              com.google.ads.googleads.v16.services.MutateCampaignGroupsResponse>(
                service, METHODID_MUTATE_CAMPAIGN_GROUPS)))
        .build();
  }

  private static abstract class CampaignGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v16.services.CampaignGroupServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignGroupService");
    }
  }

  private static final class CampaignGroupServiceFileDescriptorSupplier
      extends CampaignGroupServiceBaseDescriptorSupplier {
    CampaignGroupServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignGroupServiceMethodDescriptorSupplier
      extends CampaignGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CampaignGroupServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CampaignGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignGroupServiceFileDescriptorSupplier())
              .addMethod(getMutateCampaignGroupsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
