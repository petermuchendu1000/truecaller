package com.truecaller.messaging.messaginglist.v2.threelevelspam;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/truecaller/messaging/messaginglist/v2/threelevelspam/MessagingThreeLevelSpamActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "a32/bar", "Lcom/truecaller/messaging/MessagingLevel;", "level", "Lcom/truecaller/messaging/messaginglist/v2/threelevelspam/MessagingLevelLottieAnimation;", "lottieInfo", "", "enableConfirmButton", "showInfo", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessagingThreeLevelSpamActivity extends com.truecaller.messaging.messaginglist.v2.threelevelspam.Hilt_MessagingThreeLevelSpamActivity {
    public static final /* synthetic */ int j0 = 0;
    public java.lang.String e0;
    public a32.x f0;
    public qw2.a0 g0;
    public android.content.Context h0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(a32.a0.class), new a32.f(this, 1), new a32.f(this, 0), new a32.f(this, 2));
    public final g.baz i0 = registerForActivityResult(new androidx.fragment.app.a1(6), new a32.a(this, 0));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.messaginglist.v2.threelevelspam.Hilt_MessagingThreeLevelSpamActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new a10.n(this, (df3.bar) null, 1), 3);
        e.d.a(this, new d3.qux(1915857189, new a32.qux(this, 0), true));
    }

    public final void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        a32.a0 v0 = v0();
        v0.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(v0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new a32.z(v0, null, 0), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super.onStart();
        a32.x xVar = this.f0;
        df3.bar barVar = null;
        if (xVar != null) {
            if (!xVar.b()) {
                finish();
            }
            this.e0 = getIntent().getStringExtra("flow_context");
            a32.a0 v0 = v0();
            java.lang.String str = this.e0;
            v0.getClass();
            fg3.h0.J(androidx.lifecycle.g1.l(v0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new a32.d(v0, str, barVar, 1), 3);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("threeLevelSpamHelper");
        throw null;
    }

    public final void t0(a32.a0 a0Var, v2.n nVar, int i) {
        int i2;
        int i3;
        boolean z;
        nVar.b0(-910248243);
        if (nVar.h(a0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (nVar.h(this)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i5 & 1, z)) {
            nVar.U();
            if ((i & 1) != 0 && !nVar.z()) {
                nVar.S();
            }
            nVar.q();
            r2.n5.a((j3.q) null, d3.a.d(634961553, new a32.qux(this, 2), nVar), (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, 0, ((y41.i) nVar.j(y41.j.a)).g().a, 0L, (m1.o2) null, d3.a.d(-399209060, new a32.b(0, this, a0Var), nVar), nVar, 805306416, 445);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new a03.i(this, a0Var, i, 4);
        }
    }

    public final void u0(m1.o1 o1Var, a32.a0 a0Var, v2.n nVar, int i) {
        int i2;
        boolean z;
        com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingThreeLevelSpamActivity messagingThreeLevelSpamActivity;
        java.lang.Object obj;
        java.lang.String str;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        v2.n nVar2 = nVar;
        nVar2.b0(-1674260832);
        if ((i & 6) == 0) {
            if (nVar2.f(o1Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (nVar2.h(a0Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (nVar2.h(this)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (nVar2.P(i2 & 1, z)) {
            nVar2.U();
            if ((i & 1) != 0 && !nVar2.z()) {
                nVar2.S();
            }
            nVar2.q();
            v2.t0 b = androidx.compose.runtime.a.b(a0Var.l, nVar2, 0);
            v2.t0 b2 = androidx.compose.runtime.a.b(a0Var.m, nVar2, 0);
            v2.t0 b3 = androidx.compose.runtime.a.b(a0Var.n, nVar2, 0);
            v2.t0 b4 = androidx.compose.runtime.a.b(a0Var.o, nVar2, 0);
            e1.f2 z3 = e1.k.z(6, 0, nVar2);
            j3.q d = m1.c2.d(m1.c.F(u51.e.b(j3.n.a, "threeLevelsOfSpamBlock", true), o1Var), 1.0f);
            m1.b bVar = m1.h.c;
            j3.e eVar = j3.qux.m;
            m1.v a = m1.t.a(bVar, eVar, nVar2, 0);
            long j = nVar2.T;
            int i7 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar2.l();
            j3.q c = j3.bar.c(d, nVar2);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar2.d0();
            if (nVar2.S) {
                nVar2.k(cVar);
            } else {
                nVar2.n0();
            }
            j4.b bVar2 = j4.d.g;
            v2.f.A(a, bVar2, nVar2);
            j4.b bVar3 = j4.d.f;
            v2.f.A(l, bVar3, nVar2);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i7);
            j4.b bVar4 = j4.d.j;
            v2.f.t(nVar2, valueOf, bVar4);
            j4.a aVar = j4.d.k;
            v2.f.x(aVar, nVar2);
            j4.b bVar5 = j4.d.d;
            v2.f.A(c, bVar5, nVar2);
            j3.q D = e1.k.D(u51.e.d(3, (java.lang.String) null), z3, false, 14);
            if (1.0f <= 0.0d) {
                n1.bar.a("invalid weight; must be greater than zero");
            }
            j3.q s = os0.bar.s(1.0f, D, true);
            j3.g gVar = j3.qux.a;
            h4.a1 d2 = m1.n.d(gVar, false);
            long j2 = nVar2.T;
            int i8 = (int) (j2 ^ (j2 >>> 32));
            v2.e1 l2 = nVar2.l();
            j3.q c2 = j3.bar.c(s, nVar2);
            nVar2.d0();
            if (nVar2.S) {
                nVar2.k(cVar);
            } else {
                nVar2.n0();
            }
            v2.f.A(d2, bVar2, nVar2);
            v2.f.A(l2, bVar3, nVar2);
            h0.b.Y(i8, nVar2, bVar4, nVar2, aVar);
            v2.f.A(c2, bVar5, nVar2);
            com.truecaller.messaging.MessagingLevel messagingLevel = (com.truecaller.messaging.MessagingLevel) b.getValue();
            com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation messagingLevelLottieAnimation = (com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation) b2.getValue();
            boolean h = nVar2.h(a0Var);
            java.lang.Object M = nVar2.M();
            java.lang.Object obj2 = v2.k.a;
            if (h || M == obj2) {
                M = new a2.a0(a0Var, 2);
                nVar2.k0(M);
            }
            a32.w.a.c(messagingLevel, messagingLevelLottieAnimation, (kotlin.jvm.functions.Function1) M, nVar2, 3072);
            nVar2.p(true);
            j3.q d3 = u51.e.d(3, (java.lang.String) null);
            v2.q2 q2Var = y41.j.a;
            j3.q i9 = e1.k.i(d3, ((y41.i) nVar2.j(q2Var)).g().a, q3.a0.b);
            m1.v a2 = m1.t.a(bVar, eVar, nVar2, 0);
            long j3 = nVar2.T;
            int i10 = (int) (j3 ^ (j3 >>> 32));
            v2.e1 l3 = nVar2.l();
            j3.q c3 = j3.bar.c(i9, nVar2);
            nVar2.d0();
            if (nVar2.S) {
                nVar2.k(cVar);
            } else {
                nVar2.n0();
            }
            v2.f.A(a2, bVar2, nVar2);
            v2.f.A(l3, bVar3, nVar2);
            h0.b.Y(i10, nVar2, bVar4, nVar2, aVar);
            v2.f.A(c3, bVar5, nVar2);
            if (((java.lang.Boolean) b4.getValue()).booleanValue()) {
                nVar2.Z(-1872291761);
                float f = 16;
                j3.q K = m1.c.K(u51.e.d(2, "dmaBanner"), f, f, f, 0.0f, 8);
                h4.a1 d4 = m1.n.d(gVar, false);
                long j4 = nVar2.T;
                int i11 = (int) (j4 ^ (j4 >>> 32));
                v2.e1 l4 = nVar2.l();
                j3.q c4 = j3.bar.c(K, nVar2);
                nVar2.d0();
                if (nVar2.S) {
                    nVar2.k(cVar);
                } else {
                    nVar2.n0();
                }
                v2.f.A(d4, bVar2, nVar2);
                v2.f.A(l4, bVar3, nVar2);
                h0.b.Y(i11, nVar2, bVar4, nVar2, aVar);
                v2.f.A(c4, bVar5, nVar2);
                j3.q G = m1.c.G(m1.c2.e(e1.k.i(u51.e.d(3, (java.lang.String) null), ((y41.i) nVar2.j(q2Var)).j().a().a, u1.b.b(12)), 1.0f), f);
                m1.y1 a3 = m1.x1.a(m1.h.a, j3.qux.k, nVar2, 48);
                long j5 = nVar2.T;
                int i13 = (int) (j5 ^ (j5 >>> 32));
                v2.e1 l5 = nVar2.l();
                j3.q c5 = j3.bar.c(G, nVar2);
                nVar2.d0();
                if (nVar2.S) {
                    nVar2.k(cVar);
                } else {
                    nVar2.n0();
                }
                v2.f.A(a3, bVar2, nVar2);
                v2.f.A(l5, bVar3, nVar2);
                h0.b.Y(i13, nVar2, bVar4, nVar2, aVar);
                v2.f.A(c5, bVar5, nVar2);
                str = null;
                r2.d3.b(df0.qux.r(), "Information", m1.c2.o(u51.e.d(2, "dmaBannerIcon"), f), ((y41.i) nVar2.j(q2Var)).g().m, nVar2, 48, 0);
                obj = obj2;
                z2 = true;
                i3 = 0;
                j51.b.q.E("", m1.c.K(u51.e.d(2, "dmaBannerText"), f, 0.0f, 0.0f, 0.0f, 14), qk.b1.u(2132023481, nVar2), ((i51.a) nVar2.j(i51.bar.a)).c, ((c51.h) ((y41.i) nVar2.j(q2Var)).j().f.getValue()).b, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar2, 6, 0, 4064);
                nVar2 = nVar2;
                qb.qux.x(nVar2, true, true, false);
            } else {
                obj = obj2;
                str = null;
                z2 = true;
                i3 = 0;
                nVar2.Z(-1881373738);
                nVar2.p(false);
            }
            j51.b bVar6 = j51.b.e;
            java.lang.String u = qk.b1.u(2132023480, nVar2);
            j3.q e = m1.c2.e(m1.c.G(u51.e.d(3, str), 16), 1.0f);
            boolean booleanValue = ((java.lang.Boolean) b3.getValue()).booleanValue();
            com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary buttonStylePrimary = com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary.PRIMARY;
            com.truecaller.compose.ui.components.TrueButton.ButtonSize buttonSize = com.truecaller.compose.ui.components.TrueButton.ButtonSize.LARGE;
            boolean h2 = nVar2.h(a0Var);
            java.lang.Object M2 = nVar2.M();
            if (h2 || M2 == obj) {
                M2 = new a32.c(a0Var, i3);
                nVar2.k0(M2);
            }
            bVar6.v("buttonConfirm", e, buttonStylePrimary, buttonSize, (m1.o1) null, booleanValue, u, (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) M2, nVar, 3462, 0, 912);
            nVar2 = nVar;
            nVar2.p(z2);
            nVar2.p(z2);
            com.truecaller.messaging.MessagingLevel messagingLevel2 = (com.truecaller.messaging.MessagingLevel) b.getValue();
            messagingThreeLevelSpamActivity = this;
            boolean h3 = nVar2.h(messagingThreeLevelSpamActivity) | nVar2.f(z3);
            java.lang.Object M3 = nVar2.M();
            if (h3 || M3 == obj) {
                M3 = new a32.d(messagingThreeLevelSpamActivity, z3, str, i3);
                nVar2.k0(M3);
            }
            v2.f.h(messagingLevel2, (kotlin.jvm.functions.Function2) M3, nVar2);
        } else {
            messagingThreeLevelSpamActivity = this;
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new a2.p(messagingThreeLevelSpamActivity, o1Var, a0Var, i, 2);
        }
    }

    public final a32.a0 v0() {
        return (a32.a0) this.d0.getValue();
    }
}
