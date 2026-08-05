package com.truecaller.ratingsandreviews.api.internal.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/ratingsandreviews/api/internal/model/ReviewSorting;", "", "<init>", "(Ljava/lang/String;I)V", "MostRelevant", "MostRecent", "HighestRating", "LowestRating", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReviewSorting {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting[] $VALUES;
    public static final com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting MostRelevant = new com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting("MostRelevant", 0);
    public static final com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting MostRecent = new com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting("MostRecent", 1);
    public static final com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting HighestRating = new com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting("HighestRating", 2);
    public static final com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting LowestRating = new com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting("LowestRating", 3);

    private static final /* synthetic */ com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting[] $values() {
        return new com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting[]{MostRelevant, MostRecent, HighestRating, LowestRating};
    }

    static {
        com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ReviewSorting(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting valueOf(java.lang.String str) {
        return (com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting) java.lang.Enum.valueOf(com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting.class, str);
    }

    public static com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting[] values() {
        return (com.truecaller.ratingsandreviews.api.internal.model.ReviewSorting[]) $VALUES.clone();
    }
}
