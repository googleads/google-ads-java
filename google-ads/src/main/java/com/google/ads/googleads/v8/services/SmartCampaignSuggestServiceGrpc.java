package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to get suggestions for Smart Campaigns.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/smart_campaign_suggest_service.proto")
public final class SmartCampaignSuggestServiceGrpc {

  private SmartCampaignSuggestServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.SmartCampaignSuggestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsRequest,
      com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse> getSuggestSmartCampaignBudgetOptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestSmartCampaignBudgetOptions",
      requestType = com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsRequest.class,
      responseType = com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsRequest,
      com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse> getSuggestSmartCampaignBudgetOptionsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsRequest, com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse> getSuggestSmartCampaignBudgetOptionsMethod;
    if ((getSuggestSmartCampaignBudgetOptionsMethod = SmartCampaignSuggestServiceGrpc.getSuggestSmartCampaignBudgetOptionsMethod) == null) {
      synchronized (SmartCampaignSuggestServiceGrpc.class) {
        if ((getSuggestSmartCampaignBudgetOptionsMethod = SmartCampaignSuggestServiceGrpc.getSuggestSmartCampaignBudgetOptionsMethod) == null) {
          SmartCampaignSuggestServiceGrpc.getSuggestSmartCampaignBudgetOptionsMethod = getSuggestSmartCampaignBudgetOptionsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsRequest, com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuggestSmartCampaignBudgetOptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartCampaignSuggestServiceMethodDescriptorSupplier("SuggestSmartCampaignBudgetOptions"))
              .build();
        }
      }
    }
    return getSuggestSmartCampaignBudgetOptionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartCampaignSuggestServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSuggestServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSuggestServiceStub>() {
        @java.lang.Override
        public SmartCampaignSuggestServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartCampaignSuggestServiceStub(channel, callOptions);
        }
      };
    return SmartCampaignSuggestServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartCampaignSuggestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSuggestServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSuggestServiceBlockingStub>() {
        @java.lang.Override
        public SmartCampaignSuggestServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartCampaignSuggestServiceBlockingStub(channel, callOptions);
        }
      };
    return SmartCampaignSuggestServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartCampaignSuggestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSuggestServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSuggestServiceFutureStub>() {
        @java.lang.Override
        public SmartCampaignSuggestServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartCampaignSuggestServiceFutureStub(channel, callOptions);
        }
      };
    return SmartCampaignSuggestServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to get suggestions for Smart Campaigns.
   * </pre>
   */
  public static abstract class SmartCampaignSuggestServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns BudgetOption suggestions.
     * </pre>
     */
    public void suggestSmartCampaignBudgetOptions(com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestSmartCampaignBudgetOptionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSuggestSmartCampaignBudgetOptionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsRequest,
                com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse>(
                  this, METHODID_SUGGEST_SMART_CAMPAIGN_BUDGET_OPTIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to get suggestions for Smart Campaigns.
   * </pre>
   */
  public static final class SmartCampaignSuggestServiceStub extends io.grpc.stub.AbstractAsyncStub<SmartCampaignSuggestServiceStub> {
    private SmartCampaignSuggestServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartCampaignSuggestServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartCampaignSuggestServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns BudgetOption suggestions.
     * </pre>
     */
    public void suggestSmartCampaignBudgetOptions(com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestSmartCampaignBudgetOptionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to get suggestions for Smart Campaigns.
   * </pre>
   */
  public static final class SmartCampaignSuggestServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SmartCampaignSuggestServiceBlockingStub> {
    private SmartCampaignSuggestServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartCampaignSuggestServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartCampaignSuggestServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns BudgetOption suggestions.
     * </pre>
     */
    public com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse suggestSmartCampaignBudgetOptions(com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestSmartCampaignBudgetOptionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to get suggestions for Smart Campaigns.
   * </pre>
   */
  public static final class SmartCampaignSuggestServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SmartCampaignSuggestServiceFutureStub> {
    private SmartCampaignSuggestServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartCampaignSuggestServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartCampaignSuggestServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns BudgetOption suggestions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse> suggestSmartCampaignBudgetOptions(
        com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestSmartCampaignBudgetOptionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUGGEST_SMART_CAMPAIGN_BUDGET_OPTIONS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartCampaignSuggestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartCampaignSuggestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUGGEST_SMART_CAMPAIGN_BUDGET_OPTIONS:
          serviceImpl.suggestSmartCampaignBudgetOptions((com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse>) responseObserver);
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

  private static abstract class SmartCampaignSuggestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartCampaignSuggestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.SmartCampaignSuggestServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartCampaignSuggestService");
    }
  }

  private static final class SmartCampaignSuggestServiceFileDescriptorSupplier
      extends SmartCampaignSuggestServiceBaseDescriptorSupplier {
    SmartCampaignSuggestServiceFileDescriptorSupplier() {}
  }

  private static final class SmartCampaignSuggestServiceMethodDescriptorSupplier
      extends SmartCampaignSuggestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartCampaignSuggestServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartCampaignSuggestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartCampaignSuggestServiceFileDescriptorSupplier())
              .addMethod(getSuggestSmartCampaignBudgetOptionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
