package com.truecaller.messaging.conversation;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum ConversationAction {
    TOP_SAVE(2131233150, 2132017872, 2130971058, 2131362057, 2131362058),
    TOP_BLOCK(2131232234, 2132017741, 2130971058, 2131361977, 2131361979),
    TOP_UNBLOCK(2131232234, 2132017748, 2130971051, 2131362078, 2131362079);


    @androidx.annotation.Nullable
    public java.lang.String dynamicTitle;
    public final int icon;
    public final int menuId;
    public final int textViewId;
    public final int tint;
    public final int title;

    ConversationAction(int i, int i2, int i3, int i4, int i5) {
        this.menuId = i4;
        this.icon = i;
        this.title = i2;
        this.tint = i3;
        this.textViewId = i5;
    }

    @androidx.annotation.Nullable
    public static com.truecaller.messaging.conversation.ConversationAction findById(int i) {
        for (com.truecaller.messaging.conversation.ConversationAction conversationAction : values()) {
            if (conversationAction.menuId == i) {
                return conversationAction;
            }
        }
        return null;
    }

    public static java.util.List<java.lang.Integer> getAllMenuItemIds() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.truecaller.messaging.conversation.ConversationAction[] values = values();
        int length = values.length;
        for (int i = 0; i < length; i = k9.d.k(values[i].menuId, i, 1, arrayList)) {
        }
        return arrayList;
    }
}
