package com.truecaller.premium.ui.banner.displaycondition;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/premium/ui/banner/displaycondition/BannerDisplayCondition;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "de2/qux", "SEARCH_PROFILE_PRIVATE", "VIEW_PROFILE_PRIVATE", "SECONDARY_PHONE_NUMBER_ELIGIBLE", "WHO_SEARCHED_ME_ELIGIBLE", "WHO_VIEWED_ME_ELIGIBLE", "VERIFIED_BUSINESS_AWARENESS_ELIGIBLE", "PRIORITY_CALL_AWARENESS_ELIGIBLE", "VOICEMAIL_ELIGIBLE", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BannerDisplayCondition {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final de2.qux Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition SEARCH_PROFILE_PRIVATE = new com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition("SEARCH_PROFILE_PRIVATE", 0, "search_profile_private_disabled");
    public static final com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition VIEW_PROFILE_PRIVATE = new com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition("VIEW_PROFILE_PRIVATE", 1, "view_profile_private_disabled");
    public static final com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition SECONDARY_PHONE_NUMBER_ELIGIBLE = new com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition("SECONDARY_PHONE_NUMBER_ELIGIBLE", 2, "secondary_number_not_added");
    public static final com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition WHO_SEARCHED_ME_ELIGIBLE = new com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition("WHO_SEARCHED_ME_ELIGIBLE", 3, "wsfm_unread_profile_views");
    public static final com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition WHO_VIEWED_ME_ELIGIBLE = new com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition("WHO_VIEWED_ME_ELIGIBLE", 4, "wvm_unread_profile_views");
    public static final com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition VERIFIED_BUSINESS_AWARENESS_ELIGIBLE = new com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition("VERIFIED_BUSINESS_AWARENESS_ELIGIBLE", 5, "verified_business_ff_enabled");
    public static final com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition PRIORITY_CALL_AWARENESS_ELIGIBLE = new com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition("PRIORITY_CALL_AWARENESS_ELIGIBLE", 6, "priority_call_ff_enabled");
    public static final com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition VOICEMAIL_ELIGIBLE = new com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition("VOICEMAIL_ELIGIBLE", 7, "voicemail_inactive_and_no_voicemail_sent");

    private static final /* synthetic */ com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition[] $values() {
        return new com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition[]{SEARCH_PROFILE_PRIVATE, VIEW_PROFILE_PRIVATE, SECONDARY_PHONE_NUMBER_ELIGIBLE, WHO_SEARCHED_ME_ELIGIBLE, WHO_VIEWED_ME_ELIGIBLE, VERIFIED_BUSINESS_AWARENESS_ELIGIBLE, PRIORITY_CALL_AWARENESS_ELIGIBLE, VOICEMAIL_ELIGIBLE};
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [de2.qux, java.lang.Object] */
    static {
        com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private BannerDisplayCondition(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition valueOf(java.lang.String str) {
        return (com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition) java.lang.Enum.valueOf(com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition.class, str);
    }

    public static com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition[] values() {
        return (com.truecaller.premium.ui.banner.displaycondition.BannerDisplayCondition[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
