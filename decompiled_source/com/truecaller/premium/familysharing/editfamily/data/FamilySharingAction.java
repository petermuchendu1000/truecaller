package com.truecaller.premium.familysharing.editfamily.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/premium/familysharing/editfamily/data/FamilySharingAction;", "", "actionRes", "", "actionTint", "<init>", "(Ljava/lang/String;III)V", "getActionRes", "()I", "getActionTint", "ACTION_MEMBER_DETAIL", "ACTION_REMOVE", "ACTION_EXIT_FAMILY", "ACTION_CHAT_WITH_OWNER", "NO_ACTION", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilySharingAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction[] $VALUES;
    private final int actionRes;
    private final int actionTint;
    public static final com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction ACTION_MEMBER_DETAIL = new com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction("ACTION_MEMBER_DETAIL", 0, 0, 0, 2, null);
    public static final com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction ACTION_REMOVE = new com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction("ACTION_REMOVE", 1, 2131233125, 2130970936);
    public static final com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction ACTION_EXIT_FAMILY = new com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction("ACTION_EXIT_FAMILY", 2, 2131232679, 2130970935);
    public static final com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction ACTION_CHAT_WITH_OWNER = new com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction("ACTION_CHAT_WITH_OWNER", 3, 2131233363, 2130970634);
    public static final com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction NO_ACTION = new com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction("NO_ACTION", 4, 0, 0, 2, null);

    private static final /* synthetic */ com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction[] $values() {
        return new com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction[]{ACTION_MEMBER_DETAIL, ACTION_REMOVE, ACTION_EXIT_FAMILY, ACTION_CHAT_WITH_OWNER, NO_ACTION};
    }

    static {
        com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilySharingAction(java.lang.String str, int i, int i2, int i3) {
        this.actionRes = i2;
        this.actionTint = i3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction valueOf(java.lang.String str) {
        return (com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction) java.lang.Enum.valueOf(com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction.class, str);
    }

    public static com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction[] values() {
        return (com.truecaller.premium.familysharing.editfamily.data.FamilySharingAction[]) $VALUES.clone();
    }

    public final int getActionRes() {
        return this.actionRes;
    }

    public final int getActionTint() {
        return this.actionTint;
    }

    public /* synthetic */ FamilySharingAction(java.lang.String str, int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i4 & 2) != 0 ? 0 : i3);
    }
}
