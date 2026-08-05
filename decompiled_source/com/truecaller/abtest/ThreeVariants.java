package com.truecaller.abtest;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/abtest/ThreeVariants;", "", "<init>", "(Ljava/lang/String;I)V", "Control", "VariantA", "VariantB", "abtest_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ThreeVariants {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.abtest.ThreeVariants[] $VALUES;
    public static final com.truecaller.abtest.ThreeVariants Control = new com.truecaller.abtest.ThreeVariants("Control", 0);
    public static final com.truecaller.abtest.ThreeVariants VariantA = new com.truecaller.abtest.ThreeVariants("VariantA", 1);
    public static final com.truecaller.abtest.ThreeVariants VariantB = new com.truecaller.abtest.ThreeVariants("VariantB", 2);

    private static final /* synthetic */ com.truecaller.abtest.ThreeVariants[] $values() {
        return new com.truecaller.abtest.ThreeVariants[]{Control, VariantA, VariantB};
    }

    static {
        com.truecaller.abtest.ThreeVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ThreeVariants(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.abtest.ThreeVariants valueOf(java.lang.String str) {
        return (com.truecaller.abtest.ThreeVariants) java.lang.Enum.valueOf(com.truecaller.abtest.ThreeVariants.class, str);
    }

    public static com.truecaller.abtest.ThreeVariants[] values() {
        return (com.truecaller.abtest.ThreeVariants[]) $VALUES.clone();
    }
}
