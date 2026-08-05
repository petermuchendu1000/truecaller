package com.truecaller.insights.core.llm.model;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class g implements yg3.z {
    public static final com.truecaller.insights.core.llm.model.g a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [yg3.z, java.lang.Object, com.truecaller.insights.core.llm.model.g] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase", (yg3.z) obj, 5);
        y0Var.j("use_case_id", false);
        y0Var.j("status", true);
        y0Var.j("subtitle", true);
        y0Var.j("title", false);
        y0Var.j("actions", true);
        descriptor = y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{yg3.l1.a, he0.u0.a0(com.truecaller.insights.core.llm.model.i.a), he0.u0.a0(com.truecaller.insights.core.llm.model.k.a), com.truecaller.insights.core.llm.model.m.a, lazyArr[4].getValue()};
    }

    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.bar b = decoder.b(serialDescriptor);
        lazyArr = com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.$childSerializers;
        int i = 0;
        java.lang.String str = null;
        com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.Status status = null;
        com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.Subtitle subtitle = null;
        com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.Title title = null;
        java.util.List list = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t != -1) {
                if (t != 0) {
                    if (t != 1) {
                        if (t != 2) {
                            if (t != 3) {
                                if (t == 4) {
                                    list = (java.util.List) b.E(serialDescriptor, 4, (kotlinx.serialization.KSerializer) lazyArr[4].getValue(), list);
                                    i |= 16;
                                } else {
                                    throw new ah3.q(t);
                                }
                            } else {
                                title = (com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.Title) b.E(serialDescriptor, 3, com.truecaller.insights.core.llm.model.m.a, title);
                                i |= 8;
                            }
                        } else {
                            subtitle = (com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.Subtitle) b.C(serialDescriptor, 2, com.truecaller.insights.core.llm.model.k.a, subtitle);
                            i |= 4;
                        }
                    } else {
                        status = (com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.Status) b.C(serialDescriptor, 1, com.truecaller.insights.core.llm.model.i.a, status);
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
        return new com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase(i, str, status, subtitle, title, list, (yg3.g1) null);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase useCase = (com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.UseCase.write$Self$core_googlePlayRelease(useCase, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
