package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class u implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.messaging.notifications.w b;
    public final /* synthetic */ com.truecaller.messaging.data.types.Conversation c;
    public final /* synthetic */ com.truecaller.messaging.data.types.Message d;

    public /* synthetic */ u(com.truecaller.messaging.notifications.w wVar, com.truecaller.messaging.data.types.Conversation conversation, com.truecaller.messaging.data.types.Message message, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i) {
        this.a = i;
        this.b = wVar;
        this.c = conversation;
        this.d = message;
    }

    public final java.lang.Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.r(this.c, this.d);
            case 1:
                return this.b.r(this.c, this.d);
            default:
                com.truecaller.messaging.notifications.w wVar = this.b;
                we1.a aVar = wVar.y;
                int i = this.c.O;
                y12.a0 a0Var = wVar.k;
                s62.g gVar = wVar.d;
                com.truecaller.messaging.data.types.Message message = this.d;
                kf.b bVar = new kf.b(message, a0Var, gVar);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "smartNotificationsHelper");
                return (zt1.baz) fg3.h0.O(kotlin.coroutines.d.a, new bu1.e(aVar, message, i, bVar, (df3.bar) null));
        }
    }

    public /* synthetic */ u(com.truecaller.messaging.notifications.w wVar, com.truecaller.messaging.data.types.Message message, com.truecaller.messaging.data.types.Conversation conversation) {
        this.a = 2;
        this.b = wVar;
        this.d = message;
        this.c = conversation;
    }
}
