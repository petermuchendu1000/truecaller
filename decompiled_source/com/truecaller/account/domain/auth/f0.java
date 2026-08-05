package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class f0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.account.domain.auth.v0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(com.truecaller.account.domain.auth.v0 v0Var, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = v0Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.account.domain.auth.f0(this.z, barVar, 0);
            case 1:
                return new com.truecaller.account.domain.auth.f0(this.z, barVar, 1);
            case 2:
                return new com.truecaller.account.domain.auth.f0(this.z, barVar, 2);
            case 3:
                return new com.truecaller.account.domain.auth.f0(this.z, barVar, 3);
            default:
                return new com.truecaller.account.domain.auth.f0(this.z, barVar, 4);
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
            case 2:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 3:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.x) {
            case 0:
                java.lang.Enum r0 = ef3.bar.a;
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.account.domain.auth.v0.b(this.z, this) == r0) {
                        return r0;
                    }
                }
                return kotlin.Unit.a;
            case 1:
                java.io.Serializable serializable = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.account.domain.auth.v0.c(this.z, "", this) == serializable) {
                        return serializable;
                    }
                }
                return kotlin.Unit.a;
            case 2:
                java.lang.Enum r02 = ef3.bar.a;
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
                    if (com.truecaller.account.domain.auth.v0.b(this.z, this) == r02) {
                        return r02;
                    }
                }
                return kotlin.Unit.a;
            case 3:
                java.lang.Enum r03 = ef3.bar.a;
                int i4 = this.y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        od.p.E(obj);
                        return obj;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                this.y = 1;
                java.lang.Enum b = com.truecaller.account.domain.auth.v0.b(this.z, this);
                if (b == r03) {
                    return r03;
                }
                return b;
            default:
                ef3.bar barVar = ef3.bar.a;
                int i5 = this.y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        od.p.E(obj);
                        return obj;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                this.y = 1;
                java.lang.Object a = com.truecaller.account.domain.auth.v0.a(this.z, this);
                if (a == barVar) {
                    return barVar;
                }
                return a;
        }
    }
}
