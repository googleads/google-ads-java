package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage campaign customizer
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/campaign_customizer_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignCustomizerServiceGrpc {

  private CampaignCustomizerServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.CampaignCustomizerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCampaignCustomizersRequest,
      com.google.ads.googleads.v9.services.MutateCampaignCustomizersResponse> getMutateCampaignCustomizersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignCustomizers",
      requestType = com.google.ads.googleads.v9.services.MutateCampaignCustomizersRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateCampaignCustomizersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCampaignCustomizersRequest,
      com.google.ads.googleads.v9.services.MutateCampaignCustomizersResponse> getMutateCampaignCustomizersMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCampaignCustomizersRequest, com.google.ads.googleads.v9.services.MutateCampaignCustomizersResponse> getMutateCampaignCustomizersMethod;
    if ((getMutateCampaignCustomizersMethod = CampaignCustomizerServiceGrpc.getMutateCampaignCustomizersMethod) == null) {
      synchronized (CampaignCustomizerServiceGrpc.class) {
        if ((getMutateCampaignCustomizersMethod = CampaignCustomizerServiceGrpc.getMutateCampaignCustomizersMethod) == null) {
          CampaignCustomizerServiceGrpc.getMutateCampaignCustomizersMethod = getMutateCampaignCustomizersMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateCampaignCustomizersRequest, com.google.ads.googleads.v9.services.MutateCampaignCustomizersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignCustomizers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCampaignCustomizersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCampaignCustomizersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignCustomizerServiceMethodDescriptorSupplier("MutateCampaignCustomizers"))
              .build();
        }
      }
    }
    return getMutateCampaignCustomizersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignCustomizerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignCustomizerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignCustomizerServiceStub>() {
        @java.lang.Override
        public CampaignCustomizerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignCustomizerServiceStub(channel, callOptions);
        }
      };
    return CampaignCustomizerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignCustomizerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignCustomizerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignCustomizerServiceBlockingStub>() {
        @java.lang.Override
        public CampaignCustomizerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignCustomizerServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignCustomizerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignCustomizerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignCustomizerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignCustomizerServiceFutureStub>() {
        @java.lang.Override
        public CampaignCustomizerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignCustomizerServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignCustomizerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaign customizer
   * </pre>
   */
  public static abstract class CampaignCustomizerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates or removes campaign customizers. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignCustomizers(com.google.ads.googleads.v9.services.MutateCampaignCustomizersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCampaignCustomizersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCampaignCustomizersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateCampaignCustomizersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateCampaignCustomizersRequest,
                com.google.ads.googleads.v9.services.MutateCampaignCustomizersResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_CUSTOMIZERS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign customizer
   * </pre>
   */
  public static final class CampaignCustomizerServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignCustomizerServiceStub> {
    private CampaignCustomizerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCustomizerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignCustomizerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes campaign customizers. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignCustomizers(com.google.ads.googleads.v9.services.MutateCampaignCustomizersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCampaignCustomizersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCampaignCustomizersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign customizer
   * </pre>
   */
  public static final class CampaignCustomizerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignCustomizerServiceBlockingStub> {
    private CampaignCustomizerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCustomizerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignCustomizerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes campaign customizers. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v9.services.MutateCampaignCustomizersResponse mutateCampaignCustomizers(com.google.ads.googleads.v9.services.MutateCampaignCustomizersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignCustomizersMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign customizer
   * </pre>
   */
  public static final class CampaignCustomizerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignCustomizerServiceFutureStub> {
    private CampaignCustomizerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCustomizerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignCustomizerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes campaign customizers. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateCampaignCustomizersResponse> mutateCampaignCustomizers(
        com.google.ads.googleads.v9.services.MutateCampaignCustomizersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCampaignCustomizersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CAMPAIGN_CUSTOMIZERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignCustomizerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignCustomizerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_CAMPAIGN_CUSTOMIZERS:
          serviceImpl.mutateCampaignCustomizers((com.google.ads.googleads.v9.services.MutateCampaignCustomizersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCampaignCustomizersResponse>) responseObserver);
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

  private static abstract class CampaignCustomizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignCustomizerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.CampaignCustomizerServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignCustomizerService");
    }
  }

  private static final class CampaignCustomizerServiceFileDescriptorSupplier
      extends CampaignCustomizerServiceBaseDescriptorSupplier {
    CampaignCustomizerServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignCustomizerServiceMethodDescriptorSupplier
      extends CampaignCustomizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignCustomizerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignCustomizerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignCustomizerServiceFileDescriptorSupplier())
              .addMethod(getMutateCampaignCustomizersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
