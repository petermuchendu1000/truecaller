package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class g0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ java.lang.String A;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.search.global.h0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(com.truecaller.search.global.h0 h0Var, java.lang.String str, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = h0Var;
        this.A = str;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.search.global.g0(this.z, this.A, barVar, 0);
            default:
                return new com.truecaller.search.global.g0(this.z, this.A, barVar, 1);
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
        kotlin.collections.h0 h0Var;
        kotlin.collections.h0 h0Var2;
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i = this.y;
                com.truecaller.search.global.h0 h0Var3 = this.z;
                if (i != 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    p02.z3 z3Var = h0Var3.C;
                    this.y = 1;
                    y12.o0 o0Var = z3Var.c;
                    obj = fg3.h0.W(o0Var.d, new xd3.h(this.A, o0Var, new java.lang.Integer(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_EVENT_ID_ERROR_VALUE), (df3.bar) null, 13), this);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                a22.b bVar = (a22.a) obj;
                if (bVar == null) {
                    h0Var = kotlin.collections.h0.a;
                } else {
                    kotlin.collections.h0 arrayList = new java.util.ArrayList(bVar.getCount());
                    while (bVar.moveToNext()) {
                        a22.b bVar2 = bVar;
                        java.util.ArrayList arrayList2 = kotlin.collections.h0.a;
                        java.lang.String string = bVar2.getString(bVar2.b);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        java.util.List g0 = kotlin.text.StringsKt.g0(string, new java.lang.String[]{","}, 0, 6);
                        java.lang.String string2 = bVar2.getString(bVar2.c);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        java.util.List g02 = kotlin.text.StringsKt.g0(string2, new java.lang.String[]{","}, 0, 6);
                        if (g0.size() == g02.size()) {
                            java.util.ArrayList O0 = kotlin.collections.CollectionsKt.O0(g0, g02);
                            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.z.q(O0, 10));
                            java.util.Iterator it = O0.iterator();
                            while (it.hasNext()) {
                                kotlin.Pair pair = (kotlin.Pair) it.next();
                                s81.baz bazVar = new s81.baz(3);
                                bazVar.m = (java.lang.String) pair.a;
                                bazVar.e = (java.lang.String) pair.b;
                                arrayList3.add(bazVar.a());
                            }
                            arrayList2 = arrayList3;
                        }
                        c22.baz bazVar2 = new c22.baz();
                        bazVar2.a = bVar2.getLong(bVar2.a);
                        bazVar2.i = bVar2.getString(bVar2.d);
                        bazVar2.G = new org.joda.time.DateTime(bVar2.getLong(bVar2.e));
                        bazVar2.e = bVar2.getInt(bVar2.f);
                        bazVar2.f = bVar2.getString(bVar2.g);
                        bazVar2.d = bVar2.getInt(bVar2.h);
                        bazVar2.y = bVar2.getInt(bVar2.i);
                        java.util.ArrayList arrayList4 = bazVar2.l;
                        arrayList4.clear();
                        arrayList4.addAll(arrayList2);
                        bazVar2.h = new org.joda.time.DateTime(bVar2.getLong(bVar2.j));
                        com.truecaller.messaging.data.types.Conversation conversation = new com.truecaller.messaging.data.types.Conversation(bazVar2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(conversation, "build(...)");
                        arrayList.add(conversation);
                    }
                    bVar.close();
                    h0Var = arrayList;
                }
                h0Var3.n2(h0Var);
                h0Var3.l0 = false;
                if (h0Var3.m0) {
                    h0Var3.m0 = false;
                    h0Var3.z2(h0Var3.e0);
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar2 = ef3.bar.a;
                int i2 = this.y;
                com.truecaller.search.global.h0 h0Var4 = this.z;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    p02.z3 z3Var2 = h0Var4.C;
                    boolean d = h0Var4.U.d();
                    this.y = 1;
                    y12.o0 o0Var2 = z3Var2.c;
                    obj = fg3.h0.W(o0Var2.d, new ms1.c(o0Var2, this.A, d, (df3.bar) null, 22), this);
                    if (obj == barVar2) {
                        return barVar2;
                    }
                }
                a22.k kVar = (a22.h) obj;
                if (kVar == null) {
                    h0Var2 = kotlin.collections.h0.a;
                } else {
                    kotlin.collections.h0 arrayList5 = new java.util.ArrayList(kVar.getCount());
                    while (kVar.moveToNext()) {
                        com.truecaller.messaging.data.types.Message h = kVar.h();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getMessage(...)");
                        arrayList5.add(h);
                    }
                    kVar.close();
                    h0Var2 = arrayList5;
                }
                fg3.h0.J(h0Var4, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.search.global.e0(h0Var4, h0Var2, null, 0), 3);
                if (h0Var4.I.i.a.a("featureInsightsSearchSmartCards", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                    fg3.h0.J(h0Var4, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.search.global.e0(h0Var4, h0Var2, null, 2), 3);
                }
                h0Var4.o2(h0Var2);
                h0Var4.n0 = false;
                if (h0Var4.o0) {
                    h0Var4.o0 = false;
                    h0Var4.C2(h0Var4.e0);
                }
                return kotlin.Unit.a;
        }
    }
}
