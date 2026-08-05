package com.truecaller.background_work;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/truecaller/background_work/StandaloneActionWorker;", "Lcom/truecaller/background_work/TrackedCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lnc0/bar;", "analytics", "Lqo1/m;", "platformFeaturesInventory", "Luf0/p;", "workActionFactory", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lnc0/bar;Lqo1/m;Luf0/p;)V", "i71/g", "background-work_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class StandaloneActionWorker extends com.truecaller.background_work.TrackedCoroutineWorker {
    public final nc0.bar a;
    public final qo1.m b;
    public final uf0.baz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandaloneActionWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull nc0.bar barVar, @org.jetbrains.annotations.NotNull qo1.m mVar, @org.jetbrains.annotations.NotNull uf0.p pVar) {
        super(context, workerParameters);
        nd.g gVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "platformFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "workActionFactory");
        this.a = barVar;
        this.b = mVar;
        java.util.Map c = getInputData().c();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : c.entrySet()) {
            if (kotlin.text.y.w((java.lang.String) entry.getKey(), "c_", false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap = linkedHashMap.isEmpty() ? null : linkedHashMap;
        if (linkedHashMap != null) {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.q0.b(linkedHashMap.size()));
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getKey();
                linkedHashMap2.put(kotlin.text.StringsKt.l0(str, "c_", str), entry2.getValue());
            }
            nd.b0 b0Var = new nd.b0();
            b0Var.c(linkedHashMap2);
            gVar = b0Var.a();
        } else {
            gVar = null;
        }
        java.lang.String e = getInputData().e("standalone_action_name");
        this.c = e != null ? ((uf0.q) pVar).a(e, gVar) : null;
    }

    @Override // com.truecaller.background_work.TrackedCoroutineWorker
    /* renamed from: a, reason: from getter */
    public final nc0.bar getA() {
        return this.a;
    }

    @Override // com.truecaller.background_work.TrackedCoroutineWorker
    /* renamed from: b, reason: from getter */
    public final qo1.m getB() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.truecaller.background_work.TrackedCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(df3.bar barVar) {
        uf0.i iVar;
        int i;
        boolean z;
        java.lang.Boolean bool;
        if (barVar instanceof uf0.i) {
            iVar = (uf0.i) barVar;
            int i2 = iVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = iVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = iVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    uf0.baz bazVar = this.c;
                    if (bazVar != null) {
                        iVar.z = 1;
                        if (bazVar instanceof uf0.qux) {
                            obj = ((uf0.qux) bazVar).b(iVar);
                            if (obj != barVar2) {
                                obj = (java.lang.Boolean) obj;
                            }
                        } else if (bazVar instanceof uf0.o) {
                            obj = java.lang.Boolean.valueOf(((uf0.o) bazVar).b());
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                        if (obj == barVar2) {
                            return barVar2;
                        }
                    }
                    z = false;
                    return java.lang.Boolean.valueOf(z);
                }
                bool = (java.lang.Boolean) obj;
                if (bool != null) {
                    z = bool.booleanValue();
                    return java.lang.Boolean.valueOf(z);
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            }
        }
        iVar = new uf0.i(this, (ff3.qux) barVar);
        java.lang.Object obj2 = iVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = iVar.z;
        if (i == 0) {
        }
        bool = (java.lang.Boolean) obj2;
        if (bool != null) {
        }
        z = false;
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (r6 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.truecaller.background_work.TrackedCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(df3.bar barVar) {
        uf0.j jVar;
        int i;
        nd.t u;
        java.lang.String str;
        if (barVar instanceof uf0.j) {
            jVar = (uf0.j) barVar;
            int i2 = jVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = jVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = jVar.z;
                uf0.baz bazVar = this.c;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (bazVar != null) {
                        jVar.z = 1;
                        if (bazVar instanceof uf0.qux) {
                            obj = ((uf0.qux) bazVar).a(jVar);
                            if (obj != barVar2) {
                                obj = (nd.t) obj;
                            }
                        } else if (bazVar instanceof uf0.o) {
                            obj = ((uf0.o) bazVar).a();
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                        if (obj == barVar2) {
                            return barVar2;
                        }
                    }
                    u = wi0.bar.u("failure(...)");
                    if (bazVar != null) {
                        str = bazVar.getName();
                    } else {
                        str = null;
                    }
                    java.lang.String str2 = "WorkAction " + str + " finished with result " + f40.d0.i(u);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                    w91.a.a(new java.lang.Object[]{str2});
                    return u;
                }
                u = (nd.t) obj;
            }
        }
        jVar = new uf0.j(this, (ff3.qux) barVar);
        java.lang.Object obj2 = jVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = jVar.z;
        uf0.baz bazVar2 = this.c;
        if (i == 0) {
        }
        u = (nd.t) obj2;
    }
}
