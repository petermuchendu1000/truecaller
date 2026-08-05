package com.truecaller.api.services.truecommunity.post;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum GetUnifiedPostDataRequest$SortBy implements com.google.protobuf.Internal.EnumLite {
    POPULAR(0),
    TIME(1),
    TRENDING(2),
    NEARBY(3),
    UNRECOGNIZED(-1);

    public static final int NEARBY_VALUE = 3;
    public static final int POPULAR_VALUE = 0;
    public static final int TIME_VALUE = 1;
    public static final int TRENDING_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.post.GetUnifiedPostDataRequest$SortBy> internalValueMap = new java.lang.Object();
    private final int value;

    GetUnifiedPostDataRequest$SortBy(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.post.GetUnifiedPostDataRequest$SortBy forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return NEARBY;
                }
                return TRENDING;
            }
            return TIME;
        }
        return POPULAR;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.post.GetUnifiedPostDataRequest$SortBy> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return if0.l1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.post.GetUnifiedPostDataRequest$SortBy valueOf(int i) {
        return forNumber(i);
    }
}
