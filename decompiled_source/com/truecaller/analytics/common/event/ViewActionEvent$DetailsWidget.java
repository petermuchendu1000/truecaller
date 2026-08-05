package com.truecaller.analytics.common.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/truecaller/analytics/common/event/ViewActionEvent$DetailsWidget", "", "Lcom/truecaller/analytics/common/event/ViewActionEvent$DetailsWidget;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ACTION_BUTTONS", "HEADER", "NUMBERS", "CALL_HISTORY", "FEEDBACK", "OVERFLOW_MENU", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ViewActionEvent$DetailsWidget {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget ACTION_BUTTONS = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget("ACTION_BUTTONS", 0, "actionButtons");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget HEADER = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget("HEADER", 1, "header");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget NUMBERS = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget("NUMBERS", 2, "numbers");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget CALL_HISTORY = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget("CALL_HISTORY", 3, "callHistory");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget FEEDBACK = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget("FEEDBACK", 4, "feedback");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget OVERFLOW_MENU = new com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget("OVERFLOW_MENU", 5, com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsSubAction.OVERFLOW_MENU.getValue());

    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget[] $values() {
        return new com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget[]{ACTION_BUTTONS, HEADER, NUMBERS, CALL_HISTORY, FEEDBACK, OVERFLOW_MENU};
    }

    static {
        com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ViewActionEvent$DetailsWidget(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget) java.lang.Enum.valueOf(com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget.class, str);
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget[] values() {
        return (com.truecaller.analytics.common.event.ViewActionEvent$DetailsWidget[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
