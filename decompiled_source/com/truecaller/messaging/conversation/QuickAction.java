package com.truecaller.messaging.conversation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/truecaller/messaging/conversation/QuickAction;", "", "icon", "", "text", "analyticsValue", "", "iconTintColor", "orderPosition", "<init>", "(Ljava/lang/String;IIILjava/lang/String;II)V", "getIcon", "()I", "getText", "getAnalyticsValue", "()Ljava/lang/String;", "getIconTintColor", "getOrderPosition", "CALL", "SAVE_CONTACT", "VIEW_PROFILE", "NEVER_MARK_AS_SPAM", "NEVER_MARK_AS_PROMOTIONAL", "UNBLOCK", "UNBLOCK_NEW", "BLOCK", "MARK_AS_SAFE", "DELETE_ALL_SMS", "REPORT", "NOT_SPAM", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class QuickAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.QuickAction[] $VALUES;
    public static final com.truecaller.messaging.conversation.QuickAction BLOCK;
    public static final com.truecaller.messaging.conversation.QuickAction MARK_AS_SAFE;
    public static final com.truecaller.messaging.conversation.QuickAction NEVER_MARK_AS_PROMOTIONAL;
    public static final com.truecaller.messaging.conversation.QuickAction NEVER_MARK_AS_SPAM;
    public static final com.truecaller.messaging.conversation.QuickAction UNBLOCK;
    public static final com.truecaller.messaging.conversation.QuickAction UNBLOCK_NEW;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsValue;
    private final int icon;
    private final int iconTintColor;
    private final int orderPosition;
    private final int text;
    public static final com.truecaller.messaging.conversation.QuickAction CALL = new com.truecaller.messaging.conversation.QuickAction("CALL", 0, 2131233348, 2132019966, "Call", 0, 2, 8, null);
    public static final com.truecaller.messaging.conversation.QuickAction SAVE_CONTACT = new com.truecaller.messaging.conversation.QuickAction("SAVE_CONTACT", 1, 2131233376, 2132017843, "SaveContact", 0, 5, 8, null);
    public static final com.truecaller.messaging.conversation.QuickAction VIEW_PROFILE = new com.truecaller.messaging.conversation.QuickAction("VIEW_PROFILE", 2, 2131233361, 2132018066, "ViewDetails", 0, 4, 8, null);
    public static final com.truecaller.messaging.conversation.QuickAction DELETE_ALL_SMS = new com.truecaller.messaging.conversation.QuickAction("DELETE_ALL_SMS", 9, 2131232078, 2132017918, "DeleteAllSms", 2130970571, 0, 16, null);
    public static final com.truecaller.messaging.conversation.QuickAction REPORT = new com.truecaller.messaging.conversation.QuickAction("REPORT", 10, 2131233369, 2132017835, "Report", 2130970571, 1);
    public static final com.truecaller.messaging.conversation.QuickAction NOT_SPAM = new com.truecaller.messaging.conversation.QuickAction("NOT_SPAM", 11, 2131233368, 2132017821, "NotSpam", 0, 1, 8, null);

    private static final /* synthetic */ com.truecaller.messaging.conversation.QuickAction[] $values() {
        return new com.truecaller.messaging.conversation.QuickAction[]{CALL, SAVE_CONTACT, VIEW_PROFILE, NEVER_MARK_AS_SPAM, NEVER_MARK_AS_PROMOTIONAL, UNBLOCK, UNBLOCK_NEW, BLOCK, MARK_AS_SAFE, DELETE_ALL_SMS, REPORT, NOT_SPAM};
    }

    static {
        int i = 0;
        NEVER_MARK_AS_SPAM = new com.truecaller.messaging.conversation.QuickAction("NEVER_MARK_AS_SPAM", 3, 2131233479, 2132018250, "NeverMarkAsSpam", 0, i, 24, null);
        int i2 = 0;
        NEVER_MARK_AS_PROMOTIONAL = new com.truecaller.messaging.conversation.QuickAction("NEVER_MARK_AS_PROMOTIONAL", 4, 2131232940, 2132018249, "NeverMarkAsPromotional", i, i2, 24, null);
        int i3 = 0;
        UNBLOCK = new com.truecaller.messaging.conversation.QuickAction("UNBLOCK", 5, 2131233664, 2132019103, "Unblock", i2, i3, 24, null);
        UNBLOCK_NEW = new com.truecaller.messaging.conversation.QuickAction("UNBLOCK_NEW", 6, 2131233665, 2132019103, "Unblock", i3, 0, 24, null);
        int i4 = 0;
        BLOCK = new com.truecaller.messaging.conversation.QuickAction("BLOCK", 7, 2131232075, 2132017204, "Block", 2130970571, i4, 16, null);
        MARK_AS_SAFE = new com.truecaller.messaging.conversation.QuickAction("MARK_AS_SAFE", 8, 2131232080, 2132018159, "MarkAsSafe", i4, 0, 24, null);
        com.truecaller.messaging.conversation.QuickAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private QuickAction(java.lang.String str, int i, int i2, int i3, java.lang.String str2, int i4, int i5) {
        this.icon = i2;
        this.text = i3;
        this.analyticsValue = str2;
        this.iconTintColor = i4;
        this.orderPosition = i5;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.QuickAction valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.QuickAction) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.QuickAction.class, str);
    }

    public static com.truecaller.messaging.conversation.QuickAction[] values() {
        return (com.truecaller.messaging.conversation.QuickAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticsValue() {
        return this.analyticsValue;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getIconTintColor() {
        return this.iconTintColor;
    }

    public final int getOrderPosition() {
        return this.orderPosition;
    }

    public final int getText() {
        return this.text;
    }

    public /* synthetic */ QuickAction(java.lang.String str, int i, int i2, int i3, java.lang.String str2, int i4, int i5, int i6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, str2, (i6 & 8) != 0 ? 2130970634 : i4, (i6 & 16) != 0 ? Integer.MAX_VALUE : i5);
    }
}
