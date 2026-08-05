package com.truecaller.contacteditor.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/contacteditor/api/Source;", "", "<init>", "(Ljava/lang/String;I)V", "CONTACTS_TAB", "DETAILS_VIEW", "DETAILS_VIEW_INCALL_UI", "FACS", "PACS", "DIALER", "CONVERSATION", "CONVERSATION_MESSAGE", "DEEP_LINK", "CHOOSE_CONTACT", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class Source {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.contacteditor.api.Source[] $VALUES;
    public static final com.truecaller.contacteditor.api.Source CONTACTS_TAB = new com.truecaller.contacteditor.api.Source("CONTACTS_TAB", 0);
    public static final com.truecaller.contacteditor.api.Source DETAILS_VIEW = new com.truecaller.contacteditor.api.Source("DETAILS_VIEW", 1);
    public static final com.truecaller.contacteditor.api.Source DETAILS_VIEW_INCALL_UI = new com.truecaller.contacteditor.api.Source("DETAILS_VIEW_INCALL_UI", 2);
    public static final com.truecaller.contacteditor.api.Source FACS = new com.truecaller.contacteditor.api.Source("FACS", 3);
    public static final com.truecaller.contacteditor.api.Source PACS = new com.truecaller.contacteditor.api.Source("PACS", 4);
    public static final com.truecaller.contacteditor.api.Source DIALER = new com.truecaller.contacteditor.api.Source("DIALER", 5);
    public static final com.truecaller.contacteditor.api.Source CONVERSATION = new com.truecaller.contacteditor.api.Source("CONVERSATION", 6);
    public static final com.truecaller.contacteditor.api.Source CONVERSATION_MESSAGE = new com.truecaller.contacteditor.api.Source("CONVERSATION_MESSAGE", 7);
    public static final com.truecaller.contacteditor.api.Source DEEP_LINK = new com.truecaller.contacteditor.api.Source("DEEP_LINK", 8);
    public static final com.truecaller.contacteditor.api.Source CHOOSE_CONTACT = new com.truecaller.contacteditor.api.Source("CHOOSE_CONTACT", 9);

    private static final /* synthetic */ com.truecaller.contacteditor.api.Source[] $values() {
        return new com.truecaller.contacteditor.api.Source[]{CONTACTS_TAB, DETAILS_VIEW, DETAILS_VIEW_INCALL_UI, FACS, PACS, DIALER, CONVERSATION, CONVERSATION_MESSAGE, DEEP_LINK, CHOOSE_CONTACT};
    }

    static {
        com.truecaller.contacteditor.api.Source[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Source(java.lang.String str, int i10) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.contacteditor.api.Source valueOf(java.lang.String str) {
        return (com.truecaller.contacteditor.api.Source) java.lang.Enum.valueOf(com.truecaller.contacteditor.api.Source.class, str);
    }

    public static com.truecaller.contacteditor.api.Source[] values() {
        return (com.truecaller.contacteditor.api.Source[]) $VALUES.clone();
    }
}
