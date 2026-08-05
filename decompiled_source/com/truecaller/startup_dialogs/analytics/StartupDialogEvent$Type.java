package com.truecaller.startup_dialogs.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b6\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8¨\u00069"}, d2 = {"com/truecaller/startup_dialogs/analytics/StartupDialogEvent$Type", "", "Lcom/truecaller/startup_dialogs/analytics/StartupDialogEvent$Type;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "WhatsNew", "MdauPromo", "FillProfile", "WhatsAppCallsAvailable", "WhatsAppCallsEnable", "Backup", "BackupSmsPermission", "Restore", "Onboarding", "DemoCallTutorial", "CallRecOnboarding", "TcpayPromo", "CallRecordingDisabled", "CallRecordingDefaultDialerPromo", "CreditWhatsNew", "CreditPromoBanner", "ContextCallNewUserPromo", "ContextCallReminderPromo", "PremiumBlockingPrompt", "SecondaryPhoneNumberPromo", "WizardDefaultDialer", "WizardCallerIdRole", "SmartSmsBanner", "DetectSpamMessagePromo", "DrawOverOtherAppsPromo", "NotificationsPermissionsBanner", "SmsReadPermissionBanner", "SmsReadPermissionEmptyState", "CallerIdPermissionPromo", "DisableBatteryOptimizationPromoInteraction", "RebrandingWhatsNew", "PermissionDeniedDialog", "VerificationConfirmNumberDialog", "GoogleOneTapCancellationDialog", "ThrottledDialogWithPermission", "ThrottledDialogWithoutPermission", "ReverseWhatsAppMessageNotSent", "ReverseWhatsAppPhoneNumberHint", "ReverseOtpPhoneNumberHint", "ReverseOtpCountdown", "OnboardingPermissionDialog", "WizardCallerIdRoleConfirmationDialog", "WizardCallerIdRoleDisclaimerDialog", "WizardCallerIdRoleSettingsDialog", "WizardCallerIdRoleSettingsDialogOptional", "WizardMessagingRole", "WizardMessagingRoleExplainer", "startup-dialog-router_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class StartupDialogEvent$Type {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type WhatsNew = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("WhatsNew", 0, "WhatsNew");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type MdauPromo = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("MdauPromo", 1, "SpamProtection");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type FillProfile = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("FillProfile", 2, "FillProfile");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type WhatsAppCallsAvailable = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("WhatsAppCallsAvailable", 3, "WhatsAppAvailable");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type WhatsAppCallsEnable = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("WhatsAppCallsEnable", 4, "WhatsAppEnable");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type Backup = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("Backup", 5, "Backup");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type BackupSmsPermission = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("BackupSmsPermission", 6, "BackupSmsPermission");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type Restore = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("Restore", 7, "Restore");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type Onboarding = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("Onboarding", 8, "Onboarding");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type DemoCallTutorial = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("DemoCallTutorial", 9, "DemoCallTutorial");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type CallRecOnboarding = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("CallRecOnboarding", 10, "CallRecOnboarding");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type TcpayPromo = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("TcpayPromo", 11, "TCPayPromo");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type CallRecordingDisabled = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("CallRecordingDisabled", 12, "CallRecDisabled");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type CallRecordingDefaultDialerPromo = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("CallRecordingDefaultDialerPromo", 13, "CallRecordingDefaultDialerPromo");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type CreditWhatsNew = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("CreditWhatsNew", 14, "CreditWhatsNew");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type CreditPromoBanner = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("CreditPromoBanner", 15, "CreditPromoBanner");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type ContextCallNewUserPromo = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("ContextCallNewUserPromo", 16, "ContextCallHomeNewUserPromo");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type ContextCallReminderPromo = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("ContextCallReminderPromo", 17, "ContextCallHomeReminderPromo");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type PremiumBlockingPrompt = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("PremiumBlockingPrompt", 18, "PremiumBlockPrompt");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type SecondaryPhoneNumberPromo = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("SecondaryPhoneNumberPromo", 19, "SecondaryPhoneNumberPromo");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type WizardDefaultDialer = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("WizardDefaultDialer", 20, "WizardDefaultDialer");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type WizardCallerIdRole = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("WizardCallerIdRole", 21, "WizardCallerIdRole");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type SmartSmsBanner = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("SmartSmsBanner", 22, "SmartSmsBanner");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type DetectSpamMessagePromo = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("DetectSpamMessagePromo", 23, "DetectSpamMessagePromo");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type DrawOverOtherAppsPromo = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("DrawOverOtherAppsPromo", 24, "DisplayOverOtherAppsPermission_Promo_");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type NotificationsPermissionsBanner = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("NotificationsPermissionsBanner", 25, "NotificationPermissionBanner");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type SmsReadPermissionBanner = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("SmsReadPermissionBanner", 26, "smsReadPermissionBanner");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type SmsReadPermissionEmptyState = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("SmsReadPermissionEmptyState", 27, "smsReadPermissionEmptyState");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type CallerIdPermissionPromo = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("CallerIdPermissionPromo", 28, "CallerIdPermissionPromo");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type DisableBatteryOptimizationPromoInteraction = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("DisableBatteryOptimizationPromoInteraction", 29, "DisableBatteryOptimizPromoInteraction");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type RebrandingWhatsNew = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("RebrandingWhatsNew", 30, "RebrandingWhatsNew");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type PermissionDeniedDialog = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("PermissionDeniedDialog", 31, "PermissionDeniedDialog");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type VerificationConfirmNumberDialog = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("VerificationConfirmNumberDialog", 32, "VerificationConfirmNumberDialog");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type GoogleOneTapCancellationDialog = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("GoogleOneTapCancellationDialog", 33, "GoogleOneTapCancellationDialog");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type ThrottledDialogWithPermission = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("ThrottledDialogWithPermission", 34, "ThrottledDialogWithPermission");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type ThrottledDialogWithoutPermission = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("ThrottledDialogWithoutPermission", 35, "ThrottledDialogWithoutPermission");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type ReverseWhatsAppMessageNotSent = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("ReverseWhatsAppMessageNotSent", 36, "ReverseWhatsAppMessageNotSent");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type ReverseWhatsAppPhoneNumberHint = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("ReverseWhatsAppPhoneNumberHint", 37, "ReverseWhatsAppPhoneNumberHint");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type ReverseOtpPhoneNumberHint = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("ReverseOtpPhoneNumberHint", 38, "ReverseOtpPhoneNumberHint");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type ReverseOtpCountdown = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("ReverseOtpCountdown", 39, "ReverseOtpCountdown");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type OnboardingPermissionDialog = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("OnboardingPermissionDialog", 40, "OnboardingPermissionDialog");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type WizardCallerIdRoleConfirmationDialog = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("WizardCallerIdRoleConfirmationDialog", 41, "WizardCallerIdRoleConfirmationDialog");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type WizardCallerIdRoleDisclaimerDialog = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("WizardCallerIdRoleDisclaimerDialog", 42, "WizardCallerIdRoleDisclaimerDialog");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type WizardCallerIdRoleSettingsDialog = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("WizardCallerIdRoleSettingsDialog", 43, "WizardCallerIdRoleSettingsDialog");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type WizardCallerIdRoleSettingsDialogOptional = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("WizardCallerIdRoleSettingsDialogOptional", 44, "WizardCallerIdRoleSettingsDialogOptional");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type WizardMessagingRole = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("WizardMessagingRole", 45, "WizardMessagingRole");
    public static final com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type WizardMessagingRoleExplainer = new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type("WizardMessagingRoleExplainer", 46, "WizardMessagingRoleExplainer");

    private static final /* synthetic */ com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type[] $values() {
        return new com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type[]{WhatsNew, MdauPromo, FillProfile, WhatsAppCallsAvailable, WhatsAppCallsEnable, Backup, BackupSmsPermission, Restore, Onboarding, DemoCallTutorial, CallRecOnboarding, TcpayPromo, CallRecordingDisabled, CallRecordingDefaultDialerPromo, CreditWhatsNew, CreditPromoBanner, ContextCallNewUserPromo, ContextCallReminderPromo, PremiumBlockingPrompt, SecondaryPhoneNumberPromo, WizardDefaultDialer, WizardCallerIdRole, SmartSmsBanner, DetectSpamMessagePromo, DrawOverOtherAppsPromo, NotificationsPermissionsBanner, SmsReadPermissionBanner, SmsReadPermissionEmptyState, CallerIdPermissionPromo, DisableBatteryOptimizationPromoInteraction, RebrandingWhatsNew, PermissionDeniedDialog, VerificationConfirmNumberDialog, GoogleOneTapCancellationDialog, ThrottledDialogWithPermission, ThrottledDialogWithoutPermission, ReverseWhatsAppMessageNotSent, ReverseWhatsAppPhoneNumberHint, ReverseOtpPhoneNumberHint, ReverseOtpCountdown, OnboardingPermissionDialog, WizardCallerIdRoleConfirmationDialog, WizardCallerIdRoleDisclaimerDialog, WizardCallerIdRoleSettingsDialog, WizardCallerIdRoleSettingsDialogOptional, WizardMessagingRole, WizardMessagingRoleExplainer};
    }

    static {
        com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private StartupDialogEvent$Type(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type valueOf(java.lang.String str) {
        return (com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type) java.lang.Enum.valueOf(com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type.class, str);
    }

    public static com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type[] values() {
        return (com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
