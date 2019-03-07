package com.google.ads.googleads.v1.services;

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
 * Service to fetch dynamic search ads views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/dynamic_search_ads_search_term_view_service.proto")
public final class DynamicSearchAdsSearchTermViewServiceGrpc {

  private DynamicSearchAdsSearchTermViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.DynamicSearchAdsSearchTermViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetDynamicSearchAdsSearchTermViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetDynamicSearchAdsSearchTermViewRequest,
      com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermView> METHOD_GET_DYNAMIC_SEARCH_ADS_SEARCH_TERM_VIEW = getGetDynamicSearchAdsSearchTermViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetDynamicSearchAdsSearchTermViewRequest,
      com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermView> getGetDynamicSearchAdsSearchTermViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetDynamicSearchAdsSearchTermViewRequest,
      com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermView> getGetDynamicSearchAdsSearchTermViewMethod() {
    return getGetDynamicSearchAdsSearchTermViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetDynamicSearchAdsSearchTermViewRequest,
      com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermView> getGetDynamicSearchAdsSearchTermViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetDynamicSearchAdsSearchTermViewRequest, com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermView> getGetDynamicSearchAdsSearchTermViewMethod;
    if ((getGetDynamicSearchAdsSearchTermViewMethod = DynamicSearchAdsSearchTermViewServiceGrpc.getGetDynamicSearchAdsSearchTermViewMethod) == null) {
      synchronized (DynamicSearchAdsSearchTermViewServiceGrpc.class) {
        if ((getGetDynamicSearchAdsSearchTermViewMethod = DynamicSearchAdsSearchTermViewServiceGrpc.getGetDynamicSearchAdsSearchTermViewMethod) == null) {
          DynamicSearchAdsSearchTermViewServiceGrpc.getGetDynamicSearchAdsSearchTermViewMethod = getGetDynamicSearchAdsSearchTermViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetDynamicSearchAdsSearchTermViewRequest, com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.DynamicSearchAdsSearchTermViewService", "GetDynamicSearchAdsSearchTermView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetDynamicSearchAdsSearchTermViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermView.getDefaultInstance()))
                  .setSchemaDescriptor(new DynamicSearchAdsSearchTermViewServiceMethodDescriptorSupplier("GetDynamicSearchAdsSearchTermView"))
                  .build();
          }
        }
     }
     return getGetDynamicSearchAdsSearchTermViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DynamicSearchAdsSearchTermViewServiceStub newStub(io.grpc.Channel channel) {
    return new DynamicSearchAdsSearchTermViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DynamicSearchAdsSearchTermViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DynamicSearchAdsSearchTermViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DynamicSearchAdsSearchTermViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DynamicSearchAdsSearchTermViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch dynamic search ads views.
   * </pre>
   */
  public static abstract class DynamicSearchAdsSearchTermViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested dynamic search ads search term view in full detail.
     * </pre>
     */
    public void getDynamicSearchAdsSearchTermView(com.google.ads.googleads.v1.services.GetDynamicSearchAdsSearchTermViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDynamicSearchAdsSearchTermViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDynamicSearchAdsSearchTermViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetDynamicSearchAdsSearchTermViewRequest,
                com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermView>(
                  this, METHODID_GET_DYNAMIC_SEARCH_ADS_SEARCH_TERM_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch dynamic search ads views.
   * </pre>
   */
  public static final class DynamicSearchAdsSearchTermViewServiceStub extends io.grpc.stub.AbstractStub<DynamicSearchAdsSearchTermViewServiceStub> {
    private DynamicSearchAdsSearchTermViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DynamicSearchAdsSearchTermViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DynamicSearchAdsSearchTermViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DynamicSearchAdsSearchTermViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested dynamic search ads search term view in full detail.
     * </pre>
     */
    public void getDynamicSearchAdsSearchTermView(com.google.ads.googleads.v1.services.GetDynamicSearchAdsSearchTermViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDynamicSearchAdsSearchTermViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch dynamic search ads views.
   * </pre>
   */
  public static final class DynamicSearchAdsSearchTermViewServiceBlockingStub extends io.grpc.stub.AbstractStub<DynamicSearchAdsSearchTermViewServiceBlockingStub> {
    private DynamicSearchAdsSearchTermViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DynamicSearchAdsSearchTermViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DynamicSearchAdsSearchTermViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DynamicSearchAdsSearchTermViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested dynamic search ads search term view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermView getDynamicSearchAdsSearchTermView(com.google.ads.googleads.v1.services.GetDynamicSearchAdsSearchTermViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDynamicSearchAdsSearchTermViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch dynamic search ads views.
   * </pre>
   */
  public static final class DynamicSearchAdsSearchTermViewServiceFutureStub extends io.grpc.stub.AbstractStub<DynamicSearchAdsSearchTermViewServiceFutureStub> {
    private DynamicSearchAdsSearchTermViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DynamicSearchAdsSearchTermViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DynamicSearchAdsSearchTermViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DynamicSearchAdsSearchTermViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested dynamic search ads search term view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermView> getDynamicSearchAdsSearchTermView(
        com.google.ads.googleads.v1.services.GetDynamicSearchAdsSearchTermViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDynamicSearchAdsSearchTermViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DYNAMIC_SEARCH_ADS_SEARCH_TERM_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DynamicSearchAdsSearchTermViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DynamicSearchAdsSearchTermViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DYNAMIC_SEARCH_ADS_SEARCH_TERM_VIEW:
          serviceImpl.getDynamicSearchAdsSearchTermView((com.google.ads.googleads.v1.services.GetDynamicSearchAdsSearchTermViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermView>) responseObserver);
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

  private static abstract class DynamicSearchAdsSearchTermViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DynamicSearchAdsSearchTermViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.DynamicSearchAdsSearchTermViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DynamicSearchAdsSearchTermViewService");
    }
  }

  private static final class DynamicSearchAdsSearchTermViewServiceFileDescriptorSupplier
      extends DynamicSearchAdsSearchTermViewServiceBaseDescriptorSupplier {
    DynamicSearchAdsSearchTermViewServiceFileDescriptorSupplier() {}
  }

  private static final class DynamicSearchAdsSearchTermViewServiceMethodDescriptorSupplier
      extends DynamicSearchAdsSearchTermViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DynamicSearchAdsSearchTermViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DynamicSearchAdsSearchTermViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DynamicSearchAdsSearchTermViewServiceFileDescriptorSupplier())
              .addMethod(getGetDynamicSearchAdsSearchTermViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
