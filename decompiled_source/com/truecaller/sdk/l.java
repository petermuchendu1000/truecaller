package com.truecaller.sdk;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class l implements f.baz {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity b;

    public /* synthetic */ l(androidx.appcompat.app.AppCompatActivity appCompatActivity, int i) {
        this.a = i;
        this.b = appCompatActivity;
    }

    public final void a(androidx.activity.ComponentActivity componentActivity) {
        switch (this.a) {
            case 0:
                com.truecaller.sdk.Hilt_ConfirmProfileActivity hilt_ConfirmProfileActivity = (com.truecaller.sdk.Hilt_ConfirmProfileActivity) this.b;
                if (!hilt_ConfirmProfileActivity.c0) {
                    hilt_ConfirmProfileActivity.c0 = true;
                    tx.e eVar = (com.truecaller.sdk.h) hilt_ConfirmProfileActivity.X3();
                    com.truecaller.sdk.ConfirmProfileActivity confirmProfileActivity = (com.truecaller.sdk.ConfirmProfileActivity) hilt_ConfirmProfileActivity;
                    tx.e eVar2 = eVar;
                    confirmProfileActivity.h0 = (com.truecaller.sdk.f) eVar2.r0.get();
                    confirmProfileActivity.i0 = eVar2.e0();
                    confirmProfileActivity.j0 = eVar2.f0();
                    return;
                }
                return;
            case 1:
                com.truecaller.sdk.Hilt_BottomSheetConfirmProfileActivity hilt_BottomSheetConfirmProfileActivity = (com.truecaller.sdk.Hilt_BottomSheetConfirmProfileActivity) this.b;
                if (!hilt_BottomSheetConfirmProfileActivity.c0) {
                    hilt_BottomSheetConfirmProfileActivity.c0 = true;
                    tx.e eVar3 = (com.truecaller.sdk.e) hilt_BottomSheetConfirmProfileActivity.X3();
                    com.truecaller.sdk.BottomSheetConfirmProfileActivity bottomSheetConfirmProfileActivity = (com.truecaller.sdk.BottomSheetConfirmProfileActivity) hilt_BottomSheetConfirmProfileActivity;
                    tx.e eVar4 = eVar3;
                    bottomSheetConfirmProfileActivity.d0 = (com.truecaller.sdk.f) eVar4.r0.get();
                    bottomSheetConfirmProfileActivity.f0 = eVar4.f0();
                    return;
                }
                return;
            default:
                com.truecaller.sdk.Hilt_FullScreenConfirmActivity hilt_FullScreenConfirmActivity = (com.truecaller.sdk.Hilt_FullScreenConfirmActivity) this.b;
                if (!hilt_FullScreenConfirmActivity.c0) {
                    hilt_FullScreenConfirmActivity.c0 = true;
                    tx.e eVar5 = (com.truecaller.sdk.j) hilt_FullScreenConfirmActivity.X3();
                    com.truecaller.sdk.FullScreenConfirmActivity fullScreenConfirmActivity = (com.truecaller.sdk.FullScreenConfirmActivity) hilt_FullScreenConfirmActivity;
                    tx.e eVar6 = eVar5;
                    fullScreenConfirmActivity.d0 = (com.truecaller.sdk.f) eVar6.s0.get();
                    fullScreenConfirmActivity.f0 = eVar6.e0();
                    return;
                }
                return;
        }
    }
}
