package com.truecaller.familyprotect.uicomponents.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/familyprotect/uicomponents/models/FamilyMemberModel$FamilyPremiumMemberModel$State", "", "Lcom/truecaller/familyprotect/uicomponents/models/FamilyMemberModel$FamilyPremiumMemberModel$State;", "<init>", "(Ljava/lang/String;I)V", "PENDING", "CONFIRMED", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyMemberModel$FamilyPremiumMemberModel$State {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$State[] $VALUES;
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$State PENDING = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$State("PENDING", 0);
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$State CONFIRMED = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$State("CONFIRMED", 1);

    private static final /* synthetic */ com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$State[] $values() {
        return new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$State[]{PENDING, CONFIRMED};
    }

    static {
        com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$State[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyMemberModel$FamilyPremiumMemberModel$State(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$State valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$State) java.lang.Enum.valueOf(com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$State.class, str);
    }

    public static com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$State[] values() {
        return (com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$State[]) $VALUES.clone();
    }
}
