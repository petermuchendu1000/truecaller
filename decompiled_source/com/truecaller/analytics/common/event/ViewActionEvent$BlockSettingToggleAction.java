package com.truecaller.analytics.common.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/truecaller/analytics/common/event/ViewActionEvent$BlockSettingToggleAction", "", "Lcom/truecaller/analytics/common/event/ViewActionEvent$BlockSettingToggleAction;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "rc0/a", "ENABLED", "DISABLED", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ViewActionEvent$BlockSettingToggleAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$BlockSettingToggleAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final rc0.a Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.common.event.ViewActionEvent$BlockSettingToggleAction ENABLED = new com.truecaller.analytics.common.event.ViewActionEvent$BlockSettingToggleAction("ENABLED", 0, "Enabled");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$BlockSettingToggleAction DISABLED = new com.truecaller.analytics.common.event.ViewActionEvent$BlockSettingToggleAction("DISABLED", 1, "Disabled");

    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$BlockSettingToggleAction[] $values() {
        return new com.truecaller.analytics.common.event.ViewActionEvent$BlockSettingToggleAction[]{ENABLED, DISABLED};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [rc0.a, java.lang.Object] */
    static {
        com.truecaller.analytics.common.event.ViewActionEvent$BlockSettingToggleAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ViewActionEvent$BlockSettingToggleAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$BlockSettingToggleAction valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.event.ViewActionEvent$BlockSettingToggleAction) java.lang.Enum.valueOf(com.truecaller.analytics.common.event.ViewActionEvent$BlockSettingToggleAction.class, str);
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$BlockSettingToggleAction[] values() {
        return (com.truecaller.analytics.common.event.ViewActionEvent$BlockSettingToggleAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
