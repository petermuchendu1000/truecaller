package com.truecaller.wizard.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/truecaller/wizard/api/WizardStartContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EDIT_PROFILE", "PREMIUM_VIEW", "CALLER_ID_SETTING", "MAIN_SETTINGS", "NUDGE_NOTIFICATION", "THROTTLED_NOTIFICATION", "NUDGE_BADGE", "INIT", "INIT_RESUME", "REGISTER", "BLOCKING", "CHANGE_PHONE", "LOGOUT", "GLOBAL_SEARCH", "NOTIFICATION", "NOTIFICATIONS_VIEW", "AC_PROMOTION", "WHATSAPP_AUTOFILL", "DEEPLINK", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WizardStartContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.api.WizardStartContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.wizard.api.WizardStartContext EDIT_PROFILE = new com.truecaller.wizard.api.WizardStartContext("EDIT_PROFILE", 0, "EDIT_PROFILE");
    public static final com.truecaller.wizard.api.WizardStartContext PREMIUM_VIEW = new com.truecaller.wizard.api.WizardStartContext("PREMIUM_VIEW", 1, "PREMIUM_VIEW");
    public static final com.truecaller.wizard.api.WizardStartContext CALLER_ID_SETTING = new com.truecaller.wizard.api.WizardStartContext("CALLER_ID_SETTING", 2, "CALLER_ID_SETTING");
    public static final com.truecaller.wizard.api.WizardStartContext MAIN_SETTINGS = new com.truecaller.wizard.api.WizardStartContext("MAIN_SETTINGS", 3, "MAIN_SETTINGS");
    public static final com.truecaller.wizard.api.WizardStartContext NUDGE_NOTIFICATION = new com.truecaller.wizard.api.WizardStartContext("NUDGE_NOTIFICATION", 4, "NUDGE_NOTIFICATION");
    public static final com.truecaller.wizard.api.WizardStartContext THROTTLED_NOTIFICATION = new com.truecaller.wizard.api.WizardStartContext("THROTTLED_NOTIFICATION", 5, "THROTTLED_NOTIFICATION");
    public static final com.truecaller.wizard.api.WizardStartContext NUDGE_BADGE = new com.truecaller.wizard.api.WizardStartContext("NUDGE_BADGE", 6, "NUDGE_BADGE");
    public static final com.truecaller.wizard.api.WizardStartContext INIT = new com.truecaller.wizard.api.WizardStartContext("INIT", 7, "INIT");
    public static final com.truecaller.wizard.api.WizardStartContext INIT_RESUME = new com.truecaller.wizard.api.WizardStartContext("INIT_RESUME", 8, "INIT_RESUME");
    public static final com.truecaller.wizard.api.WizardStartContext REGISTER = new com.truecaller.wizard.api.WizardStartContext("REGISTER", 9, "REGISTER");
    public static final com.truecaller.wizard.api.WizardStartContext BLOCKING = new com.truecaller.wizard.api.WizardStartContext("BLOCKING", 10, "BLOCKING");
    public static final com.truecaller.wizard.api.WizardStartContext CHANGE_PHONE = new com.truecaller.wizard.api.WizardStartContext("CHANGE_PHONE", 11, "CHANGE_PHONE");
    public static final com.truecaller.wizard.api.WizardStartContext LOGOUT = new com.truecaller.wizard.api.WizardStartContext("LOGOUT", 12, "LOGOUT");
    public static final com.truecaller.wizard.api.WizardStartContext GLOBAL_SEARCH = new com.truecaller.wizard.api.WizardStartContext("GLOBAL_SEARCH", 13, "GLOBAL_SEARCH");
    public static final com.truecaller.wizard.api.WizardStartContext NOTIFICATION = new com.truecaller.wizard.api.WizardStartContext("NOTIFICATION", 14, "NOTIFICATION");
    public static final com.truecaller.wizard.api.WizardStartContext NOTIFICATIONS_VIEW = new com.truecaller.wizard.api.WizardStartContext("NOTIFICATIONS_VIEW", 15, "NOTIFICATIONS_VIEW");
    public static final com.truecaller.wizard.api.WizardStartContext AC_PROMOTION = new com.truecaller.wizard.api.WizardStartContext("AC_PROMOTION", 16, "AC_PROMOTION");
    public static final com.truecaller.wizard.api.WizardStartContext WHATSAPP_AUTOFILL = new com.truecaller.wizard.api.WizardStartContext("WHATSAPP_AUTOFILL", 17, "WHATSAPP_AUTOFILL");
    public static final com.truecaller.wizard.api.WizardStartContext DEEPLINK = new com.truecaller.wizard.api.WizardStartContext("DEEPLINK", 18, "DEEPLINK");

    private static final /* synthetic */ com.truecaller.wizard.api.WizardStartContext[] $values() {
        return new com.truecaller.wizard.api.WizardStartContext[]{EDIT_PROFILE, PREMIUM_VIEW, CALLER_ID_SETTING, MAIN_SETTINGS, NUDGE_NOTIFICATION, THROTTLED_NOTIFICATION, NUDGE_BADGE, INIT, INIT_RESUME, REGISTER, BLOCKING, CHANGE_PHONE, LOGOUT, GLOBAL_SEARCH, NOTIFICATION, NOTIFICATIONS_VIEW, AC_PROMOTION, WHATSAPP_AUTOFILL, DEEPLINK};
    }

    static {
        com.truecaller.wizard.api.WizardStartContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private WizardStartContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.api.WizardStartContext valueOf(java.lang.String str) {
        return (com.truecaller.wizard.api.WizardStartContext) java.lang.Enum.valueOf(com.truecaller.wizard.api.WizardStartContext.class, str);
    }

    public static com.truecaller.wizard.api.WizardStartContext[] values() {
        return (com.truecaller.wizard.api.WizardStartContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
