package com.truecaller.wizard.account.autologin.confirmrestore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/wizard/account/autologin/confirmrestore/ConfirmRestoreType;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_RESTORATION", "PHONE_NUMBER_RESTORATION", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ConfirmRestoreType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.account.autologin.confirmrestore.ConfirmRestoreType[] $VALUES;
    public static final com.truecaller.wizard.account.autologin.confirmrestore.ConfirmRestoreType ACCOUNT_RESTORATION = new com.truecaller.wizard.account.autologin.confirmrestore.ConfirmRestoreType("ACCOUNT_RESTORATION", 0);
    public static final com.truecaller.wizard.account.autologin.confirmrestore.ConfirmRestoreType PHONE_NUMBER_RESTORATION = new com.truecaller.wizard.account.autologin.confirmrestore.ConfirmRestoreType("PHONE_NUMBER_RESTORATION", 1);

    private static final /* synthetic */ com.truecaller.wizard.account.autologin.confirmrestore.ConfirmRestoreType[] $values() {
        return new com.truecaller.wizard.account.autologin.confirmrestore.ConfirmRestoreType[]{ACCOUNT_RESTORATION, PHONE_NUMBER_RESTORATION};
    }

    static {
        com.truecaller.wizard.account.autologin.confirmrestore.ConfirmRestoreType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ConfirmRestoreType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.account.autologin.confirmrestore.ConfirmRestoreType valueOf(java.lang.String str) {
        return (com.truecaller.wizard.account.autologin.confirmrestore.ConfirmRestoreType) java.lang.Enum.valueOf(com.truecaller.wizard.account.autologin.confirmrestore.ConfirmRestoreType.class, str);
    }

    public static com.truecaller.wizard.account.autologin.confirmrestore.ConfirmRestoreType[] values() {
        return (com.truecaller.wizard.account.autologin.confirmrestore.ConfirmRestoreType[]) $VALUES.clone();
    }
}
