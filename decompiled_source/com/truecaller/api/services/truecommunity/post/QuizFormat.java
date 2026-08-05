package com.truecaller.api.services.truecommunity.post;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum QuizFormat implements com.google.protobuf.Internal.EnumLite {
    SCAM_OR_NOT(0),
    UNRECOGNIZED(-1);

    public static final int SCAM_OR_NOT_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.post.QuizFormat> internalValueMap = new java.lang.Object();
    private final int value;

    QuizFormat(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.post.QuizFormat forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return SCAM_OR_NOT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.post.QuizFormat> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return if0.p2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.post.QuizFormat valueOf(int i) {
        return forNumber(i);
    }
}
