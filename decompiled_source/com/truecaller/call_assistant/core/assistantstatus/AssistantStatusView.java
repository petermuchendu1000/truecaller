package com.truecaller.call_assistant.core.assistantstatus;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantStatusView extends androidx.constraintlayout.widget.ConstraintLayout implements en0.b {
    public final d91.d s;
    public en0.c t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantStatusView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        en0.c cVar = this.t;
        if (cVar != null) {
            ((en0.a) cVar).u0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        en0.c cVar = this.t;
        if (cVar != null) {
            ((en0.a) cVar).m1();
        }
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull en0.c cVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "presenter");
        this.t = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // en0.b
    public void setState(@org.jetbrains.annotations.NotNull com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState assistantStatusItemViewState) {
        kotlin.Pair pair;
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assistantStatusItemViewState, "state");
        int[] iArr = en0.e.a;
        if (iArr[assistantStatusItemViewState.ordinal()] == 1) {
            pair = new kotlin.Pair(2130970495, 2130970508);
        } else {
            pair = new kotlin.Pair(2130970496, 2130970494);
        }
        int intValue = ((java.lang.Number) pair.a).intValue();
        int intValue2 = ((java.lang.Number) pair.b).intValue();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int B = ze0.q.B(intValue, context);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int B2 = ze0.q.B(intValue2, context2);
        int i = iArr[assistantStatusItemViewState.ordinal()];
        java.lang.String str = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        num = null;
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                } else {
                    num = 2132017306;
                }
            } else {
                num = 2132017305;
            }
        } else {
            num = 2132017304;
        }
        com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState assistantStatusItemViewState2 = com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState.LOADING;
        d91.d dVar = this.s;
        if (assistantStatusItemViewState == assistantStatusItemViewState2) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = dVar.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "assistantStatusGroup");
            constraintLayout.setVisibility(8);
            return;
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = dVar.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "assistantStatusGroup");
        if (constraintLayout2.getVisibility() != 0) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = dVar.b;
            constraintLayout3.setAlpha(0.0f);
            constraintLayout3.setVisibility(0);
            constraintLayout3.animate().alpha(1.0f).setDuration(150L).setInterpolator(new android.view.animation.AccelerateInterpolator()).start();
        }
        android.widget.TextView textView = (android.widget.TextView) dVar.d;
        if (num != null) {
            str = textView.getResources().getString(num.intValue());
        }
        textView.setText(str);
        textView.setTextColor(B);
        lf.bar.z(textView, android.content.res.ColorStateList.valueOf(B));
        dVar.f.getBackground().setTint(B);
        dVar.c.getBackground().setTint(B2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantStatusView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssistantStatusView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131559736, (android.view.ViewGroup) this);
        int i2 = 2131362314;
        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131362314, this);
        if (textView != null) {
            i2 = 2131362315;
            android.view.View o = df0.qux.o(2131362315, this);
            if (o != null) {
                i2 = 2131362317;
                android.view.View o2 = df0.qux.o(2131362317, this);
                if (o2 != null) {
                    i2 = 2131362318;
                    androidx.constraintlayout.widget.ConstraintLayout o3 = df0.qux.o(2131362318, this);
                    if (o3 != null) {
                        i2 = 2131362319;
                        if (((android.widget.TextView) df0.qux.o(2131362319, this)) != null) {
                            i2 = 2131362320;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) df0.qux.o(2131362320, this);
                            if (frameLayout != null) {
                                i2 = 2131362321;
                                if (((android.widget.ImageView) df0.qux.o(2131362321, this)) != null) {
                                    d91.d dVar = new d91.d(this, textView, o, o2, o3, frameLayout);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dVar, "inflate(...)");
                                    this.s = dVar;
                                    final int i3 = 0;
                                    setPadding(0, getResources().getDimensionPixelSize(2131165414), 0, 0);
                                    o.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: en0.d
                                        public final /* synthetic */ com.truecaller.call_assistant.core.assistantstatus.AssistantStatusView b;

                                        {
                                            this.b = this;
                                        }

                                        /* JADX WARN: Type inference failed for: r9v0, types: [hi3.d, qx2.w3, java.lang.Object] */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(android.view.View view) {
                                            qx2.lh lhVar;
                                            com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2;
                                            nn0.g gVar;
                                            d91.c cVar;
                                            android.view.View findViewById;
                                            nn0.g gVar2;
                                            d91.c cVar2;
                                            android.view.View findViewById2;
                                            int i4 = i3;
                                            int i5 = 9;
                                            df3.bar barVar = null;
                                            com.truecaller.call_assistant.core.assistantstatus.AssistantStatusView assistantStatusView = this.b;
                                            switch (i4) {
                                                case 0:
                                                    en0.c cVar3 = assistantStatusView.t;
                                                    if (cVar3 != null) {
                                                        ac0.qux quxVar = ((en0.a) cVar3).f;
                                                        quxVar.getClass();
                                                        bi3.y0 y0Var = qx2.w3.c;
                                                        hi3.a aVar = qx2.w3.d;
                                                        bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
                                                        boolean[] zArr = new boolean[j0VarArr.length];
                                                        try {
                                                            ?? obj = new java.lang.Object();
                                                            if (zArr[0]) {
                                                                lhVar = null;
                                                            } else {
                                                                bi3.j0 j0Var = j0VarArr[0];
                                                                lhVar = (qx2.lh) aVar.g(j0Var.f, aVar.j(j0Var));
                                                            }
                                                            ((qx2.w3) obj).a = lhVar;
                                                            if (zArr[1]) {
                                                                clientHeaderV2 = null;
                                                            } else {
                                                                bi3.j0 j0Var2 = j0VarArr[1];
                                                                clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar.g(j0Var2.f, aVar.j(j0Var2));
                                                            }
                                                            ((qx2.w3) obj).b = clientHeaderV2;
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "build(...)");
                                                            j71.g.K((hi3.d) obj, (nc0.bar) quxVar.c);
                                                            nn0.k kVar = (nn0.k) ((com.truecaller.sdk.bar) ((nn0.u) ((nn0.i) quxVar.d))).a;
                                                            if (kVar != null && (cVar = (gVar = (nn0.g) kVar).j) != null && (findViewById = ((com.truecaller.call_assistant.core.assistantstatus.AssistantStatusView) cVar.c).findViewById(2131362315)) != null) {
                                                                nn0.u uVar = (nn0.u) gVar.g6();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(findViewById, "anchorView");
                                                                fg3.h0.J(uVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new nh0.baz(uVar, findViewById, barVar, i5), 3);
                                                                return;
                                                            }
                                                            return;
                                                        } catch (bi3.bar e) {
                                                            throw e;
                                                        } catch (java.lang.Exception e2) {
                                                            throw new java.lang.RuntimeException(e2);
                                                        }
                                                    }
                                                    return;
                                                default:
                                                    en0.c cVar4 = assistantStatusView.t;
                                                    if (cVar4 != null) {
                                                        nn0.u uVar2 = (nn0.u) ((nn0.i) ((en0.a) cVar4).f.d);
                                                        a71.a aVar2 = uVar2.l;
                                                        bd.bar.u((nc0.bar) aVar2.b, "CTAssistantTabContextMenu", "AssistantTab");
                                                        qx2.d3 h = qx2.hg.h();
                                                        h.m("CTAssistantTabContextMenu");
                                                        h.l("AssistantSettings");
                                                        qx2.hg h2 = h.h();
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "build(...)");
                                                        j71.g.K(h2, (nc0.bar) aVar2.b);
                                                        nn0.k kVar2 = (nn0.k) ((com.truecaller.sdk.bar) uVar2).a;
                                                        if (kVar2 != null && (cVar2 = (gVar2 = (nn0.g) kVar2).j) != null && (findViewById2 = ((com.truecaller.call_assistant.core.assistantstatus.AssistantStatusView) cVar2.c).findViewById(2131362321)) != null) {
                                                            nn0.u uVar3 = (nn0.u) gVar2.g6();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(findViewById2, "anchorView");
                                                            fg3.h0.J(uVar3, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new nh0.baz(uVar3, findViewById2, barVar, i5), 3);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    final int i4 = 1;
                                    frameLayout.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: en0.d
                                        public final /* synthetic */ com.truecaller.call_assistant.core.assistantstatus.AssistantStatusView b;

                                        {
                                            this.b = this;
                                        }

                                        /* JADX WARN: Type inference failed for: r9v0, types: [hi3.d, qx2.w3, java.lang.Object] */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(android.view.View view) {
                                            qx2.lh lhVar;
                                            com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2;
                                            nn0.g gVar;
                                            d91.c cVar;
                                            android.view.View findViewById;
                                            nn0.g gVar2;
                                            d91.c cVar2;
                                            android.view.View findViewById2;
                                            int i42 = i4;
                                            int i5 = 9;
                                            df3.bar barVar = null;
                                            com.truecaller.call_assistant.core.assistantstatus.AssistantStatusView assistantStatusView = this.b;
                                            switch (i42) {
                                                case 0:
                                                    en0.c cVar3 = assistantStatusView.t;
                                                    if (cVar3 != null) {
                                                        ac0.qux quxVar = ((en0.a) cVar3).f;
                                                        quxVar.getClass();
                                                        bi3.y0 y0Var = qx2.w3.c;
                                                        hi3.a aVar = qx2.w3.d;
                                                        bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
                                                        boolean[] zArr = new boolean[j0VarArr.length];
                                                        try {
                                                            ?? obj = new java.lang.Object();
                                                            if (zArr[0]) {
                                                                lhVar = null;
                                                            } else {
                                                                bi3.j0 j0Var = j0VarArr[0];
                                                                lhVar = (qx2.lh) aVar.g(j0Var.f, aVar.j(j0Var));
                                                            }
                                                            ((qx2.w3) obj).a = lhVar;
                                                            if (zArr[1]) {
                                                                clientHeaderV2 = null;
                                                            } else {
                                                                bi3.j0 j0Var2 = j0VarArr[1];
                                                                clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar.g(j0Var2.f, aVar.j(j0Var2));
                                                            }
                                                            ((qx2.w3) obj).b = clientHeaderV2;
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "build(...)");
                                                            j71.g.K((hi3.d) obj, (nc0.bar) quxVar.c);
                                                            nn0.k kVar = (nn0.k) ((com.truecaller.sdk.bar) ((nn0.u) ((nn0.i) quxVar.d))).a;
                                                            if (kVar != null && (cVar = (gVar = (nn0.g) kVar).j) != null && (findViewById = ((com.truecaller.call_assistant.core.assistantstatus.AssistantStatusView) cVar.c).findViewById(2131362315)) != null) {
                                                                nn0.u uVar = (nn0.u) gVar.g6();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(findViewById, "anchorView");
                                                                fg3.h0.J(uVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new nh0.baz(uVar, findViewById, barVar, i5), 3);
                                                                return;
                                                            }
                                                            return;
                                                        } catch (bi3.bar e) {
                                                            throw e;
                                                        } catch (java.lang.Exception e2) {
                                                            throw new java.lang.RuntimeException(e2);
                                                        }
                                                    }
                                                    return;
                                                default:
                                                    en0.c cVar4 = assistantStatusView.t;
                                                    if (cVar4 != null) {
                                                        nn0.u uVar2 = (nn0.u) ((nn0.i) ((en0.a) cVar4).f.d);
                                                        a71.a aVar2 = uVar2.l;
                                                        bd.bar.u((nc0.bar) aVar2.b, "CTAssistantTabContextMenu", "AssistantTab");
                                                        qx2.d3 h = qx2.hg.h();
                                                        h.m("CTAssistantTabContextMenu");
                                                        h.l("AssistantSettings");
                                                        qx2.hg h2 = h.h();
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "build(...)");
                                                        j71.g.K(h2, (nc0.bar) aVar2.b);
                                                        nn0.k kVar2 = (nn0.k) ((com.truecaller.sdk.bar) uVar2).a;
                                                        if (kVar2 != null && (cVar2 = (gVar2 = (nn0.g) kVar2).j) != null && (findViewById2 = ((com.truecaller.call_assistant.core.assistantstatus.AssistantStatusView) cVar2.c).findViewById(2131362321)) != null) {
                                                            nn0.u uVar3 = (nn0.u) gVar2.g6();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(findViewById2, "anchorView");
                                                            fg3.h0.J(uVar3, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new nh0.baz(uVar3, findViewById2, barVar, i5), 3);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ AssistantStatusView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
