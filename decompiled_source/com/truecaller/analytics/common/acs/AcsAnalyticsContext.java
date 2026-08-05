package com.truecaller.analytics.common.acs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/analytics/common/acs/AcsAnalyticsContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PACS", "FACS", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AcsAnalyticsContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.acs.AcsAnalyticsContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.common.acs.AcsAnalyticsContext PACS = new com.truecaller.analytics.common.acs.AcsAnalyticsContext("PACS", 0, "afterCall");
    public static final com.truecaller.analytics.common.acs.AcsAnalyticsContext FACS = new com.truecaller.analytics.common.acs.AcsAnalyticsContext("FACS", 1, "fullAfterCall");

    private static final /* synthetic */ com.truecaller.analytics.common.acs.AcsAnalyticsContext[] $values() {
        return new com.truecaller.analytics.common.acs.AcsAnalyticsContext[]{PACS, FACS};
    }

    static {
        com.truecaller.analytics.common.acs.AcsAnalyticsContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AcsAnalyticsContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.acs.AcsAnalyticsContext valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.acs.AcsAnalyticsContext) java.lang.Enum.valueOf(com.truecaller.analytics.common.acs.AcsAnalyticsContext.class, str);
    }

    public static com.truecaller.analytics.common.acs.AcsAnalyticsContext[] values() {
        return (com.truecaller.analytics.common.acs.AcsAnalyticsContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
