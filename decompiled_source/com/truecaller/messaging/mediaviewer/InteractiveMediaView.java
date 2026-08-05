package com.truecaller.messaging.mediaviewer;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InteractiveMediaView extends android.widget.FrameLayout {
    public static final /* synthetic */ int x = 0;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public r22.o f;
    public r22.n g;
    public h9.g0 h;
    public android.animation.ValueAnimator i;
    public android.animation.ValueAnimator j;
    public android.animation.ValueAnimator k;
    public z7.e l;
    public z7.e m;
    public final kotlin.Lazy n;
    public final int o;
    public final int p;
    public int q;
    public androidx.media3.ui.PlayerControlView r;
    public r22.c s;
    public r22.c t;
    public r22.c u;
    public final android.view.ScaleGestureDetector v;
    public final android.view.GestureDetector w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InteractiveMediaView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final z7.e a(final com.truecaller.messaging.mediaviewer.InteractiveMediaView interactiveMediaView, float f, uf3.d dVar, float f2, final kotlin.jvm.functions.Function1 function1) {
        z7.e eVar = new z7.e(new dg.v(6));
        ((z7.c) eVar).b = f;
        ((z7.c) eVar).c = true;
        ((z7.c) eVar).a = f2 / interactiveMediaView.c;
        ((z7.c) eVar).h = java.lang.Math.min(java.lang.Float.valueOf(dVar.a).floatValue(), f);
        ((z7.c) eVar).g = java.lang.Math.max(java.lang.Float.valueOf(dVar.b).floatValue(), f);
        eVar.t.a = -6.2999997f;
        z7.b bVar = new z7.b() { // from class: r22.baz
            public final void g(float f3) {
                int i = com.truecaller.messaging.mediaviewer.InteractiveMediaView.x;
                function1.invoke(java.lang.Float.valueOf(f3));
                interactiveMediaView.invalidate();
            }
        };
        if (!((z7.c) eVar).f) {
            java.util.ArrayList arrayList = ((z7.c) eVar).l;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
            eVar.e();
            return eVar;
        }
        throw new java.lang.UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    private final float getDrawableHeight() {
        int i;
        java.lang.Integer drawableHeight = this.t.getDrawableHeight();
        if (drawableHeight != null) {
            i = drawableHeight.intValue();
        } else {
            i = 1;
        }
        return i;
    }

    private final float getDrawableScale() {
        return java.lang.Math.min(java.lang.Math.max(getWidth(), 1) / getDrawableWidth(), java.lang.Math.max(getHeight(), 1) / getDrawableHeight());
    }

    private final float getDrawableWidth() {
        int i;
        java.lang.Integer drawableWidth = this.t.getDrawableWidth();
        if (drawableWidth != null) {
            i = drawableWidth.intValue();
        } else {
            i = 1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uf3.e getScaleLimits() {
        return new uf3.d(1.0f, java.lang.Math.max(4.0f / getDrawableScale(), 1.0f));
    }

    private final long getShortAnimationTime() {
        return ((java.lang.Number) this.n.getValue()).longValue();
    }

    public static kotlin.Pair m(float f, float f2, float f3, float f4) {
        float f5 = 1 - f;
        return new kotlin.Pair(java.lang.Float.valueOf(((-f3) * f5) / f2), java.lang.Float.valueOf(((-f4) * f5) / f2));
    }

    public final r22.c c() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        r22.c cVar = new r22.c(context);
        addView(cVar);
        android.view.ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        return cVar;
    }

    public final void d(float f) {
        z7.e eVar = this.l;
        if (eVar != null) {
            eVar.a();
        }
        android.animation.ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.i = f(new r22.bar(this, 2), this.a, f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        boolean z;
        boolean z2;
        float f;
        float f2;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        float f3 = this.c;
        boolean z4 = true;
        if (f3 == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        float m = nj1.b0.m(this.a, k(f3));
        float m2 = nj1.b0.m(this.b, l(this.c));
        if ((z && this.a < 0.0f && this.s.b()) || (z && this.a > 0.0f && this.u.b())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.c == 1.0f) {
            f = m2;
        } else {
            f = 0.0f;
        }
        r22.o oVar = this.f;
        if (oVar != null) {
            r22.l e6 = ((r22.g) ((po1.baz) oVar).b).e6();
            int i = e6.z;
            r22.i iVar = (r22.i) ((com.truecaller.sdk.bar) e6).a;
            if (iVar != null) {
                ((r22.g) iVar).d6().b.setAlpha(1.0f - java.lang.Math.min(0.5f, java.lang.Math.abs(f) / i));
            }
            e6.y = f;
            if (java.lang.Math.abs(f) > i / 2) {
                r22.i iVar2 = (r22.i) ((com.truecaller.sdk.bar) e6).a;
                if (iVar2 != null) {
                    ((r22.g) iVar2).d6().d.setPlayWhenReady(false);
                }
                r22.i iVar3 = (r22.i) ((com.truecaller.sdk.bar) e6).a;
                if (iVar3 != null) {
                    ((r22.g) iVar3).i6(false);
                }
                r22.i iVar4 = (r22.i) ((com.truecaller.sdk.bar) e6).a;
                if (iVar4 != null) {
                    android.widget.LinearLayout linearLayout = ((r22.g) iVar4).d6().c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "bottomContatiner");
                    gj.m.k0(linearLayout, false);
                }
            } else if (!e6.C) {
                r22.i iVar5 = (r22.i) ((com.truecaller.sdk.bar) e6).a;
                if (iVar5 != null) {
                    if (e6.x && e6.f.getB()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ((r22.g) iVar5).i6(z3);
                }
                r22.i iVar6 = (r22.i) ((com.truecaller.sdk.bar) e6).a;
                if (iVar6 != null) {
                    boolean z5 = e6.x;
                    android.widget.LinearLayout linearLayout2 = ((r22.g) iVar6).d6().c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout2, "bottomContatiner");
                    gj.m.k0(linearLayout2, z5);
                }
            }
        } else {
            z4 = false;
        }
        float f4 = this.c;
        canvas.scale(f4, f4);
        kotlin.ranges.IntRange l = uf3.p.l(0, getChildCount());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(l, 10));
        kotlin.collections.m0 it = l.iterator();
        while (((uf3.h) it).c) {
            arrayList.add(getChildAt(it.nextInt()));
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            android.view.View view = (android.view.View) it2.next();
            float f5 = this.a;
            float f6 = 0.75f;
            if (z2) {
                f2 = 0.0f;
            } else {
                f2 = 0.75f;
            }
            view.setTranslationX(-(f5 - (f2 * m)));
            float f7 = this.b;
            if (z4) {
                f6 = 0.0f;
            }
            view.setTranslationY(-(f7 - (f6 * m2)));
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "child");
        if (this.c != 1.0f && !kotlin.jvm.internal.Intrinsics.b(view, this.t)) {
            return false;
        }
        canvas.save();
        boolean b = kotlin.jvm.internal.Intrinsics.b(view, this.s);
        int i = this.o;
        if (b) {
            canvas.translate((-getWidth()) - i, 0.0f);
        } else if (kotlin.jvm.internal.Intrinsics.b(view, this.u)) {
            canvas.translate(getWidth() + i, 0.0f);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e(float f) {
        z7.e eVar = this.m;
        if (eVar != null) {
            eVar.a();
        }
        android.animation.ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.j = f(new r22.bar(this, 1), this.b, f);
    }

    public final android.animation.ValueAnimator f(kotlin.jvm.functions.Function1 function1, float f, float f2) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(getShortAnimationTime());
        ofFloat.addUpdateListener(new com.truecaller.common.ui.baz(3, function1, this));
        ofFloat.start();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    public final void g(float f) {
        android.animation.ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.k = f(new r22.bar(this, 0), this.c, f);
    }

    public final long getPlaybackPosition() {
        return this.t.getPlaybackPosition();
    }

    public final void h() {
        this.a -= getWidth();
        this.t.setPlayWhenReady(false);
        r22.c cVar = this.s;
        this.s = this.t;
        this.t = this.u;
        this.u = cVar;
        cVar.e();
        p();
        r22.n nVar = this.g;
        if (nVar != null) {
            nVar.l1();
        }
        q9.w wVar = this.t.i;
        if (wVar != null) {
            wVar.seekTo(0L);
        }
    }

    public final void i() {
        this.a += getWidth();
        this.t.setPlayWhenReady(false);
        r22.c cVar = this.u;
        this.u = this.t;
        this.t = this.s;
        this.s = cVar;
        cVar.e();
        p();
        r22.n nVar = this.g;
        if (nVar != null) {
            nVar.m0();
        }
        q9.w wVar = this.t.i;
        if (wVar != null) {
            wVar.seekTo(0L);
        }
    }

    public final r22.c j(com.truecaller.messaging.mediaviewer.MediaPosition mediaPosition) {
        int i = r22.qux.a[mediaPosition.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return this.u;
                }
                throw new java.lang.RuntimeException();
            }
            return this.t;
        }
        return this.s;
    }

    public final uf3.d k(float f) {
        float width = (getWidth() - (getDrawableWidth() * getDrawableScale())) / 2;
        return new uf3.d(width, (getWidth() - (getWidth() / f)) - width);
    }

    public final uf3.d l(float f) {
        float height = (getHeight() - (getDrawableHeight() * getDrawableScale())) / 2;
        return new uf3.d(height, (getHeight() - (getHeight() / f)) - height);
    }

    public final void n(com.truecaller.messaging.mediaviewer.MediaPosition mediaPosition, android.graphics.drawable.Drawable drawable, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPosition, "position");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "subtitle");
        r22.c j = j(mediaPosition);
        android.widget.ImageView imageView = j.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "subtitle");
        j.e();
        if (uri == null) {
            imageView.setImageDrawable(drawable);
        } else {
            com.bumptech.glide.baz.f(imageView).o(uri).f().s(drawable).P(imageView);
        }
        j.f.setText(str);
        j.g.setText(str2);
        j.d.setVisibility(0);
    }

    public final void o(com.truecaller.messaging.mediaviewer.MediaPosition mediaPosition, android.net.Uri uri, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPosition, "position");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        r22.c j2 = j(mediaPosition);
        j2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        j2.e();
        android.widget.ImageView imageView = j2.a;
        imageView.setVisibility(0);
        int i = com.truecaller.messaging.mediaviewer.MediaViewerActivity.d0;
        imageView.setTransitionName(androidx.glance.appwidget.protobuf.d1.A(j));
        com.bumptech.glide.g i2 = com.bumptech.glide.baz.f(j2).o(uri).z(true).i(wf.g.c);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageView, "view");
        i2.Q(new ng.bar(imageView, 1), (mg.b) null, i2, qg.b.a);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "ev");
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        android.animation.ValueAnimator valueAnimator = this.i;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            android.animation.ValueAnimator valueAnimator2 = this.j;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                return;
            }
            float l = nj1.b0.l(this.c, getScaleLimits());
            this.c = l;
            this.a = nj1.b0.l(this.a, k(l));
            this.b = nj1.b0.l(this.b, l(this.c));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.animation.ValueAnimator valueAnimator;
        android.animation.ValueAnimator valueAnimator2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                android.animation.ValueAnimator valueAnimator3 = this.i;
                if ((valueAnimator3 == null || !valueAnimator3.isRunning()) && (((valueAnimator = this.j) == null || !valueAnimator.isRunning()) && ((valueAnimator2 = this.k) == null || !valueAnimator2.isRunning()))) {
                    if (this.c == 1.0f) {
                        if (this.a > this.p && this.u.b()) {
                            h();
                        } else if (this.a < (-r2) && this.s.b()) {
                            i();
                        }
                    }
                    float l = nj1.b0.l(this.c, getScaleLimits());
                    kotlin.Pair m = m(l / this.c, l, this.d, this.e);
                    float floatValue = ((java.lang.Number) m.a).floatValue();
                    float floatValue2 = ((java.lang.Number) m.b).floatValue();
                    float l2 = nj1.b0.l(this.a + floatValue, k(l));
                    float l3 = nj1.b0.l(this.b + floatValue2, l(l));
                    if (l2 != this.a) {
                        d(l2);
                    }
                    if (l3 != this.b) {
                        e(l3);
                    }
                    if (l != this.c) {
                        g(l);
                    }
                }
                r22.o oVar = this.f;
                if (oVar != null) {
                    r22.l e6 = ((r22.g) ((po1.baz) oVar).b).e6();
                    if (java.lang.Math.abs(e6.y) > e6.z) {
                        e6.C = true;
                        e6.d2();
                    }
                }
            }
        } else {
            this.q = -1;
            z7.e eVar = this.l;
            if (eVar != null) {
                eVar.a();
            }
            z7.e eVar2 = this.m;
            if (eVar2 != null) {
                eVar2.a();
            }
        }
        android.view.ScaleGestureDetector scaleGestureDetector = this.v;
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (scaleGestureDetector.isInProgress()) {
            return true;
        }
        this.w.onTouchEvent(motionEvent);
        return true;
    }

    public final void p() {
        androidx.media3.ui.PlayerControlView playerControlView = this.r;
        if (playerControlView != null) {
            this.t.setPlayerControlView(playerControlView);
        }
        h9.g0 g0Var = this.h;
        if (g0Var != null) {
            this.s.d(g0Var);
            this.u.d(g0Var);
            this.t.a(g0Var);
        }
    }

    public final void setOnImageSwipeListener(@org.jetbrains.annotations.Nullable r22.n nVar) {
        this.g = nVar;
    }

    public final void setOnOverScrollListener(@org.jetbrains.annotations.Nullable r22.o oVar) {
        this.f = oVar;
    }

    public final void setPlayWhenReady(boolean z) {
        this.t.setPlayWhenReady(z);
    }

    public final void setPlayerControlView(@org.jetbrains.annotations.Nullable androidx.media3.ui.PlayerControlView playerControlView) {
        this.r = playerControlView;
        if (playerControlView != null) {
            this.t.setPlayerControlView(playerControlView);
        }
    }

    public final void setPlayerEventListener(@org.jetbrains.annotations.Nullable h9.g0 g0Var) {
        h9.g0 g0Var2 = this.h;
        if (g0Var2 != null) {
            this.s.d(g0Var2);
            this.t.d(g0Var2);
            this.u.d(g0Var2);
        }
        this.h = g0Var;
        if (g0Var != null) {
            this.t.a(g0Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InteractiveMediaView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveMediaView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.c = 1.0f;
        this.n = kotlin.LazyKt.lazy(new o10.f(context, 4));
        this.o = t41.i.b(24.0f, context);
        this.p = t41.i.b(120.0f, context);
        this.q = -1;
        this.s = c();
        this.t = c();
        this.u = c();
        this.v = new android.view.ScaleGestureDetector(context, new r22.a(this));
        this.w = new android.view.GestureDetector(context, (android.view.GestureDetector.OnGestureListener) new i13.qux(this, 4));
    }

    public /* synthetic */ InteractiveMediaView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
