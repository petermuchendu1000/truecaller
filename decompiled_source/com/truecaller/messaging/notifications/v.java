package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.messaging.notifications.w b;
    public final /* synthetic */ com.truecaller.messaging.data.types.Message c;

    public /* synthetic */ v(com.truecaller.messaging.notifications.w wVar, com.truecaller.messaging.data.types.Message message, int i) {
        this.a = i;
        this.b = wVar;
        this.c = message;
    }

    public final java.lang.Object invoke() {
        switch (this.a) {
            case 0:
                return java.lang.Boolean.valueOf(this.b.q(this.c));
            default:
                return java.lang.Boolean.valueOf(this.b.q(this.c));
        }
    }
}
