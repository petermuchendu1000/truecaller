package com.truecaller.familyprotect.uicomponents.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/familyprotect/uicomponents/models/FamilyMemberModel$FamilyProtectionMemberModel$Os", "", "Lcom/truecaller/familyprotect/uicomponents/models/FamilyMemberModel$FamilyProtectionMemberModel$Os;", "<init>", "(Ljava/lang/String;I)V", "ANDROID", "IOS", "UNKNOWN", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyMemberModel$FamilyProtectionMemberModel$Os {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os[] $VALUES;
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os ANDROID = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os("ANDROID", 0);
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os IOS = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os("IOS", 1);
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os UNKNOWN = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os("UNKNOWN", 2);

    private static final /* synthetic */ com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os[] $values() {
        return new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os[]{ANDROID, IOS, UNKNOWN};
    }

    static {
        com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyMemberModel$FamilyProtectionMemberModel$Os(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os) java.lang.Enum.valueOf(com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os.class, str);
    }

    public static com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os[] values() {
        return (com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Os[]) $VALUES.clone();
    }
}
