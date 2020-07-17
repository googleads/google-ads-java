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
 * Reach Plan Service gives users information about audience size that can
 * be reached through advertisement on YouTube. In particular,
 * GenerateReachForecast provides estimated number of people of specified
 * demographics that can be reached by an ad in a given market by a campaign of
 * certain duration with a defined budget.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/reach_plan_service.proto")
public final class ReachPlanServiceGrpc {

  private ReachPlanServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.ReachPlanService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListPlannableLocationsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.ListPlannableLocationsRequest,
      com.google.ads.googleads.v4.services.ListPlannableLocationsResponse> METHOD_LIST_PLANNABLE_LOCATIONS = getListPlannableLocationsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.ListPlannableLocationsRequest,
      com.google.ads.googleads.v4.services.ListPlannableLocationsResponse> getListPlannableLocationsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.ListPlannableLocationsRequest,
      com.google.ads.googleads.v4.services.ListPlannableLocationsResponse> getListPlannableLocationsMethod() {
    return getListPlannableLocationsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.ListPlannableLocationsRequest,
      com.google.ads.googleads.v4.services.ListPlannableLocationsResponse> getListPlannableLocationsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.ListPlannableLocationsRequest, com.google.ads.googleads.v4.services.ListPlannableLocationsResponse> getListPlannableLocationsMethod;
    if ((getListPlannableLocationsMethod = ReachPlanServiceGrpc.getListPlannableLocationsMethod) == null) {
      synchronized (ReachPlanServiceGrpc.class) {
        if ((getListPlannableLocationsMethod = ReachPlanServiceGrpc.getListPlannableLocationsMethod) == null) {
          ReachPlanServiceGrpc.getListPlannableLocationsMethod = getListPlannableLocationsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.ListPlannableLocationsRequest, com.google.ads.googleads.v4.services.ListPlannableLocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.ReachPlanService", "ListPlannableLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.ListPlannableLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.ListPlannableLocationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReachPlanServiceMethodDescriptorSupplier("ListPlannableLocations"))
                  .build();
          }
        }
     }
     return getListPlannableLocationsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListPlannableProductsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.ListPlannableProductsRequest,
      com.google.ads.googleads.v4.services.ListPlannableProductsResponse> METHOD_LIST_PLANNABLE_PRODUCTS = getListPlannableProductsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.ListPlannableProductsRequest,
      com.google.ads.googleads.v4.services.ListPlannableProductsResponse> getListPlannableProductsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.ListPlannableProductsRequest,
      com.google.ads.googleads.v4.services.ListPlannableProductsResponse> getListPlannableProductsMethod() {
    return getListPlannableProductsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.ListPlannableProductsRequest,
      com.google.ads.googleads.v4.services.ListPlannableProductsResponse> getListPlannableProductsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.ListPlannableProductsRequest, com.google.ads.googleads.v4.services.ListPlannableProductsResponse> getListPlannableProductsMethod;
    if ((getListPlannableProductsMethod = ReachPlanServiceGrpc.getListPlannableProductsMethod) == null) {
      synchronized (ReachPlanServiceGrpc.class) {
        if ((getListPlannableProductsMethod = ReachPlanServiceGrpc.getListPlannableProductsMethod) == null) {
          ReachPlanServiceGrpc.getListPlannableProductsMethod = getListPlannableProductsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.ListPlannableProductsRequest, com.google.ads.googleads.v4.services.ListPlannableProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.ReachPlanService", "ListPlannableProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.ListPlannableProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.ListPlannableProductsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReachPlanServiceMethodDescriptorSupplier("ListPlannableProducts"))
                  .build();
          }
        }
     }
     return getListPlannableProductsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGenerateProductMixIdeasMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest,
      com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse> METHOD_GENERATE_PRODUCT_MIX_IDEAS = getGenerateProductMixIdeasMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest,
      com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse> getGenerateProductMixIdeasMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest,
      com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse> getGenerateProductMixIdeasMethod() {
    return getGenerateProductMixIdeasMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest,
      com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse> getGenerateProductMixIdeasMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest, com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse> getGenerateProductMixIdeasMethod;
    if ((getGenerateProductMixIdeasMethod = ReachPlanServiceGrpc.getGenerateProductMixIdeasMethod) == null) {
      synchronized (ReachPlanServiceGrpc.class) {
        if ((getGenerateProductMixIdeasMethod = ReachPlanServiceGrpc.getGenerateProductMixIdeasMethod) == null) {
          ReachPlanServiceGrpc.getGenerateProductMixIdeasMethod = getGenerateProductMixIdeasMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest, com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.ReachPlanService", "GenerateProductMixIdeas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReachPlanServiceMethodDescriptorSupplier("GenerateProductMixIdeas"))
                  .build();
          }
        }
     }
     return getGenerateProductMixIdeasMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGenerateReachForecastMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateReachForecastRequest,
      com.google.ads.googleads.v4.services.GenerateReachForecastResponse> METHOD_GENERATE_REACH_FORECAST = getGenerateReachForecastMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateReachForecastRequest,
      com.google.ads.googleads.v4.services.GenerateReachForecastResponse> getGenerateReachForecastMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateReachForecastRequest,
      com.google.ads.googleads.v4.services.GenerateReachForecastResponse> getGenerateReachForecastMethod() {
    return getGenerateReachForecastMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateReachForecastRequest,
      com.google.ads.googleads.v4.services.GenerateReachForecastResponse> getGenerateReachForecastMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GenerateReachForecastRequest, com.google.ads.googleads.v4.services.GenerateReachForecastResponse> getGenerateReachForecastMethod;
    if ((getGenerateReachForecastMethod = ReachPlanServiceGrpc.getGenerateReachForecastMethod) == null) {
      synchronized (ReachPlanServiceGrpc.class) {
        if ((getGenerateReachForecastMethod = ReachPlanServiceGrpc.getGenerateReachForecastMethod) == null) {
          ReachPlanServiceGrpc.getGenerateReachForecastMethod = getGenerateReachForecastMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GenerateReachForecastRequest, com.google.ads.googleads.v4.services.GenerateReachForecastResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.ReachPlanService", "GenerateReachForecast"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GenerateReachForecastRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GenerateReachForecastResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReachPlanServiceMethodDescriptorSupplier("GenerateReachForecast"))
                  .build();
          }
        }
     }
     return getGenerateReachForecastMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReachPlanServiceStub newStub(io.grpc.Channel channel) {
    return new ReachPlanServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReachPlanServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReachPlanServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReachPlanServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReachPlanServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Reach Plan Service gives users information about audience size that can
   * be reached through advertisement on YouTube. In particular,
   * GenerateReachForecast provides estimated number of people of specified
   * demographics that can be reached by an ad in a given market by a campaign of
   * certain duration with a defined budget.
   * </pre>
   */
  public static abstract class ReachPlanServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the list of plannable locations (for example, countries &amp; DMAs).
     * </pre>
     */
    public void listPlannableLocations(com.google.ads.googleads.v4.services.ListPlannableLocationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.ListPlannableLocationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPlannableLocationsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of per-location plannable YouTube ad formats with allowed
     * targeting.
     * </pre>
     */
    public void listPlannableProducts(com.google.ads.googleads.v4.services.ListPlannableProductsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.ListPlannableProductsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPlannableProductsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Generates a product mix ideas given a set of preferences. This method
     * helps the advertiser to obtain a good mix of ad formats and budget
     * allocations based on its preferences.
     * </pre>
     */
    public void generateProductMixIdeas(com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateProductMixIdeasMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Generates a reach forecast for a given targeting / product mix.
     * </pre>
     */
    public void generateReachForecast(com.google.ads.googleads.v4.services.GenerateReachForecastRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateReachForecastResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateReachForecastMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListPlannableLocationsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.ListPlannableLocationsRequest,
                com.google.ads.googleads.v4.services.ListPlannableLocationsResponse>(
                  this, METHODID_LIST_PLANNABLE_LOCATIONS)))
          .addMethod(
            getListPlannableProductsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.ListPlannableProductsRequest,
                com.google.ads.googleads.v4.services.ListPlannableProductsResponse>(
                  this, METHODID_LIST_PLANNABLE_PRODUCTS)))
          .addMethod(
            getGenerateProductMixIdeasMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest,
                com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse>(
                  this, METHODID_GENERATE_PRODUCT_MIX_IDEAS)))
          .addMethod(
            getGenerateReachForecastMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GenerateReachForecastRequest,
                com.google.ads.googleads.v4.services.GenerateReachForecastResponse>(
                  this, METHODID_GENERATE_REACH_FORECAST)))
          .build();
    }
  }

  /**
   * <pre>
   * Reach Plan Service gives users information about audience size that can
   * be reached through advertisement on YouTube. In particular,
   * GenerateReachForecast provides estimated number of people of specified
   * demographics that can be reached by an ad in a given market by a campaign of
   * certain duration with a defined budget.
   * </pre>
   */
  public static final class ReachPlanServiceStub extends io.grpc.stub.AbstractStub<ReachPlanServiceStub> {
    private ReachPlanServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReachPlanServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReachPlanServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReachPlanServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of plannable locations (for example, countries &amp; DMAs).
     * </pre>
     */
    public void listPlannableLocations(com.google.ads.googleads.v4.services.ListPlannableLocationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.ListPlannableLocationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPlannableLocationsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of per-location plannable YouTube ad formats with allowed
     * targeting.
     * </pre>
     */
    public void listPlannableProducts(com.google.ads.googleads.v4.services.ListPlannableProductsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.ListPlannableProductsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPlannableProductsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates a product mix ideas given a set of preferences. This method
     * helps the advertiser to obtain a good mix of ad formats and budget
     * allocations based on its preferences.
     * </pre>
     */
    public void generateProductMixIdeas(com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateProductMixIdeasMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates a reach forecast for a given targeting / product mix.
     * </pre>
     */
    public void generateReachForecast(com.google.ads.googleads.v4.services.GenerateReachForecastRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateReachForecastResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateReachForecastMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Reach Plan Service gives users information about audience size that can
   * be reached through advertisement on YouTube. In particular,
   * GenerateReachForecast provides estimated number of people of specified
   * demographics that can be reached by an ad in a given market by a campaign of
   * certain duration with a defined budget.
   * </pre>
   */
  public static final class ReachPlanServiceBlockingStub extends io.grpc.stub.AbstractStub<ReachPlanServiceBlockingStub> {
    private ReachPlanServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReachPlanServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReachPlanServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReachPlanServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of plannable locations (for example, countries &amp; DMAs).
     * </pre>
     */
    public com.google.ads.googleads.v4.services.ListPlannableLocationsResponse listPlannableLocations(com.google.ads.googleads.v4.services.ListPlannableLocationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPlannableLocationsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of per-location plannable YouTube ad formats with allowed
     * targeting.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.ListPlannableProductsResponse listPlannableProducts(com.google.ads.googleads.v4.services.ListPlannableProductsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPlannableProductsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a product mix ideas given a set of preferences. This method
     * helps the advertiser to obtain a good mix of ad formats and budget
     * allocations based on its preferences.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse generateProductMixIdeas(com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateProductMixIdeasMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a reach forecast for a given targeting / product mix.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.GenerateReachForecastResponse generateReachForecast(com.google.ads.googleads.v4.services.GenerateReachForecastRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateReachForecastMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Reach Plan Service gives users information about audience size that can
   * be reached through advertisement on YouTube. In particular,
   * GenerateReachForecast provides estimated number of people of specified
   * demographics that can be reached by an ad in a given market by a campaign of
   * certain duration with a defined budget.
   * </pre>
   */
  public static final class ReachPlanServiceFutureStub extends io.grpc.stub.AbstractStub<ReachPlanServiceFutureStub> {
    private ReachPlanServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReachPlanServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReachPlanServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReachPlanServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of plannable locations (for example, countries &amp; DMAs).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.ListPlannableLocationsResponse> listPlannableLocations(
        com.google.ads.googleads.v4.services.ListPlannableLocationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPlannableLocationsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of per-location plannable YouTube ad formats with allowed
     * targeting.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.ListPlannableProductsResponse> listPlannableProducts(
        com.google.ads.googleads.v4.services.ListPlannableProductsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPlannableProductsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates a product mix ideas given a set of preferences. This method
     * helps the advertiser to obtain a good mix of ad formats and budget
     * allocations based on its preferences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse> generateProductMixIdeas(
        com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateProductMixIdeasMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates a reach forecast for a given targeting / product mix.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.GenerateReachForecastResponse> generateReachForecast(
        com.google.ads.googleads.v4.services.GenerateReachForecastRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateReachForecastMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PLANNABLE_LOCATIONS = 0;
  private static final int METHODID_LIST_PLANNABLE_PRODUCTS = 1;
  private static final int METHODID_GENERATE_PRODUCT_MIX_IDEAS = 2;
  private static final int METHODID_GENERATE_REACH_FORECAST = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReachPlanServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReachPlanServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_PLANNABLE_LOCATIONS:
          serviceImpl.listPlannableLocations((com.google.ads.googleads.v4.services.ListPlannableLocationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.ListPlannableLocationsResponse>) responseObserver);
          break;
        case METHODID_LIST_PLANNABLE_PRODUCTS:
          serviceImpl.listPlannableProducts((com.google.ads.googleads.v4.services.ListPlannableProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.ListPlannableProductsResponse>) responseObserver);
          break;
        case METHODID_GENERATE_PRODUCT_MIX_IDEAS:
          serviceImpl.generateProductMixIdeas((com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse>) responseObserver);
          break;
        case METHODID_GENERATE_REACH_FORECAST:
          serviceImpl.generateReachForecast((com.google.ads.googleads.v4.services.GenerateReachForecastRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.GenerateReachForecastResponse>) responseObserver);
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

  private static abstract class ReachPlanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReachPlanServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.ReachPlanServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReachPlanService");
    }
  }

  private static final class ReachPlanServiceFileDescriptorSupplier
      extends ReachPlanServiceBaseDescriptorSupplier {
    ReachPlanServiceFileDescriptorSupplier() {}
  }

  private static final class ReachPlanServiceMethodDescriptorSupplier
      extends ReachPlanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReachPlanServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReachPlanServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReachPlanServiceFileDescriptorSupplier())
              .addMethod(getListPlannableLocationsMethodHelper())
              .addMethod(getListPlannableProductsMethodHelper())
              .addMethod(getGenerateProductMixIdeasMethodHelper())
              .addMethod(getGenerateReachForecastMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
