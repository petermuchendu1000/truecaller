package com.truecaller.call_assistant.core.callui.v2.ui.post;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"com/truecaller/call_assistant/core/callui/v2/ui/post/AssistantPostCallMessageUiModel$Info", "Lfp0/m;", "", "Lcom/truecaller/call_assistant/core/callui/v2/ui/post/AssistantPostCallMessageUiModel$Info;", "", "textResId", "iconResId", "<init>", "(Ljava/lang/String;III)V", "I", "getTextResId", "()I", "getIconResId", "", "getId", "()Ljava/lang/String;", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "CALLER_HANGUP", "USER_HANGUP", "CALLER_LEFT_VOICEMAIL", "USER_TIMEOUT", "CALLER_TIMEOUT", "YOU_ANSWERED", "YOU_MARKED_SPAM", "SERVER_MARKED_SPAM", "NOT_INTERESTED", "CALL_ME_BACK", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantPostCallMessageUiModel$Info implements fp0.m {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info[] $VALUES;
    private final int iconResId;
    private final int textResId;
    public static final com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info CALLER_HANGUP = new com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info("CALLER_HANGUP", 0, 2132017489, 2131232339);
    public static final com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info USER_HANGUP = new com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info("USER_HANGUP", 1, 2132017495, 2131233752);
    public static final com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info CALLER_LEFT_VOICEMAIL = new com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info("CALLER_LEFT_VOICEMAIL", 2, 2132017492, 2131232181);
    public static final com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info USER_TIMEOUT = new com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info("USER_TIMEOUT", 3, 2132017398, 2131233683);
    public static final com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info CALLER_TIMEOUT = new com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info("CALLER_TIMEOUT", 4, 2132017398, 2131233683);
    public static final com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info YOU_ANSWERED = new com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info("YOU_ANSWERED", 5, 2132017493, 2131233751);
    public static final com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info YOU_MARKED_SPAM = new com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info("YOU_MARKED_SPAM", 6, 2132017497, 2131233753);
    public static final com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info SERVER_MARKED_SPAM = new com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info("SERVER_MARKED_SPAM", 7, 2132017497, 2131233753);
    public static final com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info NOT_INTERESTED = new com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info("NOT_INTERESTED", 8, 2132017499, 2131233754);
    public static final com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info CALL_ME_BACK = new com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info("CALL_ME_BACK", 9, 2132017498, 2131233754);

    private static final /* synthetic */ com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info[] $values() {
        return new com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info[]{CALLER_HANGUP, USER_HANGUP, CALLER_LEFT_VOICEMAIL, USER_TIMEOUT, CALLER_TIMEOUT, YOU_ANSWERED, YOU_MARKED_SPAM, SERVER_MARKED_SPAM, NOT_INTERESTED, CALL_ME_BACK};
    }

    static {
        com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AssistantPostCallMessageUiModel$Info(java.lang.String str, int i, int i2, int i3) {
        this.textResId = i2;
        this.iconResId = i3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info.class, str);
    }

    public static com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info[] values() {
        return (com.truecaller.call_assistant.core.callui.v2.ui.post.AssistantPostCallMessageUiModel$Info[]) $VALUES.clone();
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    @Override // fp0.m
    @org.jetbrains.annotations.NotNull
    public java.lang.String getId() {
        return name();
    }

    public final int getTextResId() {
        return this.textResId;
    }
}
