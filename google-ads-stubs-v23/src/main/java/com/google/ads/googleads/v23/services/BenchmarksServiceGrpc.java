package com.google.ads.googleads.v23.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * BenchmarksService helps users compare YouTube advertisement data against
 * industry benchmarks. Accessible to allowlisted customers only.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class BenchmarksServiceGrpc {

  private BenchmarksServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v23.services.BenchmarksService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest,
      com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse> getListBenchmarksAvailableDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBenchmarksAvailableDates",
      requestType = com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest.class,
      responseType = com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest,
      com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse> getListBenchmarksAvailableDatesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest, com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse> getListBenchmarksAvailableDatesMethod;
    if ((getListBenchmarksAvailableDatesMethod = BenchmarksServiceGrpc.getListBenchmarksAvailableDatesMethod) == null) {
      synchronized (BenchmarksServiceGrpc.class) {
        if ((getListBenchmarksAvailableDatesMethod = BenchmarksServiceGrpc.getListBenchmarksAvailableDatesMethod) == null) {
          BenchmarksServiceGrpc.getListBenchmarksAvailableDatesMethod = getListBenchmarksAvailableDatesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest, com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBenchmarksAvailableDates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BenchmarksServiceMethodDescriptorSupplier("ListBenchmarksAvailableDates"))
              .build();
        }
      }
    }
    return getListBenchmarksAvailableDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest,
      com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse> getListBenchmarksLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBenchmarksLocations",
      requestType = com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest.class,
      responseType = com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest,
      com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse> getListBenchmarksLocationsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest, com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse> getListBenchmarksLocationsMethod;
    if ((getListBenchmarksLocationsMethod = BenchmarksServiceGrpc.getListBenchmarksLocationsMethod) == null) {
      synchronized (BenchmarksServiceGrpc.class) {
        if ((getListBenchmarksLocationsMethod = BenchmarksServiceGrpc.getListBenchmarksLocationsMethod) == null) {
          BenchmarksServiceGrpc.getListBenchmarksLocationsMethod = getListBenchmarksLocationsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest, com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBenchmarksLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BenchmarksServiceMethodDescriptorSupplier("ListBenchmarksLocations"))
              .build();
        }
      }
    }
    return getListBenchmarksLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest,
      com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse> getListBenchmarksProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBenchmarksProducts",
      requestType = com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest.class,
      responseType = com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest,
      com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse> getListBenchmarksProductsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest, com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse> getListBenchmarksProductsMethod;
    if ((getListBenchmarksProductsMethod = BenchmarksServiceGrpc.getListBenchmarksProductsMethod) == null) {
      synchronized (BenchmarksServiceGrpc.class) {
        if ((getListBenchmarksProductsMethod = BenchmarksServiceGrpc.getListBenchmarksProductsMethod) == null) {
          BenchmarksServiceGrpc.getListBenchmarksProductsMethod = getListBenchmarksProductsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest, com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBenchmarksProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BenchmarksServiceMethodDescriptorSupplier("ListBenchmarksProducts"))
              .build();
        }
      }
    }
    return getListBenchmarksProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest,
      com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse> getListBenchmarksSourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBenchmarksSources",
      requestType = com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest.class,
      responseType = com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest,
      com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse> getListBenchmarksSourcesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest, com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse> getListBenchmarksSourcesMethod;
    if ((getListBenchmarksSourcesMethod = BenchmarksServiceGrpc.getListBenchmarksSourcesMethod) == null) {
      synchronized (BenchmarksServiceGrpc.class) {
        if ((getListBenchmarksSourcesMethod = BenchmarksServiceGrpc.getListBenchmarksSourcesMethod) == null) {
          BenchmarksServiceGrpc.getListBenchmarksSourcesMethod = getListBenchmarksSourcesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest, com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBenchmarksSources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BenchmarksServiceMethodDescriptorSupplier("ListBenchmarksSources"))
              .build();
        }
      }
    }
    return getListBenchmarksSourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest,
      com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse> getGenerateBenchmarksMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateBenchmarksMetrics",
      requestType = com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest.class,
      responseType = com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest,
      com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse> getGenerateBenchmarksMetricsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest, com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse> getGenerateBenchmarksMetricsMethod;
    if ((getGenerateBenchmarksMetricsMethod = BenchmarksServiceGrpc.getGenerateBenchmarksMetricsMethod) == null) {
      synchronized (BenchmarksServiceGrpc.class) {
        if ((getGenerateBenchmarksMetricsMethod = BenchmarksServiceGrpc.getGenerateBenchmarksMetricsMethod) == null) {
          BenchmarksServiceGrpc.getGenerateBenchmarksMetricsMethod = getGenerateBenchmarksMetricsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest, com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateBenchmarksMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BenchmarksServiceMethodDescriptorSupplier("GenerateBenchmarksMetrics"))
              .build();
        }
      }
    }
    return getGenerateBenchmarksMetricsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BenchmarksServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BenchmarksServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BenchmarksServiceStub>() {
        @java.lang.Override
        public BenchmarksServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BenchmarksServiceStub(channel, callOptions);
        }
      };
    return BenchmarksServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static BenchmarksServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BenchmarksServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BenchmarksServiceBlockingV2Stub>() {
        @java.lang.Override
        public BenchmarksServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BenchmarksServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return BenchmarksServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BenchmarksServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BenchmarksServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BenchmarksServiceBlockingStub>() {
        @java.lang.Override
        public BenchmarksServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BenchmarksServiceBlockingStub(channel, callOptions);
        }
      };
    return BenchmarksServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BenchmarksServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BenchmarksServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BenchmarksServiceFutureStub>() {
        @java.lang.Override
        public BenchmarksServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BenchmarksServiceFutureStub(channel, callOptions);
        }
      };
    return BenchmarksServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * BenchmarksService helps users compare YouTube advertisement data against
   * industry benchmarks. Accessible to allowlisted customers only.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns a date range that supports benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void listBenchmarksAvailableDates(com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBenchmarksAvailableDatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of locations that support benchmarks (for example,
     * countries).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void listBenchmarksLocations(com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBenchmarksLocationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of products that supports benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void listBenchmarksProducts(com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBenchmarksProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of benchmarks sources (for example, Industry Verticals).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void listBenchmarksSources(com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBenchmarksSourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns YouTube advertisement metrics for the given client against industry
     * benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BenchmarksError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    default void generateBenchmarksMetrics(com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateBenchmarksMetricsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BenchmarksService.
   * <pre>
   * BenchmarksService helps users compare YouTube advertisement data against
   * industry benchmarks. Accessible to allowlisted customers only.
   * </pre>
   */
  public static abstract class BenchmarksServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BenchmarksServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BenchmarksService.
   * <pre>
   * BenchmarksService helps users compare YouTube advertisement data against
   * industry benchmarks. Accessible to allowlisted customers only.
   * </pre>
   */
  public static final class BenchmarksServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BenchmarksServiceStub> {
    private BenchmarksServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BenchmarksServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BenchmarksServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a date range that supports benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void listBenchmarksAvailableDates(com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBenchmarksAvailableDatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of locations that support benchmarks (for example,
     * countries).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void listBenchmarksLocations(com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBenchmarksLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of products that supports benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void listBenchmarksProducts(com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBenchmarksProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of benchmarks sources (for example, Industry Verticals).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void listBenchmarksSources(com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBenchmarksSourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns YouTube advertisement metrics for the given client against industry
     * benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BenchmarksError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateBenchmarksMetrics(com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateBenchmarksMetricsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BenchmarksService.
   * <pre>
   * BenchmarksService helps users compare YouTube advertisement data against
   * industry benchmarks. Accessible to allowlisted customers only.
   * </pre>
   */
  public static final class BenchmarksServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<BenchmarksServiceBlockingV2Stub> {
    private BenchmarksServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BenchmarksServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BenchmarksServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a date range that supports benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse listBenchmarksAvailableDates(com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListBenchmarksAvailableDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of locations that support benchmarks (for example,
     * countries).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse listBenchmarksLocations(com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListBenchmarksLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of products that supports benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse listBenchmarksProducts(com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListBenchmarksProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of benchmarks sources (for example, Industry Verticals).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse listBenchmarksSources(com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListBenchmarksSourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns YouTube advertisement metrics for the given client against industry
     * benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BenchmarksError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse generateBenchmarksMetrics(com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGenerateBenchmarksMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service BenchmarksService.
   * <pre>
   * BenchmarksService helps users compare YouTube advertisement data against
   * industry benchmarks. Accessible to allowlisted customers only.
   * </pre>
   */
  public static final class BenchmarksServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BenchmarksServiceBlockingStub> {
    private BenchmarksServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BenchmarksServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BenchmarksServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a date range that supports benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse listBenchmarksAvailableDates(com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBenchmarksAvailableDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of locations that support benchmarks (for example,
     * countries).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse listBenchmarksLocations(com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBenchmarksLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of products that supports benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse listBenchmarksProducts(com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBenchmarksProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of benchmarks sources (for example, Industry Verticals).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse listBenchmarksSources(com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBenchmarksSourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns YouTube advertisement metrics for the given client against industry
     * benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BenchmarksError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse generateBenchmarksMetrics(com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateBenchmarksMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BenchmarksService.
   * <pre>
   * BenchmarksService helps users compare YouTube advertisement data against
   * industry benchmarks. Accessible to allowlisted customers only.
   * </pre>
   */
  public static final class BenchmarksServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BenchmarksServiceFutureStub> {
    private BenchmarksServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BenchmarksServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BenchmarksServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a date range that supports benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse> listBenchmarksAvailableDates(
        com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBenchmarksAvailableDatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of locations that support benchmarks (for example,
     * countries).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse> listBenchmarksLocations(
        com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBenchmarksLocationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of products that supports benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse> listBenchmarksProducts(
        com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBenchmarksProductsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of benchmarks sources (for example, Industry Verticals).
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse> listBenchmarksSources(
        com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBenchmarksSourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns YouTube advertisement metrics for the given client against industry
     * benchmarks.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BenchmarksError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse> generateBenchmarksMetrics(
        com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateBenchmarksMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_BENCHMARKS_AVAILABLE_DATES = 0;
  private static final int METHODID_LIST_BENCHMARKS_LOCATIONS = 1;
  private static final int METHODID_LIST_BENCHMARKS_PRODUCTS = 2;
  private static final int METHODID_LIST_BENCHMARKS_SOURCES = 3;
  private static final int METHODID_GENERATE_BENCHMARKS_METRICS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_BENCHMARKS_AVAILABLE_DATES:
          serviceImpl.listBenchmarksAvailableDates((com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse>) responseObserver);
          break;
        case METHODID_LIST_BENCHMARKS_LOCATIONS:
          serviceImpl.listBenchmarksLocations((com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse>) responseObserver);
          break;
        case METHODID_LIST_BENCHMARKS_PRODUCTS:
          serviceImpl.listBenchmarksProducts((com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse>) responseObserver);
          break;
        case METHODID_LIST_BENCHMARKS_SOURCES:
          serviceImpl.listBenchmarksSources((com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse>) responseObserver);
          break;
        case METHODID_GENERATE_BENCHMARKS_METRICS:
          serviceImpl.generateBenchmarksMetrics((com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListBenchmarksAvailableDatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest,
              com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse>(
                service, METHODID_LIST_BENCHMARKS_AVAILABLE_DATES)))
        .addMethod(
          getListBenchmarksLocationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest,
              com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse>(
                service, METHODID_LIST_BENCHMARKS_LOCATIONS)))
        .addMethod(
          getListBenchmarksProductsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest,
              com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse>(
                service, METHODID_LIST_BENCHMARKS_PRODUCTS)))
        .addMethod(
          getListBenchmarksSourcesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest,
              com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse>(
                service, METHODID_LIST_BENCHMARKS_SOURCES)))
        .addMethod(
          getGenerateBenchmarksMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest,
              com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse>(
                service, METHODID_GENERATE_BENCHMARKS_METRICS)))
        .build();
  }

  private static abstract class BenchmarksServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BenchmarksServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v23.services.BenchmarksServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BenchmarksService");
    }
  }

  private static final class BenchmarksServiceFileDescriptorSupplier
      extends BenchmarksServiceBaseDescriptorSupplier {
    BenchmarksServiceFileDescriptorSupplier() {}
  }

  private static final class BenchmarksServiceMethodDescriptorSupplier
      extends BenchmarksServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BenchmarksServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BenchmarksServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BenchmarksServiceFileDescriptorSupplier())
              .addMethod(getListBenchmarksAvailableDatesMethod())
              .addMethod(getListBenchmarksLocationsMethod())
              .addMethod(getListBenchmarksProductsMethod())
              .addMethod(getListBenchmarksSourcesMethod())
              .addMethod(getGenerateBenchmarksMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
