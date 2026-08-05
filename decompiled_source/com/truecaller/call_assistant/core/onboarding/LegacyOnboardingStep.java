package com.truecaller.call_assistant.core.onboarding;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/truecaller/call_assistant/core/onboarding/LegacyOnboardingStep;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "VIDEO_TUTORIAL", "PERSONA_SELECTION", "SIM", "VOICE", "CARRIER", "PERMISSIONS", "ACTIVATION", "SUCCESS", "EXIT", "FINISH_SUCCESSFULLY", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class LegacyOnboardingStep implements android.os.Parcelable {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep> CREATOR;
    public static final com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep VIDEO_TUTORIAL = new com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep("VIDEO_TUTORIAL", 0);
    public static final com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep PERSONA_SELECTION = new com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep("PERSONA_SELECTION", 1);
    public static final com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep SIM = new com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep("SIM", 2);
    public static final com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep VOICE = new com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep("VOICE", 3);
    public static final com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep CARRIER = new com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep("CARRIER", 4);
    public static final com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep PERMISSIONS = new com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep("PERMISSIONS", 5);
    public static final com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep ACTIVATION = new com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep("ACTIVATION", 6);
    public static final com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep SUCCESS = new com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep("SUCCESS", 7);

    @bw.qux("FINISH")
    public static final com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep EXIT = new com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep("EXIT", 8);
    public static final com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep FINISH_SUCCESSFULLY = new com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep("FINISH_SUCCESSFULLY", 9);

    private static final /* synthetic */ com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep[] $values() {
        return new com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep[]{VIDEO_TUTORIAL, PERSONA_SELECTION, SIM, VOICE, CARRIER, PERMISSIONS, ACTIVATION, SUCCESS, EXIT, FINISH_SUCCESSFULLY};
    }

    static {
        com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        CREATOR = new f22.bar(25);
    }

    private LegacyOnboardingStep(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep.class, str);
    }

    public static com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep[] values() {
        return (com.truecaller.call_assistant.core.onboarding.LegacyOnboardingStep[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
