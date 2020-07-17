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
 * Service to manage conversion actions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/conversion_action_service.proto")
public final class ConversionActionServiceGrpc {

  private ConversionActionServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.ConversionActionService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetConversionActionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetConversionActionRequest,
      com.google.ads.googleads.v4.resources.ConversionAction> METHOD_GET_CONVERSION_ACTION = getGetConversionActionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetConversionActionRequest,
      com.google.ads.googleads.v4.resources.ConversionAction> getGetConversionActionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetConversionActionRequest,
      com.google.ads.googleads.v4.resources.ConversionAction> getGetConversionActionMethod() {
    return getGetConversionActionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetConversionActionRequest,
      com.google.ads.googleads.v4.resources.ConversionAction> getGetConversionActionMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetConversionActionRequest, com.google.ads.googleads.v4.resources.ConversionAction> getGetConversionActionMethod;
    if ((getGetConversionActionMethod = ConversionActionServiceGrpc.getGetConversionActionMethod) == null) {
      synchronized (ConversionActionServiceGrpc.class) {
        if ((getGetConversionActionMethod = ConversionActionServiceGrpc.getGetConversionActionMethod) == null) {
          ConversionActionServiceGrpc.getGetConversionActionMethod = getGetConversionActionMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetConversionActionRequest, com.google.ads.googleads.v4.resources.ConversionAction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.ConversionActionService", "GetConversionAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetConversionActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.ConversionAction.getDefaultInstance()))
                  .setSchemaDescriptor(new ConversionActionServiceMethodDescriptorSupplier("GetConversionAction"))
                  .build();
          }
        }
     }
     return getGetConversionActionMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateConversionActionsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateConversionActionsRequest,
      com.google.ads.googleads.v4.services.MutateConversionActionsResponse> METHOD_MUTATE_CONVERSION_ACTIONS = getMutateConversionActionsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateConversionActionsRequest,
      com.google.ads.googleads.v4.services.MutateConversionActionsResponse> getMutateConversionActionsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateConversionActionsRequest,
      com.google.ads.googleads.v4.services.MutateConversionActionsResponse> getMutateConversionActionsMethod() {
    return getMutateConversionActionsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateConversionActionsRequest,
      com.google.ads.googleads.v4.services.MutateConversionActionsResponse> getMutateConversionActionsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateConversionActionsRequest, com.google.ads.googleads.v4.services.MutateConversionActionsResponse> getMutateConversionActionsMethod;
    if ((getMutateConversionActionsMethod = ConversionActionServiceGrpc.getMutateConversionActionsMethod) == null) {
      synchronized (ConversionActionServiceGrpc.class) {
        if ((getMutateConversionActionsMethod = ConversionActionServiceGrpc.getMutateConversionActionsMethod) == null) {
          ConversionActionServiceGrpc.getMutateConversionActionsMethod = getMutateConversionActionsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.MutateConversionActionsRequest, com.google.ads.googleads.v4.services.MutateConversionActionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.ConversionActionService", "MutateConversionActions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateConversionActionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateConversionActionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ConversionActionServiceMethodDescriptorSupplier("MutateConversionActions"))
                  .build();
          }
        }
     }
     return getMutateConversionActionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConversionActionServiceStub newStub(io.grpc.Channel channel) {
    return new ConversionActionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConversionActionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConversionActionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConversionActionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConversionActionServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage conversion actions.
   * </pre>
   */
  public static abstract class ConversionActionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested conversion action.
     * </pre>
     */
    public void getConversionAction(com.google.ads.googleads.v4.services.GetConversionActionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.ConversionAction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConversionActionMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion actions. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateConversionActions(com.google.ads.googleads.v4.services.MutateConversionActionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateConversionActionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateConversionActionsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetConversionActionMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetConversionActionRequest,
                com.google.ads.googleads.v4.resources.ConversionAction>(
                  this, METHODID_GET_CONVERSION_ACTION)))
          .addMethod(
            getMutateConversionActionsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.MutateConversionActionsRequest,
                com.google.ads.googleads.v4.services.MutateConversionActionsResponse>(
                  this, METHODID_MUTATE_CONVERSION_ACTIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage conversion actions.
   * </pre>
   */
  public static final class ConversionActionServiceStub extends io.grpc.stub.AbstractStub<ConversionActionServiceStub> {
    private ConversionActionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConversionActionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionActionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConversionActionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested conversion action.
     * </pre>
     */
    public void getConversionAction(com.google.ads.googleads.v4.services.GetConversionActionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.ConversionAction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConversionActionMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion actions. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateConversionActions(com.google.ads.googleads.v4.services.MutateConversionActionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateConversionActionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateConversionActionsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage conversion actions.
   * </pre>
   */
  public static final class ConversionActionServiceBlockingStub extends io.grpc.stub.AbstractStub<ConversionActionServiceBlockingStub> {
    private ConversionActionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConversionActionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionActionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConversionActionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested conversion action.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.ConversionAction getConversionAction(com.google.ads.googleads.v4.services.GetConversionActionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetConversionActionMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion actions. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.MutateConversionActionsResponse mutateConversionActions(com.google.ads.googleads.v4.services.MutateConversionActionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateConversionActionsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage conversion actions.
   * </pre>
   */
  public static final class ConversionActionServiceFutureStub extends io.grpc.stub.AbstractStub<ConversionActionServiceFutureStub> {
    private ConversionActionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConversionActionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionActionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConversionActionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested conversion action.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.ConversionAction> getConversionAction(
        com.google.ads.googleads.v4.services.GetConversionActionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConversionActionMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion actions. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.MutateConversionActionsResponse> mutateConversionActions(
        com.google.ads.googleads.v4.services.MutateConversionActionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateConversionActionsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CONVERSION_ACTION = 0;
  private static final int METHODID_MUTATE_CONVERSION_ACTIONS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConversionActionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConversionActionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CONVERSION_ACTION:
          serviceImpl.getConversionAction((com.google.ads.googleads.v4.services.GetConversionActionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.ConversionAction>) responseObserver);
          break;
        case METHODID_MUTATE_CONVERSION_ACTIONS:
          serviceImpl.mutateConversionActions((com.google.ads.googleads.v4.services.MutateConversionActionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateConversionActionsResponse>) responseObserver);
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

  private static abstract class ConversionActionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversionActionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.ConversionActionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConversionActionService");
    }
  }

  private static final class ConversionActionServiceFileDescriptorSupplier
      extends ConversionActionServiceBaseDescriptorSupplier {
    ConversionActionServiceFileDescriptorSupplier() {}
  }

  private static final class ConversionActionServiceMethodDescriptorSupplier
      extends ConversionActionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConversionActionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConversionActionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConversionActionServiceFileDescriptorSupplier())
              .addMethod(getGetConversionActionMethodHelper())
              .addMethod(getMutateConversionActionsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
