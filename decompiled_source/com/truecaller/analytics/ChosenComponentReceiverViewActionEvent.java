package com.truecaller.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ChosenComponentReceiverViewActionEvent extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public cd3.bar c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        android.os.Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey("android.intent.extra.CHOSEN_COMPONENT")) {
            android.os.Parcelable parcelable = extras.getParcelable("android.intent.extra.CHOSEN_COMPONENT");
            kotlin.jvm.internal.Intrinsics.e(parcelable, "null cannot be cast to non-null type android.content.ComponentName");
            android.content.ComponentName componentName = (android.content.ComponentName) parcelable;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            java.lang.String string = extras.getString("EXTRA_ANALYTICS_ACTION", null);
            if (string == null) {
                return;
            }
            rc0.b p = uf.qux.p(string, "action", string, componentName.getPackageName(), extras.getString("EXTRA_ANALYTICS_CONTEXT", null));
            cd3.bar barVar = this.c;
            if (barVar != null) {
                java.lang.Object obj = barVar.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                nc0.u1.e(p, (nc0.bar) obj);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("analytics");
            throw null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = ((tx.w) ((nc0.o) o40.bar.k(context))).H.b.a.Y;
                        this.a = true;
                    }
                } finally {
                }
            }
        }
        a(context, intent);
    }
}
