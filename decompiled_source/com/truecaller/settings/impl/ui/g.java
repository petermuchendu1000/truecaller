package com.truecaller.settings.impl.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class g extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.settings.impl.ui.j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.truecaller.settings.impl.ui.j jVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = jVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.settings.impl.ui.g(this.z, barVar, 0);
            case 1:
                return new com.truecaller.settings.impl.ui.g(this.z, barVar, 1);
            default:
                return new com.truecaller.settings.impl.ui.g(this.z, barVar, 2);
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
                ef3.bar barVar = ef3.bar.a;
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.settings.impl.ui.j jVar = this.z;
                    ig3.q1 q1Var = ((sw2.b) jVar.c.getValue()).g;
                    com.truecaller.settings.impl.ui.f fVar = new com.truecaller.settings.impl.ui.f(jVar, null, 0);
                    this.y = 1;
                    if (ig3.w1.m(q1Var, fVar, this) == barVar) {
                        return barVar;
                    }
                }
                return kotlin.Unit.a;
            case 1:
                ef3.bar barVar2 = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.settings.impl.ui.j jVar2 = this.z;
                    ig3.q1 q1Var2 = ((sw2.b) jVar2.d.getValue()).g;
                    com.truecaller.settings.impl.ui.f fVar2 = new com.truecaller.settings.impl.ui.f(jVar2, null, 1);
                    this.y = 1;
                    if (ig3.w1.m(q1Var2, fVar2, this) == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar3 = ef3.bar.a;
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.settings.impl.ui.j jVar3 = this.z;
                    ig3.q1 q1Var3 = ((sw2.b) jVar3.b.getValue()).g;
                    com.truecaller.settings.impl.ui.f fVar3 = new com.truecaller.settings.impl.ui.f(jVar3, null, 2);
                    this.y = 1;
                    if (ig3.w1.m(q1Var3, fVar3, this) == barVar3) {
                        return barVar3;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
