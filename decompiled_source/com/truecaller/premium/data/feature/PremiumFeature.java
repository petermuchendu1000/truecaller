package com.truecaller.premium.data.feature;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/truecaller/premium/data/feature/PremiumFeature;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "e92/b", "ANNOUNCE_CALL", "CALLER_ID", "CALL_ASSISTANT", "CALL_RECORDING", "CLOUD_TELEPHONY_CALL_RECORDING", "CONTACT_REQUEST", "EXTENDED_SPAM_BLOCKING", "FAMILY_SHARING", "FRAUD_INSURANCE", "GHOST_CALL", "GOLD_CALLER_ID", "INCOGNITO_MODE", "IDENTIFY_AI", "NO_ADS", "PREMIUM_BADGE", "PREMIUM_SUPPORT", "SPAM_BLOCKING", "VERIFIED_BADGE", "UNKNOWN", "WHATSAPP_CALLER_ID", "WHO_SEARCHED_FOR_ME", "WHO_VIEWED_ME", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumFeature {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.feature.PremiumFeature[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final e92.b Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.premium.data.feature.PremiumFeature ANNOUNCE_CALL = new com.truecaller.premium.data.feature.PremiumFeature("ANNOUNCE_CALL", 0, "announce_call");
    public static final com.truecaller.premium.data.feature.PremiumFeature CALLER_ID = new com.truecaller.premium.data.feature.PremiumFeature("CALLER_ID", 1, "caller_id");
    public static final com.truecaller.premium.data.feature.PremiumFeature CALL_ASSISTANT = new com.truecaller.premium.data.feature.PremiumFeature("CALL_ASSISTANT", 2, "call_assistant");
    public static final com.truecaller.premium.data.feature.PremiumFeature CALL_RECORDING = new com.truecaller.premium.data.feature.PremiumFeature("CALL_RECORDING", 3, "call_recording");
    public static final com.truecaller.premium.data.feature.PremiumFeature CLOUD_TELEPHONY_CALL_RECORDING = new com.truecaller.premium.data.feature.PremiumFeature("CLOUD_TELEPHONY_CALL_RECORDING", 4, "ct_call_recording");
    public static final com.truecaller.premium.data.feature.PremiumFeature CONTACT_REQUEST = new com.truecaller.premium.data.feature.PremiumFeature("CONTACT_REQUEST", 5, "contact_request");
    public static final com.truecaller.premium.data.feature.PremiumFeature EXTENDED_SPAM_BLOCKING = new com.truecaller.premium.data.feature.PremiumFeature("EXTENDED_SPAM_BLOCKING", 6, "extended_spam_blocking");
    public static final com.truecaller.premium.data.feature.PremiumFeature FAMILY_SHARING = new com.truecaller.premium.data.feature.PremiumFeature("FAMILY_SHARING", 7, "family_sharing");
    public static final com.truecaller.premium.data.feature.PremiumFeature FRAUD_INSURANCE = new com.truecaller.premium.data.feature.PremiumFeature("FRAUD_INSURANCE", 8, "fraud_insurance");
    public static final com.truecaller.premium.data.feature.PremiumFeature GHOST_CALL = new com.truecaller.premium.data.feature.PremiumFeature("GHOST_CALL", 9, "ghost_call");
    public static final com.truecaller.premium.data.feature.PremiumFeature GOLD_CALLER_ID = new com.truecaller.premium.data.feature.PremiumFeature("GOLD_CALLER_ID", 10, "gold_caller_id");
    public static final com.truecaller.premium.data.feature.PremiumFeature INCOGNITO_MODE = new com.truecaller.premium.data.feature.PremiumFeature("INCOGNITO_MODE", 11, "incognito_mode");
    public static final com.truecaller.premium.data.feature.PremiumFeature IDENTIFY_AI = new com.truecaller.premium.data.feature.PremiumFeature("IDENTIFY_AI", 12, "identifai");
    public static final com.truecaller.premium.data.feature.PremiumFeature NO_ADS = new com.truecaller.premium.data.feature.PremiumFeature("NO_ADS", 13, "no_ads");
    public static final com.truecaller.premium.data.feature.PremiumFeature PREMIUM_BADGE = new com.truecaller.premium.data.feature.PremiumFeature("PREMIUM_BADGE", 14, "premium_badge");
    public static final com.truecaller.premium.data.feature.PremiumFeature PREMIUM_SUPPORT = new com.truecaller.premium.data.feature.PremiumFeature("PREMIUM_SUPPORT", 15, "live_chat_support");
    public static final com.truecaller.premium.data.feature.PremiumFeature SPAM_BLOCKING = new com.truecaller.premium.data.feature.PremiumFeature("SPAM_BLOCKING", 16, "spam_blocking");
    public static final com.truecaller.premium.data.feature.PremiumFeature VERIFIED_BADGE = new com.truecaller.premium.data.feature.PremiumFeature("VERIFIED_BADGE", 17, "verified_badge");
    public static final com.truecaller.premium.data.feature.PremiumFeature UNKNOWN = new com.truecaller.premium.data.feature.PremiumFeature("UNKNOWN", 18, "unknown");
    public static final com.truecaller.premium.data.feature.PremiumFeature WHATSAPP_CALLER_ID = new com.truecaller.premium.data.feature.PremiumFeature("WHATSAPP_CALLER_ID", 19, "whatsapp_caller_id");
    public static final com.truecaller.premium.data.feature.PremiumFeature WHO_SEARCHED_FOR_ME = new com.truecaller.premium.data.feature.PremiumFeature("WHO_SEARCHED_FOR_ME", 20, "who_searched_for_me");
    public static final com.truecaller.premium.data.feature.PremiumFeature WHO_VIEWED_ME = new com.truecaller.premium.data.feature.PremiumFeature("WHO_VIEWED_ME", 21, "who_viewed_my_profile");

    private static final /* synthetic */ com.truecaller.premium.data.feature.PremiumFeature[] $values() {
        return new com.truecaller.premium.data.feature.PremiumFeature[]{ANNOUNCE_CALL, CALLER_ID, CALL_ASSISTANT, CALL_RECORDING, CLOUD_TELEPHONY_CALL_RECORDING, CONTACT_REQUEST, EXTENDED_SPAM_BLOCKING, FAMILY_SHARING, FRAUD_INSURANCE, GHOST_CALL, GOLD_CALLER_ID, INCOGNITO_MODE, IDENTIFY_AI, NO_ADS, PREMIUM_BADGE, PREMIUM_SUPPORT, SPAM_BLOCKING, VERIFIED_BADGE, UNKNOWN, WHATSAPP_CALLER_ID, WHO_SEARCHED_FOR_ME, WHO_VIEWED_ME};
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, e92.b] */
    static {
        com.truecaller.premium.data.feature.PremiumFeature[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private PremiumFeature(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.data.feature.PremiumFeature fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return e92.b.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.feature.PremiumFeature valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.feature.PremiumFeature) java.lang.Enum.valueOf(com.truecaller.premium.data.feature.PremiumFeature.class, str);
    }

    public static com.truecaller.premium.data.feature.PremiumFeature[] values() {
        return (com.truecaller.premium.data.feature.PremiumFeature[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
