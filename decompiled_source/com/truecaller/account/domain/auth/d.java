package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class d extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CONFIG_FIELD_NUMBER = 1;
    private static final com.truecaller.account.domain.auth.d DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.truecaller.account.domain.auth.d> PARSER = null;
    public static final int TOKENS_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.truecaller.account.domain.auth.qux config_;
    private com.google.protobuf.MapFieldLite<java.lang.String, com.truecaller.account.domain.auth.x> tokens_ = com.google.protobuf.MapFieldLite.emptyMapField();

    static {
        com.truecaller.account.domain.auth.d dVar = new com.truecaller.account.domain.auth.d();
        DEFAULT_INSTANCE = dVar;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.truecaller.account.domain.auth.d.class, dVar);
    }

    public static com.google.protobuf.MapFieldLite a(com.truecaller.account.domain.auth.d dVar) {
        if (!dVar.tokens_.isMutable()) {
            dVar.tokens_ = dVar.tokens_.mutableCopy();
        }
        return dVar.tokens_;
    }

    public static void b(com.truecaller.account.domain.auth.d dVar, com.truecaller.account.domain.auth.qux quxVar) {
        dVar.getClass();
        quxVar.getClass();
        dVar.config_ = quxVar;
        dVar.bitField0_ |= 1;
    }

    public static com.truecaller.account.domain.auth.d e() {
        return DEFAULT_INSTANCE;
    }

    public static com.truecaller.account.domain.auth.b g() {
        return (com.truecaller.account.domain.auth.b) DEFAULT_INSTANCE.createBuilder();
    }

    public static com.truecaller.account.domain.auth.d h(java.io.InputStream inputStream) {
        return (com.truecaller.account.domain.auth.d) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Parser<com.truecaller.account.domain.auth.d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final com.truecaller.account.domain.auth.qux d() {
        com.truecaller.account.domain.auth.qux quxVar = this.config_;
        if (quxVar == null) {
            return com.truecaller.account.domain.auth.qux.g();
        }
        return quxVar;
    }

    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (com.truecaller.account.domain.auth.a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.truecaller.account.domain.auth.d();
            case 2:
                return new com.google.protobuf.GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new java.lang.Object[]{"bitField0_", "config_", "tokens_", com.truecaller.account.domain.auth.c.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.truecaller.account.domain.auth.d> parser = PARSER;
                if (parser == null) {
                    synchronized (com.truecaller.account.domain.auth.d.class) {
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

    public final java.util.Map f() {
        return java.util.Collections.unmodifiableMap(this.tokens_);
    }
}
