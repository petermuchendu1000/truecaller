package com.truecaller.call_assistant.core.callui.ui.widgets.callstatus;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantCallStatusView extends androidx.appcompat.widget.LinearLayoutCompat implements fo0.baz {
    public fo0.bar p;
    public final d91.c q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AssistantCallStatusView(android.content.Context context) {
        this(context, r0, 2, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.util.AttributeSet attributeSet = null;
    }

    @org.jetbrains.annotations.NotNull
    public final fo0.bar getPresenter() {
        fo0.bar barVar = this.p;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rn0.b0 b0Var = (rn0.b0) mk.m.w(context).a;
        this.p = new fo0.a((kotlin.coroutines.CoroutineContext) b0Var.c.get(), (rn0.bar) b0Var.C.get(), 0);
        ((fo0.a) getPresenter()).u0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        ((of0.baz) getPresenter()).m1();
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull fo0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.p = barVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssistantCallStatusView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131560940, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i = 2131363006;
        com.truecaller.common.ui.textview.GoldShineChronometer o = df0.qux.o(2131363006, inflate);
        if (o != null) {
            i = 2131366909;
            com.truecaller.common.ui.textview.GoldShineTextView o2 = df0.qux.o(2131366909, inflate);
            if (o2 != null) {
                d91.c cVar = new d91.c((android.widget.LinearLayout) inflate, o, o2, 24);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
                this.q = cVar;
                return;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public /* synthetic */ AssistantCallStatusView(android.content.Context context, android.util.AttributeSet attributeSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
