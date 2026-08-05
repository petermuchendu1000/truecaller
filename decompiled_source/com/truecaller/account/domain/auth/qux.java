package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CREATEDAT_FIELD_NUMBER = 4;
    private static final com.truecaller.account.domain.auth.qux DEFAULT_INSTANCE;
    public static final int ENDPOINT_FIELD_NUMBER = 2;
    public static final int EXPIRESAT_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<com.truecaller.account.domain.auth.qux> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private long createdAt_;
    private com.google.protobuf.Internal.ProtobufList<com.truecaller.account.domain.auth.h1> endpoint_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private long expiresAt_;
    private int version_;

    static {
        com.truecaller.account.domain.auth.qux quxVar = new com.truecaller.account.domain.auth.qux();
        DEFAULT_INSTANCE = quxVar;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.truecaller.account.domain.auth.qux.class, quxVar);
    }

    public static void a(com.truecaller.account.domain.auth.qux quxVar, java.util.ArrayList arrayList) {
        com.google.protobuf.Internal.ProtobufList<com.truecaller.account.domain.auth.h1> protobufList = quxVar.endpoint_;
        if (!protobufList.isModifiable()) {
            quxVar.endpoint_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        com.google.protobuf.AbstractMessageLite.addAll(arrayList, quxVar.endpoint_);
    }

    public static void b(com.truecaller.account.domain.auth.qux quxVar, long j) {
        quxVar.createdAt_ = j;
    }

    public static void c(com.truecaller.account.domain.auth.qux quxVar, long j) {
        quxVar.expiresAt_ = j;
    }

    public static void d(com.truecaller.account.domain.auth.qux quxVar) {
        quxVar.version_ = 1;
    }

    public static com.truecaller.account.domain.auth.qux g() {
        return DEFAULT_INSTANCE;
    }

    public static com.truecaller.account.domain.auth.baz j() {
        return (com.truecaller.account.domain.auth.baz) DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Parser<com.truecaller.account.domain.auth.qux> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (com.truecaller.account.domain.auth.bar.a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.truecaller.account.domain.auth.qux();
            case 2:
                return new com.google.protobuf.GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003\u0002\u0004\u0002", new java.lang.Object[]{"version_", "endpoint_", com.truecaller.account.domain.auth.h1.class, "expiresAt_", "createdAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.truecaller.account.domain.auth.qux> parser = PARSER;
                if (parser == null) {
                    synchronized (com.truecaller.account.domain.auth.qux.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public final long f() {
        return this.createdAt_;
    }

    public final com.google.protobuf.Internal.ProtobufList h() {
        return this.endpoint_;
    }

    public final long i() {
        return this.expiresAt_;
    }
}
