package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ad group bid modifiers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/ad_group_bid_modifier_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupBidModifierServiceGrpc {

  private AdGroupBidModifierServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.AdGroupBidModifierService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersRequest,
      com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersResponse> getMutateAdGroupBidModifiersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupBidModifiers",
      requestType = com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersRequest.class,
      responseType = com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersRequest,
      com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersResponse> getMutateAdGroupBidModifiersMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersRequest, com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersResponse> getMutateAdGroupBidModifiersMethod;
    if ((getMutateAdGroupBidModifiersMethod = AdGroupBidModifierServiceGrpc.getMutateAdGroupBidModifiersMethod) == null) {
      synchronized (AdGroupBidModifierServiceGrpc.class) {
        if ((getMutateAdGroupBidModifiersMethod = AdGroupBidModifierServiceGrpc.getMutateAdGroupBidModifiersMethod) == null) {
          AdGroupBidModifierServiceGrpc.getMutateAdGroupBidModifiersMethod = getMutateAdGroupBidModifiersMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersRequest, com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupBidModifiers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupBidModifierServiceMethodDescriptorSupplier("MutateAdGroupBidModifiers"))
              .build();
        }
      }
    }
    return getMutateAdGroupBidModifiersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupBidModifierServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupBidModifierServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupBidModifierServiceStub>() {
        @java.lang.Override
        public AdGroupBidModifierServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupBidModifierServiceStub(channel, callOptions);
        }
      };
    return AdGroupBidModifierServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupBidModifierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupBidModifierServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupBidModifierServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupBidModifierServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupBidModifierServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupBidModifierServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupBidModifierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupBidModifierServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupBidModifierServiceFutureStub>() {
        @java.lang.Override
        public AdGroupBidModifierServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupBidModifierServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupBidModifierServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage ad group bid modifiers.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes ad group bid modifiers.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AdGroupBidModifierError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    default void mutateAdGroupBidModifiers(com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupBidModifiersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdGroupBidModifierService.
   * <pre>
   * Service to manage ad group bid modifiers.
   * </pre>
   */
  public static abstract class AdGroupBidModifierServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdGroupBidModifierServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdGroupBidModifierService.
   * <pre>
   * Service to manage ad group bid modifiers.
   * </pre>
   */
  public static final class AdGroupBidModifierServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdGroupBidModifierServiceStub> {
    private AdGroupBidModifierServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupBidModifierServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupBidModifierServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group bid modifiers.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AdGroupBidModifierError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateAdGroupBidModifiers(com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupBidModifiersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdGroupBidModifierService.
   * <pre>
   * Service to manage ad group bid modifiers.
   * </pre>
   */
  public static final class AdGroupBidModifierServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupBidModifierServiceBlockingStub> {
    private AdGroupBidModifierServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupBidModifierServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupBidModifierServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group bid modifiers.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AdGroupBidModifierError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersResponse mutateAdGroupBidModifiers(com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupBidModifiersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdGroupBidModifierService.
   * <pre>
   * Service to manage ad group bid modifiers.
   * </pre>
   */
  public static final class AdGroupBidModifierServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdGroupBidModifierServiceFutureStub> {
    private AdGroupBidModifierServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupBidModifierServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupBidModifierServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group bid modifiers.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AdGroupBidModifierError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersResponse> mutateAdGroupBidModifiers(
        com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupBidModifiersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AD_GROUP_BID_MODIFIERS = 0;

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
        case METHODID_MUTATE_AD_GROUP_BID_MODIFIERS:
          serviceImpl.mutateAdGroupBidModifiers((com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersResponse>) responseObserver);
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
          getMutateAdGroupBidModifiersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersRequest,
              com.google.ads.googleads.v18.services.MutateAdGroupBidModifiersResponse>(
                service, METHODID_MUTATE_AD_GROUP_BID_MODIFIERS)))
        .build();
  }

  private static abstract class AdGroupBidModifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupBidModifierServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.AdGroupBidModifierServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupBidModifierService");
    }
  }

  private static final class AdGroupBidModifierServiceFileDescriptorSupplier
      extends AdGroupBidModifierServiceBaseDescriptorSupplier {
    AdGroupBidModifierServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupBidModifierServiceMethodDescriptorSupplier
      extends AdGroupBidModifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdGroupBidModifierServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AdGroupBidModifierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupBidModifierServiceFileDescriptorSupplier())
              .addMethod(getMutateAdGroupBidModifiersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
