package com.truecaller.call_assistant.campaigns.validation.displayin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/validation/displayin/DisplayInScreen;", "", "", "screenName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getScreenName", "()Ljava/lang/String;", "Companion", "vm0/bar", "SCREENED_CALLS_LIST", "POST_CONVERSATION", "VOICEMAIL_TAB", "QA_MENU", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DisplayInScreen {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final vm0.bar Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String screenName;
    public static final com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen SCREENED_CALLS_LIST = new com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen("SCREENED_CALLS_LIST", 0, "list");
    public static final com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen POST_CONVERSATION = new com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen("POST_CONVERSATION", 1, "post");
    public static final com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen VOICEMAIL_TAB = new com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen("VOICEMAIL_TAB", 2, "voicemail_list");
    public static final com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen QA_MENU = new com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen("QA_MENU", 3, "qa_menu");

    private static final /* synthetic */ com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen[] $values() {
        return new com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen[]{SCREENED_CALLS_LIST, POST_CONVERSATION, VOICEMAIL_TAB, QA_MENU};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [vm0.bar, java.lang.Object] */
    static {
        com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private DisplayInScreen(java.lang.String str, int i, java.lang.String str2) {
        this.screenName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen) java.lang.Enum.valueOf(com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen.class, str);
    }

    public static com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen[] values() {
        return (com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getScreenName() {
        return this.screenName;
    }
}
