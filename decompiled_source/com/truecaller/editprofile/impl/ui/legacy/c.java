package com.truecaller.editprofile.impl.ui.legacy;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[com.truecaller.editprofile.api.ui.AutoFocusOnField.values().length];
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.FIRST_NAME.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.LAST_NAME.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.PHONE_NUMBER.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.SECONDARY_PHONE_NUMBER.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.EMAIL.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.BIRTH_DAY.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.GENDER.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.ADDRESS_STREET.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.ADDRESS_ZIP_CODE.ordinal()] = 9;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.ADDRESS_CITY.ordinal()] = 10;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.ADDRESS_COUNTRY.ordinal()] = 11;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.ABOUT_COMPANY.ordinal()] = 12;
        } catch (java.lang.NoSuchFieldError unused12) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.ABOUT_JOB_TITLE.ordinal()] = 13;
        } catch (java.lang.NoSuchFieldError unused13) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.ABOUT_WEBSITE.ordinal()] = 14;
        } catch (java.lang.NoSuchFieldError unused14) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.ABOUT_BIO.ordinal()] = 15;
        } catch (java.lang.NoSuchFieldError unused15) {
        }
        try {
            iArr[com.truecaller.editprofile.api.ui.AutoFocusOnField.AVATAR.ordinal()] = 16;
        } catch (java.lang.NoSuchFieldError unused16) {
        }
        a = iArr;
        int[] iArr2 = new int[com.truecaller.editprofile.impl.ui.legacy.ErrorField.values().length];
        try {
            iArr2[com.truecaller.editprofile.impl.ui.legacy.ErrorField.FIRST_NAME.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused17) {
        }
        try {
            iArr2[com.truecaller.editprofile.impl.ui.legacy.ErrorField.LAST_NAME.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused18) {
        }
        try {
            iArr2[com.truecaller.editprofile.impl.ui.legacy.ErrorField.EMAIL.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused19) {
        }
        try {
            iArr2[com.truecaller.editprofile.impl.ui.legacy.ErrorField.WEBSITE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused20) {
        }
        b = iArr2;
    }
}
