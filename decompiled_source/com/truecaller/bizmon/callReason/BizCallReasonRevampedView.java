package com.truecaller.bizmon.callReason;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizCallReasonRevampedView extends androidx.constraintlayout.widget.ConstraintLayout implements jh0.bar {
    public static final /* synthetic */ int v = 0;
    public final ih0.baz s;
    public final u03.g0 t;
    public final kotlin.Lazy u;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/bizmon/callReason/BizCallReasonRevampedView$bar;", "", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public interface bar {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizCallReasonRevampedView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void F(f6.v0 v0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v0Var, "config");
        java.lang.Integer num = null;
        ih0.baz bazVar = this.s;
        if (bazVar != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v0Var, "config");
            bazVar.h = v0Var;
            ih0.d dVar = (ih0.d) v0Var.c;
            if (dVar.j) {
                bazVar.i = com.truecaller.bizmon.callReason.BusinessContactType.VERIFIED;
            } else if (dVar.k) {
                bazVar.i = com.truecaller.bizmon.callReason.BusinessContactType.PRIORITY;
            }
            java.lang.String str = dVar.b;
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    boolean z = false;
                    bazVar.j.setValue(bazVar, ih0.baz.k[0], str);
                    jh0.bar barVar = (jh0.bar) ((com.truecaller.sdk.bar) bazVar).a;
                    if (barVar != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callReason");
                        ((com.truecaller.bizmon.callReason.BizCallReasonRevampedView) barVar).getBinding().c.setText(str);
                    }
                    f6.v0 v0Var2 = bazVar.h;
                    if (v0Var2 != null) {
                        ih0.d dVar2 = (ih0.d) v0Var2.c;
                        if (dVar2.h) {
                            num = 2131101227;
                        } else if (dVar2.i) {
                            num = 2131101229;
                        }
                        if ((v0Var instanceof ih0.b) || (v0Var instanceof ih0.a)) {
                            z = true;
                        }
                        jh0.bar barVar2 = (jh0.bar) ((com.truecaller.sdk.bar) bazVar).a;
                        if (barVar2 != null) {
                            if (num != null) {
                                ((com.truecaller.bizmon.callReason.BizCallReasonRevampedView) barVar2).G(num.intValue(), 2131101394);
                            }
                            if (z) {
                                fi0.e binding = ((com.truecaller.bizmon.callReason.BizCallReasonRevampedView) barVar2).getBinding();
                                binding.c.setGravity(8388611);
                                android.widget.TextView textView = binding.c;
                                textView.setTextAlignment(5);
                                textView.setGravity(8388611);
                                return;
                            }
                            com.truecaller.bizmon.callReason.BizCallReasonRevampedView bizCallReasonRevampedView = (com.truecaller.bizmon.callReason.BizCallReasonRevampedView) barVar2;
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = bizCallReasonRevampedView.getBinding().a;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                            gj.m.U(constraintLayout, new i82.m(bizCallReasonRevampedView, 3));
                            bizCallReasonRevampedView.getBinding().c.getLayoutParams().width = -2;
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("config");
                    throw null;
                }
            }
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (jh0.bar) ((com.truecaller.sdk.bar) bazVar).a;
            if (constraintLayout2 != null) {
                gj.m.f0((com.truecaller.bizmon.callReason.BizCallReasonRevampedView) constraintLayout2);
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final void G(int i, int i2) {
        u03.g0 g0Var = this.t;
        android.graphics.drawable.Drawable mutate = g0Var.d(2131231486).mutate();
        if (mutate instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) mutate).setColor(g0Var.b(i));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mutate, "also(...)");
        android.graphics.drawable.Drawable mutate2 = g0Var.d(2131233639).mutate();
        mutate2.setTint(g0Var.b(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mutate2, "also(...)");
        getBinding().c.setBackground(mutate);
        getBinding().b.setImageDrawable(mutate2);
        getBinding().c.setTextColor(g0Var.b(i2));
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.e getBinding() {
        return (fi0.e) this.u.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        if (!isInEditMode()) {
            ih0.baz bazVar = this.s;
            if (bazVar != null) {
                ((com.truecaller.sdk.bar) bazVar).a = this;
            } else {
                kotlin.jvm.internal.Intrinsics.n("presenter");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        ih0.baz bazVar = this.s;
        if (bazVar != null) {
            bazVar.m1();
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizCallReasonRevampedView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizCallReasonRevampedView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BizCallReasonRevampedView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.t = new u03.g0(context);
        this.u = kotlin.LazyKt.lazy(new i7.qux(6, context, this));
        if (isInEditMode()) {
            return;
        }
        tx.c0 c0Var = ((tx.w) ((com.truecaller.bizmon.callReason.BizCallReasonRevampedView.bar) j71.g.E(com.truecaller.bizmon.callReason.BizCallReasonRevampedView.bar.class, context.getApplicationContext()))).H.b;
        c0Var.getClass();
        tx.w wVar = c0Var.a;
        this.s = new ih0.baz((kotlin.coroutines.CoroutineContext) wVar.V1.get(), cd3.baz.a(c0Var.I1), cd3.baz.a(wVar.d4), cd3.baz.a(wVar.fn));
    }

    public /* synthetic */ BizCallReasonRevampedView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
