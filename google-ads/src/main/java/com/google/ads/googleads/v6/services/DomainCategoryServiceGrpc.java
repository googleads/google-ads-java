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
 * Service to fetch domain categories.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/domain_category_service.proto")
public final class DomainCategoryServiceGrpc {

  private DomainCategoryServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.DomainCategoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetDomainCategoryRequest,
      com.google.ads.googleads.v6.resources.DomainCategory> getGetDomainCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDomainCategory",
      requestType = com.google.ads.googleads.v6.services.GetDomainCategoryRequest.class,
      responseType = com.google.ads.googleads.v6.resources.DomainCategory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetDomainCategoryRequest,
      com.google.ads.googleads.v6.resources.DomainCategory> getGetDomainCategoryMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetDomainCategoryRequest, com.google.ads.googleads.v6.resources.DomainCategory> getGetDomainCategoryMethod;
    if ((getGetDomainCategoryMethod = DomainCategoryServiceGrpc.getGetDomainCategoryMethod) == null) {
      synchronized (DomainCategoryServiceGrpc.class) {
        if ((getGetDomainCategoryMethod = DomainCategoryServiceGrpc.getGetDomainCategoryMethod) == null) {
          DomainCategoryServiceGrpc.getGetDomainCategoryMethod = getGetDomainCategoryMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetDomainCategoryRequest, com.google.ads.googleads.v6.resources.DomainCategory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDomainCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetDomainCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.DomainCategory.getDefaultInstance()))
              .setSchemaDescriptor(new DomainCategoryServiceMethodDescriptorSupplier("GetDomainCategory"))
              .build();
        }
      }
    }
    return getGetDomainCategoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DomainCategoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainCategoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainCategoryServiceStub>() {
        @java.lang.Override
        public DomainCategoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainCategoryServiceStub(channel, callOptions);
        }
      };
    return DomainCategoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DomainCategoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainCategoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainCategoryServiceBlockingStub>() {
        @java.lang.Override
        public DomainCategoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainCategoryServiceBlockingStub(channel, callOptions);
        }
      };
    return DomainCategoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DomainCategoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainCategoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainCategoryServiceFutureStub>() {
        @java.lang.Override
        public DomainCategoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainCategoryServiceFutureStub(channel, callOptions);
        }
      };
    return DomainCategoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch domain categories.
   * </pre>
   */
  public static abstract class DomainCategoryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested domain category.
     * </pre>
     */
    public void getDomainCategory(com.google.ads.googleads.v6.services.GetDomainCategoryRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.DomainCategory> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDomainCategoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDomainCategoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetDomainCategoryRequest,
                com.google.ads.googleads.v6.resources.DomainCategory>(
                  this, METHODID_GET_DOMAIN_CATEGORY)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch domain categories.
   * </pre>
   */
  public static final class DomainCategoryServiceStub extends io.grpc.stub.AbstractAsyncStub<DomainCategoryServiceStub> {
    private DomainCategoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainCategoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainCategoryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested domain category.
     * </pre>
     */
    public void getDomainCategory(com.google.ads.googleads.v6.services.GetDomainCategoryRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.DomainCategory> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDomainCategoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch domain categories.
   * </pre>
   */
  public static final class DomainCategoryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DomainCategoryServiceBlockingStub> {
    private DomainCategoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainCategoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainCategoryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested domain category.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.DomainCategory getDomainCategory(com.google.ads.googleads.v6.services.GetDomainCategoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDomainCategoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch domain categories.
   * </pre>
   */
  public static final class DomainCategoryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DomainCategoryServiceFutureStub> {
    private DomainCategoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainCategoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainCategoryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested domain category.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.DomainCategory> getDomainCategory(
        com.google.ads.googleads.v6.services.GetDomainCategoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDomainCategoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DOMAIN_CATEGORY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DomainCategoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DomainCategoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DOMAIN_CATEGORY:
          serviceImpl.getDomainCategory((com.google.ads.googleads.v6.services.GetDomainCategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.DomainCategory>) responseObserver);
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

  private static abstract class DomainCategoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DomainCategoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.DomainCategoryServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DomainCategoryService");
    }
  }

  private static final class DomainCategoryServiceFileDescriptorSupplier
      extends DomainCategoryServiceBaseDescriptorSupplier {
    DomainCategoryServiceFileDescriptorSupplier() {}
  }

  private static final class DomainCategoryServiceMethodDescriptorSupplier
      extends DomainCategoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DomainCategoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DomainCategoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DomainCategoryServiceFileDescriptorSupplier())
              .addMethod(getGetDomainCategoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
