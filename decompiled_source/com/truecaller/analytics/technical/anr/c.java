package com.truecaller.analytics.technical.anr;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class c {
    public final boolean equals(java.lang.Object obj) {
        return this == obj || (obj instanceof com.truecaller.analytics.technical.anr.c);
    }

    public final int hashCode() {
        int i = (int) 1000;
        return ((qb.qux.i(i, 31, i, 31) + ((int) 20000)) * 31) + ((int) 600000);
    }

    public final java.lang.String toString() {
        return "MainThreadBoggingReporterConfig(detectionThresholdMs=1000, bustedThresholdMs=1000, detectionBackoffMs=20000, reportingBackoffMs=600000)";
    }
}
