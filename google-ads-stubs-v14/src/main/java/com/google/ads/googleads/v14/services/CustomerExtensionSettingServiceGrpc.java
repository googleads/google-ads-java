package com.google.ads.googleads.v14.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customer extension settings.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v14/services/customer_extension_setting_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerExtensionSettingServiceGrpc {

  private CustomerExtensionSettingServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v14.services.CustomerExtensionSettingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsRequest,
      com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsResponse> getMutateCustomerExtensionSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerExtensionSettings",
      requestType = com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsRequest.class,
      responseType = com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsRequest,
      com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsResponse> getMutateCustomerExtensionSettingsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsRequest, com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsResponse> getMutateCustomerExtensionSettingsMethod;
    if ((getMutateCustomerExtensionSettingsMethod = CustomerExtensionSettingServiceGrpc.getMutateCustomerExtensionSettingsMethod) == null) {
      synchronized (CustomerExtensionSettingServiceGrpc.class) {
        if ((getMutateCustomerExtensionSettingsMethod = CustomerExtensionSettingServiceGrpc.getMutateCustomerExtensionSettingsMethod) == null) {
          CustomerExtensionSettingServiceGrpc.getMutateCustomerExtensionSettingsMethod = getMutateCustomerExtensionSettingsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsRequest, com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerExtensionSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerExtensionSettingServiceMethodDescriptorSupplier("MutateCustomerExtensionSettings"))
              .build();
        }
      }
    }
    return getMutateCustomerExtensionSettingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerExtensionSettingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerExtensionSettingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerExtensionSettingServiceStub>() {
        @java.lang.Override
        public CustomerExtensionSettingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerExtensionSettingServiceStub(channel, callOptions);
        }
      };
    return CustomerExtensionSettingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerExtensionSettingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerExtensionSettingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerExtensionSettingServiceBlockingStub>() {
        @java.lang.Override
        public CustomerExtensionSettingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerExtensionSettingServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerExtensionSettingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerExtensionSettingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerExtensionSettingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerExtensionSettingServiceFutureStub>() {
        @java.lang.Override
        public CustomerExtensionSettingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerExtensionSettingServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerExtensionSettingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage customer extension settings.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes customer extension settings. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionSettingError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    default void mutateCustomerExtensionSettings(com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerExtensionSettingsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerExtensionSettingService.
   * <pre>
   * Service to manage customer extension settings.
   * </pre>
   */
  public static abstract class CustomerExtensionSettingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerExtensionSettingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerExtensionSettingService.
   * <pre>
   * Service to manage customer extension settings.
   * </pre>
   */
  public static final class CustomerExtensionSettingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerExtensionSettingServiceStub> {
    private CustomerExtensionSettingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerExtensionSettingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerExtensionSettingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer extension settings. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionSettingError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public void mutateCustomerExtensionSettings(com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerExtensionSettingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerExtensionSettingService.
   * <pre>
   * Service to manage customer extension settings.
   * </pre>
   */
  public static final class CustomerExtensionSettingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerExtensionSettingServiceBlockingStub> {
    private CustomerExtensionSettingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerExtensionSettingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerExtensionSettingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer extension settings. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionSettingError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsResponse mutateCustomerExtensionSettings(com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerExtensionSettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerExtensionSettingService.
   * <pre>
   * Service to manage customer extension settings.
   * </pre>
   */
  public static final class CustomerExtensionSettingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerExtensionSettingServiceFutureStub> {
    private CustomerExtensionSettingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerExtensionSettingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerExtensionSettingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes customer extension settings. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionSettingError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsResponse> mutateCustomerExtensionSettings(
        com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerExtensionSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER_EXTENSION_SETTINGS = 0;

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
        case METHODID_MUTATE_CUSTOMER_EXTENSION_SETTINGS:
          serviceImpl.mutateCustomerExtensionSettings((com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsResponse>) responseObserver);
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
          getMutateCustomerExtensionSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsRequest,
              com.google.ads.googleads.v14.services.MutateCustomerExtensionSettingsResponse>(
                service, METHODID_MUTATE_CUSTOMER_EXTENSION_SETTINGS)))
        .build();
  }

  private static abstract class CustomerExtensionSettingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerExtensionSettingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v14.services.CustomerExtensionSettingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerExtensionSettingService");
    }
  }

  private static final class CustomerExtensionSettingServiceFileDescriptorSupplier
      extends CustomerExtensionSettingServiceBaseDescriptorSupplier {
    CustomerExtensionSettingServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerExtensionSettingServiceMethodDescriptorSupplier
      extends CustomerExtensionSettingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerExtensionSettingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerExtensionSettingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerExtensionSettingServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomerExtensionSettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
