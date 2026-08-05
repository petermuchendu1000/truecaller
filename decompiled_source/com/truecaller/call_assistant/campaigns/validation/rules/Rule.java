package com.truecaller.call_assistant.campaigns.validation.rules;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/validation/rules/Rule;", "", "", "ruleName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRuleName", "()Ljava/lang/String;", "Companion", "xm0/bar", "IS_CARRIER_SUPPORTED", "CUSTOM_GREETING_VISITED", "CUSTOM_QUICK_REPLIES_ENABLED", "CUSTOM_QUICK_REPLIES_VISITED", "HAS_COMPLETED_DEMO_CALL", "HAS_SCREENED_CALLS", "IS_ASSISTANT_ACTIVE", "IS_CLONED_VOICE_ENABLED", "IS_DEMO_CALL_ENABLED", "IS_ONBOARDING_FINISHED", "IS_RETURNED_USER", "IS_SUBSCRIBED", "IS_VOICE_CLONED", "IS_MISSED_CALLS_FROM_CONTACTS_ENABLED", "IS_MISSED_CALLS_FROM_UNKNOWN_ENABLED", "IS_SPAM_LEVEL_MAX_ENABLED", "IS_SPAM_LEVEL_BASIC_ENABLED", "HAS_SEEN_ASSISTANT_LANGUAGE_SELECTION", "HAS_EXACTLY_ONE_SCREENED_CALL", "IS_ONBOARDING_STARTED", "IS_ASSISTANT_TOGGLE_SPAM_ENABLED", "HAS_CHANGED_VOICE", "WAS_VOICEMAIL_ACTIVATION_TIMEOUT_REACHED", "WAS_VOICEMAIL_ENABLED", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class Rule {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.campaigns.validation.rules.Rule[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final xm0.bar Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String ruleName;
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_CARRIER_SUPPORTED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_CARRIER_SUPPORTED", 0, "isCarrierSupported");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule CUSTOM_GREETING_VISITED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("CUSTOM_GREETING_VISITED", 1, "hasVisitedCustomGreeting");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule CUSTOM_QUICK_REPLIES_ENABLED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("CUSTOM_QUICK_REPLIES_ENABLED", 2, "customQuickRepliesEnabled");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule CUSTOM_QUICK_REPLIES_VISITED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("CUSTOM_QUICK_REPLIES_VISITED", 3, "customQuickRepliesVisited");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule HAS_COMPLETED_DEMO_CALL = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("HAS_COMPLETED_DEMO_CALL", 4, "hasCompletedDemoCall");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule HAS_SCREENED_CALLS = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("HAS_SCREENED_CALLS", 5, "hasScreenedCalls");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_ASSISTANT_ACTIVE = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_ASSISTANT_ACTIVE", 6, "isAssistantActive");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_CLONED_VOICE_ENABLED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_CLONED_VOICE_ENABLED", 7, "isClonedVoiceEnabled");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_DEMO_CALL_ENABLED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_DEMO_CALL_ENABLED", 8, "isDemoCallEnabled");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_ONBOARDING_FINISHED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_ONBOARDING_FINISHED", 9, "isOnboardingFinished");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_RETURNED_USER = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_RETURNED_USER", 10, "isReturnedUser");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_SUBSCRIBED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_SUBSCRIBED", 11, "isSubscribed");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_VOICE_CLONED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_VOICE_CLONED", 12, "isVoiceCloned");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_MISSED_CALLS_FROM_CONTACTS_ENABLED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_MISSED_CALLS_FROM_CONTACTS_ENABLED", 13, "isMissedCallsFromContactsEnabled");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_MISSED_CALLS_FROM_UNKNOWN_ENABLED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_MISSED_CALLS_FROM_UNKNOWN_ENABLED", 14, "isMissedCallsFromUnknownEnabled");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_SPAM_LEVEL_MAX_ENABLED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_SPAM_LEVEL_MAX_ENABLED", 15, "isSpamLevelMaxEnabled");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_SPAM_LEVEL_BASIC_ENABLED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_SPAM_LEVEL_BASIC_ENABLED", 16, "isSpamLevelBasicEnabled");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule HAS_SEEN_ASSISTANT_LANGUAGE_SELECTION = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("HAS_SEEN_ASSISTANT_LANGUAGE_SELECTION", 17, "hasSeenAssistantLanguageSelection");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule HAS_EXACTLY_ONE_SCREENED_CALL = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("HAS_EXACTLY_ONE_SCREENED_CALL", 18, "hasScreenedExtaclyOneCall");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_ONBOARDING_STARTED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_ONBOARDING_STARTED", 19, "hasStartedAssistantActivation");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule IS_ASSISTANT_TOGGLE_SPAM_ENABLED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("IS_ASSISTANT_TOGGLE_SPAM_ENABLED", 20, "isAssistantToggleSpamEnabled");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule HAS_CHANGED_VOICE = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("HAS_CHANGED_VOICE", 21, "hasChangedVoice");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule WAS_VOICEMAIL_ACTIVATION_TIMEOUT_REACHED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("WAS_VOICEMAIL_ACTIVATION_TIMEOUT_REACHED", 22, "voicemailActivationTimeoutReached");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.Rule WAS_VOICEMAIL_ENABLED = new com.truecaller.call_assistant.campaigns.validation.rules.Rule("WAS_VOICEMAIL_ENABLED", 23, "wasVoicemailEnabled");

    private static final /* synthetic */ com.truecaller.call_assistant.campaigns.validation.rules.Rule[] $values() {
        return new com.truecaller.call_assistant.campaigns.validation.rules.Rule[]{IS_CARRIER_SUPPORTED, CUSTOM_GREETING_VISITED, CUSTOM_QUICK_REPLIES_ENABLED, CUSTOM_QUICK_REPLIES_VISITED, HAS_COMPLETED_DEMO_CALL, HAS_SCREENED_CALLS, IS_ASSISTANT_ACTIVE, IS_CLONED_VOICE_ENABLED, IS_DEMO_CALL_ENABLED, IS_ONBOARDING_FINISHED, IS_RETURNED_USER, IS_SUBSCRIBED, IS_VOICE_CLONED, IS_MISSED_CALLS_FROM_CONTACTS_ENABLED, IS_MISSED_CALLS_FROM_UNKNOWN_ENABLED, IS_SPAM_LEVEL_MAX_ENABLED, IS_SPAM_LEVEL_BASIC_ENABLED, HAS_SEEN_ASSISTANT_LANGUAGE_SELECTION, HAS_EXACTLY_ONE_SCREENED_CALL, IS_ONBOARDING_STARTED, IS_ASSISTANT_TOGGLE_SPAM_ENABLED, HAS_CHANGED_VOICE, WAS_VOICEMAIL_ACTIVATION_TIMEOUT_REACHED, WAS_VOICEMAIL_ENABLED};
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [xm0.bar, java.lang.Object] */
    static {
        com.truecaller.call_assistant.campaigns.validation.rules.Rule[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private Rule(java.lang.String str, int i, java.lang.String str2) {
        this.ruleName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.campaigns.validation.rules.Rule valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.campaigns.validation.rules.Rule) java.lang.Enum.valueOf(com.truecaller.call_assistant.campaigns.validation.rules.Rule.class, str);
    }

    public static com.truecaller.call_assistant.campaigns.validation.rules.Rule[] values() {
        return (com.truecaller.call_assistant.campaigns.validation.rules.Rule[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRuleName() {
        return this.ruleName;
    }
}
