package com.truecaller.videocallerid.ui.videoplayer;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class FullScreenVideoPlayerView extends p23.b implements bd3.qux {
    public static final /* synthetic */ int k = 0;
    public yc3.d g;
    public boolean h;
    public final d41.a i;
    public final kotlin.Lazy j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenVideoPlayerView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final androidx.media3.ui.PlayerView getPlayerView() {
        return (androidx.media3.ui.PlayerView) this.j.getValue();
    }

    private final void setOutlineAndClip(float f) {
        if (f <= 0.0f) {
            return;
        }
        setOutlineProvider(new lf2.i(f, 1));
        setClipToOutline(true);
    }

    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.g == null) {
            this.g = new yc3.d(this);
        }
        return this.g.X3();
    }

    @Override // p23.q
    public final void a(boolean z) {
        androidx.constraintlayout.widget.Group group = (androidx.constraintlayout.widget.Group) this.i.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "loadingGroup");
        gj.m.k0(group, z);
    }

    @Override // p23.b
    public final androidx.media3.ui.PlayerView d(q9.w wVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wVar, "player");
        androidx.media3.ui.PlayerView playerView = getPlayerView();
        playerView.setPlayer(wVar);
        return playerView;
    }

    public final void e(boolean z) {
        p23.o oVar = (p23.o) getPresenter$video_caller_id_googlePlayRelease();
        q23.n nVar = oVar.g;
        if (oVar.s instanceof q23.bar) {
            if (z) {
                androidx.media3.exoplayer.ExoPlayer a = ((q23.t) nVar).c.a();
                if (a != null) {
                    a.setVolume(0.0f);
                    return;
                }
                return;
            }
            q23.t tVar = (q23.t) nVar;
            float f = tVar.i;
            androidx.media3.exoplayer.ExoPlayer a2 = tVar.c.a();
            if (a2 != null) {
                a2.setVolume(f);
            }
        }
    }

    public final void f(p23.f fVar, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        gj.m.S(this, new fz.baz(this, fVar, str, 23));
    }

    @Override // p23.b
    @org.jetbrains.annotations.Nullable
    public androidx.media3.ui.PlayerView getVideoPlayerView() {
        android.view.ViewStub viewStub = (android.view.ViewStub) this.i.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewStub, "playerViewStub");
        if (gj.m.D(viewStub)) {
            return getPlayerView();
        }
        return null;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVideoUrl() {
        return ((q23.t) ((p23.o) getPresenter$video_caller_id_googlePlayRelease()).g).j;
    }

    @Override // p23.b, p23.q
    public void setVisibility(boolean z) {
        float f;
        androidx.media3.ui.PlayerView videoPlayerView = getVideoPlayerView();
        if (videoPlayerView != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            videoPlayerView.setAlpha(f);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.h) {
            this.h = true;
            tx.d0 d0Var = (p23.h) X3();
            this.a = d0Var.c();
            tx.w wVar = d0Var.c;
            this.b = (r23.b) wVar.b.G0.get();
            this.c = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
            this.d = (q23.n) d0Var.i.get();
        }
        d41.a b = d41.a.b(android.view.LayoutInflater.from(context), this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "inflate(...)");
        this.i = b;
        this.j = kotlin.LazyKt.lazy(new o93.k(this, 17));
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.truecaller.videocallerid.R$styleable.a);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                setOutlineAndClip(obtainStyledAttributes.getDimension(0, -1.0f));
                obtainStyledAttributes.recycle();
                kotlin.Unit unit = kotlin.Unit.a;
            } catch (java.lang.Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        getPlayerView().setShutterBackgroundColor(0);
    }

    public /* synthetic */ FullScreenVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
