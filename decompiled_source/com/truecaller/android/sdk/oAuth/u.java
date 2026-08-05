package com.truecaller.android.sdk.oAuth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class u {
    public static final com.truecaller.android.sdk.oAuth.u a;
    public static final com.truecaller.android.sdk.oAuth.u b;
    public static final com.truecaller.android.sdk.oAuth.u c;
    public static final com.truecaller.android.sdk.oAuth.u d;
    public static final /* synthetic */ com.truecaller.android.sdk.oAuth.u[] e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.truecaller.android.sdk.oAuth.u] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.truecaller.android.sdk.oAuth.u] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, com.truecaller.android.sdk.oAuth.u] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, com.truecaller.android.sdk.oAuth.u] */
    static {
        ?? r0 = new java.lang.Enum("NOT_INITIALIZED", 0);
        a = r0;
        ?? r1 = new java.lang.Enum("INITIALIZING", 1);
        b = r1;
        ?? r3 = new java.lang.Enum("READY", 2);
        c = r3;
        ?? r5 = new java.lang.Enum("FAILED", 3);
        d = r5;
        e = new com.truecaller.android.sdk.oAuth.u[]{r0, r1, r3, r5};
    }

    public static com.truecaller.android.sdk.oAuth.u valueOf(java.lang.String str) {
        return (com.truecaller.android.sdk.oAuth.u) java.lang.Enum.valueOf(com.truecaller.android.sdk.oAuth.u.class, str);
    }

    public static com.truecaller.android.sdk.oAuth.u[] values() {
        return (com.truecaller.android.sdk.oAuth.u[]) e.clone();
    }
}
