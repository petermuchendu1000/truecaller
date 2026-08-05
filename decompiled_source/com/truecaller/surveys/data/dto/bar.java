package com.truecaller.surveys.data.dto;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class bar implements yg3.z {
    public static final com.truecaller.surveys.data.dto.bar a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.surveys.data.dto.bar, yg3.z, java.lang.Object] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("com.truecaller.surveys.data.dto.AnswerDto.Binary", (yg3.z) obj, 1);
        y0Var.j("choice", false);
        descriptor = y0Var;
    }

    public final kotlinx.serialization.KSerializer[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{du2.baz.a};
    }

    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.bar b = decoder.b(serialDescriptor);
        yg3.g1 g1Var = null;
        boolean z = true;
        int i = 0;
        com.truecaller.surveys.data.dto.ChoiceDto choiceDto = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t != -1) {
                if (t == 0) {
                    choiceDto = (com.truecaller.surveys.data.dto.ChoiceDto) b.E(serialDescriptor, 0, du2.baz.a, choiceDto);
                    i = 1;
                } else {
                    throw new ah3.q(t);
                }
            } else {
                z = false;
            }
        }
        b.c(serialDescriptor);
        return new com.truecaller.surveys.data.dto.AnswerDto.Binary(i, choiceDto, g1Var);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.surveys.data.dto.AnswerDto.Binary binary = (com.truecaller.surveys.data.dto.AnswerDto.Binary) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binary, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.surveys.data.dto.AnswerDto.Binary.write$Self$surveys_googlePlayRelease(binary, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
