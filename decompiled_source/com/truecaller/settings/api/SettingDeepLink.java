package com.truecaller.settings.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/settings/api/SettingDeepLink;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "kq2/bar", "HIDE_ACS_FOR_NON_PB_CONTACTS", "HIDE_ACS_FOR_NON_PB_CONTACTS_AUTO_ENABLE", "CALLER_ID_FOR_MESSAGING_APPS", "CUSTOMIZE_QUICK_RESPONSE_FROM_ASSISTANT", "CALL_HANDLING_RULES", "CALL_HANDLING_RULES_SPAM_CALLS_ASSISTANT", "RETRY_MISSED_CALL_SWITCH_CHANGE_REQUEST_AUTO_ENABLE", "FRAUD_WARNINGS", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SettingDeepLink {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.settings.api.SettingDeepLink[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final kq2.bar Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.settings.api.SettingDeepLink HIDE_ACS_FOR_NON_PB_CONTACTS = new com.truecaller.settings.api.SettingDeepLink("HIDE_ACS_FOR_NON_PB_CONTACTS", 0, "hide_acs_for_non_pb");
    public static final com.truecaller.settings.api.SettingDeepLink HIDE_ACS_FOR_NON_PB_CONTACTS_AUTO_ENABLE = new com.truecaller.settings.api.SettingDeepLink("HIDE_ACS_FOR_NON_PB_CONTACTS_AUTO_ENABLE", 1, "hide_acs_for_non_pb_auto_enable");
    public static final com.truecaller.settings.api.SettingDeepLink CALLER_ID_FOR_MESSAGING_APPS = new com.truecaller.settings.api.SettingDeepLink("CALLER_ID_FOR_MESSAGING_APPS", 2, "caller_id_for_messaging_apps");
    public static final com.truecaller.settings.api.SettingDeepLink CUSTOMIZE_QUICK_RESPONSE_FROM_ASSISTANT = new com.truecaller.settings.api.SettingDeepLink("CUSTOMIZE_QUICK_RESPONSE_FROM_ASSISTANT", 3, "customize_quick_response_from_assistant");
    public static final com.truecaller.settings.api.SettingDeepLink CALL_HANDLING_RULES = new com.truecaller.settings.api.SettingDeepLink("CALL_HANDLING_RULES", 4, "call_handling_rules_contacts");
    public static final com.truecaller.settings.api.SettingDeepLink CALL_HANDLING_RULES_SPAM_CALLS_ASSISTANT = new com.truecaller.settings.api.SettingDeepLink("CALL_HANDLING_RULES_SPAM_CALLS_ASSISTANT", 5, "how_to_handle_spam_calls_assistant");
    public static final com.truecaller.settings.api.SettingDeepLink RETRY_MISSED_CALL_SWITCH_CHANGE_REQUEST_AUTO_ENABLE = new com.truecaller.settings.api.SettingDeepLink("RETRY_MISSED_CALL_SWITCH_CHANGE_REQUEST_AUTO_ENABLE", 6, "retry_missed_call_switch_change_request_auto_enable");
    public static final com.truecaller.settings.api.SettingDeepLink FRAUD_WARNINGS = new com.truecaller.settings.api.SettingDeepLink("FRAUD_WARNINGS", 7, "fraud_warnings");

    private static final /* synthetic */ com.truecaller.settings.api.SettingDeepLink[] $values() {
        return new com.truecaller.settings.api.SettingDeepLink[]{HIDE_ACS_FOR_NON_PB_CONTACTS, HIDE_ACS_FOR_NON_PB_CONTACTS_AUTO_ENABLE, CALLER_ID_FOR_MESSAGING_APPS, CUSTOMIZE_QUICK_RESPONSE_FROM_ASSISTANT, CALL_HANDLING_RULES, CALL_HANDLING_RULES_SPAM_CALLS_ASSISTANT, RETRY_MISSED_CALL_SWITCH_CHANGE_REQUEST_AUTO_ENABLE, FRAUD_WARNINGS};
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kq2.bar, java.lang.Object] */
    static {
        com.truecaller.settings.api.SettingDeepLink[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private SettingDeepLink(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.settings.api.SettingDeepLink valueOf(java.lang.String str) {
        return (com.truecaller.settings.api.SettingDeepLink) java.lang.Enum.valueOf(com.truecaller.settings.api.SettingDeepLink.class, str);
    }

    public static com.truecaller.settings.api.SettingDeepLink[] values() {
        return (com.truecaller.settings.api.SettingDeepLink[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
