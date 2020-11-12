package com.google.ads.googleads.v6.services;

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
 * Service to manage remarketing actions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/remarketing_action_service.proto")
public final class RemarketingActionServiceGrpc {

  private RemarketingActionServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.RemarketingActionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetRemarketingActionRequest,
      com.google.ads.googleads.v6.resources.RemarketingAction> getGetRemarketingActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRemarketingAction",
      requestType = com.google.ads.googleads.v6.services.GetRemarketingActionRequest.class,
      responseType = com.google.ads.googleads.v6.resources.RemarketingAction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetRemarketingActionRequest,
      com.google.ads.googleads.v6.resources.RemarketingAction> getGetRemarketingActionMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetRemarketingActionRequest, com.google.ads.googleads.v6.resources.RemarketingAction> getGetRemarketingActionMethod;
    if ((getGetRemarketingActionMethod = RemarketingActionServiceGrpc.getGetRemarketingActionMethod) == null) {
      synchronized (RemarketingActionServiceGrpc.class) {
        if ((getGetRemarketingActionMethod = RemarketingActionServiceGrpc.getGetRemarketingActionMethod) == null) {
          RemarketingActionServiceGrpc.getGetRemarketingActionMethod = getGetRemarketingActionMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetRemarketingActionRequest, com.google.ads.googleads.v6.resources.RemarketingAction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRemarketingAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetRemarketingActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.RemarketingAction.getDefaultInstance()))
              .setSchemaDescriptor(new RemarketingActionServiceMethodDescriptorSupplier("GetRemarketingAction"))
              .build();
        }
      }
    }
    return getGetRemarketingActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateRemarketingActionsRequest,
      com.google.ads.googleads.v6.services.MutateRemarketingActionsResponse> getMutateRemarketingActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateRemarketingActions",
      requestType = com.google.ads.googleads.v6.services.MutateRemarketingActionsRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateRemarketingActionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateRemarketingActionsRequest,
      com.google.ads.googleads.v6.services.MutateRemarketingActionsResponse> getMutateRemarketingActionsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateRemarketingActionsRequest, com.google.ads.googleads.v6.services.MutateRemarketingActionsResponse> getMutateRemarketingActionsMethod;
    if ((getMutateRemarketingActionsMethod = RemarketingActionServiceGrpc.getMutateRemarketingActionsMethod) == null) {
      synchronized (RemarketingActionServiceGrpc.class) {
        if ((getMutateRemarketingActionsMethod = RemarketingActionServiceGrpc.getMutateRemarketingActionsMethod) == null) {
          RemarketingActionServiceGrpc.getMutateRemarketingActionsMethod = getMutateRemarketingActionsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateRemarketingActionsRequest, com.google.ads.googleads.v6.services.MutateRemarketingActionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateRemarketingActions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateRemarketingActionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateRemarketingActionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemarketingActionServiceMethodDescriptorSupplier("MutateRemarketingActions"))
              .build();
        }
      }
    }
    return getMutateRemarketingActionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RemarketingActionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemarketingActionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemarketingActionServiceStub>() {
        @java.lang.Override
        public RemarketingActionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemarketingActionServiceStub(channel, callOptions);
        }
      };
    return RemarketingActionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RemarketingActionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemarketingActionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemarketingActionServiceBlockingStub>() {
        @java.lang.Override
        public RemarketingActionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemarketingActionServiceBlockingStub(channel, callOptions);
        }
      };
    return RemarketingActionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RemarketingActionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemarketingActionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemarketingActionServiceFutureStub>() {
        @java.lang.Override
        public RemarketingActionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemarketingActionServiceFutureStub(channel, callOptions);
        }
      };
    return RemarketingActionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage remarketing actions.
   * </pre>
   */
  public static abstract class RemarketingActionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested remarketing action in full detail.
     * </pre>
     */
    public void getRemarketingAction(com.google.ads.googleads.v6.services.GetRemarketingActionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.RemarketingAction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRemarketingActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or updates remarketing actions. Operation statuses are returned.
     * </pre>
     */
    public void mutateRemarketingActions(com.google.ads.googleads.v6.services.MutateRemarketingActionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateRemarketingActionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateRemarketingActionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRemarketingActionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetRemarketingActionRequest,
                com.google.ads.googleads.v6.resources.RemarketingAction>(
                  this, METHODID_GET_REMARKETING_ACTION)))
          .addMethod(
            getMutateRemarketingActionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateRemarketingActionsRequest,
                com.google.ads.googleads.v6.services.MutateRemarketingActionsResponse>(
                  this, METHODID_MUTATE_REMARKETING_ACTIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage remarketing actions.
   * </pre>
   */
  public static final class RemarketingActionServiceStub extends io.grpc.stub.AbstractAsyncStub<RemarketingActionServiceStub> {
    private RemarketingActionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemarketingActionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemarketingActionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested remarketing action in full detail.
     * </pre>
     */
    public void getRemarketingAction(com.google.ads.googleads.v6.services.GetRemarketingActionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.RemarketingAction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRemarketingActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or updates remarketing actions. Operation statuses are returned.
     * </pre>
     */
    public void mutateRemarketingActions(com.google.ads.googleads.v6.services.MutateRemarketingActionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateRemarketingActionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateRemarketingActionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage remarketing actions.
   * </pre>
   */
  public static final class RemarketingActionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RemarketingActionServiceBlockingStub> {
    private RemarketingActionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemarketingActionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemarketingActionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested remarketing action in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.RemarketingAction getRemarketingAction(com.google.ads.googleads.v6.services.GetRemarketingActionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRemarketingActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or updates remarketing actions. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateRemarketingActionsResponse mutateRemarketingActions(com.google.ads.googleads.v6.services.MutateRemarketingActionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateRemarketingActionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage remarketing actions.
   * </pre>
   */
  public static final class RemarketingActionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RemarketingActionServiceFutureStub> {
    private RemarketingActionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemarketingActionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemarketingActionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested remarketing action in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.RemarketingAction> getRemarketingAction(
        com.google.ads.googleads.v6.services.GetRemarketingActionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRemarketingActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or updates remarketing actions. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateRemarketingActionsResponse> mutateRemarketingActions(
        com.google.ads.googleads.v6.services.MutateRemarketingActionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateRemarketingActionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REMARKETING_ACTION = 0;
  private static final int METHODID_MUTATE_REMARKETING_ACTIONS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RemarketingActionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RemarketingActionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REMARKETING_ACTION:
          serviceImpl.getRemarketingAction((com.google.ads.googleads.v6.services.GetRemarketingActionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.RemarketingAction>) responseObserver);
          break;
        case METHODID_MUTATE_REMARKETING_ACTIONS:
          serviceImpl.mutateRemarketingActions((com.google.ads.googleads.v6.services.MutateRemarketingActionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateRemarketingActionsResponse>) responseObserver);
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

  private static abstract class RemarketingActionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RemarketingActionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.RemarketingActionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RemarketingActionService");
    }
  }

  private static final class RemarketingActionServiceFileDescriptorSupplier
      extends RemarketingActionServiceBaseDescriptorSupplier {
    RemarketingActionServiceFileDescriptorSupplier() {}
  }

  private static final class RemarketingActionServiceMethodDescriptorSupplier
      extends RemarketingActionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RemarketingActionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RemarketingActionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RemarketingActionServiceFileDescriptorSupplier())
              .addMethod(getGetRemarketingActionMethod())
              .addMethod(getMutateRemarketingActionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
