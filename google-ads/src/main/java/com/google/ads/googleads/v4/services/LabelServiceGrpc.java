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
 * Service to manage labels.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/label_service.proto")
public final class LabelServiceGrpc {

  private LabelServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.LabelService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetLabelMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetLabelRequest,
      com.google.ads.googleads.v4.resources.Label> METHOD_GET_LABEL = getGetLabelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetLabelRequest,
      com.google.ads.googleads.v4.resources.Label> getGetLabelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetLabelRequest,
      com.google.ads.googleads.v4.resources.Label> getGetLabelMethod() {
    return getGetLabelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetLabelRequest,
      com.google.ads.googleads.v4.resources.Label> getGetLabelMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetLabelRequest, com.google.ads.googleads.v4.resources.Label> getGetLabelMethod;
    if ((getGetLabelMethod = LabelServiceGrpc.getGetLabelMethod) == null) {
      synchronized (LabelServiceGrpc.class) {
        if ((getGetLabelMethod = LabelServiceGrpc.getGetLabelMethod) == null) {
          LabelServiceGrpc.getGetLabelMethod = getGetLabelMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetLabelRequest, com.google.ads.googleads.v4.resources.Label>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.LabelService", "GetLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.Label.getDefaultInstance()))
                  .setSchemaDescriptor(new LabelServiceMethodDescriptorSupplier("GetLabel"))
                  .build();
          }
        }
     }
     return getGetLabelMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateLabelsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateLabelsRequest,
      com.google.ads.googleads.v4.services.MutateLabelsResponse> METHOD_MUTATE_LABELS = getMutateLabelsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateLabelsRequest,
      com.google.ads.googleads.v4.services.MutateLabelsResponse> getMutateLabelsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateLabelsRequest,
      com.google.ads.googleads.v4.services.MutateLabelsResponse> getMutateLabelsMethod() {
    return getMutateLabelsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateLabelsRequest,
      com.google.ads.googleads.v4.services.MutateLabelsResponse> getMutateLabelsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateLabelsRequest, com.google.ads.googleads.v4.services.MutateLabelsResponse> getMutateLabelsMethod;
    if ((getMutateLabelsMethod = LabelServiceGrpc.getMutateLabelsMethod) == null) {
      synchronized (LabelServiceGrpc.class) {
        if ((getMutateLabelsMethod = LabelServiceGrpc.getMutateLabelsMethod) == null) {
          LabelServiceGrpc.getMutateLabelsMethod = getMutateLabelsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.MutateLabelsRequest, com.google.ads.googleads.v4.services.MutateLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.LabelService", "MutateLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateLabelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LabelServiceMethodDescriptorSupplier("MutateLabels"))
                  .build();
          }
        }
     }
     return getMutateLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LabelServiceStub newStub(io.grpc.Channel channel) {
    return new LabelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LabelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LabelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LabelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LabelServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage labels.
   * </pre>
   */
  public static abstract class LabelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested label in full detail.
     * </pre>
     */
    public void getLabel(com.google.ads.googleads.v4.services.GetLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.Label> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLabelMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes labels. Operation statuses are returned.
     * </pre>
     */
    public void mutateLabels(com.google.ads.googleads.v4.services.MutateLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateLabelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateLabelsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLabelMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetLabelRequest,
                com.google.ads.googleads.v4.resources.Label>(
                  this, METHODID_GET_LABEL)))
          .addMethod(
            getMutateLabelsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.MutateLabelsRequest,
                com.google.ads.googleads.v4.services.MutateLabelsResponse>(
                  this, METHODID_MUTATE_LABELS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage labels.
   * </pre>
   */
  public static final class LabelServiceStub extends io.grpc.stub.AbstractStub<LabelServiceStub> {
    private LabelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LabelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LabelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested label in full detail.
     * </pre>
     */
    public void getLabel(com.google.ads.googleads.v4.services.GetLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.Label> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLabelMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes labels. Operation statuses are returned.
     * </pre>
     */
    public void mutateLabels(com.google.ads.googleads.v4.services.MutateLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateLabelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateLabelsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage labels.
   * </pre>
   */
  public static final class LabelServiceBlockingStub extends io.grpc.stub.AbstractStub<LabelServiceBlockingStub> {
    private LabelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LabelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LabelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested label in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.Label getLabel(com.google.ads.googleads.v4.services.GetLabelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLabelMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes labels. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.MutateLabelsResponse mutateLabels(com.google.ads.googleads.v4.services.MutateLabelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateLabelsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage labels.
   * </pre>
   */
  public static final class LabelServiceFutureStub extends io.grpc.stub.AbstractStub<LabelServiceFutureStub> {
    private LabelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LabelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LabelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested label in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.Label> getLabel(
        com.google.ads.googleads.v4.services.GetLabelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLabelMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes labels. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.MutateLabelsResponse> mutateLabels(
        com.google.ads.googleads.v4.services.MutateLabelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateLabelsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LABEL = 0;
  private static final int METHODID_MUTATE_LABELS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LabelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LabelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LABEL:
          serviceImpl.getLabel((com.google.ads.googleads.v4.services.GetLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.Label>) responseObserver);
          break;
        case METHODID_MUTATE_LABELS:
          serviceImpl.mutateLabels((com.google.ads.googleads.v4.services.MutateLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateLabelsResponse>) responseObserver);
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

  private static abstract class LabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LabelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.LabelServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LabelService");
    }
  }

  private static final class LabelServiceFileDescriptorSupplier
      extends LabelServiceBaseDescriptorSupplier {
    LabelServiceFileDescriptorSupplier() {}
  }

  private static final class LabelServiceMethodDescriptorSupplier
      extends LabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LabelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LabelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LabelServiceFileDescriptorSupplier())
              .addMethod(getGetLabelMethodHelper())
              .addMethod(getMutateLabelsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
