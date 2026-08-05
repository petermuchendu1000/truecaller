package com.truecaller.premium.premiumusertab.list.accountsettings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/premium/premiumusertab/list/accountsettings/AccountSettingsPayloadType;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_SETTINGS", "LIVE_CHAT", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AccountSettingsPayloadType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.premiumusertab.list.accountsettings.AccountSettingsPayloadType[] $VALUES;
    public static final com.truecaller.premium.premiumusertab.list.accountsettings.AccountSettingsPayloadType ACCOUNT_SETTINGS = new com.truecaller.premium.premiumusertab.list.accountsettings.AccountSettingsPayloadType("ACCOUNT_SETTINGS", 0);
    public static final com.truecaller.premium.premiumusertab.list.accountsettings.AccountSettingsPayloadType LIVE_CHAT = new com.truecaller.premium.premiumusertab.list.accountsettings.AccountSettingsPayloadType("LIVE_CHAT", 1);

    private static final /* synthetic */ com.truecaller.premium.premiumusertab.list.accountsettings.AccountSettingsPayloadType[] $values() {
        return new com.truecaller.premium.premiumusertab.list.accountsettings.AccountSettingsPayloadType[]{ACCOUNT_SETTINGS, LIVE_CHAT};
    }

    static {
        com.truecaller.premium.premiumusertab.list.accountsettings.AccountSettingsPayloadType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AccountSettingsPayloadType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.premiumusertab.list.accountsettings.AccountSettingsPayloadType valueOf(java.lang.String str) {
        return (com.truecaller.premium.premiumusertab.list.accountsettings.AccountSettingsPayloadType) java.lang.Enum.valueOf(com.truecaller.premium.premiumusertab.list.accountsettings.AccountSettingsPayloadType.class, str);
    }

    public static com.truecaller.premium.premiumusertab.list.accountsettings.AccountSettingsPayloadType[] values() {
        return (com.truecaller.premium.premiumusertab.list.accountsettings.AccountSettingsPayloadType[]) $VALUES.clone();
    }
}
