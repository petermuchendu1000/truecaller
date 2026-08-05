package com.truecaller.insights.nudges.notification;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NudgeNotificationBroadcastReceiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int d = 0;
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public zr1.g c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (zr1.g) ((rw1.bar) o40.bar.k(context)).H.b.a.F8.get();
                        this.a = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        vu1.baz e;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (intent != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            com.truecaller.insights.nudges.notification.NudgeAnalyticsData nudgeAnalyticsData = (com.truecaller.insights.nudges.notification.NudgeAnalyticsData) intent.getParcelableExtra("extra_nudge_analytics_data");
            if (nudgeAnalyticsData == null) {
                e = null;
            } else {
                p.c3 g = z0.a0.g("insights_nudges", "<set-?>");
                g.a = "insights_nudges";
                g.E(nudgeAnalyticsData.getCategory());
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("dismiss", "<set-?>");
                g.e = "dismiss";
                g.F(nudgeAnalyticsData.getNormalizedSenderId());
                g.D(nudgeAnalyticsData.getTransport());
                java.util.LinkedHashMap j = kotlin.collections.r0.j(new kotlin.Pair[]{new kotlin.Pair("nudge_date", java.lang.String.valueOf(nudgeAnalyticsData.getNudgeData().i())), new kotlin.Pair("due_date", java.lang.String.valueOf(nudgeAnalyticsData.getDueDate().i()))});
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j, "<set-?>");
                g.g = j;
                we0.bar.m(g, nudgeAnalyticsData.getRawSenderId());
                e = g.e();
            }
            if (e == null) {
                return;
            }
            zr1.g gVar = this.c;
            if (gVar != null) {
                gVar.e(e);
            } else {
                kotlin.jvm.internal.Intrinsics.n("analyticsManager");
                throw null;
            }
        }
    }
}
