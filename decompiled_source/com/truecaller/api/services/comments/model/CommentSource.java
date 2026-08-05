package com.truecaller.api.services.comments.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum CommentSource implements com.google.protobuf.Internal.EnumLite {
    ANDROID(0),
    WEB(1),
    IOS(2),
    WEB_MOBILE_AUTH(3),
    SURVEY_RATING(4),
    UNRECOGNIZED(-1);

    public static final int ANDROID_VALUE = 0;
    public static final int IOS_VALUE = 2;
    public static final int SURVEY_RATING_VALUE = 4;
    public static final int WEB_MOBILE_AUTH_VALUE = 3;
    public static final int WEB_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.CommentSource> internalValueMap = new java.lang.Object();
    private final int value;

    CommentSource(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.comments.model.CommentSource forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return SURVEY_RATING;
                    }
                    return WEB_MOBILE_AUTH;
                }
                return IOS;
            }
            return WEB;
        }
        return ANDROID;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.CommentSource> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return me0.baz.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.comments.model.CommentSource valueOf(int i) {
        return forNumber(i);
    }
}
