package com.truecaller.ads.config.external;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum UserConfig$Response$ConfigSettingsCase {
    CONFIGS(3),
    CONFIGSETTINGS_NOT_SET(0);

    private final int value;

    UserConfig$Response$ConfigSettingsCase(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.config.external.UserConfig$Response$ConfigSettingsCase forNumber(int i) {
        if (i != 0) {
            if (i != 3) {
                return null;
            }
            return CONFIGS;
        }
        return CONFIGSETTINGS_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.config.external.UserConfig$Response$ConfigSettingsCase valueOf(int i) {
        return forNumber(i);
    }
}
