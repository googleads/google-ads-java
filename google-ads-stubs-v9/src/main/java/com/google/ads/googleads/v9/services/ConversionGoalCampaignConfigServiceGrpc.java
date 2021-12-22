package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage conversion goal campaign config.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/conversion_goal_campaign_config_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConversionGoalCampaignConfigServiceGrpc {

  private ConversionGoalCampaignConfigServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.ConversionGoalCampaignConfigService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsRequest,
      com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsResponse> getMutateConversionGoalCampaignConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateConversionGoalCampaignConfigs",
      requestType = com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsRequest,
      com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsResponse> getMutateConversionGoalCampaignConfigsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsRequest, com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsResponse> getMutateConversionGoalCampaignConfigsMethod;
    if ((getMutateConversionGoalCampaignConfigsMethod = ConversionGoalCampaignConfigServiceGrpc.getMutateConversionGoalCampaignConfigsMethod) == null) {
      synchronized (ConversionGoalCampaignConfigServiceGrpc.class) {
        if ((getMutateConversionGoalCampaignConfigsMethod = ConversionGoalCampaignConfigServiceGrpc.getMutateConversionGoalCampaignConfigsMethod) == null) {
          ConversionGoalCampaignConfigServiceGrpc.getMutateConversionGoalCampaignConfigsMethod = getMutateConversionGoalCampaignConfigsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsRequest, com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateConversionGoalCampaignConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConversionGoalCampaignConfigServiceMethodDescriptorSupplier("MutateConversionGoalCampaignConfigs"))
              .build();
        }
      }
    }
    return getMutateConversionGoalCampaignConfigsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConversionGoalCampaignConfigServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionGoalCampaignConfigServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionGoalCampaignConfigServiceStub>() {
        @java.lang.Override
        public ConversionGoalCampaignConfigServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionGoalCampaignConfigServiceStub(channel, callOptions);
        }
      };
    return ConversionGoalCampaignConfigServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConversionGoalCampaignConfigServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionGoalCampaignConfigServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionGoalCampaignConfigServiceBlockingStub>() {
        @java.lang.Override
        public ConversionGoalCampaignConfigServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionGoalCampaignConfigServiceBlockingStub(channel, callOptions);
        }
      };
    return ConversionGoalCampaignConfigServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConversionGoalCampaignConfigServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionGoalCampaignConfigServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionGoalCampaignConfigServiceFutureStub>() {
        @java.lang.Override
        public ConversionGoalCampaignConfigServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionGoalCampaignConfigServiceFutureStub(channel, callOptions);
        }
      };
    return ConversionGoalCampaignConfigServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage conversion goal campaign config.
   * </pre>
   */
  public static abstract class ConversionGoalCampaignConfigServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates or removes conversion goal campaign config. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateConversionGoalCampaignConfigs(com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateConversionGoalCampaignConfigsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateConversionGoalCampaignConfigsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsRequest,
                com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsResponse>(
                  this, METHODID_MUTATE_CONVERSION_GOAL_CAMPAIGN_CONFIGS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage conversion goal campaign config.
   * </pre>
   */
  public static final class ConversionGoalCampaignConfigServiceStub extends io.grpc.stub.AbstractAsyncStub<ConversionGoalCampaignConfigServiceStub> {
    private ConversionGoalCampaignConfigServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionGoalCampaignConfigServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionGoalCampaignConfigServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion goal campaign config. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateConversionGoalCampaignConfigs(com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateConversionGoalCampaignConfigsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage conversion goal campaign config.
   * </pre>
   */
  public static final class ConversionGoalCampaignConfigServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConversionGoalCampaignConfigServiceBlockingStub> {
    private ConversionGoalCampaignConfigServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionGoalCampaignConfigServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionGoalCampaignConfigServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion goal campaign config. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsResponse mutateConversionGoalCampaignConfigs(com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateConversionGoalCampaignConfigsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage conversion goal campaign config.
   * </pre>
   */
  public static final class ConversionGoalCampaignConfigServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConversionGoalCampaignConfigServiceFutureStub> {
    private ConversionGoalCampaignConfigServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionGoalCampaignConfigServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionGoalCampaignConfigServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion goal campaign config. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsResponse> mutateConversionGoalCampaignConfigs(
        com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateConversionGoalCampaignConfigsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CONVERSION_GOAL_CAMPAIGN_CONFIGS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConversionGoalCampaignConfigServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConversionGoalCampaignConfigServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_CONVERSION_GOAL_CAMPAIGN_CONFIGS:
          serviceImpl.mutateConversionGoalCampaignConfigs((com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigsResponse>) responseObserver);
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

  private static abstract class ConversionGoalCampaignConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversionGoalCampaignConfigServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.ConversionGoalCampaignConfigServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConversionGoalCampaignConfigService");
    }
  }

  private static final class ConversionGoalCampaignConfigServiceFileDescriptorSupplier
      extends ConversionGoalCampaignConfigServiceBaseDescriptorSupplier {
    ConversionGoalCampaignConfigServiceFileDescriptorSupplier() {}
  }

  private static final class ConversionGoalCampaignConfigServiceMethodDescriptorSupplier
      extends ConversionGoalCampaignConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConversionGoalCampaignConfigServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConversionGoalCampaignConfigServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConversionGoalCampaignConfigServiceFileDescriptorSupplier())
              .addMethod(getMutateConversionGoalCampaignConfigsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
