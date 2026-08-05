package com.truecaller.referrals.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(¨\u0006)"}, d2 = {"com/truecaller/referrals/api/ReferralManager$ReferralLaunchContext", "", "Lcom/truecaller/referrals/api/ReferralManager$ReferralLaunchContext;", "", "encodedChar", "", "analyticsContext", "<init>", "(Ljava/lang/String;ICLjava/lang/String;)V", "C", "getEncodedChar", "()C", "Ljava/lang/String;", "getAnalyticsContext", "()Ljava/lang/String;", "Companion", "kj2/bar", "UNKNOWN", "HOME_SCREEN", "INBOX_OVERFLOW", "CONTACTS", "USER_BUSY_PROMPT", "AFTER_CALL", "NAVIGATION_DRAWER", "PUSH_NOTIFICATION", "DEEP_LINK", "AFTER_CALL_PROMO", "SEARCH_SCREEN_PROMO", "BOTTOM_BAR", "PROMO_POPUP", "PREMIUM_TAB_V2", "CONVERSATION", "FACS_AFTER_CALL", "CONTACT_EDIT", "CONTACT_ADD", "SURVEY_AFTER_CALL", "SURVEY_DETAILS_VIEW", "INVITE_FRIENDS", "INVITE_FRIENDS_PREMIUM", "STARTUP_PROMO", "STARTUP_PROMO_PREMIUM", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReferralManager$ReferralLaunchContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final kj2.bar Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsContext;
    private final char encodedChar;
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext UNKNOWN = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("UNKNOWN", 0, '-', "UNKNOWN");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext HOME_SCREEN = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("HOME_SCREEN", 1, 'a', "HOME_SCREEN");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext INBOX_OVERFLOW = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("INBOX_OVERFLOW", 2, 'b', "INBOX_OVERFLOW");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext CONTACTS = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("CONTACTS", 3, 'd', "CONTACTS");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext USER_BUSY_PROMPT = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("USER_BUSY_PROMPT", 4, 'e', "USER_BUSY_PROMPT");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext AFTER_CALL = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("AFTER_CALL", 5, 'f', "AFTER_CALL");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext NAVIGATION_DRAWER = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("NAVIGATION_DRAWER", 6, 'h', "NAVIGATION_DRAWER");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext PUSH_NOTIFICATION = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("PUSH_NOTIFICATION", 7, 'i', "PUSH_NOTIFICATION");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext DEEP_LINK = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("DEEP_LINK", 8, 'j', "DEEP_LINK");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext AFTER_CALL_PROMO = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("AFTER_CALL_PROMO", 9, 'k', "AFTER_CALL_PROMO");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext SEARCH_SCREEN_PROMO = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("SEARCH_SCREEN_PROMO", 10, 'l', "SEARCH_SCREEN_PROMO");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext BOTTOM_BAR = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("BOTTOM_BAR", 11, 'm', "BOTTOM_BAR");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext PROMO_POPUP = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("PROMO_POPUP", 12, 'n', "PROMO_POPUP");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext PREMIUM_TAB_V2 = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("PREMIUM_TAB_V2", 13, 'o', "PREMIUM_TAB_V2");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext CONVERSATION = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("CONVERSATION", 14, 'p', "CONVERSATION");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext FACS_AFTER_CALL = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("FACS_AFTER_CALL", 15, 'q', "FACS_AFTER_CALL");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext CONTACT_EDIT = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("CONTACT_EDIT", 16, 'r', "nameEditFromContactEditor");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext CONTACT_ADD = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("CONTACT_ADD", 17, 's', "nameSaveFromContactEditor");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext SURVEY_AFTER_CALL = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("SURVEY_AFTER_CALL", 18, 't', "nameSuggestionFromACS");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext SURVEY_DETAILS_VIEW = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("SURVEY_DETAILS_VIEW", 19, 'u', "nameSuggestionFromDV");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext INVITE_FRIENDS = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("INVITE_FRIENDS", 20, 'v', "InviteFriends");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext INVITE_FRIENDS_PREMIUM = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("INVITE_FRIENDS_PREMIUM", 21, 'w', "InviteFriendsPremium");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext STARTUP_PROMO = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("STARTUP_PROMO", 22, 'x', "startupPromo");
    public static final com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext STARTUP_PROMO_PREMIUM = new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext("STARTUP_PROMO_PREMIUM", 23, 'y', "startupPromoPremium");

    private static final /* synthetic */ com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext[] $values() {
        return new com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext[]{UNKNOWN, HOME_SCREEN, INBOX_OVERFLOW, CONTACTS, USER_BUSY_PROMPT, AFTER_CALL, NAVIGATION_DRAWER, PUSH_NOTIFICATION, DEEP_LINK, AFTER_CALL_PROMO, SEARCH_SCREEN_PROMO, BOTTOM_BAR, PROMO_POPUP, PREMIUM_TAB_V2, CONVERSATION, FACS_AFTER_CALL, CONTACT_EDIT, CONTACT_ADD, SURVEY_AFTER_CALL, SURVEY_DETAILS_VIEW, INVITE_FRIENDS, INVITE_FRIENDS_PREMIUM, STARTUP_PROMO, STARTUP_PROMO_PREMIUM};
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kj2.bar] */
    static {
        com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ReferralManager$ReferralLaunchContext(java.lang.String str, int i, char c, java.lang.String str2) {
        this.encodedChar = c;
        this.analyticsContext = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext valueOf(java.lang.String str) {
        return (com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext) java.lang.Enum.valueOf(com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext.class, str);
    }

    public static com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext[] values() {
        return (com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticsContext() {
        return this.analyticsContext;
    }

    public final char getEncodedChar() {
        return this.encodedChar;
    }
}
