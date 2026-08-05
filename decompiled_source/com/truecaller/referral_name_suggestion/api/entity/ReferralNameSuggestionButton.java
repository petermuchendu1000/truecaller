package com.truecaller.referral_name_suggestion.api.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/referral_name_suggestion/api/entity/ReferralNameSuggestionButton;", "", "private", "", "<init>", "(Ljava/lang/String;IZ)V", "getPrivate", "()Z", "INSTAGRAM", "MESSENGER", "FACEBOOK", "WHATSAPP", "TELEGRAM", "SNAPCHAT", "SMS", "THREADS", "X", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReferralNameSuggestionButton {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton[] $VALUES;
    private final boolean private;
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton INSTAGRAM = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton("INSTAGRAM", 0, true);
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton MESSENGER = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton("MESSENGER", 1, true);
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton FACEBOOK = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton("FACEBOOK", 2, true);
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton WHATSAPP = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton("WHATSAPP", 3, true);
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton TELEGRAM = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton("TELEGRAM", 4, true);
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton SNAPCHAT = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton("SNAPCHAT", 5, true);
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton SMS = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton("SMS", 6, true);
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton THREADS = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton("THREADS", 7, false);
    public static final com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton X = new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton("X", 8, false);

    private static final /* synthetic */ com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton[] $values() {
        return new com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton[]{INSTAGRAM, MESSENGER, FACEBOOK, WHATSAPP, TELEGRAM, SNAPCHAT, SMS, THREADS, X};
    }

    static {
        com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ReferralNameSuggestionButton(java.lang.String str, int i, boolean z) {
        this.private = z;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton valueOf(java.lang.String str) {
        return (com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton) java.lang.Enum.valueOf(com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton.class, str);
    }

    public static com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton[] values() {
        return (com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton[]) $VALUES.clone();
    }

    public final boolean getPrivate() {
        return this.private;
    }
}
