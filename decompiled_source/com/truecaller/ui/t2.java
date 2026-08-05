package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class t2 {
    public final kotlin.coroutines.CoroutineContext a;
    public final kotlin.coroutines.CoroutineContext b;
    public final o02.baz c;
    public final qc3.bar d;
    public final p.c3 e;
    public final ej.b f;
    public final fe3.bar g;
    public final fe3.bar h;

    public t2(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, o02.baz bazVar, qc3.bar barVar, p.c3 c3Var, ej.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "asyncContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "premiumBlockingFeaturesLostNotifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "friendUpgradedNotifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3Var, "consumablePurchaseLostNotifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "usersHomeNotificationChecker");
        this.a = coroutineContext;
        this.b = coroutineContext2;
        this.c = bazVar;
        this.d = barVar;
        this.e = c3Var;
        this.f = bVar;
        this.g = z0.a0.c(coroutineContext);
        this.h = z0.a0.c(coroutineContext2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.truecaller.ui.t2 t2Var, java.lang.ref.WeakReference weakReference, ff3.qux quxVar) {
        com.truecaller.ui.s2 s2Var;
        int i;
        com.truecaller.ui.r2 r2Var;
        if (quxVar instanceof com.truecaller.ui.s2) {
            s2Var = (com.truecaller.ui.s2) quxVar;
            int i2 = s2Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s2Var.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = s2Var.y;
                ef3.bar barVar = ef3.bar.a;
                i = s2Var.A;
                if (i == 0) {
                    if (i == 1) {
                        weakReference = s2Var.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ej.b bVar = t2Var.f;
                    s2Var.x = weakReference;
                    s2Var.A = 1;
                    obj = fg3.h0.W((kotlin.coroutines.CoroutineContext) bVar.b, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f0(bVar, (df3.bar) null, 1), s2Var);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                int intValue = ((java.lang.Number) obj).intValue();
                r2Var = (com.truecaller.ui.r2) weakReference.get();
                if (r2Var != null) {
                    fg3.h0.J(t2Var.h, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.call_assistant.presentation.disable.c(r2Var, intValue, (df3.bar) null, 8), 3);
                }
                return kotlin.Unit.a;
            }
        }
        s2Var = new com.truecaller.ui.s2(t2Var, quxVar);
        java.lang.Object obj2 = s2Var.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = s2Var.A;
        if (i == 0) {
        }
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r2Var = (com.truecaller.ui.r2) weakReference.get();
        if (r2Var != null) {
        }
        return kotlin.Unit.a;
    }
}
