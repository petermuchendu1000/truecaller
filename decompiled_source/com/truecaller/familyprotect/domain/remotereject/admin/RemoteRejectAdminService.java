package com.truecaller.familyprotect.domain.remotereject.admin;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class RemoteRejectAdminService extends androidx.lifecycle.g0 implements bd3.qux {
    public static final /* synthetic */ int h = 0;
    public volatile yc3.g b;
    public final java.lang.Object c = new java.lang.Object();
    public boolean d = false;
    public rl1.d e;
    public rl1.n f;
    public qc3.bar g;

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.b == null) {
            synchronized (this.c) {
                try {
                    if (this.b == null) {
                        this.b = new yc3.g(this);
                    }
                } finally {
                }
            }
        }
        return this.b.X3();
    }

    public final rl1.d a() {
        rl1.d dVar = this.e;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.Intrinsics.n("coordinator");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.d) {
            this.d = true;
            tx.q qVar = (rl1.o) X3();
            tx.w wVar = qVar.b;
            kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) wVar.P.get();
            rl1.n a = qVar.a();
            tx.c0 c0Var = wVar.b;
            this.e = new rl1.d(coroutineContext, a, c0Var.H3(), (vl1.bar) c0Var.M3.get());
            this.f = qVar.a();
            this.g = cd3.baz.a(c0Var.M3);
        }
        super.onCreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        b();
        qc3.bar barVar = this.g;
        if (barVar != null) {
            ((vl1.bar) barVar.get()).getClass();
            vl1.bar.a("RemoteRejectAdminService created");
            rl1.n nVar = this.f;
            if (nVar != null) {
                o02.baz bazVar = nVar.a;
                com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle notificationStyle = com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle.SILENT;
                u03.g0 g0Var = nVar.b;
                java.lang.String h2 = g0Var.h(2132021191, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "getString(...)");
                java.lang.String h3 = g0Var.h(2132021199, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h3, "getString(...)");
                ul1.a aVar = new ul1.a(h3, com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction.CLICKED);
                java.lang.String h4 = g0Var.h(2132021588, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h4, "getString(...)");
                i0.a.z(this, bazVar.H(notificationStyle, h2, kotlin.collections.y.j(new ul1.b[]{aVar, new ul1.baz(h4, com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotificationAction.DISMISS)}), com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification.ADMIN_MEMBER_ON_SCAM_CALL));
                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new qd1.b(this, (df3.bar) null, 15), 3);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("notificationHelper");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("logger");
        throw null;
    }

    public final void onDestroy() {
        super.onDestroy();
        qc3.bar barVar = this.g;
        if (barVar != null) {
            ((vl1.bar) barVar.get()).getClass();
            vl1.bar.a("RemoteRejectAdminService destroyed");
            a().c();
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("logger");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        java.lang.String str;
        super/*android.app.Service*/.onStartCommand(intent, i, i2);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 152398933) {
                if (hashCode != 364807354) {
                    if (hashCode == 1671672458 && str.equals("dismiss")) {
                        rl1.d a = a();
                        a.d.getClass();
                        vl1.bar.a("Admin ignored scam call");
                        fg3.h0.J(a, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new rl1.a(a, null, 0), 3);
                        return 2;
                    }
                } else if (str.equals("newScamCall")) {
                    java.lang.String stringExtra = intent.getStringExtra("extraCallId");
                    java.lang.String stringExtra2 = intent.getStringExtra("extraMemberPhoneNumber");
                    java.lang.String stringExtra3 = intent.getStringExtra("extraFraudsterName");
                    java.lang.String stringExtra4 = intent.getStringExtra("extraFraudsterPhoneNumber");
                    if (stringExtra != null && stringExtra.length() != 0 && stringExtra2 != null && stringExtra2.length() != 0 && stringExtra3 != null && stringExtra3.length() != 0 && stringExtra4 != null && stringExtra4.length() != 0) {
                        rl1.d a2 = a();
                        ig3.h2 h2Var = a2.f;
                        vl1.bar barVar = a2.d;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "callId");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra2, "memberPhoneNumber");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra3, "fraudsterName");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra4, "fraudsterPhoneNumber");
                        if (a2.g.a.getValue() != null) {
                            barVar.getClass();
                            vl1.bar.b("memberInScamCall called while already handling a scam call", true);
                            return 2;
                        }
                        java.lang.String concat = "Processing new call ".concat(stringExtra);
                        barVar.getClass();
                        vl1.bar.a(concat);
                        rl1.q qVar = new rl1.q(stringExtra, stringExtra3, stringExtra4, stringExtra2, com.truecaller.familyprotect.domain.remotereject.admin.RemoteRejectAdminState$CallState.ONGOING);
                        h2Var.getClass();
                        h2Var.p((java.lang.Object) null, qVar);
                        rl1.q qVar2 = (rl1.q) h2Var.getValue();
                        if (qVar2 != null) {
                            fg3.h0.J(a2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q8.n(a2, qVar2, (df3.bar) null, 26), 3);
                        }
                        fg3.k2 k2Var = a2.j;
                        if (k2Var != null) {
                            k2Var.cancel((java.util.concurrent.CancellationException) null);
                        }
                        a2.j = fg3.h0.J(a2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q8.n(a2, stringExtra, (df3.bar) null, 25), 3);
                        return 2;
                    }
                    qc3.bar barVar2 = this.g;
                    if (barVar2 != null) {
                        ((vl1.bar) barVar2.get()).getClass();
                        vl1.bar.b("Admin service invalid call info", true);
                        qk.m.r(this);
                        stopSelf();
                        a().c();
                        return 2;
                    }
                    kotlin.jvm.internal.Intrinsics.n("logger");
                    throw null;
                }
            } else if (str.equals("sendHangUp")) {
                rl1.d a3 = a();
                a3.d.getClass();
                vl1.bar.a("Admin clicked hang up");
                fg3.h0.J(a3, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new pk1.l(a3, null, 13), 3);
                return 2;
            }
        }
        qc3.bar barVar3 = this.g;
        if (barVar3 != null) {
            ((vl1.bar) barVar3.get()).getClass();
            vl1.bar.b("Admin service unknown action", true);
            qk.m.r(this);
            stopSelf();
            a().c();
            return 2;
        }
        kotlin.jvm.internal.Intrinsics.n("logger");
        throw null;
    }
}
