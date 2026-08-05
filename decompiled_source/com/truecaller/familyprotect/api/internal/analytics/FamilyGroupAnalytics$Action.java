package com.truecaller.familyprotect.api.internal.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b<\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>¨\u0006?"}, d2 = {"com/truecaller/familyprotect/api/internal/analytics/FamilyGroupAnalytics$Action", "", "Lcom/truecaller/familyprotect/api/internal/analytics/FamilyGroupAnalytics$Action;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "CREATE_FAMILY_GROUP", "GET_STARTED", "VIEW_INVITE", "SKIP_ONBOARDING", "SKIP_INVITE", "FAMILY_PROTECT_BUTTON", "INVITE_MEMBERS", "START_SETUP", "ENABLE_ACTIVITY", "SKIP", "YES", "CONTINUE", "DECLINE", "CONFIRM", "CONFIRM_TOS", "JOIN", "JOIN_WITHOUT_POLICES_CHECK", "GOTO_GROUP", "FP_EXPAND_CARD", "FP_COLLAPSE_CARD", "FP_COLLAPSE_CARD_CLOSE_BUTTON", "FP_CARD_CALL", "FP_CARD_MESSAGE", "FP_CHECK_PROTECTION", "FP_MANAGE_PROTECTION", "FP_LEAVE_FAMILY_GROUP", "FP_DELETE_FAMILY_GROUP", "FP_REMOVE_MEMBER", "FP_REMOVE_MEMBER_CONFIRM", "FP_PROMOTE_TO_ADMIN", "FP_PROMOTE_TO_ADMIN_CONFIRM", "FP_DEMOTE_FROM_ADMIN", "FP_DEMOTE_FROM_ADMIN_CONFIRM", "FP_DELETE_GROUP", "FP_DELETE_GROUP_WITHOUT_POLICES_CHECK", "PUSH_NOTIFICATION_ACTION_CLICKED", "PUSH_NOTIFICATION_DISMISSED", "SEND_FEEDBACK", "FP_CALL", "FP_MESSAGE", "FP_LOW_BATTERY_NOTIFICATIONS_ENABLE", "FP_LOW_BATTERY_NOTIFICATIONS_DISABLE", "SELECT_SUGGESTED_CONTACT", "SELECT_PHONEBOOK_CONTACT", "WEEKLY_REPORT_CLICKED", "SHARE_STATS_CARD_CLICKED", "SEND_INVITE_REMINDER_WHATSAPP", "SEND_INVITE_REMINDER_SMS", "SEND_INVITE_REMINDER_CLIPBOARD", "SEND_DOWNLOAD_LINK_WHATSAPP", "SEND_DOWNLOAD_LINK_SMS", "SEND_DOWNLOAD_LINK_CLIPBOARD", "SHARE_DOWNLOAD_LINK_BUTTON_CLICKED", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyGroupAnalytics$Action {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action CREATE_FAMILY_GROUP = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("CREATE_FAMILY_GROUP", 0, "CreateGroup");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action GET_STARTED = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("GET_STARTED", 1, "GetStarted");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action VIEW_INVITE = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("VIEW_INVITE", 2, "ViewInvite");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SKIP_ONBOARDING = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SKIP_ONBOARDING", 3, "SkipOnboarding");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SKIP_INVITE = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SKIP_INVITE", 4, "SkipInvite");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FAMILY_PROTECT_BUTTON = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FAMILY_PROTECT_BUTTON", 5, "FamilyProtectButton");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action INVITE_MEMBERS = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("INVITE_MEMBERS", 6, "Invite");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action START_SETUP = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("START_SETUP", 7, "StartSetup");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action ENABLE_ACTIVITY = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("ENABLE_ACTIVITY", 8, "EnableActivity");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SKIP = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SKIP", 9, "Skip");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action YES = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("YES", 10, "Yes");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action CONTINUE = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("CONTINUE", 11, "Continue");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action DECLINE = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("DECLINE", 12, "Decline");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action CONFIRM = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("CONFIRM", 13, "Confirm");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action CONFIRM_TOS = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("CONFIRM_TOS", 14, "confirmTOS");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action JOIN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("JOIN", 15, "Join");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action JOIN_WITHOUT_POLICES_CHECK = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("JOIN_WITHOUT_POLICES_CHECK", 16, "JoinWithoutPoliciesCheck");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action GOTO_GROUP = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("GOTO_GROUP", 17, "GoToFamilyGroup");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_EXPAND_CARD = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_EXPAND_CARD", 18, "FPExpandCard");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_COLLAPSE_CARD = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_COLLAPSE_CARD", 19, "FPCollapseCard");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_COLLAPSE_CARD_CLOSE_BUTTON = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_COLLAPSE_CARD_CLOSE_BUTTON", 20, "FPCollapseCardCloseButton");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_CARD_CALL = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_CARD_CALL", 21, "FPCardCall");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_CARD_MESSAGE = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_CARD_MESSAGE", 22, "FPCardMessage");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_CHECK_PROTECTION = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_CHECK_PROTECTION", 23, "CheckProtection");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_MANAGE_PROTECTION = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_MANAGE_PROTECTION", 24, "ManageProtection");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_LEAVE_FAMILY_GROUP = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_LEAVE_FAMILY_GROUP", 25, "LeaveFamilyGroup");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_DELETE_FAMILY_GROUP = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_DELETE_FAMILY_GROUP", 26, "DeleteFamilyGroup");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_REMOVE_MEMBER = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_REMOVE_MEMBER", 27, "RemoveMember");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_REMOVE_MEMBER_CONFIRM = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_REMOVE_MEMBER_CONFIRM", 28, "RemoveMemberConfirm");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_PROMOTE_TO_ADMIN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_PROMOTE_TO_ADMIN", 29, "PromoteToAdmin");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_PROMOTE_TO_ADMIN_CONFIRM = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_PROMOTE_TO_ADMIN_CONFIRM", 30, "PromoteToAdminConfirm");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_DEMOTE_FROM_ADMIN = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_DEMOTE_FROM_ADMIN", 31, "DemoteAdmin");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_DEMOTE_FROM_ADMIN_CONFIRM = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_DEMOTE_FROM_ADMIN_CONFIRM", 32, "DemoteAdminConfirm");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_DELETE_GROUP = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_DELETE_GROUP", 33, "DeleteFamilyGroup");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_DELETE_GROUP_WITHOUT_POLICES_CHECK = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_DELETE_GROUP_WITHOUT_POLICES_CHECK", 34, "DeleteFamilyGroupWithoutPoliciesCheck");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action PUSH_NOTIFICATION_ACTION_CLICKED = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("PUSH_NOTIFICATION_ACTION_CLICKED", 35, "PushNotificationActionClicked");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action PUSH_NOTIFICATION_DISMISSED = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("PUSH_NOTIFICATION_DISMISSED", 36, "PushNotificationDismissed");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SEND_FEEDBACK = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SEND_FEEDBACK", 37, "SendFeedback");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_CALL = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_CALL", 38, "Call");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_MESSAGE = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_MESSAGE", 39, "Message");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_LOW_BATTERY_NOTIFICATIONS_ENABLE = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_LOW_BATTERY_NOTIFICATIONS_ENABLE", 40, "LowBatteryNotificationsEnable");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action FP_LOW_BATTERY_NOTIFICATIONS_DISABLE = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("FP_LOW_BATTERY_NOTIFICATIONS_DISABLE", 41, "LowBatteryNotificationsDisable");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SELECT_SUGGESTED_CONTACT = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SELECT_SUGGESTED_CONTACT", 42, "SelectSuggested");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SELECT_PHONEBOOK_CONTACT = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SELECT_PHONEBOOK_CONTACT", 43, "SelectPhonebook");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action WEEKLY_REPORT_CLICKED = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("WEEKLY_REPORT_CLICKED", 44, "TapWeeklyReportEntry");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SHARE_STATS_CARD_CLICKED = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SHARE_STATS_CARD_CLICKED", 45, "ShareStatusCard");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SEND_INVITE_REMINDER_WHATSAPP = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SEND_INVITE_REMINDER_WHATSAPP", 46, "SendInviteReminderWhatsapp");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SEND_INVITE_REMINDER_SMS = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SEND_INVITE_REMINDER_SMS", 47, "SendInviteReminderSms");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SEND_INVITE_REMINDER_CLIPBOARD = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SEND_INVITE_REMINDER_CLIPBOARD", 48, "SendInviteReminderClipboard");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SEND_DOWNLOAD_LINK_WHATSAPP = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SEND_DOWNLOAD_LINK_WHATSAPP", 49, "SendDownloadLinkWhatsapp");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SEND_DOWNLOAD_LINK_SMS = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SEND_DOWNLOAD_LINK_SMS", 50, "SendDownloadLinkSms");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SEND_DOWNLOAD_LINK_CLIPBOARD = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SEND_DOWNLOAD_LINK_CLIPBOARD", 51, "SendDownloadLinkClipboard");
    public static final com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action SHARE_DOWNLOAD_LINK_BUTTON_CLICKED = new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action("SHARE_DOWNLOAD_LINK_BUTTON_CLICKED", 52, "ShareDownloadLinkButton");

    private static final /* synthetic */ com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action[] $values() {
        return new com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action[]{CREATE_FAMILY_GROUP, GET_STARTED, VIEW_INVITE, SKIP_ONBOARDING, SKIP_INVITE, FAMILY_PROTECT_BUTTON, INVITE_MEMBERS, START_SETUP, ENABLE_ACTIVITY, SKIP, YES, CONTINUE, DECLINE, CONFIRM, CONFIRM_TOS, JOIN, JOIN_WITHOUT_POLICES_CHECK, GOTO_GROUP, FP_EXPAND_CARD, FP_COLLAPSE_CARD, FP_COLLAPSE_CARD_CLOSE_BUTTON, FP_CARD_CALL, FP_CARD_MESSAGE, FP_CHECK_PROTECTION, FP_MANAGE_PROTECTION, FP_LEAVE_FAMILY_GROUP, FP_DELETE_FAMILY_GROUP, FP_REMOVE_MEMBER, FP_REMOVE_MEMBER_CONFIRM, FP_PROMOTE_TO_ADMIN, FP_PROMOTE_TO_ADMIN_CONFIRM, FP_DEMOTE_FROM_ADMIN, FP_DEMOTE_FROM_ADMIN_CONFIRM, FP_DELETE_GROUP, FP_DELETE_GROUP_WITHOUT_POLICES_CHECK, PUSH_NOTIFICATION_ACTION_CLICKED, PUSH_NOTIFICATION_DISMISSED, SEND_FEEDBACK, FP_CALL, FP_MESSAGE, FP_LOW_BATTERY_NOTIFICATIONS_ENABLE, FP_LOW_BATTERY_NOTIFICATIONS_DISABLE, SELECT_SUGGESTED_CONTACT, SELECT_PHONEBOOK_CONTACT, WEEKLY_REPORT_CLICKED, SHARE_STATS_CARD_CLICKED, SEND_INVITE_REMINDER_WHATSAPP, SEND_INVITE_REMINDER_SMS, SEND_INVITE_REMINDER_CLIPBOARD, SEND_DOWNLOAD_LINK_WHATSAPP, SEND_DOWNLOAD_LINK_SMS, SEND_DOWNLOAD_LINK_CLIPBOARD, SHARE_DOWNLOAD_LINK_BUTTON_CLICKED};
    }

    static {
        com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyGroupAnalytics$Action(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action.class, str);
    }

    public static com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action[] values() {
        return (com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
