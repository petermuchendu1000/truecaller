package com.truecaller.analytics.common.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"com/truecaller/analytics/common/event/ViewActionEvent$DetailsSubAction", "", "Lcom/truecaller/analytics/common/event/ViewActionEvent$DetailsSubAction;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "PHONE_BOOK", "TRUECALLER", "CLOUD_CONTACT", "CATEGORY", "HEADER", "HEADER_WITH_COMMENTS", "BUTTON", "BUTTON_WITH_COMMENTS", "ITEM", "AVATAR", "CALL_RECORDING", "NAME_CLICKED", "PREMIUM_BADGE", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ViewActionEvent$DetailsSubAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction PHONE_BOOK = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction("PHONE_BOOK", 0, "phoneBook");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction TRUECALLER = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction("TRUECALLER", 1, "truecaller");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction CLOUD_CONTACT = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction("CLOUD_CONTACT", 2, "cloudContact");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction CATEGORY = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction("CATEGORY", 3, "category");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction HEADER = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction("HEADER", 4, "header");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction HEADER_WITH_COMMENTS = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction("HEADER_WITH_COMMENTS", 5, "headerWithCommentCount");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction BUTTON = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction("BUTTON", 6, "button");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction BUTTON_WITH_COMMENTS = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction("BUTTON_WITH_COMMENTS", 7, "buttonWithCommentCount");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction ITEM = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction("ITEM", 8, "item");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction AVATAR = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction("AVATAR", 9, "avatar");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction CALL_RECORDING = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction("CALL_RECORDING", 10, "callRecording");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction NAME_CLICKED = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction("NAME_CLICKED", 11, "nameClicked");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction PREMIUM_BADGE = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction("PREMIUM_BADGE", 12, "premiumBadge");

    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction[] $values() {
        return new com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction[]{PHONE_BOOK, TRUECALLER, CLOUD_CONTACT, CATEGORY, HEADER, HEADER_WITH_COMMENTS, BUTTON, BUTTON_WITH_COMMENTS, ITEM, AVATAR, CALL_RECORDING, NAME_CLICKED, PREMIUM_BADGE};
    }

    static {
        com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ViewActionEvent$DetailsSubAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction) java.lang.Enum.valueOf(com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction.class, str);
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction[] values() {
        return (com.truecaller.analytics.common.event.ViewActionEvent$DetailsSubAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
