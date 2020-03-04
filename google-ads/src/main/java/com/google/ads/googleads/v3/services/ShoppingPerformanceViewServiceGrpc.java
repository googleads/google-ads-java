package com.google.ads.googleads.v3.services;

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
 * Service to fetch Shopping performance views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/shopping_performance_view_service.proto")
public final class ShoppingPerformanceViewServiceGrpc {

  private ShoppingPerformanceViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.ShoppingPerformanceViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetShoppingPerformanceViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetShoppingPerformanceViewRequest,
      com.google.ads.googleads.v3.resources.ShoppingPerformanceView> METHOD_GET_SHOPPING_PERFORMANCE_VIEW = getGetShoppingPerformanceViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetShoppingPerformanceViewRequest,
      com.google.ads.googleads.v3.resources.ShoppingPerformanceView> getGetShoppingPerformanceViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetShoppingPerformanceViewRequest,
      com.google.ads.googleads.v3.resources.ShoppingPerformanceView> getGetShoppingPerformanceViewMethod() {
    return getGetShoppingPerformanceViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetShoppingPerformanceViewRequest,
      com.google.ads.googleads.v3.resources.ShoppingPerformanceView> getGetShoppingPerformanceViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetShoppingPerformanceViewRequest, com.google.ads.googleads.v3.resources.ShoppingPerformanceView> getGetShoppingPerformanceViewMethod;
    if ((getGetShoppingPerformanceViewMethod = ShoppingPerformanceViewServiceGrpc.getGetShoppingPerformanceViewMethod) == null) {
      synchronized (ShoppingPerformanceViewServiceGrpc.class) {
        if ((getGetShoppingPerformanceViewMethod = ShoppingPerformanceViewServiceGrpc.getGetShoppingPerformanceViewMethod) == null) {
          ShoppingPerformanceViewServiceGrpc.getGetShoppingPerformanceViewMethod = getGetShoppingPerformanceViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetShoppingPerformanceViewRequest, com.google.ads.googleads.v3.resources.ShoppingPerformanceView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.ShoppingPerformanceViewService", "GetShoppingPerformanceView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetShoppingPerformanceViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.ShoppingPerformanceView.getDefaultInstance()))
                  .setSchemaDescriptor(new ShoppingPerformanceViewServiceMethodDescriptorSupplier("GetShoppingPerformanceView"))
                  .build();
          }
        }
     }
     return getGetShoppingPerformanceViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShoppingPerformanceViewServiceStub newStub(io.grpc.Channel channel) {
    return new ShoppingPerformanceViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShoppingPerformanceViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ShoppingPerformanceViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShoppingPerformanceViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ShoppingPerformanceViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch Shopping performance views.
   * </pre>
   */
  public static abstract class ShoppingPerformanceViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Shopping performance view in full detail.
     * </pre>
     */
    public void getShoppingPerformanceView(com.google.ads.googleads.v3.services.GetShoppingPerformanceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.ShoppingPerformanceView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetShoppingPerformanceViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetShoppingPerformanceViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetShoppingPerformanceViewRequest,
                com.google.ads.googleads.v3.resources.ShoppingPerformanceView>(
                  this, METHODID_GET_SHOPPING_PERFORMANCE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch Shopping performance views.
   * </pre>
   */
  public static final class ShoppingPerformanceViewServiceStub extends io.grpc.stub.AbstractStub<ShoppingPerformanceViewServiceStub> {
    private ShoppingPerformanceViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShoppingPerformanceViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingPerformanceViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShoppingPerformanceViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Shopping performance view in full detail.
     * </pre>
     */
    public void getShoppingPerformanceView(com.google.ads.googleads.v3.services.GetShoppingPerformanceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.ShoppingPerformanceView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetShoppingPerformanceViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch Shopping performance views.
   * </pre>
   */
  public static final class ShoppingPerformanceViewServiceBlockingStub extends io.grpc.stub.AbstractStub<ShoppingPerformanceViewServiceBlockingStub> {
    private ShoppingPerformanceViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShoppingPerformanceViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingPerformanceViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShoppingPerformanceViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Shopping performance view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.ShoppingPerformanceView getShoppingPerformanceView(com.google.ads.googleads.v3.services.GetShoppingPerformanceViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetShoppingPerformanceViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch Shopping performance views.
   * </pre>
   */
  public static final class ShoppingPerformanceViewServiceFutureStub extends io.grpc.stub.AbstractStub<ShoppingPerformanceViewServiceFutureStub> {
    private ShoppingPerformanceViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShoppingPerformanceViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingPerformanceViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShoppingPerformanceViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Shopping performance view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.ShoppingPerformanceView> getShoppingPerformanceView(
        com.google.ads.googleads.v3.services.GetShoppingPerformanceViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetShoppingPerformanceViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SHOPPING_PERFORMANCE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShoppingPerformanceViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShoppingPerformanceViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SHOPPING_PERFORMANCE_VIEW:
          serviceImpl.getShoppingPerformanceView((com.google.ads.googleads.v3.services.GetShoppingPerformanceViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.ShoppingPerformanceView>) responseObserver);
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

  private static abstract class ShoppingPerformanceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShoppingPerformanceViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.ShoppingPerformanceViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShoppingPerformanceViewService");
    }
  }

  private static final class ShoppingPerformanceViewServiceFileDescriptorSupplier
      extends ShoppingPerformanceViewServiceBaseDescriptorSupplier {
    ShoppingPerformanceViewServiceFileDescriptorSupplier() {}
  }

  private static final class ShoppingPerformanceViewServiceMethodDescriptorSupplier
      extends ShoppingPerformanceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShoppingPerformanceViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ShoppingPerformanceViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShoppingPerformanceViewServiceFileDescriptorSupplier())
              .addMethod(getGetShoppingPerformanceViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
