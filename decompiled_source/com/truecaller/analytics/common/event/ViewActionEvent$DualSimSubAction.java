package com.truecaller.analytics.common.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"com/truecaller/analytics/common/event/ViewActionEvent$DualSimSubAction", "", "Lcom/truecaller/analytics/common/event/ViewActionEvent$DualSimSubAction;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SIM1", "SIM2", "ALWAYS_ASK", "SINGLE_SIM", "SINGLE_SIM_ENABLED", "DEFAULT", "NON_DEFAULT", "NO_DEFAULT_SELECTED", "NOT_SUPPORTED", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ViewActionEvent$DualSimSubAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction SIM1 = new com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction("SIM1", 0, "sim1");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction SIM2 = new com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction("SIM2", 1, "sim2");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction ALWAYS_ASK = new com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction("ALWAYS_ASK", 2, "alwaysAsk");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction SINGLE_SIM = new com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction("SINGLE_SIM", 3, "singleSIM");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction SINGLE_SIM_ENABLED = new com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction("SINGLE_SIM_ENABLED", 4, "singleSIMEnabled");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction DEFAULT = new com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction("DEFAULT", 5, "default");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction NON_DEFAULT = new com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction("NON_DEFAULT", 6, "nonDefault");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction NO_DEFAULT_SELECTED = new com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction("NO_DEFAULT_SELECTED", 7, "noDefaultSelected");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction NOT_SUPPORTED = new com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction("NOT_SUPPORTED", 8, "NotSupported");

    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction[] $values() {
        return new com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction[]{SIM1, SIM2, ALWAYS_ASK, SINGLE_SIM, SINGLE_SIM_ENABLED, DEFAULT, NON_DEFAULT, NO_DEFAULT_SELECTED, NOT_SUPPORTED};
    }

    static {
        com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ViewActionEvent$DualSimSubAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction) java.lang.Enum.valueOf(com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction.class, str);
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction[] values() {
        return (com.truecaller.analytics.common.event.ViewActionEvent$DualSimSubAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
