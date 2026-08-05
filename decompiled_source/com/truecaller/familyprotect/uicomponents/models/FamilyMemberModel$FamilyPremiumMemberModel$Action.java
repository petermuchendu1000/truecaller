package com.truecaller.familyprotect.uicomponents.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"com/truecaller/familyprotect/uicomponents/models/FamilyMemberModel$FamilyPremiumMemberModel$Action", "", "Lcom/truecaller/familyprotect/uicomponents/models/FamilyMemberModel$FamilyPremiumMemberModel$Action;", "", "textResId", "iconResId", "Lcom/truecaller/familyprotect/uicomponents/models/FamilyGroupManagementActionColor;", "color", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;Lcom/truecaller/familyprotect/uicomponents/models/FamilyGroupManagementActionColor;)V", "I", "getTextResId", "()I", "Ljava/lang/Integer;", "getIconResId", "()Ljava/lang/Integer;", "Lcom/truecaller/familyprotect/uicomponents/models/FamilyGroupManagementActionColor;", "getColor", "()Lcom/truecaller/familyprotect/uicomponents/models/FamilyGroupManagementActionColor;", "REMOVE_FROM_FAMILY_PREMIUM", "INVITE_TO_FAMILY_PROTECTION", "DISABLE_FAMILY_PROTECTION", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyMemberModel$FamilyPremiumMemberModel$Action {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action[] $VALUES;
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action DISABLE_FAMILY_PROTECTION;
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action INVITE_TO_FAMILY_PROTECTION;
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action REMOVE_FROM_FAMILY_PREMIUM = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action("REMOVE_FROM_FAMILY_PREMIUM", 0, 2132021143, 2131233121, com.truecaller.familyprotect.uicomponents.models.FamilyGroupManagementActionColor.HIGHLIGHTED);

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.familyprotect.uicomponents.models.FamilyGroupManagementActionColor color;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer iconResId;
    private final int textResId;

    private static final /* synthetic */ com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action[] $values() {
        return new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action[]{REMOVE_FROM_FAMILY_PREMIUM, INVITE_TO_FAMILY_PROTECTION, DISABLE_FAMILY_PROTECTION};
    }

    static {
        com.truecaller.familyprotect.uicomponents.models.FamilyGroupManagementActionColor familyGroupManagementActionColor = com.truecaller.familyprotect.uicomponents.models.FamilyGroupManagementActionColor.REGULAR;
        INVITE_TO_FAMILY_PROTECTION = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action("INVITE_TO_FAMILY_PROTECTION", 1, 2132020914, 2131232776, familyGroupManagementActionColor);
        DISABLE_FAMILY_PROTECTION = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action("DISABLE_FAMILY_PROTECTION", 2, 2132021139, 2131232531, familyGroupManagementActionColor);
        com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyMemberModel$FamilyPremiumMemberModel$Action(java.lang.String str, int i, int i2, java.lang.Integer num, com.truecaller.familyprotect.uicomponents.models.FamilyGroupManagementActionColor familyGroupManagementActionColor) {
        this.textResId = i2;
        this.iconResId = num;
        this.color = familyGroupManagementActionColor;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action) java.lang.Enum.valueOf(com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action.class, str);
    }

    public static com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action[] values() {
        return (com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyPremiumMemberModel$Action[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.familyprotect.uicomponents.models.FamilyGroupManagementActionColor getColor() {
        return this.color;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getIconResId() {
        return this.iconResId;
    }

    public final int getTextResId() {
        return this.textResId;
    }
}
