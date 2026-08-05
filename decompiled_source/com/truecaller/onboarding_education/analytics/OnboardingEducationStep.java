package com.truecaller.onboarding_education.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/onboarding_education/analytics/OnboardingEducationStep;", "Lf72/bar;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "STARTED", "ILLUSTRATION", "DEMO_CALL", "CALLER_ID", "SPAM_REPORTS", "REJECT_CALL", "AFTER_CALL", "COMMENTS", "BLOCK", "COMPLETED", "onboarding-education_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class OnboardingEducationStep implements f72.bar {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.onboarding_education.analytics.OnboardingEducationStep[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.onboarding_education.analytics.OnboardingEducationStep STARTED = new com.truecaller.onboarding_education.analytics.OnboardingEducationStep("STARTED", 0, "Started");
    public static final com.truecaller.onboarding_education.analytics.OnboardingEducationStep ILLUSTRATION = new com.truecaller.onboarding_education.analytics.OnboardingEducationStep("ILLUSTRATION", 1, "Illustration");
    public static final com.truecaller.onboarding_education.analytics.OnboardingEducationStep DEMO_CALL = new com.truecaller.onboarding_education.analytics.OnboardingEducationStep("DEMO_CALL", 2, "DemoCall");
    public static final com.truecaller.onboarding_education.analytics.OnboardingEducationStep CALLER_ID = new com.truecaller.onboarding_education.analytics.OnboardingEducationStep("CALLER_ID", 3, "CallerID");
    public static final com.truecaller.onboarding_education.analytics.OnboardingEducationStep SPAM_REPORTS = new com.truecaller.onboarding_education.analytics.OnboardingEducationStep("SPAM_REPORTS", 4, "SpamReports");
    public static final com.truecaller.onboarding_education.analytics.OnboardingEducationStep REJECT_CALL = new com.truecaller.onboarding_education.analytics.OnboardingEducationStep("REJECT_CALL", 5, "RejectCall");
    public static final com.truecaller.onboarding_education.analytics.OnboardingEducationStep AFTER_CALL = new com.truecaller.onboarding_education.analytics.OnboardingEducationStep("AFTER_CALL", 6, "AfterCall");
    public static final com.truecaller.onboarding_education.analytics.OnboardingEducationStep COMMENTS = new com.truecaller.onboarding_education.analytics.OnboardingEducationStep("COMMENTS", 7, "Comments");
    public static final com.truecaller.onboarding_education.analytics.OnboardingEducationStep BLOCK = new com.truecaller.onboarding_education.analytics.OnboardingEducationStep("BLOCK", 8, "Block");
    public static final com.truecaller.onboarding_education.analytics.OnboardingEducationStep COMPLETED = new com.truecaller.onboarding_education.analytics.OnboardingEducationStep("COMPLETED", 9, "Completed");

    private static final /* synthetic */ com.truecaller.onboarding_education.analytics.OnboardingEducationStep[] $values() {
        return new com.truecaller.onboarding_education.analytics.OnboardingEducationStep[]{STARTED, ILLUSTRATION, DEMO_CALL, CALLER_ID, SPAM_REPORTS, REJECT_CALL, AFTER_CALL, COMMENTS, BLOCK, COMPLETED};
    }

    static {
        com.truecaller.onboarding_education.analytics.OnboardingEducationStep[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private OnboardingEducationStep(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.onboarding_education.analytics.OnboardingEducationStep valueOf(java.lang.String str) {
        return (com.truecaller.onboarding_education.analytics.OnboardingEducationStep) java.lang.Enum.valueOf(com.truecaller.onboarding_education.analytics.OnboardingEducationStep.class, str);
    }

    public static com.truecaller.onboarding_education.analytics.OnboardingEducationStep[] values() {
        return (com.truecaller.onboarding_education.analytics.OnboardingEducationStep[]) $VALUES.clone();
    }

    @Override // f72.bar
    @org.jetbrains.annotations.NotNull
    public java.lang.String getValue() {
        return this.value;
    }
}
