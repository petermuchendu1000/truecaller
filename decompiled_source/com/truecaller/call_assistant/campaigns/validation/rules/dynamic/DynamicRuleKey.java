package com.truecaller.call_assistant.campaigns.validation.rules.dynamic;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/validation/rules/dynamic/DynamicRuleKey;", "", "", "ruleName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRuleName", "()Ljava/lang/String;", "Companion", "ym0/bar", "VOICEMAIL_SERVICE_VALIDATION_STATUS", "MISSED_CALLS_WITHOUT_VOICEMAIL", "NUMBER_OF_VOICEMAILS_PLAYED_LAST_30_DAYS", "DAYS_FROM_VOICEMAIL_ACTIVATION", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DynamicRuleKey {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ym0.bar Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String ruleName;
    public static final com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey VOICEMAIL_SERVICE_VALIDATION_STATUS = new com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey("VOICEMAIL_SERVICE_VALIDATION_STATUS", 0, "serviceValidationStatusVoicemail");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey MISSED_CALLS_WITHOUT_VOICEMAIL = new com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey("MISSED_CALLS_WITHOUT_VOICEMAIL", 1, "missedCallsWithoutVoicemail");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey NUMBER_OF_VOICEMAILS_PLAYED_LAST_30_DAYS = new com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey("NUMBER_OF_VOICEMAILS_PLAYED_LAST_30_DAYS", 2, "numberOfVoicemailsPlayedLast30Days");
    public static final com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey DAYS_FROM_VOICEMAIL_ACTIVATION = new com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey("DAYS_FROM_VOICEMAIL_ACTIVATION", 3, "daysFromVoicemailActivation");

    private static final /* synthetic */ com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey[] $values() {
        return new com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey[]{VOICEMAIL_SERVICE_VALIDATION_STATUS, MISSED_CALLS_WITHOUT_VOICEMAIL, NUMBER_OF_VOICEMAILS_PLAYED_LAST_30_DAYS, DAYS_FROM_VOICEMAIL_ACTIVATION};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, ym0.bar] */
    static {
        com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private DynamicRuleKey(java.lang.String str, int i, java.lang.String str2) {
        this.ruleName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey) java.lang.Enum.valueOf(com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey.class, str);
    }

    public static com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey[] values() {
        return (com.truecaller.call_assistant.campaigns.validation.rules.dynamic.DynamicRuleKey[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRuleName() {
        return this.ruleName;
    }
}
