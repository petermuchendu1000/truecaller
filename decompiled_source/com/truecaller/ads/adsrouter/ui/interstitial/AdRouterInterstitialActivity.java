package com.truecaller.ads.adsrouter.ui.interstitial;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/truecaller/ads/adsrouter/ui/interstitial/AdRouterInterstitialActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "showCloseButton", "", "timerValue", "impressionFired", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdRouterInterstitialActivity extends com.truecaller.ads.adsrouter.ui.interstitial.Hilt_AdRouterInterstitialActivity {
    public static final /* synthetic */ int e0 = 0;
    public z60.bar d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ads.adsrouter.ui.interstitial.Hilt_AdRouterInterstitialActivity
    public final void onCreate(android.os.Bundle bundle) {
        h10.a1 a1Var;
        h10.a1 a1Var2;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        yy.qux.s(this, ex2.a.a);
        java.lang.ref.WeakReference weakReference = h10.b1.m;
        h10.a1 a1Var3 = null;
        if (weakReference != null) {
            a1Var = (h10.a1) weakReference.get();
        } else {
            a1Var = null;
        }
        if (a1Var == null) {
            java.lang.ref.WeakReference weakReference2 = h10.f2.j;
            if (weakReference2 != null) {
                a1Var3 = (h10.a1) weakReference2.get();
            }
            a1Var2 = a1Var3;
        } else {
            a1Var2 = a1Var;
        }
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        com.truecaller.ads.adsrouter.ui.VideoInterstitialInput videoInterstitialInput = (com.truecaller.ads.adsrouter.ui.VideoInterstitialInput) ((android.os.Parcelable) g6.b.g(intent, "EXTRA_VIDEO_INPUT", com.truecaller.ads.adsrouter.ui.VideoInterstitialInput.class));
        android.content.Intent intent2 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        com.truecaller.ads.adsrouter.ui.BannerInterstitialAd$InterstitialInput bannerInterstitialAd$InterstitialInput = (com.truecaller.ads.adsrouter.ui.BannerInterstitialAd$InterstitialInput) ((android.os.Parcelable) g6.b.g(intent2, "EXTRA_INPUT", com.truecaller.ads.adsrouter.ui.BannerInterstitialAd$InterstitialInput.class));
        if (a1Var2 != null && (bannerInterstitialAd$InterstitialInput != null || videoInterstitialInput != null)) {
            androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(this, (android.util.AttributeSet) null, 0, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            composeView.setContent(new d3.qux(-1181862674, new l10.bar(videoInterstitialInput, this, a1Var2, bannerInterstitialAd$InterstitialInput, 0), true));
            ak.r0.i(composeView, com.truecaller.common.ui.insets.InsetType.SystemBars);
            setContentView(composeView);
            return;
        }
        finish();
    }

    public final void s0(com.truecaller.ads.adsrouter.ui.VideoAdTransport videoAdTransport, h10.a1 a1Var, z60.bar barVar, kotlin.jvm.functions.Function0 function0, v2.n nVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        nVar.b0(-1735190801);
        if (nVar.h(videoAdTransport)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (nVar.f(a1Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (nVar.f(barVar)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (nVar.h(function0)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i9 & 1, z)) {
            java.lang.Object M = nVar.M();
            java.lang.Object obj = v2.k.a;
            if (M == obj) {
                M = androidx.compose.runtime.a.j(java.lang.Boolean.FALSE);
                nVar.k0(M);
            }
            v2.t0 t0Var = (v2.t0) M;
            java.lang.Object M2 = nVar.M();
            if (M2 == obj) {
                M2 = androidx.compose.runtime.a.g(5);
                nVar.k0(M2);
            }
            v2.c2 c2Var = (v2.c2) M2;
            java.lang.Object M3 = nVar.M();
            if (M3 == obj) {
                M3 = androidx.compose.runtime.a.j(java.lang.Boolean.FALSE);
                nVar.k0(M3);
            }
            v2.t0 t0Var2 = (v2.t0) M3;
            kotlin.Unit unit = kotlin.Unit.a;
            java.lang.Object M4 = nVar.M();
            if (M4 == obj) {
                z2 = true;
                M4 = new k03.baz(c2Var, t0Var, 1);
                nVar.k0(M4);
            } else {
                z2 = true;
            }
            v2.f.d(unit, (kotlin.jvm.functions.Function1) M4, nVar);
            boolean z5 = !((java.lang.Boolean) t0Var.getValue()).booleanValue();
            java.lang.Object M5 = nVar.M();
            if (M5 == obj) {
                M5 = new jq0.qux(22);
                nVar.k0(M5);
            }
            com.moloco.sdk.internal.publisher.b0.b(48, 0, (kotlin.jvm.functions.Function0) M5, nVar, z5);
            j3.q i11 = e1.k.i(m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f), ((r2.f1) nVar.j(r2.g1.a)).n, q3.a0.b);
            h4.a1 d = m1.n.d(j3.qux.a, false);
            long j = nVar.T;
            int i12 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c = j3.bar.c(i11, nVar);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            v2.f.A(d, j4.d.g, nVar);
            v2.f.A(l, j4.d.f, nVar);
            v2.f.t(nVar, java.lang.Integer.valueOf(i12), j4.d.j);
            v2.f.x(j4.d.k, nVar);
            v2.f.A(c, j4.d.d, nVar);
            j3.q d2 = m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f);
            if ((i9 & 896) != 256) {
                z3 = false;
            } else {
                z3 = z2;
            }
            java.lang.Object M6 = nVar.M();
            if (z3 || M6 == obj) {
                M6 = new l10.baz(barVar, 0);
                nVar.k0(M6);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) M6;
            boolean h = nVar.h(videoAdTransport);
            if ((i9 & 112) != 32) {
                z4 = false;
            } else {
                z4 = z2;
            }
            boolean z6 = h | z4;
            java.lang.Object M7 = nVar.M();
            if (z6 || M7 == obj) {
                M7 = new gt0.bar(videoAdTransport, a1Var, t0Var2, 19);
                nVar.k0(M7);
            }
            k5.g.b(function1, d2, (kotlin.jvm.functions.Function1) M7, nVar, 0, 0);
            boolean booleanValue = ((java.lang.Boolean) t0Var.getValue()).booleanValue();
            j3.q d3 = u51.e.d(3, (java.lang.String) null);
            j3.g gVar = j3.qux.c;
            m1.r rVar = m1.r.a;
            b1.t1.e(booleanValue, rVar.b(d3, gVar), b1.v0.e((c1.w) null, 3), b1.v0.f((c1.w) null, 3), (java.lang.String) null, d3.a.d(518641357, new dt0.bar(11, function0), nVar), nVar, 200064, 16);
            b1.t1.e(!((java.lang.Boolean) t0Var.getValue()).booleanValue(), rVar.b(u51.e.d(3, (java.lang.String) null), gVar), b1.v0.e((c1.w) null, 3), b1.v0.f((c1.w) null, 3), (java.lang.String) null, d3.a.d(266860868, new l10.qux(c2Var, 0), nVar), nVar, 200064, 16);
            nVar.p(z2);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new a2.x(this, videoAdTransport, a1Var, barVar, function0, i, 20);
        }
    }

    public final void t0(java.lang.String str, com.truecaller.ads.adsrouter.model.Size size, h10.a1 a1Var, kotlin.jvm.functions.Function0 function0, int i, v2.n nVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "htmlContent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "maxSize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a1Var, "adListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onClose");
        nVar.b0(-1127199027);
        if (nVar.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (nVar.f(size)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i9 | i4;
        if (nVar.f(a1Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (nVar.h(function0)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6 | 24576;
        if ((i13 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i13 & 1, z)) {
            java.lang.Object M = nVar.M();
            java.lang.Object obj = v2.k.a;
            if (M == obj) {
                M = androidx.compose.runtime.a.j(java.lang.Boolean.FALSE);
                nVar.k0(M);
            }
            v2.t0 t0Var = (v2.t0) M;
            java.lang.Object M2 = nVar.M();
            if (M2 == obj) {
                M2 = androidx.compose.runtime.a.g(6);
                nVar.k0(M2);
            }
            v2.c2 c2Var = (v2.c2) M2;
            androidx.lifecycle.d0 d0Var = (androidx.lifecycle.d0) nVar.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean h = nVar.h(d0Var);
            java.lang.Object M3 = nVar.M();
            if (!h && M3 != obj) {
                i8 = 32;
            } else {
                i8 = 32;
                M3 = new gt0.bar(d0Var, c2Var, t0Var, 20);
                nVar.k0(M3);
            }
            v2.f.d(d0Var, (kotlin.jvm.functions.Function1) M3, nVar);
            int i14 = i13 & 7168;
            if (i14 == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            java.lang.Object M4 = nVar.M();
            if (z2 || M4 == obj) {
                M4 = new bo2.a(function0, t0Var, 5);
                nVar.k0(M4);
            }
            com.moloco.sdk.internal.publisher.b0.b(6, 0, (kotlin.jvm.functions.Function0) M4, nVar, true);
            j3.q d = m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f);
            h4.a1 d2 = m1.n.d(j3.qux.a, false);
            long j = nVar.T;
            int i15 = (int) (j ^ (j >>> i8));
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
            v2.f.A(d2, j4.d.g, nVar);
            v2.f.A(l, j4.d.f, nVar);
            v2.f.t(nVar, java.lang.Integer.valueOf(i15), j4.d.j);
            v2.f.x(j4.d.k, nVar);
            v2.f.A(c, j4.d.d, nVar);
            if ((i13 & 112) == i8) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i13 & 896) != 256) {
                z4 = false;
            } else {
                z4 = true;
            }
            boolean z7 = z3 | z4;
            if (i14 == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z8 = z5 | z7;
            if ((i13 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z9 = z8 | z6;
            java.lang.Object M5 = nVar.M();
            if (z9 || M5 == obj) {
                M5 = new b20.qux(size, a1Var, function0, str);
                nVar.k0(M5);
            }
            k5.g.b((kotlin.jvm.functions.Function1) M5, m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f), (kotlin.jvm.functions.Function1) null, nVar, 0, 4);
            boolean booleanValue = ((java.lang.Boolean) t0Var.getValue()).booleanValue();
            b1.a1 e = b1.v0.e((c1.w) null, 3);
            b1.b1 f = b1.v0.f((c1.w) null, 3);
            j3.q d3 = u51.e.d(3, (java.lang.String) null);
            j3.g gVar = j3.qux.c;
            m1.r rVar = m1.r.a;
            b1.t1.e(booleanValue, rVar.b(d3, gVar), e, f, (java.lang.String) null, d3.a.d(-209137745, new dt0.bar(12, function0), nVar), nVar, 200064, 16);
            b1.t1.e(!((java.lang.Boolean) t0Var.getValue()).booleanValue(), rVar.b(u51.e.d(3, (java.lang.String) null), gVar), b1.v0.e((c1.w) null, 3), b1.v0.f((c1.w) null, 3), (java.lang.String) null, d3.a.d(-1237808488, new l10.qux(c2Var, 1), nVar), nVar, 200064, 16);
            nVar.p(true);
            i7 = 6;
        } else {
            nVar.S();
            i7 = i;
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new b20.a(this, str, size, a1Var, function0, i7, i2);
        }
    }
}
