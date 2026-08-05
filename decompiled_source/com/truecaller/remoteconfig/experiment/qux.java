package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class qux extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.truecaller.remoteconfig.experiment.qux DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<com.truecaller.remoteconfig.experiment.qux> PARSER = null;
    public static final int RESOLVEID_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 5;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    public static final int TOKEN_FIELD_NUMBER = 2;
    private int status_;
    private long timestamp_;
    private java.lang.String resolveId_ = "";
    private java.lang.String token_ = "";
    private java.lang.String name_ = "";

    static {
        com.truecaller.remoteconfig.experiment.qux quxVar = new com.truecaller.remoteconfig.experiment.qux();
        DEFAULT_INSTANCE = quxVar;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.truecaller.remoteconfig.experiment.qux.class, quxVar);
    }

    public static void a(com.truecaller.remoteconfig.experiment.qux quxVar, java.lang.String str) {
        quxVar.getClass();
        str.getClass();
        quxVar.name_ = str;
    }

    public static void b(com.truecaller.remoteconfig.experiment.qux quxVar, java.lang.String str) {
        quxVar.getClass();
        str.getClass();
        quxVar.resolveId_ = str;
    }

    public static void c(com.truecaller.remoteconfig.experiment.qux quxVar, com.truecaller.remoteconfig.experiment.ExperimentActivationStatus experimentActivationStatus) {
        quxVar.getClass();
        quxVar.status_ = experimentActivationStatus.getNumber();
    }

    public static void d(com.truecaller.remoteconfig.experiment.qux quxVar, long j) {
        quxVar.timestamp_ = j;
    }

    public static void e(com.truecaller.remoteconfig.experiment.qux quxVar, java.lang.String str) {
        quxVar.getClass();
        str.getClass();
        quxVar.token_ = str;
    }

    public static com.truecaller.remoteconfig.experiment.baz k() {
        return (com.truecaller.remoteconfig.experiment.baz) DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Parser<com.truecaller.remoteconfig.experiment.qux> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (com.truecaller.remoteconfig.experiment.bar.a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.truecaller.remoteconfig.experiment.qux();
            case 2:
                return new com.google.protobuf.GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005\f", new java.lang.Object[]{"resolveId_", "token_", "name_", "timestamp_", "status_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.truecaller.remoteconfig.experiment.qux> parser = PARSER;
                if (parser == null) {
                    synchronized (com.truecaller.remoteconfig.experiment.qux.class) {
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

    public final java.lang.String g() {
        return this.resolveId_;
    }

    public final java.lang.String getName() {
        return this.name_;
    }

    public final com.truecaller.remoteconfig.experiment.ExperimentActivationStatus h() {
        com.truecaller.remoteconfig.experiment.ExperimentActivationStatus forNumber = com.truecaller.remoteconfig.experiment.ExperimentActivationStatus.forNumber(this.status_);
        if (forNumber == null) {
            return com.truecaller.remoteconfig.experiment.ExperimentActivationStatus.UNRECOGNIZED;
        }
        return forNumber;
    }

    public final long i() {
        return this.timestamp_;
    }

    public final java.lang.String j() {
        return this.token_;
    }
}
