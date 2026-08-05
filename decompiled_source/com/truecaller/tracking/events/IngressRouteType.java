package com.truecaller.tracking.events;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum IngressRouteType implements ci3.l {
    UNKNOWN,
    STANDARD,
    DOMAIN_FRONTING;

    public static final bi3.y0 SCHEMA$ = bx.e1.k("{\"type\":\"enum\",\"name\":\"IngressRouteType\",\"namespace\":\"com.truecaller.tracking.events\",\"doc\":\"Client ingress routing method derived from proxy headers (e.g., x-forwarded-for)\",\"symbols\":[\"UNKNOWN\",\"STANDARD\",\"DOMAIN_FRONTING\"],\"default\":\"UNKNOWN\"}");

    public static bi3.y0 getClassSchema() {
        return SCHEMA$;
    }

    public bi3.y0 getSchema() {
        return SCHEMA$;
    }
}
