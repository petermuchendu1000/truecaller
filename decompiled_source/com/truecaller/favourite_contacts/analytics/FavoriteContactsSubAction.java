package com.truecaller.favourite_contacts.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/favourite_contacts/analytics/FavoriteContactsSubAction;", "", "subAction", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSubAction", "()Ljava/lang/String;", "REORDER_FAVORITE_LONG_CLICK", "REORDER_FAVORITE_TAP", "REORDER_OPTION_MENU", "PHONE_NUMBER", "VOICE_CALL_FAVORITE", "NO_DEFAULT_ACTION_CALL_FAVORITE", "DIRECT_CALL", "DIRECT_MESSAGE", "favourite-contacts_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FavoriteContactsSubAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String subAction;
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction REORDER_FAVORITE_LONG_CLICK = new com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction("REORDER_FAVORITE_LONG_CLICK", 0, "LongClick");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction REORDER_FAVORITE_TAP = new com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction("REORDER_FAVORITE_TAP", 1, "Tap");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction REORDER_OPTION_MENU = new com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction("REORDER_OPTION_MENU", 2, "ReorderOptionMenu");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction PHONE_NUMBER = new com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction("PHONE_NUMBER", 3, "Number");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction VOICE_CALL_FAVORITE = new com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction("VOICE_CALL_FAVORITE", 4, "Voice");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction NO_DEFAULT_ACTION_CALL_FAVORITE = new com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction("NO_DEFAULT_ACTION_CALL_FAVORITE", 5, "NoDefault");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction DIRECT_CALL = new com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction("DIRECT_CALL", 6, "DirectCall");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction DIRECT_MESSAGE = new com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction("DIRECT_MESSAGE", 7, "DirectMessage");

    private static final /* synthetic */ com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction[] $values() {
        return new com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction[]{REORDER_FAVORITE_LONG_CLICK, REORDER_FAVORITE_TAP, REORDER_OPTION_MENU, PHONE_NUMBER, VOICE_CALL_FAVORITE, NO_DEFAULT_ACTION_CALL_FAVORITE, DIRECT_CALL, DIRECT_MESSAGE};
    }

    static {
        com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FavoriteContactsSubAction(java.lang.String str, int i, java.lang.String str2) {
        this.subAction = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction valueOf(java.lang.String str) {
        return (com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction) java.lang.Enum.valueOf(com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction.class, str);
    }

    public static com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction[] values() {
        return (com.truecaller.favourite_contacts.analytics.FavoriteContactsSubAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSubAction() {
        return this.subAction;
    }
}
