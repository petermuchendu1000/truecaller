package com.truecaller.blocking.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/blocking/ui/SpamType;", "", "<init>", "(Ljava/lang/String;I)V", "BUSINESS", "PRIVATE", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class SpamType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.blocking.ui.SpamType[] $VALUES;
    public static final com.truecaller.blocking.ui.SpamType BUSINESS = new com.truecaller.blocking.ui.SpamType("BUSINESS", 0);
    public static final com.truecaller.blocking.ui.SpamType PRIVATE = new com.truecaller.blocking.ui.SpamType("PRIVATE", 1);

    private static final /* synthetic */ com.truecaller.blocking.ui.SpamType[] $values() {
        return new com.truecaller.blocking.ui.SpamType[]{BUSINESS, PRIVATE};
    }

    static {
        com.truecaller.blocking.ui.SpamType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SpamType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.blocking.ui.SpamType valueOf(java.lang.String str) {
        return (com.truecaller.blocking.ui.SpamType) java.lang.Enum.valueOf(com.truecaller.blocking.ui.SpamType.class, str);
    }

    public static com.truecaller.blocking.ui.SpamType[] values() {
        return (com.truecaller.blocking.ui.SpamType[]) $VALUES.clone();
    }
}
