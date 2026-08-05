package com.truecaller.call_assistant.presentation.onboarding.steps.verification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/call_assistant/presentation/onboarding/steps/verification/VerificationChip;", "", "labelRes", "", "explanationRes", "analyticsName", "", "<init>", "(Ljava/lang/String;IIILjava/lang/String;)V", "getLabelRes", "()I", "getExplanationRes", "getAnalyticsName", "()Ljava/lang/String;", "ANSWER_CALLS", "DETECT_SCAMS", "SMART_REPLIES", "CALL_SUMMARIES", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class VerificationChip {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsName;
    private final int explanationRes;
    private final int labelRes;
    public static final com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip ANSWER_CALLS = new com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip("ANSWER_CALLS", 0, 2132019881, 2132019885, "AnswerCalls");
    public static final com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip DETECT_SCAMS = new com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip("DETECT_SCAMS", 1, 2132019883, 2132019887, "DetectScams");
    public static final com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip SMART_REPLIES = new com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip("SMART_REPLIES", 2, 2132019884, 2132019888, "SmartReplies");
    public static final com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip CALL_SUMMARIES = new com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip("CALL_SUMMARIES", 3, 2132019882, 2132019886, "CallSummaries");

    private static final /* synthetic */ com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip[] $values() {
        return new com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip[]{ANSWER_CALLS, DETECT_SCAMS, SMART_REPLIES, CALL_SUMMARIES};
    }

    static {
        com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private VerificationChip(java.lang.String str, int i, int i2, int i3, java.lang.String str2) {
        this.labelRes = i2;
        this.explanationRes = i3;
        this.analyticsName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip) java.lang.Enum.valueOf(com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip.class, str);
    }

    public static com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip[] values() {
        return (com.truecaller.call_assistant.presentation.onboarding.steps.verification.VerificationChip[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticsName() {
        return this.analyticsName;
    }

    public final int getExplanationRes() {
        return this.explanationRes;
    }

    public final int getLabelRes() {
        return this.labelRes;
    }
}
