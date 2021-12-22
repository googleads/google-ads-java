package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Smart campaign search term views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/smart_campaign_search_term_view_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartCampaignSearchTermViewServiceGrpc {

  private SmartCampaignSearchTermViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.SmartCampaignSearchTermViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetSmartCampaignSearchTermViewRequest,
      com.google.ads.googleads.v9.resources.SmartCampaignSearchTermView> getGetSmartCampaignSearchTermViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSmartCampaignSearchTermView",
      requestType = com.google.ads.googleads.v9.services.GetSmartCampaignSearchTermViewRequest.class,
      responseType = com.google.ads.googleads.v9.resources.SmartCampaignSearchTermView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetSmartCampaignSearchTermViewRequest,
      com.google.ads.googleads.v9.resources.SmartCampaignSearchTermView> getGetSmartCampaignSearchTermViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetSmartCampaignSearchTermViewRequest, com.google.ads.googleads.v9.resources.SmartCampaignSearchTermView> getGetSmartCampaignSearchTermViewMethod;
    if ((getGetSmartCampaignSearchTermViewMethod = SmartCampaignSearchTermViewServiceGrpc.getGetSmartCampaignSearchTermViewMethod) == null) {
      synchronized (SmartCampaignSearchTermViewServiceGrpc.class) {
        if ((getGetSmartCampaignSearchTermViewMethod = SmartCampaignSearchTermViewServiceGrpc.getGetSmartCampaignSearchTermViewMethod) == null) {
          SmartCampaignSearchTermViewServiceGrpc.getGetSmartCampaignSearchTermViewMethod = getGetSmartCampaignSearchTermViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetSmartCampaignSearchTermViewRequest, com.google.ads.googleads.v9.resources.SmartCampaignSearchTermView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSmartCampaignSearchTermView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetSmartCampaignSearchTermViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.SmartCampaignSearchTermView.getDefaultInstance()))
              .setSchemaDescriptor(new SmartCampaignSearchTermViewServiceMethodDescriptorSupplier("GetSmartCampaignSearchTermView"))
              .build();
        }
      }
    }
    return getGetSmartCampaignSearchTermViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartCampaignSearchTermViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSearchTermViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSearchTermViewServiceStub>() {
        @java.lang.Override
        public SmartCampaignSearchTermViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartCampaignSearchTermViewServiceStub(channel, callOptions);
        }
      };
    return SmartCampaignSearchTermViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartCampaignSearchTermViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSearchTermViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSearchTermViewServiceBlockingStub>() {
        @java.lang.Override
        public SmartCampaignSearchTermViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartCampaignSearchTermViewServiceBlockingStub(channel, callOptions);
        }
      };
    return SmartCampaignSearchTermViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartCampaignSearchTermViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSearchTermViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartCampaignSearchTermViewServiceFutureStub>() {
        @java.lang.Override
        public SmartCampaignSearchTermViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartCampaignSearchTermViewServiceFutureStub(channel, callOptions);
        }
      };
    return SmartCampaignSearchTermViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Smart campaign search term views.
   * </pre>
   */
  public static abstract class SmartCampaignSearchTermViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the attributes of the requested Smart campaign search term view.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getSmartCampaignSearchTermView(com.google.ads.googleads.v9.services.GetSmartCampaignSearchTermViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.SmartCampaignSearchTermView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSmartCampaignSearchTermViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSmartCampaignSearchTermViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetSmartCampaignSearchTermViewRequest,
                com.google.ads.googleads.v9.resources.SmartCampaignSearchTermView>(
                  this, METHODID_GET_SMART_CAMPAIGN_SEARCH_TERM_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Smart campaign search term views.
   * </pre>
   */
  public static final class SmartCampaignSearchTermViewServiceStub extends io.grpc.stub.AbstractAsyncStub<SmartCampaignSearchTermViewServiceStub> {
    private SmartCampaignSearchTermViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartCampaignSearchTermViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartCampaignSearchTermViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the attributes of the requested Smart campaign search term view.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getSmartCampaignSearchTermView(com.google.ads.googleads.v9.services.GetSmartCampaignSearchTermViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.SmartCampaignSearchTermView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSmartCampaignSearchTermViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Smart campaign search term views.
   * </pre>
   */
  public static final class SmartCampaignSearchTermViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SmartCampaignSearchTermViewServiceBlockingStub> {
    private SmartCampaignSearchTermViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartCampaignSearchTermViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartCampaignSearchTermViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the attributes of the requested Smart campaign search term view.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.SmartCampaignSearchTermView getSmartCampaignSearchTermView(com.google.ads.googleads.v9.services.GetSmartCampaignSearchTermViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSmartCampaignSearchTermViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Smart campaign search term views.
   * </pre>
   */
  public static final class SmartCampaignSearchTermViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SmartCampaignSearchTermViewServiceFutureStub> {
    private SmartCampaignSearchTermViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartCampaignSearchTermViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartCampaignSearchTermViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the attributes of the requested Smart campaign search term view.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.SmartCampaignSearchTermView> getSmartCampaignSearchTermView(
        com.google.ads.googleads.v9.services.GetSmartCampaignSearchTermViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSmartCampaignSearchTermViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SMART_CAMPAIGN_SEARCH_TERM_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartCampaignSearchTermViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartCampaignSearchTermViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SMART_CAMPAIGN_SEARCH_TERM_VIEW:
          serviceImpl.getSmartCampaignSearchTermView((com.google.ads.googleads.v9.services.GetSmartCampaignSearchTermViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.SmartCampaignSearchTermView>) responseObserver);
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

  private static abstract class SmartCampaignSearchTermViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartCampaignSearchTermViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.SmartCampaignSearchTermViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartCampaignSearchTermViewService");
    }
  }

  private static final class SmartCampaignSearchTermViewServiceFileDescriptorSupplier
      extends SmartCampaignSearchTermViewServiceBaseDescriptorSupplier {
    SmartCampaignSearchTermViewServiceFileDescriptorSupplier() {}
  }

  private static final class SmartCampaignSearchTermViewServiceMethodDescriptorSupplier
      extends SmartCampaignSearchTermViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartCampaignSearchTermViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartCampaignSearchTermViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartCampaignSearchTermViewServiceFileDescriptorSupplier())
              .addMethod(getGetSmartCampaignSearchTermViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
