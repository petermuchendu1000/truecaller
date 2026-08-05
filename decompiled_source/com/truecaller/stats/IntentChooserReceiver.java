package com.truecaller.stats;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class IntentChooserReceiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int d = 0;
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public nc0.bar c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (nc0.bar) ((vt2.baz) o40.bar.k(context)).H.b.a.Y.get();
                        this.a = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [hi3.e, qx2.tf] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.content.ComponentName componentName;
        com.truecaller.ui.UserHomeStats userHomeStats;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        android.os.Parcelable parcelable = (android.os.Parcelable) g6.b.g(intent, "android.intent.extra.CHOSEN_COMPONENT", android.content.ComponentName.class);
        if (parcelable instanceof android.content.ComponentName) {
            componentName = (android.content.ComponentName) parcelable;
        } else {
            componentName = null;
        }
        if (componentName != null) {
            android.os.Parcelable parcelable2 = (android.os.Parcelable) g6.b.g(intent, "extra_user_stats", com.truecaller.ui.UserHomeStats.class);
            if (parcelable2 instanceof com.truecaller.ui.UserHomeStats) {
                userHomeStats = (com.truecaller.ui.UserHomeStats) parcelable2;
            } else {
                userHomeStats = null;
            }
            if (userHomeStats == null) {
                return;
            }
            ?? eVar = new hi3.e(qx2.uf.k, qx2.uf.l);
            java.lang.String value = com.truecaller.ui.StatsType.SHARE.getValue();
            bi3.j0[] j0VarArr = ((hi3.e) eVar).b;
            hi3.e.d(j0VarArr[2], value);
            eVar.e = value;
            boolean[] zArr = ((hi3.e) eVar).c;
            zArr[2] = true;
            java.lang.String str = userHomeStats.a;
            hi3.e.d(j0VarArr[3], str);
            eVar.f = str;
            zArr[3] = true;
            int i = userHomeStats.b;
            bi3.j0 j0Var = j0VarArr[4];
            eVar.g = i;
            zArr[4] = true;
            int i2 = userHomeStats.c;
            bi3.j0 j0Var2 = j0VarArr[5];
            eVar.h = i2;
            zArr[5] = true;
            int i3 = userHomeStats.d;
            bi3.j0 j0Var3 = j0VarArr[6];
            eVar.i = i3;
            zArr[6] = true;
            int i4 = userHomeStats.e;
            bi3.j0 j0Var4 = j0VarArr[7];
            eVar.j = i4;
            zArr[7] = true;
            java.lang.String packageName = componentName.getPackageName();
            hi3.e.d(j0VarArr[8], packageName);
            eVar.k = packageName;
            zArr[8] = true;
            java.lang.String className = componentName.getClassName();
            hi3.e.d(j0VarArr[9], className);
            eVar.l = className;
            zArr[9] = true;
            qx2.uf e = eVar.e();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "build(...)");
            nc0.bar barVar = this.c;
            if (barVar != null) {
                j71.g.K(e, barVar);
            } else {
                kotlin.jvm.internal.Intrinsics.n("analytics");
                throw null;
            }
        }
    }
}
