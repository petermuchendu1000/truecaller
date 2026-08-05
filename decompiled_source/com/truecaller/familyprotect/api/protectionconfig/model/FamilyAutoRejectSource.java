package com.truecaller.familyprotect.api.protectionconfig.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/familyprotect/api/protectionconfig/model/FamilyAutoRejectSource;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ak1/bar", "UNKNOWN_SOURCE", "HIDDEN_NUMBERS", "FOREIGN_NUMBERS", "VERIFIED_BUSINESSES", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyAutoRejectSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ak1.bar Companion;
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource UNKNOWN_SOURCE = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource("UNKNOWN_SOURCE", 0);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource HIDDEN_NUMBERS = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource("HIDDEN_NUMBERS", 1);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource FOREIGN_NUMBERS = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource("FOREIGN_NUMBERS", 2);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource VERIFIED_BUSINESSES = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource("VERIFIED_BUSINESSES", 3);

    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource[] $values() {
        return new com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource[]{UNKNOWN_SOURCE, HIDDEN_NUMBERS, FOREIGN_NUMBERS, VERIFIED_BUSINESSES};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ak1.bar, java.lang.Object] */
    static {
        com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private FamilyAutoRejectSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource.class, str);
    }

    public static com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource[] values() {
        return (com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource[]) $VALUES.clone();
    }
}
