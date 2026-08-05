package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class z implements f.baz {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity b;

    public /* synthetic */ z(androidx.appcompat.app.AppCompatActivity appCompatActivity, int i) {
        this.a = i;
        this.b = appCompatActivity;
    }

    public final void a(androidx.activity.ComponentActivity componentActivity) {
        switch (this.a) {
            case 0:
                com.truecaller.ui.Hilt_CallMeBackActivity hilt_CallMeBackActivity = (com.truecaller.ui.Hilt_CallMeBackActivity) this.b;
                if (!hilt_CallMeBackActivity.c0) {
                    hilt_CallMeBackActivity.c0 = true;
                    tx.e eVar = (com.truecaller.ui.c) hilt_CallMeBackActivity.X3();
                    com.truecaller.ui.CallMeBackActivity callMeBackActivity = (com.truecaller.ui.CallMeBackActivity) hilt_CallMeBackActivity;
                    tx.w wVar = eVar.f;
                    callMeBackActivity.e0 = (nc0.bar) wVar.Y.get();
                    callMeBackActivity.f0 = (nv0.c) wVar.R7.get();
                    callMeBackActivity.g0 = (n11.g) wVar.F1.get();
                    tx.w wVar2 = wVar.b.a;
                    callMeBackActivity.h0 = new bm.e(cd3.baz.a(wVar2.A1), cd3.baz.a(wVar2.Sg), cd3.baz.a(wVar2.h1), cd3.baz.a(wVar2.m9), cd3.baz.a(wVar2.y3), (u03.b0) wVar2.v4.get(), (kotlin.coroutines.CoroutineContext) wVar2.P.get(), (kotlin.coroutines.CoroutineContext) wVar2.V1.get(), (qo1.k) wVar2.v0.get());
                    callMeBackActivity.i0 = wVar.U();
                    callMeBackActivity.j0 = (u03.f0) wVar.q9.get();
                    callMeBackActivity.k0 = cd3.baz.a(wVar.S1);
                    return;
                }
                return;
            case 1:
                com.truecaller.ui.Hilt_FeedbackDialogActivity hilt_FeedbackDialogActivity = (com.truecaller.ui.Hilt_FeedbackDialogActivity) this.b;
                if (!hilt_FeedbackDialogActivity.c0) {
                    hilt_FeedbackDialogActivity.c0 = true;
                    ((com.truecaller.ui.FeedbackDialogActivity) hilt_FeedbackDialogActivity).f0 = (nc0.bar) ((com.truecaller.ui.k) hilt_FeedbackDialogActivity.X3()).f.Y.get();
                    return;
                }
                return;
            case 2:
                ((com.truecaller.ui.Hilt_FragmentActivityBase) this.b).t0();
                return;
            case 3:
                com.truecaller.ui.Hilt_ContactsActivity hilt_ContactsActivity = (com.truecaller.ui.Hilt_ContactsActivity) this.b;
                if (!hilt_ContactsActivity.c0) {
                    hilt_ContactsActivity.c0 = true;
                    tx.e eVar2 = (com.truecaller.ui.d) hilt_ContactsActivity.X3();
                    com.truecaller.ui.ContactsActivity contactsActivity = (com.truecaller.ui.ContactsActivity) hilt_ContactsActivity;
                    tx.e eVar3 = eVar2;
                    tx.w wVar3 = eVar3.f;
                    contactsActivity.d0 = (s03.bar) wVar3.u9.get();
                    contactsActivity.e0 = (nc0.bar) wVar3.Y.get();
                    cd3.baz.a(eVar3.O0);
                    contactsActivity.f0 = cd3.baz.a(wVar3.t9);
                    return;
                }
                return;
            case 4:
                com.truecaller.ui.Hilt_DialerShortcutActivity hilt_DialerShortcutActivity = (com.truecaller.ui.Hilt_DialerShortcutActivity) this.b;
                if (!hilt_DialerShortcutActivity.c0) {
                    hilt_DialerShortcutActivity.c0 = true;
                    ((com.truecaller.ui.DialerShortcutActivity) hilt_DialerShortcutActivity).d0 = (s03.bar) ((com.truecaller.ui.f) hilt_DialerShortcutActivity.X3()).f.u9.get();
                    return;
                }
                return;
            case 5:
                com.truecaller.ui.Hilt_DrawOverlayPermissionActivity hilt_DrawOverlayPermissionActivity = (com.truecaller.ui.Hilt_DrawOverlayPermissionActivity) this.b;
                if (!hilt_DrawOverlayPermissionActivity.c0) {
                    hilt_DrawOverlayPermissionActivity.c0 = true;
                    tx.e eVar4 = (com.truecaller.ui.i) hilt_DrawOverlayPermissionActivity.X3();
                    return;
                }
                return;
            case 6:
                ((com.truecaller.ui.Hilt_FeedbackFormActivity) this.b).t0();
                return;
            case 7:
                com.truecaller.ui.Hilt_NotificationAccessActivity hilt_NotificationAccessActivity = (com.truecaller.ui.Hilt_NotificationAccessActivity) this.b;
                if (!hilt_NotificationAccessActivity.j0) {
                    hilt_NotificationAccessActivity.j0 = true;
                    tx.e eVar5 = (com.truecaller.ui.f0) hilt_NotificationAccessActivity.X3();
                    com.truecaller.ui.NotificationAccessActivity notificationAccessActivity = (com.truecaller.ui.NotificationAccessActivity) hilt_NotificationAccessActivity;
                    tx.w wVar4 = eVar5.f;
                    notificationAccessActivity.a0 = (u62.b) wVar4.Vb.get();
                    notificationAccessActivity.b0 = wVar4.k3();
                    notificationAccessActivity.c0 = (u03.z) wVar4.M.get();
                    return;
                }
                return;
            default:
                ((com.truecaller.ui.Hilt_TruecallerInit) this.b).t0();
                return;
        }
    }
}
