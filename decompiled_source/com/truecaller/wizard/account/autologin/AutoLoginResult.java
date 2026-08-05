package com.truecaller.wizard.account.autologin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/wizard/account/autologin/AutoLoginResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "SKIPPED", "CONFIRM_RESTORE", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class AutoLoginResult {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.account.autologin.AutoLoginResult[] $VALUES;
    public static final com.truecaller.wizard.account.autologin.AutoLoginResult SUCCESS = new com.truecaller.wizard.account.autologin.AutoLoginResult("SUCCESS", 0);
    public static final com.truecaller.wizard.account.autologin.AutoLoginResult ERROR = new com.truecaller.wizard.account.autologin.AutoLoginResult("ERROR", 1);
    public static final com.truecaller.wizard.account.autologin.AutoLoginResult SKIPPED = new com.truecaller.wizard.account.autologin.AutoLoginResult("SKIPPED", 2);
    public static final com.truecaller.wizard.account.autologin.AutoLoginResult CONFIRM_RESTORE = new com.truecaller.wizard.account.autologin.AutoLoginResult("CONFIRM_RESTORE", 3);

    private static final /* synthetic */ com.truecaller.wizard.account.autologin.AutoLoginResult[] $values() {
        return new com.truecaller.wizard.account.autologin.AutoLoginResult[]{SUCCESS, ERROR, SKIPPED, CONFIRM_RESTORE};
    }

    static {
        com.truecaller.wizard.account.autologin.AutoLoginResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AutoLoginResult(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.account.autologin.AutoLoginResult valueOf(java.lang.String str) {
        return (com.truecaller.wizard.account.autologin.AutoLoginResult) java.lang.Enum.valueOf(com.truecaller.wizard.account.autologin.AutoLoginResult.class, str);
    }

    public static com.truecaller.wizard.account.autologin.AutoLoginResult[] values() {
        return (com.truecaller.wizard.account.autologin.AutoLoginResult[]) $VALUES.clone();
    }
}
