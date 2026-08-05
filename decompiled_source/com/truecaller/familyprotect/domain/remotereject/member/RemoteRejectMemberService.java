package com.truecaller.familyprotect.domain.remotereject.member;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class RemoteRejectMemberService extends androidx.lifecycle.g0 implements bd3.qux {
    public static final /* synthetic */ int h = 0;
    public volatile yc3.g b;
    public final java.lang.Object c = new java.lang.Object();
    public boolean d = false;
    public tl1.b e;
    public o02.baz f;
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

    public final qc3.bar a() {
        qc3.bar barVar = this.g;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("logger");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.d) {
            this.d = true;
            tx.q qVar = (tl1.e) X3();
            tx.w wVar = qVar.b;
            kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) wVar.P.get();
            tx.c0 c0Var = wVar.b;
            this.e = new tl1.b(coroutineContext, (t41.a) c0Var.N1.get(), qVar.b(), c0Var.H3(), (vl1.bar) c0Var.M3.get());
            this.f = qVar.b();
            this.g = cd3.baz.a(c0Var.M3);
        }
        super.onCreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        b();
        ((vl1.bar) a().get()).getClass();
        vl1.bar.a("RemoteRejectMemberService created");
        o02.baz bazVar = this.f;
        if (bazVar != null) {
            o02.baz bazVar2 = (o02.baz) bazVar.c;
            com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle notificationStyle = com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle.SILENT;
            java.lang.String h2 = ((u03.b0) bazVar.d).h(2132021197, new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "getString(...)");
            i0.a.z(this, bazVar2.H(notificationStyle, h2, kotlin.collections.h0.a, com.truecaller.familyprotect.domain.remotereject.analytics.RemoteRejectAnalytics$RemoteRejectNotification.MEMBER_ON_SCAM_CALL));
            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sr0.bar(this, (df3.bar) null, 13), 3);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("notificationHelper");
        throw null;
    }

    public final void onDestroy() {
        super.onDestroy();
        ((vl1.bar) a().get()).getClass();
        vl1.bar.a("RemoteRejectMemberService destroyed");
        tl1.b bVar = this.e;
        if (bVar != null) {
            fg3.k2 k2Var = bVar.j;
            if (k2Var != null) {
                k2Var.cancel((java.util.concurrent.CancellationException) null);
            }
            fg3.k2 k2Var2 = bVar.k;
            if (k2Var2 != null) {
                k2Var2.cancel((java.util.concurrent.CancellationException) null);
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("coordinator");
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
            if (hashCode != -1004335136) {
                if (hashCode == 364807354 && str.equals("newScamCall")) {
                    java.lang.String stringExtra = intent.getStringExtra("extraCallId");
                    java.lang.String stringExtra2 = intent.getStringExtra("extraFraudsterName");
                    java.lang.String stringExtra3 = intent.getStringExtra("extraFraudsterPhoneNumber");
                    if (stringExtra != null && stringExtra2 != null && stringExtra3 != null) {
                        tl1.b bVar = this.e;
                        if (bVar != null) {
                            vl1.bar barVar = bVar.e;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "callId");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra2, "fraudsterName");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra3, "fraudsterPhoneNumber");
                            if (bVar.g.a.getValue() != null) {
                                barVar.getClass();
                                vl1.bar.b("newScamCall called while already handling a scam call", true);
                                return 2;
                            }
                            java.lang.String concat = "Processing new call ".concat(stringExtra3);
                            barVar.getClass();
                            vl1.bar.a(concat);
                            ig3.h2 h2Var = bVar.f;
                            tl1.g gVar = new tl1.g(stringExtra, stringExtra2, stringExtra3, com.truecaller.familyprotect.domain.remotereject.member.RemoteRejectMemberState$CallState.ONGOING);
                            h2Var.getClass();
                            h2Var.p((java.lang.Object) null, gVar);
                            fg3.k2 k2Var = bVar.j;
                            if (k2Var != null) {
                                k2Var.cancel((java.util.concurrent.CancellationException) null);
                            }
                            bVar.j = fg3.h0.J(bVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new pk1.l(bVar, stringExtra, stringExtra2, stringExtra3, (df3.bar) null), 3);
                            return 2;
                        }
                        kotlin.jvm.internal.Intrinsics.n("coordinator");
                        throw null;
                    }
                    ((vl1.bar) a().get()).getClass();
                    vl1.bar.b("Member serice missing intent extras", true);
                    stopForeground(1);
                    stopSelf();
                    tl1.b bVar2 = this.e;
                    if (bVar2 != null) {
                        fg3.k2 k2Var2 = bVar2.j;
                        if (k2Var2 != null) {
                            k2Var2.cancel((java.util.concurrent.CancellationException) null);
                        }
                        fg3.k2 k2Var3 = bVar2.k;
                        if (k2Var3 != null) {
                            k2Var3.cancel((java.util.concurrent.CancellationException) null);
                            return 2;
                        }
                        return 2;
                    }
                    kotlin.jvm.internal.Intrinsics.n("coordinator");
                    throw null;
                }
            } else if (str.equals("scamCallEnded")) {
                java.lang.String stringExtra4 = intent.getStringExtra("extraFraudsterPhoneNumber");
                if (stringExtra4 != null) {
                    tl1.b bVar3 = this.e;
                    if (bVar3 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra4, "fraudsterPhoneNumber");
                        fg3.h0.J(bVar3, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t22.b1(bVar3, stringExtra4, null, 12), 3);
                        return 2;
                    }
                    kotlin.jvm.internal.Intrinsics.n("coordinator");
                    throw null;
                }
                ((vl1.bar) a().get()).getClass();
                vl1.bar.b("Scam call ended missing phone number", true);
                stopForeground(1);
                stopSelf();
                tl1.b bVar4 = this.e;
                if (bVar4 != null) {
                    fg3.k2 k2Var4 = bVar4.j;
                    if (k2Var4 != null) {
                        k2Var4.cancel((java.util.concurrent.CancellationException) null);
                    }
                    fg3.k2 k2Var5 = bVar4.k;
                    if (k2Var5 != null) {
                        k2Var5.cancel((java.util.concurrent.CancellationException) null);
                        return 2;
                    }
                    return 2;
                }
                kotlin.jvm.internal.Intrinsics.n("coordinator");
                throw null;
            }
        }
        ((vl1.bar) a().get()).getClass();
        vl1.bar.b("Member service unknown action", true);
        stopForeground(1);
        stopSelf();
        tl1.b bVar5 = this.e;
        if (bVar5 != null) {
            fg3.k2 k2Var6 = bVar5.j;
            if (k2Var6 != null) {
                k2Var6.cancel((java.util.concurrent.CancellationException) null);
            }
            fg3.k2 k2Var7 = bVar5.k;
            if (k2Var7 != null) {
                k2Var7.cancel((java.util.concurrent.CancellationException) null);
                return 2;
            }
            return 2;
        }
        kotlin.jvm.internal.Intrinsics.n("coordinator");
        throw null;
    }
}
