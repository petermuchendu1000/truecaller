package com.truecaller.familyprotect.domain.remotereject.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"com/truecaller/familyprotect/domain/remotereject/analytics/RemoteRejectAnalytics$RemoteRejectNotification", "", "Lcom/truecaller/familyprotect/domain/remotereject/analytics/RemoteRejectAnalytics$RemoteRejectNotification;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ADMIN_MEMBER_ON_SCAM_CALL", "ADMIN_CONNECTING_TO_END", "ADMIN_CALL_ENDED_BY_ADMIN", "ADMIN_CALL_ENDED_BY_OTHER_ADMIN", "ADMIN_CALL_ENDED_BY_MEMBER", "ADMIN_CALL_ENDING_FAILED", "ADMIN_CONNECTION_LOST", "MEMBER_ON_SCAM_CALL", "MEMBER_ADMIN_ENDED_CALL", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RemoteRejectAnalytics$RemoteRejectNotification {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification ADMIN_MEMBER_ON_SCAM_CALL = new com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification("ADMIN_MEMBER_ON_SCAM_CALL", 0, "FPAdminMemberOnCall");
    public static final com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification ADMIN_CONNECTING_TO_END = new com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification("ADMIN_CONNECTING_TO_END", 1, "FPAdminConnectingToEndCall");
    public static final com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification ADMIN_CALL_ENDED_BY_ADMIN = new com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification("ADMIN_CALL_ENDED_BY_ADMIN", 2, "FPAdminCallEndedSuccess");
    public static final com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification ADMIN_CALL_ENDED_BY_OTHER_ADMIN = new com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification("ADMIN_CALL_ENDED_BY_OTHER_ADMIN", 3, "FPAdminCallEndedByOtherAdmin");
    public static final com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification ADMIN_CALL_ENDED_BY_MEMBER = new com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification("ADMIN_CALL_ENDED_BY_MEMBER", 4, "FPAdminCallEndedByMember");
    public static final com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification ADMIN_CALL_ENDING_FAILED = new com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification("ADMIN_CALL_ENDING_FAILED", 5, "FPAdminCallEndedFailure");
    public static final com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification ADMIN_CONNECTION_LOST = new com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification("ADMIN_CONNECTION_LOST", 6, "FPAdminCallConnectionLost");
    public static final com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification MEMBER_ON_SCAM_CALL = new com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification("MEMBER_ON_SCAM_CALL", 7, "FPMemberScamCall");
    public static final com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification MEMBER_ADMIN_ENDED_CALL = new com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification("MEMBER_ADMIN_ENDED_CALL", 8, "FPMemberCallEndedByAdmin");

    private static final /* synthetic */ com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification[] $values() {
        return new com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification[]{ADMIN_MEMBER_ON_SCAM_CALL, ADMIN_CONNECTING_TO_END, ADMIN_CALL_ENDED_BY_ADMIN, ADMIN_CALL_ENDED_BY_OTHER_ADMIN, ADMIN_CALL_ENDED_BY_MEMBER, ADMIN_CALL_ENDING_FAILED, ADMIN_CONNECTION_LOST, MEMBER_ON_SCAM_CALL, MEMBER_ADMIN_ENDED_CALL};
    }

    static {
        com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RemoteRejectAnalytics$RemoteRejectNotification(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification) java.lang.Enum.valueOf(com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification.class, str);
    }

    public static com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification[] values() {
        return (com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
