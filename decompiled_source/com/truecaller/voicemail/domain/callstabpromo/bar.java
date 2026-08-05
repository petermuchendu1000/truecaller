package com.truecaller.voicemail.domain.callstabpromo;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class bar implements yg3.z {
    public static final com.truecaller.voicemail.domain.callstabpromo.bar a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [yg3.z, java.lang.Object, com.truecaller.voicemail.domain.callstabpromo.bar] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO", (yg3.z) obj, 2);
        y0Var.j("title", false);
        y0Var.j("subtitle", false);
        descriptor = y0Var;
    }

    public final kotlinx.serialization.KSerializer[] childSerializers() {
        yg3.l1 l1Var = yg3.l1.a;
        return new kotlinx.serialization.KSerializer[]{l1Var, l1Var};
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
                    str = b.i(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        b.c(serialDescriptor);
        return new com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO(i, str, str2, g1Var);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO callsTabVoicemailPromoRemoteConfigDTO = (com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callsTabVoicemailPromoRemoteConfigDTO, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO.write$Self$domain_googlePlayRelease(callsTabVoicemailPromoRemoteConfigDTO, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
