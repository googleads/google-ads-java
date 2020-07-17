package com.google.ads.googleads.v4.services;

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
 * Service to manage campaign audience views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/campaign_audience_view_service.proto")
public final class CampaignAudienceViewServiceGrpc {

  private CampaignAudienceViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.CampaignAudienceViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCampaignAudienceViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCampaignAudienceViewRequest,
      com.google.ads.googleads.v4.resources.CampaignAudienceView> METHOD_GET_CAMPAIGN_AUDIENCE_VIEW = getGetCampaignAudienceViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCampaignAudienceViewRequest,
      com.google.ads.googleads.v4.resources.CampaignAudienceView> getGetCampaignAudienceViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCampaignAudienceViewRequest,
      com.google.ads.googleads.v4.resources.CampaignAudienceView> getGetCampaignAudienceViewMethod() {
    return getGetCampaignAudienceViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCampaignAudienceViewRequest,
      com.google.ads.googleads.v4.resources.CampaignAudienceView> getGetCampaignAudienceViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCampaignAudienceViewRequest, com.google.ads.googleads.v4.resources.CampaignAudienceView> getGetCampaignAudienceViewMethod;
    if ((getGetCampaignAudienceViewMethod = CampaignAudienceViewServiceGrpc.getGetCampaignAudienceViewMethod) == null) {
      synchronized (CampaignAudienceViewServiceGrpc.class) {
        if ((getGetCampaignAudienceViewMethod = CampaignAudienceViewServiceGrpc.getGetCampaignAudienceViewMethod) == null) {
          CampaignAudienceViewServiceGrpc.getGetCampaignAudienceViewMethod = getGetCampaignAudienceViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetCampaignAudienceViewRequest, com.google.ads.googleads.v4.resources.CampaignAudienceView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.CampaignAudienceViewService", "GetCampaignAudienceView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetCampaignAudienceViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.CampaignAudienceView.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignAudienceViewServiceMethodDescriptorSupplier("GetCampaignAudienceView"))
                  .build();
          }
        }
     }
     return getGetCampaignAudienceViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignAudienceViewServiceStub newStub(io.grpc.Channel channel) {
    return new CampaignAudienceViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignAudienceViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CampaignAudienceViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignAudienceViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CampaignAudienceViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage campaign audience views.
   * </pre>
   */
  public static abstract class CampaignAudienceViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign audience view in full detail.
     * </pre>
     */
    public void getCampaignAudienceView(com.google.ads.googleads.v4.services.GetCampaignAudienceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CampaignAudienceView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignAudienceViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignAudienceViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetCampaignAudienceViewRequest,
                com.google.ads.googleads.v4.resources.CampaignAudienceView>(
                  this, METHODID_GET_CAMPAIGN_AUDIENCE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign audience views.
   * </pre>
   */
  public static final class CampaignAudienceViewServiceStub extends io.grpc.stub.AbstractStub<CampaignAudienceViewServiceStub> {
    private CampaignAudienceViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignAudienceViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignAudienceViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignAudienceViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign audience view in full detail.
     * </pre>
     */
    public void getCampaignAudienceView(com.google.ads.googleads.v4.services.GetCampaignAudienceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CampaignAudienceView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignAudienceViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign audience views.
   * </pre>
   */
  public static final class CampaignAudienceViewServiceBlockingStub extends io.grpc.stub.AbstractStub<CampaignAudienceViewServiceBlockingStub> {
    private CampaignAudienceViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignAudienceViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignAudienceViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignAudienceViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign audience view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.CampaignAudienceView getCampaignAudienceView(com.google.ads.googleads.v4.services.GetCampaignAudienceViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignAudienceViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign audience views.
   * </pre>
   */
  public static final class CampaignAudienceViewServiceFutureStub extends io.grpc.stub.AbstractStub<CampaignAudienceViewServiceFutureStub> {
    private CampaignAudienceViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignAudienceViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignAudienceViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignAudienceViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign audience view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.CampaignAudienceView> getCampaignAudienceView(
        com.google.ads.googleads.v4.services.GetCampaignAudienceViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignAudienceViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_AUDIENCE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignAudienceViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignAudienceViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_AUDIENCE_VIEW:
          serviceImpl.getCampaignAudienceView((com.google.ads.googleads.v4.services.GetCampaignAudienceViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CampaignAudienceView>) responseObserver);
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

  private static abstract class CampaignAudienceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignAudienceViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.CampaignAudienceViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignAudienceViewService");
    }
  }

  private static final class CampaignAudienceViewServiceFileDescriptorSupplier
      extends CampaignAudienceViewServiceBaseDescriptorSupplier {
    CampaignAudienceViewServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignAudienceViewServiceMethodDescriptorSupplier
      extends CampaignAudienceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignAudienceViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignAudienceViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignAudienceViewServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignAudienceViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
