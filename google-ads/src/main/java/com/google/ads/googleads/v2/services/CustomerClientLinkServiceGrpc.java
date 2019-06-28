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
 * Service to manage customer client links.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/customer_client_link_service.proto")
public final class CustomerClientLinkServiceGrpc {

  private CustomerClientLinkServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.CustomerClientLinkService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCustomerClientLinkMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerClientLinkRequest,
      com.google.ads.googleads.v2.resources.CustomerClientLink> METHOD_GET_CUSTOMER_CLIENT_LINK = getGetCustomerClientLinkMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerClientLinkRequest,
      com.google.ads.googleads.v2.resources.CustomerClientLink> getGetCustomerClientLinkMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerClientLinkRequest,
      com.google.ads.googleads.v2.resources.CustomerClientLink> getGetCustomerClientLinkMethod() {
    return getGetCustomerClientLinkMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerClientLinkRequest,
      com.google.ads.googleads.v2.resources.CustomerClientLink> getGetCustomerClientLinkMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetCustomerClientLinkRequest, com.google.ads.googleads.v2.resources.CustomerClientLink> getGetCustomerClientLinkMethod;
    if ((getGetCustomerClientLinkMethod = CustomerClientLinkServiceGrpc.getGetCustomerClientLinkMethod) == null) {
      synchronized (CustomerClientLinkServiceGrpc.class) {
        if ((getGetCustomerClientLinkMethod = CustomerClientLinkServiceGrpc.getGetCustomerClientLinkMethod) == null) {
          CustomerClientLinkServiceGrpc.getGetCustomerClientLinkMethod = getGetCustomerClientLinkMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetCustomerClientLinkRequest, com.google.ads.googleads.v2.resources.CustomerClientLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.CustomerClientLinkService", "GetCustomerClientLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetCustomerClientLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.CustomerClientLink.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerClientLinkServiceMethodDescriptorSupplier("GetCustomerClientLink"))
                  .build();
          }
        }
     }
     return getGetCustomerClientLinkMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateCustomerClientLinkMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerClientLinkRequest,
      com.google.ads.googleads.v2.services.MutateCustomerClientLinkResponse> METHOD_MUTATE_CUSTOMER_CLIENT_LINK = getMutateCustomerClientLinkMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerClientLinkRequest,
      com.google.ads.googleads.v2.services.MutateCustomerClientLinkResponse> getMutateCustomerClientLinkMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerClientLinkRequest,
      com.google.ads.googleads.v2.services.MutateCustomerClientLinkResponse> getMutateCustomerClientLinkMethod() {
    return getMutateCustomerClientLinkMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerClientLinkRequest,
      com.google.ads.googleads.v2.services.MutateCustomerClientLinkResponse> getMutateCustomerClientLinkMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateCustomerClientLinkRequest, com.google.ads.googleads.v2.services.MutateCustomerClientLinkResponse> getMutateCustomerClientLinkMethod;
    if ((getMutateCustomerClientLinkMethod = CustomerClientLinkServiceGrpc.getMutateCustomerClientLinkMethod) == null) {
      synchronized (CustomerClientLinkServiceGrpc.class) {
        if ((getMutateCustomerClientLinkMethod = CustomerClientLinkServiceGrpc.getMutateCustomerClientLinkMethod) == null) {
          CustomerClientLinkServiceGrpc.getMutateCustomerClientLinkMethod = getMutateCustomerClientLinkMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.MutateCustomerClientLinkRequest, com.google.ads.googleads.v2.services.MutateCustomerClientLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.CustomerClientLinkService", "MutateCustomerClientLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateCustomerClientLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateCustomerClientLinkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerClientLinkServiceMethodDescriptorSupplier("MutateCustomerClientLink"))
                  .build();
          }
        }
     }
     return getMutateCustomerClientLinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerClientLinkServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerClientLinkServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerClientLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerClientLinkServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerClientLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerClientLinkServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage customer client links.
   * </pre>
   */
  public static abstract class CustomerClientLinkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested CustomerClientLink in full detail.
     * </pre>
     */
    public void getCustomerClientLink(com.google.ads.googleads.v2.services.GetCustomerClientLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.CustomerClientLink> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerClientLinkMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates or updates a customer client link. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomerClientLink(com.google.ads.googleads.v2.services.MutateCustomerClientLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateCustomerClientLinkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCustomerClientLinkMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerClientLinkMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetCustomerClientLinkRequest,
                com.google.ads.googleads.v2.resources.CustomerClientLink>(
                  this, METHODID_GET_CUSTOMER_CLIENT_LINK)))
          .addMethod(
            getMutateCustomerClientLinkMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.MutateCustomerClientLinkRequest,
                com.google.ads.googleads.v2.services.MutateCustomerClientLinkResponse>(
                  this, METHODID_MUTATE_CUSTOMER_CLIENT_LINK)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage customer client links.
   * </pre>
   */
  public static final class CustomerClientLinkServiceStub extends io.grpc.stub.AbstractStub<CustomerClientLinkServiceStub> {
    private CustomerClientLinkServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerClientLinkServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerClientLinkServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerClientLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested CustomerClientLink in full detail.
     * </pre>
     */
    public void getCustomerClientLink(com.google.ads.googleads.v2.services.GetCustomerClientLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.CustomerClientLink> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerClientLinkMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or updates a customer client link. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomerClientLink(com.google.ads.googleads.v2.services.MutateCustomerClientLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateCustomerClientLinkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCustomerClientLinkMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage customer client links.
   * </pre>
   */
  public static final class CustomerClientLinkServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerClientLinkServiceBlockingStub> {
    private CustomerClientLinkServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerClientLinkServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerClientLinkServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerClientLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested CustomerClientLink in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.CustomerClientLink getCustomerClientLink(com.google.ads.googleads.v2.services.GetCustomerClientLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerClientLinkMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or updates a customer client link. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.MutateCustomerClientLinkResponse mutateCustomerClientLink(com.google.ads.googleads.v2.services.MutateCustomerClientLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCustomerClientLinkMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage customer client links.
   * </pre>
   */
  public static final class CustomerClientLinkServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerClientLinkServiceFutureStub> {
    private CustomerClientLinkServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerClientLinkServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerClientLinkServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerClientLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested CustomerClientLink in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.CustomerClientLink> getCustomerClientLink(
        com.google.ads.googleads.v2.services.GetCustomerClientLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerClientLinkMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or updates a customer client link. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.MutateCustomerClientLinkResponse> mutateCustomerClientLink(
        com.google.ads.googleads.v2.services.MutateCustomerClientLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCustomerClientLinkMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_CLIENT_LINK = 0;
  private static final int METHODID_MUTATE_CUSTOMER_CLIENT_LINK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerClientLinkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerClientLinkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_CLIENT_LINK:
          serviceImpl.getCustomerClientLink((com.google.ads.googleads.v2.services.GetCustomerClientLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.CustomerClientLink>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOMER_CLIENT_LINK:
          serviceImpl.mutateCustomerClientLink((com.google.ads.googleads.v2.services.MutateCustomerClientLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateCustomerClientLinkResponse>) responseObserver);
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

  private static abstract class CustomerClientLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerClientLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.CustomerClientLinkServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerClientLinkService");
    }
  }

  private static final class CustomerClientLinkServiceFileDescriptorSupplier
      extends CustomerClientLinkServiceBaseDescriptorSupplier {
    CustomerClientLinkServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerClientLinkServiceMethodDescriptorSupplier
      extends CustomerClientLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerClientLinkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerClientLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerClientLinkServiceFileDescriptorSupplier())
              .addMethod(getGetCustomerClientLinkMethodHelper())
              .addMethod(getMutateCustomerClientLinkMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
