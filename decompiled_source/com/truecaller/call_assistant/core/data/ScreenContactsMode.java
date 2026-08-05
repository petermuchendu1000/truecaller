package com.truecaller.call_assistant.core.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/call_assistant/core/data/ScreenContactsMode;", "", "value", "", "analyticsName", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getAnalyticsName", "()Ljava/lang/String;", "SCREEN_CONTACTS", "REJECT_CONTACTS", "SEND_TO_VOICEMAIL", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ScreenContactsMode {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.data.ScreenContactsMode[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsName;
    private final int value;
    public static final com.truecaller.call_assistant.core.data.ScreenContactsMode SCREEN_CONTACTS = new com.truecaller.call_assistant.core.data.ScreenContactsMode("SCREEN_CONTACTS", 0, 0, "ringPhone");
    public static final com.truecaller.call_assistant.core.data.ScreenContactsMode REJECT_CONTACTS = new com.truecaller.call_assistant.core.data.ScreenContactsMode("REJECT_CONTACTS", 1, 1, "hangUp");
    public static final com.truecaller.call_assistant.core.data.ScreenContactsMode SEND_TO_VOICEMAIL = new com.truecaller.call_assistant.core.data.ScreenContactsMode("SEND_TO_VOICEMAIL", 2, 2, "voicemail");

    private static final /* synthetic */ com.truecaller.call_assistant.core.data.ScreenContactsMode[] $values() {
        return new com.truecaller.call_assistant.core.data.ScreenContactsMode[]{SCREEN_CONTACTS, REJECT_CONTACTS, SEND_TO_VOICEMAIL};
    }

    static {
        com.truecaller.call_assistant.core.data.ScreenContactsMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ScreenContactsMode(java.lang.String str, int i, int i2, java.lang.String str2) {
        this.value = i2;
        this.analyticsName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.data.ScreenContactsMode valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.data.ScreenContactsMode) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.data.ScreenContactsMode.class, str);
    }

    public static com.truecaller.call_assistant.core.data.ScreenContactsMode[] values() {
        return (com.truecaller.call_assistant.core.data.ScreenContactsMode[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticsName() {
        return this.analyticsName;
    }

    public final int getValue() {
        return this.value;
    }
}
