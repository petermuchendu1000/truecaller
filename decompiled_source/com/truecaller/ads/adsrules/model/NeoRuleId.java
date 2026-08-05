package com.truecaller.ads.adsrules.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/ads/adsrules/model/NeoRuleId;", "", "<init>", "(Ljava/lang/String;I)V", "AD_REQUEST_DELAY", "ACS_SHOW_DELAY", "ACS_CLOSE_BUTTON_DELAY", "ACS_EMPTY_SPACE_DISMISS_DELAY", "ACS_SWIPE_OUT_DISMISS_DELAY", "ACS_AD_CONTAINER_ANIMATION", "ACS_TOP_AD_FF", "ACS_LOCKED_AD_RENDER_DELAY", "ACS_RESTART_DISMISS_DELAY_FF", "ACS_LAYOUT_TYPE", "AD_CLICK_RESTRICTION_OVERLAY", "AD_CLICK_GUARD", "ACS_MULTI_AD_FF", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class NeoRuleId {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrules.model.NeoRuleId[] $VALUES;
    public static final com.truecaller.ads.adsrules.model.NeoRuleId AD_REQUEST_DELAY = new com.truecaller.ads.adsrules.model.NeoRuleId("AD_REQUEST_DELAY", 0);
    public static final com.truecaller.ads.adsrules.model.NeoRuleId ACS_SHOW_DELAY = new com.truecaller.ads.adsrules.model.NeoRuleId("ACS_SHOW_DELAY", 1);
    public static final com.truecaller.ads.adsrules.model.NeoRuleId ACS_CLOSE_BUTTON_DELAY = new com.truecaller.ads.adsrules.model.NeoRuleId("ACS_CLOSE_BUTTON_DELAY", 2);
    public static final com.truecaller.ads.adsrules.model.NeoRuleId ACS_EMPTY_SPACE_DISMISS_DELAY = new com.truecaller.ads.adsrules.model.NeoRuleId("ACS_EMPTY_SPACE_DISMISS_DELAY", 3);
    public static final com.truecaller.ads.adsrules.model.NeoRuleId ACS_SWIPE_OUT_DISMISS_DELAY = new com.truecaller.ads.adsrules.model.NeoRuleId("ACS_SWIPE_OUT_DISMISS_DELAY", 4);
    public static final com.truecaller.ads.adsrules.model.NeoRuleId ACS_AD_CONTAINER_ANIMATION = new com.truecaller.ads.adsrules.model.NeoRuleId("ACS_AD_CONTAINER_ANIMATION", 5);
    public static final com.truecaller.ads.adsrules.model.NeoRuleId ACS_TOP_AD_FF = new com.truecaller.ads.adsrules.model.NeoRuleId("ACS_TOP_AD_FF", 6);
    public static final com.truecaller.ads.adsrules.model.NeoRuleId ACS_LOCKED_AD_RENDER_DELAY = new com.truecaller.ads.adsrules.model.NeoRuleId("ACS_LOCKED_AD_RENDER_DELAY", 7);
    public static final com.truecaller.ads.adsrules.model.NeoRuleId ACS_RESTART_DISMISS_DELAY_FF = new com.truecaller.ads.adsrules.model.NeoRuleId("ACS_RESTART_DISMISS_DELAY_FF", 8);
    public static final com.truecaller.ads.adsrules.model.NeoRuleId ACS_LAYOUT_TYPE = new com.truecaller.ads.adsrules.model.NeoRuleId("ACS_LAYOUT_TYPE", 9);
    public static final com.truecaller.ads.adsrules.model.NeoRuleId AD_CLICK_RESTRICTION_OVERLAY = new com.truecaller.ads.adsrules.model.NeoRuleId("AD_CLICK_RESTRICTION_OVERLAY", 10);
    public static final com.truecaller.ads.adsrules.model.NeoRuleId AD_CLICK_GUARD = new com.truecaller.ads.adsrules.model.NeoRuleId("AD_CLICK_GUARD", 11);
    public static final com.truecaller.ads.adsrules.model.NeoRuleId ACS_MULTI_AD_FF = new com.truecaller.ads.adsrules.model.NeoRuleId("ACS_MULTI_AD_FF", 12);

    private static final /* synthetic */ com.truecaller.ads.adsrules.model.NeoRuleId[] $values() {
        return new com.truecaller.ads.adsrules.model.NeoRuleId[]{AD_REQUEST_DELAY, ACS_SHOW_DELAY, ACS_CLOSE_BUTTON_DELAY, ACS_EMPTY_SPACE_DISMISS_DELAY, ACS_SWIPE_OUT_DISMISS_DELAY, ACS_AD_CONTAINER_ANIMATION, ACS_TOP_AD_FF, ACS_LOCKED_AD_RENDER_DELAY, ACS_RESTART_DISMISS_DELAY_FF, ACS_LAYOUT_TYPE, AD_CLICK_RESTRICTION_OVERLAY, AD_CLICK_GUARD, ACS_MULTI_AD_FF};
    }

    static {
        com.truecaller.ads.adsrules.model.NeoRuleId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NeoRuleId(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrules.model.NeoRuleId valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrules.model.NeoRuleId) java.lang.Enum.valueOf(com.truecaller.ads.adsrules.model.NeoRuleId.class, str);
    }

    public static com.truecaller.ads.adsrules.model.NeoRuleId[] values() {
        return (com.truecaller.ads.adsrules.model.NeoRuleId[]) $VALUES.clone();
    }
}
