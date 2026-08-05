package com.truecaller.call_assistant.ui_components.hint;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantHintView extends android.widget.LinearLayout {
    public static final /* synthetic */ int c = 0;
    public final a70.d a;
    public final kotlin.Lazy b;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/call_assistant/ui_components/hint/AssistantHintView$bar;", "", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public interface bar {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantHintView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(kotlin.jvm.functions.Function0 function0, com.truecaller.call_assistant.ui_components.hint.AssistantHintView assistantHintView) {
        function0.invoke();
        android.widget.LinearLayout linearLayout = assistantHintView.getBinding().a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        linearLayout.setVisibility(8);
    }

    private final rt0.bar getBinding() {
        return (rt0.bar) this.b.getValue();
    }

    public final void b(kotlin.jvm.functions.Function0 function0) {
        getBinding().a.animate().alpha(0.0f).setStartDelay(300L).setDuration(500L).withEndAction(new qb.q(21, function0, this)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a70.d dVar = this.a;
        if (dVar != null) {
            ((com.truecaller.sdk.bar) dVar).a = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a70.d dVar = this.a;
        if (dVar != null) {
            dVar.m1();
        }
        super.onDetachedFromWindow();
    }

    public final void setup(@org.jetbrains.annotations.NotNull pl0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "config");
        a70.d dVar = this.a;
        if (dVar != null) {
            fg3.h0.J(dVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new tt0.qux(dVar, null, 1), 3);
        }
        getBinding().b.setText(barVar.b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantHintView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantHintView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.b = kotlin.LazyKt.lazy(new sd.bar(15, context, this));
        if (!isInEditMode()) {
            tx.c0 c0Var = ((tx.w) ((com.truecaller.call_assistant.ui_components.hint.AssistantHintView.bar) j71.g.E(com.truecaller.call_assistant.ui_components.hint.AssistantHintView.bar.class, context.getApplicationContext()))).H.b;
            this.a = new a70.d((kotlin.coroutines.CoroutineContext) c0Var.a.V1.get(), cd3.baz.a(c0Var.k3), cd3.baz.a(c0Var.j3));
        }
        getBinding().c.setImageDrawable(new tt0.bar(context));
        final int i2 = 0;
        getBinding().e.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: tt0.a
            public final /* synthetic */ com.truecaller.call_assistant.ui_components.hint.AssistantHintView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i3 = i2;
                final com.truecaller.call_assistant.ui_components.hint.AssistantHintView assistantHintView = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.call_assistant.ui_components.hint.AssistantHintView.c;
                        final int i5 = 1;
                        assistantHintView.b(new kotlin.jvm.functions.Function0() { // from class: tt0.b
                            public final java.lang.Object invoke() {
                                switch (i5) {
                                    case 0:
                                        a70.d dVar = assistantHintView.a;
                                        if (dVar != null) {
                                            fg3.h0.J(dVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r23.d(dVar, (df3.bar) null, 21), 3);
                                        }
                                        return kotlin.Unit.a;
                                    default:
                                        a70.d dVar2 = assistantHintView.a;
                                        if (dVar2 != null) {
                                            fg3.h0.J(dVar2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new tt0.qux(dVar2, null, 0), 3);
                                        }
                                        return kotlin.Unit.a;
                                }
                            }
                        });
                        return;
                    default:
                        int i6 = com.truecaller.call_assistant.ui_components.hint.AssistantHintView.c;
                        final int i7 = 0;
                        assistantHintView.b(new kotlin.jvm.functions.Function0() { // from class: tt0.b
                            public final java.lang.Object invoke() {
                                switch (i7) {
                                    case 0:
                                        a70.d dVar = assistantHintView.a;
                                        if (dVar != null) {
                                            fg3.h0.J(dVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r23.d(dVar, (df3.bar) null, 21), 3);
                                        }
                                        return kotlin.Unit.a;
                                    default:
                                        a70.d dVar2 = assistantHintView.a;
                                        if (dVar2 != null) {
                                            fg3.h0.J(dVar2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new tt0.qux(dVar2, null, 0), 3);
                                        }
                                        return kotlin.Unit.a;
                                }
                            }
                        });
                        return;
                }
            }
        });
        final int i3 = 1;
        getBinding().d.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: tt0.a
            public final /* synthetic */ com.truecaller.call_assistant.ui_components.hint.AssistantHintView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i32 = i3;
                final com.truecaller.call_assistant.ui_components.hint.AssistantHintView assistantHintView = this.b;
                switch (i32) {
                    case 0:
                        int i4 = com.truecaller.call_assistant.ui_components.hint.AssistantHintView.c;
                        final int i5 = 1;
                        assistantHintView.b(new kotlin.jvm.functions.Function0() { // from class: tt0.b
                            public final java.lang.Object invoke() {
                                switch (i5) {
                                    case 0:
                                        a70.d dVar = assistantHintView.a;
                                        if (dVar != null) {
                                            fg3.h0.J(dVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r23.d(dVar, (df3.bar) null, 21), 3);
                                        }
                                        return kotlin.Unit.a;
                                    default:
                                        a70.d dVar2 = assistantHintView.a;
                                        if (dVar2 != null) {
                                            fg3.h0.J(dVar2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new tt0.qux(dVar2, null, 0), 3);
                                        }
                                        return kotlin.Unit.a;
                                }
                            }
                        });
                        return;
                    default:
                        int i6 = com.truecaller.call_assistant.ui_components.hint.AssistantHintView.c;
                        final int i7 = 0;
                        assistantHintView.b(new kotlin.jvm.functions.Function0() { // from class: tt0.b
                            public final java.lang.Object invoke() {
                                switch (i7) {
                                    case 0:
                                        a70.d dVar = assistantHintView.a;
                                        if (dVar != null) {
                                            fg3.h0.J(dVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r23.d(dVar, (df3.bar) null, 21), 3);
                                        }
                                        return kotlin.Unit.a;
                                    default:
                                        a70.d dVar2 = assistantHintView.a;
                                        if (dVar2 != null) {
                                            fg3.h0.J(dVar2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new tt0.qux(dVar2, null, 0), 3);
                                        }
                                        return kotlin.Unit.a;
                                }
                            }
                        });
                        return;
                }
            }
        });
    }

    public /* synthetic */ AssistantHintView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
