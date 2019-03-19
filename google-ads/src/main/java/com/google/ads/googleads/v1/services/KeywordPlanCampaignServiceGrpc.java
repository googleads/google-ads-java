package com.google.ads.googleads.v1.services;

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
 * Service to manage Keyword Plan campaigns.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v1/services/keyword_plan_campaign_service.proto")
public final class KeywordPlanCampaignServiceGrpc {

  private KeywordPlanCampaignServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.KeywordPlanCampaignService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetKeywordPlanCampaignMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest,
      com.google.ads.googleads.v1.resources.KeywordPlanCampaign> METHOD_GET_KEYWORD_PLAN_CAMPAIGN = getGetKeywordPlanCampaignMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest,
      com.google.ads.googleads.v1.resources.KeywordPlanCampaign> getGetKeywordPlanCampaignMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest,
      com.google.ads.googleads.v1.resources.KeywordPlanCampaign> getGetKeywordPlanCampaignMethod() {
    return getGetKeywordPlanCampaignMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest,
      com.google.ads.googleads.v1.resources.KeywordPlanCampaign> getGetKeywordPlanCampaignMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest, com.google.ads.googleads.v1.resources.KeywordPlanCampaign> getGetKeywordPlanCampaignMethod;
    if ((getGetKeywordPlanCampaignMethod = KeywordPlanCampaignServiceGrpc.getGetKeywordPlanCampaignMethod) == null) {
      synchronized (KeywordPlanCampaignServiceGrpc.class) {
        if ((getGetKeywordPlanCampaignMethod = KeywordPlanCampaignServiceGrpc.getGetKeywordPlanCampaignMethod) == null) {
          KeywordPlanCampaignServiceGrpc.getGetKeywordPlanCampaignMethod = getGetKeywordPlanCampaignMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest, com.google.ads.googleads.v1.resources.KeywordPlanCampaign>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.KeywordPlanCampaignService", "GetKeywordPlanCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.KeywordPlanCampaign.getDefaultInstance()))
                  .setSchemaDescriptor(new KeywordPlanCampaignServiceMethodDescriptorSupplier("GetKeywordPlanCampaign"))
                  .build();
          }
        }
     }
     return getGetKeywordPlanCampaignMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateKeywordPlanCampaignsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest,
      com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse> METHOD_MUTATE_KEYWORD_PLAN_CAMPAIGNS = getMutateKeywordPlanCampaignsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest,
      com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse> getMutateKeywordPlanCampaignsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest,
      com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse> getMutateKeywordPlanCampaignsMethod() {
    return getMutateKeywordPlanCampaignsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest,
      com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse> getMutateKeywordPlanCampaignsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest, com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse> getMutateKeywordPlanCampaignsMethod;
    if ((getMutateKeywordPlanCampaignsMethod = KeywordPlanCampaignServiceGrpc.getMutateKeywordPlanCampaignsMethod) == null) {
      synchronized (KeywordPlanCampaignServiceGrpc.class) {
        if ((getMutateKeywordPlanCampaignsMethod = KeywordPlanCampaignServiceGrpc.getMutateKeywordPlanCampaignsMethod) == null) {
          KeywordPlanCampaignServiceGrpc.getMutateKeywordPlanCampaignsMethod = getMutateKeywordPlanCampaignsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest, com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v1.services.KeywordPlanCampaignService", "MutateKeywordPlanCampaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KeywordPlanCampaignServiceMethodDescriptorSupplier("MutateKeywordPlanCampaigns"))
                  .build();
          }
        }
     }
     return getMutateKeywordPlanCampaignsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordPlanCampaignServiceStub newStub(io.grpc.Channel channel) {
    return new KeywordPlanCampaignServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordPlanCampaignServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KeywordPlanCampaignServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordPlanCampaignServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KeywordPlanCampaignServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage Keyword Plan campaigns.
   * </pre>
   */
  public static abstract class KeywordPlanCampaignServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Keyword Plan campaign in full detail.
     * </pre>
     */
    public void getKeywordPlanCampaign(com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.KeywordPlanCampaign> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKeywordPlanCampaignMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateKeywordPlanCampaigns(com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateKeywordPlanCampaignsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetKeywordPlanCampaignMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest,
                com.google.ads.googleads.v1.resources.KeywordPlanCampaign>(
                  this, METHODID_GET_KEYWORD_PLAN_CAMPAIGN)))
          .addMethod(
            getMutateKeywordPlanCampaignsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest,
                com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse>(
                  this, METHODID_MUTATE_KEYWORD_PLAN_CAMPAIGNS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan campaigns.
   * </pre>
   */
  public static final class KeywordPlanCampaignServiceStub extends io.grpc.stub.AbstractStub<KeywordPlanCampaignServiceStub> {
    private KeywordPlanCampaignServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanCampaignServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanCampaignServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanCampaignServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan campaign in full detail.
     * </pre>
     */
    public void getKeywordPlanCampaign(com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.KeywordPlanCampaign> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKeywordPlanCampaignMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateKeywordPlanCampaigns(com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateKeywordPlanCampaignsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan campaigns.
   * </pre>
   */
  public static final class KeywordPlanCampaignServiceBlockingStub extends io.grpc.stub.AbstractStub<KeywordPlanCampaignServiceBlockingStub> {
    private KeywordPlanCampaignServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanCampaignServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanCampaignServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanCampaignServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan campaign in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.KeywordPlanCampaign getKeywordPlanCampaign(com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetKeywordPlanCampaignMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse mutateKeywordPlanCampaigns(com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateKeywordPlanCampaignsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan campaigns.
   * </pre>
   */
  public static final class KeywordPlanCampaignServiceFutureStub extends io.grpc.stub.AbstractStub<KeywordPlanCampaignServiceFutureStub> {
    private KeywordPlanCampaignServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanCampaignServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanCampaignServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanCampaignServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan campaign in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.KeywordPlanCampaign> getKeywordPlanCampaign(
        com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKeywordPlanCampaignMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse> mutateKeywordPlanCampaigns(
        com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateKeywordPlanCampaignsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_KEYWORD_PLAN_CAMPAIGN = 0;
  private static final int METHODID_MUTATE_KEYWORD_PLAN_CAMPAIGNS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeywordPlanCampaignServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeywordPlanCampaignServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_KEYWORD_PLAN_CAMPAIGN:
          serviceImpl.getKeywordPlanCampaign((com.google.ads.googleads.v1.services.GetKeywordPlanCampaignRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.KeywordPlanCampaign>) responseObserver);
          break;
        case METHODID_MUTATE_KEYWORD_PLAN_CAMPAIGNS:
          serviceImpl.mutateKeywordPlanCampaigns((com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse>) responseObserver);
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

  private static abstract class KeywordPlanCampaignServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordPlanCampaignServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.KeywordPlanCampaignServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordPlanCampaignService");
    }
  }

  private static final class KeywordPlanCampaignServiceFileDescriptorSupplier
      extends KeywordPlanCampaignServiceBaseDescriptorSupplier {
    KeywordPlanCampaignServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordPlanCampaignServiceMethodDescriptorSupplier
      extends KeywordPlanCampaignServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeywordPlanCampaignServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeywordPlanCampaignServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordPlanCampaignServiceFileDescriptorSupplier())
              .addMethod(getGetKeywordPlanCampaignMethodHelper())
              .addMethod(getMutateKeywordPlanCampaignsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
