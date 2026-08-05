package com.truecaller.wizard.verification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/wizard/verification/ReverseOtpChargesNotePlacement;", "", "<init>", "(Ljava/lang/String;I)V", "ABOVE_CTA", "BOTTOM", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReverseOtpChargesNotePlacement {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement[] $VALUES;
    public static final com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement ABOVE_CTA = new com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement("ABOVE_CTA", 0);
    public static final com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement BOTTOM = new com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement("BOTTOM", 1);

    private static final /* synthetic */ com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement[] $values() {
        return new com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement[]{ABOVE_CTA, BOTTOM};
    }

    static {
        com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ReverseOtpChargesNotePlacement(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement valueOf(java.lang.String str) {
        return (com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement) java.lang.Enum.valueOf(com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement.class, str);
    }

    public static com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement[] values() {
        return (com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement[]) $VALUES.clone();
    }
}
