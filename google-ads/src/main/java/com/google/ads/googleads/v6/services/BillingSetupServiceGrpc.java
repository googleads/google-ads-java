package com.google.ads.googleads.v6.services;

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
 * A service for designating the business entity responsible for accrued costs.
 * A billing setup is associated with a payments account.  Billing-related
 * activity for all billing setups associated with a particular payments account
 * will appear on a single invoice generated monthly.
 * Mutates:
 * The REMOVE operation cancels a pending billing setup.
 * The CREATE operation creates a new billing setup.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/billing_setup_service.proto")
public final class BillingSetupServiceGrpc {

  private BillingSetupServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.BillingSetupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetBillingSetupRequest,
      com.google.ads.googleads.v6.resources.BillingSetup> getGetBillingSetupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingSetup",
      requestType = com.google.ads.googleads.v6.services.GetBillingSetupRequest.class,
      responseType = com.google.ads.googleads.v6.resources.BillingSetup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetBillingSetupRequest,
      com.google.ads.googleads.v6.resources.BillingSetup> getGetBillingSetupMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetBillingSetupRequest, com.google.ads.googleads.v6.resources.BillingSetup> getGetBillingSetupMethod;
    if ((getGetBillingSetupMethod = BillingSetupServiceGrpc.getGetBillingSetupMethod) == null) {
      synchronized (BillingSetupServiceGrpc.class) {
        if ((getGetBillingSetupMethod = BillingSetupServiceGrpc.getGetBillingSetupMethod) == null) {
          BillingSetupServiceGrpc.getGetBillingSetupMethod = getGetBillingSetupMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetBillingSetupRequest, com.google.ads.googleads.v6.resources.BillingSetup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingSetup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetBillingSetupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.BillingSetup.getDefaultInstance()))
              .setSchemaDescriptor(new BillingSetupServiceMethodDescriptorSupplier("GetBillingSetup"))
              .build();
        }
      }
    }
    return getGetBillingSetupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateBillingSetupRequest,
      com.google.ads.googleads.v6.services.MutateBillingSetupResponse> getMutateBillingSetupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateBillingSetup",
      requestType = com.google.ads.googleads.v6.services.MutateBillingSetupRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateBillingSetupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateBillingSetupRequest,
      com.google.ads.googleads.v6.services.MutateBillingSetupResponse> getMutateBillingSetupMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateBillingSetupRequest, com.google.ads.googleads.v6.services.MutateBillingSetupResponse> getMutateBillingSetupMethod;
    if ((getMutateBillingSetupMethod = BillingSetupServiceGrpc.getMutateBillingSetupMethod) == null) {
      synchronized (BillingSetupServiceGrpc.class) {
        if ((getMutateBillingSetupMethod = BillingSetupServiceGrpc.getMutateBillingSetupMethod) == null) {
          BillingSetupServiceGrpc.getMutateBillingSetupMethod = getMutateBillingSetupMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateBillingSetupRequest, com.google.ads.googleads.v6.services.MutateBillingSetupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateBillingSetup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateBillingSetupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateBillingSetupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingSetupServiceMethodDescriptorSupplier("MutateBillingSetup"))
              .build();
        }
      }
    }
    return getMutateBillingSetupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BillingSetupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingSetupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingSetupServiceStub>() {
        @java.lang.Override
        public BillingSetupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingSetupServiceStub(channel, callOptions);
        }
      };
    return BillingSetupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BillingSetupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingSetupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingSetupServiceBlockingStub>() {
        @java.lang.Override
        public BillingSetupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingSetupServiceBlockingStub(channel, callOptions);
        }
      };
    return BillingSetupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BillingSetupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingSetupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingSetupServiceFutureStub>() {
        @java.lang.Override
        public BillingSetupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingSetupServiceFutureStub(channel, callOptions);
        }
      };
    return BillingSetupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A service for designating the business entity responsible for accrued costs.
   * A billing setup is associated with a payments account.  Billing-related
   * activity for all billing setups associated with a particular payments account
   * will appear on a single invoice generated monthly.
   * Mutates:
   * The REMOVE operation cancels a pending billing setup.
   * The CREATE operation creates a new billing setup.
   * </pre>
   */
  public static abstract class BillingSetupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns a billing setup.
     * </pre>
     */
    public void getBillingSetup(com.google.ads.googleads.v6.services.GetBillingSetupRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.BillingSetup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBillingSetupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a billing setup, or cancels an existing billing setup.
     * </pre>
     */
    public void mutateBillingSetup(com.google.ads.googleads.v6.services.MutateBillingSetupRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateBillingSetupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateBillingSetupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBillingSetupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetBillingSetupRequest,
                com.google.ads.googleads.v6.resources.BillingSetup>(
                  this, METHODID_GET_BILLING_SETUP)))
          .addMethod(
            getMutateBillingSetupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateBillingSetupRequest,
                com.google.ads.googleads.v6.services.MutateBillingSetupResponse>(
                  this, METHODID_MUTATE_BILLING_SETUP)))
          .build();
    }
  }

  /**
   * <pre>
   * A service for designating the business entity responsible for accrued costs.
   * A billing setup is associated with a payments account.  Billing-related
   * activity for all billing setups associated with a particular payments account
   * will appear on a single invoice generated monthly.
   * Mutates:
   * The REMOVE operation cancels a pending billing setup.
   * The CREATE operation creates a new billing setup.
   * </pre>
   */
  public static final class BillingSetupServiceStub extends io.grpc.stub.AbstractAsyncStub<BillingSetupServiceStub> {
    private BillingSetupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingSetupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingSetupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a billing setup.
     * </pre>
     */
    public void getBillingSetup(com.google.ads.googleads.v6.services.GetBillingSetupRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.BillingSetup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBillingSetupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a billing setup, or cancels an existing billing setup.
     * </pre>
     */
    public void mutateBillingSetup(com.google.ads.googleads.v6.services.MutateBillingSetupRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateBillingSetupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateBillingSetupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A service for designating the business entity responsible for accrued costs.
   * A billing setup is associated with a payments account.  Billing-related
   * activity for all billing setups associated with a particular payments account
   * will appear on a single invoice generated monthly.
   * Mutates:
   * The REMOVE operation cancels a pending billing setup.
   * The CREATE operation creates a new billing setup.
   * </pre>
   */
  public static final class BillingSetupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BillingSetupServiceBlockingStub> {
    private BillingSetupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingSetupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingSetupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a billing setup.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.BillingSetup getBillingSetup(com.google.ads.googleads.v6.services.GetBillingSetupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBillingSetupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a billing setup, or cancels an existing billing setup.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateBillingSetupResponse mutateBillingSetup(com.google.ads.googleads.v6.services.MutateBillingSetupRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateBillingSetupMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A service for designating the business entity responsible for accrued costs.
   * A billing setup is associated with a payments account.  Billing-related
   * activity for all billing setups associated with a particular payments account
   * will appear on a single invoice generated monthly.
   * Mutates:
   * The REMOVE operation cancels a pending billing setup.
   * The CREATE operation creates a new billing setup.
   * </pre>
   */
  public static final class BillingSetupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BillingSetupServiceFutureStub> {
    private BillingSetupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingSetupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingSetupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a billing setup.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.BillingSetup> getBillingSetup(
        com.google.ads.googleads.v6.services.GetBillingSetupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBillingSetupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a billing setup, or cancels an existing billing setup.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateBillingSetupResponse> mutateBillingSetup(
        com.google.ads.googleads.v6.services.MutateBillingSetupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateBillingSetupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BILLING_SETUP = 0;
  private static final int METHODID_MUTATE_BILLING_SETUP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BillingSetupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BillingSetupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BILLING_SETUP:
          serviceImpl.getBillingSetup((com.google.ads.googleads.v6.services.GetBillingSetupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.BillingSetup>) responseObserver);
          break;
        case METHODID_MUTATE_BILLING_SETUP:
          serviceImpl.mutateBillingSetup((com.google.ads.googleads.v6.services.MutateBillingSetupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateBillingSetupResponse>) responseObserver);
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

  private static abstract class BillingSetupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BillingSetupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.BillingSetupServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BillingSetupService");
    }
  }

  private static final class BillingSetupServiceFileDescriptorSupplier
      extends BillingSetupServiceBaseDescriptorSupplier {
    BillingSetupServiceFileDescriptorSupplier() {}
  }

  private static final class BillingSetupServiceMethodDescriptorSupplier
      extends BillingSetupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BillingSetupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BillingSetupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BillingSetupServiceFileDescriptorSupplier())
              .addMethod(getGetBillingSetupMethod())
              .addMethod(getMutateBillingSetupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
