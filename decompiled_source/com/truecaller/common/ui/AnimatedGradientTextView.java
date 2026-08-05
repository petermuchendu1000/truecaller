package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class AnimatedGradientTextView extends androidx.appcompat.widget.AppCompatTextView {
    public static final /* synthetic */ int m = 0;
    public android.animation.ValueAnimator h;
    public float i;
    public int[] j;
    public android.graphics.LinearGradient k;
    public android.graphics.Matrix l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedGradientTextView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        java.lang.Boolean bool;
        final int[] iArr;
        android.animation.ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            bool = java.lang.Boolean.valueOf(valueAnimator.isRunning());
        } else {
            bool = null;
        }
        if (!yp.d0.D(bool) && getWidth() != 0 && (iArr = this.j) != null) {
            final int i = 0;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, getWidth() * 2.0f);
            ofFloat.setDuration(4000L);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.truecaller.common.ui.baz
                /* JADX WARN: Type inference failed for: r4v1, types: [android.widget.TextView, com.truecaller.common.ui.AnimatedGradientTextView, android.view.View] */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                    int i2 = i;
                    java.lang.Object obj = iArr;
                    java.lang.Object obj2 = this;
                    switch (i2) {
                        case 0:
                            ?? r4 = (com.truecaller.common.ui.AnimatedGradientTextView) obj2;
                            int[] iArr2 = (int[]) obj;
                            int i3 = com.truecaller.common.ui.AnimatedGradientTextView.m;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueAnimator2, "animator");
                            java.lang.Object animatedValue = valueAnimator2.getAnimatedValue();
                            kotlin.jvm.internal.Intrinsics.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            r4.i = ((java.lang.Float) animatedValue).floatValue();
                            if (r4.getWidth() != 0) {
                                if (r4.k == null) {
                                    r4.k = new android.graphics.LinearGradient(0.0f, 0.0f, r4.getWidth(), 0.0f, iArr2, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
                                }
                                if (r4.l == null) {
                                    r4.l = new android.graphics.Matrix();
                                }
                                android.graphics.Matrix matrix = r4.l;
                                if (matrix != null) {
                                    matrix.setTranslate(r4.i, 0.0f);
                                }
                                android.graphics.LinearGradient linearGradient = r4.k;
                                if (linearGradient != null) {
                                    linearGradient.setLocalMatrix(r4.l);
                                }
                                r4.getPaint().setShader(r4.k);
                                r4.invalidate();
                                return;
                            }
                            return;
                        case 1:
                            ((android.view.View) obj2).setTranslationX(((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue());
                            ((androidx.recyclerview.widget.RecyclerView) obj).invalidateItemDecorations();
                            return;
                        case 2:
                            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) obj2;
                            int i4 = com.google.android.material.appbar.AppBarLayout.z;
                            float floatValue = ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
                            ((rr.e) obj).k(floatValue);
                            rr.e eVar = appBarLayout.v;
                            if (eVar instanceof rr.e) {
                                eVar.k(floatValue);
                            }
                            java.util.Iterator it = appBarLayout.r.iterator();
                            if (!it.hasNext()) {
                                return;
                            } else {
                                throw f63.qux.l(it);
                            }
                        case 3:
                            int i5 = com.truecaller.messaging.mediaviewer.InteractiveMediaView.x;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueAnimator2, "it");
                            java.lang.Object animatedValue2 = valueAnimator2.getAnimatedValue();
                            kotlin.jvm.internal.Intrinsics.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            ((kotlin.jvm.functions.Function1) obj2).invoke((java.lang.Float) animatedValue2);
                            ((com.truecaller.messaging.mediaviewer.InteractiveMediaView) obj).invalidate();
                            return;
                        case 4:
                            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) obj2;
                            r42.qux quxVar = (r42.qux) obj;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueAnimator2, "it");
                            if (function2 != null) {
                                function2.invoke(java.lang.Float.valueOf(quxVar.getDismissButtonX()), java.lang.Float.valueOf(quxVar.getDismissButtonY()));
                                return;
                            }
                            return;
                        default:
                            ((android.view.View) ((i.j0) ((e93.c) obj2).b).d.getParent()).invalidate();
                            return;
                    }
                }
            });
            ofFloat.start();
            this.h = ofFloat;
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.widget.TextView*/.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            this.k = null;
            this.l = null;
        }
        android.animation.ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        g();
    }

    public final void setGradientColors(@org.jetbrains.annotations.NotNull int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "colors");
        this.j = iArr;
        g();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedGradientTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedGradientTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AnimatedGradientTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
