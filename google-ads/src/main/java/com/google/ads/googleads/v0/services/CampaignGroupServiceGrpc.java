package com.google.ads.googleads.v0.services;

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
 * Service to manage campaign groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v0/services/campaign_group_service.proto")
public final class CampaignGroupServiceGrpc {

  private CampaignGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.CampaignGroupService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCampaignGroupMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignGroupRequest,
      com.google.ads.googleads.v0.resources.CampaignGroup> METHOD_GET_CAMPAIGN_GROUP = getGetCampaignGroupMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignGroupRequest,
      com.google.ads.googleads.v0.resources.CampaignGroup> getGetCampaignGroupMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignGroupRequest,
      com.google.ads.googleads.v0.resources.CampaignGroup> getGetCampaignGroupMethod() {
    return getGetCampaignGroupMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignGroupRequest,
      com.google.ads.googleads.v0.resources.CampaignGroup> getGetCampaignGroupMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignGroupRequest, com.google.ads.googleads.v0.resources.CampaignGroup> getGetCampaignGroupMethod;
    if ((getGetCampaignGroupMethod = CampaignGroupServiceGrpc.getGetCampaignGroupMethod) == null) {
      synchronized (CampaignGroupServiceGrpc.class) {
        if ((getGetCampaignGroupMethod = CampaignGroupServiceGrpc.getGetCampaignGroupMethod) == null) {
          CampaignGroupServiceGrpc.getGetCampaignGroupMethod = getGetCampaignGroupMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.GetCampaignGroupRequest, com.google.ads.googleads.v0.resources.CampaignGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.CampaignGroupService", "GetCampaignGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.GetCampaignGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.resources.CampaignGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignGroupServiceMethodDescriptorSupplier("GetCampaignGroup"))
                  .build();
          }
        }
     }
     return getGetCampaignGroupMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateCampaignGroupsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest,
      com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse> METHOD_MUTATE_CAMPAIGN_GROUPS = getMutateCampaignGroupsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest,
      com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse> getMutateCampaignGroupsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest,
      com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse> getMutateCampaignGroupsMethod() {
    return getMutateCampaignGroupsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest,
      com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse> getMutateCampaignGroupsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest, com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse> getMutateCampaignGroupsMethod;
    if ((getMutateCampaignGroupsMethod = CampaignGroupServiceGrpc.getMutateCampaignGroupsMethod) == null) {
      synchronized (CampaignGroupServiceGrpc.class) {
        if ((getMutateCampaignGroupsMethod = CampaignGroupServiceGrpc.getMutateCampaignGroupsMethod) == null) {
          CampaignGroupServiceGrpc.getMutateCampaignGroupsMethod = getMutateCampaignGroupsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest, com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.CampaignGroupService", "MutateCampaignGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse.getDefaultInstance()))
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
    return new CampaignGroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CampaignGroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CampaignGroupServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage campaign groups.
   * </pre>
   */
  public static abstract class CampaignGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign group in full detail.
     * </pre>
     */
    public void getCampaignGroup(com.google.ads.googleads.v0.services.GetCampaignGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CampaignGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignGroupMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign groups. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignGroups(com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCampaignGroupsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignGroupMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetCampaignGroupRequest,
                com.google.ads.googleads.v0.resources.CampaignGroup>(
                  this, METHODID_GET_CAMPAIGN_GROUP)))
          .addMethod(
            getMutateCampaignGroupsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest,
                com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_GROUPS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign groups.
   * </pre>
   */
  public static final class CampaignGroupServiceStub extends io.grpc.stub.AbstractStub<CampaignGroupServiceStub> {
    private CampaignGroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignGroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignGroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign group in full detail.
     * </pre>
     */
    public void getCampaignGroup(com.google.ads.googleads.v0.services.GetCampaignGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CampaignGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignGroupMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign groups. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignGroups(com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCampaignGroupsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign groups.
   * </pre>
   */
  public static final class CampaignGroupServiceBlockingStub extends io.grpc.stub.AbstractStub<CampaignGroupServiceBlockingStub> {
    private CampaignGroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignGroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignGroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign group in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.CampaignGroup getCampaignGroup(com.google.ads.googleads.v0.services.GetCampaignGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignGroupMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign groups. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse mutateCampaignGroups(com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCampaignGroupsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign groups.
   * </pre>
   */
  public static final class CampaignGroupServiceFutureStub extends io.grpc.stub.AbstractStub<CampaignGroupServiceFutureStub> {
    private CampaignGroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignGroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignGroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign group in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.CampaignGroup> getCampaignGroup(
        com.google.ads.googleads.v0.services.GetCampaignGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignGroupMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign groups. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse> mutateCampaignGroups(
        com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCampaignGroupsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_GROUP = 0;
  private static final int METHODID_MUTATE_CAMPAIGN_GROUPS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_GROUP:
          serviceImpl.getCampaignGroup((com.google.ads.googleads.v0.services.GetCampaignGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CampaignGroup>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_GROUPS:
          serviceImpl.mutateCampaignGroups((com.google.ads.googleads.v0.services.MutateCampaignGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCampaignGroupsResponse>) responseObserver);
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

  private static abstract class CampaignGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.CampaignGroupServiceProto.getDescriptor();
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
    private final String methodName;

    CampaignGroupServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getGetCampaignGroupMethodHelper())
              .addMethod(getMutateCampaignGroupsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
