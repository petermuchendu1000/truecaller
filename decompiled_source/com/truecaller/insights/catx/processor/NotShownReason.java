package com.truecaller.insights.catx.processor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lcom/truecaller/insights/catx/processor/NotShownReason;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "DMA_USER_FRAUD_BLOCKED", "USER_REPORTED_NOT_FRAUD", "FEEDBACK_COOLDOWN", "NEW_BIZ_IM_COOLDOWN", "LLM_SUMMARY_MAPPING_FAILED", "LLM_USE_CASE_MAPPING_FAILED", "LLM_SKIP_PATTERN", "LLM_PATTERN_MATCHING_ERROR", "THREE_LEVEL_SPAM_DISABLED", "THREE_LEVEL_SPAM_BIZ_DISABLED", "THREE_LEVEL_SPAM_SMS_DISABLED", "SPAM_MID_SHOWN_COOLDOWN", "SPAM_SCORE_HIGH", "DEFINITE_SPAM", "BLACKLISTED_SPAM", "OFFER_FROM_BACKEND", "USER_REPORTED_SPAM", "USER_REPORTED_SPAMMER", "USER_BLOCKED", "PARSER_MESSAGE_FILTER_FAILURE", "UNKNOWN_SENDER", "KNOWN_SENDER_SEARCH_FAILURE", "PROMOTIONAL_SENDER_SMART_INFO_HIDDEN", "DELAYED_OTP", "SUPPRESS_FRAUD_WARNING", "UNTRACKED", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NotShownReason {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.catx.processor.NotShownReason[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    public static final com.truecaller.insights.catx.processor.NotShownReason DMA_USER_FRAUD_BLOCKED = new com.truecaller.insights.catx.processor.NotShownReason("DMA_USER_FRAUD_BLOCKED", 0, "dma_user_fraud_blocked");
    public static final com.truecaller.insights.catx.processor.NotShownReason USER_REPORTED_NOT_FRAUD = new com.truecaller.insights.catx.processor.NotShownReason("USER_REPORTED_NOT_FRAUD", 1, "user_reported_not_fraud");
    public static final com.truecaller.insights.catx.processor.NotShownReason FEEDBACK_COOLDOWN = new com.truecaller.insights.catx.processor.NotShownReason("FEEDBACK_COOLDOWN", 2, "feedback_cooldown");
    public static final com.truecaller.insights.catx.processor.NotShownReason NEW_BIZ_IM_COOLDOWN = new com.truecaller.insights.catx.processor.NotShownReason("NEW_BIZ_IM_COOLDOWN", 3, "new_biz_im_cooldown");
    public static final com.truecaller.insights.catx.processor.NotShownReason LLM_SUMMARY_MAPPING_FAILED = new com.truecaller.insights.catx.processor.NotShownReason("LLM_SUMMARY_MAPPING_FAILED", 4, "llm_summary_mapping_failed");
    public static final com.truecaller.insights.catx.processor.NotShownReason LLM_USE_CASE_MAPPING_FAILED = new com.truecaller.insights.catx.processor.NotShownReason("LLM_USE_CASE_MAPPING_FAILED", 5, "llm_usecase_mapping_failed");
    public static final com.truecaller.insights.catx.processor.NotShownReason LLM_SKIP_PATTERN = new com.truecaller.insights.catx.processor.NotShownReason("LLM_SKIP_PATTERN", 6, "llm_skip_pattern");
    public static final com.truecaller.insights.catx.processor.NotShownReason LLM_PATTERN_MATCHING_ERROR = new com.truecaller.insights.catx.processor.NotShownReason("LLM_PATTERN_MATCHING_ERROR", 7, "llm_pattern_matching_error");
    public static final com.truecaller.insights.catx.processor.NotShownReason THREE_LEVEL_SPAM_DISABLED = new com.truecaller.insights.catx.processor.NotShownReason("THREE_LEVEL_SPAM_DISABLED", 8, "three_level_spam_protection_disabled");
    public static final com.truecaller.insights.catx.processor.NotShownReason THREE_LEVEL_SPAM_BIZ_DISABLED = new com.truecaller.insights.catx.processor.NotShownReason("THREE_LEVEL_SPAM_BIZ_DISABLED", 9, "three_level_spam_business_disabled");
    public static final com.truecaller.insights.catx.processor.NotShownReason THREE_LEVEL_SPAM_SMS_DISABLED = new com.truecaller.insights.catx.processor.NotShownReason("THREE_LEVEL_SPAM_SMS_DISABLED", 10, "three_level_spam_sms_disabled");
    public static final com.truecaller.insights.catx.processor.NotShownReason SPAM_MID_SHOWN_COOLDOWN = new com.truecaller.insights.catx.processor.NotShownReason("SPAM_MID_SHOWN_COOLDOWN", 11, "spam_mid_cooldown");
    public static final com.truecaller.insights.catx.processor.NotShownReason SPAM_SCORE_HIGH = new com.truecaller.insights.catx.processor.NotShownReason("SPAM_SCORE_HIGH", 12, "spam_level_high");
    public static final com.truecaller.insights.catx.processor.NotShownReason DEFINITE_SPAM = new com.truecaller.insights.catx.processor.NotShownReason("DEFINITE_SPAM", 13, "definite_spam");
    public static final com.truecaller.insights.catx.processor.NotShownReason BLACKLISTED_SPAM = new com.truecaller.insights.catx.processor.NotShownReason("BLACKLISTED_SPAM", 14, "blacklisted_spam");
    public static final com.truecaller.insights.catx.processor.NotShownReason OFFER_FROM_BACKEND = new com.truecaller.insights.catx.processor.NotShownReason("OFFER_FROM_BACKEND", 15, "offer_from_backend");
    public static final com.truecaller.insights.catx.processor.NotShownReason USER_REPORTED_SPAM = new com.truecaller.insights.catx.processor.NotShownReason("USER_REPORTED_SPAM", 16, "user_reported_spam");
    public static final com.truecaller.insights.catx.processor.NotShownReason USER_REPORTED_SPAMMER = new com.truecaller.insights.catx.processor.NotShownReason("USER_REPORTED_SPAMMER", 17, "user_reported_spammer");
    public static final com.truecaller.insights.catx.processor.NotShownReason USER_BLOCKED = new com.truecaller.insights.catx.processor.NotShownReason("USER_BLOCKED", 18, "user_blocked");
    public static final com.truecaller.insights.catx.processor.NotShownReason PARSER_MESSAGE_FILTER_FAILURE = new com.truecaller.insights.catx.processor.NotShownReason("PARSER_MESSAGE_FILTER_FAILURE", 19, "parser_message_filter_failure");
    public static final com.truecaller.insights.catx.processor.NotShownReason UNKNOWN_SENDER = new com.truecaller.insights.catx.processor.NotShownReason("UNKNOWN_SENDER", 20, "unknown_sender");
    public static final com.truecaller.insights.catx.processor.NotShownReason KNOWN_SENDER_SEARCH_FAILURE = new com.truecaller.insights.catx.processor.NotShownReason("KNOWN_SENDER_SEARCH_FAILURE", 21, "known_sender_search_failure");
    public static final com.truecaller.insights.catx.processor.NotShownReason PROMOTIONAL_SENDER_SMART_INFO_HIDDEN = new com.truecaller.insights.catx.processor.NotShownReason("PROMOTIONAL_SENDER_SMART_INFO_HIDDEN", 22, "promotional_sender_smart_info_hidden");
    public static final com.truecaller.insights.catx.processor.NotShownReason DELAYED_OTP = new com.truecaller.insights.catx.processor.NotShownReason("DELAYED_OTP", 23, "notification_suppressed_for_delay");
    public static final com.truecaller.insights.catx.processor.NotShownReason SUPPRESS_FRAUD_WARNING = new com.truecaller.insights.catx.processor.NotShownReason("SUPPRESS_FRAUD_WARNING", 24, "suppress_fraud_warning");
    public static final com.truecaller.insights.catx.processor.NotShownReason UNTRACKED = new com.truecaller.insights.catx.processor.NotShownReason("UNTRACKED", 25, "");

    private static final /* synthetic */ com.truecaller.insights.catx.processor.NotShownReason[] $values() {
        return new com.truecaller.insights.catx.processor.NotShownReason[]{DMA_USER_FRAUD_BLOCKED, USER_REPORTED_NOT_FRAUD, FEEDBACK_COOLDOWN, NEW_BIZ_IM_COOLDOWN, LLM_SUMMARY_MAPPING_FAILED, LLM_USE_CASE_MAPPING_FAILED, LLM_SKIP_PATTERN, LLM_PATTERN_MATCHING_ERROR, THREE_LEVEL_SPAM_DISABLED, THREE_LEVEL_SPAM_BIZ_DISABLED, THREE_LEVEL_SPAM_SMS_DISABLED, SPAM_MID_SHOWN_COOLDOWN, SPAM_SCORE_HIGH, DEFINITE_SPAM, BLACKLISTED_SPAM, OFFER_FROM_BACKEND, USER_REPORTED_SPAM, USER_REPORTED_SPAMMER, USER_BLOCKED, PARSER_MESSAGE_FILTER_FAILURE, UNKNOWN_SENDER, KNOWN_SENDER_SEARCH_FAILURE, PROMOTIONAL_SENDER_SMART_INFO_HIDDEN, DELAYED_OTP, SUPPRESS_FRAUD_WARNING, UNTRACKED};
    }

    static {
        com.truecaller.insights.catx.processor.NotShownReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NotShownReason(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.catx.processor.NotShownReason valueOf(java.lang.String str) {
        return (com.truecaller.insights.catx.processor.NotShownReason) java.lang.Enum.valueOf(com.truecaller.insights.catx.processor.NotShownReason.class, str);
    }

    public static com.truecaller.insights.catx.processor.NotShownReason[] values() {
        return (com.truecaller.insights.catx.processor.NotShownReason[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }
}
