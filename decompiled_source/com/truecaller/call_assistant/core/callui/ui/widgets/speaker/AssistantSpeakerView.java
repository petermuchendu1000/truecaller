package com.truecaller.call_assistant.core.callui.ui.widgets.speaker;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantSpeakerView extends com.truecaller.call_assistant.core.callui.ui.widgets.OngoingCallToggleButton implements mo0.baz {
    public static final /* synthetic */ int v = 0;
    public mo0.bar t;
    public final ie3.h u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantSpeakerView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @org.jetbrains.annotations.NotNull
    public final mo0.bar getPresenter() {
        mo0.bar barVar = this.t;
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
        this.t = new fo0.a((kotlin.coroutines.CoroutineContext) b0Var.c.get(), (rn0.bar) b0Var.C.get(), 3);
        ((fo0.a) getPresenter()).u0(this);
        setOnCheckedChangeListener(new io0.a(1, this.u));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        ((of0.baz) getPresenter()).m1();
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull mo0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.t = barVar;
    }

    @Override // mo0.baz
    public void setSpeaker(boolean z) {
        F(z, this.u);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantSpeakerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantSpeakerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.u = new ie3.h(this, 22);
    }

    public /* synthetic */ AssistantSpeakerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
