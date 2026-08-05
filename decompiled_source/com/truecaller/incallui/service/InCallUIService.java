package com.truecaller.incallui.service;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class InCallUIService extends android.telecom.InCallService implements rr1.c0, bd3.qux {
    public static final /* synthetic */ int r = 0;
    public volatile yc3.g a;
    public rr1.i0 d;
    public p.c3 e;
    public cu0.k0 f;
    public tx.v g;
    public u03.z h;
    public su0.m i;
    public hy0.baz j;
    public vx.bar k;
    public n62.c n;
    public final java.lang.Object b = new java.lang.Object();
    public boolean c = false;
    public final ig3.h2 l = ig3.w1.c((java.lang.Object) null);
    public final ig3.h2 m = ig3.w1.c(new ur1.bar(com.truecaller.incallui.utils.audio.AudioRoute.EARPIECE, kotlin.collections.h0.a, null, false));
    public final kotlin.Lazy o = kotlin.LazyKt.lazy(kotlin.k.c, new rr1.a0(this, 1));
    public final co.t p = new co.t(this, 28);
    public final kotlin.Lazy q = kotlin.LazyKt.lazy(new rr1.a0(this, 2));

    public final java.lang.Object X3() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = new yc3.g(this);
                    }
                } finally {
                }
            }
        }
        return this.a.X3();
    }

    public final rr1.i0 a() {
        rr1.i0 i0Var = this.d;
        if (i0Var != null) {
            return i0Var;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r23v1, types: [p22.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, p.c3] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ah.n] */
    /* JADX WARN: Type inference failed for: r8v3, types: [rq0.l, java.lang.Object] */
    public final void b() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.c) {
            this.c = true;
            tx.q qVar = (rr1.k0) X3();
            tx.w wVar = qVar.b;
            tx.c0 c0Var = wVar.b;
            rr1.l0 l0Var = (rr1.l0) c0Var.T1.get();
            rr1.n nVar = (rr1.n) c0Var.U2.get();
            ir1.c cVar = (ir1.c) c0Var.t2.get();
            u03.b0 b0Var = (u03.b0) wVar.v4.get();
            jr1.baz bazVar = (jr1.baz) wVar.e7.get();
            android.content.Context context = (android.content.Context) wVar.L.get();
            qc3.bar a = cd3.baz.a(wVar.P2);
            android.app.ActivityManager activityManager = (android.app.ActivityManager) qb.qux.n((android.content.Context) wVar.I.get(), "context", "activity", "null cannot be cast to non-null type android.app.ActivityManager");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "notificationManager");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityManager, "activityManager");
            ?? obj = new java.lang.Object();
            ((rq0.l) obj).a = context;
            ((rq0.l) obj).b = a;
            ((rq0.l) obj).c = activityManager;
            this.d = new rr1.i0(l0Var, nVar, cVar, b0Var, bazVar, obj, (u03.baz) wVar.W.get(), (or1.g) c0Var.v2.get(), new tr1.j((android.content.Context) wVar.L.get()), (u03.b) wVar.O.get(), (tr1.baz) c0Var.q2.get(), (oo1.f) wVar.n0.get(), (kotlin.coroutines.CoroutineContext) wVar.V1.get(), (e23.qux) wVar.qk.get(), cd3.baz.a(c0Var.md), cd3.baz.a(c0Var.H0), c0Var.nd, cd3.baz.a(c0Var.k3), cd3.baz.a(c0Var.od), cd3.baz.a(c0Var.S1), new java.lang.Object(), cd3.baz.a(c0Var.pd), cd3.baz.a(wVar.o1), cd3.baz.a(qVar.d), cd3.baz.a(c0Var.sd), cd3.baz.a(c0Var.x2), cd3.baz.a(c0Var.N3));
            android.content.Context context2 = (android.content.Context) wVar.L.get();
            kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
            kotlin.coroutines.CoroutineContext coroutineContext2 = (kotlin.coroutines.CoroutineContext) wVar.H0.get();
            oo1.f fVar = (oo1.f) wVar.m0.get();
            android.content.Context context3 = (android.content.Context) wVar.L.get();
            u03.b bVar = (u03.b) wVar.O.get();
            r62.baz bazVar2 = new r62.baz((u03.b) c0Var.a.O.get(), c0Var.td, c0Var.ud, c0Var.vd, 0);
            r62.bar barVar = (r62.bar) wVar.i7.get();
            s62.d dVar = (s62.d) wVar.P2.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "cpuContext");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "featuresRegistry");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context3, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "compactCallNotificationHelper");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "callStyleNotificationHelper");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "systemNotificationManager");
            ?? obj2 = new java.lang.Object();
            ((ah.n) obj2).b = coroutineContext;
            ((ah.n) obj2).a = coroutineContext2;
            ((ah.n) obj2).c = fVar;
            ((ah.n) obj2).d = context3;
            ((ah.n) obj2).e = bVar;
            ((ah.n) obj2).f = bazVar2;
            ((ah.n) obj2).g = barVar;
            ((ah.n) obj2).h = dVar;
            wi.qux R2 = c0Var.R2();
            u03.b bVar2 = (u03.b) wVar.O.get();
            qc3.bar a2 = cd3.baz.a(wVar.P2);
            s62.g gVar = (s62.g) wVar.A3.get();
            hy0.baz bazVar3 = (hy0.baz) wVar.Ih.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj2, "incomingCallNotificationFactory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(R2, "ongoingCallNotificationFactory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar2, "deviceInfoUtil");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "notificationManager");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "pendingIntentFactory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar3, "callUI");
            ?? obj3 = new java.lang.Object();
            ((p.c3) obj3).a = context2;
            ((p.c3) obj3).b = obj2;
            ((p.c3) obj3).c = R2;
            ((p.c3) obj3).d = bVar2;
            ((p.c3) obj3).e = a2;
            ((p.c3) obj3).f = gVar;
            ((p.c3) obj3).g = bazVar3;
            this.e = obj3;
            this.f = (cu0.k0) qVar.e.get();
            this.g = wVar.xq;
            this.h = (u03.z) wVar.M.get();
            this.i = (su0.m) wVar.I5.get();
            this.j = (hy0.baz) wVar.Ih.get();
            this.k = (vx.bar) c0Var.A3.get();
        }
        super.onCreate();
    }

    public final void c() {
        hy0.baz bazVar = this.j;
        if (bazVar != null) {
            startActivity(wi0.bar.l(bazVar, this, (com.truecaller.callui.api.CallUISource) null, 6));
        } else {
            kotlin.jvm.internal.Intrinsics.n("callUI");
            throw null;
        }
    }

    public final void d() {
        n62.c cVar = this.n;
        if (cVar != null) {
            cVar.b(this, false);
        }
    }

    @Override // android.telecom.InCallService
    public final void onCallAdded(android.telecom.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        rr1.i0 a = a();
        rr1.bar barVar = new rr1.bar(call);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "addedCall");
        a.e.x("inCallUIServicePresenter", a);
        a.k2();
        rr1.c0 c0Var = (rr1.c0) ((com.truecaller.sdk.bar) a).a;
        if (c0Var != null) {
            tx.v vVar = ((com.truecaller.incallui.service.InCallUIService) c0Var).g;
            if (vVar != null) {
                ((com.truecaller.acs.AfterCallScreen) vVar.get()).a();
            } else {
                kotlin.jvm.internal.Intrinsics.n("afterCallScreen");
                throw null;
            }
        }
        fg3.h0.J(a, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q7.f(barVar, new pd1.h(22, a, barVar), a, (df3.bar) null, 23), 3);
    }

    @Override // android.telecom.InCallService
    public final void onCallAudioStateChanged(android.telecom.CallAudioState callAudioState) {
        com.truecaller.incallui.utils.audio.AudioRoute audioRoute;
        x03.qux quxVar;
        android.bluetooth.BluetoothHeadset bluetoothHeadset;
        java.lang.Object obj;
        x03.bar barVar;
        if (callAudioState != null) {
            int route = callAudioState.getRoute();
            if (route != 1) {
                if (route != 2) {
                    if (route != 4) {
                        if (route != 8) {
                            return;
                        } else {
                            audioRoute = com.truecaller.incallui.utils.audio.AudioRoute.SPEAKER;
                        }
                    } else {
                        audioRoute = com.truecaller.incallui.utils.audio.AudioRoute.WIRED_HEADSET;
                    }
                } else {
                    audioRoute = com.truecaller.incallui.utils.audio.AudioRoute.BLUETOOTH;
                }
            } else {
                audioRoute = com.truecaller.incallui.utils.audio.AudioRoute.EARPIECE;
            }
            if ((callAudioState.getSupportedRouteMask() & 2) == 2) {
                x03.baz bazVar = (x03.baz) this.o.getValue();
                synchronized (bazVar) {
                    quxVar = bazVar.b();
                    if (quxVar == null) {
                        if (!bazVar.a()) {
                            quxVar = new x03.qux((x03.bar) null, kotlin.collections.h0.a);
                        } else {
                            android.bluetooth.BluetoothProfile bluetoothProfile = bazVar.d;
                            if (bluetoothProfile instanceof android.bluetooth.BluetoothHeadset) {
                                bluetoothHeadset = (android.bluetooth.BluetoothHeadset) bluetoothProfile;
                            } else {
                                bluetoothHeadset = null;
                            }
                            if (bluetoothHeadset == null) {
                                quxVar = new x03.qux((x03.bar) null, kotlin.collections.h0.a);
                            } else {
                                try {
                                    kotlin.collections.h0 connectedDevices = bluetoothHeadset.getConnectedDevices();
                                    if (connectedDevices == null) {
                                        connectedDevices = kotlin.collections.h0.a;
                                    }
                                    java.util.List<android.bluetooth.BluetoothDevice> list = (java.lang.Iterable) connectedDevices;
                                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
                                    for (android.bluetooth.BluetoothDevice bluetoothDevice : list) {
                                        kotlin.jvm.internal.Intrinsics.d(bluetoothDevice);
                                        java.lang.String c = bazVar.c(bluetoothDevice, bazVar.a, "");
                                        java.lang.String address = bluetoothDevice.getAddress();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
                                        arrayList.add(new x03.bar(c, address));
                                    }
                                    java.util.Iterator<T> it = ((java.lang.Iterable) connectedDevices).iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            if (bluetoothHeadset.isAudioConnected((android.bluetooth.BluetoothDevice) obj)) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    android.bluetooth.BluetoothDevice bluetoothDevice2 = (android.bluetooth.BluetoothDevice) obj;
                                    if (bluetoothDevice2 != null) {
                                        java.lang.String c2 = bazVar.c(bluetoothDevice2, bazVar.a, "");
                                        java.lang.String address2 = bluetoothDevice2.getAddress();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(address2, "getAddress(...)");
                                        barVar = new x03.bar(c2, address2);
                                    } else {
                                        barVar = null;
                                    }
                                    quxVar = new x03.qux(barVar, arrayList);
                                } catch (java.lang.NullPointerException unused) {
                                    quxVar = new x03.qux((x03.bar) null, kotlin.collections.h0.a);
                                }
                            }
                        }
                    }
                }
            } else {
                quxVar = new x03.qux((x03.bar) null, kotlin.collections.h0.a);
            }
            ig3.h2 h2Var = this.m;
            ur1.bar barVar2 = new ur1.bar(audioRoute, quxVar.b, quxVar.a, callAudioState.isMuted());
            h2Var.getClass();
            h2Var.p((java.lang.Object) null, barVar2);
            ig3.h2 h2Var2 = this.l;
            h2Var2.getClass();
            h2Var2.p((java.lang.Object) null, callAudioState);
        }
    }

    @Override // android.telecom.InCallService
    public final void onCallRemoved(android.telecom.Call call) {
        java.lang.String h;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        rr1.n nVar = a().e;
        if (nVar.M && (h = nVar.h()) != null) {
            java.lang.Integer num = nVar.O;
            if (num != null && num.intValue() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            nVar.O = java.lang.Integer.valueOf(i);
            java.lang.String value = com.truecaller.incallui.utils.analytics.events.AnalyticsContext.CHANGE_SIM.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "analyticsContext");
            android.os.Parcelable.Creator creator = com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.CREATOR;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
            com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource callSource = com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.CHANGE_SIM;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callSource, "source");
            ((nv0.c) nVar.x.get()).d(new com.truecaller.calling.initiate_call.InitiateCallHelper.CallOptions(h, value, value, (java.lang.String) null, valueOf, false, false, true, false, (android.telecom.PhoneAccountHandle) null, false, com.truecaller.calling.initiate_call.InitiateCallHelper.CallContextOption.ShowOnBoarded.a, (com.truecaller.calling.initiate_call.InitiateCallHelper.DialAssistOptions) null, callSource));
        }
        fg3.h0.J(nVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new rr1.i(nVar, null, 3), 3);
    }

    @Override // android.app.Service
    public final void onCreate() {
        boolean z;
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        b();
        a().u0(this);
        ((x03.baz) this.o.getValue()).g = new rr1.a0(this, 0);
        x03.baz bazVar = (x03.baz) this.o.getValue();
        rr1.i0 a = a();
        ig3.h2 h2Var = this.l;
        synchronized (bazVar) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "scope");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h2Var, "systemAudioState");
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                bazVar.d();
            } else {
                bazVar.h = h2Var;
                ig3.w1.F(new androidx.room.o(25, h2Var, new w91.baz(bazVar, (df3.bar) null, 12)), a);
            }
        }
        this.l.o(getCallAudioState());
        registerReceiver(this.p, new android.content.IntentFilter("android.intent.action.USER_PRESENT"));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        n62.c cVar = this.n;
        if (cVar != null) {
            cVar.destroy();
        }
        this.n = null;
        a().m1();
        ((x03.baz) this.o.getValue()).e();
        unregisterReceiver(this.p);
        super.onDestroy();
    }
}
