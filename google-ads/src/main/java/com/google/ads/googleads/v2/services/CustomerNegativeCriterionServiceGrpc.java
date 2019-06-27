package com.google.ads.googleads.v2.services;

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
 * Service to manage customer negative criteria.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/customer_negative_criterion_service.proto")
public final class CustomerNegativeCriterionServiceGrpc {

  private CustomerNegativeCriterionServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.CustomerNegativeCriterionService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCustomerNegativeCriterionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerNegativeCriterionRequest,
      com.google.ads.googleads.v2.resources.CustomerNegativeCriterion> METHOD_GET_CUSTOMER_NEGATIVE_CRITERION = getGetCustomerNegativeCriterionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerNegativeCriterionRequest,
      com.google.ads.googleads.v2.resources.CustomerNegativeCriterion> getGetCustomerNegativeCriterionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerNegativeCriterionRequest,
      com.google.ads.googleads.v2.resources.CustomerNegativeCriterion> getGetCustomerNegativeCriterionMethod() {
    return getGetCustomerNegativeCriterionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerNegativeCriterionRequest,
      com.google.ads.googleads.v2.resources.CustomerNegativeCriterion> getGetCustomerNegativeCriterionMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerNegativeCriterionRequest, com.google.ads.googleads.v2.resources.CustomerNegativeCriterion> getGetCustomerNegativeCriterionMethod;
    if ((getGetCustomerNegativeCriterionMethod = CustomerNegativeCriterionServiceGrpc.getGetCustomerNegativeCriterionMethod) == null) {
      synchronized (CustomerNegativeCriterionServiceGrpc.class) {
        if ((getGetCustomerNegativeCriterionMethod = CustomerNegativeCriterionServiceGrpc.getGetCustomerNegativeCriterionMethod) == null) {
          CustomerNegativeCriterionServiceGrpc.getGetCustomerNegativeCriterionMethod = getGetCustomerNegativeCriterionMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetCustomerNegativeCriterionRequest, com.google.ads.googleads.v2.resources.CustomerNegativeCriterion>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.CustomerNegativeCriterionService", "GetCustomerNegativeCriterion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetCustomerNegativeCriterionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.CustomerNegativeCriterion.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerNegativeCriterionServiceMethodDescriptorSupplier("GetCustomerNegativeCriterion"))
                  .build();
          }
        }
     }
     return getGetCustomerNegativeCriterionMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateCustomerNegativeCriteriaMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaRequest,
      com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaResponse> METHOD_MUTATE_CUSTOMER_NEGATIVE_CRITERIA = getMutateCustomerNegativeCriteriaMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaRequest,
      com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaResponse> getMutateCustomerNegativeCriteriaMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaRequest,
      com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaResponse> getMutateCustomerNegativeCriteriaMethod() {
    return getMutateCustomerNegativeCriteriaMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaRequest,
      com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaResponse> getMutateCustomerNegativeCriteriaMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaRequest, com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaResponse> getMutateCustomerNegativeCriteriaMethod;
    if ((getMutateCustomerNegativeCriteriaMethod = CustomerNegativeCriterionServiceGrpc.getMutateCustomerNegativeCriteriaMethod) == null) {
      synchronized (CustomerNegativeCriterionServiceGrpc.class) {
        if ((getMutateCustomerNegativeCriteriaMethod = CustomerNegativeCriterionServiceGrpc.getMutateCustomerNegativeCriteriaMethod) == null) {
          CustomerNegativeCriterionServiceGrpc.getMutateCustomerNegativeCriteriaMethod = getMutateCustomerNegativeCriteriaMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaRequest, com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.CustomerNegativeCriterionService", "MutateCustomerNegativeCriteria"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerNegativeCriterionServiceMethodDescriptorSupplier("MutateCustomerNegativeCriteria"))
                  .build();
          }
        }
     }
     return getMutateCustomerNegativeCriteriaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerNegativeCriterionServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerNegativeCriterionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerNegativeCriterionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerNegativeCriterionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerNegativeCriterionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerNegativeCriterionServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage customer negative criteria.
   * </pre>
   */
  public static abstract class CustomerNegativeCriterionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested criterion in full detail.
     * </pre>
     */
    public void getCustomerNegativeCriterion(com.google.ads.googleads.v2.services.GetCustomerNegativeCriterionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.CustomerNegativeCriterion> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerNegativeCriterionMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates or removes criteria. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomerNegativeCriteria(com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCustomerNegativeCriteriaMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerNegativeCriterionMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetCustomerNegativeCriterionRequest,
                com.google.ads.googleads.v2.resources.CustomerNegativeCriterion>(
                  this, METHODID_GET_CUSTOMER_NEGATIVE_CRITERION)))
          .addMethod(
            getMutateCustomerNegativeCriteriaMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaRequest,
                com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaResponse>(
                  this, METHODID_MUTATE_CUSTOMER_NEGATIVE_CRITERIA)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage customer negative criteria.
   * </pre>
   */
  public static final class CustomerNegativeCriterionServiceStub extends io.grpc.stub.AbstractStub<CustomerNegativeCriterionServiceStub> {
    private CustomerNegativeCriterionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerNegativeCriterionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerNegativeCriterionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerNegativeCriterionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested criterion in full detail.
     * </pre>
     */
    public void getCustomerNegativeCriterion(com.google.ads.googleads.v2.services.GetCustomerNegativeCriterionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.CustomerNegativeCriterion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerNegativeCriterionMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or removes criteria. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomerNegativeCriteria(com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCustomerNegativeCriteriaMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage customer negative criteria.
   * </pre>
   */
  public static final class CustomerNegativeCriterionServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerNegativeCriterionServiceBlockingStub> {
    private CustomerNegativeCriterionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerNegativeCriterionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerNegativeCriterionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerNegativeCriterionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested criterion in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.CustomerNegativeCriterion getCustomerNegativeCriterion(com.google.ads.googleads.v2.services.GetCustomerNegativeCriterionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerNegativeCriterionMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or removes criteria. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaResponse mutateCustomerNegativeCriteria(com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCustomerNegativeCriteriaMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage customer negative criteria.
   * </pre>
   */
  public static final class CustomerNegativeCriterionServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerNegativeCriterionServiceFutureStub> {
    private CustomerNegativeCriterionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerNegativeCriterionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerNegativeCriterionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerNegativeCriterionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested criterion in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.CustomerNegativeCriterion> getCustomerNegativeCriterion(
        com.google.ads.googleads.v2.services.GetCustomerNegativeCriterionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerNegativeCriterionMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or removes criteria. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaResponse> mutateCustomerNegativeCriteria(
        com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCustomerNegativeCriteriaMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_NEGATIVE_CRITERION = 0;
  private static final int METHODID_MUTATE_CUSTOMER_NEGATIVE_CRITERIA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerNegativeCriterionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerNegativeCriterionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_NEGATIVE_CRITERION:
          serviceImpl.getCustomerNegativeCriterion((com.google.ads.googleads.v2.services.GetCustomerNegativeCriterionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.CustomerNegativeCriterion>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOMER_NEGATIVE_CRITERIA:
          serviceImpl.mutateCustomerNegativeCriteria((com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateCustomerNegativeCriteriaResponse>) responseObserver);
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

  private static abstract class CustomerNegativeCriterionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerNegativeCriterionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.CustomerNegativeCriterionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerNegativeCriterionService");
    }
  }

  private static final class CustomerNegativeCriterionServiceFileDescriptorSupplier
      extends CustomerNegativeCriterionServiceBaseDescriptorSupplier {
    CustomerNegativeCriterionServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerNegativeCriterionServiceMethodDescriptorSupplier
      extends CustomerNegativeCriterionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerNegativeCriterionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerNegativeCriterionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerNegativeCriterionServiceFileDescriptorSupplier())
              .addMethod(getGetCustomerNegativeCriterionMethodHelper())
              .addMethod(getMutateCustomerNegativeCriteriaMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
