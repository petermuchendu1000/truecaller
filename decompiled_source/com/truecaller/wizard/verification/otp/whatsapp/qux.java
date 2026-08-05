package com.truecaller.wizard.verification.otp.whatsapp;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class qux {
    public final android.content.Context a;
    public final u03.b b;
    public final java.util.List c;
    public pv0.b d;

    public qux(android.content.Context context, u03.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
        this.a = context;
        this.b = bVar;
        this.c = kotlin.collections.y.j(new java.lang.String[]{"com.whatsapp", "com.whatsapp.w4b"});
    }

    public final boolean a(android.content.Intent intent) {
        java.lang.Boolean o;
        java.lang.String str;
        try {
            kotlin.o oVar = kotlin.q.b;
            java.util.List list = this.c;
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) ((android.os.Parcelable) g6.b.g(intent, "_ci_", android.app.PendingIntent.class));
            if (pendingIntent != null) {
                str = pendingIntent.getCreatorPackage();
            } else {
                str = null;
            }
            o = java.lang.Boolean.valueOf(kotlin.collections.CollectionsKt.N(list, str));
        } catch (java.lang.Throwable th) {
            kotlin.o oVar2 = kotlin.q.b;
            o = od.p.o(th);
        }
        java.lang.Throwable a = kotlin.q.a(o);
        if (a != null) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(a);
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (o instanceof kotlin.p) {
            o = bool;
        }
        return o.booleanValue();
    }
}
