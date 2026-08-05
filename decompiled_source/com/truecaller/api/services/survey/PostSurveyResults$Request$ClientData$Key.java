package com.truecaller.api.services.survey;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum PostSurveyResults$Request$ClientData$Key implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    PROFILE_ID(1),
    DISPLAYED_NAME(2),
    IMAGE_URL(3),
    UNRECOGNIZED(-1);

    public static final int DISPLAYED_NAME_VALUE = 2;
    public static final int IMAGE_URL_VALUE = 3;
    public static final int PROFILE_ID_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.survey.PostSurveyResults$Request$ClientData$Key> internalValueMap = new java.lang.Object();
    private final int value;

    PostSurveyResults$Request$ClientData$Key(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.survey.PostSurveyResults$Request$ClientData$Key forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return IMAGE_URL;
                }
                return DISPLAYED_NAME;
            }
            return PROFILE_ID;
        }
        return UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.survey.PostSurveyResults$Request$ClientData$Key> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return bf0.l2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.survey.PostSurveyResults$Request$ClientData$Key valueOf(int i) {
        return forNumber(i);
    }
}
