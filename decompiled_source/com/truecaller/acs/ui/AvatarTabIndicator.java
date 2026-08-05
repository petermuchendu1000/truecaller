package com.truecaller.acs.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AvatarTabIndicator extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int F = 0;
    public jz.n0 A;
    public final kotlin.Lazy B;
    public final kotlin.Lazy C;
    public final kotlin.Lazy D;
    public final bb1.b E;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public final kotlin.Lazy y;
    public final kotlin.Lazy z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarTabIndicator(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static android.widget.ImageView[] F(com.truecaller.acs.ui.AvatarTabIndicator avatarTabIndicator) {
        return new android.widget.ImageView[]{avatarTabIndicator.getAvatarFirstSelector(), avatarTabIndicator.getAvatarSecondSelector(), avatarTabIndicator.getAvatarThirdSelector()};
    }

    public static com.truecaller.common.ui.avatar.AvatarXView[] G(com.truecaller.acs.ui.AvatarTabIndicator avatarTabIndicator) {
        return new com.truecaller.common.ui.avatar.AvatarXView[]{avatarTabIndicator.getAvatarFirst(), avatarTabIndicator.getAvatarSecond(), avatarTabIndicator.getAvatarThird()};
    }

    public static java.util.ArrayList H(com.truecaller.acs.ui.AvatarTabIndicator avatarTabIndicator) {
        return kotlin.collections.v.n0(avatarTabIndicator.getAcsAvatars(), avatarTabIndicator.getAcsSelectedItems());
    }

    private final com.truecaller.common.ui.avatar.AvatarXView[] getAcsAvatars() {
        return (com.truecaller.common.ui.avatar.AvatarXView[]) this.B.getValue();
    }

    private final android.widget.ImageView[] getAcsSelectedItems() {
        return (android.widget.ImageView[]) this.C.getValue();
    }

    private final com.truecaller.common.ui.avatar.AvatarXView getAvatarFirst() {
        return (com.truecaller.common.ui.avatar.AvatarXView) this.s.getValue();
    }

    private final android.widget.ImageView getAvatarFirstSelector() {
        return (android.widget.ImageView) this.t.getValue();
    }

    private final com.truecaller.common.ui.avatar.AvatarXView getAvatarSecond() {
        return (com.truecaller.common.ui.avatar.AvatarXView) this.u.getValue();
    }

    private final android.widget.ImageView getAvatarSecondSelector() {
        return (android.widget.ImageView) this.v.getValue();
    }

    private final com.truecaller.common.ui.avatar.AvatarXView getAvatarThird() {
        return (com.truecaller.common.ui.avatar.AvatarXView) this.w.getValue();
    }

    private final android.widget.ImageView getAvatarThirdSelector() {
        return (android.widget.ImageView) this.x.getValue();
    }

    private final java.util.List<kotlin.Pair<com.truecaller.common.ui.avatar.AvatarXView, android.widget.ImageView>> getAvatarsWithSelector() {
        return (java.util.List) this.D.getValue();
    }

    private final int getMinAvatarTouchAreaSize() {
        return ((java.lang.Number) this.z.getValue()).intValue();
    }

    private final android.widget.TextView getViewMore() {
        return (android.widget.TextView) this.y.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s41.h I() {
        com.truecaller.common.ui.avatar.AvatarXView avatarSecond = getAvatarSecond();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(avatarSecond, "<get-avatarSecond>(...)");
        java.lang.String string = getContext().getString(2132019407);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        android.content.res.Resources resources = getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return yp.d0.N(avatarSecond, string, 0, 0, (int) fe0.m.p(resources, 4.0f), 46);
    }

    public final void J(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        android.widget.TextView viewMore = getViewMore();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewMore, "<get-viewMore>(...)");
        gj.m.k0(viewMore, z);
        getViewMore().setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.TouchDelegate touchDelegate;
        super.onLayout(z, i, i2, i3, i4);
        android.view.View[] acsAvatars = getAcsAvatars();
        int length = acsAvatars.length;
        int i5 = 0;
        while (true) {
            bb1.b bVar = this.E;
            if (i5 < length) {
                android.view.View view = acsAvatars[i5];
                kotlin.jvm.internal.Intrinsics.d(view);
                int minAvatarTouchAreaSize = getMinAvatarTouchAreaSize();
                int minAvatarTouchAreaSize2 = getMinAvatarTouchAreaSize();
                android.graphics.Rect rect = new android.graphics.Rect();
                view.getHitRect(rect);
                int width = minAvatarTouchAreaSize - rect.width();
                if (width < 0) {
                    width = 0;
                }
                float f = width / 2;
                int height = minAvatarTouchAreaSize2 - rect.height();
                if (height < 0) {
                    height = 0;
                }
                float f2 = height / 2;
                if (f == 0.0f && f2 == 0.0f) {
                    touchDelegate = null;
                } else {
                    int i6 = (int) f;
                    rect.left -= i6;
                    rect.right += i6;
                    int i7 = (int) f2;
                    rect.top -= i7;
                    rect.bottom += i7;
                    touchDelegate = new android.view.TouchDelegate(rect, view);
                }
                if (touchDelegate != null) {
                    bVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchDelegate, "delegate");
                    bVar.b.add(touchDelegate);
                }
                i5++;
            } else {
                setTouchDelegate(bVar);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setAvatars(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.common.ui.avatar.AvatarXConfig> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "avatars");
        java.util.Iterator it = kotlin.collections.CollectionsKt.O0(getAvatarsWithSelector(), list).iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                kotlin.Pair pair = (kotlin.Pair) next;
                kotlin.Pair pair2 = (kotlin.Pair) pair.a;
                com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig = (com.truecaller.common.ui.avatar.AvatarXConfig) pair.b;
                com.truecaller.common.ui.avatar.AvatarXView avatarXView = (com.truecaller.common.ui.avatar.AvatarXView) pair2.a;
                android.widget.ImageView imageView = (android.widget.ImageView) pair2.b;
                kotlin.jvm.internal.Intrinsics.d(imageView);
                gj.m.h0(imageView);
                kotlin.jvm.internal.Intrinsics.d(avatarXView);
                android.content.Context context = getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                w31.c cVar = new w31.c(new u03.g0(context), 0);
                avatarXView.setPresenter(cVar);
                cVar.C2(com.truecaller.common.ui.avatar.AvatarXConfig.a(avatarXConfig, (android.net.Uri) null, (java.lang.String) null, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, -7340033), true);
                gj.m.j0(avatarXView);
                avatarXView.setOnClickListener(new ao.m(this, i, 3));
                i = i2;
            } else {
                kotlin.collections.y.p();
                throw null;
            }
        }
    }

    public final void setOnAvatarTabClickListener(@org.jetbrains.annotations.NotNull jz.n0 n0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n0Var, "listener");
        this.A = n0Var;
    }

    public final void setSelectedAvatar(int i) {
        for (android.widget.ImageView imageView : getAcsSelectedItems()) {
            kotlin.jvm.internal.Intrinsics.d(imageView);
            if (gj.m.H(imageView)) {
                gj.m.h0(imageView);
            }
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) kotlin.collections.v.K(i, getAcsSelectedItems());
        if (imageView2 != null) {
            gj.m.j0(imageView2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarTabIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AvatarTabIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = gj.m.I(2131361885, this);
        this.t = gj.m.I(2131361886, this);
        this.u = gj.m.I(2131361894, this);
        this.v = gj.m.I(2131361895, this);
        this.w = gj.m.I(2131361896, this);
        this.x = gj.m.I(2131361897, this);
        this.y = gj.m.I(2131367417, this);
        final int i2 = 0;
        this.z = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: jz.k0
            public final /* synthetic */ com.truecaller.acs.ui.AvatarTabIndicator b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [com.truecaller.acs.ui.AvatarTabIndicator, android.view.View] */
            public final java.lang.Object invoke() {
                int i3 = i2;
                ?? r1 = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.acs.ui.AvatarTabIndicator.F;
                        android.content.res.Resources resources = r1.getResources();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        return java.lang.Integer.valueOf((int) fe0.m.p(resources, 48.0f));
                    case 1:
                        return com.truecaller.acs.ui.AvatarTabIndicator.G(r1);
                    case 2:
                        return com.truecaller.acs.ui.AvatarTabIndicator.F(r1);
                    default:
                        return com.truecaller.acs.ui.AvatarTabIndicator.H(r1);
                }
            }
        });
        android.view.View.inflate(context, 2131559891, this);
        getViewMore().setOnClickListener(new gr2.bar(this, 20));
        final int i3 = 1;
        this.B = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: jz.k0
            public final /* synthetic */ com.truecaller.acs.ui.AvatarTabIndicator b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [com.truecaller.acs.ui.AvatarTabIndicator, android.view.View] */
            public final java.lang.Object invoke() {
                int i32 = i3;
                ?? r1 = this.b;
                switch (i32) {
                    case 0:
                        int i4 = com.truecaller.acs.ui.AvatarTabIndicator.F;
                        android.content.res.Resources resources = r1.getResources();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        return java.lang.Integer.valueOf((int) fe0.m.p(resources, 48.0f));
                    case 1:
                        return com.truecaller.acs.ui.AvatarTabIndicator.G(r1);
                    case 2:
                        return com.truecaller.acs.ui.AvatarTabIndicator.F(r1);
                    default:
                        return com.truecaller.acs.ui.AvatarTabIndicator.H(r1);
                }
            }
        });
        final int i4 = 2;
        this.C = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: jz.k0
            public final /* synthetic */ com.truecaller.acs.ui.AvatarTabIndicator b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [com.truecaller.acs.ui.AvatarTabIndicator, android.view.View] */
            public final java.lang.Object invoke() {
                int i32 = i4;
                ?? r1 = this.b;
                switch (i32) {
                    case 0:
                        int i42 = com.truecaller.acs.ui.AvatarTabIndicator.F;
                        android.content.res.Resources resources = r1.getResources();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        return java.lang.Integer.valueOf((int) fe0.m.p(resources, 48.0f));
                    case 1:
                        return com.truecaller.acs.ui.AvatarTabIndicator.G(r1);
                    case 2:
                        return com.truecaller.acs.ui.AvatarTabIndicator.F(r1);
                    default:
                        return com.truecaller.acs.ui.AvatarTabIndicator.H(r1);
                }
            }
        });
        final int i5 = 3;
        this.D = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: jz.k0
            public final /* synthetic */ com.truecaller.acs.ui.AvatarTabIndicator b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [com.truecaller.acs.ui.AvatarTabIndicator, android.view.View] */
            public final java.lang.Object invoke() {
                int i32 = i5;
                ?? r1 = this.b;
                switch (i32) {
                    case 0:
                        int i42 = com.truecaller.acs.ui.AvatarTabIndicator.F;
                        android.content.res.Resources resources = r1.getResources();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        return java.lang.Integer.valueOf((int) fe0.m.p(resources, 48.0f));
                    case 1:
                        return com.truecaller.acs.ui.AvatarTabIndicator.G(r1);
                    case 2:
                        return com.truecaller.acs.ui.AvatarTabIndicator.F(r1);
                    default:
                        return com.truecaller.acs.ui.AvatarTabIndicator.H(r1);
                }
            }
        });
        java.lang.Object E = kotlin.collections.v.E(getAcsAvatars());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(E, "first(...)");
        this.E = new bb1.b((android.view.View) E);
    }

    public /* synthetic */ AvatarTabIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
