package com.truecaller.settings.impl.ui.calls.troubleshoot;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/settings/impl/ui/calls/troubleshoot/TroubleshootOption;", "", "<init>", "(Ljava/lang/String;I)V", "DRAW_OVER", "CALLER_ID_APP", "DISABLE_BATTERY_OPT", "DEFAULT_DIALER_CALLING_EXPANDED", "CALLER_ID_VISIT_HELP_CENTER", "CALL_RECORDING_VISIT_HELP_CENTER", "CALLING_VISIT_HELP_CENTER", "MIC_PERMISSION", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class TroubleshootOption {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption[] $VALUES;
    public static final com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption DRAW_OVER = new com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption("DRAW_OVER", 0);
    public static final com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption CALLER_ID_APP = new com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption("CALLER_ID_APP", 1);
    public static final com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption DISABLE_BATTERY_OPT = new com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption("DISABLE_BATTERY_OPT", 2);
    public static final com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption DEFAULT_DIALER_CALLING_EXPANDED = new com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption("DEFAULT_DIALER_CALLING_EXPANDED", 3);
    public static final com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption CALLER_ID_VISIT_HELP_CENTER = new com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption("CALLER_ID_VISIT_HELP_CENTER", 4);
    public static final com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption CALL_RECORDING_VISIT_HELP_CENTER = new com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption("CALL_RECORDING_VISIT_HELP_CENTER", 5);
    public static final com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption CALLING_VISIT_HELP_CENTER = new com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption("CALLING_VISIT_HELP_CENTER", 6);
    public static final com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption MIC_PERMISSION = new com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption("MIC_PERMISSION", 7);

    private static final /* synthetic */ com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption[] $values() {
        return new com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption[]{DRAW_OVER, CALLER_ID_APP, DISABLE_BATTERY_OPT, DEFAULT_DIALER_CALLING_EXPANDED, CALLER_ID_VISIT_HELP_CENTER, CALL_RECORDING_VISIT_HELP_CENTER, CALLING_VISIT_HELP_CENTER, MIC_PERMISSION};
    }

    static {
        com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TroubleshootOption(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption valueOf(java.lang.String str) {
        return (com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption) java.lang.Enum.valueOf(com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption.class, str);
    }

    public static com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption[] values() {
        return (com.truecaller.settings.impl.ui.calls.troubleshoot.TroubleshootOption[]) $VALUES.clone();
    }
}
