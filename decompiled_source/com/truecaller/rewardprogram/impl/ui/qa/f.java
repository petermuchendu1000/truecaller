package com.truecaller.rewardprogram.impl.ui.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class f extends ff3.g implements kotlin.jvm.functions.Function1 {
    public java.lang.Object A;
    public final /* synthetic */ java.lang.Object B;
    public java.lang.Object C;
    public final /* synthetic */ int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, com.truecaller.calllog.api.FilterType filterType, df3.bar barVar, java.lang.String str, xw0.k kVar) {
        super(1, barVar);
        this.x = 4;
        this.A = kVar;
        this.z = i;
        this.B = filterType;
        this.C = str;
    }

    public final df3.bar create(df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.rewardprogram.impl.ui.qa.f((com.truecaller.rewardprogram.impl.ui.qa.j) this.B, barVar);
            case 1:
                return new com.truecaller.rewardprogram.impl.ui.qa.f((fm2.j) this.A, (java.lang.String) this.B, (java.lang.String) this.C, this.z, barVar, 1);
            case 2:
                return new com.truecaller.rewardprogram.impl.ui.qa.f((gu1.l) this.A, (com.truecaller.messaging.data.types.Message) this.B, (java.lang.String) this.C, this.z, barVar, 2);
            case 3:
                return new com.truecaller.rewardprogram.impl.ui.qa.f((mk2.o) this.A, (com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type) this.B, (java.time.LocalDateTime) this.C, this.z, barVar, 3);
            default:
                return new com.truecaller.rewardprogram.impl.ui.qa.f(this.z, (com.truecaller.calllog.api.FilterType) this.B, barVar, (java.lang.String) this.C, (xw0.k) this.A);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        df3.bar barVar = (df3.bar) obj;
        switch (this.x) {
            case 0:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 2:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 3:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        int i;
        com.truecaller.rewardprogram.impl.ui.qa.j jVar;
        switch (this.x) {
            case 0:
                com.truecaller.rewardprogram.impl.ui.qa.j jVar2 = (com.truecaller.rewardprogram.impl.ui.qa.j) this.B;
                ef3.bar barVar = ef3.bar.a;
                int i2 = this.z;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.y;
                    it = (java.util.Iterator) this.C;
                    jVar = (com.truecaller.rewardprogram.impl.ui.qa.j) this.A;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    it = com.truecaller.rewardprogram.api.model.BonusTaskType.getEntries().iterator();
                    i = 0;
                    jVar = jVar2;
                }
                while (it.hasNext()) {
                    com.truecaller.rewardprogram.api.model.BonusTaskType bonusTaskType = (com.truecaller.rewardprogram.api.model.BonusTaskType) it.next();
                    d3.g gVar = jVar.e;
                    this.A = jVar;
                    this.C = it;
                    this.y = i;
                    this.z = 1;
                    if (gVar.f(bonusTaskType, this) == barVar) {
                        return barVar;
                    }
                }
                o02.baz bazVar = jVar2.f;
                this.A = null;
                this.C = null;
                this.z = 2;
                bazVar.getClass();
                if (bazVar.X(new nu1.v0(bazVar, (df3.bar) null, 15), this) == barVar) {
                    return barVar;
                }
                return kotlin.Unit.a;
            case 1:
                fm2.j jVar3 = (fm2.j) this.A;
                ef3.bar barVar2 = ef3.bar.a;
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        od.p.E(obj);
                        return obj;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                fm2.k kVar = (fm2.k) jVar3.b.get();
                java.lang.String str = (java.lang.String) this.B;
                java.lang.String str2 = (java.lang.String) this.C;
                int i4 = this.z;
                kVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "postId");
                ff0.h0 f = ff0.k0.f();
                f.c(str);
                f.a(i4);
                if (str2 != null && str2.length() != 0) {
                    f.b(str2);
                }
                ff0.k0 build = f.build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                this.y = 1;
                java.lang.Object T = yi3.bar.T(jVar3.a, new a10.k(jVar3, build, (df3.bar) null, 26), this);
                if (T == barVar2) {
                    return barVar2;
                }
                return T;
            case 2:
                com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) this.B;
                java.io.Serializable serializable = ef3.bar.a;
                int i5 = this.y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        od.p.E(obj);
                        return obj;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                gu1.l lVar = (gu1.l) this.A;
                long j = message.a;
                java.lang.String z = yp.k.z(message);
                java.lang.String str3 = (java.lang.String) this.C;
                java.util.Date o = message.e.o();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(o, "toDate(...)");
                ct1.baz bazVar2 = new ct1.baz(j, z, str3, o, message.b, this.z, false, (java.lang.String) null, 0, (java.lang.String) null, 1920);
                boolean z2 = a.bar.z(message);
                this.y = 1;
                java.io.Serializable a = gu1.l.a(lVar, bazVar2, z2, this);
                if (a == serializable) {
                    return serializable;
                }
                return a;
            case 3:
                ef3.bar barVar3 = ef3.bar.a;
                int i6 = this.y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    mk2.o oVar = (mk2.o) this.A;
                    com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type repeatableBonusTaskCompletionEntity$Type = (com.truecaller.rewardprogram.impl.data.local.db.model.RepeatableBonusTaskCompletionEntity$Type) this.B;
                    java.time.LocalDateTime localDateTime = (java.time.LocalDateTime) this.C;
                    int i7 = this.z;
                    this.y = 1;
                    if (li.qux.i(oVar, repeatableBonusTaskCompletionEntity$Type, localDateTime, i7, this) == barVar3) {
                        return barVar3;
                    }
                }
                return kotlin.Unit.a;
            default:
                xw0.k kVar2 = (xw0.k) this.A;
                ef3.bar barVar4 = ef3.bar.a;
                int i8 = this.y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    kVar2.h.a(y.o.d(this.z, "Handling reload request (targetLimit=", ")"));
                    com.truecaller.calllog.api.FilterType filterType = (com.truecaller.calllog.api.FilterType) this.B;
                    int i9 = this.z;
                    java.lang.String str4 = (java.lang.String) this.C;
                    this.y = 1;
                    if (kVar2.a(true, filterType, i9, str4, this) == barVar4) {
                        return barVar4;
                    }
                }
                return kotlin.Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.truecaller.rewardprogram.impl.ui.qa.j jVar, df3.bar barVar) {
        super(1, barVar);
        this.x = 0;
        this.B = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, df3.bar barVar, int i2) {
        super(1, barVar);
        this.x = i2;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.z = i;
    }
}
