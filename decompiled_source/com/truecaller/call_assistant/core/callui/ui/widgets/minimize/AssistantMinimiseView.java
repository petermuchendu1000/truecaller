package com.truecaller.call_assistant.core.callui.ui.widgets.minimize;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantMinimiseView extends androidx.appcompat.widget.AppCompatImageButton implements ho0.baz {
    public static final /* synthetic */ int e = 0;
    public ho0.bar d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantMinimiseView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @org.jetbrains.annotations.NotNull
    public final ho0.bar getPresenter() {
        ho0.bar barVar = this.d;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.widget.ImageButton*/.onAttachedToWindow();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rn0.b0 b0Var = (rn0.b0) mk.m.w(context).a;
        this.d = new fo0.a((kotlin.coroutines.CoroutineContext) b0Var.c.get(), (rn0.bar) b0Var.C.get(), 1);
        ((fo0.a) getPresenter()).u0(this);
        setOnClickListener(new gr2.bar(this, 9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        ((of0.baz) getPresenter()).m1();
        super/*android.widget.ImageButton*/.onDetachedFromWindow();
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull ho0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.d = barVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantMinimiseView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantMinimiseView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AssistantMinimiseView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
