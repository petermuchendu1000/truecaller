package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ReactionBroadcastReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public xd0.qux c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (xd0.qux) ((com.truecaller.messaging.notifications.a0) o40.bar.k(context)).H.b.a.vg.get();
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
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (context != null && intent != null) {
            java.lang.String action = intent.getAction();
            if (action != null && action.hashCode() == 545703614 && action.equals("com.truecaller.mark_as_seen")) {
                long[] longArrayExtra = intent.getLongArrayExtra("message_ids");
                if (longArrayExtra != null) {
                    xd0.qux quxVar = this.c;
                    if (quxVar != null) {
                        ((f42.d0) quxVar.a()).i(longArrayExtra);
                        return;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("imReactionManagerRef");
                        throw null;
                    }
                }
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            throw new java.lang.RuntimeException(bar.t("Unknown action ", intent.getAction(), " in onReceive"));
        }
    }
}
