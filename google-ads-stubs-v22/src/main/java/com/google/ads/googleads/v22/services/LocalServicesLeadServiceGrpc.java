package com.google.ads.googleads.v22.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service allows management of LocalServicesLead resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v22/services/local_services_lead_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LocalServicesLeadServiceGrpc {

  private LocalServicesLeadServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v22.services.LocalServicesLeadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.AppendLeadConversationRequest,
      com.google.ads.googleads.v22.services.AppendLeadConversationResponse> getAppendLeadConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppendLeadConversation",
      requestType = com.google.ads.googleads.v22.services.AppendLeadConversationRequest.class,
      responseType = com.google.ads.googleads.v22.services.AppendLeadConversationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.AppendLeadConversationRequest,
      com.google.ads.googleads.v22.services.AppendLeadConversationResponse> getAppendLeadConversationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.AppendLeadConversationRequest, com.google.ads.googleads.v22.services.AppendLeadConversationResponse> getAppendLeadConversationMethod;
    if ((getAppendLeadConversationMethod = LocalServicesLeadServiceGrpc.getAppendLeadConversationMethod) == null) {
      synchronized (LocalServicesLeadServiceGrpc.class) {
        if ((getAppendLeadConversationMethod = LocalServicesLeadServiceGrpc.getAppendLeadConversationMethod) == null) {
          LocalServicesLeadServiceGrpc.getAppendLeadConversationMethod = getAppendLeadConversationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v22.services.AppendLeadConversationRequest, com.google.ads.googleads.v22.services.AppendLeadConversationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AppendLeadConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.AppendLeadConversationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.AppendLeadConversationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LocalServicesLeadServiceMethodDescriptorSupplier("AppendLeadConversation"))
              .build();
        }
      }
    }
    return getAppendLeadConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest,
      com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse> getProvideLeadFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvideLeadFeedback",
      requestType = com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest.class,
      responseType = com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest,
      com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse> getProvideLeadFeedbackMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest, com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse> getProvideLeadFeedbackMethod;
    if ((getProvideLeadFeedbackMethod = LocalServicesLeadServiceGrpc.getProvideLeadFeedbackMethod) == null) {
      synchronized (LocalServicesLeadServiceGrpc.class) {
        if ((getProvideLeadFeedbackMethod = LocalServicesLeadServiceGrpc.getProvideLeadFeedbackMethod) == null) {
          LocalServicesLeadServiceGrpc.getProvideLeadFeedbackMethod = getProvideLeadFeedbackMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest, com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvideLeadFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LocalServicesLeadServiceMethodDescriptorSupplier("ProvideLeadFeedback"))
              .build();
        }
      }
    }
    return getProvideLeadFeedbackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocalServicesLeadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocalServicesLeadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocalServicesLeadServiceStub>() {
        @java.lang.Override
        public LocalServicesLeadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocalServicesLeadServiceStub(channel, callOptions);
        }
      };
    return LocalServicesLeadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static LocalServicesLeadServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocalServicesLeadServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocalServicesLeadServiceBlockingV2Stub>() {
        @java.lang.Override
        public LocalServicesLeadServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocalServicesLeadServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return LocalServicesLeadServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocalServicesLeadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocalServicesLeadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocalServicesLeadServiceBlockingStub>() {
        @java.lang.Override
        public LocalServicesLeadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocalServicesLeadServiceBlockingStub(channel, callOptions);
        }
      };
    return LocalServicesLeadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocalServicesLeadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocalServicesLeadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocalServicesLeadServiceFutureStub>() {
        @java.lang.Override
        public LocalServicesLeadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocalServicesLeadServiceFutureStub(channel, callOptions);
        }
      };
    return LocalServicesLeadServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service allows management of LocalServicesLead resources.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RPC to append Local Services Lead Conversation resources to Local Services
     * Lead resources.
     * </pre>
     */
    default void appendLeadConversation(com.google.ads.googleads.v22.services.AppendLeadConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.AppendLeadConversationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendLeadConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC to provide feedback on Local Services Lead resources.
     * </pre>
     */
    default void provideLeadFeedback(com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvideLeadFeedbackMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LocalServicesLeadService.
   * <pre>
   * This service allows management of LocalServicesLead resources.
   * </pre>
   */
  public static abstract class LocalServicesLeadServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LocalServicesLeadServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LocalServicesLeadService.
   * <pre>
   * This service allows management of LocalServicesLead resources.
   * </pre>
   */
  public static final class LocalServicesLeadServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LocalServicesLeadServiceStub> {
    private LocalServicesLeadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocalServicesLeadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocalServicesLeadServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC to append Local Services Lead Conversation resources to Local Services
     * Lead resources.
     * </pre>
     */
    public void appendLeadConversation(com.google.ads.googleads.v22.services.AppendLeadConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.AppendLeadConversationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendLeadConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC to provide feedback on Local Services Lead resources.
     * </pre>
     */
    public void provideLeadFeedback(com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvideLeadFeedbackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LocalServicesLeadService.
   * <pre>
   * This service allows management of LocalServicesLead resources.
   * </pre>
   */
  public static final class LocalServicesLeadServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<LocalServicesLeadServiceBlockingV2Stub> {
    private LocalServicesLeadServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocalServicesLeadServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocalServicesLeadServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC to append Local Services Lead Conversation resources to Local Services
     * Lead resources.
     * </pre>
     */
    public com.google.ads.googleads.v22.services.AppendLeadConversationResponse appendLeadConversation(com.google.ads.googleads.v22.services.AppendLeadConversationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendLeadConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to provide feedback on Local Services Lead resources.
     * </pre>
     */
    public com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse provideLeadFeedback(com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvideLeadFeedbackMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service LocalServicesLeadService.
   * <pre>
   * This service allows management of LocalServicesLead resources.
   * </pre>
   */
  public static final class LocalServicesLeadServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LocalServicesLeadServiceBlockingStub> {
    private LocalServicesLeadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocalServicesLeadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocalServicesLeadServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC to append Local Services Lead Conversation resources to Local Services
     * Lead resources.
     * </pre>
     */
    public com.google.ads.googleads.v22.services.AppendLeadConversationResponse appendLeadConversation(com.google.ads.googleads.v22.services.AppendLeadConversationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendLeadConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to provide feedback on Local Services Lead resources.
     * </pre>
     */
    public com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse provideLeadFeedback(com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvideLeadFeedbackMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LocalServicesLeadService.
   * <pre>
   * This service allows management of LocalServicesLead resources.
   * </pre>
   */
  public static final class LocalServicesLeadServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LocalServicesLeadServiceFutureStub> {
    private LocalServicesLeadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocalServicesLeadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocalServicesLeadServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC to append Local Services Lead Conversation resources to Local Services
     * Lead resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v22.services.AppendLeadConversationResponse> appendLeadConversation(
        com.google.ads.googleads.v22.services.AppendLeadConversationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendLeadConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC to provide feedback on Local Services Lead resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse> provideLeadFeedback(
        com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvideLeadFeedbackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APPEND_LEAD_CONVERSATION = 0;
  private static final int METHODID_PROVIDE_LEAD_FEEDBACK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_APPEND_LEAD_CONVERSATION:
          serviceImpl.appendLeadConversation((com.google.ads.googleads.v22.services.AppendLeadConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.AppendLeadConversationResponse>) responseObserver);
          break;
        case METHODID_PROVIDE_LEAD_FEEDBACK:
          serviceImpl.provideLeadFeedback((com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAppendLeadConversationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v22.services.AppendLeadConversationRequest,
              com.google.ads.googleads.v22.services.AppendLeadConversationResponse>(
                service, METHODID_APPEND_LEAD_CONVERSATION)))
        .addMethod(
          getProvideLeadFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v22.services.ProvideLeadFeedbackRequest,
              com.google.ads.googleads.v22.services.ProvideLeadFeedbackResponse>(
                service, METHODID_PROVIDE_LEAD_FEEDBACK)))
        .build();
  }

  private static abstract class LocalServicesLeadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocalServicesLeadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v22.services.LocalServicesLeadServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LocalServicesLeadService");
    }
  }

  private static final class LocalServicesLeadServiceFileDescriptorSupplier
      extends LocalServicesLeadServiceBaseDescriptorSupplier {
    LocalServicesLeadServiceFileDescriptorSupplier() {}
  }

  private static final class LocalServicesLeadServiceMethodDescriptorSupplier
      extends LocalServicesLeadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LocalServicesLeadServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LocalServicesLeadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocalServicesLeadServiceFileDescriptorSupplier())
              .addMethod(getAppendLeadConversationMethod())
              .addMethod(getProvideLeadFeedbackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
