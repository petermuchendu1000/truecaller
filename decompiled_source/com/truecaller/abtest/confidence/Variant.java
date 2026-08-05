package com.truecaller.abtest.confidence;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/abtest/confidence/Variant;", "", "<init>", "(Ljava/lang/String;I)V", "Control", "VariantA", "VariantB", "VariantC", "VariantD", "abtest_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class Variant {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.abtest.confidence.Variant[] $VALUES;
    public static final com.truecaller.abtest.confidence.Variant Control = new com.truecaller.abtest.confidence.Variant("Control", 0);
    public static final com.truecaller.abtest.confidence.Variant VariantA = new com.truecaller.abtest.confidence.Variant("VariantA", 1);
    public static final com.truecaller.abtest.confidence.Variant VariantB = new com.truecaller.abtest.confidence.Variant("VariantB", 2);
    public static final com.truecaller.abtest.confidence.Variant VariantC = new com.truecaller.abtest.confidence.Variant("VariantC", 3);
    public static final com.truecaller.abtest.confidence.Variant VariantD = new com.truecaller.abtest.confidence.Variant("VariantD", 4);

    private static final /* synthetic */ com.truecaller.abtest.confidence.Variant[] $values() {
        return new com.truecaller.abtest.confidence.Variant[]{Control, VariantA, VariantB, VariantC, VariantD};
    }

    static {
        com.truecaller.abtest.confidence.Variant[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Variant(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.abtest.confidence.Variant valueOf(java.lang.String str) {
        return (com.truecaller.abtest.confidence.Variant) java.lang.Enum.valueOf(com.truecaller.abtest.confidence.Variant.class, str);
    }

    public static com.truecaller.abtest.confidence.Variant[] values() {
        return (com.truecaller.abtest.confidence.Variant[]) $VALUES.clone();
    }
}
