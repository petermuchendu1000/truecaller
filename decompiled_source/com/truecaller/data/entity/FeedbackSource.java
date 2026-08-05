package com.truecaller.data.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/data/entity/FeedbackSource;", "", "<init>", "(Ljava/lang/String;I)V", "BLOCK_FLOW", "SPAM_DETAILS_VIEW", "CALL_ASSISTANT_CONVERSATION", "CALL_ASSISTANT_CALL_UI", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FeedbackSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.data.entity.FeedbackSource[] $VALUES;
    public static final com.truecaller.data.entity.FeedbackSource BLOCK_FLOW = new com.truecaller.data.entity.FeedbackSource("BLOCK_FLOW", 0);
    public static final com.truecaller.data.entity.FeedbackSource SPAM_DETAILS_VIEW = new com.truecaller.data.entity.FeedbackSource("SPAM_DETAILS_VIEW", 1);
    public static final com.truecaller.data.entity.FeedbackSource CALL_ASSISTANT_CONVERSATION = new com.truecaller.data.entity.FeedbackSource("CALL_ASSISTANT_CONVERSATION", 2);
    public static final com.truecaller.data.entity.FeedbackSource CALL_ASSISTANT_CALL_UI = new com.truecaller.data.entity.FeedbackSource("CALL_ASSISTANT_CALL_UI", 3);

    private static final /* synthetic */ com.truecaller.data.entity.FeedbackSource[] $values() {
        return new com.truecaller.data.entity.FeedbackSource[]{BLOCK_FLOW, SPAM_DETAILS_VIEW, CALL_ASSISTANT_CONVERSATION, CALL_ASSISTANT_CALL_UI};
    }

    static {
        com.truecaller.data.entity.FeedbackSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FeedbackSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.data.entity.FeedbackSource valueOf(java.lang.String str) {
        return (com.truecaller.data.entity.FeedbackSource) java.lang.Enum.valueOf(com.truecaller.data.entity.FeedbackSource.class, str);
    }

    public static com.truecaller.data.entity.FeedbackSource[] values() {
        return (com.truecaller.data.entity.FeedbackSource[]) $VALUES.clone();
    }
}
