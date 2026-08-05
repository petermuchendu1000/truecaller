package com.truecaller.call_assistant.domain.hint;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/call_assistant/domain/hint/AssistantHintSupportedCallTypes;", "", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "zr0/f", "IDENTIFIED", "CONTACT", "SPAM", "PRIORITY", "VERIFIED_BUSINESS", "SMALL_BUSINESS", "UNIDENTIFIED", "UNKNOWN", "WHATSAPP", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantHintSupportedCallTypes {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final zr0.f Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes IDENTIFIED = new com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes("IDENTIFIED", 0, "Identified");
    public static final com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes CONTACT = new com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes("CONTACT", 1, "Contact");
    public static final com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes SPAM = new com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes("SPAM", 2, "Spam");
    public static final com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes PRIORITY = new com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes("PRIORITY", 3, "Priority");
    public static final com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes VERIFIED_BUSINESS = new com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes("VERIFIED_BUSINESS", 4, "Verified_Business");
    public static final com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes SMALL_BUSINESS = new com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes("SMALL_BUSINESS", 5, "SmallBusiness");
    public static final com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes UNIDENTIFIED = new com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes("UNIDENTIFIED", 6, "Unidentified");
    public static final com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes UNKNOWN = new com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes("UNKNOWN", 7, "unknown");
    public static final com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes WHATSAPP = new com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes("WHATSAPP", 8, "WhatsApp_Call");

    private static final /* synthetic */ com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes[] $values() {
        return new com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes[]{IDENTIFIED, CONTACT, SPAM, PRIORITY, VERIFIED_BUSINESS, SMALL_BUSINESS, UNIDENTIFIED, UNKNOWN, WHATSAPP};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, zr0.f] */
    static {
        com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private AssistantHintSupportedCallTypes(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes fromString(@org.jetbrains.annotations.NotNull java.lang.String str) {
        com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes assistantHintSupportedCallTypes;
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                assistantHintSupportedCallTypes = values[i];
                if (kotlin.text.y.p(assistantHintSupportedCallTypes.getId(), str, true)) {
                    break;
                }
                i++;
            } else {
                assistantHintSupportedCallTypes = null;
                break;
            }
        }
        if (assistantHintSupportedCallTypes == null) {
            return UNKNOWN;
        }
        return assistantHintSupportedCallTypes;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes) java.lang.Enum.valueOf(com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes.class, str);
    }

    public static com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes[] values() {
        return (com.truecaller.call_assistant.domain.hint.AssistantHintSupportedCallTypes[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
