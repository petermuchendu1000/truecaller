package com.truecaller.call_assistant.core.customvoice.createvoice;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/call_assistant/core/customvoice/createvoice/CustomVoiceNavigationContext;", "", "analyticsContext", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsContext", "()Ljava/lang/String;", "CLONE_TERMS", "CLONE_READY", "SELECT_VOICE_SCREEN", "SELECT_VOICE_WITH_CLONE_VOICE", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CustomVoiceNavigationContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsContext;
    public static final com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext CLONE_TERMS = new com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext("CLONE_TERMS", 0, "CTCloneTerms");
    public static final com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext CLONE_READY = new com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext("CLONE_READY", 1, "CTCloneReady");
    public static final com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext SELECT_VOICE_SCREEN = new com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext("SELECT_VOICE_SCREEN", 2, "CTOnboardingSelectVoice-10001");
    public static final com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext SELECT_VOICE_WITH_CLONE_VOICE = new com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext("SELECT_VOICE_WITH_CLONE_VOICE", 3, "CTOnboardingSelectVoice_CloneVoice-10001");

    private static final /* synthetic */ com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext[] $values() {
        return new com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext[]{CLONE_TERMS, CLONE_READY, SELECT_VOICE_SCREEN, SELECT_VOICE_WITH_CLONE_VOICE};
    }

    static {
        com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CustomVoiceNavigationContext(java.lang.String str, int i, java.lang.String str2) {
        this.analyticsContext = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext.class, str);
    }

    public static com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext[] values() {
        return (com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceNavigationContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticsContext() {
        return this.analyticsContext;
    }
}
