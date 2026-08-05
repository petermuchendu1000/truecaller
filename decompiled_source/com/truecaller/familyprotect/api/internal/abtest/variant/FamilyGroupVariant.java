package com.truecaller.familyprotect.api.internal.abtest.variant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/familyprotect/api/internal/abtest/variant/FamilyGroupVariant;", "", "<init>", "(Ljava/lang/String;I)V", "CONTROL", "VARIANT_A", "VARIANT_B", "VARIANT_C", "VARIANT_D", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyGroupVariant {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant[] $VALUES;
    public static final com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant CONTROL = new com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant("CONTROL", 0);
    public static final com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant VARIANT_A = new com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant("VARIANT_A", 1);
    public static final com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant VARIANT_B = new com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant("VARIANT_B", 2);
    public static final com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant VARIANT_C = new com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant("VARIANT_C", 3);
    public static final com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant VARIANT_D = new com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant("VARIANT_D", 4);

    private static final /* synthetic */ com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant[] $values() {
        return new com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant[]{CONTROL, VARIANT_A, VARIANT_B, VARIANT_C, VARIANT_D};
    }

    static {
        com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyGroupVariant(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant.class, str);
    }

    public static com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant[] values() {
        return (com.truecaller.familyprotect.api.internal.abtest.variant.FamilyGroupVariant[]) $VALUES.clone();
    }
}
