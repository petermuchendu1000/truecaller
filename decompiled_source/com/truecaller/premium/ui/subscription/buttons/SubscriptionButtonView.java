package com.truecaller.premium.ui.subscription.buttons;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SubscriptionButtonView extends android.widget.LinearLayout {
    public static final /* synthetic */ int k = 0;
    public final android.widget.TextView a;
    public final android.widget.TextView b;
    public final android.widget.TextView c;
    public final com.truecaller.common.ui.ShineView d;
    public xe2.l e;
    public final boolean f;
    public boolean g;
    public final kotlin.Lazy h;
    public final android.widget.RelativeLayout i;
    public final kotlin.Lazy j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionButtonView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final com.truecaller.common.ui.f getGoldBackground() {
        return (com.truecaller.common.ui.f) this.h.getValue();
    }

    private final android.widget.TextView getNoteView() {
        return (android.widget.TextView) this.j.getValue();
    }

    public final xe2.g0 a(int i, java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setText(android.text.Html.fromHtml(str));
        textView.setMaxLines(1);
        textView.setTextSize(2, i);
        textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        return new xe2.g0(textView.getMeasuredWidth(), textView.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        java.lang.Object systemService = getContext().getSystemService("window");
        kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((android.view.WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        double d = displayMetrics.widthPixels * 0.6d;
        android.widget.TextView textView = this.a;
        if (textView != null) {
            textView.setMaxWidth((int) d);
        } else {
            kotlin.jvm.internal.Intrinsics.n("textView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    public final void setButton(@org.jetbrains.annotations.NotNull xe2.l lVar) {
        java.lang.CharSequence charSequence;
        java.lang.String str;
        boolean z;
        java.lang.String str2;
        boolean z2;
        boolean z3;
        java.lang.Object obj;
        android.widget.LinearLayout.LayoutParams layoutParams;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "button");
        this.e = lVar;
        java.lang.Integer num = lVar.e;
        java.lang.String str3 = lVar.a;
        java.lang.String str4 = lVar.b;
        java.lang.String str5 = lVar.c;
        android.widget.RelativeLayout relativeLayout = this.i;
        if (num != null) {
            relativeLayout.setBackgroundResource(num.intValue());
        }
        boolean z4 = this.f;
        android.widget.TextView textView = this.b;
        android.widget.TextView textView2 = this.c;
        android.widget.TextView textView3 = this.a;
        boolean z5 = true;
        if (z4) {
            if (textView3 != null) {
                if (textView3.getLayoutParams().height == -2) {
                    if (textView3 != null) {
                        textView3.getLayoutParams().height = a(10, str3).b;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("textView");
                        throw null;
                    }
                }
                if (textView3 != null) {
                    textView3.setMaxLines(1);
                    if (textView3 != null) {
                        lf.bar.y(textView3, 8, 10);
                        if (textView2 != null) {
                            if (str4 == null || str4.length() == 0) {
                                obj = null;
                                layoutParams = new android.widget.LinearLayout.LayoutParams(a(14, str5).a, textView2.getLayoutParams().height);
                            } else {
                                obj = null;
                                layoutParams = new android.widget.LinearLayout.LayoutParams(-2, textView2.getLayoutParams().height);
                            }
                            textView2.setLayoutParams(layoutParams);
                            textView2.setMaxLines(1);
                            lf.bar.y(textView2, 8, 14);
                            charSequence = obj;
                        } else {
                            charSequence = 0;
                        }
                        if (textView != null) {
                            textView.getLayoutParams().width = textView.getResources().getDimensionPixelSize(2131166789);
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("textView");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.n("textView");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.Intrinsics.n("textView");
                throw null;
            }
        } else {
            charSequence = 0;
            if (textView3 != null) {
                if (textView3.getLayoutParams().height != -2) {
                    if (textView3 != null) {
                        textView3.getLayoutParams().height = -2;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("textView");
                        throw null;
                    }
                }
                if (textView2 != null && textView2.getLayoutParams().width != -2) {
                    textView2.getLayoutParams().width = -2;
                }
                if (textView != null && textView.getLayoutParams().width != -2) {
                    textView.getLayoutParams().width = -2;
                }
            } else {
                kotlin.jvm.internal.Intrinsics.n("textView");
                throw null;
            }
        }
        if (textView3 != null) {
            textView3.setText(android.text.Html.fromHtml(str3));
            int intValue = lVar.d.intValue();
            if (textView3 != null) {
                textView3.setTextColor(intValue);
                if (textView2 != null) {
                    textView2.setTextColor(intValue);
                }
                int intValue2 = lVar.g.intValue();
                if (textView != null) {
                    textView.setBackgroundResource(intValue2);
                }
                int intValue3 = lVar.h.intValue();
                if (textView != null) {
                    textView.setTextColor(intValue3);
                }
                if (textView != null) {
                    textView.setText(str4);
                }
                if (textView2 != null) {
                    textView2.setText(str5);
                }
                if (textView2 != null) {
                    if (str5.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    gj.m.k0(textView2, !z3);
                }
                if (lVar.f) {
                    relativeLayout.setBackground(getGoldBackground());
                }
                this.g = false;
                gj.m.k0(getNoteView(), false);
                getNoteView().setText(charSequence);
                if (textView != null) {
                    xe2.l lVar2 = this.e;
                    if (lVar2 != null) {
                        str2 = lVar2.b;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null && !this.g) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    gj.m.k0(textView, z2);
                }
                if (textView2 != null) {
                    xe2.l lVar3 = this.e;
                    if (lVar3 != null) {
                        str = lVar3.c;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    gj.m.k0(textView2, z);
                }
                com.truecaller.common.ui.ShineView shineView = this.d;
                if (shineView != null) {
                    xe2.l lVar4 = this.e;
                    if (lVar4 == null || !lVar4.f) {
                        z5 = false;
                    }
                    gj.m.k0(shineView, z5);
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("textView");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("textView");
        throw charSequence;
    }

    public final void setShineLifecycleOwner(@org.jetbrains.annotations.NotNull androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "lifecycleOwner");
        com.truecaller.common.ui.ShineView shineView = this.d;
        if (shineView != null) {
            shineView.setLifecycleOwner(d0Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionButtonView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f = true;
        this.h = kotlin.LazyKt.lazy(new o10.f(context, 14));
        this.j = kotlin.LazyKt.lazy(new x91.d(4, context, this));
        setOrientation(1);
        int i4 = 2131560910;
        int i5 = -2;
        int i6 = 0;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.premium.R.styleable.f, 0, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            i4 = obtainStyledAttributes.getResourceId(3, 2131560910);
            i2 = obtainStyledAttributes.getResourceId(1, -1);
            this.f = obtainStyledAttributes.getBoolean(0, true);
            i5 = obtainStyledAttributes.getDimensionPixelSize(2, -2);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            obtainStyledAttributes.recycle();
            i3 = dimensionPixelSize2;
            i6 = dimensionPixelSize;
        } else {
            i2 = -1;
            i3 = 0;
        }
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
        relativeLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i5));
        relativeLayout.setMinimumHeight(i6);
        if (i2 != -1) {
            relativeLayout.setBackgroundResource(i2);
        }
        relativeLayout.setGravity(17);
        relativeLayout.setPaddingRelative(i3, i3, i3, i3);
        this.i = relativeLayout;
        addView(relativeLayout);
        android.view.View.inflate(getContext(), i4, relativeLayout);
        android.view.View findViewById = findViewById(2131366839);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.a = (android.widget.TextView) findViewById;
        this.b = (android.widget.TextView) findViewById(2131365845);
        this.c = (android.widget.TextView) findViewById(2131366677);
        this.d = findViewById(2131364300);
        addView(getNoteView());
    }

    public /* synthetic */ SubscriptionButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
