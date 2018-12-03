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
 * Service to manage customer feeds.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v0/services/customer_feed_service.proto")
public final class CustomerFeedServiceGrpc {

  private CustomerFeedServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.CustomerFeedService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCustomerFeedMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerFeedRequest,
      com.google.ads.googleads.v0.resources.CustomerFeed> METHOD_GET_CUSTOMER_FEED = getGetCustomerFeedMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerFeedRequest,
      com.google.ads.googleads.v0.resources.CustomerFeed> getGetCustomerFeedMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerFeedRequest,
      com.google.ads.googleads.v0.resources.CustomerFeed> getGetCustomerFeedMethod() {
    return getGetCustomerFeedMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerFeedRequest,
      com.google.ads.googleads.v0.resources.CustomerFeed> getGetCustomerFeedMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerFeedRequest, com.google.ads.googleads.v0.resources.CustomerFeed> getGetCustomerFeedMethod;
    if ((getGetCustomerFeedMethod = CustomerFeedServiceGrpc.getGetCustomerFeedMethod) == null) {
      synchronized (CustomerFeedServiceGrpc.class) {
        if ((getGetCustomerFeedMethod = CustomerFeedServiceGrpc.getGetCustomerFeedMethod) == null) {
          CustomerFeedServiceGrpc.getGetCustomerFeedMethod = getGetCustomerFeedMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.GetCustomerFeedRequest, com.google.ads.googleads.v0.resources.CustomerFeed>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.CustomerFeedService", "GetCustomerFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.GetCustomerFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.resources.CustomerFeed.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerFeedServiceMethodDescriptorSupplier("GetCustomerFeed"))
                  .build();
          }
        }
     }
     return getGetCustomerFeedMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateCustomerFeedsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest,
      com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse> METHOD_MUTATE_CUSTOMER_FEEDS = getMutateCustomerFeedsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest,
      com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse> getMutateCustomerFeedsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest,
      com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse> getMutateCustomerFeedsMethod() {
    return getMutateCustomerFeedsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest,
      com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse> getMutateCustomerFeedsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest, com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse> getMutateCustomerFeedsMethod;
    if ((getMutateCustomerFeedsMethod = CustomerFeedServiceGrpc.getMutateCustomerFeedsMethod) == null) {
      synchronized (CustomerFeedServiceGrpc.class) {
        if ((getMutateCustomerFeedsMethod = CustomerFeedServiceGrpc.getMutateCustomerFeedsMethod) == null) {
          CustomerFeedServiceGrpc.getMutateCustomerFeedsMethod = getMutateCustomerFeedsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest, com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.CustomerFeedService", "MutateCustomerFeeds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerFeedServiceMethodDescriptorSupplier("MutateCustomerFeeds"))
                  .build();
          }
        }
     }
     return getMutateCustomerFeedsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerFeedServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerFeedServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerFeedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerFeedServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerFeedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerFeedServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage customer feeds.
   * </pre>
   */
  public static abstract class CustomerFeedServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested customer feed in full detail.
     * </pre>
     */
    public void getCustomerFeed(com.google.ads.googleads.v0.services.GetCustomerFeedRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CustomerFeed> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerFeedMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCustomerFeeds(com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCustomerFeedsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerFeedMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetCustomerFeedRequest,
                com.google.ads.googleads.v0.resources.CustomerFeed>(
                  this, METHODID_GET_CUSTOMER_FEED)))
          .addMethod(
            getMutateCustomerFeedsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest,
                com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse>(
                  this, METHODID_MUTATE_CUSTOMER_FEEDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage customer feeds.
   * </pre>
   */
  public static final class CustomerFeedServiceStub extends io.grpc.stub.AbstractStub<CustomerFeedServiceStub> {
    private CustomerFeedServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerFeedServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerFeedServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerFeedServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer feed in full detail.
     * </pre>
     */
    public void getCustomerFeed(com.google.ads.googleads.v0.services.GetCustomerFeedRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CustomerFeed> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerFeedMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCustomerFeeds(com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCustomerFeedsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage customer feeds.
   * </pre>
   */
  public static final class CustomerFeedServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerFeedServiceBlockingStub> {
    private CustomerFeedServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerFeedServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerFeedServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerFeedServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer feed in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.CustomerFeed getCustomerFeed(com.google.ads.googleads.v0.services.GetCustomerFeedRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerFeedMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse mutateCustomerFeeds(com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCustomerFeedsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage customer feeds.
   * </pre>
   */
  public static final class CustomerFeedServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerFeedServiceFutureStub> {
    private CustomerFeedServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerFeedServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerFeedServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerFeedServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer feed in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.CustomerFeed> getCustomerFeed(
        com.google.ads.googleads.v0.services.GetCustomerFeedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerFeedMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer feeds. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse> mutateCustomerFeeds(
        com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCustomerFeedsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_FEED = 0;
  private static final int METHODID_MUTATE_CUSTOMER_FEEDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerFeedServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerFeedServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_FEED:
          serviceImpl.getCustomerFeed((com.google.ads.googleads.v0.services.GetCustomerFeedRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CustomerFeed>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOMER_FEEDS:
          serviceImpl.mutateCustomerFeeds((com.google.ads.googleads.v0.services.MutateCustomerFeedsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCustomerFeedsResponse>) responseObserver);
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

  private static abstract class CustomerFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerFeedServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.CustomerFeedServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerFeedService");
    }
  }

  private static final class CustomerFeedServiceFileDescriptorSupplier
      extends CustomerFeedServiceBaseDescriptorSupplier {
    CustomerFeedServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerFeedServiceMethodDescriptorSupplier
      extends CustomerFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerFeedServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerFeedServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerFeedServiceFileDescriptorSupplier())
              .addMethod(getGetCustomerFeedMethodHelper())
              .addMethod(getMutateCustomerFeedsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
