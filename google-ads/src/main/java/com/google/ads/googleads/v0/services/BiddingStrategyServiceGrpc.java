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
 * Service to manage bidding strategies.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v0/services/bidding_strategy_service.proto")
public final class BiddingStrategyServiceGrpc {

  private BiddingStrategyServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.BiddingStrategyService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetBiddingStrategyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetBiddingStrategyRequest,
      com.google.ads.googleads.v0.resources.BiddingStrategy> METHOD_GET_BIDDING_STRATEGY = getGetBiddingStrategyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetBiddingStrategyRequest,
      com.google.ads.googleads.v0.resources.BiddingStrategy> getGetBiddingStrategyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetBiddingStrategyRequest,
      com.google.ads.googleads.v0.resources.BiddingStrategy> getGetBiddingStrategyMethod() {
    return getGetBiddingStrategyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetBiddingStrategyRequest,
      com.google.ads.googleads.v0.resources.BiddingStrategy> getGetBiddingStrategyMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetBiddingStrategyRequest, com.google.ads.googleads.v0.resources.BiddingStrategy> getGetBiddingStrategyMethod;
    if ((getGetBiddingStrategyMethod = BiddingStrategyServiceGrpc.getGetBiddingStrategyMethod) == null) {
      synchronized (BiddingStrategyServiceGrpc.class) {
        if ((getGetBiddingStrategyMethod = BiddingStrategyServiceGrpc.getGetBiddingStrategyMethod) == null) {
          BiddingStrategyServiceGrpc.getGetBiddingStrategyMethod = getGetBiddingStrategyMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.GetBiddingStrategyRequest, com.google.ads.googleads.v0.resources.BiddingStrategy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.BiddingStrategyService", "GetBiddingStrategy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.GetBiddingStrategyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.resources.BiddingStrategy.getDefaultInstance()))
                  .setSchemaDescriptor(new BiddingStrategyServiceMethodDescriptorSupplier("GetBiddingStrategy"))
                  .build();
          }
        }
     }
     return getGetBiddingStrategyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateBiddingStrategiesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest,
      com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse> METHOD_MUTATE_BIDDING_STRATEGIES = getMutateBiddingStrategiesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest,
      com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse> getMutateBiddingStrategiesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest,
      com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse> getMutateBiddingStrategiesMethod() {
    return getMutateBiddingStrategiesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest,
      com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse> getMutateBiddingStrategiesMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest, com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse> getMutateBiddingStrategiesMethod;
    if ((getMutateBiddingStrategiesMethod = BiddingStrategyServiceGrpc.getMutateBiddingStrategiesMethod) == null) {
      synchronized (BiddingStrategyServiceGrpc.class) {
        if ((getMutateBiddingStrategiesMethod = BiddingStrategyServiceGrpc.getMutateBiddingStrategiesMethod) == null) {
          BiddingStrategyServiceGrpc.getMutateBiddingStrategiesMethod = getMutateBiddingStrategiesMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest, com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.BiddingStrategyService", "MutateBiddingStrategies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BiddingStrategyServiceMethodDescriptorSupplier("MutateBiddingStrategies"))
                  .build();
          }
        }
     }
     return getMutateBiddingStrategiesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BiddingStrategyServiceStub newStub(io.grpc.Channel channel) {
    return new BiddingStrategyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BiddingStrategyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BiddingStrategyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BiddingStrategyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BiddingStrategyServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage bidding strategies.
   * </pre>
   */
  public static abstract class BiddingStrategyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested bidding strategy in full detail.
     * </pre>
     */
    public void getBiddingStrategy(com.google.ads.googleads.v0.services.GetBiddingStrategyRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.BiddingStrategy> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBiddingStrategyMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes bidding strategies. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateBiddingStrategies(com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateBiddingStrategiesMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBiddingStrategyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetBiddingStrategyRequest,
                com.google.ads.googleads.v0.resources.BiddingStrategy>(
                  this, METHODID_GET_BIDDING_STRATEGY)))
          .addMethod(
            getMutateBiddingStrategiesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest,
                com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse>(
                  this, METHODID_MUTATE_BIDDING_STRATEGIES)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage bidding strategies.
   * </pre>
   */
  public static final class BiddingStrategyServiceStub extends io.grpc.stub.AbstractStub<BiddingStrategyServiceStub> {
    private BiddingStrategyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BiddingStrategyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingStrategyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BiddingStrategyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested bidding strategy in full detail.
     * </pre>
     */
    public void getBiddingStrategy(com.google.ads.googleads.v0.services.GetBiddingStrategyRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.BiddingStrategy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBiddingStrategyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes bidding strategies. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateBiddingStrategies(com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateBiddingStrategiesMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage bidding strategies.
   * </pre>
   */
  public static final class BiddingStrategyServiceBlockingStub extends io.grpc.stub.AbstractStub<BiddingStrategyServiceBlockingStub> {
    private BiddingStrategyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BiddingStrategyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingStrategyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BiddingStrategyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested bidding strategy in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.BiddingStrategy getBiddingStrategy(com.google.ads.googleads.v0.services.GetBiddingStrategyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBiddingStrategyMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes bidding strategies. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse mutateBiddingStrategies(com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateBiddingStrategiesMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage bidding strategies.
   * </pre>
   */
  public static final class BiddingStrategyServiceFutureStub extends io.grpc.stub.AbstractStub<BiddingStrategyServiceFutureStub> {
    private BiddingStrategyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BiddingStrategyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingStrategyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BiddingStrategyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested bidding strategy in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.BiddingStrategy> getBiddingStrategy(
        com.google.ads.googleads.v0.services.GetBiddingStrategyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBiddingStrategyMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes bidding strategies. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse> mutateBiddingStrategies(
        com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateBiddingStrategiesMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BIDDING_STRATEGY = 0;
  private static final int METHODID_MUTATE_BIDDING_STRATEGIES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BiddingStrategyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BiddingStrategyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BIDDING_STRATEGY:
          serviceImpl.getBiddingStrategy((com.google.ads.googleads.v0.services.GetBiddingStrategyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.BiddingStrategy>) responseObserver);
          break;
        case METHODID_MUTATE_BIDDING_STRATEGIES:
          serviceImpl.mutateBiddingStrategies((com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse>) responseObserver);
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

  private static abstract class BiddingStrategyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BiddingStrategyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.BiddingStrategyServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BiddingStrategyService");
    }
  }

  private static final class BiddingStrategyServiceFileDescriptorSupplier
      extends BiddingStrategyServiceBaseDescriptorSupplier {
    BiddingStrategyServiceFileDescriptorSupplier() {}
  }

  private static final class BiddingStrategyServiceMethodDescriptorSupplier
      extends BiddingStrategyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BiddingStrategyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BiddingStrategyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BiddingStrategyServiceFileDescriptorSupplier())
              .addMethod(getGetBiddingStrategyMethodHelper())
              .addMethod(getMutateBiddingStrategiesMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
