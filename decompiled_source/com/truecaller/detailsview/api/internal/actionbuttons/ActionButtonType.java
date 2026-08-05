package com.truecaller.detailsview.api.internal.actionbuttons;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/detailsview/api/internal/actionbuttons/ActionButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "Call", "Message", "Save", "Edit", "Block", "Unblock", "NotSpam", "Pay", "WhatsApp", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ActionButtonType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType[] $VALUES;
    public static final com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType Call = new com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType("Call", 0);
    public static final com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType Message = new com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType("Message", 1);
    public static final com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType Save = new com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType("Save", 2);
    public static final com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType Edit = new com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType("Edit", 3);
    public static final com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType Block = new com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType("Block", 4);
    public static final com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType Unblock = new com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType("Unblock", 5);
    public static final com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType NotSpam = new com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType("NotSpam", 6);
    public static final com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType Pay = new com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType("Pay", 7);
    public static final com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType WhatsApp = new com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType("WhatsApp", 8);

    private static final /* synthetic */ com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType[] $values() {
        return new com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType[]{Call, Message, Save, Edit, Block, Unblock, NotSpam, Pay, WhatsApp};
    }

    static {
        com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ActionButtonType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType valueOf(java.lang.String str) {
        return (com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType) java.lang.Enum.valueOf(com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType.class, str);
    }

    public static com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType[] values() {
        return (com.truecaller.detailsview.api.internal.actionbuttons.ActionButtonType[]) $VALUES.clone();
    }
}
