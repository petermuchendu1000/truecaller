package com.truecaller.acs.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/acs/analytics/DismissReason;", "", "<init>", "(Ljava/lang/String;I)V", "EMPTY_SPACE", "BACK_BUTTON", "CLOSE_BUTTON", "SWIPED_TO_DISMISS", "MINIMIZED", "FORCED_UPDATE", "REWARD_PROGRAM_BANNER", "acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DismissReason {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.acs.analytics.DismissReason[] $VALUES;
    public static final com.truecaller.acs.analytics.DismissReason EMPTY_SPACE = new com.truecaller.acs.analytics.DismissReason("EMPTY_SPACE", 0);
    public static final com.truecaller.acs.analytics.DismissReason BACK_BUTTON = new com.truecaller.acs.analytics.DismissReason("BACK_BUTTON", 1);
    public static final com.truecaller.acs.analytics.DismissReason CLOSE_BUTTON = new com.truecaller.acs.analytics.DismissReason("CLOSE_BUTTON", 2);
    public static final com.truecaller.acs.analytics.DismissReason SWIPED_TO_DISMISS = new com.truecaller.acs.analytics.DismissReason("SWIPED_TO_DISMISS", 3);
    public static final com.truecaller.acs.analytics.DismissReason MINIMIZED = new com.truecaller.acs.analytics.DismissReason("MINIMIZED", 4);
    public static final com.truecaller.acs.analytics.DismissReason FORCED_UPDATE = new com.truecaller.acs.analytics.DismissReason("FORCED_UPDATE", 5);
    public static final com.truecaller.acs.analytics.DismissReason REWARD_PROGRAM_BANNER = new com.truecaller.acs.analytics.DismissReason("REWARD_PROGRAM_BANNER", 6);

    private static final /* synthetic */ com.truecaller.acs.analytics.DismissReason[] $values() {
        return new com.truecaller.acs.analytics.DismissReason[]{EMPTY_SPACE, BACK_BUTTON, CLOSE_BUTTON, SWIPED_TO_DISMISS, MINIMIZED, FORCED_UPDATE, REWARD_PROGRAM_BANNER};
    }

    static {
        com.truecaller.acs.analytics.DismissReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DismissReason(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.acs.analytics.DismissReason valueOf(java.lang.String str) {
        return (com.truecaller.acs.analytics.DismissReason) java.lang.Enum.valueOf(com.truecaller.acs.analytics.DismissReason.class, str);
    }

    public static com.truecaller.acs.analytics.DismissReason[] values() {
        return (com.truecaller.acs.analytics.DismissReason[]) $VALUES.clone();
    }
}
