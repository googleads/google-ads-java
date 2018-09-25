package com.google.ads.googleads.v0.services;

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
 * Service to fetch change statuses.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v0/services/change_status_service.proto")
public final class ChangeStatusServiceGrpc {

  private ChangeStatusServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.ChangeStatusService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetChangeStatusMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetChangeStatusRequest,
      com.google.ads.googleads.v0.resources.ChangeStatus> METHOD_GET_CHANGE_STATUS = getGetChangeStatusMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetChangeStatusRequest,
      com.google.ads.googleads.v0.resources.ChangeStatus> getGetChangeStatusMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetChangeStatusRequest,
      com.google.ads.googleads.v0.resources.ChangeStatus> getGetChangeStatusMethod() {
    return getGetChangeStatusMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetChangeStatusRequest,
      com.google.ads.googleads.v0.resources.ChangeStatus> getGetChangeStatusMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetChangeStatusRequest, com.google.ads.googleads.v0.resources.ChangeStatus> getGetChangeStatusMethod;
    if ((getGetChangeStatusMethod = ChangeStatusServiceGrpc.getGetChangeStatusMethod) == null) {
      synchronized (ChangeStatusServiceGrpc.class) {
        if ((getGetChangeStatusMethod = ChangeStatusServiceGrpc.getGetChangeStatusMethod) == null) {
          ChangeStatusServiceGrpc.getGetChangeStatusMethod = getGetChangeStatusMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.GetChangeStatusRequest, com.google.ads.googleads.v0.resources.ChangeStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.ChangeStatusService", "GetChangeStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.GetChangeStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.resources.ChangeStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ChangeStatusServiceMethodDescriptorSupplier("GetChangeStatus"))
                  .build();
          }
        }
     }
     return getGetChangeStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChangeStatusServiceStub newStub(io.grpc.Channel channel) {
    return new ChangeStatusServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChangeStatusServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChangeStatusServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChangeStatusServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChangeStatusServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch change statuses.
   * </pre>
   */
  public static abstract class ChangeStatusServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested change status in full detail.
     * </pre>
     */
    public void getChangeStatus(com.google.ads.googleads.v0.services.GetChangeStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.ChangeStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChangeStatusMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetChangeStatusMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetChangeStatusRequest,
                com.google.ads.googleads.v0.resources.ChangeStatus>(
                  this, METHODID_GET_CHANGE_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch change statuses.
   * </pre>
   */
  public static final class ChangeStatusServiceStub extends io.grpc.stub.AbstractStub<ChangeStatusServiceStub> {
    private ChangeStatusServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChangeStatusServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChangeStatusServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChangeStatusServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested change status in full detail.
     * </pre>
     */
    public void getChangeStatus(com.google.ads.googleads.v0.services.GetChangeStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.ChangeStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChangeStatusMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch change statuses.
   * </pre>
   */
  public static final class ChangeStatusServiceBlockingStub extends io.grpc.stub.AbstractStub<ChangeStatusServiceBlockingStub> {
    private ChangeStatusServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChangeStatusServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChangeStatusServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChangeStatusServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested change status in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.ChangeStatus getChangeStatus(com.google.ads.googleads.v0.services.GetChangeStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetChangeStatusMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch change statuses.
   * </pre>
   */
  public static final class ChangeStatusServiceFutureStub extends io.grpc.stub.AbstractStub<ChangeStatusServiceFutureStub> {
    private ChangeStatusServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChangeStatusServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChangeStatusServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChangeStatusServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested change status in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.ChangeStatus> getChangeStatus(
        com.google.ads.googleads.v0.services.GetChangeStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChangeStatusMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CHANGE_STATUS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChangeStatusServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChangeStatusServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CHANGE_STATUS:
          serviceImpl.getChangeStatus((com.google.ads.googleads.v0.services.GetChangeStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.ChangeStatus>) responseObserver);
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

  private static abstract class ChangeStatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChangeStatusServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.ChangeStatusServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChangeStatusService");
    }
  }

  private static final class ChangeStatusServiceFileDescriptorSupplier
      extends ChangeStatusServiceBaseDescriptorSupplier {
    ChangeStatusServiceFileDescriptorSupplier() {}
  }

  private static final class ChangeStatusServiceMethodDescriptorSupplier
      extends ChangeStatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChangeStatusServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChangeStatusServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChangeStatusServiceFileDescriptorSupplier())
              .addMethod(getGetChangeStatusMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
