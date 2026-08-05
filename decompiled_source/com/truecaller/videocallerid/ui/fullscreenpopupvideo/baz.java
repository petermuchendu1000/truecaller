package com.truecaller.videocallerid.ui.fullscreenpopupvideo;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class baz extends of0.baz implements l23.d {
    public final kotlin.coroutines.CoroutineContext d;
    public final r23.v e;
    public java.lang.Boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baz(kotlin.coroutines.CoroutineContext coroutineContext, r23.v vVar) {
        super(coroutineContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "videoPlayerConfigProvider");
        this.d = coroutineContext;
        this.e = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c2(boolean z) {
        if (z) {
            l23.e eVar = (l23.e) this.a;
            if (eVar != null) {
                l23.b bVar = (l23.b) eVar;
                bVar.a6().c.setImageResource(2131233694);
                bVar.a6().d.d(true);
            }
            this.f = java.lang.Boolean.TRUE;
            return;
        }
        l23.e eVar2 = (l23.e) this.a;
        if (eVar2 != null) {
            l23.b bVar2 = (l23.b) eVar2;
            bVar2.a6().c.setImageResource(2131233695);
            bVar2.a6().d.d(false);
        }
        this.f = java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(java.lang.Object obj) {
        com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType videoExpansionType;
        p23.f fVar;
        p23.f fVar2;
        androidx.fragment.app.FragmentActivity activity;
        com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType videoExpansionType2;
        l23.e eVar;
        ig3.f2 playingState;
        androidx.fragment.app.FragmentActivity activity2;
        android.content.Intent intent;
        android.content.Intent intent2;
        l23.e eVar2 = (l23.e) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar2, "presenterView");
        this.a = eVar2;
        l23.b bVar = (l23.b) eVar2;
        androidx.fragment.app.FragmentActivity activity3 = bVar.getActivity();
        if (activity3 != null && (intent2 = activity3.getIntent()) != null) {
            videoExpansionType = (com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType) intent2.getParcelableExtra("ARG_VID_EXPANSION_TYPE");
        } else {
            videoExpansionType = null;
        }
        boolean z = false;
        if (videoExpansionType instanceof com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo) {
            com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo businessVideo = (com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo) videoExpansionType;
            com.truecaller.data.entity.Contact contact = businessVideo.getContact();
            if (businessVideo.getType() == com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType.LANDSCAPE) {
                z = true;
            }
            bVar.a6().d.setLandscape(z);
            int i = com.truecaller.videocallerid.ui.fullscreenpopupvideo.bar.a[businessVideo.getType().ordinal()];
            r23.v vVar = this.e;
            if (i == 1) {
                businessVideo.getNormalizedNumber();
                fVar = vVar.a(contact);
            } else {
                fVar = vVar.b(contact, businessVideo.getNormalizedNumber());
            }
        } else {
            if (videoExpansionType instanceof com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoWithUrl) {
                q23.b bVar2 = new q23.b(com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly.WAIT_FOR_BUFFER, com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$LessThanPartly.WAIT_FOR_BUFFER);
                com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoWithUrl businessVideoWithUrl = (com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoWithUrl) videoExpansionType;
                if (businessVideoWithUrl.getType() == com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType.LANDSCAPE) {
                    z = true;
                }
                bVar.a6().d.setLandscape(z);
                q23.d dVar = new q23.d(bVar2);
                java.lang.String url = businessVideoWithUrl.getUrl();
                if (url == null) {
                    url = "";
                }
                fVar2 = new p23.f(dVar, url, businessVideoWithUrl.getIdentifier(), businessVideoWithUrl.getNormalizedNumber(), null, businessVideoWithUrl.getBusinessVideoId(), null, 416);
            } else if (videoExpansionType instanceof com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo) {
                bVar.a6().d.setLandscape(false);
                com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo p2pVideo = (com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo) videoExpansionType;
                fVar2 = new p23.f(new q23.d(new q23.b(com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$Partly.LOOP_PARTLY, com.truecaller.videocallerid.ui.videoplayer.playing.PlayingBehaviour$Fallback$LessThanPartly.DO_NOT_PLAY)), p2pVideo.getUrl(), null, null, null, null, p2pVideo.getVideoPlayerAnalyticsInfo(), 380);
            } else {
                fVar = null;
            }
            fVar = fVar2;
        }
        if (fVar != null) {
            l23.e eVar3 = (l23.e) this.a;
            if (eVar3 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "videoXConfig");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("FullScreenPopupVideo", "analyticsContext");
                com.truecaller.videocallerid.ui.videoplayer.FullScreenRatioVideoPlayerView fullScreenRatioVideoPlayerView = ((l23.b) eVar3).a6().d;
                fullScreenRatioVideoPlayerView.setClipToOutline(true);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "config");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("FullScreenPopupVideo", "analyticsContext");
                fullScreenRatioVideoPlayerView.c = fVar;
                fullScreenRatioVideoPlayerView.d = "FullScreenPopupVideo";
                com.truecaller.videocallerid.ui.videoplayer.FullScreenRatioVideoPlayerView.c(fullScreenRatioVideoPlayerView);
            }
            l23.e eVar4 = (l23.e) this.a;
            if (eVar4 != null && (activity2 = ((l23.b) eVar4).getActivity()) != null && (intent = activity2.getIntent()) != null) {
                videoExpansionType2 = (com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType) intent.getParcelableExtra("ARG_VID_EXPANSION_TYPE");
            } else {
                videoExpansionType2 = null;
            }
            if (!(videoExpansionType2 instanceof com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo) && (eVar = (l23.e) this.a) != null && (playingState = ((l23.b) eVar).a6().d.getPlayingState()) != null) {
                ig3.w1.F(new androidx.room.o(25, playingState, new ja1.d(this, (df3.bar) null, 29)), this);
                return;
            }
            return;
        }
        l23.e eVar5 = (l23.e) this.a;
        if (eVar5 != null && (activity = ((l23.b) eVar5).getActivity()) != null) {
            activity.finish();
        }
    }
}
