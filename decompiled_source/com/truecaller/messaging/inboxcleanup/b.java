package com.truecaller.messaging.inboxcleanup;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class b implements m22.r {
    public final android.content.Context a;
    public final s62.d b;

    public b(android.content.Context context, s62.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "notificationManager");
        this.a = context;
        this.b = dVar;
    }

    public static f6.f0 a(com.truecaller.messaging.inboxcleanup.b bVar, java.lang.String str, java.lang.String str2, android.app.PendingIntent pendingIntent, int i) {
        boolean z;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            pendingIntent = null;
        }
        if ((i & 8) != 0) {
            z = false;
        } else {
            z = true;
        }
        java.lang.String o = ((s62.f) bVar.b).o("inbox_cleanup");
        android.content.Context context = bVar.a;
        f6.f0 f0Var = new f6.f0(context, o);
        f0Var.e = f6.f0.e(str);
        f0Var.f = f6.f0.e(str2);
        f6.y yVar = new f6.y(0);
        yVar.f = f6.f0.e(str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(yVar, "bigText(...)");
        f0Var.t(yVar);
        f0Var.Q.icon = 2131232903;
        f0Var.k(4);
        f0Var.D = context.getColor(2131102024);
        f0Var.l(16, true);
        f0Var.g = pendingIntent;
        f0Var.R = true;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var, "setSilent(...)");
        if (z) {
            f0Var.m(android.graphics.BitmapFactory.decodeResource(context.getResources(), 2131232743));
        }
        return f0Var;
    }
}
