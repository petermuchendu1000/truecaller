package com.truecaller.search.v1.models;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum InternetService implements com.google.protobuf.Internal.EnumLite {
    INTERNET_SERVICE_UNKNOWN(0),
    INTERNET_SERVICE_EMAIL(1),
    INTERNET_SERVICE_FACEBOOK(2),
    INTERNET_SERVICE_TWITTER(3),
    INTERNET_SERVICE_LINK(4),
    INTERNET_SERVICE_INSTAGRAM(5),
    UNRECOGNIZED(-1);

    public static final int INTERNET_SERVICE_EMAIL_VALUE = 1;
    public static final int INTERNET_SERVICE_FACEBOOK_VALUE = 2;
    public static final int INTERNET_SERVICE_INSTAGRAM_VALUE = 5;
    public static final int INTERNET_SERVICE_LINK_VALUE = 4;
    public static final int INTERNET_SERVICE_TWITTER_VALUE = 3;
    public static final int INTERNET_SERVICE_UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.InternetService> internalValueMap = new java.lang.Object();
    private final int value;

    InternetService(int i) {
        this.value = i;
    }

    public static com.truecaller.search.v1.models.InternetService forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return INTERNET_SERVICE_INSTAGRAM;
                        }
                        return INTERNET_SERVICE_LINK;
                    }
                    return INTERNET_SERVICE_TWITTER;
                }
                return INTERNET_SERVICE_FACEBOOK;
            }
            return INTERNET_SERVICE_EMAIL;
        }
        return INTERNET_SERVICE_UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.InternetService> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return sp2.q1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.search.v1.models.InternetService valueOf(int i) {
        return forNumber(i);
    }
}
