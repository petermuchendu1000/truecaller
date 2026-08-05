package com.truecaller.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum AppEvents$UsersHome$NavigationSource {
    UNKNOWN("Unknown"),
    CALLS_TAB("CallsTab"),
    MESSAGES_TAB("MessagesTab"),
    CONTACTS_TAB("ContactsTab"),
    BLOCKING_TAB("BlockingTab"),
    FAMILY_PROTECTION_CONFIG_TAB("FamilyProtectionTab"),
    PREMIUM_TAB("PremiumTab"),
    ASSISTANT_TAB("AssistantTab"),
    VOICEMAIL_TAB("VoicemailTab"),
    INVITE_TAB("InviteTab"),
    SCAM_FEED_TAB("ScamFeed"),
    DEEP_LINK("DeepLink"),
    SETTINGS("Settings"),
    REWARD_PROGRAM("RewardProgram"),
    INVALID_PROFILE_NOTIFICATION("InvalidProfileNotification"),
    FORCE_UPDATE_NOTIFICATION("ForceUpdateNotification"),
    WIDGET("Widget");

    private final java.lang.String value;

    AppEvents$UsersHome$NavigationSource(java.lang.String str) {
        this.value = str;
    }

    public java.lang.String getValue() {
        return this.value;
    }
}
