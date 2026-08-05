package com.truecaller.search.v1.models;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum SearchResult$ResultCase {
    SINGLESEARCHRESULT(1),
    BULKSEARCHRESULT(2),
    RESULT_NOT_SET(0);

    private final int value;

    SearchResult$ResultCase(int i) {
        this.value = i;
    }

    public static com.truecaller.search.v1.models.SearchResult$ResultCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BULKSEARCHRESULT;
            }
            return SINGLESEARCHRESULT;
        }
        return RESULT_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.search.v1.models.SearchResult$ResultCase valueOf(int i) {
        return forNumber(i);
    }
}
