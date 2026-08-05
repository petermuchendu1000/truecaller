package com.truecaller.enterpriseconfigurables.api.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/enterpriseconfigurables/api/analytics/ConfigurableMessagingAnalyticView;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MESSAGE_BIZ_IM", "MESSAGE_PHONE_BIZ_IM", "BIZ_IM_CONVERSATION", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ConfigurableMessagingAnalyticView {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView MESSAGE_BIZ_IM = new com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView("MESSAGE_BIZ_IM", 0, "Message_BizIM");
    public static final com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView MESSAGE_PHONE_BIZ_IM = new com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView("MESSAGE_PHONE_BIZ_IM", 1, "Message_Phone_BizIM");
    public static final com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView BIZ_IM_CONVERSATION = new com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView("BIZ_IM_CONVERSATION", 2, "BizIM_Conversation");

    private static final /* synthetic */ com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView[] $values() {
        return new com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView[]{MESSAGE_BIZ_IM, MESSAGE_PHONE_BIZ_IM, BIZ_IM_CONVERSATION};
    }

    static {
        com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ConfigurableMessagingAnalyticView(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView valueOf(java.lang.String str) {
        return (com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView) java.lang.Enum.valueOf(com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView.class, str);
    }

    public static com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView[] values() {
        return (com.truecaller.enterpriseconfigurables.api.analytics.ConfigurableMessagingAnalyticView[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
