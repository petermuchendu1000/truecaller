package com.truecaller.surveys.data.dto;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class j1 implements yg3.z {
    public static final com.truecaller.surveys.data.dto.j1 a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.surveys.data.dto.j1, yg3.z, java.lang.Object] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile", (yg3.z) obj, 2);
        y0Var.j("showIfInPhonebook", false);
        y0Var.j("showIfNotInPhonebook", false);
        descriptor = y0Var;
    }

    public final kotlinx.serialization.KSerializer[] childSerializers() {
        yg3.d dVar = yg3.d.a;
        return new kotlinx.serialization.KSerializer[]{dVar, dVar};
    }

    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.bar b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t != -1) {
                if (t != 0) {
                    if (t == 1) {
                        z3 = b.z(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        throw new ah3.q(t);
                    }
                } else {
                    z2 = b.z(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        b.c(serialDescriptor);
        return new com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile(i, z2, z3, null);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile reportProfile = (com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportProfile, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile.write$Self$surveys_googlePlayRelease(reportProfile, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
