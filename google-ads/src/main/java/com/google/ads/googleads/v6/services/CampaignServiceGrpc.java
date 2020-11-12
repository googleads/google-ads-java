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
 * Service to manage campaigns.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/campaign_service.proto")
public final class CampaignServiceGrpc {

  private CampaignServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.CampaignService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCampaignRequest,
      com.google.ads.googleads.v6.resources.Campaign> getGetCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaign",
      requestType = com.google.ads.googleads.v6.services.GetCampaignRequest.class,
      responseType = com.google.ads.googleads.v6.resources.Campaign.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCampaignRequest,
      com.google.ads.googleads.v6.resources.Campaign> getGetCampaignMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCampaignRequest, com.google.ads.googleads.v6.resources.Campaign> getGetCampaignMethod;
    if ((getGetCampaignMethod = CampaignServiceGrpc.getGetCampaignMethod) == null) {
      synchronized (CampaignServiceGrpc.class) {
        if ((getGetCampaignMethod = CampaignServiceGrpc.getGetCampaignMethod) == null) {
          CampaignServiceGrpc.getGetCampaignMethod = getGetCampaignMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetCampaignRequest, com.google.ads.googleads.v6.resources.Campaign>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetCampaignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.Campaign.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignServiceMethodDescriptorSupplier("GetCampaign"))
              .build();
        }
      }
    }
    return getGetCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCampaignsRequest,
      com.google.ads.googleads.v6.services.MutateCampaignsResponse> getMutateCampaignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaigns",
      requestType = com.google.ads.googleads.v6.services.MutateCampaignsRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateCampaignsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCampaignsRequest,
      com.google.ads.googleads.v6.services.MutateCampaignsResponse> getMutateCampaignsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCampaignsRequest, com.google.ads.googleads.v6.services.MutateCampaignsResponse> getMutateCampaignsMethod;
    if ((getMutateCampaignsMethod = CampaignServiceGrpc.getMutateCampaignsMethod) == null) {
      synchronized (CampaignServiceGrpc.class) {
        if ((getMutateCampaignsMethod = CampaignServiceGrpc.getMutateCampaignsMethod) == null) {
          CampaignServiceGrpc.getMutateCampaignsMethod = getMutateCampaignsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateCampaignsRequest, com.google.ads.googleads.v6.services.MutateCampaignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateCampaignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateCampaignsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignServiceMethodDescriptorSupplier("MutateCampaigns"))
              .build();
        }
      }
    }
    return getMutateCampaignsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignServiceStub>() {
        @java.lang.Override
        public CampaignServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignServiceStub(channel, callOptions);
        }
      };
    return CampaignServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignServiceBlockingStub>() {
        @java.lang.Override
        public CampaignServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignServiceFutureStub>() {
        @java.lang.Override
        public CampaignServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaigns.
   * </pre>
   */
  public static abstract class CampaignServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign in full detail.
     * </pre>
     */
    public void getCampaign(com.google.ads.googleads.v6.services.GetCampaignRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.Campaign> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaigns. Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaigns(com.google.ads.googleads.v6.services.MutateCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCampaignsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCampaignsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetCampaignRequest,
                com.google.ads.googleads.v6.resources.Campaign>(
                  this, METHODID_GET_CAMPAIGN)))
          .addMethod(
            getMutateCampaignsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateCampaignsRequest,
                com.google.ads.googleads.v6.services.MutateCampaignsResponse>(
                  this, METHODID_MUTATE_CAMPAIGNS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaigns.
   * </pre>
   */
  public static final class CampaignServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignServiceStub> {
    private CampaignServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign in full detail.
     * </pre>
     */
    public void getCampaign(com.google.ads.googleads.v6.services.GetCampaignRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.Campaign> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaigns. Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaigns(com.google.ads.googleads.v6.services.MutateCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCampaignsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCampaignsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaigns.
   * </pre>
   */
  public static final class CampaignServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignServiceBlockingStub> {
    private CampaignServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.Campaign getCampaign(com.google.ads.googleads.v6.services.GetCampaignRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaigns. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateCampaignsResponse mutateCampaigns(com.google.ads.googleads.v6.services.MutateCampaignsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCampaignsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaigns.
   * </pre>
   */
  public static final class CampaignServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignServiceFutureStub> {
    private CampaignServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.Campaign> getCampaign(
        com.google.ads.googleads.v6.services.GetCampaignRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaigns. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateCampaignsResponse> mutateCampaigns(
        com.google.ads.googleads.v6.services.MutateCampaignsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCampaignsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN = 0;
  private static final int METHODID_MUTATE_CAMPAIGNS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN:
          serviceImpl.getCampaign((com.google.ads.googleads.v6.services.GetCampaignRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.Campaign>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGNS:
          serviceImpl.mutateCampaigns((com.google.ads.googleads.v6.services.MutateCampaignsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCampaignsResponse>) responseObserver);
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

  private static abstract class CampaignServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.CampaignServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignService");
    }
  }

  private static final class CampaignServiceFileDescriptorSupplier
      extends CampaignServiceBaseDescriptorSupplier {
    CampaignServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignServiceMethodDescriptorSupplier
      extends CampaignServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignMethod())
              .addMethod(getMutateCampaignsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
