package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class h extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ java.util.Map A;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.profile.impl.remote.p z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.truecaller.profile.impl.remote.p pVar, java.util.Map map, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = pVar;
        this.A = map;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.profile.impl.remote.h(this.z, this.A, barVar, 0);
            default:
                return new com.truecaller.profile.impl.remote.h(this.z, this.A, barVar, 1);
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e A[Catch: Exception -> 0x0017, CancellationException -> 0x001a, LOOP:0: B:10:0x0078->B:12:0x007e, LOOP_END, TryCatch #3 {CancellationException -> 0x001a, Exception -> 0x0017, blocks: (B:8:0x0013, B:9:0x005c, B:10:0x0078, B:12:0x007e, B:14:0x008f, B:16:0x0095, B:19:0x0098, B:23:0x0025, B:25:0x003a, B:29:0x009f, B:30:0x00a6, B:32:0x002c), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095 A[Catch: Exception -> 0x0017, CancellationException -> 0x001a, TryCatch #3 {CancellationException -> 0x001a, Exception -> 0x0017, blocks: (B:8:0x0013, B:9:0x005c, B:10:0x0078, B:12:0x007e, B:14:0x008f, B:16:0x0095, B:19:0x0098, B:23:0x0025, B:25:0x003a, B:29:0x009f, B:30:0x00a6, B:32:0x002c), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098 A[Catch: Exception -> 0x0017, CancellationException -> 0x001a, TryCatch #3 {CancellationException -> 0x001a, Exception -> 0x0017, blocks: (B:8:0x0013, B:9:0x005c, B:10:0x0078, B:12:0x007e, B:14:0x008f, B:16:0x0095, B:19:0x0098, B:23:0x0025, B:25:0x003a, B:29:0x009f, B:30:0x00a6, B:32:0x002c), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127 A[Catch: Exception -> 0x00c0, CancellationException -> 0x00c3, LOOP:1: B:48:0x0121->B:50:0x0127, LOOP_END, TryCatch #4 {CancellationException -> 0x00c3, Exception -> 0x00c0, blocks: (B:46:0x00bc, B:47:0x0105, B:48:0x0121, B:50:0x0127, B:52:0x0138, B:54:0x013e, B:56:0x0141, B:60:0x00ce, B:62:0x00e3, B:66:0x0148, B:67:0x014f, B:69:0x00d5), top: B:42:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e A[Catch: Exception -> 0x00c0, CancellationException -> 0x00c3, TryCatch #4 {CancellationException -> 0x00c3, Exception -> 0x00c0, blocks: (B:46:0x00bc, B:47:0x0105, B:48:0x0121, B:50:0x0127, B:52:0x0138, B:54:0x013e, B:56:0x0141, B:60:0x00ce, B:62:0x00e3, B:66:0x0148, B:67:0x014f, B:69:0x00d5), top: B:42:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141 A[Catch: Exception -> 0x00c0, CancellationException -> 0x00c3, TryCatch #4 {CancellationException -> 0x00c3, Exception -> 0x00c0, blocks: (B:46:0x00bc, B:47:0x0105, B:48:0x0121, B:50:0x0127, B:52:0x0138, B:54:0x013e, B:56:0x0141, B:60:0x00ce, B:62:0x00e3, B:66:0x0148, B:67:0x014f, B:69:0x00d5), top: B:42:0x00b6 }] */
    /* JADX WARN: Type inference failed for: r3v1, types: [gd3.k1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [gd3.k1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i = this.y;
                com.truecaller.profile.impl.remote.p pVar = this.z;
                try {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                od.p.E(obj);
                                java.util.List errorsList = ((xe0.f) obj).getErrorsList();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorsList, "getErrorsList(...)");
                                java.util.List<xe0.f2> list = errorsList;
                                arrayList = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
                                for (xe0.f2 f2Var : list) {
                                    kotlin.jvm.internal.Intrinsics.d(f2Var);
                                    arrayList.add(com.truecaller.profile.impl.remote.p.b(pVar, f2Var));
                                }
                                if (!arrayList.isEmpty()) {
                                    return pg2.n0.a;
                                }
                                return new pg2.m0(arrayList);
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                    } else {
                        od.p.E(obj);
                        com.truecaller.profile.impl.remote.t tVar = pVar.b;
                        this.y = 1;
                        obj = wi0.bar.k(tVar, this);
                        if (obj == barVar) {
                            return barVar;
                        }
                    }
                    if (obj != null) {
                        xe0.a d = xe0.c.d();
                        d.a(this.A);
                        xe0.c build = d.build();
                        kotlin.jvm.internal.Intrinsics.d(build);
                        this.y = 2;
                        obj = ((we0.h) obj).J(build, (gd3.k1) new java.lang.Object(), this);
                        if (obj == barVar) {
                            return barVar;
                        }
                        java.util.List errorsList2 = ((xe0.f) obj).getErrorsList();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorsList2, "getErrorsList(...)");
                        java.util.List<xe0.f2> list2 = errorsList2;
                        arrayList = new java.util.ArrayList(kotlin.collections.z.q(list2, 10));
                        while (r6.hasNext()) {
                        }
                        if (!arrayList.isEmpty()) {
                        }
                    } else {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                } catch (java.util.concurrent.CancellationException e) {
                    throw e;
                } catch (java.lang.Exception e2) {
                    return new pg2.l0(e2);
                }
            default:
                ef3.bar barVar2 = ef3.bar.a;
                int i2 = this.y;
                com.truecaller.profile.impl.remote.p pVar2 = this.z;
                try {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                od.p.E(obj);
                                java.util.List errorsList3 = ((xe0.k1) obj).getErrorsList();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorsList3, "getErrorsList(...)");
                                java.util.List<xe0.f2> list3 = errorsList3;
                                arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(list3, 10));
                                for (xe0.f2 f2Var2 : list3) {
                                    kotlin.jvm.internal.Intrinsics.d(f2Var2);
                                    arrayList2.add(com.truecaller.profile.impl.remote.p.b(pVar2, f2Var2));
                                }
                                if (!arrayList2.isEmpty()) {
                                    return pg2.n0.a;
                                }
                                return new pg2.m0(arrayList2);
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                    } else {
                        od.p.E(obj);
                        com.truecaller.profile.impl.remote.t tVar2 = pVar2.b;
                        this.y = 1;
                        obj = wi0.bar.k(tVar2, this);
                        if (obj == barVar2) {
                            return barVar2;
                        }
                    }
                    if (obj != null) {
                        xe0.f1 d2 = xe0.h1.d();
                        d2.a(this.A);
                        xe0.h1 build2 = d2.build();
                        kotlin.jvm.internal.Intrinsics.d(build2);
                        this.y = 2;
                        obj = ((we0.h) obj).O(build2, (gd3.k1) new java.lang.Object(), this);
                        if (obj == barVar2) {
                            return barVar2;
                        }
                        java.util.List errorsList32 = ((xe0.k1) obj).getErrorsList();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorsList32, "getErrorsList(...)");
                        java.util.List<xe0.f2> list32 = errorsList32;
                        arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(list32, 10));
                        while (r6.hasNext()) {
                        }
                        if (!arrayList2.isEmpty()) {
                        }
                    } else {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                } catch (java.util.concurrent.CancellationException e3) {
                    throw e3;
                } catch (java.lang.Exception e4) {
                    return new pg2.l0(e4);
                }
        }
    }
}
