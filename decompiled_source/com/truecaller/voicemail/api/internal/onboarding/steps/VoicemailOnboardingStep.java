package com.truecaller.voicemail.api.internal.onboarding.steps;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001d\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0005\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/truecaller/voicemail/api/internal/onboarding/steps/VoicemailOnboardingStep;", "", "", "key", "", "isConditional", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Z", "()Z", "Companion", "d33/bar", "TUTORIAL", "SIM", "ACTIVATION", "SUCCESS", "FINISHED_SUCCESSFULLY", "EXIT", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VoicemailOnboardingStep {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep[] $VALUES;
    public static final com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep ACTIVATION;

    @org.jetbrains.annotations.NotNull
    public static final d33.bar Companion;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep> DEFAULT_STEPS;
    public static final com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep EXIT;
    public static final com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep FINISHED_SUCCESSFULLY;
    public static final com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep SIM;
    public static final com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep SUCCESS;
    public static final com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep TUTORIAL;
    private final boolean isConditional;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String key;

    private static final /* synthetic */ com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep[] $values() {
        return new com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep[]{TUTORIAL, SIM, ACTIVATION, SUCCESS, FINISHED_SUCCESSFULLY, EXIT};
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [d33.bar, java.lang.Object] */
    static {
        com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep voicemailOnboardingStep = new com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep("TUTORIAL", 0, "tutorial", false, 2, null);
        TUTORIAL = voicemailOnboardingStep;
        com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep voicemailOnboardingStep2 = new com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep("SIM", 1, "sim", true);
        SIM = voicemailOnboardingStep2;
        com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep voicemailOnboardingStep3 = new com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep("ACTIVATION", 2, "activation", false, 2, null);
        ACTIVATION = voicemailOnboardingStep3;
        com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep voicemailOnboardingStep4 = new com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep("SUCCESS", 3, "success", false, 2, null);
        SUCCESS = voicemailOnboardingStep4;
        FINISHED_SUCCESSFULLY = new com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep("FINISHED_SUCCESSFULLY", 4, null, false, 2, null);
        EXIT = new com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep("EXIT", 5, null, false, 2, null);
        com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        DEFAULT_STEPS = kotlin.collections.y.j(new com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep[]{voicemailOnboardingStep, voicemailOnboardingStep2, voicemailOnboardingStep3, voicemailOnboardingStep4});
    }

    private VoicemailOnboardingStep(java.lang.String str, int i, java.lang.String str2, boolean z) {
        this.key = str2;
        this.isConditional = z;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep valueOf(java.lang.String str) {
        return (com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep) java.lang.Enum.valueOf(com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep.class, str);
    }

    public static com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep[] values() {
        return (com.truecaller.voicemail.api.internal.onboarding.steps.VoicemailOnboardingStep[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getKey() {
        return this.key;
    }

    /* renamed from: isConditional, reason: from getter */
    public final boolean getIsConditional() {
        return this.isConditional;
    }

    public /* synthetic */ VoicemailOnboardingStep(java.lang.String str, int i, java.lang.String str2, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? false : z);
    }
}
