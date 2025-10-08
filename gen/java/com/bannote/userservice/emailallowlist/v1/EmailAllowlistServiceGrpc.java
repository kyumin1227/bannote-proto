package com.bannote.userservice.emailallowlist.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The email allowlist service definition.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class EmailAllowlistServiceGrpc {

  private EmailAllowlistServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bannote.userservice.emailallowlist.v1.EmailAllowlistService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistRequest,
      com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistResponse> getAddEmailAllowlistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddEmailAllowlist",
      requestType = com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistRequest.class,
      responseType = com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistRequest,
      com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistResponse> getAddEmailAllowlistMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistRequest, com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistResponse> getAddEmailAllowlistMethod;
    if ((getAddEmailAllowlistMethod = EmailAllowlistServiceGrpc.getAddEmailAllowlistMethod) == null) {
      synchronized (EmailAllowlistServiceGrpc.class) {
        if ((getAddEmailAllowlistMethod = EmailAllowlistServiceGrpc.getAddEmailAllowlistMethod) == null) {
          EmailAllowlistServiceGrpc.getAddEmailAllowlistMethod = getAddEmailAllowlistMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistRequest, com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddEmailAllowlist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailAllowlistServiceMethodDescriptorSupplier("AddEmailAllowlist"))
              .build();
        }
      }
    }
    return getAddEmailAllowlistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistRequest,
      com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistResponse> getRemoveEmailAllowlistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveEmailAllowlist",
      requestType = com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistRequest.class,
      responseType = com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistRequest,
      com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistResponse> getRemoveEmailAllowlistMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistRequest, com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistResponse> getRemoveEmailAllowlistMethod;
    if ((getRemoveEmailAllowlistMethod = EmailAllowlistServiceGrpc.getRemoveEmailAllowlistMethod) == null) {
      synchronized (EmailAllowlistServiceGrpc.class) {
        if ((getRemoveEmailAllowlistMethod = EmailAllowlistServiceGrpc.getRemoveEmailAllowlistMethod) == null) {
          EmailAllowlistServiceGrpc.getRemoveEmailAllowlistMethod = getRemoveEmailAllowlistMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistRequest, com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveEmailAllowlist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailAllowlistServiceMethodDescriptorSupplier("RemoveEmailAllowlist"))
              .build();
        }
      }
    }
    return getRemoveEmailAllowlistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsRequest,
      com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsResponse> getListEmailAllowlistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEmailAllowlists",
      requestType = com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsRequest.class,
      responseType = com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsRequest,
      com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsResponse> getListEmailAllowlistsMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsRequest, com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsResponse> getListEmailAllowlistsMethod;
    if ((getListEmailAllowlistsMethod = EmailAllowlistServiceGrpc.getListEmailAllowlistsMethod) == null) {
      synchronized (EmailAllowlistServiceGrpc.class) {
        if ((getListEmailAllowlistsMethod = EmailAllowlistServiceGrpc.getListEmailAllowlistsMethod) == null) {
          EmailAllowlistServiceGrpc.getListEmailAllowlistsMethod = getListEmailAllowlistsMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsRequest, com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEmailAllowlists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailAllowlistServiceMethodDescriptorSupplier("ListEmailAllowlists"))
              .build();
        }
      }
    }
    return getListEmailAllowlistsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmailAllowlistServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailAllowlistServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailAllowlistServiceStub>() {
        @java.lang.Override
        public EmailAllowlistServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailAllowlistServiceStub(channel, callOptions);
        }
      };
    return EmailAllowlistServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static EmailAllowlistServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailAllowlistServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailAllowlistServiceBlockingV2Stub>() {
        @java.lang.Override
        public EmailAllowlistServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailAllowlistServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return EmailAllowlistServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmailAllowlistServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailAllowlistServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailAllowlistServiceBlockingStub>() {
        @java.lang.Override
        public EmailAllowlistServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailAllowlistServiceBlockingStub(channel, callOptions);
        }
      };
    return EmailAllowlistServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmailAllowlistServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailAllowlistServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailAllowlistServiceFutureStub>() {
        @java.lang.Override
        public EmailAllowlistServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailAllowlistServiceFutureStub(channel, callOptions);
        }
      };
    return EmailAllowlistServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The email allowlist service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     *  이메일 허용 목록 추가 API
     * </pre>
     */
    default void addEmailAllowlist(com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddEmailAllowlistMethod(), responseObserver);
    }

    /**
     * <pre>
     *  이메일 허용 목록 삭제 API
     * </pre>
     */
    default void removeEmailAllowlist(com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveEmailAllowlistMethod(), responseObserver);
    }

    /**
     * <pre>
     *  이메일 허용 목록 전체 조회 API
     * </pre>
     */
    default void listEmailAllowlists(com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEmailAllowlistsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmailAllowlistService.
   * <pre>
   * The email allowlist service definition.
   * </pre>
   */
  public static abstract class EmailAllowlistServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmailAllowlistServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmailAllowlistService.
   * <pre>
   * The email allowlist service definition.
   * </pre>
   */
  public static final class EmailAllowlistServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EmailAllowlistServiceStub> {
    private EmailAllowlistServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailAllowlistServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailAllowlistServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *  이메일 허용 목록 추가 API
     * </pre>
     */
    public void addEmailAllowlist(com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddEmailAllowlistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  이메일 허용 목록 삭제 API
     * </pre>
     */
    public void removeEmailAllowlist(com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveEmailAllowlistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  이메일 허용 목록 전체 조회 API
     * </pre>
     */
    public void listEmailAllowlists(com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEmailAllowlistsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmailAllowlistService.
   * <pre>
   * The email allowlist service definition.
   * </pre>
   */
  public static final class EmailAllowlistServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<EmailAllowlistServiceBlockingV2Stub> {
    private EmailAllowlistServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailAllowlistServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailAllowlistServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     *  이메일 허용 목록 추가 API
     * </pre>
     */
    public com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistResponse addEmailAllowlist(com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddEmailAllowlistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  이메일 허용 목록 삭제 API
     * </pre>
     */
    public com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistResponse removeEmailAllowlist(com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRemoveEmailAllowlistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  이메일 허용 목록 전체 조회 API
     * </pre>
     */
    public com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsResponse listEmailAllowlists(com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListEmailAllowlistsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service EmailAllowlistService.
   * <pre>
   * The email allowlist service definition.
   * </pre>
   */
  public static final class EmailAllowlistServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmailAllowlistServiceBlockingStub> {
    private EmailAllowlistServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailAllowlistServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailAllowlistServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  이메일 허용 목록 추가 API
     * </pre>
     */
    public com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistResponse addEmailAllowlist(com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddEmailAllowlistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  이메일 허용 목록 삭제 API
     * </pre>
     */
    public com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistResponse removeEmailAllowlist(com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveEmailAllowlistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  이메일 허용 목록 전체 조회 API
     * </pre>
     */
    public com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsResponse listEmailAllowlists(com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEmailAllowlistsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmailAllowlistService.
   * <pre>
   * The email allowlist service definition.
   * </pre>
   */
  public static final class EmailAllowlistServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmailAllowlistServiceFutureStub> {
    private EmailAllowlistServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailAllowlistServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailAllowlistServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  이메일 허용 목록 추가 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistResponse> addEmailAllowlist(
        com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddEmailAllowlistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  이메일 허용 목록 삭제 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistResponse> removeEmailAllowlist(
        com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveEmailAllowlistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  이메일 허용 목록 전체 조회 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsResponse> listEmailAllowlists(
        com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEmailAllowlistsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_EMAIL_ALLOWLIST = 0;
  private static final int METHODID_REMOVE_EMAIL_ALLOWLIST = 1;
  private static final int METHODID_LIST_EMAIL_ALLOWLISTS = 2;

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
        case METHODID_ADD_EMAIL_ALLOWLIST:
          serviceImpl.addEmailAllowlist((com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistResponse>) responseObserver);
          break;
        case METHODID_REMOVE_EMAIL_ALLOWLIST:
          serviceImpl.removeEmailAllowlist((com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistResponse>) responseObserver);
          break;
        case METHODID_LIST_EMAIL_ALLOWLISTS:
          serviceImpl.listEmailAllowlists((com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsResponse>) responseObserver);
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
          getAddEmailAllowlistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistRequest,
              com.bannote.userservice.emailallowlist.v1.AddEmailAllowlistResponse>(
                service, METHODID_ADD_EMAIL_ALLOWLIST)))
        .addMethod(
          getRemoveEmailAllowlistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistRequest,
              com.bannote.userservice.emailallowlist.v1.RemoveEmailAllowlistResponse>(
                service, METHODID_REMOVE_EMAIL_ALLOWLIST)))
        .addMethod(
          getListEmailAllowlistsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsRequest,
              com.bannote.userservice.emailallowlist.v1.ListEmailAllowlistsResponse>(
                service, METHODID_LIST_EMAIL_ALLOWLISTS)))
        .build();
  }

  private static abstract class EmailAllowlistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmailAllowlistServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bannote.userservice.emailallowlist.v1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmailAllowlistService");
    }
  }

  private static final class EmailAllowlistServiceFileDescriptorSupplier
      extends EmailAllowlistServiceBaseDescriptorSupplier {
    EmailAllowlistServiceFileDescriptorSupplier() {}
  }

  private static final class EmailAllowlistServiceMethodDescriptorSupplier
      extends EmailAllowlistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EmailAllowlistServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EmailAllowlistServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmailAllowlistServiceFileDescriptorSupplier())
              .addMethod(getAddEmailAllowlistMethod())
              .addMethod(getRemoveEmailAllowlistMethod())
              .addMethod(getListEmailAllowlistsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
