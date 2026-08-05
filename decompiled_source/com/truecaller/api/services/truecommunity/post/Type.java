package com.truecaller.api.services.truecommunity.post;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Type implements com.google.protobuf.Internal.EnumLite {
    GENERAL(0),
    MESSAGE(1),
    WEBSCAM(2),
    FRAUD(3),
    QUIZ(4),
    STATS(5),
    UNRECOGNIZED(-1);

    public static final int FRAUD_VALUE = 3;
    public static final int GENERAL_VALUE = 0;
    public static final int MESSAGE_VALUE = 1;
    public static final int QUIZ_VALUE = 4;
    public static final int STATS_VALUE = 5;
    public static final int WEBSCAM_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.post.Type> internalValueMap = new java.lang.Object();
    private final int value;

    Type(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.post.Type forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return STATS;
                        }
                        return QUIZ;
                    }
                    return FRAUD;
                }
                return WEBSCAM;
            }
            return MESSAGE;
        }
        return GENERAL;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.post.Type> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return if0.c4.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.post.Type valueOf(int i) {
        return forNumber(i);
    }
}
