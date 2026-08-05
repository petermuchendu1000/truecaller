package com.truecaller.commentfeedback.presentation.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/commentfeedback/presentation/model/VoteStatus;", "", "<init>", "(Ljava/lang/String;I)V", "UPVOTED", "DOWNVOTED", "NOT_SELECTED", "comment-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class VoteStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.commentfeedback.presentation.model.VoteStatus[] $VALUES;
    public static final com.truecaller.commentfeedback.presentation.model.VoteStatus UPVOTED = new com.truecaller.commentfeedback.presentation.model.VoteStatus("UPVOTED", 0);
    public static final com.truecaller.commentfeedback.presentation.model.VoteStatus DOWNVOTED = new com.truecaller.commentfeedback.presentation.model.VoteStatus("DOWNVOTED", 1);
    public static final com.truecaller.commentfeedback.presentation.model.VoteStatus NOT_SELECTED = new com.truecaller.commentfeedback.presentation.model.VoteStatus("NOT_SELECTED", 2);

    private static final /* synthetic */ com.truecaller.commentfeedback.presentation.model.VoteStatus[] $values() {
        return new com.truecaller.commentfeedback.presentation.model.VoteStatus[]{UPVOTED, DOWNVOTED, NOT_SELECTED};
    }

    static {
        com.truecaller.commentfeedback.presentation.model.VoteStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private VoteStatus(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.commentfeedback.presentation.model.VoteStatus valueOf(java.lang.String str) {
        return (com.truecaller.commentfeedback.presentation.model.VoteStatus) java.lang.Enum.valueOf(com.truecaller.commentfeedback.presentation.model.VoteStatus.class, str);
    }

    public static com.truecaller.commentfeedback.presentation.model.VoteStatus[] values() {
        return (com.truecaller.commentfeedback.presentation.model.VoteStatus[]) $VALUES.clone();
    }
}
