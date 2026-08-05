package com.truecaller.familyprotect.domain.remotereject.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/truecaller/familyprotect/domain/remotereject/analytics/RemoteRejectAnalytics$RemoteRejectNotificationAction", "", "Lcom/truecaller/familyprotect/domain/remotereject/analytics/RemoteRejectAnalytics$RemoteRejectNotificationAction;", "", "action", "<init>", "(Ljava/lang/String;II)V", "I", "getAction", "()I", "CLICKED", "DISMISS", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RemoteRejectAnalytics$RemoteRejectNotificationAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction[] $VALUES;
    public static final com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction CLICKED = new com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction("CLICKED", 0, 1);
    public static final com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction DISMISS = new com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction("DISMISS", 1, 2);
    private final int action;

    private static final /* synthetic */ com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction[] $values() {
        return new com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction[]{CLICKED, DISMISS};
    }

    static {
        com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RemoteRejectAnalytics$RemoteRejectNotificationAction(java.lang.String str, int i, int i2) {
        this.action = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction) java.lang.Enum.valueOf(com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction.class, str);
    }

    public static com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction[] values() {
        return (com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction[]) $VALUES.clone();
    }

    public final int getAction() {
        return this.action;
    }
}
