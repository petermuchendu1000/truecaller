package com.truecaller.push;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class bar {
    public final qc3.bar a;
    public final qc3.bar b;
    public final qc3.bar c;
    public final javax.inject.Provider d;
    public final qc3.bar e;
    public final s21.baz f;
    public final qc3.bar g;
    public final p.c3 h;
    public final java.util.Set i;

    public bar(qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3, javax.inject.Provider provider, qc3.bar barVar4, s21.baz bazVar, qc3.bar barVar5, p.c3 c3Var, com.google.common.collect.ImmutableSet immutableSet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "cleverTapNotificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "imNotificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "truecallerPushNotificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "callAssistantPushHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "callRecordingPushHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "cloudTelephonyPushHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar5, "callAssistantFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3Var, "voicemailPushHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(immutableSet, "remoteMessageParsers");
        this.a = barVar;
        this.b = barVar2;
        this.c = barVar3;
        this.d = provider;
        this.e = barVar4;
        this.f = bazVar;
        this.g = barVar5;
        this.h = c3Var;
        this.i = immutableSet;
    }

    public final void a(java.util.Map map) {
        ai2.qux quxVar = (ai2.qux) this.c.get();
        synchronized (quxVar) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "payload");
            ai2.qux.class.toString();
            ai2.bar a = ai2.qux.a(map);
            if (a != null) {
                try {
                    quxVar.a.a(a);
                } catch (java.lang.RuntimeException e) {
                    o82.a.B(ai2.qux.class + " onNotification - error while handling notification", e);
                }
            }
        }
    }
}
