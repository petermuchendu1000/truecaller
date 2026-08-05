package com.truecaller.messaging.conversation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010,\u001a\u00020-2\b\b\u0001\u0010\u0004\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006."}, d2 = {"Lcom/truecaller/messaging/conversation/Action;", "", "id", "", "text", "icon", "<init>", "(Ljava/lang/String;IIII)V", "getId", "()I", "getText", "setText", "(I)V", "getIcon", "REPLY", "COPY", "DELETE", "FORWARD", "SHARE", "IMPORTANT", "NOT_IMPORTANT", "REPORT_SPAM", "REPORT_NOT_SPAM", "MARK_AS_SAFE", "OFFER", "NOT_AN_OFFER", "DOWNLOAD", "RESEND_SMS", "EDIT", "SEND_FEEDBACK", "DETAILS", "SELECT_MSGS", "SEND_NOW", "RESCHEDULE", "SHOW_IN_CHAT", "TRANSLATE", "SHOW_ORIGINAL", "VIEW_PDO", "SAVE_CONTACT", "CALL", "OPEN_LINK", "OPEN_MAPS", "MORE", "DEBUG_INFO", "updateText", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Action {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.Action[] $VALUES;
    private final int icon;
    private final int id;
    private int text;
    public static final com.truecaller.messaging.conversation.Action REPLY = new com.truecaller.messaging.conversation.Action("REPLY", 0, 2131361948, 2132018842, 2131233367);
    public static final com.truecaller.messaging.conversation.Action COPY = new com.truecaller.messaging.conversation.Action("COPY", 1, 2131361923, 2132022024, 2131233355);
    public static final com.truecaller.messaging.conversation.Action DELETE = new com.truecaller.messaging.conversation.Action("DELETE", 2, 2131361925, 2132018068, 2131233356);
    public static final com.truecaller.messaging.conversation.Action FORWARD = new com.truecaller.messaging.conversation.Action("FORWARD", 3, 2131361931, 2132017783, 2131233360);
    public static final com.truecaller.messaging.conversation.Action SHARE = new com.truecaller.messaging.conversation.Action("SHARE", 4, 2131361955, 2132017851, 2131233558);
    public static final com.truecaller.messaging.conversation.Action IMPORTANT = new com.truecaller.messaging.conversation.Action("IMPORTANT", 5, 2131361935, 2132017800, 2131233581);
    public static final com.truecaller.messaging.conversation.Action NOT_IMPORTANT = new com.truecaller.messaging.conversation.Action("NOT_IMPORTANT", 6, 2131361941, 2132017890, 2131233580);
    public static final com.truecaller.messaging.conversation.Action REPORT_SPAM = new com.truecaller.messaging.conversation.Action("REPORT_SPAM", 7, 2131361958, 2132017835, 2131233369);
    public static final com.truecaller.messaging.conversation.Action REPORT_NOT_SPAM = new com.truecaller.messaging.conversation.Action("REPORT_NOT_SPAM", 8, 2131361943, 2132017821, 2131233368);
    public static final com.truecaller.messaging.conversation.Action MARK_AS_SAFE = new com.truecaller.messaging.conversation.Action("MARK_AS_SAFE", 9, 2131361934, 2132017804, 2131232081);
    public static final com.truecaller.messaging.conversation.Action OFFER = new com.truecaller.messaging.conversation.Action("OFFER", 10, 2131361947, 2132017838, 2131232938);
    public static final com.truecaller.messaging.conversation.Action NOT_AN_OFFER = new com.truecaller.messaging.conversation.Action("NOT_AN_OFFER", 11, 2131361942, 2132017836, 2131232940);
    public static final com.truecaller.messaging.conversation.Action DOWNLOAD = new com.truecaller.messaging.conversation.Action("DOWNLOAD", 12, 2131361927, 2132022025, 2131233357);
    public static final com.truecaller.messaging.conversation.Action RESEND_SMS = new com.truecaller.messaging.conversation.Action("RESEND_SMS", 13, 2131361950, 2132017767, 2131233363);
    public static final com.truecaller.messaging.conversation.Action EDIT = new com.truecaller.messaging.conversation.Action("EDIT", 14, 2131361928, 2132017763, 2131233358);
    public static final com.truecaller.messaging.conversation.Action SEND_FEEDBACK = new com.truecaller.messaging.conversation.Action("SEND_FEEDBACK", 15, 2131361929, 2132017743, 2131233463);
    public static final com.truecaller.messaging.conversation.Action DETAILS = new com.truecaller.messaging.conversation.Action("DETAILS", 16, 2131361932, 2132017740, 2131233361);
    public static final com.truecaller.messaging.conversation.Action SELECT_MSGS = new com.truecaller.messaging.conversation.Action("SELECT_MSGS", 17, 2131361952, 2132017848, 2131233555);
    public static final com.truecaller.messaging.conversation.Action SEND_NOW = new com.truecaller.messaging.conversation.Action("SEND_NOW", 18, 2131361953, 2132022028, 2131233363);
    public static final com.truecaller.messaging.conversation.Action RESCHEDULE = new com.truecaller.messaging.conversation.Action("RESCHEDULE", 19, 2131361949, 2132022026, 2131233191);
    public static final com.truecaller.messaging.conversation.Action SHOW_IN_CHAT = new com.truecaller.messaging.conversation.Action("SHOW_IN_CHAT", 20, 2131361956, 2132022030, 2131233250);
    public static final com.truecaller.messaging.conversation.Action TRANSLATE = new com.truecaller.messaging.conversation.Action("TRANSLATE", 21, 2131361962, 2132017874, 2131233636);
    public static final com.truecaller.messaging.conversation.Action SHOW_ORIGINAL = new com.truecaller.messaging.conversation.Action("SHOW_ORIGINAL", 22, 2131361957, 2132017852, 2131233636);
    public static final com.truecaller.messaging.conversation.Action VIEW_PDO = new com.truecaller.messaging.conversation.Action("VIEW_PDO", 23, 2131361965, 2132017892, 2131233361);
    public static final com.truecaller.messaging.conversation.Action SAVE_CONTACT = new com.truecaller.messaging.conversation.Action("SAVE_CONTACT", 24, 2131361921, 2132017872, 2131233376);
    public static final com.truecaller.messaging.conversation.Action CALL = new com.truecaller.messaging.conversation.Action("CALL", 25, 2131361945, 2132017733, 2131233348);
    public static final com.truecaller.messaging.conversation.Action OPEN_LINK = new com.truecaller.messaging.conversation.Action("OPEN_LINK", 26, 2131361966, 2132017826, 2131233365);
    public static final com.truecaller.messaging.conversation.Action OPEN_MAPS = new com.truecaller.messaging.conversation.Action("OPEN_MAPS", 27, 2131361933, 2132017828, 2131233438);
    public static final com.truecaller.messaging.conversation.Action MORE = new com.truecaller.messaging.conversation.Action("MORE", 28, 0, 2132017817, 2131233499);
    public static final com.truecaller.messaging.conversation.Action DEBUG_INFO = new com.truecaller.messaging.conversation.Action("DEBUG_INFO", 29, 2131361924, 2132017809, 2131233361);

    private static final /* synthetic */ com.truecaller.messaging.conversation.Action[] $values() {
        return new com.truecaller.messaging.conversation.Action[]{REPLY, COPY, DELETE, FORWARD, SHARE, IMPORTANT, NOT_IMPORTANT, REPORT_SPAM, REPORT_NOT_SPAM, MARK_AS_SAFE, OFFER, NOT_AN_OFFER, DOWNLOAD, RESEND_SMS, EDIT, SEND_FEEDBACK, DETAILS, SELECT_MSGS, SEND_NOW, RESCHEDULE, SHOW_IN_CHAT, TRANSLATE, SHOW_ORIGINAL, VIEW_PDO, SAVE_CONTACT, CALL, OPEN_LINK, OPEN_MAPS, MORE, DEBUG_INFO};
    }

    static {
        com.truecaller.messaging.conversation.Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Action(java.lang.String str, int i, int i2, int i3, int i4) {
        this.id = i2;
        this.text = i3;
        this.icon = i4;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.Action valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.Action) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.Action.class, str);
    }

    public static com.truecaller.messaging.conversation.Action[] values() {
        return (com.truecaller.messaging.conversation.Action[]) $VALUES.clone();
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    public final int getText() {
        return this.text;
    }

    public final void setText(int i) {
        this.text = i;
    }

    public final void updateText(int text) {
        this.text = text;
    }
}
