package com.truecaller.contacts_list;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/contacts_list/ContactsHolder$SortingMode", "", "Lcom/truecaller/contacts_list/ContactsHolder$SortingMode;", "<init>", "(Ljava/lang/String;I)V", "BY_FIRST_NAME", "BY_LAST_NAME", "contacts-list_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ContactsHolder$SortingMode {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.contacts_list.ContactsHolder$SortingMode[] $VALUES;
    public static final com.truecaller.contacts_list.ContactsHolder$SortingMode BY_FIRST_NAME = new com.truecaller.contacts_list.ContactsHolder$SortingMode("BY_FIRST_NAME", 0);
    public static final com.truecaller.contacts_list.ContactsHolder$SortingMode BY_LAST_NAME = new com.truecaller.contacts_list.ContactsHolder$SortingMode("BY_LAST_NAME", 1);

    private static final /* synthetic */ com.truecaller.contacts_list.ContactsHolder$SortingMode[] $values() {
        return new com.truecaller.contacts_list.ContactsHolder$SortingMode[]{BY_FIRST_NAME, BY_LAST_NAME};
    }

    static {
        com.truecaller.contacts_list.ContactsHolder$SortingMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ContactsHolder$SortingMode(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.contacts_list.ContactsHolder$SortingMode valueOf(java.lang.String str) {
        return (com.truecaller.contacts_list.ContactsHolder$SortingMode) java.lang.Enum.valueOf(com.truecaller.contacts_list.ContactsHolder$SortingMode.class, str);
    }

    public static com.truecaller.contacts_list.ContactsHolder$SortingMode[] values() {
        return (com.truecaller.contacts_list.ContactsHolder$SortingMode[]) $VALUES.clone();
    }
}
