package com.truecaller.urlinspection.external;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum Service$SenderIDType implements com.google.protobuf.Internal.EnumLite {
    TYPE_UNSPECIFIED(0),
    TYPE_PHONE_NUMBER(1),
    TYPE_SHORTCODE(2),
    TYPE_ALPHANUMERIC(3),
    TYPE_IMID_BIZ(4),
    TYPE_IMID_P2P(5),
    UNRECOGNIZED(-1);

    public static final int TYPE_ALPHANUMERIC_VALUE = 3;
    public static final int TYPE_IMID_BIZ_VALUE = 4;
    public static final int TYPE_IMID_P2P_VALUE = 5;
    public static final int TYPE_PHONE_NUMBER_VALUE = 1;
    public static final int TYPE_SHORTCODE_VALUE = 2;
    public static final int TYPE_UNSPECIFIED_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.urlinspection.external.Service$SenderIDType> internalValueMap = new java.lang.Object();
    private final int value;

    Service$SenderIDType(int i) {
        this.value = i;
    }

    public static com.truecaller.urlinspection.external.Service$SenderIDType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return TYPE_IMID_P2P;
                        }
                        return TYPE_IMID_BIZ;
                    }
                    return TYPE_ALPHANUMERIC;
                }
                return TYPE_SHORTCODE;
            }
            return TYPE_PHONE_NUMBER;
        }
        return TYPE_UNSPECIFIED;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.urlinspection.external.Service$SenderIDType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return vy2.d.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.urlinspection.external.Service$SenderIDType valueOf(int i) {
        return forNumber(i);
    }
}
