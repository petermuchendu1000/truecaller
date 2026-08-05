package com.truecaller.tcpermissions.ui.requiredpermissions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/tcpermissions/ui/requiredpermissions/RequiredPermissionsActivityV2;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "ww2/qux", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RequiredPermissionsActivityV2 extends com.truecaller.tcpermissions.ui.requiredpermissions.Hilt_RequiredPermissionsActivityV2 {
    public static final ww2.qux g0 = new java.lang.Object();
    public u72.baz d0;
    public nc0.bar e0;
    public final androidx.lifecycle.o1 f0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ww2.u.class), new ww2.d(this, 1), new ww2.d(this, 0), new ww2.d(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object s0(com.truecaller.tcpermissions.ui.requiredpermissions.RequiredPermissionsActivityV2 requiredPermissionsActivityV2, ww2.r rVar, df3.bar barVar) {
        ww2.b bVar;
        int i;
        if (barVar instanceof ww2.b) {
            bVar = (ww2.b) barVar;
            int i2 = bVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = bVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (rVar instanceof ww2.q) {
                        java.util.List list = ((ww2.q) rVar).a;
                        bVar.z = 1;
                        fg3.j jVar = new fg3.j(1, ef3.e.b(bVar));
                        jVar.s();
                        nc0.bar barVar3 = requiredPermissionsActivityV2.e0;
                        if (barVar3 != null) {
                            jVar.u(new q93.g(new bl.e(requiredPermissionsActivityV2, barVar3, list, new b13.a(jVar, 12)).v(true), 7));
                            java.lang.Object r = jVar.r();
                            if (r == barVar2) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "frame");
                            }
                            if (r != barVar2) {
                                r = kotlin.Unit.a;
                            }
                            if (r == barVar2) {
                                return barVar2;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("analytics");
                            throw null;
                        }
                    } else {
                        if (kotlin.jvm.internal.Intrinsics.b(rVar, ww2.n.a)) {
                            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.fromParts("package", requiredPermissionsActivityV2.getPackageName(), null));
                            intent.addFlags(268435456);
                            requiredPermissionsActivityV2.startActivity(intent);
                        } else if (rVar instanceof ww2.o) {
                            if (requiredPermissionsActivityV2.d0 != null) {
                                com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType = ((ww2.o) rVar).a;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requiredPermissionsActivityV2, "context");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomBarButtonType, "tab");
                                y90.m6.Q(requiredPermissionsActivityV2, bottomBarButtonType, "requiredPermission", 8);
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("requiredPermissionsActivityOpener");
                                throw null;
                            }
                        } else if (kotlin.jvm.internal.Intrinsics.b(rVar, ww2.m.a)) {
                            requiredPermissionsActivityV2.finish();
                        } else if (kotlin.jvm.internal.Intrinsics.b(rVar, ww2.p.a)) {
                            u72.baz bazVar = requiredPermissionsActivityV2.d0;
                            if (bazVar != null) {
                                bazVar.a(requiredPermissionsActivityV2);
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("requiredPermissionsActivityOpener");
                                throw null;
                            }
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                        return kotlin.Unit.a;
                    }
                }
                requiredPermissionsActivityV2.t0().q(ww2.k.a);
                return kotlin.Unit.a;
            }
        }
        bVar = new ww2.b(requiredPermissionsActivityV2, barVar);
        java.lang.Object obj2 = bVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = bVar.z;
        if (i == 0) {
        }
        requiredPermissionsActivityV2.t0().q(ww2.k.a);
        return kotlin.Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.tcpermissions.ui.requiredpermissions.Hilt_RequiredPermissionsActivityV2
    public final void onCreate(android.os.Bundle bundle) {
        vw2.k kVar;
        com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.s(this, ex2.a.a);
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            kVar = (vw2.k) g6.b.h(intent, "config", vw2.k.class);
        } else {
            kVar = null;
        }
        android.content.Intent intent2 = getIntent();
        if (intent2 == null || (bottomBarButtonType = (com.truecaller.bottombar.BottomBarButtonType) g6.b.h(intent2, "tab", com.truecaller.bottombar.BottomBarButtonType.class)) == null) {
            bottomBarButtonType = com.truecaller.bottombar.BottomBarButtonType.CALLS;
        }
        t0().q(new ww2.h(kVar, bottomBarButtonType));
        e.d.a(this, new d3.qux(-13064104, new ww2.bar(this, 0), true));
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ww2.c(this, null, 1), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPause() {
        super/*android.app.Activity*/.onPause();
        t0().q(ww2.i.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super/*android.app.Activity*/.onResume();
        t0().q(ww2.j.a);
    }

    public final ww2.u t0() {
        return (ww2.u) this.f0.getValue();
    }
}
