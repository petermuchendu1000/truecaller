package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum GroupAction implements com.google.protobuf.Internal.EnumLite {
    NO_ACTION(0),
    UPDATE_SETTINGS(1),
    UPDATE_INFO(2),
    INVITE(4),
    KICK_OUT(8),
    SEND_MESSAGE(16),
    UNRECOGNIZED(-1);

    public static final int INVITE_VALUE = 4;
    public static final int KICK_OUT_VALUE = 8;
    public static final int NO_ACTION_VALUE = 0;
    public static final int SEND_MESSAGE_VALUE = 16;
    public static final int UPDATE_INFO_VALUE = 2;
    public static final int UPDATE_SETTINGS_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.GroupAction> internalValueMap = new java.lang.Object();
    private final int value;

    GroupAction(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.GroupAction forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                return null;
                            }
                            return SEND_MESSAGE;
                        }
                        return KICK_OUT;
                    }
                    return INVITE;
                }
                return UPDATE_INFO;
            }
            return UPDATE_SETTINGS;
        }
        return NO_ACTION;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.GroupAction> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return se0.n.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.GroupAction valueOf(int i) {
        return forNumber(i);
    }
}
