package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ad group audience views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/ad_group_audience_view_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupAudienceViewServiceGrpc {

  private AdGroupAudienceViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.AdGroupAudienceViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAdGroupAudienceViewRequest,
      com.google.ads.googleads.v8.resources.AdGroupAudienceView> getGetAdGroupAudienceViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdGroupAudienceView",
      requestType = com.google.ads.googleads.v8.services.GetAdGroupAudienceViewRequest.class,
      responseType = com.google.ads.googleads.v8.resources.AdGroupAudienceView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAdGroupAudienceViewRequest,
      com.google.ads.googleads.v8.resources.AdGroupAudienceView> getGetAdGroupAudienceViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAdGroupAudienceViewRequest, com.google.ads.googleads.v8.resources.AdGroupAudienceView> getGetAdGroupAudienceViewMethod;
    if ((getGetAdGroupAudienceViewMethod = AdGroupAudienceViewServiceGrpc.getGetAdGroupAudienceViewMethod) == null) {
      synchronized (AdGroupAudienceViewServiceGrpc.class) {
        if ((getGetAdGroupAudienceViewMethod = AdGroupAudienceViewServiceGrpc.getGetAdGroupAudienceViewMethod) == null) {
          AdGroupAudienceViewServiceGrpc.getGetAdGroupAudienceViewMethod = getGetAdGroupAudienceViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetAdGroupAudienceViewRequest, com.google.ads.googleads.v8.resources.AdGroupAudienceView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdGroupAudienceView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetAdGroupAudienceViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.AdGroupAudienceView.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupAudienceViewServiceMethodDescriptorSupplier("GetAdGroupAudienceView"))
              .build();
        }
      }
    }
    return getGetAdGroupAudienceViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupAudienceViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAudienceViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAudienceViewServiceStub>() {
        @java.lang.Override
        public AdGroupAudienceViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAudienceViewServiceStub(channel, callOptions);
        }
      };
    return AdGroupAudienceViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupAudienceViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAudienceViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAudienceViewServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupAudienceViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAudienceViewServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupAudienceViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupAudienceViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAudienceViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAudienceViewServiceFutureStub>() {
        @java.lang.Override
        public AdGroupAudienceViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAudienceViewServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupAudienceViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage ad group audience views.
   * </pre>
   */
  public static abstract class AdGroupAudienceViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad group audience view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAdGroupAudienceView(com.google.ads.googleads.v8.services.GetAdGroupAudienceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AdGroupAudienceView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAdGroupAudienceViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupAudienceViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetAdGroupAudienceViewRequest,
                com.google.ads.googleads.v8.resources.AdGroupAudienceView>(
                  this, METHODID_GET_AD_GROUP_AUDIENCE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ad group audience views.
   * </pre>
   */
  public static final class AdGroupAudienceViewServiceStub extends io.grpc.stub.AbstractAsyncStub<AdGroupAudienceViewServiceStub> {
    private AdGroupAudienceViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAudienceViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAudienceViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group audience view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAdGroupAudienceView(com.google.ads.googleads.v8.services.GetAdGroupAudienceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AdGroupAudienceView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAdGroupAudienceViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ad group audience views.
   * </pre>
   */
  public static final class AdGroupAudienceViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdGroupAudienceViewServiceBlockingStub> {
    private AdGroupAudienceViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAudienceViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAudienceViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group audience view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.AdGroupAudienceView getAdGroupAudienceView(com.google.ads.googleads.v8.services.GetAdGroupAudienceViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAdGroupAudienceViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ad group audience views.
   * </pre>
   */
  public static final class AdGroupAudienceViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdGroupAudienceViewServiceFutureStub> {
    private AdGroupAudienceViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAudienceViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAudienceViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group audience view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.AdGroupAudienceView> getAdGroupAudienceView(
        com.google.ads.googleads.v8.services.GetAdGroupAudienceViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAdGroupAudienceViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_AUDIENCE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupAudienceViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupAudienceViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_AUDIENCE_VIEW:
          serviceImpl.getAdGroupAudienceView((com.google.ads.googleads.v8.services.GetAdGroupAudienceViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AdGroupAudienceView>) responseObserver);
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

  private static abstract class AdGroupAudienceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupAudienceViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.AdGroupAudienceViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupAudienceViewService");
    }
  }

  private static final class AdGroupAudienceViewServiceFileDescriptorSupplier
      extends AdGroupAudienceViewServiceBaseDescriptorSupplier {
    AdGroupAudienceViewServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupAudienceViewServiceMethodDescriptorSupplier
      extends AdGroupAudienceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupAudienceViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupAudienceViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupAudienceViewServiceFileDescriptorSupplier())
              .addMethod(getGetAdGroupAudienceViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
