package com.truecaller.contactrequest.persistence;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract /* synthetic */ class baz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type.values().length];
        try {
            iArr[com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type.ACCEPTED.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Type.REJECTED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
