package com.truecaller.rewardprogram.impl.data.local.db.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/truecaller/rewardprogram/impl/data/local/db/model/RepeatableBonusTaskCompletionEntity$Type", "", "Lcom/truecaller/rewardprogram/impl/data/local/db/model/RepeatableBonusTaskCompletionEntity$Type;", "<init>", "(Ljava/lang/String;I)V", "WATCH_AD", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RepeatableBonusTaskCompletionEntity$Type {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type[] $VALUES;
    public static final com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type WATCH_AD = new com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type("WATCH_AD", 0);

    private static final /* synthetic */ com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type[] $values() {
        return new com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type[]{WATCH_AD};
    }

    static {
        com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RepeatableBonusTaskCompletionEntity$Type(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type valueOf(java.lang.String str) {
        return (com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type) java.lang.Enum.valueOf(com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type.class, str);
    }

    public static com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type[] values() {
        return (com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type[]) $VALUES.clone();
    }
}
