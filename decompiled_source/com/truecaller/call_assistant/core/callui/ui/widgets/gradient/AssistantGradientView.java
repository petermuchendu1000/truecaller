package com.truecaller.call_assistant.core.callui.ui.widgets.gradient;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantGradientView extends rq1.d implements go0.baz {
    public go0.bar e;
    public dw0.h f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantGradientView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void f(com.truecaller.gradient_call.GradientCallState gradientCallState) {
        float f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gradientCallState, "callState");
        dw0.h hVar = this.f;
        kotlin.Unit unit = null;
        if (hVar != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gradientCallState, "callState");
            int i = rq1.a.a[gradientCallState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        f = 0.55f;
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                } else {
                    f = 0.78f;
                }
            } else {
                f = 0.8f;
            }
            com.truecaller.gradient_call.GradientColor gradientColor = (com.truecaller.gradient_call.GradientColor) hVar.c;
            if (gradientColor != null) {
                rq1.d dVar = (rq1.qux) ((com.truecaller.sdk.bar) hVar).a;
                if (dVar != null) {
                    dVar.d(gradientColor, f, 300L);
                    unit = kotlin.Unit.a;
                }
                if (unit != null) {
                    return;
                }
            }
            rq1.d dVar2 = (rq1.qux) ((com.truecaller.sdk.bar) hVar).a;
            if (dVar2 != null) {
                rq1.d dVar3 = dVar2;
                bm1.b bVar = new bm1.b(dVar3, 300L, 2);
                if (dVar3.getHeight() > 0) {
                    bVar.invoke();
                } else {
                    dVar3.getViewTreeObserver().addOnPreDrawListener(new rq1.c(dVar3, bVar, 0));
                }
                kotlin.Unit unit2 = kotlin.Unit.a;
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("gradientPresenter");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final go0.bar getPresenter() {
        go0.bar barVar = this.e;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rn0.b0 b0Var = (rn0.b0) mk.m.w(context).a;
        this.e = new go0.a((kotlin.coroutines.CoroutineContext) b0Var.c.get(), (rn0.bar) b0Var.C.get(), (lu0.baz) b0Var.d.get(), 0);
        dw0.h hVar = new dw0.h(4);
        this.f = hVar;
        setPresenter(hVar);
        ((go0.a) getPresenter()).u0(this);
    }

    public final void onDetachedFromWindow() {
        ((of0.baz) getPresenter()).m1();
        super.onDetachedFromWindow();
    }

    @Override // go0.baz
    public void setCallerGradientConfig(@org.jetbrains.annotations.NotNull rq1.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "config");
        dw0.h hVar = this.f;
        com.truecaller.gradient_call.GradientColor gradientColor = null;
        if (hVar != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "config");
            if (!barVar.a && !barVar.e) {
                if (!barVar.i && !barVar.h) {
                    if (barVar.c) {
                        gradientColor = com.truecaller.gradient_call.GradientColor.GOLD;
                    } else if (barVar.b) {
                        gradientColor = com.truecaller.gradient_call.GradientColor.SPAM;
                    } else if (barVar.d) {
                        gradientColor = com.truecaller.gradient_call.GradientColor.PRIORITY;
                    } else if (barVar.f) {
                        gradientColor = com.truecaller.gradient_call.GradientColor.IDENTIFIED;
                    }
                } else {
                    gradientColor = com.truecaller.gradient_call.GradientColor.SMALL_BUSINESS;
                }
            } else {
                gradientColor = com.truecaller.gradient_call.GradientColor.VERIFIED_BUSINESS;
            }
            hVar.c = gradientColor;
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("gradientPresenter");
        throw null;
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull go0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.e = barVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantGradientView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantGradientView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AssistantGradientView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
