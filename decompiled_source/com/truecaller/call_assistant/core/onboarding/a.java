package com.truecaller.call_assistant.core.onboarding;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStepResult.NextStep(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStepResult.NextStep[i];
    }
}
