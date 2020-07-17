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
 * Service to manage ad groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/ad_group_service.proto")
public final class AdGroupServiceGrpc {

  private AdGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.AdGroupService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAdGroupMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupRequest,
      com.google.ads.googleads.v4.resources.AdGroup> METHOD_GET_AD_GROUP = getGetAdGroupMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupRequest,
      com.google.ads.googleads.v4.resources.AdGroup> getGetAdGroupMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupRequest,
      com.google.ads.googleads.v4.resources.AdGroup> getGetAdGroupMethod() {
    return getGetAdGroupMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupRequest,
      com.google.ads.googleads.v4.resources.AdGroup> getGetAdGroupMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupRequest, com.google.ads.googleads.v4.resources.AdGroup> getGetAdGroupMethod;
    if ((getGetAdGroupMethod = AdGroupServiceGrpc.getGetAdGroupMethod) == null) {
      synchronized (AdGroupServiceGrpc.class) {
        if ((getGetAdGroupMethod = AdGroupServiceGrpc.getGetAdGroupMethod) == null) {
          AdGroupServiceGrpc.getGetAdGroupMethod = getGetAdGroupMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetAdGroupRequest, com.google.ads.googleads.v4.resources.AdGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.AdGroupService", "GetAdGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetAdGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.AdGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupServiceMethodDescriptorSupplier("GetAdGroup"))
                  .build();
          }
        }
     }
     return getGetAdGroupMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateAdGroupsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateAdGroupsRequest,
      com.google.ads.googleads.v4.services.MutateAdGroupsResponse> METHOD_MUTATE_AD_GROUPS = getMutateAdGroupsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateAdGroupsRequest,
      com.google.ads.googleads.v4.services.MutateAdGroupsResponse> getMutateAdGroupsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateAdGroupsRequest,
      com.google.ads.googleads.v4.services.MutateAdGroupsResponse> getMutateAdGroupsMethod() {
    return getMutateAdGroupsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateAdGroupsRequest,
      com.google.ads.googleads.v4.services.MutateAdGroupsResponse> getMutateAdGroupsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateAdGroupsRequest, com.google.ads.googleads.v4.services.MutateAdGroupsResponse> getMutateAdGroupsMethod;
    if ((getMutateAdGroupsMethod = AdGroupServiceGrpc.getMutateAdGroupsMethod) == null) {
      synchronized (AdGroupServiceGrpc.class) {
        if ((getMutateAdGroupsMethod = AdGroupServiceGrpc.getMutateAdGroupsMethod) == null) {
          AdGroupServiceGrpc.getMutateAdGroupsMethod = getMutateAdGroupsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.MutateAdGroupsRequest, com.google.ads.googleads.v4.services.MutateAdGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.AdGroupService", "MutateAdGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateAdGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateAdGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupServiceMethodDescriptorSupplier("MutateAdGroups"))
                  .build();
          }
        }
     }
     return getMutateAdGroupsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupServiceStub newStub(io.grpc.Channel channel) {
    return new AdGroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdGroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdGroupServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage ad groups.
   * </pre>
   */
  public static abstract class AdGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad group in full detail.
     * </pre>
     */
    public void getAdGroup(com.google.ads.googleads.v4.services.GetAdGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AdGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdGroupMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad groups. Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroups(com.google.ads.googleads.v4.services.MutateAdGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateAdGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAdGroupsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetAdGroupRequest,
                com.google.ads.googleads.v4.resources.AdGroup>(
                  this, METHODID_GET_AD_GROUP)))
          .addMethod(
            getMutateAdGroupsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.MutateAdGroupsRequest,
                com.google.ads.googleads.v4.services.MutateAdGroupsResponse>(
                  this, METHODID_MUTATE_AD_GROUPS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ad groups.
   * </pre>
   */
  public static final class AdGroupServiceStub extends io.grpc.stub.AbstractStub<AdGroupServiceStub> {
    private AdGroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group in full detail.
     * </pre>
     */
    public void getAdGroup(com.google.ads.googleads.v4.services.GetAdGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AdGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdGroupMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad groups. Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroups(com.google.ads.googleads.v4.services.MutateAdGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateAdGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ad groups.
   * </pre>
   */
  public static final class AdGroupServiceBlockingStub extends io.grpc.stub.AbstractStub<AdGroupServiceBlockingStub> {
    private AdGroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.AdGroup getAdGroup(com.google.ads.googleads.v4.services.GetAdGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdGroupMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad groups. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.MutateAdGroupsResponse mutateAdGroups(com.google.ads.googleads.v4.services.MutateAdGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAdGroupsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ad groups.
   * </pre>
   */
  public static final class AdGroupServiceFutureStub extends io.grpc.stub.AbstractStub<AdGroupServiceFutureStub> {
    private AdGroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.AdGroup> getAdGroup(
        com.google.ads.googleads.v4.services.GetAdGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdGroupMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad groups. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.MutateAdGroupsResponse> mutateAdGroups(
        com.google.ads.googleads.v4.services.MutateAdGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAdGroupsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP = 0;
  private static final int METHODID_MUTATE_AD_GROUPS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP:
          serviceImpl.getAdGroup((com.google.ads.googleads.v4.services.GetAdGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AdGroup>) responseObserver);
          break;
        case METHODID_MUTATE_AD_GROUPS:
          serviceImpl.mutateAdGroups((com.google.ads.googleads.v4.services.MutateAdGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateAdGroupsResponse>) responseObserver);
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

  private static abstract class AdGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.AdGroupServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupService");
    }
  }

  private static final class AdGroupServiceFileDescriptorSupplier
      extends AdGroupServiceBaseDescriptorSupplier {
    AdGroupServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupServiceMethodDescriptorSupplier
      extends AdGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupServiceFileDescriptorSupplier())
              .addMethod(getGetAdGroupMethodHelper())
              .addMethod(getMutateAdGroupsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
