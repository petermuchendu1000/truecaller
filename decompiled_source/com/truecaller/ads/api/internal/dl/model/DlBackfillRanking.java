package com.truecaller.ads.api.internal.dl.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/ads/api/internal/dl/model/DlBackfillRanking;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "w20/baz", "Fcfs", "HighestYield", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DlBackfillRanking {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlBackfillRanking[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final w20.baz Companion;
    public static final com.truecaller.ads.api.internal.dl.model.DlBackfillRanking Fcfs = new com.truecaller.ads.api.internal.dl.model.DlBackfillRanking("Fcfs", 0);
    public static final com.truecaller.ads.api.internal.dl.model.DlBackfillRanking HighestYield = new com.truecaller.ads.api.internal.dl.model.DlBackfillRanking("HighestYield", 1);

    private static final /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlBackfillRanking[] $values() {
        return new com.truecaller.ads.api.internal.dl.model.DlBackfillRanking[]{Fcfs, HighestYield};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [w20.baz, java.lang.Object] */
    static {
        com.truecaller.ads.api.internal.dl.model.DlBackfillRanking[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private DlBackfillRanking(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.internal.dl.model.DlBackfillRanking valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.internal.dl.model.DlBackfillRanking) java.lang.Enum.valueOf(com.truecaller.ads.api.internal.dl.model.DlBackfillRanking.class, str);
    }

    public static com.truecaller.ads.api.internal.dl.model.DlBackfillRanking[] values() {
        return (com.truecaller.ads.api.internal.dl.model.DlBackfillRanking[]) $VALUES.clone();
    }
}
