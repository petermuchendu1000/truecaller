package com.truecaller.account.domain.auth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b0 {
    public static final com.truecaller.account.domain.auth.b0 a;
    public static final com.truecaller.account.domain.auth.b0 b;
    public static final com.truecaller.account.domain.auth.b0 c;
    public static final /* synthetic */ com.truecaller.account.domain.auth.b0[] d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.truecaller.account.domain.auth.b0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.truecaller.account.domain.auth.b0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, com.truecaller.account.domain.auth.b0] */
    static {
        ?? r0 = new java.lang.Enum("STATE_REFRESH_NOT_NEEDED", 0);
        a = r0;
        ?? r1 = new java.lang.Enum("STATE_REFRESHED", 1);
        b = r1;
        ?? r3 = new java.lang.Enum("STATE_REFRESH_FAILED", 2);
        c = r3;
        com.truecaller.account.domain.auth.b0[] b0VarArr = {r0, r1, r3};
        d = b0VarArr;
        ge0.i.u(b0VarArr);
    }

    public static com.truecaller.account.domain.auth.b0 valueOf(java.lang.String str) {
        return (com.truecaller.account.domain.auth.b0) java.lang.Enum.valueOf(com.truecaller.account.domain.auth.b0.class, str);
    }

    public static com.truecaller.account.domain.auth.b0[] values() {
        return (com.truecaller.account.domain.auth.b0[]) d.clone();
    }

    public final com.truecaller.account.domain.auth.AuthTokensState d() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return com.truecaller.account.domain.auth.AuthTokensState.STATE_EXPIRED;
                }
                throw new java.lang.RuntimeException();
            }
            return com.truecaller.account.domain.auth.AuthTokensState.STATE_EXPIRED_AND_REFRESHED;
        }
        return com.truecaller.account.domain.auth.AuthTokensState.STATE_VALID;
    }
}
