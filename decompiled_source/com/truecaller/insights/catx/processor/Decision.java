package com.truecaller.insights.catx.processor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/truecaller/insights/catx/processor/Decision;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "CONVICTED_FRAUD", "MESSAGE_FRAUD", "SUSPECTED_FRAUD", "NON_SPAM", "SPAM", "SILENT_SPAM", "CONFLICTED_SPAM", "NEW_SENDER", "NEW_SENDER_SPAM", "TEN_DIGIT_SPAM", "L1_FEEDBACK", "NON_SPAM_FEEDBACK", "L2_FEEDBACK", "L3_FEEDBACK", "SUMMARY", "USE_CASE", "SKIP_PATTERN", "PARSER", "GOVERNMENT", "MASS_IM", "VERIFIED_NON_SPAM", "USER_BLOCKED", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Decision {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.catx.processor.Decision[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    public static final com.truecaller.insights.catx.processor.Decision CONVICTED_FRAUD = new com.truecaller.insights.catx.processor.Decision("CONVICTED_FRAUD", 0, "fraud");
    public static final com.truecaller.insights.catx.processor.Decision MESSAGE_FRAUD = new com.truecaller.insights.catx.processor.Decision("MESSAGE_FRAUD", 1, "message_fraud");
    public static final com.truecaller.insights.catx.processor.Decision SUSPECTED_FRAUD = new com.truecaller.insights.catx.processor.Decision("SUSPECTED_FRAUD", 2, "suspected_fraud");
    public static final com.truecaller.insights.catx.processor.Decision NON_SPAM = new com.truecaller.insights.catx.processor.Decision("NON_SPAM", 3, "non_spam");
    public static final com.truecaller.insights.catx.processor.Decision SPAM = new com.truecaller.insights.catx.processor.Decision("SPAM", 4, "spam");
    public static final com.truecaller.insights.catx.processor.Decision SILENT_SPAM = new com.truecaller.insights.catx.processor.Decision("SILENT_SPAM", 5, "silent_spam");
    public static final com.truecaller.insights.catx.processor.Decision CONFLICTED_SPAM = new com.truecaller.insights.catx.processor.Decision("CONFLICTED_SPAM", 6, "conflicted_spam");
    public static final com.truecaller.insights.catx.processor.Decision NEW_SENDER = new com.truecaller.insights.catx.processor.Decision("NEW_SENDER", 7, "new_sender");
    public static final com.truecaller.insights.catx.processor.Decision NEW_SENDER_SPAM = new com.truecaller.insights.catx.processor.Decision("NEW_SENDER_SPAM", 8, "new_sender_spam");
    public static final com.truecaller.insights.catx.processor.Decision TEN_DIGIT_SPAM = new com.truecaller.insights.catx.processor.Decision("TEN_DIGIT_SPAM", 9, "ten_digit_spam");
    public static final com.truecaller.insights.catx.processor.Decision L1_FEEDBACK = new com.truecaller.insights.catx.processor.Decision("L1_FEEDBACK", 10, "l1_feedback");
    public static final com.truecaller.insights.catx.processor.Decision NON_SPAM_FEEDBACK = new com.truecaller.insights.catx.processor.Decision("NON_SPAM_FEEDBACK", 11, "non_spam_feedback");
    public static final com.truecaller.insights.catx.processor.Decision L2_FEEDBACK = new com.truecaller.insights.catx.processor.Decision("L2_FEEDBACK", 12, "l2_feedback");
    public static final com.truecaller.insights.catx.processor.Decision L3_FEEDBACK = new com.truecaller.insights.catx.processor.Decision("L3_FEEDBACK", 13, "l3_feedback");
    public static final com.truecaller.insights.catx.processor.Decision SUMMARY = new com.truecaller.insights.catx.processor.Decision("SUMMARY", 14, "summary");
    public static final com.truecaller.insights.catx.processor.Decision USE_CASE = new com.truecaller.insights.catx.processor.Decision("USE_CASE", 15, "usecase");
    public static final com.truecaller.insights.catx.processor.Decision SKIP_PATTERN = new com.truecaller.insights.catx.processor.Decision("SKIP_PATTERN", 16, "skip_pattern");
    public static final com.truecaller.insights.catx.processor.Decision PARSER = new com.truecaller.insights.catx.processor.Decision("PARSER", 17, "parser");
    public static final com.truecaller.insights.catx.processor.Decision GOVERNMENT = new com.truecaller.insights.catx.processor.Decision("GOVERNMENT", 18, "government");
    public static final com.truecaller.insights.catx.processor.Decision MASS_IM = new com.truecaller.insights.catx.processor.Decision("MASS_IM", 19, "mass_im");
    public static final com.truecaller.insights.catx.processor.Decision VERIFIED_NON_SPAM = new com.truecaller.insights.catx.processor.Decision("VERIFIED_NON_SPAM", 20, "verified_non_spam");
    public static final com.truecaller.insights.catx.processor.Decision USER_BLOCKED = new com.truecaller.insights.catx.processor.Decision("USER_BLOCKED", 21, "user_blocked");

    private static final /* synthetic */ com.truecaller.insights.catx.processor.Decision[] $values() {
        return new com.truecaller.insights.catx.processor.Decision[]{CONVICTED_FRAUD, MESSAGE_FRAUD, SUSPECTED_FRAUD, NON_SPAM, SPAM, SILENT_SPAM, CONFLICTED_SPAM, NEW_SENDER, NEW_SENDER_SPAM, TEN_DIGIT_SPAM, L1_FEEDBACK, NON_SPAM_FEEDBACK, L2_FEEDBACK, L3_FEEDBACK, SUMMARY, USE_CASE, SKIP_PATTERN, PARSER, GOVERNMENT, MASS_IM, VERIFIED_NON_SPAM, USER_BLOCKED};
    }

    static {
        com.truecaller.insights.catx.processor.Decision[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Decision(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.catx.processor.Decision valueOf(java.lang.String str) {
        return (com.truecaller.insights.catx.processor.Decision) java.lang.Enum.valueOf(com.truecaller.insights.catx.processor.Decision.class, str);
    }

    public static com.truecaller.insights.catx.processor.Decision[] values() {
        return (com.truecaller.insights.catx.processor.Decision[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }
}
