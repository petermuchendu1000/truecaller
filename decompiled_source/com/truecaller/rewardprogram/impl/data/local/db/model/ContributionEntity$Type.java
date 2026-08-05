package com.truecaller.rewardprogram.impl.data.local.db.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/rewardprogram/impl/data/local/db/model/ContributionEntity$Type", "", "Lcom/truecaller/rewardprogram/impl/data/local/db/model/ContributionEntity$Type;", "<init>", "(Ljava/lang/String;I)V", "SURVEY_ANSWER", "NAME_SUGGESTION", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ContributionEntity$Type {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.rewardprogram.impl.data.local.db.model.ContributionEntity$Type[] $VALUES;
    public static final com.truecaller.rewardprogram.impl.data.local.db.model.ContributionEntity$Type SURVEY_ANSWER = new com.truecaller.rewardprogram.impl.data.local.db.model.ContributionEntity$Type("SURVEY_ANSWER", 0);
    public static final com.truecaller.rewardprogram.impl.data.local.db.model.ContributionEntity$Type NAME_SUGGESTION = new com.truecaller.rewardprogram.impl.data.local.db.model.ContributionEntity$Type("NAME_SUGGESTION", 1);

    private static final /* synthetic */ com.truecaller.rewardprogram.impl.data.local.db.model.ContributionEntity$Type[] $values() {
        return new com.truecaller.rewardprogram.impl.data.local.db.model.ContributionEntity$Type[]{SURVEY_ANSWER, NAME_SUGGESTION};
    }

    static {
        com.truecaller.rewardprogram.impl.data.local.db.model.ContributionEntity$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ContributionEntity$Type(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.rewardprogram.impl.data.local.db.model.ContributionEntity$Type valueOf(java.lang.String str) {
        return (com.truecaller.rewardprogram.impl.data.local.db.model.ContributionEntity$Type) java.lang.Enum.valueOf(com.truecaller.rewardprogram.impl.data.local.db.model.ContributionEntity$Type.class, str);
    }

    public static com.truecaller.rewardprogram.impl.data.local.db.model.ContributionEntity$Type[] values() {
        return (com.truecaller.rewardprogram.impl.data.local.db.model.ContributionEntity$Type[]) $VALUES.clone();
    }
}
