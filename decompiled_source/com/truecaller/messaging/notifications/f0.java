package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class f0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.messaging.notifications.g0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(com.truecaller.messaging.notifications.g0 g0Var, int i, df3.bar barVar, int i2) {
        super(2, barVar);
        this.x = i2;
        this.z = g0Var;
        this.A = i;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.messaging.notifications.f0(this.z, this.A, barVar, 0);
            default:
                return new com.truecaller.messaging.notifications.f0(this.z, this.A, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        od.p.E(obj);
                        return obj;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                k41.baz bazVar = (k41.baz) this.z.e.get();
                this.y = 1;
                java.lang.Object W = fg3.h0.W(bazVar.m0, new k41.bar(bazVar, this.A, (df3.bar) null, 0), this);
                if (W == barVar) {
                    return barVar;
                }
                return W;
            default:
                ef3.bar barVar2 = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                        return obj;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                k41.baz bazVar2 = (k41.baz) this.z.e.get();
                this.y = 1;
                java.lang.Object W2 = fg3.h0.W(bazVar2.m0, new k41.bar(bazVar2, this.A, (df3.bar) null, 0), this);
                if (W2 == barVar2) {
                    return barVar2;
                }
                return W2;
        }
    }
}
