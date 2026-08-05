package com.truecaller.truecontext;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class TrueContext extends androidx.constraintlayout.widget.ConstraintLayout implements rx2.d {
    public static final /* synthetic */ int G = 0;
    public final float A;
    public final float B;
    public boolean C;
    public boolean D;
    public final kotlin.Lazy E;
    public android.graphics.drawable.Drawable F;
    public final d41.a s;
    public rx2.c t;
    public rx2.baz u;
    public android.graphics.RectF v;
    public final android.graphics.Path w;
    public int x;
    public final boolean y;
    public android.widget.PopupWindow z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrueContext(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static kotlin.Unit F(com.truecaller.truecontext.TrueContext trueContext) {
        if (trueContext.z != null) {
            trueContext.z = null;
            rx2.c cVar = trueContext.t;
            if (cVar != null) {
                cVar.w();
            }
        }
        trueContext.setIsExpandedInternal(false);
        return kotlin.Unit.a;
    }

    public static void G(com.truecaller.truecontext.TrueContext trueContext, boolean z) {
        trueContext.setIsExpandedInternal(z);
    }

    private final android.graphics.drawable.Drawable getArrowDown() {
        return (android.graphics.drawable.Drawable) this.E.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setIsExpandedInternal(boolean z) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i2;
        this.C = z;
        if (this.y) {
            if (z) {
                java.lang.Object parent = getParent();
                kotlin.jvm.internal.Intrinsics.e(parent, "null cannot be cast to non-null type android.view.View");
                android.view.View view = (android.view.View) parent;
                rx2.bar barVar = new rx2.bar(this, 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "callback");
                if (!view.isAttachedToWindow()) {
                    barVar.invoke();
                } else {
                    view.addOnAttachStateChangeListener(new com.google.android.gms.internal.ads.o6(view, 5, barVar));
                }
                final rx2.bar barVar2 = new rx2.bar(this, 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "onDismiss");
                android.view.ViewParent parent2 = getParent();
                kotlin.jvm.internal.Intrinsics.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                final android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent2;
                int top = getTop();
                final android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
                final int i3 = layoutParams.width;
                final int i4 = layoutParams.height;
                final android.widget.Space space = new android.widget.Space(getContext());
                space.setId(getId());
                space.setLayoutParams(layoutParams);
                space.getLayoutParams().width = getWidth();
                space.getLayoutParams().height = getHeight();
                viewGroup.removeView(this);
                viewGroup.addView(space);
                boolean z2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams;
                if (z2) {
                    marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    i = marginLayoutParams.getMarginStart();
                } else {
                    i = 0;
                }
                if (z2) {
                    marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams2 = null;
                }
                if (marginLayoutParams2 != null) {
                    i2 = marginLayoutParams2.getMarginEnd();
                } else {
                    i2 = 0;
                }
                int max = java.lang.Math.max(i, i2);
                android.widget.PopupWindow popupWindow = new android.widget.PopupWindow((android.view.View) this, viewGroup.getWidth() - max, -2, true);
                popupWindow.setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() { // from class: y03.l
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        android.view.ViewGroup viewGroup2 = viewGroup;
                        if (!viewGroup2.isAttachedToWindow()) {
                            return;
                        }
                        android.view.ViewGroup.LayoutParams layoutParams2 = layoutParams;
                        layoutParams2.width = i3;
                        layoutParams2.height = i4;
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this;
                        constraintLayout.setLayoutParams(layoutParams2);
                        viewGroup2.removeView(space);
                        viewGroup2.addView(constraintLayout);
                        barVar2.invoke();
                    }
                });
                popupWindow.showAsDropDown(viewGroup, max / 2, top);
                this.z = popupWindow;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popupWindow, "<this>");
                android.view.View rootView = popupWindow.getContentView().getRootView();
                android.view.ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
                kotlin.jvm.internal.Intrinsics.e(layoutParams2, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                android.view.WindowManager.LayoutParams layoutParams3 = (android.view.WindowManager.LayoutParams) layoutParams2;
                android.content.Context context = popupWindow.getContentView().getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                android.view.WindowManager K = ak.r0.K(context);
                layoutParams3.flags |= 2;
                layoutParams3.dimAmount = 0.3f;
                K.updateViewLayout(rootView, layoutParams3);
            } else {
                android.widget.PopupWindow popupWindow2 = this.z;
                if (popupWindow2 != null) {
                    this.z = null;
                    popupWindow2.dismiss();
                }
            }
        }
        boolean z3 = this.D;
        d41.a aVar = this.s;
        if (z3) {
            if (z) {
                android.graphics.drawable.Drawable arrowDown = getArrowDown();
                if (arrowDown != null) {
                    android.widget.TextView textView = (android.widget.TextView) aVar.d;
                    android.graphics.drawable.Drawable drawable = this.F;
                    android.graphics.Bitmap B = cp1.bar.B(arrowDown, 0, 0, 7);
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.preRotate(180.0f);
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(B, 0, 0, B.getWidth(), B.getHeight(), matrix, true);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                    if (!B.isRecycled()) {
                        B.recycle();
                    }
                    android.content.res.Resources resources = getResources();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, new android.graphics.drawable.BitmapDrawable(resources, createBitmap), (android.graphics.drawable.Drawable) null);
                }
            } else {
                ((android.widget.TextView) aVar.d).setCompoundDrawablesRelativeWithIntrinsicBounds(this.F, (android.graphics.drawable.Drawable) null, getArrowDown(), (android.graphics.drawable.Drawable) null);
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) aVar.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView2, "message");
        gj.m.k0(textView2, z);
        rx2.baz bazVar = this.u;
        if (bazVar != null) {
            bazVar.k(z);
        }
    }

    public final void H(rx2.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "listener");
        this.u = bazVar;
        bazVar.k(this.C);
    }

    public final void I() {
        float f;
        int i;
        d41.a aVar = this.s;
        android.widget.TextView textView = (android.widget.TextView) aVar.d;
        android.widget.TextView textView2 = (android.widget.TextView) aVar.d;
        d6.a layoutParams = textView.getLayoutParams();
        kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        d6.a aVar2 = layoutParams;
        if (this.x == 1) {
            f = 0.5f;
        } else {
            f = 0.0f;
        }
        aVar2.z = f;
        kotlin.jvm.internal.Intrinsics.e(textView2.getLayoutParams(), "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        if (this.x == 1) {
            d6.j jVar = new d6.j();
            jVar.e(this);
            jVar.g(textView2.getId(), 7, 0, 7);
            jVar.b(this);
        }
        android.widget.TextView textView3 = (android.widget.TextView) aVar.e;
        if (this.x == 1) {
            i = 17;
        } else {
            i = 8388627;
        }
        textView3.setGravity(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(rx2.e eVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "theme");
        d41.a aVar = this.s;
        android.widget.TextView textView = (android.widget.TextView) aVar.d;
        textView.setTextColor(eVar.a);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(eVar.b);
        gradientDrawable.setCornerRadius(this.A);
        textView.setBackground(gradientDrawable);
        android.graphics.drawable.Drawable arrowDown = getArrowDown();
        if (arrowDown != null) {
            arrowDown.setTint(eVar.a);
            kotlin.Unit unit = kotlin.Unit.a;
        }
        android.widget.TextView textView2 = (android.widget.TextView) aVar.e;
        textView2.setTextColor(eVar.c);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setColor(eVar.d);
        android.content.Context context = textView2.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable2.setStroke(ak.r0.s(context, 1), eVar.e);
        gradientDrawable2.setCornerRadius(this.B);
        textView2.setBackground(gradientDrawable2);
        if (!isAttachedToWindow()) {
            return;
        }
        com.bumptech.glide.g q = com.bumptech.glide.baz.e(getContext().getApplicationContext()).q(eVar.f);
        android.content.Context context2 = ((android.widget.TextView) aVar.d).getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int s = ak.r0.s(context2, 20);
        com.bumptech.glide.g q2 = q.q(s, s);
        q2.Q(new rx2.qux(this, eVar, 0), (mg.b) null, q2, qg.b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        android.graphics.RectF rectF = this.v;
        android.graphics.Path path = this.w;
        d41.a aVar = this.s;
        if (rectF == null) {
            android.widget.TextView textView = (android.widget.TextView) aVar.d;
            android.graphics.RectF rectF2 = new android.graphics.RectF(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
            this.v = rectF2;
            path.reset();
            float f = this.A;
            path.addRoundRect(rectF2, f, f, android.graphics.Path.Direction.CW);
            path.close();
        }
        android.widget.TextView textView2 = (android.widget.TextView) aVar.e;
        android.widget.TextView textView3 = (android.widget.TextView) aVar.d;
        if (textView2.getVisibility() == 0) {
            canvas.save();
            ol.bar.s(canvas, path);
            drawChild(canvas, (android.widget.TextView) aVar.e, getDrawingTime());
            canvas.restore();
        }
        if (textView3.getVisibility() == 0) {
            drawChild(canvas, textView3, getDrawingTime());
        }
    }

    public final int getViewOrientation() {
        return this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        rx2.c cVar = this.t;
        if (cVar != null) {
            cVar.u0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDescendantInvalidated(android.view.View view, android.view.View view2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "target");
        super/*android.view.ViewGroup*/.onDescendantInvalidated(view, view2);
        this.v = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        of0.baz bazVar = this.t;
        if (bazVar != null) {
            bazVar.m1();
        }
    }

    @Override // rx2.d
    public void setIsExpandable(boolean z) {
        this.D = z;
        android.widget.TextView textView = (android.widget.TextView) this.s.d;
        if (z) {
            textView.setOnClickListener(new pn0.a(this, 17));
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(this.F, (android.graphics.drawable.Drawable) null, getArrowDown(), (android.graphics.drawable.Drawable) null);
        } else {
            textView.setOnClickListener(null);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(this.F, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rx2.d
    public void setIsExpanded(boolean z) {
        post(new bx.s0(this, z, 5));
    }

    @Override // rx2.d
    public void setLabel(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "label");
        d41.a aVar = this.s;
        ((android.widget.TextView) aVar.d).setText(str);
        android.widget.TextView textView = (android.widget.TextView) aVar.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "label");
        gj.m.j0(textView);
    }

    @Override // rx2.d
    public void setMessage(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "message");
        ((android.widget.TextView) this.s.e).setText(str);
    }

    @Override // rx2.d
    public void setMessageMaxLength(int i) {
        ((android.widget.TextView) this.s.e).setFilters(new android.text.InputFilter.LengthFilter[]{new android.text.InputFilter.LengthFilter(i)});
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull rx2.c cVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "presenter");
        of0.baz bazVar = this.t;
        if (bazVar == cVar) {
            return;
        }
        if (bazVar != null) {
            bazVar.m1();
        }
        this.t = cVar;
        cVar.u0(this);
    }

    public final void setViewOrientation(int i) {
        this.x = i;
        I();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrueContext(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TrueContext(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131560930, (android.view.ViewGroup) this);
        int i2 = 2131363578;
        android.view.View o = df0.qux.o(2131363578, this);
        if (o != null) {
            i2 = 2131364878;
            android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131364878, this);
            if (textView != null) {
                i2 = 2131365314;
                android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131365314, this);
                if (textView2 != null) {
                    d41.a aVar = new d41.a(this, o, textView, textView2, 20);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                    this.s = aVar;
                    this.w = new android.graphics.Path();
                    this.A = getResources().getDimension(2131166827);
                    this.B = getResources().getDimension(2131166828);
                    this.E = kotlin.LazyKt.lazy(new o10.f(context, 8));
                    android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.truecontext.R$styleable.a);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
                    setViewOrientation(obtainStyledAttributes.getInt(1, 0));
                    int i3 = obtainStyledAttributes.getInt(2, 1);
                    this.y = obtainStyledAttributes.getBoolean(0, false);
                    obtainStyledAttributes.recycle();
                    I();
                    if (i3 == 0) {
                        textView.setTextSize(2, 12.0f);
                        textView2.setTextSize(2, 14.0f);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
                        textView2.setLineSpacing(ak.r0.s(r8, 4), 1.0f);
                        return;
                    }
                    textView.setTextSize(2, 14.0f);
                    textView2.setTextSize(2, 16.0f);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
                    textView2.setLineSpacing(ak.r0.s(r8, 8), 1.0f);
                    return;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ TrueContext(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
