package com.truecaller.incallui.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/incallui/utils/NotificationNotShownReason;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "APP_NOTIFICATIONS_DISABLED", "FULLSCREEN_NOTIFICATIONS_DISABLED", "DND_BLOCKING_FULLSCREEN_NOTIFICATIONS", "APP_RESTRICTED_BATTERY_MODE", "BUSINESS_VIDEO_CALLER_ID_AVAILABLE", "incallui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NotificationNotShownReason {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.incallui.utils.NotificationNotShownReason[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.incallui.utils.NotificationNotShownReason APP_NOTIFICATIONS_DISABLED = new com.truecaller.incallui.utils.NotificationNotShownReason("APP_NOTIFICATIONS_DISABLED", 0, "AppNotificationsDisabled");
    public static final com.truecaller.incallui.utils.NotificationNotShownReason FULLSCREEN_NOTIFICATIONS_DISABLED = new com.truecaller.incallui.utils.NotificationNotShownReason("FULLSCREEN_NOTIFICATIONS_DISABLED", 1, "FullscreenNotificationsDisabled");
    public static final com.truecaller.incallui.utils.NotificationNotShownReason DND_BLOCKING_FULLSCREEN_NOTIFICATIONS = new com.truecaller.incallui.utils.NotificationNotShownReason("DND_BLOCKING_FULLSCREEN_NOTIFICATIONS", 2, "DndBlockingFullscreenNotifications");
    public static final com.truecaller.incallui.utils.NotificationNotShownReason APP_RESTRICTED_BATTERY_MODE = new com.truecaller.incallui.utils.NotificationNotShownReason("APP_RESTRICTED_BATTERY_MODE", 3, "AppRestrictedBatteryMode");
    public static final com.truecaller.incallui.utils.NotificationNotShownReason BUSINESS_VIDEO_CALLER_ID_AVAILABLE = new com.truecaller.incallui.utils.NotificationNotShownReason("BUSINESS_VIDEO_CALLER_ID_AVAILABLE", 4, "BusinessVideoCallerIdAvailable");

    private static final /* synthetic */ com.truecaller.incallui.utils.NotificationNotShownReason[] $values() {
        return new com.truecaller.incallui.utils.NotificationNotShownReason[]{APP_NOTIFICATIONS_DISABLED, FULLSCREEN_NOTIFICATIONS_DISABLED, DND_BLOCKING_FULLSCREEN_NOTIFICATIONS, APP_RESTRICTED_BATTERY_MODE, BUSINESS_VIDEO_CALLER_ID_AVAILABLE};
    }

    static {
        com.truecaller.incallui.utils.NotificationNotShownReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NotificationNotShownReason(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.incallui.utils.NotificationNotShownReason valueOf(java.lang.String str) {
        return (com.truecaller.incallui.utils.NotificationNotShownReason) java.lang.Enum.valueOf(com.truecaller.incallui.utils.NotificationNotShownReason.class, str);
    }

    public static com.truecaller.incallui.utils.NotificationNotShownReason[] values() {
        return (com.truecaller.incallui.utils.NotificationNotShownReason[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
