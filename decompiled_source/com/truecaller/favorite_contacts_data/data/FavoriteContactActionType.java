package com.truecaller.favorite_contacts_data.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/favorite_contacts_data/data/FavoriteContactActionType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "PHONE_CALL", "favorite-contacts-data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FavoriteContactActionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.favorite_contacts_data.data.FavoriteContactActionType[] $VALUES;
    public static final com.truecaller.favorite_contacts_data.data.FavoriteContactActionType PHONE_CALL = new com.truecaller.favorite_contacts_data.data.FavoriteContactActionType("PHONE_CALL", 0, "VOICE");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String type;

    private static final /* synthetic */ com.truecaller.favorite_contacts_data.data.FavoriteContactActionType[] $values() {
        return new com.truecaller.favorite_contacts_data.data.FavoriteContactActionType[]{PHONE_CALL};
    }

    static {
        com.truecaller.favorite_contacts_data.data.FavoriteContactActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FavoriteContactActionType(java.lang.String str, int i, java.lang.String str2) {
        this.type = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.favorite_contacts_data.data.FavoriteContactActionType valueOf(java.lang.String str) {
        return (com.truecaller.favorite_contacts_data.data.FavoriteContactActionType) java.lang.Enum.valueOf(com.truecaller.favorite_contacts_data.data.FavoriteContactActionType.class, str);
    }

    public static com.truecaller.favorite_contacts_data.data.FavoriteContactActionType[] values() {
        return (com.truecaller.favorite_contacts_data.data.FavoriteContactActionType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return this.type;
    }
}
