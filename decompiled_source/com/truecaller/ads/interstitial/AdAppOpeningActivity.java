package com.truecaller.ads.interstitial;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/interstitial/AdAppOpeningActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdAppOpeningActivity extends com.truecaller.ads.interstitial.Hilt_AdAppOpeningActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ads.interstitial.Hilt_AdAppOpeningActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        ge0.i.m(getOnBackPressedDispatcher(), this, new e1.b2(4), 2);
        e.d.a(this, new d3.qux(-616110556, new e70.bar(this, 0), true));
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new e1.g0(this, (df3.bar) null, 6), 3);
    }

    public final void t0(m1.o1 o1Var, v2.n nVar, int i) {
        int i2;
        boolean z;
        bd3.qux quxVar;
        android.content.Intent intent;
        android.os.Bundle extras;
        int i3;
        v2.n nVar2 = nVar;
        nVar2.b0(-1668291255);
        if ((i & 6) == 0) {
            if (nVar2.f(o1Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (nVar2.P(i2 & 1, z)) {
            bd3.qux quxVar2 = (android.content.Context) nVar2.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.b);
            if (quxVar2 instanceof com.truecaller.ads.interstitial.AdAppOpeningActivity) {
                quxVar = (com.truecaller.ads.interstitial.AdAppOpeningActivity) quxVar2;
            } else {
                quxVar = null;
            }
            int i4 = 2132022314;
            if (quxVar != null && (intent = quxVar.getIntent()) != null && (extras = intent.getExtras()) != null) {
                i4 = extras.getInt("appOpeningMessage", 2132022314);
            }
            j3.q d = m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f);
            h4.a1 d2 = m1.n.d(j3.qux.a, false);
            long j = nVar2.T;
            int i5 = (int) (j ^ (j >>> 32));
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
            j4.b bVar = j4.d.g;
            v2.f.A(d2, bVar, nVar2);
            j4.b bVar2 = j4.d.f;
            v2.f.A(l, bVar2, nVar2);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i5);
            j4.b bVar3 = j4.d.j;
            v2.f.t(nVar2, valueOf, bVar3);
            j4.a aVar = j4.d.k;
            v2.f.x(aVar, nVar2);
            j4.b bVar4 = j4.d.d;
            v2.f.A(c, bVar4, nVar2);
            j3.q F = m1.c.F(m1.r.a.b(u51.e.d(3, (java.lang.String) null), j3.qux.e), o1Var);
            m1.v a = m1.t.a(m1.h.c, j3.qux.m, nVar2, 0);
            int i6 = i4;
            long j2 = nVar2.T;
            int i7 = (int) (j2 ^ (j2 >>> 32));
            v2.e1 l2 = nVar2.l();
            j3.q c2 = j3.bar.c(F, nVar2);
            nVar2.d0();
            if (nVar2.S) {
                nVar2.k(cVar);
            } else {
                nVar2.n0();
            }
            v2.f.A(a, bVar, nVar2);
            v2.f.A(l2, bVar2, nVar2);
            h0.b.Y(i7, nVar2, bVar3, nVar2, aVar);
            v2.f.A(c2, bVar4, nVar2);
            r2.l8.b(qk.b1.u(i6, nVar2), m1.c.G(li.qux.w(j3.qux.n, u51.e.d(3, (java.lang.String) null)), 10), 0L, 0L, (y4.o) null, (y4.f) null, 0L, (f5.i) null, (f5.h) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, new u4.v0(((y41.i) nVar2.j(y41.j.a)).m().a, com.moloco.sdk.internal.publisher.b0.F(16), y4.o.g, (y4.f) null, 0L, 0, 0, 0L, 16777208), nVar, 0, 0, 131068);
            nVar2 = nVar;
            nVar2.p(true);
            nVar2.p(true);
        } else {
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new a03.qux(this, o1Var, i, 15);
        }
    }
}
