package com.truecaller.enterpriseconfigurablecall.api.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/enterpriseconfigurablecall/api/analytics/ConfigurableCallAnalyticContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DETAIL_VIEW_LEGACY", "PACS", "FACS", "DV3", "UNKNOWN", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ConfigurableCallAnalyticContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext DETAIL_VIEW_LEGACY = new com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext("DETAIL_VIEW_LEGACY", 0, "DetailViewLegacyAlternateNumber");
    public static final com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext PACS = new com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext("PACS", 1, "PACSAlternateNumber");
    public static final com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext FACS = new com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext("FACS", 2, "FACSAlternateNumber");
    public static final com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext DV3 = new com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext("DV3", 3, "DetailsViewV3AlternateNumber");
    public static final com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext UNKNOWN = new com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext("UNKNOWN", 4, "Unknown");

    private static final /* synthetic */ com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext[] $values() {
        return new com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext[]{DETAIL_VIEW_LEGACY, PACS, FACS, DV3, UNKNOWN};
    }

    static {
        com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ConfigurableCallAnalyticContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext valueOf(java.lang.String str) {
        return (com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext) java.lang.Enum.valueOf(com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext.class, str);
    }

    public static com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext[] values() {
        return (com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
