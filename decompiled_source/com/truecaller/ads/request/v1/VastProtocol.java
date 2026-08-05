package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum VastProtocol implements com.google.protobuf.Internal.EnumLite {
    VAST_2_0(0),
    VAST_2_0_WRAPPER(1),
    VAST_3_0(2),
    VAST_3_0_WRAPPER(3),
    VAST_4_0(4),
    VAST_4_0_WRAPPER(5),
    UNRECOGNIZED(-1);

    public static final int VAST_2_0_VALUE = 0;
    public static final int VAST_2_0_WRAPPER_VALUE = 1;
    public static final int VAST_3_0_VALUE = 2;
    public static final int VAST_3_0_WRAPPER_VALUE = 3;
    public static final int VAST_4_0_VALUE = 4;
    public static final int VAST_4_0_WRAPPER_VALUE = 5;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.VastProtocol> internalValueMap = new java.lang.Object();
    private final int value;

    VastProtocol(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.VastProtocol forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return VAST_4_0_WRAPPER;
                        }
                        return VAST_4_0;
                    }
                    return VAST_3_0_WRAPPER;
                }
                return VAST_3_0;
            }
            return VAST_2_0_WRAPPER;
        }
        return VAST_2_0;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.VastProtocol> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.q6.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.VastProtocol valueOf(int i) {
        return forNumber(i);
    }
}
