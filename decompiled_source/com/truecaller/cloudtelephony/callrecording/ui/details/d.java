package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class d implements c01.a {
    public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity a;

    public d(com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity) {
        this.a = callRecordingDetailsActivity;
    }

    @Override // c01.a
    public final void F2(c01.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "playbackSpeed");
        int i = com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity.r0;
        com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity = this.a;
        com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView = callRecordingDetailsActivity.t0().c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "playbackSpeed");
        androidx.media3.exoplayer.ExoPlayer exoPlayer = callRecordingAudioPlayerView.C;
        if (exoPlayer != null) {
            exoPlayer.setPlaybackSpeed(barVar.a);
            ((android.widget.TextView) callRecordingAudioPlayerView.s.e).setText(gj.m.u(barVar));
            com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = callRecordingDetailsActivity.g0;
            if (nVar != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "playbackSpeed");
                qz0.bar barVar2 = nVar.h;
                int i2 = nVar.v;
                java.lang.String str = barVar.b;
                java.lang.String str2 = nVar.j.a;
                qz0.qux quxVar = (qz0.qux) barVar2;
                quxVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "playbackSpeed");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "callId");
                quxVar.a(qz0.qux.c(i2), str, str2);
                z42.bar.M(new v03.qux("CTRecordingPlaybackSpeedChanged", (java.util.Map) null), quxVar.b, quxVar.d);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("exoPlayer");
        throw null;
    }
}
