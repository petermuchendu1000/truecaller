package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class j0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ java.lang.String A;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.account.domain.auth.v0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(com.truecaller.account.domain.auth.v0 v0Var, java.lang.String str, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = v0Var;
        this.A = str;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.account.domain.auth.j0(this.z, this.A, barVar, 0);
            case 1:
                return new com.truecaller.account.domain.auth.j0(this.z, this.A, barVar, 1);
            default:
                return new com.truecaller.account.domain.auth.j0(this.z, this.A, barVar, 2);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.x) {
            case 0:
                java.io.Serializable serializable = ef3.bar.a;
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        od.p.E(obj);
                        return obj;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                this.y = 1;
                java.io.Serializable c = com.truecaller.account.domain.auth.v0.c(this.z, this.A, this);
                if (c == serializable) {
                    return serializable;
                }
                return c;
            case 1:
                java.io.Serializable serializable2 = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                        return obj;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                this.y = 1;
                java.io.Serializable c2 = com.truecaller.account.domain.auth.v0.c(this.z, this.A, this);
                if (c2 == serializable2) {
                    return serializable2;
                }
                return c2;
            default:
                java.io.Serializable serializable3 = ef3.bar.a;
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.account.domain.auth.v0.c(this.z, this.A, this) == serializable3) {
                        return serializable3;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
