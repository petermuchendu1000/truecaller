package com.truecaller.enterpriseconfigurablecall.api.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/enterpriseconfigurablecall/api/analytics/ConfigurableCallAction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CLICKED", "SHOWN", "CALL_CONNECTED", "CALL_FAILED", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ConfigurableCallAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction CLICKED = new com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction("CLICKED", 0, "Clicked");
    public static final com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction SHOWN = new com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction("SHOWN", 1, "Shown");
    public static final com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction CALL_CONNECTED = new com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction("CALL_CONNECTED", 2, "CallConnected");
    public static final com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction CALL_FAILED = new com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction("CALL_FAILED", 3, "CallFailed");

    private static final /* synthetic */ com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction[] $values() {
        return new com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction[]{CLICKED, SHOWN, CALL_CONNECTED, CALL_FAILED};
    }

    static {
        com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ConfigurableCallAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction valueOf(java.lang.String str) {
        return (com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction) java.lang.Enum.valueOf(com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction.class, str);
    }

    public static com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction[] values() {
        return (com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
