package com.truecaller.sdk;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class d extends android.os.CountDownTimer {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(long j, java.lang.Object obj, int i) {
        super(j, 1000L);
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        int i = this.a;
        java.lang.Object obj = this.b;
        switch (i) {
            case 0:
                com.truecaller.sdk.BottomSheetConfirmProfileActivity bottomSheetConfirmProfileActivity = (com.truecaller.sdk.BottomSheetConfirmProfileActivity) obj;
                if (bottomSheetConfirmProfileActivity.h0) {
                    androidx.appcompat.widget.AppCompatImageView appCompatImageView = bottomSheetConfirmProfileActivity.t0().b.u;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivBanner");
                    gj.m.f0(appCompatImageView);
                    android.widget.Space space = (android.widget.Space) bottomSheetConfirmProfileActivity.t0().b.l;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(space, "bannerDivider");
                    gj.m.f0(space);
                    com.truecaller.sdk.g gVar = (com.truecaller.sdk.g) bottomSheetConfirmProfileActivity.u0();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("failure", "status");
                    gVar.n2().s("failure");
                    return;
                }
                if (bottomSheetConfirmProfileActivity.g0) {
                    androidx.appcompat.widget.AppCompatImageView appCompatImageView2 = bottomSheetConfirmProfileActivity.t0().b.u;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "ivBanner");
                    gj.m.j0(appCompatImageView2);
                    android.widget.Space space2 = (android.widget.Space) bottomSheetConfirmProfileActivity.t0().b.l;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(space2, "bannerDivider");
                    gj.m.j0(space2);
                    com.truecaller.sdk.g gVar2 = (com.truecaller.sdk.g) bottomSheetConfirmProfileActivity.u0();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("shown", "status");
                    gVar2.n2().s("shown");
                    return;
                }
                androidx.appcompat.widget.AppCompatImageView appCompatImageView3 = bottomSheetConfirmProfileActivity.t0().b.u;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "ivBanner");
                gj.m.f0(appCompatImageView3);
                android.widget.Space space3 = (android.widget.Space) bottomSheetConfirmProfileActivity.t0().b.l;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(space3, "bannerDivider");
                gj.m.f0(space3);
                com.truecaller.sdk.g gVar3 = (com.truecaller.sdk.g) bottomSheetConfirmProfileActivity.u0();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("timeout", "status");
                gVar3.n2().s("timeout");
                return;
            case 1:
                int i2 = com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver.f;
                ((com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver) obj).a();
                return;
            case 2:
                fp2.baz bazVar = (fp2.baz) obj;
                bazVar.a(0, 17);
                androidx.appcompat.app.AppCompatActivity appCompatActivity = bazVar.d;
                if (appCompatActivity != null) {
                    appCompatActivity.j0();
                    return;
                }
                return;
            case 3:
                h10.y yVar = (h10.y) obj;
                androidx.constraintlayout.widget.ConstraintLayout nativeTimerView = yVar.getNativeTimerView();
                if (nativeTimerView != null) {
                    gj.m.f0(nativeTimerView);
                }
                h10.o nativeAd = yVar.getNativeAd();
                if (nativeAd != null) {
                    yVar.o(nativeAd, true);
                    nativeAd.r("auto_cte", (java.lang.String) null);
                    return;
                }
                return;
            case 4:
                ((h10.a2) obj).a();
                return;
            case 5:
                ((com.truecaller.details_view.ui.ads.DetailsOverlayAdView) obj).h = 0L;
                return;
            case 6:
                ((k92.j) obj).U();
                return;
            default:
                com.truecaller.sdk.oAuth.view.consentScreen.BottomSheetOAuthActivity bottomSheetOAuthActivity = (com.truecaller.sdk.oAuth.view.consentScreen.BottomSheetOAuthActivity) obj;
                if (bottomSheetOAuthActivity.i0) {
                    androidx.appcompat.widget.AppCompatImageView appCompatImageView4 = bottomSheetOAuthActivity.u0().c.g;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "ivBanner");
                    gj.m.f0(appCompatImageView4);
                    yo2.qux quxVar = bottomSheetOAuthActivity.e0;
                    if (quxVar != null) {
                        quxVar.k2("failure");
                        return;
                    }
                    return;
                }
                if (bottomSheetOAuthActivity.h0) {
                    androidx.appcompat.widget.AppCompatImageView appCompatImageView5 = bottomSheetOAuthActivity.u0().c.g;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView5, "ivBanner");
                    gj.m.j0(appCompatImageView5);
                    yo2.qux quxVar2 = bottomSheetOAuthActivity.e0;
                    if (quxVar2 != null) {
                        quxVar2.k2("shown");
                        return;
                    }
                    return;
                }
                androidx.appcompat.widget.AppCompatImageView appCompatImageView6 = bottomSheetOAuthActivity.u0().c.g;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView6, "ivBanner");
                gj.m.f0(appCompatImageView6);
                yo2.qux quxVar3 = bottomSheetOAuthActivity.e0;
                if (quxVar3 != null) {
                    quxVar3.k2("timeout");
                    return;
                }
                return;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        android.widget.TextView timerText;
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                long j2 = j / 1000;
                if (j2 > 0 && (timerText = ((h10.y) this.b).getTimerText()) != null) {
                    timerText.setText(java.lang.String.valueOf(j2));
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                com.truecaller.details_view.ui.ads.DetailsOverlayAdView detailsOverlayAdView = (com.truecaller.details_view.ui.ads.DetailsOverlayAdView) this.b;
                detailsOverlayAdView.h = j;
                long j3 = 1000;
                int i = (int) (detailsOverlayAdView.i / j3);
                int i2 = (int) ((j / j3) + 1);
                if (i2 <= i) {
                    i = i2;
                }
                com.truecaller.details_view.ui.ads.DetailsOverlayAdView.f(detailsOverlayAdView).setText(java.lang.String.valueOf(i));
                return;
            case 6:
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(java.lang.Object obj, long j, int i) {
        super(j, 1000L);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.jvm.internal.i0 i0Var, fp2.baz bazVar) {
        super(i0Var.a, 1000L);
        this.a = 2;
        this.b = bazVar;
    }

    private final void a(long j) {
    }

    private final void b(long j) {
    }

    private final void c(long j) {
    }

    private final void d(long j) {
    }

    private final void e(long j) {
    }

    private final void f(long j) {
    }
}
