package com.truecaller.details_view.ui.actionbutton;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/truecaller/details_view/ui/actionbutton/ActionButton$Type", "", "Lcom/truecaller/details_view/ui/actionbutton/ActionButton$Type;", "<init>", "(Ljava/lang/String;I)V", "CALL", "MESSAGE", "SAVE", "EDIT", "UNBLOCK", "BLOCK", "NOT_SPAM", "PAY", "WHATS_APP", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ActionButton$Type {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.details_view.ui.actionbutton.ActionButton$Type[] $VALUES;
    public static final com.truecaller.details_view.ui.actionbutton.ActionButton$Type CALL = new com.truecaller.details_view.ui.actionbutton.ActionButton$Type("CALL", 0);
    public static final com.truecaller.details_view.ui.actionbutton.ActionButton$Type MESSAGE = new com.truecaller.details_view.ui.actionbutton.ActionButton$Type("MESSAGE", 1);
    public static final com.truecaller.details_view.ui.actionbutton.ActionButton$Type SAVE = new com.truecaller.details_view.ui.actionbutton.ActionButton$Type("SAVE", 2);
    public static final com.truecaller.details_view.ui.actionbutton.ActionButton$Type EDIT = new com.truecaller.details_view.ui.actionbutton.ActionButton$Type("EDIT", 3);
    public static final com.truecaller.details_view.ui.actionbutton.ActionButton$Type UNBLOCK = new com.truecaller.details_view.ui.actionbutton.ActionButton$Type("UNBLOCK", 4);
    public static final com.truecaller.details_view.ui.actionbutton.ActionButton$Type BLOCK = new com.truecaller.details_view.ui.actionbutton.ActionButton$Type("BLOCK", 5);
    public static final com.truecaller.details_view.ui.actionbutton.ActionButton$Type NOT_SPAM = new com.truecaller.details_view.ui.actionbutton.ActionButton$Type("NOT_SPAM", 6);
    public static final com.truecaller.details_view.ui.actionbutton.ActionButton$Type PAY = new com.truecaller.details_view.ui.actionbutton.ActionButton$Type("PAY", 7);
    public static final com.truecaller.details_view.ui.actionbutton.ActionButton$Type WHATS_APP = new com.truecaller.details_view.ui.actionbutton.ActionButton$Type("WHATS_APP", 8);

    private static final /* synthetic */ com.truecaller.details_view.ui.actionbutton.ActionButton$Type[] $values() {
        return new com.truecaller.details_view.ui.actionbutton.ActionButton$Type[]{CALL, MESSAGE, SAVE, EDIT, UNBLOCK, BLOCK, NOT_SPAM, PAY, WHATS_APP};
    }

    static {
        com.truecaller.details_view.ui.actionbutton.ActionButton$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ActionButton$Type(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.details_view.ui.actionbutton.ActionButton$Type valueOf(java.lang.String str) {
        return (com.truecaller.details_view.ui.actionbutton.ActionButton$Type) java.lang.Enum.valueOf(com.truecaller.details_view.ui.actionbutton.ActionButton$Type.class, str);
    }

    public static com.truecaller.details_view.ui.actionbutton.ActionButton$Type[] values() {
        return (com.truecaller.details_view.ui.actionbutton.ActionButton$Type[]) $VALUES.clone();
    }
}
