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
 * Service to manage recommendations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v0/services/recommendation_service.proto")
public final class RecommendationServiceGrpc {

  private RecommendationServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.RecommendationService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetRecommendationMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetRecommendationRequest,
      com.google.ads.googleads.v0.resources.Recommendation> METHOD_GET_RECOMMENDATION = getGetRecommendationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetRecommendationRequest,
      com.google.ads.googleads.v0.resources.Recommendation> getGetRecommendationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetRecommendationRequest,
      com.google.ads.googleads.v0.resources.Recommendation> getGetRecommendationMethod() {
    return getGetRecommendationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetRecommendationRequest,
      com.google.ads.googleads.v0.resources.Recommendation> getGetRecommendationMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetRecommendationRequest, com.google.ads.googleads.v0.resources.Recommendation> getGetRecommendationMethod;
    if ((getGetRecommendationMethod = RecommendationServiceGrpc.getGetRecommendationMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetRecommendationMethod = RecommendationServiceGrpc.getGetRecommendationMethod) == null) {
          RecommendationServiceGrpc.getGetRecommendationMethod = getGetRecommendationMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.GetRecommendationRequest, com.google.ads.googleads.v0.resources.Recommendation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.RecommendationService", "GetRecommendation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.GetRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.resources.Recommendation.getDefaultInstance()))
                  .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetRecommendation"))
                  .build();
          }
        }
     }
     return getGetRecommendationMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getApplyRecommendationMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.ApplyRecommendationRequest,
      com.google.ads.googleads.v0.services.ApplyRecommendationResponse> METHOD_APPLY_RECOMMENDATION = getApplyRecommendationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.ApplyRecommendationRequest,
      com.google.ads.googleads.v0.services.ApplyRecommendationResponse> getApplyRecommendationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.ApplyRecommendationRequest,
      com.google.ads.googleads.v0.services.ApplyRecommendationResponse> getApplyRecommendationMethod() {
    return getApplyRecommendationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.ApplyRecommendationRequest,
      com.google.ads.googleads.v0.services.ApplyRecommendationResponse> getApplyRecommendationMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.ApplyRecommendationRequest, com.google.ads.googleads.v0.services.ApplyRecommendationResponse> getApplyRecommendationMethod;
    if ((getApplyRecommendationMethod = RecommendationServiceGrpc.getApplyRecommendationMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getApplyRecommendationMethod = RecommendationServiceGrpc.getApplyRecommendationMethod) == null) {
          RecommendationServiceGrpc.getApplyRecommendationMethod = getApplyRecommendationMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.ApplyRecommendationRequest, com.google.ads.googleads.v0.services.ApplyRecommendationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.RecommendationService", "ApplyRecommendation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.ApplyRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.ApplyRecommendationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("ApplyRecommendation"))
                  .build();
          }
        }
     }
     return getApplyRecommendationMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDismissRecommendationMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.DismissRecommendationRequest,
      com.google.ads.googleads.v0.services.DismissRecommendationResponse> METHOD_DISMISS_RECOMMENDATION = getDismissRecommendationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.DismissRecommendationRequest,
      com.google.ads.googleads.v0.services.DismissRecommendationResponse> getDismissRecommendationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.DismissRecommendationRequest,
      com.google.ads.googleads.v0.services.DismissRecommendationResponse> getDismissRecommendationMethod() {
    return getDismissRecommendationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.DismissRecommendationRequest,
      com.google.ads.googleads.v0.services.DismissRecommendationResponse> getDismissRecommendationMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.DismissRecommendationRequest, com.google.ads.googleads.v0.services.DismissRecommendationResponse> getDismissRecommendationMethod;
    if ((getDismissRecommendationMethod = RecommendationServiceGrpc.getDismissRecommendationMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getDismissRecommendationMethod = RecommendationServiceGrpc.getDismissRecommendationMethod) == null) {
          RecommendationServiceGrpc.getDismissRecommendationMethod = getDismissRecommendationMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.DismissRecommendationRequest, com.google.ads.googleads.v0.services.DismissRecommendationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.RecommendationService", "DismissRecommendation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.DismissRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.DismissRecommendationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("DismissRecommendation"))
                  .build();
          }
        }
     }
     return getDismissRecommendationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecommendationServiceStub newStub(io.grpc.Channel channel) {
    return new RecommendationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecommendationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RecommendationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecommendationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RecommendationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage recommendations.
   * </pre>
   */
  public static abstract class RecommendationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested recommendation in full detail.
     * </pre>
     */
    public void getRecommendation(com.google.ads.googleads.v0.services.GetRecommendationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.Recommendation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRecommendationMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Applies given recommendations with corresponding apply parameters.
     * </pre>
     */
    public void applyRecommendation(com.google.ads.googleads.v0.services.ApplyRecommendationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.ApplyRecommendationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getApplyRecommendationMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Dismisses given recommendations.
     * </pre>
     */
    public void dismissRecommendation(com.google.ads.googleads.v0.services.DismissRecommendationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.DismissRecommendationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDismissRecommendationMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRecommendationMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetRecommendationRequest,
                com.google.ads.googleads.v0.resources.Recommendation>(
                  this, METHODID_GET_RECOMMENDATION)))
          .addMethod(
            getApplyRecommendationMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.ApplyRecommendationRequest,
                com.google.ads.googleads.v0.services.ApplyRecommendationResponse>(
                  this, METHODID_APPLY_RECOMMENDATION)))
          .addMethod(
            getDismissRecommendationMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.DismissRecommendationRequest,
                com.google.ads.googleads.v0.services.DismissRecommendationResponse>(
                  this, METHODID_DISMISS_RECOMMENDATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage recommendations.
   * </pre>
   */
  public static final class RecommendationServiceStub extends io.grpc.stub.AbstractStub<RecommendationServiceStub> {
    private RecommendationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested recommendation in full detail.
     * </pre>
     */
    public void getRecommendation(com.google.ads.googleads.v0.services.GetRecommendationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.Recommendation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRecommendationMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Applies given recommendations with corresponding apply parameters.
     * </pre>
     */
    public void applyRecommendation(com.google.ads.googleads.v0.services.ApplyRecommendationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.ApplyRecommendationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getApplyRecommendationMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Dismisses given recommendations.
     * </pre>
     */
    public void dismissRecommendation(com.google.ads.googleads.v0.services.DismissRecommendationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.DismissRecommendationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDismissRecommendationMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage recommendations.
   * </pre>
   */
  public static final class RecommendationServiceBlockingStub extends io.grpc.stub.AbstractStub<RecommendationServiceBlockingStub> {
    private RecommendationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested recommendation in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.Recommendation getRecommendation(com.google.ads.googleads.v0.services.GetRecommendationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRecommendationMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Applies given recommendations with corresponding apply parameters.
     * </pre>
     */
    public com.google.ads.googleads.v0.services.ApplyRecommendationResponse applyRecommendation(com.google.ads.googleads.v0.services.ApplyRecommendationRequest request) {
      return blockingUnaryCall(
          getChannel(), getApplyRecommendationMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Dismisses given recommendations.
     * </pre>
     */
    public com.google.ads.googleads.v0.services.DismissRecommendationResponse dismissRecommendation(com.google.ads.googleads.v0.services.DismissRecommendationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDismissRecommendationMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage recommendations.
   * </pre>
   */
  public static final class RecommendationServiceFutureStub extends io.grpc.stub.AbstractStub<RecommendationServiceFutureStub> {
    private RecommendationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested recommendation in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.Recommendation> getRecommendation(
        com.google.ads.googleads.v0.services.GetRecommendationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRecommendationMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Applies given recommendations with corresponding apply parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.services.ApplyRecommendationResponse> applyRecommendation(
        com.google.ads.googleads.v0.services.ApplyRecommendationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getApplyRecommendationMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Dismisses given recommendations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.services.DismissRecommendationResponse> dismissRecommendation(
        com.google.ads.googleads.v0.services.DismissRecommendationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDismissRecommendationMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RECOMMENDATION = 0;
  private static final int METHODID_APPLY_RECOMMENDATION = 1;
  private static final int METHODID_DISMISS_RECOMMENDATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecommendationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecommendationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RECOMMENDATION:
          serviceImpl.getRecommendation((com.google.ads.googleads.v0.services.GetRecommendationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.Recommendation>) responseObserver);
          break;
        case METHODID_APPLY_RECOMMENDATION:
          serviceImpl.applyRecommendation((com.google.ads.googleads.v0.services.ApplyRecommendationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.ApplyRecommendationResponse>) responseObserver);
          break;
        case METHODID_DISMISS_RECOMMENDATION:
          serviceImpl.dismissRecommendation((com.google.ads.googleads.v0.services.DismissRecommendationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.DismissRecommendationResponse>) responseObserver);
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

  private static abstract class RecommendationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecommendationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.RecommendationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecommendationService");
    }
  }

  private static final class RecommendationServiceFileDescriptorSupplier
      extends RecommendationServiceBaseDescriptorSupplier {
    RecommendationServiceFileDescriptorSupplier() {}
  }

  private static final class RecommendationServiceMethodDescriptorSupplier
      extends RecommendationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RecommendationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RecommendationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecommendationServiceFileDescriptorSupplier())
              .addMethod(getGetRecommendationMethodHelper())
              .addMethod(getApplyRecommendationMethodHelper())
              .addMethod(getDismissRecommendationMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
