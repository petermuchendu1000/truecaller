package com.truecaller.blockingsurvey.impl.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/truecaller/blockingsurvey/impl/ui/BlockingSurveyActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lck0/k;", "uiState", "Lck0/j;", "configuration", "", "isVisible", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BlockingSurveyActivity extends com.truecaller.blockingsurvey.impl.ui.Hilt_BlockingSurveyActivity {
    public static final /* synthetic */ int e0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ck0.u.class), new ck0.n(this, 1), new ck0.n(this, 0), new ck0.n(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object t0(com.truecaller.blockingsurvey.impl.ui.BlockingSurveyActivity blockingSurveyActivity, ck0.i iVar, ff3.qux quxVar) {
        ck0.m mVar;
        int i;
        com.truecaller.blocking.ui.BlockResult blockResult;
        blockingSurveyActivity.getClass();
        if (quxVar instanceof ck0.m) {
            mVar = (ck0.m) quxVar;
            int i2 = mVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = mVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = mVar.A;
                if (i == 0) {
                    if (i == 1) {
                        iVar = mVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    mVar.x = iVar;
                    mVar.A = 1;
                    if (fg3.h0.r(500L, mVar) == barVar) {
                        return barVar;
                    }
                }
                android.content.Intent intent = new android.content.Intent();
                if (iVar == null) {
                    blockResult = iVar.a();
                } else {
                    blockResult = null;
                }
                intent.putExtra("result", blockResult);
                blockingSurveyActivity.setResult(-1, intent);
                blockingSurveyActivity.finish();
                return kotlin.Unit.a;
            }
        }
        mVar = new ck0.m(blockingSurveyActivity, quxVar);
        java.lang.Object obj2 = mVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = mVar.A;
        if (i == 0) {
        }
        android.content.Intent intent2 = new android.content.Intent();
        if (iVar == null) {
        }
        intent2.putExtra("result", blockResult);
        blockingSurveyActivity.setResult(-1, intent2);
        blockingSurveyActivity.finish();
        return kotlin.Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.blockingsurvey.impl.ui.Hilt_BlockingSurveyActivity
    public final void onCreate(android.os.Bundle bundle) {
        d.k0 k0Var;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        d.j0 j0Var = d.j0.k;
        d.k0 k0Var2 = new d.k0(0, 0, 2, j0Var);
        dx2.bar barVar = dx2.bar.a;
        if (dx2.bar.d()) {
            k0Var = new d.k0(0, 0, 2, j0Var);
        } else {
            k0Var = new d.k0(0, 0, 1, d.j0.l);
        }
        d.m.a(this, k0Var2, k0Var);
        ge0.i.m(getOnBackPressedDispatcher(), this, new c2.a(this, 10), 2);
        e.d.a(this, new d3.qux(1539190657, new ck0.l(this, 0, (byte) 0), true));
    }

    public final void s0(int i, v2.n nVar) {
        int i2;
        boolean z;
        nVar.b0(-2082460048);
        if (nVar.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i3 & 1, z)) {
            v2.t0 r = mf0.o.r(u0().j, nVar, 0, 7);
            v2.t0 r2 = mf0.o.r(u0().l, nVar, 0, 7);
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object M = nVar.M();
            java.lang.Object obj = v2.k.a;
            if (M == obj) {
                M = new c90.bar(11);
                nVar.k0(M);
            }
            v2.t0 t0Var = (v2.t0) g3.g.e(objArr, (kotlin.jvm.functions.Function0) M, nVar, 48);
            java.lang.Object M2 = nVar.M();
            if (M2 == obj) {
                M2 = v2.f.o(kotlin.coroutines.d.a, nVar);
                nVar.k0(M2);
            }
            fg3.e0 e0Var = (fg3.e0) M2;
            kotlin.Unit unit = kotlin.Unit.a;
            boolean h = nVar.h(this);
            java.lang.Object M3 = nVar.M();
            if (h || M3 == obj) {
                M3 = new ad2.c(this, (df3.bar) null, 19);
                nVar.k0(M3);
            }
            v2.f.h(unit, (kotlin.jvm.functions.Function2) M3, nVar);
            gj.m mVar = ((ck0.k) r.getValue()).a;
            boolean f = nVar.f(t0Var) | nVar.f(r);
            java.lang.Object M4 = nVar.M();
            if (f || M4 == obj) {
                M4 = new by1.baz(r, t0Var, (df3.bar) null, 16);
                nVar.k0(M4);
            }
            v2.f.h(mVar, (kotlin.jvm.functions.Function2) M4, nVar);
            ck0.i iVar = ((ck0.k) r.getValue()).b;
            boolean f2 = nVar.f(r) | nVar.h(this);
            java.lang.Object M5 = nVar.M();
            if (f2 || M5 == obj) {
                M5 = new c73.z(this, r, (df3.bar) null, 14);
                nVar.k0(M5);
            }
            v2.f.h(iVar, (kotlin.jvm.functions.Function2) M5, nVar);
            gj.m mVar2 = ((ck0.k) r.getValue()).a;
            ck0.j jVar = (ck0.j) r2.getValue();
            boolean booleanValue = ((java.lang.Boolean) t0Var.getValue()).booleanValue();
            boolean z2 = ((ck0.k) r.getValue()).b instanceof ck0.h;
            ck0.u u0 = u0();
            boolean h2 = nVar.h(u0);
            java.lang.Object M6 = nVar.M();
            if (h2 || M6 == obj) {
                c03.f fVar = new c03.f(0, u0, ck0.u.class, "closeSurvey", "closeSurvey()V", 0, 6);
                nVar.k0(fVar);
                M6 = fVar;
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.reflect.KFunction) M6;
            ck0.u u02 = u0();
            boolean h3 = nVar.h(u02);
            java.lang.Object M7 = nVar.M();
            if (h3 || M7 == obj) {
                c03.f fVar2 = new c03.f(0, u02, ck0.u.class, "finishSurvey", "finishSurvey()V", 0, 7);
                nVar.k0(fVar2);
                M7 = fVar2;
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.reflect.KFunction) M7;
            boolean h4 = nVar.h(e0Var) | nVar.f(t0Var) | nVar.h(this) | nVar.f(r);
            java.lang.Object M8 = nVar.M();
            if (h4 || M8 == obj) {
                bx0.bar barVar = new bx0.bar(e0Var, this, t0Var, r, 2);
                nVar.k0(barVar);
                M8 = barVar;
            }
            qe0.i1.a(mVar2, jVar, booleanValue, z2, function0, function02, (kotlin.jvm.functions.Function0) M8, nVar, 0);
        } else {
            nVar.S();
        }
        v2.h1 r3 = nVar.r();
        if (r3 != null) {
            r3.d = new ck0.l(this, i);
        }
    }

    public final ck0.u u0() {
        return (ck0.u) this.d0.getValue();
    }
}
