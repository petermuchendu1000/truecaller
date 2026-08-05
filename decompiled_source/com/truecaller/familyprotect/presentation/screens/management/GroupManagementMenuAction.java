package com.truecaller.familyprotect.presentation.screens.management;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/truecaller/familyprotect/presentation/screens/management/GroupManagementMenuAction;", "", "textResId", "", "color", "Lcom/truecaller/familyprotect/uicomponents/models/FamilyGroupManagementActionColor;", "iconResId", "showInOverflow", "", "<init>", "(Ljava/lang/String;IILcom/truecaller/familyprotect/uicomponents/models/FamilyGroupManagementActionColor;Ljava/lang/Integer;Z)V", "getTextResId", "()I", "getColor", "()Lcom/truecaller/familyprotect/uicomponents/models/FamilyGroupManagementActionColor;", "getIconResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowInOverflow", "()Z", "SEND_FEEDBACK", "LEAVE_FAMILY_GROUP", "DELETE_FAMILY_GROUP", "LEAVE_FAMILY_PREMIUM", "DISABLE_FAMILY_PROTECTION", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GroupManagementMenuAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction[] $VALUES;
    public static final com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction DELETE_FAMILY_GROUP;
    public static final com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction DISABLE_FAMILY_PROTECTION;
    public static final com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction LEAVE_FAMILY_GROUP;
    public static final com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction LEAVE_FAMILY_PREMIUM;
    public static final com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction SEND_FEEDBACK;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.familyprotect.uicomponents.models.FamilyGroupManagementActionColor color;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer iconResId;
    private final boolean showInOverflow;
    private final int textResId;

    private static final /* synthetic */ com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction[] $values() {
        return new com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction[]{SEND_FEEDBACK, LEAVE_FAMILY_GROUP, DELETE_FAMILY_GROUP, LEAVE_FAMILY_PREMIUM, DISABLE_FAMILY_PROTECTION};
    }

    static {
        com.truecaller.familyprotect.uicomponents.models.FamilyGroupManagementActionColor familyGroupManagementActionColor = com.truecaller.familyprotect.uicomponents.models.FamilyGroupManagementActionColor.REGULAR;
        SEND_FEEDBACK = new com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction("SEND_FEEDBACK", 0, 2132020917, familyGroupManagementActionColor, null, true);
        com.truecaller.familyprotect.uicomponents.models.FamilyGroupManagementActionColor familyGroupManagementActionColor2 = com.truecaller.familyprotect.uicomponents.models.FamilyGroupManagementActionColor.HIGHLIGHTED;
        LEAVE_FAMILY_GROUP = new com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction("LEAVE_FAMILY_GROUP", 1, 2132020915, familyGroupManagementActionColor2, 2131232810, true);
        DELETE_FAMILY_GROUP = new com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction("DELETE_FAMILY_GROUP", 2, 2132020913, familyGroupManagementActionColor2, 2131232516, true);
        LEAVE_FAMILY_PREMIUM = new com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction("LEAVE_FAMILY_PREMIUM", 3, 2132020916, familyGroupManagementActionColor2, 2131232810, true);
        DISABLE_FAMILY_PROTECTION = new com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction("DISABLE_FAMILY_PROTECTION", 4, 2132021139, familyGroupManagementActionColor, 2131232531, true);
        com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private GroupManagementMenuAction(java.lang.String str, int i, int i2, com.truecaller.familyprotect.uicomponents.models.FamilyGroupManagementActionColor familyGroupManagementActionColor, java.lang.Integer num, boolean z) {
        this.textResId = i2;
        this.color = familyGroupManagementActionColor;
        this.iconResId = num;
        this.showInOverflow = z;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction) java.lang.Enum.valueOf(com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction.class, str);
    }

    public static com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction[] values() {
        return (com.truecaller.familyprotect.presentation.screens.management.GroupManagementMenuAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.familyprotect.uicomponents.models.FamilyGroupManagementActionColor getColor() {
        return this.color;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getIconResId() {
        return this.iconResId;
    }

    public final boolean getShowInOverflow() {
        return this.showInOverflow;
    }

    public final int getTextResId() {
        return this.textResId;
    }
}
