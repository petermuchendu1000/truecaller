package com.truecaller.familyprotect.uicomponents.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0007\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"com/truecaller/familyprotect/uicomponents/models/FamilyMemberModel$FamilyProtectionMemberModel$Action", "", "Lcom/truecaller/familyprotect/uicomponents/models/FamilyMemberModel$FamilyProtectionMemberModel$Action;", "", "textResId", "iconResId", "", "isTinted", "<init>", "(Ljava/lang/String;IIIZ)V", "I", "getTextResId", "()I", "getIconResId", "Z", "()Z", "LOW_BATTERY_NOTIFICATIONS_ENABLE", "LOW_BATTERY_NOTIFICATIONS_DISABLE", "MAKE_ADMIN", "MAKE_MEMBER", "REMOVE_FROM_GROUP", "REMOVE_FROM_FAMILY_PREMIUM", "DISABLE_FAMILY_PROTECTION", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyMemberModel$FamilyProtectionMemberModel$Action {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action[] $VALUES;
    private final int iconResId;
    private final boolean isTinted;
    private final int textResId;
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action LOW_BATTERY_NOTIFICATIONS_ENABLE = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action("LOW_BATTERY_NOTIFICATIONS_ENABLE", 0, 2132021149, 2131232812, false, 4, null);
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action LOW_BATTERY_NOTIFICATIONS_DISABLE = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action("LOW_BATTERY_NOTIFICATIONS_DISABLE", 1, 2132021148, 2131232811, false, 4, null);
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action MAKE_ADMIN = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action("MAKE_ADMIN", 2, 2132021140, 2131232108, false, 4, null);
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action MAKE_MEMBER = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action("MAKE_MEMBER", 3, 2132021141, 2131233122, true);
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action REMOVE_FROM_GROUP = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action("REMOVE_FROM_GROUP", 4, 2132021142, 2131233121, true);
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action REMOVE_FROM_FAMILY_PREMIUM = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action("REMOVE_FROM_FAMILY_PREMIUM", 5, 2132021143, 2131233121, true);
    public static final com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action DISABLE_FAMILY_PROTECTION = new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action("DISABLE_FAMILY_PROTECTION", 6, 2132021139, 2131232531, true);

    private static final /* synthetic */ com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action[] $values() {
        return new com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action[]{LOW_BATTERY_NOTIFICATIONS_ENABLE, LOW_BATTERY_NOTIFICATIONS_DISABLE, MAKE_ADMIN, MAKE_MEMBER, REMOVE_FROM_GROUP, REMOVE_FROM_FAMILY_PREMIUM, DISABLE_FAMILY_PROTECTION};
    }

    static {
        com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyMemberModel$FamilyProtectionMemberModel$Action(java.lang.String str, int i, int i2, int i3, boolean z) {
        this.textResId = i2;
        this.iconResId = i3;
        this.isTinted = z;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action) java.lang.Enum.valueOf(com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action.class, str);
    }

    public static com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action[] values() {
        return (com.truecaller.familyprotect.uicomponents.models.FamilyMemberModel$FamilyProtectionMemberModel$Action[]) $VALUES.clone();
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final int getTextResId() {
        return this.textResId;
    }

    /* renamed from: isTinted, reason: from getter */
    public final boolean getIsTinted() {
        return this.isTinted;
    }

    public /* synthetic */ FamilyMemberModel$FamilyProtectionMemberModel$Action(java.lang.String str, int i, int i2, int i3, boolean z, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, (i4 & 4) != 0 ? false : z);
    }
}
