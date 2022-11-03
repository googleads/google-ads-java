package com.google.ads.googleads.v12.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage campaign conversion goal.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v12/services/campaign_conversion_goal_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignConversionGoalServiceGrpc {

  private CampaignConversionGoalServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v12.services.CampaignConversionGoalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsRequest,
      com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsResponse> getMutateCampaignConversionGoalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignConversionGoals",
      requestType = com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsRequest.class,
      responseType = com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsRequest,
      com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsResponse> getMutateCampaignConversionGoalsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsRequest, com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsResponse> getMutateCampaignConversionGoalsMethod;
    if ((getMutateCampaignConversionGoalsMethod = CampaignConversionGoalServiceGrpc.getMutateCampaignConversionGoalsMethod) == null) {
      synchronized (CampaignConversionGoalServiceGrpc.class) {
        if ((getMutateCampaignConversionGoalsMethod = CampaignConversionGoalServiceGrpc.getMutateCampaignConversionGoalsMethod) == null) {
          CampaignConversionGoalServiceGrpc.getMutateCampaignConversionGoalsMethod = getMutateCampaignConversionGoalsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsRequest, com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignConversionGoals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignConversionGoalServiceMethodDescriptorSupplier("MutateCampaignConversionGoals"))
              .build();
        }
      }
    }
    return getMutateCampaignConversionGoalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignConversionGoalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignConversionGoalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignConversionGoalServiceStub>() {
        @java.lang.Override
        public CampaignConversionGoalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignConversionGoalServiceStub(channel, callOptions);
        }
      };
    return CampaignConversionGoalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignConversionGoalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignConversionGoalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignConversionGoalServiceBlockingStub>() {
        @java.lang.Override
        public CampaignConversionGoalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignConversionGoalServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignConversionGoalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignConversionGoalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignConversionGoalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignConversionGoalServiceFutureStub>() {
        @java.lang.Override
        public CampaignConversionGoalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignConversionGoalServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignConversionGoalServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaign conversion goal.
   * </pre>
   */
  public static abstract class CampaignConversionGoalServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates or removes campaign conversion goals. Operation statuses
     * are returned.
     * </pre>
     */
    public void mutateCampaignConversionGoals(com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCampaignConversionGoalsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateCampaignConversionGoalsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsRequest,
                com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_CONVERSION_GOALS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign conversion goal.
   * </pre>
   */
  public static final class CampaignConversionGoalServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignConversionGoalServiceStub> {
    private CampaignConversionGoalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignConversionGoalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignConversionGoalServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes campaign conversion goals. Operation statuses
     * are returned.
     * </pre>
     */
    public void mutateCampaignConversionGoals(com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCampaignConversionGoalsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign conversion goal.
   * </pre>
   */
  public static final class CampaignConversionGoalServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignConversionGoalServiceBlockingStub> {
    private CampaignConversionGoalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignConversionGoalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignConversionGoalServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes campaign conversion goals. Operation statuses
     * are returned.
     * </pre>
     */
    public com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsResponse mutateCampaignConversionGoals(com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignConversionGoalsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign conversion goal.
   * </pre>
   */
  public static final class CampaignConversionGoalServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignConversionGoalServiceFutureStub> {
    private CampaignConversionGoalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignConversionGoalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignConversionGoalServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes campaign conversion goals. Operation statuses
     * are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsResponse> mutateCampaignConversionGoals(
        com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCampaignConversionGoalsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CAMPAIGN_CONVERSION_GOALS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignConversionGoalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignConversionGoalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_CAMPAIGN_CONVERSION_GOALS:
          serviceImpl.mutateCampaignConversionGoals((com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateCampaignConversionGoalsResponse>) responseObserver);
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

  private static abstract class CampaignConversionGoalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignConversionGoalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v12.services.CampaignConversionGoalServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignConversionGoalService");
    }
  }

  private static final class CampaignConversionGoalServiceFileDescriptorSupplier
      extends CampaignConversionGoalServiceBaseDescriptorSupplier {
    CampaignConversionGoalServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignConversionGoalServiceMethodDescriptorSupplier
      extends CampaignConversionGoalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignConversionGoalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignConversionGoalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignConversionGoalServiceFileDescriptorSupplier())
              .addMethod(getMutateCampaignConversionGoalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
