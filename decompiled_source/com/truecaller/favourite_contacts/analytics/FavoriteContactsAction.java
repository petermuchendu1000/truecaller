package com.truecaller.favourite_contacts.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/favourite_contacts/analytics/FavoriteContactsAction;", "", "action", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", "ADD_FAVORITE", "ADD_FAVORITE_EMPTY", "REMOVE_FAVORITE", "REORDER_FAVORITE", "CALL_FAVORITE", "EDIT_DEFAULT_FAVORITE", "AVATAR_LONG_CLICK", "AVATAR_CLICK", "MESSAGE_MENU_OPTION", "MESSAGE_FAVORITE", "favourite-contacts_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FavoriteContactsAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.favourite_contacts.analytics.FavoriteContactsAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String action;
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsAction ADD_FAVORITE = new com.truecaller.favourite_contacts.analytics.FavoriteContactsAction("ADD_FAVORITE", 0, "AddFavorite");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsAction ADD_FAVORITE_EMPTY = new com.truecaller.favourite_contacts.analytics.FavoriteContactsAction("ADD_FAVORITE_EMPTY", 1, "AddFavoriteEmpty");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsAction REMOVE_FAVORITE = new com.truecaller.favourite_contacts.analytics.FavoriteContactsAction("REMOVE_FAVORITE", 2, "RemoveFavorite");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsAction REORDER_FAVORITE = new com.truecaller.favourite_contacts.analytics.FavoriteContactsAction("REORDER_FAVORITE", 3, "ReorderFavorite");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsAction CALL_FAVORITE = new com.truecaller.favourite_contacts.analytics.FavoriteContactsAction("CALL_FAVORITE", 4, "Call");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsAction EDIT_DEFAULT_FAVORITE = new com.truecaller.favourite_contacts.analytics.FavoriteContactsAction("EDIT_DEFAULT_FAVORITE", 5, "EditDefault");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsAction AVATAR_LONG_CLICK = new com.truecaller.favourite_contacts.analytics.FavoriteContactsAction("AVATAR_LONG_CLICK", 6, "AvatarLongClick");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsAction AVATAR_CLICK = new com.truecaller.favourite_contacts.analytics.FavoriteContactsAction("AVATAR_CLICK", 7, "AvatarClick");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsAction MESSAGE_MENU_OPTION = new com.truecaller.favourite_contacts.analytics.FavoriteContactsAction("MESSAGE_MENU_OPTION", 8, "MessageMenuOption");
    public static final com.truecaller.favourite_contacts.analytics.FavoriteContactsAction MESSAGE_FAVORITE = new com.truecaller.favourite_contacts.analytics.FavoriteContactsAction("MESSAGE_FAVORITE", 9, "Message");

    private static final /* synthetic */ com.truecaller.favourite_contacts.analytics.FavoriteContactsAction[] $values() {
        return new com.truecaller.favourite_contacts.analytics.FavoriteContactsAction[]{ADD_FAVORITE, ADD_FAVORITE_EMPTY, REMOVE_FAVORITE, REORDER_FAVORITE, CALL_FAVORITE, EDIT_DEFAULT_FAVORITE, AVATAR_LONG_CLICK, AVATAR_CLICK, MESSAGE_MENU_OPTION, MESSAGE_FAVORITE};
    }

    static {
        com.truecaller.favourite_contacts.analytics.FavoriteContactsAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FavoriteContactsAction(java.lang.String str, int i, java.lang.String str2) {
        this.action = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.favourite_contacts.analytics.FavoriteContactsAction valueOf(java.lang.String str) {
        return (com.truecaller.favourite_contacts.analytics.FavoriteContactsAction) java.lang.Enum.valueOf(com.truecaller.favourite_contacts.analytics.FavoriteContactsAction.class, str);
    }

    public static com.truecaller.favourite_contacts.analytics.FavoriteContactsAction[] values() {
        return (com.truecaller.favourite_contacts.analytics.FavoriteContactsAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAction() {
        return this.action;
    }
}
