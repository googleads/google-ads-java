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
 * Service to manage income range views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/income_range_view_service.proto")
public final class IncomeRangeViewServiceGrpc {

  private IncomeRangeViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.IncomeRangeViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetIncomeRangeViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetIncomeRangeViewRequest,
      com.google.ads.googleads.v4.resources.IncomeRangeView> METHOD_GET_INCOME_RANGE_VIEW = getGetIncomeRangeViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetIncomeRangeViewRequest,
      com.google.ads.googleads.v4.resources.IncomeRangeView> getGetIncomeRangeViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetIncomeRangeViewRequest,
      com.google.ads.googleads.v4.resources.IncomeRangeView> getGetIncomeRangeViewMethod() {
    return getGetIncomeRangeViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetIncomeRangeViewRequest,
      com.google.ads.googleads.v4.resources.IncomeRangeView> getGetIncomeRangeViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetIncomeRangeViewRequest, com.google.ads.googleads.v4.resources.IncomeRangeView> getGetIncomeRangeViewMethod;
    if ((getGetIncomeRangeViewMethod = IncomeRangeViewServiceGrpc.getGetIncomeRangeViewMethod) == null) {
      synchronized (IncomeRangeViewServiceGrpc.class) {
        if ((getGetIncomeRangeViewMethod = IncomeRangeViewServiceGrpc.getGetIncomeRangeViewMethod) == null) {
          IncomeRangeViewServiceGrpc.getGetIncomeRangeViewMethod = getGetIncomeRangeViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetIncomeRangeViewRequest, com.google.ads.googleads.v4.resources.IncomeRangeView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.IncomeRangeViewService", "GetIncomeRangeView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetIncomeRangeViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.IncomeRangeView.getDefaultInstance()))
                  .setSchemaDescriptor(new IncomeRangeViewServiceMethodDescriptorSupplier("GetIncomeRangeView"))
                  .build();
          }
        }
     }
     return getGetIncomeRangeViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IncomeRangeViewServiceStub newStub(io.grpc.Channel channel) {
    return new IncomeRangeViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IncomeRangeViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IncomeRangeViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IncomeRangeViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IncomeRangeViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage income range views.
   * </pre>
   */
  public static abstract class IncomeRangeViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested income range view in full detail.
     * </pre>
     */
    public void getIncomeRangeView(com.google.ads.googleads.v4.services.GetIncomeRangeViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.IncomeRangeView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIncomeRangeViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetIncomeRangeViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetIncomeRangeViewRequest,
                com.google.ads.googleads.v4.resources.IncomeRangeView>(
                  this, METHODID_GET_INCOME_RANGE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage income range views.
   * </pre>
   */
  public static final class IncomeRangeViewServiceStub extends io.grpc.stub.AbstractStub<IncomeRangeViewServiceStub> {
    private IncomeRangeViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncomeRangeViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncomeRangeViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncomeRangeViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested income range view in full detail.
     * </pre>
     */
    public void getIncomeRangeView(com.google.ads.googleads.v4.services.GetIncomeRangeViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.IncomeRangeView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIncomeRangeViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage income range views.
   * </pre>
   */
  public static final class IncomeRangeViewServiceBlockingStub extends io.grpc.stub.AbstractStub<IncomeRangeViewServiceBlockingStub> {
    private IncomeRangeViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncomeRangeViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncomeRangeViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncomeRangeViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested income range view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.IncomeRangeView getIncomeRangeView(com.google.ads.googleads.v4.services.GetIncomeRangeViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetIncomeRangeViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage income range views.
   * </pre>
   */
  public static final class IncomeRangeViewServiceFutureStub extends io.grpc.stub.AbstractStub<IncomeRangeViewServiceFutureStub> {
    private IncomeRangeViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncomeRangeViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncomeRangeViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncomeRangeViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested income range view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.IncomeRangeView> getIncomeRangeView(
        com.google.ads.googleads.v4.services.GetIncomeRangeViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIncomeRangeViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INCOME_RANGE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IncomeRangeViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IncomeRangeViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INCOME_RANGE_VIEW:
          serviceImpl.getIncomeRangeView((com.google.ads.googleads.v4.services.GetIncomeRangeViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.IncomeRangeView>) responseObserver);
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

  private static abstract class IncomeRangeViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IncomeRangeViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.IncomeRangeViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IncomeRangeViewService");
    }
  }

  private static final class IncomeRangeViewServiceFileDescriptorSupplier
      extends IncomeRangeViewServiceBaseDescriptorSupplier {
    IncomeRangeViewServiceFileDescriptorSupplier() {}
  }

  private static final class IncomeRangeViewServiceMethodDescriptorSupplier
      extends IncomeRangeViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IncomeRangeViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IncomeRangeViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IncomeRangeViewServiceFileDescriptorSupplier())
              .addMethod(getGetIncomeRangeViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
