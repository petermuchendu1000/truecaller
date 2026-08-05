package com.truecaller.call_assistant.core.callui.ui.notification.ongoing;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class NotificationActionReceiver extends android.content.BroadcastReceiver {
    public rn0.bar a;

    public final rn0.bar a() {
        rn0.bar barVar = this.a;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("callManager");
        throw null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (context != null && intent != null) {
            this.a = (rn0.bar) ((rn0.b0) mk.m.w(context).a).C.get();
            java.lang.String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1854484206) {
                    if (hashCode != -1084249658) {
                        if (hashCode == -926643158 && action.equals("com.truecaller.assistant.ongoing.ACTION_HANG_UP")) {
                            com.truecaller.call_assistant.core.callui.c cVar = (com.truecaller.call_assistant.core.callui.c) a();
                            if (cVar.x.a()) {
                                cVar.C.reset();
                            } else {
                                com.truecaller.call_assistant.core.callui.c.q(cVar, "answered", null);
                            }
                            ak.r0.l(context);
                            return;
                        }
                        return;
                    }
                    if (action.equals("com.truecaller.assistant.ongoing.ACTION_TOGGLE_MUTE")) {
                        ((com.truecaller.call_assistant.core.callui.c) a()).b(!((com.truecaller.call_assistant.core.callui.c) a()).C.c());
                        return;
                    }
                    return;
                }
                if (action.equals("com.truecaller.assistant.ongoing.ACTION_TOGGLE_SPEAKER")) {
                    ((com.truecaller.call_assistant.core.callui.c) a()).i(!((com.truecaller.call_assistant.core.callui.c) a()).C.d());
                }
            }
        }
    }
}
