package com.truecaller.wizard.sandpaper;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/truecaller/wizard/sandpaper/SandPaperAnalytics$Action", "", "Lcom/truecaller/wizard/sandpaper/SandPaperAnalytics$Action;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "PageSeen", "ContinueClicked", "EnableClicked", "LaterClicked", "StartFreeTrial", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SandPaperAnalytics$Action {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action PageSeen = new com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action("PageSeen", 0, "Seen");
    public static final com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action ContinueClicked = new com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action("ContinueClicked", 1, "Continue");
    public static final com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action EnableClicked = new com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action("EnableClicked", 2, "Enable");
    public static final com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action LaterClicked = new com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action("LaterClicked", 3, "Later");
    public static final com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action StartFreeTrial = new com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action("StartFreeTrial", 4, "StartFreeTrial");

    private static final /* synthetic */ com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action[] $values() {
        return new com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action[]{PageSeen, ContinueClicked, EnableClicked, LaterClicked, StartFreeTrial};
    }

    static {
        com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SandPaperAnalytics$Action(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action valueOf(java.lang.String str) {
        return (com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action) java.lang.Enum.valueOf(com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action.class, str);
    }

    public static com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action[] values() {
        return (com.truecaller.wizard.sandpaper.SandPaperAnalytics$Action[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
