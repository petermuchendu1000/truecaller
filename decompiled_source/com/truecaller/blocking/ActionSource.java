package com.truecaller.blocking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/truecaller/blocking/ActionSource;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "TOP_SPAMMER", "UNKNOWN", "NON_PHONEBOOK", "FOREIGN", "NEIGHBOUR_SPOOFING", "BLACKLISTED_NUMBER", "BLACKLISTED_COUNTRY", "BLACKLISTED_WILDCARD", "CUSTOM_WHITELIST", "SPAMMER_FROM_SEARCH", "SPAMMER", "CALLER_NAME", "NUMBER_SERIES", "ASSISTANT_AUTO_REJECT", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ActionSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.blocking.ActionSource[] $VALUES;
    private final int value;
    public static final com.truecaller.blocking.ActionSource NONE = new com.truecaller.blocking.ActionSource("NONE", 0, 0);
    public static final com.truecaller.blocking.ActionSource TOP_SPAMMER = new com.truecaller.blocking.ActionSource("TOP_SPAMMER", 1, 1);
    public static final com.truecaller.blocking.ActionSource UNKNOWN = new com.truecaller.blocking.ActionSource("UNKNOWN", 2, 2);
    public static final com.truecaller.blocking.ActionSource NON_PHONEBOOK = new com.truecaller.blocking.ActionSource("NON_PHONEBOOK", 3, 3);
    public static final com.truecaller.blocking.ActionSource FOREIGN = new com.truecaller.blocking.ActionSource("FOREIGN", 4, 4);
    public static final com.truecaller.blocking.ActionSource NEIGHBOUR_SPOOFING = new com.truecaller.blocking.ActionSource("NEIGHBOUR_SPOOFING", 5, 5);
    public static final com.truecaller.blocking.ActionSource BLACKLISTED_NUMBER = new com.truecaller.blocking.ActionSource("BLACKLISTED_NUMBER", 6, 8);
    public static final com.truecaller.blocking.ActionSource BLACKLISTED_COUNTRY = new com.truecaller.blocking.ActionSource("BLACKLISTED_COUNTRY", 7, 9);
    public static final com.truecaller.blocking.ActionSource BLACKLISTED_WILDCARD = new com.truecaller.blocking.ActionSource("BLACKLISTED_WILDCARD", 8, 10);
    public static final com.truecaller.blocking.ActionSource CUSTOM_WHITELIST = new com.truecaller.blocking.ActionSource("CUSTOM_WHITELIST", 9, 0);
    public static final com.truecaller.blocking.ActionSource SPAMMER_FROM_SEARCH = new com.truecaller.blocking.ActionSource("SPAMMER_FROM_SEARCH", 10, 0);
    public static final com.truecaller.blocking.ActionSource SPAMMER = new com.truecaller.blocking.ActionSource("SPAMMER", 11, 13);
    public static final com.truecaller.blocking.ActionSource CALLER_NAME = new com.truecaller.blocking.ActionSource("CALLER_NAME", 12, 14);
    public static final com.truecaller.blocking.ActionSource NUMBER_SERIES = new com.truecaller.blocking.ActionSource("NUMBER_SERIES", 13, 16);
    public static final com.truecaller.blocking.ActionSource ASSISTANT_AUTO_REJECT = new com.truecaller.blocking.ActionSource("ASSISTANT_AUTO_REJECT", 14, 17);

    private static final /* synthetic */ com.truecaller.blocking.ActionSource[] $values() {
        return new com.truecaller.blocking.ActionSource[]{NONE, TOP_SPAMMER, UNKNOWN, NON_PHONEBOOK, FOREIGN, NEIGHBOUR_SPOOFING, BLACKLISTED_NUMBER, BLACKLISTED_COUNTRY, BLACKLISTED_WILDCARD, CUSTOM_WHITELIST, SPAMMER_FROM_SEARCH, SPAMMER, CALLER_NAME, NUMBER_SERIES, ASSISTANT_AUTO_REJECT};
    }

    static {
        com.truecaller.blocking.ActionSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ActionSource(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.blocking.ActionSource valueOf(java.lang.String str) {
        return (com.truecaller.blocking.ActionSource) java.lang.Enum.valueOf(com.truecaller.blocking.ActionSource.class, str);
    }

    public static com.truecaller.blocking.ActionSource[] values() {
        return (com.truecaller.blocking.ActionSource[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
