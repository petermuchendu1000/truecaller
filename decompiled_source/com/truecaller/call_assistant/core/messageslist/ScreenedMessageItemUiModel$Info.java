package com.truecaller.call_assistant.core.messageslist;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"com/truecaller/call_assistant/core/messageslist/ScreenedMessageItemUiModel$Info", "Lcq0/r;", "", "Lcom/truecaller/call_assistant/core/messageslist/ScreenedMessageItemUiModel$Info;", "<init>", "(Ljava/lang/String;I)V", "", "getId", "()Ljava/lang/String;", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "CALL_ENDED", "USER_HANGUP", "CALLER_HANGUP", "SENT_TO_VOICEMAIL", "CALLER_LEFT_VOICEMAIL", "USER_TIMEOUT", "CALLER_TIMEOUT", "YOU_ANSWERED", "YOU_MARKED_SPAM", "NOT_INTERESTED", "SERVER_MARKED_SPAM", "CALL_ME_BACK", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ScreenedMessageItemUiModel$Info implements cq0.r {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info[] $VALUES;
    public static final com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info CALL_ENDED = new com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info("CALL_ENDED", 0);
    public static final com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info USER_HANGUP = new com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info("USER_HANGUP", 1);
    public static final com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info CALLER_HANGUP = new com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info("CALLER_HANGUP", 2);
    public static final com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info SENT_TO_VOICEMAIL = new com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info("SENT_TO_VOICEMAIL", 3);
    public static final com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info CALLER_LEFT_VOICEMAIL = new com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info("CALLER_LEFT_VOICEMAIL", 4);
    public static final com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info USER_TIMEOUT = new com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info("USER_TIMEOUT", 5);
    public static final com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info CALLER_TIMEOUT = new com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info("CALLER_TIMEOUT", 6);
    public static final com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info YOU_ANSWERED = new com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info("YOU_ANSWERED", 7);
    public static final com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info YOU_MARKED_SPAM = new com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info("YOU_MARKED_SPAM", 8);
    public static final com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info NOT_INTERESTED = new com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info("NOT_INTERESTED", 9);
    public static final com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info SERVER_MARKED_SPAM = new com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info("SERVER_MARKED_SPAM", 10);
    public static final com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info CALL_ME_BACK = new com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info("CALL_ME_BACK", 11);

    private static final /* synthetic */ com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info[] $values() {
        return new com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info[]{CALL_ENDED, USER_HANGUP, CALLER_HANGUP, SENT_TO_VOICEMAIL, CALLER_LEFT_VOICEMAIL, USER_TIMEOUT, CALLER_TIMEOUT, YOU_ANSWERED, YOU_MARKED_SPAM, NOT_INTERESTED, SERVER_MARKED_SPAM, CALL_ME_BACK};
    }

    static {
        com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ScreenedMessageItemUiModel$Info(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info.class, str);
    }

    public static com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info[] values() {
        return (com.truecaller.call_assistant.core.messageslist.ScreenedMessageItemUiModel$Info[]) $VALUES.clone();
    }

    @Override // cq0.r
    @org.jetbrains.annotations.NotNull
    public java.lang.String getId() {
        return name();
    }
}
