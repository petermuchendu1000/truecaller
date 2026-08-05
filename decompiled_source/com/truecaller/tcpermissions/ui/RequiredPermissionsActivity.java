package com.truecaller.tcpermissions.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/tcpermissions/ui/RequiredPermissionsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "vw2/a", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RequiredPermissionsActivity extends com.truecaller.tcpermissions.ui.Hilt_RequiredPermissionsActivity {
    public static final vw2.a q0 = new java.lang.Object();
    public u03.z d0;
    public qw2.a0 e0;
    public nc0.bar f0;
    public qc3.bar g0;
    public kotlin.coroutines.CoroutineContext h0;
    public kotlin.coroutines.CoroutineContext i0;
    public final kotlin.Lazy j0;
    public final kotlin.Lazy k0;
    public final kotlin.Lazy l0;
    public boolean n0;
    public boolean o0;
    public final ig3.v1 m0 = ig3.w1.b(1, 0, (hg3.bar) null, 6);
    public java.util.Map p0 = kotlin.collections.r0.f();

    public RequiredPermissionsActivity() {
        final int i = 0;
        this.j0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: vw2.qux
            public final /* synthetic */ com.truecaller.tcpermissions.ui.RequiredPermissionsActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, com.truecaller.tcpermissions.ui.RequiredPermissionsActivity, android.app.Activity] */
            public final java.lang.Object invoke() {
                com.truecaller.bottombar.BottomBarButtonType h;
                int i2 = i;
                ?? r2 = this.b;
                switch (i2) {
                    case 0:
                        vw2.a aVar = com.truecaller.tcpermissions.ui.RequiredPermissionsActivity.q0;
                        android.content.Intent intent = r2.getIntent();
                        if (intent == null) {
                            return null;
                        }
                        return (vw2.k) g6.b.h(intent, "config", vw2.k.class);
                    case 1:
                        vw2.a aVar2 = com.truecaller.tcpermissions.ui.RequiredPermissionsActivity.q0;
                        android.content.Intent intent2 = r2.getIntent();
                        if (intent2 == null || (h = g6.b.h(intent2, "tab", com.truecaller.bottombar.BottomBarButtonType.class)) == null) {
                            return com.truecaller.bottombar.BottomBarButtonType.CALLS;
                        }
                        return h;
                    case 2:
                        vw2.a aVar3 = com.truecaller.tcpermissions.ui.RequiredPermissionsActivity.q0;
                        kotlin.Pair pair = new kotlin.Pair(com.truecaller.tcpermissions.PermissionGroup.CALL_LOG, kotlin.collections.v.h0(((qw2.b0) r2.w0()).e()));
                        kotlin.Pair pair2 = new kotlin.Pair(com.truecaller.tcpermissions.PermissionGroup.CALLS, kotlin.collections.v.h0(kotlin.collections.t.r(((qw2.b0) r2.w0()).f(), ((qw2.b0) r2.w0()).d())));
                        com.truecaller.tcpermissions.PermissionGroup permissionGroup = com.truecaller.tcpermissions.PermissionGroup.CONTACTS;
                        r2.w0();
                        return kotlin.collections.r0.i(new kotlin.Pair[]{pair, pair2, new kotlin.Pair(permissionGroup, kotlin.collections.v.h0(new java.lang.String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}))});
                    default:
                        vw2.a aVar4 = com.truecaller.tcpermissions.ui.RequiredPermissionsActivity.q0;
                        qc3.bar barVar = r2.g0;
                        if (barVar != null) {
                            ((u72.baz) barVar.get()).a((android.content.Context) r2);
                            return kotlin.Unit.a;
                        }
                        kotlin.jvm.internal.Intrinsics.n("requiredPermissionsActivityOpener");
                        throw null;
                }
            }
        });
        final int i2 = 1;
        this.k0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: vw2.qux
            public final /* synthetic */ com.truecaller.tcpermissions.ui.RequiredPermissionsActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, com.truecaller.tcpermissions.ui.RequiredPermissionsActivity, android.app.Activity] */
            public final java.lang.Object invoke() {
                com.truecaller.bottombar.BottomBarButtonType h;
                int i22 = i2;
                ?? r2 = this.b;
                switch (i22) {
                    case 0:
                        vw2.a aVar = com.truecaller.tcpermissions.ui.RequiredPermissionsActivity.q0;
                        android.content.Intent intent = r2.getIntent();
                        if (intent == null) {
                            return null;
                        }
                        return (vw2.k) g6.b.h(intent, "config", vw2.k.class);
                    case 1:
                        vw2.a aVar2 = com.truecaller.tcpermissions.ui.RequiredPermissionsActivity.q0;
                        android.content.Intent intent2 = r2.getIntent();
                        if (intent2 == null || (h = g6.b.h(intent2, "tab", com.truecaller.bottombar.BottomBarButtonType.class)) == null) {
                            return com.truecaller.bottombar.BottomBarButtonType.CALLS;
                        }
                        return h;
                    case 2:
                        vw2.a aVar3 = com.truecaller.tcpermissions.ui.RequiredPermissionsActivity.q0;
                        kotlin.Pair pair = new kotlin.Pair(com.truecaller.tcpermissions.PermissionGroup.CALL_LOG, kotlin.collections.v.h0(((qw2.b0) r2.w0()).e()));
                        kotlin.Pair pair2 = new kotlin.Pair(com.truecaller.tcpermissions.PermissionGroup.CALLS, kotlin.collections.v.h0(kotlin.collections.t.r(((qw2.b0) r2.w0()).f(), ((qw2.b0) r2.w0()).d())));
                        com.truecaller.tcpermissions.PermissionGroup permissionGroup = com.truecaller.tcpermissions.PermissionGroup.CONTACTS;
                        r2.w0();
                        return kotlin.collections.r0.i(new kotlin.Pair[]{pair, pair2, new kotlin.Pair(permissionGroup, kotlin.collections.v.h0(new java.lang.String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}))});
                    default:
                        vw2.a aVar4 = com.truecaller.tcpermissions.ui.RequiredPermissionsActivity.q0;
                        qc3.bar barVar = r2.g0;
                        if (barVar != null) {
                            ((u72.baz) barVar.get()).a((android.content.Context) r2);
                            return kotlin.Unit.a;
                        }
                        kotlin.jvm.internal.Intrinsics.n("requiredPermissionsActivityOpener");
                        throw null;
                }
            }
        });
        final int i3 = 2;
        this.l0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: vw2.qux
            public final /* synthetic */ com.truecaller.tcpermissions.ui.RequiredPermissionsActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, com.truecaller.tcpermissions.ui.RequiredPermissionsActivity, android.app.Activity] */
            public final java.lang.Object invoke() {
                com.truecaller.bottombar.BottomBarButtonType h;
                int i22 = i3;
                ?? r2 = this.b;
                switch (i22) {
                    case 0:
                        vw2.a aVar = com.truecaller.tcpermissions.ui.RequiredPermissionsActivity.q0;
                        android.content.Intent intent = r2.getIntent();
                        if (intent == null) {
                            return null;
                        }
                        return (vw2.k) g6.b.h(intent, "config", vw2.k.class);
                    case 1:
                        vw2.a aVar2 = com.truecaller.tcpermissions.ui.RequiredPermissionsActivity.q0;
                        android.content.Intent intent2 = r2.getIntent();
                        if (intent2 == null || (h = g6.b.h(intent2, "tab", com.truecaller.bottombar.BottomBarButtonType.class)) == null) {
                            return com.truecaller.bottombar.BottomBarButtonType.CALLS;
                        }
                        return h;
                    case 2:
                        vw2.a aVar3 = com.truecaller.tcpermissions.ui.RequiredPermissionsActivity.q0;
                        kotlin.Pair pair = new kotlin.Pair(com.truecaller.tcpermissions.PermissionGroup.CALL_LOG, kotlin.collections.v.h0(((qw2.b0) r2.w0()).e()));
                        kotlin.Pair pair2 = new kotlin.Pair(com.truecaller.tcpermissions.PermissionGroup.CALLS, kotlin.collections.v.h0(kotlin.collections.t.r(((qw2.b0) r2.w0()).f(), ((qw2.b0) r2.w0()).d())));
                        com.truecaller.tcpermissions.PermissionGroup permissionGroup = com.truecaller.tcpermissions.PermissionGroup.CONTACTS;
                        r2.w0();
                        return kotlin.collections.r0.i(new kotlin.Pair[]{pair, pair2, new kotlin.Pair(permissionGroup, kotlin.collections.v.h0(new java.lang.String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}))});
                    default:
                        vw2.a aVar4 = com.truecaller.tcpermissions.ui.RequiredPermissionsActivity.q0;
                        qc3.bar barVar = r2.g0;
                        if (barVar != null) {
                            ((u72.baz) barVar.get()).a((android.content.Context) r2);
                            return kotlin.Unit.a;
                        }
                        kotlin.jvm.internal.Intrinsics.n("requiredPermissionsActivityOpener");
                        throw null;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object t0(com.truecaller.tcpermissions.ui.RequiredPermissionsActivity requiredPermissionsActivity, ff3.qux quxVar) {
        vw2.c cVar;
        int i;
        boolean z;
        android.app.Activity activity;
        java.util.LinkedHashMap linkedHashMap;
        java.util.Iterator it;
        kotlin.Lazy lazy = requiredPermissionsActivity.l0;
        if (quxVar instanceof vw2.c) {
            cVar = (vw2.c) quxVar;
            int i2 = cVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = cVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = cVar.A;
                if (i == 0) {
                    if (i == 1) {
                        linkedHashMap = cVar.x;
                        od.p.E(obj);
                        activity = requiredPermissionsActivity;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents.Clicked.logWith(requiredPermissionsActivity.v0());
                    qx2.d3 h = qx2.hg.h();
                    h.m("requiredPermission");
                    h.l("clickedGrantPermission");
                    qx2.hg h2 = h.h();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "build(...)");
                    j71.g.K(h2, requiredPermissionsActivity.v0());
                    java.util.LinkedHashMap u0 = requiredPermissionsActivity.u0();
                    java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry entry : u0.entrySet()) {
                        if (!((java.lang.Boolean) entry.getValue()).booleanValue()) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (linkedHashMap2.isEmpty()) {
                        requiredPermissionsActivity.finish();
                        qc3.bar barVar2 = requiredPermissionsActivity.g0;
                        if (barVar2 != null) {
                            u72.baz bazVar = (u72.baz) barVar2.get();
                            com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType = (com.truecaller.bottombar.BottomBarButtonType) requiredPermissionsActivity.k0.getValue();
                            bazVar.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requiredPermissionsActivity, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomBarButtonType, "tab");
                            y90.m6.Q(requiredPermissionsActivity, bottomBarButtonType, "requiredPermission", 8);
                            return kotlin.Unit.a;
                        }
                        kotlin.jvm.internal.Intrinsics.n("requiredPermissionsActivityOpener");
                        throw null;
                    }
                    java.util.Set keySet = linkedHashMap2.keySet();
                    if (!(keySet instanceof java.util.Collection) || !keySet.isEmpty()) {
                        java.util.Iterator it3 = keySet.iterator();
                        loop2: while (it3.hasNext()) {
                            java.util.List list = (java.util.List) ((java.util.Map) lazy.getValue()).get((com.truecaller.tcpermissions.PermissionGroup) it3.next());
                            if (list != null) {
                                java.util.List list2 = list;
                                if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                                    java.util.Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        if (requiredPermissionsActivity.shouldShowRequestPermissionRationale((java.lang.String) it4.next())) {
                                            z = true;
                                            break loop2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    requiredPermissionsActivity.n0 = z;
                    java.util.List G0 = kotlin.collections.CollectionsKt.G0(linkedHashMap2.keySet());
                    cVar.x = linkedHashMap2;
                    cVar.A = 1;
                    kotlin.coroutines.CoroutineContext coroutineContext = requiredPermissionsActivity.i0;
                    if (coroutineContext != null) {
                        activity = requiredPermissionsActivity;
                        if (fg3.h0.W(coroutineContext, new tx0.s(activity, requiredPermissionsActivity, G0, (df3.bar) null, 9), cVar) == barVar) {
                            return barVar;
                        }
                        linkedHashMap = linkedHashMap2;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("uiCoroutineContext");
                        throw null;
                    }
                }
                java.util.Set keySet2 = linkedHashMap.keySet();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                it = keySet2.iterator();
                while (it.hasNext()) {
                    kotlin.collections.h0 h0Var = (java.util.List) ((java.util.Map) lazy.getValue()).get((com.truecaller.tcpermissions.PermissionGroup) it.next());
                    if (h0Var == null) {
                        h0Var = kotlin.collections.h0.a;
                    }
                    kotlin.collections.d0.v(arrayList, (java.lang.Iterable) h0Var);
                }
                activity.requestPermissions((java.lang.String[]) arrayList.toArray(new java.lang.String[0]), 1);
                return kotlin.Unit.a;
            }
        }
        cVar = new vw2.c(requiredPermissionsActivity, quxVar);
        java.lang.Object obj2 = cVar.y;
        ef3.bar barVar3 = ef3.bar.a;
        i = cVar.A;
        if (i == 0) {
        }
        java.util.Set keySet22 = linkedHashMap.keySet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        it = keySet22.iterator();
        while (it.hasNext()) {
        }
        activity.requestPermissions((java.lang.String[]) arrayList2.toArray(new java.lang.String[0]), 1);
        return kotlin.Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [qx2.r, hi3.e] */
    @Override // com.truecaller.tcpermissions.ui.Hilt_RequiredPermissionsActivity
    public final void onCreate(android.os.Bundle bundle) {
        vw2.k kVar;
        java.util.Map map;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        if (bundle != null) {
            this.n0 = bundle.getBoolean("STATE_REQUEST_HAS_RATIONALE_PERMISSIONS", false);
            this.o0 = bundle.getBoolean("STATE_REQUEST_PERMISSION_FROM_SETTINGS", false);
            java.io.Serializable serializable = bundle.getSerializable("PERMISSION_STATE_BEFORE_RESUME");
            if (serializable instanceof java.util.Map) {
                map = (java.util.Map) serializable;
            } else {
                map = null;
            }
            if (map == null) {
                map = u0();
            }
            this.p0 = map;
        } else {
            this.p0 = u0();
        }
        e.d.a(this, new d3.qux(-511717951, new tx0.baz(this, 19), true));
        bd.bar.u(v0(), "requiredPermission", "n/a");
        com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents.Seen.logWith(v0());
        if (bundle == null && (kVar = (vw2.k) this.j0.getValue()) != null) {
            ?? eVar = new hi3.e(qx2.s.e, qx2.s.f);
            eVar.j("RequiredPermission");
            eVar.k(kVar.e);
            qx2.s e = eVar.e();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "build(...)");
            j71.g.K(e, v0());
        }
    }

    public final void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        this.p0 = u0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super/*androidx.fragment.app.FragmentActivity*/.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1) {
            return;
        }
        if0.y1.L(strArr, iArr);
        if (this.n0) {
            x0(strArr, iArr);
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "<this>");
        boolean z2 = false;
        java.util.Collection barVar = new kotlin.ranges.bar(0, kotlin.collections.v.I(strArr), 1);
        if (!(barVar instanceof java.util.Collection) || !barVar.isEmpty()) {
            kotlin.collections.m0 it = barVar.iterator();
            while (((uf3.h) it).c) {
                int nextInt = it.nextInt();
                if (iArr[nextInt] == -1 && shouldShowRequestPermissionRationale(strArr[nextInt])) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (iArr[i2] != 0) {
                    break;
                } else {
                    i2++;
                }
            } else {
                z2 = true;
                break;
            }
        }
        if (!z && !z2) {
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.fromParts("package", getPackageName(), null));
            intent.addFlags(268435456);
            startActivity(intent);
            this.o0 = true;
            return;
        }
        x0(strArr, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        com.truecaller.analytics.common.event.AppMandatoryPermissionEvent.Action action;
        boolean z;
        com.truecaller.analytics.common.event.AppMandatoryPermissionEvent.Action action2;
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        boolean z2 = false;
        for (java.util.Map.Entry entry : u0().entrySet()) {
            com.truecaller.tcpermissions.PermissionGroup permissionGroup = (com.truecaller.tcpermissions.PermissionGroup) entry.getKey();
            java.lang.Boolean bool = (java.lang.Boolean) entry.getValue();
            boolean booleanValue = bool.booleanValue();
            java.lang.Boolean bool2 = (java.lang.Boolean) this.p0.get(permissionGroup);
            if (bool2 == null || !bool2.equals(bool)) {
                if (booleanValue) {
                    if (this.o0) {
                        action2 = com.truecaller.analytics.common.event.AppMandatoryPermissionEvent.Action.SETTINGS;
                        z = true;
                        nc0.u1.e(new n93.bar(permissionGroup.name(), booleanValue, action2), v0());
                        z2 = z;
                    } else {
                        action = com.truecaller.analytics.common.event.AppMandatoryPermissionEvent.Action.IN_APP;
                    }
                } else {
                    action = com.truecaller.analytics.common.event.AppMandatoryPermissionEvent.Action.NONE;
                }
                com.truecaller.analytics.common.event.AppMandatoryPermissionEvent.Action action3 = action;
                z = z2;
                action2 = action3;
                nc0.u1.e(new n93.bar(permissionGroup.name(), booleanValue, action2), v0());
                z2 = z;
            }
        }
        if (z2) {
            this.o0 = false;
        }
        if (((qw2.b0) w0()).i()) {
            qw2.b0 b0Var = (qw2.b0) w0();
            u03.z zVar = b0Var.a;
            java.lang.String[] d = b0Var.d();
            if (zVar.g((java.lang.String[]) java.util.Arrays.copyOf(d, d.length))) {
                com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents.Granted.logWith(v0());
                finish();
                qc3.bar barVar = this.g0;
                if (barVar != null) {
                    u72.baz bazVar = (u72.baz) barVar.get();
                    com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType = (com.truecaller.bottombar.BottomBarButtonType) this.k0.getValue();
                    bazVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomBarButtonType, "tab");
                    y90.m6.Q(this, bottomBarButtonType, "requiredPermission", 8);
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("requiredPermissionsActivityOpener");
                throw null;
            }
        }
        this.m0.e(u0());
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        bundle.putBoolean("STATE_REQUEST_HAS_RATIONALE_PERMISSIONS", this.n0);
        bundle.putBoolean("STATE_REQUEST_PERMISSION_FROM_SETTINGS", this.o0);
        bundle.putSerializable("PERMISSION_STATE_BEFORE_RESUME", new java.util.HashMap(this.p0));
    }

    public final java.util.LinkedHashMap u0() {
        java.util.Map map = (java.util.Map) this.l0.getValue();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.q0.b(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            u03.z zVar = this.d0;
            if (zVar != null) {
                java.lang.String[] strArr = (java.lang.String[]) list.toArray(new java.lang.String[0]);
                linkedHashMap.put(key, java.lang.Boolean.valueOf(zVar.g((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length))));
            } else {
                kotlin.jvm.internal.Intrinsics.n("permissionUtil");
                throw null;
            }
        }
        return linkedHashMap;
    }

    public final nc0.bar v0() {
        nc0.bar barVar = this.f0;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("analytics");
        throw null;
    }

    public final qw2.a0 w0() {
        qw2.a0 a0Var = this.e0;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.Intrinsics.n("tcPermissionsUtil");
        throw null;
    }

    public final void x0(java.lang.String[] strArr, int[] iArr) {
        com.truecaller.tcpermissions.PermissionGroup permissionGroup;
        java.lang.Object obj;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (iArr[i] == -1) {
                java.lang.String str = strArr[i2];
                java.util.Iterator it = ((java.util.Map) this.l0.getValue()).entrySet().iterator();
                while (true) {
                    permissionGroup = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((java.util.List) ((java.util.Map.Entry) obj).getValue()).contains(str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (entry != null) {
                    permissionGroup = (com.truecaller.tcpermissions.PermissionGroup) entry.getKey();
                }
                if (permissionGroup != null && !linkedHashSet.contains(permissionGroup)) {
                    nc0.u1.e(new n93.bar(permissionGroup.name(), false, com.truecaller.analytics.common.event.AppMandatoryPermissionEvent.Action.NONE), v0());
                    linkedHashSet.add(permissionGroup);
                }
            }
            i++;
            i2 = i3;
        }
    }
}
