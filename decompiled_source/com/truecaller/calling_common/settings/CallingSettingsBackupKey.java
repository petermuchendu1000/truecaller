package com.truecaller.calling_common.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/calling_common/settings/CallingSettingsBackupKey;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "CALL_LOG_MERGE_STRATEGY", "WHATS_APP_CALLS_ENABLED", "CALL_LOG_TAP_SETTINGS", "KEY_SHOW_FREQUENTLY_CALLED_CONTACTS", "KEY_SHOW_MISSED_CALLS_NOTIFICATIONS", "KEY_SHOW_MISSED_CALLS_NOTIFICATIONS_REMINDER", "calling-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallingSettingsBackupKey {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling_common.settings.CallingSettingsBackupKey[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    public static final com.truecaller.calling_common.settings.CallingSettingsBackupKey CALL_LOG_MERGE_STRATEGY = new com.truecaller.calling_common.settings.CallingSettingsBackupKey("CALL_LOG_MERGE_STRATEGY", 0, "merge_by");
    public static final com.truecaller.calling_common.settings.CallingSettingsBackupKey WHATS_APP_CALLS_ENABLED = new com.truecaller.calling_common.settings.CallingSettingsBackupKey("WHATS_APP_CALLS_ENABLED", 1, "whatsAppCallsEnabled");
    public static final com.truecaller.calling_common.settings.CallingSettingsBackupKey CALL_LOG_TAP_SETTINGS = new com.truecaller.calling_common.settings.CallingSettingsBackupKey("CALL_LOG_TAP_SETTINGS", 2, "callLogTapSettings");
    public static final com.truecaller.calling_common.settings.CallingSettingsBackupKey KEY_SHOW_FREQUENTLY_CALLED_CONTACTS = new com.truecaller.calling_common.settings.CallingSettingsBackupKey("KEY_SHOW_FREQUENTLY_CALLED_CONTACTS", 3, "showFrequentlyCalledContacts");
    public static final com.truecaller.calling_common.settings.CallingSettingsBackupKey KEY_SHOW_MISSED_CALLS_NOTIFICATIONS = new com.truecaller.calling_common.settings.CallingSettingsBackupKey("KEY_SHOW_MISSED_CALLS_NOTIFICATIONS", 4, "showMissedCallsNotifications");
    public static final com.truecaller.calling_common.settings.CallingSettingsBackupKey KEY_SHOW_MISSED_CALLS_NOTIFICATIONS_REMINDER = new com.truecaller.calling_common.settings.CallingSettingsBackupKey("KEY_SHOW_MISSED_CALLS_NOTIFICATIONS_REMINDER", 5, "showMissedCallReminders");

    private static final /* synthetic */ com.truecaller.calling_common.settings.CallingSettingsBackupKey[] $values() {
        return new com.truecaller.calling_common.settings.CallingSettingsBackupKey[]{CALL_LOG_MERGE_STRATEGY, WHATS_APP_CALLS_ENABLED, CALL_LOG_TAP_SETTINGS, KEY_SHOW_FREQUENTLY_CALLED_CONTACTS, KEY_SHOW_MISSED_CALLS_NOTIFICATIONS, KEY_SHOW_MISSED_CALLS_NOTIFICATIONS_REMINDER};
    }

    static {
        com.truecaller.calling_common.settings.CallingSettingsBackupKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallingSettingsBackupKey(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling_common.settings.CallingSettingsBackupKey valueOf(java.lang.String str) {
        return (com.truecaller.calling_common.settings.CallingSettingsBackupKey) java.lang.Enum.valueOf(com.truecaller.calling_common.settings.CallingSettingsBackupKey.class, str);
    }

    public static com.truecaller.calling_common.settings.CallingSettingsBackupKey[] values() {
        return (com.truecaller.calling_common.settings.CallingSettingsBackupKey[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }
}
