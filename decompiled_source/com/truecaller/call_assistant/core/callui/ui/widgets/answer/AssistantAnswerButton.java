package com.truecaller.call_assistant.core.callui.ui.widgets.answer;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantAnswerButton extends android.widget.FrameLayout {
    public final d91.c a;
    public final android.animation.AnimatorSet b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantAnswerButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final android.animation.AnimatorSet a(float f, float f2) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        d91.c cVar = this.a;
        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat((android.widget.ImageView) cVar.d, "scaleY", f, f2), android.animation.ObjectAnimator.ofFloat((android.widget.ImageView) cVar.d, "scaleX", f, f2));
        return animatorSet;
    }

    @org.jetbrains.annotations.NotNull
    public final android.animation.AnimatorSet getAnimatorSet() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.AnimatorSet animatorSet = this.b;
        animatorSet.cancel();
        animatorSet.removeAllListeners();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        d91.c cVar = this.a;
        ((android.widget.ImageView) cVar.d).setEnabled(z);
        ((android.widget.FrameLayout) cVar.c).setEnabled(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantAnswerButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantAnswerButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131560967, (android.view.ViewGroup) this, false);
        addView(inflate);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
        android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131362635, inflate);
        if (imageView != null) {
            d91.c cVar = new d91.c(frameLayout, frameLayout, imageView, 25);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
            this.a = cVar;
            this.b = new android.animation.AnimatorSet();
            return;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(2131362635)));
    }

    public /* synthetic */ AssistantAnswerButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
