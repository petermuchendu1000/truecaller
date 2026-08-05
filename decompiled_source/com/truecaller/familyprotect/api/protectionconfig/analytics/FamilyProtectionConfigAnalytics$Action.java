package com.truecaller.familyprotect.api.protectionconfig.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"com/truecaller/familyprotect/api/protectionconfig/analytics/FamilyProtectionConfigAnalytics$Action", "", "Lcom/truecaller/familyprotect/api/protectionconfig/analytics/FamilyProtectionConfigAnalytics$Action;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SET_MAX_PROTECTION_LEVEL", "SET_BASIC_PROTECTION_LEVEL", "SET_OFF_PROTECTION_LEVEL", "TOGGLE_ON_BLOCK_HIDDEN_NUMBERS", "TOGGLE_ON_BLOCK_FOREIGN_NUMBERS", "TOGGLE_ON_BLOCK_VERIFIED_BUSINESS", "TOGGLE_OFF_BLOCK_HIDDEN_NUMBERS", "TOGGLE_OFF_BLOCK_FOREIGN_NUMBERS", "TOGGLE_OFF_BLOCK_VERIFIED_BUSINESS", "ACCESS_PHONE_NUMBER_BLOCK_PATTERNS", "ACCESS_SENDER_ID_BLOCK_PATTERNS", "ACCESS_COUNTRY_CODE_BLOCK_PATTERNS", "ACCESS_CALLER_NAME_BLOCK_PATTERNS", "ACCESS_ALL_BLOCK_PATTERNS", "TOGGLE_ON_SUSPICIOUS_CALLS_NOTIFICATION", "TOGGLE_OFF_SUSPICIOUS_CALLS_NOTIFICATION", "COMPLETE_INITIAL_CONFIGURATION", "TRIGGER_PREMIUM_MAX_PROTECTION", "TOGGLE_ALL_TIME_REPORT_INTERVAL", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyProtectionConfigAnalytics$Action {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action SET_MAX_PROTECTION_LEVEL = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("SET_MAX_PROTECTION_LEVEL", 0, "SetProtectionLevelMax");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action SET_BASIC_PROTECTION_LEVEL = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("SET_BASIC_PROTECTION_LEVEL", 1, "SetProtectionLevelBasic");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action SET_OFF_PROTECTION_LEVEL = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("SET_OFF_PROTECTION_LEVEL", 2, "SetProtectionLevelOff");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action TOGGLE_ON_BLOCK_HIDDEN_NUMBERS = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("TOGGLE_ON_BLOCK_HIDDEN_NUMBERS", 3, "ToggleOnBlockHiddenNumbers");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action TOGGLE_ON_BLOCK_FOREIGN_NUMBERS = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("TOGGLE_ON_BLOCK_FOREIGN_NUMBERS", 4, "ToggleOnBlockForeignNumbers");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action TOGGLE_ON_BLOCK_VERIFIED_BUSINESS = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("TOGGLE_ON_BLOCK_VERIFIED_BUSINESS", 5, "ToggleOnBlockVerifiedBusiness");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action TOGGLE_OFF_BLOCK_HIDDEN_NUMBERS = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("TOGGLE_OFF_BLOCK_HIDDEN_NUMBERS", 6, "ToggleOffBlockHiddenNumbers");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action TOGGLE_OFF_BLOCK_FOREIGN_NUMBERS = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("TOGGLE_OFF_BLOCK_FOREIGN_NUMBERS", 7, "ToggleOffBlockForeignNumbers");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action TOGGLE_OFF_BLOCK_VERIFIED_BUSINESS = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("TOGGLE_OFF_BLOCK_VERIFIED_BUSINESS", 8, "ToggleOffBlockVerifiedBusiness");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action ACCESS_PHONE_NUMBER_BLOCK_PATTERNS = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("ACCESS_PHONE_NUMBER_BLOCK_PATTERNS", 9, "BlockPhoneNumbers");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action ACCESS_SENDER_ID_BLOCK_PATTERNS = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("ACCESS_SENDER_ID_BLOCK_PATTERNS", 10, "BlockSenderIDs");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action ACCESS_COUNTRY_CODE_BLOCK_PATTERNS = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("ACCESS_COUNTRY_CODE_BLOCK_PATTERNS", 11, "BlockCountryCodes");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action ACCESS_CALLER_NAME_BLOCK_PATTERNS = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("ACCESS_CALLER_NAME_BLOCK_PATTERNS", 12, "BlockCallerNames");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action ACCESS_ALL_BLOCK_PATTERNS = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("ACCESS_ALL_BLOCK_PATTERNS", 13, "ViewBlockList");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action TOGGLE_ON_SUSPICIOUS_CALLS_NOTIFICATION = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("TOGGLE_ON_SUSPICIOUS_CALLS_NOTIFICATION", 14, "ToggleOnNotifySuspiciousCall");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action TOGGLE_OFF_SUSPICIOUS_CALLS_NOTIFICATION = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("TOGGLE_OFF_SUSPICIOUS_CALLS_NOTIFICATION", 15, "ToggleOffNotifySuspiciousCall");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action COMPLETE_INITIAL_CONFIGURATION = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("COMPLETE_INITIAL_CONFIGURATION", 16, "LooksGood");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action TRIGGER_PREMIUM_MAX_PROTECTION = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("TRIGGER_PREMIUM_MAX_PROTECTION", 17, "TriggerPremiumMaxProtection");
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action TOGGLE_ALL_TIME_REPORT_INTERVAL = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action("TOGGLE_ALL_TIME_REPORT_INTERVAL", 18, "FilterWeeklyReportAllTime");

    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action[] $values() {
        return new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action[]{SET_MAX_PROTECTION_LEVEL, SET_BASIC_PROTECTION_LEVEL, SET_OFF_PROTECTION_LEVEL, TOGGLE_ON_BLOCK_HIDDEN_NUMBERS, TOGGLE_ON_BLOCK_FOREIGN_NUMBERS, TOGGLE_ON_BLOCK_VERIFIED_BUSINESS, TOGGLE_OFF_BLOCK_HIDDEN_NUMBERS, TOGGLE_OFF_BLOCK_FOREIGN_NUMBERS, TOGGLE_OFF_BLOCK_VERIFIED_BUSINESS, ACCESS_PHONE_NUMBER_BLOCK_PATTERNS, ACCESS_SENDER_ID_BLOCK_PATTERNS, ACCESS_COUNTRY_CODE_BLOCK_PATTERNS, ACCESS_CALLER_NAME_BLOCK_PATTERNS, ACCESS_ALL_BLOCK_PATTERNS, TOGGLE_ON_SUSPICIOUS_CALLS_NOTIFICATION, TOGGLE_OFF_SUSPICIOUS_CALLS_NOTIFICATION, COMPLETE_INITIAL_CONFIGURATION, TRIGGER_PREMIUM_MAX_PROTECTION, TOGGLE_ALL_TIME_REPORT_INTERVAL};
    }

    static {
        com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyProtectionConfigAnalytics$Action(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action.class, str);
    }

    public static com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action[] values() {
        return (com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$Action[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
