package com.truecaller.ads.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class VideoFrame extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int A = 0;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public com.google.android.gms.ads.VideoController y;
    public final da0.k z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoFrame(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void F(com.truecaller.ads.ui.VideoFrame videoFrame, android.view.View view) {
        int i;
        com.google.android.gms.ads.VideoController videoController;
        int id = view.getId();
        if (id == 2131362157) {
            com.google.android.gms.ads.VideoController videoController2 = videoFrame.y;
            if (videoController2 != null) {
                videoController2.mute(!videoController2.isMuted());
            }
        } else if (id == 2131362159) {
            com.google.android.gms.ads.VideoController videoController3 = videoFrame.y;
            if (videoController3 != null) {
                i = videoController3.getPlaybackState();
            } else {
                i = 0;
            }
            if (i != 1) {
                if ((i == 2 || i == 3 || i == 5) && (videoController = videoFrame.y) != null) {
                    videoController.play();
                }
            } else {
                com.google.android.gms.ads.VideoController videoController4 = videoFrame.y;
                if (videoController4 != null) {
                    videoController4.pause();
                }
            }
        }
        videoFrame.I();
    }

    private final android.widget.ImageView getAdFallbackImage() {
        return (android.widget.ImageView) this.u.getValue();
    }

    private final android.widget.TextView getAdFallbackText() {
        return (android.widget.TextView) this.x.getValue();
    }

    private final android.widget.FrameLayout getAdVideo() {
        return (android.widget.FrameLayout) this.v.getValue();
    }

    private final android.widget.LinearLayout getAdVideoControls() {
        return (android.widget.LinearLayout) this.w.getValue();
    }

    private final android.widget.ImageView getAdVideoMuteUnmute() {
        return (android.widget.ImageView) this.t.getValue();
    }

    private final android.widget.ImageView getAdVideoPlayPause() {
        return (android.widget.ImageView) this.s.getValue();
    }

    private final void setupFallback(da0.i iVar) {
        android.widget.FrameLayout adVideo = getAdVideo();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adVideo, "<get-adVideo>(...)");
        gj.m.f0(adVideo);
        android.widget.LinearLayout adVideoControls = getAdVideoControls();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adVideoControls, "<get-adVideoControls>(...)");
        gj.m.f0(adVideoControls);
        android.widget.ImageView adFallbackImage = getAdFallbackImage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adFallbackImage, "<get-adFallbackImage>(...)");
        gj.m.j0(adFallbackImage);
        android.widget.TextView adFallbackText = getAdFallbackText();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adFallbackText, "<get-adFallbackText>(...)");
        gj.m.j0(adFallbackText);
        if (iVar != null) {
            android.widget.ImageView adFallbackImage2 = getAdFallbackImage();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adFallbackImage2, "<get-adFallbackImage>(...)");
            android.widget.TextView adFallbackText2 = getAdFallbackText();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adFallbackText2, "<get-adFallbackText>(...)");
            iVar.a(adFallbackImage2, adFallbackText2);
        }
    }

    public final void G() {
        getAdVideo().removeAllViews();
        com.google.android.gms.ads.VideoController videoController = this.y;
        if (videoController != null) {
            videoController.setVideoLifecycleCallbacks(da0.e.a);
        }
        this.y = null;
    }

    public final boolean H(com.google.android.gms.ads.nativead.MediaView mediaView, com.google.android.gms.ads.VideoController videoController, da0.i iVar) {
        android.view.ViewGroup viewGroup;
        G();
        if (videoController != null && videoController.hasVideoContent()) {
            android.widget.FrameLayout adVideo = getAdVideo();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adVideo, "<get-adVideo>(...)");
            gj.m.j0(adVideo);
            android.widget.LinearLayout adVideoControls = getAdVideoControls();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adVideoControls, "<get-adVideoControls>(...)");
            gj.m.j0(adVideoControls);
            android.widget.ImageView adFallbackImage = getAdFallbackImage();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adFallbackImage, "<get-adFallbackImage>(...)");
            gj.m.f0(adFallbackImage);
            android.widget.TextView adFallbackText = getAdFallbackText();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adFallbackText, "<get-adFallbackText>(...)");
            gj.m.f0(adFallbackText);
            android.view.ViewParent parent = mediaView.getParent();
            if (parent instanceof android.view.ViewGroup) {
                viewGroup = (android.view.ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(mediaView);
            }
            getAdVideo().addView(mediaView);
            this.y = videoController;
            videoController.setVideoLifecycleCallbacks(this.z);
            I();
            return true;
        }
        setupFallback(iVar);
        return false;
    }

    public final void I() {
        java.lang.Boolean bool;
        int i;
        int i2;
        android.widget.LinearLayout adVideoControls = getAdVideoControls();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adVideoControls, "<get-adVideoControls>(...)");
        com.google.android.gms.ads.VideoController videoController = this.y;
        if (videoController != null) {
            bool = java.lang.Boolean.valueOf(videoController.isCustomControlsEnabled());
        } else {
            bool = null;
        }
        gj.m.k0(adVideoControls, yp.d0.D(bool));
        com.google.android.gms.ads.VideoController videoController2 = this.y;
        if (videoController2 != null) {
            android.widget.ImageView adVideoPlayPause = getAdVideoPlayPause();
            if (videoController2.getPlaybackState() == 1) {
                i = 2131232950;
            } else {
                i = 2131232980;
            }
            adVideoPlayPause.setImageResource(i);
            android.widget.ImageView adVideoMuteUnmute = getAdVideoMuteUnmute();
            if (videoController2.isMuted()) {
                i2 = 2131232881;
            } else {
                i2 = 2131233671;
            }
            adVideoMuteUnmute.setImageResource(i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoFrame(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VideoFrame(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = gj.m.I(2131362159, this);
        this.t = gj.m.I(2131362157, this);
        this.u = gj.m.I(2131362114, this);
        this.v = gj.m.I(2131362154, this);
        this.w = gj.m.I(2131362155, this);
        this.x = gj.m.I(2131362115, this);
        android.view.View.inflate(context, 2131560938, this);
        getAdVideoPlayPause().setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(this, 9));
        getAdVideoMuteUnmute().setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(this, 9));
        this.z = new da0.k(this);
    }

    public /* synthetic */ VideoFrame(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
