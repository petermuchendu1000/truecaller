package com.truecaller.cloudtelephony.callrecording.ui.feedback;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/ui/feedback/FeedBack;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "POSITIVE", "NEGATIVE", "NEUTRAL", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class FeedBack {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack[] $VALUES;
    private final int value;
    public static final com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack POSITIVE = new com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack("POSITIVE", 0, 1);
    public static final com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack NEGATIVE = new com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack("NEGATIVE", 1, -1);
    public static final com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack NEUTRAL = new com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack("NEUTRAL", 2, 0);

    private static final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack[] $values() {
        return new com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack[]{POSITIVE, NEGATIVE, NEUTRAL};
    }

    static {
        com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FeedBack(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack valueOf(java.lang.String str) {
        return (com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack) java.lang.Enum.valueOf(com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack.class, str);
    }

    public static com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack[] values() {
        return (com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
