package com.truecaller.messaging.defaultsms;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class d extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.messaging.defaultsms.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.truecaller.messaging.defaultsms.e eVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = eVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.messaging.defaultsms.d(this.z, barVar, 0);
            default:
                return new com.truecaller.messaging.defaultsms.d(this.z, barVar, 1);
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
        java.lang.Object obj2;
        java.lang.Object obj3;
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i = this.y;
                com.truecaller.messaging.defaultsms.e eVar = this.z;
                if (i != 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (eVar.s) {
                        obj2 = eVar.m.c(com.truecaller.rewardprogram.api.model.BonusTaskType.MESSAGING_APP, this);
                        if (obj2 != barVar) {
                            obj2 = kotlin.Unit.a;
                        }
                    } else {
                        obj2 = kotlin.Unit.a;
                    }
                    if (obj2 == barVar) {
                        return barVar;
                    }
                }
                com.truecaller.messaging.defaultsms.f fVar = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) eVar).a;
                if (fVar != null) {
                    ((com.truecaller.messaging.defaultsms.DefaultSmsActivity) fVar).v0();
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar2 = ef3.bar.a;
                int i2 = this.y;
                com.truecaller.messaging.defaultsms.e eVar2 = this.z;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (eVar2.s) {
                        obj3 = eVar2.m.c(com.truecaller.rewardprogram.api.model.BonusTaskType.MESSAGING_APP, this);
                        if (obj3 != barVar2) {
                            obj3 = kotlin.Unit.a;
                        }
                    } else {
                        obj3 = kotlin.Unit.a;
                    }
                    if (obj3 == barVar2) {
                        return barVar2;
                    }
                }
                com.truecaller.messaging.defaultsms.f fVar2 = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) eVar2).a;
                if (fVar2 != null) {
                    ((com.truecaller.messaging.defaultsms.DefaultSmsActivity) fVar2).v0();
                }
                return kotlin.Unit.a;
        }
    }
}
