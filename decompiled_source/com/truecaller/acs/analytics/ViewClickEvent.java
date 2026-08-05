package com.truecaller.acs.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/truecaller/acs/analytics/ViewClickEvent;", "", "<init>", "(Ljava/lang/String;I)V", "VIEW_PROFILE", "VIEW_PROFILE_HEADER", "VIEW_PROFILE_HEADER_WITH_COMMENTS", "VIEW_PROFILE_WITH_COMMENTS", "CALL", "SMS", "SAVE_CONTACT", "EDIT_CONTACT", "BLOCK", "UNBLOCK", "EDIT_NAME", "SUGGEST_NAME", "FEEDBACK_POSITIVE", "FEEDBACK_NEGATIVE", "WARN_FRIENDS", "BUSINESS_POSITIVE", "BUSINESS_NEGATIVE", "NOT_SPAM", "WHATSAPP", "BLOCK_NAME_PROMO_BANNER", "acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ViewClickEvent {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.acs.analytics.ViewClickEvent[] $VALUES;
    public static final com.truecaller.acs.analytics.ViewClickEvent VIEW_PROFILE = new com.truecaller.acs.analytics.ViewClickEvent("VIEW_PROFILE", 0);
    public static final com.truecaller.acs.analytics.ViewClickEvent VIEW_PROFILE_HEADER = new com.truecaller.acs.analytics.ViewClickEvent("VIEW_PROFILE_HEADER", 1);
    public static final com.truecaller.acs.analytics.ViewClickEvent VIEW_PROFILE_HEADER_WITH_COMMENTS = new com.truecaller.acs.analytics.ViewClickEvent("VIEW_PROFILE_HEADER_WITH_COMMENTS", 2);
    public static final com.truecaller.acs.analytics.ViewClickEvent VIEW_PROFILE_WITH_COMMENTS = new com.truecaller.acs.analytics.ViewClickEvent("VIEW_PROFILE_WITH_COMMENTS", 3);
    public static final com.truecaller.acs.analytics.ViewClickEvent CALL = new com.truecaller.acs.analytics.ViewClickEvent("CALL", 4);
    public static final com.truecaller.acs.analytics.ViewClickEvent SMS = new com.truecaller.acs.analytics.ViewClickEvent("SMS", 5);
    public static final com.truecaller.acs.analytics.ViewClickEvent SAVE_CONTACT = new com.truecaller.acs.analytics.ViewClickEvent("SAVE_CONTACT", 6);
    public static final com.truecaller.acs.analytics.ViewClickEvent EDIT_CONTACT = new com.truecaller.acs.analytics.ViewClickEvent("EDIT_CONTACT", 7);
    public static final com.truecaller.acs.analytics.ViewClickEvent BLOCK = new com.truecaller.acs.analytics.ViewClickEvent("BLOCK", 8);
    public static final com.truecaller.acs.analytics.ViewClickEvent UNBLOCK = new com.truecaller.acs.analytics.ViewClickEvent("UNBLOCK", 9);
    public static final com.truecaller.acs.analytics.ViewClickEvent EDIT_NAME = new com.truecaller.acs.analytics.ViewClickEvent("EDIT_NAME", 10);
    public static final com.truecaller.acs.analytics.ViewClickEvent SUGGEST_NAME = new com.truecaller.acs.analytics.ViewClickEvent("SUGGEST_NAME", 11);
    public static final com.truecaller.acs.analytics.ViewClickEvent FEEDBACK_POSITIVE = new com.truecaller.acs.analytics.ViewClickEvent("FEEDBACK_POSITIVE", 12);
    public static final com.truecaller.acs.analytics.ViewClickEvent FEEDBACK_NEGATIVE = new com.truecaller.acs.analytics.ViewClickEvent("FEEDBACK_NEGATIVE", 13);
    public static final com.truecaller.acs.analytics.ViewClickEvent WARN_FRIENDS = new com.truecaller.acs.analytics.ViewClickEvent("WARN_FRIENDS", 14);
    public static final com.truecaller.acs.analytics.ViewClickEvent BUSINESS_POSITIVE = new com.truecaller.acs.analytics.ViewClickEvent("BUSINESS_POSITIVE", 15);
    public static final com.truecaller.acs.analytics.ViewClickEvent BUSINESS_NEGATIVE = new com.truecaller.acs.analytics.ViewClickEvent("BUSINESS_NEGATIVE", 16);
    public static final com.truecaller.acs.analytics.ViewClickEvent NOT_SPAM = new com.truecaller.acs.analytics.ViewClickEvent("NOT_SPAM", 17);
    public static final com.truecaller.acs.analytics.ViewClickEvent WHATSAPP = new com.truecaller.acs.analytics.ViewClickEvent("WHATSAPP", 18);
    public static final com.truecaller.acs.analytics.ViewClickEvent BLOCK_NAME_PROMO_BANNER = new com.truecaller.acs.analytics.ViewClickEvent("BLOCK_NAME_PROMO_BANNER", 19);

    private static final /* synthetic */ com.truecaller.acs.analytics.ViewClickEvent[] $values() {
        return new com.truecaller.acs.analytics.ViewClickEvent[]{VIEW_PROFILE, VIEW_PROFILE_HEADER, VIEW_PROFILE_HEADER_WITH_COMMENTS, VIEW_PROFILE_WITH_COMMENTS, CALL, SMS, SAVE_CONTACT, EDIT_CONTACT, BLOCK, UNBLOCK, EDIT_NAME, SUGGEST_NAME, FEEDBACK_POSITIVE, FEEDBACK_NEGATIVE, WARN_FRIENDS, BUSINESS_POSITIVE, BUSINESS_NEGATIVE, NOT_SPAM, WHATSAPP, BLOCK_NAME_PROMO_BANNER};
    }

    static {
        com.truecaller.acs.analytics.ViewClickEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ViewClickEvent(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.acs.analytics.ViewClickEvent valueOf(java.lang.String str) {
        return (com.truecaller.acs.analytics.ViewClickEvent) java.lang.Enum.valueOf(com.truecaller.acs.analytics.ViewClickEvent.class, str);
    }

    public static com.truecaller.acs.analytics.ViewClickEvent[] values() {
        return (com.truecaller.acs.analytics.ViewClickEvent[]) $VALUES.clone();
    }
}
