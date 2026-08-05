package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class y0 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.truecaller.account.domain.auth.y0 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.truecaller.account.domain.auth.y0> PARSER = null;
    public static final int PATH_FIELD_NUMBER = 2;
    private java.lang.String id_ = "";
    private java.lang.String path_ = "";

    static {
        com.truecaller.account.domain.auth.y0 y0Var = new com.truecaller.account.domain.auth.y0();
        DEFAULT_INSTANCE = y0Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.truecaller.account.domain.auth.y0.class, y0Var);
    }

    public static void a(com.truecaller.account.domain.auth.y0 y0Var, java.lang.String str) {
        y0Var.getClass();
        str.getClass();
        y0Var.id_ = str;
    }

    public static void b(com.truecaller.account.domain.auth.y0 y0Var, java.lang.String str) {
        y0Var.getClass();
        str.getClass();
        y0Var.path_ = str;
    }

    public static com.truecaller.account.domain.auth.x0 f() {
        return (com.truecaller.account.domain.auth.x0) DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Parser<com.truecaller.account.domain.auth.y0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final java.lang.String d() {
        return this.id_;
    }

    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (com.truecaller.account.domain.auth.w0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.truecaller.account.domain.auth.y0();
            case 2:
                return new com.google.protobuf.GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"id_", "path_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.truecaller.account.domain.auth.y0> parser = PARSER;
                if (parser == null) {
                    synchronized (com.truecaller.account.domain.auth.y0.class) {
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

    public final java.lang.String e() {
        return this.path_;
    }
}
