package com.google.ads.googleads.v4.services;

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
 * Service to manage shared sets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/shared_set_service.proto")
public final class SharedSetServiceGrpc {

  private SharedSetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.SharedSetService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetSharedSetMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetSharedSetRequest,
      com.google.ads.googleads.v4.resources.SharedSet> METHOD_GET_SHARED_SET = getGetSharedSetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetSharedSetRequest,
      com.google.ads.googleads.v4.resources.SharedSet> getGetSharedSetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetSharedSetRequest,
      com.google.ads.googleads.v4.resources.SharedSet> getGetSharedSetMethod() {
    return getGetSharedSetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetSharedSetRequest,
      com.google.ads.googleads.v4.resources.SharedSet> getGetSharedSetMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetSharedSetRequest, com.google.ads.googleads.v4.resources.SharedSet> getGetSharedSetMethod;
    if ((getGetSharedSetMethod = SharedSetServiceGrpc.getGetSharedSetMethod) == null) {
      synchronized (SharedSetServiceGrpc.class) {
        if ((getGetSharedSetMethod = SharedSetServiceGrpc.getGetSharedSetMethod) == null) {
          SharedSetServiceGrpc.getGetSharedSetMethod = getGetSharedSetMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetSharedSetRequest, com.google.ads.googleads.v4.resources.SharedSet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.SharedSetService", "GetSharedSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetSharedSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.SharedSet.getDefaultInstance()))
                  .setSchemaDescriptor(new SharedSetServiceMethodDescriptorSupplier("GetSharedSet"))
                  .build();
          }
        }
     }
     return getGetSharedSetMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateSharedSetsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateSharedSetsRequest,
      com.google.ads.googleads.v4.services.MutateSharedSetsResponse> METHOD_MUTATE_SHARED_SETS = getMutateSharedSetsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateSharedSetsRequest,
      com.google.ads.googleads.v4.services.MutateSharedSetsResponse> getMutateSharedSetsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateSharedSetsRequest,
      com.google.ads.googleads.v4.services.MutateSharedSetsResponse> getMutateSharedSetsMethod() {
    return getMutateSharedSetsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateSharedSetsRequest,
      com.google.ads.googleads.v4.services.MutateSharedSetsResponse> getMutateSharedSetsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateSharedSetsRequest, com.google.ads.googleads.v4.services.MutateSharedSetsResponse> getMutateSharedSetsMethod;
    if ((getMutateSharedSetsMethod = SharedSetServiceGrpc.getMutateSharedSetsMethod) == null) {
      synchronized (SharedSetServiceGrpc.class) {
        if ((getMutateSharedSetsMethod = SharedSetServiceGrpc.getMutateSharedSetsMethod) == null) {
          SharedSetServiceGrpc.getMutateSharedSetsMethod = getMutateSharedSetsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.MutateSharedSetsRequest, com.google.ads.googleads.v4.services.MutateSharedSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.SharedSetService", "MutateSharedSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateSharedSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateSharedSetsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SharedSetServiceMethodDescriptorSupplier("MutateSharedSets"))
                  .build();
          }
        }
     }
     return getMutateSharedSetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SharedSetServiceStub newStub(io.grpc.Channel channel) {
    return new SharedSetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SharedSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SharedSetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SharedSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SharedSetServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage shared sets.
   * </pre>
   */
  public static abstract class SharedSetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested shared set in full detail.
     * </pre>
     */
    public void getSharedSet(com.google.ads.googleads.v4.services.GetSharedSetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.SharedSet> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSharedSetMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes shared sets. Operation statuses are returned.
     * </pre>
     */
    public void mutateSharedSets(com.google.ads.googleads.v4.services.MutateSharedSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateSharedSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateSharedSetsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSharedSetMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetSharedSetRequest,
                com.google.ads.googleads.v4.resources.SharedSet>(
                  this, METHODID_GET_SHARED_SET)))
          .addMethod(
            getMutateSharedSetsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.MutateSharedSetsRequest,
                com.google.ads.googleads.v4.services.MutateSharedSetsResponse>(
                  this, METHODID_MUTATE_SHARED_SETS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage shared sets.
   * </pre>
   */
  public static final class SharedSetServiceStub extends io.grpc.stub.AbstractStub<SharedSetServiceStub> {
    private SharedSetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SharedSetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SharedSetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SharedSetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested shared set in full detail.
     * </pre>
     */
    public void getSharedSet(com.google.ads.googleads.v4.services.GetSharedSetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.SharedSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSharedSetMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes shared sets. Operation statuses are returned.
     * </pre>
     */
    public void mutateSharedSets(com.google.ads.googleads.v4.services.MutateSharedSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateSharedSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateSharedSetsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage shared sets.
   * </pre>
   */
  public static final class SharedSetServiceBlockingStub extends io.grpc.stub.AbstractStub<SharedSetServiceBlockingStub> {
    private SharedSetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SharedSetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SharedSetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SharedSetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested shared set in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.SharedSet getSharedSet(com.google.ads.googleads.v4.services.GetSharedSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSharedSetMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes shared sets. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.MutateSharedSetsResponse mutateSharedSets(com.google.ads.googleads.v4.services.MutateSharedSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateSharedSetsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage shared sets.
   * </pre>
   */
  public static final class SharedSetServiceFutureStub extends io.grpc.stub.AbstractStub<SharedSetServiceFutureStub> {
    private SharedSetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SharedSetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SharedSetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SharedSetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested shared set in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.SharedSet> getSharedSet(
        com.google.ads.googleads.v4.services.GetSharedSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSharedSetMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes shared sets. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.MutateSharedSetsResponse> mutateSharedSets(
        com.google.ads.googleads.v4.services.MutateSharedSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateSharedSetsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SHARED_SET = 0;
  private static final int METHODID_MUTATE_SHARED_SETS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SharedSetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SharedSetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SHARED_SET:
          serviceImpl.getSharedSet((com.google.ads.googleads.v4.services.GetSharedSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.SharedSet>) responseObserver);
          break;
        case METHODID_MUTATE_SHARED_SETS:
          serviceImpl.mutateSharedSets((com.google.ads.googleads.v4.services.MutateSharedSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateSharedSetsResponse>) responseObserver);
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

  private static abstract class SharedSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SharedSetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.SharedSetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SharedSetService");
    }
  }

  private static final class SharedSetServiceFileDescriptorSupplier
      extends SharedSetServiceBaseDescriptorSupplier {
    SharedSetServiceFileDescriptorSupplier() {}
  }

  private static final class SharedSetServiceMethodDescriptorSupplier
      extends SharedSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SharedSetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SharedSetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SharedSetServiceFileDescriptorSupplier())
              .addMethod(getGetSharedSetMethodHelper())
              .addMethod(getMutateSharedSetsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
