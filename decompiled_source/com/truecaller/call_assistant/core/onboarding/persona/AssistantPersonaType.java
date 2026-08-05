package com.truecaller.call_assistant.core.onboarding.persona;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/call_assistant/core/onboarding/persona/AssistantPersonaType;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "NONE", "PERSONAL", "BUSINESS", "MIXED", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantPersonaType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType[] $VALUES;
    private final int id;
    public static final com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType NONE = new com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType("NONE", 0, -1);
    public static final com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType PERSONAL = new com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType("PERSONAL", 1, 0);
    public static final com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType BUSINESS = new com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType("BUSINESS", 2, 1);
    public static final com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType MIXED = new com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType("MIXED", 3, 2);

    private static final /* synthetic */ com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType[] $values() {
        return new com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType[]{NONE, PERSONAL, BUSINESS, MIXED};
    }

    static {
        com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AssistantPersonaType(java.lang.String str, int i, int i2) {
        this.id = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType.class, str);
    }

    public static com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType[] values() {
        return (com.truecaller.call_assistant.core.onboarding.persona.AssistantPersonaType[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
