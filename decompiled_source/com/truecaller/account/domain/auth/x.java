package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class x extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CREATEDAT_FIELD_NUMBER = 5;
    private static final com.truecaller.account.domain.auth.x DEFAULT_INSTANCE;
    public static final int EXPIRESAT_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.truecaller.account.domain.auth.x> PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 2;
    private long createdAt_;
    private long expiresAt_;
    private java.lang.String id_ = "";
    private java.lang.String token_ = "";

    static {
        com.truecaller.account.domain.auth.x xVar = new com.truecaller.account.domain.auth.x();
        DEFAULT_INSTANCE = xVar;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.truecaller.account.domain.auth.x.class, xVar);
    }

    public static void a(com.truecaller.account.domain.auth.x xVar, long j) {
        xVar.createdAt_ = j;
    }

    public static void b(com.truecaller.account.domain.auth.x xVar, long j) {
        xVar.expiresAt_ = j;
    }

    public static void c(com.truecaller.account.domain.auth.x xVar, java.lang.String str) {
        xVar.getClass();
        str.getClass();
        xVar.id_ = str;
    }

    public static void d(com.truecaller.account.domain.auth.x xVar, java.lang.String str) {
        xVar.getClass();
        str.getClass();
        xVar.token_ = str;
    }

    public static com.truecaller.account.domain.auth.x g() {
        return DEFAULT_INSTANCE;
    }

    public static com.truecaller.account.domain.auth.w j() {
        return (com.truecaller.account.domain.auth.w) DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Parser<com.truecaller.account.domain.auth.x> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (com.truecaller.account.domain.auth.v.a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.truecaller.account.domain.auth.x();
            case 2:
                return new com.google.protobuf.GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004\u0002\u0005\u0002", new java.lang.Object[]{"id_", "token_", "expiresAt_", "createdAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.truecaller.account.domain.auth.x> parser = PARSER;
                if (parser == null) {
                    synchronized (com.truecaller.account.domain.auth.x.class) {
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

    public final long h() {
        return this.expiresAt_;
    }

    public final java.lang.String i() {
        return this.token_;
    }
}
