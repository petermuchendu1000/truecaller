package com.truecaller.ratingsandreviews.api.internal.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/ratingsandreviews/api/internal/model/Context;", "", "<init>", "(Ljava/lang/String;I)V", "Acs", "Block", "DetailsView", "Unknown", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class Context {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ratingsandreviews.api.internal.model.Context[] $VALUES;
    public static final com.truecaller.ratingsandreviews.api.internal.model.Context Acs = new com.truecaller.ratingsandreviews.api.internal.model.Context("Acs", 0);
    public static final com.truecaller.ratingsandreviews.api.internal.model.Context Block = new com.truecaller.ratingsandreviews.api.internal.model.Context("Block", 1);
    public static final com.truecaller.ratingsandreviews.api.internal.model.Context DetailsView = new com.truecaller.ratingsandreviews.api.internal.model.Context("DetailsView", 2);
    public static final com.truecaller.ratingsandreviews.api.internal.model.Context Unknown = new com.truecaller.ratingsandreviews.api.internal.model.Context("Unknown", 3);

    private static final /* synthetic */ com.truecaller.ratingsandreviews.api.internal.model.Context[] $values() {
        return new com.truecaller.ratingsandreviews.api.internal.model.Context[]{Acs, Block, DetailsView, Unknown};
    }

    static {
        com.truecaller.ratingsandreviews.api.internal.model.Context[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Context(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ratingsandreviews.api.internal.model.Context valueOf(java.lang.String str) {
        return (com.truecaller.ratingsandreviews.api.internal.model.Context) java.lang.Enum.valueOf(com.truecaller.ratingsandreviews.api.internal.model.Context.class, str);
    }

    public static com.truecaller.ratingsandreviews.api.internal.model.Context[] values() {
        return (com.truecaller.ratingsandreviews.api.internal.model.Context[]) $VALUES.clone();
    }
}
