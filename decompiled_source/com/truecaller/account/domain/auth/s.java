package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class s {
    public static final long a;
    public static final long b;
    public static final long c;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        a = timeUnit.toMillis(2L);
        b = timeUnit.toMillis(10L);
        c = java.util.concurrent.TimeUnit.MINUTES.toMillis(10L);
    }
}
