package com.truecaller.contacts_list.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/truecaller/contacts_list/data/SortedContactsRepository$ContactsLoadingMode", "", "Lcom/truecaller/contacts_list/data/SortedContactsRepository$ContactsLoadingMode;", "<init>", "(Ljava/lang/String;I)V", "PHONEBOOK_LIMITED", "NON_PHONEBOOK_LIMITED", "PHONEBOOK_INITIAL", "FULL_INITIAL", "FULL_WITH_ENTITIES", "contacts-list_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SortedContactsRepository$ContactsLoadingMode {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode[] $VALUES;
    public static final com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode PHONEBOOK_LIMITED = new com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode("PHONEBOOK_LIMITED", 0);
    public static final com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode NON_PHONEBOOK_LIMITED = new com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode("NON_PHONEBOOK_LIMITED", 1);
    public static final com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode PHONEBOOK_INITIAL = new com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode("PHONEBOOK_INITIAL", 2);
    public static final com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode FULL_INITIAL = new com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode("FULL_INITIAL", 3);
    public static final com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode FULL_WITH_ENTITIES = new com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode("FULL_WITH_ENTITIES", 4);

    private static final /* synthetic */ com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode[] $values() {
        return new com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode[]{PHONEBOOK_LIMITED, NON_PHONEBOOK_LIMITED, PHONEBOOK_INITIAL, FULL_INITIAL, FULL_WITH_ENTITIES};
    }

    static {
        com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SortedContactsRepository$ContactsLoadingMode(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode valueOf(java.lang.String str) {
        return (com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode) java.lang.Enum.valueOf(com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode.class, str);
    }

    public static com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode[] values() {
        return (com.truecaller.contacts_list.data.SortedContactsRepository$ContactsLoadingMode[]) $VALUES.clone();
    }
}
