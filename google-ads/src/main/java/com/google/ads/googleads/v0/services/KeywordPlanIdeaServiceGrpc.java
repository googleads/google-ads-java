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
 * Service to generate keyword ideas.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v0/services/keyword_plan_idea_service.proto")
public final class KeywordPlanIdeaServiceGrpc {

  private KeywordPlanIdeaServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.KeywordPlanIdeaService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGenerateKeywordIdeasMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest,
      com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse> METHOD_GENERATE_KEYWORD_IDEAS = getGenerateKeywordIdeasMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest,
      com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse> getGenerateKeywordIdeasMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest,
      com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse> getGenerateKeywordIdeasMethod() {
    return getGenerateKeywordIdeasMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest,
      com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse> getGenerateKeywordIdeasMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest, com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse> getGenerateKeywordIdeasMethod;
    if ((getGenerateKeywordIdeasMethod = KeywordPlanIdeaServiceGrpc.getGenerateKeywordIdeasMethod) == null) {
      synchronized (KeywordPlanIdeaServiceGrpc.class) {
        if ((getGenerateKeywordIdeasMethod = KeywordPlanIdeaServiceGrpc.getGenerateKeywordIdeasMethod) == null) {
          KeywordPlanIdeaServiceGrpc.getGenerateKeywordIdeasMethod = getGenerateKeywordIdeasMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest, com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.KeywordPlanIdeaService", "GenerateKeywordIdeas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KeywordPlanIdeaServiceMethodDescriptorSupplier("GenerateKeywordIdeas"))
                  .build();
          }
        }
     }
     return getGenerateKeywordIdeasMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordPlanIdeaServiceStub newStub(io.grpc.Channel channel) {
    return new KeywordPlanIdeaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordPlanIdeaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KeywordPlanIdeaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordPlanIdeaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KeywordPlanIdeaServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to generate keyword ideas.
   * </pre>
   */
  public static abstract class KeywordPlanIdeaServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns a list of keyword ideas.
     * </pre>
     */
    public void generateKeywordIdeas(com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateKeywordIdeasMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateKeywordIdeasMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest,
                com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse>(
                  this, METHODID_GENERATE_KEYWORD_IDEAS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to generate keyword ideas.
   * </pre>
   */
  public static final class KeywordPlanIdeaServiceStub extends io.grpc.stub.AbstractStub<KeywordPlanIdeaServiceStub> {
    private KeywordPlanIdeaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanIdeaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanIdeaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanIdeaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of keyword ideas.
     * </pre>
     */
    public void generateKeywordIdeas(com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateKeywordIdeasMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to generate keyword ideas.
   * </pre>
   */
  public static final class KeywordPlanIdeaServiceBlockingStub extends io.grpc.stub.AbstractStub<KeywordPlanIdeaServiceBlockingStub> {
    private KeywordPlanIdeaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanIdeaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanIdeaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanIdeaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of keyword ideas.
     * </pre>
     */
    public com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse generateKeywordIdeas(com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateKeywordIdeasMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to generate keyword ideas.
   * </pre>
   */
  public static final class KeywordPlanIdeaServiceFutureStub extends io.grpc.stub.AbstractStub<KeywordPlanIdeaServiceFutureStub> {
    private KeywordPlanIdeaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanIdeaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanIdeaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanIdeaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of keyword ideas.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse> generateKeywordIdeas(
        com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateKeywordIdeasMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_KEYWORD_IDEAS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeywordPlanIdeaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeywordPlanIdeaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_KEYWORD_IDEAS:
          serviceImpl.generateKeywordIdeas((com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse>) responseObserver);
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

  private static abstract class KeywordPlanIdeaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordPlanIdeaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.KeywordPlanIdeaServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordPlanIdeaService");
    }
  }

  private static final class KeywordPlanIdeaServiceFileDescriptorSupplier
      extends KeywordPlanIdeaServiceBaseDescriptorSupplier {
    KeywordPlanIdeaServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordPlanIdeaServiceMethodDescriptorSupplier
      extends KeywordPlanIdeaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeywordPlanIdeaServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeywordPlanIdeaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordPlanIdeaServiceFileDescriptorSupplier())
              .addMethod(getGenerateKeywordIdeasMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
