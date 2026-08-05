package com.truecaller.wizard.verification.otp.sms;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/wizard/verification/otp/sms/OtpSmsApi;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "q93/bar", "SMS", "GOOGLE", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class OtpSmsApi {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.verification.otp.sms.OtpSmsApi[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final q93.bar Companion;
    private final int value;
    public static final com.truecaller.wizard.verification.otp.sms.OtpSmsApi SMS = new com.truecaller.wizard.verification.otp.sms.OtpSmsApi("SMS", 0, 0);
    public static final com.truecaller.wizard.verification.otp.sms.OtpSmsApi GOOGLE = new com.truecaller.wizard.verification.otp.sms.OtpSmsApi("GOOGLE", 1, 1);

    private static final /* synthetic */ com.truecaller.wizard.verification.otp.sms.OtpSmsApi[] $values() {
        return new com.truecaller.wizard.verification.otp.sms.OtpSmsApi[]{SMS, GOOGLE};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [q93.bar, java.lang.Object] */
    static {
        com.truecaller.wizard.verification.otp.sms.OtpSmsApi[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private OtpSmsApi(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.verification.otp.sms.OtpSmsApi valueOf(java.lang.String str) {
        return (com.truecaller.wizard.verification.otp.sms.OtpSmsApi) java.lang.Enum.valueOf(com.truecaller.wizard.verification.otp.sms.OtpSmsApi.class, str);
    }

    public static com.truecaller.wizard.verification.otp.sms.OtpSmsApi[] values() {
        return (com.truecaller.wizard.verification.otp.sms.OtpSmsApi[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
