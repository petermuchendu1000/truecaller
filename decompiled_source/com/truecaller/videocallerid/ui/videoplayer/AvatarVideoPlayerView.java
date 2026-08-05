package com.truecaller.videocallerid.ui.videoplayer;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class AvatarVideoPlayerView extends p23.b {
    public static final /* synthetic */ int k = 0;
    public javax.inject.Provider g;
    public final d91.c h;
    public final kotlin.Lazy i;
    public int j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarVideoPlayerView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void g(com.truecaller.videocallerid.ui.videoplayer.AvatarVideoPlayerView avatarVideoPlayerView, p23.qux quxVar, com.truecaller.data.entity.Contact contact, int i) {
        if ((i & 4) != 0) {
            contact = null;
        }
        avatarVideoPlayerView.f(quxVar, "", contact);
    }

    public static /* synthetic */ void getAvatarXPresenterProvider$video_caller_id_googlePlayRelease$annotations() {
    }

    private final w31.c getOrInitAvatarXPresenter() {
        w31.c cVar;
        d91.c cVar2 = this.h;
        w31.c presenter = ((com.truecaller.videocallerid.ui.videoplayer.NoIconAvatarXView) cVar2.c).getPresenter();
        if (presenter instanceof w31.c) {
            cVar = presenter;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            w31.c cVar3 = (w31.c) getAvatarXPresenterProvider$video_caller_id_googlePlayRelease().get();
            ((com.truecaller.videocallerid.ui.videoplayer.NoIconAvatarXView) cVar2.c).setPresenter(cVar3);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar3, "run(...)");
            return cVar3;
        }
        return cVar;
    }

    private final androidx.media3.ui.PlayerView getPlayerView() {
        return (androidx.media3.ui.PlayerView) this.i.getValue();
    }

    @Override // p23.q
    public final void a(boolean z) {
        ((com.truecaller.videocallerid.ui.videoplayer.NoIconAvatarXView) this.h.c).a(z);
    }

    @Override // p23.b, p23.q
    public final void b(com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarXConfig, "config");
        ((com.truecaller.videocallerid.ui.videoplayer.NoIconAvatarXView) this.h.c).setNoIcon(z);
        getOrInitAvatarXPresenter().C2(avatarXConfig, true);
    }

    @Override // p23.b
    public final androidx.media3.ui.PlayerView d(q9.w wVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wVar, "player");
        androidx.media3.ui.PlayerView playerView = getPlayerView();
        playerView.setPlayer(wVar);
        playerView.setOutlineProvider(new a23.i(5));
        playerView.setClipToOutline(true);
        h();
        return playerView;
    }

    public final void e(boolean z, boolean z2) {
        d91.c cVar = this.h;
        if (z) {
            if (z2) {
                com.truecaller.common.ui.avatar.AvatarXView avatarXView = (com.truecaller.videocallerid.ui.videoplayer.NoIconAvatarXView) cVar.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(avatarXView, "avatarXView");
                gj.m.q(avatarXView, 1.0f);
                return;
            }
            ((com.truecaller.videocallerid.ui.videoplayer.NoIconAvatarXView) cVar.c).setAlpha(1.0f);
            return;
        }
        if (z2) {
            com.truecaller.common.ui.avatar.AvatarXView avatarXView2 = (com.truecaller.videocallerid.ui.videoplayer.NoIconAvatarXView) cVar.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(avatarXView2, "avatarXView");
            gj.m.q(avatarXView2, 0.0f);
            return;
        }
        ((com.truecaller.videocallerid.ui.videoplayer.NoIconAvatarXView) cVar.c).setAlpha(0.0f);
    }

    public final void f(p23.qux quxVar, java.lang.String str, com.truecaller.data.entity.Contact contact) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        gj.m.S(this, new bx0.bar(this, quxVar, str, contact, 18));
    }

    @org.jetbrains.annotations.NotNull
    public final javax.inject.Provider<w31.c> getAvatarXPresenterProvider$video_caller_id_googlePlayRelease() {
        javax.inject.Provider<w31.c> provider = this.g;
        if (provider != null) {
            return provider;
        }
        kotlin.jvm.internal.Intrinsics.n("avatarXPresenterProvider");
        throw null;
    }

    @Override // p23.b
    @org.jetbrains.annotations.Nullable
    public androidx.media3.ui.PlayerView getVideoPlayerView() {
        android.view.ViewStub viewStub = (android.view.ViewStub) this.h.d;
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

    public final void h() {
        if (this.j != 0) {
            android.view.ViewStub viewStub = (android.view.ViewStub) this.h.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewStub, "playerViewStub");
            if (gj.m.D(viewStub)) {
                android.view.ViewGroup.LayoutParams layoutParams = getPlayerView().getLayoutParams();
                kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                int i = this.j;
                layoutParams2.width = i;
                layoutParams2.height = i;
                layoutParams2.gravity = 17;
                getPlayerView().setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int b = qf3.a.b(((getMeasuredWidth() * 1.0f) / 44.0f) * 39);
        if (b != this.j) {
            this.j = b;
            h();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int b = qf3.a.b(((i * 1.0f) / 44.0f) * 39);
        if (b != this.j) {
            this.j = b;
            h();
        }
    }

    @Override // p23.b, p23.q
    public void setAvatarXConfig(@org.jetbrains.annotations.NotNull com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarXConfig, "config");
        getOrInitAvatarXPresenter().C2(avatarXConfig, true);
    }

    public final void setAvatarXPresenter(@org.jetbrains.annotations.NotNull w31.c cVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "presenter");
        ((com.truecaller.videocallerid.ui.videoplayer.NoIconAvatarXView) this.h.c).setPresenter(cVar);
    }

    public final void setAvatarXPresenterProvider$video_caller_id_googlePlayRelease(@org.jetbrains.annotations.NotNull javax.inject.Provider<w31.c> provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "<set-?>");
        this.g = provider;
    }

    public final void setOnAvatarClickListener(@org.jetbrains.annotations.NotNull android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        ((com.truecaller.videocallerid.ui.videoplayer.NoIconAvatarXView) this.h.c).setOnClickListener(onClickListener);
    }

    @Override // p23.b, p23.q
    public void setVisibility(boolean z) {
        androidx.media3.ui.PlayerView videoPlayerView = getVideoPlayerView();
        if (videoPlayerView != null) {
            gj.m.k0(videoPlayerView, z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131560065, this);
        int i2 = 2131362395;
        com.truecaller.common.ui.avatar.AvatarXView avatarXView = (com.truecaller.videocallerid.ui.videoplayer.NoIconAvatarXView) df0.qux.o(2131362395, this);
        if (avatarXView != null) {
            i2 = 2131365753;
            android.view.ViewStub viewStub = (android.view.ViewStub) df0.qux.o(2131365753, this);
            if (viewStub != null) {
                d91.c cVar = new d91.c(this, avatarXView, viewStub, 8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
                this.h = cVar;
                this.i = kotlin.LazyKt.lazy(new o93.k(this, 15));
                android.content.Context context2 = getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                tx.w wVar = ((k23.bar) f40.d0.z(context2, k23.bar.class)).H;
                tx.c0 c0Var = wVar.b;
                y.n0 n0Var = new y.n0(wVar, this);
                this.a = new p23.o((fg3.e0) ((cd3.b) n0Var.c).get(), c0Var.N1(), (f23.a) wVar.nk.get(), wVar.o4(), (e23.bar) c0Var.H0.get(), (q23.n) ((cd3.b) n0Var.f).get(), new jz0.u(c0Var.N1(), c0Var.Z4()), (ij0.e) wVar.m7.get(), (u03.baz) wVar.W.get(), (qo1.r) wVar.V3.get());
                this.b = (r23.b) c0Var.G0.get();
                this.c = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
                this.d = (q23.n) ((cd3.b) n0Var.f).get();
                this.g = (rn0.d0) n0Var.g;
                return;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ AvatarVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
