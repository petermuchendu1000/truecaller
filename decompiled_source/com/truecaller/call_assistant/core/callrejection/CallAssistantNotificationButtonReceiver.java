package com.truecaller.call_assistant.core.callrejection;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallAssistantNotificationButtonReceiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int e = 0;
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public javax.inject.Provider c;
    public tx.v d;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        tx.c0 c0Var = ((tx.w) ((ln0.bar) o40.bar.k(context))).H.b;
                        tx.w wVar = c0Var.a;
                        this.c = c0Var.T1;
                        this.d = wVar.j7;
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
        java.lang.String str;
        java.lang.String stringExtra;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if ("com.treucaller.callhero_assistant.button.actions.SCREEN_CALL".equals(str) && (stringExtra = intent.getStringExtra("com.treucaller.callher_assistant.button.extras.NUMBER")) != null) {
            boolean booleanExtra = intent.getBooleanExtra("com.treucaller.callher_assistant.button.extras.PHONEBOOK", false);
            tx.v vVar = this.d;
            if (vVar != null) {
                ir1.k kVar = (com.truecaller.incallui.InCallUI) vVar.get();
                com.truecaller.incallui.analytics.events.NotificationUIEvent notificationUIEvent = com.truecaller.incallui.analytics.events.NotificationUIEvent.ASSISTANT;
                ir1.k kVar2 = kVar;
                kVar2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationUIEvent, "event");
                ((jr1.baz) kVar2.b.get()).a(notificationUIEvent, ((r62.bar) kVar2.c.get()).a());
                javax.inject.Provider provider = this.c;
                if (provider != null) {
                    rr1.l0 l0Var = (rr1.l0) provider.get();
                    l0Var.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "phoneNumber");
                    rr1.i0 i0Var = l0Var.a;
                    if (i0Var != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "phoneNumber");
                        hn0.a aVar = (hn0.a) i0Var.w.get();
                        if (aVar != null) {
                            aVar.d(stringExtra, "callScreenedNotification", booleanExtra);
                            return;
                        }
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("ongoingCallHelper");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("inCallUI");
            throw null;
        }
    }
}
