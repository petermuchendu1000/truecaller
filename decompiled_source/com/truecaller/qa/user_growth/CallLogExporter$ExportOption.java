package com.truecaller.qa.user_growth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/truecaller/qa/user_growth/CallLogExporter$ExportOption", "", "Lcom/truecaller/qa/user_growth/CallLogExporter$ExportOption;", "", "label", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "LAST_100", "LAST_500", "LAST_1_MONTH", "LAST_2_MONTHS", "ALL", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class CallLogExporter$ExportOption {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.qa.user_growth.CallLogExporter$ExportOption[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String label;
    public static final com.truecaller.qa.user_growth.CallLogExporter$ExportOption LAST_100 = new com.truecaller.qa.user_growth.CallLogExporter$ExportOption("LAST_100", 0, "Last 100 entries");
    public static final com.truecaller.qa.user_growth.CallLogExporter$ExportOption LAST_500 = new com.truecaller.qa.user_growth.CallLogExporter$ExportOption("LAST_500", 1, "Last 500 entries");
    public static final com.truecaller.qa.user_growth.CallLogExporter$ExportOption LAST_1_MONTH = new com.truecaller.qa.user_growth.CallLogExporter$ExportOption("LAST_1_MONTH", 2, "Last 1 month");
    public static final com.truecaller.qa.user_growth.CallLogExporter$ExportOption LAST_2_MONTHS = new com.truecaller.qa.user_growth.CallLogExporter$ExportOption("LAST_2_MONTHS", 3, "Last 2 months");
    public static final com.truecaller.qa.user_growth.CallLogExporter$ExportOption ALL = new com.truecaller.qa.user_growth.CallLogExporter$ExportOption("ALL", 4, "All entries");

    private static final /* synthetic */ com.truecaller.qa.user_growth.CallLogExporter$ExportOption[] $values() {
        return new com.truecaller.qa.user_growth.CallLogExporter$ExportOption[]{LAST_100, LAST_500, LAST_1_MONTH, LAST_2_MONTHS, ALL};
    }

    static {
        com.truecaller.qa.user_growth.CallLogExporter$ExportOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallLogExporter$ExportOption(java.lang.String str, int i, java.lang.String str2) {
        this.label = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.qa.user_growth.CallLogExporter$ExportOption valueOf(java.lang.String str) {
        return (com.truecaller.qa.user_growth.CallLogExporter$ExportOption) java.lang.Enum.valueOf(com.truecaller.qa.user_growth.CallLogExporter$ExportOption.class, str);
    }

    public static com.truecaller.qa.user_growth.CallLogExporter$ExportOption[] values() {
        return (com.truecaller.qa.user_growth.CallLogExporter$ExportOption[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLabel() {
        return this.label;
    }
}
