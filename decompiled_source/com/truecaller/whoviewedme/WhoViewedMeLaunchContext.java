package com.truecaller.whoviewedme;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/whoviewedme/WhoViewedMeLaunchContext;", "", "<init>", "(Ljava/lang/String;I)V", "NAVIGATION_DRAWER", "DEEPLINK", "NOTIFICATION", "HOME_TAB_PROMO", "PREMIUM_USER_TAB", "WEEKLY_SUMMARY_NOTIFICATION", "FEATURE_INNER_SCREEN", "UNKNOWN", "USERS_HOME", "WVM_ACS", "whoviewedme_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WhoViewedMeLaunchContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.whoviewedme.WhoViewedMeLaunchContext[] $VALUES;
    public static final com.truecaller.whoviewedme.WhoViewedMeLaunchContext NAVIGATION_DRAWER = new com.truecaller.whoviewedme.WhoViewedMeLaunchContext("NAVIGATION_DRAWER", 0);
    public static final com.truecaller.whoviewedme.WhoViewedMeLaunchContext DEEPLINK = new com.truecaller.whoviewedme.WhoViewedMeLaunchContext("DEEPLINK", 1);
    public static final com.truecaller.whoviewedme.WhoViewedMeLaunchContext NOTIFICATION = new com.truecaller.whoviewedme.WhoViewedMeLaunchContext("NOTIFICATION", 2);
    public static final com.truecaller.whoviewedme.WhoViewedMeLaunchContext HOME_TAB_PROMO = new com.truecaller.whoviewedme.WhoViewedMeLaunchContext("HOME_TAB_PROMO", 3);
    public static final com.truecaller.whoviewedme.WhoViewedMeLaunchContext PREMIUM_USER_TAB = new com.truecaller.whoviewedme.WhoViewedMeLaunchContext("PREMIUM_USER_TAB", 4);
    public static final com.truecaller.whoviewedme.WhoViewedMeLaunchContext WEEKLY_SUMMARY_NOTIFICATION = new com.truecaller.whoviewedme.WhoViewedMeLaunchContext("WEEKLY_SUMMARY_NOTIFICATION", 5);
    public static final com.truecaller.whoviewedme.WhoViewedMeLaunchContext FEATURE_INNER_SCREEN = new com.truecaller.whoviewedme.WhoViewedMeLaunchContext("FEATURE_INNER_SCREEN", 6);
    public static final com.truecaller.whoviewedme.WhoViewedMeLaunchContext UNKNOWN = new com.truecaller.whoviewedme.WhoViewedMeLaunchContext("UNKNOWN", 7);
    public static final com.truecaller.whoviewedme.WhoViewedMeLaunchContext USERS_HOME = new com.truecaller.whoviewedme.WhoViewedMeLaunchContext("USERS_HOME", 8);
    public static final com.truecaller.whoviewedme.WhoViewedMeLaunchContext WVM_ACS = new com.truecaller.whoviewedme.WhoViewedMeLaunchContext("WVM_ACS", 9);

    private static final /* synthetic */ com.truecaller.whoviewedme.WhoViewedMeLaunchContext[] $values() {
        return new com.truecaller.whoviewedme.WhoViewedMeLaunchContext[]{NAVIGATION_DRAWER, DEEPLINK, NOTIFICATION, HOME_TAB_PROMO, PREMIUM_USER_TAB, WEEKLY_SUMMARY_NOTIFICATION, FEATURE_INNER_SCREEN, UNKNOWN, USERS_HOME, WVM_ACS};
    }

    static {
        com.truecaller.whoviewedme.WhoViewedMeLaunchContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private WhoViewedMeLaunchContext(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.whoviewedme.WhoViewedMeLaunchContext valueOf(java.lang.String str) {
        return (com.truecaller.whoviewedme.WhoViewedMeLaunchContext) java.lang.Enum.valueOf(com.truecaller.whoviewedme.WhoViewedMeLaunchContext.class, str);
    }

    public static com.truecaller.whoviewedme.WhoViewedMeLaunchContext[] values() {
        return (com.truecaller.whoviewedme.WhoViewedMeLaunchContext[]) $VALUES.clone();
    }
}
