package com.truecaller.messaging.messaginglist.v2.secondary;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/truecaller/messaging/messaginglist/v2/secondary/ConversationSecondaryListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lw22/z;", "listState", "", "progressState", "emptyState", "", "selectedConversations", "toolBarTitle", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ConversationSecondaryListActivity extends com.truecaller.messaging.messaginglist.v2.secondary.Hilt_ConversationSecondaryListActivity {
    public static final /* synthetic */ int g0 = 0;
    public n.baz e0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(y22.l.class), new y22.h(this, 1), new y22.h(this, 0), new y22.h(this, 2));
    public final wf.h f0 = new wf.h(this);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.messaginglist.v2.secondary.Hilt_ConversationSecondaryListActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        requestWindowFeature(10);
        super.onCreate(bundle);
        ig3.h2 h2Var = x0().k;
        java.lang.String stringExtra = getIntent().getStringExtra("param_type");
        if (stringExtra == null) {
            stringExtra = "archived";
        }
        h2Var.getClass();
        h2Var.p((java.lang.Object) null, stringExtra);
        x0().f.e(this, new az1.qux(new xd3.w0(this, 16)));
        e.d.a(this, new d3.qux(831089932, new y22.e(this, 0), true));
        x0().p();
    }

    public final void onStart() {
        super.onStart();
        y22.l x0 = x0();
        ((android.content.ContentResolver) x0.e.get()).registerContentObserver(h81.a.p(), true, x0.n);
    }

    public final void onStop() {
        super.onStop();
        y22.l x0 = x0();
        ((android.content.ContentResolver) x0.e.get()).unregisterContentObserver(x0.n);
    }

    public final void t0(int i, v2.n nVar) {
        boolean z;
        nVar.b0(1014300113);
        int i2 = i & 1;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i2, z)) {
            j3.q d = m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f);
            m1.v a = m1.t.a(m1.h.e, j3.qux.n, nVar, 54);
            long j = nVar.T;
            int i3 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c = j3.bar.c(d, nVar);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            v2.f.A(a, j4.d.g, nVar);
            v2.f.A(l, j4.d.f, nVar);
            v2.f.t(nVar, java.lang.Integer.valueOf(i3), j4.d.j);
            v2.f.x(j4.d.k, nVar);
            v2.f.A(c, j4.d.d, nVar);
            j51.b bVar = j51.b.k;
            v2.q2 q2Var = y41.j.a;
            bVar.q("", (j3.q) null, 2131233384, (java.lang.String) null, (h4.n) null, new q3.j(((y41.i) nVar.j(q2Var)).m().c, 5), nVar, 6, 26);
            j51.b.q.E("", (j3.q) null, qk.b1.u(2132019475, nVar), ((i51.a) nVar.j(i51.bar.a)).c, ((y41.i) nVar.j(q2Var)).m().c, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar, 6, 0, 4066);
            nVar.p(true);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new y22.e(this, i, 2);
        }
    }

    public final void u0(j3.q qVar, v2.n nVar, int i) {
        int i2;
        boolean z;
        kotlin.jvm.functions.Function0 function0;
        kotlin.jvm.functions.Function0 function02;
        nVar.b0(-1238843568);
        if (nVar.f(qVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i3 & 1, z)) {
            nVar.U();
            if ((i & 1) != 0 && !nVar.z()) {
                nVar.S();
            }
            nVar.q();
            float f = 16;
            j3.q G = m1.c.G(qVar, f);
            m1.v a = m1.t.a(m1.h.c, j3.qux.m, nVar, 0);
            long j = nVar.T;
            int i4 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c = j3.bar.c(G, nVar);
            j4.e.K9.getClass();
            kotlin.jvm.functions.Function0 function03 = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(function03);
            } else {
                nVar.n0();
            }
            j4.b bVar = j4.d.g;
            v2.f.A(a, bVar, nVar);
            j4.b bVar2 = j4.d.f;
            v2.f.A(l, bVar2, nVar);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i4);
            j4.b bVar3 = j4.d.j;
            v2.f.t(nVar, valueOf, bVar3);
            j4.a aVar = j4.d.k;
            v2.f.x(aVar, nVar);
            j4.b bVar4 = j4.d.d;
            v2.f.A(c, bVar4, nVar);
            j51.b bVar5 = j51.b.f;
            j3.q e = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
            e1.s a2 = e1.k.a(yp.k.v(nVar).g().e, 1);
            float f2 = 0;
            java.lang.Object M = nVar.M();
            java.lang.Object obj = M;
            if (M == v2.k.a) {
                xn2.k2 k2Var = new xn2.k2(14);
                nVar.k0(k2Var);
                obj = k2Var;
            }
            bVar5.k("", e, (q3.q0) null, 0L, 0L, a2, f2, (k1.h) null, false, (kotlin.jvm.functions.Function0) obj, y22.bar.b, nVar, 806879238, 6, 412);
            ye0.k.h(f, nVar, 6);
            j51.b bVar6 = j51.b.q;
            bVar6.E("", (j3.q) null, qk.b1.u(2132022687, nVar), yp.k.E(nVar).m, yp.k.v(nVar).m().a, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar, 6, 0, 4066);
            float f3 = 8;
            ye0.k.h(f3, nVar, 6);
            j3.f fVar = j3.qux.k;
            m1.b bVar7 = m1.h.a;
            m1.y1 a3 = m1.x1.a(bVar7, fVar, nVar, 48);
            long j2 = nVar.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            v2.e1 l2 = nVar.l();
            j3.n nVar2 = j3.n.a;
            j3.q c2 = j3.bar.c(nVar2, nVar);
            nVar.d0();
            if (nVar.S) {
                function0 = function03;
                nVar.k(function0);
            } else {
                function0 = function03;
                nVar.n0();
            }
            v2.f.A(a3, bVar, nVar);
            v2.f.A(l2, bVar2, nVar);
            h0.b.Y(i5, nVar, bVar3, nVar, aVar);
            v2.f.A(c2, bVar4, nVar);
            j51.b bVar8 = j51.b.k;
            kotlin.jvm.functions.Function0 function04 = function0;
            bVar8.q("", (j3.q) null, 2131232845, (java.lang.String) null, (h4.n) null, (q3.j) null, nVar, 6, 58);
            ye0.k.b(f3, nVar, 6);
            bVar6.E("", (j3.q) null, qk.b1.u(2132022689, nVar), yp.k.E(nVar).c, yp.k.v(nVar).m().b, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar, 6, 0, 4066);
            nVar.p(true);
            ye0.k.h(f3, nVar, 6);
            m1.y1 a4 = m1.x1.a(bVar7, fVar, nVar, 48);
            long j3 = nVar.T;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            v2.e1 l3 = nVar.l();
            j3.q c3 = j3.bar.c(nVar2, nVar);
            nVar.d0();
            if (nVar.S) {
                function02 = function04;
                nVar.k(function02);
            } else {
                function02 = function04;
                nVar.n0();
            }
            v2.f.A(a4, bVar, nVar);
            v2.f.A(l3, bVar2, nVar);
            h0.b.Y(i6, nVar, bVar3, nVar, aVar);
            v2.f.A(c3, bVar4, nVar);
            kotlin.jvm.functions.Function0 function05 = function02;
            bVar8.q("", (j3.q) null, 2131232844, (java.lang.String) null, (h4.n) null, (q3.j) null, nVar, 6, 58);
            ye0.k.b(f3, nVar, 6);
            bVar6.E("", (j3.q) null, qk.b1.u(2132022690, nVar), yp.k.E(nVar).c, yp.k.v(nVar).m().b, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar, 6, 0, 4066);
            nVar.p(true);
            ye0.k.h(f3, nVar, 6);
            m1.y1 a5 = m1.x1.a(bVar7, fVar, nVar, 48);
            long j4 = nVar.T;
            int i7 = (int) (j4 ^ (j4 >>> 32));
            v2.e1 l4 = nVar.l();
            j3.q c4 = j3.bar.c(nVar2, nVar);
            nVar.d0();
            if (nVar.S) {
                nVar.k(function05);
            } else {
                nVar.n0();
            }
            v2.f.A(a5, bVar, nVar);
            v2.f.A(l4, bVar2, nVar);
            h0.b.Y(i7, nVar, bVar3, nVar, aVar);
            v2.f.A(c4, bVar4, nVar);
            bVar8.q("", (j3.q) null, 2131232847, (java.lang.String) null, (h4.n) null, (q3.j) null, nVar, 6, 58);
            ye0.k.b(f3, nVar, 6);
            bVar6.E("", (j3.q) null, qk.b1.u(2132022688, nVar), yp.k.E(nVar).c, yp.k.v(nVar).m().b, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar, 6, 0, 4066);
            nVar.p(true);
            nVar.p(true);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new xy1.a1(this, qVar, i, 2);
        }
    }

    public final void v0(int i, v2.n nVar) {
        boolean z;
        nVar.b0(710907781);
        int i2 = i & 1;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i2, z)) {
            j3.q d = m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f);
            m1.v a = m1.t.a(m1.h.e, j3.qux.n, nVar, 54);
            long j = nVar.T;
            int i3 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c = j3.bar.c(d, nVar);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            v2.f.A(a, j4.d.g, nVar);
            v2.f.A(l, j4.d.f, nVar);
            v2.f.t(nVar, java.lang.Integer.valueOf(i3), j4.d.j);
            v2.f.x(j4.d.k, nVar);
            v2.f.A(c, j4.d.d, nVar);
            float f = 56;
            r2.d5.a(m1.c2.f(m1.c2.t(u51.e.d(3, (java.lang.String) null), f), f), ((y41.i) nVar.j(y41.j.a)).g().m, 2, 0L, 0, 0.0f, nVar, 384, 56);
            nVar.p(true);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new y22.e(this, i, 1);
        }
    }

    public final void w0(int i, v2.n nVar) {
        int i2;
        boolean z;
        int i3;
        nVar.b0(681181016);
        if (nVar.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        boolean z2 = false;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i4 & 1, z)) {
            v2.t0 b = androidx.compose.runtime.a.b(x0().g, nVar, 0);
            v2.t0 b2 = androidx.compose.runtime.a.b(x0().h, nVar, 0);
            v2.t0 b3 = androidx.compose.runtime.a.b(x0().i, nVar, 0);
            v2.t0 b4 = androidx.compose.runtime.a.b(x0().m, nVar, 0);
            v2.t0 b5 = androidx.compose.runtime.a.b(x0().j, nVar, 0);
            if (((java.lang.Number) b4.getValue()).intValue() == 0) {
                z2 = true;
            }
            long j = ((y41.i) nVar.j(y41.j.a)).g().a;
            java.util.WeakHashMap weakHashMap = m1.p2.w;
            m1.baz bazVar = m1.b.f(nVar).g;
            d3.qux d = d3.a.d(-173748204, new z22.a(z2, this, b5), nVar);
            d3.qux d2 = d3.a.d(-1526723991, new ki1.f(z2, this, b, b3, b2), nVar);
            i3 = 4;
            r2.n5.a((j3.q) null, d, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, 0, j, 0L, bazVar, d2, nVar, 805306416, 189);
        } else {
            i3 = 4;
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new y22.e(this, i, i3);
        }
    }

    public final y22.l x0() {
        return (y22.l) this.d0.getValue();
    }
}
