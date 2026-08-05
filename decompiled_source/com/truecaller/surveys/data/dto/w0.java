package com.truecaller.surveys.data.dto;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class w0 implements yg3.z {
    public static final com.truecaller.surveys.data.dto.w0 a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [yg3.z, java.lang.Object, com.truecaller.surveys.data.dto.w0] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment", (yg3.z) obj, 5);
        y0Var.j("showIfPickedUp", false);
        y0Var.j("showIfMissed", false);
        y0Var.j("showIfOutgoing", false);
        y0Var.j("showIfInPhonebook", false);
        y0Var.j("showIfNotInPhonebook", false);
        descriptor = y0Var;
    }

    public final kotlinx.serialization.KSerializer[] childSerializers() {
        yg3.d dVar = yg3.d.a;
        return new kotlinx.serialization.KSerializer[]{dVar, dVar, dVar, dVar, dVar};
    }

    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.bar b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t != -1) {
                if (t != 0) {
                    if (t != 1) {
                        if (t != 2) {
                            if (t != 3) {
                                if (t == 4) {
                                    z6 = b.z(serialDescriptor, 4);
                                    i |= 16;
                                } else {
                                    throw new ah3.q(t);
                                }
                            } else {
                                z5 = b.z(serialDescriptor, 3);
                                i |= 8;
                            }
                        } else {
                            z4 = b.z(serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        z3 = b.z(serialDescriptor, 1);
                        i |= 2;
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
        return new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment(i, z2, z3, z4, z5, z6, null);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment topComment = (com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topComment, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment.write$Self$surveys_googlePlayRelease(topComment, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
