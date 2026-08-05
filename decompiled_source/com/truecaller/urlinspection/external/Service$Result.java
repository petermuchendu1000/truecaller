package com.truecaller.urlinspection.external;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum Service$Result implements com.google.protobuf.Internal.EnumLite {
    RESULT_UNSPECIFIED(0),
    RESULT_MALICIOUS(1),
    UNRECOGNIZED(-1);

    public static final int RESULT_MALICIOUS_VALUE = 1;
    public static final int RESULT_UNSPECIFIED_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.urlinspection.external.Service$Result> internalValueMap = new java.lang.Object();
    private final int value;

    Service$Result(int i) {
        this.value = i;
    }

    public static com.truecaller.urlinspection.external.Service$Result forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return RESULT_MALICIOUS;
        }
        return RESULT_UNSPECIFIED;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.urlinspection.external.Service$Result> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return vy2.qux.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.urlinspection.external.Service$Result valueOf(int i) {
        return forNumber(i);
    }
}
