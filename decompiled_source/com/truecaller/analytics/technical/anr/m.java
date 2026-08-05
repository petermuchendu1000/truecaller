package com.truecaller.analytics.technical.anr;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class m {
    public final android.content.Context a;
    public final kotlin.coroutines.CoroutineContext b;
    public final u03.b c;
    public final ed0.baz d;
    public final qo1.m e;
    public final kotlin.Lazy f;
    public final java.lang.String g;
    public final b91.d h;
    public final ki.qux i;

    public m(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext, u03.b bVar, ed0.baz bazVar, qo1.m mVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "appStartProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "platformFeaturesInventory");
        this.a = context;
        this.b = coroutineContext;
        this.c = bVar;
        this.d = bazVar;
        this.e = mVar;
        this.f = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 13));
        java.lang.String packageName = context.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.g = packageName;
        this.h = new b91.d(21);
        this.i = new ki.qux(this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(2:16|(2:18|19)(2:20|(2:22|23)(9:24|25|(4:28|(3:30|31|32)(1:34)|33|26)|35|36|(2:39|37)|40|41|(1:43))))|11|12))|47|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x002a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        r11.h.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "e");
        com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(ff3.qux quxVar) {
        com.truecaller.analytics.technical.anr.l lVar;
        int i;
        android.content.Context context = this.a;
        if (quxVar instanceof com.truecaller.analytics.technical.anr.l) {
            lVar = (com.truecaller.analytics.technical.anr.l) quxVar;
            int i2 = lVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = lVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = lVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (!this.c.l(30)) {
                        return kotlin.Unit.a;
                    }
                    if (!this.e.b.a("featurePunishableAnrReporting", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                        return kotlin.Unit.a;
                    }
                    com.truecaller.log.AssertionUtil.notOnMainThread(new java.lang.String[0]);
                    java.util.List A = ah.z.A((android.app.ActivityManager) context.getSystemService(android.app.ActivityManager.class), this.g);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(A, "getHistoricalProcessExitReasons(...)");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : A) {
                        if (kotlin.jvm.internal.Intrinsics.b(ah.z.C(v6.a.e(obj2)), context.getPackageName())) {
                            arrayList.add(obj2);
                        }
                    }
                    java.util.List z0 = kotlin.collections.CollectionsKt.z0(arrayList, 5);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(z0, 10));
                    java.util.Iterator it = z0.iterator();
                    while (it.hasNext()) {
                        android.app.ApplicationExitInfo e = v6.a.e(it.next());
                        kotlin.jvm.internal.Intrinsics.d(e);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "<this>");
                        arrayList2.add(new com.truecaller.analytics.technical.anr.a(e));
                    }
                    com.truecaller.analytics.technical.anr.k kVar = new com.truecaller.analytics.technical.anr.k(arrayList2, kotlin.collections.v.h0(this.d.getAppStarts(context)), this.g, this.i, this.h);
                    lVar.z = 1;
                    if (kVar.b(lVar) == barVar) {
                        return barVar;
                    }
                }
                return kotlin.Unit.a;
            }
        }
        lVar = new com.truecaller.analytics.technical.anr.l(this, quxVar);
        java.lang.Object obj3 = lVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = lVar.z;
        if (i == 0) {
        }
        return kotlin.Unit.a;
    }
}
