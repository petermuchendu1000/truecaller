package com.truecaller.notifications.enhancing;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class baz implements f.baz {
    public final /* synthetic */ com.truecaller.notifications.enhancing.Hilt_SourcedContactListActivity a;

    public baz(com.truecaller.notifications.enhancing.Hilt_SourcedContactListActivity hilt_SourcedContactListActivity) {
        this.a = hilt_SourcedContactListActivity;
    }

    public final void a(androidx.activity.ComponentActivity componentActivity) {
        com.truecaller.notifications.enhancing.Hilt_SourcedContactListActivity hilt_SourcedContactListActivity = this.a;
        if (!hilt_SourcedContactListActivity.c0) {
            hilt_SourcedContactListActivity.c0 = true;
            tx.e eVar = (com.truecaller.notifications.enhancing.a) hilt_SourcedContactListActivity.X3();
            com.truecaller.notifications.enhancing.SourcedContactListActivity sourcedContactListActivity = (com.truecaller.notifications.enhancing.SourcedContactListActivity) hilt_SourcedContactListActivity;
            tx.w wVar = eVar.f;
            sourcedContactListActivity.d0 = (nc0.bar) wVar.Y.get();
            sourcedContactListActivity.e0 = (u03.f0) wVar.q9.get();
            sourcedContactListActivity.f0 = (nd1.bar) wVar.dm.get();
        }
    }
}
