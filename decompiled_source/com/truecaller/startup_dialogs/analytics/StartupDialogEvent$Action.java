package com.truecaller.startup_dialogs.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"com/truecaller/startup_dialogs/analytics/StartupDialogEvent$Action", "", "Lcom/truecaller/startup_dialogs/analytics/StartupDialogEvent$Action;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ClickedPositive", "ClickedNegative", "ClickedEnable", "ClickedLearnMore", "Cancelled", "Shown", "Dismiss", "Enabled", "Disabled", "Snooze", "Confirmed", "GoToSettings", "NotNow", "SetAsDefault", "Edit", "GotIt", "Continue", "ContactSupport", "GrantPermission", "startup-dialog-router_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class StartupDialogEvent$Action {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action ClickedPositive = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("ClickedPositive", 0, "PositiveBtnClicked");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action ClickedNegative = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("ClickedNegative", 1, "NegativeBtnClicked");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action ClickedEnable = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("ClickedEnable", 2, "EnableBtnClicked");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action ClickedLearnMore = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("ClickedLearnMore", 3, "LearnMoreBtnClicked");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action Cancelled = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("Cancelled", 4, "DialogCancelled");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action Shown = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("Shown", 5, "Shown");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action Dismiss = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("Dismiss", 6, "Dismiss");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action Enabled = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("Enabled", 7, "Enabled");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action Disabled = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("Disabled", 8, "Disabled");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action Snooze = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("Snooze", 9, "Snooze");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action Confirmed = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("Confirmed", 10, "Confirmed");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action GoToSettings = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("GoToSettings", 11, "GoToSettings");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action NotNow = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("NotNow", 12, "NotNow");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action SetAsDefault = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("SetAsDefault", 13, "SetAsDefault");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action Edit = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("Edit", 14, "Edit");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action GotIt = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("GotIt", 15, "GotIt");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action Continue = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("Continue", 16, "Continue");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action ContactSupport = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("ContactSupport", 17, "ContactSupport");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action GrantPermission = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action("GrantPermission", 18, "GrantPermission");

    private static final /* synthetic */ com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action[] $values() {
        return new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action[]{ClickedPositive, ClickedNegative, ClickedEnable, ClickedLearnMore, Cancelled, Shown, Dismiss, Enabled, Disabled, Snooze, Confirmed, GoToSettings, NotNow, SetAsDefault, Edit, GotIt, Continue, ContactSupport, GrantPermission};
    }

    static {
        com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private StartupDialogEvent$Action(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action valueOf(java.lang.String str) {
        return (com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action) java.lang.Enum.valueOf(com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action.class, str);
    }

    public static com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action[] values() {
        return (com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
