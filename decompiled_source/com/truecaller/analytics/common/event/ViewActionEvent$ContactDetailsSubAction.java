package com.truecaller.analytics.common.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"com/truecaller/analytics/common/event/ViewActionEvent$ContactDetailsSubAction", "", "Lcom/truecaller/analytics/common/event/ViewActionEvent$ContactDetailsSubAction;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ADDRESS", "BUTTON", "HEADER", "EDIT", "ADD", "CONTACT", "NUMBER", "NAME", "EMAIL", "SEARCH", "LINK", "OVERFLOW_MENU", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ViewActionEvent$ContactDetailsSubAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction ADDRESS = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction("ADDRESS", 0, "address");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction BUTTON = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction("BUTTON", 1, "button");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction HEADER = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction("HEADER", 2, "header");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction EDIT = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction("EDIT", 3, "edit");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction ADD = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction("ADD", 4, "add");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction CONTACT = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction("CONTACT", 5, "contact");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction NUMBER = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction("NUMBER", 6, "number");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction NAME = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction("NAME", 7, "name");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction EMAIL = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction("EMAIL", 8, "email");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction SEARCH = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction("SEARCH", 9, "search");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction LINK = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction("LINK", 10, "link");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction OVERFLOW_MENU = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction("OVERFLOW_MENU", 11, "OverflowMenu");

    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction[] $values() {
        return new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction[]{ADDRESS, BUTTON, HEADER, EDIT, ADD, CONTACT, NUMBER, NAME, EMAIL, SEARCH, LINK, OVERFLOW_MENU};
    }

    static {
        com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ViewActionEvent$ContactDetailsSubAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction) java.lang.Enum.valueOf(com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction.class, str);
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction[] values() {
        return (com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
