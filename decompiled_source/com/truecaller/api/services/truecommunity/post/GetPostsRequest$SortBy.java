package com.truecaller.api.services.truecommunity.post;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum GetPostsRequest$SortBy implements com.google.protobuf.Internal.EnumLite {
    VIEWS(0),
    TIME(1),
    UNRECOGNIZED(-1);

    public static final int TIME_VALUE = 1;
    public static final int VIEWS_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.post.GetPostsRequest$SortBy> internalValueMap = new java.lang.Object();
    private final int value;

    GetPostsRequest$SortBy(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.post.GetPostsRequest$SortBy forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return TIME;
        }
        return VIEWS;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.post.GetPostsRequest$SortBy> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return if0.j0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.post.GetPostsRequest$SortBy valueOf(int i) {
        return forNumber(i);
    }
}
