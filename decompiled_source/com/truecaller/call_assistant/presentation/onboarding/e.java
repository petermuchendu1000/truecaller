package com.truecaller.call_assistant.presentation.onboarding;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class e {
    public final qo1.b a;

    public e(qo1.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "featuresInventory");
        this.a = bVar;
    }

    public final android.content.Intent a(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        if (this.a.b.a("featureAssistantActivationV2", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
            int i = com.truecaller.call_assistant.presentation.onboarding.AssistantOnboardingActivity.f0;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
            android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.call_assistant.presentation.onboarding.AssistantOnboardingActivity.class).putExtra("KEY_ANALYTICS_CONTEXT", str);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            return putExtra;
        }
        int i2 = com.truecaller.call_assistant.core.onboarding.LegacyAssistantOnboardingActivity.i0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        android.content.Intent putExtra2 = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.call_assistant.core.onboarding.LegacyAssistantOnboardingActivity.class).putExtra("KEY_ANALYTICS_CONTEXT", str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra2, "putExtra(...)");
        return putExtra2;
    }
}
