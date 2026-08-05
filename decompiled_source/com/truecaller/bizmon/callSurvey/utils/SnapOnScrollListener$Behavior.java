package com.truecaller.bizmon.callSurvey.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/bizmon/callSurvey/utils/SnapOnScrollListener$Behavior", "", "Lcom/truecaller/bizmon/callSurvey/utils/SnapOnScrollListener$Behavior;", "<init>", "(Ljava/lang/String;I)V", "NOTIFY_ON_SCROLL", "NOTIFY_ON_SCROLL_STATE_IDLE", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class SnapOnScrollListener$Behavior {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.callSurvey.utils.SnapOnScrollListener$Behavior[] $VALUES;
    public static final com.truecaller.bizmon.callSurvey.utils.SnapOnScrollListener$Behavior NOTIFY_ON_SCROLL = new com.truecaller.bizmon.callSurvey.utils.SnapOnScrollListener$Behavior("NOTIFY_ON_SCROLL", 0);
    public static final com.truecaller.bizmon.callSurvey.utils.SnapOnScrollListener$Behavior NOTIFY_ON_SCROLL_STATE_IDLE = new com.truecaller.bizmon.callSurvey.utils.SnapOnScrollListener$Behavior("NOTIFY_ON_SCROLL_STATE_IDLE", 1);

    private static final /* synthetic */ com.truecaller.bizmon.callSurvey.utils.SnapOnScrollListener$Behavior[] $values() {
        return new com.truecaller.bizmon.callSurvey.utils.SnapOnScrollListener$Behavior[]{NOTIFY_ON_SCROLL, NOTIFY_ON_SCROLL_STATE_IDLE};
    }

    static {
        com.truecaller.bizmon.callSurvey.utils.SnapOnScrollListener$Behavior[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SnapOnScrollListener$Behavior(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.callSurvey.utils.SnapOnScrollListener$Behavior valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.callSurvey.utils.SnapOnScrollListener$Behavior) java.lang.Enum.valueOf(com.truecaller.bizmon.callSurvey.utils.SnapOnScrollListener$Behavior.class, str);
    }

    public static com.truecaller.bizmon.callSurvey.utils.SnapOnScrollListener$Behavior[] values() {
        return (com.truecaller.bizmon.callSurvey.utils.SnapOnScrollListener$Behavior[]) $VALUES.clone();
    }
}
