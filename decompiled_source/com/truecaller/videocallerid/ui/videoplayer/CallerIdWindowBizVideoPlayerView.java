package com.truecaller.videocallerid.ui.videoplayer;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class CallerIdWindowBizVideoPlayerView extends p23.b {
    public static final /* synthetic */ int l = 0;
    public final boolean g;
    public int h;
    public int i;
    public final d41.a j;
    public final kotlin.Lazy k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallerIdWindowBizVideoPlayerView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final androidx.media3.ui.PlayerView getPlayerView() {
        return (androidx.media3.ui.PlayerView) this.k.getValue();
    }

    @Override // p23.q
    public final void a(boolean z) {
        androidx.constraintlayout.widget.Group group = (androidx.constraintlayout.widget.Group) this.j.d;
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

    @Override // p23.b
    @org.jetbrains.annotations.Nullable
    public androidx.media3.ui.PlayerView getVideoPlayerView() {
        android.view.ViewStub viewStub = (android.view.ViewStub) this.j.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewStub, "playerViewStub");
        if (gj.m.D(viewStub)) {
            return getPlayerView();
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (size > 0) {
            this.h = size;
        }
        if (size2 > 0) {
            this.i = size2;
        }
        if (getResources().getConfiguration().orientation == 1) {
            i3 = 9;
        } else {
            i3 = 2;
        }
        if (this.g) {
            i4 = (this.h * i3) / 16;
        } else {
            i4 = (this.h * 16) / i3;
        }
        this.i = i4;
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.h, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.i, 1073741824));
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
    public CallerIdWindowBizVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallerIdWindowBizVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.g = true;
        d41.a b = d41.a.b(android.view.LayoutInflater.from(context), this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "inflate(...)");
        this.j = b;
        this.k = kotlin.LazyKt.lazy(new o93.k(this, 16));
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        tx.w wVar = ((k23.baz) f40.d0.z(context2, k23.baz.class)).H;
        o02.baz bazVar = new o02.baz(wVar, this);
        fg3.e0 e0Var = (fg3.e0) ((cd3.b) bazVar.c).get();
        tx.c0 c0Var = wVar.b;
        this.a = new p23.o(e0Var, c0Var.N1(), (f23.a) wVar.nk.get(), wVar.o4(), (e23.bar) c0Var.H0.get(), (q23.n) ((cd3.b) bazVar.f).get(), new jz0.u(c0Var.N1(), c0Var.Z4()), (ij0.e) wVar.m7.get(), (u03.baz) wVar.W.get(), (qo1.r) wVar.V3.get());
        this.b = (r23.b) c0Var.G0.get();
        this.c = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
        this.d = (q23.n) ((cd3.b) bazVar.f).get();
        getPlayerView().setShutterBackgroundColor(0);
    }

    public /* synthetic */ CallerIdWindowBizVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
