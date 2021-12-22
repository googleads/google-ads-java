package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage campaign audience views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/campaign_audience_view_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignAudienceViewServiceGrpc {

  private CampaignAudienceViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.CampaignAudienceViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCampaignAudienceViewRequest,
      com.google.ads.googleads.v9.resources.CampaignAudienceView> getGetCampaignAudienceViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignAudienceView",
      requestType = com.google.ads.googleads.v9.services.GetCampaignAudienceViewRequest.class,
      responseType = com.google.ads.googleads.v9.resources.CampaignAudienceView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCampaignAudienceViewRequest,
      com.google.ads.googleads.v9.resources.CampaignAudienceView> getGetCampaignAudienceViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCampaignAudienceViewRequest, com.google.ads.googleads.v9.resources.CampaignAudienceView> getGetCampaignAudienceViewMethod;
    if ((getGetCampaignAudienceViewMethod = CampaignAudienceViewServiceGrpc.getGetCampaignAudienceViewMethod) == null) {
      synchronized (CampaignAudienceViewServiceGrpc.class) {
        if ((getGetCampaignAudienceViewMethod = CampaignAudienceViewServiceGrpc.getGetCampaignAudienceViewMethod) == null) {
          CampaignAudienceViewServiceGrpc.getGetCampaignAudienceViewMethod = getGetCampaignAudienceViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetCampaignAudienceViewRequest, com.google.ads.googleads.v9.resources.CampaignAudienceView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignAudienceView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetCampaignAudienceViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.CampaignAudienceView.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<CampaignAudienceViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignAudienceViewServiceStub>() {
        @java.lang.Override
        public CampaignAudienceViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignAudienceViewServiceStub(channel, callOptions);
        }
      };
    return CampaignAudienceViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignAudienceViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignAudienceViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignAudienceViewServiceBlockingStub>() {
        @java.lang.Override
        public CampaignAudienceViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignAudienceViewServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignAudienceViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignAudienceViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignAudienceViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignAudienceViewServiceFutureStub>() {
        @java.lang.Override
        public CampaignAudienceViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignAudienceViewServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignAudienceViewServiceFutureStub.newStub(factory, channel);
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
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCampaignAudienceView(com.google.ads.googleads.v9.services.GetCampaignAudienceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CampaignAudienceView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCampaignAudienceViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignAudienceViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetCampaignAudienceViewRequest,
                com.google.ads.googleads.v9.resources.CampaignAudienceView>(
                  this, METHODID_GET_CAMPAIGN_AUDIENCE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign audience views.
   * </pre>
   */
  public static final class CampaignAudienceViewServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignAudienceViewServiceStub> {
    private CampaignAudienceViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignAudienceViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignAudienceViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign audience view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCampaignAudienceView(com.google.ads.googleads.v9.services.GetCampaignAudienceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CampaignAudienceView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCampaignAudienceViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign audience views.
   * </pre>
   */
  public static final class CampaignAudienceViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignAudienceViewServiceBlockingStub> {
    private CampaignAudienceViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignAudienceViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignAudienceViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign audience view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.CampaignAudienceView getCampaignAudienceView(com.google.ads.googleads.v9.services.GetCampaignAudienceViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCampaignAudienceViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign audience views.
   * </pre>
   */
  public static final class CampaignAudienceViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignAudienceViewServiceFutureStub> {
    private CampaignAudienceViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignAudienceViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignAudienceViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign audience view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.CampaignAudienceView> getCampaignAudienceView(
        com.google.ads.googleads.v9.services.GetCampaignAudienceViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCampaignAudienceViewMethod(), getCallOptions()), request);
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
          serviceImpl.getCampaignAudienceView((com.google.ads.googleads.v9.services.GetCampaignAudienceViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CampaignAudienceView>) responseObserver);
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
      return com.google.ads.googleads.v9.services.CampaignAudienceViewServiceProto.getDescriptor();
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
              .addMethod(getGetCampaignAudienceViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
