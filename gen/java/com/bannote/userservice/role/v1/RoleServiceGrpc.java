package com.bannote.userservice.role.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The role service definition.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class RoleServiceGrpc {

  private RoleServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bannote.userservice.role.v1.RoleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.role.v1.AssignRoleToUserRequest,
      com.bannote.userservice.role.v1.AssignRoleToUserResponse> getAssignRoleToUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignRoleToUser",
      requestType = com.bannote.userservice.role.v1.AssignRoleToUserRequest.class,
      responseType = com.bannote.userservice.role.v1.AssignRoleToUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.role.v1.AssignRoleToUserRequest,
      com.bannote.userservice.role.v1.AssignRoleToUserResponse> getAssignRoleToUserMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.role.v1.AssignRoleToUserRequest, com.bannote.userservice.role.v1.AssignRoleToUserResponse> getAssignRoleToUserMethod;
    if ((getAssignRoleToUserMethod = RoleServiceGrpc.getAssignRoleToUserMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getAssignRoleToUserMethod = RoleServiceGrpc.getAssignRoleToUserMethod) == null) {
          RoleServiceGrpc.getAssignRoleToUserMethod = getAssignRoleToUserMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.role.v1.AssignRoleToUserRequest, com.bannote.userservice.role.v1.AssignRoleToUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignRoleToUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.role.v1.AssignRoleToUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.role.v1.AssignRoleToUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("AssignRoleToUser"))
              .build();
        }
      }
    }
    return getAssignRoleToUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.role.v1.RemoveRoleFromUserRequest,
      com.bannote.userservice.role.v1.RemoveRoleFromUserResponse> getRemoveRoleFromUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveRoleFromUser",
      requestType = com.bannote.userservice.role.v1.RemoveRoleFromUserRequest.class,
      responseType = com.bannote.userservice.role.v1.RemoveRoleFromUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.role.v1.RemoveRoleFromUserRequest,
      com.bannote.userservice.role.v1.RemoveRoleFromUserResponse> getRemoveRoleFromUserMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.role.v1.RemoveRoleFromUserRequest, com.bannote.userservice.role.v1.RemoveRoleFromUserResponse> getRemoveRoleFromUserMethod;
    if ((getRemoveRoleFromUserMethod = RoleServiceGrpc.getRemoveRoleFromUserMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getRemoveRoleFromUserMethod = RoleServiceGrpc.getRemoveRoleFromUserMethod) == null) {
          RoleServiceGrpc.getRemoveRoleFromUserMethod = getRemoveRoleFromUserMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.role.v1.RemoveRoleFromUserRequest, com.bannote.userservice.role.v1.RemoveRoleFromUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveRoleFromUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.role.v1.RemoveRoleFromUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.role.v1.RemoveRoleFromUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("RemoveRoleFromUser"))
              .build();
        }
      }
    }
    return getRemoveRoleFromUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.role.v1.ListUserRolesRequest,
      com.bannote.userservice.role.v1.ListUserRolesResponse> getListUserRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserRoles",
      requestType = com.bannote.userservice.role.v1.ListUserRolesRequest.class,
      responseType = com.bannote.userservice.role.v1.ListUserRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.role.v1.ListUserRolesRequest,
      com.bannote.userservice.role.v1.ListUserRolesResponse> getListUserRolesMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.role.v1.ListUserRolesRequest, com.bannote.userservice.role.v1.ListUserRolesResponse> getListUserRolesMethod;
    if ((getListUserRolesMethod = RoleServiceGrpc.getListUserRolesMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getListUserRolesMethod = RoleServiceGrpc.getListUserRolesMethod) == null) {
          RoleServiceGrpc.getListUserRolesMethod = getListUserRolesMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.role.v1.ListUserRolesRequest, com.bannote.userservice.role.v1.ListUserRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.role.v1.ListUserRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.role.v1.ListUserRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("ListUserRoles"))
              .build();
        }
      }
    }
    return getListUserRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.role.v1.CheckUserHasAuthorityRequest,
      com.bannote.userservice.role.v1.CheckUserHasAuthorityResponse> getCheckUserHasAuthorityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckUserHasAuthority",
      requestType = com.bannote.userservice.role.v1.CheckUserHasAuthorityRequest.class,
      responseType = com.bannote.userservice.role.v1.CheckUserHasAuthorityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.role.v1.CheckUserHasAuthorityRequest,
      com.bannote.userservice.role.v1.CheckUserHasAuthorityResponse> getCheckUserHasAuthorityMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.role.v1.CheckUserHasAuthorityRequest, com.bannote.userservice.role.v1.CheckUserHasAuthorityResponse> getCheckUserHasAuthorityMethod;
    if ((getCheckUserHasAuthorityMethod = RoleServiceGrpc.getCheckUserHasAuthorityMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getCheckUserHasAuthorityMethod = RoleServiceGrpc.getCheckUserHasAuthorityMethod) == null) {
          RoleServiceGrpc.getCheckUserHasAuthorityMethod = getCheckUserHasAuthorityMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.role.v1.CheckUserHasAuthorityRequest, com.bannote.userservice.role.v1.CheckUserHasAuthorityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckUserHasAuthority"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.role.v1.CheckUserHasAuthorityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.role.v1.CheckUserHasAuthorityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("CheckUserHasAuthority"))
              .build();
        }
      }
    }
    return getCheckUserHasAuthorityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleServiceStub>() {
        @java.lang.Override
        public RoleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleServiceStub(channel, callOptions);
        }
      };
    return RoleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static RoleServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleServiceBlockingV2Stub>() {
        @java.lang.Override
        public RoleServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return RoleServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleServiceBlockingStub>() {
        @java.lang.Override
        public RoleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleServiceBlockingStub(channel, callOptions);
        }
      };
    return RoleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleServiceFutureStub>() {
        @java.lang.Override
        public RoleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleServiceFutureStub(channel, callOptions);
        }
      };
    return RoleServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The role service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     *  유저에게 권한 부여 API
     * </pre>
     */
    default void assignRoleToUser(com.bannote.userservice.role.v1.AssignRoleToUserRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.role.v1.AssignRoleToUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignRoleToUserMethod(), responseObserver);
    }

    /**
     * <pre>
     *  유저에게서 권한 제거 API
     * </pre>
     */
    default void removeRoleFromUser(com.bannote.userservice.role.v1.RemoveRoleFromUserRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.role.v1.RemoveRoleFromUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveRoleFromUserMethod(), responseObserver);
    }

    /**
     * <pre>
     *  유저의 권한 목록 조회 API
     * </pre>
     */
    default void listUserRoles(com.bannote.userservice.role.v1.ListUserRolesRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.role.v1.ListUserRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     *  유저가 특정 권한 레벨을 충족하는지 확인 API (내부용)
     * </pre>
     */
    default void checkUserHasAuthority(com.bannote.userservice.role.v1.CheckUserHasAuthorityRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.role.v1.CheckUserHasAuthorityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckUserHasAuthorityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RoleService.
   * <pre>
   * The role service definition.
   * </pre>
   */
  public static abstract class RoleServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RoleServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RoleService.
   * <pre>
   * The role service definition.
   * </pre>
   */
  public static final class RoleServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RoleServiceStub> {
    private RoleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *  유저에게 권한 부여 API
     * </pre>
     */
    public void assignRoleToUser(com.bannote.userservice.role.v1.AssignRoleToUserRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.role.v1.AssignRoleToUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignRoleToUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  유저에게서 권한 제거 API
     * </pre>
     */
    public void removeRoleFromUser(com.bannote.userservice.role.v1.RemoveRoleFromUserRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.role.v1.RemoveRoleFromUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveRoleFromUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  유저의 권한 목록 조회 API
     * </pre>
     */
    public void listUserRoles(com.bannote.userservice.role.v1.ListUserRolesRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.role.v1.ListUserRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  유저가 특정 권한 레벨을 충족하는지 확인 API (내부용)
     * </pre>
     */
    public void checkUserHasAuthority(com.bannote.userservice.role.v1.CheckUserHasAuthorityRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.role.v1.CheckUserHasAuthorityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckUserHasAuthorityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RoleService.
   * <pre>
   * The role service definition.
   * </pre>
   */
  public static final class RoleServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<RoleServiceBlockingV2Stub> {
    private RoleServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     *  유저에게 권한 부여 API
     * </pre>
     */
    public com.bannote.userservice.role.v1.AssignRoleToUserResponse assignRoleToUser(com.bannote.userservice.role.v1.AssignRoleToUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAssignRoleToUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  유저에게서 권한 제거 API
     * </pre>
     */
    public com.bannote.userservice.role.v1.RemoveRoleFromUserResponse removeRoleFromUser(com.bannote.userservice.role.v1.RemoveRoleFromUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRemoveRoleFromUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  유저의 권한 목록 조회 API
     * </pre>
     */
    public com.bannote.userservice.role.v1.ListUserRolesResponse listUserRoles(com.bannote.userservice.role.v1.ListUserRolesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListUserRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  유저가 특정 권한 레벨을 충족하는지 확인 API (내부용)
     * </pre>
     */
    public com.bannote.userservice.role.v1.CheckUserHasAuthorityResponse checkUserHasAuthority(com.bannote.userservice.role.v1.CheckUserHasAuthorityRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCheckUserHasAuthorityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service RoleService.
   * <pre>
   * The role service definition.
   * </pre>
   */
  public static final class RoleServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RoleServiceBlockingStub> {
    private RoleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  유저에게 권한 부여 API
     * </pre>
     */
    public com.bannote.userservice.role.v1.AssignRoleToUserResponse assignRoleToUser(com.bannote.userservice.role.v1.AssignRoleToUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignRoleToUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  유저에게서 권한 제거 API
     * </pre>
     */
    public com.bannote.userservice.role.v1.RemoveRoleFromUserResponse removeRoleFromUser(com.bannote.userservice.role.v1.RemoveRoleFromUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveRoleFromUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  유저의 권한 목록 조회 API
     * </pre>
     */
    public com.bannote.userservice.role.v1.ListUserRolesResponse listUserRoles(com.bannote.userservice.role.v1.ListUserRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  유저가 특정 권한 레벨을 충족하는지 확인 API (내부용)
     * </pre>
     */
    public com.bannote.userservice.role.v1.CheckUserHasAuthorityResponse checkUserHasAuthority(com.bannote.userservice.role.v1.CheckUserHasAuthorityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckUserHasAuthorityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RoleService.
   * <pre>
   * The role service definition.
   * </pre>
   */
  public static final class RoleServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RoleServiceFutureStub> {
    private RoleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  유저에게 권한 부여 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.role.v1.AssignRoleToUserResponse> assignRoleToUser(
        com.bannote.userservice.role.v1.AssignRoleToUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignRoleToUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  유저에게서 권한 제거 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.role.v1.RemoveRoleFromUserResponse> removeRoleFromUser(
        com.bannote.userservice.role.v1.RemoveRoleFromUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveRoleFromUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  유저의 권한 목록 조회 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.role.v1.ListUserRolesResponse> listUserRoles(
        com.bannote.userservice.role.v1.ListUserRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  유저가 특정 권한 레벨을 충족하는지 확인 API (내부용)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.role.v1.CheckUserHasAuthorityResponse> checkUserHasAuthority(
        com.bannote.userservice.role.v1.CheckUserHasAuthorityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckUserHasAuthorityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ASSIGN_ROLE_TO_USER = 0;
  private static final int METHODID_REMOVE_ROLE_FROM_USER = 1;
  private static final int METHODID_LIST_USER_ROLES = 2;
  private static final int METHODID_CHECK_USER_HAS_AUTHORITY = 3;

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
        case METHODID_ASSIGN_ROLE_TO_USER:
          serviceImpl.assignRoleToUser((com.bannote.userservice.role.v1.AssignRoleToUserRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.role.v1.AssignRoleToUserResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ROLE_FROM_USER:
          serviceImpl.removeRoleFromUser((com.bannote.userservice.role.v1.RemoveRoleFromUserRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.role.v1.RemoveRoleFromUserResponse>) responseObserver);
          break;
        case METHODID_LIST_USER_ROLES:
          serviceImpl.listUserRoles((com.bannote.userservice.role.v1.ListUserRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.role.v1.ListUserRolesResponse>) responseObserver);
          break;
        case METHODID_CHECK_USER_HAS_AUTHORITY:
          serviceImpl.checkUserHasAuthority((com.bannote.userservice.role.v1.CheckUserHasAuthorityRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.role.v1.CheckUserHasAuthorityResponse>) responseObserver);
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
          getAssignRoleToUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.role.v1.AssignRoleToUserRequest,
              com.bannote.userservice.role.v1.AssignRoleToUserResponse>(
                service, METHODID_ASSIGN_ROLE_TO_USER)))
        .addMethod(
          getRemoveRoleFromUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.role.v1.RemoveRoleFromUserRequest,
              com.bannote.userservice.role.v1.RemoveRoleFromUserResponse>(
                service, METHODID_REMOVE_ROLE_FROM_USER)))
        .addMethod(
          getListUserRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.role.v1.ListUserRolesRequest,
              com.bannote.userservice.role.v1.ListUserRolesResponse>(
                service, METHODID_LIST_USER_ROLES)))
        .addMethod(
          getCheckUserHasAuthorityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.role.v1.CheckUserHasAuthorityRequest,
              com.bannote.userservice.role.v1.CheckUserHasAuthorityResponse>(
                service, METHODID_CHECK_USER_HAS_AUTHORITY)))
        .build();
  }

  private static abstract class RoleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bannote.userservice.role.v1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoleService");
    }
  }

  private static final class RoleServiceFileDescriptorSupplier
      extends RoleServiceBaseDescriptorSupplier {
    RoleServiceFileDescriptorSupplier() {}
  }

  private static final class RoleServiceMethodDescriptorSupplier
      extends RoleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RoleServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RoleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoleServiceFileDescriptorSupplier())
              .addMethod(getAssignRoleToUserMethod())
              .addMethod(getRemoveRoleFromUserMethod())
              .addMethod(getListUserRolesMethod())
              .addMethod(getCheckUserHasAuthorityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
