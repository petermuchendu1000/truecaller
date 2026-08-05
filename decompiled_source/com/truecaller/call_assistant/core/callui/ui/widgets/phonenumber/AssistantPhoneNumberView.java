package com.truecaller.call_assistant.core.callui.ui.widgets.phonenumber;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantPhoneNumberView extends com.truecaller.common.ui.textview.GoldShineTextView implements ko0.baz {
    public ko0.bar s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantPhoneNumberView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @org.jetbrains.annotations.NotNull
    public final ko0.bar getPresenter() {
        ko0.bar barVar = this.s;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.widget.TextView*/.onAttachedToWindow();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rn0.b0 b0Var = (rn0.b0) mk.m.w(context).a;
        kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) b0Var.c.get();
        rn0.bar barVar = (rn0.bar) b0Var.C.get();
        lu0.baz bazVar = (lu0.baz) b0Var.d.get();
        q81.b bVar = (q81.b) ((tx.w) b0Var.a).S5.get();
        es.baz.k(bVar);
        this.s = new ab1.qux(coroutineContext, barVar, bazVar, bVar);
        getPresenter().u0(this);
    }

    public final void onDetachedFromWindow() {
        ((of0.baz) getPresenter()).m1();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ko0.baz
    public void setNumber(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
        setText(str);
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull ko0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.s = barVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantPhoneNumberView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantPhoneNumberView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AssistantPhoneNumberView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
