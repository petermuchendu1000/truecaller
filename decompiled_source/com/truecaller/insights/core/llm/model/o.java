package com.truecaller.insights.core.llm.model;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class o implements yg3.z {
    public static final com.truecaller.insights.core.llm.model.o a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.insights.core.llm.model.o, yg3.z, java.lang.Object] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("status", (yg3.z) obj, 2);
        y0Var.j("color", true);
        y0Var.j("value", false);
        descriptor = y0Var;
    }

    public final kotlinx.serialization.KSerializer[] childSerializers() {
        kotlinx.serialization.KSerializer kSerializer = yg3.l1.a;
        return new kotlinx.serialization.KSerializer[]{he0.u0.a0(kSerializer), kSerializer};
    }

    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.bar b = decoder.b(serialDescriptor);
        yg3.g1 g1Var = null;
        boolean z = true;
        int i = 0;
        java.lang.String str = null;
        java.lang.String str2 = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t != -1) {
                if (t != 0) {
                    if (t == 1) {
                        str2 = b.i(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        throw new ah3.q(t);
                    }
                } else {
                    str = (java.lang.String) b.C(serialDescriptor, 0, yg3.l1.a, str);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        b.c(serialDescriptor);
        return new com.truecaller.insights.core.llm.model.UseCaseField.UseCaseStatus(i, str, str2, g1Var);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.insights.core.llm.model.UseCaseField.UseCaseStatus useCaseStatus = (com.truecaller.insights.core.llm.model.UseCaseField.UseCaseStatus) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseStatus, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.insights.core.llm.model.UseCaseField.UseCaseStatus.write$Self$core_googlePlayRelease(useCaseStatus, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
