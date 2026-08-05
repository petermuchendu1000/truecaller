package com.truecaller.analytics.common.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/truecaller/analytics/common/event/ViewActionEvent$BackupAction", "", "Lcom/truecaller/analytics/common/event/ViewActionEvent$BackupAction;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "BACKUP_NOW", "ACCOUNT_CHANGE", "CONFIRM_ENABLE_BACKUP_WARNING", "CANCEL_ENABLE_BACKUP_WARNING", "DISMISS_ENABLE_BACKUP_WARNING", "CONFIRM_SKIP_RESTORE_WARNING", "CANCEL_SKIP_RESTORE_WARNING", "DISMISS_SKIP_RESTORE_WARNING", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ViewActionEvent$BackupAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$BackupAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.common.event.ViewActionEvent$BackupAction BACKUP_NOW = new com.truecaller.analytics.common.event.ViewActionEvent$BackupAction("BACKUP_NOW", 0, "backupNow");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$BackupAction ACCOUNT_CHANGE = new com.truecaller.analytics.common.event.ViewActionEvent$BackupAction("ACCOUNT_CHANGE", 1, "backupAccountChange");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$BackupAction CONFIRM_ENABLE_BACKUP_WARNING = new com.truecaller.analytics.common.event.ViewActionEvent$BackupAction("CONFIRM_ENABLE_BACKUP_WARNING", 2, "confirmEnableBackupWarning");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$BackupAction CANCEL_ENABLE_BACKUP_WARNING = new com.truecaller.analytics.common.event.ViewActionEvent$BackupAction("CANCEL_ENABLE_BACKUP_WARNING", 3, "cancelEnableBackupWarning");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$BackupAction DISMISS_ENABLE_BACKUP_WARNING = new com.truecaller.analytics.common.event.ViewActionEvent$BackupAction("DISMISS_ENABLE_BACKUP_WARNING", 4, "dismissEnableBackupWarning");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$BackupAction CONFIRM_SKIP_RESTORE_WARNING = new com.truecaller.analytics.common.event.ViewActionEvent$BackupAction("CONFIRM_SKIP_RESTORE_WARNING", 5, "confirmSkipRestoreWarning");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$BackupAction CANCEL_SKIP_RESTORE_WARNING = new com.truecaller.analytics.common.event.ViewActionEvent$BackupAction("CANCEL_SKIP_RESTORE_WARNING", 6, "cancelSkipRestoreWarning");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$BackupAction DISMISS_SKIP_RESTORE_WARNING = new com.truecaller.analytics.common.event.ViewActionEvent$BackupAction("DISMISS_SKIP_RESTORE_WARNING", 7, "dismissSkipRestoreWarning");

    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$BackupAction[] $values() {
        return new com.truecaller.analytics.common.event.ViewActionEvent$BackupAction[]{BACKUP_NOW, ACCOUNT_CHANGE, CONFIRM_ENABLE_BACKUP_WARNING, CANCEL_ENABLE_BACKUP_WARNING, DISMISS_ENABLE_BACKUP_WARNING, CONFIRM_SKIP_RESTORE_WARNING, CANCEL_SKIP_RESTORE_WARNING, DISMISS_SKIP_RESTORE_WARNING};
    }

    static {
        com.truecaller.analytics.common.event.ViewActionEvent$BackupAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ViewActionEvent$BackupAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$BackupAction valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.event.ViewActionEvent$BackupAction) java.lang.Enum.valueOf(com.truecaller.analytics.common.event.ViewActionEvent$BackupAction.class, str);
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$BackupAction[] values() {
        return (com.truecaller.analytics.common.event.ViewActionEvent$BackupAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
