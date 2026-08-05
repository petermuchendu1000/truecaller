package com.truecaller.familyprotect.api.protectionconfig.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/truecaller/familyprotect/api/protectionconfig/analytics/FamilyProtectionConfigAnalytics$LaunchContext", "", "Lcom/truecaller/familyprotect/api/protectionconfig/analytics/FamilyProtectionConfigAnalytics$LaunchContext;", "<init>", "(Ljava/lang/String;I)V", "FAMILY_PROTECT_CONFIGURATION_ADMIN_VIEW", "FAMILY_PROTECT_CONFIGURATION_MEMBER_VIEW", "FAMILY_PROTECT_ONBOARDING_ADMIN_CONFIGURATION", "FAMILY_PROTECT_REPORT_ADMIN_VIEW", "FAMILY_PROTECT_REPORT_MEMBER_VIEW", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyProtectionConfigAnalytics$LaunchContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext[] $VALUES;
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext FAMILY_PROTECT_CONFIGURATION_ADMIN_VIEW = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext("FAMILY_PROTECT_CONFIGURATION_ADMIN_VIEW", 0);
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext FAMILY_PROTECT_CONFIGURATION_MEMBER_VIEW = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext("FAMILY_PROTECT_CONFIGURATION_MEMBER_VIEW", 1);
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext FAMILY_PROTECT_ONBOARDING_ADMIN_CONFIGURATION = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext("FAMILY_PROTECT_ONBOARDING_ADMIN_CONFIGURATION", 2);
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext FAMILY_PROTECT_REPORT_ADMIN_VIEW = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext("FAMILY_PROTECT_REPORT_ADMIN_VIEW", 3);
    public static final com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext FAMILY_PROTECT_REPORT_MEMBER_VIEW = new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext("FAMILY_PROTECT_REPORT_MEMBER_VIEW", 4);

    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext[] $values() {
        return new com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext[]{FAMILY_PROTECT_CONFIGURATION_ADMIN_VIEW, FAMILY_PROTECT_CONFIGURATION_MEMBER_VIEW, FAMILY_PROTECT_ONBOARDING_ADMIN_CONFIGURATION, FAMILY_PROTECT_REPORT_ADMIN_VIEW, FAMILY_PROTECT_REPORT_MEMBER_VIEW};
    }

    static {
        com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyProtectionConfigAnalytics$LaunchContext(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext.class, str);
    }

    public static com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext[] values() {
        return (com.truecaller.familyprotect.api.protectionconfig.analytics.FamilyProtectionConfigAnalytics$LaunchContext[]) $VALUES.clone();
    }
}
