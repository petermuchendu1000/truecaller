package com.truecaller.bottombar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/bottombar/BottomBarButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "CALLS", "MESSAGES", "BLOCKING", "FAMILY_PROTECTION_CONFIG", "PREMIUM", "ASSISTANT", "INVITE", "SCAM_FEED", "VOICEMAIL", "bottom-bar-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BottomBarButtonType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bottombar.BottomBarButtonType[] $VALUES;
    public static final com.truecaller.bottombar.BottomBarButtonType CALLS = new com.truecaller.bottombar.BottomBarButtonType("CALLS", 0);
    public static final com.truecaller.bottombar.BottomBarButtonType MESSAGES = new com.truecaller.bottombar.BottomBarButtonType("MESSAGES", 1);
    public static final com.truecaller.bottombar.BottomBarButtonType BLOCKING = new com.truecaller.bottombar.BottomBarButtonType("BLOCKING", 2);
    public static final com.truecaller.bottombar.BottomBarButtonType FAMILY_PROTECTION_CONFIG = new com.truecaller.bottombar.BottomBarButtonType("FAMILY_PROTECTION_CONFIG", 3);
    public static final com.truecaller.bottombar.BottomBarButtonType PREMIUM = new com.truecaller.bottombar.BottomBarButtonType("PREMIUM", 4);
    public static final com.truecaller.bottombar.BottomBarButtonType ASSISTANT = new com.truecaller.bottombar.BottomBarButtonType("ASSISTANT", 5);
    public static final com.truecaller.bottombar.BottomBarButtonType INVITE = new com.truecaller.bottombar.BottomBarButtonType("INVITE", 6);
    public static final com.truecaller.bottombar.BottomBarButtonType SCAM_FEED = new com.truecaller.bottombar.BottomBarButtonType("SCAM_FEED", 7);
    public static final com.truecaller.bottombar.BottomBarButtonType VOICEMAIL = new com.truecaller.bottombar.BottomBarButtonType("VOICEMAIL", 8);

    private static final /* synthetic */ com.truecaller.bottombar.BottomBarButtonType[] $values() {
        return new com.truecaller.bottombar.BottomBarButtonType[]{CALLS, MESSAGES, BLOCKING, FAMILY_PROTECTION_CONFIG, PREMIUM, ASSISTANT, INVITE, SCAM_FEED, VOICEMAIL};
    }

    static {
        com.truecaller.bottombar.BottomBarButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BottomBarButtonType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bottombar.BottomBarButtonType valueOf(java.lang.String str) {
        return (com.truecaller.bottombar.BottomBarButtonType) java.lang.Enum.valueOf(com.truecaller.bottombar.BottomBarButtonType.class, str);
    }

    public static com.truecaller.bottombar.BottomBarButtonType[] values() {
        return (com.truecaller.bottombar.BottomBarButtonType[]) $VALUES.clone();
    }
}
