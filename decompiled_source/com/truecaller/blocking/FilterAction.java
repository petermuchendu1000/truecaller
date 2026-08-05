package com.truecaller.blocking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/blocking/FilterAction;", "", "<init>", "(Ljava/lang/String;I)V", "NONE_FOUND", "ALLOW_WHITELISTED", "FILTER_BLACKLISTED", "FILTER_DISABLED", "FILTER_AUTO_REJECT", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class FilterAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.blocking.FilterAction[] $VALUES;
    public static final com.truecaller.blocking.FilterAction NONE_FOUND = new com.truecaller.blocking.FilterAction("NONE_FOUND", 0);
    public static final com.truecaller.blocking.FilterAction ALLOW_WHITELISTED = new com.truecaller.blocking.FilterAction("ALLOW_WHITELISTED", 1);
    public static final com.truecaller.blocking.FilterAction FILTER_BLACKLISTED = new com.truecaller.blocking.FilterAction("FILTER_BLACKLISTED", 2);
    public static final com.truecaller.blocking.FilterAction FILTER_DISABLED = new com.truecaller.blocking.FilterAction("FILTER_DISABLED", 3);
    public static final com.truecaller.blocking.FilterAction FILTER_AUTO_REJECT = new com.truecaller.blocking.FilterAction("FILTER_AUTO_REJECT", 4);

    private static final /* synthetic */ com.truecaller.blocking.FilterAction[] $values() {
        return new com.truecaller.blocking.FilterAction[]{NONE_FOUND, ALLOW_WHITELISTED, FILTER_BLACKLISTED, FILTER_DISABLED, FILTER_AUTO_REJECT};
    }

    static {
        com.truecaller.blocking.FilterAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FilterAction(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.blocking.FilterAction valueOf(java.lang.String str) {
        return (com.truecaller.blocking.FilterAction) java.lang.Enum.valueOf(com.truecaller.blocking.FilterAction.class, str);
    }

    public static com.truecaller.blocking.FilterAction[] values() {
        return (com.truecaller.blocking.FilterAction[]) $VALUES.clone();
    }
}
