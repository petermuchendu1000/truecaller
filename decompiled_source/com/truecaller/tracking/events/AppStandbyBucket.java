package com.truecaller.tracking.events;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum AppStandbyBucket implements ci3.l {
    ACTIVE,
    WORKING_SET,
    FREQUENT,
    RARE,
    RESTRICTED;

    public static final bi3.y0 SCHEMA$ = bx.e1.k("{\"type\":\"enum\",\"name\":\"AppStandbyBucket\",\"namespace\":\"com.truecaller.tracking.events\",\"doc\":\"Android's application Standby bucket types\",\"symbols\":[\"ACTIVE\",\"WORKING_SET\",\"FREQUENT\",\"RARE\",\"RESTRICTED\"]}");

    public static bi3.y0 getClassSchema() {
        return SCHEMA$;
    }

    public bi3.y0 getSchema() {
        return SCHEMA$;
    }
}
