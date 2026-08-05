package com.truecaller.tracking.events;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum AppBackgroundRefreshStatus implements ci3.l {
    DENIED,
    AVAILABLE,
    NOT_AVAILABLE;

    public static final bi3.y0 SCHEMA$ = bx.e1.k("{\"type\":\"enum\",\"name\":\"AppBackgroundRefreshStatus\",\"namespace\":\"com.truecaller.tracking.events\",\"doc\":\"iOS's application background refresh status\",\"symbols\":[\"DENIED\",\"AVAILABLE\",\"NOT_AVAILABLE\"]}");

    public static bi3.y0 getClassSchema() {
        return SCHEMA$;
    }

    public bi3.y0 getSchema() {
        return SCHEMA$;
    }
}
