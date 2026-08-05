package com.truecaller.messaging.sharing;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class bar implements f.baz {
    public final /* synthetic */ com.truecaller.messaging.sharing.Hilt_SharingActivity a;

    public bar(com.truecaller.messaging.sharing.Hilt_SharingActivity hilt_SharingActivity) {
        this.a = hilt_SharingActivity;
    }

    public final void a(androidx.activity.ComponentActivity componentActivity) {
        com.truecaller.messaging.sharing.Hilt_SharingActivity hilt_SharingActivity = this.a;
        if (!hilt_SharingActivity.c0) {
            hilt_SharingActivity.c0 = true;
            tx.e eVar = (com.truecaller.messaging.sharing.baz) hilt_SharingActivity.X3();
            bd3.qux quxVar = (android.app.Activity) eVar.i.a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "activity");
            android.content.Intent intent = ((com.truecaller.messaging.sharing.SharingActivity) ((com.truecaller.messaging.sharing.qux) quxVar)).getIntent();
            es.baz.l(intent);
            ((com.truecaller.messaging.sharing.SharingActivity) hilt_SharingActivity).d0 = new ac0.qux(intent, (t41.t) eVar.f.A1.get());
        }
    }
}
