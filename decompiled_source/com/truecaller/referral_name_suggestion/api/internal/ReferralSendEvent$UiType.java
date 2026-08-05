package com.truecaller.referral_name_suggestion.api.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/referral_name_suggestion/api/internal/ReferralSendEvent$UiType", "", "Lcom/truecaller/referral_name_suggestion/api/internal/ReferralSendEvent$UiType;", "<init>", "(Ljava/lang/String;I)V", "SINGLE_SCREEN", "APP_CHOOSER", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReferralSendEvent$UiType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.referral_name_suggestion.api.internal.ReferralSendEvent$UiType[] $VALUES;
    public static final com.truecaller.referral_name_suggestion.api.internal.ReferralSendEvent$UiType SINGLE_SCREEN = new com.truecaller.referral_name_suggestion.api.internal.ReferralSendEvent$UiType("SINGLE_SCREEN", 0);
    public static final com.truecaller.referral_name_suggestion.api.internal.ReferralSendEvent$UiType APP_CHOOSER = new com.truecaller.referral_name_suggestion.api.internal.ReferralSendEvent$UiType("APP_CHOOSER", 1);

    private static final /* synthetic */ com.truecaller.referral_name_suggestion.api.internal.ReferralSendEvent$UiType[] $values() {
        return new com.truecaller.referral_name_suggestion.api.internal.ReferralSendEvent$UiType[]{SINGLE_SCREEN, APP_CHOOSER};
    }

    static {
        com.truecaller.referral_name_suggestion.api.internal.ReferralSendEvent$UiType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ReferralSendEvent$UiType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.referral_name_suggestion.api.internal.ReferralSendEvent$UiType valueOf(java.lang.String str) {
        return (com.truecaller.referral_name_suggestion.api.internal.ReferralSendEvent$UiType) java.lang.Enum.valueOf(com.truecaller.referral_name_suggestion.api.internal.ReferralSendEvent$UiType.class, str);
    }

    public static com.truecaller.referral_name_suggestion.api.internal.ReferralSendEvent$UiType[] values() {
        return (com.truecaller.referral_name_suggestion.api.internal.ReferralSendEvent$UiType[]) $VALUES.clone();
    }
}
