package com.truecaller.rewardprogram.impl.data.local.db.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/rewardprogram/impl/data/local/db/model/RecurringTaskEntity$Type", "", "Lcom/truecaller/rewardprogram/impl/data/local/db/model/RecurringTaskEntity$Type;", "<init>", "(Ljava/lang/String;I)V", "PHONE_APP", "MESSAGING_APP", "CALLER_ID_APP", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RecurringTaskEntity$Type {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type[] $VALUES;
    public static final com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type PHONE_APP = new com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type("PHONE_APP", 0);
    public static final com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type MESSAGING_APP = new com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type("MESSAGING_APP", 1);
    public static final com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type CALLER_ID_APP = new com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type("CALLER_ID_APP", 2);

    private static final /* synthetic */ com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type[] $values() {
        return new com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type[]{PHONE_APP, MESSAGING_APP, CALLER_ID_APP};
    }

    static {
        com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RecurringTaskEntity$Type(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type valueOf(java.lang.String str) {
        return (com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type) java.lang.Enum.valueOf(com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type.class, str);
    }

    public static com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type[] values() {
        return (com.truecaller.rewardprogram.impl.data.local.db.model.RecurringTaskEntity$Type[]) $VALUES.clone();
    }
}
