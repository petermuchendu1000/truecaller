package com.truecaller.enterpriseinfo.api.internal.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/enterpriseinfo/api/internal/analytics/EnterpriseInfoContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DETAILS_VIEW_V3", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EnterpriseInfoContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.enterpriseinfo.api.internal.analytics.EnterpriseInfoContext[] $VALUES;
    public static final com.truecaller.enterpriseinfo.api.internal.analytics.EnterpriseInfoContext DETAILS_VIEW_V3 = new com.truecaller.enterpriseinfo.api.internal.analytics.EnterpriseInfoContext("DETAILS_VIEW_V3", 0, "DetailsViewV3");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    private static final /* synthetic */ com.truecaller.enterpriseinfo.api.internal.analytics.EnterpriseInfoContext[] $values() {
        return new com.truecaller.enterpriseinfo.api.internal.analytics.EnterpriseInfoContext[]{DETAILS_VIEW_V3};
    }

    static {
        com.truecaller.enterpriseinfo.api.internal.analytics.EnterpriseInfoContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private EnterpriseInfoContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.enterpriseinfo.api.internal.analytics.EnterpriseInfoContext valueOf(java.lang.String str) {
        return (com.truecaller.enterpriseinfo.api.internal.analytics.EnterpriseInfoContext) java.lang.Enum.valueOf(com.truecaller.enterpriseinfo.api.internal.analytics.EnterpriseInfoContext.class, str);
    }

    public static com.truecaller.enterpriseinfo.api.internal.analytics.EnterpriseInfoContext[] values() {
        return (com.truecaller.enterpriseinfo.api.internal.analytics.EnterpriseInfoContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
