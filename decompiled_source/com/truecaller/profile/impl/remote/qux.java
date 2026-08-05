package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class qux {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[com.truecaller.api.services.profile.model.FieldType.TypeCase.values().length];
        try {
            iArr[com.truecaller.api.services.profile.model.FieldType.TypeCase.TEXT_FIELD.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.api.services.profile.model.FieldType.TypeCase.COMBOBOX_FIELD.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.api.services.profile.model.FieldType.TypeCase.RADIO_FIELD.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.api.services.profile.model.FieldType.TypeCase.DATE_FIELD.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.truecaller.api.services.profile.model.FieldType.TypeCase.TYPE_NOT_SET.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[com.truecaller.api.services.profile.model.FieldType.Input.values().length];
        try {
            iArr2[com.truecaller.api.services.profile.model.FieldType.Input.TEXT.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr2[com.truecaller.api.services.profile.model.FieldType.Input.PHONE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            iArr2[com.truecaller.api.services.profile.model.FieldType.Input.TEXT_CAP_SENTENCES.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            iArr2[com.truecaller.api.services.profile.model.FieldType.Input.UNRECOGNIZED.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            iArr2[com.truecaller.api.services.profile.model.FieldType.Input.UNKNOWN.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        b = iArr2;
    }
}
