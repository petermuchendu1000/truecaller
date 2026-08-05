package com.truecaller.call_assistant.domain.hint.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/call_assistant/domain/hint/analytics/AssistantHintLaunchContext;", "", "<init>", "(Ljava/lang/String;I)V", "INCOMING_CALL", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantHintLaunchContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.domain.hint.analytics.AssistantHintLaunchContext[] $VALUES;
    public static final com.truecaller.call_assistant.domain.hint.analytics.AssistantHintLaunchContext INCOMING_CALL = new com.truecaller.call_assistant.domain.hint.analytics.AssistantHintLaunchContext("INCOMING_CALL", 0);

    private static final /* synthetic */ com.truecaller.call_assistant.domain.hint.analytics.AssistantHintLaunchContext[] $values() {
        return new com.truecaller.call_assistant.domain.hint.analytics.AssistantHintLaunchContext[]{INCOMING_CALL};
    }

    static {
        com.truecaller.call_assistant.domain.hint.analytics.AssistantHintLaunchContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AssistantHintLaunchContext(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.domain.hint.analytics.AssistantHintLaunchContext valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.domain.hint.analytics.AssistantHintLaunchContext) java.lang.Enum.valueOf(com.truecaller.call_assistant.domain.hint.analytics.AssistantHintLaunchContext.class, str);
    }

    public static com.truecaller.call_assistant.domain.hint.analytics.AssistantHintLaunchContext[] values() {
        return (com.truecaller.call_assistant.domain.hint.analytics.AssistantHintLaunchContext[]) $VALUES.clone();
    }
}
