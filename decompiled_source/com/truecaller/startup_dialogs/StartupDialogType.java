package com.truecaller.startup_dialogs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b \b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\"\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006#"}, d2 = {"Lcom/truecaller/startup_dialogs/StartupDialogType;", "", "reqCode", "", "<init>", "(Ljava/lang/String;II)V", "DIALOG_WHATS_NEW", "DIALOG_MDAU_PROMO", "POPUP_MISSED_CALLS_NOTIFICATIONS", "POPUP_IDENTIFY_OTHERS", "POPUP_LOCATION_PERMISSION", "POPUP_DRAW_PERMISSION", "POPUP_SOFTWARE_UPDATE", "POPUP_DO_NOT_DISTURB_ACCESS", "POPUP_PREMIUM_PROMO", "POPUP_TCPAY_PROMO", "TRUECALLER_ONBOARDING", "BACKUP_ONBOARDING", "TCPAY_ONBOARDING", "WHATS_APP_IN_CALL_LOG", "ONBOARDING_PREMIUM_POPUP", "CALL_RECORDING_DISABLED_ALERT", "DEFAULT_DIALER_PROMO", "DIALOG_CREDIT_WHATS_NEW", "DIALOG_NUMBER_SEARCH_CALL", "REFERRAL_PROMO", "FAMILY_SHARING", "ASSISTANT_ONBOARDING_COMPLETED", "IN_APP_UPDATE", "DEFERRED_DEEP_LINK", "PREMIUM_APP_LAUNCH_INTERSTITIAL_POPUP", "BLOCKING_LEVEL", "SANDPAPER", "ASSISTANT_HINT_PROMO", "requestCode", "startup-dialog-router_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class StartupDialogType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.startup_dialogs.StartupDialogType[] $VALUES;
    private final int reqCode;
    public static final com.truecaller.startup_dialogs.StartupDialogType DIALOG_WHATS_NEW = new com.truecaller.startup_dialogs.StartupDialogType("DIALOG_WHATS_NEW", 0, 1001);
    public static final com.truecaller.startup_dialogs.StartupDialogType DIALOG_MDAU_PROMO = new com.truecaller.startup_dialogs.StartupDialogType("DIALOG_MDAU_PROMO", 1, 1002);
    public static final com.truecaller.startup_dialogs.StartupDialogType POPUP_MISSED_CALLS_NOTIFICATIONS = new com.truecaller.startup_dialogs.StartupDialogType("POPUP_MISSED_CALLS_NOTIFICATIONS", 2, 1003);
    public static final com.truecaller.startup_dialogs.StartupDialogType POPUP_IDENTIFY_OTHERS = new com.truecaller.startup_dialogs.StartupDialogType("POPUP_IDENTIFY_OTHERS", 3, 1004);
    public static final com.truecaller.startup_dialogs.StartupDialogType POPUP_LOCATION_PERMISSION = new com.truecaller.startup_dialogs.StartupDialogType("POPUP_LOCATION_PERMISSION", 4, 1006);
    public static final com.truecaller.startup_dialogs.StartupDialogType POPUP_DRAW_PERMISSION = new com.truecaller.startup_dialogs.StartupDialogType("POPUP_DRAW_PERMISSION", 5, 1007);
    public static final com.truecaller.startup_dialogs.StartupDialogType POPUP_SOFTWARE_UPDATE = new com.truecaller.startup_dialogs.StartupDialogType("POPUP_SOFTWARE_UPDATE", 6, 1008);
    public static final com.truecaller.startup_dialogs.StartupDialogType POPUP_DO_NOT_DISTURB_ACCESS = new com.truecaller.startup_dialogs.StartupDialogType("POPUP_DO_NOT_DISTURB_ACCESS", 7, 1009);
    public static final com.truecaller.startup_dialogs.StartupDialogType POPUP_PREMIUM_PROMO = new com.truecaller.startup_dialogs.StartupDialogType("POPUP_PREMIUM_PROMO", 8, 1011);
    public static final com.truecaller.startup_dialogs.StartupDialogType POPUP_TCPAY_PROMO = new com.truecaller.startup_dialogs.StartupDialogType("POPUP_TCPAY_PROMO", 9, 1012);
    public static final com.truecaller.startup_dialogs.StartupDialogType TRUECALLER_ONBOARDING = new com.truecaller.startup_dialogs.StartupDialogType("TRUECALLER_ONBOARDING", 10, 1013);
    public static final com.truecaller.startup_dialogs.StartupDialogType BACKUP_ONBOARDING = new com.truecaller.startup_dialogs.StartupDialogType("BACKUP_ONBOARDING", 11, 1014);
    public static final com.truecaller.startup_dialogs.StartupDialogType TCPAY_ONBOARDING = new com.truecaller.startup_dialogs.StartupDialogType("TCPAY_ONBOARDING", 12, 1015);
    public static final com.truecaller.startup_dialogs.StartupDialogType WHATS_APP_IN_CALL_LOG = new com.truecaller.startup_dialogs.StartupDialogType("WHATS_APP_IN_CALL_LOG", 13, 1017);
    public static final com.truecaller.startup_dialogs.StartupDialogType ONBOARDING_PREMIUM_POPUP = new com.truecaller.startup_dialogs.StartupDialogType("ONBOARDING_PREMIUM_POPUP", 14, 1018);
    public static final com.truecaller.startup_dialogs.StartupDialogType CALL_RECORDING_DISABLED_ALERT = new com.truecaller.startup_dialogs.StartupDialogType("CALL_RECORDING_DISABLED_ALERT", 15, 1019);
    public static final com.truecaller.startup_dialogs.StartupDialogType DEFAULT_DIALER_PROMO = new com.truecaller.startup_dialogs.StartupDialogType("DEFAULT_DIALER_PROMO", 16, 1020);
    public static final com.truecaller.startup_dialogs.StartupDialogType DIALOG_CREDIT_WHATS_NEW = new com.truecaller.startup_dialogs.StartupDialogType("DIALOG_CREDIT_WHATS_NEW", 17, 1022);
    public static final com.truecaller.startup_dialogs.StartupDialogType DIALOG_NUMBER_SEARCH_CALL = new com.truecaller.startup_dialogs.StartupDialogType("DIALOG_NUMBER_SEARCH_CALL", 18, 1034);
    public static final com.truecaller.startup_dialogs.StartupDialogType REFERRAL_PROMO = new com.truecaller.startup_dialogs.StartupDialogType("REFERRAL_PROMO", 19, 1035);
    public static final com.truecaller.startup_dialogs.StartupDialogType FAMILY_SHARING = new com.truecaller.startup_dialogs.StartupDialogType("FAMILY_SHARING", 20, 1037);
    public static final com.truecaller.startup_dialogs.StartupDialogType ASSISTANT_ONBOARDING_COMPLETED = new com.truecaller.startup_dialogs.StartupDialogType("ASSISTANT_ONBOARDING_COMPLETED", 21, 1038);
    public static final com.truecaller.startup_dialogs.StartupDialogType IN_APP_UPDATE = new com.truecaller.startup_dialogs.StartupDialogType("IN_APP_UPDATE", 22, 1039);
    public static final com.truecaller.startup_dialogs.StartupDialogType DEFERRED_DEEP_LINK = new com.truecaller.startup_dialogs.StartupDialogType("DEFERRED_DEEP_LINK", 23, 1100);
    public static final com.truecaller.startup_dialogs.StartupDialogType PREMIUM_APP_LAUNCH_INTERSTITIAL_POPUP = new com.truecaller.startup_dialogs.StartupDialogType("PREMIUM_APP_LAUNCH_INTERSTITIAL_POPUP", 24, 1040);
    public static final com.truecaller.startup_dialogs.StartupDialogType BLOCKING_LEVEL = new com.truecaller.startup_dialogs.StartupDialogType("BLOCKING_LEVEL", 25, 1041);
    public static final com.truecaller.startup_dialogs.StartupDialogType SANDPAPER = new com.truecaller.startup_dialogs.StartupDialogType("SANDPAPER", 26, 1042);
    public static final com.truecaller.startup_dialogs.StartupDialogType ASSISTANT_HINT_PROMO = new com.truecaller.startup_dialogs.StartupDialogType("ASSISTANT_HINT_PROMO", 27, 1043);

    private static final /* synthetic */ com.truecaller.startup_dialogs.StartupDialogType[] $values() {
        return new com.truecaller.startup_dialogs.StartupDialogType[]{DIALOG_WHATS_NEW, DIALOG_MDAU_PROMO, POPUP_MISSED_CALLS_NOTIFICATIONS, POPUP_IDENTIFY_OTHERS, POPUP_LOCATION_PERMISSION, POPUP_DRAW_PERMISSION, POPUP_SOFTWARE_UPDATE, POPUP_DO_NOT_DISTURB_ACCESS, POPUP_PREMIUM_PROMO, POPUP_TCPAY_PROMO, TRUECALLER_ONBOARDING, BACKUP_ONBOARDING, TCPAY_ONBOARDING, WHATS_APP_IN_CALL_LOG, ONBOARDING_PREMIUM_POPUP, CALL_RECORDING_DISABLED_ALERT, DEFAULT_DIALER_PROMO, DIALOG_CREDIT_WHATS_NEW, DIALOG_NUMBER_SEARCH_CALL, REFERRAL_PROMO, FAMILY_SHARING, ASSISTANT_ONBOARDING_COMPLETED, IN_APP_UPDATE, DEFERRED_DEEP_LINK, PREMIUM_APP_LAUNCH_INTERSTITIAL_POPUP, BLOCKING_LEVEL, SANDPAPER, ASSISTANT_HINT_PROMO};
    }

    static {
        com.truecaller.startup_dialogs.StartupDialogType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private StartupDialogType(java.lang.String str, int i, int i2) {
        this.reqCode = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.startup_dialogs.StartupDialogType valueOf(java.lang.String str) {
        return (com.truecaller.startup_dialogs.StartupDialogType) java.lang.Enum.valueOf(com.truecaller.startup_dialogs.StartupDialogType.class, str);
    }

    public static com.truecaller.startup_dialogs.StartupDialogType[] values() {
        return (com.truecaller.startup_dialogs.StartupDialogType[]) $VALUES.clone();
    }

    /* renamed from: requestCode, reason: from getter */
    public final int getReqCode() {
        return this.reqCode;
    }
}
