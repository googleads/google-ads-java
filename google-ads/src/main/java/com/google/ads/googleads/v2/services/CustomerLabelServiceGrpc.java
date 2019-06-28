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
 * Service to manage labels on customers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/customer_label_service.proto")
public final class CustomerLabelServiceGrpc {

  private CustomerLabelServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.CustomerLabelService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCustomerLabelMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerLabelRequest,
      com.google.ads.googleads.v2.resources.CustomerLabel> METHOD_GET_CUSTOMER_LABEL = getGetCustomerLabelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerLabelRequest,
      com.google.ads.googleads.v2.resources.CustomerLabel> getGetCustomerLabelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerLabelRequest,
      com.google.ads.googleads.v2.resources.CustomerLabel> getGetCustomerLabelMethod() {
    return getGetCustomerLabelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerLabelRequest,
      com.google.ads.googleads.v2.resources.CustomerLabel> getGetCustomerLabelMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerLabelRequest, com.google.ads.googleads.v2.resources.CustomerLabel> getGetCustomerLabelMethod;
    if ((getGetCustomerLabelMethod = CustomerLabelServiceGrpc.getGetCustomerLabelMethod) == null) {
      synchronized (CustomerLabelServiceGrpc.class) {
        if ((getGetCustomerLabelMethod = CustomerLabelServiceGrpc.getGetCustomerLabelMethod) == null) {
          CustomerLabelServiceGrpc.getGetCustomerLabelMethod = getGetCustomerLabelMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetCustomerLabelRequest, com.google.ads.googleads.v2.resources.CustomerLabel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.CustomerLabelService", "GetCustomerLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetCustomerLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.CustomerLabel.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerLabelServiceMethodDescriptorSupplier("GetCustomerLabel"))
                  .build();
          }
        }
     }
     return getGetCustomerLabelMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateCustomerLabelsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerLabelsRequest,
      com.google.ads.googleads.v2.services.MutateCustomerLabelsResponse> METHOD_MUTATE_CUSTOMER_LABELS = getMutateCustomerLabelsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerLabelsRequest,
      com.google.ads.googleads.v2.services.MutateCustomerLabelsResponse> getMutateCustomerLabelsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerLabelsRequest,
      com.google.ads.googleads.v2.services.MutateCustomerLabelsResponse> getMutateCustomerLabelsMethod() {
    return getMutateCustomerLabelsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerLabelsRequest,
      com.google.ads.googleads.v2.services.MutateCustomerLabelsResponse> getMutateCustomerLabelsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerLabelsRequest, com.google.ads.googleads.v2.services.MutateCustomerLabelsResponse> getMutateCustomerLabelsMethod;
    if ((getMutateCustomerLabelsMethod = CustomerLabelServiceGrpc.getMutateCustomerLabelsMethod) == null) {
      synchronized (CustomerLabelServiceGrpc.class) {
        if ((getMutateCustomerLabelsMethod = CustomerLabelServiceGrpc.getMutateCustomerLabelsMethod) == null) {
          CustomerLabelServiceGrpc.getMutateCustomerLabelsMethod = getMutateCustomerLabelsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.MutateCustomerLabelsRequest, com.google.ads.googleads.v2.services.MutateCustomerLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.CustomerLabelService", "MutateCustomerLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateCustomerLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateCustomerLabelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerLabelServiceMethodDescriptorSupplier("MutateCustomerLabels"))
                  .build();
          }
        }
     }
     return getMutateCustomerLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerLabelServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerLabelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerLabelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerLabelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerLabelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerLabelServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage labels on customers.
   * </pre>
   */
  public static abstract class CustomerLabelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested customer-label relationship in full detail.
     * </pre>
     */
    public void getCustomerLabel(com.google.ads.googleads.v2.services.GetCustomerLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.CustomerLabel> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerLabelMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates and removes customer-label relationships.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomerLabels(com.google.ads.googleads.v2.services.MutateCustomerLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateCustomerLabelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCustomerLabelsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerLabelMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetCustomerLabelRequest,
                com.google.ads.googleads.v2.resources.CustomerLabel>(
                  this, METHODID_GET_CUSTOMER_LABEL)))
          .addMethod(
            getMutateCustomerLabelsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.MutateCustomerLabelsRequest,
                com.google.ads.googleads.v2.services.MutateCustomerLabelsResponse>(
                  this, METHODID_MUTATE_CUSTOMER_LABELS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage labels on customers.
   * </pre>
   */
  public static final class CustomerLabelServiceStub extends io.grpc.stub.AbstractStub<CustomerLabelServiceStub> {
    private CustomerLabelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerLabelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerLabelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerLabelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer-label relationship in full detail.
     * </pre>
     */
    public void getCustomerLabel(com.google.ads.googleads.v2.services.GetCustomerLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.CustomerLabel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerLabelMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates and removes customer-label relationships.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomerLabels(com.google.ads.googleads.v2.services.MutateCustomerLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateCustomerLabelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCustomerLabelsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage labels on customers.
   * </pre>
   */
  public static final class CustomerLabelServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerLabelServiceBlockingStub> {
    private CustomerLabelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerLabelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerLabelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerLabelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer-label relationship in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.CustomerLabel getCustomerLabel(com.google.ads.googleads.v2.services.GetCustomerLabelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerLabelMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates and removes customer-label relationships.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.MutateCustomerLabelsResponse mutateCustomerLabels(com.google.ads.googleads.v2.services.MutateCustomerLabelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCustomerLabelsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage labels on customers.
   * </pre>
   */
  public static final class CustomerLabelServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerLabelServiceFutureStub> {
    private CustomerLabelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerLabelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerLabelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerLabelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer-label relationship in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.CustomerLabel> getCustomerLabel(
        com.google.ads.googleads.v2.services.GetCustomerLabelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerLabelMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates and removes customer-label relationships.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.MutateCustomerLabelsResponse> mutateCustomerLabels(
        com.google.ads.googleads.v2.services.MutateCustomerLabelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCustomerLabelsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_LABEL = 0;
  private static final int METHODID_MUTATE_CUSTOMER_LABELS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerLabelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerLabelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_LABEL:
          serviceImpl.getCustomerLabel((com.google.ads.googleads.v2.services.GetCustomerLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.CustomerLabel>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOMER_LABELS:
          serviceImpl.mutateCustomerLabels((com.google.ads.googleads.v2.services.MutateCustomerLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateCustomerLabelsResponse>) responseObserver);
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

  private static abstract class CustomerLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerLabelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.CustomerLabelServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerLabelService");
    }
  }

  private static final class CustomerLabelServiceFileDescriptorSupplier
      extends CustomerLabelServiceBaseDescriptorSupplier {
    CustomerLabelServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerLabelServiceMethodDescriptorSupplier
      extends CustomerLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerLabelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerLabelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerLabelServiceFileDescriptorSupplier())
              .addMethod(getGetCustomerLabelMethodHelper())
              .addMethod(getMutateCustomerLabelsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
