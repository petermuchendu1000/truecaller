package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class u1 {
    public final android.content.Context a;
    public final t41.t b;
    public final w82.q1 c;
    public final com.truecaller.bottombar.BottomBarButtonType d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public u1(android.content.Context context, m03.s sVar, t41.t tVar, tf2.l0 l0Var, w82.q1 q1Var, jq2.qux quxVar) {
        com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "phoneNumberHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l0Var, "premiumPurchaseSupportedCheck");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(q1Var, "premiumStateSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "generalSettings");
        this.a = context;
        this.b = tVar;
        this.c = q1Var;
        boolean z = false;
        if (((d13.qux) quxVar).C("default_tab_on_launch", 0) == 0) {
            bottomBarButtonType = com.truecaller.bottombar.BottomBarButtonType.CALLS;
        } else {
            bottomBarButtonType = com.truecaller.bottombar.BottomBarButtonType.MESSAGES;
        }
        this.d = bottomBarButtonType;
        if (sVar.b() && l0Var.a()) {
            z = true;
        }
        this.e = z;
        this.f = !((w82.r1) q1Var).G();
    }
}
