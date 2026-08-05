package com.truecaller.push;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class f {
    public static final com.truecaller.push.PushIdDto a(com.truecaller.push.qux quxVar) {
        java.lang.String str = quxVar.a;
        int i = com.truecaller.push.b.a[quxVar.b.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                i2 = 13;
            } else {
                throw new java.lang.RuntimeException();
            }
        }
        return new com.truecaller.push.PushIdDto(str, i2);
    }

    public static final wj3.a b(com.truecaller.push.PushIdDto pushIdDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushIdDto, "token");
        return ((com.truecaller.push.e) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.PUSHID, com.truecaller.push.e.class)).a(pushIdDto);
    }
}
