package com.truecaller.acs.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/acs/util/FacsBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "DO_NOTHING", "FACS", "FACS_TOP_LOCK", "FACS_BELOW_LOCK", "acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class FacsBehavior {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.acs.util.FacsBehavior[] $VALUES;
    public static final com.truecaller.acs.util.FacsBehavior DO_NOTHING = new com.truecaller.acs.util.FacsBehavior("DO_NOTHING", 0);
    public static final com.truecaller.acs.util.FacsBehavior FACS = new com.truecaller.acs.util.FacsBehavior("FACS", 1);
    public static final com.truecaller.acs.util.FacsBehavior FACS_TOP_LOCK = new com.truecaller.acs.util.FacsBehavior("FACS_TOP_LOCK", 2);
    public static final com.truecaller.acs.util.FacsBehavior FACS_BELOW_LOCK = new com.truecaller.acs.util.FacsBehavior("FACS_BELOW_LOCK", 3);

    private static final /* synthetic */ com.truecaller.acs.util.FacsBehavior[] $values() {
        return new com.truecaller.acs.util.FacsBehavior[]{DO_NOTHING, FACS, FACS_TOP_LOCK, FACS_BELOW_LOCK};
    }

    static {
        com.truecaller.acs.util.FacsBehavior[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FacsBehavior(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.acs.util.FacsBehavior valueOf(java.lang.String str) {
        return (com.truecaller.acs.util.FacsBehavior) java.lang.Enum.valueOf(com.truecaller.acs.util.FacsBehavior.class, str);
    }

    public static com.truecaller.acs.util.FacsBehavior[] values() {
        return (com.truecaller.acs.util.FacsBehavior[]) $VALUES.clone();
    }
}
