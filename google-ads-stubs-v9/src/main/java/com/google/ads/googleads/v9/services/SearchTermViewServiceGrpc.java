package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage search term views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/search_term_view_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SearchTermViewServiceGrpc {

  private SearchTermViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.SearchTermViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetSearchTermViewRequest,
      com.google.ads.googleads.v9.resources.SearchTermView> getGetSearchTermViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSearchTermView",
      requestType = com.google.ads.googleads.v9.services.GetSearchTermViewRequest.class,
      responseType = com.google.ads.googleads.v9.resources.SearchTermView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetSearchTermViewRequest,
      com.google.ads.googleads.v9.resources.SearchTermView> getGetSearchTermViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetSearchTermViewRequest, com.google.ads.googleads.v9.resources.SearchTermView> getGetSearchTermViewMethod;
    if ((getGetSearchTermViewMethod = SearchTermViewServiceGrpc.getGetSearchTermViewMethod) == null) {
      synchronized (SearchTermViewServiceGrpc.class) {
        if ((getGetSearchTermViewMethod = SearchTermViewServiceGrpc.getGetSearchTermViewMethod) == null) {
          SearchTermViewServiceGrpc.getGetSearchTermViewMethod = getGetSearchTermViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetSearchTermViewRequest, com.google.ads.googleads.v9.resources.SearchTermView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSearchTermView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetSearchTermViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.SearchTermView.getDefaultInstance()))
              .setSchemaDescriptor(new SearchTermViewServiceMethodDescriptorSupplier("GetSearchTermView"))
              .build();
        }
      }
    }
    return getGetSearchTermViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchTermViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchTermViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchTermViewServiceStub>() {
        @java.lang.Override
        public SearchTermViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchTermViewServiceStub(channel, callOptions);
        }
      };
    return SearchTermViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchTermViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchTermViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchTermViewServiceBlockingStub>() {
        @java.lang.Override
        public SearchTermViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchTermViewServiceBlockingStub(channel, callOptions);
        }
      };
    return SearchTermViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchTermViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchTermViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchTermViewServiceFutureStub>() {
        @java.lang.Override
        public SearchTermViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchTermViewServiceFutureStub(channel, callOptions);
        }
      };
    return SearchTermViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage search term views.
   * </pre>
   */
  public static abstract class SearchTermViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the attributes of the requested search term view.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getSearchTermView(com.google.ads.googleads.v9.services.GetSearchTermViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.SearchTermView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSearchTermViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSearchTermViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetSearchTermViewRequest,
                com.google.ads.googleads.v9.resources.SearchTermView>(
                  this, METHODID_GET_SEARCH_TERM_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage search term views.
   * </pre>
   */
  public static final class SearchTermViewServiceStub extends io.grpc.stub.AbstractAsyncStub<SearchTermViewServiceStub> {
    private SearchTermViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchTermViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchTermViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the attributes of the requested search term view.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getSearchTermView(com.google.ads.googleads.v9.services.GetSearchTermViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.SearchTermView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSearchTermViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage search term views.
   * </pre>
   */
  public static final class SearchTermViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SearchTermViewServiceBlockingStub> {
    private SearchTermViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchTermViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchTermViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the attributes of the requested search term view.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.SearchTermView getSearchTermView(com.google.ads.googleads.v9.services.GetSearchTermViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSearchTermViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage search term views.
   * </pre>
   */
  public static final class SearchTermViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SearchTermViewServiceFutureStub> {
    private SearchTermViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchTermViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchTermViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the attributes of the requested search term view.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.SearchTermView> getSearchTermView(
        com.google.ads.googleads.v9.services.GetSearchTermViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSearchTermViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SEARCH_TERM_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchTermViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchTermViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SEARCH_TERM_VIEW:
          serviceImpl.getSearchTermView((com.google.ads.googleads.v9.services.GetSearchTermViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.SearchTermView>) responseObserver);
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

  private static abstract class SearchTermViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchTermViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.SearchTermViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchTermViewService");
    }
  }

  private static final class SearchTermViewServiceFileDescriptorSupplier
      extends SearchTermViewServiceBaseDescriptorSupplier {
    SearchTermViewServiceFileDescriptorSupplier() {}
  }

  private static final class SearchTermViewServiceMethodDescriptorSupplier
      extends SearchTermViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchTermViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchTermViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchTermViewServiceFileDescriptorSupplier())
              .addMethod(getGetSearchTermViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
