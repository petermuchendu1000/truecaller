package com.truecaller.videocallerid.ui.videoplayer;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class FullScreenRatioVideoPlayerView extends android.widget.FrameLayout {
    public static final /* synthetic */ int h = 0;
    public boolean a;
    public final int b;
    public p23.f c;
    public java.lang.String d;
    public int e;
    public int f;
    public final kotlin.Lazy g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenRatioVideoPlayerView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static kotlin.Unit a(com.truecaller.videocallerid.ui.videoplayer.FullScreenRatioVideoPlayerView fullScreenRatioVideoPlayerView, boolean z) {
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = fullScreenRatioVideoPlayerView.getBinding().e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView, "muteButton");
        gj.m.k0(appCompatImageView, z);
        return kotlin.Unit.a;
    }

    public static kotlin.Unit b(com.truecaller.videocallerid.ui.videoplayer.FullScreenRatioVideoPlayerView fullScreenRatioVideoPlayerView, p23.f fVar) {
        fullScreenRatioVideoPlayerView.getBinding().d.f(fVar, fullScreenRatioVideoPlayerView.d);
        fullScreenRatioVideoPlayerView.getBinding().b.setOnClickListener(null);
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = fullScreenRatioVideoPlayerView.getBinding().b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView, "buttonPlay");
        gj.m.f0(appCompatImageView);
        androidx.cardview.widget.CardView cardView = fullScreenRatioVideoPlayerView.getBinding().c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cardView, "containerVideoView");
        gj.m.j0(cardView);
        gj.m.S(fullScreenRatioVideoPlayerView, new bx.v(fullScreenRatioVideoPlayerView, false, 3));
        return kotlin.Unit.a;
    }

    public static void c(com.truecaller.videocallerid.ui.videoplayer.FullScreenRatioVideoPlayerView fullScreenRatioVideoPlayerView) {
        p23.f fVar = fullScreenRatioVideoPlayerView.c;
        if (fVar == null) {
            return;
        }
        gj.m.S(fullScreenRatioVideoPlayerView, new ob2.baz(14, fullScreenRatioVideoPlayerView, fVar));
    }

    private final g23.a getBinding() {
        return (g23.a) this.g.getValue();
    }

    public final void d(boolean z) {
        getBinding().d.e(z);
    }

    public final void e(lf2.k kVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "muteButtonClickListener");
        getBinding().e.setOnClickListener(new op0.baz(kVar, 20));
    }

    public final void f(boolean z) {
        int i;
        if (z) {
            i = 2131233694;
        } else {
            i = 2131233695;
        }
        getBinding().e.setImageResource(i);
    }

    @org.jetbrains.annotations.NotNull
    public final q23.qux getAudioState() {
        return getBinding().d.getAudioState();
    }

    @org.jetbrains.annotations.NotNull
    public final ig3.f2 getPlayingState() {
        return getBinding().d.getPlayingState();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        kotlin.Pair n = ns.o.n(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(i2), this.e, this.f, this.b, this.a);
        this.e = ((java.lang.Number) n.a).intValue();
        this.f = ((java.lang.Number) n.b).intValue();
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.e, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
    }

    public final void setLandscape(boolean z) {
        this.a = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenRatioVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenRatioVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = true;
        this.b = 1;
        this.d = "";
        this.g = kotlin.LazyKt.lazy(kotlin.k.c, new ob2.baz(13, context, this));
    }

    public /* synthetic */ FullScreenRatioVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
