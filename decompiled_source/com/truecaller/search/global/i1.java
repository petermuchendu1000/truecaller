package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class i1 {
    public final sw2.bar a;
    public final kotlin.Lazy b;
    public volatile rw2.b c;
    public final java.lang.String[] d;
    public final kotlin.Lazy e;
    public volatile rw2.b f;

    public i1(fg3.e0 e0Var, sw2.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "appScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "permissionRequestFactory");
        this.a = barVar;
        final int i = 0;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.search.global.f1
            public final /* synthetic */ com.truecaller.search.global.i1 b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i) {
                    case 0:
                        return this.b.a.a(new java.lang.String[]{"android.permission.READ_SMS"});
                    default:
                        com.truecaller.search.global.i1 i1Var = this.b;
                        return i1Var.a.a(i1Var.d);
                }
            }
        });
        rw2.a aVar = rw2.a.a;
        this.c = aVar;
        this.d = (java.lang.String[]) kotlin.collections.t.q("android.permission.READ_SMS", new java.lang.String[]{"android.permission.SEND_SMS", "android.permission.RECEIVE_SMS"});
        final int i2 = 1;
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.search.global.f1
            public final /* synthetic */ com.truecaller.search.global.i1 b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i2) {
                    case 0:
                        return this.b.a.a(new java.lang.String[]{"android.permission.READ_SMS"});
                    default:
                        com.truecaller.search.global.i1 i1Var = this.b;
                        return i1Var.a.a(i1Var.d);
                }
            }
        });
        this.f = aVar;
        df3.bar barVar2 = null;
        fg3.h0.J(e0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.search.global.h1(this, barVar2, 0), 3);
        fg3.h0.J(e0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.search.global.h1(this, barVar2, 1), 3);
    }
}
