package com.truecaller.premium.familysharing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/truecaller/premium/familysharing/FamilySharingDialogMvp$ScreenType", "", "Lcom/truecaller/premium/familysharing/FamilySharingDialogMvp$ScreenType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ta2/d", "FAMILY_SHARING_PLAN_PURCHASED", "FAMILY_SHARING_ADDED_AS_MEMBER", "FAMILY_SHARING_MEMBERSHIP_REVOKED", "FAMILY_SHARING_MEMBERSHIP_REVOKED_BY_MEMBER", "FAMILY_SHARING_STOP_PLAN", "FAMILY_LEAVE_PLAN_AS_MEMBER", "FAMILY_SHARING_REMOVE_MEMBER", "UNKNOWN", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilySharingDialogMvp$ScreenType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ta2.d Companion;
    public static final com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType FAMILY_SHARING_PLAN_PURCHASED = new com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType("FAMILY_SHARING_PLAN_PURCHASED", 0);
    public static final com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType FAMILY_SHARING_ADDED_AS_MEMBER = new com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType("FAMILY_SHARING_ADDED_AS_MEMBER", 1);
    public static final com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType FAMILY_SHARING_MEMBERSHIP_REVOKED = new com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType("FAMILY_SHARING_MEMBERSHIP_REVOKED", 2);
    public static final com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType FAMILY_SHARING_MEMBERSHIP_REVOKED_BY_MEMBER = new com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType("FAMILY_SHARING_MEMBERSHIP_REVOKED_BY_MEMBER", 3);
    public static final com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType FAMILY_SHARING_STOP_PLAN = new com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType("FAMILY_SHARING_STOP_PLAN", 4);
    public static final com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType FAMILY_LEAVE_PLAN_AS_MEMBER = new com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType("FAMILY_LEAVE_PLAN_AS_MEMBER", 5);
    public static final com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType FAMILY_SHARING_REMOVE_MEMBER = new com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType("FAMILY_SHARING_REMOVE_MEMBER", 6);
    public static final com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType UNKNOWN = new com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType("UNKNOWN", 7);

    private static final /* synthetic */ com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType[] $values() {
        return new com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType[]{FAMILY_SHARING_PLAN_PURCHASED, FAMILY_SHARING_ADDED_AS_MEMBER, FAMILY_SHARING_MEMBERSHIP_REVOKED, FAMILY_SHARING_MEMBERSHIP_REVOKED_BY_MEMBER, FAMILY_SHARING_STOP_PLAN, FAMILY_LEAVE_PLAN_AS_MEMBER, FAMILY_SHARING_REMOVE_MEMBER, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [ta2.d, java.lang.Object] */
    static {
        com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private FamilySharingDialogMvp$ScreenType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return ta2.d.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType valueOf(java.lang.String str) {
        return (com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType) java.lang.Enum.valueOf(com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType.class, str);
    }

    public static com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType[] values() {
        return (com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType[]) $VALUES.clone();
    }
}
