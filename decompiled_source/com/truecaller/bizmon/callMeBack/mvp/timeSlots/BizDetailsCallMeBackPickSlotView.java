package com.truecaller.bizmon.callMeBack.mvp.timeSlots;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizDetailsCallMeBackPickSlotView extends androidx.constraintlayout.widget.ConstraintLayout implements fh0.c, bd3.qux {
    public static final /* synthetic */ int y = 0;
    public yc3.d s;
    public final boolean t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public fh0.b w;
    public boolean x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizDetailsCallMeBackPickSlotView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d(this);
        }
        return this.s.X3();
    }

    @Override // fh0.c
    public final void a(boolean z) {
    }

    @Override // fh0.c
    public final void b(int i, int i2) {
        androidx.appcompat.widget.AppCompatButton appCompatButton = getBinding().b;
        appCompatButton.setTextColor(i2);
        appCompatButton.setBackgroundResource(i);
    }

    @Override // fh0.c
    public final void e(java.lang.String str, android.text.SpannableStringBuilder spannableStringBuilder, java.lang.Integer num, java.lang.Integer num2) {
        android.graphics.drawable.Drawable drawable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "actionText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        fi0.f binding = getBinding();
        android.view.View view = binding.a;
        android.graphics.drawable.Drawable w = yb0.i.w(2131231247, view.getContext());
        if (w != null) {
            drawable = w.mutate();
        } else {
            drawable = null;
        }
        if ((drawable instanceof android.graphics.drawable.GradientDrawable) && num != null) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(num.intValue());
        }
        binding.a.setBackground(drawable);
        view.setPadding(getPadding(), getPadding(), getPadding(), getPadding());
        binding.b.setText(str);
        android.widget.TextView textView = binding.c;
        textView.setTextAppearance(2132083051);
        textView.setText(spannableStringBuilder);
        if (num2 != null) {
            textView.setTextColor(num2.intValue());
        }
    }

    @Override // fh0.c
    public final void g() {
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.f getBinding() {
        return (fi0.f) this.u.getValue();
    }

    public final int getPadding() {
        return ((java.lang.Number) this.v.getValue()).intValue();
    }

    @org.jetbrains.annotations.NotNull
    public final fh0.b getPresenter() {
        fh0.b bVar = this.w;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fh0.c
    public final void i(com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig bizMultiViewConfig, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizMultiViewConfig, "config");
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean z = this.x;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizMultiViewConfig, "bizConfig");
        androidx.fragment.app.g1 x = f0.qux.x(context);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("bizConfig", bizMultiViewConfig);
        bundle.putBoolean("bizReschedule", z);
        bundle.putString("bizCmbId", str);
        bundle.putString("bizCallId", str2);
        gh0.baz bazVar = new gh0.baz();
        bazVar.setArguments(bundle);
        if (x != null) {
            bazVar.show(x, gh0.baz.class.getSimpleName());
        }
    }

    @Override // fh0.c
    public final void j(boolean z) {
    }

    @Override // fh0.c
    public final void l(int i, int i2) {
    }

    @Override // fh0.c
    public final void m(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "text");
    }

    @Override // fh0.c
    public final void o(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        if (!isInEditMode()) {
            getPresenter().u0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        ((fh0.n) getPresenter()).m1();
    }

    @Override // fh0.c
    public final void p(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "notInterestedTitle");
    }

    @Override // fh0.c
    public final void q(int i, java.lang.String str, boolean z) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        android.widget.TextView textView = getBinding().c;
        textView.setText(str);
        if (z) {
            i2 = 17;
        } else {
            i2 = 8388611;
        }
        textView.setGravity(i2);
        textView.setTextColor(i);
    }

    @Override // fh0.c
    public void setLayoutBackground(int i) {
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull fh0.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.w = bVar;
    }

    @Override // fh0.c
    public final void t(int i, int i2) {
    }

    @Override // fh0.c
    public final void u(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "animationFilePath");
    }

    @Override // fh0.c
    public final void v(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizDetailsCallMeBackPickSlotView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizDetailsCallMeBackPickSlotView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BizDetailsCallMeBackPickSlotView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BizDetailsCallMeBackPickSlotView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            this.w = ((tx.d0) ((fh0.o) X3())).a();
        }
        this.u = kotlin.LazyKt.lazy(new f63.g(2, context, this));
        this.v = kotlin.LazyKt.lazy(kotlin.k.c, new e31.bar(this, 23));
    }
}
