package com.truecaller.insights.catx.processor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006*"}, d2 = {"Lcom/truecaller/insights/catx/processor/LandingTabReason;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "USER_REPORTED_FRAUD", "CATEGORIZER_DETERMINED", "CONVICTED_FRAUD", "BLACKLIST_FRAUD", "TRANS_PROMO", "USER_REPORTED_SPAM", "USER_REPORTED_SPAM_SENDER", "USER_REPORTED_NON_SPAM", "USER_REPORTED_NOT_SPAM_SENDER", "USER_REPORTED_SPAMMER", "USER_REPORTED_NOT_SPAMMER", "SENDER_SAVED_OR_REPLIED", "SENDER_WHITELISTED", "USER_BLOCKED", "BLACKLIST_SPAM", "DEFINITE_NON_SPAM", "HIGH_SPAM_SCORE", "LOW_SPAM_SCORE", "NO_SPAM_SCORE", "L1_PATTERN_MATCHED_SPAM", "L1_PATTERN_MATCHED_NON_SPAM", "EXISTING_L2_FEEDBACK", "EXISTING_L3_FEEDBACK", "UNTRACKED", "OFFER_FROM_BACKEND", "GRM_OFFER", "DEFINITE_SPAM", "TC_WHITELISTED_SENDER", "PARSER_CATEGORY", "MASS_IM", "TRAI_SUFFIX_PROMOTIONAL_SENDER", "RCS_SENDER", "SEARCH_CONTEXT_FLAGGED_SPAM", "CONTENT_FRAUD_MODEL_TEMP", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class LandingTabReason {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.catx.processor.LandingTabReason[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    public static final com.truecaller.insights.catx.processor.LandingTabReason USER_REPORTED_FRAUD = new com.truecaller.insights.catx.processor.LandingTabReason("USER_REPORTED_FRAUD", 0, "user_reported_fraud");
    public static final com.truecaller.insights.catx.processor.LandingTabReason CATEGORIZER_DETERMINED = new com.truecaller.insights.catx.processor.LandingTabReason("CATEGORIZER_DETERMINED", 1, "categorizer_determined");
    public static final com.truecaller.insights.catx.processor.LandingTabReason CONVICTED_FRAUD = new com.truecaller.insights.catx.processor.LandingTabReason("CONVICTED_FRAUD", 2, "convicted_fraud");
    public static final com.truecaller.insights.catx.processor.LandingTabReason BLACKLIST_FRAUD = new com.truecaller.insights.catx.processor.LandingTabReason("BLACKLIST_FRAUD", 3, "blacklist_fraud");
    public static final com.truecaller.insights.catx.processor.LandingTabReason TRANS_PROMO = new com.truecaller.insights.catx.processor.LandingTabReason("TRANS_PROMO", 4, "trans_promo");
    public static final com.truecaller.insights.catx.processor.LandingTabReason USER_REPORTED_SPAM = new com.truecaller.insights.catx.processor.LandingTabReason("USER_REPORTED_SPAM", 5, "user_reported_spam");
    public static final com.truecaller.insights.catx.processor.LandingTabReason USER_REPORTED_SPAM_SENDER = new com.truecaller.insights.catx.processor.LandingTabReason("USER_REPORTED_SPAM_SENDER", 6, "user_reported_spam_sender");
    public static final com.truecaller.insights.catx.processor.LandingTabReason USER_REPORTED_NON_SPAM = new com.truecaller.insights.catx.processor.LandingTabReason("USER_REPORTED_NON_SPAM", 7, "user_reported_non_spam");
    public static final com.truecaller.insights.catx.processor.LandingTabReason USER_REPORTED_NOT_SPAM_SENDER = new com.truecaller.insights.catx.processor.LandingTabReason("USER_REPORTED_NOT_SPAM_SENDER", 8, "user_reported_not_spam_sender");
    public static final com.truecaller.insights.catx.processor.LandingTabReason USER_REPORTED_SPAMMER = new com.truecaller.insights.catx.processor.LandingTabReason("USER_REPORTED_SPAMMER", 9, "user_reported_spammer");
    public static final com.truecaller.insights.catx.processor.LandingTabReason USER_REPORTED_NOT_SPAMMER = new com.truecaller.insights.catx.processor.LandingTabReason("USER_REPORTED_NOT_SPAMMER", 10, "user_reported_not_spammer");
    public static final com.truecaller.insights.catx.processor.LandingTabReason SENDER_SAVED_OR_REPLIED = new com.truecaller.insights.catx.processor.LandingTabReason("SENDER_SAVED_OR_REPLIED", 11, "sender_saved_or_replied");
    public static final com.truecaller.insights.catx.processor.LandingTabReason SENDER_WHITELISTED = new com.truecaller.insights.catx.processor.LandingTabReason("SENDER_WHITELISTED", 12, "sender_whitelisted");
    public static final com.truecaller.insights.catx.processor.LandingTabReason USER_BLOCKED = new com.truecaller.insights.catx.processor.LandingTabReason("USER_BLOCKED", 13, "user_blocked");
    public static final com.truecaller.insights.catx.processor.LandingTabReason BLACKLIST_SPAM = new com.truecaller.insights.catx.processor.LandingTabReason("BLACKLIST_SPAM", 14, "blacklist_spam");
    public static final com.truecaller.insights.catx.processor.LandingTabReason DEFINITE_NON_SPAM = new com.truecaller.insights.catx.processor.LandingTabReason("DEFINITE_NON_SPAM", 15, "definite_non_spam");
    public static final com.truecaller.insights.catx.processor.LandingTabReason HIGH_SPAM_SCORE = new com.truecaller.insights.catx.processor.LandingTabReason("HIGH_SPAM_SCORE", 16, "high_spam_score");
    public static final com.truecaller.insights.catx.processor.LandingTabReason LOW_SPAM_SCORE = new com.truecaller.insights.catx.processor.LandingTabReason("LOW_SPAM_SCORE", 17, "low_spam_score");
    public static final com.truecaller.insights.catx.processor.LandingTabReason NO_SPAM_SCORE = new com.truecaller.insights.catx.processor.LandingTabReason("NO_SPAM_SCORE", 18, "no_spam_score");
    public static final com.truecaller.insights.catx.processor.LandingTabReason L1_PATTERN_MATCHED_SPAM = new com.truecaller.insights.catx.processor.LandingTabReason("L1_PATTERN_MATCHED_SPAM", 19, "l1_pattern_matched_spam");
    public static final com.truecaller.insights.catx.processor.LandingTabReason L1_PATTERN_MATCHED_NON_SPAM = new com.truecaller.insights.catx.processor.LandingTabReason("L1_PATTERN_MATCHED_NON_SPAM", 20, "l1_pattern_matched_non_spam");
    public static final com.truecaller.insights.catx.processor.LandingTabReason EXISTING_L2_FEEDBACK = new com.truecaller.insights.catx.processor.LandingTabReason("EXISTING_L2_FEEDBACK", 21, "existing_l2_feedback");
    public static final com.truecaller.insights.catx.processor.LandingTabReason EXISTING_L3_FEEDBACK = new com.truecaller.insights.catx.processor.LandingTabReason("EXISTING_L3_FEEDBACK", 22, "existing_l3_feedback");
    public static final com.truecaller.insights.catx.processor.LandingTabReason UNTRACKED = new com.truecaller.insights.catx.processor.LandingTabReason("UNTRACKED", 23, "");
    public static final com.truecaller.insights.catx.processor.LandingTabReason OFFER_FROM_BACKEND = new com.truecaller.insights.catx.processor.LandingTabReason("OFFER_FROM_BACKEND", 24, "offer_from_backend");
    public static final com.truecaller.insights.catx.processor.LandingTabReason GRM_OFFER = new com.truecaller.insights.catx.processor.LandingTabReason("GRM_OFFER", 25, "grm_offers");
    public static final com.truecaller.insights.catx.processor.LandingTabReason DEFINITE_SPAM = new com.truecaller.insights.catx.processor.LandingTabReason("DEFINITE_SPAM", 26, "definite_spam");
    public static final com.truecaller.insights.catx.processor.LandingTabReason TC_WHITELISTED_SENDER = new com.truecaller.insights.catx.processor.LandingTabReason("TC_WHITELISTED_SENDER", 27, "tc_whitelisted_sender");
    public static final com.truecaller.insights.catx.processor.LandingTabReason PARSER_CATEGORY = new com.truecaller.insights.catx.processor.LandingTabReason("PARSER_CATEGORY", 28, "parser_category");
    public static final com.truecaller.insights.catx.processor.LandingTabReason MASS_IM = new com.truecaller.insights.catx.processor.LandingTabReason("MASS_IM", 29, "mass_im");
    public static final com.truecaller.insights.catx.processor.LandingTabReason TRAI_SUFFIX_PROMOTIONAL_SENDER = new com.truecaller.insights.catx.processor.LandingTabReason("TRAI_SUFFIX_PROMOTIONAL_SENDER", 30, "trai_suffix_promotional_sender");
    public static final com.truecaller.insights.catx.processor.LandingTabReason RCS_SENDER = new com.truecaller.insights.catx.processor.LandingTabReason("RCS_SENDER", 31, "rcs_sender");
    public static final com.truecaller.insights.catx.processor.LandingTabReason SEARCH_CONTEXT_FLAGGED_SPAM = new com.truecaller.insights.catx.processor.LandingTabReason("SEARCH_CONTEXT_FLAGGED_SPAM", 32, "search_context_flagged_spam");
    public static final com.truecaller.insights.catx.processor.LandingTabReason CONTENT_FRAUD_MODEL_TEMP = new com.truecaller.insights.catx.processor.LandingTabReason("CONTENT_FRAUD_MODEL_TEMP", 33, "content_fraud_model_temp");

    private static final /* synthetic */ com.truecaller.insights.catx.processor.LandingTabReason[] $values() {
        return new com.truecaller.insights.catx.processor.LandingTabReason[]{USER_REPORTED_FRAUD, CATEGORIZER_DETERMINED, CONVICTED_FRAUD, BLACKLIST_FRAUD, TRANS_PROMO, USER_REPORTED_SPAM, USER_REPORTED_SPAM_SENDER, USER_REPORTED_NON_SPAM, USER_REPORTED_NOT_SPAM_SENDER, USER_REPORTED_SPAMMER, USER_REPORTED_NOT_SPAMMER, SENDER_SAVED_OR_REPLIED, SENDER_WHITELISTED, USER_BLOCKED, BLACKLIST_SPAM, DEFINITE_NON_SPAM, HIGH_SPAM_SCORE, LOW_SPAM_SCORE, NO_SPAM_SCORE, L1_PATTERN_MATCHED_SPAM, L1_PATTERN_MATCHED_NON_SPAM, EXISTING_L2_FEEDBACK, EXISTING_L3_FEEDBACK, UNTRACKED, OFFER_FROM_BACKEND, GRM_OFFER, DEFINITE_SPAM, TC_WHITELISTED_SENDER, PARSER_CATEGORY, MASS_IM, TRAI_SUFFIX_PROMOTIONAL_SENDER, RCS_SENDER, SEARCH_CONTEXT_FLAGGED_SPAM, CONTENT_FRAUD_MODEL_TEMP};
    }

    static {
        com.truecaller.insights.catx.processor.LandingTabReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private LandingTabReason(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.catx.processor.LandingTabReason valueOf(java.lang.String str) {
        return (com.truecaller.insights.catx.processor.LandingTabReason) java.lang.Enum.valueOf(com.truecaller.insights.catx.processor.LandingTabReason.class, str);
    }

    public static com.truecaller.insights.catx.processor.LandingTabReason[] values() {
        return (com.truecaller.insights.catx.processor.LandingTabReason[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }
}
