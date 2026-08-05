package com.truecaller.call_assistant.core.callui.ui.widgets.name;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantNameView extends com.truecaller.common.ui.textview.GoldShineTextView implements jo0.baz {
    public jo0.bar s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantNameView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @org.jetbrains.annotations.NotNull
    public final jo0.bar getPresenter() {
        jo0.bar barVar = this.s;
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
        this.s = new go0.a((kotlin.coroutines.CoroutineContext) b0Var.c.get(), (rn0.bar) b0Var.C.get(), (lu0.baz) b0Var.d.get(), 1);
        ((go0.a) getPresenter()).u0(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((of0.baz) getPresenter()).m1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jo0.baz
    public void setName(int i) {
        setText(i);
        gj.m.j0(this);
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull jo0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.s = barVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jo0.baz
    public void setProfileNameSize(int i) {
        setTextSize(0, getContext().getResources().getDimension(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantNameView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantNameView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jo0.baz
    public void setName(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "profileName");
        setText(str);
        gj.m.j0(this);
    }

    public /* synthetic */ AssistantNameView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
