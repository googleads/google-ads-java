package com.google.ads.googleads.v2.services;

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
 * Service to manage campaign shared sets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/campaign_shared_set_service.proto")
public final class CampaignSharedSetServiceGrpc {

  private CampaignSharedSetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.CampaignSharedSetService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCampaignSharedSetMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCampaignSharedSetRequest,
      com.google.ads.googleads.v2.resources.CampaignSharedSet> METHOD_GET_CAMPAIGN_SHARED_SET = getGetCampaignSharedSetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCampaignSharedSetRequest,
      com.google.ads.googleads.v2.resources.CampaignSharedSet> getGetCampaignSharedSetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCampaignSharedSetRequest,
      com.google.ads.googleads.v2.resources.CampaignSharedSet> getGetCampaignSharedSetMethod() {
    return getGetCampaignSharedSetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCampaignSharedSetRequest,
      com.google.ads.googleads.v2.resources.CampaignSharedSet> getGetCampaignSharedSetMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCampaignSharedSetRequest, com.google.ads.googleads.v2.resources.CampaignSharedSet> getGetCampaignSharedSetMethod;
    if ((getGetCampaignSharedSetMethod = CampaignSharedSetServiceGrpc.getGetCampaignSharedSetMethod) == null) {
      synchronized (CampaignSharedSetServiceGrpc.class) {
        if ((getGetCampaignSharedSetMethod = CampaignSharedSetServiceGrpc.getGetCampaignSharedSetMethod) == null) {
          CampaignSharedSetServiceGrpc.getGetCampaignSharedSetMethod = getGetCampaignSharedSetMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetCampaignSharedSetRequest, com.google.ads.googleads.v2.resources.CampaignSharedSet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.CampaignSharedSetService", "GetCampaignSharedSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetCampaignSharedSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.CampaignSharedSet.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignSharedSetServiceMethodDescriptorSupplier("GetCampaignSharedSet"))
                  .build();
          }
        }
     }
     return getGetCampaignSharedSetMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateCampaignSharedSetsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCampaignSharedSetsRequest,
      com.google.ads.googleads.v2.services.MutateCampaignSharedSetsResponse> METHOD_MUTATE_CAMPAIGN_SHARED_SETS = getMutateCampaignSharedSetsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCampaignSharedSetsRequest,
      com.google.ads.googleads.v2.services.MutateCampaignSharedSetsResponse> getMutateCampaignSharedSetsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCampaignSharedSetsRequest,
      com.google.ads.googleads.v2.services.MutateCampaignSharedSetsResponse> getMutateCampaignSharedSetsMethod() {
    return getMutateCampaignSharedSetsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCampaignSharedSetsRequest,
      com.google.ads.googleads.v2.services.MutateCampaignSharedSetsResponse> getMutateCampaignSharedSetsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCampaignSharedSetsRequest, com.google.ads.googleads.v2.services.MutateCampaignSharedSetsResponse> getMutateCampaignSharedSetsMethod;
    if ((getMutateCampaignSharedSetsMethod = CampaignSharedSetServiceGrpc.getMutateCampaignSharedSetsMethod) == null) {
      synchronized (CampaignSharedSetServiceGrpc.class) {
        if ((getMutateCampaignSharedSetsMethod = CampaignSharedSetServiceGrpc.getMutateCampaignSharedSetsMethod) == null) {
          CampaignSharedSetServiceGrpc.getMutateCampaignSharedSetsMethod = getMutateCampaignSharedSetsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.MutateCampaignSharedSetsRequest, com.google.ads.googleads.v2.services.MutateCampaignSharedSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.CampaignSharedSetService", "MutateCampaignSharedSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateCampaignSharedSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateCampaignSharedSetsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignSharedSetServiceMethodDescriptorSupplier("MutateCampaignSharedSets"))
                  .build();
          }
        }
     }
     return getMutateCampaignSharedSetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignSharedSetServiceStub newStub(io.grpc.Channel channel) {
    return new CampaignSharedSetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignSharedSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CampaignSharedSetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignSharedSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CampaignSharedSetServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage campaign shared sets.
   * </pre>
   */
  public static abstract class CampaignSharedSetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign shared set in full detail.
     * </pre>
     */
    public void getCampaignSharedSet(com.google.ads.googleads.v2.services.GetCampaignSharedSetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.CampaignSharedSet> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignSharedSetMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates or removes campaign shared sets. Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignSharedSets(com.google.ads.googleads.v2.services.MutateCampaignSharedSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateCampaignSharedSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCampaignSharedSetsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignSharedSetMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetCampaignSharedSetRequest,
                com.google.ads.googleads.v2.resources.CampaignSharedSet>(
                  this, METHODID_GET_CAMPAIGN_SHARED_SET)))
          .addMethod(
            getMutateCampaignSharedSetsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.MutateCampaignSharedSetsRequest,
                com.google.ads.googleads.v2.services.MutateCampaignSharedSetsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_SHARED_SETS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign shared sets.
   * </pre>
   */
  public static final class CampaignSharedSetServiceStub extends io.grpc.stub.AbstractStub<CampaignSharedSetServiceStub> {
    private CampaignSharedSetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignSharedSetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignSharedSetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignSharedSetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign shared set in full detail.
     * </pre>
     */
    public void getCampaignSharedSet(com.google.ads.googleads.v2.services.GetCampaignSharedSetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.CampaignSharedSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignSharedSetMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or removes campaign shared sets. Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignSharedSets(com.google.ads.googleads.v2.services.MutateCampaignSharedSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateCampaignSharedSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCampaignSharedSetsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign shared sets.
   * </pre>
   */
  public static final class CampaignSharedSetServiceBlockingStub extends io.grpc.stub.AbstractStub<CampaignSharedSetServiceBlockingStub> {
    private CampaignSharedSetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignSharedSetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignSharedSetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignSharedSetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign shared set in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.CampaignSharedSet getCampaignSharedSet(com.google.ads.googleads.v2.services.GetCampaignSharedSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignSharedSetMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or removes campaign shared sets. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.MutateCampaignSharedSetsResponse mutateCampaignSharedSets(com.google.ads.googleads.v2.services.MutateCampaignSharedSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCampaignSharedSetsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign shared sets.
   * </pre>
   */
  public static final class CampaignSharedSetServiceFutureStub extends io.grpc.stub.AbstractStub<CampaignSharedSetServiceFutureStub> {
    private CampaignSharedSetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignSharedSetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignSharedSetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignSharedSetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign shared set in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.CampaignSharedSet> getCampaignSharedSet(
        com.google.ads.googleads.v2.services.GetCampaignSharedSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignSharedSetMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or removes campaign shared sets. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.MutateCampaignSharedSetsResponse> mutateCampaignSharedSets(
        com.google.ads.googleads.v2.services.MutateCampaignSharedSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCampaignSharedSetsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_SHARED_SET = 0;
  private static final int METHODID_MUTATE_CAMPAIGN_SHARED_SETS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignSharedSetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignSharedSetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_SHARED_SET:
          serviceImpl.getCampaignSharedSet((com.google.ads.googleads.v2.services.GetCampaignSharedSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.CampaignSharedSet>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_SHARED_SETS:
          serviceImpl.mutateCampaignSharedSets((com.google.ads.googleads.v2.services.MutateCampaignSharedSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateCampaignSharedSetsResponse>) responseObserver);
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

  private static abstract class CampaignSharedSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignSharedSetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.CampaignSharedSetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignSharedSetService");
    }
  }

  private static final class CampaignSharedSetServiceFileDescriptorSupplier
      extends CampaignSharedSetServiceBaseDescriptorSupplier {
    CampaignSharedSetServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignSharedSetServiceMethodDescriptorSupplier
      extends CampaignSharedSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignSharedSetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignSharedSetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignSharedSetServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignSharedSetMethodHelper())
              .addMethod(getMutateCampaignSharedSetsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
