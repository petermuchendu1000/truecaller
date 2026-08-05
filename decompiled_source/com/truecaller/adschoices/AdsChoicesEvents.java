package com.truecaller.adschoices;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/adschoices/AdsChoicesEvents;", "", "<init>", "(Ljava/lang/String;I)V", "ShowAdsToggleEnabled", "ShowAdsToggleDisabled", "ShowRelevantAdsToggleEnabled", "ShowRelevantAdsToggleDisabled", "ShowDealsPromotionsAdsToggleEnabled", "ShowDealsPromotionsAdsToggleDisabled", "LearnMoreAdPersonalisationClicked", "AdvertisingIdentifiersSettingsClicked", "adschoices_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdsChoicesEvents {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.adschoices.AdsChoicesEvents[] $VALUES;
    public static final com.truecaller.adschoices.AdsChoicesEvents ShowAdsToggleEnabled = new com.truecaller.adschoices.AdsChoicesEvents("ShowAdsToggleEnabled", 0);
    public static final com.truecaller.adschoices.AdsChoicesEvents ShowAdsToggleDisabled = new com.truecaller.adschoices.AdsChoicesEvents("ShowAdsToggleDisabled", 1);
    public static final com.truecaller.adschoices.AdsChoicesEvents ShowRelevantAdsToggleEnabled = new com.truecaller.adschoices.AdsChoicesEvents("ShowRelevantAdsToggleEnabled", 2);
    public static final com.truecaller.adschoices.AdsChoicesEvents ShowRelevantAdsToggleDisabled = new com.truecaller.adschoices.AdsChoicesEvents("ShowRelevantAdsToggleDisabled", 3);
    public static final com.truecaller.adschoices.AdsChoicesEvents ShowDealsPromotionsAdsToggleEnabled = new com.truecaller.adschoices.AdsChoicesEvents("ShowDealsPromotionsAdsToggleEnabled", 4);
    public static final com.truecaller.adschoices.AdsChoicesEvents ShowDealsPromotionsAdsToggleDisabled = new com.truecaller.adschoices.AdsChoicesEvents("ShowDealsPromotionsAdsToggleDisabled", 5);
    public static final com.truecaller.adschoices.AdsChoicesEvents LearnMoreAdPersonalisationClicked = new com.truecaller.adschoices.AdsChoicesEvents("LearnMoreAdPersonalisationClicked", 6);
    public static final com.truecaller.adschoices.AdsChoicesEvents AdvertisingIdentifiersSettingsClicked = new com.truecaller.adschoices.AdsChoicesEvents("AdvertisingIdentifiersSettingsClicked", 7);

    private static final /* synthetic */ com.truecaller.adschoices.AdsChoicesEvents[] $values() {
        return new com.truecaller.adschoices.AdsChoicesEvents[]{ShowAdsToggleEnabled, ShowAdsToggleDisabled, ShowRelevantAdsToggleEnabled, ShowRelevantAdsToggleDisabled, ShowDealsPromotionsAdsToggleEnabled, ShowDealsPromotionsAdsToggleDisabled, LearnMoreAdPersonalisationClicked, AdvertisingIdentifiersSettingsClicked};
    }

    static {
        com.truecaller.adschoices.AdsChoicesEvents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdsChoicesEvents(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.adschoices.AdsChoicesEvents valueOf(java.lang.String str) {
        return (com.truecaller.adschoices.AdsChoicesEvents) java.lang.Enum.valueOf(com.truecaller.adschoices.AdsChoicesEvents.class, str);
    }

    public static com.truecaller.adschoices.AdsChoicesEvents[] values() {
        return (com.truecaller.adschoices.AdsChoicesEvents[]) $VALUES.clone();
    }
}
