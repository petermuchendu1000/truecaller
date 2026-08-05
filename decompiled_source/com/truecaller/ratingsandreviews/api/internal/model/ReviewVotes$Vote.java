package com.truecaller.ratingsandreviews.api.internal.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/ratingsandreviews/api/internal/model/ReviewVotes$Vote", "", "Lcom/truecaller/ratingsandreviews/api/internal/model/ReviewVotes$Vote;", "<init>", "(Ljava/lang/String;I)V", "None", "Upvoted", "Downvoted", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReviewVotes$Vote {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote[] $VALUES;
    public static final com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote None = new com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote("None", 0);
    public static final com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote Upvoted = new com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote("Upvoted", 1);
    public static final com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote Downvoted = new com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote("Downvoted", 2);

    private static final /* synthetic */ com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote[] $values() {
        return new com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote[]{None, Upvoted, Downvoted};
    }

    static {
        com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ReviewVotes$Vote(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote valueOf(java.lang.String str) {
        return (com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote) java.lang.Enum.valueOf(com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote.class, str);
    }

    public static com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote[] values() {
        return (com.truecaller.ratingsandreviews.api.internal.model.ReviewVotes$Vote[]) $VALUES.clone();
    }
}
