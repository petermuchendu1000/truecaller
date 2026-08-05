package com.truecaller.settings.impl.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.settings.api.SettingsCategory.values().length];
        try {
            iArr[com.truecaller.settings.api.SettingsCategory.SETTINGS_CALL_ASSISTANT.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.settings.api.SettingsCategory.SETTINGS_ASSISTANT_CUSTOMIZE_RESPONSE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.settings.api.SettingsCategory.SETTINGS_ASSISTANT_CUSTOM_GREETINGS.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.settings.api.SettingsCategory.SETTINGS_ASSISTANT_CHANGE_VOICE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.truecaller.settings.api.SettingsCategory.SETTINGS_ASSISTANT_VOICEMAIL.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr[com.truecaller.settings.api.SettingsCategory.SETTINGS_ASSISTANT_GREETINGS.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr[com.truecaller.settings.api.SettingsCategory.SETTINGS_ASSISTANT_CALL_RULES.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            iArr[com.truecaller.settings.api.SettingsCategory.SETTINGS_ASSISTANT_LANGUAGE_AND_VOICES.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            iArr[com.truecaller.settings.api.SettingsCategory.SETTINGS_ASSISTANT_PRIVACY.ordinal()] = 9;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
