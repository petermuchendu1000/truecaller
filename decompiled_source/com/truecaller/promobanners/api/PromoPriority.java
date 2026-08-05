package com.truecaller.promobanners.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/promobanners/api/PromoPriority;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ENABLE_NOTIFICATION", "CTV_VOICE_MAIL_PROMO", "CALLER_ID", "SECONDARY_PHONE", "WHO_SEARCHED_ME", "PREMIUM", "WHO_VIEWED_ME", "VERIFIED_BUSINESS_AWARENESS", "PRIORITY_CALL_AWARENESS", "WHATSAPP_CALL_DETECTED", "MISSED_CALL_NOTIFICATION", "WHATSAPP_NOTIFICATION_ACCESS", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class PromoPriority {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.promobanners.api.PromoPriority[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.promobanners.api.PromoPriority ENABLE_NOTIFICATION = new com.truecaller.promobanners.api.PromoPriority("ENABLE_NOTIFICATION", 0, "NotificationsPermissionBanner");
    public static final com.truecaller.promobanners.api.PromoPriority CTV_VOICE_MAIL_PROMO = new com.truecaller.promobanners.api.PromoPriority("CTV_VOICE_MAIL_PROMO", 1, "CTVoicemailPromo");
    public static final com.truecaller.promobanners.api.PromoPriority CALLER_ID = new com.truecaller.promobanners.api.PromoPriority("CALLER_ID", 2, "CallerIdBanner");
    public static final com.truecaller.promobanners.api.PromoPriority SECONDARY_PHONE = new com.truecaller.promobanners.api.PromoPriority("SECONDARY_PHONE", 3, "SecondaryPhoneNumberPromo");
    public static final com.truecaller.promobanners.api.PromoPriority WHO_SEARCHED_ME = new com.truecaller.promobanners.api.PromoPriority("WHO_SEARCHED_ME", 4, "WhoSearchedMe");
    public static final com.truecaller.promobanners.api.PromoPriority PREMIUM = new com.truecaller.promobanners.api.PromoPriority("PREMIUM", 5, "Premium");
    public static final com.truecaller.promobanners.api.PromoPriority WHO_VIEWED_ME = new com.truecaller.promobanners.api.PromoPriority("WHO_VIEWED_ME", 6, "WhoViewedMe");
    public static final com.truecaller.promobanners.api.PromoPriority VERIFIED_BUSINESS_AWARENESS = new com.truecaller.promobanners.api.PromoPriority("VERIFIED_BUSINESS_AWARENESS", 7, "VerifiedBusinessAwareness");
    public static final com.truecaller.promobanners.api.PromoPriority PRIORITY_CALL_AWARENESS = new com.truecaller.promobanners.api.PromoPriority("PRIORITY_CALL_AWARENESS", 8, "PriorityCallAwareness");
    public static final com.truecaller.promobanners.api.PromoPriority WHATSAPP_CALL_DETECTED = new com.truecaller.promobanners.api.PromoPriority("WHATSAPP_CALL_DETECTED", 9, "WhatsAppCallDetectedPromo");
    public static final com.truecaller.promobanners.api.PromoPriority MISSED_CALL_NOTIFICATION = new com.truecaller.promobanners.api.PromoPriority("MISSED_CALL_NOTIFICATION", 10, "MissedCallNotificationPromo");
    public static final com.truecaller.promobanners.api.PromoPriority WHATSAPP_NOTIFICATION_ACCESS = new com.truecaller.promobanners.api.PromoPriority("WHATSAPP_NOTIFICATION_ACCESS", 11, "WhatsappNotificationAccessPromo");

    private static final /* synthetic */ com.truecaller.promobanners.api.PromoPriority[] $values() {
        return new com.truecaller.promobanners.api.PromoPriority[]{ENABLE_NOTIFICATION, CTV_VOICE_MAIL_PROMO, CALLER_ID, SECONDARY_PHONE, WHO_SEARCHED_ME, PREMIUM, WHO_VIEWED_ME, VERIFIED_BUSINESS_AWARENESS, PRIORITY_CALL_AWARENESS, WHATSAPP_CALL_DETECTED, MISSED_CALL_NOTIFICATION, WHATSAPP_NOTIFICATION_ACCESS};
    }

    static {
        com.truecaller.promobanners.api.PromoPriority[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PromoPriority(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.promobanners.api.PromoPriority valueOf(java.lang.String str) {
        return (com.truecaller.promobanners.api.PromoPriority) java.lang.Enum.valueOf(com.truecaller.promobanners.api.PromoPriority.class, str);
    }

    public static com.truecaller.promobanners.api.PromoPriority[] values() {
        return (com.truecaller.promobanners.api.PromoPriority[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
