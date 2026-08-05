package com.truecaller.rewardprogram.impl.ui.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class g extends ff3.g implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ hl2.qux A;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.rewardprogram.impl.ui.qa.j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.truecaller.rewardprogram.impl.ui.qa.j jVar, hl2.qux quxVar, df3.bar barVar, int i) {
        super(1, barVar);
        this.x = i;
        this.z = jVar;
        this.A = quxVar;
    }

    public final df3.bar create(df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.rewardprogram.impl.ui.qa.g(this.z, this.A, barVar, 0);
            default:
                return new com.truecaller.rewardprogram.impl.ui.qa.g(this.z, this.A, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        df3.bar barVar = (df3.bar) obj;
        switch (this.x) {
            case 0:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i = this.y;
                com.truecaller.rewardprogram.impl.ui.qa.j jVar = this.z;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    d3.g gVar = jVar.e;
                    com.truecaller.rewardprogram.api.model.BonusTaskType bonusTaskType = ((hl2.baz) this.A).a;
                    this.y = 1;
                    if (gVar.f(bonusTaskType, this) == barVar) {
                        return barVar;
                    }
                }
                o02.baz bazVar = jVar.f;
                this.y = 2;
                bazVar.getClass();
                if (bazVar.X(new nu1.v0(bazVar, (df3.bar) null, 15), this) == barVar) {
                    return barVar;
                }
                return kotlin.Unit.a;
            default:
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
                    d3.g gVar2 = this.z.e;
                    com.truecaller.rewardprogram.api.model.BonusTaskType bonusTaskType2 = ((hl2.baz) this.A).a;
                    this.y = 1;
                    mk2.a aVar = ((lk2.n) gVar2.a).d;
                    java.lang.Object q = mc.f.q(aVar.a, false, true, new jl1.i(28, aVar, o82.a.G(bonusTaskType2)), this);
                    if (q != barVar2) {
                        q = kotlin.Unit.a;
                    }
                    if (q != barVar2) {
                        q = kotlin.Unit.a;
                    }
                    if (q != barVar2) {
                        q = kotlin.Unit.a;
                    }
                    if (q == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
