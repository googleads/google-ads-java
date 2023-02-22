package com.google.ads.googleads.v13.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Keyword Plan campaign keywords. KeywordPlanCampaign is
 * required to add the campaign keywords. Only negative keywords are supported.
 * A maximum of 1000 negative keywords are allowed per plan. This includes both
 * campaign negative keywords and ad group negative keywords.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v13/services/keyword_plan_campaign_keyword_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KeywordPlanCampaignKeywordServiceGrpc {

  private KeywordPlanCampaignKeywordServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v13.services.KeywordPlanCampaignKeywordService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsRequest,
      com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsResponse> getMutateKeywordPlanCampaignKeywordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateKeywordPlanCampaignKeywords",
      requestType = com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsRequest.class,
      responseType = com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsRequest,
      com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsResponse> getMutateKeywordPlanCampaignKeywordsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsRequest, com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsResponse> getMutateKeywordPlanCampaignKeywordsMethod;
    if ((getMutateKeywordPlanCampaignKeywordsMethod = KeywordPlanCampaignKeywordServiceGrpc.getMutateKeywordPlanCampaignKeywordsMethod) == null) {
      synchronized (KeywordPlanCampaignKeywordServiceGrpc.class) {
        if ((getMutateKeywordPlanCampaignKeywordsMethod = KeywordPlanCampaignKeywordServiceGrpc.getMutateKeywordPlanCampaignKeywordsMethod) == null) {
          KeywordPlanCampaignKeywordServiceGrpc.getMutateKeywordPlanCampaignKeywordsMethod = getMutateKeywordPlanCampaignKeywordsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsRequest, com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateKeywordPlanCampaignKeywords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanCampaignKeywordServiceMethodDescriptorSupplier("MutateKeywordPlanCampaignKeywords"))
              .build();
        }
      }
    }
    return getMutateKeywordPlanCampaignKeywordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordPlanCampaignKeywordServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanCampaignKeywordServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanCampaignKeywordServiceStub>() {
        @java.lang.Override
        public KeywordPlanCampaignKeywordServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanCampaignKeywordServiceStub(channel, callOptions);
        }
      };
    return KeywordPlanCampaignKeywordServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordPlanCampaignKeywordServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanCampaignKeywordServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanCampaignKeywordServiceBlockingStub>() {
        @java.lang.Override
        public KeywordPlanCampaignKeywordServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanCampaignKeywordServiceBlockingStub(channel, callOptions);
        }
      };
    return KeywordPlanCampaignKeywordServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordPlanCampaignKeywordServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanCampaignKeywordServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanCampaignKeywordServiceFutureStub>() {
        @java.lang.Override
        public KeywordPlanCampaignKeywordServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanCampaignKeywordServiceFutureStub(channel, callOptions);
        }
      };
    return KeywordPlanCampaignKeywordServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Keyword Plan campaign keywords. KeywordPlanCampaign is
   * required to add the campaign keywords. Only negative keywords are supported.
   * A maximum of 1000 negative keywords are allowed per plan. This includes both
   * campaign negative keywords and ad group negative keywords.
   * </pre>
   */
  public static abstract class KeywordPlanCampaignKeywordServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan campaign keywords. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanAdGroupKeywordError]()
     *   [KeywordPlanCampaignKeywordError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public void mutateKeywordPlanCampaignKeywords(com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateKeywordPlanCampaignKeywordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateKeywordPlanCampaignKeywordsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsRequest,
                com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsResponse>(
                  this, METHODID_MUTATE_KEYWORD_PLAN_CAMPAIGN_KEYWORDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan campaign keywords. KeywordPlanCampaign is
   * required to add the campaign keywords. Only negative keywords are supported.
   * A maximum of 1000 negative keywords are allowed per plan. This includes both
   * campaign negative keywords and ad group negative keywords.
   * </pre>
   */
  public static final class KeywordPlanCampaignKeywordServiceStub extends io.grpc.stub.AbstractAsyncStub<KeywordPlanCampaignKeywordServiceStub> {
    private KeywordPlanCampaignKeywordServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanCampaignKeywordServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanCampaignKeywordServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan campaign keywords. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanAdGroupKeywordError]()
     *   [KeywordPlanCampaignKeywordError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public void mutateKeywordPlanCampaignKeywords(com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateKeywordPlanCampaignKeywordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan campaign keywords. KeywordPlanCampaign is
   * required to add the campaign keywords. Only negative keywords are supported.
   * A maximum of 1000 negative keywords are allowed per plan. This includes both
   * campaign negative keywords and ad group negative keywords.
   * </pre>
   */
  public static final class KeywordPlanCampaignKeywordServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeywordPlanCampaignKeywordServiceBlockingStub> {
    private KeywordPlanCampaignKeywordServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanCampaignKeywordServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanCampaignKeywordServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan campaign keywords. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanAdGroupKeywordError]()
     *   [KeywordPlanCampaignKeywordError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsResponse mutateKeywordPlanCampaignKeywords(com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateKeywordPlanCampaignKeywordsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan campaign keywords. KeywordPlanCampaign is
   * required to add the campaign keywords. Only negative keywords are supported.
   * A maximum of 1000 negative keywords are allowed per plan. This includes both
   * campaign negative keywords and ad group negative keywords.
   * </pre>
   */
  public static final class KeywordPlanCampaignKeywordServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeywordPlanCampaignKeywordServiceFutureStub> {
    private KeywordPlanCampaignKeywordServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanCampaignKeywordServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanCampaignKeywordServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan campaign keywords. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanAdGroupKeywordError]()
     *   [KeywordPlanCampaignKeywordError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsResponse> mutateKeywordPlanCampaignKeywords(
        com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateKeywordPlanCampaignKeywordsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_KEYWORD_PLAN_CAMPAIGN_KEYWORDS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeywordPlanCampaignKeywordServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeywordPlanCampaignKeywordServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_KEYWORD_PLAN_CAMPAIGN_KEYWORDS:
          serviceImpl.mutateKeywordPlanCampaignKeywords((com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateKeywordPlanCampaignKeywordsResponse>) responseObserver);
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

  private static abstract class KeywordPlanCampaignKeywordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordPlanCampaignKeywordServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v13.services.KeywordPlanCampaignKeywordServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordPlanCampaignKeywordService");
    }
  }

  private static final class KeywordPlanCampaignKeywordServiceFileDescriptorSupplier
      extends KeywordPlanCampaignKeywordServiceBaseDescriptorSupplier {
    KeywordPlanCampaignKeywordServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordPlanCampaignKeywordServiceMethodDescriptorSupplier
      extends KeywordPlanCampaignKeywordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeywordPlanCampaignKeywordServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeywordPlanCampaignKeywordServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordPlanCampaignKeywordServiceFileDescriptorSupplier())
              .addMethod(getMutateKeywordPlanCampaignKeywordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
