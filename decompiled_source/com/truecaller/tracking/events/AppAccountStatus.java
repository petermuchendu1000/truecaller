package com.truecaller.tracking.events;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum AppAccountStatus implements ci3.l {
    NOT_ACTIVATED,
    ACTIVATED,
    DEACTIVATED;

    public static final bi3.y0 SCHEMA$ = bx.e1.k("{\"type\":\"enum\",\"name\":\"AppAccountStatus\",\"namespace\":\"com.truecaller.tracking.events\",\"doc\":\"iOS's application account status\",\"symbols\":[\"NOT_ACTIVATED\",\"ACTIVATED\",\"DEACTIVATED\"]}");

    public static bi3.y0 getClassSchema() {
        return SCHEMA$;
    }

    public bi3.y0 getSchema() {
        return SCHEMA$;
    }
}
