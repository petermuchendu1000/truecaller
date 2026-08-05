package com.truecaller.enterpriseconfigurables.api.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/enterpriseconfigurables/api/analytics/ConfigurableMessagingAnalyticContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PACS", "FACS", "NEO_PACS", "NEO_FACS", "DV3", "BIZ_IM_CONVERSATION", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ConfigurableMessagingAnalyticContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext PACS = new com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext("PACS", 0, "Pacs");
    public static final com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext FACS = new com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext("FACS", 1, "Facs");
    public static final com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext NEO_PACS = new com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext("NEO_PACS", 2, "NeoPacs");
    public static final com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext NEO_FACS = new com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext("NEO_FACS", 3, "NeoFacs");
    public static final com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext DV3 = new com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext("DV3", 4, "DetailsViewV3");
    public static final com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext BIZ_IM_CONVERSATION = new com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext("BIZ_IM_CONVERSATION", 5, "BizImConversation");

    private static final /* synthetic */ com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext[] $values() {
        return new com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext[]{PACS, FACS, NEO_PACS, NEO_FACS, DV3, BIZ_IM_CONVERSATION};
    }

    static {
        com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ConfigurableMessagingAnalyticContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext valueOf(java.lang.String str) {
        return (com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext) java.lang.Enum.valueOf(com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext.class, str);
    }

    public static com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext[] values() {
        return (com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
