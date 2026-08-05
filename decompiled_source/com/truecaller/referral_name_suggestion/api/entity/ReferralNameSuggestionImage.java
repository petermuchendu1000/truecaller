package com.truecaller.referral_name_suggestion.api.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/referral_name_suggestion/api/entity/ReferralNameSuggestionImage;", "", "<init>", "(Ljava/lang/String;I)V", "REWARD", "REWARD_NO_LOGO", "PROTECT", "PROTECT_NO_LOGO", "CONTACT", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReferralNameSuggestionImage {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage[] $VALUES;
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage REWARD = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage("REWARD", 0);
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage REWARD_NO_LOGO = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage("REWARD_NO_LOGO", 1);
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage PROTECT = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage("PROTECT", 2);
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage PROTECT_NO_LOGO = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage("PROTECT_NO_LOGO", 3);
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage CONTACT = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage("CONTACT", 4);

    private static final /* synthetic */ com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage[] $values() {
        return new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage[]{REWARD, REWARD_NO_LOGO, PROTECT, PROTECT_NO_LOGO, CONTACT};
    }

    static {
        com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ReferralNameSuggestionImage(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage valueOf(java.lang.String str) {
        return (com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage) java.lang.Enum.valueOf(com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage.class, str);
    }

    public static com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage[] values() {
        return (com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage[]) $VALUES.clone();
    }
}
