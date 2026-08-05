package com.truecaller.surveys.data.dto;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class w implements yg3.z {
    public static final com.truecaller.surveys.data.dto.w a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.surveys.data.dto.w, yg3.z, java.lang.Object] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("com.truecaller.surveys.data.dto.QuestionDto.SpamCategories", (yg3.z) obj, 3);
        y0Var.j("id", false);
        y0Var.j("headerMessage", false);
        y0Var.j("message", false);
        descriptor = y0Var;
    }

    public final kotlinx.serialization.KSerializer[] childSerializers() {
        yg3.l1 l1Var = yg3.l1.a;
        return new kotlinx.serialization.KSerializer[]{yg3.g0.a, l1Var, l1Var};
    }

    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.bar b = decoder.b(serialDescriptor);
        int i = 0;
        int i2 = 0;
        java.lang.String str = null;
        java.lang.String str2 = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t != -1) {
                if (t != 0) {
                    if (t != 1) {
                        if (t == 2) {
                            str2 = b.i(serialDescriptor, 2);
                            i |= 4;
                        } else {
                            throw new ah3.q(t);
                        }
                    } else {
                        str = b.i(serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    i2 = b.f(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        b.c(serialDescriptor);
        return new com.truecaller.surveys.data.dto.QuestionDto.SpamCategories(i, i2, str, str2, null);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.surveys.data.dto.QuestionDto.SpamCategories spamCategories = (com.truecaller.surveys.data.dto.QuestionDto.SpamCategories) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spamCategories, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.surveys.data.dto.QuestionDto.SpamCategories.write$Self$surveys_googlePlayRelease(spamCategories, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
