package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum AppSetting implements com.google.protobuf.Internal.EnumLite {
    NO_SETTING(0),
    PROMOTIONAL_NOTIFICATIONS_FLAG(1),
    SMART_SMS_FLAG(2),
    CUSTOM_HEADS_UP_FLAG(4),
    PASSCODE_LOCK_FLAG(8),
    ALL_SETTINGS(15),
    UNRECOGNIZED(-1);

    public static final int ALL_SETTINGS_VALUE = 15;
    public static final int CUSTOM_HEADS_UP_FLAG_VALUE = 4;
    public static final int NO_SETTING_VALUE = 0;
    public static final int PASSCODE_LOCK_FLAG_VALUE = 8;
    public static final int PROMOTIONAL_NOTIFICATIONS_FLAG_VALUE = 1;
    public static final int SMART_SMS_FLAG_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.AppSetting> internalValueMap = new java.lang.Object();
    private final int value;

    AppSetting(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.AppSetting forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 15) {
                                return null;
                            }
                            return ALL_SETTINGS;
                        }
                        return PASSCODE_LOCK_FLAG;
                    }
                    return CUSTOM_HEADS_UP_FLAG;
                }
                return SMART_SMS_FLAG;
            }
            return PROMOTIONAL_NOTIFICATIONS_FLAG;
        }
        return NO_SETTING;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.AppSetting> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return se0.a.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.AppSetting valueOf(int i) {
        return forNumber(i);
    }
}
