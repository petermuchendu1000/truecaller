package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class h extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ACTIVATION_FIELD_NUMBER = 1;
    private static final com.truecaller.remoteconfig.experiment.h DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.truecaller.remoteconfig.experiment.h> PARSER;
    private com.google.protobuf.Internal.ProtobufList<com.truecaller.remoteconfig.experiment.qux> activation_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    static {
        com.truecaller.remoteconfig.experiment.h hVar = new com.truecaller.remoteconfig.experiment.h();
        DEFAULT_INSTANCE = hVar;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.truecaller.remoteconfig.experiment.h.class, hVar);
    }

    public static void a(com.truecaller.remoteconfig.experiment.h hVar, com.truecaller.remoteconfig.experiment.qux quxVar) {
        hVar.getClass();
        quxVar.getClass();
        com.google.protobuf.Internal.ProtobufList<com.truecaller.remoteconfig.experiment.qux> protobufList = hVar.activation_;
        if (!protobufList.isModifiable()) {
            hVar.activation_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        hVar.activation_.add(quxVar);
    }

    public static void b(com.truecaller.remoteconfig.experiment.h hVar, java.util.ArrayList arrayList) {
        com.google.protobuf.Internal.ProtobufList<com.truecaller.remoteconfig.experiment.qux> protobufList = hVar.activation_;
        if (!protobufList.isModifiable()) {
            hVar.activation_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        com.google.protobuf.AbstractMessageLite.addAll(arrayList, hVar.activation_);
    }

    public static void c(com.truecaller.remoteconfig.experiment.h hVar) {
        hVar.getClass();
        hVar.activation_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    public static com.truecaller.remoteconfig.experiment.h f() {
        return DEFAULT_INSTANCE;
    }

    public static com.truecaller.remoteconfig.experiment.h g(java.io.InputStream inputStream) {
        return (com.truecaller.remoteconfig.experiment.h) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Parser<com.truecaller.remoteconfig.experiment.h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (com.truecaller.remoteconfig.experiment.f.a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.truecaller.remoteconfig.experiment.h();
            case 2:
                return new com.google.protobuf.GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"activation_", com.truecaller.remoteconfig.experiment.qux.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.truecaller.remoteconfig.experiment.h> parser = PARSER;
                if (parser == null) {
                    synchronized (com.truecaller.remoteconfig.experiment.h.class) {
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

    public final com.google.protobuf.Internal.ProtobufList e() {
        return this.activation_;
    }
}
