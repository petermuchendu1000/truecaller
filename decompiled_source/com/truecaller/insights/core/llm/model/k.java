package com.truecaller.insights.core.llm.model;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class k implements yg3.z {
    public static final com.truecaller.insights.core.llm.model.k a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.insights.core.llm.model.k, yg3.z, java.lang.Object] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.Subtitle", (yg3.z) obj, 3);
        y0Var.j("color", false);
        y0Var.j("size", false);
        y0Var.j("value", false);
        descriptor = y0Var;
    }

    public final kotlinx.serialization.KSerializer[] childSerializers() {
        yg3.l1 l1Var = yg3.l1.a;
        return new kotlinx.serialization.KSerializer[]{l1Var, l1Var, l1Var};
    }

    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.bar b = decoder.b(serialDescriptor);
        int i = 0;
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t != -1) {
                if (t != 0) {
                    if (t != 1) {
                        if (t == 2) {
                            str3 = b.i(serialDescriptor, 2);
                            i |= 4;
                        } else {
                            throw new ah3.q(t);
                        }
                    } else {
                        str2 = b.i(serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = b.i(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        b.c(serialDescriptor);
        return new com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.Subtitle(i, str, str2, str3, null);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.Subtitle subtitle = (com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.Subtitle) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.Subtitle.write$Self$core_googlePlayRelease(subtitle, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
