package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class p implements f.baz {
    public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.details.Hilt_CallRecordingDetailsActivity a;

    public p(com.truecaller.cloudtelephony.callrecording.ui.details.Hilt_CallRecordingDetailsActivity hilt_CallRecordingDetailsActivity) {
        this.a = hilt_CallRecordingDetailsActivity;
    }

    public final void a(androidx.activity.ComponentActivity componentActivity) {
        com.truecaller.cloudtelephony.callrecording.ui.details.Hilt_CallRecordingDetailsActivity hilt_CallRecordingDetailsActivity = this.a;
        if (!hilt_CallRecordingDetailsActivity.c0) {
            hilt_CallRecordingDetailsActivity.c0 = true;
            com.truecaller.cloudtelephony.callrecording.ui.details.f fVar = (com.truecaller.cloudtelephony.callrecording.ui.details.f) hilt_CallRecordingDetailsActivity.X3();
            com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity = (com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) hilt_CallRecordingDetailsActivity;
            tx.e eVar = (tx.e) fVar;
            callRecordingDetailsActivity.d0 = (tx.a) eVar.I.get();
            eVar.k();
            tx.w wVar = eVar.f;
            callRecordingDetailsActivity.e0 = (u03.i0) wVar.b.Q1.get();
            callRecordingDetailsActivity.f0 = (qo1.f) wVar.X5.get();
        }
    }
}
