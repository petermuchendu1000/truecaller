package com.truecaller.rewardprogram.impl.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/rewardprogram/impl/model/ContributionType;", "", "<init>", "(Ljava/lang/String;I)V", "SURVEY_ANSWER", "NAME_SUGGESTION", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ContributionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.rewardprogram.impl.model.ContributionType[] $VALUES;
    public static final com.truecaller.rewardprogram.impl.model.ContributionType SURVEY_ANSWER = new com.truecaller.rewardprogram.impl.model.ContributionType("SURVEY_ANSWER", 0);
    public static final com.truecaller.rewardprogram.impl.model.ContributionType NAME_SUGGESTION = new com.truecaller.rewardprogram.impl.model.ContributionType("NAME_SUGGESTION", 1);

    private static final /* synthetic */ com.truecaller.rewardprogram.impl.model.ContributionType[] $values() {
        return new com.truecaller.rewardprogram.impl.model.ContributionType[]{SURVEY_ANSWER, NAME_SUGGESTION};
    }

    static {
        com.truecaller.rewardprogram.impl.model.ContributionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ContributionType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.rewardprogram.impl.model.ContributionType valueOf(java.lang.String str) {
        return (com.truecaller.rewardprogram.impl.model.ContributionType) java.lang.Enum.valueOf(com.truecaller.rewardprogram.impl.model.ContributionType.class, str);
    }

    public static com.truecaller.rewardprogram.impl.model.ContributionType[] values() {
        return (com.truecaller.rewardprogram.impl.model.ContributionType[]) $VALUES.clone();
    }
}
