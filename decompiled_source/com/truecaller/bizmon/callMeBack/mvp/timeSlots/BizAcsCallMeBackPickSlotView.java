package com.truecaller.bizmon.callMeBack.mvp.timeSlots;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizAcsCallMeBackPickSlotView extends androidx.constraintlayout.widget.ConstraintLayout implements fh0.c, bd3.qux {
    public static final /* synthetic */ int y = 0;
    public yc3.d s;
    public final boolean t;
    public final fi0.c u;
    public fh0.b v;
    public dh0.p w;
    public wg0.i x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizAcsCallMeBackPickSlotView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d(this);
        }
        return this.s.X3();
    }

    @Override // fh0.c
    public final void a(boolean z) {
        fi0.c cVar = this.u;
        cVar.d.setEnabled(false);
        if (z) {
            cVar.b.setVisibility(8);
            cVar.g.setEnabled(false);
            android.widget.ProgressBar progressBar = cVar.f;
            progressBar.setIndeterminate(true);
            gj.m.j0(progressBar);
            return;
        }
        cVar.c.setEnabled(false);
        android.widget.ProgressBar progressBar2 = cVar.h;
        progressBar2.setIndeterminate(true);
        gj.m.j0(progressBar2);
    }

    @Override // fh0.c
    public final void b(int i, int i2) {
        android.widget.Button button = this.u.d;
        button.setTextColor(i2);
        button.setBackgroundResource(i);
    }

    @Override // fh0.c
    public final void e(java.lang.String str, android.text.SpannableStringBuilder spannableStringBuilder, java.lang.Integer num, java.lang.Integer num2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "actionText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
    }

    @Override // fh0.c
    public final void g() {
        dh0.p pVar = this.w;
        if (pVar != null) {
            pVar.a();
        }
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.c getBinding() {
        return this.u;
    }

    @org.jetbrains.annotations.NotNull
    public final fh0.b getPresenter() {
        fh0.b bVar = this.v;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fh0.c
    public final void i(com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig bizMultiViewConfig, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizMultiViewConfig, "config");
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        dw0.baz.b(context, bizMultiViewConfig, str, str2);
    }

    @Override // fh0.c
    public final void j(boolean z) {
        fi0.c cVar = this.u;
        cVar.d.setEnabled(true);
        if (z) {
            cVar.b.setVisibility(0);
            cVar.g.setEnabled(true);
            android.widget.ProgressBar progressBar = cVar.f;
            progressBar.setIndeterminate(false);
            gj.m.f0(progressBar);
            cVar.j.setVisibility(8);
            return;
        }
        cVar.c.setEnabled(true);
        android.widget.ProgressBar progressBar2 = cVar.h;
        progressBar2.setIndeterminate(false);
        gj.m.f0(progressBar2);
    }

    @Override // fh0.c
    public final void l(int i, int i2) {
        android.widget.Button button = this.u.c;
        button.setTextColor(i2);
        button.setBackgroundResource(i);
    }

    @Override // fh0.c
    public final void m(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "text");
        android.widget.TextView textView = this.u.n;
        gj.m.j0(textView);
        textView.setText(spannableStringBuilder);
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fh0.c
    public final void o(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ak.r0.k0(context, 0, str, 0, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        if (!isInEditMode()) {
            getPresenter().u0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        ((fh0.n) getPresenter()).m1();
    }

    @Override // fh0.c
    public final void p(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        fi0.c cVar = this.u;
        androidx.constraintlayout.widget.Group group = cVar.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "groupCmb");
        gj.m.f0(group);
        androidx.constraintlayout.widget.Group group2 = cVar.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group2, "groupCmbSuccess");
        gj.m.j0(group2);
        android.widget.TextView textView = cVar.m;
        textView.setText(str);
        textView.setTextColor(i);
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = cVar.k;
        ye0.e0.L(lottieAnimationView, new fh0.baz(lottieAnimationView, this, 1));
        lottieAnimationView.k();
    }

    @Override // fh0.c
    public final void q(int i, java.lang.String str, boolean z) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        android.widget.TextView textView = this.u.o;
        textView.setText(str);
        if (z) {
            i2 = 17;
        } else {
            i2 = 8388611;
        }
        textView.setGravity(i2);
        textView.setTextColor(i);
    }

    public final void setCmbDismissListener(@org.jetbrains.annotations.NotNull wg0.i iVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "listener");
        this.x = iVar;
    }

    @Override // fh0.c
    public void setLayoutBackground(int i) {
        this.u.e.setBackgroundColor(i);
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull fh0.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.v = bVar;
    }

    @Override // fh0.c
    public final void t(int i, int i2) {
        fi0.c cVar = this.u;
        android.widget.FrameLayout frameLayout = cVar.g;
        frameLayout.setBackgroundResource(i);
        gj.m.j0(frameLayout);
        android.widget.TextView textView = cVar.b;
        textView.setTextColor(i2);
        gj.m.j0(textView);
        cVar.f.setIndeterminateTintList(android.content.res.ColorStateList.valueOf(i2));
        cVar.c.setVisibility(8);
    }

    @Override // fh0.c
    public final void u(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "animationFilePath");
        fi0.c cVar = this.u;
        cVar.l.setVisibility(0);
        cVar.b.setVisibility(8);
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = cVar.l;
        lottieAnimationView.setAnimation(str);
        cVar.g.setEnabled(false);
        ye0.e0.L(lottieAnimationView, new fh0.baz(lottieAnimationView, this, 0));
        lottieAnimationView.k();
    }

    @Override // fh0.c
    public final void v(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        fi0.c cVar = this.u;
        androidx.constraintlayout.widget.Group group = cVar.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "groupCmb");
        gj.m.h0(group);
        androidx.constraintlayout.widget.Group group2 = cVar.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group2, "groupCmbSuccess");
        gj.m.j0(group2);
        android.widget.TextView textView = cVar.m;
        textView.setText(str);
        textView.setTextColor(i);
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = cVar.k;
        ye0.e0.L(lottieAnimationView, new fh0.baz(lottieAnimationView, this, 1));
        lottieAnimationView.k();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizAcsCallMeBackPickSlotView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizAcsCallMeBackPickSlotView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BizAcsCallMeBackPickSlotView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BizAcsCallMeBackPickSlotView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            this.v = ((tx.d0) ((fh0.a) X3())).a();
        }
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        yy.qux.F(from, true).inflate(2131559895, (android.view.ViewGroup) this);
        int i3 = 2131362555;
        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131362555, this);
        if (textView != null) {
            i3 = 2131362556;
            android.widget.Button button = (android.widget.Button) df0.qux.o(2131362556, this);
            if (button != null) {
                i3 = 2131362557;
                android.widget.Button button2 = (android.widget.Button) df0.qux.o(2131362557, this);
                if (button2 != null) {
                    i3 = 2131363016;
                    androidx.constraintlayout.widget.ConstraintLayout o = df0.qux.o(2131363016, this);
                    if (o != null) {
                        i3 = 2131363061;
                        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) df0.qux.o(2131363061, this);
                        if (progressBar != null) {
                            i3 = 2131363062;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) df0.qux.o(2131363062, this);
                            if (frameLayout != null) {
                                i3 = 2131363064;
                                android.widget.ProgressBar progressBar2 = (android.widget.ProgressBar) df0.qux.o(2131363064, this);
                                if (progressBar2 != null) {
                                    i3 = 2131364339;
                                    androidx.constraintlayout.widget.Group o2 = df0.qux.o(2131364339, this);
                                    if (o2 != null) {
                                        i3 = 2131364340;
                                        androidx.constraintlayout.widget.Group o3 = df0.qux.o(2131364340, this);
                                        if (o3 != null) {
                                            i3 = 2131364361;
                                            if (df0.qux.o(2131364361, this) != null) {
                                                i3 = 2131364842;
                                                com.airbnb.lottie.LottieAnimationView o4 = df0.qux.o(2131364842, this);
                                                if (o4 != null) {
                                                    i3 = 2131366704;
                                                    com.airbnb.lottie.LottieAnimationView o5 = df0.qux.o(2131366704, this);
                                                    if (o5 != null) {
                                                        i3 = 2131366889;
                                                        android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131366889, this);
                                                        if (textView2 != null) {
                                                            i3 = 2131367196;
                                                            android.widget.TextView textView3 = (android.widget.TextView) df0.qux.o(2131367196, this);
                                                            if (textView3 != null) {
                                                                i3 = 2131367198;
                                                                android.widget.TextView textView4 = (android.widget.TextView) df0.qux.o(2131367198, this);
                                                                if (textView4 != null) {
                                                                    fi0.c cVar = new fi0.c(this, textView, button, button2, o, progressBar, frameLayout, progressBar2, o2, o3, o4, o5, textView2, textView3, textView4);
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
                                                                    this.u = cVar;
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
