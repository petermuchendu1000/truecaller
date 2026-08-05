package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class bar implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity b;

    public /* synthetic */ bar(com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity, int i) {
        this.a = i;
        this.b = callRecordingDetailsActivity;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity, android.content.Context, android.app.Activity] */
    public final java.lang.Object invoke() {
        int i = this.a;
        ?? r5 = this.b;
        switch (i) {
            case 0:
                int i2 = com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity.r0;
                android.os.Parcelable parcelableExtra = r5.getIntent().getParcelableExtra("extra_call_recording");
                if (parcelableExtra != null) {
                    return (com.truecaller.cloudtelephony.callrecording.data.CallRecording) parcelableExtra;
                }
                throw new java.lang.IllegalArgumentException("Required value was null.");
            case 1:
                int i3 = com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity.r0;
                com.truecaller.common.ui.avatar.AvatarXConfig parcelableExtra2 = r5.getIntent().getParcelableExtra("extra_avatar_x_config");
                if (parcelableExtra2 != null) {
                    return parcelableExtra2;
                }
                throw new java.lang.IllegalArgumentException("Required value was null.");
            case 2:
                int i4 = com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity.r0;
                return java.lang.Boolean.valueOf(r5.getIntent().getBooleanExtra("extra_open_summary_tab", false));
            case 3:
                int i5 = com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity.r0;
                return new w31.c(new u03.g0((android.content.Context) r5), 0);
            case 4:
                int i6 = com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity.r0;
                com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity = this.b;
                androidx.fragment.app.g1 supportFragmentManager = callRecordingDetailsActivity.getSupportFragmentManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = callRecordingDetailsActivity.g0;
                if (nVar != null) {
                    u03.i0 i0Var = callRecordingDetailsActivity.e0;
                    if (i0Var != null) {
                        qo1.f fVar = callRecordingDetailsActivity.f0;
                        if (fVar != null) {
                            return new p01.bar(callRecordingDetailsActivity, supportFragmentManager, nVar, i0Var, fVar, null);
                        }
                        kotlin.jvm.internal.Intrinsics.n("inventory");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("toastUtil");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("presenter");
                throw null;
            default:
                com.truecaller.cloudtelephony.callrecording.ui.details.n nVar2 = r5.g0;
                if (nVar2 != null) {
                    com.truecaller.cloudtelephony.callrecording.ui.details.g gVar = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar2).a;
                    if (gVar != null) {
                        com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity2 = (com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar;
                        androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat = callRecordingDetailsActivity2.t0().b.b;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "getRoot(...)");
                        linearLayoutCompat.setVisibility(8);
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = callRecordingDetailsActivity2.t0().c;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "audioPlayerView");
                        gj.m.j0(constraintLayout);
                    }
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("presenter");
                throw null;
        }
    }
}
