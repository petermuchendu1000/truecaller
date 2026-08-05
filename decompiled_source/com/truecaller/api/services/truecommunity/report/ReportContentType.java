package com.truecaller.api.services.truecommunity.report;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum ReportContentType implements com.google.protobuf.Internal.EnumLite {
    REPORT_POST(0),
    REPORT_COMMENT(1),
    UNRECOGNIZED(-1);

    public static final int REPORT_COMMENT_VALUE = 1;
    public static final int REPORT_POST_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.report.ReportContentType> internalValueMap = new java.lang.Object();
    private final int value;

    ReportContentType(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.truecommunity.report.ReportContentType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return REPORT_COMMENT;
        }
        return REPORT_POST;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.truecommunity.report.ReportContentType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return kf0.e.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.truecommunity.report.ReportContentType valueOf(int i) {
        return forNumber(i);
    }
}
