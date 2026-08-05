package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class qux implements p.x1, g.bar {
    public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity a;

    public /* synthetic */ qux(com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity) {
        this.a = callRecordingDetailsActivity;
    }

    public void onActivityResult(java.lang.Object obj) {
        w21.h hVar;
        int i = com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity.r0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((androidx.activity.result.ActivityResult) obj, "it");
        com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = this.a.g0;
        if (nVar != null) {
            bd3.qux quxVar = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
            if (quxVar != null) {
                android.widget.Toast.makeText((android.content.Context) quxVar, 2132020797, 1).show();
            }
            com.truecaller.cloudtelephony.callrecording.ui.details.g gVar = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
            if (gVar != null && (hVar = ((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar).o0) != null) {
                hVar.dismiss();
            }
            com.truecaller.cloudtelephony.callrecording.ui.details.g gVar2 = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
            if (gVar2 != null) {
                ((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar2).v0();
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = this.a.g0;
        if (nVar != null) {
            fg3.h0.J(nVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.qux(menuItem.getItemId(), nVar, (df3.bar) null), 3);
            return true;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }
}
