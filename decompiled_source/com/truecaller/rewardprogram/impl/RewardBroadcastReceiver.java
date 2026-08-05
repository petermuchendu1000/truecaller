package com.truecaller.rewardprogram.impl;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RewardBroadcastReceiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int i = 0;
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public kr0.o c;
    public hx1.b d;
    public wk2.c e;
    public wk2.o f;
    public wk2.o g;
    public s62.d h;

    public static final java.lang.Object a(com.truecaller.rewardprogram.impl.RewardBroadcastReceiver rewardBroadcastReceiver, android.content.Intent intent, kotlin.jvm.functions.Function2 function2, ff3.g gVar) {
        long longExtra = intent.getLongExtra("extra_level", -1L);
        if (longExtra == -1) {
            qb.qux.v("Received Intent with invalid level. action: ", intent.getAction());
            return kotlin.Unit.a;
        }
        java.lang.Object invoke = function2.invoke(new java.lang.Long(longExtra), gVar);
        if (invoke == ef3.bar.a) {
            return invoke;
        }
        return kotlin.Unit.a;
    }

    public final void b(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        ((ik2.n) o40.bar.k(context)).n2(this);
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
        java.lang.String action;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        b(context, intent);
        if (context != null && intent != null && intent.getAction() != null && (action = intent.getAction()) != null) {
            df3.bar barVar = null;
            switch (action.hashCode()) {
                case -981522823:
                    if (action.equals("action_send_notification")) {
                        yy.baz.s(this, kotlin.coroutines.d.a, new ik2.m(this, intent, barVar, 0));
                        return;
                    }
                    return;
                case -14972975:
                    if (action.equals("action_send_last_call_notification")) {
                        yy.baz.s(this, kotlin.coroutines.d.a, new ik2.m(this, intent, barVar, 2));
                        return;
                    }
                    return;
                case 442345608:
                    if (action.equals("action_progress_threshold_notification")) {
                        yy.baz.s(this, kotlin.coroutines.d.a, new ik2.m(intent, this, null));
                        return;
                    }
                    return;
                case 1295607163:
                    if (action.equals("action_send_last_chance_notification")) {
                        yy.baz.s(this, kotlin.coroutines.d.a, new ik2.m(this, intent, barVar, 1));
                        return;
                    }
                    return;
                case 1548495962:
                    if (action.equals("action_suppress_join_program_notification")) {
                        yy.baz.s(this, kotlin.coroutines.d.a, new ik2.k(this, barVar, 1));
                        return;
                    }
                    return;
                case 1693231357:
                    if (action.equals("action_send_points_limit_notification")) {
                        yy.baz.s(this, kotlin.coroutines.d.a, new ik2.k(this, barVar, 2));
                        return;
                    }
                    return;
                case 1815605843:
                    if (action.equals("action_cleanup_reward")) {
                        yy.baz.s(this, kotlin.coroutines.d.a, new ik2.k(this, barVar, 0));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
