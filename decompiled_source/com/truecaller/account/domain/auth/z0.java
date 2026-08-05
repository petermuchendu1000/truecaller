package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class z0 {
    public final long a;
    public final long b;
    public final java.util.Map c;
    public final java.util.Map d;

    public z0(long j, long j2, java.util.Map map, java.util.Map map2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "endpointConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "tokens");
        this.a = j;
        this.b = j2;
        this.c = map;
        this.d = map2;
    }

    public static com.truecaller.account.domain.auth.z0 a(com.truecaller.account.domain.auth.z0 z0Var, long j, java.util.Map map, int i) {
        long j2 = z0Var.a;
        if ((i & 2) != 0) {
            j = z0Var.b;
        }
        long j3 = j;
        java.util.Map map2 = z0Var.c;
        if ((i & 8) != 0) {
            map = z0Var.d;
        }
        java.util.Map map3 = map;
        z0Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "endpointConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "tokens");
        return new com.truecaller.account.domain.auth.z0(j2, j3, map2, map3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.account.domain.auth.z0)) {
            return false;
        }
        com.truecaller.account.domain.auth.z0 z0Var = (com.truecaller.account.domain.auth.z0) obj;
        return this.a == z0Var.a && this.b == z0Var.b && kotlin.jvm.internal.Intrinsics.b(this.c, z0Var.c) && kotlin.jvm.internal.Intrinsics.b(this.d, z0Var.d);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.d.hashCode() + k9.d.l(this.c, ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder T = h0.b.T(this.a, "Config(createdAt=", ", expiresAt=");
        T.append(this.b);
        T.append(", endpointConfig=");
        T.append(this.c);
        T.append(", tokens=");
        T.append(this.d);
        T.append(")");
        return T.toString();
    }

    public /* synthetic */ z0() {
        this(0L, 0L, kotlin.collections.r0.f(), kotlin.collections.r0.f());
    }
}
