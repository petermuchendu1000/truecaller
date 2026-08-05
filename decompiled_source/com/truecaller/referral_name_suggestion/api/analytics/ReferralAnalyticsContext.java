package com.truecaller.referral_name_suggestion.api.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/truecaller/referral_name_suggestion/api/analytics/ReferralAnalyticsContext;", "", "analyticsContext", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsContext", "()Ljava/lang/String;", "UNKNOWN", "HOME_SCREEN", "INBOX_OVERFLOW", "CONTACTS", "USER_BUSY_PROMPT", "AFTER_CALL", "NAVIGATION_DRAWER", "PUSH_NOTIFICATION", "DEEP_LINK", "AFTER_CALL_PROMO", "SEARCH_SCREEN_PROMO", "BOTTOM_BAR", "PROMO_POPUP", "PREMIUM_TAB_V2", "CONVERSATION", "FACS_AFTER_CALL", "CONTACT_EDIT", "CONTACT_ADD", "SURVEY_AFTER_CALL", "SURVEY_DETAILS_VIEW", "INVITE_FRIENDS", "INVITE_FRIENDS_PREMIUM", "STARTUP_PROMO", "STARTUP_PROMO_PREMIUM", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReferralAnalyticsContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsContext;
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext UNKNOWN = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("UNKNOWN", 0, "UNKNOWN");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext HOME_SCREEN = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("HOME_SCREEN", 1, "HOME_SCREEN");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext INBOX_OVERFLOW = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("INBOX_OVERFLOW", 2, "INBOX_OVERFLOW");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext CONTACTS = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("CONTACTS", 3, "CONTACTS");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext USER_BUSY_PROMPT = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("USER_BUSY_PROMPT", 4, "USER_BUSY_PROMPT");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext AFTER_CALL = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("AFTER_CALL", 5, "AFTER_CALL");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext NAVIGATION_DRAWER = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("NAVIGATION_DRAWER", 6, "NAVIGATION_DRAWER");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext PUSH_NOTIFICATION = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("PUSH_NOTIFICATION", 7, "PUSH_NOTIFICATION");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext DEEP_LINK = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("DEEP_LINK", 8, "DEEP_LINK");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext AFTER_CALL_PROMO = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("AFTER_CALL_PROMO", 9, "AFTER_CALL_PROMO");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext SEARCH_SCREEN_PROMO = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("SEARCH_SCREEN_PROMO", 10, "SEARCH_SCREEN_PROMO");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext BOTTOM_BAR = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("BOTTOM_BAR", 11, "BOTTOM_BAR");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext PROMO_POPUP = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("PROMO_POPUP", 12, "PROMO_POPUP");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext PREMIUM_TAB_V2 = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("PREMIUM_TAB_V2", 13, "PREMIUM_TAB_V2");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext CONVERSATION = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("CONVERSATION", 14, "CONVERSATION");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext FACS_AFTER_CALL = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("FACS_AFTER_CALL", 15, "FACS_AFTER_CALL");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext CONTACT_EDIT = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("CONTACT_EDIT", 16, "nameEditFromContactEditor");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext CONTACT_ADD = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("CONTACT_ADD", 17, "nameSaveFromContactEditor");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext SURVEY_AFTER_CALL = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("SURVEY_AFTER_CALL", 18, "nameSuggestionFromACS");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext SURVEY_DETAILS_VIEW = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("SURVEY_DETAILS_VIEW", 19, "nameSuggestionFromDV");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext INVITE_FRIENDS = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("INVITE_FRIENDS", 20, "InviteFriends");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext INVITE_FRIENDS_PREMIUM = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("INVITE_FRIENDS_PREMIUM", 21, "InviteFriendsPremium");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext STARTUP_PROMO = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("STARTUP_PROMO", 22, "startupPromo");
    public static final com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext STARTUP_PROMO_PREMIUM = new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext("STARTUP_PROMO_PREMIUM", 23, "startupPromoPremium");

    private static final /* synthetic */ com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext[] $values() {
        return new com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext[]{UNKNOWN, HOME_SCREEN, INBOX_OVERFLOW, CONTACTS, USER_BUSY_PROMPT, AFTER_CALL, NAVIGATION_DRAWER, PUSH_NOTIFICATION, DEEP_LINK, AFTER_CALL_PROMO, SEARCH_SCREEN_PROMO, BOTTOM_BAR, PROMO_POPUP, PREMIUM_TAB_V2, CONVERSATION, FACS_AFTER_CALL, CONTACT_EDIT, CONTACT_ADD, SURVEY_AFTER_CALL, SURVEY_DETAILS_VIEW, INVITE_FRIENDS, INVITE_FRIENDS_PREMIUM, STARTUP_PROMO, STARTUP_PROMO_PREMIUM};
    }

    static {
        com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ReferralAnalyticsContext(java.lang.String str, int i, java.lang.String str2) {
        this.analyticsContext = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext valueOf(java.lang.String str) {
        return (com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext) java.lang.Enum.valueOf(com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.class, str);
    }

    public static com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext[] values() {
        return (com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticsContext() {
        return this.analyticsContext;
    }
}
