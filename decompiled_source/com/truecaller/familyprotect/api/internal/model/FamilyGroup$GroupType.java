package com.truecaller.familyprotect.api.internal.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/familyprotect/api/internal/model/FamilyGroup$GroupType", "", "Lcom/truecaller/familyprotect/api/internal/model/FamilyGroup$GroupType;", "<init>", "(Ljava/lang/String;I)V", "PROTECTION_ONLY", "PREMIUM_ONLY", "PROTECTION_AND_PREMIUM", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyGroup$GroupType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType[] $VALUES;
    public static final com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType PROTECTION_ONLY = new com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType("PROTECTION_ONLY", 0);
    public static final com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType PREMIUM_ONLY = new com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType("PREMIUM_ONLY", 1);
    public static final com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType PROTECTION_AND_PREMIUM = new com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType("PROTECTION_AND_PREMIUM", 2);

    private static final /* synthetic */ com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType[] $values() {
        return new com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType[]{PROTECTION_ONLY, PREMIUM_ONLY, PROTECTION_AND_PREMIUM};
    }

    static {
        com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyGroup$GroupType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType.class, str);
    }

    public static com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType[] values() {
        return (com.truecaller.familyprotect.api.internal.model.FamilyGroup$GroupType[]) $VALUES.clone();
    }
}
