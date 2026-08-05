package com.truecaller.calllog.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/calllog/api/FilterType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "INCOMING", "OUTGOING", "MISSED", "BLOCKED_AND_SPAM", "RECORDINGS", "VERIFIED_BUSINESS", "NOT_SPAM", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class FilterType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calllog.api.FilterType[] $VALUES;
    public static final com.truecaller.calllog.api.FilterType NONE = new com.truecaller.calllog.api.FilterType("NONE", 0);
    public static final com.truecaller.calllog.api.FilterType INCOMING = new com.truecaller.calllog.api.FilterType("INCOMING", 1);
    public static final com.truecaller.calllog.api.FilterType OUTGOING = new com.truecaller.calllog.api.FilterType("OUTGOING", 2);
    public static final com.truecaller.calllog.api.FilterType MISSED = new com.truecaller.calllog.api.FilterType("MISSED", 3);
    public static final com.truecaller.calllog.api.FilterType BLOCKED_AND_SPAM = new com.truecaller.calllog.api.FilterType("BLOCKED_AND_SPAM", 4);
    public static final com.truecaller.calllog.api.FilterType RECORDINGS = new com.truecaller.calllog.api.FilterType("RECORDINGS", 5);
    public static final com.truecaller.calllog.api.FilterType VERIFIED_BUSINESS = new com.truecaller.calllog.api.FilterType("VERIFIED_BUSINESS", 6);
    public static final com.truecaller.calllog.api.FilterType NOT_SPAM = new com.truecaller.calllog.api.FilterType("NOT_SPAM", 7);

    private static final /* synthetic */ com.truecaller.calllog.api.FilterType[] $values() {
        return new com.truecaller.calllog.api.FilterType[]{NONE, INCOMING, OUTGOING, MISSED, BLOCKED_AND_SPAM, RECORDINGS, VERIFIED_BUSINESS, NOT_SPAM};
    }

    static {
        com.truecaller.calllog.api.FilterType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FilterType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calllog.api.FilterType valueOf(java.lang.String str) {
        return (com.truecaller.calllog.api.FilterType) java.lang.Enum.valueOf(com.truecaller.calllog.api.FilterType.class, str);
    }

    public static com.truecaller.calllog.api.FilterType[] values() {
        return (com.truecaller.calllog.api.FilterType[]) $VALUES.clone();
    }
}
