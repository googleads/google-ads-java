package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch paid organic search term views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/paid_organic_search_term_view_service.proto")
public final class PaidOrganicSearchTermViewServiceGrpc {

  private PaidOrganicSearchTermViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.PaidOrganicSearchTermViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetPaidOrganicSearchTermViewRequest,
      com.google.ads.googleads.v8.resources.PaidOrganicSearchTermView> getGetPaidOrganicSearchTermViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaidOrganicSearchTermView",
      requestType = com.google.ads.googleads.v8.services.GetPaidOrganicSearchTermViewRequest.class,
      responseType = com.google.ads.googleads.v8.resources.PaidOrganicSearchTermView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetPaidOrganicSearchTermViewRequest,
      com.google.ads.googleads.v8.resources.PaidOrganicSearchTermView> getGetPaidOrganicSearchTermViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetPaidOrganicSearchTermViewRequest, com.google.ads.googleads.v8.resources.PaidOrganicSearchTermView> getGetPaidOrganicSearchTermViewMethod;
    if ((getGetPaidOrganicSearchTermViewMethod = PaidOrganicSearchTermViewServiceGrpc.getGetPaidOrganicSearchTermViewMethod) == null) {
      synchronized (PaidOrganicSearchTermViewServiceGrpc.class) {
        if ((getGetPaidOrganicSearchTermViewMethod = PaidOrganicSearchTermViewServiceGrpc.getGetPaidOrganicSearchTermViewMethod) == null) {
          PaidOrganicSearchTermViewServiceGrpc.getGetPaidOrganicSearchTermViewMethod = getGetPaidOrganicSearchTermViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetPaidOrganicSearchTermViewRequest, com.google.ads.googleads.v8.resources.PaidOrganicSearchTermView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaidOrganicSearchTermView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetPaidOrganicSearchTermViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.PaidOrganicSearchTermView.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<PaidOrganicSearchTermViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaidOrganicSearchTermViewServiceStub>() {
        @java.lang.Override
        public PaidOrganicSearchTermViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaidOrganicSearchTermViewServiceStub(channel, callOptions);
        }
      };
    return PaidOrganicSearchTermViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaidOrganicSearchTermViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaidOrganicSearchTermViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaidOrganicSearchTermViewServiceBlockingStub>() {
        @java.lang.Override
        public PaidOrganicSearchTermViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaidOrganicSearchTermViewServiceBlockingStub(channel, callOptions);
        }
      };
    return PaidOrganicSearchTermViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaidOrganicSearchTermViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaidOrganicSearchTermViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaidOrganicSearchTermViewServiceFutureStub>() {
        @java.lang.Override
        public PaidOrganicSearchTermViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaidOrganicSearchTermViewServiceFutureStub(channel, callOptions);
        }
      };
    return PaidOrganicSearchTermViewServiceFutureStub.newStub(factory, channel);
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
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getPaidOrganicSearchTermView(com.google.ads.googleads.v8.services.GetPaidOrganicSearchTermViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.PaidOrganicSearchTermView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaidOrganicSearchTermViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPaidOrganicSearchTermViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetPaidOrganicSearchTermViewRequest,
                com.google.ads.googleads.v8.resources.PaidOrganicSearchTermView>(
                  this, METHODID_GET_PAID_ORGANIC_SEARCH_TERM_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch paid organic search term views.
   * </pre>
   */
  public static final class PaidOrganicSearchTermViewServiceStub extends io.grpc.stub.AbstractAsyncStub<PaidOrganicSearchTermViewServiceStub> {
    private PaidOrganicSearchTermViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaidOrganicSearchTermViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaidOrganicSearchTermViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested paid organic search term view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getPaidOrganicSearchTermView(com.google.ads.googleads.v8.services.GetPaidOrganicSearchTermViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.PaidOrganicSearchTermView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaidOrganicSearchTermViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch paid organic search term views.
   * </pre>
   */
  public static final class PaidOrganicSearchTermViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PaidOrganicSearchTermViewServiceBlockingStub> {
    private PaidOrganicSearchTermViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaidOrganicSearchTermViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaidOrganicSearchTermViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested paid organic search term view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.PaidOrganicSearchTermView getPaidOrganicSearchTermView(com.google.ads.googleads.v8.services.GetPaidOrganicSearchTermViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaidOrganicSearchTermViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch paid organic search term views.
   * </pre>
   */
  public static final class PaidOrganicSearchTermViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PaidOrganicSearchTermViewServiceFutureStub> {
    private PaidOrganicSearchTermViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaidOrganicSearchTermViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaidOrganicSearchTermViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested paid organic search term view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.PaidOrganicSearchTermView> getPaidOrganicSearchTermView(
        com.google.ads.googleads.v8.services.GetPaidOrganicSearchTermViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaidOrganicSearchTermViewMethod(), getCallOptions()), request);
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
          serviceImpl.getPaidOrganicSearchTermView((com.google.ads.googleads.v8.services.GetPaidOrganicSearchTermViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.PaidOrganicSearchTermView>) responseObserver);
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
      return com.google.ads.googleads.v8.services.PaidOrganicSearchTermViewServiceProto.getDescriptor();
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
              .addMethod(getGetPaidOrganicSearchTermViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
