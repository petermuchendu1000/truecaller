package com.truecaller.api.services.profile.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum FieldType$Input implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    TEXT(1),
    PHONE(2),
    TEXT_CAP_SENTENCES(3),
    UNRECOGNIZED(-1);

    public static final int PHONE_VALUE = 2;
    public static final int TEXT_CAP_SENTENCES_VALUE = 3;
    public static final int TEXT_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.profile.model.FieldType$Input> internalValueMap = new java.lang.Object();
    private final int value;

    FieldType$Input(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.profile.model.FieldType$Input forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return TEXT_CAP_SENTENCES;
                }
                return PHONE;
            }
            return TEXT;
        }
        return UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.profile.model.FieldType$Input> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return xe0.t.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.profile.model.FieldType$Input valueOf(int i) {
        return forNumber(i);
    }
}
