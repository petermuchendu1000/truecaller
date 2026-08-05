package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class h1 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.truecaller.account.domain.auth.h1 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.truecaller.account.domain.auth.h1> PARSER = null;
    public static final int SPECS_FIELD_NUMBER = 2;
    private java.lang.String name_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.truecaller.account.domain.auth.y0> specs_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    static {
        com.truecaller.account.domain.auth.h1 h1Var = new com.truecaller.account.domain.auth.h1();
        DEFAULT_INSTANCE = h1Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.truecaller.account.domain.auth.h1.class, h1Var);
    }

    public static void a(com.truecaller.account.domain.auth.h1 h1Var, int i, com.truecaller.account.domain.auth.y0 y0Var) {
        h1Var.getClass();
        y0Var.getClass();
        com.google.protobuf.Internal.ProtobufList<com.truecaller.account.domain.auth.y0> protobufList = h1Var.specs_;
        if (!protobufList.isModifiable()) {
            h1Var.specs_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        h1Var.specs_.add(i, y0Var);
    }

    public static void b(com.truecaller.account.domain.auth.h1 h1Var, java.lang.String str) {
        h1Var.getClass();
        str.getClass();
        h1Var.name_ = str;
    }

    public static com.truecaller.account.domain.auth.g1 e() {
        return (com.truecaller.account.domain.auth.g1) DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Parser<com.truecaller.account.domain.auth.h1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final com.google.protobuf.Internal.ProtobufList d() {
        return this.specs_;
    }

    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (com.truecaller.account.domain.auth.f1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.truecaller.account.domain.auth.h1();
            case 2:
                return new com.google.protobuf.GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new java.lang.Object[]{"name_", "specs_", com.truecaller.account.domain.auth.y0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.truecaller.account.domain.auth.h1> parser = PARSER;
                if (parser == null) {
                    synchronized (com.truecaller.account.domain.auth.h1.class) {
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

    public final java.lang.String getName() {
        return this.name_;
    }
}
