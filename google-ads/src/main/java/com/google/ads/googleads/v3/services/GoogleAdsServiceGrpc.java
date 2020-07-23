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
 * Service to fetch data and metrics across resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v3/services/google_ads_service.proto")
public final class GoogleAdsServiceGrpc {

  private GoogleAdsServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.GoogleAdsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.SearchGoogleAdsRequest,
      com.google.ads.googleads.v3.services.SearchGoogleAdsResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = com.google.ads.googleads.v3.services.SearchGoogleAdsRequest.class,
      responseType = com.google.ads.googleads.v3.services.SearchGoogleAdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.SearchGoogleAdsRequest,
      com.google.ads.googleads.v3.services.SearchGoogleAdsResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.SearchGoogleAdsRequest, com.google.ads.googleads.v3.services.SearchGoogleAdsResponse> getSearchMethod;
    if ((getSearchMethod = GoogleAdsServiceGrpc.getSearchMethod) == null) {
      synchronized (GoogleAdsServiceGrpc.class) {
        if ((getSearchMethod = GoogleAdsServiceGrpc.getSearchMethod) == null) {
          GoogleAdsServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.SearchGoogleAdsRequest, com.google.ads.googleads.v3.services.SearchGoogleAdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.SearchGoogleAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.SearchGoogleAdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GoogleAdsServiceMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.SearchGoogleAdsStreamRequest,
      com.google.ads.googleads.v3.services.SearchGoogleAdsStreamResponse> getSearchStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchStream",
      requestType = com.google.ads.googleads.v3.services.SearchGoogleAdsStreamRequest.class,
      responseType = com.google.ads.googleads.v3.services.SearchGoogleAdsStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.SearchGoogleAdsStreamRequest,
      com.google.ads.googleads.v3.services.SearchGoogleAdsStreamResponse> getSearchStreamMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.SearchGoogleAdsStreamRequest, com.google.ads.googleads.v3.services.SearchGoogleAdsStreamResponse> getSearchStreamMethod;
    if ((getSearchStreamMethod = GoogleAdsServiceGrpc.getSearchStreamMethod) == null) {
      synchronized (GoogleAdsServiceGrpc.class) {
        if ((getSearchStreamMethod = GoogleAdsServiceGrpc.getSearchStreamMethod) == null) {
          GoogleAdsServiceGrpc.getSearchStreamMethod = getSearchStreamMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.SearchGoogleAdsStreamRequest, com.google.ads.googleads.v3.services.SearchGoogleAdsStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.SearchGoogleAdsStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.SearchGoogleAdsStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GoogleAdsServiceMethodDescriptorSupplier("SearchStream"))
              .build();
        }
      }
    }
    return getSearchStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateGoogleAdsRequest,
      com.google.ads.googleads.v3.services.MutateGoogleAdsResponse> getMutateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mutate",
      requestType = com.google.ads.googleads.v3.services.MutateGoogleAdsRequest.class,
      responseType = com.google.ads.googleads.v3.services.MutateGoogleAdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateGoogleAdsRequest,
      com.google.ads.googleads.v3.services.MutateGoogleAdsResponse> getMutateMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateGoogleAdsRequest, com.google.ads.googleads.v3.services.MutateGoogleAdsResponse> getMutateMethod;
    if ((getMutateMethod = GoogleAdsServiceGrpc.getMutateMethod) == null) {
      synchronized (GoogleAdsServiceGrpc.class) {
        if ((getMutateMethod = GoogleAdsServiceGrpc.getMutateMethod) == null) {
          GoogleAdsServiceGrpc.getMutateMethod = getMutateMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.MutateGoogleAdsRequest, com.google.ads.googleads.v3.services.MutateGoogleAdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mutate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateGoogleAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateGoogleAdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GoogleAdsServiceMethodDescriptorSupplier("Mutate"))
              .build();
        }
      }
    }
    return getMutateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GoogleAdsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoogleAdsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoogleAdsServiceStub>() {
        @java.lang.Override
        public GoogleAdsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoogleAdsServiceStub(channel, callOptions);
        }
      };
    return GoogleAdsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GoogleAdsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoogleAdsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoogleAdsServiceBlockingStub>() {
        @java.lang.Override
        public GoogleAdsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoogleAdsServiceBlockingStub(channel, callOptions);
        }
      };
    return GoogleAdsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GoogleAdsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoogleAdsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoogleAdsServiceFutureStub>() {
        @java.lang.Override
        public GoogleAdsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoogleAdsServiceFutureStub(channel, callOptions);
        }
      };
    return GoogleAdsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch data and metrics across resources.
   * </pre>
   */
  public static abstract class GoogleAdsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns all rows that match the search query.
     * </pre>
     */
    public void search(com.google.ads.googleads.v3.services.SearchGoogleAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.SearchGoogleAdsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all rows that match the search stream query.
     * </pre>
     */
    public void searchStream(com.google.ads.googleads.v3.services.SearchGoogleAdsStreamRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.SearchGoogleAdsStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes resources. This method supports atomic
     * transactions with multiple types of resources. For example, you can
     * atomically create a campaign and a campaign budget, or perform up to
     * thousands of mutates atomically.
     * This method is essentially a wrapper around a series of mutate methods. The
     * only features it offers over calling those methods directly are:
     * - Atomic transactions
     * - Temp resource names (described below)
     * - Somewhat reduced latency over making a series of mutate calls
     * Note: Only resources that support atomic transactions are included, so this
     * method can't replace all calls to individual services.
     * ## Atomic Transaction Benefits
     * Atomicity makes error handling much easier. If you're making a series of
     * changes and one fails, it can leave your account in an inconsistent state.
     * With atomicity, you either reach the desired state directly, or the request
     * fails and you can retry.
     * ## Temp Resource Names
     * Temp resource names are a special type of resource name used to create a
     * resource and reference that resource in the same request. For example, if a
     * campaign budget is created with `resource_name` equal to
     * `customers/123/campaignBudgets/-1`, that resource name can be reused in
     * the `Campaign.budget` field in the same request. That way, the two
     * resources are created and linked atomically.
     * To create a temp resource name, put a negative number in the part of the
     * name that the server would normally allocate.
     * Note:
     * - Resources must be created with a temp name before the name can be reused.
     *   For example, the previous CampaignBudget+Campaign example would fail if
     *   the mutate order was reversed.
     * - Temp names are not remembered across requests.
     * - There's no limit to the number of temp names in a request.
     * - Each temp name must use a unique negative number, even if the resource
     *   types differ.
     * ## Latency
     * It's important to group mutates by resource type or the request may time
     * out and fail. Latency is roughly equal to a series of calls to individual
     * mutate methods, where each change in resource type is a new call. For
     * example, mutating 10 campaigns then 10 ad groups is like 2 calls, while
     * mutating 1 campaign, 1 ad group, 1 campaign, 1 ad group is like 4 calls.
     * </pre>
     */
    public void mutate(com.google.ads.googleads.v3.services.MutateGoogleAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateGoogleAdsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.SearchGoogleAdsRequest,
                com.google.ads.googleads.v3.services.SearchGoogleAdsResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getSearchStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.SearchGoogleAdsStreamRequest,
                com.google.ads.googleads.v3.services.SearchGoogleAdsStreamResponse>(
                  this, METHODID_SEARCH_STREAM)))
          .addMethod(
            getMutateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.MutateGoogleAdsRequest,
                com.google.ads.googleads.v3.services.MutateGoogleAdsResponse>(
                  this, METHODID_MUTATE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch data and metrics across resources.
   * </pre>
   */
  public static final class GoogleAdsServiceStub extends io.grpc.stub.AbstractAsyncStub<GoogleAdsServiceStub> {
    private GoogleAdsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleAdsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoogleAdsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all rows that match the search query.
     * </pre>
     */
    public void search(com.google.ads.googleads.v3.services.SearchGoogleAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.SearchGoogleAdsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all rows that match the search stream query.
     * </pre>
     */
    public void searchStream(com.google.ads.googleads.v3.services.SearchGoogleAdsStreamRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.SearchGoogleAdsStreamResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSearchStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes resources. This method supports atomic
     * transactions with multiple types of resources. For example, you can
     * atomically create a campaign and a campaign budget, or perform up to
     * thousands of mutates atomically.
     * This method is essentially a wrapper around a series of mutate methods. The
     * only features it offers over calling those methods directly are:
     * - Atomic transactions
     * - Temp resource names (described below)
     * - Somewhat reduced latency over making a series of mutate calls
     * Note: Only resources that support atomic transactions are included, so this
     * method can't replace all calls to individual services.
     * ## Atomic Transaction Benefits
     * Atomicity makes error handling much easier. If you're making a series of
     * changes and one fails, it can leave your account in an inconsistent state.
     * With atomicity, you either reach the desired state directly, or the request
     * fails and you can retry.
     * ## Temp Resource Names
     * Temp resource names are a special type of resource name used to create a
     * resource and reference that resource in the same request. For example, if a
     * campaign budget is created with `resource_name` equal to
     * `customers/123/campaignBudgets/-1`, that resource name can be reused in
     * the `Campaign.budget` field in the same request. That way, the two
     * resources are created and linked atomically.
     * To create a temp resource name, put a negative number in the part of the
     * name that the server would normally allocate.
     * Note:
     * - Resources must be created with a temp name before the name can be reused.
     *   For example, the previous CampaignBudget+Campaign example would fail if
     *   the mutate order was reversed.
     * - Temp names are not remembered across requests.
     * - There's no limit to the number of temp names in a request.
     * - Each temp name must use a unique negative number, even if the resource
     *   types differ.
     * ## Latency
     * It's important to group mutates by resource type or the request may time
     * out and fail. Latency is roughly equal to a series of calls to individual
     * mutate methods, where each change in resource type is a new call. For
     * example, mutating 10 campaigns then 10 ad groups is like 2 calls, while
     * mutating 1 campaign, 1 ad group, 1 campaign, 1 ad group is like 4 calls.
     * </pre>
     */
    public void mutate(com.google.ads.googleads.v3.services.MutateGoogleAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateGoogleAdsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch data and metrics across resources.
   * </pre>
   */
  public static final class GoogleAdsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GoogleAdsServiceBlockingStub> {
    private GoogleAdsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleAdsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoogleAdsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all rows that match the search query.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.SearchGoogleAdsResponse search(com.google.ads.googleads.v3.services.SearchGoogleAdsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all rows that match the search stream query.
     * </pre>
     */
    public java.util.Iterator<com.google.ads.googleads.v3.services.SearchGoogleAdsStreamResponse> searchStream(
        com.google.ads.googleads.v3.services.SearchGoogleAdsStreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSearchStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes resources. This method supports atomic
     * transactions with multiple types of resources. For example, you can
     * atomically create a campaign and a campaign budget, or perform up to
     * thousands of mutates atomically.
     * This method is essentially a wrapper around a series of mutate methods. The
     * only features it offers over calling those methods directly are:
     * - Atomic transactions
     * - Temp resource names (described below)
     * - Somewhat reduced latency over making a series of mutate calls
     * Note: Only resources that support atomic transactions are included, so this
     * method can't replace all calls to individual services.
     * ## Atomic Transaction Benefits
     * Atomicity makes error handling much easier. If you're making a series of
     * changes and one fails, it can leave your account in an inconsistent state.
     * With atomicity, you either reach the desired state directly, or the request
     * fails and you can retry.
     * ## Temp Resource Names
     * Temp resource names are a special type of resource name used to create a
     * resource and reference that resource in the same request. For example, if a
     * campaign budget is created with `resource_name` equal to
     * `customers/123/campaignBudgets/-1`, that resource name can be reused in
     * the `Campaign.budget` field in the same request. That way, the two
     * resources are created and linked atomically.
     * To create a temp resource name, put a negative number in the part of the
     * name that the server would normally allocate.
     * Note:
     * - Resources must be created with a temp name before the name can be reused.
     *   For example, the previous CampaignBudget+Campaign example would fail if
     *   the mutate order was reversed.
     * - Temp names are not remembered across requests.
     * - There's no limit to the number of temp names in a request.
     * - Each temp name must use a unique negative number, even if the resource
     *   types differ.
     * ## Latency
     * It's important to group mutates by resource type or the request may time
     * out and fail. Latency is roughly equal to a series of calls to individual
     * mutate methods, where each change in resource type is a new call. For
     * example, mutating 10 campaigns then 10 ad groups is like 2 calls, while
     * mutating 1 campaign, 1 ad group, 1 campaign, 1 ad group is like 4 calls.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.MutateGoogleAdsResponse mutate(com.google.ads.googleads.v3.services.MutateGoogleAdsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch data and metrics across resources.
   * </pre>
   */
  public static final class GoogleAdsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GoogleAdsServiceFutureStub> {
    private GoogleAdsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleAdsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoogleAdsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all rows that match the search query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.SearchGoogleAdsResponse> search(
        com.google.ads.googleads.v3.services.SearchGoogleAdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes resources. This method supports atomic
     * transactions with multiple types of resources. For example, you can
     * atomically create a campaign and a campaign budget, or perform up to
     * thousands of mutates atomically.
     * This method is essentially a wrapper around a series of mutate methods. The
     * only features it offers over calling those methods directly are:
     * - Atomic transactions
     * - Temp resource names (described below)
     * - Somewhat reduced latency over making a series of mutate calls
     * Note: Only resources that support atomic transactions are included, so this
     * method can't replace all calls to individual services.
     * ## Atomic Transaction Benefits
     * Atomicity makes error handling much easier. If you're making a series of
     * changes and one fails, it can leave your account in an inconsistent state.
     * With atomicity, you either reach the desired state directly, or the request
     * fails and you can retry.
     * ## Temp Resource Names
     * Temp resource names are a special type of resource name used to create a
     * resource and reference that resource in the same request. For example, if a
     * campaign budget is created with `resource_name` equal to
     * `customers/123/campaignBudgets/-1`, that resource name can be reused in
     * the `Campaign.budget` field in the same request. That way, the two
     * resources are created and linked atomically.
     * To create a temp resource name, put a negative number in the part of the
     * name that the server would normally allocate.
     * Note:
     * - Resources must be created with a temp name before the name can be reused.
     *   For example, the previous CampaignBudget+Campaign example would fail if
     *   the mutate order was reversed.
     * - Temp names are not remembered across requests.
     * - There's no limit to the number of temp names in a request.
     * - Each temp name must use a unique negative number, even if the resource
     *   types differ.
     * ## Latency
     * It's important to group mutates by resource type or the request may time
     * out and fail. Latency is roughly equal to a series of calls to individual
     * mutate methods, where each change in resource type is a new call. For
     * example, mutating 10 campaigns then 10 ad groups is like 2 calls, while
     * mutating 1 campaign, 1 ad group, 1 campaign, 1 ad group is like 4 calls.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.MutateGoogleAdsResponse> mutate(
        com.google.ads.googleads.v3.services.MutateGoogleAdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_SEARCH_STREAM = 1;
  private static final int METHODID_MUTATE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GoogleAdsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GoogleAdsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((com.google.ads.googleads.v3.services.SearchGoogleAdsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.SearchGoogleAdsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_STREAM:
          serviceImpl.searchStream((com.google.ads.googleads.v3.services.SearchGoogleAdsStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.SearchGoogleAdsStreamResponse>) responseObserver);
          break;
        case METHODID_MUTATE:
          serviceImpl.mutate((com.google.ads.googleads.v3.services.MutateGoogleAdsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateGoogleAdsResponse>) responseObserver);
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

  private static abstract class GoogleAdsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GoogleAdsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.GoogleAdsServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GoogleAdsService");
    }
  }

  private static final class GoogleAdsServiceFileDescriptorSupplier
      extends GoogleAdsServiceBaseDescriptorSupplier {
    GoogleAdsServiceFileDescriptorSupplier() {}
  }

  private static final class GoogleAdsServiceMethodDescriptorSupplier
      extends GoogleAdsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GoogleAdsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GoogleAdsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GoogleAdsServiceFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getSearchStreamMethod())
              .addMethod(getMutateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
