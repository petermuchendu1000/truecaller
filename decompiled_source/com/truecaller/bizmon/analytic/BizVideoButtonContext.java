package com.truecaller.bizmon.analytic;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/bizmon/analytic/BizVideoButtonContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FACS_V2", "PACS_V2", "NEO_FACS_V2", "NEO_PACS_V2", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizVideoButtonContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.analytic.BizVideoButtonContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.bizmon.analytic.BizVideoButtonContext FACS_V2 = new com.truecaller.bizmon.analytic.BizVideoButtonContext("FACS_V2", 0, "FacsV2");
    public static final com.truecaller.bizmon.analytic.BizVideoButtonContext PACS_V2 = new com.truecaller.bizmon.analytic.BizVideoButtonContext("PACS_V2", 1, "PacsV2");
    public static final com.truecaller.bizmon.analytic.BizVideoButtonContext NEO_FACS_V2 = new com.truecaller.bizmon.analytic.BizVideoButtonContext("NEO_FACS_V2", 2, "NeoFacsV2");
    public static final com.truecaller.bizmon.analytic.BizVideoButtonContext NEO_PACS_V2 = new com.truecaller.bizmon.analytic.BizVideoButtonContext("NEO_PACS_V2", 3, "NeoPacsV2");

    private static final /* synthetic */ com.truecaller.bizmon.analytic.BizVideoButtonContext[] $values() {
        return new com.truecaller.bizmon.analytic.BizVideoButtonContext[]{FACS_V2, PACS_V2, NEO_FACS_V2, NEO_PACS_V2};
    }

    static {
        com.truecaller.bizmon.analytic.BizVideoButtonContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BizVideoButtonContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.analytic.BizVideoButtonContext valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.analytic.BizVideoButtonContext) java.lang.Enum.valueOf(com.truecaller.bizmon.analytic.BizVideoButtonContext.class, str);
    }

    public static com.truecaller.bizmon.analytic.BizVideoButtonContext[] values() {
        return (com.truecaller.bizmon.analytic.BizVideoButtonContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
