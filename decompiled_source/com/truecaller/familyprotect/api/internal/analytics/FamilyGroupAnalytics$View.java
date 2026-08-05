package com.truecaller.familyprotect.api.internal.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"com/truecaller/familyprotect/api/internal/analytics/FamilyGroupAnalytics$View", "", "Lcom/truecaller/familyprotect/api/internal/analytics/FamilyGroupAnalytics$View;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "FP_ONBOARDING_ADMIN_SCREEN", "FP_ONBOARDING_ADD_MEMBER_SCREEN", "FP_GROUP_CENTER_ADD_MEMBER_SCREEN", "FP_ONBOARDING_GROUP_CREATE_SUCCESS_SCREEN", "FP_GROUP_CENTER_GROUP_CREATE_SUCCESS_SCREEN", "FP_ONBOARDING_GROUP_CREATE_PARTIAL_SUCCESS_SCREEN", "FP_GROUP_CENTER_GROUP_CREATE_PARTIAL_SUCCESS_SCREEN", "FP_ONBOARDING_GROUP_CREATE_FAILURE_SCREEN", "FP_GROUP_CENTER_GROUP_CREATE_FAILURE_SCREEN", "FP_ONBOARDING_GROUP_CREATE_SKIP_INVITE_SUCCESS_SCREEN", "FP_GROUP_CENTER_GROUP_CREATE_SKIP_INVITE_SUCCESS_SCREEN", "FP_ONBOARDING_ADMIN_ACTIVITY_SHARING_SCREEN", "FP_ONBOARDING_ADMIN_TRANSFER_BLOCK_LIST_SCREEN", "FP_ONBOARDING_MEMBER_JOIN_SCREEN", "FP_ONBOARDING_MEMBER_PRIVACY_POLICY_SCREEN", "FP_ONBOARDING_MEMBER_ACTIVITY_SHARING_SCREEN", "FP_ONBOARDING_MEMBER_WELCOME_SCREEN", "FP_ONBOARDING_CALL_TAB", "FP_INVITE_CALL_TAB", "FP_FAMILY_GROUP_CENTER_ADMIN_SCREEN", "FP_FAMILY_GROUP_CENTER_MEMBER_SCREEN", "FP_FAMILY_GROUP_CENTER_LEAVE_DIALOG_SCREEN", "FP_FAMILY_GROUP_CENTER_DELETE_DIALOG_SCREEN", "FP_STATS_REPORT", "FP_NON_TC_OUTDATED_APP_ERROR", "FP_SHARE_DOWNLOAD_LINK_BOTTOM_SHEET", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyGroupAnalytics$View {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_ONBOARDING_ADMIN_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_ONBOARDING_ADMIN_SCREEN", 0, "FPOnboardingAdminValueProp");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_ONBOARDING_ADD_MEMBER_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_ONBOARDING_ADD_MEMBER_SCREEN", 1, "FPOnboardingAdminAddMembers");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_GROUP_CENTER_ADD_MEMBER_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_GROUP_CENTER_ADD_MEMBER_SCREEN", 2, "FPGroupCenterAdminAddMembers");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_ONBOARDING_GROUP_CREATE_SUCCESS_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_ONBOARDING_GROUP_CREATE_SUCCESS_SCREEN", 3, "FPOnboardingAdminSuccess");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_GROUP_CENTER_GROUP_CREATE_SUCCESS_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_GROUP_CENTER_GROUP_CREATE_SUCCESS_SCREEN", 4, "FPGroupCenterAdminSuccess");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_ONBOARDING_GROUP_CREATE_PARTIAL_SUCCESS_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_ONBOARDING_GROUP_CREATE_PARTIAL_SUCCESS_SCREEN", 5, "FPOnboardingAdminSuccessSomeFailed");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_GROUP_CENTER_GROUP_CREATE_PARTIAL_SUCCESS_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_GROUP_CENTER_GROUP_CREATE_PARTIAL_SUCCESS_SCREEN", 6, "FPGroupCenterAdminSuccessSomeFailed");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_ONBOARDING_GROUP_CREATE_FAILURE_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_ONBOARDING_GROUP_CREATE_FAILURE_SCREEN", 7, "FPOnboardingAdminSuccessAllFailed");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_GROUP_CENTER_GROUP_CREATE_FAILURE_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_GROUP_CENTER_GROUP_CREATE_FAILURE_SCREEN", 8, "FPGroupCenterAdminSuccessAllFailed");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_ONBOARDING_GROUP_CREATE_SKIP_INVITE_SUCCESS_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_ONBOARDING_GROUP_CREATE_SKIP_INVITE_SUCCESS_SCREEN", 9, "FPOnboardingAdminSuccessSkipMembers");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_GROUP_CENTER_GROUP_CREATE_SKIP_INVITE_SUCCESS_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_GROUP_CENTER_GROUP_CREATE_SKIP_INVITE_SUCCESS_SCREEN", 10, "FPGroupCenterAdminSuccessSkipMembers");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_ONBOARDING_ADMIN_ACTIVITY_SHARING_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_ONBOARDING_ADMIN_ACTIVITY_SHARING_SCREEN", 11, "FPOnboardingAdminActivitySharing");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_ONBOARDING_ADMIN_TRANSFER_BLOCK_LIST_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_ONBOARDING_ADMIN_TRANSFER_BLOCK_LIST_SCREEN", 12, "FPOnboardingAdminTransferBlocklist");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_ONBOARDING_MEMBER_JOIN_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_ONBOARDING_MEMBER_JOIN_SCREEN", 13, "FPOnboardingMemberJoin");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_ONBOARDING_MEMBER_PRIVACY_POLICY_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_ONBOARDING_MEMBER_PRIVACY_POLICY_SCREEN", 14, "FPOnboardingMemberPrivacy");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_ONBOARDING_MEMBER_ACTIVITY_SHARING_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_ONBOARDING_MEMBER_ACTIVITY_SHARING_SCREEN", 15, "FPOnboardingMemberActivitySharing");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_ONBOARDING_MEMBER_WELCOME_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_ONBOARDING_MEMBER_WELCOME_SCREEN", 16, "FPOnboardingMemberWelcome");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_ONBOARDING_CALL_TAB = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_ONBOARDING_CALL_TAB", 17, "FPOnboardingCallTab");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_INVITE_CALL_TAB = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_INVITE_CALL_TAB", 18, "FPPendingRequestCallTab");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_FAMILY_GROUP_CENTER_ADMIN_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_FAMILY_GROUP_CENTER_ADMIN_SCREEN", 19, "FPFamilyGroupCenterAdmin");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_FAMILY_GROUP_CENTER_MEMBER_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_FAMILY_GROUP_CENTER_MEMBER_SCREEN", 20, "FPFamilyGroupCenterMember");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_FAMILY_GROUP_CENTER_LEAVE_DIALOG_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_FAMILY_GROUP_CENTER_LEAVE_DIALOG_SCREEN", 21, "FPFamilyGroupCenterLeaveGroup");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_FAMILY_GROUP_CENTER_DELETE_DIALOG_SCREEN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_FAMILY_GROUP_CENTER_DELETE_DIALOG_SCREEN", 22, "FPFamilyGroupDeleteConfirmation");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_STATS_REPORT = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_STATS_REPORT", 23, "ViewStatusCard");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_NON_TC_OUTDATED_APP_ERROR = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_NON_TC_OUTDATED_APP_ERROR", 24, "FPShareDownloadLinkError");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View FP_SHARE_DOWNLOAD_LINK_BOTTOM_SHEET = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View("FP_SHARE_DOWNLOAD_LINK_BOTTOM_SHEET", 25, "FPShareDownloadLinkBottomSheet");

    private static final /* synthetic */ com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View[] $values() {
        return new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View[]{FP_ONBOARDING_ADMIN_SCREEN, FP_ONBOARDING_ADD_MEMBER_SCREEN, FP_GROUP_CENTER_ADD_MEMBER_SCREEN, FP_ONBOARDING_GROUP_CREATE_SUCCESS_SCREEN, FP_GROUP_CENTER_GROUP_CREATE_SUCCESS_SCREEN, FP_ONBOARDING_GROUP_CREATE_PARTIAL_SUCCESS_SCREEN, FP_GROUP_CENTER_GROUP_CREATE_PARTIAL_SUCCESS_SCREEN, FP_ONBOARDING_GROUP_CREATE_FAILURE_SCREEN, FP_GROUP_CENTER_GROUP_CREATE_FAILURE_SCREEN, FP_ONBOARDING_GROUP_CREATE_SKIP_INVITE_SUCCESS_SCREEN, FP_GROUP_CENTER_GROUP_CREATE_SKIP_INVITE_SUCCESS_SCREEN, FP_ONBOARDING_ADMIN_ACTIVITY_SHARING_SCREEN, FP_ONBOARDING_ADMIN_TRANSFER_BLOCK_LIST_SCREEN, FP_ONBOARDING_MEMBER_JOIN_SCREEN, FP_ONBOARDING_MEMBER_PRIVACY_POLICY_SCREEN, FP_ONBOARDING_MEMBER_ACTIVITY_SHARING_SCREEN, FP_ONBOARDING_MEMBER_WELCOME_SCREEN, FP_ONBOARDING_CALL_TAB, FP_INVITE_CALL_TAB, FP_FAMILY_GROUP_CENTER_ADMIN_SCREEN, FP_FAMILY_GROUP_CENTER_MEMBER_SCREEN, FP_FAMILY_GROUP_CENTER_LEAVE_DIALOG_SCREEN, FP_FAMILY_GROUP_CENTER_DELETE_DIALOG_SCREEN, FP_STATS_REPORT, FP_NON_TC_OUTDATED_APP_ERROR, FP_SHARE_DOWNLOAD_LINK_BOTTOM_SHEET};
    }

    static {
        com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyGroupAnalytics$View(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View.class, str);
    }

    public static com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View[] values() {
        return (com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$View[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
