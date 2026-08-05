package com.truecaller.analytics.common.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/truecaller/analytics/common/event/ViewActionEvent$ViralityAction", "", "Lcom/truecaller/analytics/common/event/ViewActionEvent$ViralityAction;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "RATE", "FEEDBACK", "SHARE", "INVITE", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ViewActionEvent$ViralityAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction RATE = new com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction("RATE", 0, "rate");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction FEEDBACK = new com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction("FEEDBACK", 1, "feedback");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction SHARE = new com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction("SHARE", 2, "share");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction INVITE = new com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction("INVITE", 3, "invite");

    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction[] $values() {
        return new com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction[]{RATE, FEEDBACK, SHARE, INVITE};
    }

    static {
        com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ViewActionEvent$ViralityAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction) java.lang.Enum.valueOf(com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction.class, str);
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction[] values() {
        return (com.truecaller.analytics.common.event.ViewActionEvent$ViralityAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
