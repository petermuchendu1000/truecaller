package com.truecaller.familyprotect.api.internal.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/truecaller/familyprotect/api/internal/analytics/FamilyGroupAnalytics$PushNotificationId", "", "Lcom/truecaller/familyprotect/api/internal/analytics/FamilyGroupAnalytics$PushNotificationId;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "INVITE_RECEIVED", "INVITE_NUDGE", "PROMOTED_TO_ADMIN", "MEMBER_REMOVED", "DEMOTED_FROM_ADMIN", "LOW_BATTERY", "WEEKLY_STATISTICS_REPORT", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyGroupAnalytics$PushNotificationId {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId INVITE_RECEIVED = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId("INVITE_RECEIVED", 0, "FPInviteReceived");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId INVITE_NUDGE = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId("INVITE_NUDGE", 1, "FPInviteNudge");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId PROMOTED_TO_ADMIN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId("PROMOTED_TO_ADMIN", 2, "FPPromotedToAdmin");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId MEMBER_REMOVED = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId("MEMBER_REMOVED", 3, "FPMemberRemoved");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId DEMOTED_FROM_ADMIN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId("DEMOTED_FROM_ADMIN", 4, "FPDemotedToMember");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId LOW_BATTERY = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId("LOW_BATTERY", 5, "FPAdminLowBatteryAlert");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId WEEKLY_STATISTICS_REPORT = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId("WEEKLY_STATISTICS_REPORT", 6, "FPWeeklyReportReady");

    private static final /* synthetic */ com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId[] $values() {
        return new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId[]{INVITE_RECEIVED, INVITE_NUDGE, PROMOTED_TO_ADMIN, MEMBER_REMOVED, DEMOTED_FROM_ADMIN, LOW_BATTERY, WEEKLY_STATISTICS_REPORT};
    }

    static {
        com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyGroupAnalytics$PushNotificationId(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId.class, str);
    }

    public static com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId[] values() {
        return (com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
