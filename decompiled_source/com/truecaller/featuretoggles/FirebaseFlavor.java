package com.truecaller.featuretoggles;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/featuretoggles/FirebaseFlavor;", "", "<init>", "(Ljava/lang/String;I)V", "BOOLEAN", "STRING", "INTEGER", "LONG", "FLOAT", "feature-toggles_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FirebaseFlavor {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.featuretoggles.FirebaseFlavor[] $VALUES;

    @kotlin.a
    public static final com.truecaller.featuretoggles.FirebaseFlavor BOOLEAN = new com.truecaller.featuretoggles.FirebaseFlavor("BOOLEAN", 0);
    public static final com.truecaller.featuretoggles.FirebaseFlavor STRING = new com.truecaller.featuretoggles.FirebaseFlavor("STRING", 1);
    public static final com.truecaller.featuretoggles.FirebaseFlavor INTEGER = new com.truecaller.featuretoggles.FirebaseFlavor("INTEGER", 2);
    public static final com.truecaller.featuretoggles.FirebaseFlavor LONG = new com.truecaller.featuretoggles.FirebaseFlavor("LONG", 3);
    public static final com.truecaller.featuretoggles.FirebaseFlavor FLOAT = new com.truecaller.featuretoggles.FirebaseFlavor("FLOAT", 4);

    private static final /* synthetic */ com.truecaller.featuretoggles.FirebaseFlavor[] $values() {
        return new com.truecaller.featuretoggles.FirebaseFlavor[]{BOOLEAN, STRING, INTEGER, LONG, FLOAT};
    }

    static {
        com.truecaller.featuretoggles.FirebaseFlavor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FirebaseFlavor(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.featuretoggles.FirebaseFlavor valueOf(java.lang.String str) {
        return (com.truecaller.featuretoggles.FirebaseFlavor) java.lang.Enum.valueOf(com.truecaller.featuretoggles.FirebaseFlavor.class, str);
    }

    public static com.truecaller.featuretoggles.FirebaseFlavor[] values() {
        return (com.truecaller.featuretoggles.FirebaseFlavor[]) $VALUES.clone();
    }
}
