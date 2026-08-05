package com.truecaller.api.services.messenger.v1.models.input;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum InputReachabilityStatus$InputAppSettings implements com.google.protobuf.Internal.EnumLite {
    NO_SETTINGS(0),
    PROMOTIONAL_NOTIFICATIONS_FLAG(1),
    SMART_SMS_FLAG(2),
    CUSTOM_HEADS_UP_FLAG(4),
    PASSCODE_LOCK_FLAG(8),
    UNRECOGNIZED(-1);

    public static final int CUSTOM_HEADS_UP_FLAG_VALUE = 4;
    public static final int NO_SETTINGS_VALUE = 0;
    public static final int PASSCODE_LOCK_FLAG_VALUE = 8;
    public static final int PROMOTIONAL_NOTIFICATIONS_FLAG_VALUE = 1;
    public static final int SMART_SMS_FLAG_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.input.InputReachabilityStatus$InputAppSettings> internalValueMap = new java.lang.Object();
    private final int value;

    InputReachabilityStatus$InputAppSettings(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.input.InputReachabilityStatus$InputAppSettings forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            return null;
                        }
                        return PASSCODE_LOCK_FLAG;
                    }
                    return CUSTOM_HEADS_UP_FLAG;
                }
                return SMART_SMS_FLAG;
            }
            return PROMOTIONAL_NOTIFICATIONS_FLAG;
        }
        return NO_SETTINGS;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.input.InputReachabilityStatus$InputAppSettings> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return te0.d2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.input.InputReachabilityStatus$InputAppSettings valueOf(int i) {
        return forNumber(i);
    }
}
