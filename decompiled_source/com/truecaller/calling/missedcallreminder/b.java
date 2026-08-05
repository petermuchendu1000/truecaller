package com.truecaller.calling.missedcallreminder;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver missedCallReminderNotificationReceiver, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.y = missedCallReminderNotificationReceiver;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.calling.missedcallreminder.b(this.y, barVar, 0);
            default:
                return new com.truecaller.calling.missedcallreminder.b(this.y, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver missedCallReminderNotificationReceiver = this.y;
        switch (i) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                ak.r0.l(missedCallReminderNotificationReceiver.a());
                return kotlin.Unit.a;
            default:
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                android.widget.Toast.makeText(missedCallReminderNotificationReceiver.a(), 2132018237, 0).show();
                return kotlin.Unit.a;
        }
    }
}
