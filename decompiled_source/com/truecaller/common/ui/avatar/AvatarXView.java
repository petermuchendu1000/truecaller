package com.truecaller.common.ui.avatar;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public class AvatarXView extends androidx.appcompat.widget.AppCompatImageView implements w31.qux {
    public static final /* synthetic */ int S = 0;
    public boolean A;
    public final float B;
    public final float C;
    public float D;
    public int E;
    public final kotlin.Lazy F;
    public final kotlin.Lazy G;
    public final kotlin.Lazy H;
    public final kotlin.Lazy I;
    public final kotlin.Lazy J;
    public final kotlin.Lazy K;
    public final int L;
    public final float M;
    public final float N;
    public final float O;
    public final float P;
    public final boolean Q;
    public final kotlin.Lazy R;
    public w31.baz a;
    public final x31.baz b;
    public final boolean c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public final kotlin.Lazy n;
    public final kotlin.Lazy o;
    public final kotlin.Lazy p;
    public final kotlin.Lazy q;
    public final kotlin.Lazy r;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public float u;
    public float v;
    public boolean w;
    public final kotlin.Lazy x;
    public ng.b y;
    public boolean z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarXView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final android.graphics.RectF getAvatarBgBounds() {
        com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig;
        w31.baz bazVar = this.a;
        if (bazVar != null && (avatarXConfig = ((w31.c) bazVar).h0) != null && avatarXConfig.w) {
            return new android.graphics.RectF(0.0f, 0.0f, getWidth(), getWidth());
        }
        float f = 2;
        float width = (getWidth() - this.d) / f;
        float width2 = (getWidth() + this.d) / f;
        return new android.graphics.RectF(width, width, width2, width2);
    }

    private final android.graphics.Paint getAvatarBorderPaint() {
        return (android.graphics.Paint) this.s.getValue();
    }

    private final android.graphics.RectF getAvatarRingBounds() {
        return (android.graphics.RectF) this.R.getValue();
    }

    private final android.graphics.Paint getAvatarRingPaint() {
        return (android.graphics.Paint) this.p.getValue();
    }

    private final android.graphics.Paint getBackgroundPaint() {
        return (android.graphics.Paint) this.n.getValue();
    }

    private final android.graphics.Paint getBadgeBackgroundPaint() {
        return (android.graphics.Paint) this.o.getValue();
    }

    private final android.graphics.Paint getBadgeRingPaint() {
        return (android.graphics.Paint) this.q.getValue();
    }

    private final android.animation.ValueAnimator getLoadingAnimator() {
        return (android.animation.ValueAnimator) this.x.getValue();
    }

    private final android.graphics.Paint getPercentBackgroundPaint() {
        return (android.graphics.Paint) this.J.getValue();
    }

    private final android.graphics.Paint getPercentSignPaint() {
        return (android.graphics.Paint) this.I.getValue();
    }

    private final int getPercentSignWidth() {
        return ((java.lang.Number) this.K.getValue()).intValue();
    }

    private final android.graphics.Rect getPercentTextBounds() {
        android.graphics.Rect rect = new android.graphics.Rect();
        getPercentTextPaint().getTextBounds(java.lang.String.valueOf(this.E), 0, java.lang.String.valueOf(this.E).length(), rect);
        return rect;
    }

    private final android.graphics.Paint getPercentTextPaint() {
        return (android.graphics.Paint) this.H.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final android.graphics.Rect getPhotoBounds() {
        com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig;
        w31.baz bazVar = this.a;
        if (bazVar != null && (avatarXConfig = ((w31.c) bazVar).h0) != null && avatarXConfig.w) {
            return new android.graphics.Rect(0, 0, getWidth(), getWidth());
        }
        int width = ((int) (getWidth() - this.d)) / 2;
        int width2 = ((int) (getWidth() + this.d)) / 2;
        return new android.graphics.Rect(width, width, width2, width2);
    }

    private final android.graphics.Paint getProgressBackgroundRingPaint() {
        return (android.graphics.Paint) this.G.getValue();
    }

    private final android.graphics.Paint getProgressRingPaint() {
        return (android.graphics.Paint) this.F.getValue();
    }

    private final android.graphics.Paint getTextPaint() {
        return (android.graphics.Paint) this.r.getValue();
    }

    private final android.graphics.Paint getWarningBackgroundPaint() {
        return (android.graphics.Paint) this.t.getValue();
    }

    public static int h(com.truecaller.common.ui.avatar.AvatarXView avatarXView) {
        android.graphics.Rect rect = new android.graphics.Rect();
        avatarXView.getPercentSignPaint().getTextBounds("%", 0, 1, rect);
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
        ng.b bVar = this.y;
        if (bVar == null) {
            bVar = new w31.e(this, 0);
            com.bumptech.glide.j e = com.bumptech.glide.baz.e(getContext().getApplicationContext());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "with(...)");
            com.bumptech.glide.g J = j52.b.J(e, uri, z);
            J.Q(bVar, (mg.b) null, J, qg.b.a);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bVar, "let(...)");
        }
        this.y = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w31.qux
    public final void f() {
        ng.b bVar = this.y;
        if (bVar != null) {
            com.bumptech.glide.baz.e(getContext().getApplicationContext()).l(bVar);
        }
        this.y = null;
    }

    @Override // w31.qux
    public final boolean g() {
        return this.z;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w31.qux
    public boolean getWindowVisible() {
        if (getWindowVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final android.graphics.RectF i(android.graphics.Canvas canvas, android.graphics.RectF rectF) {
        w31.m m2;
        w31.m m22;
        android.graphics.drawable.Drawable drawable;
        float f = 2;
        float width = rectF.width() / f;
        float f2 = this.M;
        float f3 = this.k / f;
        float f4 = (width - (f2 / f)) + f3;
        float f5 = rectF.bottom;
        float f6 = this.N;
        float f7 = (f5 - (f6 / f)) - f3;
        float f8 = f2 + f4;
        float f9 = f6 + f7;
        w31.baz bazVar = this.a;
        if (bazVar != null && (m22 = bazVar.m2()) != null && (drawable = m22.f) != null) {
            float f10 = this.P;
            drawable.setBounds((int) f4, (int) f7, (int) (f8 + f10), (int) (f10 + f9));
            drawable.draw(canvas);
        }
        w31.baz bazVar2 = this.a;
        if (bazVar2 != null && (m2 = bazVar2.m2()) != null) {
            getPercentBackgroundPaint().setColor(m2.d);
        }
        android.graphics.RectF rectF2 = new android.graphics.RectF(f4, f7, f8, f9);
        float f11 = (f9 - f7) / f;
        canvas.drawRoundRect(rectF2, f11, f11, getPercentBackgroundPaint());
        return rectF2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i, boolean z) {
        if (i >= 0 && i <= 100) {
            this.z = true;
            this.A = z;
            this.E = i;
            this.D = (this.C * i) / 100;
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        w31.baz bazVar;
        super/*android.widget.ImageView*/.onAttachedToWindow();
        if (!isInEditMode() && (bazVar = this.a) != null) {
            bazVar.u0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.widget.ImageView*/.onDetachedFromWindow();
        if (isInEditMode()) {
            return;
        }
        w31.baz bazVar = this.a;
        if (bazVar != null) {
            bazVar.m1();
        }
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Rect rect;
        android.graphics.RectF rectF;
        w31.baz bazVar;
        w31.baz bazVar2;
        w31.baz bazVar3;
        w31.baz bazVar4;
        w31.baz bazVar5;
        w31.baz bazVar6;
        w31.baz bazVar7;
        w31.baz bazVar8;
        w31.baz bazVar9;
        float f;
        w31.baz bazVar10;
        float f2;
        w31.baz bazVar11;
        float f3;
        android.graphics.RectF rectF2;
        w31.baz bazVar12;
        w31.baz bazVar13;
        w31.baz bazVar14;
        java.lang.Boolean bool;
        android.graphics.drawable.Drawable drawable;
        android.graphics.Shader shader;
        android.graphics.Shader shader2;
        com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig;
        java.lang.Integer num;
        android.graphics.RectF rectF3;
        int i;
        w31.m m2;
        android.graphics.LinearGradient linearGradient;
        w31.m m22;
        android.graphics.drawable.Drawable drawable2;
        android.graphics.Shader shader3;
        java.lang.Integer num2;
        java.lang.Integer num3;
        android.graphics.drawable.Drawable drawable3;
        android.graphics.drawable.Drawable drawable4;
        android.graphics.RectF rectF4;
        android.graphics.drawable.Drawable c2;
        android.graphics.drawable.Drawable drawable5;
        android.graphics.RectF rectF5;
        android.graphics.drawable.Drawable h2;
        java.lang.Integer num4;
        java.lang.String str;
        java.lang.String e2;
        w31.baz bazVar15;
        int i2;
        java.lang.Integer g2;
        android.graphics.drawable.Drawable d2;
        java.lang.Integer num5;
        android.graphics.drawable.Drawable f22;
        android.graphics.Canvas canvas2 = canvas;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas2, "canvas");
        super/*android.widget.ImageView*/.onDraw(canvas);
        w31.baz bazVar16 = this.a;
        android.graphics.drawable.Drawable drawable6 = null;
        if (bazVar16 != null && (f22 = bazVar16.f2()) != null) {
            android.graphics.Rect photoBounds = getPhotoBounds();
            int i3 = photoBounds.left;
            int i4 = photoBounds.right;
            f22.setBounds(i3, i3, i4, i4);
            f22.draw(canvas2);
            rect = photoBounds;
        } else {
            rect = null;
        }
        w31.baz bazVar17 = this.a;
        if (bazVar17 != null) {
            w31.c cVar = (w31.c) bazVar17;
            if (cVar.r2()) {
                num5 = java.lang.Integer.valueOf(((java.lang.Number) cVar.Q.getValue()).intValue());
            } else if (cVar.f2() != null) {
                num5 = null;
            } else {
                num5 = cVar.m;
            }
            if (num5 != null) {
                getBackgroundPaint().setColor(num5.intValue());
                android.graphics.RectF avatarBgBounds = getAvatarBgBounds();
                float f4 = avatarBgBounds.left;
                float f5 = avatarBgBounds.right;
                canvas2.drawOval(f4, f4, f5, f5, getBackgroundPaint());
                rectF = avatarBgBounds;
                bazVar = this.a;
                if (bazVar != null && (d2 = bazVar.d2()) != null) {
                    int width = ((int) (getWidth() - this.e)) / 2;
                    int width2 = ((int) (getWidth() + this.e)) / 2;
                    d2.setBounds(width, width, width2, width2);
                    d2.draw(canvas2);
                }
                bazVar2 = this.a;
                if (bazVar2 != null && (e2 = bazVar2.e2()) != null) {
                    getTextPaint().setTextSize(this.e);
                    android.graphics.Paint textPaint = getTextPaint();
                    bazVar15 = this.a;
                    if (bazVar15 == null && (g2 = bazVar15.g2()) != null) {
                        i2 = g2.intValue();
                    } else {
                        i2 = 0;
                    }
                    textPaint.setColor(i2);
                    canvas2.drawText(e2, getWidth() / 2.0f, (getWidth() / 2.0f) - ((getTextPaint().ascent() + getTextPaint().descent()) / 2.0f), getTextPaint());
                }
                bazVar3 = this.a;
                if (bazVar3 != null) {
                    w31.c cVar2 = (w31.c) bazVar3;
                    if (cVar2.r2() || cVar2.f2() != null || cVar2.e2() != null) {
                        str = null;
                    } else {
                        str = cVar2.h;
                    }
                    if (str != null) {
                        getTextPaint().setTextSize(this.e);
                        canvas2.drawText(str, getWidth() / 2.0f, (getWidth() / 2.0f) - ((getTextPaint().ascent() + getTextPaint().descent()) / 2.0f), getTextPaint());
                    }
                }
                bazVar4 = this.a;
                if (bazVar4 != null) {
                    w31.c cVar3 = (w31.c) bazVar4;
                    com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig2 = cVar3.h0;
                    if (avatarXConfig2 != null && avatarXConfig2.z && cVar3.f2() == null) {
                        num4 = cVar3.s;
                    } else {
                        num4 = null;
                    }
                    if (num4 != null) {
                        getWarningBackgroundPaint().setColor(num4.intValue());
                        android.graphics.RectF avatarBgBounds2 = getAvatarBgBounds();
                        float f6 = avatarBgBounds2.left;
                        float f7 = avatarBgBounds2.right;
                        canvas2.drawOval(f6, f6, f7, f7, getWarningBackgroundPaint());
                    }
                }
                bazVar5 = this.a;
                if (bazVar5 != null && (h2 = bazVar5.h2()) != null) {
                    int width3 = ((int) (getWidth() - this.i)) / 2;
                    int width4 = ((int) (getWidth() + this.i)) / 2;
                    h2.setBounds(width3, width3, width4, width4);
                    h2.draw(canvas2);
                }
                bazVar6 = this.a;
                if (bazVar6 != null) {
                    w31.c cVar4 = (w31.c) bazVar6;
                    if (cVar4.f2() != null || cVar4.e2() != null || cVar4.h2() != null) {
                        drawable5 = null;
                    } else {
                        drawable5 = cVar4.j;
                    }
                    if (drawable5 != null) {
                        if (rect != null) {
                            rectF5 = new android.graphics.RectF(rect);
                        } else if (rectF != null) {
                            rectF5 = new android.graphics.RectF(rectF);
                        }
                        int i5 = (int) rectF5.left;
                        int i6 = (int) rectF5.right;
                        drawable5.setBounds(i5, i5, i6, i6);
                        drawable5.draw(canvas2);
                    }
                }
                bazVar7 = this.a;
                if (bazVar7 != null && (c2 = bazVar7.c2()) != null) {
                    int width5 = ((int) (getWidth() - this.f)) / 2;
                    int width6 = ((int) (getWidth() + this.f)) / 2;
                    c2.setBounds(width5, width5, width6, width6);
                    c2.draw(canvas2);
                }
                bazVar8 = this.a;
                if (bazVar8 != null && (drawable4 = ((w31.c) bazVar8).k) != null) {
                    if (rect == null) {
                        rectF4 = new android.graphics.RectF(rect);
                    } else if (rectF != null) {
                        rectF4 = new android.graphics.RectF(rectF);
                    }
                    int i7 = (int) rectF4.left;
                    int i8 = (int) rectF4.right;
                    drawable4.setBounds(i7, i7, i8, i8);
                    drawable4.draw(canvas2);
                }
                bazVar9 = this.a;
                f = this.N;
                if (bazVar9 != null && (drawable3 = ((w31.c) bazVar9).l) != null) {
                    int width7 = ((int) (getWidth() - this.g)) / 2;
                    int width8 = ((int) (getWidth() + this.g)) / 2;
                    float f8 = this.g;
                    int height = (int) (((getHeight() - f) - f8) - this.h);
                    drawable3.setBounds(width7, height, width8, (int) (height + f8));
                    drawable3.draw(canvas2);
                }
                bazVar10 = this.a;
                if (bazVar10 != null) {
                    w31.c cVar5 = (w31.c) bazVar10;
                    if (cVar5.r2()) {
                        num3 = null;
                    } else {
                        num3 = cVar5.o;
                    }
                    if (num3 != null) {
                        int intValue = num3.intValue();
                        getAvatarRingPaint().setStrokeWidth(this.j);
                        getAvatarRingPaint().setColor(intValue);
                        getAvatarRingPaint().setShader(null);
                        float f9 = this.j;
                        float width9 = getWidth() - this.j;
                        f2 = f;
                        canvas2.drawArc(f9, f9, width9, width9, this.u, this.v, false, getAvatarRingPaint());
                        getAvatarRingPaint().setStrokeWidth(this.j);
                        float width10 = getWidth();
                        android.graphics.RectF avatarRingBounds = getAvatarRingBounds();
                        if (rect != null) {
                            avatarRingBounds.set(rect);
                        } else if (rectF != null) {
                            avatarRingBounds.set(rectF);
                        } else {
                            avatarRingBounds.set(0.0f, 0.0f, width10, width10);
                        }
                        float f10 = -this.j;
                        avatarRingBounds.inset(f10, f10);
                        android.graphics.Paint avatarRingPaint = getAvatarRingPaint();
                        bazVar11 = this.a;
                        boolean z = this.c;
                        if (bazVar11 != null) {
                            w31.c cVar6 = (w31.c) bazVar11;
                            android.graphics.Shader u2 = cVar6.u2(cVar6.f0, cVar6.w2(), getAvatarRingBounds().width(), z);
                            cVar6.f0 = u2;
                            if (u2 != null) {
                                avatarRingPaint.setShader(u2);
                                canvas2.drawOval(getAvatarRingBounds(), getAvatarRingPaint());
                            }
                        }
                        if (this.z) {
                            f3 = this.j + this.k;
                        } else {
                            f3 = this.j;
                        }
                        float f11 = 2;
                        float f12 = f3 * f11;
                        float width11 = getWidth() - f12;
                        if (rect != null) {
                            rectF2 = new android.graphics.RectF(rect);
                        } else if (rectF != null) {
                            rectF2 = new android.graphics.RectF(rectF);
                        } else {
                            rectF2 = new android.graphics.RectF(f12, f12, width11, width11);
                        }
                        if (this.z) {
                            float f13 = (-f3) / f11;
                            rectF2.inset(f13, f13);
                        }
                        bazVar12 = this.a;
                        if (bazVar12 != null) {
                            com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig3 = ((w31.c) bazVar12).h0;
                            if (avatarXConfig3 != null && (num2 = avatarXConfig3.o) != null) {
                                shader3 = w31.c.x2(null, f3, num2.intValue());
                            } else {
                                shader3 = null;
                            }
                            if (shader3 != null) {
                                getAvatarBorderPaint().setShader(shader3);
                                getAvatarBorderPaint().setStrokeWidth(f3);
                                canvas2.drawOval(rectF2, getAvatarBorderPaint());
                            }
                        }
                        if (this.z) {
                            float f14 = this.j * f11;
                            float width12 = getWidth() - (this.j * f11);
                            if (rect != null) {
                                rectF3 = new android.graphics.RectF(rect);
                            } else if (rectF != null) {
                                rectF3 = new android.graphics.RectF(rectF);
                            } else {
                                rectF3 = new android.graphics.RectF(f14, f14, width12, width12);
                            }
                            float f15 = -this.j;
                            rectF3.inset(f15, f15);
                            w31.baz bazVar18 = this.a;
                            if (bazVar18 != null) {
                                w31.m m23 = bazVar18.m2();
                                if (m23 != null) {
                                    getProgressBackgroundRingPaint().setColor(m23.a);
                                    getProgressRingPaint().setShader(bazVar18.l2(0.0f, rectF3.width(), m23.b));
                                }
                                canvas2.drawArc(rectF3, this.B, this.C, false, getProgressBackgroundRingPaint());
                                if (this.Q) {
                                    i = -1;
                                } else {
                                    i = 1;
                                }
                                canvas2 = canvas;
                                canvas2.drawArc(rectF3, this.B, this.D * i, false, getProgressRingPaint());
                                if (this.A) {
                                    int i9 = this.E;
                                    float f16 = this.M;
                                    if (i9 == 100) {
                                        android.graphics.RectF i10 = i(canvas2, rectF3);
                                        float f17 = this.O;
                                        float f18 = (f16 - f17) / f11;
                                        float f19 = (f2 - f17) / f11;
                                        w31.baz bazVar19 = this.a;
                                        if (bazVar19 != null && (m22 = bazVar19.m2()) != null && (drawable2 = m22.e) != null) {
                                            float f20 = i10.left + f18;
                                            float f23 = i10.top + f19;
                                            drawable2.setBounds((int) f20, (int) f23, (int) (f20 + f17), (int) (f17 + f23));
                                            drawable2.draw(canvas2);
                                        }
                                    } else {
                                        android.graphics.RectF i11 = i(canvas2, rectF3);
                                        android.graphics.Rect percentTextBounds = getPercentTextBounds();
                                        int width13 = percentTextBounds.width() + getPercentSignWidth();
                                        int i12 = this.L;
                                        float f24 = (f16 - (width13 + i12)) / f11;
                                        float height2 = percentTextBounds.height();
                                        float f25 = i11.left + f24;
                                        float f26 = i11.top + ((f2 - height2) / f11) + height2;
                                        w31.baz bazVar20 = this.a;
                                        if (bazVar20 != null && (m2 = bazVar20.m2()) != null) {
                                            int[] iArr = m2.c;
                                            if (iArr.length == 1) {
                                                getPercentTextPaint().setColor(iArr[0]);
                                                getPercentSignPaint().setColor(iArr[0]);
                                            } else {
                                                float width14 = percentTextBounds.width() + f25 + i12 + getPercentSignWidth();
                                                w31.baz bazVar21 = this.a;
                                                if (bazVar21 != null) {
                                                    linearGradient = bazVar21.l2(f25, width14, iArr);
                                                } else {
                                                    linearGradient = null;
                                                }
                                                getPercentTextPaint().setShader(linearGradient);
                                                getPercentSignPaint().setShader(linearGradient);
                                            }
                                        }
                                        canvas2.drawText(java.lang.String.valueOf(this.E), f25, f26, getPercentTextPaint());
                                        canvas2.drawText("%", f25 + percentTextBounds.width() + i12, f26, getPercentSignPaint());
                                    }
                                }
                            }
                        }
                        bazVar13 = this.a;
                        if (bazVar13 != null) {
                            w31.c cVar7 = (w31.c) bazVar13;
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
                                        w31.baz bazVar22 = this.a;
                                        if (bazVar22 != null) {
                                            shader = bazVar22.j2(this.l, z);
                                        } else {
                                            shader = null;
                                        }
                                        badgeBackgroundPaint.setShader(shader);
                                        float f27 = this.j;
                                        float f28 = this.l + f27;
                                        if (getBadgeBackgroundPaint().getShader() != null) {
                                            canvas2.drawOval(f27, f27, f28, f28, getBadgeBackgroundPaint());
                                        }
                                        android.graphics.Paint badgeRingPaint = getBadgeRingPaint();
                                        w31.baz bazVar23 = this.a;
                                        if (bazVar23 != null) {
                                            shader2 = bazVar23.k2(this.l);
                                        } else {
                                            shader2 = null;
                                        }
                                        badgeRingPaint.setShader(shader2);
                                        if (getBadgeRingPaint().getShader() != null) {
                                            getBadgeRingPaint().setStrokeWidth(this.j);
                                            canvas2 = canvas;
                                            canvas2.drawOval(f27, f27, f28, f28, getBadgeRingPaint());
                                        } else {
                                            canvas2 = canvas;
                                        }
                                        int b = qf3.a.b(((this.l - this.m) / f11) + f27);
                                        int b2 = qf3.a.b(((this.l + this.m) / f11) + f27);
                                        drawable.setBounds(b, b, b2, b2);
                                        drawable.draw(canvas2);
                                    }
                                }
                            }
                            drawable = null;
                            if (drawable != null) {
                            }
                        }
                        bazVar14 = this.a;
                        if (bazVar14 != null) {
                            w31.c cVar8 = (w31.c) bazVar14;
                            com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig4 = cVar8.h0;
                            if (avatarXConfig4 != null) {
                                bool = java.lang.Boolean.valueOf(avatarXConfig4.B);
                            } else {
                                bool = null;
                            }
                            if (kotlin.jvm.internal.Intrinsics.b(bool, java.lang.Boolean.TRUE)) {
                                drawable6 = cVar8.t;
                            }
                            if (drawable6 != null) {
                                android.graphics.RectF avatarBgBounds3 = getAvatarBgBounds();
                                int i13 = (int) avatarBgBounds3.left;
                                int i14 = (int) avatarBgBounds3.right;
                                drawable6.setBounds(i13, i13, i14, i14);
                                drawable6.draw(canvas2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                f2 = f;
                getAvatarRingPaint().setStrokeWidth(this.j);
                float width102 = getWidth();
                android.graphics.RectF avatarRingBounds2 = getAvatarRingBounds();
                if (rect != null) {
                }
                float f102 = -this.j;
                avatarRingBounds2.inset(f102, f102);
                android.graphics.Paint avatarRingPaint2 = getAvatarRingPaint();
                bazVar11 = this.a;
                boolean z2 = this.c;
                if (bazVar11 != null) {
                }
                if (this.z) {
                }
                float f112 = 2;
                float f122 = f3 * f112;
                float width112 = getWidth() - f122;
                if (rect != null) {
                }
                if (this.z) {
                }
                bazVar12 = this.a;
                if (bazVar12 != null) {
                }
                if (this.z) {
                }
                bazVar13 = this.a;
                if (bazVar13 != null) {
                }
                bazVar14 = this.a;
                if (bazVar14 != null) {
                }
            }
        }
        rectF = null;
        bazVar = this.a;
        if (bazVar != null) {
            int width15 = ((int) (getWidth() - this.e)) / 2;
            int width22 = ((int) (getWidth() + this.e)) / 2;
            d2.setBounds(width15, width15, width22, width22);
            d2.draw(canvas2);
        }
        bazVar2 = this.a;
        if (bazVar2 != null) {
            getTextPaint().setTextSize(this.e);
            android.graphics.Paint textPaint2 = getTextPaint();
            bazVar15 = this.a;
            if (bazVar15 == null) {
            }
            i2 = 0;
            textPaint2.setColor(i2);
            canvas2.drawText(e2, getWidth() / 2.0f, (getWidth() / 2.0f) - ((getTextPaint().ascent() + getTextPaint().descent()) / 2.0f), getTextPaint());
        }
        bazVar3 = this.a;
        if (bazVar3 != null) {
        }
        bazVar4 = this.a;
        if (bazVar4 != null) {
        }
        bazVar5 = this.a;
        if (bazVar5 != null) {
            int width32 = ((int) (getWidth() - this.i)) / 2;
            int width42 = ((int) (getWidth() + this.i)) / 2;
            h2.setBounds(width32, width32, width42, width42);
            h2.draw(canvas2);
        }
        bazVar6 = this.a;
        if (bazVar6 != null) {
        }
        bazVar7 = this.a;
        if (bazVar7 != null) {
            int width52 = ((int) (getWidth() - this.f)) / 2;
            int width62 = ((int) (getWidth() + this.f)) / 2;
            c2.setBounds(width52, width52, width62, width62);
            c2.draw(canvas2);
        }
        bazVar8 = this.a;
        if (bazVar8 != null) {
            if (rect == null) {
            }
            int i72 = (int) rectF4.left;
            int i82 = (int) rectF4.right;
            drawable4.setBounds(i72, i72, i82, i82);
            drawable4.draw(canvas2);
        }
        bazVar9 = this.a;
        f = this.N;
        if (bazVar9 != null) {
            int width72 = ((int) (getWidth() - this.g)) / 2;
            int width82 = ((int) (getWidth() + this.g)) / 2;
            float f82 = this.g;
            int height3 = (int) (((getHeight() - f) - f82) - this.h);
            drawable3.setBounds(width72, height3, width82, (int) (height3 + f82));
            drawable3.draw(canvas2);
        }
        bazVar10 = this.a;
        if (bazVar10 != null) {
        }
        f2 = f;
        getAvatarRingPaint().setStrokeWidth(this.j);
        float width1022 = getWidth();
        android.graphics.RectF avatarRingBounds22 = getAvatarRingBounds();
        if (rect != null) {
        }
        float f1022 = -this.j;
        avatarRingBounds22.inset(f1022, f1022);
        android.graphics.Paint avatarRingPaint22 = getAvatarRingPaint();
        bazVar11 = this.a;
        boolean z22 = this.c;
        if (bazVar11 != null) {
        }
        if (this.z) {
        }
        float f1122 = 2;
        float f1222 = f3 * f1122;
        float width1122 = getWidth() - f1222;
        if (rect != null) {
        }
        if (this.z) {
        }
        bazVar12 = this.a;
        if (bazVar12 != null) {
        }
        if (this.z) {
        }
        bazVar13 = this.a;
        if (bazVar13 != null) {
        }
        bazVar14 = this.a;
        if (bazVar14 != null) {
        }
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
        float dimension = (i * getResources().getDimension(2131165430)) / getResources().getDimension(2131165429);
        float f = 1 * dimension;
        this.j = f;
        this.k = 2.5f * dimension;
        this.d = 39 * dimension;
        this.l = 13 * dimension;
        this.m = 12 * dimension;
        float f2 = 20 * dimension;
        this.e = f2;
        this.f = f2;
        this.g = 5 * dimension;
        this.h = f;
        this.i = dimension * 15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super/*android.widget.ImageView*/.onWindowVisibilityChanged(i);
        w31.baz bazVar = this.a;
        if (bazVar != null) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
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
        setOnClickListener(new aq2.g(19, function1));
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
    public AvatarXView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AvatarXView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.b = (x31.baz) ((y31.bar) f40.d0.z(context, y31.bar.class)).H.b.d4.get();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.common.ui.R$styleable.a);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.c = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.n = kotlin.LazyKt.lazy(new v1.k1(18));
        this.o = kotlin.LazyKt.lazy(new v1.k1(23));
        this.p = kotlin.LazyKt.lazy(new v1.k1(24));
        this.q = kotlin.LazyKt.lazy(new v1.k1(25));
        this.r = kotlin.LazyKt.lazy(new v1.k1(26));
        this.s = kotlin.LazyKt.lazy(new v1.k1(19));
        this.t = kotlin.LazyKt.lazy(new v1.k1(20));
        final java.lang.Object[] objArr = 0 == true ? 1 : 0;
        this.x = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: w31.d
            public final /* synthetic */ com.truecaller.common.ui.avatar.AvatarXView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i2 = objArr;
                com.truecaller.common.ui.avatar.AvatarXView avatarXView = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.common.ui.avatar.AvatarXView.S;
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 60);
                        ofInt.setDuration(1000L);
                        ofInt.setRepeatCount(-1);
                        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                        ofInt.addUpdateListener(new ao.c(avatarXView, 14));
                        return ofInt;
                    case 1:
                        int i4 = com.truecaller.common.ui.avatar.AvatarXView.S;
                        android.graphics.Paint paint = new android.graphics.Paint();
                        paint.setStrokeWidth(avatarXView.k);
                        paint.setAntiAlias(true);
                        paint.setStyle(android.graphics.Paint.Style.STROKE);
                        return paint;
                    case 2:
                        int i5 = com.truecaller.common.ui.avatar.AvatarXView.S;
                        android.graphics.Paint h = com.ironsource.adqualitysdk.sdk.i.bar.h(true);
                        h.setStyle(android.graphics.Paint.Style.STROKE);
                        h.setStrokeWidth(avatarXView.k);
                        return h;
                    default:
                        return java.lang.Integer.valueOf(com.truecaller.common.ui.avatar.AvatarXView.h(avatarXView));
                }
            }
        });
        this.A = this.z;
        this.B = 90.0f;
        this.C = 360.0f;
        this.D = 360.0f;
        this.E = 100;
        final int i2 = 1;
        this.F = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: w31.d
            public final /* synthetic */ com.truecaller.common.ui.avatar.AvatarXView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i22 = i2;
                com.truecaller.common.ui.avatar.AvatarXView avatarXView = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.common.ui.avatar.AvatarXView.S;
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 60);
                        ofInt.setDuration(1000L);
                        ofInt.setRepeatCount(-1);
                        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                        ofInt.addUpdateListener(new ao.c(avatarXView, 14));
                        return ofInt;
                    case 1:
                        int i4 = com.truecaller.common.ui.avatar.AvatarXView.S;
                        android.graphics.Paint paint = new android.graphics.Paint();
                        paint.setStrokeWidth(avatarXView.k);
                        paint.setAntiAlias(true);
                        paint.setStyle(android.graphics.Paint.Style.STROKE);
                        return paint;
                    case 2:
                        int i5 = com.truecaller.common.ui.avatar.AvatarXView.S;
                        android.graphics.Paint h = com.ironsource.adqualitysdk.sdk.i.bar.h(true);
                        h.setStyle(android.graphics.Paint.Style.STROKE);
                        h.setStrokeWidth(avatarXView.k);
                        return h;
                    default:
                        return java.lang.Integer.valueOf(com.truecaller.common.ui.avatar.AvatarXView.h(avatarXView));
                }
            }
        });
        final int i3 = 2;
        this.G = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: w31.d
            public final /* synthetic */ com.truecaller.common.ui.avatar.AvatarXView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i22 = i3;
                com.truecaller.common.ui.avatar.AvatarXView avatarXView = this.b;
                switch (i22) {
                    case 0:
                        int i32 = com.truecaller.common.ui.avatar.AvatarXView.S;
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 60);
                        ofInt.setDuration(1000L);
                        ofInt.setRepeatCount(-1);
                        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                        ofInt.addUpdateListener(new ao.c(avatarXView, 14));
                        return ofInt;
                    case 1:
                        int i4 = com.truecaller.common.ui.avatar.AvatarXView.S;
                        android.graphics.Paint paint = new android.graphics.Paint();
                        paint.setStrokeWidth(avatarXView.k);
                        paint.setAntiAlias(true);
                        paint.setStyle(android.graphics.Paint.Style.STROKE);
                        return paint;
                    case 2:
                        int i5 = com.truecaller.common.ui.avatar.AvatarXView.S;
                        android.graphics.Paint h = com.ironsource.adqualitysdk.sdk.i.bar.h(true);
                        h.setStyle(android.graphics.Paint.Style.STROKE);
                        h.setStrokeWidth(avatarXView.k);
                        return h;
                    default:
                        return java.lang.Integer.valueOf(com.truecaller.common.ui.avatar.AvatarXView.h(avatarXView));
                }
            }
        });
        this.H = kotlin.LazyKt.lazy(new o10.f(context, 10));
        this.I = kotlin.LazyKt.lazy(new o10.f(context, 11));
        this.J = kotlin.LazyKt.lazy(new v1.k1(21));
        final int i4 = 3;
        this.K = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: w31.d
            public final /* synthetic */ com.truecaller.common.ui.avatar.AvatarXView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i22 = i4;
                com.truecaller.common.ui.avatar.AvatarXView avatarXView = this.b;
                switch (i22) {
                    case 0:
                        int i32 = com.truecaller.common.ui.avatar.AvatarXView.S;
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 60);
                        ofInt.setDuration(1000L);
                        ofInt.setRepeatCount(-1);
                        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                        ofInt.addUpdateListener(new ao.c(avatarXView, 14));
                        return ofInt;
                    case 1:
                        int i42 = com.truecaller.common.ui.avatar.AvatarXView.S;
                        android.graphics.Paint paint = new android.graphics.Paint();
                        paint.setStrokeWidth(avatarXView.k);
                        paint.setAntiAlias(true);
                        paint.setStyle(android.graphics.Paint.Style.STROKE);
                        return paint;
                    case 2:
                        int i5 = com.truecaller.common.ui.avatar.AvatarXView.S;
                        android.graphics.Paint h = com.ironsource.adqualitysdk.sdk.i.bar.h(true);
                        h.setStyle(android.graphics.Paint.Style.STROKE);
                        h.setStrokeWidth(avatarXView.k);
                        return h;
                    default:
                        return java.lang.Integer.valueOf(com.truecaller.common.ui.avatar.AvatarXView.h(avatarXView));
                }
            }
        });
        this.L = getPercentSignWidth() / 3;
        this.M = h0.b.N(context, 1, 44.0f);
        this.N = h0.b.N(context, 1, 24.0f);
        this.O = h0.b.N(context, 1, 16.0f);
        this.P = h0.b.N(context, 1, 4.0f);
        this.Q = context.getResources().getConfiguration().getLayoutDirection() == 1;
        this.R = kotlin.LazyKt.lazy(new v1.k1(22));
    }

    public /* synthetic */ AvatarXView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
