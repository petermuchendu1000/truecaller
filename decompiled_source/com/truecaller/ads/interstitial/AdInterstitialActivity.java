package com.truecaller.ads.interstitial;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/interstitial/AdInterstitialActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdInterstitialActivity extends com.truecaller.ads.interstitial.Hilt_AdInterstitialActivity {
    public static final /* synthetic */ int f0 = 0;
    public qc3.bar d0;
    public qc3.bar e0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ads.interstitial.Hilt_AdInterstitialActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        ge0.i.m(getOnBackPressedDispatcher(), this, new e1.b2(5), 2);
        e.d.a(this, new d3.qux(1105557690, new e70.a(this, 0), true));
        v0(getIntent());
    }

    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        v0(intent);
    }

    public final void t0(int i, v2.n nVar) {
        boolean z;
        v2.n nVar2;
        nVar.b0(532780800);
        int i2 = i & 1;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i2, z)) {
            java.lang.Object M = nVar.M();
            java.lang.Object obj = M;
            if (M == v2.k.a) {
                e1.b2 b2Var = new e1.b2(6);
                nVar.k0(b2Var);
                obj = b2Var;
            }
            nVar2 = nVar;
            k5.g.b((kotlin.jvm.functions.Function1) obj, (j3.q) null, (kotlin.jvm.functions.Function1) null, nVar2, 6, 6);
        } else {
            nVar2 = nVar;
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new a03.k(this, i, 3);
        }
    }

    public final void u0(m1.o1 o1Var, v2.n nVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        v2.n nVar2 = nVar;
        nVar2.b0(715152735);
        if ((i & 6) == 0) {
            if (nVar2.f(o1Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i | i5;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (nVar2.h(this)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar2.P(i2 & 1, z)) {
            j3.q d = m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f);
            h4.a1 d2 = m1.n.d(j3.qux.a, false);
            long j = nVar2.T;
            int i6 = (int) (j ^ (j >>> 32));
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i6);
            j4.b bVar3 = j4.d.j;
            v2.f.t(nVar2, valueOf, bVar3);
            j4.a aVar = j4.d.k;
            v2.f.x(aVar, nVar2);
            j4.b bVar4 = j4.d.d;
            v2.f.A(c, bVar4, nVar2);
            j3.q F = m1.c.F(m1.r.a.b(u51.e.d(3, (java.lang.String) null), j3.qux.e), o1Var);
            m1.b bVar5 = m1.h.a;
            m1.v a = m1.t.a(m1.h.i(10, j3.qux.k), j3.qux.m, nVar2, 6);
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
            t0((i2 >> 3) & 14, nVar2);
            java.lang.String u = qk.b1.u(2132021825, nVar2);
            v2.q2 q2Var = y41.j.a;
            long j3 = ((y41.i) nVar2.j(q2Var)).m().a;
            long F2 = com.moloco.sdk.internal.publisher.b0.F(16);
            y4.o oVar = y4.o.i;
            u4.v0 v0Var = new u4.v0(j3, F2, oVar, (y4.f) null, 0L, 0, 0, 0L, 16777208);
            j3.q d3 = u51.e.d(3, (java.lang.String) null);
            j3.e eVar = j3.qux.n;
            i3 = 16;
            r2.l8.b(u, li.qux.w(eVar, d3), 0L, 0L, (y4.o) null, (y4.f) null, 0L, (f5.i) null, (f5.h) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, v0Var, nVar, 0, 0, 131068);
            r2.l8.b(qk.b1.u(2132021826, nVar), li.qux.w(eVar, u51.e.d(3, (java.lang.String) null)), 0L, 0L, (y4.o) null, (y4.f) null, 0L, (f5.i) null, (f5.h) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, new u4.v0(((y41.i) nVar.j(q2Var)).m().a, com.moloco.sdk.internal.publisher.b0.F(16), oVar, (y4.f) null, 0L, 0, 0, 0L, 16777208), nVar, 0, 0, 131068);
            nVar2 = nVar;
            nVar2.p(true);
            nVar2.p(true);
        } else {
            i3 = 16;
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new a03.qux(this, o1Var, i, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(android.content.Intent intent) {
        android.os.Parcelable parcelable;
        if (intent != null) {
            parcelable = (android.os.Parcelable) g6.b.g(intent, "data", android.os.Parcelable.class);
        } else {
            parcelable = null;
        }
        if (parcelable == null) {
            parcelable = null;
        }
        if (parcelable instanceof com.truecaller.ads.interstitial.InterstitialRequest) {
            qc3.bar barVar = this.d0;
            if (barVar != null) {
                final int i = 0;
                ((e70.k) ((e70.c) barVar.get())).m(this, (com.truecaller.ads.interstitial.InterstitialRequest) parcelable, new kotlin.jvm.functions.Function0(this) { // from class: e70.qux
                    public final /* synthetic */ com.truecaller.ads.interstitial.AdInterstitialActivity b;

                    {
                        this.b = this;
                    }

                    public final java.lang.Object invoke() {
                        int i2 = i;
                        bd3.qux quxVar = this.b;
                        switch (i2) {
                            case 0:
                                int i3 = com.truecaller.ads.interstitial.AdInterstitialActivity.f0;
                                quxVar.finish();
                                return kotlin.Unit.a;
                            default:
                                int i4 = com.truecaller.ads.interstitial.AdInterstitialActivity.f0;
                                quxVar.finish();
                                return kotlin.Unit.a;
                        }
                    }
                });
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("adInterstitialManager");
            throw null;
        }
        if (parcelable instanceof com.truecaller.ads.rewarded.RewardedRequest) {
            qc3.bar barVar2 = this.e0;
            if (barVar2 != null) {
                final int i2 = 1;
                ((z90.b) ((z90.bar) barVar2.get())).d(this, (com.truecaller.ads.rewarded.RewardedRequest) parcelable, new kotlin.jvm.functions.Function0(this) { // from class: e70.qux
                    public final /* synthetic */ com.truecaller.ads.interstitial.AdInterstitialActivity b;

                    {
                        this.b = this;
                    }

                    public final java.lang.Object invoke() {
                        int i22 = i2;
                        bd3.qux quxVar = this.b;
                        switch (i22) {
                            case 0:
                                int i3 = com.truecaller.ads.interstitial.AdInterstitialActivity.f0;
                                quxVar.finish();
                                return kotlin.Unit.a;
                            default:
                                int i4 = com.truecaller.ads.interstitial.AdInterstitialActivity.f0;
                                quxVar.finish();
                                return kotlin.Unit.a;
                        }
                    }
                });
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("adRewardedAdManager");
            throw null;
        }
        finish();
    }
}
