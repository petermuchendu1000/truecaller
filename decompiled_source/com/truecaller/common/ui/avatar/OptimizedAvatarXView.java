package com.truecaller.common.ui.avatar;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class OptimizedAvatarXView extends androidx.appcompat.widget.AppCompatImageView implements w31.qux {
    public static final /* synthetic */ int E = 0;
    public final kotlin.Lazy A;
    public final kotlin.Lazy B;
    public final int C;
    public final boolean D;
    public w31.baz a;
    public final x31.baz b;
    public final boolean c;
    public final kotlin.Lazy d;
    public final w31.h e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;
    public final kotlin.Lazy h;
    public final kotlin.Lazy i;
    public final kotlin.Lazy j;
    public final kotlin.Lazy k;
    public final kotlin.Lazy l;
    public float m;
    public float n;
    public boolean o;
    public final kotlin.Lazy p;
    public ng.b q;
    public final boolean r;
    public final float s;
    public final float t;
    public final float u;
    public final int v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public final kotlin.Lazy y;
    public final kotlin.Lazy z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptimizedAvatarXView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.graphics.Paint getAvatarBorderPaint() {
        return (android.graphics.Paint) this.k.getValue();
    }

    private final android.graphics.Paint getAvatarRingPaint() {
        return (android.graphics.Paint) this.h.getValue();
    }

    private final android.graphics.Rect getBackgroundBounds() {
        com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig;
        w31.baz bazVar = this.a;
        w31.h hVar = this.e;
        if (bazVar != null && (avatarXConfig = ((w31.c) bazVar).h0) != null && avatarXConfig.w) {
            android.graphics.Rect rect = hVar.w;
            if (rect != null) {
                return rect;
            }
            kotlin.jvm.internal.Intrinsics.n("emptyBackgroundBounds");
            throw null;
        }
        return hVar.b();
    }

    private final android.graphics.Paint getBackgroundPaint() {
        return (android.graphics.Paint) this.f.getValue();
    }

    private final android.graphics.Paint getBadgeBackgroundPaint() {
        return (android.graphics.Paint) this.g.getValue();
    }

    private final android.graphics.Paint getBadgeRingPaint() {
        return (android.graphics.Paint) this.i.getValue();
    }

    private final android.animation.ValueAnimator getLoadingAnimator() {
        return (android.animation.ValueAnimator) this.p.getValue();
    }

    private final android.graphics.Paint getPercentBackgroundPaint() {
        return (android.graphics.Paint) this.A.getValue();
    }

    private final android.graphics.Paint getPercentSignPaint() {
        return (android.graphics.Paint) this.z.getValue();
    }

    private final int getPercentSignWidth() {
        return ((java.lang.Number) this.B.getValue()).intValue();
    }

    private final android.graphics.Rect getPercentTextBounds() {
        android.graphics.Rect rect = new android.graphics.Rect();
        getPercentTextPaint().getTextBounds(java.lang.String.valueOf(this.v), 0, java.lang.String.valueOf(this.v).length(), rect);
        return rect;
    }

    private final android.graphics.Paint getPercentTextPaint() {
        return (android.graphics.Paint) this.y.getValue();
    }

    private final android.graphics.Paint getProgressBackgroundRingPaint() {
        return (android.graphics.Paint) this.x.getValue();
    }

    private final android.graphics.Paint getProgressRingPaint() {
        return (android.graphics.Paint) this.w.getValue();
    }

    private final float getScaleRatio() {
        return ((java.lang.Number) this.d.getValue()).floatValue();
    }

    private final android.graphics.Paint getTextPaint() {
        return (android.graphics.Paint) this.j.getValue();
    }

    private final android.graphics.Paint getWarningBackgroundPaint() {
        return (android.graphics.Paint) this.l.getValue();
    }

    public static int h(com.truecaller.common.ui.avatar.OptimizedAvatarXView optimizedAvatarXView) {
        android.graphics.Rect rect = new android.graphics.Rect();
        optimizedAvatarXView.getPercentSignPaint().getTextBounds("%", 0, 1, rect);
        return rect.width();
    }

    @Override // w31.qux
    public final void a(boolean z) {
        if (z && !getLoadingAnimator().isStarted()) {
            getLoadingAnimator().start();
        } else if (!z && getLoadingAnimator().isStarted()) {
            getLoadingAnimator().end();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w31.qux
    public final void e(boolean z, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        ng.b bVar = this.q;
        if (bVar == null) {
            bVar = new w31.e(this, 1);
            com.bumptech.glide.j e = com.bumptech.glide.baz.e(getContext().getApplicationContext());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "with(...)");
            com.bumptech.glide.g J = j52.b.J(e, uri, z);
            J.Q(bVar, (mg.b) null, J, qg.b.a);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bVar, "let(...)");
        }
        this.q = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w31.qux
    public final void f() {
        ng.b bVar = this.q;
        if (bVar != null) {
            com.bumptech.glide.baz.e(getContext().getApplicationContext()).l(bVar);
        }
        this.q = null;
    }

    @Override // w31.qux
    public final boolean g() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w31.qux
    public boolean getActivated() {
        return isActivated();
    }

    @org.jetbrains.annotations.Nullable
    public final w31.baz getPresenter() {
        return this.a;
    }

    public final float getRingSize() {
        return this.e.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w31.qux
    public boolean getWindowVisible() {
        if (getWindowVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.widget.ImageView*/.onAttachedToWindow();
        w31.baz bazVar = this.a;
        if (bazVar != null) {
            bazVar.u0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.widget.ImageView*/.onDetachedFromWindow();
        w31.baz bazVar = this.a;
        if (bazVar != null) {
            bazVar.m1();
        }
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(android.graphics.Canvas canvas) {
        java.lang.Boolean bool;
        android.graphics.drawable.Drawable drawable;
        android.graphics.Shader shader;
        android.graphics.Shader shader2;
        com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig;
        java.lang.Integer num;
        android.graphics.Shader shader3;
        java.lang.Integer num2;
        java.lang.Integer num3;
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3;
        android.graphics.drawable.Drawable c2;
        android.graphics.drawable.Drawable drawable4;
        android.graphics.drawable.Drawable h2;
        java.lang.Integer num4;
        java.lang.String str;
        java.lang.String e2;
        int i;
        java.lang.Integer g2;
        android.graphics.drawable.Drawable d2;
        java.lang.Integer num5;
        android.graphics.drawable.Drawable f2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        super/*android.widget.ImageView*/.onDraw(canvas);
        android.graphics.Rect backgroundBounds = getBackgroundBounds();
        w31.baz bazVar = this.a;
        if (bazVar != null && (f2 = bazVar.f2()) != null) {
            int i2 = backgroundBounds.left;
            int i3 = backgroundBounds.right;
            f2.setBounds(i2, i2, i3, i3);
            f2.draw(canvas);
        }
        w31.baz bazVar2 = this.a;
        android.graphics.drawable.Drawable drawable5 = null;
        if (bazVar2 != null) {
            w31.c cVar = (w31.c) bazVar2;
            if (cVar.r2()) {
                num5 = java.lang.Integer.valueOf(((java.lang.Number) cVar.Q.getValue()).intValue());
            } else if (cVar.f2() != null) {
                num5 = null;
            } else {
                num5 = cVar.m;
            }
            if (num5 != null) {
                getBackgroundPaint().setColor(num5.intValue());
                float f = backgroundBounds.left;
                float f3 = backgroundBounds.right;
                canvas.drawOval(f, f, f3, f3, getBackgroundPaint());
            }
        }
        w31.baz bazVar3 = this.a;
        w31.h hVar = this.e;
        if (bazVar3 != null && (d2 = bazVar3.d2()) != null) {
            w31.f fVar = hVar.n;
            if (fVar != null) {
                int i4 = fVar.a;
                int i5 = fVar.b;
                d2.setBounds(i4, i4, i5, i5);
                d2.draw(canvas);
            } else {
                kotlin.jvm.internal.Intrinsics.n("avatarIconBounds");
                throw null;
            }
        }
        w31.baz bazVar4 = this.a;
        if (bazVar4 != null && (e2 = bazVar4.e2()) != null) {
            getTextPaint().setTextSize(hVar.d);
            android.graphics.Paint textPaint = getTextPaint();
            w31.baz bazVar5 = this.a;
            if (bazVar5 != null && (g2 = bazVar5.g2()) != null) {
                i = g2.intValue();
            } else {
                i = 0;
            }
            textPaint.setColor(i);
            canvas.drawText(e2, getWidth() / 2.0f, (getWidth() / 2.0f) - ((getTextPaint().ascent() + getTextPaint().descent()) / 2.0f), getTextPaint());
        }
        w31.baz bazVar6 = this.a;
        if (bazVar6 != null) {
            w31.c cVar2 = (w31.c) bazVar6;
            if (cVar2.r2() || cVar2.f2() != null || cVar2.e2() != null) {
                str = null;
            } else {
                str = cVar2.h;
            }
            if (str != null) {
                getTextPaint().setTextSize(hVar.d);
                canvas.drawText(str, getWidth() / 2.0f, (getWidth() / 2.0f) - ((getTextPaint().ascent() + getTextPaint().descent()) / 2.0f), getTextPaint());
            }
        }
        w31.baz bazVar7 = this.a;
        if (bazVar7 != null) {
            w31.c cVar3 = (w31.c) bazVar7;
            com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig2 = cVar3.h0;
            if (avatarXConfig2 != null && avatarXConfig2.z && cVar3.f2() == null) {
                num4 = cVar3.s;
            } else {
                num4 = null;
            }
            if (num4 != null) {
                getWarningBackgroundPaint().setColor(num4.intValue());
                float f4 = backgroundBounds.left;
                float f5 = backgroundBounds.right;
                canvas.drawOval(f4, f4, f5, f5, getWarningBackgroundPaint());
            }
        }
        w31.baz bazVar8 = this.a;
        if (bazVar8 != null && (h2 = bazVar8.h2()) != null) {
            w31.f fVar2 = hVar.o;
            if (fVar2 != null) {
                int i6 = fVar2.a;
                int i7 = fVar2.b;
                h2.setBounds(i6, i6, i7, i7);
                h2.draw(canvas);
            } else {
                kotlin.jvm.internal.Intrinsics.n("warningBounds");
                throw null;
            }
        }
        w31.baz bazVar9 = this.a;
        if (bazVar9 != null) {
            w31.c cVar4 = (w31.c) bazVar9;
            if (cVar4.f2() != null || cVar4.e2() != null || cVar4.h2() != null) {
                drawable4 = null;
            } else {
                drawable4 = cVar4.j;
            }
            if (drawable4 != null) {
                int i8 = backgroundBounds.left;
                int i9 = backgroundBounds.right;
                drawable4.setBounds(i8, i8, i9, i9);
                drawable4.draw(canvas);
            }
        }
        w31.baz bazVar10 = this.a;
        if (bazVar10 != null && (c2 = bazVar10.c2()) != null) {
            w31.f fVar3 = hVar.p;
            if (fVar3 != null) {
                int i10 = fVar3.a;
                int i11 = fVar3.b;
                c2.setBounds(i10, i10, i11, i11);
                c2.draw(canvas);
            } else {
                kotlin.jvm.internal.Intrinsics.n("addPhotoBounds");
                throw null;
            }
        }
        w31.baz bazVar11 = this.a;
        if (bazVar11 != null && (drawable3 = ((w31.c) bazVar11).k) != null) {
            int i12 = backgroundBounds.left;
            int i13 = backgroundBounds.right;
            drawable3.setBounds(i12, i12, i13, i13);
            drawable3.draw(canvas);
        }
        w31.baz bazVar12 = this.a;
        if (bazVar12 != null && (drawable2 = ((w31.c) bazVar12).l) != null) {
            android.graphics.Rect rect = hVar.v;
            if (rect != null) {
                drawable2.setBounds(rect.left, rect.top, rect.right, rect.bottom);
                drawable2.draw(canvas);
            } else {
                kotlin.jvm.internal.Intrinsics.n("editIconBounds");
                throw null;
            }
        }
        w31.baz bazVar13 = this.a;
        if (bazVar13 != null) {
            w31.c cVar5 = (w31.c) bazVar13;
            if (cVar5.r2()) {
                num3 = null;
            } else {
                num3 = cVar5.o;
            }
            if (num3 != null) {
                int intValue = num3.intValue();
                getAvatarRingPaint().setStrokeWidth(getRingSize());
                getAvatarRingPaint().setColor(intValue);
                getAvatarRingPaint().setShader(null);
                w31.bar barVar = hVar.q;
                if (barVar != null) {
                    float f6 = barVar.a;
                    float f7 = barVar.b;
                    canvas.drawArc(f6, f6, f7, f7, this.m, this.n, false, getAvatarRingPaint());
                } else {
                    kotlin.jvm.internal.Intrinsics.n("avatarLoadingBounds");
                    throw null;
                }
            }
        }
        getAvatarRingPaint().setStrokeWidth(getRingSize());
        android.graphics.Paint avatarRingPaint = getAvatarRingPaint();
        w31.baz bazVar14 = this.a;
        boolean z = this.c;
        if (bazVar14 != null) {
            w31.c cVar6 = (w31.c) bazVar14;
            android.graphics.Shader u2 = cVar6.u2(cVar6.f0, cVar6.w2(), getWidth(), z);
            cVar6.f0 = u2;
            if (u2 != null) {
                avatarRingPaint.setShader(u2);
                if (getAvatarRingPaint().getShader() != null) {
                    android.graphics.RectF rectF = hVar.A;
                    canvas.drawOval(rectF.left, rectF.top, rectF.right, rectF.bottom, getAvatarRingPaint());
                }
            }
        }
        float ringSize = getRingSize();
        android.graphics.RectF rectF2 = hVar.y;
        if (rectF2 != null) {
            w31.baz bazVar15 = this.a;
            if (bazVar15 != null) {
                com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig3 = ((w31.c) bazVar15).h0;
                if (avatarXConfig3 != null && (num2 = avatarXConfig3.o) != null) {
                    shader3 = w31.c.x2(null, ringSize, num2.intValue());
                } else {
                    shader3 = null;
                }
                if (shader3 != null) {
                    getAvatarBorderPaint().setShader(shader3);
                    getAvatarBorderPaint().setStrokeWidth(ringSize);
                    canvas.drawOval(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, getAvatarBorderPaint());
                }
            }
            w31.baz bazVar16 = this.a;
            if (bazVar16 != null) {
                w31.c cVar7 = (w31.c) bazVar16;
                if (!cVar7.r2() && ((avatarXConfig = cVar7.h0) == null || avatarXConfig.u)) {
                    if (cVar7.r2()) {
                        num = null;
                    } else {
                        num = cVar7.o;
                    }
                    if (num == null) {
                        drawable = cVar7.p;
                        if (drawable != null) {
                            android.graphics.Paint badgeBackgroundPaint = getBadgeBackgroundPaint();
                            w31.baz bazVar17 = this.a;
                            if (bazVar17 != null) {
                                shader = bazVar17.j2(hVar.k, z);
                            } else {
                                shader = null;
                            }
                            badgeBackgroundPaint.setShader(shader);
                            if (getBadgeBackgroundPaint().getShader() != null) {
                                canvas.drawOval(hVar.z, getBadgeBackgroundPaint());
                            }
                            android.graphics.Paint badgeRingPaint = getBadgeRingPaint();
                            w31.baz bazVar18 = this.a;
                            if (bazVar18 != null) {
                                android.graphics.RectF rectF3 = hVar.z;
                                shader2 = bazVar18.k2(rectF3.right - rectF3.left);
                            } else {
                                shader2 = null;
                            }
                            badgeRingPaint.setShader(shader2);
                            getBadgeRingPaint().setStrokeWidth(hVar.i);
                            android.graphics.RectF rectF4 = hVar.z;
                            canvas.drawOval(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, getBadgeRingPaint());
                            w31.f fVar4 = hVar.u;
                            if (fVar4 != null) {
                                int i14 = fVar4.a;
                                int i15 = fVar4.b;
                                drawable.setBounds(i14, i14, i15, i15);
                                drawable.draw(canvas);
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("badgeIconBounds");
                                throw null;
                            }
                        }
                    }
                }
                drawable = null;
                if (drawable != null) {
                }
            }
            w31.baz bazVar19 = this.a;
            if (bazVar19 != null) {
                w31.c cVar8 = (w31.c) bazVar19;
                com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig4 = cVar8.h0;
                if (avatarXConfig4 != null) {
                    bool = java.lang.Boolean.valueOf(avatarXConfig4.B);
                } else {
                    bool = null;
                }
                if (kotlin.jvm.internal.Intrinsics.b(bool, java.lang.Boolean.TRUE)) {
                    drawable5 = cVar8.t;
                }
                if (drawable5 != null) {
                    int i16 = backgroundBounds.left;
                    int i17 = backgroundBounds.right;
                    drawable5.setBounds(i16, i16, i17, i17);
                    drawable5.draw(canvas);
                    return;
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("backgroundBoundsRectF");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (i < i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            super/*android.widget.ImageView*/.onMeasure(i, i);
        } else {
            if (!z) {
                super/*android.widget.ImageView*/.onMeasure(i2, i2);
                return;
            }
            throw new java.lang.RuntimeException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.widget.ImageView*/.onSizeChanged(i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        w31.h hVar = this.e;
        hVar.getClass();
        hVar.w = new android.graphics.Rect(0, 0, width, width);
        float f = width;
        float f2 = hVar.a * f;
        hVar.i = 2.0f * f2;
        hVar.j = 2.5f * f2;
        hVar.c = 39.0f * f2;
        hVar.k = 16.0f * f2;
        hVar.l = 14.0f * f2;
        float f3 = 20.0f * f2;
        hVar.d = f3;
        hVar.e = f3;
        float f4 = 5.0f * f2;
        hVar.f = f4;
        hVar.g = f4;
        hVar.h = 15.0f * f2;
        hVar.m = f2 * 4.0f;
        w31.f a = w31.h.a(f3, width);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "<set-?>");
        hVar.n = a;
        w31.f a2 = w31.h.a(hVar.c, width);
        int i5 = a2.a;
        int i6 = a2.b;
        hVar.x = new android.graphics.Rect(i5, i5, i6, i6);
        android.graphics.RectF rectF = new android.graphics.RectF(hVar.b());
        hVar.y = rectF;
        android.graphics.RectF rectF2 = hVar.A;
        float f5 = (-hVar.i) * 1.5f;
        rectF2.set(rectF);
        rectF2.inset(f5, f5);
        w31.f a3 = w31.h.a(hVar.h, width);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a3, "<set-?>");
        hVar.o = a3;
        w31.f a4 = w31.h.a(hVar.e, width);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a4, "<set-?>");
        hVar.p = a4;
        float f6 = hVar.i - hVar.m;
        float f7 = hVar.k + f6;
        android.graphics.RectF rectF3 = new android.graphics.RectF(f6, f6, f7, f7);
        hVar.z = rectF3;
        float f8 = 2;
        w31.f fVar = new w31.f(qf3.a.b(((hVar.k - hVar.l) / f8) + rectF3.left), qf3.a.b(((hVar.k + hVar.l) / f8) + hVar.z.left));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        hVar.u = fVar;
        float d = hVar.d();
        float f9 = hVar.f;
        int i7 = (int) (((height - d) - f9) - hVar.g);
        android.graphics.Rect rect = new android.graphics.Rect(((int) (f - f9)) / 2, i7, ((int) (f + f9)) / 2, (int) (i7 + f9));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<set-?>");
        hVar.v = rect;
        float f10 = hVar.i;
        w31.bar barVar = new w31.bar(f10, f - f10);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        hVar.q = barVar;
        android.graphics.RectF rectF4 = new android.graphics.RectF(hVar.b());
        float f11 = rectF4.left;
        float f12 = hVar.j / f8;
        rectF4.left = f11 - f12;
        rectF4.top -= f12;
        rectF4.right += f12;
        rectF4.bottom = f12 + rectF4.bottom;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF4, "<set-?>");
        hVar.r = rectF4;
        android.graphics.RectF rectF5 = new android.graphics.RectF(hVar.b());
        float width2 = hVar.b().width() / 2;
        float f13 = hVar.C;
        rectF5.left = (hVar.j / f8) + (width2 - (f13 / f8));
        float d2 = (hVar.b().bottom - (hVar.d() / f8)) - (hVar.j / f8);
        rectF5.top = d2;
        rectF5.right = rectF5.left + f13;
        rectF5.bottom = hVar.d() + d2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF5, "<set-?>");
        hVar.s = rectF5;
        int i8 = (int) hVar.c().left;
        int i9 = (int) hVar.c().top;
        float f14 = hVar.c().right;
        float f15 = hVar.E;
        android.graphics.Rect rect2 = new android.graphics.Rect(i8, i9, (int) (f14 + f15), (int) (hVar.c().bottom + f15));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect2, "<set-?>");
        hVar.t = rect2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onVisibilityAggregated(boolean z) {
        super/*android.widget.ImageView*/.onVisibilityAggregated(z);
        w31.baz bazVar = this.a;
        if (bazVar != null) {
            w31.c cVar = (w31.c) bazVar;
            if (cVar.i0) {
                if (!z) {
                    w31.qux quxVar = (w31.qux) ((com.truecaller.sdk.bar) cVar).a;
                    if (quxVar != null) {
                        quxVar.a(false);
                        return;
                    }
                    return;
                }
                cVar.D2(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnAvatarClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "listener");
        setOnClickListener(new aq2.g(20, function1));
    }

    public void setPresenter(@org.jetbrains.annotations.Nullable w31.baz bazVar) {
        f();
        this.a = bazVar;
        if (bazVar != null) {
            bazVar.u0(this);
        }
        if (bazVar != null) {
            x31.baz bazVar2 = this.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "blockManager");
            ((w31.c) bazVar).k0 = bazVar2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptimizedAvatarXView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OptimizedAvatarXView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.b = (x31.baz) ((y31.bar) f40.d0.z(context, y31.bar.class)).H.b.d4.get();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.common.ui.R$styleable.a);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.c = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        final java.lang.Object[] objArr = 0 == true ? 1 : 0;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: w31.i
            public final /* synthetic */ com.truecaller.common.ui.avatar.OptimizedAvatarXView b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [com.truecaller.common.ui.avatar.OptimizedAvatarXView, android.view.View, java.lang.Object] */
            public final java.lang.Object invoke() {
                int i2 = objArr;
                ?? r1 = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.common.ui.avatar.OptimizedAvatarXView.E;
                        return java.lang.Float.valueOf(r1.getResources().getDimension(2131165430) / r1.getResources().getDimension(2131165429));
                    case 1:
                        int i4 = com.truecaller.common.ui.avatar.OptimizedAvatarXView.E;
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 60);
                        ofInt.setDuration(1000L);
                        ofInt.setRepeatCount(-1);
                        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                        ofInt.addUpdateListener(new ao.c(r1, 15));
                        return ofInt;
                    default:
                        return java.lang.Integer.valueOf(com.truecaller.common.ui.avatar.OptimizedAvatarXView.h(r1));
                }
            }
        });
        float scaleRatio = getScaleRatio();
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.e = new w31.h(scaleRatio, displayMetrics);
        this.f = kotlin.LazyKt.lazy(new w31.j(3));
        this.g = kotlin.LazyKt.lazy(new w31.j(4));
        this.h = kotlin.LazyKt.lazy(new w31.j(5));
        this.i = kotlin.LazyKt.lazy(new w31.j(6));
        this.j = kotlin.LazyKt.lazy(new v1.k1(27));
        this.k = kotlin.LazyKt.lazy(new v1.k1(28));
        this.l = kotlin.LazyKt.lazy(new v1.k1(29));
        final int i2 = 1;
        this.p = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: w31.i
            public final /* synthetic */ com.truecaller.common.ui.avatar.OptimizedAvatarXView b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [com.truecaller.common.ui.avatar.OptimizedAvatarXView, android.view.View, java.lang.Object] */
            public final java.lang.Object invoke() {
                int i22 = i2;
                ?? r1 = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.common.ui.avatar.OptimizedAvatarXView.E;
                        return java.lang.Float.valueOf(r1.getResources().getDimension(2131165430) / r1.getResources().getDimension(2131165429));
                    case 1:
                        int i4 = com.truecaller.common.ui.avatar.OptimizedAvatarXView.E;
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 60);
                        ofInt.setDuration(1000L);
                        ofInt.setRepeatCount(-1);
                        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                        ofInt.addUpdateListener(new ao.c(r1, 15));
                        return ofInt;
                    default:
                        return java.lang.Integer.valueOf(com.truecaller.common.ui.avatar.OptimizedAvatarXView.h(r1));
                }
            }
        });
        this.r = false;
        this.s = 90.0f;
        this.t = 360.0f;
        this.u = 360.0f;
        this.v = 100;
        this.w = kotlin.LazyKt.lazy(new w31.j(0 == true ? 1 : 0));
        this.x = kotlin.LazyKt.lazy(new w31.j(i2));
        this.y = kotlin.LazyKt.lazy(new o10.f(context, 12));
        this.z = kotlin.LazyKt.lazy(new o10.f(context, 13));
        final int i3 = 2;
        this.A = kotlin.LazyKt.lazy(new w31.j(i3));
        this.B = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: w31.i
            public final /* synthetic */ com.truecaller.common.ui.avatar.OptimizedAvatarXView b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [com.truecaller.common.ui.avatar.OptimizedAvatarXView, android.view.View, java.lang.Object] */
            public final java.lang.Object invoke() {
                int i22 = i3;
                ?? r1 = this.b;
                switch (i22) {
                    case 0:
                        int i32 = com.truecaller.common.ui.avatar.OptimizedAvatarXView.E;
                        return java.lang.Float.valueOf(r1.getResources().getDimension(2131165430) / r1.getResources().getDimension(2131165429));
                    case 1:
                        int i4 = com.truecaller.common.ui.avatar.OptimizedAvatarXView.E;
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 60);
                        ofInt.setDuration(1000L);
                        ofInt.setRepeatCount(-1);
                        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                        ofInt.addUpdateListener(new ao.c(r1, 15));
                        return ofInt;
                    default:
                        return java.lang.Integer.valueOf(com.truecaller.common.ui.avatar.OptimizedAvatarXView.h(r1));
                }
            }
        });
        this.C = getPercentSignWidth() / 3;
        this.D = context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public /* synthetic */ OptimizedAvatarXView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
