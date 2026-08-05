package com.truecaller.whoviewedme;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/truecaller/whoviewedme/WhoViewedMePresenterView$ViewType", "", "Lcom/truecaller/whoviewedme/WhoViewedMePresenterView$ViewType;", "<init>", "(Ljava/lang/String;I)V", "PREMIUM_WITH_PROFILE_VIEWS", "PREMIUM_ZERO_PROFILE_VIEWS", "REGULAR_WITH_PROFILE_VIEWS", "REGULAR_ZERO_PROFILE_VIEWS", "NONE", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WhoViewedMePresenterView$ViewType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType[] $VALUES;
    public static final com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType PREMIUM_WITH_PROFILE_VIEWS = new com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType("PREMIUM_WITH_PROFILE_VIEWS", 0);
    public static final com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType PREMIUM_ZERO_PROFILE_VIEWS = new com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType("PREMIUM_ZERO_PROFILE_VIEWS", 1);
    public static final com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType REGULAR_WITH_PROFILE_VIEWS = new com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType("REGULAR_WITH_PROFILE_VIEWS", 2);
    public static final com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType REGULAR_ZERO_PROFILE_VIEWS = new com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType("REGULAR_ZERO_PROFILE_VIEWS", 3);
    public static final com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType NONE = new com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType("NONE", 4);

    private static final /* synthetic */ com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType[] $values() {
        return new com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType[]{PREMIUM_WITH_PROFILE_VIEWS, PREMIUM_ZERO_PROFILE_VIEWS, REGULAR_WITH_PROFILE_VIEWS, REGULAR_ZERO_PROFILE_VIEWS, NONE};
    }

    static {
        com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private WhoViewedMePresenterView$ViewType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType valueOf(java.lang.String str) {
        return (com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType) java.lang.Enum.valueOf(com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType.class, str);
    }

    public static com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType[] values() {
        return (com.truecaller.whoviewedme.WhoViewedMePresenterView$ViewType[]) $VALUES.clone();
    }
}
