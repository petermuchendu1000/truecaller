package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class c implements h9.g0 {
    public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity a;

    public c(com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity) {
        this.a = callRecordingDetailsActivity;
    }

    public final /* synthetic */ void onAudioAttributesChanged(h9.a aVar) {
    }

    public final /* synthetic */ void onAudioSessionIdChanged(int i) {
    }

    public final /* synthetic */ void onAvailableCommandsChanged(h9.e0 e0Var) {
    }

    public final /* synthetic */ void onCues(j9.qux quxVar) {
    }

    public final /* synthetic */ void onEvents(h9.i0 i0Var, h9.f0 f0Var) {
    }

    public final /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    public final void onIsPlayingChanged(boolean z) {
        com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity = this.a;
        if (z) {
            com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = callRecordingDetailsActivity.g0;
            if (nVar != null) {
                qz0.bar barVar = nVar.h;
                java.lang.String str = nVar.j.a;
                int i = nVar.v;
                qz0.qux quxVar = (qz0.qux) barVar;
                quxVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callId");
                quxVar.a(qz0.qux.c(i), "PlayedRecording", str);
                z42.bar.M(new v03.qux("CTPlayedRecording", quxVar.d()), quxVar.b, quxVar.d);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
        com.truecaller.cloudtelephony.callrecording.ui.details.n nVar2 = callRecordingDetailsActivity.g0;
        if (nVar2 != null) {
            qz0.bar barVar2 = nVar2.h;
            java.lang.String str2 = nVar2.j.a;
            int i2 = nVar2.v;
            qz0.qux quxVar2 = (qz0.qux) barVar2;
            quxVar2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "callId");
            quxVar2.a(qz0.qux.c(i2), "PausedRecording", str2);
            z42.bar.M(new v03.qux("CTPausedRecording", quxVar2.d()), quxVar2.b, quxVar2.d);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final /* synthetic */ void onLoadingChanged(boolean z) {
    }

    public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
    }

    public final /* synthetic */ void onMediaItemTransition(androidx.media3.common.MediaItem mediaItem, int i) {
    }

    public final /* synthetic */ void onMediaMetadataChanged(h9.x xVar) {
    }

    public final /* synthetic */ void onMetadata(h9.z zVar) {
    }

    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
    }

    public final /* synthetic */ void onPlaybackParametersChanged(h9.d0 d0Var) {
    }

    public final /* synthetic */ void onPlaybackStateChanged(int i) {
    }

    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    public final /* synthetic */ void onPlayerError(h9.c0 c0Var) {
    }

    public final /* synthetic */ void onPlayerErrorChanged(h9.c0 c0Var) {
    }

    public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    public final /* synthetic */ void onPlaylistMetadataChanged(h9.x xVar) {
    }

    public final /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    public final /* synthetic */ void onRenderedFirstFrame() {
    }

    public final /* synthetic */ void onRepeatModeChanged(int i) {
    }

    public final /* synthetic */ void onSeekBackIncrementChanged(long j) {
    }

    public final /* synthetic */ void onSeekForwardIncrementChanged(long j) {
    }

    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
    }

    public final /* synthetic */ void onTimelineChanged(h9.n0 n0Var, int i) {
    }

    public final /* synthetic */ void onTrackSelectionParametersChanged(h9.s0 s0Var) {
    }

    public final /* synthetic */ void onTracksChanged(h9.u0 u0Var) {
    }

    public final /* synthetic */ void onVideoSizeChanged(h9.y0 y0Var) {
    }

    public final /* synthetic */ void onVolumeChanged(float f) {
    }

    public final /* synthetic */ void onCues(java.util.List list) {
    }

    public final /* synthetic */ void onPositionDiscontinuity(h9.h0 h0Var, h9.h0 h0Var2, int i) {
    }
}
