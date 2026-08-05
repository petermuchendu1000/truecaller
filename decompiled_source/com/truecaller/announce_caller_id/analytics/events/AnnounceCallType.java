package com.truecaller.announce_caller_id.analytics.events;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/announce_caller_id/analytics/events/AnnounceCallType;", "", "<init>", "(Ljava/lang/String;I)V", "PSTN", "announce-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AnnounceCallType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.announce_caller_id.analytics.events.AnnounceCallType[] $VALUES;
    public static final com.truecaller.announce_caller_id.analytics.events.AnnounceCallType PSTN = new com.truecaller.announce_caller_id.analytics.events.AnnounceCallType("PSTN", 0);

    private static final /* synthetic */ com.truecaller.announce_caller_id.analytics.events.AnnounceCallType[] $values() {
        return new com.truecaller.announce_caller_id.analytics.events.AnnounceCallType[]{PSTN};
    }

    static {
        com.truecaller.announce_caller_id.analytics.events.AnnounceCallType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AnnounceCallType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.announce_caller_id.analytics.events.AnnounceCallType valueOf(java.lang.String str) {
        return (com.truecaller.announce_caller_id.analytics.events.AnnounceCallType) java.lang.Enum.valueOf(com.truecaller.announce_caller_id.analytics.events.AnnounceCallType.class, str);
    }

    public static com.truecaller.announce_caller_id.analytics.events.AnnounceCallType[] values() {
        return (com.truecaller.announce_caller_id.analytics.events.AnnounceCallType[]) $VALUES.clone();
    }
}
