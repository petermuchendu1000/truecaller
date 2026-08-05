package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class i implements t7.j0 {
    public static final com.truecaller.remoteconfig.experiment.i a = new java.lang.Object();
    public static final com.truecaller.remoteconfig.experiment.h b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.remoteconfig.experiment.i, java.lang.Object] */
    static {
        com.truecaller.remoteconfig.experiment.h f = com.truecaller.remoteconfig.experiment.h.f();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "getDefaultInstance(...)");
        b = f;
    }

    public final java.lang.Object getDefaultValue() {
        return b;
    }

    public final java.lang.Object readFrom(java.io.InputStream inputStream, df3.bar barVar) {
        try {
            com.truecaller.remoteconfig.experiment.h g = com.truecaller.remoteconfig.experiment.h.g(inputStream);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(g, "parseFrom(...)");
            return g;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Cannot read proto.", "message");
            throw new java.io.IOException("Cannot read proto.", e);
        }
    }

    public final java.lang.Object writeTo(java.lang.Object obj, java.io.OutputStream outputStream, df3.bar barVar) {
        ((com.truecaller.remoteconfig.experiment.h) obj).writeTo(outputStream);
        return kotlin.Unit.a;
    }
}
