package com.truecaller.tracking.events;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum AppSubscriptionType implements ci3.l {
    FREE,
    PREMIUM,
    GOLD;

    public static final bi3.y0 SCHEMA$ = bx.e1.k("{\"type\":\"enum\",\"name\":\"AppSubscriptionType\",\"namespace\":\"com.truecaller.tracking.events\",\"doc\":\"iOS's application subscription type\",\"symbols\":[\"FREE\",\"PREMIUM\",\"GOLD\"]}");

    public static bi3.y0 getClassSchema() {
        return SCHEMA$;
    }

    public bi3.y0 getSchema() {
        return SCHEMA$;
    }
}
