package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class j implements android.content.DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ j(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        int i = this.a;
        df3.bar barVar = null;
        int i2 = 0;
        java.lang.Object obj = this.b;
        switch (i) {
            case 0:
                int i3 = com.truecaller.ui.FeedbackDialogActivity.g0;
                ((com.truecaller.ui.FeedbackDialogActivity) obj).finish();
                return;
            case 1:
                h72.a aVar = n12.a.l;
                ((n12.a) obj).b6().f2();
                return;
            case 2:
                p7.baz bazVar = com.truecaller.tcpermissions.RoleRequesterActivity.f0;
                qw2.n nVar = (qw2.n) ((com.truecaller.tcpermissions.RoleRequesterActivity) obj).u0().a;
                if (nVar != null) {
                    nVar.finish();
                    return;
                }
                return;
            case 3:
                int i4 = com.truecaller.tcpermissions.TcPermissionDialogActivity.e0;
                ((com.truecaller.tcpermissions.TcPermissionDialogActivity) obj).finish();
                return;
            case 4:
                rq0.l.a((rq0.l) obj, com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action.Dismiss);
                return;
            case 5:
                ((uk2.x) obj).d.z();
                return;
            case 6:
                kotlin.reflect.KProperty[] kPropertyArr = y93.a.u;
                y93.m e5 = ((y93.a) obj).e5();
                fg3.h0.J(e5, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new y93.l(e5, barVar, i2), 3);
                e5.q = false;
                return;
            case 7:
                kotlin.reflect.KProperty[] kPropertyArr2 = y93.f.u;
                y93.m e52 = ((y93.f) obj).e5();
                fg3.h0.J(e52, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new y93.l(e52, barVar, i2), 3);
                e52.q = false;
                return;
            default:
                ag0.qux quxVar = ((yf0.l) obj).T4().j;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("wizard", "context");
                quxVar.f(com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action.Cancelled);
                return;
        }
    }
}
