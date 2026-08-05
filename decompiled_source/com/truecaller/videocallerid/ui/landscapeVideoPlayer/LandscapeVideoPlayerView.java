package com.truecaller.videocallerid.ui.landscapeVideoPlayer;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class LandscapeVideoPlayerView extends android.widget.FrameLayout implements m23.baz, bd3.qux {
    public static final /* synthetic */ int e = 0;
    public yc3.d a;
    public boolean b;
    public m23.bar c;
    public final kotlin.Lazy d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LandscapeVideoPlayerView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final g23.b getBinding() {
        return (g23.b) this.d.getValue();
    }

    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.a == null) {
            this.a = new yc3.d(this);
        }
        return this.a.X3();
    }

    public final void a(boolean z) {
        com.truecaller.videocallerid.ui.videoplayer.FullScreenRatioVideoPlayerView fullScreenRatioVideoPlayerView = getBinding().b;
        fullScreenRatioVideoPlayerView.d(z);
        fullScreenRatioVideoPlayerView.f(z);
    }

    public final void b(p23.f fVar, java.lang.String str) {
        ig3.f2 playingStateForLandscapeVideoCallerId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        com.truecaller.videocallerid.ui.videoplayer.FullScreenRatioVideoPlayerView fullScreenRatioVideoPlayerView = getBinding().b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        fullScreenRatioVideoPlayerView.c = fVar;
        fullScreenRatioVideoPlayerView.d = str;
        of0.baz bazVar = (m23.qux) getPresenter();
        m23.baz bazVar2 = (m23.baz) bazVar.a;
        if (bazVar2 != null && (playingStateForLandscapeVideoCallerId = bazVar2.getPlayingStateForLandscapeVideoCallerId()) != null) {
            ig3.w1.F(new androidx.room.o(25, playingStateForLandscapeVideoCallerId, new l40.a(bazVar, (df3.bar) null, 12)), bazVar);
        }
        com.truecaller.videocallerid.ui.videoplayer.FullScreenRatioVideoPlayerView fullScreenRatioVideoPlayerView2 = getBinding().b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fullScreenRatioVideoPlayerView2, "landscapeVideoPlayer");
        com.truecaller.videocallerid.ui.videoplayer.FullScreenRatioVideoPlayerView.c(fullScreenRatioVideoPlayerView2);
    }

    @Override // m23.baz
    @org.jetbrains.annotations.NotNull
    public q23.qux getAudioStateForLandscapeVideoCallerId() {
        return getBinding().b.getAudioState();
    }

    @Override // m23.baz
    @org.jetbrains.annotations.NotNull
    public ig3.f2 getPlayingStateForLandscapeVideoCallerId() {
        return getBinding().b.getPlayingState();
    }

    @org.jetbrains.annotations.NotNull
    public final m23.bar getPresenter() {
        m23.bar barVar = this.c;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((com.truecaller.sdk.bar) getPresenter()).u0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPresenter().m1();
    }

    @Override // m23.baz
    public void setMuteButtonForLandscapeVideoCallerId(boolean z) {
        com.truecaller.videocallerid.ui.videoplayer.FullScreenRatioVideoPlayerView fullScreenRatioVideoPlayerView = getBinding().b;
        gj.m.S(fullScreenRatioVideoPlayerView, new bx.v(fullScreenRatioVideoPlayerView, z, 3));
        fullScreenRatioVideoPlayerView.e(new lf2.k(this, 19));
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull m23.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.c = barVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LandscapeVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LandscapeVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandscapeVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.c = new m23.qux((kotlin.coroutines.CoroutineContext) ((m23.a) X3()).c.V1.get());
        }
        this.d = kotlin.LazyKt.lazy(kotlin.k.c, new l02.baz(7, context, this));
    }
}
