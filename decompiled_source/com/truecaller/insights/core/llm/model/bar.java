package com.truecaller.insights.core.llm.model;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class bar implements yg3.z {
    public static final com.truecaller.insights.core.llm.model.bar a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [yg3.z, java.lang.Object, com.truecaller.insights.core.llm.model.bar] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern", (yg3.z) obj, 9);
        y0Var.j("category", true);
        y0Var.j("pattern", true);
        y0Var.j("pattern_type", true);
        y0Var.j("pattern_id", true);
        y0Var.j("pattern_status", false);
        y0Var.j("sub_category", true);
        y0Var.j("summary", true);
        y0Var.j("use_case", true);
        y0Var.j("actions", true);
        descriptor = y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.$childSerializers;
        yg3.l1 l1Var = yg3.l1.a;
        return new kotlinx.serialization.KSerializer[]{l1Var, l1Var, l1Var, l1Var, l1Var, he0.u0.a0(l1Var), he0.u0.a0(l1Var), he0.u0.a0(com.truecaller.insights.core.llm.model.g.a), lazyArr[8].getValue()};
    }

    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.bar b = decoder.b(serialDescriptor);
        lazyArr = com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.$childSerializers;
        java.util.List list = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        java.lang.String str4 = null;
        java.lang.String str5 = null;
        java.lang.String str6 = null;
        java.lang.String str7 = null;
        com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase useCase = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.i(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.i(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.i(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.i(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = b.i(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = (java.lang.String) b.C(serialDescriptor, 5, yg3.l1.a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (java.lang.String) b.C(serialDescriptor, 6, yg3.l1.a, str7);
                    i |= 64;
                    break;
                case 7:
                    useCase = (com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase) b.C(serialDescriptor, 7, com.truecaller.insights.core.llm.model.g.a, useCase);
                    i |= 128;
                    break;
                case 8:
                    list = (java.util.List) b.E(serialDescriptor, 8, (kotlinx.serialization.KSerializer) lazyArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    throw new ah3.q(t);
            }
        }
        b.c(serialDescriptor);
        return new com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern(i, str, str2, str3, str4, str5, str6, str7, useCase, list, (yg3.g1) null);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern pattern = (com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.write$Self$core_googlePlayRelease(pattern, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
