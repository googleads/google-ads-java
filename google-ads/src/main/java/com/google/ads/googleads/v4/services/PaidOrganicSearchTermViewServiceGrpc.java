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
 * Service to fetch paid organic search term views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/paid_organic_search_term_view_service.proto")
public final class PaidOrganicSearchTermViewServiceGrpc {

  private PaidOrganicSearchTermViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.PaidOrganicSearchTermViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetPaidOrganicSearchTermViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetPaidOrganicSearchTermViewRequest,
      com.google.ads.googleads.v4.resources.PaidOrganicSearchTermView> METHOD_GET_PAID_ORGANIC_SEARCH_TERM_VIEW = getGetPaidOrganicSearchTermViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetPaidOrganicSearchTermViewRequest,
      com.google.ads.googleads.v4.resources.PaidOrganicSearchTermView> getGetPaidOrganicSearchTermViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetPaidOrganicSearchTermViewRequest,
      com.google.ads.googleads.v4.resources.PaidOrganicSearchTermView> getGetPaidOrganicSearchTermViewMethod() {
    return getGetPaidOrganicSearchTermViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetPaidOrganicSearchTermViewRequest,
      com.google.ads.googleads.v4.resources.PaidOrganicSearchTermView> getGetPaidOrganicSearchTermViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetPaidOrganicSearchTermViewRequest, com.google.ads.googleads.v4.resources.PaidOrganicSearchTermView> getGetPaidOrganicSearchTermViewMethod;
    if ((getGetPaidOrganicSearchTermViewMethod = PaidOrganicSearchTermViewServiceGrpc.getGetPaidOrganicSearchTermViewMethod) == null) {
      synchronized (PaidOrganicSearchTermViewServiceGrpc.class) {
        if ((getGetPaidOrganicSearchTermViewMethod = PaidOrganicSearchTermViewServiceGrpc.getGetPaidOrganicSearchTermViewMethod) == null) {
          PaidOrganicSearchTermViewServiceGrpc.getGetPaidOrganicSearchTermViewMethod = getGetPaidOrganicSearchTermViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetPaidOrganicSearchTermViewRequest, com.google.ads.googleads.v4.resources.PaidOrganicSearchTermView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.PaidOrganicSearchTermViewService", "GetPaidOrganicSearchTermView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetPaidOrganicSearchTermViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.PaidOrganicSearchTermView.getDefaultInstance()))
                  .setSchemaDescriptor(new PaidOrganicSearchTermViewServiceMethodDescriptorSupplier("GetPaidOrganicSearchTermView"))
                  .build();
          }
        }
     }
     return getGetPaidOrganicSearchTermViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaidOrganicSearchTermViewServiceStub newStub(io.grpc.Channel channel) {
    return new PaidOrganicSearchTermViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaidOrganicSearchTermViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PaidOrganicSearchTermViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaidOrganicSearchTermViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PaidOrganicSearchTermViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch paid organic search term views.
   * </pre>
   */
  public static abstract class PaidOrganicSearchTermViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested paid organic search term view in full detail.
     * </pre>
     */
    public void getPaidOrganicSearchTermView(com.google.ads.googleads.v4.services.GetPaidOrganicSearchTermViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.PaidOrganicSearchTermView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPaidOrganicSearchTermViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPaidOrganicSearchTermViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetPaidOrganicSearchTermViewRequest,
                com.google.ads.googleads.v4.resources.PaidOrganicSearchTermView>(
                  this, METHODID_GET_PAID_ORGANIC_SEARCH_TERM_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch paid organic search term views.
   * </pre>
   */
  public static final class PaidOrganicSearchTermViewServiceStub extends io.grpc.stub.AbstractStub<PaidOrganicSearchTermViewServiceStub> {
    private PaidOrganicSearchTermViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaidOrganicSearchTermViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaidOrganicSearchTermViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaidOrganicSearchTermViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested paid organic search term view in full detail.
     * </pre>
     */
    public void getPaidOrganicSearchTermView(com.google.ads.googleads.v4.services.GetPaidOrganicSearchTermViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.PaidOrganicSearchTermView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPaidOrganicSearchTermViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch paid organic search term views.
   * </pre>
   */
  public static final class PaidOrganicSearchTermViewServiceBlockingStub extends io.grpc.stub.AbstractStub<PaidOrganicSearchTermViewServiceBlockingStub> {
    private PaidOrganicSearchTermViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaidOrganicSearchTermViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaidOrganicSearchTermViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaidOrganicSearchTermViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested paid organic search term view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.PaidOrganicSearchTermView getPaidOrganicSearchTermView(com.google.ads.googleads.v4.services.GetPaidOrganicSearchTermViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPaidOrganicSearchTermViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch paid organic search term views.
   * </pre>
   */
  public static final class PaidOrganicSearchTermViewServiceFutureStub extends io.grpc.stub.AbstractStub<PaidOrganicSearchTermViewServiceFutureStub> {
    private PaidOrganicSearchTermViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaidOrganicSearchTermViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaidOrganicSearchTermViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaidOrganicSearchTermViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested paid organic search term view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.PaidOrganicSearchTermView> getPaidOrganicSearchTermView(
        com.google.ads.googleads.v4.services.GetPaidOrganicSearchTermViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPaidOrganicSearchTermViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PAID_ORGANIC_SEARCH_TERM_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaidOrganicSearchTermViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaidOrganicSearchTermViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PAID_ORGANIC_SEARCH_TERM_VIEW:
          serviceImpl.getPaidOrganicSearchTermView((com.google.ads.googleads.v4.services.GetPaidOrganicSearchTermViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.PaidOrganicSearchTermView>) responseObserver);
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

  private static abstract class PaidOrganicSearchTermViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaidOrganicSearchTermViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.PaidOrganicSearchTermViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaidOrganicSearchTermViewService");
    }
  }

  private static final class PaidOrganicSearchTermViewServiceFileDescriptorSupplier
      extends PaidOrganicSearchTermViewServiceBaseDescriptorSupplier {
    PaidOrganicSearchTermViewServiceFileDescriptorSupplier() {}
  }

  private static final class PaidOrganicSearchTermViewServiceMethodDescriptorSupplier
      extends PaidOrganicSearchTermViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PaidOrganicSearchTermViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PaidOrganicSearchTermViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaidOrganicSearchTermViewServiceFileDescriptorSupplier())
              .addMethod(getGetPaidOrganicSearchTermViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
