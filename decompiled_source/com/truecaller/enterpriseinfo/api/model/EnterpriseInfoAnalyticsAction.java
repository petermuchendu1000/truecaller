package com.truecaller.enterpriseinfo.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/enterpriseinfo/api/model/EnterpriseInfoAnalyticsAction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CLICKED", "SHOWN", "COMPLETED", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EnterpriseInfoAnalyticsAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction CLICKED = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction("CLICKED", 0, "Clicked");
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction SHOWN = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction("SHOWN", 1, "Shown");
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction COMPLETED = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction("COMPLETED", 2, "Completed");

    private static final /* synthetic */ com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction[] $values() {
        return new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction[]{CLICKED, SHOWN, COMPLETED};
    }

    static {
        com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private EnterpriseInfoAnalyticsAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction valueOf(java.lang.String str) {
        return (com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction) java.lang.Enum.valueOf(com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction.class, str);
    }

    public static com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction[] values() {
        return (com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
