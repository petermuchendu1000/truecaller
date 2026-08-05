package com.truecaller.ratingsandreviews.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/ratingsandreviews/domain/model/PostReviewRequest$NumberType", "", "Lcom/truecaller/ratingsandreviews/domain/model/PostReviewRequest$NumberType;", "<init>", "(Ljava/lang/String;I)V", "PhoneNumber", "SenderId", "ImId", "Unknown", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class PostReviewRequest$NumberType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType[] $VALUES;
    public static final com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType PhoneNumber = new com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType("PhoneNumber", 0);
    public static final com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType SenderId = new com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType("SenderId", 1);
    public static final com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType ImId = new com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType("ImId", 2);
    public static final com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType Unknown = new com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType("Unknown", 3);

    private static final /* synthetic */ com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType[] $values() {
        return new com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType[]{PhoneNumber, SenderId, ImId, Unknown};
    }

    static {
        com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PostReviewRequest$NumberType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType valueOf(java.lang.String str) {
        return (com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType) java.lang.Enum.valueOf(com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType.class, str);
    }

    public static com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType[] values() {
        return (com.truecaller.ratingsandreviews.domain.model.PostReviewRequest$NumberType[]) $VALUES.clone();
    }
}
