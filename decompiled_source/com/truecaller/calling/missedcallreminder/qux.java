package com.truecaller.calling.missedcallreminder;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver y;
    public final /* synthetic */ com.truecaller.calling.missedcallreminder.MissedCallReminder z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qux(com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver missedCallReminderNotificationReceiver, com.truecaller.calling.missedcallreminder.MissedCallReminder missedCallReminder, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.y = missedCallReminderNotificationReceiver;
        this.z = missedCallReminder;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.calling.missedcallreminder.qux(this.y, this.z, barVar, 0);
            case 1:
                return new com.truecaller.calling.missedcallreminder.qux(this.y, this.z, barVar, 1);
            default:
                return new com.truecaller.calling.missedcallreminder.qux(this.y, this.z, barVar, 2);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        com.truecaller.calling.missedcallreminder.MissedCallReminder missedCallReminder = this.z;
        com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver missedCallReminderNotificationReceiver = this.y;
        switch (i) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                qc3.bar barVar2 = missedCallReminderNotificationReceiver.f;
                if (barVar2 != null) {
                    com.truecaller.calling.missedcallreminder.baz bazVar = (com.truecaller.calling.missedcallreminder.baz) barVar2.get();
                    java.lang.String str = missedCallReminder.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "normalizedNumber");
                    bazVar.b(str);
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("reminderManager");
                throw null;
            case 1:
                ef3.bar barVar3 = ef3.bar.a;
                od.p.E(obj);
                qc3.bar barVar4 = missedCallReminderNotificationReceiver.f;
                if (barVar4 != null) {
                    com.truecaller.calling.missedcallreminder.baz bazVar2 = (com.truecaller.calling.missedcallreminder.baz) barVar4.get();
                    java.lang.String str2 = missedCallReminder.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "normalizedNumber");
                    bazVar2.b(str2);
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("reminderManager");
                throw null;
            default:
                ef3.bar barVar5 = ef3.bar.a;
                od.p.E(obj);
                qc3.bar barVar6 = missedCallReminderNotificationReceiver.h;
                if (barVar6 != null) {
                    ((s62.d) barVar6.get()).a(missedCallReminder.d, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationMissedCallReminder");
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("systemNotificationManager");
                throw null;
        }
    }
}
