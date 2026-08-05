package com.truecaller.api.services.messenger.v1.models.input;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum InputReachabilityStatus$InputAppPermissions implements com.google.protobuf.Internal.EnumLite {
    NO_PERMISSIONS(0),
    DEFAULT_SMS_APP_FLAG(1),
    POST_NOTIFICATIONS_FLAG(2),
    IM_NOTIFICATIONS_CHANNEL_FLAG(4),
    SYSTEM_ALERT_WINDOW_FLAG(8),
    READ_SMS_FLAG(16),
    REQUEST_IGNORE_BATTERY_OPTIMIZATIONS_FLAG(32),
    UNRECOGNIZED(-1);

    public static final int DEFAULT_SMS_APP_FLAG_VALUE = 1;
    public static final int IM_NOTIFICATIONS_CHANNEL_FLAG_VALUE = 4;
    public static final int NO_PERMISSIONS_VALUE = 0;
    public static final int POST_NOTIFICATIONS_FLAG_VALUE = 2;
    public static final int READ_SMS_FLAG_VALUE = 16;
    public static final int REQUEST_IGNORE_BATTERY_OPTIMIZATIONS_FLAG_VALUE = 32;
    public static final int SYSTEM_ALERT_WINDOW_FLAG_VALUE = 8;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.input.InputReachabilityStatus$InputAppPermissions> internalValueMap = new java.lang.Object();
    private final int value;

    InputReachabilityStatus$InputAppPermissions(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.input.InputReachabilityStatus$InputAppPermissions forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                if (i != 32) {
                                    return null;
                                }
                                return REQUEST_IGNORE_BATTERY_OPTIMIZATIONS_FLAG;
                            }
                            return READ_SMS_FLAG;
                        }
                        return SYSTEM_ALERT_WINDOW_FLAG;
                    }
                    return IM_NOTIFICATIONS_CHANNEL_FLAG;
                }
                return POST_NOTIFICATIONS_FLAG;
            }
            return DEFAULT_SMS_APP_FLAG;
        }
        return NO_PERMISSIONS;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.input.InputReachabilityStatus$InputAppPermissions> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return te0.b2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.input.InputReachabilityStatus$InputAppPermissions valueOf(int i) {
        return forNumber(i);
    }
}
