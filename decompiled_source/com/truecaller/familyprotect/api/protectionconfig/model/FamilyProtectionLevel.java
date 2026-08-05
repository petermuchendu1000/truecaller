package com.truecaller.familyprotect.api.protectionconfig.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/familyprotect/api/protectionconfig/model/FamilyProtectionLevel;", "", "<init>", "(Ljava/lang/String;I)V", "OFF", "BASIC", "MAX", "UNKNOWN", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyProtectionLevel {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel[] $VALUES;
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel OFF = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel("OFF", 0);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel BASIC = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel("BASIC", 1);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel MAX = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel("MAX", 2);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel UNKNOWN = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel("UNKNOWN", 3);

    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel[] $values() {
        return new com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel[]{OFF, BASIC, MAX, UNKNOWN};
    }

    static {
        com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyProtectionLevel(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel.class, str);
    }

    public static com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel[] values() {
        return (com.truecaller.familyprotect.api.protectionconfig.model.FamilyProtectionLevel[]) $VALUES.clone();
    }
}
