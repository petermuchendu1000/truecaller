package com.truecaller.favourite_contacts.add_favourite_contact;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.favourite_contacts.analytics.AddFavoriteContactSource.values().length];
        try {
            iArr[com.truecaller.favourite_contacts.analytics.AddFavoriteContactSource.FAVORITE_CONTACTS_CALL_LOG.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.favourite_contacts.analytics.AddFavoriteContactSource.EMPTY_FAVORITE_CALL_LOG.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.favourite_contacts.analytics.AddFavoriteContactSource.FAVORITE_CONTACTS.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
