package com.truecaller.messaging.conversation.draft;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/messaging/conversation/draft/DraftMode;", "", "<init>", "(Ljava/lang/String;I)V", "GALLERY", "DOCUMENTS", "VCARD", "CAPTURE_PHOTO", "CAPTURE_VIDEO", "GIF", "SHARED_CONTENT", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DraftMode {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.draft.DraftMode[] $VALUES;
    public static final com.truecaller.messaging.conversation.draft.DraftMode GALLERY = new com.truecaller.messaging.conversation.draft.DraftMode("GALLERY", 0);
    public static final com.truecaller.messaging.conversation.draft.DraftMode DOCUMENTS = new com.truecaller.messaging.conversation.draft.DraftMode("DOCUMENTS", 1);
    public static final com.truecaller.messaging.conversation.draft.DraftMode VCARD = new com.truecaller.messaging.conversation.draft.DraftMode("VCARD", 2);
    public static final com.truecaller.messaging.conversation.draft.DraftMode CAPTURE_PHOTO = new com.truecaller.messaging.conversation.draft.DraftMode("CAPTURE_PHOTO", 3);
    public static final com.truecaller.messaging.conversation.draft.DraftMode CAPTURE_VIDEO = new com.truecaller.messaging.conversation.draft.DraftMode("CAPTURE_VIDEO", 4);
    public static final com.truecaller.messaging.conversation.draft.DraftMode GIF = new com.truecaller.messaging.conversation.draft.DraftMode("GIF", 5);
    public static final com.truecaller.messaging.conversation.draft.DraftMode SHARED_CONTENT = new com.truecaller.messaging.conversation.draft.DraftMode("SHARED_CONTENT", 6);

    private static final /* synthetic */ com.truecaller.messaging.conversation.draft.DraftMode[] $values() {
        return new com.truecaller.messaging.conversation.draft.DraftMode[]{GALLERY, DOCUMENTS, VCARD, CAPTURE_PHOTO, CAPTURE_VIDEO, GIF, SHARED_CONTENT};
    }

    static {
        com.truecaller.messaging.conversation.draft.DraftMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DraftMode(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.draft.DraftMode valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.draft.DraftMode) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.draft.DraftMode.class, str);
    }

    public static com.truecaller.messaging.conversation.draft.DraftMode[] values() {
        return (com.truecaller.messaging.conversation.draft.DraftMode[]) $VALUES.clone();
    }
}
