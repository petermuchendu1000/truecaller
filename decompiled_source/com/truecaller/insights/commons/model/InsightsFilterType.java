package com.truecaller.insights.commons.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/insights/commons/model/InsightsFilterType;", "", "<init>", "(Ljava/lang/String;I)V", "FILTER_NONE", "FILTER_BLACKLISTED", "FILTER_WHITELISTED", "common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightsFilterType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.commons.model.InsightsFilterType[] $VALUES;
    public static final com.truecaller.insights.commons.model.InsightsFilterType FILTER_NONE = new com.truecaller.insights.commons.model.InsightsFilterType("FILTER_NONE", 0);
    public static final com.truecaller.insights.commons.model.InsightsFilterType FILTER_BLACKLISTED = new com.truecaller.insights.commons.model.InsightsFilterType("FILTER_BLACKLISTED", 1);
    public static final com.truecaller.insights.commons.model.InsightsFilterType FILTER_WHITELISTED = new com.truecaller.insights.commons.model.InsightsFilterType("FILTER_WHITELISTED", 2);

    private static final /* synthetic */ com.truecaller.insights.commons.model.InsightsFilterType[] $values() {
        return new com.truecaller.insights.commons.model.InsightsFilterType[]{FILTER_NONE, FILTER_BLACKLISTED, FILTER_WHITELISTED};
    }

    static {
        com.truecaller.insights.commons.model.InsightsFilterType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private InsightsFilterType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.commons.model.InsightsFilterType valueOf(java.lang.String str) {
        return (com.truecaller.insights.commons.model.InsightsFilterType) java.lang.Enum.valueOf(com.truecaller.insights.commons.model.InsightsFilterType.class, str);
    }

    public static com.truecaller.insights.commons.model.InsightsFilterType[] values() {
        return (com.truecaller.insights.commons.model.InsightsFilterType[]) $VALUES.clone();
    }
}
