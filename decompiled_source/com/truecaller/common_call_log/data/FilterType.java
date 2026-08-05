package com.truecaller.common_call_log.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/common_call_log/data/FilterType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "INCOMING", "OUTGOING", "MISSED", "BLOCKED", "INVALID_ENTRIES", "common-call-log_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class FilterType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common_call_log.data.FilterType[] $VALUES;
    public static final com.truecaller.common_call_log.data.FilterType NONE = new com.truecaller.common_call_log.data.FilterType("NONE", 0);
    public static final com.truecaller.common_call_log.data.FilterType INCOMING = new com.truecaller.common_call_log.data.FilterType("INCOMING", 1);
    public static final com.truecaller.common_call_log.data.FilterType OUTGOING = new com.truecaller.common_call_log.data.FilterType("OUTGOING", 2);
    public static final com.truecaller.common_call_log.data.FilterType MISSED = new com.truecaller.common_call_log.data.FilterType("MISSED", 3);
    public static final com.truecaller.common_call_log.data.FilterType BLOCKED = new com.truecaller.common_call_log.data.FilterType("BLOCKED", 4);
    public static final com.truecaller.common_call_log.data.FilterType INVALID_ENTRIES = new com.truecaller.common_call_log.data.FilterType("INVALID_ENTRIES", 5);

    private static final /* synthetic */ com.truecaller.common_call_log.data.FilterType[] $values() {
        return new com.truecaller.common_call_log.data.FilterType[]{NONE, INCOMING, OUTGOING, MISSED, BLOCKED, INVALID_ENTRIES};
    }

    static {
        com.truecaller.common_call_log.data.FilterType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FilterType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common_call_log.data.FilterType valueOf(java.lang.String str) {
        return (com.truecaller.common_call_log.data.FilterType) java.lang.Enum.valueOf(com.truecaller.common_call_log.data.FilterType.class, str);
    }

    public static com.truecaller.common_call_log.data.FilterType[] values() {
        return (com.truecaller.common_call_log.data.FilterType[]) $VALUES.clone();
    }
}
