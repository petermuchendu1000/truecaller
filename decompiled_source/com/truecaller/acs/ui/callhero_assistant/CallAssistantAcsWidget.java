package com.truecaller.acs.ui.callhero_assistant;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallAssistantAcsWidget extends android.widget.FrameLayout implements lz.bar {
    public static final /* synthetic */ int e = 0;
    public final cn0.a a;
    public final b91.a b;
    public kotlin.jvm.functions.Function0 c;
    public final kotlin.Lazy d;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/acs/ui/callhero_assistant/CallAssistantAcsWidget$bar;", "", "acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public interface bar {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallAssistantAcsWidget(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final dz.c getBinding() {
        return (dz.c) this.d.getValue();
    }

    public final void a(com.truecaller.data.entity.assistant.ScreenedCallAcsDetails screenedCallAcsDetails, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenedCallAcsDetails, "screenedChat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onClickListener");
        this.c = function0;
        cn0.a aVar = this.a;
        if (aVar != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenedCallAcsDetails, "screenedChat");
            aVar.m = screenedCallAcsDetails;
            fg3.h0.J(aVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new by1.b(aVar, (df3.bar) null, 10), 3);
        }
    }

    public final void b(lz.baz bazVar, boolean z) {
        int i;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "data");
        if (z) {
            dz.c binding = getBinding();
            android.widget.TextView textView = binding.b;
            textView.setAlpha(1.0f);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = 0;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
            }
            if (marginLayoutParams != null) {
                textView.setLayoutParams(marginLayoutParams);
            }
            binding.c.setVisibility(8);
        } else {
            getBinding().c.setText(bazVar.b);
        }
        getBinding().b.setText(bazVar.c);
        setOnClickListener(new lb1.b(this, 5));
        dx2.bar barVar = dx2.bar.a;
        if (dx2.bar.d()) {
            i = 2131232171;
        } else {
            i = 2131232172;
        }
        getBinding().d.setImageDrawable(yb0.i.w(i, getContext()));
        gj.m.j0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        cn0.a aVar;
        super.onAttachedToWindow();
        if (!isInEditMode() && (aVar = this.a) != null) {
            aVar.u0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        cn0.a aVar = this.a;
        if (aVar != null) {
            aVar.m1();
        }
        this.c = new le2.k(15);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallAssistantAcsWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallAssistantAcsWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.c = new le2.k(16);
        this.d = kotlin.LazyKt.lazy(new l02.baz(5, context, this));
        if (!isInEditMode()) {
            gj.m.k0(this, false);
            tx.w wVar = ((tx.w) ((com.truecaller.acs.ui.callhero_assistant.CallAssistantAcsWidget.bar) j71.g.E(com.truecaller.acs.ui.callhero_assistant.CallAssistantAcsWidget.bar.class, context.getApplicationContext()))).H.b.a;
            this.a = new cn0.a((pr0.k) wVar.q8.get(), (qo1.b) wVar.p8.get(), (kotlin.coroutines.CoroutineContext) wVar.V1.get(), (n11.l) wVar.o0.get(), (pr0.j0) wVar.s8.get(), wVar.G(), new a53.bar((android.content.Context) wVar.I.get(), 7), (xq0.c) wVar.sr.get());
            this.b = new b91.a(17);
        }
        if (getBackground() == null) {
            getBinding().e.setBackgroundResource(2131231571);
        }
    }

    public /* synthetic */ CallAssistantAcsWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
