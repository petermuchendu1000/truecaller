package com.truecaller.cloudtelephony.callrecording.ui.list;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/ui/list/CallRecordingListAnalyticsContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CALL_LOG", "USER_PROFILE", "PREMIUM_TAB", "PUSH", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallRecordingListAnalyticsContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext CALL_LOG = new com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext("CALL_LOG", 0, "callLog");
    public static final com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext USER_PROFILE = new com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext("USER_PROFILE", 1, "userProfile");
    public static final com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext PREMIUM_TAB = new com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext("PREMIUM_TAB", 2, "premiumTab");
    public static final com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext PUSH = new com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext("PUSH", 3, "push");

    private static final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext[] $values() {
        return new com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext[]{CALL_LOG, USER_PROFILE, PREMIUM_TAB, PUSH};
    }

    static {
        com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallRecordingListAnalyticsContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext valueOf(java.lang.String str) {
        return (com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext) java.lang.Enum.valueOf(com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext.class, str);
    }

    public static com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext[] values() {
        return (com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingListAnalyticsContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
