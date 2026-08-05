package com.truecaller.premium.premiumusertab.list;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/premium/premiumusertab/list/AnalyticsAction;", "", "<init>", "(Ljava/lang/String;I)V", "WINBACK", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AnalyticsAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.premiumusertab.list.AnalyticsAction[] $VALUES;
    public static final com.truecaller.premium.premiumusertab.list.AnalyticsAction WINBACK = new com.truecaller.premium.premiumusertab.list.AnalyticsAction("WINBACK", 0);

    private static final /* synthetic */ com.truecaller.premium.premiumusertab.list.AnalyticsAction[] $values() {
        return new com.truecaller.premium.premiumusertab.list.AnalyticsAction[]{WINBACK};
    }

    static {
        com.truecaller.premium.premiumusertab.list.AnalyticsAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AnalyticsAction(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.premiumusertab.list.AnalyticsAction valueOf(java.lang.String str) {
        return (com.truecaller.premium.premiumusertab.list.AnalyticsAction) java.lang.Enum.valueOf(com.truecaller.premium.premiumusertab.list.AnalyticsAction.class, str);
    }

    public static com.truecaller.premium.premiumusertab.list.AnalyticsAction[] values() {
        return (com.truecaller.premium.premiumusertab.list.AnalyticsAction[]) $VALUES.clone();
    }
}
