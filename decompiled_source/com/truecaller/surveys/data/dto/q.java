package com.truecaller.surveys.data.dto;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class q implements yg3.z {
    public static final com.truecaller.surveys.data.dto.q a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [yg3.z, java.lang.Object, com.truecaller.surveys.data.dto.q] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("com.truecaller.surveys.data.dto.QuestionDto.Rating", (yg3.z) obj, 4);
        y0Var.j("id", false);
        y0Var.j("headerMessage", false);
        y0Var.j("message", false);
        y0Var.j("choices", false);
        descriptor = y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.truecaller.surveys.data.dto.QuestionDto.Rating.$childSerializers;
        yg3.l1 l1Var = yg3.l1.a;
        return new kotlinx.serialization.KSerializer[]{yg3.g0.a, l1Var, l1Var, lazyArr[3].getValue()};
    }

    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.bar b = decoder.b(serialDescriptor);
        lazyArr = com.truecaller.surveys.data.dto.QuestionDto.Rating.$childSerializers;
        int i = 0;
        int i2 = 0;
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.util.List list = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t != -1) {
                if (t != 0) {
                    if (t != 1) {
                        if (t != 2) {
                            if (t == 3) {
                                list = (java.util.List) b.E(serialDescriptor, 3, (kotlinx.serialization.KSerializer) lazyArr[3].getValue(), list);
                                i |= 8;
                            } else {
                                throw new ah3.q(t);
                            }
                        } else {
                            str2 = b.i(serialDescriptor, 2);
                            i |= 4;
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
        return new com.truecaller.surveys.data.dto.QuestionDto.Rating(i, i2, str, str2, list, null);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.surveys.data.dto.QuestionDto.Rating rating = (com.truecaller.surveys.data.dto.QuestionDto.Rating) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rating, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.surveys.data.dto.QuestionDto.Rating.write$Self$surveys_googlePlayRelease(rating, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
