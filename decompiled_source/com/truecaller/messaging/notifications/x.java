package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class x implements xd0.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ x(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onResult(java.lang.Object obj) {
        int i = this.a;
        java.lang.Object obj2 = this.b;
        switch (i) {
            case 0:
                com.truecaller.messaging.notifications.NotificationBroadcastReceiver notificationBroadcastReceiver = (com.truecaller.messaging.notifications.NotificationBroadcastReceiver) obj2;
                com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) obj;
                if (message != null) {
                    ((e42.w) notificationBroadcastReceiver.k).l(message);
                    return;
                } else {
                    int i2 = com.truecaller.messaging.notifications.NotificationBroadcastReceiver.o;
                    notificationBroadcastReceiver.getClass();
                    return;
                }
            case 1:
                m12.l lVar = (m12.l) obj2;
                java.util.Map map = (java.util.Map) obj;
                if (map != null) {
                    m12.k kVar = (m12.k) ((com.truecaller.sdk.bar) lVar).a;
                    if (kVar != null) {
                        m12.i iVar = (m12.i) kVar;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "reactions");
                        androidx.recyclerview.widget.RecyclerView recyclerView = iVar.a6().g;
                        android.content.Context requireContext = iVar.requireContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        u03.f0 f0Var = iVar.j;
                        if (f0Var != null) {
                            xz1.q qVar = iVar.k;
                            if (qVar != null) {
                                recyclerView.setAdapter(new ao.q(requireContext, f0Var, qVar, map));
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("messageSettings");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("resourceProvider");
                            throw null;
                        }
                    }
                    m12.k kVar2 = (m12.k) ((com.truecaller.sdk.bar) lVar).a;
                    if (kVar2 != null) {
                        boolean isEmpty = map.isEmpty();
                        m12.i iVar2 = (m12.i) kVar2;
                        androidx.recyclerview.widget.RecyclerView recyclerView2 = iVar2.a6().g;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvReactions");
                        gj.m.k0(recyclerView2, !isEmpty);
                        android.widget.TextView textView = iVar2.a6().c;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "emptyViewReactions");
                        gj.m.k0(textView, isEmpty);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                m42.e eVar = (m42.e) obj2;
                if (eVar.b.q(eVar.o.a())) {
                    ((xz1.r) eVar.f).e0("defaultSmsAppTimestamp", f63.qux.k());
                    return;
                }
                return;
            case 3:
                ((xz1.r) ((xz1.q) ((u42.bar) obj2).b.get())).c0("shouldMigrateSmartCategoryMessages", false);
                return;
            case 4:
                com.truecaller.notifications.MissedCallsNotificationActionReceiver missedCallsNotificationActionReceiver = (com.truecaller.notifications.MissedCallsNotificationActionReceiver) obj2;
                uu0.qux quxVar = (uu0.baz) obj;
                if (quxVar == null) {
                    int i3 = com.truecaller.notifications.MissedCallsNotificationActionReceiver.l;
                    return;
                }
                com.truecaller.calling.missedcallreminder.baz bazVar = missedCallsNotificationActionReceiver.f;
                if (bazVar != null) {
                    while (quxVar.moveToNext()) {
                        try {
                            com.truecaller.data.entity.HistoryEvent d = quxVar.d();
                            if (d != null) {
                                bazVar.f(d);
                            }
                        } catch (java.lang.Throwable th) {
                            try {
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                i71.g.r(quxVar, th);
                                throw th2;
                            }
                        }
                    }
                    kotlin.Unit unit = kotlin.Unit.a;
                    quxVar.close();
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("missedCallReminderManager");
                throw null;
            case 5:
                ((kotlin.jvm.functions.Function0) obj2).invoke();
                return;
            default:
                y22.k kVar3 = (y22.k) obj2;
                if (((java.lang.Boolean) obj) != null) {
                    kVar3.invoke();
                    return;
                }
                return;
        }
    }
}
