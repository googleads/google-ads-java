package com.google.ads.googleads.v2.services;

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
 * Service to manage Managed Placement views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/managed_placement_view_service.proto")
public final class ManagedPlacementViewServiceGrpc {

  private ManagedPlacementViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.ManagedPlacementViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetManagedPlacementViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetManagedPlacementViewRequest,
      com.google.ads.googleads.v2.resources.ManagedPlacementView> METHOD_GET_MANAGED_PLACEMENT_VIEW = getGetManagedPlacementViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetManagedPlacementViewRequest,
      com.google.ads.googleads.v2.resources.ManagedPlacementView> getGetManagedPlacementViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetManagedPlacementViewRequest,
      com.google.ads.googleads.v2.resources.ManagedPlacementView> getGetManagedPlacementViewMethod() {
    return getGetManagedPlacementViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetManagedPlacementViewRequest,
      com.google.ads.googleads.v2.resources.ManagedPlacementView> getGetManagedPlacementViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetManagedPlacementViewRequest, com.google.ads.googleads.v2.resources.ManagedPlacementView> getGetManagedPlacementViewMethod;
    if ((getGetManagedPlacementViewMethod = ManagedPlacementViewServiceGrpc.getGetManagedPlacementViewMethod) == null) {
      synchronized (ManagedPlacementViewServiceGrpc.class) {
        if ((getGetManagedPlacementViewMethod = ManagedPlacementViewServiceGrpc.getGetManagedPlacementViewMethod) == null) {
          ManagedPlacementViewServiceGrpc.getGetManagedPlacementViewMethod = getGetManagedPlacementViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetManagedPlacementViewRequest, com.google.ads.googleads.v2.resources.ManagedPlacementView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.ManagedPlacementViewService", "GetManagedPlacementView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetManagedPlacementViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.ManagedPlacementView.getDefaultInstance()))
                  .setSchemaDescriptor(new ManagedPlacementViewServiceMethodDescriptorSupplier("GetManagedPlacementView"))
                  .build();
          }
        }
     }
     return getGetManagedPlacementViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManagedPlacementViewServiceStub newStub(io.grpc.Channel channel) {
    return new ManagedPlacementViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManagedPlacementViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ManagedPlacementViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManagedPlacementViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ManagedPlacementViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage Managed Placement views.
   * </pre>
   */
  public static abstract class ManagedPlacementViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Managed Placement view in full detail.
     * </pre>
     */
    public void getManagedPlacementView(com.google.ads.googleads.v2.services.GetManagedPlacementViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.ManagedPlacementView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetManagedPlacementViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetManagedPlacementViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetManagedPlacementViewRequest,
                com.google.ads.googleads.v2.resources.ManagedPlacementView>(
                  this, METHODID_GET_MANAGED_PLACEMENT_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Managed Placement views.
   * </pre>
   */
  public static final class ManagedPlacementViewServiceStub extends io.grpc.stub.AbstractStub<ManagedPlacementViewServiceStub> {
    private ManagedPlacementViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManagedPlacementViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagedPlacementViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManagedPlacementViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Managed Placement view in full detail.
     * </pre>
     */
    public void getManagedPlacementView(com.google.ads.googleads.v2.services.GetManagedPlacementViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.ManagedPlacementView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetManagedPlacementViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Managed Placement views.
   * </pre>
   */
  public static final class ManagedPlacementViewServiceBlockingStub extends io.grpc.stub.AbstractStub<ManagedPlacementViewServiceBlockingStub> {
    private ManagedPlacementViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManagedPlacementViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagedPlacementViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManagedPlacementViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Managed Placement view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.ManagedPlacementView getManagedPlacementView(com.google.ads.googleads.v2.services.GetManagedPlacementViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetManagedPlacementViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Managed Placement views.
   * </pre>
   */
  public static final class ManagedPlacementViewServiceFutureStub extends io.grpc.stub.AbstractStub<ManagedPlacementViewServiceFutureStub> {
    private ManagedPlacementViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManagedPlacementViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagedPlacementViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManagedPlacementViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Managed Placement view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.ManagedPlacementView> getManagedPlacementView(
        com.google.ads.googleads.v2.services.GetManagedPlacementViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetManagedPlacementViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MANAGED_PLACEMENT_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ManagedPlacementViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ManagedPlacementViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MANAGED_PLACEMENT_VIEW:
          serviceImpl.getManagedPlacementView((com.google.ads.googleads.v2.services.GetManagedPlacementViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.ManagedPlacementView>) responseObserver);
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

  private static abstract class ManagedPlacementViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManagedPlacementViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.ManagedPlacementViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ManagedPlacementViewService");
    }
  }

  private static final class ManagedPlacementViewServiceFileDescriptorSupplier
      extends ManagedPlacementViewServiceBaseDescriptorSupplier {
    ManagedPlacementViewServiceFileDescriptorSupplier() {}
  }

  private static final class ManagedPlacementViewServiceMethodDescriptorSupplier
      extends ManagedPlacementViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ManagedPlacementViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ManagedPlacementViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManagedPlacementViewServiceFileDescriptorSupplier())
              .addMethod(getGetManagedPlacementViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
