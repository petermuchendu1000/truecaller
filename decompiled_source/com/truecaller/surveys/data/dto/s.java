package com.truecaller.surveys.data.dto;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class s implements yg3.z {
    public static final com.truecaller.surveys.data.dto.s a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.surveys.data.dto.s, yg3.z, java.lang.Object] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview", (yg3.z) obj, 6);
        y0Var.j("id", false);
        y0Var.j("headerMessage", false);
        y0Var.j("message", false);
        y0Var.j("actionLabel", false);
        y0Var.j("hint", false);
        y0Var.j("followupQuestionId", false);
        descriptor = y0Var;
    }

    public final kotlinx.serialization.KSerializer[] childSerializers() {
        kotlinx.serialization.KSerializer kSerializer = yg3.g0.a;
        kotlinx.serialization.KSerializer a0 = he0.u0.a0(kSerializer);
        yg3.l1 l1Var = yg3.l1.a;
        return new kotlinx.serialization.KSerializer[]{kSerializer, l1Var, l1Var, l1Var, l1Var, a0};
    }

    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.bar b = decoder.b(serialDescriptor);
        int i = 0;
        int i2 = 0;
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        java.lang.String str4 = null;
        java.lang.Integer num = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = b.f(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = b.i(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.i(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.i(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = b.i(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    num = (java.lang.Integer) b.C(serialDescriptor, 5, yg3.g0.a, num);
                    i |= 32;
                    break;
                default:
                    throw new ah3.q(t);
            }
        }
        b.c(serialDescriptor);
        return new com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview(i, i2, str, str2, str3, str4, num, null);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview ratingAndReview = (com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ratingAndReview, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview.write$Self$surveys_googlePlayRelease(ratingAndReview, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
