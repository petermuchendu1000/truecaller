package com.truecaller.whosearchedforme.analytics.events;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/whosearchedforme/analytics/events/WhoSearchedForMeCardEventAction;", "", "<init>", "(Ljava/lang/String;I)V", "SearchProfilesPrivatelyToggleEnabled", "SearchProfilesPrivatelyToggleDisabled", "SeeAllSearchesClick", "whosearchedforme_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WhoSearchedForMeCardEventAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction[] $VALUES;
    public static final com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction SearchProfilesPrivatelyToggleEnabled = new com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction("SearchProfilesPrivatelyToggleEnabled", 0);
    public static final com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction SearchProfilesPrivatelyToggleDisabled = new com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction("SearchProfilesPrivatelyToggleDisabled", 1);
    public static final com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction SeeAllSearchesClick = new com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction("SeeAllSearchesClick", 2);

    private static final /* synthetic */ com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction[] $values() {
        return new com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction[]{SearchProfilesPrivatelyToggleEnabled, SearchProfilesPrivatelyToggleDisabled, SeeAllSearchesClick};
    }

    static {
        com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private WhoSearchedForMeCardEventAction(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction valueOf(java.lang.String str) {
        return (com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction) java.lang.Enum.valueOf(com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction.class, str);
    }

    public static com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction[] values() {
        return (com.truecaller.whosearchedforme.analytics.events.WhoSearchedForMeCardEventAction[]) $VALUES.clone();
    }
}
