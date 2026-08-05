package com.truecaller.premium.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/premium/util/NotificationAccessSource;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "NOTIFICATION_AUTO_SEARCH", "NOTIFICATION_WHATS_APP", "MISSED_CALL_NOTIFICATION", "BLOCK_CALL_RING_SILENT", "WHATS_APP_CALLS", "SETTINGS", "PREMIUM_TAB", "NOTIFICATION_RING_SILENT", "BOTTOM_BAR_MISSED_CALL_NOTIFICATION", "BOTTOM_BAR_RING_SILENT", "PROMO_BANNER_MISSED_CALL_NOTIFICATION", "PROMO_BANNER_RING_SILENT", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NotificationAccessSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.util.NotificationAccessSource[] $VALUES;
    public static final com.truecaller.premium.util.NotificationAccessSource UNKNOWN = new com.truecaller.premium.util.NotificationAccessSource("UNKNOWN", 0);
    public static final com.truecaller.premium.util.NotificationAccessSource NOTIFICATION_AUTO_SEARCH = new com.truecaller.premium.util.NotificationAccessSource("NOTIFICATION_AUTO_SEARCH", 1);
    public static final com.truecaller.premium.util.NotificationAccessSource NOTIFICATION_WHATS_APP = new com.truecaller.premium.util.NotificationAccessSource("NOTIFICATION_WHATS_APP", 2);
    public static final com.truecaller.premium.util.NotificationAccessSource MISSED_CALL_NOTIFICATION = new com.truecaller.premium.util.NotificationAccessSource("MISSED_CALL_NOTIFICATION", 3);
    public static final com.truecaller.premium.util.NotificationAccessSource BLOCK_CALL_RING_SILENT = new com.truecaller.premium.util.NotificationAccessSource("BLOCK_CALL_RING_SILENT", 4);
    public static final com.truecaller.premium.util.NotificationAccessSource WHATS_APP_CALLS = new com.truecaller.premium.util.NotificationAccessSource("WHATS_APP_CALLS", 5);
    public static final com.truecaller.premium.util.NotificationAccessSource SETTINGS = new com.truecaller.premium.util.NotificationAccessSource("SETTINGS", 6);
    public static final com.truecaller.premium.util.NotificationAccessSource PREMIUM_TAB = new com.truecaller.premium.util.NotificationAccessSource("PREMIUM_TAB", 7);
    public static final com.truecaller.premium.util.NotificationAccessSource NOTIFICATION_RING_SILENT = new com.truecaller.premium.util.NotificationAccessSource("NOTIFICATION_RING_SILENT", 8);
    public static final com.truecaller.premium.util.NotificationAccessSource BOTTOM_BAR_MISSED_CALL_NOTIFICATION = new com.truecaller.premium.util.NotificationAccessSource("BOTTOM_BAR_MISSED_CALL_NOTIFICATION", 9);
    public static final com.truecaller.premium.util.NotificationAccessSource BOTTOM_BAR_RING_SILENT = new com.truecaller.premium.util.NotificationAccessSource("BOTTOM_BAR_RING_SILENT", 10);
    public static final com.truecaller.premium.util.NotificationAccessSource PROMO_BANNER_MISSED_CALL_NOTIFICATION = new com.truecaller.premium.util.NotificationAccessSource("PROMO_BANNER_MISSED_CALL_NOTIFICATION", 11);
    public static final com.truecaller.premium.util.NotificationAccessSource PROMO_BANNER_RING_SILENT = new com.truecaller.premium.util.NotificationAccessSource("PROMO_BANNER_RING_SILENT", 12);

    private static final /* synthetic */ com.truecaller.premium.util.NotificationAccessSource[] $values() {
        return new com.truecaller.premium.util.NotificationAccessSource[]{UNKNOWN, NOTIFICATION_AUTO_SEARCH, NOTIFICATION_WHATS_APP, MISSED_CALL_NOTIFICATION, BLOCK_CALL_RING_SILENT, WHATS_APP_CALLS, SETTINGS, PREMIUM_TAB, NOTIFICATION_RING_SILENT, BOTTOM_BAR_MISSED_CALL_NOTIFICATION, BOTTOM_BAR_RING_SILENT, PROMO_BANNER_MISSED_CALL_NOTIFICATION, PROMO_BANNER_RING_SILENT};
    }

    static {
        com.truecaller.premium.util.NotificationAccessSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NotificationAccessSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.util.NotificationAccessSource valueOf(java.lang.String str) {
        return (com.truecaller.premium.util.NotificationAccessSource) java.lang.Enum.valueOf(com.truecaller.premium.util.NotificationAccessSource.class, str);
    }

    public static com.truecaller.premium.util.NotificationAccessSource[] values() {
        return (com.truecaller.premium.util.NotificationAccessSource[]) $VALUES.clone();
    }
}
