package com.truecaller.insights.catx.processor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006'"}, d2 = {"Lcom/truecaller/insights/catx/processor/ShownReason;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "USER_REPORTED_FRAUD", "CONVICTED_FRAUD", "FRAUD_SCORE_DETERMINED", "GRM_BLACKLIST_FRAUD", "CONFLICT_HIGH_SPAM_SCORE", "SPAM_NO_CONFLICT", "CATEGORIZER_DETERMINED", "CONFLICT_LOW_SPAM_SCORE", "CONFLICT_CATEGORIZER_DETERMINED", "NEW_SENDER", "NEW_SENDER_SPAM", "TEN_DIGIT_CATEGORIZER_SPAM", "L1_FEEDBACK", "L2_FEEDBACK", "L3_FEEDBACK", "FRAUD_MO", "NON_SPAM_FEEDBACK", "LLM_PATTERN_MATCHING_ERROR", "LLM_SUMMARY_MAPPING_FAILED", "LLM_USE_CASE_MAPPING_FAILED", "LLM_SUMMARY", "LLM_USE_CASE", "LLM_NO_PATTERN_MATCHED", "PARSER_CATEGORY", "GOVERNMENT", "MASS_IM", "TRAI_SUFFIX_PROMOTIONAL_SENDER", "VERIFIED_SENDER", "SEARCH_CONTEXT_SPAM", "UNTRACKED", "CONTENT_FRAUD_MODEL_TEMP", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ShownReason {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.catx.processor.ShownReason[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    public static final com.truecaller.insights.catx.processor.ShownReason USER_REPORTED_FRAUD = new com.truecaller.insights.catx.processor.ShownReason("USER_REPORTED_FRAUD", 0, "user_reported_fraud");
    public static final com.truecaller.insights.catx.processor.ShownReason CONVICTED_FRAUD = new com.truecaller.insights.catx.processor.ShownReason("CONVICTED_FRAUD", 1, "convicted_fraud");
    public static final com.truecaller.insights.catx.processor.ShownReason FRAUD_SCORE_DETERMINED = new com.truecaller.insights.catx.processor.ShownReason("FRAUD_SCORE_DETERMINED", 2, "fraud_score_determined");
    public static final com.truecaller.insights.catx.processor.ShownReason GRM_BLACKLIST_FRAUD = new com.truecaller.insights.catx.processor.ShownReason("GRM_BLACKLIST_FRAUD", 3, "grm_blacklist_fraud");
    public static final com.truecaller.insights.catx.processor.ShownReason CONFLICT_HIGH_SPAM_SCORE = new com.truecaller.insights.catx.processor.ShownReason("CONFLICT_HIGH_SPAM_SCORE", 4, "conflict_high_spam_score");
    public static final com.truecaller.insights.catx.processor.ShownReason SPAM_NO_CONFLICT = new com.truecaller.insights.catx.processor.ShownReason("SPAM_NO_CONFLICT", 5, "spam_no_conflict");
    public static final com.truecaller.insights.catx.processor.ShownReason CATEGORIZER_DETERMINED = new com.truecaller.insights.catx.processor.ShownReason("CATEGORIZER_DETERMINED", 6, "categorizer_determined");
    public static final com.truecaller.insights.catx.processor.ShownReason CONFLICT_LOW_SPAM_SCORE = new com.truecaller.insights.catx.processor.ShownReason("CONFLICT_LOW_SPAM_SCORE", 7, "conflict_low_spam_score");
    public static final com.truecaller.insights.catx.processor.ShownReason CONFLICT_CATEGORIZER_DETERMINED = new com.truecaller.insights.catx.processor.ShownReason("CONFLICT_CATEGORIZER_DETERMINED", 8, "conflict_categorizer_determined");
    public static final com.truecaller.insights.catx.processor.ShownReason NEW_SENDER = new com.truecaller.insights.catx.processor.ShownReason("NEW_SENDER", 9, "new_sender");
    public static final com.truecaller.insights.catx.processor.ShownReason NEW_SENDER_SPAM = new com.truecaller.insights.catx.processor.ShownReason("NEW_SENDER_SPAM", 10, "new_sender_spam");
    public static final com.truecaller.insights.catx.processor.ShownReason TEN_DIGIT_CATEGORIZER_SPAM = new com.truecaller.insights.catx.processor.ShownReason("TEN_DIGIT_CATEGORIZER_SPAM", 11, "ten_digit_categorizer_spam");
    public static final com.truecaller.insights.catx.processor.ShownReason L1_FEEDBACK = new com.truecaller.insights.catx.processor.ShownReason("L1_FEEDBACK", 12, "l1_feedback");
    public static final com.truecaller.insights.catx.processor.ShownReason L2_FEEDBACK = new com.truecaller.insights.catx.processor.ShownReason("L2_FEEDBACK", 13, "l2_feedback");
    public static final com.truecaller.insights.catx.processor.ShownReason L3_FEEDBACK = new com.truecaller.insights.catx.processor.ShownReason("L3_FEEDBACK", 14, "l3_feedback");
    public static final com.truecaller.insights.catx.processor.ShownReason FRAUD_MO = new com.truecaller.insights.catx.processor.ShownReason("FRAUD_MO", 15, "fraud_mo");
    public static final com.truecaller.insights.catx.processor.ShownReason NON_SPAM_FEEDBACK = new com.truecaller.insights.catx.processor.ShownReason("NON_SPAM_FEEDBACK", 16, "non_spam_feedback");
    public static final com.truecaller.insights.catx.processor.ShownReason LLM_PATTERN_MATCHING_ERROR = new com.truecaller.insights.catx.processor.ShownReason("LLM_PATTERN_MATCHING_ERROR", 17, "llm_pattern_matching_error");
    public static final com.truecaller.insights.catx.processor.ShownReason LLM_SUMMARY_MAPPING_FAILED = new com.truecaller.insights.catx.processor.ShownReason("LLM_SUMMARY_MAPPING_FAILED", 18, "llm_summary_mapping_failed");
    public static final com.truecaller.insights.catx.processor.ShownReason LLM_USE_CASE_MAPPING_FAILED = new com.truecaller.insights.catx.processor.ShownReason("LLM_USE_CASE_MAPPING_FAILED", 19, "llm_usecase_mapping_failed");
    public static final com.truecaller.insights.catx.processor.ShownReason LLM_SUMMARY = new com.truecaller.insights.catx.processor.ShownReason("LLM_SUMMARY", 20, "llm_summary");
    public static final com.truecaller.insights.catx.processor.ShownReason LLM_USE_CASE = new com.truecaller.insights.catx.processor.ShownReason("LLM_USE_CASE", 21, "llm_usecase");
    public static final com.truecaller.insights.catx.processor.ShownReason LLM_NO_PATTERN_MATCHED = new com.truecaller.insights.catx.processor.ShownReason("LLM_NO_PATTERN_MATCHED", 22, "llm_no_pattern_matched");
    public static final com.truecaller.insights.catx.processor.ShownReason PARSER_CATEGORY = new com.truecaller.insights.catx.processor.ShownReason("PARSER_CATEGORY", 23, "parser_category");
    public static final com.truecaller.insights.catx.processor.ShownReason GOVERNMENT = new com.truecaller.insights.catx.processor.ShownReason("GOVERNMENT", 24, "government");
    public static final com.truecaller.insights.catx.processor.ShownReason MASS_IM = new com.truecaller.insights.catx.processor.ShownReason("MASS_IM", 25, "mass_im");
    public static final com.truecaller.insights.catx.processor.ShownReason TRAI_SUFFIX_PROMOTIONAL_SENDER = new com.truecaller.insights.catx.processor.ShownReason("TRAI_SUFFIX_PROMOTIONAL_SENDER", 26, "trai_suffix_promotional_sender");
    public static final com.truecaller.insights.catx.processor.ShownReason VERIFIED_SENDER = new com.truecaller.insights.catx.processor.ShownReason("VERIFIED_SENDER", 27, "verified_sender");
    public static final com.truecaller.insights.catx.processor.ShownReason SEARCH_CONTEXT_SPAM = new com.truecaller.insights.catx.processor.ShownReason("SEARCH_CONTEXT_SPAM", 28, "search_context_spam");
    public static final com.truecaller.insights.catx.processor.ShownReason UNTRACKED = new com.truecaller.insights.catx.processor.ShownReason("UNTRACKED", 29, "");
    public static final com.truecaller.insights.catx.processor.ShownReason CONTENT_FRAUD_MODEL_TEMP = new com.truecaller.insights.catx.processor.ShownReason("CONTENT_FRAUD_MODEL_TEMP", 30, "content_fraud_model_temp");

    private static final /* synthetic */ com.truecaller.insights.catx.processor.ShownReason[] $values() {
        return new com.truecaller.insights.catx.processor.ShownReason[]{USER_REPORTED_FRAUD, CONVICTED_FRAUD, FRAUD_SCORE_DETERMINED, GRM_BLACKLIST_FRAUD, CONFLICT_HIGH_SPAM_SCORE, SPAM_NO_CONFLICT, CATEGORIZER_DETERMINED, CONFLICT_LOW_SPAM_SCORE, CONFLICT_CATEGORIZER_DETERMINED, NEW_SENDER, NEW_SENDER_SPAM, TEN_DIGIT_CATEGORIZER_SPAM, L1_FEEDBACK, L2_FEEDBACK, L3_FEEDBACK, FRAUD_MO, NON_SPAM_FEEDBACK, LLM_PATTERN_MATCHING_ERROR, LLM_SUMMARY_MAPPING_FAILED, LLM_USE_CASE_MAPPING_FAILED, LLM_SUMMARY, LLM_USE_CASE, LLM_NO_PATTERN_MATCHED, PARSER_CATEGORY, GOVERNMENT, MASS_IM, TRAI_SUFFIX_PROMOTIONAL_SENDER, VERIFIED_SENDER, SEARCH_CONTEXT_SPAM, UNTRACKED, CONTENT_FRAUD_MODEL_TEMP};
    }

    static {
        com.truecaller.insights.catx.processor.ShownReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ShownReason(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.catx.processor.ShownReason valueOf(java.lang.String str) {
        return (com.truecaller.insights.catx.processor.ShownReason) java.lang.Enum.valueOf(com.truecaller.insights.catx.processor.ShownReason.class, str);
    }

    public static com.truecaller.insights.catx.processor.ShownReason[] values() {
        return (com.truecaller.insights.catx.processor.ShownReason[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }
}
