package com.truecaller.announce_caller_id.analytics.events;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/announce_caller_id/analytics/events/AnnounceCallIgnoredReason;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN_CALLER", "CALL_BLOCKED", "OTHER", "announce-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AnnounceCallIgnoredReason {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason[] $VALUES;
    public static final com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason UNKNOWN_CALLER = new com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason("UNKNOWN_CALLER", 0);
    public static final com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason CALL_BLOCKED = new com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason("CALL_BLOCKED", 1);
    public static final com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason OTHER = new com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason("OTHER", 2);

    private static final /* synthetic */ com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason[] $values() {
        return new com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason[]{UNKNOWN_CALLER, CALL_BLOCKED, OTHER};
    }

    static {
        com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AnnounceCallIgnoredReason(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason valueOf(java.lang.String str) {
        return (com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason) java.lang.Enum.valueOf(com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason.class, str);
    }

    public static com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason[] values() {
        return (com.truecaller.announce_caller_id.analytics.events.AnnounceCallIgnoredReason[]) $VALUES.clone();
    }
}
