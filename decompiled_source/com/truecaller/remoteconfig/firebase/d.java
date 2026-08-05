package com.truecaller.remoteconfig.firebase;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class d {
    public final fg3.e0 a;
    public final kotlin.coroutines.CoroutineContext b;
    public final qc3.bar c;
    public final qc3.bar d;
    public final qc3.bar e;

    public d(fg3.e0 e0Var, kotlin.coroutines.CoroutineContext coroutineContext, qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "appScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "firebaseRemoteConfigProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "qaMenuSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "deviceInfoUtil");
        this.a = e0Var;
        this.b = coroutineContext;
        this.c = barVar;
        this.d = barVar2;
        this.e = barVar3;
    }

    public final java.lang.Object a(boolean z, ff3.qux quxVar) {
        fg3.j jVar = new fg3.j(1, ef3.e.b(quxVar));
        jVar.s();
        long j = 0;
        if (!z) {
            ((u03.b) this.e.get()).getClass();
            if (!((com.truecaller.qa.x) this.d.get()).y("qaDisableFirebaseConfig")) {
                j = java.util.concurrent.TimeUnit.HOURS.toSeconds(6L);
            }
        }
        try {
            pv.bar barVar = (pv.bar) ((com.truecaller.remoteconfig.firebase.baz) this.c.get()).c.getValue();
            kotlin.jvm.internal.Intrinsics.d(barVar.a(j).addOnCompleteListener(new ki.qux(barVar, jVar, false, 25)));
        } catch (java.lang.Exception e) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
            kotlin.o oVar = kotlin.q.b;
            jVar.resumeWith(java.lang.Boolean.FALSE);
        }
        java.lang.Object r = jVar.r();
        if (r == ef3.bar.a) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "frame");
        }
        return r;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String b(java.lang.String str) {
        java.lang.String string;
        qv.d dVar = ((pv.bar) ((com.truecaller.remoteconfig.firebase.baz) this.c.get()).c.getValue()).h;
        qv.a c = dVar.c.c();
        java.lang.String str2 = null;
        if (c != null) {
            try {
                string = c.b.getString(str);
            } catch (org.json.JSONException unused) {
            }
            if (string == null) {
                qv.a c2 = dVar.c.c();
                if (c2 != null) {
                    synchronized (dVar.a) {
                        try {
                            java.util.Iterator it = dVar.a.iterator();
                            while (it.hasNext()) {
                                dVar.b.execute(new p0.baz((com.google.android.gms.common.util.BiConsumer) it.next(), str, c2, 12));
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
                return string;
            }
            qv.a c3 = dVar.d.c();
            if (c3 != null) {
                try {
                    str2 = c3.b.getString(str);
                } catch (org.json.JSONException unused2) {
                }
            }
            if (str2 != null) {
                return str2;
            }
            return "";
        }
        string = null;
        if (string == null) {
        }
    }

    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "defaultValue");
        return b(str);
    }
}
