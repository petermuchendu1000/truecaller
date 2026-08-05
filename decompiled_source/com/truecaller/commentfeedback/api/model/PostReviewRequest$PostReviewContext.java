package com.truecaller.commentfeedback.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/commentfeedback/api/model/PostReviewRequest$PostReviewContext", "", "Lcom/truecaller/commentfeedback/api/model/PostReviewRequest$PostReviewContext;", "<init>", "(Ljava/lang/String;I)V", "DETAILS_VIEW", "ACS", "UNSPECIFIED", "comment-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PostReviewRequest$PostReviewContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext[] $VALUES;
    public static final com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext DETAILS_VIEW = new com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext("DETAILS_VIEW", 0);
    public static final com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext ACS = new com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext("ACS", 1);
    public static final com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext UNSPECIFIED = new com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext("UNSPECIFIED", 2);

    private static final /* synthetic */ com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext[] $values() {
        return new com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext[]{DETAILS_VIEW, ACS, UNSPECIFIED};
    }

    static {
        com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PostReviewRequest$PostReviewContext(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext valueOf(java.lang.String str) {
        return (com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext) java.lang.Enum.valueOf(com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext.class, str);
    }

    public static com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext[] values() {
        return (com.truecaller.commentfeedback.api.model.PostReviewRequest$PostReviewContext[]) $VALUES.clone();
    }
}
