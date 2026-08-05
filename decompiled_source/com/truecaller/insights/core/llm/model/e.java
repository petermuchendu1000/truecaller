package com.truecaller.insights.core.llm.model;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class e implements yg3.z {
    public static final com.truecaller.insights.core.llm.model.e a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [yg3.z, java.lang.Object, com.truecaller.insights.core.llm.model.e] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.PatternAction", (yg3.z) obj, 4);
        y0Var.j("name", false);
        y0Var.j("type", true);
        y0Var.j("value", true);
        y0Var.j("content", true);
        descriptor = y0Var;
    }

    public final kotlinx.serialization.KSerializer[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.PatternAction.$childSerializers;
        kotlinx.serialization.KSerializer a0 = he0.u0.a0((kotlinx.serialization.KSerializer) lazyArr[3].getValue());
        yg3.l1 l1Var = yg3.l1.a;
        return new kotlinx.serialization.KSerializer[]{l1Var, l1Var, l1Var, a0};
    }

    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.bar b = decoder.b(serialDescriptor);
        lazyArr = com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.PatternAction.$childSerializers;
        int i = 0;
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.ActionContent actionContent = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t != -1) {
                if (t != 0) {
                    if (t != 1) {
                        if (t != 2) {
                            if (t == 3) {
                                actionContent = (com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.ActionContent) b.C(serialDescriptor, 3, (kotlinx.serialization.KSerializer) lazyArr[3].getValue(), actionContent);
                                i |= 8;
                            } else {
                                throw new ah3.q(t);
                            }
                        } else {
                            str3 = b.i(serialDescriptor, 2);
                            i |= 4;
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
        return new com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.PatternAction(i, str, str2, str3, actionContent, (yg3.g1) null);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.PatternAction patternAction = (com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.PatternAction) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(patternAction, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.insights.core.llm.model.LlmPatternResponse.Pattern.PatternAction.write$Self$core_googlePlayRelease(patternAction, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
